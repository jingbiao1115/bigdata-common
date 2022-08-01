package com.jb.adapter.relational.impl;

import com.jb.enity.metadata.relational.table.TableMeta;
import com.jb.enity.metadata.relational.table.ViewMeta;
import com.jb.enity.parameter.relational.PostGreParameter;
import com.jb.enums.CollectDataSourceEnum;
import com.jb.adapter.relational.ICatalogSchemaMetadataDriver;
import com.jb.adapter.relational.RelationalMetadataAdapter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author zhaojb
 * 关系型数据库元数据采集适配器-PostGre
 */
public class PostGreMetadataDriver extends RelationalMetadataAdapter implements ICatalogSchemaMetadataDriver {

    private PostGreParameter postGreParameter;

    public PostGreMetadataDriver(CollectDataSourceEnum catalogSchemaType,
            PostGreParameter postGreParameter) {
        super(catalogSchemaType,postGreParameter.getCatalog(),postGreParameter.getSchema());

        this.postGreParameter = postGreParameter;
    }

    @Override
    public void createConnection() throws SQLException, ClassNotFoundException {
        StringBuilder builder = new StringBuilder();
        builder.append("jdbc:postgresql://");
        builder.append(postGreParameter.getIp());
        builder.append(':');
        builder.append(postGreParameter.getPort());
        builder.append('/');
        builder.append(postGreParameter.getCatalog());

        getConnection(builder.toString(),postGreParameter.getUsername(),
                postGreParameter.getPassword());
    }

    @Override
    public RelationalMetadataAdapter getSchemaCapacity() throws SQLException {

        String sql = "select round(sum(obj_size)/(1024*1024*1024),2) as schemaCapacity from " +
                "\n" +
                "(select table_schema,pg_table_size('\"' || table_name || '\"') as obj_size \n" +
                "from information_schema.tables where table_schema=?) t GROUP BY table_schema";
        ps = conn.prepareStatement(sql);

        ps.setString(1,postGreParameter.getSchema());

        rs = ps.executeQuery();

        while (rs.next()) {
            this.catalogSchemaMeta.setCapacity(rs.getDouble("schemaCapacity"));
        }

        return this;
    }

    @Override
    public RelationalMetadataAdapter getTableCapacity() throws SQLException {
        String sql = "select table_name as tableName,round(sum(obj_size)/(1024*1024),2) as " +
                "tableCapacity from \n" +
                "(select table_name,pg_table_size('\"' || table_name || '\"') as obj_size \n" +
                "from information_schema.tables where table_schema=? ) t GROUP BY " +
                "table_name";
        ps = conn.prepareStatement(sql);

        ps.setString(1,postGreParameter.getSchema());

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
        String sql = "select viewname as viewName,definition as viewDefinition from pg_views where schemaname=?";

        ps = conn.prepareStatement(sql);

        ps.setString(1,postGreParameter.getSchema());

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
    private Connection getConnection(String url,String username,String password) throws SQLException, ClassNotFoundException {
        Class.forName("org.postgresql.Driver");

        conn = DriverManager.getConnection(url,username,password);

        return conn;

    }
}
