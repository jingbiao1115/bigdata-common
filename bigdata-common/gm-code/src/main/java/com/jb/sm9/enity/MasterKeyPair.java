package com.jb.sm9.enity;

/**
 * @author zhaojb
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
