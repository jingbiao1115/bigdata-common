package com.jb.enity.metadata.hadoop.hbase;

import com.jb.enity.metadata.DataSourceBase;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.List;

/**
 * @author zhaojb
 * HBase
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class HBaseCatalogMeta extends DataSourceBase {

    /**
     * 数据库容量大小
     */
    private Double capacity;

    private Integer dbTableNum;

    /**
     * 表信息
     */
    private List<HBaseTableMeta> tableMetas;

}
