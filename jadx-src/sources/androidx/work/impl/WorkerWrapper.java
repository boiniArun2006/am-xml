package androidx.work.impl;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.work.Configuration;
import androidx.work.Data;
import androidx.work.InputMerger;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.WorkInfo;
import androidx.work.WorkerParameters;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.foreground.ForegroundProcessor;
import androidx.work.impl.model.DependencyDao;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecDao;
import androidx.work.impl.model.WorkTagDao;
import androidx.work.impl.utils.PackageManagerHelper;
import androidx.work.impl.utils.WorkForegroundRunnable;
import androidx.work.impl.utils.WorkForegroundUpdater;
import androidx.work.impl.utils.WorkProgressUpdater;
import androidx.work.impl.utils.futures.SettableFuture;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.Xo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@RestrictTo
public class WorkerWrapper implements Runnable {
    static final String M7 = Logger.J2("WorkerWrapper");
    private ForegroundProcessor E2;
    private WorkerParameters.RuntimeExtras J2;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private WorkTagDao f42804N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private List f42805O;
    private volatile boolean P5;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private DependencyDao f42807T;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private WorkSpecDao f42809X;
    private String Xw;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    TaskExecutor f42810Z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private WorkDatabase f42811e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Configuration f42812g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Context f42813n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    ListenableWorker f42814o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    WorkSpec f42815r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f42816t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private List f42817v;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    ListenableWorker.Result f42806S = ListenableWorker.Result.n();
    SettableFuture jB = SettableFuture.o();

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    Xo f42808U = null;

    @RestrictTo
    public static class Builder {
        WorkDatabase J2;
        List KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Configuration f42824O;
        String Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Context f42825n;
        TaskExecutor nr;
        ListenableWorker rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        ForegroundProcessor f42826t;
        WorkerParameters.RuntimeExtras xMQ = new WorkerParameters.RuntimeExtras();

        public WorkerWrapper n() {
            return new WorkerWrapper(this);
        }

        public Builder rl(WorkerParameters.RuntimeExtras runtimeExtras) {
            if (runtimeExtras != null) {
                this.xMQ = runtimeExtras;
            }
            return this;
        }

        public Builder t(List list) {
            this.KN = list;
            return this;
        }

        public Builder(Context context, Configuration configuration, TaskExecutor taskExecutor, ForegroundProcessor foregroundProcessor, WorkDatabase workDatabase, String str) {
            this.f42825n = context.getApplicationContext();
            this.nr = taskExecutor;
            this.f42826t = foregroundProcessor;
            this.f42824O = configuration;
            this.J2 = workDatabase;
            this.Uo = str;
        }
    }

    public void nr() {
        boolean zIsDone;
        this.P5 = true;
        ty();
        Xo xo = this.f42808U;
        if (xo != null) {
            zIsDone = xo.isDone();
            this.f42808U.cancel(true);
        } else {
            zIsDone = false;
        }
        ListenableWorker listenableWorker = this.f42814o;
        if (listenableWorker != null && !zIsDone) {
            listenableWorker.stop();
        } else {
            Logger.t().n(M7, String.format("WorkSpec %s is already done. Not interrupting.", this.f42815r), new Throwable[0]);
        }
    }

    private boolean HI() {
        boolean z2;
        this.f42811e.xMQ();
        try {
            if (this.f42809X.xMQ(this.f42816t) == WorkInfo.State.ENQUEUED) {
                this.f42809X.rl(WorkInfo.State.RUNNING, this.f42816t);
                this.f42809X.ViF(this.f42816t);
                z2 = true;
            } else {
                z2 = false;
            }
            this.f42811e.P5();
            this.f42811e.r();
            return z2;
        } catch (Throwable th) {
            this.f42811e.r();
            throw th;
        }
    }

    private void KN() {
        this.f42811e.xMQ();
        try {
            this.f42809X.nY(this.f42816t, System.currentTimeMillis());
            this.f42809X.rl(WorkInfo.State.ENQUEUED, this.f42816t);
            this.f42809X.WPU(this.f42816t);
            this.f42809X.ck(this.f42816t, -1L);
            this.f42811e.P5();
        } finally {
            this.f42811e.r();
            xMQ(false);
        }
    }

