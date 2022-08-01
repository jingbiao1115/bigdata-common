package com.jb.adapter.relational;

import cn.hutool.core.util.ObjectUtil;
import com.jb.enity.metadata.relational.RelationalCatalogMeta;
import com.jb.enity.metadata.relational.column.TableColumnMeta;
import com.jb.enity.metadata.relational.column.ViewColumnMeta;
import com.jb.enity.metadata.relational.table.TableMeta;
import com.jb.enity.metadata.relational.table.ViewMeta;
import com.jb.enums.CollectDataSourceEnum;
import com.jb.enums.TableTypeEnum;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zhaojb
 * 关系型数据库元数据采集适配器
 */
public class RelationalMetadataAdapter {

    protected Connection conn;
    protected PreparedStatement ps;
    protected ResultSet rs;

    protected DatabaseMetaData metaData;

    protected RelationalCatalogMeta catalogSchemaMeta;

    protected List<TableMeta> tableMetas = new ArrayList<>(128);
    protected List<ViewMeta> viewMetas = new ArrayList<>(128);

    protected RelationalMetadataAdapter(CollectDataSourceEnum dataSourceType,String catalog,
                                        String schema) {

        this.catalogSchemaMeta = new RelationalCatalogMeta();
        this.catalogSchemaMeta.setCollectDataSource(dataSourceType);
        this.catalogSchemaMeta.setCatalog(catalog);
        this.catalogSchemaMeta.setSchema(schema);
    }

    /**
     * 获取元数据连接
     */
    public void getMetaData() throws SQLException {
        this.metaData = conn.getMetaData();
    }

    /**
     * 封装数据库信息
     */
    public RelationalMetadataAdapter getCatalogSchema() {

        this.catalogSchemaMeta.setTableNum(this.tableMetas.size());
        this.catalogSchemaMeta.setViewNum(this.viewMetas.size());
        this.catalogSchemaMeta.setTableMetas(this.tableMetas);
        this.catalogSchemaMeta.setViewMetas(this.viewMetas);

        return this;
    }

    public RelationalCatalogMeta getCatalogSchemaMeta() {
        return catalogSchemaMeta;
    }

    /**
     * 获取所有表
     */
    public List<String> getAllTables() throws SQLException {
        List<String> allTables = new ArrayList<>(128);

        rs = getTable("%");
        while (rs.next()) {
            allTables.add(rs.getString("TABLE_NAME"));
        }
        return allTables;
    }

    /**
     * 获取表
     *
     * @param tableNames
     * @return
     * @throws SQLException
     */
    public RelationalMetadataAdapter getTables(List<String> tableNames) throws SQLException {

        //获取全部表
        rs = getTable("%");

        if (ObjectUtil.isNull(tableNames)) {
            //全表
            while (rs.next()) {
                tables(rs.getString("TABLE_NAME"));
            }

        } else {
            //指定表
            while (rs.next()) {
                String tableName = rs.getString("TABLE_NAME");

                if (tableNames.contains(tableName)) {
                    tables(tableName);
                }
            }
        }

        return this;
    }

    private void tables(String tableName) throws SQLException {
        TableMeta table = new TableMeta();

        table.setTableName(tableName);
        table.setTableComment(rs.getString("REMARKS"));

        tableMetas.add(table);
    }


    /**
     * 获取所有视图
     */
    public List<String> getAllViews() throws SQLException {
        List<String> allViews = new ArrayList<>(128);

        rs = getView("%");

        while (rs.next()) {
            allViews.add(rs.getString("TABLE_NAME"));
        }

        return allViews;
    }


    /**
     * 获取视图
     *
     * @param viewNames
     * @return
     * @throws SQLException
     */
    public RelationalMetadataAdapter getViews(List<String> viewNames) throws SQLException {

        //全部视图
        rs = getView("%");

        if (ObjectUtil.isNull(viewNames)) {
            while (rs.next()) {
                views(rs.getString("TABLE_NAME"));
            }
        } else {
            while (rs.next()) {
                String viewName = rs.getString("TABLE_NAME");
                if (viewNames.contains(viewName)) {
                    views(viewName);
                }
            }
        }

        return this;
    }

