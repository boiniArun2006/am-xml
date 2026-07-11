package j9w;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class C {
    private static C[] mUb;
    static final C[] xMQ;
    private final int J2;
    private final int KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final int f69324O;
    private final int Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f69325n;
    public final int nr;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f69326t;

    public C(boolean z2, int i2, int i3, int i5, int i7, int i8) {
        this(z2, i2, i3, i5, i7, i8, i2, i3);
    }

    static {
        C[] cArr = {new C(false, 3, 5, 8, 8, 1), new C(false, 5, 7, 10, 10, 1), new C(true, 5, 7, 16, 6, 1), new C(false, 8, 10, 12, 12, 1), new C(true, 10, 11, 14, 6, 2), new C(false, 12, 12, 14, 14, 1), new C(true, 16, 14, 24, 10, 1), new C(false, 18, 14, 16, 16, 1), new C(false, 22, 18, 18, 18, 1), new C(true, 22, 18, 16, 10, 2), new C(false, 30, 20, 20, 20, 1), new C(true, 32, 24, 16, 14, 2), new C(false, 36, 24, 22, 22, 1), new C(false, 44, 28, 24, 24, 1), new C(true, 49, 28, 22, 14, 2), new C(false, 62, 36, 14, 14, 4), new C(false, 86, 42, 16, 16, 4), new C(false, 114, 48, 18, 18, 4), new C(false, 144, 56, 20, 20, 4), new C(false, 174, 68, 22, 22, 4), new C(false, 204, 84, 24, 24, 4, 102, 42), new C(false, 280, 112, 14, 14, 16, 140, 56), new C(false, 368, 144, 16, 16, 16, 92, 36), new C(false, 456, 192, 18, 18, 16, 114, 48), new C(false, 576, 224, 20, 20, 16, 144, 56), new C(false, 696, 272, 22, 22, 16, 174, 68), new C(false, 816, 336, 24, 24, 16, 136, 56), new C(false, 1050, 408, 18, 18, 36, 175, 68), new C(false, 1304, 496, 20, 20, 36, 163, 62), new Ml()};
        xMQ = cArr;
        mUb = cArr;
    }

    C(boolean z2, int i2, int i3, int i5, int i7, int i8, int i9, int i10) {
        this.f69325n = z2;
        this.rl = i2;
        this.f69326t = i3;
        this.nr = i5;
        this.f69324O = i7;
        this.J2 = i8;
        this.Uo = i9;
        this.KN = i10;
    }

    private int O() {
        int i2 = this.J2;
        int i3 = 1;
        if (i2 != 1) {
            i3 = 2;
            if (i2 != 2 && i2 != 4) {
                if (i2 == 16) {
                    return 4;
                }
                if (i2 == 36) {
                    return 6;
                }
                throw new IllegalStateException("Cannot handle this number of data regions");
            }
        }
        return i3;
    }

    private int gh() {
        int i2 = this.J2;
        if (i2 == 1 || i2 == 2) {
            return 1;
        }
        if (i2 == 4) {
            return 2;
        }
        if (i2 == 16) {
            return 4;
        }
        if (i2 == 36) {
            return 6;
        }
        throw new IllegalStateException("Cannot handle this number of data regions");
    }

    public static C qie(int i2, o oVar, com.google.zxing.n nVar, com.google.zxing.n nVar2, boolean z2) {
        for (C c2 : mUb) {
            if (!(oVar == o.FORCE_SQUARE && c2.f69325n) && ((oVar != o.FORCE_RECTANGLE || c2.f69325n) && i2 <= c2.rl)) {
                return c2;
            }
        }
        if (z2) {
            throw new IllegalArgumentException("Can't find a symbol arrangement that matches the message. Data codewords: ".concat(String.valueOf(i2)));
        }
        return null;
    }

    public int J2() {
        return this.rl / this.Uo;
    }

    public final int n() {
        return this.rl;
    }

    public final int nr(int i2) {
        return this.KN;
    }

    public int rl(int i2) {
        return this.Uo;
    }

    public final int t() {
        return this.f69326t;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f69325n ? "Rectangular Symbol:" : "Square Symbol:");
        sb.append(" data region ");
        sb.append(this.nr);
        sb.append('x');
        sb.append(this.f69324O);
        sb.append(", symbol size ");
        sb.append(mUb());
        sb.append('x');
        sb.append(xMQ());
        sb.append(", symbol data size ");
        sb.append(KN());
        sb.append('x');
        sb.append(Uo());
        sb.append(", codewords ");
        sb.append(this.rl);
        sb.append('+');
        sb.append(this.f69326t);
        return sb.toString();
    }

    public final int KN() {
        return O() * this.nr;
    }

    public final int Uo() {
        return gh() * this.f69324O;
    }

    public final int mUb() {
        return KN() + (O() << 1);
    }

    public final int xMQ() {
        return Uo() + (gh() << 1);
    }
}
