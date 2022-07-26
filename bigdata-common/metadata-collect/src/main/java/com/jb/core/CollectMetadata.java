package com.jb.core;


import com.alibaba.fastjson.JSON;
import com.jb.adapter.bigdata.IHBaseMetadataDriver;
import com.jb.adapter.bigdata.IHiveMetadataDriver;
import com.jb.adapter.bigdata.IPhoenixHBaseMetadataDriver;
import com.jb.adapter.bigdata.impl.HBaseMetadataDriver;
import com.jb.adapter.bigdata.impl.HiveMetadataDriver;
import com.jb.adapter.bigdata.impl.PhoenixHBaseMetadataDriver;
import com.jb.adapter.relational.ICatalogSchemaMetadataDriver;
import com.jb.adapter.relational.impl.*;
import com.jb.enity.metadata.bigdata.hbase.HBaseCatalogMeta;
import com.jb.enity.metadata.bigdata.hbase.phoenix.PhoenixHBaseCatalogMeta;
import com.jb.enity.metadata.bigdata.hive.HiveCatalogMeta;
import com.jb.enity.metadata.relational.RelationalCatalogMeta;
import com.jb.enity.parameter.IParameter;
import com.jb.enity.parameter.bigdata.HBaseParameter;
import com.jb.enity.parameter.bigdata.HiveParameter;
import com.jb.enity.parameter.bigdata.PhoenixHBaseParameter;
import com.jb.enity.parameter.relational.*;
import com.jb.enums.CollectDataSourceEnum;

import java.sql.SQLException;
import java.util.List;

public class CollectMetadata {


    public static RelationalCatalogMeta collectMysql() {
        MysqlParameter parameter = new MysqlParameter();
        parameter.setIp("10.10.14.107");
        parameter.setPort(23306);
        parameter.setUsername("root");
        parameter.setPassword("Csii_dev2021");
        parameter.setCatalog("dgmtest1");

        return getAllObjectByRelational(CollectDataSourceEnum.MYSQL,parameter,null,null);
    }

    public static RelationalCatalogMeta collectOracle() {
        OracleParameter parameter = new OracleParameter();
        parameter.setIp("10.10.14.134");
        parameter.setPort(1521);
        parameter.setUsername("c##zhaojb");
        parameter.setPassword("Csii_dev");
        parameter.setCatalog("ORCLCDB");
        parameter.setSchema("c##zhaojb".toUpperCase());

        return getAllObjectByRelational(CollectDataSourceEnum.ORACLE,parameter,null,null);
    }

    public static RelationalCatalogMeta collectSqlServer() {
        SqlServerParameter parameter = new SqlServerParameter();
        parameter.setIp("10.10.14.134");
        parameter.setPort(1433);
        parameter.setCatalog("test1");
        parameter.setUsername("sa");
        parameter.setPassword("q7tQUcinhl");
        parameter.setSchema("dbo");

        return getAllObjectByRelational(CollectDataSourceEnum.SQL_SERVER,parameter,null,null);
    }

    public static RelationalCatalogMeta collectPostGre() {
        PostGreParameter parameter = new PostGreParameter();
        parameter.setIp("10.10.14.134");
        parameter.setPort(5432);
        parameter.setCatalog("postgres");
        parameter.setUsername("postgres");
        parameter.setPassword("q7tQUcinhl");
        parameter.setSchema("public");

        return getAllObjectByRelational(CollectDataSourceEnum.POSTGRESQL,parameter,null,null);
    }

    public static RelationalCatalogMeta collectKingBase() {
        KingBaseParameter parameter = new KingBaseParameter();
        parameter.setIp("10.10.14.134");
        parameter.setPort(54321);
        parameter.setCatalog("BIGDATA");
        parameter.setUsername("SYSTEM");
        parameter.setPassword("Csii_dev");
        parameter.setSchema("PUBLIC");

        return getAllObjectByRelational(CollectDataSourceEnum.KINGBASE,parameter,null,null);
    }

    public static RelationalCatalogMeta collectGBase() {
        GBaseParameter parameter = new GBaseParameter();
        parameter.setCatalog("gbase01");
        parameter.setIp("10.10.14.138");
        parameter.setPort(9088);
        parameter.setUsername("gbasedbt");
        parameter.setPassword("GBase123");
        parameter.setSchema("demo01");

        return getAllObjectByRelational(CollectDataSourceEnum.GBASE,parameter,null,null);
    }



    public static HiveCatalogMeta collectHive() {
        HiveParameter parameter = new HiveParameter();
        parameter.setIp("10.10.14.117");
        parameter.setPort(10000);
        parameter.setUsername("hdfs");
        parameter.setCatalog("db_hive_meta");
        parameter.setThriftUrl("thrift://cmserver-dev.csii.cn:9083");

        return getAllObjectByHive(parameter,null,null);
    }