    private void views(String viewName) throws SQLException {

        ViewMeta view = new ViewMeta();

        view.setViewName(viewName);
        view.setViewComment(rs.getString("REMARKS"));

        viewMetas.add(view);
    }

    /**
     * 获取建表语句
     */
    public RelationalMetadataAdapter getCreateTable() {
        for (TableMeta table: tableMetas) {

            String createTable = "create table " +
                    table.getTableName() +
                    '(' +
                    getCreateTable(table.getColumns()) +
                    ')';

            table.setCreateTableInfo(createTable);
        }
        return this;
    }

    private String getCreateTable(List<TableColumnMeta> columns) {
        StringBuilder createTableColumns = new StringBuilder();

        for (int i = 0;i < columns.size();i++) {
            TableColumnMeta column = columns.get(i);

            createTableColumns.append(column.getFieldName());
            createTableColumns.append(' ');
            createTableColumns.append(column.getFieldType());
            createTableColumns.append(' ');

            //字段类型
            Integer fieldSize = column.getFieldSize();
            if (ObjectUtil.isNotNull(fieldSize)) {
                createTableColumns.append('(');
                createTableColumns.append(fieldSize);

                Integer fieldDigits = column.getFieldDigits();
                if (ObjectUtil.isNotNull(fieldDigits)) {
                    createTableColumns.append(',');
                    createTableColumns.append(fieldDigits);
                }
                createTableColumns.append(')');
            }

            //字段是否可为null
            String isNullable = column.getFieldIsNullable();
            if ("NO".equals(isNullable)) {
                //不能为空
                createTableColumns.append(' ');
                createTableColumns.append("NOT NULL");
            }

            createTableColumns.append(',');

        }

        //删除最后一个字符
        createTableColumns.delete(createTableColumns.length() - 1,createTableColumns.length());

        return createTableColumns.toString();
    }

    /**
     * 获取字段
     *
     * @return
     * @throws SQLException
     */
    public RelationalMetadataAdapter getTableColumns() throws SQLException {

        for (TableMeta table: tableMetas) {

            rs = getColumns(table.getTableName());

            List<TableColumnMeta> columns = new ArrayList<>(128);

            while (rs.next()) {
                TableColumnMeta column = new TableColumnMeta();
                column.setFieldName(rs.getString("COLUMN_NAME"));
                column.setFieldType(rs.getString("TYPE_NAME"));
                column.setFieldSize(rs.getInt("COLUMN_SIZE"));
                column.setFieldDigits(rs.getInt("DECIMAL_DIGITS"));
                column.setFieldNotes(rs.getString("REMARKS"));
                column.setFieldDef(rs.getString("COLUMN_DEF"));
                column.setFieldIsNullable(rs.getString("IS_NULLABLE"));

                columns.add(column);

            }

            table.setColumns(columns);
            table.setTableFieldNum(columns.size());
        }


        return this;

    }

    private ResultSet getTable(String tableName) throws SQLException {

        switch (this.catalogSchemaMeta.getCollectDataSource().getCode()) {
            case 5:
                //gbase
                return metaData.getTables(null,null,tableName,
                                          new String[]{TableTypeEnum.TABLE.name()});

            case 101:
                //hive
                return metaData.getTables(null,this.catalogSchemaMeta.getCatalog(),tableName,
                                          new String[]{TableTypeEnum.TABLE.name()});

            default:
                return metaData.getTables(this.catalogSchemaMeta.getCatalog(),
                                          this.catalogSchemaMeta.getSchema(),tableName,
                                          new String[]{TableTypeEnum.TABLE.name()});
        }

    }

