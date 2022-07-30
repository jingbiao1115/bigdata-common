package com.jb.adapter.hadoop;


/**
 * @author zhaojb
 * Hadoop生态元数据采集适配
 */
public interface IHadoopMetadataDriver<T> {

    /**
     * 创建Hadoop连接
     */
    void createConnection() throws Exception;

    /**
     * 数据库信息
     */
    T getHadoopCatalogMeta() throws Exception;


    /**
     * 关闭Hadoop连接
     */
    void close();
}
