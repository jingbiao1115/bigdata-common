package com.jb.sm9.result;


import com.jb.sm9.method.SM9Method;
import com.jb.sm9.core.SM9Curve;
import it.unisa.dia.gas.plaf.jpbc.field.curve.CurveElement;


import java.io.ByteArrayOutputStream;
import java.util.Arrays;

/**
 * @author zhaojb
 * 加密结果
 */
public final class CipherResult {
   public CurveElement C1;
   public byte[] C2;
   public byte[] C3;

    public CipherResult(CurveElement C1, byte[] C2, byte[] C3) {
        this.C1 = C1;
        this.C2 = C2;
        this.C3 = C3;
    }

    public static CipherResult fromByteArray(SM9Curve curve, byte[] data) {
        int offset = 0;
        byte[] bC1 = Arrays.copyOfRange(data, offset, offset + 64);
        //int offset = offset + 64;
        offset = offset + 64;
        CurveElement C1 = curve.G1.newElement();
        C1.setFromBytes(bC1);
        byte[] bC3 = Arrays.copyOfRange(data, offset, offset + 32);
        offset += 32;
        byte[] bC2 = Arrays.copyOfRange(data, offset, data.length);
        return new CipherResult(C1, bC2, bC3);
    }

    public byte[] toByteArray() {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        System.out.println();
        byte[] temp = this.C1.toBytes();
        bos.write(temp, 0, temp.length);//64位
        bos.write(this.C3, 0, this.C3.length);//32位
        bos.write(this.C2, 0, this.C2.length);//4位

        return bos.toByteArray();
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("SM9 encrypt cipher:");
        sb.append("\n");
        sb.append("C1:");
        sb.append("\n");
        sb.append(SM9Method.toHexString(SM9Method.G1ElementToBytes(this.C1)));
        sb.append("\n");
        sb.append("C2:");
        sb.append("\n");
        sb.append(SM9Method.toHexString(this.C2));
        sb.append("\n");
        sb.append("C3:");
        sb.append("\n");
        sb.append(SM9Method.toHexString(this.C3));
        sb.append("\n");
        return sb.toString();
    }
}
