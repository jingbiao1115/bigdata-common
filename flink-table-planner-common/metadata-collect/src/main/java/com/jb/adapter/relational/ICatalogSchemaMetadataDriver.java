package com.jb.adapter.relational;


import com.jb.enity.metadata.relational.RelationalCatalogMeta;

import java.sql.SQLException;
import java.util.List;

/**
 * @author zhaojb
 * 关系型数据库-元数据采集适配
 */
public interface ICatalogSchemaMetadataDriver {

    /**
     * 创建数据库连接
     */
    void createConnection() throws SQLException, ClassNotFoundException;

    /**
     * 连接元数据
     */
    void getMetaData() throws SQLException;

    /**
     * 数据库信息
     */
    RelationalCatalogMeta getCatalogSchemaMeta() ;

    /**
     * 表信息
     */
    RelationalMetadataAdapter getTables(List<String > tableNames)  throws SQLException;

    /**
     * 视图信息
     */
    RelationalMetadataAdapter getViews(List<String > viewNames)  throws SQLException;

    /**
     * 获取数据库容量大小
     */
    RelationalMetadataAdapter getSchemaCapacity() throws SQLException;

    /**
     * 获取表容量大小
     */
    RelationalMetadataAdapter getTableCapacity() throws SQLException;

    /**
     * 获取视图definition
     */
    RelationalMetadataAdapter getViewDefinition() throws SQLException;

    /**
     * 关闭连接
     */
     void close() ;

}
