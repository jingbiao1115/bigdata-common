package com.jb.adapter.relational.impl;

import com.jb.adapter.relational.ICatalogSchemaMetadataDriver;
import com.jb.adapter.relational.RelationalMetadataAdapter;
import com.jb.enity.metadata.relational.table.TableMeta;
import com.jb.enity.metadata.relational.table.ViewMeta;
import com.jb.enity.parameter.relational.GBaseParameter;
import com.jb.enums.CollectDataSourceEnum;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author zhaojb
 * 关系型数据库元数据采集适配器-GBase
 */

public class GBaseMetadataDriver extends RelationalMetadataAdapter implements ICatalogSchemaMetadataDriver {


    private static final String REQUEST_URL = "DB_LOCALE=en_US.819;";

    private GBaseParameter gBaseParameter;

    public GBaseMetadataDriver(CollectDataSourceEnum catalogSchemaType,
                               GBaseParameter gBaseParameter) {

        super(catalogSchemaType,gBaseParameter.getCatalog(),gBaseParameter.getSchema());

        this.gBaseParameter = gBaseParameter;
    }


    @Override
    public void createConnection() throws SQLException, ClassNotFoundException {
        StringBuilder builder = new StringBuilder();
        builder.append("jdbc:gbasedbt-sqli://");
        builder.append(gBaseParameter.getIp());
        builder.append(':');
        builder.append(gBaseParameter.getPort());
        builder.append('/');
        builder.append(gBaseParameter.getSchema());
        builder.append(":GBASEDBTSERVER=");
        builder.append(gBaseParameter.getCatalog());
        builder.append(';');
        builder.append(REQUEST_URL);

        getConnection(builder.toString(),gBaseParameter.getUsername(),gBaseParameter.getPassword());
    }

    @Override
    public RelationalMetadataAdapter getSchemaCapacity() throws SQLException {
        String sql = "select dbsname as dbName,round(sum(size)*2/(1024*1024),2) as " +
                "schemaCapacity  from sysmaster:sysextents where dbsname=? group by dbsname";
        ps = conn.prepareStatement(sql);

        ps.setString(1,gBaseParameter.getSchema());

        rs = ps.executeQuery();

        while (rs.next()) {
            this.catalogSchemaMeta.setCapacity(rs.getDouble("schemaCapacity"));
        }

        return this;
    }

    @Override
    public RelationalMetadataAdapter getTableCapacity() throws SQLException {
        String sql = "select dbsname,tabname as tableName,round(sum(size)*2/1024,2) as " +
                "tableCapacity " +
                "from sysmaster:sysextents where dbsname=? and tabname[1,3] <> 'sys' group by 1,2" +
                " order by 3 desc";

        ps = conn.prepareStatement(sql);

        ps.setString(1,gBaseParameter.getSchema());

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

        String sql = "select t1.viewName,t2.seqno,t2.viewtext,t3.c\n" +
                "from \n" +
                "(select tabname as viewName,tabid from systables where tabtype='V') t1\n" +
                "left join\n" +
                "(select * from sysviews where tabid >99) t2\n" +
                "on t1.tabid = t2.tabid \n" +
                "left join\n" +
                "(select tabid,count(*) as c  from sysviews where tabid >99 group by tabid) t3\n" +
                "on \n" +
                "t1.tabid = t3.tabid\n" +
                "order by t1.tabid,t2.seqno asc";

        ps = conn.prepareStatement(sql);

        rs = ps.executeQuery();

        String viewText = "";
        while (rs.next()) {
            String viewName = rs.getString("viewName");

            int seqno = rs.getInt("seqno");
            int c = rs.getInt("c");

            viewText = viewText + rs.getString("viewText");
            if (c == seqno + 1) {

                for (ViewMeta view: viewMetas) {
                    if (viewName.equals(view.getViewName())) {
                        view.setViewDefinition(viewText);
                        break;
                    }
                }
                viewText = "";
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
        Class.forName("com.gbasedbt.jdbc.Driver");

        conn = DriverManager.getConnection(url,username,password);

        return conn;
    }

}
