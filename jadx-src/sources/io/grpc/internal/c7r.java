package io.grpc.internal;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import t1.C2369c;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class c7r {
    private boolean J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private long f68459O;
    private ScheduledFuture Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ScheduledExecutorService f68460n;
    private final C2369c nr;
    private final Executor rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Runnable f68461t;

    private final class n implements Runnable {
        private n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!c7r.this.J2) {
                c7r.this.Uo = null;
                return;
            }
            long jMUb = c7r.this.mUb();
            if (c7r.this.f68459O - jMUb > 0) {
                c7r c7rVar = c7r.this;
                c7rVar.Uo = c7rVar.f68460n.schedule(new w6(), c7r.this.f68459O - jMUb, TimeUnit.NANOSECONDS);
            } else {
                c7r.this.J2 = false;
                c7r.this.Uo = null;
                c7r.this.f68461t.run();
            }
        }
    }

    private final class w6 implements Runnable {
        private w6() {
        }

        @Override // java.lang.Runnable
        public void run() {
            c7r.this.rl.execute(new n());
        }
    }

    void xMQ(boolean z2) {
        ScheduledFuture scheduledFuture;
        this.J2 = false;
        if (!z2 || (scheduledFuture = this.Uo) == null) {
            return;
        }
        scheduledFuture.cancel(false);
        this.Uo = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long mUb() {
        return this.nr.nr(TimeUnit.NANOSECONDS);
    }

    c7r(Runnable runnable, Executor executor, ScheduledExecutorService scheduledExecutorService, C2369c c2369c) {
        this.f68461t = runnable;
        this.rl = executor;
        this.f68460n = scheduledExecutorService;
        this.nr = c2369c;
        c2369c.Uo();
    }

    void gh(long j2, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j2);
        long jMUb = mUb() + nanos;
        this.J2 = true;
        if (jMUb - this.f68459O < 0 || this.Uo == null) {
            ScheduledFuture scheduledFuture = this.Uo;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.Uo = this.f68460n.schedule(new w6(), nanos, TimeUnit.NANOSECONDS);
        }
        this.f68459O = jMUb;
    }
}
