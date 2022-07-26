package com.jb.adapter.bigdata.impl;

import cn.hutool.core.util.ObjectUtil;
import com.jb.adapter.bigdata.compile.HiveMetaStoreClientCompile;
import com.jb.enity.metadata.bigdata.hive.HiveCatalogMeta;
import com.jb.enity.metadata.bigdata.hive.column.HiveTableColumnMeta;
import com.jb.enity.metadata.bigdata.hive.column.HiveViewColumnMeta;
import com.jb.enity.metadata.bigdata.hive.table.HiveTableMeta;
import com.jb.enity.metadata.bigdata.hive.table.HiveViewMeta;
import com.jb.enity.parameter.bigdata.HiveParameter;
import com.jb.enums.CollectDataSourceEnum;
import com.jb.enums.TableTypeEnum;
import com.jb.adapter.bigdata.IHiveMetadataDriver;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.LocatedFileStatus;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.fs.RemoteIterator;
import org.apache.hadoop.hive.conf.HiveConf;
import org.apache.hadoop.hive.metastore.api.*;
import org.apache.thrift.TException;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


/**
 * @author zhaojb
 * Hive元数据采集适配
 */
public class HiveMetadataDriver implements IHiveMetadataDriver {

    private Connection conn;
    private ResultSet rs;

    private DatabaseMetaData metaData;

    private HiveMetaStoreClientCompile hiveMetaStoreClient;

    private final HiveParameter hiveParameter;

    private final HiveCatalogMeta hiveCatalogMeta;
    private final List<HiveTableMeta> hiveTableMetas = new ArrayList<>(128);
    private final List<HiveViewMeta> hiveViewMetas = new ArrayList<>(128);


    public HiveMetadataDriver(HiveParameter hiveParameter) {
        this.hiveParameter = hiveParameter;

        this.hiveCatalogMeta = new HiveCatalogMeta();
        this.hiveCatalogMeta.setCatalog(hiveParameter.getCatalog());
    }


    @Override
    public void createConnection() throws MetaException, SQLException, ClassNotFoundException {

        String builder = "jdbc:hive2://" +
                hiveParameter.getIp() +
                ':' +
                hiveParameter.getPort() +
                '/' +
                hiveParameter.getCatalog();

        openHiveMetaStore();
        this.conn = getConnection(builder,hiveParameter.getUsername(),
                                  hiveParameter.getPassword());

        this.metaData = this.conn.getMetaData();
    }

    public HiveCatalogMeta getHiveCatalogMeta() {
        return hiveCatalogMeta;
    }

    @Override
    public HiveMetadataDriver getHadoopCatalogMeta() throws TException, URISyntaxException,
            IOException, InterruptedException {

        Database database = hiveMetaStoreClient.getDatabase(hiveParameter.getCatalog());

        String location = database.getLocationUri();

        this.hiveCatalogMeta.setCollectDataSource(CollectDataSourceEnum.HIVE);
        this.hiveCatalogMeta.setDbLocation(location);
        this.hiveCatalogMeta.setDbDescription(database.getDescription());

        int managedCount = 0;
        int externalCount = 0;
        for (HiveTableMeta hiveTable: this.hiveTableMetas) {
            String tableType = hiveTable.getTableType();
            if ("MANAGED_TABLE".equals(tableType)) {
                //内部表
                managedCount++;
            } else if ("EXTERNAL_TABLE".equals(tableType)) {
                //外部表
                externalCount++;
            }
        }

        this.hiveCatalogMeta.setManagedTableNum(managedCount);
        this.hiveCatalogMeta.setExternalTableNum(externalCount);

        this.hiveCatalogMeta.setTableMetas(this.hiveTableMetas);
        this.hiveCatalogMeta.setViewMetas(this.hiveViewMetas);
        this.hiveCatalogMeta.setDbViewNum(this.hiveViewMetas.size());

        //数据库大小
        Long dbCapacityLong = getHiveSize(location);
        BigDecimal capacityDecimal =
                BigDecimal.valueOf(dbCapacityLong).divide(BigDecimal.valueOf(1024 * 1024 * 1024L));
        Double dbCapacity = capacityDecimal.setScale(2,RoundingMode.HALF_UP).doubleValue();

        this.hiveCatalogMeta.setCapacity(dbCapacity);

        return this;
    }

