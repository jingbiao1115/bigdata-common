package com.jb.enity.metadata.hadoop.hbase.phoenix;

import lombok.Data;

import java.util.List;

/**
 * @author zhaojb
 * Phoenix HBase视图信息
 */
@Data
public class PhoenixHBaseViewMeta {

    /**
     * 视图名
     */
    private String  viewName;

    /**
     * 视图字段数
     */
    private Integer viewFieldNum;

    /**
     * 视图容量大小
     */
    private Double viewCapacity;

    /**
     * 字段
     */
    private List<PhoenixHBaseViewColumnMeta> columns;

}
