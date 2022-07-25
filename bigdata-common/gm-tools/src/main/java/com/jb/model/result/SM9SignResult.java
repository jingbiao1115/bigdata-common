package com.jb.model.result;


import com.jb.driver.sm9.core.SM9Curve;
import com.jb.driver.sm9.method.SM9Method;
import it.unisa.dia.gas.plaf.jpbc.field.curve.CurveElement;

import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.util.Arrays;

/**
 * @author zhaojb
 * 签名
 */
public class SM9SignResult {
    private BigInteger h;
    private CurveElement s;

    public SM9SignResult(BigInteger h,CurveElement s) {
        this.h = h;
        this.s = s;
    }

    public static SM9SignResult fromByteArray(SM9Curve curve,byte[] data) {
        byte[] bh = Arrays.copyOfRange(data, 0, SM9Curve.SM9CurveParameters.N_BITS/8);
        byte[] bs = Arrays.copyOfRange(data,SM9Curve.SM9CurveParameters.N_BITS/8,data.length);

        CurveElement e = curve.getCurveFieldG1().newElement();
        e.setFromBytes(bs);
        return new SM9SignResult(new BigInteger(1, bh), e);
    }

    public byte[] toByteArray() {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] temp = SM9Method.bigIntegerToBytes(h,SM9Curve.SM9CurveParameters.N_BITS/8);
        bos.write(temp, 0, temp.length);
        temp = s.toBytes();
        bos.write(temp, 0, temp.length);
        return bos.toByteArray();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("sm9 signature:");
        sb.append('\n');
        sb.append("h:");
        sb.append('\n');
        sb.append(SM9Method.toHexString(SM9Method.bigIntegerToBytes(h)));
        sb.append("s:");
        sb.append('\n');
        sb.append(SM9Method.toHexString(SM9Method.curveFieldG1ToBytes(s)));
        sb.append('\n');

        return sb.toString();
    }

    public BigInteger getH() {
        return h;
    }

    public CurveElement getS() {
        return s;
    }
}
