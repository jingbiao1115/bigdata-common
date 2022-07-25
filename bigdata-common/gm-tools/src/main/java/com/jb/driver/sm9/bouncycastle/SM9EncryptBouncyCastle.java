package com.jb.driver.sm9.bouncycastle;

import com.jb.driver.sm9.core.KeyGenerateCenter;
import com.jb.driver.sm9.core.KeyParse;
import com.jb.driver.sm9.core.SM9Curve;
import com.jb.driver.sm9.key.SM9MasterKeyPair;
import com.jb.driver.sm9.key.SM9PrivateKey;
import com.jb.driver.sm9.method.SM9Method;
import com.jb.model.result.SM9CipherResult;
import com.jb.utils.SM4Utils;
import it.unisa.dia.gas.jpbc.Element;
import it.unisa.dia.gas.plaf.jpbc.field.curve.CurveElement;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.encoders.Hex;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;

/**
 * @author zhaojb
 * SM9加密类
 */
public class SM9EncryptBouncyCastle {
    private final SM9Curve sm9Curve = new SM9Curve();

    private final KeyGenerateCenter keyGenerateCenter = new KeyGenerateCenter(sm9Curve);

    private final KeyParse keyParse = new KeyParse(sm9Curve);

    ////////////////////////////////////////////////////////////////////////////////
    // 加密
    ////////////////////////////////////////////////////////////////////////////////

    /**
     * 加密
     *
     * @return
     * @throws Exception
     */
    private SM9CipherResult encrypt(SM9MasterKeyPair.MasterPublicKey masterPublicKey,String id,
                                    byte[] data,
                                    boolean isBaseBlockCipher,int macKeyByteLen) throws IOException,
            IllegalBlockSizeException, NoSuchPaddingException, BadPaddingException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException {

        //////////////////////////////////////// 密钥封装start////////////////////////////////////////

        // hB = H1(IDB||hid,N)
        BigInteger hB = SM9Method.bigIntegerH1(id,(byte)3,this.sm9Curve.getBigIntegerN());

        // step1:QB = [hB]P1+Ppub
        CurveElement curveQB =
                this.sm9Curve.getCurveP1().duplicate().mul(hB).add(masterPublicKey.Q);

        CurveElement curveC1;
        byte[] bytesK1;
        byte[] bytesK2;
        do {
            // step2:Rand r 被包含于[1,N-1]
            BigInteger r = SM9Method.genRandom(this.sm9Curve.getRandom(),
                    this.sm9Curve.getBigIntegerN());

            // step3:C1= [r]QB
            curveC1 = curveQB.mul(r);

            // step4:g = e(Ppub,P2)
            Element g = this.sm9Curve.pairing(masterPublicKey.Q,this.sm9Curve.getCurveP2());
            // step5:w=g^r
            Element w = g.duplicate().pow(r);

            // step6.0:拼接C1||w||IDB

            int k1Len = 16;
            if (!isBaseBlockCipher) {
                k1Len = data.length;
            }
            try (ByteArrayOutputStream bos = new ByteArrayOutputStream();) {
                byte[] temp = SM9Method.curveFieldG1ToBytes(curveC1);
                bos.write(temp,0,temp.length);
                temp = SM9Method.gtFiniteToByte(w);
                bos.write(temp,0,temp.length);
                temp = id.getBytes(StandardCharsets.UTF_8);
                bos.write(temp,0,temp.length);

                // step6.1:K1||K2 = KDF(C1||w||IDB,klen)
                byte[] bytesK = SM9Method.bytesKdf(bos.toByteArray(),k1Len + macKeyByteLen);
                bytesK1 = Arrays.copyOfRange(bytesK,0,k1Len);
                bytesK2 = Arrays.copyOfRange(bytesK,k1Len,bytesK.length);
            } catch (IOException e) {
                throw new IOException(e);
            }

        } while (SM9Method.isAllZero(bytesK1));

        //////////////////////////////////////// 密钥封装End////////////////////////////////////////

        // step6.2: C2=Enc(K1,M)
        byte[] bytesC2;
        if (isBaseBlockCipher) {
            bytesC2 = SM4Utils.encryptEcbPadding(bytesK1,data);
            // C2 = SM4.ecbCrypt(true, K1, data, 0, data.length);
        } else {
            bytesC2 = SM9Method.xor(data,bytesK1);
        }

        // step7:C3=MAC(K2,C2)
        byte[] bytesC3 = SM9Method.bytesMac(bytesK2,bytesC2);

        // step8:C=C1||C2||C3
        return new SM9CipherResult(curveC1,bytesC2,bytesC3);
    }

    /**
     * 使用主公钥加密
     */
    public SM9CipherResult encrypt(String id,
            String masterPublicKey,String msg) throws Exception {

        return encrypt(
                id,
                keyParse.parseMasterPublicKey(masterPublicKey),
                msg);
    }

    public SM9CipherResult encrypt(String id,
            SM9MasterKeyPair.MasterPublicKey masterPublicKey,
            String msg) throws Exception {

        return encrypt(
                masterPublicKey,
                id,
                msg.getBytes(StandardCharsets.UTF_8),
                false,
                32);
    }

    ////////////////////////////////////////////////////////////////////////////////
    // 解密
    ////////////////////////////////////////////////////////////////////////////////

