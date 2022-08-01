/**
 * @Author: xiezuozhang xiezuozhang@zjipst.com
 * @Description: SM2 工具类
 * @Date: 2022-06-14 17:52:34
* @LastEditors: xiezuozhang xiezuozhang@zjipst.com
* @LastEditTime: 2022-07-05 14:59:14
 */
package com.jb.utils;


import com.jb.model.enity.SM2KeyPair;
import org.bouncycastle.asn1.gm.GMNamedCurves;
import org.bouncycastle.asn1.gm.GMObjectIdentifiers;
import org.bouncycastle.asn1.x9.X9ECParameters;
import org.bouncycastle.crypto.InvalidCipherTextException;
import org.bouncycastle.crypto.engines.SM2Engine;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.crypto.params.ECPrivateKeyParameters;
import org.bouncycastle.crypto.params.ECPublicKeyParameters;
import org.bouncycastle.crypto.params.ParametersWithRandom;
import org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPrivateKey;
import org.bouncycastle.jcajce.provider.asymmetric.ec.BCECPublicKey;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.jce.spec.ECParameterSpec;
import org.bouncycastle.jce.spec.ECPrivateKeySpec;
import org.bouncycastle.jce.spec.ECPublicKeySpec;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.encoders.Hex;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.*;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.InvalidKeySpecException;

/**
 * @author zhaojb
 *         SM2国密工具类
 */
public class SM2Utils {
    private static final String DEFALUT_STD_NAME = "sm2p256v1";

    private SM2Utils() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * 验签
     * 
     * @param prvKey 私钥
     * @param sign   签名-param
     * @return
     * @throws NoSuchAlgorithmException
     * @throws InvalidKeySpecException
     * @throws SignatureException
     * @throws InvalidKeyException
     */
    public static String sign(String prvKey, String sign)
            throws NoSuchAlgorithmException, InvalidKeySpecException, SignatureException, InvalidKeyException {
        return new SignVerify().builder().sign(prvKey, sign);
    }

    /**
     * 验签
     * 
     * @param pubKey     公钥
     * @param sign       签名-param
     * @param signResult 签名-vo
     * @return
     * @throws NoSuchAlgorithmException
     */
    public static Boolean verify(String pubKey, String sign, String signResult)
            throws NoSuchAlgorithmException, SignatureException, InvalidKeySpecException, InvalidKeyException {
        return new SignVerify().builder().verify(pubKey, sign, signResult);
    }

    /**
     * 加载HEX密钥对字符串
     */
    public static class SignVerify {
        private BouncyCastleProvider provider;
        private KeyFactory keyFactory;
        private ECParameterSpec ecParameterSpec;
        private X9ECParameters parameters;

        public SignVerify builder() throws NoSuchAlgorithmException {

            this.provider = new BouncyCastleProvider();

            // 获取SM2相关参数
            this.parameters = GMNamedCurves.getByName(DEFALUT_STD_NAME);

            // 椭圆曲线参数规格
            this.ecParameterSpec = new ECParameterSpec(parameters.getCurve(), parameters.getG(), parameters.getN(),
                    parameters.getH());
            // 获取椭圆曲线KEY生成器
            this.keyFactory = KeyFactory.getInstance("EC", provider);

            return this;
        }

        /**
         * 签名
         * 
         * @param sign
         * @return
         * @throws InvalidKeyException
         * @throws NoSuchAlgorithmException
         * @throws SignatureException
         */
        public String sign(String prvKey, String sign)
                throws InvalidKeyException, NoSuchAlgorithmException, SignatureException, InvalidKeySpecException {
            byte[] bytes = sign.getBytes(StandardCharsets.UTF_8);
            byte[] signBytes;

            // 将私钥HEX字符串转换为X值
            BigInteger bigInteger = new BigInteger(prvKey, 16);

            // 将X值转为私钥KEY对象
            BCECPrivateKey privateKey = (BCECPrivateKey) keyFactory
                    .generatePrivate(new ECPrivateKeySpec(bigInteger, ecParameterSpec));

            // 创建签名对象
            Signature signature = Signature.getInstance(GMObjectIdentifiers.sm2sign_with_sm3.toString(), provider);

            // 初始化为签名状态
            signature.initSign(privateKey);

            // 传入签名字节
            signature.update(bytes);

            // 返回签名字节
            signBytes = signature.sign();
            return new String(Hex.encode(signBytes), StandardCharsets.UTF_8);
        }

        /**
         * 签名
         * 
         * @param sign
         * @return
         * @throws NoSuchAlgorithmException
         * @throws InvalidKeyException
         * @throws SignatureException
         */
        public Boolean verify(String pubKey, String sign, String signResult)
                throws NoSuchAlgorithmException, InvalidKeyException, SignatureException, InvalidKeySpecException {
            byte[] bytes = sign.getBytes(StandardCharsets.UTF_8);

            // 将公钥HEX字符串转换为椭圆曲线对应的点
            ECPoint ecPoint = parameters.getCurve().decodePoint(Hex.decode(pubKey));

            // 将椭圆曲线点转为公钥KEY对象
            BCECPublicKey publicKey = (BCECPublicKey) keyFactory
                    .generatePublic(new ECPublicKeySpec(ecPoint, ecParameterSpec));

            // 创建签名对象
            Signature signature = Signature.getInstance(GMObjectIdentifiers.sm2sign_with_sm3.toString(), provider);

            // 初始化为验签状态
            signature.initVerify(publicKey);

            // 传入签名字节
            signature.update(bytes);

            // 返回验签结果
            return signature.verify(Hex.decode(signResult.getBytes(StandardCharsets.UTF_8)));
        }

    }

