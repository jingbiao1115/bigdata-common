package com.jb.enity.metadata.bigdata.hive.column;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class HiveTableColumnMeta extends HiveViewColumnMeta{

    /**
     * 是否分区
     */
    private Boolean isPartition;

    /**
     * 是否分桶
     */
    private Boolean isBucket;
}
