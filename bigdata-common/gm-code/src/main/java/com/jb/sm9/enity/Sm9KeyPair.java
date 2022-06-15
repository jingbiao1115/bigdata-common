package com.jb.sm9.enity;

/**
 * @@author zhaojb
 */
public class Sm9KeyPair {
    /**
     * 标识,用户公钥
     */
    private String IBE_Identify;

    /**
     * 用户私钥
     */
    private String privateKey;

    /**
     * 主密钥,priKey+pubKey
     */
    private String masterKey;

    /**
     * 主公钥
     */
    private String masterPublicKey;

    /**
     * 主私钥
     */
    private String masterPrivateKey;


    public Sm9KeyPair(String IBE_Identify,String privateKey,String masterKey,
            String masterPublicKey,String masterPrivateKey) {
        this.IBE_Identify = IBE_Identify;
        this.privateKey = privateKey;
        this.masterKey = masterKey;
        this.masterPublicKey = masterPublicKey;
        this.masterPrivateKey = masterPrivateKey;
    }

    public String getIBE_Identify() {
        return IBE_Identify;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    public String getMasterKey() {
        return masterKey;
    }

    public String getMasterPublicKey() {
        return masterPublicKey;
    }

    public String getMasterPrivateKey() {
        return masterPrivateKey;
    }


    @Override
    public String toString() {
        return "Sm9KeyPair{" +
                "IBE_Identify='" + IBE_Identify + '\'' +
                ", privateKey='" + privateKey + '\'' +
                ", masterKey='" + masterKey + '\'' +
                ", masterPublicKey='" + masterPublicKey + '\'' +
                ", masterPrivateKey='" + masterPrivateKey + '\'' +
                '}';
    }
}
