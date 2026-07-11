package GJW;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class Fl extends FKk implements iF {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Executor f3396O;

    private final void Bu(CoroutineContext coroutineContext, RejectedExecutionException rejectedExecutionException) {
        AbstractC1363t.nr(coroutineContext, YzO.n("The task was rejected", rejectedExecutionException));
    }

    private final ScheduledFuture p0N(ScheduledExecutorService scheduledExecutorService, Runnable runnable, CoroutineContext coroutineContext, long j2) {
        try {
            return scheduledExecutorService.schedule(runnable, j2, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e2) {
            Bu(coroutineContext, e2);
            return null;
        }
    }

    @Override // GJW.FKk
    public Executor T3L() {
        return this.f3396O;
    }

    public boolean equals(Object obj) {
        return (obj instanceof Fl) && ((Fl) obj).T3L() == T3L();
    }

    public Fl(Executor executor) {
        this.f3396O = executor;
        dzu.j.n(T3L());
    }

    @Override // GJW.iF
    public O U(long j2, Runnable runnable, CoroutineContext coroutineContext) {
        ScheduledExecutorService scheduledExecutorService;
        long j3;
        Runnable runnable2;
        CoroutineContext coroutineContext2;
        Executor executorT3L = T3L();
        ScheduledFuture scheduledFutureP0N = null;
        if (executorT3L instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) executorT3L;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            j3 = j2;
            runnable2 = runnable;
            coroutineContext2 = coroutineContext;
            scheduledFutureP0N = p0N(scheduledExecutorService, runnable2, coroutineContext2, j3);
        } else {
            j3 = j2;
            runnable2 = runnable;
            coroutineContext2 = coroutineContext;
        }
        if (scheduledFutureP0N != null) {
            return new C1362p(scheduledFutureP0N);
        }
        return Md.f3426S.U(j3, runnable2, coroutineContext2);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ExecutorService executorService;
        Executor executorT3L = T3L();
        if (executorT3L instanceof ExecutorService) {
            executorService = (ExecutorService) executorT3L;
        } else {
            executorService = null;
        }
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    public int hashCode() {
        return System.identityHashCode(T3L());
    }

    @Override // GJW.lej
    public void n1(CoroutineContext coroutineContext, Runnable runnable) {
        try {
            Executor executorT3L = T3L();
            w6.n();
            executorT3L.execute(runnable);
        } catch (RejectedExecutionException e2) {
            w6.n();
            Bu(coroutineContext, e2);
            OU.rl().n1(coroutineContext, runnable);
        }
    }

    @Override // GJW.lej
    public String toString() {
        return T3L().toString();
    }

    @Override // GJW.iF
    public void z(long j2, Pl pl) {
        ScheduledExecutorService scheduledExecutorService;
        long j3;
        Executor executorT3L = T3L();
        ScheduledFuture scheduledFutureP0N = null;
        if (executorT3L instanceof ScheduledExecutorService) {
            scheduledExecutorService = (ScheduledExecutorService) executorT3L;
        } else {
            scheduledExecutorService = null;
        }
        if (scheduledExecutorService != null) {
            j3 = j2;
            scheduledFutureP0N = p0N(scheduledExecutorService, new Pmq(this, pl), pl.getContext(), j3);
        } else {
            j3 = j2;
        }
        if (scheduledFutureP0N != null) {
            QJ.t(pl, new C1361o(scheduledFutureP0N));
        } else {
            Md.f3426S.z(j3, pl);
        }
    }
}
