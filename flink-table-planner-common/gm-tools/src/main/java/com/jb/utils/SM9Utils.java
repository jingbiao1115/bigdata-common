package com.jb.utils;

import com.jb.driver.sm9.bouncycastle.SM9EncryptBouncyCastle;
import com.jb.driver.sm9.bouncycastle.SM9ExchangeBouncyCastle;
import com.jb.driver.sm9.bouncycastle.SM9SignBouncyCastle;
import com.jb.driver.sm9.core.KeyParse;
import com.jb.driver.sm9.key.SM9MasterKeyPair;
import com.jb.driver.sm9.key.SM9PrivateKey;
import com.jb.model.enity.MasterKeyPair;
import com.jb.model.enity.SM9KeyPair;
import com.jb.model.parameter.SM9ExchangeInitiatorKdfParameter;
import com.jb.model.parameter.SM9ExchangeResponderKdfParameter;
import com.jb.model.result.SM9ExchangeInitiatorKdfResult;
import com.jb.model.result.SM9ExchangeInitiatorRandomResult;
import com.jb.model.result.SM9ExchangeResponderKdfResult;
import com.jb.model.result.SM9SignResult;
import org.bouncycastle.util.encoders.Hex;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;

/**
 * @author zhaojb
 * SM9工具
 * 支持SM9加密,签名,交换
 */
public class SM9Utils {

    private SM9Utils() {
        throw new IllegalStateException("Utility class");
    }

    ////////////////////////////////////////////////////////////////////////////////
    // 生成密钥
    ////////////////////////////////////////////////////////////////////////////////

    /**
     * 生成加密或交换主密钥对
     */
    public static MasterKeyPair generateMasterKeyPair() {
        return new KeyParse().generateMasterKeyPair();
    }

    /**
     * 生成签名主密钥对
     */
    public static MasterKeyPair generateSignMasterKeyPair() {
        return new KeyParse().generateSignMasterKeyPair();
    }

    /**
     * 生成用户私钥
     */
    public static String generatePrivateKey(String masterPrivateKey,String id,
            SM9PrivateKey.PrivateKeyType privateKeyType) {

        return KeyParse.generatePrivateKey(masterPrivateKey,id,privateKeyType);
    }

    /**
     * 生成主密钥对+用户私钥
     */
    public static SM9KeyPair generateKeyPair(String id,
                                             SM9PrivateKey.PrivateKeyType privateKeyType) {

        MasterKeyPair masterKeyPair = null;

        if (privateKeyType.getCode() == 1) {
            // 签名
            masterKeyPair = generateSignMasterKeyPair();
        } else {
            masterKeyPair = generateMasterKeyPair();
        }

        String masterPublic = masterKeyPair.getMasterPublic();
        String masterPrivate = masterKeyPair.getMasterPrivate();

        String privateKey = generatePrivateKey(masterPrivate,id,privateKeyType);

        return new SM9KeyPair(masterPublic,masterPrivate,id,privateKey);
    }

    ////////////////////////////////////////////////////////////////////////////////
    // 加密
    ////////////////////////////////////////////////////////////////////////////////

    /**
     * 主公钥加密
     */
    public static String encrypt(String id,String masterPublicKey,String msg) throws Exception {

        return Hex.toHexString(new SM9EncryptBouncyCastle().encrypt(id,masterPublicKey,msg).toByteArray());

    }

    ////////////////////////////////////////////////////////////////////////////////
    // 解密
    ////////////////////////////////////////////////////////////////////////////////

    /**
     * 主私钥解密
     */
    public static String masterPrivateKeyDecrypt(String id,String masterPrivateKey,
            String cipherText) throws NoSuchPaddingException, IllegalBlockSizeException,
            IOException, NoSuchAlgorithmException, BadPaddingException, InvalidKeyException,
            NoSuchProviderException {

        return new SM9EncryptBouncyCastle().masterPrivateKeyDecrypt(id,masterPrivateKey,cipherText);
    }

    /**
     * 私钥解密
     */
    public static String userPrivateDecrypt(String id,String privateKey,String cipherText) throws NoSuchPaddingException, IllegalBlockSizeException, IOException, NoSuchAlgorithmException, BadPaddingException, InvalidKeyException, NoSuchProviderException {

        return new SM9EncryptBouncyCastle().userPrivateDecrypt(id,privateKey,cipherText);
    }

    ////////////////////////////////////////////////////////////////////////////////
    // 签名
    ////////////////////////////////////////////////////////////////////////////////

    /**
     * 签名
     */
    public static String sign(String masterPublicKey,String privateKey,String sign) {

        return SM9SignBouncyCastle.builder().sign(masterPublicKey,privateKey,sign);
    }

    public static SM9SignResult sign(SM9MasterKeyPair.MasterPublicKey masterPublicKey,
                                     SM9PrivateKey privateKey,byte[] sign) {

        return SM9SignBouncyCastle.builder().sign(masterPublicKey,privateKey,sign);
    }

    ////////////////////////////////////////////////////////////////////////////////
    // 验签
    ////////////////////////////////////////////////////////////////////////////////

    /**
     * 验签
     */
    public static boolean verifySign(String id,String masterPublicKey,String sign,
            String signResult) {

        return SM9SignBouncyCastle.builder().verify(id,masterPublicKey,sign,signResult);
    }

