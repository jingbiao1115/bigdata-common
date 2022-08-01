package com.jb.driver.sm9.core;

import com.jb.driver.sm9.key.SM9MasterKeyPair;
import com.jb.driver.sm9.key.SM9PrivateKey;
import com.jb.model.enity.MasterKeyPair;
import com.jb.model.result.SM9SignResult;
import org.bouncycastle.util.encoders.Hex;

/**
 * @author zhaojb
 * 密钥转换
 */
public class KeyParse {
    private SM9Curve mCurve;
    private KeyGenerateCenter keyGenerateCenter;

    public KeyParse() {
        this.mCurve = new SM9Curve();
        this.keyGenerateCenter = new KeyGenerateCenter(mCurve);
    }

    public KeyParse(SM9Curve mCurve) {
        this.mCurve = mCurve;
        this.keyGenerateCenter = new KeyGenerateCenter(mCurve);
    }



    /**
     * 生成主密钥对
     */
    public MasterKeyPair generateMasterKeyPair() {

        SM9MasterKeyPair sm9MasterKeyPair = keyGenerateCenter.genEncryptMasterKeyPair();
        SM9MasterKeyPair.MasterPublicKey publicKey = sm9MasterKeyPair.getPublicKey();
        SM9MasterKeyPair.MasterPrivateKey privateKey = sm9MasterKeyPair.getPrivateKey();

        return new MasterKeyPair(
                Hex.toHexString(publicKey.toByteArray()),
                Hex.toHexString(privateKey.toByteArray())
        );
    }

    public MasterKeyPair generateSignMasterKeyPair() {

        SM9MasterKeyPair sm9MasterKeyPair = keyGenerateCenter.genSignMasterKeyPair();
        SM9MasterKeyPair.MasterPublicKey publicKey = sm9MasterKeyPair.getPublicKey();
        SM9MasterKeyPair.MasterPrivateKey privateKey = sm9MasterKeyPair.getPrivateKey();

        return new MasterKeyPair(
                Hex.toHexString(publicKey.toByteArray()),
                Hex.toHexString(privateKey.toByteArray())
        );
    }

    /**
     * 生成用户私钥
     */
    public static String generatePrivateKey(String masterPrivateKey,String id,
            SM9PrivateKey.PrivateKeyType privateKeyType)  {
        SM9Curve curve = new SM9Curve();
        KeyGenerateCenter keyGenerateCenter = new KeyGenerateCenter(curve);

        return Hex.toHexString(
                keyGenerateCenter.genPrivateKey(
                        parseMasterPrivateKey(masterPrivateKey),
                        id,
                        privateKeyType
                ).toByteArray());
    }

    /**
     * 密钥解析
     */
    public SM9MasterKeyPair parseMasterKey(String masterKey) {
        return SM9MasterKeyPair.fromByteArray(this.mCurve,Hex.decode(masterKey));
    }

    public static SM9MasterKeyPair.MasterPrivateKey parseMasterPrivateKey(String masterPrivateKey) {
        return SM9MasterKeyPair.MasterPrivateKey.fromByteArray(Hex.decode(masterPrivateKey));
    }

    public SM9MasterKeyPair.MasterPublicKey parseMasterPublicKey(String masterPublicKey) {
        return SM9MasterKeyPair.MasterPublicKey.fromByteArray(this.mCurve,
                Hex.decode(masterPublicKey));
    }

    public SM9PrivateKey parsePrivateKey(String privateKey) {
        return SM9PrivateKey.fromByteArray(this.mCurve,Hex.decode(privateKey));
    }

    public SM9MasterKeyPair parseKey(String masterPublicKey,String masterPrivateKey) {

        SM9MasterKeyPair.MasterPublicKey sm9MasterPublicKey =
                SM9MasterKeyPair.MasterPublicKey.fromByteArray(this.mCurve,
                        Hex.decode(masterPublicKey));

        SM9MasterKeyPair.MasterPrivateKey sm9MasterPrivateKey =
                SM9MasterKeyPair.MasterPrivateKey.fromByteArray(Hex.decode(masterPrivateKey));

        return new SM9MasterKeyPair(sm9MasterPrivateKey,sm9MasterPublicKey);
    }

    public SM9SignResult parseSign(String signResult) {
        return SM9SignResult.fromByteArray(this.mCurve,Hex.decode(signResult));
    }

}
