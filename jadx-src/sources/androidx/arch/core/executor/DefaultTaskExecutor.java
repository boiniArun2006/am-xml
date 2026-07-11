package androidx.arch.core.executor;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@RestrictTo
public class DefaultTaskExecutor extends TaskExecutor {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f14461n = new Object();
    private final ExecutorService rl = Executors.newFixedThreadPool(4, new ThreadFactory() { // from class: androidx.arch.core.executor.DefaultTaskExecutor.1

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final AtomicInteger f14463n = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("arch_disk_io_" + this.f14463n.getAndIncrement());
            return thread;
        }
    });

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private volatile Handler f14462t;

    @RequiresApi
    private static class Api28Impl {
        public static Handler n(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    private static Handler O(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Api28Impl.n(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    @Override // androidx.arch.core.executor.TaskExecutor
    public void n(Runnable runnable) {
        this.rl.execute(runnable);
    }

    @Override // androidx.arch.core.executor.TaskExecutor
    public void nr(Runnable runnable) {
        if (this.f14462t == null) {
            synchronized (this.f14461n) {
                try {
                    if (this.f14462t == null) {
                        this.f14462t = O(Looper.getMainLooper());
                    }
                } finally {
                }
            }
        }
        this.f14462t.post(runnable);
    }

    @Override // androidx.arch.core.executor.TaskExecutor
    public boolean t() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }
}
