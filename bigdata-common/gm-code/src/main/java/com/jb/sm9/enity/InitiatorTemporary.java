package com.jb.sm9.enity;

import com.jb.sm9.method.SM9Method;
import it.unisa.dia.gas.plaf.jpbc.field.curve.CurveElement;
import org.bouncycastle.util.encoders.Hex;

import java.math.BigInteger;

public class InitiatorTemporary {

    public BigInteger rA;

    public String RA;
    public String SA;
    public String  S1;

    public Boolean ack;

    public InitiatorTemporary(BigInteger rA,String RA,String SA,String s1) {
        this.rA = rA;
        this.RA = RA;
        this.SA = SA;
        S1 = s1;
    }

    public InitiatorTemporary(BigInteger rA,CurveElement RA,String SA,String s1) {
        this.rA = rA;
        this.RA = Hex.toHexString(SM9Method.toByteArray(RA));
        this.SA = SA;
        S1 = s1;
    }

    public InitiatorTemporary(BigInteger rA,CurveElement RA,byte[] SA,byte[] S1) {
        this.rA = rA;
        this.RA = Hex.toHexString(SM9Method.toByteArray(RA));;
        this.SA = Hex.toHexString(SA);
        this.S1 = Hex.toHexString(S1);
    }

    public InitiatorTemporary(BigInteger rA,CurveElement RA) {
        this.rA = rA;
        this.RA = Hex.toHexString(SM9Method.toByteArray(RA));
    }

    public InitiatorTemporary(String SA,Boolean ack) {
        this.SA = SA;
        this.ack = ack;
    }
}
