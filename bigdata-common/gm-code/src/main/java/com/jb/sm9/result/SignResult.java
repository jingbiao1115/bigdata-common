package com.jb.sm9.result;

import com.jb.sm9.core.SM9Curve;
import com.jb.sm9.method.Sm9Method;
import it.unisa.dia.gas.plaf.jpbc.field.curve.CurveElement;

import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.util.Arrays;

/**
 * @author zhaojb
 * 签名
 */
public class SignResult {
    public BigInteger h;
    public CurveElement s;

    public SignResult(BigInteger h,CurveElement s) {
        this.h = h;
        this.s = s;
    }

    public static SignResult fromByteArray(SM9Curve curve,byte[] data) {
        byte[] bh = Arrays.copyOfRange(data, 0, SM9Curve.SM9CurveParameters.nBits/8);
        byte[] bs = Arrays.copyOfRange(data, SM9Curve.SM9CurveParameters.nBits/8, data.length);

        CurveElement e = curve.G1.newElement();
        e.setFromBytes(bs);
        return new SignResult(new BigInteger(1, bh), e);
    }

    public byte[] toByteArray() {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] temp = Sm9Method.BigIntegerToBytes(h, SM9Curve.SM9CurveParameters.nBits/8);
        bos.write(temp, 0, temp.length);
        temp = s.toBytes();
        bos.write(temp, 0, temp.length);
        return bos.toByteArray();
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("sm9 signature:");
        sb.append('\n');
        sb.append("h:");
        sb.append('\n');
        sb.append(Sm9Method.toHexString(Sm9Method.BigIntegerToBytes(h)));
        sb.append("s:");
        sb.append('\n');
        sb.append(Sm9Method.toHexString(Sm9Method.G1ElementToBytes(s)));
        sb.append('\n');

        return sb.toString();
    }
}
