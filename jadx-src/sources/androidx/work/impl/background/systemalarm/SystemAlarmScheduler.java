package androidx.work.impl.background.systemalarm;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.impl.Scheduler;
import androidx.work.impl.model.WorkSpec;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@RestrictTo
public class SystemAlarmScheduler implements Scheduler {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f42874t = Logger.J2("SystemAlarmScheduler");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Context f42875n;

    @Override // androidx.work.impl.Scheduler
    public boolean nr() {
        return true;
    }

    @Override // androidx.work.impl.Scheduler
    public void t(WorkSpec... workSpecArr) {
        for (WorkSpec workSpec : workSpecArr) {
            rl(workSpec);
        }
    }

    @Override // androidx.work.impl.Scheduler
    public void n(String str) {
        this.f42875n.startService(CommandHandler.J2(this.f42875n, str));
    }

    private void rl(WorkSpec workSpec) {
        Logger.t().n(f42874t, String.format("Scheduling work with workSpecId %s", workSpec.f42950n), new Throwable[0]);
        this.f42875n.startService(CommandHandler.nr(this.f42875n, workSpec.f42950n));
    }
}
