package eQ;

import android.content.Context;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f63704n = new j();
    private static fuX rl;

    private final synchronized fuX rl(Context context) {
        fuX fux = rl;
        if (fux != null) {
            return fux;
        }
        context.getApplicationContext();
        fuX fuxN = Dsr.n(context);
        rl = fuxN;
        return fuxN;
    }

    public static final fuX n(Context context) {
        fuX fux = rl;
        return fux == null ? f63704n.rl(context) : fux;
    }

    private j() {
    }
}
