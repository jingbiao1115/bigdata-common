package com.jb.enity.metadata.relational.column;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author zhaojb
 * 表字段
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class TableColumnMeta extends ViewColumnMeta {

    /**
     * 是否为主键
     */
    protected boolean isPk;

    /**
     * 是否为索引字段
     */
    protected boolean isIndex;

}
