package F5;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class Ml {
    public final double J2;
    public final int KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final int f2501O;
    public final double Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final n f2502n;
    public final int nr;
    public final j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f2503t;

    public static class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final boolean f2504n;
        public final boolean rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final boolean f2505t;

        public j(boolean z2, boolean z3, boolean z4) {
            this.f2504n = z2;
            this.rl = z3;
            this.f2505t = z4;
        }
    }

    public static class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final int f2506n;
        public final int rl;

        public n(int i2, int i3) {
            this.f2506n = i2;
            this.rl = i3;
        }
    }

    public boolean n(long j2) {
        return this.f2503t < j2;
    }

    public Ml(long j2, n nVar, j jVar, int i2, int i3, double d2, double d4, int i5) {
        this.f2503t = j2;
        this.f2502n = nVar;
        this.rl = jVar;
        this.nr = i2;
        this.f2501O = i3;
        this.J2 = d2;
        this.Uo = d4;
        this.KN = i5;
    }
}
