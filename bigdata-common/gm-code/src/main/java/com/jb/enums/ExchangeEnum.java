package com.jb.enums;

/**
 * @author zhaojb
 * 密钥交换类型
 */
public enum ExchangeEnum {

    INITIATOR(0,"initiator"),
    RESPONDER(1,"responder");

    private int code ;
    private String msg;

    ExchangeEnum(int code,String msg) {
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
