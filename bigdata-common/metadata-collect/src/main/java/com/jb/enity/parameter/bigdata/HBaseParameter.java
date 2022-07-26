package com.jb.enity.parameter.bigdata;

import com.jb.enity.parameter.IParameter;
import lombok.Data;

import javax.validation.constraints.NotBlank;

/**
 * @author zhaojb
 * HBase请求参数
 */
@Data
public class HBaseParameter implements IParameter {

    /**
     * hdfs地址,指定HBase数据库的路径
     */
    @NotBlank(message = "hdfsUrl不能为空")
    private String hdfsUrl;

    /**
     * HBase在hdfs的地址
     */
    @NotBlank(message = "rootDir不能为空")
    private String rootDir;

    /**
     * HBase在zookeeper的地址
     */
    @NotBlank(message = "zNodeParent不能为空")
    private String zNodeParent;

    /**
     * zookeeper地址
     */
    @NotBlank(message = "quorum不能为空")
    private String quorum;

    /**
     * zookeeper端口
     */
    @NotBlank(message = "clientPort不能为空")
    private Integer clientPort;

    /**
     * 数据库名
     */
    @NotBlank(message = "catalog不能为空")
    private String catalog;

    private String username;

    private String password;
}
