package com.jb.enums;


/**
 * @author zhaojb
 */
public enum TableTypeEnum {

    /**
     * 表类型
     */
    TABLE(0, "table"),
    VIEW(1, "view");


    private final Integer code;
    private final String msg;

    TableTypeEnum(final int code, final String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }


}
