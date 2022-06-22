package com.jb.sm9;

import com.jb.enums.ExchangeEnum;
import com.jb.sm9.bouncyCastle.SM9EncryptBouncyCastle;
import com.jb.sm9.bouncyCastle.SM9ExchangeBouncyCastle;
import com.jb.sm9.bouncyCastle.SM9SignBouncyCastle;
import com.jb.sm9.core.*;
import com.jb.sm9.enity.*;
import com.jb.sm9.key.SM9MasterKeyPair;
import com.jb.sm9.key.SM9PrivateKey;
import com.jb.sm9.result.SignResult;
import org.bouncycastle.util.encoders.Hex;

import java.math.BigInteger;


/**
 * @author zhaojb
 * SM9工具
 * 支持SM9加密,签名
 */
public class SM9Utils {

    ////////////////////////////////////////////////////////////////////////////////
    //生成密钥
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
            SM9PrivateKey.PrivateKeyType privateKeyType) throws Exception {

        return KeyParse.generatePrivateKey(masterPrivateKey,id,privateKeyType);
    }

    /**
     * 生成主密钥对+用户私钥
     */
    public static SM9KeyPair generateKeyPair(String id,
            SM9PrivateKey.PrivateKeyType privateKeyType) throws Exception {

        MasterKeyPair masterKeyPair = null;

        if (privateKeyType.getCode() == 1) {
            //签名
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
    //加密
    ////////////////////////////////////////////////////////////////////////////////

    /**
     * 主公钥加密
     */
    public static String encrypt(String id,String masterPublicKey,String msg) throws Exception {

        return Hex.toHexString(new SM9EncryptBouncyCastle().encrypt(id,masterPublicKey,msg).toByteArray());

    }


    ////////////////////////////////////////////////////////////////////////////////
    //解密
    ////////////////////////////////////////////////////////////////////////////////

    /**
     * 主私钥解密
     */
    public static String masterPrivateKeyDecrypt(String id,String masterPrivateKey,
            String cipherText) throws Exception {

        return new SM9EncryptBouncyCastle().masterPrivateKeyDecrypt(id,masterPrivateKey,cipherText);
    }

    /**
     * 私钥解密
     */
    public static String userPrivateDecrypt(String id,String privateKey,String cipherText) throws Exception {

        return new SM9EncryptBouncyCastle().userPrivateDecrypt(id,privateKey,cipherText);
    }


    ////////////////////////////////////////////////////////////////////////////////
    //签名
    ////////////////////////////////////////////////////////////////////////////////

    /**
     * 签名
     */
    public static String sign(String masterPublicKey,String privateKey,String sign) throws Exception {

        return SM9SignBouncyCastle.builder().sign(masterPublicKey,privateKey,sign);
    }

    public static SignResult sign(SM9MasterKeyPair.MasterPublicKey masterPublicKey,
            SM9PrivateKey privateKey,byte[] sign) {

        return SM9SignBouncyCastle.builder().sign(masterPublicKey,privateKey,sign);
    }


    ////////////////////////////////////////////////////////////////////////////////
    //验签
    ////////////////////////////////////////////////////////////////////////////////

    /**
     * 验签
     */
    public static boolean verifySign(String id,String masterPublicKey,String sign,
            String signResult) {

        return SM9SignBouncyCastle.builder().verify(id,masterPublicKey,sign,signResult);
    }

    public static boolean verifySign(String id,
            SM9MasterKeyPair.MasterPublicKey masterPublicKey,byte[] sign,SignResult signature) {

        return SM9SignBouncyCastle.builder().verify(id,masterPublicKey,sign,signature);
    }


    ////////////////////////////////////////////////////////////////////////////////
    //交换协商
    ////////////////////////////////////////////////////////////////////////////////

    /**
     * 初始化交换协商
     */
    public static SM9ExchangeBouncyCastle initExchange(ExchangeEnum exchangeType,
            String masterPublicKey,
            String masterPrivateKey) {

        return SM9ExchangeBouncyCastle.builder(exchangeType,masterPublicKey,masterPrivateKey);
    }

    public static SM9ExchangeBouncyCastle initExchange(ExchangeEnum exchangeType,
            SM9MasterKeyPair.MasterPublicKey masterPublicKey,
            SM9MasterKeyPair.MasterPrivateKey masterPrivateKey) {

        return SM9ExchangeBouncyCastle.builder(exchangeType,masterPublicKey,masterPrivateKey);
    }


    public static InitiatorTemporary initiatorGenerateR(
            String  masterPublicKey,
            String  masterPrivateKey,
            String IDB) {

        return initExchange(ExchangeEnum.INITIATOR,masterPublicKey,masterPrivateKey).initiatorGenerateRA(IDB);
    }

    public static ResponderTemporary responderKDF(String masterPublicKey,
            String  masterPrivateKey,
            String IDA,String RA,String IDB) throws Exception {

        return initExchange(ExchangeEnum.RESPONDER,masterPublicKey,masterPrivateKey).responderKDF(IDA,RA,IDB);
    }

    public static InitiatorTemporary initiatorACK(String  masterPublicKey,
            String masterPrivateKey,
            String IDA,String RA,BigInteger rA,String IDB,String RB,String SB) throws Exception {

        return initExchange(ExchangeEnum.RESPONDER,masterPublicKey,masterPrivateKey)
                        .initiatorACK(IDA,RA,rA,IDB,RB,SB);
    }

    public static boolean responderAck(String SA,String S2){

        return SM9ExchangeBouncyCastle.responderAck(SA,S2);
    }


    public static void main(String[] args) throws Exception {

//        String IDA = "123456";
//        String IDB = "789012";
//        String msg = "csii12121212121111111111111111";
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


        //交换
//        System.out.println("===========交换============");
//        MasterKeyPair masterKeyPair = generateMasterKeyPair();
//
//        String masterPublic = masterKeyPair.getMasterPublic();
//        String masterPrivate = masterKeyPair.getMasterPrivate();
//
//        InitiatorTemporary aTemp = initiatorGenerateR(masterPublic,masterPrivate,IDB);
//
//        ResponderTemporary bTemp = responderKDF(masterPublic,masterPrivate,IDA,aTemp.RA,IDB);
//
//        InitiatorTemporary initiatorACK = initiatorACK(masterPublic,masterPrivate,IDA,aTemp.RA,aTemp.rA,IDB,bTemp.RB,
//                bTemp.SB);
//
//        System.out.println(initiatorACK.ack);
//
//        boolean responderAck = responderAck(initiatorACK.SA,bTemp.S2);
//
//        System.out.println(responderAck);


    }


}
