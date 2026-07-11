package Msr;

import com.fyber.inneractive.sdk.network.t;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class n {
    public static final n rl = new n();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public j f6781n;

    public static void n(Ml ml, Exception exc) {
        rl(ml, Ci2.j.n(exc, null));
    }

    public static void rl(Ml ml, Object... objArr) {
        eh.n.n("%s : dispatching event", "IgniteEventDispatcher");
        if (rl.f6781n != null) {
            t tVarA = t.a(ml);
            if (tVarA == null) {
                IAlog.f("%s : One DT Error: %s is missing in IAReportError map", "IgniteEventDispatcherWrapper", ml);
            } else {
                new w(tVarA).a(objArr).a((String) null);
            }
        }
    }
}
