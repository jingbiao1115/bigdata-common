package com.jb.enity.metadata.relational.table;

import com.jb.enity.metadata.relational.column.ViewColumnMeta;
import lombok.Data;

import java.util.List;

/**
 * @author zhaojb
 * 视图信息
 */

@Data
public class ViewMeta {

    /**
     * 视图名称
     */
    protected String viewName;

    /**
     * 视图备注
     */
    protected String viewComment;

    /**
     * 视图定义语句
     */
    protected String viewDefinition;

    /**
     * 视图字段数
     */
    protected Integer viewFieldNum;

    protected List<ViewColumnMeta> columns;
}
