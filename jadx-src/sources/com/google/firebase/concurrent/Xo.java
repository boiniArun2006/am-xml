package com.google.firebase.concurrent;

import com.google.firebase.concurrent.eO;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
class Xo implements ScheduledExecutorService {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ExecutorService f60256n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ScheduledExecutorService f60257t;

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection) {
        return this.f60256n.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection) {
        return this.f60256n.invokeAny(collection);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(final Runnable runnable, final long j2, final TimeUnit timeUnit) {
        return new eO(new eO.w6() { // from class: com.google.firebase.concurrent.w6
            @Override // com.google.firebase.concurrent.eO.w6
            public final ScheduledFuture n(eO.n nVar) {
                Xo xo = this.f60276n;
                return xo.f60257t.schedule(new Runnable() { // from class: com.google.firebase.concurrent.aC
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f60259n.f60256n.execute(new Runnable() { // from class: com.google.firebase.concurrent.qz
                            @Override // java.lang.Runnable
                            public final void run() {
                                Xo.FX(runnable, nVar);
                            }
                        });
                    }
                }, j2, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Callable callable) {
        return this.f60256n.submit(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j2, TimeUnit timeUnit) {
        return this.f60256n.awaitTermination(j2, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f60256n.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection, long j2, TimeUnit timeUnit) {
        return this.f60256n.invokeAll(collection, j2, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection, long j2, TimeUnit timeUnit) {
        return this.f60256n.invokeAny(collection, j2, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f60256n.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f60256n.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(final Callable callable, final long j2, final TimeUnit timeUnit) {
        return new eO(new eO.w6() { // from class: com.google.firebase.concurrent.fuX
            @Override // com.google.firebase.concurrent.eO.w6
            public final ScheduledFuture n(eO.n nVar) {
                Xo xo = this.f60263n;
                return xo.f60257t.schedule(new Callable() { // from class: com.google.firebase.concurrent.C
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return this.f60237n.f60256n.submit(new Runnable() { // from class: com.google.firebase.concurrent.Pl
                            @Override // java.lang.Runnable
                            public final void run() {
                                Xo.T(callable, nVar);
                            }
                        });
                    }
                }, j2, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleAtFixedRate(final Runnable runnable, final long j2, final long j3, final TimeUnit timeUnit) {
        return new eO(new eO.w6() { // from class: com.google.firebase.concurrent.Wre
            @Override // com.google.firebase.concurrent.eO.w6
            public final ScheduledFuture n(eO.n nVar) {
                Xo xo = this.f60254n;
                return xo.f60257t.scheduleAtFixedRate(new Runnable() { // from class: com.google.firebase.concurrent.Dsr
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f60243n.f60256n.execute(new Runnable() { // from class: com.google.firebase.concurrent.Ml
                            @Override // java.lang.Runnable
                            public final void run() throws Exception {
                                Xo.jB(runnable, nVar);
                            }
                        });
                    }
                }, j2, j3, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleWithFixedDelay(final Runnable runnable, final long j2, final long j3, final TimeUnit timeUnit) {
        return new eO(new eO.w6() { // from class: com.google.firebase.concurrent.CN3
            @Override // com.google.firebase.concurrent.eO.w6
            public final ScheduledFuture n(eO.n nVar) {
                Xo xo = this.f60240n;
                return xo.f60257t.scheduleWithFixedDelay(new Runnable() { // from class: com.google.firebase.concurrent.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        xo.f60256n.execute(new Runnable() { // from class: com.google.firebase.concurrent.I28
                            @Override // java.lang.Runnable
                            public final void run() {
                                Xo.eF(runnable, nVar);
                            }
                        });
                    }
                }, j2, j3, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable, Object obj) {
        return this.f60256n.submit(runnable, obj);
    }

    Xo(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.f60256n = executorService;
        this.f60257t = scheduledExecutorService;
    }

    public static /* synthetic */ void FX(Runnable runnable, eO.n nVar) {
        try {
            runnable.run();
            nVar.set(null);
        } catch (Exception e2) {
            nVar.n(e2);
        }
    }

    public static /* synthetic */ void T(Callable callable, eO.n nVar) {
        try {
            nVar.set(callable.call());
        } catch (Exception e2) {
            nVar.n(e2);
        }
    }

    public static /* synthetic */ void eF(Runnable runnable, eO.n nVar) {
        try {
            runnable.run();
        } catch (Exception e2) {
            nVar.n(e2);
        }
    }

    public static /* synthetic */ void jB(Runnable runnable, eO.n nVar) throws Exception {
        try {
            runnable.run();
        } catch (Exception e2) {
            nVar.n(e2);
            throw e2;
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable) {
        return this.f60256n.submit(runnable);
    }
}
