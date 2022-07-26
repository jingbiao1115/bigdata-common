package com.jb.adapter.relational.impl;

import com.jb.enity.metadata.relational.table.TableMeta;
import com.jb.enity.metadata.relational.table.ViewMeta;
import com.jb.enity.parameter.relational.OracleParameter;
import com.jb.enums.CollectDataSourceEnum;
import com.jb.adapter.relational.ICatalogSchemaMetadataDriver;
import com.jb.adapter.relational.RelationalMetadataAdapter;
import oracle.jdbc.OracleConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Locale;

/**
 * @author zhaojb
 * 关系型数据库元数据采集适配器-Oracle
 */
public class OracleMetadataDriver extends RelationalMetadataAdapter implements ICatalogSchemaMetadataDriver {

    private OracleParameter oracleParameter;

    public OracleMetadataDriver(CollectDataSourceEnum catalogSchemaType,
            OracleParameter oracleParameter) {
        super(catalogSchemaType,oracleParameter.getCatalog(),oracleParameter.getSchema());

        this.oracleParameter = oracleParameter;
    }

    @Override
    public void createConnection() throws SQLException, ClassNotFoundException {

        StringBuilder builder = new StringBuilder();
        builder.append("jdbc:oracle:thin:@");
        builder.append(oracleParameter.getIp());
        builder.append(':');
        builder.append(oracleParameter.getPort());
        builder.append(':');
        builder.append(oracleParameter.getCatalog());

        getConnection(builder.toString(),oracleParameter.getUsername(),
                oracleParameter.getPassword());
    }

    @Override
    public RelationalMetadataAdapter getSchemaCapacity() throws SQLException {
        String sql = "select owner as modeName,round(sum(bytes)/(1024*1024*1024),2) as " +
                "schemaCapacity " +
                "from SYS.dba_segments where owner=? group by owner";

        ps = conn.prepareStatement(sql);
        ps.setString(1,oracleParameter.getSchema());

        while (rs.next()) {
            this.catalogSchemaMeta.setCapacity(rs.getDouble("schemaCapacity"));
        }


        return this;
    }

    @Override
    public RelationalMetadataAdapter getTableCapacity() throws SQLException {
        String sql = "select t2.tableName,t2.tableCapacity from \n" +
                "(select object_name from SYS.DBA_OBJECTS where owner=? AND " +
                "OBJECT_TYPE='TABLE') t1\n" +
                "left join \n" +
                "(SELECT SEGMENT_NAME as tableName             \n" +
                "      ,ROUND(SUM(BYTES)/(1024*1024), 2) as  tableCapacity\n" +
                "FROM DBA_SEGMENTS\n" +
                "WHERE  SEGMENT_TYPE='TABLE'\n" +
                "    AND owner=? \n" +
                "GROUP BY SEGMENT_NAME) t2\n" +
                "on t1.object_name=t2.tableName";

        ps = conn.prepareStatement(sql);

        ps.setString(1,oracleParameter.getSchema().toUpperCase(Locale.ROOT));
        ps.setString(2,oracleParameter.getSchema().toUpperCase(Locale.ROOT));

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
        String sql = "select view_name as viewName,text as viewDefinition from SYS.DBA_VIEWS " +
                "where owner=?";

        ps = conn.prepareStatement(sql);

        ps.setString(1,oracleParameter.getSchema());

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

        conn = DriverManager.getConnection(url,username,password);
        ((OracleConnection)conn).setRemarksReporting(true);

        return conn;
    }
}
