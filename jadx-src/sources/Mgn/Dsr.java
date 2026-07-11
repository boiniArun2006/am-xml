package Mgn;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class Dsr {
    private static final double nr;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final double f6618t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Dsr f6617n = new Dsr();
    private static final int rl = Wre.n(' ', 's', 'i', 'n', 'c', ' ');

    static {
        double dXQ = qz.XQ(1) << 12;
        f6618t = dXQ;
        nr = 1.0d / dXQ;
    }

    public final double n() {
        return f6618t;
    }

    public final double rl() {
        return nr;
    }

    public final int t() {
        return rl;
    }

    private Dsr() {
    }
}
