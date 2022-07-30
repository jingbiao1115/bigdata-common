package com.jb.adapter.hadoop;


import com.jb.adapter.hadoop.impl.PhoenixHBaseMetadataDriver;

import java.util.List;


/**
 * @author zhaojb
 * Phoenix HBase元数据采集适配
 */
public interface IPhoenixHBaseMetadataDriver extends IHadoopMetadataDriver<PhoenixHBaseMetadataDriver>{
    /**
     * 表信息
     */
    PhoenixHBaseMetadataDriver getTables(List<String> tableNames) throws Exception;

    /**
     * 视图信息
     */
    PhoenixHBaseMetadataDriver getViews(List<String> viewNames) throws Exception;

}