    /**
     * 使用主私钥解密
     */
    public String masterPrivateKeyDecrypt(String id,String masterPrivateKey,
            String cipherText) throws IOException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, BadPaddingException, InvalidKeyException, NoSuchProviderException {

        return decrypt(
                id,
                keyGenerateCenter.genPrivateKey(
                        KeyParse.parseMasterPrivateKey(masterPrivateKey),
                        id,
                        SM9PrivateKey.PrivateKeyType.KEY_ENCRYPT),
                cipherText);
    }

    /**
     * 使用用户私钥解密
     */
    public String userPrivateDecrypt(String id,String privateKey,
            String cipherText) throws IOException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, BadPaddingException, InvalidKeyException, NoSuchProviderException {

        return decrypt(
                id,
                keyParse.parsePrivateKey(privateKey),
                cipherText);
    }

    public String decrypt(String id,SM9PrivateKey privateKey,
            String cipherText) throws IOException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, BadPaddingException, InvalidKeyException, NoSuchProviderException {

        return decrypt(id,privateKey,SM9CipherResult.fromByteArray(sm9Curve,
                Hex.decode(cipherText)));
    }

    /**
     * 使用主密钥解密
     */
    public String decrypt(String id,SM9PrivateKey privateKey,
            SM9CipherResult cipherResult) throws IOException, NoSuchPaddingException,
            IllegalBlockSizeException, NoSuchAlgorithmException, BadPaddingException, InvalidKeyException, NoSuchProviderException {

        return new String(
                decrypt(
                        cipherResult,
                        privateKey,
                        id,
                        false,
                        32),
                StandardCharsets.UTF_8);
    }

    /**
     * 解密
     */
    public byte[] decryptParamBytes(
            byte[] cipherBytes,SM9PrivateKey privateKey,String id,
            boolean isBaseBlockCipher,int macKeyByteLen) throws IOException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, BadPaddingException, InvalidKeyException, NoSuchProviderException {

        byte[] bytesC1XY = new byte[64];
        System.arraycopy(cipherBytes,0,bytesC1XY,0,64);

        byte[] bytesC3 = new byte[32];
        System.arraycopy(cipherBytes,64,bytesC3,0,32);

        byte[] bytesC2 = new byte[4];
        System.arraycopy(cipherBytes,96,bytesC2,0,4);

        // 将byte转成CurveElement,这个转换找了一整个下午
        CurveElement curveC1 =
                (CurveElement)this.sm9Curve.getCurveFieldG1().newElementFromBytes(bytesC1XY);

        return decrypt(new SM9CipherResult(curveC1,bytesC2,bytesC3),privateKey,id,isBaseBlockCipher,
                macKeyByteLen);

    }

    public byte[] decrypt(SM9CipherResult cipherResult,SM9PrivateKey privateKey,String id,
            boolean isBaseBlockCipher,int macKeyByteLen) throws IOException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, BadPaddingException, InvalidKeyException, NoSuchProviderException {
        if (!cipherResult.getCurveC1().isValid()) {
            throw new RuntimeException("C1 is not on G1 group");
        } else {

            //////////////////////////////////////// 密钥解封start//////////////////////////////////////

            // step1:C1 被包含于G1?
            // step2:w=e(C1,dB) dB是用户私钥
            Element w = this.sm9Curve.pairing(cipherResult.getCurveC1(),privateKey.d);

            // step3:拼接C1||w||IDB
            int k1Len = 16;
            if (!isBaseBlockCipher) {
                k1Len = cipherResult.getBytesC2().length;
            }

            byte[] bytesK1;
            byte[] bytesK2;
            try (ByteArrayOutputStream bos = new ByteArrayOutputStream()) {
                byte[] temp = SM9Method.curveFieldG1ToBytes(cipherResult.getCurveC1());
                bos.write(temp,0,temp.length);
                temp = SM9Method.gtFiniteToByte(w);
                bos.write(temp,0,temp.length);
                temp = id.getBytes(StandardCharsets.UTF_8);
                bos.write(temp,0,temp.length);

                // step3.1: K1||K2 = KDF(C1||w||IDB,klen)
                byte[] bytesK = SM9Method.bytesKdf(bos.toByteArray(),k1Len + macKeyByteLen);
                bytesK1 = Arrays.copyOfRange(bytesK,0,k1Len);
                bytesK2 = Arrays.copyOfRange(bytesK,k1Len,bytesK.length);
            } catch (IOException e) {
                throw new IOException(e);
            }

            //////////////////////////////////////// 密钥解封End//////////////////////////////////////

            if (SM9Method.isAllZero(bytesK1)) {
                throw new RuntimeException("K1 is all zero");
            } else {
                byte[] bytesM;

                // step3.2:M=Dec(K1,C2)
                if (isBaseBlockCipher) {
                    bytesM = SM4Utils.decryptEcbPadding(bytesK1,cipherResult.getBytesC2());
                } else {
                    bytesM = SM9Method.xor(cipherResult.getBytesC2(),bytesK1);
                }

                // step4:C3`=MAC(K2,C2)
                byte[] u = SM9Method.bytesMac(bytesK2,cipherResult.getBytesC2());

                // step5:C3=C3` OUT M
                if (!SM9Method.byteEqual(u,cipherResult.getBytesC3())) {
                    throw new RuntimeException("C3 verify failed");
                } else {
                    return bytesM;
                }
            }
        }
    }
}