    public static HBaseCatalogMeta collectHBase() {

        HBaseParameter parameter = new HBaseParameter();
        parameter.setHdfsUrl("hdfs://bigdatanode01-dev.csii.cn:8020/hbase/data/hbase11");
        parameter.setRootDir("hdfs://bigdatanode01-dev.csii.cn:8020/hbase");
        parameter.setZNodeParent("/hbase");
        parameter.setQuorum("bigdatanode01-dev.csii.cn");
        parameter.setClientPort(2181);
        parameter.setCatalog("hbase11");

        return getAllObjectByHBase(parameter,null);
    }

    public static PhoenixHBaseCatalogMeta collectPhoenixHBase(){
        PhoenixHBaseParameter parameter = new PhoenixHBaseParameter();
        parameter.setHdfsUrl("hdfs://bigdatanode01-dev.csii.cn:8020/hbase/data/hbase11");
        parameter.setRootDir("hdfs://bigdatanode01-dev.csii.cn:8020/hbase");
        parameter.setZNodeParent("/hbase");
        parameter.setQuorum("bigdatanode01-dev.csii.cn");
        parameter.setClientPort(2181);
        parameter.setCatalog("SCHEMA1");

        return getAllObjectByPhoenixHBase(parameter,null,null);
    }

    public static void main(String[] args) {
        System.out.println(JSON.toJSON(collectPhoenixHBase()));
    }

    /**
     * 关系型
     *
     * @param collectDataSource
     * @param parameter
     * @param tableNames
     * @param viewNames
     * @return
     */
    public static RelationalCatalogMeta getAllObjectByRelational(
            CollectDataSourceEnum collectDataSource,
            IParameter parameter,List<String> tableNames,List<String> viewNames) {

        ICatalogSchemaMetadataDriver driver = null;

        switch (collectDataSource.getCode()) {
            case 0:
                //mysql
                driver = new MysqlMetadataDriver(collectDataSource,(MysqlParameter)parameter);
                break;
            case 1:
                //sqlserver
                driver = new SqlServerMetadataDriver(collectDataSource,
                                                     (SqlServerParameter)parameter);
                break;
            case 2:
                //oracle
                driver = new OracleMetadataDriver(collectDataSource,(OracleParameter)parameter);
                break;
            case 3:
                //PostGre
                driver = new PostGreMetadataDriver(collectDataSource,
                                                   (PostGreParameter)parameter);
                break;
            case 4:
                //KingBase
                driver = new KingBaseMetadataDriver(collectDataSource,
                                                    (KingBaseParameter)parameter);
                break;
            case 5:
                //GBase
                driver = new GBaseMetadataDriver(collectDataSource,
                                                 (GBaseParameter)parameter);
                break;
            default:
                break;
        }

        try {
            //获取连接
            assert driver != null;
            driver.createConnection();

            //获取元连接
            driver.getMetaData();

            //获取表元数据,字段
            driver.getTables(tableNames).getTableColumns().getPrimaryKeys().getIndexInfos().getCreateTable();

            //获取表容量
            driver.getTableCapacity();

            //获取视图元数据,字段
            driver.getViews(viewNames).getViewColumns();

            //获取视图definition
            driver.getViewDefinition();

            //获取数据库信息
            driver.getSchemaCapacity().getCatalogSchema();

            return driver.getCatalogSchemaMeta();

        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            assert driver != null;
            driver.close();
        }


    }


    /**
     * 消息队列
     */
    public static class Mq {

    }

    /**
     * Hive
     *
     * @param parameter
     * @param tableNames
     * @param viewNames
     * @return
     */
    public static HiveCatalogMeta getAllObjectByHive(
            HiveParameter parameter,List<String> tableNames,List<String> viewNames) {

        IHiveMetadataDriver driver = new HiveMetadataDriver(parameter);

        try {
            //创建连接
            driver.createConnection();

            //获取表,视图,字段,分区,库信息
            return driver.getTables(tableNames).getViews(viewNames).getHadoopCatalogMeta().getHiveCatalogMeta();

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            driver.close();
        }

    }

    public static HBaseCatalogMeta getAllObjectByHBase(HBaseParameter parameter,
                                                       List<String> tableNames) {
        IHBaseMetadataDriver driver = new HBaseMetadataDriver(parameter);

        try {

            //创建连接
            driver.createConnection();

            //获取表,字段,库信息
            return driver.getTables(tableNames).getHadoopCatalogMeta().getHBaseCatalogMeta();

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            driver.close();
        }
    }


    public static PhoenixHBaseCatalogMeta getAllObjectByPhoenixHBase(PhoenixHBaseParameter parameter,List<String> tableNames,List<String> viewNames) {

        IPhoenixHBaseMetadataDriver driver = new PhoenixHBaseMetadataDriver(parameter);

        try {

            //创建连接
            driver.createConnection();

            //获取表,字段,主键,索引信息

            driver.getTables(tableNames).getTableColumns();

            return null;

        }catch (Exception e){
            throw new RuntimeException(e);
        }finally {
            driver.close();
        }

    }

}
