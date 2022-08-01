package com.jb.enity.metadata.hadoop.hbase.phoenix;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author zhaojb
 * Phoenix HBase字段信息
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class PhoenixHBaseTableColumnMeta extends PhoenixHBaseViewColumnMeta {

    /**
     * 是否主键
     */
    private boolean isPk;

    /**
     * 是否索引字段
     */
    private boolean isIndex;

}
