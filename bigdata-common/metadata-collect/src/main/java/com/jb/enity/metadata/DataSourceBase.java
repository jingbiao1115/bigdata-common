package com.jb.enity.metadata;

import com.jb.enums.CollectDataSourceEnum;
import lombok.Data;

/**
 * @author zhaojb
 */
@Data
public class DataSourceBase {
    /**
     * 数据库类型
     */
    protected CollectDataSourceEnum collectDataSource;

    /**
     * 数据库名称或实例或命名空间
     */
    protected String catalog;

    /**
     * 数据库模式
     */
    protected String schema;

}
