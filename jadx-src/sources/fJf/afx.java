package fJf;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class afx {
    private final DAz J2;
    private final DAz KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final nKK f66876O;
    private final nKK Uo;
    private final boolean az;
    private final int gh;
    private final int mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final nKK f66877n;
    private final A72.Ml nr;
    private final boolean qie;
    private final DAz rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final nKK f66878t;
    private final String xMQ;

    public static final class j {
        private DAz J2;
        private DAz KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private nKK f66879O;
        private nKK Uo;
        public boolean az;
        private int gh;
        private int mUb;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private nKK f66880n;
        private A72.Ml nr;
        private boolean qie;
        private DAz rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private nKK f66881t;
        private String xMQ;

        private j() {
        }

        public afx az() {
            return new afx(this);
        }
    }

    private afx(j jVar) {
        if (T5.n.nr()) {
            T5.n.n("PoolConfig()");
        }
        this.f66877n = jVar.f66880n == null ? Pl.n() : jVar.f66880n;
        this.rl = jVar.rl == null ? ci.KN() : jVar.rl;
        this.f66878t = jVar.f66881t == null ? eO.rl() : jVar.f66881t;
        this.nr = jVar.nr == null ? A72.I28.rl() : jVar.nr;
        this.f66876O = jVar.f66879O == null ? C2105z.n() : jVar.f66879O;
        this.J2 = jVar.J2 == null ? ci.KN() : jVar.J2;
        this.Uo = jVar.Uo == null ? Xo.n() : jVar.Uo;
        this.KN = jVar.KN == null ? ci.KN() : jVar.KN;
        this.xMQ = jVar.xMQ == null ? "legacy" : jVar.xMQ;
        this.mUb = jVar.mUb;
        this.gh = jVar.gh > 0 ? jVar.gh : 4194304;
        this.qie = jVar.qie;
        if (T5.n.nr()) {
            T5.n.rl();
        }
        this.az = jVar.az;
    }

    public static j ty() {
        return new j();
    }

    public nKK J2() {
        return this.f66878t;
    }

    public DAz KN() {
        return this.J2;
    }

    public String O() {
        return this.xMQ;
    }

    public nKK Uo() {
        return this.f66876O;
    }

    public boolean az() {
        return this.qie;
    }

    public DAz gh() {
        return this.KN;
    }

    public nKK mUb() {
        return this.Uo;
    }

    public int n() {
        return this.gh;
    }

    public DAz nr() {
        return this.rl;
    }

    public boolean qie() {
        return this.az;
    }

    public int rl() {
        return this.mUb;
    }

    public nKK t() {
        return this.f66877n;
    }

    public A72.Ml xMQ() {
        return this.nr;
    }
}
