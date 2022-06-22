package com.jb.sm9.core;

import com.jb.sm9.method.SM9Method;
import com.jb.util.Hex;
import it.unisa.dia.gas.jpbc.*;
import it.unisa.dia.gas.plaf.jpbc.field.curve.CurveElement;
import it.unisa.dia.gas.plaf.jpbc.field.curve.CurveField;
import it.unisa.dia.gas.plaf.jpbc.field.gt.GTFiniteElement;
import it.unisa.dia.gas.plaf.jpbc.field.gt.GTFiniteField;
import it.unisa.dia.gas.plaf.jpbc.field.poly.PolyModField;
import it.unisa.dia.gas.plaf.jpbc.pairing.f.TypeFPairing;
import it.unisa.dia.gas.plaf.jpbc.pairing.map.AbstractPairingMap;
import it.unisa.dia.gas.plaf.jpbc.pairing.parameters.PropertiesParameters;

import java.math.BigInteger;
import java.security.SecureRandom;

/**
 * @author zhaojb
 * SM9椭圆曲线
 */
public class SM9Curve {
    public SecureRandom random;
    public BigInteger N;
    public CurveField G1;
    public CurveField G2;
    public GTFiniteField GT;
    public SM9CurveParameters.SM9Pairing sm9Pairing;
    public CurveElement P1;
    public CurveElement P2;
    public static final byte HID_SIGN = 1;
    public static final byte HID_KEY_EXCHANGE = 2;
    public static final byte HID_ENCRYPT = 3;

    public SM9Curve() {
        this(new SecureRandom());
    }

    public SM9Curve(SecureRandom random) {
        this.random = random;
        PairingParameters parameters = SM9CurveParameters.createSM9PropertiesParameters();
        this.sm9Pairing = new SM9CurveParameters.SM9Pairing(random,parameters);
        this.N = this.sm9Pairing.getN();
        this.G1 = (CurveField)this.sm9Pairing.getG1();
        this.G2 = (CurveField)this.sm9Pairing.getG2();
        this.GT = (GTFiniteField)this.sm9Pairing.getGT();
        this.P1 = this.G1.newElement();
        this.P1.setFromBytes(SM9CurveParameters.P1_bytes);
        this.P2 = this.G2.newElement();
        this.P2.setFromBytes(SM9CurveParameters.P2_bytes);

    }

    public Element pairing(CurveElement p1,CurveElement p2) {
        return this.sm9Pairing.pairing(p1,p2);
    }

    @Override
    public String toString() {
        StringBuffer sb = new StringBuffer();
        String newLine = "\n";
        PairingParameters pairingParameters = this.sm9Pairing.getPairingParameters();
        sb.append("----------------------------------------------------------------------");
        sb.append(newLine);
        sb.append("SM9 curve parameters:");
        sb.append(newLine);
        sb.append("b:\n");
        sb.append(SM9Method.toHexString(SM9Method.BigIntegerToBytes(pairingParameters.getBigInteger("b"))));
        sb.append(newLine);
        sb.append("t:\n");
        sb.append(SM9Method.toHexString(SM9Method.BigIntegerToBytes(pairingParameters.getBigInteger("t"))));
        sb.append(newLine);
        sb.append("q:\n");
        sb.append(SM9Method.toHexString(SM9Method.BigIntegerToBytes(pairingParameters.getBigInteger("q"))));
        sb.append(newLine);
        sb.append("N:\n");
        sb.append(SM9Method.toHexString(SM9Method.BigIntegerToBytes(pairingParameters.getBigInteger("r"))));
        sb.append(newLine);
        sb.append("beta:\n");
        sb.append(SM9Method.toHexString(SM9Method.BigIntegerToBytes(pairingParameters.getBigInteger("beta"))));
        sb.append(newLine);
        sb.append("alpha0:\n");
        sb.append(SM9Method.toHexString(SM9Method.BigIntegerToBytes(pairingParameters.getBigInteger("alpha0"))));
        sb.append(newLine);
        sb.append("alpha1:\n");
        sb.append(SM9Method.toHexString(SM9Method.BigIntegerToBytes(pairingParameters.getBigInteger("alpha1"))));
        sb.append(newLine);
        sb.append("P1:\n");
        sb.append(SM9Method.toHexString(SM9Method.G1ElementToBytes(this.P1)));
        sb.append(newLine);
        sb.append("P2:\n");
        sb.append(SM9Method.toHexString(SM9Method.G2ElementToByte(this.P2)));
        sb.append("----------------------------------------------------------------------");
        sb.append(newLine);
        return sb.toString();
    }

