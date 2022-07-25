package com.jb.model.parameter;

/**
 * @author zhaojb
 * 响应方使用发起方的参数计算KDF
 */
public class SM9ExchangeResponderKdfParameter {

    /**
     * 发起方ID
     */
    private String idA;

    /**
     * 发起方R
     */
    private String stringRA;

    /**
     * 响应方ID
     */
    private String idB;

    /**
     * 共享密钥长度
     */
    private int kLen;


    public String getIdA() {
        return idA;
    }

    public void setIdA(String idA) {
        this.idA = idA;
    }

    public String getStringRA() {
        return stringRA;
    }

    public void setStringRA(String stringRA) {
        this.stringRA = stringRA;
    }

    public String getIdB() {
        return idB;
    }

    public void setIdB(String idB) {
        this.idB = idB;
    }

    public int getkLen() {
        return kLen;
    }

    public void setkLen(int kLen) {
        this.kLen = kLen;
    }
}
