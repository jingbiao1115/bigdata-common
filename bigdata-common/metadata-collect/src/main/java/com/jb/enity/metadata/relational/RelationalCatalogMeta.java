package com.jb.enity.metadata.relational;

import com.jb.enity.metadata.DataSourceBase;
import com.jb.enity.metadata.relational.table.TableMeta;
import com.jb.enity.metadata.relational.table.ViewMeta;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.util.List;

/**
 * @author zhaojb
 * 关系型数据库
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class RelationalCatalogMeta extends DataSourceBase {

    /**
     * 数据库表数量
     */
    private Integer tableNum;

    /**
     * 数据库视图数量
     */
    private Integer viewNum;

    /**
     * 存储过程数量
     * private Integer dbStoredNum;
     */
//    private Integer dbProcedureNum;

    /**
     * 数据库容量大小
     */
    private Double capacity;

    /**
     * 表信息
     */
    private List<TableMeta> tableMetas;

    /**
     * 视图信息
     */
    private List<ViewMeta> viewMetas;

}
