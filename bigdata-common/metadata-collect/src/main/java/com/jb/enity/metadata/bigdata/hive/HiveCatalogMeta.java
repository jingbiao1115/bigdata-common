package com.jb.enity.metadata.bigdata.hive;

import com.jb.enity.metadata.DataSourceBase;
import com.jb.enity.metadata.bigdata.hive.table.HiveTableMeta;
import com.jb.enity.metadata.bigdata.hive.table.HiveViewMeta;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.List;

/**
 * @author zhaojb
 * Hive数据库对象
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class HiveCatalogMeta extends DataSourceBase {
    /**
     * 数据库地址
     */
    private String dbLocation;

    /**
     * 数据库描述
     */
    private String dbDescription;

    /**
     * 内部表数量
     */
    private Integer managedTableNum;


    /**
     * 外部表数量
     */
    private Integer externalTableNum;

    /**
     * 数据库视图数量
     */
    private Integer dbViewNum;

    /**
     * 数据库容量大小
     */
    private Double capacity;

    /**
     * 表信息
     */
    private List<HiveTableMeta> tableMetas;

    /**
     * 视图信息
     */
    private List<HiveViewMeta> viewMetas;


}
