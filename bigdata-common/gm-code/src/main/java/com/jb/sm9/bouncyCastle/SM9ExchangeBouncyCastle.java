package com.jb.sm9.bouncyCastle;

import com.jb.enums.ExchangeEnum;
import com.jb.sm9.core.*;
import com.jb.sm9.enity.InitiatorTemporary;
import com.jb.sm9.enity.ResponderTemporary;
import com.jb.sm9.key.SM9MasterKeyPair;
import com.jb.sm9.key.SM9PrivateKey;
import com.jb.sm9.method.SM9Method;
import it.unisa.dia.gas.jpbc.Element;
import it.unisa.dia.gas.plaf.jpbc.field.curve.CurveElement;
import org.bouncycastle.util.encoders.Hex;

import java.io.ByteArrayOutputStream;
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

    private final KeyGenerateCenter keyGenerateCenter = new KeyGenerateCenter(sm9Curve);

    private final KeyParse keyParse = new KeyParse(sm9Curve);

    private ExchangeEnum exchangeType;
    private SM9MasterKeyPair masterKeyPair;

    private String IDA;
    private String IDB;

    private BigInteger r;
    private CurveElement RA;
    private CurveElement RB;
    private Element g1;
    private Element g2;
    private Element g3;
    private byte[] S1;
    private byte[] S2;
    private byte[] SA;
    private byte[] SB;

    private byte[] SK;


    public String getStringSK() {
        return Hex.toHexString(SK);
    }

    public byte[] getSK() {
        return SK;
    }

    public String getStringS1() {
        return Hex.toHexString(S1);
    }

    public byte[] getS1() {
        return S1;
    }

    public String getStringS2() {
        return Hex.toHexString(S2);
    }

    public byte[] getS2() {
        return S2;
    }

    public String getStringSA() {
        return Hex.toHexString(SA);
    }

    public byte[] getSA() {
        return SA;
    }

    public String getStringSB() {
        return Hex.toHexString(SB);
    }

    public byte[] getSB() {
        return SB;
    }


    public static SM9ExchangeBouncyCastle builder(
            ExchangeEnum exchangeType,
            SM9MasterKeyPair.MasterPublicKey masterPublicKey,
            SM9MasterKeyPair.MasterPrivateKey masterPrivateKey) {

        return new SM9ExchangeBouncyCastle(exchangeType,masterPublicKey,masterPrivateKey);
    }

    public static SM9ExchangeBouncyCastle builder(
            ExchangeEnum exchangeType,
            String masterPublicKey,
            String masterPrivateKey) {

        return new SM9ExchangeBouncyCastle(exchangeType,masterPublicKey,masterPrivateKey);
    }

    private SM9ExchangeBouncyCastle(ExchangeEnum exchangeType,
            SM9MasterKeyPair.MasterPublicKey masterPublicKey,
            SM9MasterKeyPair.MasterPrivateKey masterPrivateKey) {

        this.exchangeType = exchangeType;

        this.masterKeyPair = new SM9MasterKeyPair(masterPrivateKey,masterPublicKey);
    }

    private SM9ExchangeBouncyCastle(ExchangeEnum exchangeType,
            String masterPublicKey,
            String masterPrivateKey) {

        this.exchangeType = exchangeType;

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
        this.r = SM9Method.genRandom(this.sm9Curve.random,this.sm9Curve.N);
        return r;
    }

    /**
     * 发起方生成R
     */
    private CurveElement generateRFromA(String IDB) {
        BigInteger h1 = SM9Method.H1(IDB,SM9Curve.HID_KEY_EXCHANGE,sm9Curve.N);

        //step1.计算 QB =[H1(IDB||hid, N)]P1 +Ppub-e

        CurveElement QB =
                this.sm9Curve.P1.duplicate().mul(h1).duplicate().add(masterKeyPair.getPublicKey().Q);
        this.RA = QB.duplicate().mul(r());

        return this.RA;
    }

    /**
     * 响应方生成R
     */
    private CurveElement generateRFromB(String IDA) {
        BigInteger h1 = SM9Method.H1(IDA,SM9Curve.HID_KEY_EXCHANGE,sm9Curve.N);

        //step1.计算 QB =[H1(IDB||hid, N)]P1 +Ppub-e

        CurveElement QA =
                this.sm9Curve.P1.duplicate().mul(h1).duplicate().add(masterKeyPair.getPublicKey().Q);
        this.RB = QA.duplicate().mul(r());

        return this.RB;
    }

    /**
     * 响应方计算g1g2g3
     */
    private void g1g2g3FromB(SM9PrivateKey privateKey) {
        if (!this.sm9Curve.G1.equals(RA.getField())) {
            throw new RuntimeException("G1 R is mismatch");
        }

        //响应方
        //step5.1:g1=e(RA,dB)=e(P1,P2)^(rA*s)
        this.g1 = this.sm9Curve.pairing(RA.duplicate(),privateKey.d.duplicate());

        //step5.2:g2=e(Ppub,P2)^rB=e(P1,P2)^(rB*s)
        this.g2 =
                this.sm9Curve.pairing(masterKeyPair.getPublicKey().Q,this.sm9Curve.P2).duplicate().pow(r);

        //step5.3:g3=g1^rB = e(P1,P2)^(rA*rB*s)
        this.g3 = this.g1.duplicate().pow(r);

        System.out.println(g1);
        System.out.println(g2);
        System.out.println(g3);
    }

    /**
     * 发起方计算g1g2g3
     */
    private void g1g2g3FromA(SM9PrivateKey privateKey) {
        if (!this.sm9Curve.G1.equals(RB.getField())) {
            throw new RuntimeException("G1 R is mismatch");
        }
        //发起方
        //step5.1:g1=e(Ppub,P2)^rA = e(P1,P2)^(rA*s)
        this.g1 =
                this.sm9Curve.pairing(masterKeyPair.getPublicKey().Q,this.sm9Curve.P2).duplicate().pow(r);

        //step5.2:g2=e(RB,dA)=e(P1,P2)^(rB*s)
        this.g2 = this.sm9Curve.pairing(RB.duplicate(),privateKey.d.duplicate());

        //step5.3:g3=g2^rA = e(P1,P2)^(rA*rB*s)
        this.g3 = this.g2.duplicate().pow(r);

        System.out.println(g1);
        System.out.println(g2);
        System.out.println(g3);
    }


    /**
     * 计算共享密钥
     */
    private byte[] KDF(int kLen) throws Exception {
        //step7.1:拼接IDA||IDB||RA||RB||g1||g2||g3
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        //IDA
        byte[] temp = IDA.getBytes();
        bos.write(temp,0,temp.length);
        //IDB
        temp = IDB.getBytes();
        bos.write(temp,0,temp.length);
        //RA
        temp = SM9Method.G1ElementToBytes(RA);
        bos.write(temp,0,temp.length);
        //RB
        temp = SM9Method.G1ElementToBytes(RB);
        bos.write(temp,0,temp.length);
        //g1
        temp = SM9Method.GTFiniteElementToByte(g1);
        bos.write(temp,0,temp.length);
        //g2
        temp = SM9Method.GTFiniteElementToByte(g2);
        bos.write(temp,0,temp.length);
        //g3
        temp = SM9Method.GTFiniteElementToByte(g3);
        bos.write(temp,0,temp.length);

        //step7.2: SKA = SKB = KDF(IDA||IDB||RA||RB||g1||g2||g3)
        this.SK = SM9Method.KDF(bos.toByteArray(),kLen);

        return this.SK;
    }

    /**
     * 确认密钥
     */
    private void ACKFromA() throws Exception {
        this.SA = HashS((byte)0x83);
        this.S1 = HashS((byte)0x82);
    }

    private void ACKFromB() {
        this.SB = HashS((byte)0x82);
        this.S2 = HashS((byte)0x83);
    }


    private byte[] HashS(byte byteX) {

        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        byte[] temp;
        bos.write(byteX);
        //g1
        temp = SM9Method.GTFiniteElementToByte(g1);
        bos.write(temp,0,temp.length);
        //hash
        temp = HashS();
        bos.write(temp,0,temp.length);


        return SM9Method.Hash(bos.toByteArray());
    }

    private byte[] HashS() {
        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        byte[] temp;
        temp = SM9Method.GTFiniteElementToByte(g2);
        bos.write(temp,0,temp.length);
        temp = SM9Method.GTFiniteElementToByte(g3);
        bos.write(temp,0,temp.length);
        temp = IDA.getBytes();
        bos.write(temp,0,temp.length);
        temp = IDB.getBytes();
        bos.write(temp,0,temp.length);
        temp = SM9Method.G1ElementToBytes(RA);
        bos.write(temp,0,temp.length);
        temp = SM9Method.G1ElementToBytes(RB);
        bos.write(temp,0,temp.length);


        return SM9Method.Hash(bos.toByteArray());
    }

    ////////////////////////////////////////////////////////////////////////////////
    //交换协商
    ////////////////////////////////////////////////////////////////////////////////

    /**
     * 发起方生成交换数据
     */
    public InitiatorTemporary initiatorGenerateRA(String IDB) {
        CurveElement RB = generateRFromA(IDB);

        this.IDB = IDB;
        return new InitiatorTemporary(this.r,RB);
    }


    /**
     * 响应方计算SB,RA,共享密钥
     */


    public ResponderTemporary responderKDF(
            String IDA,String RA,String IDB) throws Exception {

        this.IDA = IDA;
        this.RA = SM9Method.fromByteArray(sm9Curve,Hex.decode(RA));
        this.IDB = IDB;

        //用户B创建R
        CurveElement RB = generateRFromB(IDA);

        //用户私钥
        SM9PrivateKey bPrivateKey =
                keyGenerateCenter.genPrivateKey(masterKeyPair.getPrivateKey(),IDB,
                        SM9PrivateKey.PrivateKeyType.KEY_KEY_EXCHANGE);

        //响应方计算g1,g2,g3
        g1g2g3FromB(bPrivateKey);
        ACKFromB();

        return new ResponderTemporary(RB,SB,S2);
    }

    /**
     * 发起方计算SA,共享密钥,密钥确认
     */
    public InitiatorTemporary initiatorACK(
            String IDA,String RA,BigInteger rA,String IDB,String RB,String SB) throws Exception {

        return initiatorACK(masterKeyPair.getPrivateKey(),
                IDA,RA,rA,IDB,SM9Method.fromByteArray(sm9Curve,Hex.decode(RB)),Hex.decode(SB));
    }

    public InitiatorTemporary initiatorACK(
            SM9MasterKeyPair.MasterPrivateKey masterPrivateKey,
            String IDA,
            String RA,
            BigInteger rA,
            String IDB,
            CurveElement RB,
            String SB) throws Exception {

        return initiatorACK(masterPrivateKey,IDA,RA,rA,IDB,RB,Hex.decode(SB));
    }

    public InitiatorTemporary initiatorACK(
            SM9MasterKeyPair.MasterPrivateKey masterPrivateKey,String IDA,String RA,BigInteger rA,
            String IDB,CurveElement RB,
            byte[] SB) throws Exception {

        //用户私钥
        SM9PrivateKey aPrivateKey =
                keyGenerateCenter.genPrivateKey(masterPrivateKey,IDA,
                        SM9PrivateKey.PrivateKeyType.KEY_KEY_EXCHANGE);

        //发起方计算g1,g2,g3
        this.RA = SM9Method.fromByteArray(sm9Curve,Hex.decode(RA));
        this.r = rA;
        this.IDB = IDB;
        this.RB = RB;
        g1g2g3FromA(aPrivateKey);

        this.IDA = IDA;
        ACKFromA();

//        //判断S1==SB
//        if () {
//            //密钥确认成功
//            this.SK = KDF(64);
//            return SA;
//        } else {
//            //密钥确认失败
//            throw new Exception("密钥确认失败");
//        }

        return new InitiatorTemporary(Hex.toHexString(SA),Arrays.equals(S1,SB));
    }

    /**
     * 响应方密钥确认
     */
    public  static boolean responderAck(String SA,String S2) {
        return responderAck(Hex.decode(SA),Hex.decode(S2));
    }

    public static boolean responderAck(byte[] SA,byte[] S2) {
        //判断SA==S2
        return Arrays.equals(SA,S2);
    }

}
