package com.jb.adapter.relational.impl;

import com.jb.enity.metadata.relational.table.TableMeta;
import com.jb.enity.metadata.relational.table.ViewMeta;
import com.jb.enity.parameter.relational.SqlServerParameter;
import com.jb.enums.CollectDataSourceEnum;
import com.jb.adapter.relational.ICatalogSchemaMetadataDriver;
import com.jb.adapter.relational.RelationalMetadataAdapter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author zhaojb
 * 关系型数据库元数据采集适配器-SqlServer
 */
public class SqlServerMetadataDriver extends RelationalMetadataAdapter implements ICatalogSchemaMetadataDriver {

    private SqlServerParameter sqlServerParameter;

    public SqlServerMetadataDriver(CollectDataSourceEnum catalogSchemaType,
            SqlServerParameter sqlServerParameter) {
        super(catalogSchemaType,sqlServerParameter.getCatalog(),sqlServerParameter.getSchema());

        this.sqlServerParameter = sqlServerParameter;
    }


    @Override
    public void createConnection() throws SQLException, ClassNotFoundException {
        StringBuilder builder = new StringBuilder();
        builder.append("jdbc:sqlserver://");
        builder.append(sqlServerParameter.getIp());
        builder.append(':');
        builder.append(sqlServerParameter.getPort());
        builder.append(";DatabaseName=");
        builder.append(sqlServerParameter.getCatalog());
//        builder.append(";");

        getConnection(builder.toString(),sqlServerParameter.getUsername(),
                sqlServerParameter.getPassword());
    }

    @Override
    public RelationalMetadataAdapter getSchemaCapacity() throws SQLException {
        String sql = "select cast(count(t.tableCapacity)/(1024) as DECIMAL(38,2) ) as " +
                "schemaCapacity\n" +
                "from \n" +
                "(\n" +
                "select t.name as tableName,cast((case when p.reserved_page_count is not null " +
                "then p.reserved_page_count else 0  end)*8.0/(1024) as DECIMAL(38,2)) as " +
                "tableCapacity\n" +
                "from \n" +
                "(select * from sys.schemas where name=?) s\n" +
                "left join\n" +
                "sys.tables t\n" +
                "on s.schema_id=t.schema_id\n" +
                "left join\n" +
                "sys.dm_db_partition_stats p\n" +
                "on \n" +
                "t.object_id = p.object_id\n" +
                ") t";

        ps = conn.prepareStatement(sql);

        ps.setString(1,sqlServerParameter.getSchema());

        rs = ps.executeQuery();

        while (rs.next()) {
            this.catalogSchemaMeta.setCapacity(rs.getDouble("schemaCapacity"));
        }


        return this;
    }

    @Override
    public RelationalMetadataAdapter getTableCapacity() throws SQLException {
        String sql = "select t.name as tableName,cast((case when p.reserved_page_count is not " +
                "null then p.reserved_page_count else 0  end)*8.0/(1024) as DECIMAL(38,2)) as " +
                "tableCapacity\n" +
                "from \n" +
                "(select * from sys.schemas where name=?) s\n" +
                "left join\n" +
                "sys.tables t\n" +
                "on s.schema_id=t.schema_id\n" +
                "left join\n" +
                "sys.dm_db_partition_stats p\n" +
                "on \n" +
                "t.object_id = p.object_id\n";

        ps = conn.prepareStatement(sql);

        ps.setString(1,sqlServerParameter.getSchema());

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
        String sql = "SELECT table_schema as modeName,table_name as viewName,view_definition as " +
                "viewDefinition FROM INFORMATION_SCHEMA.views where table_schema=?";

        ps = conn.prepareStatement(sql);

        ps.setString(1,sqlServerParameter.getSchema());

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
