package Z7k;

import J2B.Dsr;
import J2B.aC;
import android.content.Context;
import upM.CN3;
import upM.I28;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f12286n;

    private void t(Context context) {
        CN3.nr(context, "Application Context cannot be null");
    }

    boolean nr() {
        return this.f12286n;
    }

    void rl(boolean z2) {
        this.f12286n = z2;
    }

    void n(Context context) {
        t(context);
        if (!nr()) {
            rl(true);
            Dsr.nr().rl(context);
            J2B.n.gh().rl(context);
            upM.j.rl(context);
            upM.w6.nr(context);
            I28.t(context);
            J2B.CN3.t().rl(context);
            J2B.j.n().rl(context);
            aC.J2().rl(context);
        }
    }
}
