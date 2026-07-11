package JP;

import java.lang.Thread;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class M implements Executor {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f4496n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Queue f4497t = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final AtomicReference f4495O = new AtomicReference();

    public static final class Ml {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final w6 f4498n;
        private final ScheduledFuture rl;

        /* synthetic */ Ml(w6 w6Var, ScheduledFuture scheduledFuture, j jVar) {
            this(w6Var, scheduledFuture);
        }

        private Ml(w6 w6Var, ScheduledFuture scheduledFuture) {
            this.f4498n = (w6) t1.Xo.ck(w6Var, "runnable");
            this.rl = (ScheduledFuture) t1.Xo.ck(scheduledFuture, "future");
        }

        public void n() {
            this.f4498n.f4507t = true;
            this.rl.cancel(false);
        }

        public boolean rl() {
            w6 w6Var = this.f4498n;
            return (w6Var.f4505O || w6Var.f4507t) ? false : true;
        }
    }

    class j implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ w6 f4500n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Runnable f4501t;

        j(w6 w6Var, Runnable runnable) {
            this.f4500n = w6Var;
            this.f4501t = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            M.this.execute(this.f4500n);
        }

        public String toString() {
            return this.f4501t.toString() + "(scheduled in SynchronizationContext)";
        }
    }

    class n implements Runnable {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ long f4502O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ w6 f4503n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Runnable f4504t;

        n(w6 w6Var, Runnable runnable, long j2) {
            this.f4503n = w6Var;
            this.f4504t = runnable;
            this.f4502O = j2;
        }

        @Override // java.lang.Runnable
        public void run() {
            M.this.execute(this.f4503n);
        }

        public String toString() {
            return this.f4504t.toString() + "(scheduled in SynchronizationContext with delay of " + this.f4502O + ")";
        }
    }

    private static class w6 implements Runnable {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        boolean f4505O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final Runnable f4506n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        boolean f4507t;

        @Override // java.lang.Runnable
        public void run() {
            if (this.f4507t) {
                return;
            }
            this.f4505O = true;
            this.f4506n.run();
        }

        w6(Runnable runnable) {
            this.f4506n = (Runnable) t1.Xo.ck(runnable, "task");
        }
    }

    public final void n() {
        while (androidx.compose.animation.core.fuX.n(this.f4495O, null, Thread.currentThread())) {
            while (true) {
                try {
                    Runnable runnable = (Runnable) this.f4497t.poll();
                    if (runnable == null) {
                        break;
                    }
                    try {
                        runnable.run();
                    } catch (Throwable th) {
                        this.f4496n.uncaughtException(Thread.currentThread(), th);
                    }
                } catch (Throwable th2) {
                    this.f4495O.set(null);
                    throw th2;
                }
            }
            this.f4495O.set(null);
            if (this.f4497t.isEmpty()) {
                return;
            }
        }
    }

    public final Ml nr(Runnable runnable, long j2, long j3, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        w6 w6Var = new w6(runnable);
        return new Ml(w6Var, scheduledExecutorService.scheduleWithFixedDelay(new n(w6Var, runnable, j3), j2, j3, timeUnit), null);
    }

    public final void rl(Runnable runnable) {
        this.f4497t.add((Runnable) t1.Xo.ck(runnable, "runnable is null"));
    }

    public final Ml t(Runnable runnable, long j2, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        w6 w6Var = new w6(runnable);
        return new Ml(w6Var, scheduledExecutorService.schedule(new j(w6Var, runnable), j2, timeUnit), null);
    }

    public M(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f4496n = (Thread.UncaughtExceptionHandler) t1.Xo.ck(uncaughtExceptionHandler, "uncaughtExceptionHandler");
    }

    public void O() {
        boolean z2;
        if (Thread.currentThread() == this.f4495O.get()) {
            z2 = true;
        } else {
            z2 = false;
        }
        t1.Xo.S(z2, "Not called from the SynchronizationContext");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        rl(runnable);
        n();
    }
}
