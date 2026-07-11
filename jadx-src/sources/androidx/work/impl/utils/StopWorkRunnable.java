package androidx.work.impl.utils;

import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.WorkInfo;
import androidx.work.impl.Processor;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.model.WorkSpecDao;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@RestrictTo
public class StopWorkRunnable implements Runnable {
    private static final String J2 = Logger.J2("StopWorkRunnable");

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final boolean f43016O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final WorkManagerImpl f43017n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f43018t;

    @Override // java.lang.Runnable
    public void run() {
        boolean zHI;
        WorkDatabase workDatabaseHI = this.f43017n.HI();
        Processor processorAz = this.f43017n.az();
        WorkSpecDao workSpecDaoGR = workDatabaseHI.GR();
        workDatabaseHI.xMQ();
        try {
            boolean zKN = processorAz.KN(this.f43018t);
            if (this.f43016O) {
                zHI = this.f43017n.az().ty(this.f43018t);
            } else {
                if (!zKN && workSpecDaoGR.xMQ(this.f43018t) == WorkInfo.State.RUNNING) {
                    workSpecDaoGR.rl(WorkInfo.State.ENQUEUED, this.f43018t);
                }
                zHI = this.f43017n.az().HI(this.f43018t);
            }
            Logger.t().n(J2, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", this.f43018t, Boolean.valueOf(zHI)), new Throwable[0]);
            workDatabaseHI.P5();
            workDatabaseHI.r();
        } catch (Throwable th) {
            workDatabaseHI.r();
            throw th;
        }
    }

    public StopWorkRunnable(WorkManagerImpl workManagerImpl, String str, boolean z2) {
        this.f43017n = workManagerImpl;
        this.f43018t = str;
        this.f43016O = z2;
    }
}
