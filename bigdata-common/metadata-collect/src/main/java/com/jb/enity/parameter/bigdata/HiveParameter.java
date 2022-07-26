package com.jb.enity.parameter.bigdata;

import com.jb.enity.parameter.IParameter;
import com.jb.enity.parameter.relational.CommonParameter;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.validation.constraints.NotBlank;

/**
 * @author zhaojb
 * Hive请求参数
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class HiveParameter extends CommonParameter implements IParameter {
    @NotBlank(message = "thriftUrl不能为空")
    private String thriftUrl;

    @NotBlank(message = "数据库不能为空")
    private String catalog;
}
