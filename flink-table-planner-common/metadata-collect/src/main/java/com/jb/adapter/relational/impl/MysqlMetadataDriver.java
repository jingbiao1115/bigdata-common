package com.jb.adapter.relational.impl;

import com.jb.enity.metadata.relational.table.TableMeta;
import com.jb.enity.metadata.relational.table.ViewMeta;
import com.jb.enity.parameter.relational.MysqlParameter;
import com.jb.enums.CollectDataSourceEnum;
import com.jb.adapter.relational.ICatalogSchemaMetadataDriver;
import com.jb.adapter.relational.RelationalMetadataAdapter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author zhaojb
 * 关系型数据库元数据采集适配器-MySQL
 */

public class MysqlMetadataDriver extends RelationalMetadataAdapter implements ICatalogSchemaMetadataDriver {

    private static final String MYSQL_REQUEST_URL = "?useUnicode=true&characterEncoding=utf8" +
            "&zeroDateTimeBehavior=convertToNull&useSSL=false";


    private MysqlParameter mysqlParameter;

    public MysqlMetadataDriver(CollectDataSourceEnum catalogSchemaType,MysqlParameter mysqlParameter)  {

        super(catalogSchemaType,mysqlParameter.getCatalog(),null);

        this.mysqlParameter = mysqlParameter;
    }


    @Override
    public void createConnection() throws SQLException, ClassNotFoundException {

        StringBuilder builder = new StringBuilder();
        builder.append("jdbc:mysql://");
        builder.append(mysqlParameter.getIp());
        builder.append(':');
        builder.append(mysqlParameter.getPort());
        builder.append('/');
        builder.append(mysqlParameter.getCatalog());
        builder.append(MYSQL_REQUEST_URL);

        //获取连接
        getConnection(builder.toString(),mysqlParameter.getUsername(),
                mysqlParameter.getPassword());
    }


    /**
     * 连接数据库
     */
    private Connection getConnection(String url,String username,String password) throws SQLException,
            ClassNotFoundException {

        Class.forName("com.mysql.cj.jdbc.Driver"); //执行驱动

        this.conn = DriverManager.getConnection(url,username,password); //获取连接
        this.conn.setAutoCommit(false);
        return this.conn;

    }


    /**
     * 获取数据库容量大小
     */
    @Override
    public RelationalMetadataAdapter getSchemaCapacity() throws SQLException {
        String sql = "select round(sum(data_length)/(1024*1024),2) + round(sum(index_length)/" +
                "(1024*1024),2) as schemaCapacity  from information_schema.tables where " +
                "table_schema=?";
        ps = conn.prepareStatement(sql);

        ps.setString(1,mysqlParameter.getCatalog());

        rs = ps.executeQuery();

        while (rs.next()){
            this.catalogSchemaMeta.setCapacity(rs.getDouble("schemaCapacity"));
        }

        return this;
    }

    /**
     * 获取表容量大小
     */
    @Override
    public RelationalMetadataAdapter getTableCapacity() throws SQLException {
        String sql = "select table_schema as dbName,table_name as tableName,round(data_length/" +
                "(1024),2)+round(index_length/(1024),2) as tableCapacity from information_schema" +
                ".tables where table_schema=? and table_type='BASE TABLE'";

        ps = conn.prepareStatement(sql);

        ps.setString(1,mysqlParameter.getCatalog());

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

    /**
     * 获取视图definition
     */
    @Override
    public RelationalMetadataAdapter getViewDefinition() throws SQLException {
        String sql = "select table_schema ,table_name as viewName,view_definition as " +
                "viewDefinition from " +
                "information_schema.views where table_schema =?";

        ps = conn.prepareStatement(sql);

        ps.setString(1,mysqlParameter.getCatalog());

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


}
