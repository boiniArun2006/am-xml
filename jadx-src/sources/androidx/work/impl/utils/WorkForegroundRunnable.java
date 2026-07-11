package androidx.work.impl.utils;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.core.os.BuildCompat;
import androidx.work.ForegroundInfo;
import androidx.work.ForegroundUpdater;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.Xo;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@RestrictTo
public class WorkForegroundRunnable implements Runnable {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    static final String f43020Z = Logger.J2("WorkForegroundRunnable");
    final ListenableWorker J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final WorkSpec f43021O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final SettableFuture f43022n = SettableFuture.o();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final TaskExecutor f43023o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final ForegroundUpdater f43024r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final Context f43025t;

    public Xo n() {
        return this.f43022n;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!this.f43021O.Ik || BuildCompat.t()) {
            this.f43022n.HI(null);
            return;
        }
        final SettableFuture settableFutureO = SettableFuture.o();
        this.f43023o.n().execute(new Runnable() { // from class: androidx.work.impl.utils.WorkForegroundRunnable.1
            @Override // java.lang.Runnable
            public void run() {
                settableFutureO.Ik(WorkForegroundRunnable.this.J2.getForegroundInfoAsync());
            }
        });
        settableFutureO.addListener(new Runnable() { // from class: androidx.work.impl.utils.WorkForegroundRunnable.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    ForegroundInfo foregroundInfo = (ForegroundInfo) settableFutureO.get();
                    if (foregroundInfo == null) {
                        throw new IllegalStateException(String.format("Worker was marked important (%s) but did not provide ForegroundInfo", WorkForegroundRunnable.this.f43021O.f42952t));
                    }
                    Logger.t().n(WorkForegroundRunnable.f43020Z, String.format("Updating notification for %s", WorkForegroundRunnable.this.f43021O.f42952t), new Throwable[0]);
                    WorkForegroundRunnable.this.J2.setRunInForeground(true);
                    WorkForegroundRunnable workForegroundRunnable = WorkForegroundRunnable.this;
                    workForegroundRunnable.f43022n.Ik(workForegroundRunnable.f43024r.n(workForegroundRunnable.f43025t, workForegroundRunnable.J2.getId(), foregroundInfo));
                } catch (Throwable th) {
                    WorkForegroundRunnable.this.f43022n.ck(th);
                }
            }
        }, this.f43023o.n());
    }

    public WorkForegroundRunnable(Context context, WorkSpec workSpec, ListenableWorker listenableWorker, ForegroundUpdater foregroundUpdater, TaskExecutor taskExecutor) {
        this.f43025t = context;
        this.f43021O = workSpec;
        this.J2 = listenableWorker;
        this.f43024r = foregroundUpdater;
        this.f43023o = taskExecutor;
    }
}
