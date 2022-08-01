package com.jb.adapter.hadoop.impl;

import cn.hutool.core.util.ObjectUtil;
import com.jb.enity.metadata.hadoop.hbase.phoenix.*;
import com.jb.enity.parameter.hadoop.PhoenixHBaseParameter;
import com.jb.enums.CollectDataSourceEnum;
import com.jb.enums.TableTypeEnum;
import com.jb.adapter.hadoop.IPhoenixHBaseMetadataDriver;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.LocatedFileStatus;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.fs.RemoteIterator;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * @author zhaojb
 * Phoenix HBase元数据采集适配
 */
public class PhoenixHBaseMetadataDriver implements IPhoenixHBaseMetadataDriver {

    private Connection conn;
    private PreparedStatement ps;
    private ResultSet rs;

    private DatabaseMetaData metaData;

    private final PhoenixHBaseParameter parameter;

    private PhoenixHBaseCatalogMeta phoenixHBaseCatalogMeta;
    private List<PhoenixHBaseTableMeta> tableMetas = new ArrayList<>(128);
    private List<PhoenixHBaseViewMeta> viewMetas = new ArrayList<>(128);

    public PhoenixHBaseMetadataDriver(PhoenixHBaseParameter parameter) {
        this.parameter = parameter;

        this.phoenixHBaseCatalogMeta = new PhoenixHBaseCatalogMeta();
        this.phoenixHBaseCatalogMeta.setCollectDataSource(CollectDataSourceEnum.PHOENIX_HBASE);
        this.phoenixHBaseCatalogMeta.setCatalog(parameter.getCatalog());

    }

    @Override
    public void createConnection() throws Exception {
        StringBuilder builder = new StringBuilder();
        builder.append("jdbc:phoenix:");
        builder.append(parameter.getQuorum());
        builder.append(':');
        builder.append(parameter.getClientPort());

        this.conn = getConnection(builder.toString());
        this.metaData = this.conn.getMetaData();

    }

    @Override
    public PhoenixHBaseMetadataDriver getHadoopCatalogMeta() throws Exception {

        this.phoenixHBaseCatalogMeta.setTableMetas(this.tableMetas);
        this.phoenixHBaseCatalogMeta.setViewMetas(this.viewMetas);
        this.phoenixHBaseCatalogMeta.setDbTableNum(this.tableMetas.size());
        this.phoenixHBaseCatalogMeta.setDbViewNum(this.viewMetas.size());

        //数据库内存
        BigDecimal ramDecimal = BigDecimal.valueOf(getHBaseSize(parameter.getHdfsUrl()))
                .divide(BigDecimal.valueOf(1024 * 1024 * 1024L));

        this.phoenixHBaseCatalogMeta.setCapacity(ramDecimal.setScale(2,RoundingMode.HALF_UP).doubleValue());
        this.phoenixHBaseCatalogMeta.setTableMetas(this.tableMetas);
        this.phoenixHBaseCatalogMeta.setViewMetas(this.viewMetas);
        this.phoenixHBaseCatalogMeta.setDbTableNum(this.tableMetas.size());
        this.phoenixHBaseCatalogMeta.setDbViewNum(this.viewMetas.size());

        return this;
    }

    public PhoenixHBaseCatalogMeta getPhoenixHBaseCatalogMeta() {

        return phoenixHBaseCatalogMeta;
    }

