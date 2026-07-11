package QJ;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class n implements w6 {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final boolean f8030O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f8031n;
    private final boolean nr;
    private final GO.Xo rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final GO.Wre f8032t;

    public boolean J2() {
        return this.nr;
    }

    public boolean O() {
        return this.f8030O;
    }

    @Override // QJ.w6
    public ef.w6 n(com.airbnb.lottie.Xo xo, FQq.Dsr dsr, gL.n nVar) {
        return new ef.Wre(xo, nVar, this);
    }

    public GO.Wre nr() {
        return this.f8032t;
    }

    public String rl() {
        return this.f8031n;
    }

    public GO.Xo t() {
        return this.rl;
    }

    public n(String str, GO.Xo xo, GO.Wre wre, boolean z2, boolean z3) {
        this.f8031n = str;
        this.rl = xo;
        this.f8032t = wre;
        this.nr = z2;
        this.f8030O = z3;
    }
}
