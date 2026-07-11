package QJ;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class o implements w6 {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final boolean f8033O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f8034n;
    private final GO.n nr;
    private final GO.Xo rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final GO.Xo f8035t;

    public boolean J2() {
        return this.f8033O;
    }

    public GO.Xo O() {
        return this.f8035t;
    }

    @Override // QJ.w6
    public ef.w6 n(com.airbnb.lottie.Xo xo, FQq.Dsr dsr, gL.n nVar) {
        return new ef.Xo(xo, nVar, this);
    }

    public GO.Xo nr() {
        return this.rl;
    }

    public GO.n rl() {
        return this.nr;
    }

    public String t() {
        return this.f8034n;
    }

    public String toString() {
        return "RectangleShape{position=" + this.rl + ", size=" + this.f8035t + '}';
    }

    public o(String str, GO.Xo xo, GO.Xo xo2, GO.n nVar, boolean z2) {
        this.f8034n = str;
        this.rl = xo;
        this.f8035t = xo2;
        this.nr = nVar;
        this.f8033O = z2;
    }
}
