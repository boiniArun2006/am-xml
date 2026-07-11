package io.grpc.internal;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class Pp {
    private static final n qie = new n(Pmq.f68358n);
    private long J2;
    private long KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private long f68359O;
    private w6 Uo;
    private volatile long gh;
    private final O mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Pmq f68360n;
    private long nr;
    private long rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f68361t;
    private long xMQ;

    public static final class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Pmq f68362n;

        public Pp n() {
            return new Pp(this.f68362n);
        }

        public n(Pmq pmq) {
            this.f68362n = pmq;
        }
    }

    public interface w6 {
    }

    private Pp(Pmq pmq) {
        this.mUb = LEl.n();
        this.f68360n = pmq;
    }

    public static n n() {
        return qie;
    }

    public void J2(boolean z2) {
        if (z2) {
            this.nr++;
        } else {
            this.f68359O++;
        }
    }

    public void O(int i2) {
        if (i2 == 0) {
            return;
        }
        this.KN += (long) i2;
        this.xMQ = this.f68360n.n();
    }

    public void nr() {
        this.mUb.n(1L);
        this.gh = this.f68360n.n();
    }

    public void rl() {
        this.J2++;
    }

    public void t() {
        this.rl++;
        this.f68361t = this.f68360n.n();
    }

    public void Uo(w6 w6Var) {
        this.Uo = (w6) t1.Xo.HI(w6Var);
    }
}
