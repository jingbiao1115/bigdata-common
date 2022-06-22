package com.jb.sm9.bouncyCastle;

import com.jb.sm9.core.KeyGenerateCenter;
import com.jb.sm9.core.KeyParse;
import com.jb.sm9.core.SM9Curve;
import com.jb.sm9.key.SM9MasterKeyPair;
import com.jb.sm9.key.SM9PrivateKey;
import com.jb.sm9.method.SM9Method;
import com.jb.sm9.result.SignResult;
import it.unisa.dia.gas.jpbc.Element;
import it.unisa.dia.gas.plaf.jpbc.field.curve.CurveElement;
import org.bouncycastle.util.encoders.Hex;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;

/**
 * @author zhaojb
 * <p>
 * SM9签名类
 */
public class SM9SignBouncyCastle {

    private final SM9Curve sm9Curve = new SM9Curve();

    private final KeyGenerateCenter keyGenerateCenter = new KeyGenerateCenter(sm9Curve);

    private final KeyParse keyParse = new KeyParse(sm9Curve);

    public static SM9SignBouncyCastle builder(){
        return new SM9SignBouncyCastle();
    }


    ////////////////////////////////////////////////////////////////////////////////
    //签名
    ////////////////////////////////////////////////////////////////////////////////

    /**
     * 签名
     */
    public SignResult sign(SM9MasterKeyPair.MasterPublicKey masterPublicKey,
            SM9PrivateKey privateKey,byte[] data) {
        BigInteger l, h;

        //Step1 : g = e(P1, Ppub)
        Element g = this.sm9Curve.pairing(sm9Curve.P1,masterPublicKey.Q);

        do {

            //Step2: Rand r
            BigInteger r = SM9Method.genRandom(sm9Curve.random,sm9Curve.N);

            //Step3 : w=g^r
            Element w = g.duplicate().pow(r);

            //Step4 :  h=H2(M||w,N)
            h = SM9Method.H2(data,w,sm9Curve.N).mod(sm9Curve.N);

            //Step5 : l=(r-h)mod N
            l = r.subtract(h).mod(sm9Curve.N);
        } while (l.equals(BigInteger.ZERO));


        //Step6 : S = [l]dA=(xS,yS)
        CurveElement s = privateKey.d.duplicate().mul(l);

        //Step7 : OUT : (h,s)
        SignResult signResult = new SignResult(h,s);

        return signResult;
    }

    /**
     * 签名
     */
    public String sign(String masterPublicKey,String privateKey,String sign) {

        return Hex.toHexString(
                sign(
                        keyParse.parseMasterPublicKey(masterPublicKey),
                        keyParse.parsePrivateKey(privateKey),
                        sign.getBytes()
                ).toByteArray());
    }


    ////////////////////////////////////////////////////////////////////////////////
    //验签
    ////////////////////////////////////////////////////////////////////////////////

    /**
     * 验签
     */
    public Boolean verify(String id,String masterPublicKey,String sign,
            String signResult) {

        return verify(
                id,
                keyParse.parseMasterPublicKey(masterPublicKey),
                sign.getBytes(StandardCharsets.UTF_8),
                keyParse.parseSign(signResult)
        );
    }

    public Boolean verify(String id,
            SM9MasterKeyPair.MasterPublicKey masterPublicKey,byte[] sign,
            SignResult signature) {

        return verify(
                masterPublicKey,
                id,
                sign,
                signature
        );
    }

    /**
     * 验签
     */
    private boolean verifyParamS(SM9MasterKeyPair.MasterPublicKey masterPublicKey,String id,
            byte[] data,byte[] signResult) {

        SignResult signature = SignResult.fromByteArray(this.sm9Curve,signResult);

        return verify(masterPublicKey,id,data,signature);
    }

    private boolean verify(SM9MasterKeyPair.MasterPublicKey masterPublicKey,String id,
            byte[] data,SignResult signature) {
        // Step1 : check if h in the range [1, N-1]
        if (!SM9Method.isBetween(signature.h,sm9Curve.N))
            return false;

        // Step2 : check if S is on G1
        if (!signature.s.isValid())
            return false;

        // Step3 : g = e(P1, Ppub)
        Element g = sm9Curve.pairing(sm9Curve.P1,masterPublicKey.Q);

        // Step4 : t=g^h
        Element t = g.pow(signature.h);

        // Step5 : h1=H1(IDA||hid,N)
        BigInteger h1 = SM9Method.H1(id,SM9Curve.HID_SIGN,sm9Curve.N);

        // Step6 : P=[h1]P2+Ppub
        CurveElement p = sm9Curve.P2.duplicate().mul(h1).add(masterPublicKey.Q);

        // Step7 : u=e(S,P)
        Element u = sm9Curve.pairing(signature.s,p);

        // Step8 : w=u*t
        Element w = u.mul(t);

        // Step9 : h2=H2(M||w,N)
        BigInteger h2 = SM9Method.H2(data,w,sm9Curve.N);

        return h2.equals(signature.h);

    }

}
