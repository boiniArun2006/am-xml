package QJ;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class qz implements w6 {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final boolean f8036O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f8037n;
    private final GO.Pl nr;
    private final GO.n rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final GO.n f8038t;

    public boolean J2() {
        return this.f8036O;
    }

    public GO.Pl O() {
        return this.nr;
    }

    @Override // QJ.w6
    public ef.w6 n(com.airbnb.lottie.Xo xo, FQq.Dsr dsr, gL.n nVar) {
        return new ef.eO(xo, nVar, this);
    }

    public GO.n nr() {
        return this.f8038t;
    }

    public GO.n rl() {
        return this.rl;
    }

    public String t() {
        return this.f8037n;
    }

    public qz(String str, GO.n nVar, GO.n nVar2, GO.Pl pl, boolean z2) {
        this.f8037n = str;
        this.rl = nVar;
        this.f8038t = nVar2;
        this.nr = pl;
        this.f8036O = z2;
    }
}
