package com.google.common.primitives;

import java.io.Serializable;
import java.util.Arrays;
import t1.Xo;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class I28 implements Serializable {
    private static final I28 J2 = new I28(new int[0]);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final int f59810O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int[] f59811n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final transient int f59812t;

    private I28(int[] iArr) {
        this(iArr, 0, iArr.length);
    }

    public static I28 n(int[] iArr) {
        return iArr.length == 0 ? J2 : new I28(Arrays.copyOf(iArr, iArr.length));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof I28)) {
            return false;
        }
        I28 i28 = (I28) obj;
        if (O() != i28.O()) {
            return false;
        }
        for (int i2 = 0; i2 < O(); i2++) {
            if (rl(i2) != i28.rl(i2)) {
                return false;
            }
        }
        return true;
    }

    private I28(int[] iArr, int i2, int i3) {
        this.f59811n = iArr;
        this.f59812t = i2;
        this.f59810O = i3;
    }

    public static I28 J2() {
        return J2;
    }

    private boolean nr() {
        return this.f59812t > 0 || this.f59810O < this.f59811n.length;
    }

    public int O() {
        return this.f59810O - this.f59812t;
    }

    public int[] Uo() {
        return Arrays.copyOfRange(this.f59811n, this.f59812t, this.f59810O);
    }

    public int hashCode() {
        int iKN = 1;
        for (int i2 = this.f59812t; i2 < this.f59810O; i2++) {
            iKN = (iKN * 31) + Wre.KN(this.f59811n[i2]);
        }
        return iKN;
    }

    public boolean t() {
        return this.f59810O == this.f59812t;
    }

    public I28 KN() {
        if (nr()) {
            return new I28(Uo());
        }
        return this;
    }

    Object readResolve() {
        if (t()) {
            return J2;
        }
        return this;
    }

    public int rl(int i2) {
        Xo.az(i2, O());
        return this.f59811n[this.f59812t + i2];
    }

    public String toString() {
        if (t()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder(O() * 5);
        sb.append('[');
        sb.append(this.f59811n[this.f59812t]);
        int i2 = this.f59812t;
        while (true) {
            i2++;
            if (i2 < this.f59810O) {
                sb.append(", ");
                sb.append(this.f59811n[i2]);
            } else {
                sb.append(']');
                return sb.toString();
            }
        }
    }

    Object writeReplace() {
        return KN();
    }
}
