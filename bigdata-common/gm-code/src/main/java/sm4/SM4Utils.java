package sm4;

import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.pqc.math.linearalgebra.ByteUtils;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.SecureRandom;
import java.security.Security;
import java.util.Arrays;
import java.util.Locale;


/**
 * @author zhaojb
 *
 * SM4国密工具类
 */
public class SM4Utils {

    public static final String ALGORIGTHM_NAME = "SM4";
    public static final String ALGORITHM_NAME_ECB_PADDING = "SM4/ECB/PKCS7Padding";
    public static final int DEFAULT_KEY_SIZE = 128;

    static {
        Security.addProvider(new BouncyCastleProvider());
    }

    /**
     * 自动生成密钥
     * @return
     * @throws Exception
     */
    public static String  generateKey() throws Exception {
        KeyGenerator kg = KeyGenerator.getInstance(ALGORIGTHM_NAME, BouncyCastleProvider.PROVIDER_NAME);
        kg.init(DEFAULT_KEY_SIZE, new SecureRandom());
        return ByteUtils.toHexString(kg.generateKey().getEncoded()).toUpperCase(Locale.ROOT);
    }


    /**
     * SM4加密
     * @param paramStr
     * @param hexKey
     * @return
     * @throws Exception
     */
    public static String encryptEcb(String paramStr, String hexKey) throws Exception {
        byte[] keyData = ByteUtils.fromHexString(hexKey);
        byte[] srcData = paramStr.getBytes(StandardCharsets.UTF_8);
        byte[] cipherArray = encryptEcbPadding(keyData, srcData);

        return ByteUtils.toHexString(cipherArray).toUpperCase(Locale.ROOT);
    }

    private static byte[] encryptEcbPadding(byte[] key, byte[] data) throws Exception {
        Cipher cipher = generateEcbCipher(ALGORITHM_NAME_ECB_PADDING, Cipher.ENCRYPT_MODE, key);
        byte[] bs = cipher.doFinal(data);
        return bs;
    }

    private static Cipher generateEcbCipher(String algorithmName, int mode, byte[] key) throws Exception {
        Cipher cipher = Cipher.getInstance(algorithmName,BouncyCastleProvider.PROVIDER_NAME);
        Key sm4Key = new SecretKeySpec(key, ALGORIGTHM_NAME);
        cipher.init(mode, sm4Key);
        return cipher;
    }

    /**
     * SM4解密
     * @param cipherText
     * @param hexKey
     * @return
     * @throws Exception
     */
    public static String decryptEcb(String cipherText, String hexKey) throws Exception {
        byte[] keyData = ByteUtils.fromHexString(hexKey);
        byte[] cipherData = ByteUtils.fromHexString(cipherText);

        return  new String(decrypt_Ecb_Padding(keyData, cipherData), StandardCharsets.UTF_8);
    }


    /**
     *  @Description:解密
     */
    public static byte[] decrypt_Ecb_Padding(byte[] key, byte[] cipherText) throws Exception {
        Cipher cipher = generateEcbCipher(ALGORITHM_NAME_ECB_PADDING, Cipher.DECRYPT_MODE, key);
        return cipher.doFinal(cipherText);
    }

    /**
     *  @Description:解密
     */
    public static byte[] decrypt_Ecb_Padding(String key, byte[] cipherText) throws Exception {
        return  decrypt_Ecb_Padding(ByteUtils.fromHexString(key) , cipherText );
    }

    /**
     * 验签
     * @param hexKey
     * @param cipherText
     * @param paramStr
     * @return
     * @throws Exception
     */
    public static boolean verifyEcb(String hexKey,String cipherText,String paramStr) throws Exception {
        boolean flag = false;
        byte[] keyData = ByteUtils.fromHexString(hexKey);
        byte[] cipherData = ByteUtils.fromHexString(cipherText);
        byte[] decryptData = decrypt_Ecb_Padding(keyData,cipherData);
//        byte[] srcData = paramStr.getBytes(ENCODING);
        byte[] srcData = paramStr.getBytes(StandardCharsets.UTF_8);
        flag = Arrays.equals(decryptData,srcData);
        return flag;
    }

/**
 *     public static void main(String[] args)  {
 *         try {
 *             System.out.println(SM4Utils.encryptEcb("Csii_dev2021", "93EBD2312E3A4F34A7241020F8C655CB"));
 *
 * //            String secretKey="93EBD2312E3A4F34A7241020F8C655CB";
 * //     //              String cipherText = "OefBASqDXpjyY0OVprOYcg==";
 * //                    String cipherText = encryptEcb("dgm", secretKey);
 * //                   System.out.println(cipherText);
 * //                   System.out.println(decryptEcb(cipherText, secretKey));
 *
 *         } catch (Exception e) {
 *             e.printStackTrace();
 *         }
 *     }
 */

}
