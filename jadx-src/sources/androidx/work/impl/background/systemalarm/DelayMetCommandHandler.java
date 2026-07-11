package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.impl.ExecutionListener;
import androidx.work.impl.background.systemalarm.SystemAlarmDispatcher;
import androidx.work.impl.constraints.WorkConstraintsCallback;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.WakeLocks;
import androidx.work.impl.utils.WorkTimer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@RestrictTo
public class DelayMetCommandHandler implements WorkConstraintsCallback, ExecutionListener, WorkTimer.TimeLimitExceededListener {
    public static final String E2 = Logger.J2("DelayMetCommandHandler");
    public final SystemAlarmDispatcher J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final String f42851O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public PowerManager.WakeLock f42852S;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Context f42855n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final WorkConstraintsTracker f42857r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f42858t;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f42854g = false;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public int f42853Z = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f42856o = new Object();

    private void Uo() {
        synchronized (this.f42856o) {
            try {
                if (this.f42853Z < 2) {
                    this.f42853Z = 2;
                    Logger loggerT = Logger.t();
                    String str = E2;
                    loggerT.n(str, String.format("Stopping work for WorkSpec %s", this.f42851O), new Throwable[0]);
                    Intent intentJ2 = CommandHandler.J2(this.f42855n, this.f42851O);
                    SystemAlarmDispatcher systemAlarmDispatcher = this.J2;
                    systemAlarmDispatcher.gh(new SystemAlarmDispatcher.AddRunnable(systemAlarmDispatcher, intentJ2, this.f42858t));
                    if (this.J2.nr().Uo(this.f42851O)) {
                        Logger.t().n(str, String.format("WorkSpec %s needs to be rescheduled", this.f42851O), new Throwable[0]);
                        Intent intentNr = CommandHandler.nr(this.f42855n, this.f42851O);
                        SystemAlarmDispatcher systemAlarmDispatcher2 = this.J2;
                        systemAlarmDispatcher2.gh(new SystemAlarmDispatcher.AddRunnable(systemAlarmDispatcher2, intentNr, this.f42858t));
                    } else {
                        Logger.t().n(str, String.format("Processor does not have WorkSpec %s. No need to reschedule ", this.f42851O), new Throwable[0]);
                    }
                } else {
                    Logger.t().n(E2, String.format("Already stopped work for %s", this.f42851O), new Throwable[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void t() {
        synchronized (this.f42856o) {
            try {
                this.f42857r.O();
                this.J2.KN().t(this.f42851O);
                PowerManager.WakeLock wakeLock = this.f42852S;
                if (wakeLock != null && wakeLock.isHeld()) {
                    Logger.t().n(E2, String.format("Releasing wakelock %s for WorkSpec %s", this.f42852S, this.f42851O), new Throwable[0]);
                    this.f42852S.release();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.work.impl.constraints.WorkConstraintsCallback
    public void J2(List list) {
        if (list.contains(this.f42851O)) {
            synchronized (this.f42856o) {
                try {
                    if (this.f42853Z == 0) {
                        this.f42853Z = 1;
                        Logger.t().n(E2, String.format("onAllConstraintsMet for %s", this.f42851O), new Throwable[0]);
                        if (this.J2.nr().mUb(this.f42851O)) {
                            this.J2.KN().rl(this.f42851O, 600000L, this);
                        } else {
                            t();
                        }
                    } else {
                        Logger.t().n(E2, String.format("Already started work for %s", this.f42851O), new Throwable[0]);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    void nr() {
        this.f42852S = WakeLocks.rl(this.f42855n, String.format("%s (%s)", this.f42851O, Integer.valueOf(this.f42858t)));
        Logger loggerT = Logger.t();
        String str = E2;
        loggerT.n(str, String.format("Acquiring wakelock %s for WorkSpec %s", this.f42852S, this.f42851O), new Throwable[0]);
        this.f42852S.acquire();
        WorkSpec workSpecMUb = this.J2.Uo().HI().GR().mUb(this.f42851O);
        if (workSpecMUb == null) {
            Uo();
            return;
        }
        boolean zRl = workSpecMUb.rl();
        this.f42854g = zRl;
        if (zRl) {
            this.f42857r.nr(Collections.singletonList(workSpecMUb));
        } else {
            Logger.t().n(str, String.format("No constraints for %s", this.f42851O), new Throwable[0]);
            J2(Collections.singletonList(this.f42851O));
        }
    }

    public DelayMetCommandHandler(Context context, int i2, String str, SystemAlarmDispatcher systemAlarmDispatcher) {
        this.f42855n = context;
        this.f42858t = i2;
        this.J2 = systemAlarmDispatcher;
        this.f42851O = str;
        this.f42857r = new WorkConstraintsTracker(context, systemAlarmDispatcher.J2(), this);
    }

    @Override // androidx.work.impl.ExecutionListener
    public void O(String str, boolean z2) {
        Logger.t().n(E2, String.format("onExecuted %s, %s", str, Boolean.valueOf(z2)), new Throwable[0]);
        t();
        if (z2) {
            Intent intentNr = CommandHandler.nr(this.f42855n, this.f42851O);
            SystemAlarmDispatcher systemAlarmDispatcher = this.J2;
            systemAlarmDispatcher.gh(new SystemAlarmDispatcher.AddRunnable(systemAlarmDispatcher, intentNr, this.f42858t));
        }
        if (this.f42854g) {
            Intent intentN = CommandHandler.n(this.f42855n);
            SystemAlarmDispatcher systemAlarmDispatcher2 = this.J2;
            systemAlarmDispatcher2.gh(new SystemAlarmDispatcher.AddRunnable(systemAlarmDispatcher2, intentN, this.f42858t));
        }
    }

    @Override // androidx.work.impl.utils.WorkTimer.TimeLimitExceededListener
    public void n(String str) {
        Logger.t().n(E2, String.format("Exceeded time limits on execution for %s", str), new Throwable[0]);
        Uo();
    }

    @Override // androidx.work.impl.constraints.WorkConstraintsCallback
    public void rl(List list) {
        Uo();
    }
}
