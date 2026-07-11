package androidx.constraintlayout.core.parser;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class CLElement implements Cloneable {
    protected CLContainer J2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final char[] f35321n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f35322r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected long f35323t = -1;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    protected long f35320O = Long.MAX_VALUE;

    public void HI(int i2) {
        this.f35322r = i2;
    }

    protected String Ik() {
        return "";
    }

    public float J2() {
        if (this instanceof CLNumber) {
            return ((CLNumber) this).J2();
        }
        return Float.NaN;
    }

    public int KN() {
        if (this instanceof CLNumber) {
            return ((CLNumber) this).KN();
        }
        return 0;
    }

    protected String O() {
        if (!CLParser.nr) {
            return "";
        }
        return mUb() + " -> ";
    }

    public void az(CLContainer cLContainer) {
        this.J2 = cLContainer;
    }

    public void ck(long j2) {
        this.f35323t = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CLElement)) {
            return false;
        }
        CLElement cLElement = (CLElement) obj;
        if (this.f35323t == cLElement.f35323t && this.f35320O == cLElement.f35320O && this.f35322r == cLElement.f35322r && Arrays.equals(this.f35321n, cLElement.f35321n)) {
            return Objects.equals(this.J2, cLElement.J2);
        }
        return false;
    }

    public boolean gh() {
        char[] cArr = this.f35321n;
        return cArr != null && cArr.length >= 1;
    }

    public int hashCode() {
        int iHashCode = Arrays.hashCode(this.f35321n) * 31;
        long j2 = this.f35323t;
        int i2 = (iHashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.f35320O;
        int i3 = (i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
        CLContainer cLContainer = this.J2;
        return ((i3 + (cLContainer != null ? cLContainer.hashCode() : 0)) * 31) + this.f35322r;
    }

    public CLElement nr() {
        return this.J2;
    }

    public boolean qie() {
        return this.f35320O != Long.MAX_VALUE;
    }

    public String t() {
        String str = new String(this.f35321n);
        if (str.length() < 1) {
            return "";
        }
        long j2 = this.f35320O;
        if (j2 != Long.MAX_VALUE) {
            long j3 = this.f35323t;
            if (j2 >= j3) {
                return str.substring((int) j3, ((int) j2) + 1);
            }
        }
        long j4 = this.f35323t;
        return str.substring((int) j4, ((int) j4) + 1);
    }

    public String toString() {
        long j2 = this.f35323t;
        long j3 = this.f35320O;
        if (j2 > j3 || j3 == Long.MAX_VALUE) {
            return getClass() + " (INVALID, " + this.f35323t + "-" + this.f35320O + ")";
        }
        return mUb() + " (" + this.f35323t + " : " + this.f35320O + ") <<" + new String(this.f35321n).substring((int) this.f35323t, ((int) this.f35320O) + 1) + ">>";
    }

    public void ty(long j2) {
        if (this.f35320O != Long.MAX_VALUE) {
            return;
        }
        this.f35320O = j2;
        if (CLParser.nr) {
            System.out.println("closing " + hashCode() + " -> " + this);
        }
        CLContainer cLContainer = this.J2;
        if (cLContainer != null) {
            cLContainer.r(this);
        }
    }

    public int xMQ() {
        return this.f35322r;
    }

    public CLElement(char[] cArr) {
        this.f35321n = cArr;
    }

    protected String mUb() {
        String string = getClass().toString();
        return string.substring(string.lastIndexOf(46) + 1);
    }

    @Override // 
    public CLElement rl() {
        try {
            return (CLElement) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }
}