    @Override
    public HiveMetadataDriver getTables(List<String> tableNames) throws SQLException, TException,
            URISyntaxException, IOException, InterruptedException {

        if (ObjectUtil.isNull(tableNames)) {
            //tableNames为空时采集全部表
            tableNames = this.getAllTables();
        }

        List<Table> tables =
                hiveMetaStoreClient.getTableObjectsByName(hiveParameter.getCatalog(),tableNames);

        for (Table table: tables) {
            String tableType = table.getTableType();

            if ("EXTERNAL_TABLE".equals(tableType) || "MANAGED_TABLE".equals(tableType)) {
                String tableName = table.getTableName();

                StorageDescriptor sd = table.getSd();
                String tableLocation = sd.getLocation();

                HiveTableMeta hiveTable = new HiveTableMeta();
                hiveTable.setTableName(tableName);
                hiveTable.setTableType(tableType);
                hiveTable.setTableLocation(tableLocation);
                hiveTable.setPartitionColumns(table.getPartitionKeys());
                hiveTable.setBucketColumns(sd.getBucketCols());
                hiveTable.setRowFormatSerde(sd.getSerdeInfo().getSerializationLib());
                hiveTable.setStoredToInputFormat(sd.getInputFormat());
                hiveTable.setStoredToOutputFormat(sd.getOutputFormat());

                Long tableRamLong = getHiveSize(tableLocation);
                BigDecimal ramDecimal =
                        BigDecimal.valueOf(tableRamLong).divide(BigDecimal.valueOf(1024 * 1024L));
                Double ramDouble = ramDecimal.setScale(2,RoundingMode.HALF_UP).doubleValue();

                //表容量
                hiveTable.setTableCapacity(ramDouble);

                //字段
                hiveTable.setColumns(getHiveTableColumns(hiveTable));

                //分桶字段数
                hiveTable.setBucketFieldNum(hiveTable.getBucketColumns().size());
                //分区字段数
                hiveTable.setPartitionKeysSum(hiveTable.getPartitionColumns().size());
                //字段数
                hiveTable.setTableFieldNum(hiveTable.getColumns().size());

                //建表语句
                hiveTable.setCreateTableInfo(createHiveTable(hiveTable));


                this.hiveTableMetas.add(hiveTable);
            }
        }

        return this;
    }

    private List<HiveTableColumnMeta> getHiveTableColumns(HiveTableMeta hiveTable) throws TException {
        List<FieldSchema> fieldSchemas = hiveMetaStoreClient.getFields(hiveParameter.getCatalog(),
                hiveTable.getTableName());
        //分区字段
        List<FieldSchema> partitionColumns = hiveTable.getPartitionColumns();

        //分桶字段
        List<String> bucketColumns = hiveTable.getBucketColumns();

        List<HiveTableColumnMeta> hiveColumns = new ArrayList<>(128);

        //基础字段
        for (FieldSchema fieldSchema: fieldSchemas) {

            String fieldName = fieldSchema.getName();

            HiveTableColumnMeta hiveColumn = new HiveTableColumnMeta();
            hiveColumn.setFieldName(fieldName);
            hiveColumn.setFieldType(fieldSchema.getType());
            hiveColumn.setFieldNotes(fieldSchema.getComment());
            hiveColumn.setIsPartition(Boolean.FALSE);
            hiveColumn.setIsBucket(bucketColumns.contains(fieldName)?Boolean.TRUE:Boolean.FALSE);

            hiveColumns.add(hiveColumn);
        }

        //分区字段
        for (FieldSchema fieldSchema: partitionColumns) {

            String fieldName = fieldSchema.getName();

            HiveTableColumnMeta hiveColumn = new HiveTableColumnMeta();
            hiveColumn.setFieldName(fieldName);
            hiveColumn.setFieldType(fieldSchema.getType());
            hiveColumn.setFieldNotes(fieldSchema.getComment());
            hiveColumn.setIsPartition(Boolean.TRUE);
            hiveColumn.setIsBucket(bucketColumns.contains(fieldName)?Boolean.TRUE:Boolean.FALSE);

            hiveColumns.add(hiveColumn);
        }

        return hiveColumns;
    }