    private void O(String str) {
        LinkedList linkedList = new LinkedList();
        linkedList.add(str);
        while (!linkedList.isEmpty()) {
            String str2 = (String) linkedList.remove();
            if (this.f42809X.xMQ(str2) != WorkInfo.State.CANCELLED) {
                this.f42809X.rl(WorkInfo.State.FAILED, str2);
            }
            linkedList.addAll(this.f42807T.rl(str2));
        }
    }

    private void Uo() {
        this.f42811e.xMQ();
        try {
            this.f42809X.rl(WorkInfo.State.ENQUEUED, this.f42816t);
            this.f42809X.nY(this.f42816t, System.currentTimeMillis());
            this.f42809X.ck(this.f42816t, -1L);
            this.f42811e.P5();
        } finally {
            this.f42811e.r();
            xMQ(true);
        }
    }

    private void az() {
        this.f42811e.xMQ();
        try {
            this.f42809X.rl(WorkInfo.State.SUCCEEDED, this.f42816t);
            this.f42809X.o(this.f42816t, ((ListenableWorker.Result.Success) this.f42806S).O());
            long jCurrentTimeMillis = System.currentTimeMillis();
            for (String str : this.f42807T.rl(this.f42816t)) {
                if (this.f42809X.xMQ(str) == WorkInfo.State.BLOCKED && this.f42807T.t(str)) {
                    Logger.t().nr(M7, String.format("Setting status to enqueued for %s", str), new Throwable[0]);
                    this.f42809X.rl(WorkInfo.State.ENQUEUED, str);
                    this.f42809X.nY(str, jCurrentTimeMillis);
                }
            }
            this.f42811e.P5();
            this.f42811e.r();
            xMQ(false);
        } catch (Throwable th) {
            this.f42811e.r();
            xMQ(false);
            throw th;
        }
    }

    private void mUb() {
        WorkInfo.State stateXMQ = this.f42809X.xMQ(this.f42816t);
        if (stateXMQ == WorkInfo.State.RUNNING) {
            Logger.t().n(M7, String.format("Status for %s is RUNNING;not doing any work and rescheduling for later execution", this.f42816t), new Throwable[0]);
            xMQ(true);
        } else {
            Logger.t().n(M7, String.format("Status for %s is %s; not doing any work", this.f42816t, stateXMQ), new Throwable[0]);
            xMQ(false);
        }
    }

