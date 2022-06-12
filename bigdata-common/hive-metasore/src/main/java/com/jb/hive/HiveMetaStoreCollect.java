package com.jb.hive;

import org.apache.hadoop.hive.conf.HiveConf;
import org.apache.hadoop.hive.metastore.HiveMetaStoreClient;
import org.apache.hadoop.hive.metastore.api.Database;
import org.apache.hadoop.hive.metastore.api.MetaException;
import org.apache.hadoop.hive.metastore.api.Table;
import org.apache.thrift.TException;

import java.util.List;

public class HiveMetaStoreCollect {

    private  HiveMetaStoreClient client;

    /**
     * 创建Hive元数据连接
     * @param hiveMetastoreUris hive元数据连接地址
     * @return
     * @throws MetaException
     */
    public static HiveMetaStoreCollect createHiveMetastoreConnect(String hiveMetastoreUris) throws MetaException {

        HiveConf hiveConf = new HiveConf();
        hiveConf.set("hive.metastore.uris",hiveMetastoreUris);

        return new HiveMetaStoreCollect(new HiveMetaStoreClient(hiveConf));
    }

    public HiveMetaStoreCollect(HiveMetaStoreClient  client) {
        this.client = client;
    }

    /**
     * 获取Hive全部数据库
     * @return
     * @throws MetaException
     */
    public List<String > getAllDatabases() throws MetaException {
        return this.client.getAllDatabases();
    }

    /**
     * 获取指定Hive的数据库信息
     * @param dbname
     * @return
     * @throws TException
     */
    public Database getDatabase(String dbname) throws TException {
        return this.client.getDatabase(dbname);
    }

    /**
     * 获取指定Hive数据库下的全部表
     * @param dbname
     * @return
     */
    public List<String > getAllTables(String dbname) throws MetaException {
        return this.client.getAllTables(dbname);
    }

    /**
     * 获取指定Hive数据库及表的表信息
     * @param dbName
     * @param tableName
     * @return
     * @throws TException
     */
    public Table getTable(String dbName, String tableName) throws TException {
        return this.client.getTable(dbName,tableName);
    }


}
