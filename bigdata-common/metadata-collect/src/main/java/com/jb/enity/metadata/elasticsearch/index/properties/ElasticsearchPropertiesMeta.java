package com.jb.enity.metadata.elasticsearch.index.properties;

import lombok.Data;

/**
 * @author zhaojb
 * ES Properties 字段
 */
@Data
public class ElasticsearchPropertiesMeta {

    /**
     * 字段名称
     */
    private String  fieldName;

    /**
     * 字段类型
     */
    private String fieldType;

    /**
     * 时间字段格式
     */
    private String format;



}
