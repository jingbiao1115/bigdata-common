package com.jb.sm9.core;

import com.jb.sm4.SM4Utils;
import com.jb.sm9.result.CipherResult;
import com.jb.sm9.method.Sm9Method;
import com.jb.sm9.key.Sm9MasterKeyPair;
import com.jb.sm9.key.Sm9PrivateKey;

import com.jb.sm9.result.SignResult;
import it.unisa.dia.gas.jpbc.Element;
import it.unisa.dia.gas.plaf.jpbc.field.curve.CurveElement;
import it.unisa.dia.gas.plaf.jpbc.util.Arrays;
import org.bouncycastle.util.encoders.Hex;


import java.io.ByteArrayOutputStream;
import java.math.BigInteger;

/**
 * @author zhaojb
 */
public class SM9 extends AbstractSM9 {

    public SM9(SM9Curve curve) {
        super(curve);
    }

    /**
     * 密钥解析
     */
    public Sm9MasterKeyPair parseMasterKey(String masterKey) {
        return Sm9MasterKeyPair.fromByteArray(this.mCurve,Hex.decode(masterKey));
    }

    public Sm9MasterKeyPair.MasterPrivateKey parseMasterPrivateKey(String masterPrivateKey) {
        return Sm9MasterKeyPair.MasterPrivateKey.fromByteArray(Hex.decode(masterPrivateKey));
    }

    public Sm9MasterKeyPair.MasterPublicKey parseMasterPublicKey(String masterPublicKey) {
        return Sm9MasterKeyPair.MasterPublicKey.fromByteArray(this.mCurve,
                Hex.decode(masterPublicKey));
    }

    public Sm9PrivateKey parsePrivateKey(String privateKey) {
        return Sm9PrivateKey.fromByteArray(this.mCurve,Hex.decode(privateKey));
    }

    public Sm9MasterKeyPair parseKey(String masterPublicKey,String masterPrivateKey) {

        Sm9MasterKeyPair.MasterPublicKey sm9MasterPublicKey =
                Sm9MasterKeyPair.MasterPublicKey.fromByteArray(this.mCurve,
                        Hex.decode(masterPublicKey));

        Sm9MasterKeyPair.MasterPrivateKey sm9MasterPrivateKey =
                Sm9MasterKeyPair.MasterPrivateKey.fromByteArray(Hex.decode(masterPrivateKey));

        return new Sm9MasterKeyPair(sm9MasterPrivateKey,sm9MasterPublicKey);
    }

    public SignResult parseSign(String  signResult){
        return   SignResult.fromByteArray(this.mCurve,Hex.decode(signResult));
    }

    /**
     * 加密
     *
     * @return
     * @throws Exception
     */
    @Override
    public CipherResult encrypt(Sm9MasterKeyPair.MasterPublicKey masterPublicKey,String id,
            byte[] data,
            boolean isBaseBlockCipher,int macKeyByteLen) throws Exception {
        BigInteger h1 = Sm9Method.H1(id,(byte)3,this.mCurve.N);
        CurveElement QB = this.mCurve.P1.duplicate().mul(h1).add(masterPublicKey.Q);

        CurveElement C1;
        byte[] K1;
        byte[] K2;
        do {
            BigInteger r = Sm9Method.genRandom(this.mCurve.random,this.mCurve.N);
            C1 = QB.mul(r);
            Element g = this.mCurve.pairing(masterPublicKey.Q,this.mCurve.P2);
            Element w = g.duplicate().pow(r);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] temp = Sm9Method.G1ElementToBytes(C1);
            bos.write(temp,0,temp.length);
            temp = Sm9Method.GTFiniteElementToByte(w);
            bos.write(temp,0,temp.length);
            temp = id.getBytes();
            bos.write(temp,0,temp.length);
            int k1Len = 16;
            if (!isBaseBlockCipher) {
                k1Len = data.length;
            }

            byte[] K = Sm9Method.KDF(bos.toByteArray(),k1Len + macKeyByteLen);
            K1 = Arrays.copyOfRange(K,0,k1Len);
            K2 = Arrays.copyOfRange(K,k1Len,K.length);
        } while (Sm9Method.isAllZero(K1));

        byte[] C2;
        if (isBaseBlockCipher) {
            C2 = SM4Utils.encryptEcbPadding(K1,data);
//            C2 = SM4.ecbCrypt(true, K1, data, 0, data.length);
        } else {
            C2 = Sm9Method.xor(data,K1);
        }

