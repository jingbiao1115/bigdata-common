package com.jb.driver.sm9.core;

import com.jb.driver.sm9.key.SM9MasterKeyPair;
import com.jb.driver.sm9.key.SM9PrivateKey;
import com.jb.driver.sm9.method.SM9Method;
import it.unisa.dia.gas.plaf.jpbc.field.curve.CurveElement;

import java.math.BigInteger;


/**
 * @author zhaojb
 * 密钥生成器
 */
public class KeyGenerateCenter {
    private SM9Curve mCurve;

    public KeyGenerateCenter(SM9Curve curve) {
        this.mCurve = curve;
    }

    public SM9Curve getCurve() {
        return this.mCurve;
    }

    public SM9MasterKeyPair genSignMasterKeyPair() {
        BigInteger ks = SM9Method.genRandom(this.mCurve.getRandom(),this.mCurve.getBigIntegerN());
        CurveElement pPubs = this.mCurve.getCurveP2().duplicate().mul(ks);
        return new SM9MasterKeyPair(new SM9MasterKeyPair.MasterPrivateKey(ks),
                new SM9MasterKeyPair.MasterPublicKey(pPubs,true));
    }

    public SM9MasterKeyPair genEncryptMasterKeyPair() {
        BigInteger ke = SM9Method.genRandom(this.mCurve.getRandom(),this.mCurve.getBigIntegerN());
        CurveElement pPubs = this.mCurve.getCurveP1().duplicate().mul(ke);
        return new SM9MasterKeyPair(new SM9MasterKeyPair.MasterPrivateKey(ke),
                new SM9MasterKeyPair.MasterPublicKey(pPubs,false));
    }

    protected BigInteger t2(SM9MasterKeyPair.MasterPrivateKey privateKey,String id,byte hid)  {
        BigInteger h1 = SM9Method.bigIntegerH1(id,hid,mCurve.getBigIntegerN());
        BigInteger t1 = h1.add(privateKey.d).mod(this.mCurve.getBigIntegerN());
        if (t1.equals(BigInteger.ZERO)) {
            throw new RuntimeException("Need to update the master private key");
        } else {
            return privateKey.d.multiply(t1.modInverse(this.mCurve.getBigIntegerN())).mod(this.mCurve.getBigIntegerN());
        }
    }

    public SM9PrivateKey genPrivateKey(SM9MasterKeyPair.MasterPrivateKey masterPrivateKey,
                                       String id,SM9PrivateKey.PrivateKeyType privateKeyType)  {
        switch (privateKeyType.getCode()) {
            case 1:
                return this.genSignPrivateKey(masterPrivateKey,id);
            case 2:
                return this.genEncryptPrivateKey(masterPrivateKey,id,SM9Curve.HID_KEY_EXCHANGE);
            case 3:
                return this.genEncryptPrivateKey(masterPrivateKey,id,SM9Curve.HID_ENCRYPT);

            default:
                throw new RuntimeException("Not support private key type");
        }

    }


    SM9PrivateKey genSignPrivateKey(SM9MasterKeyPair.MasterPrivateKey privateKey,String id)  {
        BigInteger t2 = this.t2(privateKey,id,SM9Curve.HID_SIGN);
        CurveElement ds = this.mCurve.getCurveP1().duplicate().mul(t2);
        return new SM9PrivateKey(ds,SM9Curve.HID_SIGN);
    }

    SM9PrivateKey genEncryptPrivateKey(SM9MasterKeyPair.MasterPrivateKey privateKey,String id,
            byte hid)  {
        BigInteger t2 = this.t2(privateKey,id,hid);
        CurveElement de = this.mCurve.getCurveP2().duplicate().mul(t2);
        return new SM9PrivateKey(de,hid);
    }


}
