package com.jb.sm9;

import com.jb.enums.Sm9KeyEnum;
import com.jb.sm9.core.KeyGenerateCenter;
import com.jb.sm9.core.SM9;
import com.jb.sm9.core.SM9Curve;
import com.jb.sm9.enity.Sm9KeyPair;
import com.jb.sm9.enity.Sm9SignKey;
import com.jb.sm9.key.Sm9MasterKeyPair;
import com.jb.sm9.key.Sm9PrivateKey;
import com.jb.sm9.result.CipherResult;
import com.jb.sm9.result.SignResult;
import org.bouncycastle.util.encoders.Hex;

import java.nio.charset.StandardCharsets;

/**
 * @author zhaojb
 * SM9工具
 * 支持SM9加密,签名
 */
public class SM9Utils {

    ////////////////////////////////////////加密密钥////////////////////////////////////////

    /**
     * 加密注册,返回主密钥对十六进制字符串
     */
    public static Sm9KeyPair register(String IBE_Identify) throws Exception {
        return new SM9EncryptBouncyCastle().register(IBE_Identify);
    }


    ////////////////////////////////////////加密////////////////////////////////////////

    /**
     * 使用标识ID,主密钥对或主公钥加密
     */
    public static String encrypt(String IBE_Identify,String key,Sm9KeyEnum keyType,String msg) throws Exception {

        switch (keyType.getCode()) {
            case 0:
                return Hex.toHexString(
                        new SM9EncryptBouncyCastle().masterKeyEncrypt(
                                IBE_Identify,
                                key,msg
                        ).toByteArray());
            case 3:
                return Hex.toHexString(
                        new SM9EncryptBouncyCastle().masterPublicKeyEncrypt(
                                IBE_Identify,
                                key,msg
                        ).toByteArray());
            default:
                throw new Exception("Not support public key type");
        }
    }


    ////////////////////////////////////////解密////////////////////////////////////////

    /**
     * 使用标识ID,用户私钥或主私钥解密
     */
    public static String decrypt(String IBE_Identify,String key,Sm9KeyEnum keyType,
            String cipherText) throws Exception {
        switch (keyType.getCode()) {
            case 0:
                return new SM9EncryptBouncyCastle().masterKeyDecrypt(
                        IBE_Identify,
                        key,
                        cipherText
                );
            case 1:
                return new SM9EncryptBouncyCastle().masterPrivateKeyDecrypt(
                        IBE_Identify
                        ,key,
                        cipherText
                );
            case 2:
                return new SM9EncryptBouncyCastle().userPrivateDecrypt(
                        IBE_Identify,
                        key,
                        cipherText
                );

            default:
                throw new Exception("Not support private key type");
        }
    }


    ////////////////////////////////////////签名密钥////////////////////////////////////////

    /**
     * 获取签名密钥
     */
    public static Sm9SignKey getSignKey(String IBE_Identify) throws Exception {
        return new SM9SignBouncyCastle().generateSignKey(IBE_Identify);
    }


    ////////////////////////////////////////签名////////////////////////////////////////

    /**
     * 签名
     */
    public static String sign(String masterPublicKey,String privateKey,
            String sign) throws Exception {

        return new SM9SignBouncyCastle().sign(
                masterPublicKey,
                privateKey,
                sign
        );
    }

    public static SignResult sign(Sm9MasterKeyPair.MasterPublicKey masterPublicKey,
            Sm9PrivateKey privateKey,byte[] sign) {

        return new SM9SignBouncyCastle().sign(
                masterPublicKey,
                privateKey,
                sign
        );
    }


    ////////////////////////////////////////验签////////////////////////////////////////

    /**
     * 验签
     */
    public static boolean verifySign(String IBE_Identify,String masterPublicKey,String sign,
            String signResult) {

        return new SM9SignBouncyCastle().verify(
                IBE_Identify,
                masterPublicKey,
                sign,
                signResult
        );
    }

    public static boolean verifySign(String IBE_Identify,
            Sm9MasterKeyPair.MasterPublicKey masterPublicKey,byte[] sign,
            SignResult signature) {

        return new SM9SignBouncyCastle().verify(
                IBE_Identify,
                masterPublicKey,
                sign,
                signature
        );
    }


    /**
     * SM9加密内部类
     */
    public static class SM9EncryptBouncyCastle {
        private final SM9Curve sm9Curve = new SM9Curve();

        private final KeyGenerateCenter keyGenerateCenter = new KeyGenerateCenter(sm9Curve);

        private final SM9 sm9 = new SM9(sm9Curve);

        ////////////////////////////////////////注册////////////////////////////////////////

