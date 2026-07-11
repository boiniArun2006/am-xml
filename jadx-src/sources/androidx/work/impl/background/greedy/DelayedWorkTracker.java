package androidx.work.impl.background.greedy;

import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.RunnableScheduler;
import androidx.work.impl.model.WorkSpec;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@RestrictTo
public class DelayedWorkTracker {
    static final String nr = Logger.J2("DelayedWorkTracker");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final GreedyScheduler f42827n;
    private final RunnableScheduler rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Map f42828t = new HashMap();

    public void n(final WorkSpec workSpec) {
        Runnable runnable = (Runnable) this.f42828t.remove(workSpec.f42950n);
        if (runnable != null) {
            this.rl.n(runnable);
        }
        Runnable runnable2 = new Runnable() { // from class: androidx.work.impl.background.greedy.DelayedWorkTracker.1
            @Override // java.lang.Runnable
            public void run() {
                Logger.t().n(DelayedWorkTracker.nr, String.format("Scheduling work %s", workSpec.f42950n), new Throwable[0]);
                DelayedWorkTracker.this.f42827n.t(workSpec);
            }
        };
        this.f42828t.put(workSpec.f42950n, runnable2);
        this.rl.rl(workSpec.n() - System.currentTimeMillis(), runnable2);
    }

    public void rl(String str) {
        Runnable runnable = (Runnable) this.f42828t.remove(str);
        if (runnable != null) {
            this.rl.n(runnable);
        }
    }

    public DelayedWorkTracker(GreedyScheduler greedyScheduler, RunnableScheduler runnableScheduler) {
        this.f42827n = greedyScheduler;
        this.rl = runnableScheduler;
    }
}