    private String n(List list) {
        StringBuilder sb = new StringBuilder("Work [ id=");
        sb.append(this.f42816t);
        sb.append(", tags={ ");
        Iterator it = list.iterator();
        boolean z2 = true;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (z2) {
                z2 = false;
            } else {
                sb.append(", ");
            }
            sb.append(str);
        }
        sb.append(" } ]");
        return sb.toString();
    }

    private void t(ListenableWorker.Result result) {
        if (result instanceof ListenableWorker.Result.Success) {
            Logger.t().nr(M7, String.format("Worker result SUCCESS for %s", this.Xw), new Throwable[0]);
            if (this.f42815r.nr()) {
                KN();
                return;
            } else {
                az();
                return;
            }
        }
        if (result instanceof ListenableWorker.Result.Retry) {
            Logger.t().nr(M7, String.format("Worker result RETRY for %s", this.Xw), new Throwable[0]);
            Uo();
            return;
        }
        Logger.t().nr(M7, String.format("Worker result FAILURE for %s", this.Xw), new Throwable[0]);
        if (this.f42815r.nr()) {
            KN();
        } else {
            qie();
        }
    }

    private boolean ty() {
        if (!this.P5) {
            return false;
        }
        Logger.t().n(M7, String.format("Work interrupted for %s", this.Xw), new Throwable[0]);
        if (this.f42809X.xMQ(this.f42816t) == null) {
            xMQ(false);
        } else {
            xMQ(!r0.n());
        }
        return true;
    }

    private void xMQ(boolean z2) {
        ListenableWorker listenableWorker;
        this.f42811e.xMQ();
        try {
            if (!this.f42811e.GR().S()) {
                PackageManagerHelper.n(this.f42813n, RescheduleReceiver.class, false);
            }
            if (z2) {
                this.f42809X.rl(WorkInfo.State.ENQUEUED, this.f42816t);
                this.f42809X.ck(this.f42816t, -1L);
            }
            if (this.f42815r != null && (listenableWorker = this.f42814o) != null && listenableWorker.isRunInForeground()) {
                this.E2.n(this.f42816t);
            }
            this.f42811e.P5();
            this.f42811e.r();
            this.jB.HI(Boolean.valueOf(z2));
        } catch (Throwable th) {
            this.f42811e.r();
            throw th;
        }
    }

    void qie() {
        this.f42811e.xMQ();
        try {
            O(this.f42816t);
            this.f42809X.o(this.f42816t, ((ListenableWorker.Result.Failure) this.f42806S).O());
            this.f42811e.P5();
        } finally {
            this.f42811e.r();
            xMQ(false);
        }
    }

    public Xo rl() {
        return this.jB;
    }

    @Override // java.lang.Runnable
    public void run() {
        List listN = this.f42804N.n(this.f42816t);
        this.f42817v = listN;
        this.Xw = n(listN);
        gh();
    }

    WorkerWrapper(Builder builder) {
        this.f42813n = builder.f42825n;
        this.f42810Z = builder.nr;
        this.E2 = builder.f42826t;
        this.f42816t = builder.Uo;
        this.f42805O = builder.KN;
        this.J2 = builder.xMQ;
        this.f42814o = builder.rl;
        this.f42812g = builder.f42824O;
        WorkDatabase workDatabase = builder.J2;
        this.f42811e = workDatabase;
        this.f42809X = workDatabase.GR();
        this.f42807T = this.f42811e.eF();
        this.f42804N = this.f42811e.Nxk();
    }

    private void gh() {
        Data dataRl;
        if (!ty()) {
            this.f42811e.xMQ();
            try {
                WorkSpec workSpecMUb = this.f42809X.mUb(this.f42816t);
                this.f42815r = workSpecMUb;
                if (workSpecMUb == null) {
                    Logger.t().rl(M7, String.format("Didn't find WorkSpec for id %s", this.f42816t), new Throwable[0]);
                    xMQ(false);
                    this.f42811e.P5();
                    return;
                }
                if (workSpecMUb.rl != WorkInfo.State.ENQUEUED) {
                    mUb();
                    this.f42811e.P5();
                    Logger.t().n(M7, String.format("%s is not in ENQUEUED state. Nothing more to do.", this.f42815r.f42952t), new Throwable[0]);
                    return;
                }
                if (workSpecMUb.nr() || this.f42815r.t()) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    WorkSpec workSpec = this.f42815r;
                    if (workSpec.ty != 0 && jCurrentTimeMillis < workSpec.n()) {
                        Logger.t().n(M7, String.format("Delaying execution for %s because it is being executed before schedule.", this.f42815r.f42952t), new Throwable[0]);
                        xMQ(true);
                        this.f42811e.P5();
                        return;
                    }
                }
                this.f42811e.P5();
                this.f42811e.r();
                if (this.f42815r.nr()) {
                    dataRl = this.f42815r.f42949O;
                } else {
                    InputMerger inputMergerRl = this.f42812g.J2().rl(this.f42815r.nr);
                    if (inputMergerRl == null) {
                        Logger.t().rl(M7, String.format("Could not create Input Merger %s", this.f42815r.nr), new Throwable[0]);
                        qie();
                        return;
                    } else {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(this.f42815r.f42949O);
                        arrayList.addAll(this.f42809X.qie(this.f42816t));
                        dataRl = inputMergerRl.rl(arrayList);
                    }
                }
                WorkerParameters workerParameters = new WorkerParameters(UUID.fromString(this.f42816t), dataRl, this.f42817v, this.J2, this.f42815r.gh, this.f42812g.O(), this.f42810Z, this.f42812g.az(), new WorkProgressUpdater(this.f42811e, this.f42810Z), new WorkForegroundUpdater(this.f42811e, this.E2, this.f42810Z));
                if (this.f42814o == null) {
                    this.f42814o = this.f42812g.az().rl(this.f42813n, this.f42815r.f42952t, workerParameters);
                }
                ListenableWorker listenableWorker = this.f42814o;
                if (listenableWorker == null) {
                    Logger.t().rl(M7, String.format("Could not create Worker %s", this.f42815r.f42952t), new Throwable[0]);
                    qie();
                    return;
                }
                if (listenableWorker.isUsed()) {
                    Logger.t().rl(M7, String.format("Received an already-used Worker %s; WorkerFactory should return new instances", this.f42815r.f42952t), new Throwable[0]);
                    qie();
                    return;
                }
                this.f42814o.setUsed();
                if (HI()) {
                    if (ty()) {
                        return;
                    }
                    final SettableFuture settableFutureO = SettableFuture.o();
                    WorkForegroundRunnable workForegroundRunnable = new WorkForegroundRunnable(this.f42813n, this.f42815r, this.f42814o, workerParameters.rl(), this.f42810Z);
                    this.f42810Z.n().execute(workForegroundRunnable);
                    final Xo xoN = workForegroundRunnable.n();
                    xoN.addListener(new Runnable() { // from class: androidx.work.impl.WorkerWrapper.1
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                xoN.get();
                                Logger.t().n(WorkerWrapper.M7, String.format("Starting work for %s", WorkerWrapper.this.f42815r.f42952t), new Throwable[0]);
                                WorkerWrapper workerWrapper = WorkerWrapper.this;
                                workerWrapper.f42808U = workerWrapper.f42814o.startWork();
                                settableFutureO.Ik(WorkerWrapper.this.f42808U);
                            } catch (Throwable th) {
                                settableFutureO.ck(th);
                            }
                        }
                    }, this.f42810Z.n());
                    final String str = this.Xw;
                    settableFutureO.addListener(new Runnable() { // from class: androidx.work.impl.WorkerWrapper.2
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                try {
                                    ListenableWorker.Result result = (ListenableWorker.Result) settableFutureO.get();
                                    if (result == null) {
                                        Logger.t().rl(WorkerWrapper.M7, String.format("%s returned a null result. Treating it as a failure.", WorkerWrapper.this.f42815r.f42952t), new Throwable[0]);
                                    } else {
                                        Logger.t().n(WorkerWrapper.M7, String.format("%s returned a %s result.", WorkerWrapper.this.f42815r.f42952t, result), new Throwable[0]);
                                        WorkerWrapper.this.f42806S = result;
                                    }
                                    WorkerWrapper.this.J2();
                                } catch (InterruptedException e2) {
                                    e = e2;
                                    Logger.t().rl(WorkerWrapper.M7, String.format("%s failed because it threw an exception/error", str), e);
                                    WorkerWrapper.this.J2();
                                } catch (CancellationException e3) {
                                    Logger.t().nr(WorkerWrapper.M7, String.format("%s was cancelled", str), e3);
                                    WorkerWrapper.this.J2();
                                } catch (ExecutionException e4) {
                                    e = e4;
                                    Logger.t().rl(WorkerWrapper.M7, String.format("%s failed because it threw an exception/error", str), e);
                                    WorkerWrapper.this.J2();
                                }
                            } catch (Throwable th) {
                                WorkerWrapper.this.J2();
                                throw th;
                            }
                        }
                    }, this.f42810Z.getBackgroundExecutor());
                    return;
                }
                mUb();
            } finally {
                this.f42811e.r();
            }
        }
    }

    void J2() {
        if (!ty()) {
            this.f42811e.xMQ();
            try {
                WorkInfo.State stateXMQ = this.f42809X.xMQ(this.f42816t);
                this.f42811e.I().n(this.f42816t);
                if (stateXMQ == null) {
                    xMQ(false);
                } else if (stateXMQ == WorkInfo.State.RUNNING) {
                    t(this.f42806S);
                } else if (!stateXMQ.n()) {
                    Uo();
                }
                this.f42811e.P5();
                this.f42811e.r();
            } catch (Throwable th) {
                this.f42811e.r();
                throw th;
            }
        }
        List list = this.f42805O;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((Scheduler) it.next()).n(this.f42816t);
            }
            Schedulers.rl(this.f42812g, this.f42811e, this.f42805O);
        }
    }
}
