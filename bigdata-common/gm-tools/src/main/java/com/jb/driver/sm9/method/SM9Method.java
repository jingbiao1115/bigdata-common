package com.jb.driver.sm9.method;

import com.jb.driver.sm9.SM9Hex;
import com.jb.driver.sm9.core.SM9Curve;
import it.unisa.dia.gas.jpbc.Element;
import it.unisa.dia.gas.plaf.jpbc.field.curve.CurveElement;
import org.bouncycastle.crypto.digests.SM3Digest;

import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;
import java.util.Arrays;

/**
 * @author zhaojb
 * SM9工具方法
 */
public class SM9Method {
    public static final String NEW_LINE = "\n";

    private SM9Method() {
    }

    public static BigInteger genRandom(SecureRandom random,BigInteger max) {
        BigInteger k;
        while (true) {
            k = new BigInteger(max.bitLength(),random);
            if (k.compareTo(BigInteger.ZERO) > 0 && k.compareTo(max) < 0)
                break;
        }
        return k;
    }

    public static boolean isBetween(BigInteger a,BigInteger max) {
        return a.compareTo(BigInteger.ZERO) > 0 && a.compareTo(max) < 0;
    }

    public static BigInteger bigIntegerH1(String id,byte hid,BigInteger bigIntegerN) {
        byte[] bID = id.getBytes(StandardCharsets.UTF_8);

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        bos.write(0x01);
        bos.write(bID,0,bID.length);
        bos.write(hid);
        return bigIntegerH(bos.toByteArray(),bigIntegerN);
    }


    public static byte[] byteMerger(byte[] byte1,byte[] byte2) {
        byte[] byte3 = new byte[byte1.length + byte2.length];
        System.arraycopy(byte1,0,byte3,0,byte1.length);
        System.arraycopy(byte2,0,byte3,byte1.length,byte2.length);
        return byte3;
    }

    public static BigInteger bigIntegerH2(byte[] data,Element w,BigInteger bigIntegerN) {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        bos.write(0x02);
        bos.write(data,0,data.length);
        byte[] temp = gtFiniteToByte(w);
        bos.write(temp,0,temp.length);
        return bigIntegerH(bos.toByteArray(),bigIntegerN);
    }

    public static BigInteger bigIntegerH(byte[] byteArrayZ,BigInteger bigIntegerN) {
        double log2n = Math.log(bigIntegerN.doubleValue()) / Math.log(2.0D);
        int hlen = (int)Math.ceil(5.0D * log2n / 32.0D);
        byte[] hashValue = bytesKdf(byteArrayZ,hlen);
        BigInteger ha = new BigInteger(1,hashValue);
        return ha.mod(bigIntegerN.subtract(BigInteger.ONE)).add(BigInteger.ONE);
    }

    public static byte[] bytesHash(byte[] data) {
//        Digest digest = (Digest) new SM3Digestt();
//        Digest digest =  new SM3Digest();
//        byte[] hv = new byte[digest.getDigestSize()];
//        digest.update(data, 0, data.length);
//        digest.doFinal(hv, 0);

        SM3Digest digest = new SM3Digest();
        digest.update(data,0,data.length);
        byte[] hash = new byte[digest.getDigestSize()];
        digest.doFinal(hash,0);

        return hash;
//        return hv;
    }

    /**
     * 消息认证码函数
     *
     * @param key
     * @param data
     * @return
     */
    public static byte[] bytesMac(byte[] key,byte[] data) {
        SM3Digest digest = new SM3Digest();
        byte[] hv = new byte[digest.getDigestSize()];
        digest.update(data,0,data.length);
        digest.update(key,0,key.length);
        digest.doFinal(hv,0);
        return hv;
    }

    public static byte[] bytesKdf(byte[] data,int keyByteLen) {

        SM3Digest digest = new SM3Digest();
        int groupNum =
                (keyByteLen * 8 + (digest.getDigestSize() * 8 - 1)) / (digest.getDigestSize() * 8);
        byte[] hv = new byte[digest.getDigestSize() * groupNum];

        for (int ct = 1;ct <= groupNum;++ct) {
            digest.reset();
            digest.update(data,0,data.length);
            digest.update((byte)(ct >> 24 & 255));
            digest.update((byte)(ct >> 16 & 255));
            digest.update((byte)(ct >> 8 & 255));
            digest.update((byte)(ct & 255));
            digest.doFinal(hv,(ct - 1) * digest.getDigestSize());
        }

        return Arrays.copyOfRange(hv,0,keyByteLen);
    }

    public static byte[] curveFieldG1ToBytes(Element e) {
        return e.toBytes();
    }

    public static byte[] curveFieldG2ToByte(Element gt) {
        byte[] source = gt.toBytes();
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        int len = 32;

        for (int i = 0;i < 2;++i) {
            bos.write(source,(i * 2 + 1) * len,len);
            bos.write(source,i * 2 * len,len);
        }

        return bos.toByteArray();
    }

    public static byte[] gtFiniteToByte(Element gt) {
        byte[] source = gt.toBytes();
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        int len = 32;

        for (int i = 2;i >= 0;--i) {
            bos.write(source,(i * 2 + 1 + 6) * len,len);
            bos.write(source,(i * 2 + 6) * len,len);
            bos.write(source,(i * 2 + 1) * len,len);
            bos.write(source,i * 2 * len,len);
        }

        return bos.toByteArray();
    }

    public static byte[] bigIntegerToBytes(BigInteger b) {
        byte[] temp = b.toByteArray();
        if (b.signum() > 0 && temp[0] == 0) {
            temp = Arrays.copyOfRange(temp,1,temp.length);
        }

        return temp;
    }

