package com.jb.hive;

import org.apache.flink.table.api.TableEnvironment;
import org.apache.flink.table.api.TableResult;
import org.apache.flink.table.catalog.hive.HiveCatalog;
import org.apache.hadoop.hive.conf.HiveConf;

/**
 * @author zhaojb
 * HiveTable
 */
public class HiveTable {
    private final TableEnvironment env;

    private HiveTable(TableEnvironment env) {
        this.env = env;
    }

    /**
     * 创建HiveCatalog
     * @param catalogName 自定义FlinkTable catalogName
     * @param database  Hive数据库
     * @param hiveConfDir   Hive-site.xml目录
     * @return
     */
    public static HiveCatalog createHiveCatalog(String catalogName,String database,
            String hiveConfDir) {

        return new HiveCatalog(catalogName,database,hiveConfDir);
    }

    /**
     * 创建HiveCatalog
     * @param catalogName 自定义FlinkTable catalogName
     * @param database Hive数据库
     * @param hiveMetastoreUris hive元数据metastore地址
     * @param hiveVersion   hive版本
     * @return
     */
    public static HiveCatalog createHiveCatalog(String catalogName,String database,
            String hiveMetastoreUris,String hiveVersion) {

        HiveConf hiveConf = new HiveConf();
        hiveConf.set("hive.metastore.uris",hiveMetastoreUris);
        return new HiveCatalog(catalogName,database,hiveConf,hiveVersion);
    }

    public static HiveTable builderFlinkTableEnv(TableEnvironment env){
        return new HiveTable(env);
    }
    /**
     * 注册HiveCatalog
     * @param catalogName   自定义FlinkTable catalogName
     * @param catalog HiveCatalog
     */
    public void registerCatalog(String catalogName,
            HiveCatalog catalog){
        env.registerCatalog(catalogName,catalog);
    }

    /**
     * 指定HiveCatalog
     * @param catalogName   自定义FlinkTable catalogName
     */
    public void useCatalog(String catalogName){
        env.useCatalog(catalogName);
    }

    /**
     * 查看所有表
     */
    public void showTables(){
        executeSql("SHOW tables").print();
    }

    /**
     * 查询表
     */
    public void select(){
        executeSql("select * from flink_hive_1").print();
    }

    /**
     * 执行FlinkSQL查询操作
     * @param sql   SQL代码
     * @return
     */
    public TableResult executeSql(String sql){
        return env.executeSql(sql);
    }


}
