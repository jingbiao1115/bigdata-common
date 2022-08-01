package com.jb.model.enity;

/**
 * @@author zhaojb
 * SM9密钥对
 */
public class SM9KeyPair {

    private String masterPublic;
    private String masterPrivate;
    private String id;
    private String privateKey;

    public SM9KeyPair(String masterPublic,String masterPrivate,String id,String privateKey) {
        this.masterPublic = masterPublic;
        this.masterPrivate = masterPrivate;
        this.id = id;
        this.privateKey = privateKey;
    }

    public String getMasterPublic() {
        return masterPublic;
    }

    public String getMasterPrivate() {
        return masterPrivate;
    }

    public String getId() {
        return id;
    }

    public String getPrivateKey() {
        return privateKey;
    }
}
