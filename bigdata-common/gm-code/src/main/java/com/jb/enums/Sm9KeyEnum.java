package com.jb.enums;

/**
 * @author zhaojb
 * SM9密钥类型
 */
public enum Sm9KeyEnum {
    /**
     * 主密钥对
     */
    MASTER_KEY_PAIR(0,"masterKeyPair"),
    /**
     * 主私钥
     */
    MASTER_PRIVATE_KEY(1,"masterPrivateKey"),
    /**
     * 用户私钥
     */
    USER_PRIVATE_KEY(2,"userPrivateKey"),
    /**
     * 主密钥
     */
    MASTER_PUBLIC_KEY(3,"masterPublicKey");

    private final Integer code;
    private final String msg;

    Sm9KeyEnum(final int code,final String msg) {
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
