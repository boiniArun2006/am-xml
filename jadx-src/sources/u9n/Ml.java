package u9n;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import mc.fuX;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class Ml implements gm.n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public JiP.j f74137n = new JiP.j(this);
    public fuX nr;
    public Context rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public mc.j f74138t;

    public final void n() {
        JiP.j jVar;
        eh.n.n("%s : start", "OneDTPropertyWatchdog");
        Context context = this.rl;
        if (context == null || (jVar = this.f74137n) == null || jVar.rl) {
            return;
        }
        IntentFilter intentFilter = new IntentFilter("com.dt.ignite.service.action.PROPERTY_CHANGED");
        if (Build.VERSION.SDK_INT >= 33) {
            context.registerReceiver(jVar, intentFilter, 4);
        } else {
            context.registerReceiver(jVar, intentFilter);
        }
        this.f74137n.rl = true;
    }

    public Ml(Context context, mc.j jVar, fuX fux) {
        this.rl = context.getApplicationContext();
        this.f74138t = jVar;
        this.nr = fux;
    }
}
