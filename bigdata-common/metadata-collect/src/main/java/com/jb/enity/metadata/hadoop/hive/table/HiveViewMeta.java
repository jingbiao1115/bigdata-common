package com.jb.enity.metadata.hadoop.hive.table;

import com.jb.enity.metadata.hadoop.hive.column.HiveViewColumnMeta;
import lombok.Data;

import java.util.List;

@Data
public class HiveViewMeta {

    /**
     * 视图名称
     */
    private String viewName;

    /**
     * 视图备注
     */
    private String viewComment;

    /**
     * 视图定义语句
     */
    private String viewDefinition;

    /**
     * 视图字段数
     */
    private Integer viewFieldNum;

    /**
     * 字段
     */
    private List<HiveViewColumnMeta> columns;
}
