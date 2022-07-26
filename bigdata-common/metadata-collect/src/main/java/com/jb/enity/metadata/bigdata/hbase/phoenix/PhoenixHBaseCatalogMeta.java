package com.jb.enity.metadata.bigdata.hbase.phoenix;

import com.jb.enity.metadata.DataSourceBase;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.List;
/**
 * @author zhaojb
 * Phoenix HBase数据库信息
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class PhoenixHBaseCatalogMeta extends DataSourceBase {

    /**
     * 数据库容量大小
     */
    private Double capacity;

    private Integer dbTableNum;

    /**
     * 表信息
     */
    private List<PhoenixHBaseTableMeta> tableMetas;

    private Integer dbViewNum;

    /**
     * 视图信息
     */
    private List<PhoenixHBaseViewMeta>  viewMetas;

}
