package com.jb.enity.metadata.bigdata.hbase.phoenix;

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
     * 表字段
     */
    private List<PhoenixHBaseColumnMeta> columns;

}
