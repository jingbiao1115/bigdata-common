package com.jb.sm9.bouncyCastle;

import com.jb.sm4.SM4Utils;
import com.jb.sm9.core.KeyGenerateCenter;
import com.jb.sm9.core.KeyParse;
import com.jb.sm9.core.SM9Curve;
import com.jb.sm9.key.SM9MasterKeyPair;
import com.jb.sm9.key.SM9PrivateKey;
import com.jb.sm9.method.SM9Method;
import com.jb.sm9.result.CipherResult;
import it.unisa.dia.gas.jpbc.Element;
import it.unisa.dia.gas.plaf.jpbc.field.curve.CurveElement;
import it.unisa.dia.gas.plaf.jpbc.util.Arrays;
import org.bouncycastle.util.encoders.Hex;

import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;

/**
 * @author zhaojb
 * SM9加密类
 */
public class SM9EncryptBouncyCastle {
    private final SM9Curve sm9Curve = new SM9Curve();

    private final KeyGenerateCenter keyGenerateCenter = new KeyGenerateCenter(sm9Curve);

    private final KeyParse keyParse = new KeyParse(sm9Curve);


    ////////////////////////////////////////////////////////////////////////////////
    //加密
    ////////////////////////////////////////////////////////////////////////////////

    /**
     * 加密
     *
     * @return
     * @throws Exception
     */
    private CipherResult encrypt(SM9MasterKeyPair.MasterPublicKey masterPublicKey,String id,
            byte[] data,
            boolean isBaseBlockCipher,int macKeyByteLen) throws Exception {

        ////////////////////////////////////////密钥封装start////////////////////////////////////////

        //hB = H1(IDB||hid,N)
        BigInteger hB = SM9Method.H1(id,(byte)3,this.sm9Curve.N);

        //step1:QB = [hB]P1+Ppub
        CurveElement QB = this.sm9Curve.P1.duplicate().mul(hB).add(masterPublicKey.Q);

        CurveElement C1;
        byte[] K1;
        byte[] K2;
        do {
            //step2:Rand r 被包含于[1,N-1]
            BigInteger r = SM9Method.genRandom(this.sm9Curve.random,this.sm9Curve.N);

            //step3:C1= [r]QB
            C1 = QB.mul(r);

            //step4:g = e(Ppub,P2)
            Element g = this.sm9Curve.pairing(masterPublicKey.Q,this.sm9Curve.P2);

            //step5:w=g^r
            Element w = g.duplicate().pow(r);

            //step6.0:拼接C1||w||IDB
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] temp = SM9Method.G1ElementToBytes(C1);
            bos.write(temp,0,temp.length);
            temp = SM9Method.GTFiniteElementToByte(w);
            bos.write(temp,0,temp.length);
            temp = id.getBytes();
            bos.write(temp,0,temp.length);
            int k1Len = 16;
            if (!isBaseBlockCipher) {
                k1Len = data.length;
            }

            //step6.1:K1||K2 = KDF(C1||w||IDB,klen)
            byte[] K = SM9Method.KDF(bos.toByteArray(),k1Len + macKeyByteLen);
            K1 = Arrays.copyOfRange(K,0,k1Len);
            K2 = Arrays.copyOfRange(K,k1Len,K.length);
        } while (SM9Method.isAllZero(K1));

        ////////////////////////////////////////密钥封装End////////////////////////////////////////


        //step6.2: C2=Enc(K1,M)
        byte[] C2;
        if (isBaseBlockCipher) {
            C2 = SM4Utils.encryptEcbPadding(K1,data);
//            C2 = SM4.ecbCrypt(true, K1, data, 0, data.length);
        } else {
            C2 = SM9Method.xor(data,K1);
        }

        //step7:C3=MAC(K2,C2)
        byte[] C3 = SM9Method.MAC(K2,C2);

