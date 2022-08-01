package com.jb.enity.parameter.relational;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author zhaojb
 * 关系型数据库请求参数
 */
@Data
public class CommonParameter {
    /**
     * 连接数据库IP
     */
    @NotBlank(message = "IP不能为空")
    protected String ip;

    /**
     * 连接数据库port
     */
    @NotNull(message = "port不能为空")
    protected Integer port;

    /**
     * 连接数据库账号
     */
    @NotBlank(message = "账号不能为空")
    protected String username;

    /**
     * 连接数据库密码
     */
    @NotBlank(message = "密码不能为空")
    protected String password;
}