    private ResultSet getView(String viewName) throws SQLException {

        if (this.catalogSchemaMeta.getCollectDataSource().getCode() == 5) {
            //gbase
            return metaData.getTables(null,null,viewName,
                                      new String[]{TableTypeEnum.VIEW.name()});
        }
        return metaData.getTables(this.catalogSchemaMeta.getCatalog(),
                                  this.catalogSchemaMeta.getSchema(),viewName,
                                  new String[]{TableTypeEnum.VIEW.name()});

    }

    public RelationalMetadataAdapter getViewColumns() throws SQLException {

        for (ViewMeta view: viewMetas) {

            rs = getColumns(view.getViewName());

            List<ViewColumnMeta> columns = new ArrayList<>(128);

            while (rs.next()) {
                ViewColumnMeta column = new ViewColumnMeta();
                column.setFieldName(rs.getString("COLUMN_NAME"));
                column.setFieldType(rs.getString("TYPE_NAME"));
                column.setFieldSize(rs.getInt("COLUMN_SIZE"));
                column.setFieldDigits(rs.getInt("DECIMAL_DIGITS"));
                column.setFieldNotes(rs.getString("REMARKS"));
                column.setFieldDef(rs.getString("COLUMN_DEF"));
                column.setFieldIsNullable(rs.getString("IS_NULLABLE"));

                columns.add(column);

            }
            view.setColumns(columns);
            view.setViewFieldNum(columns.size());
        }

        return this;
    }

    private ResultSet getColumns(String tableName) throws SQLException {

        if (this.catalogSchemaMeta.getCollectDataSource().getCode() == 5) {//gbase
            return metaData.getColumns(null,null,tableName,"%");
        }
        return metaData.getColumns(this.catalogSchemaMeta.getCatalog(),
                                   this.catalogSchemaMeta.getSchema(),tableName,"%");

    }

    /**
     * 获取主键
     *
     * @return
     * @throws SQLException
     */
    public RelationalMetadataAdapter getPrimaryKeys() throws SQLException {

        for (TableMeta table: tableMetas) {
            rs = getPrimaryKey(table.getTableName());
            //获取表字段
            List<TableColumnMeta> columns = table.getColumns();

            while (rs.next()) {
                String columnName = rs.getString("COLUMN_NAME");

                for (TableColumnMeta column: columns) {
                    if (column.getFieldName().equals(columnName)) {
                        column.setPk(true);
                        break;
                    }

                }

            }

        }

        return this;
    }

    private ResultSet getPrimaryKey(String tableName) throws SQLException {

        if (this.catalogSchemaMeta.getCollectDataSource().getCode() == 5) {//gbase
            return metaData.getPrimaryKeys(null,null,tableName);
        }
        return metaData.getPrimaryKeys(this.catalogSchemaMeta.getCatalog(),
                                       this.catalogSchemaMeta.getSchema(),tableName);
    }

    /**
     * 获取索引
     *
     * @return
     * @throws SQLException
     */
    public RelationalMetadataAdapter getIndexInfos() throws SQLException {

        for (TableMeta table: tableMetas) {
            rs = getIndexInfo(table.getTableName());
            //获取表字段
            List<TableColumnMeta> columns = table.getColumns();

            while (rs.next()) {
                String columnName = rs.getString("COLUMN_NAME");

                for (TableColumnMeta column: columns) {
                    if (column.getFieldName().equals(columnName)) {
                        column.setIndex(true);
                        break;
                    }

                }
            }
        }

        return this;
    }

    private ResultSet getIndexInfo(String tableName) throws SQLException {

        switch (this.catalogSchemaMeta.getCollectDataSource().getCode()) {
            case 2:
                //orcale
                return metaData.getIndexInfo(this.catalogSchemaMeta.getCatalog(),
                                             this.catalogSchemaMeta.getSchema(),
                                             "\"" + tableName + "\"",false,false);

            case 5:
                //gbase
                return metaData.getIndexInfo(null,null,tableName,
                                             false,false);

            default:
                return metaData.getIndexInfo(this.catalogSchemaMeta.getCatalog(),
                                             this.catalogSchemaMeta.getSchema(),tableName,
                                             false,false);
        }

    }


    /**
     * 关闭JDBC连接
     */
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


}
