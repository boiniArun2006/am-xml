package androidx.work;

import androidx.work.impl.DefaultRunnableScheduler;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class Configuration {
    final InitializationExceptionHandler J2;
    final int KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final RunnableScheduler f42698O;
    final String Uo;
    final int gh;
    final int mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final Executor f42699n;
    final InputMergerFactory nr;
    private final boolean qie;
    final Executor rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final WorkerFactory f42700t;
    final int xMQ;

    public static final class Builder {
        InitializationExceptionHandler J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        RunnableScheduler f42704O;
        String Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Executor f42705n;
        Executor nr;
        WorkerFactory rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        InputMergerFactory f42706t;
        int KN = 4;
        int xMQ = 0;
        int mUb = Integer.MAX_VALUE;
        int gh = 20;

        public Configuration n() {
            return new Configuration(this);
        }
    }

    public interface Provider {
        Configuration n();
    }

    private ThreadFactory rl(final boolean z2) {
        return new ThreadFactory() { // from class: androidx.work.Configuration.1

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final AtomicInteger f42702n = new AtomicInteger(0);

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                return new Thread(runnable, (z2 ? "WM.task-" : "androidx.work-") + this.f42702n.incrementAndGet());
            }
        };
    }

    public InputMergerFactory J2() {
        return this.nr;
    }

    public int KN() {
        return this.gh;
    }

    public Executor O() {
        return this.f42699n;
    }

    public int Uo() {
        return this.mUb;
    }

    public WorkerFactory az() {
        return this.f42700t;
    }

    public RunnableScheduler gh() {
        return this.f42698O;
    }

    public int mUb() {
        return this.KN;
    }

    public InitializationExceptionHandler nr() {
        return this.J2;
    }

    public Executor qie() {
        return this.rl;
    }

    public String t() {
        return this.Uo;
    }

    public int xMQ() {
        return this.xMQ;
    }

    Configuration(Builder builder) {
        Executor executor = builder.f42705n;
        if (executor == null) {
            this.f42699n = n(false);
        } else {
            this.f42699n = executor;
        }
        Executor executor2 = builder.nr;
        if (executor2 == null) {
            this.qie = true;
            this.rl = n(true);
        } else {
            this.qie = false;
            this.rl = executor2;
        }
        WorkerFactory workerFactory = builder.rl;
        if (workerFactory == null) {
            this.f42700t = WorkerFactory.t();
        } else {
            this.f42700t = workerFactory;
        }
        InputMergerFactory inputMergerFactory = builder.f42706t;
        if (inputMergerFactory == null) {
            this.nr = InputMergerFactory.t();
        } else {
            this.nr = inputMergerFactory;
        }
        RunnableScheduler runnableScheduler = builder.f42704O;
        if (runnableScheduler == null) {
            this.f42698O = new DefaultRunnableScheduler();
        } else {
            this.f42698O = runnableScheduler;
        }
        this.KN = builder.KN;
        this.xMQ = builder.xMQ;
        this.mUb = builder.mUb;
        this.gh = builder.gh;
        this.J2 = builder.J2;
        this.Uo = builder.Uo;
    }

    private Executor n(boolean z2) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), rl(z2));
    }
}
