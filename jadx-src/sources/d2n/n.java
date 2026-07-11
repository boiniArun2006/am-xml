package d2n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class n {
    public static final long n(long j2) {
        return Ml.f63370t.t(j2);
    }

    public static final Wre rl(long j2, long j3) {
        return new Wre(j3, Ml.f63370t.t(j2 + j3), null);
    }

    public static /* synthetic */ Wre t(long j2, long j3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j3 = Ml.f63370t.J2();
        }
        return rl(j2, j3);
    }
}
