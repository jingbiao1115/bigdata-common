package com.jb.enity.metadata.hadoop.hive.column;

import lombok.Data;

@Data
public class HiveViewColumnMeta {

    /**
     * 字段名
     */
    protected String fieldName;

    /**
     * 字段类型
     */
    protected String fieldType;

    /**
     * 字段描述
     */
    protected String fieldNotes;
}
