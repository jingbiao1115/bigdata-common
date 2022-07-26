package com.jb.adapter.bigdata;

import com.jb.adapter.bigdata.impl.HiveMetadataDriver;
import java.util.List;

/**
 * @author zhaojb
 * Hive元数据采集适配
 */
public interface IHiveMetadataDriver extends IHadoopMetadataDriver<HiveMetadataDriver>{
    /**
     * 表信息
     */
    HiveMetadataDriver getTables(List<String> tableNames) throws Exception;

    /**
     * 视图信息
     */
    HiveMetadataDriver getViews(List<String> viewNames) throws Exception;

}