    /**
     * 生成SM2密钥对
     * 
     * @return
     */
    public static SM2KeyPair generateKeyPair() throws NoSuchAlgorithmException, InvalidAlgorithmParameterException {
        BouncyCastleProvider provider = new BouncyCastleProvider();

        SM2KeyPair sm2KeyPair = new SM2KeyPair();

        /**
         * 获取椭圆曲线相关生成参数规格
         */
        ECGenParameterSpec genParameterSpec = new ECGenParameterSpec(DEFALUT_STD_NAME);

        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("EC", provider);
        /**
         * 使用SM2的算法区域初始化密钥生成器
         */
        keyPairGenerator.initialize(genParameterSpec, new SecureRandom());

        /**
         * 生成密钥对
         */
        KeyPair keyPair = keyPairGenerator.generateKeyPair();
        BCECPrivateKey exPrivateKey = (BCECPrivateKey) keyPair.getPrivate();
        BCECPublicKey ecPublicKey = (BCECPublicKey) keyPair.getPublic();

        /**
         * 解密密钥
         */
        BigInteger privateKey = exPrivateKey.getD();
        /**
         * 加密密钥
         */
        ECPoint publicKey = ecPublicKey.getQ();

        sm2KeyPair.setPriKey(privateKey.toString(16));
        sm2KeyPair.setPubKey(new String(Hex.encode(publicKey.getEncoded(false)), StandardCharsets.UTF_8));

        return sm2KeyPair;
    }

    /**
     * SM2 加密
     * 
     * @param plainText
     * @param pubKey
     * @return
     */
    public static String sm2Encrypt(String plainText, String pubKey)
            throws NoSuchAlgorithmException, InvalidKeySpecException, InvalidCipherTextException {

        BouncyCastleProvider provider = new BouncyCastleProvider();
        /**
         * 获取SM2相关参数
         */
        X9ECParameters parameters = GMNamedCurves.getByName(DEFALUT_STD_NAME);
        /**
         * 椭圆曲线参数规格
         */
        ECParameterSpec ecParameterSpec = new ECParameterSpec(parameters.getCurve(), parameters.getG(),
                parameters.getN(), parameters.getH());
        /**
         * 将公钥HEX字符串转换为椭圆曲线对应的点
         */
        ECPoint ecPoint = parameters.getCurve().decodePoint(Hex.decode(pubKey));
        /**
         * 获取椭圆曲线KEY生成器
         */
        KeyFactory keyFactory = KeyFactory.getInstance("EC", provider);
        /**
         * 将椭圆曲线点转为公钥KEY对象
         */
        BCECPublicKey bcecPublicKey = (BCECPublicKey) keyFactory
                .generatePublic(new ECPublicKeySpec(ecPoint, ecParameterSpec));

        return Hex.toHexString(encrypt(bcecPublicKey, plainText.getBytes(StandardCharsets.UTF_8)));

    }

    /**
     * SM2 解密
     * 
     * @param cipherText
     * @param privateKey
     * @return
     */
    public static String sm2Decrypt(String cipherText, String privateKey)
            throws NoSuchAlgorithmException, InvalidKeySpecException, InvalidCipherTextException {
        BouncyCastleProvider provider = new BouncyCastleProvider();
        /**
         * 获取SM2相关参数
         */
        X9ECParameters parameters = GMNamedCurves.getByName(DEFALUT_STD_NAME);
        /**
         * 椭圆曲线参数规格
         */
        ECParameterSpec ecParameterSpec = new ECParameterSpec(parameters.getCurve(), parameters.getG(),
                parameters.getN(), parameters.getH());
        /**
         * 将私钥HEX字符串转换为X值
         */
        BigInteger bigInteger = new BigInteger(privateKey, 16);
        /**
         * 获取椭圆曲线KEY生成器
         */
        KeyFactory keyFactory = KeyFactory.getInstance("EC", provider);
        /**
         * 将X值转为私钥KEY对象
         */
        BCECPrivateKey bcecPrivateKey = (BCECPrivateKey) keyFactory
                .generatePrivate(new ECPrivateKeySpec(bigInteger, ecParameterSpec));

        return new String(decrypt(bcecPrivateKey, Hex.decode(cipherText)), StandardCharsets.UTF_8);
    }

