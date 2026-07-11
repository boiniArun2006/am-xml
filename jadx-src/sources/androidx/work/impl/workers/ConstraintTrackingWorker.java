package androidx.work.impl.workers;

import Hr.CQ.USEaHtCMH;
import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.constraints.WorkConstraintsCallback;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.Xo;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
@RestrictTo
public class ConstraintTrackingWorker extends ListenableWorker implements WorkConstraintsCallback {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f43071o = Logger.J2("ConstraintTrkngWrkr");
    SettableFuture J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    volatile boolean f43072O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private WorkerParameters f43073n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ListenableWorker f43074r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final Object f43075t;

    @Override // androidx.work.impl.constraints.WorkConstraintsCallback
    public void J2(List list) {
    }

    @Override // androidx.work.ListenableWorker
    public boolean isRunInForeground() {
        ListenableWorker listenableWorker = this.f43074r;
        return listenableWorker != null && listenableWorker.isRunInForeground();
    }

    void nr() {
        this.J2.HI(ListenableWorker.Result.rl());
    }

    void t() {
        this.J2.HI(ListenableWorker.Result.n());
    }

    public ConstraintTrackingWorker(@NonNull Context context, @NonNull WorkerParameters workerParameters) {
        super(context, workerParameters);
        this.f43073n = workerParameters;
        this.f43075t = new Object();
        this.f43072O = false;
        this.J2 = SettableFuture.o();
    }

    void O() {
        String strXMQ = getInputData().xMQ("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME");
        if (TextUtils.isEmpty(strXMQ)) {
            Logger.t().rl(f43071o, "No worker to delegate to.", new Throwable[0]);
            t();
            return;
        }
        ListenableWorker listenableWorkerRl = getWorkerFactory().rl(getApplicationContext(), strXMQ, this.f43073n);
        this.f43074r = listenableWorkerRl;
        if (listenableWorkerRl == null) {
            Logger.t().n(f43071o, "No worker to delegate to.", new Throwable[0]);
            t();
            return;
        }
        WorkSpec workSpecMUb = n().GR().mUb(getId().toString());
        if (workSpecMUb == null) {
            t();
            return;
        }
        WorkConstraintsTracker workConstraintsTracker = new WorkConstraintsTracker(getApplicationContext(), getTaskExecutor(), this);
        workConstraintsTracker.nr(Collections.singletonList(workSpecMUb));
        if (workConstraintsTracker.t(getId().toString())) {
            Logger.t().n(f43071o, String.format("Constraints met for delegate %s", strXMQ), new Throwable[0]);
            try {
                final Xo xoStartWork = this.f43074r.startWork();
                xoStartWork.addListener(new Runnable() { // from class: androidx.work.impl.workers.ConstraintTrackingWorker.2
                    @Override // java.lang.Runnable
                    public void run() {
                        synchronized (ConstraintTrackingWorker.this.f43075t) {
                            try {
                                if (ConstraintTrackingWorker.this.f43072O) {
                                    ConstraintTrackingWorker.this.nr();
                                } else {
                                    ConstraintTrackingWorker.this.J2.Ik(xoStartWork);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                }, getBackgroundExecutor());
                return;
            } catch (Throwable th) {
                Logger loggerT = Logger.t();
                String str = f43071o;
                loggerT.n(str, String.format(USEaHtCMH.KODNYwsQv, strXMQ), th);
                synchronized (this.f43075t) {
                    try {
                        if (this.f43072O) {
                            Logger.t().n(str, "Constraints were unmet, Retrying.", new Throwable[0]);
                            nr();
                        } else {
                            t();
                        }
                        return;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
        Logger.t().n(f43071o, String.format("Constraints not met for delegate %s. Requesting retry.", strXMQ), new Throwable[0]);
        nr();
    }

    @Override // androidx.work.ListenableWorker
    public TaskExecutor getTaskExecutor() {
        return WorkManagerImpl.gh(getApplicationContext()).ck();
    }

    public WorkDatabase n() {
        return WorkManagerImpl.gh(getApplicationContext()).HI();
    }

    @Override // androidx.work.ListenableWorker
    public void onStopped() {
        super.onStopped();
        ListenableWorker listenableWorker = this.f43074r;
        if (listenableWorker != null && !listenableWorker.isStopped()) {
            this.f43074r.stop();
        }
    }

    @Override // androidx.work.impl.constraints.WorkConstraintsCallback
    public void rl(List list) {
        Logger.t().n(f43071o, String.format("Constraints changed for %s", list), new Throwable[0]);
        synchronized (this.f43075t) {
            this.f43072O = true;
        }
    }

    @Override // androidx.work.ListenableWorker
    public Xo startWork() {
        getBackgroundExecutor().execute(new Runnable() { // from class: androidx.work.impl.workers.ConstraintTrackingWorker.1
            @Override // java.lang.Runnable
            public void run() {
                ConstraintTrackingWorker.this.O();
            }
        });
        return this.J2;
    }
}
