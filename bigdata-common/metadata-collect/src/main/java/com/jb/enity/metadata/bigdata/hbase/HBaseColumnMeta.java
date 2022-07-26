package com.jb.enity.metadata.bigdata.hbase;

import lombok.Data;

import java.util.List;

/**
 * @author zhaojb
 * HBase列族
 */
@Data
public class HBaseColumnMeta {

    /**
     * 列族名
     */
    private String columnFamilyName;

    /**
     * 列族最大版本
     */
    private Integer columnFamilyMaxVersion;

    /**
     * 列族最小版本
     */
    private Integer columnFamilyMinVersion;

    /**
     * 列限定符
     */
    private List<HBaseQualifierMeta> qualifiers;


}
