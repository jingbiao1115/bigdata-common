package com.jb.enity.metadata.bigdata.hbase;

import lombok.Data;

import java.util.List;

/**
 * @author zhaojb
 * HBase表信息
 */
@Data
public class HBaseTableMeta {

    /**
     * 表名
     */
    private String tableName;

    /**
     * 表容量大小
     */
    private Double tableCapacity;

    /**
     * 最大文件大小
     */
    private Long maxFileSize;

    /**
     * 数据刷写大小
     */
    private Long memStoreFlushSize;

    /**
     * region副本数
     */
    private Integer regionReplication;

    /**
     * 是否启用
     */
    private Boolean isEnabled;

    /**
     * 表列族数
     */
    private Integer tableColumnFamilyNum;

    /**
     * 表列族(字段)
     */
    private List<HBaseColumnMeta> columns;

}
