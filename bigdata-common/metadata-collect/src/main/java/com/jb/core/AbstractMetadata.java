package com.jb.core;


import com.jb.enity.parameter.IParameter;
import com.jb.enums.CollectDataSourceEnum;
import com.jb.enums.TableTypeEnum;

import java.util.List;


/**
 * @author zhaojb
 * 元数据采集适配接口
 */
public interface AbstractMetadata<T> {
    /**
     * 初始化参数
     */
    void init(CollectDataSourceEnum catalogSchemaType,IParameter parameter);

    /**
     * 数据源信息
     */
    T getSchema(CollectDataSourceEnum collectDataSource,IParameter parameter);

    /**
     * 表/视图/字段信息
     */
    T getTables(TableTypeEnum tableType,List<String> tableNames);

    /**
     * 所有表/视图名
     */
    List<String > getAllTables(TableTypeEnum tableType);

}