    public static class SM9CurveParameters {
        public static final int nBits = 256;
        public static final int nbeta = -2;
        public static final int eid = 4;
        public static final BigInteger b = BigInteger.valueOf(5L);
        public static final BigInteger t = new BigInteger("600000000058F98A",16);
        public static final BigInteger q = new BigInteger(
                "B640000002A3A6F1D603AB4FF58EC74521F2934B1A7AEEDBE56F9B27E351457D",16);
        public static final BigInteger N = new BigInteger(
                "B640000002A3A6F1D603AB4FF58EC74449F2934B18EA8BEEE56EE19CD69ECF25",16);
        public static final BigInteger beta = new BigInteger(
                "B640000002A3A6F1D603AB4FF58EC74521F2934B1A7AEEDBE56F9B27E351457B",16);
        public static final BigInteger alpha0;
        public static final BigInteger alpha1;
        public static final BigInteger P1_x;
        public static final BigInteger P1_y;
        public static final BigInteger P2_x_a;
        public static final BigInteger P2_x_b;
        public static final BigInteger P2_y_a;
        public static final BigInteger P2_y_b;
        public static byte[] P1_bytes;
        public static byte[] P2_bytes;

        public SM9CurveParameters() {
        }

        public static PropertiesParameters createSM9PropertiesParameters() {
            PropertiesParameters params = new PropertiesParameters();
            params.put("type","f");
            params.put("q",q.toString());
            params.put("r",N.toString());
            params.put("b",b.toString());
            params.put("beta",beta.toString());
            params.put("alpha0",alpha0.toString());
            params.put("alpha1",alpha1.toString());
            params.put("t",t.toString());
            return params;
        }

        static {
            alpha0 = BigInteger.ZERO;
            alpha1 = new BigInteger(
                    "B640000002A3A6F1D603AB4FF58EC74521F2934B1A7AEEDBE56F9B27E351457C"
                    ,16);
            P1_x = new BigInteger(
                    "93DE051D62BF718FF5ED0704487D01D6E1E4086909DC3280E8C4E4817C66DDDD",
                    16);
            P1_y = new BigInteger(
                    "21FE8DDA4F21E607631065125C395BBC1C1C00CBFA6024350C464CD70A3EA616",
                    16);
            P2_x_a = new BigInteger(
                    "3722755292130B08D2AAB97FD34EC120EE265948D19C17ABF9B7213BAF82D65B"
                    ,16);
            P2_x_b = new BigInteger(
                    "85AEF3D078640C98597B6027B441A01FF1DD2C190F5E93C454806C11D8806141"
                    ,16);
            P2_y_a = new BigInteger(
                    "A7CF28D519BE3DA65F3170153D278FF247EFBA98A71A08116215BBA5C999A7C7"
                    ,16);
            P2_y_b = new BigInteger(
                    "17509B092E845C1266BA0D262CBEE6ED0736A96FA347C8BD856DC76B84EBEB96"
                    ,16);

            P1_bytes = Hex.decode(
                    "93DE051D62BF718FF5ED0704487D01D6E1E4086909DC3280E8C4E4817C66DDDD21FE8DDA4F21E607631065125C395BBC1C1C00CBFA6024350C464CD70A3EA616");
            P2_bytes = Hex.decode(
                    "3722755292130B08D2AAB97FD34EC120EE265948D19C17ABF9B7213BAF82D65B85AEF3D078640C98597B6027B441A01FF1DD2C190F5E93C454806C11D8806141A7CF28D519BE3DA65F3170153D278FF247EFBA98A71A08116215BBA5C999A7C717509B092E845C1266BA0D262CBEE6ED0736A96FA347C8BD856DC76B84EBEB96");

//        P1_bytes = Hex.decode
//        ("93DE051D62BF718FF5ED0704487D01D6E1E4086909DC3280E8C4E4817C66DDDD21FE8DDA4F21E607631065125C395BBC1C1C00CBFA6024350C464CD70A3EA616");
//        P2_bytes = Hex.decode
//        ("3722755292130B08D2AAB97FD34EC120EE265948D19C17ABF9B7213BAF82D65B85AEF3D078640C98597B6027B441A01FF1DD2C190F5E93C454806C11D8806141A7CF28D519BE3DA65F3170153D278FF247EFBA98A71A08116215BBA5C999A7C717509B092E845C1266BA0D262CBEE6ED0736A96FA347C8BD856DC76B84EBEB96");
//        }
        }

        /**
         * SM9配对
         */
        public static class SM9Pairing extends TypeFPairing {
            protected BigInteger t;

            public SM9Pairing(PairingParameters curveParams) {
                super(curveParams);
            }

            public SM9Pairing(SecureRandom random,PairingParameters curveParams) {
                super(random,curveParams);
            }

            @Override
            protected void initParams() {
                super.initParams();
                this.t = this.curveParams.getBigInteger("t");
            }

            @Override
            protected void initMap() {
                this.pairingMap = new SM9RatePairingMap(this);
            }

