package com.jb.enity.metadata.bigdata.hbase.phoenix;

import lombok.Data;

import java.util.List;

/**
 * @author zhaojb
 * Phoenix HBase表信息
 */
@Data
public class PhoenixHBaseTableMeta {

    /**
     * 表名
     */
    private String  tableName;

    /**
     * 表注释
     */
    private String tableComment;

    /**
     * 表字段数
     */
    private Integer tableFieldNum;

    /**
     * 建表语句
     */
    private String  createTableInfo;

    /**
     * 表容量大小
     */
    private Double tableCapacity;

    /**
     * 表字段
     */
    private List<PhoenixHBaseColumnMeta> columns;

}
