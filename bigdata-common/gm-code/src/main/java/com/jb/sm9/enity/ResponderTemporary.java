package com.jb.sm9.enity;

import com.jb.sm9.method.SM9Method;
import it.unisa.dia.gas.plaf.jpbc.field.curve.CurveElement;
import org.bouncycastle.util.encoders.Hex;

import java.math.BigInteger;

public class ResponderTemporary {

    public BigInteger rB;

    public String RB;
    public String SB;

    public String S2;


    public ResponderTemporary(BigInteger rB,String RB,String SB,String s2) {
        this.rB = rB;
        this.RB = RB;
        this.SB = SB;
        S2 = s2;
    }

    public ResponderTemporary(BigInteger rB,CurveElement RB,String SB,String s2) {
        this.rB = rB;
        this.RB = Hex.toHexString(SM9Method.toByteArray(RB));
        this.SB = SB;
        S2 = s2;
    }

    public ResponderTemporary(BigInteger rB,CurveElement RB,byte[] SB,byte[] S2) {
        this.rB = rB;
        this.RB = Hex.toHexString(SM9Method.toByteArray(RB));
        this.SB = Hex.toHexString(SB);
        this.S2 = Hex.toHexString(S2);
    }

    public ResponderTemporary(CurveElement RB,byte[] SB,byte[] S2) {
        this.RB = Hex.toHexString(SM9Method.toByteArray(RB));
        this.SB = Hex.toHexString(SB);
        this.S2 = Hex.toHexString(S2);
    }


}
