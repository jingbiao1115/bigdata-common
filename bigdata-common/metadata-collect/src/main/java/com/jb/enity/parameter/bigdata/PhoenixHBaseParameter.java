package com.jb.enity.parameter.bigdata;

import com.jb.enity.parameter.IParameter;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

/**
 * @author zhaojb
 * Phoenix HBase 请求参数
 */
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class PhoenixHBaseParameter extends HBaseParameter implements IParameter {
}
