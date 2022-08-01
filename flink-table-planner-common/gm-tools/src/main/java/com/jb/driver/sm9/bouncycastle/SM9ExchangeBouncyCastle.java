package com.jb.driver.sm9.bouncycastle;

import com.jb.driver.sm9.core.KeyGenerateCenter;
import com.jb.driver.sm9.core.KeyParse;
import com.jb.driver.sm9.core.SM9Curve;
import com.jb.driver.sm9.key.SM9MasterKeyPair;
import com.jb.driver.sm9.key.SM9PrivateKey;
import com.jb.driver.sm9.method.SM9Method;
import com.jb.model.parameter.SM9ExchangeInitiatorKdfParameter;
import com.jb.model.parameter.SM9ExchangeResponderKdfParameter;
import com.jb.model.result.SM9ExchangeInitiatorKdfResult;
import com.jb.model.result.SM9ExchangeInitiatorRandomResult;
import com.jb.model.result.SM9ExchangeResponderKdfResult;
import it.unisa.dia.gas.jpbc.Element;
import it.unisa.dia.gas.plaf.jpbc.field.curve.CurveElement;
import org.bouncycastle.util.encoders.Hex;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * @author zhaojb
 * <p>
 * 密钥交换内部类EXCHANGE
 * 1.发起方和响应方使用同一个主密钥对。
 * 2.发起方需要知道响应方的ID,然后发起方用响应方的ID,生成一对临时密钥对,并将其中的公钥和自己的ID告知响应方。
 * 3.响应方用发起方的ID生成一对临时密钥对。
 * 4.响应方用发起方的临时公钥、发起方的ID和自己的参数,计算出哈希选项和共享密钥。然后响应方将自己的临时公钥和哈希选项告知发起方。
 * 5.发起方用响应方的临时公钥和自己的参数,计算出哈希选项和共享密钥。然后和响应方的哈希选项进行对比。
 */
public class SM9ExchangeBouncyCastle {

    private final SM9Curve sm9Curve = new SM9Curve();

    private final KeyGenerateCenter keyGenerateCenter = new KeyGenerateCenter(this.sm9Curve);

    private SM9MasterKeyPair masterKeyPair;

    public static SM9ExchangeBouncyCastle builder(

            SM9MasterKeyPair.MasterPublicKey masterPublicKey,
            SM9MasterKeyPair.MasterPrivateKey masterPrivateKey) {

        return new SM9ExchangeBouncyCastle(masterPublicKey,masterPrivateKey);
    }

    public static SM9ExchangeBouncyCastle builder(
            String masterPublicKey,
            String masterPrivateKey) {

        return new SM9ExchangeBouncyCastle(masterPublicKey,masterPrivateKey);
    }

    private SM9ExchangeBouncyCastle(
            SM9MasterKeyPair.MasterPublicKey masterPublicKey,
            SM9MasterKeyPair.MasterPrivateKey masterPrivateKey) {


        this.masterKeyPair = new SM9MasterKeyPair(masterPrivateKey,masterPublicKey);
    }

    private SM9ExchangeBouncyCastle(
            String masterPublicKey,
            String masterPrivateKey) {

        KeyParse keyParse = new KeyParse(this.sm9Curve);
        this.masterKeyPair = new SM9MasterKeyPair(
                KeyParse.parseMasterPrivateKey(masterPrivateKey),
                keyParse.parseMasterPublicKey(masterPublicKey));

    }


    ////////////////////////////////////////////////////////////////////////////////
    //内部方法
    ////////////////////////////////////////////////////////////////////////////////

    /**
     * 生成随机数r
     */
    private BigInteger r() {
        //step2:产生随机数 rA被包含于[1, N-1]
//        this.r = BigInteger.valueOf(1);
        return SM9Method.genRandom(this.sm9Curve.getRandom(),this.sm9Curve.getBigIntegerN());
    }

    /**
     * 发起方生成R
     */
    private CurveElement generateRFromA(BigInteger rA,String idB) {
        BigInteger h1 = SM9Method.bigIntegerH1(idB,SM9Curve.HID_KEY_EXCHANGE,
                this.sm9Curve.getBigIntegerN());

        //step1.计算 QB =[H1(IDB||hid, N)]P1 +Ppub-e

        CurveElement curveQB =
                this.sm9Curve.getCurveP1().duplicate().mul(h1).duplicate().add(this.masterKeyPair.getPublicKey().Q);

        return curveQB.duplicate().mul(rA);

    }

    /**
     * 响应方生成R
     */
    private CurveElement generateRFromB(BigInteger rB,String idA) {
        BigInteger h1 = SM9Method.bigIntegerH1(idA,SM9Curve.HID_KEY_EXCHANGE,
                this.sm9Curve.getBigIntegerN());

        //step1.计算 QB =[H1(IDB||hid, N)]P1 +Ppub-e

        CurveElement curveQA =
                this.sm9Curve.getCurveP1().duplicate().mul(h1).duplicate().add(this.masterKeyPair.getPublicKey().Q);

        return curveQA.duplicate().mul(rB);

    }


    ////////////////////////////////////////////////////////////////////////////////
    //交换协商
    ////////////////////////////////////////////////////////////////////////////////

    /**
     * 发起方生成交换数据
     */
    public SM9ExchangeInitiatorRandomResult initiatorGenerateRA(String idB) {

        //用户A生成随机数
        BigInteger rA = this.r();

        return new SM9ExchangeInitiatorRandomResult(rA,this.generateRFromA(rA,idB));
    }