        /**
         * 注册,生成主密钥、用户私钥
         */
        public Sm9KeyPair register(String IBE_Identify) throws Exception {
            // 加密公钥
            Sm9MasterKeyPair encryptMasterKeyPair = keyGenerateCenter.genEncryptMasterKeyPair();
            Sm9MasterKeyPair.MasterPublicKey publicKey = encryptMasterKeyPair.getPublicKey();
            Sm9MasterKeyPair.MasterPrivateKey privateKey = encryptMasterKeyPair.getPrivateKey();

            // 用户公钥即 IBE_Identify
            // 用户私钥
            Sm9PrivateKey encryptPrivateKey =
                    keyGenerateCenter.genPrivateKey(
                            privateKey,
                            IBE_Identify,
                            Sm9PrivateKey.PrivateKeyType.KEY_ENCRYPT
                    );

            return new Sm9KeyPair(
                    IBE_Identify,
                    Hex.toHexString(encryptPrivateKey.toByteArray()),
                    Hex.toHexString(encryptMasterKeyPair.toByteArray()),
                    Hex.toHexString(publicKey.toByteArray()),
                    Hex.toHexString(privateKey.toByteArray())
            );
        }


        ////////////////////////////////////////加密////////////////////////////////////////

        /**
         * 使用主公钥加密
         */
        public CipherResult masterPublicKeyEncrypt(String IBE_Identify,
                String masterPublicKey,String msg) throws Exception {

            return encrypt(
                    IBE_Identify,
                    sm9.parseMasterPublicKey(masterPublicKey),
                    msg
            );
        }

        /**
         * 使用主密钥加密
         */
        public CipherResult masterKeyEncrypt(String IBE_Identify,String masterKey,
                String msg) throws Exception {

            return encrypt(
                    IBE_Identify,
                    this.sm9.parseMasterKey(masterKey).getPublicKey(),
                    msg);
        }

        public CipherResult encrypt(String IBE_Identify,
                Sm9MasterKeyPair.MasterPublicKey masterPublicKey,
                String msg) throws Exception {

            return sm9.encrypt(
                    masterPublicKey,
                    IBE_Identify,
                    msg.getBytes(),
                    false,
                    32
            );
        }

        ////////////////////////////////////////解密////////////////////////////////////////

        /**
         * 使用主私钥解密
         */
        public String masterPrivateKeyDecrypt(String IBE_Identify,String masterPrivateKey,
                String cipherText) throws Exception {

            return decrypt(
                    IBE_Identify,
                    keyGenerateCenter.genPrivateKey(
                            sm9.parseMasterPrivateKey(masterPrivateKey),
                            IBE_Identify,
                            Sm9PrivateKey.PrivateKeyType.KEY_ENCRYPT),
                    cipherText
            );
        }

        /**
         * 使用主私钥解密
         */
        public String masterKeyDecrypt(String IBE_Identify,String masterKey,
                String cipherText) throws Exception {

            return decrypt(
                    IBE_Identify,
                    keyGenerateCenter.genPrivateKey(
                            sm9.parseMasterKey(masterKey).getPrivateKey(),
                            IBE_Identify,
                            Sm9PrivateKey.PrivateKeyType.KEY_ENCRYPT),
                    cipherText);
        }

        /**
         * 使用用户私钥解密
         */
        public String userPrivateDecrypt(String IBE_Identify,String privateKey,
                String cipherText) throws Exception {

            return decrypt(
                    IBE_Identify,
                    this.sm9.parsePrivateKey(privateKey),
                    cipherText);
        }

        public String decrypt(String IBE_Identify,Sm9PrivateKey privateKey,
                String cipherText) throws Exception {

            return new String(
                    sm9.decryptParamBytes(
                            Hex.decode(cipherText),
                            privateKey,IBE_Identify,
                            false,32),
                    StandardCharsets.UTF_8
            );
        }

        /**
         * 使用主密钥解密
         */
        public String decrypt(String IBE_Identify,Sm9MasterKeyPair masterKeyPair,
                CipherResult cipherResult) throws Exception {

            return new String(
                    sm9.decrypt(
                            cipherResult,
                            keyGenerateCenter.genPrivateKey(
                                    masterKeyPair.getPrivateKey(),
                                    IBE_Identify,
                                    Sm9PrivateKey.PrivateKeyType.KEY_ENCRYPT),
                            IBE_Identify,
                            false,
                            32),
                    StandardCharsets.UTF_8
            );
        }
    }

    /**
     * SM9签名内部类
     */
    public static class SM9SignBouncyCastle {
        private final SM9Curve sm9Curve = new SM9Curve();

        private final KeyGenerateCenter keyGenerateCenter = new KeyGenerateCenter(sm9Curve);

        private final SM9 sm9 = new SM9(sm9Curve);

        ////////////////////////////////////////生成签名密钥////////////////////////////////////////

        /**
         * 生成签名密钥
         */
        public Sm9SignKey generateSignKey(String IBE_Identify) throws Exception {
            Sm9MasterKeyPair sm9MasterKeyPair = keyGenerateCenter.genSignMasterKeyPair();

            Sm9MasterKeyPair.MasterPublicKey masterPublicKey = sm9MasterKeyPair.getPublicKey();

            Sm9PrivateKey privateKey =
                    keyGenerateCenter.genPrivateKey(sm9MasterKeyPair.getPrivateKey(),
                            IBE_Identify,Sm9PrivateKey.PrivateKeyType.KEY_SIGN);

            return new Sm9SignKey(
                    Hex.toHexString(privateKey.toByteArray()),
                    Hex.toHexString(masterPublicKey.toByteArray())
            );
        }

