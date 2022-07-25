package com.jb.model.enity;

/**
 * @author zhaojb
 * 主密钥对字符串型
 */
public class MasterKeyPair {
    private String masterPublic;
    private String masterPrivate;

    public MasterKeyPair(String masterPublic,String masterPrivate) {
        this.masterPublic = masterPublic;
        this.masterPrivate = masterPrivate;
    }

    public String getMasterPublic() {
        return masterPublic;
    }

    public String getMasterPrivate() {
        return masterPrivate;
    }

    @Override
    public String toString() {
        return "MasterKeyPair{" +
                "masterPublic='" + masterPublic + '\'' +
                ", masterPrivate='" + masterPrivate + '\'' +
                '}';
    }
}
