package com.jb.adapter.bigdata.impl;

import cn.hutool.core.util.ObjectUtil;
import com.jb.enity.metadata.bigdata.hbase.HBaseCatalogMeta;
import com.jb.enity.metadata.bigdata.hbase.HBaseColumnMeta;
import com.jb.enity.metadata.bigdata.hbase.HBaseQualifierMeta;
import com.jb.enity.metadata.bigdata.hbase.HBaseTableMeta;
import com.jb.enity.parameter.bigdata.HBaseParameter;
import com.jb.enums.CollectDataSourceEnum;
import com.jb.adapter.bigdata.IHBaseMetadataDriver;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.*;
import org.apache.hadoop.hbase.HBaseConfiguration;
import org.apache.hadoop.hbase.TableName;
import org.apache.hadoop.hbase.client.*;
import org.apache.hadoop.hbase.util.Bytes;


import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.sql.SQLException;
import java.util.*;

/**
 * @author zhaojb
 * HBase元数据采集适配
 */
public class HBaseMetadataDriver implements IHBaseMetadataDriver {

    private Connection conn = null;
    private HBaseAdmin hBaseAdmin = null;

    private final HBaseParameter hBaseParameter;

    private final HBaseCatalogMeta hBaseCatalogMeta;

    private final List<HBaseTableMeta> hBaseTableMetas = new ArrayList<>(128);

    public HBaseMetadataDriver(HBaseParameter hBaseParameter) {
        this.hBaseParameter = hBaseParameter;

        this.hBaseCatalogMeta = new HBaseCatalogMeta();
        this.hBaseCatalogMeta.setCollectDataSource(CollectDataSourceEnum.HBASE);
        this.hBaseCatalogMeta.setCatalog(hBaseParameter.getCatalog());

    }

    @Override
    public void createConnection() throws SQLException, ClassNotFoundException,
            IOException {

        Configuration conf = HBaseConfiguration.create();
        conf.set("hbase.rootdir",hBaseParameter.getRootDir());
        conf.set("zookeeper.znode.parent",hBaseParameter.getZNodeParent());
        conf.set("hbase.zookeeper.quorum",hBaseParameter.getQuorum());
        conf.set("hbase.zookeeper.property.clientPort",
                 String.valueOf(hBaseParameter.getClientPort()));

        conn = ConnectionFactory.createConnection(conf);

        hBaseAdmin = (HBaseAdmin)conn.getAdmin();

    }

    @Override
    public HBaseMetadataDriver getHadoopCatalogMeta() throws URISyntaxException,
            IOException, InterruptedException {

        this.hBaseCatalogMeta.setDbTableNum(this.hBaseTableMetas.size());
        this.hBaseCatalogMeta.setTableMetas(this.hBaseTableMetas);

        Long dbCapacityLong = getHBaseSize(hBaseParameter.getHdfsUrl());
        BigDecimal capacityDecimal =
                BigDecimal.valueOf(dbCapacityLong).divide(BigDecimal.valueOf(1024 * 1024 * 1024L));
        Double dbCapacity = capacityDecimal.setScale(2,RoundingMode.HALF_UP).doubleValue();

        this.hBaseCatalogMeta.setCapacity(dbCapacity);


        return this;
    }

    @Override
    public HBaseMetadataDriver getTables(List<String> tableNames) throws  IOException,
            URISyntaxException, InterruptedException {

        if (ObjectUtil.isNull(tableNames)) {
            //tableNames为空时采集全部表
            tableNames = this.getAllTables();
        }

        List<TableDescriptor> tableDescriptors =
                hBaseAdmin.listTableDescriptorsByNamespace(hBaseParameter.getCatalog().getBytes(StandardCharsets.UTF_8));

        for (TableDescriptor table: tableDescriptors) {
            String tableName = table.getTableName().getNameAsString();

            if(tableNames.contains(tableName)){
                //表大小
                BigDecimal capacityDecimal =
                        BigDecimal.valueOf(getHBaseSize(hBaseParameter.getHdfsUrl()+'/'+((tableName.contains(":"))?tableName.substring(tableName.indexOf(":")+1):tableName))).divide(BigDecimal.valueOf(1024 * 1024L));
                Double tableCapacity = capacityDecimal.setScale(2,RoundingMode.HALF_UP).doubleValue();

                HBaseTableMeta hBaseTable = new HBaseTableMeta();
                hBaseTable.setTableName(tableName);
                hBaseTable.setTableCapacity(tableCapacity);
                hBaseTable.setIsEnabled(hBaseAdmin.isTableEnabled(table.getTableName()));
                hBaseTable.setMaxFileSize(table.getMaxFileSize());
                hBaseTable.setTableColumnFamilyNum(table.getColumnFamilyCount());
                hBaseTable.setRegionReplication(table.getRegionReplication());
                hBaseTable.setMemStoreFlushSize(table.getMemStoreFlushSize());
                hBaseTable.setColumns(getColumnFamilies(table));

                this.hBaseTableMetas.add(hBaseTable);
            }
        }
        return this;
    }

