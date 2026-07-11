package QJ;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class C implements w6 {
    private final GO.n J2;
    private final GO.n KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final GO.n f7963O;
    private final GO.n Uo;
    private final boolean gh;
    private final boolean mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f7964n;
    private final GO.Xo nr;
    private final j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final GO.n f7965t;
    private final GO.n xMQ;

    public enum j {
        STAR(1),
        POLYGON(2);


        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f7968n;

        j(int i2) {
            this.f7968n = i2;
        }

        public static j rl(int i2) {
            for (j jVar : values()) {
                if (jVar.f7968n == i2) {
                    return jVar;
                }
            }
            return null;
        }
    }

    public GO.n J2() {
        return this.xMQ;
    }

    public GO.Xo KN() {
        return this.nr;
    }

    public GO.n O() {
        return this.Uo;
    }

    public GO.n Uo() {
        return this.f7965t;
    }

    public boolean gh() {
        return this.mUb;
    }

    public j mUb() {
        return this.rl;
    }

    @Override // QJ.w6
    public ef.w6 n(com.airbnb.lottie.Xo xo, FQq.Dsr dsr, gL.n nVar) {
        return new ef.Pl(xo, nVar, this);
    }

    public String nr() {
        return this.f7964n;
    }

    public boolean qie() {
        return this.gh;
    }

    public GO.n rl() {
        return this.J2;
    }

    public GO.n t() {
        return this.KN;
    }

    public GO.n xMQ() {
        return this.f7963O;
    }

    public C(String str, j jVar, GO.n nVar, GO.Xo xo, GO.n nVar2, GO.n nVar3, GO.n nVar4, GO.n nVar5, GO.n nVar6, boolean z2, boolean z3) {
        this.f7964n = str;
        this.rl = jVar;
        this.f7965t = nVar;
        this.nr = xo;
        this.f7963O = nVar2;
        this.J2 = nVar3;
        this.Uo = nVar4;
        this.KN = nVar5;
        this.xMQ = nVar6;
        this.mUb = z2;
        this.gh = z3;
    }
}
