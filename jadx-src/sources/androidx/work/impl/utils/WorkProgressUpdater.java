package androidx.work.impl.utils;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.work.Data;
import androidx.work.Logger;
import androidx.work.ProgressUpdater;
import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.model.WorkProgress;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.Xo;
import java.util.UUID;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@RestrictTo
public class WorkProgressUpdater implements ProgressUpdater {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final String f43036t = Logger.J2("WorkProgressUpdater");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final WorkDatabase f43037n;
    final TaskExecutor rl;

    public WorkProgressUpdater(WorkDatabase workDatabase, TaskExecutor taskExecutor) {
        this.f43037n = workDatabase;
        this.rl = taskExecutor;
    }

    @Override // androidx.work.ProgressUpdater
    public Xo n(Context context, final UUID uuid, final Data data) {
        final SettableFuture settableFutureO = SettableFuture.o();
        this.rl.rl(new Runnable() { // from class: androidx.work.impl.utils.WorkProgressUpdater.1
            @Override // java.lang.Runnable
            public void run() {
                String string = uuid.toString();
                Logger loggerT = Logger.t();
                String str = WorkProgressUpdater.f43036t;
                loggerT.n(str, String.format("Updating progress for %s (%s)", uuid, data), new Throwable[0]);
                WorkProgressUpdater.this.f43037n.xMQ();
                try {
                    WorkSpec workSpecMUb = WorkProgressUpdater.this.f43037n.GR().mUb(string);
                    if (workSpecMUb == null) {
                        throw new IllegalStateException("Calls to setProgressAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                    }
                    if (workSpecMUb.rl == WorkInfo.State.RUNNING) {
                        WorkProgressUpdater.this.f43037n.I().t(new WorkProgress(string, data));
                    } else {
                        Logger.t().KN(str, String.format("Ignoring setProgressAsync(...). WorkSpec (%s) is not in a RUNNING state.", string), new Throwable[0]);
                    }
                    settableFutureO.HI(null);
                    WorkProgressUpdater.this.f43037n.P5();
                } catch (Throwable th) {
                    try {
                        Logger.t().rl(WorkProgressUpdater.f43036t, "Error updating Worker progress", th);
                        settableFutureO.ck(th);
                    } finally {
                        WorkProgressUpdater.this.f43037n.r();
                    }
                }
            }
        });
        return settableFutureO;
    }
}
