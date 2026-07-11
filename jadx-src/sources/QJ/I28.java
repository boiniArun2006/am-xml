package QJ;

import android.graphics.Path;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class I28 implements w6 {
    private final GO.Wre J2;
    private final GO.n KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final GO.Wre f7978O;
    private final String Uo;
    private final boolean mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final CN3 f7979n;
    private final GO.Ml nr;
    private final Path.FillType rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final GO.w6 f7980t;
    private final GO.n xMQ;

    public String J2() {
        return this.Uo;
    }

    public GO.Wre KN() {
        return this.f7978O;
    }

    public CN3 O() {
        return this.f7979n;
    }

    public GO.Ml Uo() {
        return this.nr;
    }

    @Override // QJ.w6
    public ef.w6 n(com.airbnb.lottie.Xo xo, FQq.Dsr dsr, gL.n nVar) {
        return new ef.fuX(xo, dsr, nVar, this);
    }

    public GO.w6 nr() {
        return this.f7980t;
    }

    public GO.Wre rl() {
        return this.J2;
    }

    public Path.FillType t() {
        return this.rl;
    }

    public boolean xMQ() {
        return this.mUb;
    }

    public I28(String str, CN3 cn3, Path.FillType fillType, GO.w6 w6Var, GO.Ml ml, GO.Wre wre, GO.Wre wre2, GO.n nVar, GO.n nVar2, boolean z2) {
        this.f7979n = cn3;
        this.rl = fillType;
        this.f7980t = w6Var;
        this.nr = ml;
        this.f7978O = wre;
        this.J2 = wre2;
        this.Uo = str;
        this.KN = nVar;
        this.xMQ = nVar2;
        this.mUb = z2;
    }
}
