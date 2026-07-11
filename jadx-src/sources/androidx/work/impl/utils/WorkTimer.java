package androidx.work.impl.utils;

import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@RestrictTo
public class WorkTimer {
    private static final String J2 = Logger.J2("WorkTimer");

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final Object f43041O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ThreadFactory f43042n;
    final Map nr;
    private final ScheduledExecutorService rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final Map f43043t;

    @RestrictTo
    public interface TimeLimitExceededListener {
        void n(String str);
    }

    @RestrictTo
    public static class WorkTimerRunnable implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final WorkTimer f43046n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final String f43047t;

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f43046n.f43041O) {
                try {
                    if (((WorkTimerRunnable) this.f43046n.f43043t.remove(this.f43047t)) != null) {
                        TimeLimitExceededListener timeLimitExceededListener = (TimeLimitExceededListener) this.f43046n.nr.remove(this.f43047t);
                        if (timeLimitExceededListener != null) {
                            timeLimitExceededListener.n(this.f43047t);
                        }
                    } else {
                        Logger.t().n("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.f43047t), new Throwable[0]);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        WorkTimerRunnable(WorkTimer workTimer, String str) {
            this.f43046n = workTimer;
            this.f43047t = str;
        }
    }

    public void n() {
        if (this.rl.isShutdown()) {
            return;
        }
        this.rl.shutdownNow();
    }

    public void rl(String str, long j2, TimeLimitExceededListener timeLimitExceededListener) {
        synchronized (this.f43041O) {
            Logger.t().n(J2, String.format("Starting timer for %s", str), new Throwable[0]);
            t(str);
            WorkTimerRunnable workTimerRunnable = new WorkTimerRunnable(this, str);
            this.f43043t.put(str, workTimerRunnable);
            this.nr.put(str, timeLimitExceededListener);
            this.rl.schedule(workTimerRunnable, j2, TimeUnit.MILLISECONDS);
        }
    }

    public void t(String str) {
        synchronized (this.f43041O) {
            try {
                if (((WorkTimerRunnable) this.f43043t.remove(str)) != null) {
                    Logger.t().n(J2, String.format("Stopping timer for %s", str), new Throwable[0]);
                    this.nr.remove(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public WorkTimer() {
        ThreadFactory threadFactory = new ThreadFactory() { // from class: androidx.work.impl.utils.WorkTimer.1

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private int f43044n = 0;

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
                threadNewThread.setName("WorkManager-WorkTimer-thread-" + this.f43044n);
                this.f43044n = this.f43044n + 1;
                return threadNewThread;
            }
        };
        this.f43042n = threadFactory;
        this.f43043t = new HashMap();
        this.nr = new HashMap();
        this.f43041O = new Object();
        this.rl = Executors.newSingleThreadScheduledExecutor(threadFactory);
    }
}
