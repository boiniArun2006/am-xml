package GO;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class Pl implements QJ.w6 {
    private final n J2;
    private final n KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Ml f3525O;
    private final n Uo;
    private boolean mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final I28 f3526n;
    private final n nr;
    private final Xo rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final CN3 f3527t;
    private final n xMQ;

    public Pl() {
        this(null, null, null, null, null, null, null, null, null);
    }

    @Override // QJ.w6
    public ef.w6 n(com.airbnb.lottie.Xo xo, FQq.Dsr dsr, gL.n nVar) {
        return null;
    }

    public Pl(I28 i28, Xo xo, CN3 cn3, n nVar, Ml ml, n nVar2, n nVar3, n nVar4, n nVar5) {
        this.mUb = false;
        this.f3526n = i28;
        this.rl = xo;
        this.f3527t = cn3;
        this.nr = nVar;
        this.f3525O = ml;
        this.KN = nVar2;
        this.xMQ = nVar3;
        this.J2 = nVar4;
        this.Uo = nVar5;
    }

    public Xo J2() {
        return this.rl;
    }

    public CN3 KN() {
        return this.f3527t;
    }

    public Ml O() {
        return this.f3525O;
    }

    public n Uo() {
        return this.nr;
    }

    public void az(boolean z2) {
        this.mUb = z2;
    }

    public n gh() {
        return this.KN;
    }

    public n mUb() {
        return this.Uo;
    }

    public n nr() {
        return this.xMQ;
    }

    public boolean qie() {
        return this.mUb;
    }

    public B.eO rl() {
        return new B.eO(this);
    }

    public I28 t() {
        return this.f3526n;
    }

    public n xMQ() {
        return this.J2;
    }
}
