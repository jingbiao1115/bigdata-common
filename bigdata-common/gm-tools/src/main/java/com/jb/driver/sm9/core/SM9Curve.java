package com.jb.driver.sm9.core;

import com.jb.driver.sm9.SM9Hex;
import com.jb.driver.sm9.method.SM9Method;
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
    private SecureRandom random;
    private BigInteger bigIntegerN;
    private CurveField curveFieldG1;
    private CurveField curveFieldG2;
    private GTFiniteField finiteFieldGT;
    private SM9CurveParameters.SM9Pairing sm9Pairing;
    private CurveElement curveP1;
    private CurveElement curveP2;
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
        this.bigIntegerN = this.sm9Pairing.getN();
        this.curveFieldG1 = (CurveField)this.sm9Pairing.getG1();
        this.curveFieldG2 = (CurveField)this.sm9Pairing.getG2();
        this.finiteFieldGT = (GTFiniteField)this.sm9Pairing.getGT();
        this.curveP1 = this.curveFieldG1.newElement();
        this.curveP1.setFromBytes(SM9CurveParameters.P1_BYTES);
        this.curveP2 = this.curveFieldG2.newElement();
        this.curveP2.setFromBytes(SM9CurveParameters.P2_BYTES);

    }

    public Element pairing(CurveElement p1,CurveElement p2) {
        return this.sm9Pairing.pairing(p1,p2);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        char newLine = '\n';
        PairingParameters pairingParameters = this.sm9Pairing.getPairingParameters();
        sb.append("----------------------------------------------------------------------");
        sb.append(newLine);
        sb.append("SM9 curve parameters:");
        sb.append(newLine);
        sb.append("b:\n");
        sb.append(SM9Method.toHexString(SM9Method.bigIntegerToBytes(pairingParameters.getBigInteger("b"))));
        sb.append(newLine);
        sb.append("t:\n");
        sb.append(SM9Method.toHexString(SM9Method.bigIntegerToBytes(pairingParameters.getBigInteger("t"))));
        sb.append(newLine);
        sb.append("q:\n");
        sb.append(SM9Method.toHexString(SM9Method.bigIntegerToBytes(pairingParameters.getBigInteger("q"))));
        sb.append(newLine);
        sb.append("N:\n");
        sb.append(SM9Method.toHexString(SM9Method.bigIntegerToBytes(pairingParameters.getBigInteger("r"))));
        sb.append(newLine);
        sb.append("beta:\n");
        sb.append(SM9Method.toHexString(SM9Method.bigIntegerToBytes(pairingParameters.getBigInteger("beta"))));
        sb.append(newLine);
        sb.append("alpha0:\n");
        sb.append(SM9Method.toHexString(SM9Method.bigIntegerToBytes(pairingParameters.getBigInteger("alpha0"))));
        sb.append(newLine);
        sb.append("alpha1:\n");
        sb.append(SM9Method.toHexString(SM9Method.bigIntegerToBytes(pairingParameters.getBigInteger("alpha1"))));
        sb.append(newLine);
        sb.append("P1:\n");
        sb.append(SM9Method.toHexString(SM9Method.curveFieldG1ToBytes(this.curveP1)));
        sb.append(newLine);
        sb.append("P2:\n");
        sb.append(SM9Method.toHexString(SM9Method.curveFieldG2ToByte(this.curveP2)));
        sb.append("----------------------------------------------------------------------");
        sb.append(newLine);
        return sb.toString();
    }

    public static class SM9CurveParameters {
        public static final int N_BITS = 256;
        public static final int N_BETA = -2;
        public static final int EID = 4;
        private static final BigInteger B = BigInteger.valueOf(5L);
        private static final BigInteger T = new BigInteger("600000000058F98A",16);
        private static final BigInteger Q = new BigInteger(
                "B640000002A3A6F1D603AB4FF58EC74521F2934B1A7AEEDBE56F9B27E351457D",16);
        private static final BigInteger N = new BigInteger(
                "B640000002A3A6F1D603AB4FF58EC74449F2934B18EA8BEEE56EE19CD69ECF25",16);
        private static final BigInteger BETA = new BigInteger(
                "B640000002A3A6F1D603AB4FF58EC74521F2934B1A7AEEDBE56F9B27E351457B",16);
        private static final BigInteger ALPHA0 = BigInteger.ZERO;
        private static final BigInteger ALPHA1 = new BigInteger(
                "B640000002A3A6F1D603AB4FF58EC74521F2934B1A7AEEDBE56F9B27E351457C"
                ,16);
        private static final BigInteger P1_X = new BigInteger(
                "93DE051D62BF718FF5ED0704487D01D6E1E4086909DC3280E8C4E4817C66DDDD",
                16);
        private static final BigInteger P1_Y = new BigInteger(
                "21FE8DDA4F21E607631065125C395BBC1C1C00CBFA6024350C464CD70A3EA616",
                16);
        private static final BigInteger P2_X_A = new BigInteger(
                "3722755292130B08D2AAB97FD34EC120EE265948D19C17ABF9B7213BAF82D65B"
                ,16);
        private static final BigInteger P2_X_B = new BigInteger(
                "85AEF3D078640C98597B6027B441A01FF1DD2C190F5E93C454806C11D8806141"
                ,16);
        private static final BigInteger P2_Y_A = new BigInteger(
                "A7CF28D519BE3DA65F3170153D278FF247EFBA98A71A08116215BBA5C999A7C7"
                ,16);
        private static final BigInteger P2_Y_B = new BigInteger(
                "17509B092E845C1266BA0D262CBEE6ED0736A96FA347C8BD856DC76B84EBEB96"
                ,16);
        private static final byte[] P1_BYTES  =SM9Hex.decode(
                "93DE051D62BF718FF5ED0704487D01D6E1E4086909DC3280E8C4E4817C66DDDD21FE8DDA4F21E607631065125C395BBC1C1C00CBFA6024350C464CD70A3EA616");
        private static final byte[] P2_BYTES = SM9Hex.decode(
                "3722755292130B08D2AAB97FD34EC120EE265948D19C17ABF9B7213BAF82D65B85AEF3D078640C98597B6027B441A01FF1DD2C190F5E93C454806C11D8806141A7CF28D519BE3DA65F3170153D278FF247EFBA98A71A08116215BBA5C999A7C717509B092E845C1266BA0D262CBEE6ED0736A96FA347C8BD856DC76B84EBEB96");

        private SM9CurveParameters() {
        }

        public static PropertiesParameters createSM9PropertiesParameters() {
            PropertiesParameters params = new PropertiesParameters();
            params.put("type","f");
            params.put("q",Q.toString());
            params.put("r",N.toString());
            params.put("b",B.toString());
            params.put("beta",BETA.toString());
            params.put("alpha0",ALPHA0.toString());
            params.put("alpha1",ALPHA1.toString());
            params.put("t",T.toString());
            return params;
        }

        /**
         *  static {
         *             alpha0 = BigInteger.ZERO;
         *             alpha1 = new BigInteger(
         *                     "B640000002A3A6F1D603AB4FF58EC74521F2934B1A7AEEDBE56F9B27E351457C"
         *                     ,16);
         *             P1_x = new BigInteger(
         *                     "93DE051D62BF718FF5ED0704487D01D6E1E4086909DC3280E8C4E4817C66DDDD",
         *                     16);
         *             P1_y = new BigInteger(
         *                     "21FE8DDA4F21E607631065125C395BBC1C1C00CBFA6024350C464CD70A3EA616",
         *                     16);
         *             P2_x_a = new BigInteger(
         *                     "3722755292130B08D2AAB97FD34EC120EE265948D19C17ABF9B7213BAF82D65B"
         *                     ,16);
         *             P2_x_b = new BigInteger(
         *                     "85AEF3D078640C98597B6027B441A01FF1DD2C190F5E93C454806C11D8806141"
         *                     ,16);
         *             P2_y_a = new BigInteger(
         *                     "A7CF28D519BE3DA65F3170153D278FF247EFBA98A71A08116215BBA5C999A7C7"
         *                     ,16);
         *             P2_y_b = new BigInteger(
         *                     "17509B092E845C1266BA0D262CBEE6ED0736A96FA347C8BD856DC76B84EBEB96"
         *                     ,16);
         *
         *             P1_bytes = SM9Hex.decode(
         *                     "93DE051D62BF718FF5ED0704487D01D6E1E4086909DC3280E8C4E4817C66DDDD21FE8DDA4F21E607631065125C395BBC1C1C00CBFA6024350C464CD70A3EA616");
         *             P2_bytes = SM9Hex.decode(
         *                     "3722755292130B08D2AAB97FD34EC120EE265948D19C17ABF9B7213BAF82D65B85AEF3D078640C98597B6027B441A01FF1DD2C190F5E93C454806C11D8806141A7CF28D519BE3DA65F3170153D278FF247EFBA98A71A08116215BBA5C999A7C717509B092E845C1266BA0D262CBEE6ED0736A96FA347C8BD856DC76B84EBEB96");
         *
         *         P1_bytes = Hex.decode
         *         ("93DE051D62BF718FF5ED0704487D01D6E1E4086909DC3280E8C4E4817C66DDDD21FE8DDA4F21E607631065125C395BBC1C1C00CBFA6024350C464CD70A3EA616");
         *         P2_bytes = Hex.decode
         *         ("3722755292130B08D2AAB97FD34EC120EE265948D19C17ABF9B7213BAF82D65B85AEF3D078640C98597B6027B441A01FF1DD2C190F5E93C454806C11D8806141A7CF28D519BE3DA65F3170153D278FF247EFBA98A71A08116215BBA5C999A7C717509B092E845C1266BA0D262CBEE6ED0736A96FA347C8BD856DC76B84EBEB96");
         *         }
         *         }
         *
         */

        /**
         * SM9配对
         */
        public static class SM9Pairing extends TypeFPairing {
            private BigInteger t;

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

            public Element pairing(Point pointP,Point pointQ) {
                BigInteger a =
                        this.pairingData.t.multiply(BigInteger.valueOf(6L)).add(BigInteger.valueOf(2L));
                Point t = (Point)pointQ.duplicate();
                Polynomial f = (Polynomial)this.pairingData.getFq12().newOneElement();

                for (int i = a.bitLength() - 2;i >= 0;--i) {
                    f.square();
                    f.mul(this.line(t,pointP));
                    t.add(t);
                    if (a.testBit(i)) {
                        f.mul(this.line(t,pointQ,pointP));
                        t.add(pointQ);
                    }
                }

                Point pointQ11 = this.fobasmiracl(pointQ);
                Point pointQ22 = this.fobasmiracl(pointQ11);
                f.mul(this.line(t,pointQ11,pointP));
                t.add(pointQ11);
                f.mul(this.line(t,(Point)pointQ22.negate(),pointP));
                t.sub(pointQ22);
                BigInteger q = this.pairingData.getQ();
                Element e =
                        f.duplicate().pow(q.pow(12).subtract(BigInteger.ONE).divide(this.pairingData.getN()));
                return new GTFiniteElement(this,(GTFiniteField)this.pairingData.getGT(),e);
            }

            @Override
            public void finalPow(Element element) {
                // element
            }

            public Element line(Point pointA,Point pointB,Point pointC) {
                Element ax = pointA.getX().duplicate();
                Element ay = pointA.getY().duplicate();
                Element bx = pointB.getX().duplicate();
                Element by = pointB.getY().duplicate();
                Element cx = pointC.getX().duplicate();
                Element cy = pointC.getY().duplicate();
//                Point lamda = (Point)ax.getField().newElement();
//                lamda = (Point)ay.duplicate().sub(by).div(ax.duplicate().sub(bx));
                Point lamda = (Point)ay.duplicate().sub(by).div(ax.duplicate().sub(bx));
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

            public Element line(Point pointA,Point pointC) {
                Element ax = pointA.getX().duplicate();
                Element ay = pointA.getY().duplicate();
                Element cx = pointC.getX().duplicate();
                Element cy = pointC.getY().duplicate();
//                Element lamda = ax.getField().newElement();
//                lamda = ax.duplicate().square().mul(3).div(ay.duplicate().mul(2));
                Element lamda = ax.duplicate().square().mul(3).div(ay.duplicate().mul(2));
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

    public SecureRandom getRandom() {
        return random;
    }

    public void setRandom(SecureRandom random) {
        this.random = random;
    }

    public BigInteger getBigIntegerN() {
        return bigIntegerN;
    }

    public void setBigIntegerN(BigInteger bigIntegerN) {
        this.bigIntegerN = bigIntegerN;
    }

    public CurveField getCurveFieldG1() {
        return curveFieldG1;
    }

    public void setCurveFieldG1(CurveField curveFieldG1) {
        this.curveFieldG1 = curveFieldG1;
    }

    public CurveField getCurveFieldG2() {
        return curveFieldG2;
    }

    public void setCurveFieldG2(CurveField curveFieldG2) {
        this.curveFieldG2 = curveFieldG2;
    }

    public GTFiniteField getFiniteFieldGT() {
        return finiteFieldGT;
    }

    public void setFiniteFieldGT(GTFiniteField finiteFieldGT) {
        this.finiteFieldGT = finiteFieldGT;
    }

    public SM9CurveParameters.SM9Pairing getSm9Pairing() {
        return sm9Pairing;
    }

    public void setSm9Pairing(SM9CurveParameters.SM9Pairing sm9Pairing) {
        this.sm9Pairing = sm9Pairing;
    }

    public CurveElement getCurveP1() {
        return curveP1;
    }

    public void setCurveP1(CurveElement curveP1) {
        this.curveP1 = curveP1;
    }

    public CurveElement getCurveP2() {
        return curveP2;
    }

    public void setCurveP2(CurveElement curveP2) {
        this.curveP2 = curveP2;
    }
}