    public static boolean verifySign(String id,
            SM9MasterKeyPair.MasterPublicKey masterPublicKey,byte[] sign,SM9SignResult signature) {

        return SM9SignBouncyCastle.builder().verify(id,masterPublicKey,sign,signature);
    }

    ////////////////////////////////////////////////////////////////////////////////
    // 交换协商
    ////////////////////////////////////////////////////////////////////////////////

    /**
     * 初始化交换协商
     */


    /**
     * 发起方生成交换数据
     */
    public static SM9ExchangeInitiatorRandomResult initiatorGenerateR(
            String masterPublicKey,
            String masterPrivateKey,
            String idb) {

        return SM9ExchangeBouncyCastle.builder(masterPublicKey,masterPrivateKey).initiatorGenerateRA(idb);
    }

    /**
     * 响应方计算SB,RA,共享密钥
     */
    public static SM9ExchangeResponderKdfResult responderKdf(String masterPublicKey,
                                                             String masterPrivateKey,
                                                             SM9ExchangeResponderKdfParameter responderKdfParameter) {

        return SM9ExchangeBouncyCastle.builder(masterPublicKey,masterPrivateKey).responderKdf(responderKdfParameter);
    }

    /**
     * 发起方计算SA,共享密钥,密钥确认
     */
    public static SM9ExchangeInitiatorKdfResult initiatorAck(String masterPublicKey,
                                                             String masterPrivateKey,
                                                             SM9ExchangeInitiatorKdfParameter parameter) {

        return SM9ExchangeBouncyCastle.builder(masterPublicKey,masterPrivateKey)
                .initiatorAck(parameter);
    }

    /**
     * 响应方密钥确认
     */
    public static boolean responderAck(String sa,String s2) {

        return SM9ExchangeBouncyCastle.responderAck(sa,s2);
    }


//    public static void main(String[] args) throws Exception {
//
//        String IDA = "123456";
//        String IDB = "789012";
//        String msg = "adasa12121212121111111111111111";
//        String sign = "hello hadoop";
//
//        //加密
//        SM9KeyPair sm9KeyPair = generateKeyPair(IDA,SM9PrivateKey.PrivateKeyType.KEY_ENCRYPT);
//        String masterPublic = sm9KeyPair.getMasterPublic();
//        String masterPrivate = sm9KeyPair.getMasterPrivate();
//        String privateKey = sm9KeyPair.getPrivateKey();
//
//        String encrypt = encrypt(IDA,masterPublic,msg);
//
//        System.out.println("===========加密============");
//        System.out.println(userPrivateDecrypt(IDA,privateKey,encrypt));
//        System.out.println(masterPrivateKeyDecrypt(IDA,masterPrivate,encrypt));


//        //签名
//        System.out.println("===========签名============");
//        SM9KeyPair signSm9KeyPair = generateKeyPair(IDA,SM9PrivateKey.PrivateKeyType.KEY_SIGN);
//        String masterPublicSign = signSm9KeyPair.getMasterPublic();
//        String masterPrivateSign = signSm9KeyPair.getMasterPrivate();
//        String privateKeySign = signSm9KeyPair.getPrivateKey();
//
//        String signString = sign(masterPublicSign,privateKeySign,sign);
//        System.out.println(verifySign(IDA,masterPublicSign,sign,signString));


//       //交换
//        System.out.println("===========交换============");
//        MasterKeyPair masterKeyPair = generateMasterKeyPair();
//
//        String masterPublic = masterKeyPair.getMasterPublic();
//        String masterPrivate = masterKeyPair.getMasterPrivate();
//
//        SM9ExchangeInitiatorRandomResult aTemp = initiatorGenerateR(masterPublic,masterPrivate,
//        IDB);
//
//        SM9ExchangeResponderKdfParameter responderKdfParameter =
//                new SM9ExchangeResponderKdfParameter();
//        responderKdfParameter.setIdA(IDA);
//        responderKdfParameter.setStringRA(aTemp.getStringRA());
//        responderKdfParameter.setIdB(IDB);
//        responderKdfParameter.setkLen(32);
//        SM9ExchangeResponderKdfResult bTemp = responderKdf(masterPublic,masterPrivate,
//                responderKdfParameter);
//
//        System.out.println(bTemp.getStringSKB());
//
//        SM9ExchangeInitiatorKdfParameter parameter = new SM9ExchangeInitiatorKdfParameter();
//        parameter.setrA(aTemp.getrA());
//        parameter.setIdA(IDA);
//        parameter.setStringRB(bTemp.getStringRB());
//        parameter.setStringSB(bTemp.getStringSB());
//        parameter.setkLen(32);
//        parameter.setIdB(IDB);
//        parameter.setStringRA(aTemp.getStringRA());
//
//
//        SM9ExchangeInitiatorKdfResult initiatorACK = initiatorAck(masterPublic,masterPrivate,
//                parameter);
//
//        System.out.println(initiatorACK.getAck());
//        System.out.println(initiatorACK.getStringSKA());
//
//        boolean responderAck = responderAck(initiatorACK.getStringSA(),bTemp.getStringS2());
//
//        System.out.println(responderAck);


//    }


}
