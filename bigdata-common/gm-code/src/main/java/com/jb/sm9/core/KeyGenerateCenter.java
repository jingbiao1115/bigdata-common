package com.jb.sm9.core;

import com.jb.sm9.method.SM9Method;
import com.jb.sm9.key.*;
import it.unisa.dia.gas.plaf.jpbc.field.curve.CurveElement;


import java.math.BigInteger;


/**
 * @author zhaojb
 * 密钥生成器
 */
public class KeyGenerateCenter {
    public SM9Curve mCurve;

    public KeyGenerateCenter(SM9Curve curve) {
        this.mCurve = curve;
    }

    public SM9Curve getCurve() {
        return this.mCurve;
    }

    public SM9MasterKeyPair genSignMasterKeyPair() {
        BigInteger ks = SM9Method.genRandom(this.mCurve.random,this.mCurve.N);
        CurveElement ppubs = this.mCurve.P2.duplicate().mul(ks);
        return new SM9MasterKeyPair(new SM9MasterKeyPair.MasterPrivateKey(ks),
                new SM9MasterKeyPair.MasterPublicKey(ppubs,true));
    }

    public SM9MasterKeyPair genEncryptMasterKeyPair() {
        BigInteger ke = SM9Method.genRandom(this.mCurve.random,this.mCurve.N);
        CurveElement ppube = this.mCurve.P1.duplicate().mul(ke);
        return new SM9MasterKeyPair(new SM9MasterKeyPair.MasterPrivateKey(ke),
                new SM9MasterKeyPair.MasterPublicKey(ppube,false));
    }

    protected BigInteger T2(SM9MasterKeyPair.MasterPrivateKey privateKey,String id,byte hid) throws Exception {
        BigInteger h1 = SM9Method.H1(id,hid,mCurve.N);
        BigInteger t1 = h1.add(privateKey.d).mod(this.mCurve.N);
        if (t1.equals(BigInteger.ZERO)) {
            throw new Exception("Need to update the master private key");
        } else {
            return privateKey.d.multiply(t1.modInverse(this.mCurve.N)).mod(this.mCurve.N);
        }
    }

    public SM9PrivateKey genPrivateKey(SM9MasterKeyPair.MasterPrivateKey masterPrivateKey,
            String id,SM9PrivateKey.PrivateKeyType privateKeyType) throws Exception {
        switch (privateKeyType.getCode()) {
            case 1:
                return this.genSignPrivateKey(masterPrivateKey,id);
            case 2:
                return this.genEncryptPrivateKey(masterPrivateKey,id,SM9Curve.HID_KEY_EXCHANGE);
            case 3:
                return this.genEncryptPrivateKey(masterPrivateKey,id,SM9Curve.HID_ENCRYPT);

            default:
                throw new Exception("Not support private key type");
        }

    }


    SM9PrivateKey genSignPrivateKey(SM9MasterKeyPair.MasterPrivateKey privateKey,String id) throws Exception {
        BigInteger t2 = this.T2(privateKey,id,SM9Curve.HID_SIGN);
        CurveElement ds = this.mCurve.P1.duplicate().mul(t2);
        return new SM9PrivateKey(ds,SM9Curve.HID_SIGN);
    }

    SM9PrivateKey genEncryptPrivateKey(SM9MasterKeyPair.MasterPrivateKey privateKey,String id,
            byte hid) throws Exception {
        BigInteger t2 = this.T2(privateKey,id,hid);
        CurveElement de = this.mCurve.P2.duplicate().mul(t2);
        return new SM9PrivateKey(de,hid);
    }


}
