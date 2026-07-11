package com.google.common.util.concurrent;

import com.google.common.util.concurrent.CN3;
import com.google.common.util.concurrent.j;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class QJ {

    private static class j extends com.google.common.util.concurrent.n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final ExecutorService f59835n;

        @Override // java.util.concurrent.ExecutorService
        public final boolean awaitTermination(long j2, TimeUnit timeUnit) {
            return this.f59835n.awaitTermination(j2, timeUnit);
        }

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.f59835n.execute(runnable);
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isShutdown() {
            return this.f59835n.isShutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final boolean isTerminated() {
            return this.f59835n.isTerminated();
        }

        @Override // java.util.concurrent.ExecutorService
        public final void shutdown() {
            this.f59835n.shutdown();
        }

        @Override // java.util.concurrent.ExecutorService
        public final List shutdownNow() {
            return this.f59835n.shutdownNow();
        }

        public final String toString() {
            return super.toString() + "[" + this.f59835n + "]";
        }

        j(ExecutorService executorService) {
            this.f59835n = (ExecutorService) t1.Xo.HI(executorService);
        }
    }

    private static final class n extends j implements ScheduledExecutorService, z {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final ScheduledExecutorService f59836t;

        private static final class j extends CN3.j implements eO {

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private final ScheduledFuture f59837t;

            @Override // java.lang.Comparable
            /* JADX INFO: renamed from: Uo, reason: merged with bridge method [inline-methods] */
            public int compareTo(Delayed delayed) {
                return this.f59837t.compareTo(delayed);
            }

            @Override // java.util.concurrent.Delayed
            public long getDelay(TimeUnit timeUnit) {
                return this.f59837t.getDelay(timeUnit);
            }

            public j(Xo xo, ScheduledFuture scheduledFuture) {
                super(xo);
                this.f59837t = scheduledFuture;
            }

            @Override // com.google.common.util.concurrent.Wre, java.util.concurrent.Future
            public boolean cancel(boolean z2) {
                boolean zCancel = super.cancel(z2);
                if (zCancel) {
                    this.f59837t.cancel(z2);
                }
                return zCancel;
            }
        }

        /* JADX INFO: renamed from: com.google.common.util.concurrent.QJ$n$n, reason: collision with other inner class name */
        private static final class RunnableC0797n extends j.aC implements Runnable {

            /* JADX INFO: renamed from: S, reason: collision with root package name */
            private final Runnable f59838S;

            @Override // com.google.common.util.concurrent.j
            protected String aYN() {
                return "task=[" + this.f59838S + "]";
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    this.f59838S.run();
                } catch (Throwable th) {
                    te(th);
                    throw th;
                }
            }

            public RunnableC0797n(Runnable runnable) {
                this.f59838S = (Runnable) t1.Xo.HI(runnable);
            }
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
        public eO schedule(Runnable runnable, long j2, TimeUnit timeUnit) {
            r rVarE2 = r.E2(runnable, null);
            return new j(rVarE2, this.f59836t.schedule(rVarE2, j2, timeUnit));
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
        public eO scheduleWithFixedDelay(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
            RunnableC0797n runnableC0797n = new RunnableC0797n(runnable);
            return new j(runnableC0797n, this.f59836t.scheduleWithFixedDelay(runnableC0797n, j2, j3, timeUnit));
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        /* JADX INFO: renamed from: jB, reason: merged with bridge method [inline-methods] */
        public eO scheduleAtFixedRate(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
            RunnableC0797n runnableC0797n = new RunnableC0797n(runnable);
            return new j(runnableC0797n, this.f59836t.scheduleAtFixedRate(runnableC0797n, j2, j3, timeUnit));
        }

        n(ScheduledExecutorService scheduledExecutorService) {
            super(scheduledExecutorService);
            this.f59836t = (ScheduledExecutorService) t1.Xo.HI(scheduledExecutorService);
        }

        @Override // java.util.concurrent.ScheduledExecutorService
        /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
        public eO schedule(Callable callable, long j2, TimeUnit timeUnit) {
            r rVarE = r.e(callable);
            return new j(rVarE, this.f59836t.schedule(rVarE, j2, timeUnit));
        }
    }

    public static Executor n() {
        return Ml.INSTANCE;
    }

    public static z rl(ExecutorService executorService) {
        return executorService instanceof z ? (z) executorService : executorService instanceof ScheduledExecutorService ? new n((ScheduledExecutorService) executorService) : new j(executorService);
    }
}
