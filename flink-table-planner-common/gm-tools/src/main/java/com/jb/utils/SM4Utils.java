/**
 * @Author: xiezuozhang xiezuozhang@zjipst.com
 * @Description: SM4 工具类
 * @Date: 2022-06-14 17:52:34
 * @LastEditors: xiezuozhang xiezuozhang@zjipst.com
 * @LastEditTime: 2022-07-05 13:51:58
 */
package com.jb.utils;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.pqc.math.linearalgebra.ByteUtils;

import javax.crypto.*;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.*;
import java.util.Arrays;
import java.util.Locale;

/**
 * @author zhaojb
 *
 *         SM4国密工具类
 */
public class SM4Utils {

    public static final String ALGORIGTHM_NAME = "SM4";
    public static final String ALGORITHM_NAME_ECB_PADDING = "SM4/ECB/PKCS7Padding";
    public static final int DEFAULT_KEY_SIZE = 128;

    static {
        Security.addProvider(new BouncyCastleProvider());
    }

    private SM4Utils() {
        throw new IllegalStateException("Utility class");
    }

    /**
     * 自动生成密钥
     *
     * @return
     * @throws Exception
     */
    public static String generateKey() throws NoSuchAlgorithmException, NoSuchProviderException {
        KeyGenerator kg = KeyGenerator.getInstance(ALGORIGTHM_NAME,
                BouncyCastleProvider.PROVIDER_NAME);

        kg.init(DEFAULT_KEY_SIZE,new SecureRandom());
        return ByteUtils.toHexString(kg.generateKey().getEncoded()).toUpperCase(Locale.ROOT);
    }

    /**
     * SM4加密
     *
     * @param paramStr
     * @param hexKey
     * @return
     * @throws Exception
     */
    public static String encryptEcb(String paramStr,String hexKey) throws IllegalBlockSizeException, NoSuchPaddingException, BadPaddingException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException {
        byte[] keyData = ByteUtils.fromHexString(hexKey);
        byte[] srcData = paramStr.getBytes(StandardCharsets.UTF_8);
        byte[] cipherArray = encryptEcbPadding(keyData,srcData);

        return ByteUtils.toHexString(cipherArray).toUpperCase(Locale.ROOT);
    }

    public static byte[] encryptEcbPadding(byte[] key,byte[] data) throws IllegalBlockSizeException, BadPaddingException, NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException {
        Cipher cipher = generateEcbCipher(ALGORITHM_NAME_ECB_PADDING,Cipher.ENCRYPT_MODE,key);
        return cipher.doFinal(data);

    }

    private static Cipher generateEcbCipher(String algorithmName,int mode,byte[] key) throws InvalidKeyException, NoSuchPaddingException, NoSuchAlgorithmException, NoSuchProviderException {
        Cipher cipher = Cipher.getInstance(algorithmName,BouncyCastleProvider.PROVIDER_NAME);
        Key sm4Key = new SecretKeySpec(key,ALGORIGTHM_NAME);
        cipher.init(mode,sm4Key);
        return cipher;

    }

    /**
     * SM4解密
     *
     * @param cipherText
     * @param hexKey
     * @return
     * @throws Exception
     */
    public static String decryptEcb(String cipherText,String hexKey) throws NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, BadPaddingException, InvalidKeyException, NoSuchProviderException {
        byte[] keyData = ByteUtils.fromHexString(hexKey);
        byte[] cipherData = ByteUtils.fromHexString(cipherText);

        return new String(decryptEcbPadding(keyData,cipherData),StandardCharsets.UTF_8);
    }

    /**
     * @Description:解密
     */
    public static byte[] decryptEcbPadding(byte[] key,byte[] cipherText) throws NoSuchPaddingException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, IllegalBlockSizeException, BadPaddingException {
        Cipher cipher = generateEcbCipher(ALGORITHM_NAME_ECB_PADDING,Cipher.DECRYPT_MODE,key);
        return cipher.doFinal(cipherText);
    }

    /**
     * @Description:解密
     */
    public static byte[] decryptEcbPadding(String key,byte[] cipherText) throws NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, BadPaddingException, InvalidKeyException, NoSuchProviderException {
        return decryptEcbPadding(ByteUtils.fromHexString(key),cipherText);
    }

    /**
     * 验签
     *
     * @param hexKey
     * @param cipherText
     * @param paramStr
     * @return
     * @throws Exception
     */
    public static boolean verifyEcb(String hexKey,String cipherText,String paramStr) throws NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, BadPaddingException, InvalidKeyException, NoSuchProviderException {
        boolean flag = false;
        byte[] keyData = ByteUtils.fromHexString(hexKey);
        byte[] cipherData = ByteUtils.fromHexString(cipherText);
        byte[] decryptData = decryptEcbPadding(keyData,cipherData);
        byte[] srcData = paramStr.getBytes(StandardCharsets.UTF_8);
        flag = Arrays.equals(decryptData,srcData);
        return flag;
    }

}
