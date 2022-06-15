package com.jb.sm9.core;

import com.jb.sm9.result.CipherResult;
import com.jb.sm9.key.Sm9MasterKeyPair;
import com.jb.sm9.key.Sm9PrivateKey;

/**
 * @author zhaojb
 */
public abstract class AbstractSM9 {
    protected SM9Curve mCurve;

    public AbstractSM9(SM9Curve curve) {
        this.mCurve = curve;
    }

    public SM9Curve getCurve() {
        return this.mCurve;
    }

    // 加密
    public abstract CipherResult encrypt(Sm9MasterKeyPair.MasterPublicKey masterPublicKey,
            String id,byte[] data,boolean isBaseBlockCipher,int macKeyByteLen) throws Exception;

    // 解密
    public abstract byte[] decrypt(CipherResult cipherResult,Sm9PrivateKey privateKey,String id,
            boolean isBaseBlockCipher,int macKeyByteLen) throws Exception;
}
