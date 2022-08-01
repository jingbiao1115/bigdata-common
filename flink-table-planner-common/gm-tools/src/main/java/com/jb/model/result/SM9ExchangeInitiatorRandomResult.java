package com.jb.model.result;

import com.jb.driver.sm9.method.SM9Method;
import it.unisa.dia.gas.plaf.jpbc.field.curve.CurveElement;
import org.bouncycastle.util.encoders.Hex;

import java.math.BigInteger;

/**
 * @author zhaojb
 * 发起方生成随机数
 */
public class SM9ExchangeInitiatorRandomResult {
    /**
     * rA自己保存
     */
    private BigInteger rA;

    /**
     * RA发送给响应方
     */
    private String stringRA;

    public SM9ExchangeInitiatorRandomResult(BigInteger rA,String stringRA) {
        this.rA = rA;
        this.stringRA = stringRA;
    }

    public SM9ExchangeInitiatorRandomResult(BigInteger rA,CurveElement curveRA) {
        this.rA = rA;
        this.stringRA = Hex.toHexString(SM9Method.toByteArray(curveRA));
    }


    public BigInteger getrA() {
        return rA;
    }

    public void setrA(BigInteger rA) {
        this.rA = rA;
    }

    public String getStringRA() {
        return stringRA;
    }

    public void setStringRA(String stringRA) {
        this.stringRA = stringRA;
    }
}
