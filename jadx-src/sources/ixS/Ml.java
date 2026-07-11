package ixS;

import K7m.CN3;
import android.content.Context;
import g4f.Dsr;
import g4f.aC;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f68870n;

    private void nr(Context context) {
        CN3.nr(context, "Application Context cannot be null");
    }

    boolean O() {
        return this.f68870n;
    }

    String n() {
        return "1.5.4-Fyber";
    }

    void t(boolean z2) {
        this.f68870n = z2;
    }

    void rl(Context context) {
        nr(context);
        if (!O()) {
            t(true);
            Dsr.nr().rl(context);
            g4f.n.gh().n(context);
            K7m.j.rl(context);
            K7m.w6.nr(context);
            K7m.I28.t(context);
            g4f.CN3.t().rl(context);
            g4f.j.n().rl(context);
            aC.J2().rl(context);
        }
    }
}
