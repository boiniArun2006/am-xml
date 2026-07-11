package QNA;

import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
class Ew implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final AtomicBoolean f8066O = new AtomicBoolean(false);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final j f8067n;
    private final h1M.j nr;
    private final F5.aC rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f8068t;

    interface j {
        void n(F5.aC aCVar, Thread thread, Throwable th);
    }

    private boolean rl(Thread thread, Throwable th) {
        if (thread == null) {
            h1M.CN3.J2().nr("Crashlytics will not record uncaught exception; null thread");
            return false;
        }
        if (th == null) {
            h1M.CN3.J2().nr("Crashlytics will not record uncaught exception; null throwable");
            return false;
        }
        if (!this.nr.rl()) {
            return true;
        }
        h1M.CN3.J2().rl("Crashlytics will not record uncaught exception; native crash exists for session.");
        return false;
    }

    boolean n() {
        return this.f8066O.get();
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        this.f8066O.set(true);
        try {
            try {
                if (rl(thread, th)) {
                    this.f8067n.n(this.rl, thread, th);
                } else {
                    h1M.CN3.J2().rl("Uncaught exception will not be recorded by Crashlytics.");
                }
                if (this.f8068t != null) {
                    h1M.CN3.J2().rl("Completed exception processing. Invoking default exception handler.");
                    this.f8068t.uncaughtException(thread, th);
                } else {
                    h1M.CN3.J2().rl("Completed exception processing, but no default exception handler.");
                    System.exit(1);
                }
                this.f8066O.set(false);
            } catch (Exception e2) {
                h1M.CN3.J2().O("An error occurred in the uncaught exception handler", e2);
                if (this.f8068t != null) {
                    h1M.CN3.J2().rl("Completed exception processing. Invoking default exception handler.");
                    this.f8068t.uncaughtException(thread, th);
                } else {
                    h1M.CN3.J2().rl("Completed exception processing, but no default exception handler.");
                    System.exit(1);
                }
                this.f8066O.set(false);
            }
        } catch (Throwable th2) {
            if (this.f8068t != null) {
                h1M.CN3.J2().rl("Completed exception processing. Invoking default exception handler.");
                this.f8068t.uncaughtException(thread, th);
            } else {
                h1M.CN3.J2().rl("Completed exception processing, but no default exception handler.");
                System.exit(1);
            }
            this.f8066O.set(false);
            throw th2;
        }
    }

    public Ew(j jVar, F5.aC aCVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, h1M.j jVar2) {
        this.f8067n = jVar;
        this.rl = aCVar;
        this.f8068t = uncaughtExceptionHandler;
        this.nr = jVar2;
    }
}
