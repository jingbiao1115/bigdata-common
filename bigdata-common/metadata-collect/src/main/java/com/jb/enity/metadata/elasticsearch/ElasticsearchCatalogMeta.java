package com.jb.enity.metadata.elasticsearch;

import com.jb.enity.metadata.elasticsearch.index.ElasticsearchIndexMeta;
import com.jb.enums.CollectDataSourceEnum;
import lombok.Data;

import java.util.List;

@Data
public class ElasticsearchCatalogMeta {

    /**
     * 数据库类型
     */
    private CollectDataSourceEnum collectDataSource;

    /**
     * host地址
     */
    private String esHost;

    /**
     * 用户名
     */
    private String username;


    /**
     * 密码
     */
    private String password;

    /**
     * 索引
     */
    private List<ElasticsearchIndexMeta> indexMetas;

    /**
     * 索引数量
     */
    private Integer indexNum;

    /**
     * 容量
     */
    private Double capacity;

}