            public BigInteger getN() {
                return this.r;
            }

            public Field getFq2() {
                return this.Fq2;
            }

            public PolyModField getFq12() {
                return this.Fq12;
            }

            public BigInteger getQ() {
                return this.q;
            }

            public Element getNegAlphaInv() {
                return this.negAlphaInv;
            }

            public PairingParameters getPairingParameters() {
                return this.curveParams;
            }

        }

        /**
         * 斜率配对
         */
        public static class SM9RatePairingMap extends AbstractPairingMap {
            private SM9Pairing pairingData;

            public SM9RatePairingMap(SM9Pairing pairing) {
                super(pairing);
                this.pairingData = pairing;
            }

            public Element pairing(Point P,Point Q) {
                BigInteger a =
                        this.pairingData.t.multiply(BigInteger.valueOf(6L)).add(BigInteger.valueOf(2L));
                Point t = (Point)Q.duplicate();
                Polynomial f = (Polynomial)this.pairingData.getFq12().newOneElement();

                for (int i = a.bitLength() - 2;i >= 0;--i) {
                    f.square();
                    f.mul(this.line(t,P));
                    t.add(t);
                    if (a.testBit(i)) {
                        f.mul(this.line(t,Q,P));
                        t.add(Q);
                    }
                }

                Point Q11 = this.fobasmiracl(Q);
                Point Q22 = this.fobasmiracl(Q11);
                f.mul(this.line(t,Q11,P));
                t.add(Q11);
                f.mul(this.line(t,(Point)Q22.negate(),P));
                t.sub(Q22);
                BigInteger q = this.pairingData.getQ();
                Element e =
                        f.duplicate().pow(q.pow(12).subtract(BigInteger.ONE).divide(this.pairingData.getN()));
                return new GTFiniteElement(this,(GTFiniteField)this.pairingData.getGT(),e);
            }

            @Override
            public void finalPow(Element element) {
            }

            public Element line(Point A,Point B,Point C) {
                Element ax = A.getX().duplicate();
                Element ay = A.getY().duplicate();
                Element bx = B.getX().duplicate();
                Element by = B.getY().duplicate();
                Element cx = C.getX().duplicate();
                Element cy = C.getY().duplicate();
                Point lamda = (Point)ax.getField().newElement();
                lamda = (Point)ay.duplicate().sub(by).div(ax.duplicate().sub(bx));
                Element cof3 = by.duplicate().sub(lamda.duplicate().mul(bx));
                Element cof5 = lamda.duplicate().mulZn(cx);
                Polynomial result = this.pairingData.getFq12().newElement();
                Element betaInvert = this.pairingData.getNegAlphaInv();
                Point tempfp2 = (Point)ax.getField().newElement();
                tempfp2.getX().set(cy.negate());
                tempfp2.getY().setToZero();
                result.getCoefficient(0).set(tempfp2);
                result.getCoefficient(3).set(cof3.mul(betaInvert));
                result.getCoefficient(5).set(cof5.mul(betaInvert));
                return result;
            }

            public Element line(Point A,Point C) {
                Element ax = A.getX().duplicate();
                Element ay = A.getY().duplicate();
                Element cx = C.getX().duplicate();
                Element cy = C.getY().duplicate();
                Element lamda = ax.getField().newElement();
                lamda = ax.duplicate().square().mul(3).div(ay.duplicate().mul(2));
                Element cof3 = ay.duplicate().sub(lamda.duplicate().mul(ax));
                Element cof5 = lamda.duplicate().mulZn(cx);
                Polynomial result = this.pairingData.getFq12().newElement();
                Element betaInvert = this.pairingData.getNegAlphaInv();
                Point tempfp2 = (Point)ax.getField().newElement();
                tempfp2.getX().set(cy.negate());
                tempfp2.getY().setToZero();
                result.getCoefficient(0).set(tempfp2);
                result.getCoefficient(3).set(cof3.mul(betaInvert));
                result.getCoefficient(5).set(cof5.mul(betaInvert));
                return result;
            }

            public Point fobasmiracl(Point point) {
                Point px = (Point)point.getX().duplicate();
                Point py = (Point)point.getY().duplicate();
                BigInteger q = this.pairingData.getQ();
                Point x = (Point)this.pairingData.getFq2().newElement();
                x.getX().setToZero();
                x.getY().setToOne();
                x.pow(q.subtract(BigInteger.ONE).divide(BigInteger.valueOf(6L)));
                Point r = (Point)x.duplicate().invert();
                Point w = (Point)r.duplicate().square();
                px.getY().negate();
                px.mul(w);
                py.getY().negate();
                py.mul(w).mul(r);
                Point result = (Point)point.getField().newRandomElement();
                result.getX().set(px);
                result.getY().set(py);
                return result;
            }
        }
    }
}
