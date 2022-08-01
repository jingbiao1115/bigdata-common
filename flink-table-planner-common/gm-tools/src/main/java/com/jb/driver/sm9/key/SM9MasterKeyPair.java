package com.jb.driver.sm9.key;

import com.jb.driver.sm9.core.SM9Curve;
import com.jb.driver.sm9.method.SM9Method;
import it.unisa.dia.gas.plaf.jpbc.field.curve.CurveElement;

import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.util.Arrays;

/**
 * @author zhaojb
 * SM9主密钥对
 */
public class SM9MasterKeyPair {
    private final MasterPrivateKey priKey;
    private final MasterPublicKey pubKey;

    public SM9MasterKeyPair(MasterPrivateKey privateKey,MasterPublicKey publicKey) {
        this.priKey = privateKey;
        this.pubKey = publicKey;
    }

    public static SM9MasterKeyPair fromByteArray(SM9Curve curve,byte[] source) {
        int len = 32;
        byte[] bPrikey = Arrays.copyOfRange(source,0,len);
        byte[] bPubkey = Arrays.copyOfRange(source,len,source.length);
        return new SM9MasterKeyPair(MasterPrivateKey.fromByteArray(bPrikey),
                MasterPublicKey.fromByteArray(curve,bPubkey));
    }

    public MasterPrivateKey getPrivateKey() {
        return this.priKey;
    }

    public MasterPublicKey getPublicKey() {
        return this.pubKey;
    }

    public byte[] toByteArray() {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] temp = this.priKey.toByteArray();
        bos.write(temp,0,temp.length);
        temp = this.pubKey.toByteArray();
        bos.write(temp,0,temp.length);
        return bos.toByteArray();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SM9 Master key pair:");
        sb.append('\n');
        sb.append(this.priKey);
        sb.append('\n');
        sb.append(this.pubKey);
        return sb.toString();
    }


    /**
     * 主私钥
     */
    public static class MasterPrivateKey {
        public BigInteger d;

        public MasterPrivateKey(BigInteger d) {
            this.d = d;
        }

        public static MasterPrivateKey fromByteArray(byte[] source) {
            BigInteger d = new BigInteger(1, source);
            return new MasterPrivateKey(d);
        }

        public byte[] toByteArray() {
            return SM9Method.bigIntegerToBytes(this.d,32);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("sm9 master private key:");
            sb.append('\n');
            sb.append(SM9Method.toHexString(SM9Method.bigIntegerToBytes(this.d, 32)));
            return sb.toString();
        }
    }

    /**
     * 主公钥
     */
    public static class MasterPublicKey {
        public CurveElement Q;
        boolean isSignKey;

        public MasterPublicKey(CurveElement point,boolean isSignKey) {
            this.Q = point;
            this.isSignKey = isSignKey;
        }

        public static MasterPublicKey fromByteArray(SM9Curve curve,byte[] source) {
            boolean isSignKey = false;
            if (source[0] != 0) {
                isSignKey = true;
            }

            CurveElement Q;
            if (isSignKey) {
                Q = curve.getCurveFieldG2().newElement();
            } else {
                Q = curve.getCurveFieldG1().newElement();
            }

            Q.setFromBytes(source,1);
            return new MasterPublicKey(Q,isSignKey);
        }

        public byte[] toByteArray() {
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            if (this.isSignKey) {
                bos.write(1);
            } else {
                bos.write(0);
            }

            byte[] temp = this.Q.toBytes();
            bos.write(temp,0,temp.length);
            return bos.toByteArray();
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("sm9 master public key:");
            sb.append('\n');
            if (this.isSignKey) {
                sb.append(SM9Method.toHexString(SM9Method.curveFieldG2ToByte(this.Q)));
            } else {
                sb.append(SM9Method.toHexString(SM9Method.curveFieldG1ToBytes(this.Q)));
            }

            return sb.toString();
        }
    }

}
