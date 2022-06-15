package com.jb.sm9.key;

import com.jb.sm9.method.Sm9Method;
import com.jb.sm9.core.SM9Curve;
import it.unisa.dia.gas.plaf.jpbc.field.curve.CurveElement;


import java.io.ByteArrayOutputStream;

/**
 * @author zhaojb
 * SM9用户私钥
 */
public class Sm9PrivateKey {
    public final CurveElement d;
    private final byte hid;

    public Sm9PrivateKey(CurveElement point,byte hid) {
        this.d = point;
        this.hid = hid;
    }

    public static Sm9PrivateKey fromByteArray(SM9Curve curve,byte[] source) {
        byte hid = source[0];
        CurveElement d;
        if (hid == 1) {
            d = curve.G1.newElement();
        } else {
            d = curve.G2.newElement();
        }

        d.setFromBytes(source,1);
        return new Sm9PrivateKey(d,hid);
    }

    public byte[] toByteArray() {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        bos.write(this.hid);
        byte[] temp = this.d.toBytes();
        bos.write(temp,0,temp.length);
        return bos.toByteArray();
    }

    @Override
    public String toString() {
        return this.hid == 1?
                "SM9 private key:\n" + Sm9Method.toHexString(Sm9Method.G1ElementToBytes(this.d)):
                "SM9 private key:\n" + Sm9Method.toHexString(Sm9Method.G2ElementToByte(this.d));
    }

    public enum PrivateKeyType {
        KEY_SIGN(1,"签名密钥"),
        KEY_KEY_EXCHANGE(2,"交换密钥"),
        KEY_ENCRYPT(3,"加密密钥");

        private final Integer code;
        private final String msg;

        PrivateKeyType(final int code,final String msg) {
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
}