        //step8:C=C1||C2||C3
        return new CipherResult(C1,C2,C3);
    }

    /**
     * 使用主公钥加密
     */
    public CipherResult encrypt(String id,
            String masterPublicKey,String msg) throws Exception {

        return encrypt(
                id,
                keyParse.parseMasterPublicKey(masterPublicKey),
                msg
        );
    }


    public CipherResult encrypt(String id,
            SM9MasterKeyPair.MasterPublicKey masterPublicKey,
            String msg) throws Exception {

        return encrypt(
                masterPublicKey,
                id,
                msg.getBytes(),
                false,
                32
        );
    }

    ////////////////////////////////////////////////////////////////////////////////
    //解密
    ////////////////////////////////////////////////////////////////////////////////

    /**
     * 使用主私钥解密
     */
    public String masterPrivateKeyDecrypt(String id,String masterPrivateKey,
            String cipherText) throws Exception {

        return decrypt(
                id,
                keyGenerateCenter.genPrivateKey(
                        KeyParse.parseMasterPrivateKey(masterPrivateKey),
                        id,
                        SM9PrivateKey.PrivateKeyType.KEY_ENCRYPT),
                cipherText
        );
    }

    /**
     * 使用用户私钥解密
     */
    public String userPrivateDecrypt(String id,String privateKey,
            String cipherText) throws Exception {

        return decrypt(
                id,
                keyParse.parsePrivateKey(privateKey),
                cipherText);
    }

    public String decrypt(String id,SM9PrivateKey privateKey,
            String cipherText) throws Exception {

        return decrypt(id,privateKey,CipherResult.fromByteArray(sm9Curve,
                Hex.decode(cipherText)));
    }

    /**
     * 使用主密钥解密
     */
    public String decrypt(String id,SM9PrivateKey privateKey,
            CipherResult cipherResult) throws Exception {

        return new String(
                decrypt(
                        cipherResult,
                        privateKey,
                        id,
                        false,
                        32),
                StandardCharsets.UTF_8
        );
    }

    /**
     * 解密
     */
    public byte[] decryptParamBytes(
            byte[] cipherBytes,SM9PrivateKey privateKey,String id,
            boolean isBaseBlockCipher,int macKeyByteLen) throws Exception {

        byte[] C1XY = new byte[64];
        System.arraycopy(cipherBytes,0,C1XY,0,64);

        byte[] C3 = new byte[32];
        System.arraycopy(cipherBytes,64,C3,0,32);

        byte[] C2 = new byte[4];
        System.arraycopy(cipherBytes,96,C2,0,4);

        //将byte转成CurveElement,这个转换找了一整个下午
        CurveElement C1 = (CurveElement)this.sm9Curve.G1.newElementFromBytes(C1XY);

        return decrypt(new CipherResult(C1,C2,C3),privateKey,id,isBaseBlockCipher,
                macKeyByteLen);

    }

    public byte[] decrypt(CipherResult cipherResult,SM9PrivateKey privateKey,String id,
            boolean isBaseBlockCipher,int macKeyByteLen) throws Exception {
        if (!cipherResult.C1.isValid()) {
            throw new RuntimeException("C1 is not on G1 group");
        } else {

            ////////////////////////////////////////密钥解封start//////////////////////////////////////

            //step1:C1 被包含于G1?
            //step2:w=e(C1,dB)  dB是用户私钥
            Element w = this.sm9Curve.pairing(cipherResult.C1,privateKey.d);

            //step3:拼接C1||w||IDB
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            byte[] temp = SM9Method.G1ElementToBytes(cipherResult.C1);
            bos.write(temp,0,temp.length);
            temp = SM9Method.GTFiniteElementToByte(w);
            bos.write(temp,0,temp.length);
            temp = id.getBytes();
            bos.write(temp,0,temp.length);
            int k1Len = 16;
            if (!isBaseBlockCipher) {
                k1Len = cipherResult.C2.length;
            }

            //step3.1: K1||K2 = KDF(C1||w||IDB,klen)
            byte[] K = SM9Method.KDF(bos.toByteArray(),k1Len + macKeyByteLen);
            byte[] K1 = Arrays.copyOfRange(K,0,k1Len);
            byte[] K2 = Arrays.copyOfRange(K,k1Len,K.length);

            ////////////////////////////////////////密钥解封End//////////////////////////////////////


            if (SM9Method.isAllZero(K1)) {
                throw new RuntimeException("K1 is all zero");
            } else {
                byte[] M;

                //step3.2:M=Dec(K1,C2)
                if (isBaseBlockCipher) {
                    M = SM4Utils.decrypt_Ecb_Padding(K1,cipherResult.C2);
                } else {
                    M = SM9Method.xor(cipherResult.C2,K1);
                }

                //step4:C3`=MAC(K2,C2)
                byte[] u = SM9Method.MAC(K2,cipherResult.C2);

                //step5:C3=C3` OUT M
                if (!SM9Method.byteEqual(u,cipherResult.C3)) {
                    throw new RuntimeException("C3 verify failed");
                } else {
                    return M;
                }
            }
        }
    }
}
