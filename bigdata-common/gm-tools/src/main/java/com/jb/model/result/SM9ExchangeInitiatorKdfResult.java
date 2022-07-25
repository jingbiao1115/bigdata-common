package com.jb.model.result;

import org.bouncycastle.util.encoders.Hex;

/**
 * @author zhaojb
 * 发起方生成SKA
 */
public class SM9ExchangeInitiatorKdfResult {

    /**
     * 发起方SA,发送给响应方做密钥确认
     */
    private String stringSA;

    /**
     * 发起方S1
     */
    private String stringS1;

    /**
     * 密钥是否协商成功
     */
    private Boolean ack;

    /**
     * 共享密钥
     */
    private String stringSKA;


    public SM9ExchangeInitiatorKdfResult(String stringSA,String stringS1,Boolean ack,
            String stringSKA) {
        this.stringSA = stringSA;
        this.stringS1 = stringS1;
        this.ack = ack;
        this.stringSKA = stringSKA;
    }

    public SM9ExchangeInitiatorKdfResult(byte[] bytesSA,byte[] bytesS1,Boolean ack,
            byte[] bytesSKA) {
        this.stringSA = Hex.toHexString(bytesSA);
        this.stringS1 = Hex.toHexString(bytesS1);
        this.ack = ack;
        this.stringSKA = Hex.toHexString(bytesSKA);
    }

    public String getStringSA() {
        return this.stringSA;
    }

    public void setStringSA(String stringSA) {
        this.stringSA = stringSA;
    }

    public String getStringS1() {
        return this.stringS1;
    }

    public void setStringS1(String stringS1) {
        this.stringS1 = stringS1;
    }

    public Boolean getAck() {
        return this.ack;
    }

    public void setAck(Boolean ack) {
        this.ack = ack;
    }

    public String getStringSKA() {
        return this.stringSKA;
    }

    public void setStringSKA(String stringSKA) {
        this.stringSKA = stringSKA;
    }
}