    /**
     * 获取所有表
     */
    public List<String> getAllTables() throws SQLException {
        List<String> allTables = new ArrayList<>(128);

        rs = this.metaData.getTables(null,hiveParameter.getCatalog(),"%",
                new String[]{TableTypeEnum.TABLE.name()});

        while (rs.next()) {
            allTables.add(rs.getString("TABLE_NAME"));
        }
        return allTables;
    }

    /**
     * 获取所有视图
     */
    public List<String> getAllViews() throws SQLException {
        List<String> allViews = new ArrayList<>(128);

        rs = this.metaData.getTables(null,hiveParameter.getCatalog(),"%",
                new String[]{TableTypeEnum.VIEW.name()});

        while (rs.next()) {
            allViews.add(rs.getString("TABLE_NAME"));
        }

        return allViews;
    }

    @Override
    public void close() {
        try {
            if (rs != null) {
                rs.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            if (this.hiveMetaStoreClient != null) {
                this.hiveMetaStoreClient.close();
            }
        }
    }



    @Override
    public HiveMetadataDriver getViews(List<String> viewNames) throws SQLException, TException {

        if (ObjectUtil.isNull(viewNames)) {
            viewNames = this.getAllViews();
        }

        List<Table> views = hiveMetaStoreClient.getTableObjectsByName(hiveParameter.getCatalog(),
                viewNames);

        for (Table view: views) {
            String tableType = view.getTableType();
            if ("VIEW".contains(tableType.substring(tableType.length() - 4,
                    tableType.length() - 1))) {

                String viewName = view.getTableName();
                String viewOriginalText = view.getViewOriginalText();

                StorageDescriptor sd = view.getSd();
                int colsSum = sd.getColsSize();

                HiveViewMeta hiveView = new HiveViewMeta();
                hiveView.setViewName(viewName);
                hiveView.setViewDefinition(viewOriginalText);
                hiveView.setViewFieldNum(colsSum);
                hiveView.setColumns(getHiveViewColumns(hiveView));

                this.hiveViewMetas.add(hiveView);
            }
        }

        return this;
    }

    private List<HiveViewColumnMeta> getHiveViewColumns(HiveViewMeta hiveView) throws TException {

        List<FieldSchema> fieldSchemas = hiveMetaStoreClient.getFields(hiveParameter.getCatalog(),
                hiveView.getViewName());

        List<HiveViewColumnMeta> columns = new ArrayList<>(16);

        for (FieldSchema fieldSchema: fieldSchemas) {

            String fieldName = fieldSchema.getName();

            HiveViewColumnMeta hiveViewColumn = new HiveViewColumnMeta();

            hiveViewColumn.setFieldName(fieldName);
            hiveViewColumn.setFieldType(fieldSchema.getType());
            hiveViewColumn.setFieldNotes(fieldSchema.getComment());

            columns.add(hiveViewColumn);
        }

        return columns;

    }

    /**
     * 获取数据库/表大小
     */
    private Long getHiveSize(String locationPath) throws URISyntaxException, IOException,
            InterruptedException {
        Long ramLong = 0L;
        Configuration config = new Configuration();

        FileSystem fs = FileSystem.get(new URI(locationPath),config,
                                       hiveParameter.getUsername());
        Path p = new Path(locationPath);
        RemoteIterator<LocatedFileStatus> locatedFileStatusRemoteIterator = fs.listFiles(p,
                                                                                         true);
        while (locatedFileStatusRemoteIterator.hasNext()) {
            LocatedFileStatus locatedFileStatus = locatedFileStatusRemoteIterator.next();
            Long len = locatedFileStatus.getLen();
            ramLong = ramLong + len;
        }
        return ramLong;
    }

    /**
     * hive建表语句
     */

    private String createHiveTable(HiveTableMeta hiveTable) {

        String tableName = hiveTable.getTableName();
        String tableType = hiveTable.getTableType();
        String tableLocation = hiveTable.getTableLocation();
        String rowFormatSerde = hiveTable.getRowFormatSerde();
        String storedToInputFormat = hiveTable.getStoredToInputFormat();
        String storedToOutputFormat = hiveTable.getStoredToOutputFormat();

        List<HiveTableColumnMeta> hiveColumns = hiveTable.getColumns();
        Integer partitionKeysSum = hiveTable.getPartitionKeysSum();

        Integer fieldNum = hiveTable.getTableFieldNum();


        StringBuilder createTable = new StringBuilder();
        createTable.append("create ");
        if ("external".equals(tableType)) {
            //外部表
            createTable.append("external ");
        }
        createTable.append("table ");
        createTable.append(tableName);
        createTable.append('(');

        StringBuilder columnsBuilder = new StringBuilder();
        StringBuilder partitionBuilder = new StringBuilder();
        partitionBuilder.append("PARTITIONED BY");
        partitionBuilder.append('(');

        for (int i = 0;i < fieldNum;i++) {
            HiveTableColumnMeta hiveColumn = hiveColumns.get(i);

            String fieldName = hiveColumn.getFieldName();
            String fieldType = hiveColumn.getFieldType();

            if (Boolean.TRUE.equals(hiveColumn.getIsPartition())) {
                //字段为分区时
                partitionBuilder.append(fieldName);
                partitionBuilder.append(' ');
                partitionBuilder.append(fieldType);
                partitionBuilder.append(',');
            } else {
                columnsBuilder.append(fieldName);
                columnsBuilder.append(' ');
                columnsBuilder.append(fieldType);
                columnsBuilder.append(',');
            }

        }

        columnsBuilder.delete(columnsBuilder.length() - 1,columnsBuilder.length());
        columnsBuilder.append(')');

        partitionBuilder.delete(partitionBuilder.length() - 1,partitionBuilder.length());
        partitionBuilder.append(')');

        createTable.append(columnsBuilder);
        createTable.append(' ');

        if (0 != partitionKeysSum) {
            createTable.append(partitionBuilder);
            createTable.append(' ');
        }


        if (ObjectUtil.isNotNull(rowFormatSerde) || !rowFormatSerde.equals("null")) {
            createTable.append(" ROW FORMAT SERDE ");
            createTable.append(" '");
            createTable.append(rowFormatSerde);
            createTable.append("' ");
        }

        if (ObjectUtil.isNotNull(storedToInputFormat) || !storedToInputFormat.equals("null")) {
            createTable.append(" STORED AS INPUTFORMAT ");
            createTable.append(" '");
            createTable.append(storedToInputFormat);
            createTable.append("' ");
        }

        if (ObjectUtil.isNotNull(storedToOutputFormat) || !storedToOutputFormat.equals("null")) {
            createTable.append(" OUTPUTFORMAT ");
            createTable.append(" '");
            createTable.append(storedToOutputFormat);
            createTable.append("' ");
        }

        if (ObjectUtil.isNotNull(tableLocation) || !tableLocation.equals("null")) {
            createTable.append(" LOCATION ");
            createTable.append(" '");
            createTable.append(tableLocation);
            createTable.append("' ");
        }

        return createTable.toString();
    }

    private Connection getConnection(String url,String username,String password) throws SQLException, ClassNotFoundException {
        Class.forName("org.apache.hive.jdbc.HiveDriver");

        return DriverManager.getConnection(url,username,password);
    }

    /**
     *   当前版本2.1.1与集群3.0版本不兼容，加入此设置
     *   hiveMetaStoreClient.setMetaConf("hive.metastore.client.capability.check","false");
     */
    public void openHiveMetaStore() throws MetaException {
        HiveConf hiveConf = new HiveConf();
        hiveConf.set("hive.metastore.uris",hiveParameter.getThriftUrl());

        System.setProperty("HADOOP_USER_NAME",hiveParameter.getUsername());

        this.hiveMetaStoreClient = new HiveMetaStoreClientCompile(hiveConf);

    }
}
