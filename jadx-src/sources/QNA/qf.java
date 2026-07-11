package QNA;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class qf {

    class j implements ThreadFactory {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ String f8137n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ AtomicLong f8138t;

        /* JADX INFO: renamed from: QNA.qf$j$j, reason: collision with other inner class name */
        class C0283j extends Ml {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ Runnable f8139n;

            C0283j(Runnable runnable) {
                this.f8139n = runnable;
            }

            @Override // QNA.Ml
            public void n() {
                this.f8139n.run();
            }
        }

        j(String str, AtomicLong atomicLong) {
            this.f8137n = str;
            this.f8138t = atomicLong;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(new C0283j(runnable));
            threadNewThread.setName(this.f8137n + this.f8138t.getAndIncrement());
            return threadNewThread;
        }
    }

    class n extends Ml {
        final /* synthetic */ TimeUnit J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ long f8141O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ String f8142n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ ExecutorService f8143t;

        n(String str, ExecutorService executorService, long j2, TimeUnit timeUnit) {
            this.f8142n = str;
            this.f8143t = executorService;
            this.f8141O = j2;
            this.J2 = timeUnit;
        }

        @Override // QNA.Ml
        public void n() {
            try {
                h1M.CN3.J2().rl("Executing shutdown hook for " + this.f8142n);
                this.f8143t.shutdown();
                if (!this.f8143t.awaitTermination(this.f8141O, this.J2)) {
                    h1M.CN3.J2().rl(this.f8142n + " did not shut down in the allocated time. Requesting immediate shutdown.");
                    this.f8143t.shutdownNow();
                }
            } catch (InterruptedException unused) {
                h1M.CN3.J2().rl(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", this.f8142n));
                this.f8143t.shutdownNow();
            }
        }
    }

    private static ExecutorService O(ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        return Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler));
    }

    private static void n(String str, ExecutorService executorService) {
        rl(str, executorService, 2L, TimeUnit.SECONDS);
    }

    public static ThreadFactory nr(String str) {
        return new j(str, new AtomicLong(1L));
    }

    private static void rl(String str, ExecutorService executorService, long j2, TimeUnit timeUnit) {
        Runtime.getRuntime().addShutdownHook(new Thread(new n(str, executorService, j2, timeUnit), "Crashlytics Shutdown Hook for " + str));
    }

    public static ExecutorService t(String str) {
        ExecutorService executorServiceO = O(nr(str), new ThreadPoolExecutor.DiscardPolicy());
        n(str, executorServiceO);
        return executorServiceO;
    }
}
