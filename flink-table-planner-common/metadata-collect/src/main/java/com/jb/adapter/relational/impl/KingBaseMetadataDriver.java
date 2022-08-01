package com.jb.adapter.relational.impl;


import com.jb.enity.metadata.relational.table.TableMeta;
import com.jb.enity.metadata.relational.table.ViewMeta;
import com.jb.enity.parameter.relational.KingBaseParameter;
import com.jb.enums.CollectDataSourceEnum;
import com.jb.adapter.relational.ICatalogSchemaMetadataDriver;
import com.jb.adapter.relational.RelationalMetadataAdapter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author zhaojb
 * 关系型数据库元数据采集适配器-KingBase
 */
public class KingBaseMetadataDriver extends RelationalMetadataAdapter implements ICatalogSchemaMetadataDriver {

    private KingBaseParameter kingBaseParameter;

    public KingBaseMetadataDriver(CollectDataSourceEnum catalogSchemaType,
            KingBaseParameter kingBaseParameter) {
        super(catalogSchemaType,kingBaseParameter.getCatalog(),kingBaseParameter.getSchema());

        this.kingBaseParameter = kingBaseParameter;
    }

    @Override
    public void createConnection() throws SQLException, ClassNotFoundException {
        StringBuilder builder = new StringBuilder();
        builder.append("jdbc:kingbase8://");
        builder.append(kingBaseParameter.getIp());
        builder.append(':');
        builder.append(kingBaseParameter.getPort());
        builder.append('/');
        builder.append(kingBaseParameter.getCatalog());

        getConnection(builder.toString(),kingBaseParameter.getUsername(),
                kingBaseParameter.getPassword());
    }

    @Override
    public RelationalMetadataAdapter getSchemaCapacity() throws SQLException {
        String sql = "SELECT ROUND(count(relpages)*8/(1024*1024),2) AS schemaCapacity FROM " +
                "sys_class WHERE relnamespace = (SELECT oid FROM sys_namespace WHERE nspname = ?)";

        ps = conn.prepareStatement(sql);

        ps.setString(1,kingBaseParameter.getSchema());

        rs = ps.executeQuery();

        while (rs.next()) {
            this.catalogSchemaMeta.setCapacity(rs.getDouble("schemaCapacity"));
        }
        return this;
    }

    @Override
    public RelationalMetadataAdapter getTableCapacity() throws SQLException {
        String sql = "SELECT relname AS tableName,ROUND(relpages*8/(1024),2) AS tableCapacity " +
                "FROM sys_class \n" +
                "WHERE relnamespace = (SELECT oid FROM sys_namespace WHERE nspname = ?)";
        ps = conn.prepareStatement(sql);

        ps.setString(1,kingBaseParameter.getSchema());

        rs = ps.executeQuery();

        while (rs.next()) {
            String tableName = rs.getString("tableName");

            Double tableCapacity = rs.getDouble("tableCapacity");

            for (TableMeta table: tableMetas) {
                if (tableName.equals(table.getTableName())) {
                    table.setTableCapacity(tableCapacity);

                    break;
                }
            }

        }

        return this;
    }

    @Override
    public RelationalMetadataAdapter getViewDefinition() throws SQLException {
        String sql = "SELECT \"TABLE_SCHEMA\" AS modeName,\"TABLE_NAME\" AS viewName," +
                "\"VIEW_DEFINITION\" AS viewDefinition FROM \"INFORMATION_SCHEMA\".\"VIEWS\" " +
                "WHERE \"TABLE_SCHEMA\"=?";

        ps = conn.prepareStatement(sql);

        ps.setString(1,kingBaseParameter.getSchema());

        rs = ps.executeQuery();

        while (rs.next()) {
            String viewName = rs.getString("viewName");
            String viewDefinition = rs.getString("viewDefinition");

            for (ViewMeta view: viewMetas) {
                if (viewName.equals(view.getViewName())) {
                    view.setViewDefinition(viewDefinition);
                    break;
                }
            }
        }

        return this;
    }

    /**
     * 获取连接
     *
     * @param url      数据库url地址
     * @param username 连接数据库用户名
     * @param password 连接数据库密码
     * @return
     */
    private Connection getConnection(String url,String username,String password) throws SQLException {
        DriverManager.registerDriver(new com.kingbase8.Driver());

        conn = DriverManager.getConnection(url,username,password);

        return conn;
    }
}
