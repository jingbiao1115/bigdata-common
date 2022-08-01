package com.jb.enity.metadata.hadoop.hbase.phoenix;

import lombok.Data;

/**
 * @author zhaojb
 * Phoenix HBase字段信息
 */
@Data
public class PhoenixHBaseViewColumnMeta {

    /**
     * 列族名
     */
    protected String  columnFamilyName;

    /**
     * 字段名
     */
    protected String  fieldName;

    /**
     * 字段类型
     */
    protected String fieldType;

    /**
     * 字段大小
     */
    protected Integer fieldSize;

    /**
     * 小数点
     */
    protected Integer fieldDigits;


}
