package O2;

import R0.Wre;
import com.google.firebase.perf.metrics.Trace;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class aC {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final yMa.j f7253n = yMa.j.O();

    public static Trace n(Trace trace, Wre.j jVar) {
        if (jVar.nr() > 0) {
            trace.putMetric(n.FRAMES_TOTAL.toString(), jVar.nr());
        }
        if (jVar.t() > 0) {
            trace.putMetric(n.FRAMES_SLOW.toString(), jVar.t());
        }
        if (jVar.rl() > 0) {
            trace.putMetric(n.FRAMES_FROZEN.toString(), jVar.rl());
        }
        f7253n.n("Screen trace: " + trace.J2() + " _fr_tot:" + jVar.nr() + " _fr_slo:" + jVar.t() + " _fr_fzn:" + jVar.rl());
        return trace;
    }
}
