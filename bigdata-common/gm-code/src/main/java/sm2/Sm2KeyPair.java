package sm2;


/**
 * @author zhaojb
 *
 * SM2密钥对实体类
 */
public class Sm2KeyPair {

    /**
     * 私钥
     */
    private String priKey;

    /**
     * 公钥
     */
    private String pubKey;

    public String getPriKey() {
        return priKey;
    }

    public void setPriKey(String priKey) {
        this.priKey = priKey;
    }

    public String getPubKey() {
        return pubKey;
    }

    public void setPubKey(String pubKey) {
        this.pubKey = pubKey;
    }
}
