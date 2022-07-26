package com.jb.enity.metadata.bigdata.hbase.phoenix;

import lombok.Data;

/**
 * @author zhaojb
 * Phoenix HBase字段信息
 */
@Data
public class PhoenixHBaseColumnMeta {

    /**
     * 列族名
     */
    private String  columnFamilyName;

    /**
     * 字段名
     */
    private String  fieldName;

    /**
     * 字段类型
     */
    private String fieldType;

    /**
     * 字段大小
     */
    private Integer fieldSize;

    /**
     * 小数点
     */
    protected Integer fieldDigits;
}