    @Override
    public void close() {
        try {
            if (rs != null) {
                rs.close();
            }
            if (ps != null) {
                ps.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    /**
     * 获取连接
     */
    private Connection getConnection(String url) throws SQLException, ClassNotFoundException {
        Class.forName("org.apache.phoenix.jdbc.PhoenixDriver");
        Properties p = new Properties();
        p.setProperty("phoenix.schema.isNamespaceMappingEnabled","true");
        p.setProperty("phoenix.schema.mapSystemTablesToNamespace","true");

        return DriverManager.getConnection(url,p);

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

        FileSystem fs = FileSystem.get(new URI(locationPath),config,parameter.getUsername());
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

    @Override
    public PhoenixHBaseMetadataDriver getTables(List<String> tableNames) throws Exception {

        if (ObjectUtil.isNull(tableNames)) {
            tableNames = getAllTables();
        }

        //全部表
        rs = metaData.getTables(null,
                                parameter.getCatalog(),"%",
                                new String[]{TableTypeEnum.TABLE.name()});

        while (rs.next()) {
            String tableName = rs.getString("TABLE_NAME");
            if (tableNames.contains(tableName)) {
                PhoenixHBaseTableMeta tableMeta = new PhoenixHBaseTableMeta();
                tableMeta.setTableName(tableName);
                tableMeta.setTableComment(rs.getString("REMARKS"));

                BigDecimal capacityDecimal =
                        BigDecimal.valueOf(getHBaseSize(parameter.getHdfsUrl()+'/'+((tableName.contains(
                                ":"))?tableName.substring(tableName.indexOf(":")+1):tableName))).divide(BigDecimal.valueOf(1024 * 1024L));
                Double tableCapacity = capacityDecimal.setScale(2,RoundingMode.HALF_UP).doubleValue();

                tableMeta.setTableCapacity(tableCapacity);

                tableMetas.add(tableMeta);
            }

        }

        return this;
    }

    /**
     * 获取所有表
     */
    public List<String> getAllTables() throws SQLException {
        List<String> allTables = new ArrayList<>(128);

        rs = metaData.getTables(null,
                                parameter.getCatalog(),"%",
                                new String[]{TableTypeEnum.TABLE.name()});

        while (rs.next()) {
            allTables.add(rs.getString("TABLE_NAME"));
        }

        return allTables;
    }

    /**
     * 获取表字段
     */
    public PhoenixHBaseMetadataDriver getTableColumns() throws Exception {

        for (PhoenixHBaseTableMeta tableMeta: this.tableMetas) {

            String tableName = tableMeta.getTableName();

            //获取字段
            rs = getColumns(tableName);
            List<PhoenixHBaseTableColumnMeta> columnMetas = new ArrayList<>(16);
            while (rs.next()) {
                PhoenixHBaseTableColumnMeta column = new PhoenixHBaseTableColumnMeta();
                column.setFieldName(rs.getString("COLUMN_NAME"));
                column.setFieldType(rs.getString("TYPE_NAME"));
                column.setFieldSize(rs.getInt("COLUMN_SIZE"));
                column.setFieldDigits(rs.getInt("DECIMAL_DIGITS"));
//            column.setFieldNotes(rs.getString("REMARKS"));
//            column.setFieldDef(rs.getString("COLUMN_DEF"));
//            column.setFieldIsNullable(rs.getString("IS_NULLABLE"));

                columnMetas.add(column);
            }
            tableMeta.setColumns(columnMetas);

        }

        return this;
    }

    public PhoenixHBaseMetadataDriver getCreateTable(){
        for(PhoenixHBaseTableMeta tableMeta:this.tableMetas){
            String createTable = "create table " +
                    tableMeta.getTableName() +
                    '(' +
                    getCreateTable(tableMeta.getColumns()) +
                    ')';

            tableMeta.setTableFieldNum(tableMeta.getColumns().size());
            tableMeta.setCreateTableInfo(createTable);
        }

        return this;
    }

    private String getCreateTable(List<PhoenixHBaseTableColumnMeta> columns) {
        StringBuilder createTableColumns = new StringBuilder();

        for (PhoenixHBaseTableColumnMeta columnMeta:columns) {
            createTableColumns.append(columnMeta.getFieldName());
            createTableColumns.append(' ');
            createTableColumns.append(columnMeta.getFieldType());
            createTableColumns.append(' ');

            //字段类型
            Integer fieldSize = columnMeta.getFieldSize();
            if (ObjectUtil.isNotNull(fieldSize)) {
                createTableColumns.append('(');
                createTableColumns.append(fieldSize);

                Integer fieldDigits = columnMeta.getFieldDigits();
                if (ObjectUtil.isNotNull(fieldDigits)) {
                    createTableColumns.append(',');
                    createTableColumns.append(fieldDigits);
                }
                createTableColumns.append(')');
            }

            //字段是否可为null
//            String isNullable = columnMeta.getFieldIsNullable();
//            if ("NO".equals(isNullable)) {
//                //不能为空
//                createTableColumns.append(' ');
//                createTableColumns.append("NOT NULL");
//            }

            createTableColumns.append(',');
        }
        //删除最后一个字符
        createTableColumns.delete(createTableColumns.length() - 1,createTableColumns.length());

        return createTableColumns.toString();
    }

    public PhoenixHBaseMetadataDriver getPrimaryKeys() throws SQLException {
        for(PhoenixHBaseTableMeta tableMeta: this.tableMetas){
            //获取主键
            rs = getPrimaryKey(tableMeta.getTableName());

            //获取表字段
            List<PhoenixHBaseTableColumnMeta> columns = tableMeta.getColumns();

            while (rs.next()){
                String columnName = rs.getString("COLUMN_NAME");
                for(PhoenixHBaseTableColumnMeta columnMeta:columns){
                    if (columnMeta.getFieldName().equals(columnName)) {
                        columnMeta.setPk(true);
                        break;
                    }
                }
            }
        }
        return this;
    }

    public PhoenixHBaseMetadataDriver getIndexInfos() throws SQLException{
        for(PhoenixHBaseTableMeta tableMeta: this.tableMetas){
            //获取索引
            rs = getIndexInfo(tableMeta.getTableName());

            //获取表字段
            List<PhoenixHBaseTableColumnMeta> columns = tableMeta.getColumns();

            while (rs.next()){
                String columnName = rs.getString("COLUMN_NAME");
                for(PhoenixHBaseTableColumnMeta columnMeta:columns){
                    if (columnMeta.getFieldName().equals(columnName)) {
                        columnMeta.setIndex(true);
                        break;
                    }
                }
            }
        }
        return this;
    }

    @Override
    public PhoenixHBaseMetadataDriver getViews(List<String> viewNames) throws Exception {
        if (ObjectUtil.isNull(viewNames)) {
            viewNames = getAllViews();
        }

        //全部表
        rs = metaData.getTables(null,
                                parameter.getCatalog(),"%",
                                new String[]{TableTypeEnum.VIEW.name()});

        while (rs.next()) {
            String viewName = rs.getString("TABLE_NAME");
            if (viewNames.contains(viewName)) {
                PhoenixHBaseViewMeta viewMeta = new PhoenixHBaseViewMeta();
                viewMeta.setViewName(viewName);

                BigDecimal capacityDecimal =
                        BigDecimal.valueOf(getHBaseSize(parameter.getHdfsUrl()+'/'+((viewName.contains(
                                ":"))?viewName.substring(viewName.indexOf(":")+1):viewName))).divide(BigDecimal.valueOf(1024 * 1024L));
                Double viewCapacity = capacityDecimal.setScale(2,RoundingMode.HALF_UP).doubleValue();

                viewMeta.setViewCapacity(viewCapacity);

                viewMetas.add(viewMeta);
            }

        }
        return this;
    }


    /**
     * 获取所有表
     */
    public List<String> getAllViews() throws SQLException {
        List<String> allViews = new ArrayList<>(128);

        rs = metaData.getTables(null,
                                parameter.getCatalog(),"%",
                                new String[]{TableTypeEnum.VIEW.name()});

        while (rs.next()) {
            allViews.add(rs.getString("TABLE_NAME"));
        }

        return allViews;
    }

    public PhoenixHBaseMetadataDriver getViewColumns() throws Exception {
        for (PhoenixHBaseViewMeta viewMeta: this.viewMetas) {

            String viewName = viewMeta.getViewName();

            //获取字段
            rs = getColumns(viewName);
            List<PhoenixHBaseViewColumnMeta> columnMetas = new ArrayList<>(16);
            while (rs.next()) {
                PhoenixHBaseViewColumnMeta column = new PhoenixHBaseViewColumnMeta();
                column.setFieldName(rs.getString("COLUMN_NAME"));
                column.setFieldType(rs.getString("TYPE_NAME"));
                column.setFieldSize(rs.getInt("COLUMN_SIZE"));
                column.setFieldDigits(rs.getInt("DECIMAL_DIGITS"));
//            column.setFieldNotes(rs.getString("REMARKS"));
//            column.setFieldDef(rs.getString("COLUMN_DEF"));
//            column.setFieldIsNullable(rs.getString("IS_NULLABLE"));

                columnMetas.add(column);
            }
            viewMeta.setColumns(columnMetas);

        }

        return this;
    }

    //获取字段
    private ResultSet getColumns(String tableName) throws SQLException {

        return metaData.getColumns(null,parameter.getCatalog(),tableName,"%");
    }

    //获取主键
    private ResultSet getPrimaryKey(String tableName) throws SQLException {

        return metaData.getPrimaryKeys(null,parameter.getCatalog(),tableName);
    }

    //获取索引
    private ResultSet getIndexInfo(String tableName) throws SQLException {

        return metaData.getIndexInfo(null,parameter.getCatalog(),tableName,false,false);
    }

}