        byte[] C3 = Sm9Method.MAC(K2,C2);
        return new CipherResult(C1,C2,C3);
    }

    /**
     * 解密
     */
    public byte[] decryptParamBytes(
            byte[] cipherBytes,Sm9PrivateKey privateKey,String id,
            boolean isBaseBlockCipher,int macKeyByteLen) throws Exception {

        byte[] C1XY = new byte[64];
        System.arraycopy(cipherBytes,0,C1XY,0,64);

        byte[] C3 = new byte[32];
        System.arraycopy(cipherBytes,64,C3,0,32);

        byte[] C2 = new byte[4];
        System.arraycopy(cipherBytes,96,C2,0,4);

        //将byte转成CurveElement,这个转换找了一整个下午
        CurveElement C1 = (CurveElement)this.mCurve.G1.newElementFromBytes(C1XY);

        return decrypt(new CipherResult(C1,C2,C3),privateKey,id,isBaseBlockCipher,
                macKeyByteLen);

    }

    @Override
    public byte[] decrypt(CipherResult cipherResult,Sm9PrivateKey privateKey,String id,
            boolean isBaseBlockCipher,int macKeyByteLen) throws Exception {
        if (!cipherResult.C1.isValid()) {
            throw new Exception("C1 is not on G1 group");
        } else {

            Element w = this.mCurve.pairing(cipherResult.C1,privateKey.d);
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] temp = Sm9Method.G1ElementToBytes(cipherResult.C1);
            bos.write(temp,0,temp.length);
            temp = Sm9Method.GTFiniteElementToByte(w);
            bos.write(temp,0,temp.length);
            temp = id.getBytes();
            bos.write(temp,0,temp.length);
            int k1Len = 16;
            if (!isBaseBlockCipher) {
                k1Len = cipherResult.C2.length;
            }

            byte[] K = Sm9Method.KDF(bos.toByteArray(),k1Len + macKeyByteLen);
            byte[] K1 = Arrays.copyOfRange(K,0,k1Len);
            byte[] K2 = Arrays.copyOfRange(K,k1Len,K.length);
            if (Sm9Method.isAllZero(K1)) {
                throw new Exception("K1 is all zero");
            } else {
                byte[] M;
                if (isBaseBlockCipher) {
                    M = SM4Utils.decrypt_Ecb_Padding(K1,cipherResult.C2);
//                    M = SM4.ecbCrypt(false, K1, resultCipherText.C2, 0, resultCipherText.C2
//                    .length);
                } else {
                    M = Sm9Method.xor(cipherResult.C2,K1);
                }

                byte[] u = Sm9Method.MAC(K2,cipherResult.C2);
                if (!Sm9Method.byteEqual(u,cipherResult.C3)) {
                    throw new Exception("C3 verify failed");
                } else {
                    return M;
                }
            }
        }
    }

    /**
     * 签名
     */
    public SignResult sign(Sm9MasterKeyPair.MasterPublicKey masterPublicKey,
            Sm9PrivateKey privateKey,byte[] data) {
        BigInteger l, h;

        //Step1 : g = e(P1, Ppub)
        Element g = this.mCurve.pairing(mCurve.P1,masterPublicKey.Q);

        do {

            //Step2: Rand r
            BigInteger r = Sm9Method.genRandom(mCurve.random,mCurve.N);

            //Step3 : w=g^r
            Element w = g.duplicate().pow(r);

            //Step4 :  h=H2(M||w,N)
            h = Sm9Method.H2(data,w,mCurve.N).mod(mCurve.N);

            //Step5 : l=(r-h)mod N
            l = r.subtract(h).mod(mCurve.N);
        } while (l.equals(BigInteger.ZERO));


        //Step6 : S = [l]dA=(xS,yS)
        CurveElement s = privateKey.d.duplicate().mul(l);

        //Step7 : OUT : (h,s)
        SignResult signResult = new SignResult(h,s);

        return signResult;
    }

    /**
     * 验签
     */
    public boolean verifyParamS(Sm9MasterKeyPair.MasterPublicKey masterPublicKey,String id,
            byte[] data,byte[] signResult) {

        SignResult signature = SignResult.fromByteArray(this.mCurve,signResult);

        return verify(masterPublicKey,id,data,signature);
    }

    public boolean verify(Sm9MasterKeyPair.MasterPublicKey masterPublicKey,String id,
            byte[] data,SignResult signature) {
        // Step1 : check if h in the range [1, N-1]
        if (!Sm9Method.isBetween(signature.h,mCurve.N))
            return false;

        // Step2 : check if S is on G1
        if (!signature.s.isValid())
            return false;

        // Step3 : g = e(P1, Ppub)
        Element g = mCurve.pairing(mCurve.P1,masterPublicKey.Q);

        // Step4 : t=g^h
        Element t = g.pow(signature.h);

        // Step5 : h1=H1(IDA||hid,N)
        BigInteger h1 = Sm9Method.H1(id,SM9Curve.HID_SIGN,mCurve.N);

        // Step6 : P=[h1]P2+Ppub
        CurveElement p = mCurve.P2.duplicate().mul(h1).add(masterPublicKey.Q);

        // Step7 : u=e(S,P)
        Element u = mCurve.pairing(signature.s,p);

        // Step8 : w=u*t
        Element w = u.mul(t);

        // Step9 : h2=H2(M||w,N)
        BigInteger h2 = Sm9Method.H2(data,w,mCurve.N);

        return h2.equals(signature.h);

    }
}
