package sm3;

import org.bouncycastle.crypto.digests.SM3Digest;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.bouncycastle.util.encoders.Hex;

import java.nio.charset.StandardCharsets;
import java.security.Security;

/**
 * @author zhaojb
 * SM3 util
 */
public class SM3Utils {

    static {
        Security.addProvider(new BouncyCastleProvider());
    }

    /**
     * SM3 hash algorithm, similar to MD5
     * @param srcData
     * @return
     */
    public static String  hash(String srcData) {
        byte[] scrDataByte = srcData.getBytes(StandardCharsets.UTF_8);
        SM3Digest digest = new SM3Digest();
        digest.update(scrDataByte,0,scrDataByte.length);
        byte[] hash = new byte[digest.getDigestSize()];
        digest.doFinal(hash,0);
        return new String(Hex.encode(hash),StandardCharsets.UTF_8);
    }

    /**
     * public static void main(String[] args) {
     *
     *         String  txt = "hello world";
     *
     *         System.out.println(hash(txt));
     *     }
     *
     */
}
