package com.jb.model.result;


import com.jb.driver.sm9.core.SM9Curve;
import com.jb.driver.sm9.method.SM9Method;
import it.unisa.dia.gas.plaf.jpbc.field.curve.CurveElement;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/**
 * @author zhaojb
 * 加密结果
 */
public final class SM9CipherResult {
    private CurveElement curveC1;
    private byte[] bytesC2;
    private byte[] bytesC3;

    public SM9CipherResult(CurveElement curveC1,byte[] bytesC2,byte[] bytesC3) {
        this.curveC1 = curveC1;
        this.bytesC2 = bytesC2;
        this.bytesC3 = bytesC3;
    }

    public static SM9CipherResult fromByteArray(SM9Curve curve,byte[] data) {
        int offset = 0;
        byte[] bC1 = Arrays.copyOfRange(data,offset,offset + 64);
        /**
         * int offset = offset + 64;
         */
        offset = offset + 64;
        CurveElement curveC1 = curve.getCurveFieldG1().newElement();
        curveC1.setFromBytes(bC1);
        byte[] bC3 = Arrays.copyOfRange(data,offset,offset + 32);
        offset += 32;
        byte[] bC2 = Arrays.copyOfRange(data,offset,data.length);
        return new SM9CipherResult(curveC1,bC2,bC3);
    }

    public byte[] toByteArray() {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        byte[] temp = this.curveC1.toBytes();
        bos.write(temp,0,temp.length);//64位
        bos.write(this.bytesC3,0,this.bytesC3.length);//32位
        bos.write(this.bytesC2,0,this.bytesC2.length);//4位

        return bos.toByteArray();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SM9 encrypt cipher:");
        sb.append('\n');
        sb.append("C1:");
        sb.append('\n');
        sb.append(SM9Method.toHexString(SM9Method.curveFieldG1ToBytes(this.curveC1)));
        sb.append('\n');
        sb.append("C2:");
        sb.append('\n');
        sb.append(SM9Method.toHexString(this.bytesC2));
        sb.append('\n');
        sb.append("C3:");
        sb.append('\n');
        sb.append(SM9Method.toHexString(this.bytesC3));
        sb.append('\n');
        return sb.toString();
    }

    public CurveElement getCurveC1() {
        return curveC1;
    }

    public byte[] getBytesC2() {
        return bytesC2;
    }

    public byte[] getBytesC3() {
        return bytesC3;
    }


}
