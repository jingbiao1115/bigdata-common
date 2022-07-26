package com.jb.adapter.bigdata;

import com.jb.adapter.bigdata.impl.HBaseMetadataDriver;

import java.util.List;

/**
 * @author zhaojb
 * HBase元数据采集适配
 */
public interface IHBaseMetadataDriver extends IHadoopMetadataDriver<HBaseMetadataDriver>{

    /**
     * 表信息
     */
    HBaseMetadataDriver getTables(List<String> tableNames) throws Exception;

}
