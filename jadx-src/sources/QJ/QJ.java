package QJ;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class QJ implements w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f7983n;
    private final boolean nr;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final GO.fuX f7984t;

    @Override // QJ.w6
    public ef.w6 n(com.airbnb.lottie.Xo xo, FQq.Dsr dsr, gL.n nVar) {
        return new ef.QJ(xo, nVar, this);
    }

    public boolean nr() {
        return this.nr;
    }

    public String rl() {
        return this.f7983n;
    }

    public GO.fuX t() {
        return this.f7984t;
    }

    public String toString() {
        return "ShapePath{name=" + this.f7983n + ", index=" + this.rl + '}';
    }

    public QJ(String str, int i2, GO.fuX fux, boolean z2) {
        this.f7983n = str;
        this.rl = i2;
        this.f7984t = fux;
        this.nr = z2;
    }
}