    private List<HBaseColumnMeta> getColumnFamilies(TableDescriptor table) throws IOException {
        ColumnFamilyDescriptor[] columnFamilies = table.getColumnFamilies();

        String tableName = table.getTableName().getNameAsString();

        List<HBaseColumnMeta> hBaseColumns = new ArrayList<>(128);

        for (ColumnFamilyDescriptor columnFamily: columnFamilies) {
            String columnFamilyName = columnFamily.getNameAsString();
            int columnFamilyMaxVersion = columnFamily.getMaxVersions();
            int columnFamilyMinVersion = columnFamily.getMinVersions();

            HBaseColumnMeta hBaseColumn = new HBaseColumnMeta();
            hBaseColumn.setColumnFamilyName(columnFamilyName);
            hBaseColumn.setColumnFamilyMaxVersion(columnFamilyMaxVersion);
            hBaseColumn.setColumnFamilyMinVersion(columnFamilyMinVersion);
            hBaseColumn.setQualifiers(getQualifiers(tableName,columnFamilyName));

            hBaseColumns.add(hBaseColumn);
        }

        return hBaseColumns;
    }

    private List<HBaseQualifierMeta> getQualifiers(String tableName,String columnFamily) throws IOException {
        Table table = conn.getTable(TableName.valueOf(tableName));
        Scan scan = new Scan();
        /**
         *         Filter filter = new PageFilter(1); //
         *         scan.setFilter(filter);
         *         scan.addFamily("f2".getBytes(StandardCharsets.UTF_8));
         */
        ResultScanner scanner = table.getScanner(scan);

        Iterator<Result> res = scanner.iterator();
        Set<String> set = new HashSet<>();

        while (res.hasNext()) {
            Result result1 = res.next();
            Map<byte[],byte[]> map =
                    result1.getFamilyMap(columnFamily.getBytes(StandardCharsets.UTF_8));
            for (Map.Entry<byte[],byte[]> entry: map.entrySet()) {
                set.add(Bytes.toString(entry.getKey()));
            }
        }


        List<HBaseQualifierMeta> qualifiers = new ArrayList<>(16);

        for (String quality: set) {
            if (!quality.contains("�")) {
                HBaseQualifierMeta qualifier = new HBaseQualifierMeta();
                qualifier.setQualifierName(quality);
                qualifier.setQualifierType("string");

                qualifiers.add(qualifier);
            }
        }
        return qualifiers;
    }

    public HBaseCatalogMeta getHBaseCatalogMeta() {
        return hBaseCatalogMeta;
    }

    /**
     * 获取所有表
     */
    public List<String> getAllTables() throws IOException {
        List<String> allTables = new ArrayList<>(128);

        TableName[] tableNames = hBaseAdmin.listTableNamesByNamespace(hBaseParameter.getCatalog());

        for(TableName t1:tableNames){
            allTables.add(t1.getNameAsString());
        }

        return allTables;
    }

    @Override
    public void close() {
        try {
            if (hBaseAdmin != null) {
                hBaseAdmin.close();
            }

            if (conn != null) {
                conn.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    /**
     * 获取HBase库/表容量
     *
     * @param locationPath HBase数据库地址,表地址
     *                     表地址 = 数据库地址+'/'
     */
    private Long getHBaseSize(String locationPath) throws URISyntaxException, IOException,
            InterruptedException {
        Long ramLong = 0L;
        Configuration config = new Configuration();

        FileSystem fs = FileSystem.get(new URI(locationPath),config,hBaseParameter.getUsername());
        Path p = new Path(locationPath);
        RemoteIterator<LocatedFileStatus> locatedFileStatusRemoteIterator
                = fs.listFiles(p,true);
        while (locatedFileStatusRemoteIterator.hasNext()) {
            LocatedFileStatus locatedFileStatus = locatedFileStatusRemoteIterator.next();
            Long len = locatedFileStatus.getLen();
            ramLong = ramLong + len;
        }
        return ramLong;
    }
}
