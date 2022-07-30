package com.jb.enity.metadata.elasticsearch.index;

import com.jb.enity.metadata.elasticsearch.index.properties.ElasticsearchPropertiesMeta;
import lombok.Data;

import java.util.List;

/**
 * @author zhaojb
 */
@Data
public class ElasticsearchIndexMeta {

    /**
     * 索引名称
     */
    private String index;

    /**
     * 索引健康状态
     */
    private String indexHealth;

    /**
     * 索引开启状态
     */
    private String indexStatus;

    /**
     * 索引uuid
     */
    private String indexUuid;

    /**
     * 索引主分片数量
     */
    private Integer indexPri;

    /**
     * 索引复制分片数量
     */
    private Integer indexRep;

    /**
     * 索引文档数量
     */
    private Integer indexDocCount;

    /**
     * 索引主分片+复制分片的大小
     */
    private Double indexCapacity;

    /**
     * 字段
     */
    private List<ElasticsearchPropertiesMeta> properties;
}
