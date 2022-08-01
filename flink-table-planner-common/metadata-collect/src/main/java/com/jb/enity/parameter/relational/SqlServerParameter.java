package com.jb.enity.parameter.relational;

import com.jb.enity.parameter.IParameter;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.validation.constraints.NotBlank;

/**
 * @author zhaojb
 * PostGre请求参数
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class SqlServerParameter extends CommonParameter implements IParameter {

    @NotBlank(message = "数据库不能为空")
    private String catalog;

    private String schema;
}
