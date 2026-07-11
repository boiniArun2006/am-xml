package ePk;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class j {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    static final int f63617O;
    static final int nr;
    private static final j rl = new j();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f63618t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Executor f63619n = new n();

    private static class n implements Executor {
        private n() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        f63618t = iAvailableProcessors;
        nr = iAvailableProcessors + 1;
        f63617O = (iAvailableProcessors * 2) + 1;
    }

    public static ExecutorService rl() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(nr, f63617O, 1L, TimeUnit.SECONDS, new LinkedBlockingQueue());
        n(threadPoolExecutor, true);
        return threadPoolExecutor;
    }

    public static Executor t() {
        return rl.f63619n;
    }

    private j() {
    }

    public static void n(ThreadPoolExecutor threadPoolExecutor, boolean z2) {
        threadPoolExecutor.allowCoreThreadTimeOut(z2);
    }
}