    public static byte[] bigIntegerToBytes(BigInteger b,int length) {
        byte[] temp = b.toByteArray();
        if (b.signum() > 0 && temp[0] == 0){
            temp = Arrays.copyOfRange(temp,1,temp.length);
        }


        if (temp.length < length) {
            byte[] result = new byte[length];
            System.arraycopy(temp,0,result,length - temp.length,temp.length);
            return result;
        } else {
            return temp;
        }
    }

    public static boolean isAllZero(byte[] in) {
        byte[] var1 = in;
        int var2 = in.length;

        for (int var3 = 0;var3 < var2;++var3) {
            byte b = var1[var3];
            if (b != 0) {
                return false;
            }
        }

        return true;
    }

    public static String toHexString(byte[] data) {
        String hexData = SM9Hex.encodeToString(data,true);
        return showString(hexData);
    }

    public static String showString(String data) {
        if (data.length() < 2) {
            return data + "\n";
        } else {
            StringBuilder sb = new StringBuilder();
//            String line = "";

            StringBuilder line =new StringBuilder();

            for (int i = 0;i < data.length();i += 2) {
//                line = line + data.substring(i,i + 2);
                line.append(data,i,i + 2);

                if ((i + 2) % 64 == 0) {
                    sb.append(line);
                    sb.append('\n');
//                    line = "";
                    line.setLength(0);
                } else if ((i + 2) % 8 == 0) {
//                    line = line + " ";
                    line.append(' ');
                }
            }

            if (line.length()>0) {
                sb.append(line);
                sb.append('\n');
            }

            return sb.toString();
        }
    }

    public static boolean byteEqual(byte[] a,byte[] b) {
        return byteCompare(a,b) == 0;
    }

    public static int byteCompare(byte[] a,byte[] b) {
        int lena = a.length;
        int lenb = b.length;
        int len = lena < lenb?lena:lenb;

        for (int i = 0;i < len;++i) {
            if (a[i] < b[i]) {
                return -1 * (i + 1);
            }

            if (a[i] > b[i]) {
                return i + 1;
            }
        }

        if (lena < lenb) {
            return -(len + 1);
        } else if (lena > lenb) {
            return len + 1;
        } else {
            return 0;
        }
    }

    public static byte[] xor(byte[] b1,byte[] b2) {
        int length = b1.length > b2.length?b2.length:b1.length;
        byte[] result = new byte[length];

        for (int i = 0;i < length;++i) {
            result[i] = (byte)((b1[i] ^ b2[i]) & 255);
        }

        return result;
    }

    public static byte[] toByteArray(CurveElement curveR) {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        byte[] temp = curveR.toBytes();
        bos.write(temp,0,temp.length);
        return bos.toByteArray();
    }

    public static CurveElement fromByteArray(SM9Curve curve,byte[] data) {

        CurveElement e = curve.getCurveFieldG1().newElement();
        e.setFromBytes(data);
        return new CurveElement(e);
    }

    /**
     * 计算共享密钥
     */
    public static byte[] bytesKdf(String idA,CurveElement curveRA,String idB,CurveElement curveRB,
            Element g1, Element g2, Element g3,int kLen) {
        //step7.1:拼接IDA||IDB||RA||RB||g1||g2||g3
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        //IDA
        byte[] temp = idA.getBytes(StandardCharsets.UTF_8);
        bos.write(temp,0,temp.length);
        //IDB
        temp = idB.getBytes(StandardCharsets.UTF_8);
        bos.write(temp,0,temp.length);
        //RA
        temp = SM9Method.curveFieldG1ToBytes(curveRA);
        bos.write(temp,0,temp.length);
        //RB
        temp = SM9Method.curveFieldG1ToBytes(curveRB);
        bos.write(temp,0,temp.length);
        //g1
        temp = SM9Method.gtFiniteToByte(g1);
        bos.write(temp,0,temp.length);
        //g2
        temp = SM9Method.gtFiniteToByte(g2);
        bos.write(temp,0,temp.length);
        //g3
        temp = SM9Method.gtFiniteToByte(g3);
        bos.write(temp,0,temp.length);

        //step7.2: SKA = SKB = KDF(IDA||IDB||RA||RB||g1||g2||g3)
        return SM9Method.bytesKdf(bos.toByteArray(),kLen);
    }

    public static byte[] bytesHashS(String idA,CurveElement curveRA,String idB,
            CurveElement curveRB, Element g2, Element g3) {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        byte[] temp;
        temp = SM9Method.gtFiniteToByte(g2);
        bos.write(temp,0,temp.length);
        temp = SM9Method.gtFiniteToByte(g3);
        bos.write(temp,0,temp.length);
        temp = idA.getBytes(StandardCharsets.UTF_8);
        bos.write(temp,0,temp.length);
        temp = idB.getBytes(StandardCharsets.UTF_8);
        bos.write(temp,0,temp.length);
        temp = SM9Method.curveFieldG1ToBytes(curveRA);
        bos.write(temp,0,temp.length);
        temp = SM9Method.curveFieldG1ToBytes(curveRB);
        bos.write(temp,0,temp.length);


        return SM9Method.bytesHash(bos.toByteArray());
    }

    public static byte[] bytesHashS(byte byteX,String idA,CurveElement curveRA,String idB,
            CurveElement curveRB, Element g1, Element g2, Element g3) {

        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        byte[] temp;
        bos.write(byteX);
        //g1
        temp = SM9Method.gtFiniteToByte(g1);
        bos.write(temp,0,temp.length);
        //hash
        temp = SM9Method.bytesHashS(idA,curveRA,idB,curveRB,g2,g3);
        bos.write(temp,0,temp.length);

        return SM9Method.bytesHash(bos.toByteArray());
    }

}
