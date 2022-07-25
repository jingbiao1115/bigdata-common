package com.jb.model.parameter;

import java.math.BigInteger;

/**
 * @author zhaojb
 * 发起方使用响应方的参数计算KDF
 */
public class SM9ExchangeInitiatorKdfParameter {

    /**
     * 发起方id
     */
    private String idA;


    /**
     * 发起方r
     */
    private BigInteger rA;

    /**
     * 发起方R
     */
    private String stringRA;

    /**
     * 响应方id
     */
    private String idB;

    /**
     * 响应方R
     */
    private String stringRB;

    /**
     * 响应方SB
     */
    private String stringSB;

    /**
     * 共享密钥长度
     */
    private int kLen;


    public BigInteger getrA() {
        return this.rA;
    }

    public void setrA(BigInteger rA) {
        this.rA = rA;
    }

    public String getIdA() {
        return this.idA;
    }

    public void setIdA(String idA) {
        this.idA = idA;
    }


    public String getIdB() {
        return this.idB;
    }

    public void setIdB(String idB) {
        this.idB = idB;
    }

    public String getStringRB() {
        return this.stringRB;
    }

    public void setStringRB(String stringRB) {
        this.stringRB = stringRB;
    }

    public String getStringSB() {
        return this.stringSB;
    }

    public void setStringSB(String stringSB) {
        this.stringSB = stringSB;
    }

    public int getkLen() {
        return this.kLen;
    }

    public void setkLen(int kLen) {
        this.kLen = kLen;
    }

    public String getStringRA() {
        return this.stringRA;
    }

    public void setStringRA(String stringRA) {
        this.stringRA = stringRA;
    }
}