    /**
     * 响应方计算SB,RA,共享密钥
     */
    public SM9ExchangeResponderKdfResult responderKdf(SM9ExchangeResponderKdfParameter responderKdfParameter) {

        String idA = responderKdfParameter.getIdA();
        String idB = responderKdfParameter.getIdB();

        //用户B生成随机数
        BigInteger rB = this.r();

        //解析RA
        CurveElement curveRA = SM9Method.fromByteArray(this.sm9Curve,
                Hex.decode(responderKdfParameter.getStringRA()));

        //用户B创建R
        CurveElement curveRB = this.generateRFromB(rB,idA);

        //用户私钥
        SM9PrivateKey bPrivateKey =
                this.keyGenerateCenter.genPrivateKey(this.masterKeyPair.getPrivateKey(),idB,
                        SM9PrivateKey.PrivateKeyType.KEY_KEY_EXCHANGE);

        //响应方计算g1,g2,g3
        if (!this.sm9Curve.getCurveFieldG1().equals(curveRA.getField())) {
            throw new RuntimeException("G1 R is mismatch");
        }
        //step5.1:g1=e(RA,dB)=e(P1,P2)^(rA*s)
        Element g1 = this.sm9Curve.pairing(curveRA.duplicate(),bPrivateKey.d.duplicate());
        //step5.2:g2=e(Ppub,P2)^rB=e(P1,P2)^(rB*s)
        Element g2 =
                this.sm9Curve.pairing(this.masterKeyPair.getPublicKey().Q,
                        this.sm9Curve.getCurveP2()).duplicate().pow(rB);
        //step5.3:g3=g1^rB = e(P1,P2)^(rA*rB*s)
        Element g3 = g1.duplicate().pow(rB);

        //生成SB,S2,SKB
        // 其中:SB发送给发起方与发起方的S1确认密钥,S2自己保存与发起方的SA确认密钥,SKB为共享密钥
        byte[] bytesSB = SM9Method.bytesHashS((byte)0x82,idA,curveRA,idB,curveRB,g1,g2,g3);
        byte[] bytesS2 = SM9Method.bytesHashS((byte)0x83,idA,curveRA,idB,curveRB,g1,g2,g3);
        byte[] bytesSKB = SM9Method.bytesKdf(idA,curveRA,idB,curveRB,g1,g2,g3,
                responderKdfParameter.getkLen());

        return new SM9ExchangeResponderKdfResult(curveRB,bytesSB,bytesS2,bytesSKB);
    }

    /**
     * 发起方计算SA,共享密钥,密钥确认
     */

    public SM9ExchangeInitiatorKdfResult initiatorAck(
            SM9ExchangeInitiatorKdfParameter initiatorKdfParameter) {

        String idA = initiatorKdfParameter.getIdA();
        String idB = initiatorKdfParameter.getIdB();
        BigInteger rA = initiatorKdfParameter.getrA();
        byte[] bytesSB = Hex.decode(initiatorKdfParameter.getStringSB());

        CurveElement curveRB = SM9Method.fromByteArray(this.sm9Curve,
                Hex.decode(initiatorKdfParameter.getStringRB()));

        //用户私钥
        SM9PrivateKey aPrivateKey =
                this.keyGenerateCenter.genPrivateKey(this.masterKeyPair.getPrivateKey(),idA,
                        SM9PrivateKey.PrivateKeyType.KEY_KEY_EXCHANGE);

        //发起方计算g1,g2,g3
        CurveElement curveRA = SM9Method.fromByteArray(this.sm9Curve,
                Hex.decode(initiatorKdfParameter.getStringRA()));

        if (!this.sm9Curve.getCurveFieldG1().equals(curveRB.getField())) {
            throw new RuntimeException("G1 R is mismatch");
        }
        //发起方
        //step5.1:g1=e(Ppub,P2)^rA = e(P1,P2)^(rA*s)
        Element g1 =
                this.sm9Curve.pairing(this.masterKeyPair.getPublicKey().Q,
                        this.sm9Curve.getCurveP2()).duplicate().pow(rA);

        //step5.2:g2=e(RB,dA)=e(P1,P2)^(rB*s)
        Element g2 = this.sm9Curve.pairing(curveRB.duplicate(),aPrivateKey.d.duplicate());

        //step5.3:g3=g2^rA = e(P1,P2)^(rA*rB*s)
        Element g3 = g2.duplicate().pow(rA);

        //确认密钥
        byte[] bytesSA = SM9Method.bytesHashS((byte)0x83,idA,curveRA,idB,curveRB,g1,g2,g3);
        byte[] bytesS1 = SM9Method.bytesHashS((byte)0x82,idA,curveRA,idB,curveRB,g1,g2,g3);

        byte[] bytesSKA = SM9Method.bytesKdf(idA,curveRA,idB,curveRB,g1,g2,g3,
                initiatorKdfParameter.getkLen());

        return new SM9ExchangeInitiatorKdfResult(bytesSA,bytesS1,Arrays.equals(bytesS1,bytesSB),
                bytesSKA);
    }

    /**
     * 响应方密钥确认
     */
    public static boolean responderAck(String stringSA,String stringS2) {
        return responderAck(Hex.decode(stringSA),Hex.decode(stringS2));
    }

    public static boolean responderAck(byte[] bytesSA,byte[] bytesS2) {
        //判断SA==S2
        return Arrays.equals(bytesSA,bytesS2);
    }

}