        ////////////////////////////////////////签名////////////////////////////////////////

        /**
         * 使用主公钥,用户私钥签名
         */
        public String sign(String masterPublicKey,String privateKey,
                String sign) throws Exception {

            return Hex.toHexString(
                    sign(
                            sm9.parseMasterPublicKey(masterPublicKey),
                            sm9.parsePrivateKey(privateKey),
                            sign.getBytes(StandardCharsets.UTF_8)
                    ).toByteArray()
            );
        }

        public SignResult sign(Sm9MasterKeyPair.MasterPublicKey masterPublicKey,
                Sm9PrivateKey privateKey,byte[] sign) {

            return sm9.sign(
                    masterPublicKey,
                    privateKey,sign
            );
        }

        ////////////////////////////////////////验签////////////////////////////////////////

        /**
         * 使用标识,主公钥验签
         */
        public Boolean verify(String IBE_Identify,String masterPublicKey,String sign,
                String signResult) {

            return verify(
                    IBE_Identify,
                    sm9.parseMasterPublicKey(masterPublicKey),
                    sign.getBytes(StandardCharsets.UTF_8),
                    sm9.parseSign(signResult)
            );
        }

        public Boolean verify(String IBE_Identify,
                Sm9MasterKeyPair.MasterPublicKey masterPublicKey,byte[] sign,
                SignResult signature) {

            return sm9.verify(
                    masterPublicKey,
                    IBE_Identify,
                    sign,
                    signature
            );
        }

    }

    public static void main(String[] args) throws Exception {

        String IBE_Identify = "123456";
//        Sm9KeyPair sm9KeyPair = register(IBE_Identify);
//        System.out.println(sm9KeyPair);

        /**
         * privateKey
         * :037c9990bd105e4b1bf5a2010c51d1023518428227eda59da1eb24a2b57631cb9356b2c0433d089108e5288652cc2459410d97e0eda755359dc6b077ea41ae5381a0a8480bb50f7d180b424672851557017ac2a501f3493f6d7b27495919af9ff3b2a28d19d7e14133711a2a5b15ba860afdc6c3f7550eccc5ddc4169f3d471b9d
         * masterKey
         * :6ebe257db2f01a55121c9325027c61497c9e95f9b0f0b62c0d1ea4f72d987f920086533837bd80148b7093ee65059933db05f5ba977b2921a43ed993f31fd3aa8e1b9edf2fbf2b5d4feceb5915def745ca432e88f91da59c814ccd18d415cfbec8
         *
         */
//        String privateKey =
//                "037c9990bd105e4b1bf5a2010c51d1023518428227eda59da1eb24a2b57631cb9356b2c0433d089108e5288652cc2459410d97e0eda755359dc6b077ea41ae5381a0a8480bb50f7d180b424672851557017ac2a501f3493f6d7b27495919af9ff3b2a28d19d7e14133711a2a5b15ba860afdc6c3f7550eccc5ddc4169f3d471b9d";
//        String masterKey =
//                "6ebe257db2f01a55121c9325027c61497c9e95f9b0f0b62c0d1ea4f72d987f920086533837bd80148b7093ee65059933db05f5ba977b2921a43ed993f31fd3aa8e1b9edf2fbf2b5d4feceb5915def745ca432e88f91da59c814ccd18d415cfbec8";
//
//        String masterPublicKey =
//                "006068619c2754d4dcf4c28d9aa37c124ca6335608441a9008cc28748b6c79e11e4c6d32b63ddcf6a370a2ed886bd5a19bcde96b4d35147d7ef1ce74564b7e62b4";
//
//        String masterPrivateKey =
//                "147fc283ab6d369c429a03c0eb43e4d2e11a607138a3352a09baa8d2349578a1";

//        String cipherText = SM9Utils.encrypt(IBE_Identify,masterKey,Sm9KeyEnum.MASTER_KEY_PAIR,
//                "csii");
//
//        System.out.println(SM9Utils.decrypt("123456",masterKey,Sm9KeyEnum.MASTER_KEY_PAIR,
//                cipherText));

        //////////////////////////////////////验签/////////////////////////////////////////

        String privateKeySign =
                "0195b2d0b08bcf22df89421c67fedb644eda35233f9fef019a418136584c11a3630b4c13bf318707314267e4b79eb5d32ac66075cdb93ec8a71b393fb0a8eafb2c";
        String masterPublicKeySign =
                "0195a7a3d1d3fe9c7ae5589bd1baa6caa57b058169e9d42fdbc0c4116673f464103f7aeb853aeba772a56c8bf731c9560490fe4dbbcd4d58e532af473b4b1c141370126c9112e6e1f8a3248b06c8a69e3539032619e03038952854b9f5c82bf65f39ee4883485c6f7edef7921704e8bc9ae60a87aa5d756d5a238e15ecd9c23776";


        String sign = "hello";
        String signString = SM9Utils.sign(masterPublicKeySign,privateKeySign,sign);
        System.out.println(signString);
        System.out.println(SM9Utils.verifySign(IBE_Identify,masterPublicKeySign,sign,signString));


    }


}
