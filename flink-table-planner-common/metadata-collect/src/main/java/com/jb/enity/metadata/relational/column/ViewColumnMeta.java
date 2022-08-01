package com.jb.enity.metadata.relational.column;

import lombok.Data;

/**
 * @author zhaojb
 * 字段信息
 */
@Data
public class ViewColumnMeta {
    /**
     * 字段名
     */
    protected String fieldName;

    /**
     * 字段类型
     */
    protected String fieldType;

    /**
     * 字段长度
     */
    protected Integer fieldSize;
    /**
     * 小数点
     */
    protected Integer fieldDigits;

    /**
     * 是否可为空
     * true-可为空
     * false-不可为空
     */
    protected String fieldIsNullable;

    /**
     * 字段描述
     */
    protected String fieldNotes;

    /**
     * 默认值
     */
    protected String fieldDef;
}
