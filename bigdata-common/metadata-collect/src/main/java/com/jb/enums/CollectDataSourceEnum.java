package com.jb.enums;

/**
 * @author zhaojb
 */
public enum CollectDataSourceEnum {

    /**
     * 关系型数据库采集变量,0-80
     */
    MYSQL(0, "mysql"),
    SQL_SERVER(1, "sqlserver"),
    ORACLE(2, "oracle"),
    POSTGRESQL(3, "postgre"),
    KINGBASE(4, "kingbase"),
    GBASE(5, "gbase"),
    GREEN_PLUM(6, "greenplum"),

    /**
     * 消息队列采集变量,81-100
     */
    KAFKA(81, "Kafka"),

    /**
     * 大数据Hadoop生态组件采集变量,101-120
     */
    HIVE(101, "Hive"),
    HBASE(102, "HBase"),
    PHOENIX_HBASE(103, "Phoenix for HBase"),

    /**
     * 其他大数据采集变量,121-150
     */
    ELASTIC_SEARCH(121, "Elasticsearch"),
    ;


    private final Integer code;
    private final String msg;

    CollectDataSourceEnum(final int code, final String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

}