    /**
     * @param pubKey  公钥
     * @param srcData 原文
     * @return 默认输出C1C3C2顺序的密文。C1为65字节第1字节为压缩标识，这里固定为0x04，后面64字节为xy分量各32字节。C3为32字节。C2长度与原文一致。
     */
    private static byte[] encrypt(BCECPublicKey pubKey, byte[] srcData) throws InvalidCipherTextException {
        ECParameterSpec parameterSpec = pubKey.getParameters();
        ECDomainParameters domainParameters = new ECDomainParameters(parameterSpec.getCurve(), parameterSpec.getG(),
                parameterSpec.getN(), parameterSpec.getH());

        ECPublicKeyParameters pubKeyParameters = new ECPublicKeyParameters(pubKey.getQ(), domainParameters);

        return encrypt(SM2Engine.Mode.C1C3C2, pubKeyParameters, srcData);
    }

    /**
     * @param mode             指定密文结构，旧标准的为C1C2C3，新的[《SM2密码算法使用规范》 GM/T
     *                         0009-2012]标准为C1C3C2
     * @param pubKeyParameters 公钥
     * @param srcData          原文
     * @return 根据mode不同，输出的密文C1C2C3排列顺序不同。C1为65字节第1字节为压缩标识，这里固定为0x04，后面64字节为xy分量各32字节。C3为32字节。C2长度与原文一致。
     * @throws InvalidCipherTextException
     */
    private static byte[] encrypt(SM2Engine.Mode mode, ECPublicKeyParameters pubKeyParameters, byte[] srcData)
            throws InvalidCipherTextException {
        SM2Engine engine = new SM2Engine(mode);
        ParametersWithRandom pwr = new ParametersWithRandom(pubKeyParameters, new SecureRandom());
        engine.init(true, pwr);
        return engine.processBlock(srcData, 0, srcData.length);
    }

    /**
     * @param priKey    私钥
     * @param sm2Cipher 默认输入C1C3C2顺序的密文。C1为65字节第1字节为压缩标识，这里固定为0x04，后面64字节为xy分量各32字节。C3为32字节。C2长度与原文一致。
     * @return 原文。SM2解密返回了数据则一定是原文，因为SM2自带校验，如果密文被篡改或者密钥对不上，都是会直接报异常的。
     */
    private static byte[] decrypt(BCECPrivateKey priKey, byte[] sm2Cipher) throws InvalidCipherTextException {

        ECParameterSpec parameterSpec = priKey.getParameters();
        ECDomainParameters domainParameters = new ECDomainParameters(parameterSpec.getCurve(), parameterSpec.getG(),
                parameterSpec.getN(), parameterSpec.getH());
        ECPrivateKeyParameters priKeyParameters = new ECPrivateKeyParameters(priKey.getD(), domainParameters);

        return decrypt(SM2Engine.Mode.C1C3C2, priKeyParameters, sm2Cipher);
    }

    /**
     * @param priKeyParameters 私钥
     * @param sm2Cipher        默认输入C1C3C2顺序的密文。C1为65字节第1字节为压缩标识，这里固定为0x04，后面64字节为xy分量各32字节。C3为32字节。C2长度与原文一致。
     * @return 原文。SM2解密返回了数据则一定是原文，因为SM2自带校验，如果密文被篡改或者密钥对不上，都是会直接报异常的。
     * @throws InvalidCipherTextException
     */
    /**
     * private static byte[] decrypt(ECPrivateKeyParameters priKeyParameters, byte[]
     * sm2Cipher) throws InvalidCipherTextException {
     *
     * return decrypt(SM2Engine.Mode.C1C3C2, priKeyParameters, sm2Cipher);
     * }
     */

    /**
     * @param mode      指定密文结构，旧标准的为C1C2C3，新的[《SM2密码算法使用规范》 GM/T 0009-2012]标准为C1C3C2
     * @param priKey    私钥
     * @param sm2Cipher 根据mode不同，需要输入的密文C1C2C3排列顺序不同。C1为65字节第1字节为压缩标识，这里固定为0x04，后面64字节为xy分量各32字节。C3为32字节。C2长度与原文一致。
     * @return 原文。SM2解密返回了数据则一定是原文，因为SM2自带校验，如果密文被篡改或者密钥对不上，都是会直接报异常的。
     * @throws InvalidCipherTextException
     */
    /**
     * private static byte[] decrypt(SM2Engine.Mode mode, BCECPrivateKey priKey,
     * byte[] sm2Cipher) throws InvalidCipherTextException {
     * ECParameterSpec parameterSpec = priKey.getParameters();
     * ECDomainParameters domainParameters = new
     * ECDomainParameters(parameterSpec.getCurve(), parameterSpec.getG(),
     * parameterSpec.getN(), parameterSpec.getH());
     *
     * ECPrivateKeyParameters priKeyParameters =new
     * ECPrivateKeyParameters(priKey.getD(), domainParameters);
     *
     * return decrypt(mode, priKeyParameters, sm2Cipher);
     * }
     */

    private static byte[] decrypt(SM2Engine.Mode mode, ECPrivateKeyParameters priKeyParameters, byte[] sm2Cipher)
            throws InvalidCipherTextException {
        SM2Engine engine = new SM2Engine(mode);
        engine.init(false, priKeyParameters);

        return engine.processBlock(sm2Cipher, 0, sm2Cipher.length);
    }

}
