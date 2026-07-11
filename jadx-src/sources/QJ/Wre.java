package QJ;

import QJ.l3D;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class Wre implements w6 {
    private final GO.Wre J2;
    private final l3D.j KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final GO.Wre f7985O;
    private final GO.n Uo;
    private final boolean az;
    private final List gh;
    private final float mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f7986n;
    private final GO.Ml nr;
    private final GO.n qie;
    private final CN3 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final GO.w6 f7987t;
    private final l3D.n xMQ;

    public CN3 J2() {
        return this.rl;
    }

    public List KN() {
        return this.gh;
    }

    public GO.w6 O() {
        return this.f7987t;
    }

    public l3D.n Uo() {
        return this.xMQ;
    }

    public GO.n az() {
        return this.Uo;
    }

    public GO.Ml gh() {
        return this.nr;
    }

    public String mUb() {
        return this.f7986n;
    }

    @Override // QJ.w6
    public ef.w6 n(com.airbnb.lottie.Xo xo, FQq.Dsr dsr, gL.n nVar) {
        return new ef.Dsr(xo, nVar, this);
    }

    public GO.Wre nr() {
        return this.J2;
    }

    public GO.Wre qie() {
        return this.f7985O;
    }

    public l3D.j rl() {
        return this.KN;
    }

    public GO.n t() {
        return this.qie;
    }

    public boolean ty() {
        return this.az;
    }

    public float xMQ() {
        return this.mUb;
    }

    public Wre(String str, CN3 cn3, GO.w6 w6Var, GO.Ml ml, GO.Wre wre, GO.Wre wre2, GO.n nVar, l3D.j jVar, l3D.n nVar2, float f3, List list, GO.n nVar3, boolean z2) {
        this.f7986n = str;
        this.rl = cn3;
        this.f7987t = w6Var;
        this.nr = ml;
        this.f7985O = wre;
        this.J2 = wre2;
        this.Uo = nVar;
        this.KN = jVar;
        this.xMQ = nVar2;
        this.mUb = f3;
        this.gh = list;
        this.qie = nVar3;
        this.az = z2;
    }
}
