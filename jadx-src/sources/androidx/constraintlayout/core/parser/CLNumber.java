package androidx.constraintlayout.core.parser;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class CLNumber extends CLElement {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    float f35325o;

    public CLNumber(char[] cArr) {
        super(cArr);
        this.f35325o = Float.NaN;
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CLNumber) {
            float fJ2 = J2();
            float fJ22 = ((CLNumber) obj).J2();
            if ((Float.isNaN(fJ2) && Float.isNaN(fJ22)) || fJ2 == fJ22) {
                return true;
            }
        }
        return false;
    }

    public static CLElement r(char[] cArr) {
        return new CLNumber(cArr);
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public float J2() {
        if (Float.isNaN(this.f35325o) && gh()) {
            this.f35325o = Float.parseFloat(t());
        }
        return this.f35325o;
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public int KN() {
        if (Float.isNaN(this.f35325o) && gh()) {
            this.f35325o = Integer.parseInt(t());
        }
        return (int) this.f35325o;
    }

    public CLNumber(float f3) {
        super(null);
        this.f35325o = f3;
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    protected String Ik() {
        float fJ2 = J2();
        int i2 = (int) fJ2;
        if (i2 == fJ2) {
            return "" + i2;
        }
        return "" + fJ2;
    }

    @Override // androidx.constraintlayout.core.parser.CLElement
    public int hashCode() {
        int iFloatToIntBits;
        int iHashCode = super.hashCode() * 31;
        float f3 = this.f35325o;
        if (f3 != 0.0f) {
            iFloatToIntBits = Float.floatToIntBits(f3);
        } else {
            iFloatToIntBits = 0;
        }
        return iHashCode + iFloatToIntBits;
    }
}
