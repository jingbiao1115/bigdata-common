package com.jb.model.result;


import com.jb.driver.sm9.method.SM9Method;
import it.unisa.dia.gas.plaf.jpbc.field.curve.CurveElement;
import org.bouncycastle.util.encoders.Hex;



/**
 * @author zhaojb
 * 响应方,生成R,SKB
 */
public class SM9ExchangeResponderKdfResult {

    /**
     * 发送给发起方
     */
    private String stringRB;

    private String stringSB;

    private String stringS2;

    private String stringSKB;

    public SM9ExchangeResponderKdfResult(String stringRB,String stringSB,String stringS2,
            String stringSKB) {
        this.stringRB = stringRB;
        this.stringSB = stringSB;
        this.stringS2 = stringS2;
        this.stringSKB = stringSKB;
    }

    public SM9ExchangeResponderKdfResult(CurveElement curveRB,String stringSB,String stringS2,
            String stringSKB) {
        this.stringRB = Hex.toHexString(SM9Method.toByteArray(curveRB));
        this.stringSB = stringSB;
        this.stringS2 = stringS2;
        this.stringSKB = stringSKB;
    }

    public SM9ExchangeResponderKdfResult(CurveElement curveRB,byte[] bytesSB,byte[] bytesS2,
            byte[] bytesSKB) {
        this.stringRB = Hex.toHexString(SM9Method.toByteArray(curveRB));
        this.stringSB = Hex.toHexString(bytesSB);
        this.stringS2 = Hex.toHexString(bytesS2);
        this.stringSKB = Hex.toHexString(bytesSKB);
    }

    public String getStringRB() {
        return stringRB;
    }

    public void setStringRB(String stringRB) {
        this.stringRB = stringRB;
    }

    public String getStringSB() {
        return stringSB;
    }

    public void setStringSB(String stringSB) {
        this.stringSB = stringSB;
    }

    public String getStringS2() {
        return stringS2;
    }

    public void setStringS2(String stringS2) {
        this.stringS2 = stringS2;
    }

    public String getStringSKB() {
        return stringSKB;
    }

    public void setStringSKB(String stringSKB) {
        this.stringSKB = stringSKB;
    }
}
