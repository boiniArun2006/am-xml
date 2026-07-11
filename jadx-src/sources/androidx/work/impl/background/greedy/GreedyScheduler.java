package androidx.work.impl.background.greedy;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.RestrictTo;
import androidx.work.Configuration;
import androidx.work.Logger;
import androidx.work.WorkInfo;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.Scheduler;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.constraints.WorkConstraintsCallback;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.ProcessUtils;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@RestrictTo
public class GreedyScheduler implements Scheduler, WorkConstraintsCallback, ExecutionListener {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f42831g = Logger.J2("GreedyScheduler");

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final WorkConstraintsTracker f42832O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    Boolean f42833S;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f42835n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f42836o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private DelayedWorkTracker f42837r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final WorkManagerImpl f42838t;
    private final Set J2 = new HashSet();

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final Object f42834Z = new Object();

    @Override // androidx.work.impl.Scheduler
    public boolean nr() {
        return false;
    }

    private void KN() {
        if (this.f42836o) {
            return;
        }
        this.f42838t.az().t(this);
        this.f42836o = true;
    }

    private void Uo() {
        this.f42833S = Boolean.valueOf(ProcessUtils.rl(this.f42835n, this.f42838t.xMQ()));
    }

    private void xMQ(String str) {
        synchronized (this.f42834Z) {
            try {
                Iterator it = this.J2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    WorkSpec workSpec = (WorkSpec) it.next();
                    if (workSpec.f42950n.equals(str)) {
                        Logger.t().n(f42831g, String.format("Stopping tracking for %s", str), new Throwable[0]);
                        this.J2.remove(workSpec);
                        this.f42832O.nr(this.J2);
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.work.impl.Scheduler
    public void n(String str) {
        if (this.f42833S == null) {
            Uo();
        }
        if (!this.f42833S.booleanValue()) {
            Logger.t().nr(f42831g, "Ignoring schedule request in non-main process", new Throwable[0]);
            return;
        }
        KN();
        Logger.t().n(f42831g, String.format("Cancelling work ID %s", str), new Throwable[0]);
        DelayedWorkTracker delayedWorkTracker = this.f42837r;
        if (delayedWorkTracker != null) {
            delayedWorkTracker.rl(str);
        }
        this.f42838t.aYN(str);
    }

    @Override // androidx.work.impl.Scheduler
    public void t(WorkSpec... workSpecArr) {
        if (this.f42833S == null) {
            Uo();
        }
        if (!this.f42833S.booleanValue()) {
            Logger.t().nr(f42831g, "Ignoring schedule request in a secondary process", new Throwable[0]);
            return;
        }
        KN();
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        for (WorkSpec workSpec : workSpecArr) {
            long jN = workSpec.n();
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (workSpec.rl == WorkInfo.State.ENQUEUED) {
                if (jCurrentTimeMillis < jN) {
                    DelayedWorkTracker delayedWorkTracker = this.f42837r;
                    if (delayedWorkTracker != null) {
                        delayedWorkTracker.n(workSpec);
                    }
                } else if (!workSpec.rl()) {
                    Logger.t().n(f42831g, String.format("Starting work for %s", workSpec.f42950n), new Throwable[0]);
                    this.f42838t.XQ(workSpec.f42950n);
                } else if (workSpec.mUb.KN()) {
                    Logger.t().n(f42831g, String.format("Ignoring WorkSpec %s, Requires device idle.", workSpec), new Throwable[0]);
                } else if (workSpec.mUb.O()) {
                    Logger.t().n(f42831g, String.format("Ignoring WorkSpec %s, Requires ContentUri triggers.", workSpec), new Throwable[0]);
                } else {
                    hashSet.add(workSpec);
                    hashSet2.add(workSpec.f42950n);
                }
            }
        }
        synchronized (this.f42834Z) {
            try {
                if (!hashSet.isEmpty()) {
                    Logger.t().n(f42831g, String.format("Starting tracking for [%s]", TextUtils.join(",", hashSet2)), new Throwable[0]);
                    this.J2.addAll(hashSet);
                    this.f42832O.nr(this.J2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public GreedyScheduler(Context context, Configuration configuration, TaskExecutor taskExecutor, WorkManagerImpl workManagerImpl) {
        this.f42835n = context;
        this.f42838t = workManagerImpl;
        this.f42832O = new WorkConstraintsTracker(context, taskExecutor, this);
        this.f42837r = new DelayedWorkTracker(this, configuration.gh());
    }

    @Override // androidx.work.impl.constraints.WorkConstraintsCallback
    public void J2(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Logger.t().n(f42831g, String.format("Constraints met: Scheduling work ID %s", str), new Throwable[0]);
            this.f42838t.XQ(str);
        }
    }

    @Override // androidx.work.impl.ExecutionListener
    public void O(String str, boolean z2) {
        xMQ(str);
    }

    @Override // androidx.work.impl.constraints.WorkConstraintsCallback
    public void rl(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Logger.t().n(f42831g, String.format("Constraints not met: Cancelling work ID %s", str), new Throwable[0]);
            this.f42838t.aYN(str);
        }
    }
}
