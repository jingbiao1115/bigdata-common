package com.jb.enity.metadata.bigdata.hbase;

import lombok.Data;

/**
 * @author zhaojb
 * HBase限定符
 */
@Data
public class HBaseQualifierMeta {
    /**
     * 限定符名
     */
    private String qualifierName;

    /**
     * 限定符类型
     */
    private String qualifierType;
}
