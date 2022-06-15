package com.jb.sm9.enity;

/**
 * @@author zhaojb
 */
public class Sm9SignKey {
    /**
     * 用户私钥
     */
    private String privateKey;

    /**
     * 主公钥
     */
    private String masterPublicKey;

    public Sm9SignKey(String privateKey,String masterPublicKey) {
        this.privateKey = privateKey;
        this.masterPublicKey = masterPublicKey;
    }


    public String getPrivateKey() {
        return privateKey;
    }

    public String getMasterPublicKey() {
        return masterPublicKey;
    }

    @Override
    public String toString() {
        return "Sm9SignKey{" +
                "privateKey='" + privateKey + '\'' +
                ", masterPublicKey='" + masterPublicKey + '\'' +
                '}';
    }
}
