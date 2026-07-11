package androidx.core.provider;

import android.os.Handler;
import android.os.Process;
import androidx.core.util.Consumer;
import androidx.core.util.Preconditions;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
class RequestExecutor {

    private static class DefaultThreadFactory implements ThreadFactory {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f36578n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f36579t;

        private static class ProcessPriorityThread extends Thread {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final int f36580n;

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f36580n);
                super.run();
            }

            ProcessPriorityThread(Runnable runnable, String str, int i2) {
                super(runnable, str);
                this.f36580n = i2;
            }
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new ProcessPriorityThread(runnable, this.f36578n, this.f36579t);
        }

        DefaultThreadFactory(String str, int i2) {
            this.f36578n = str;
            this.f36579t = i2;
        }
    }

    private static class HandlerExecutor implements Executor {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Handler f36581n;

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            if (this.f36581n.post((Runnable) Preconditions.Uo(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f36581n + " is shutting down");
        }

        HandlerExecutor(Handler handler) {
            this.f36581n = (Handler) Preconditions.Uo(handler);
        }
    }

    private static class ReplyRunnable<T> implements Runnable {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private Handler f36582O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private Callable f36583n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private Consumer f36584t;

        @Override // java.lang.Runnable
        public void run() {
            final Object objCall;
            try {
                objCall = this.f36583n.call();
            } catch (Exception unused) {
                objCall = null;
            }
            final Consumer consumer = this.f36584t;
            this.f36582O.post(new Runnable() { // from class: androidx.core.provider.RequestExecutor.ReplyRunnable.1
                @Override // java.lang.Runnable
                public void run() {
                    consumer.accept(objCall);
                }
            });
        }

        ReplyRunnable(Handler handler, Callable callable, Consumer consumer) {
            this.f36583n = callable;
            this.f36584t = consumer;
            this.f36582O = handler;
        }
    }

    static ThreadPoolExecutor n(String str, int i2, int i3) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i3, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new DefaultThreadFactory(str, i2));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    static Executor rl(Handler handler) {
        return new HandlerExecutor(handler);
    }

    static Object nr(ExecutorService executorService, Callable callable, int i2) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i2, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            throw e2;
        } catch (ExecutionException e3) {
            throw new RuntimeException(e3);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }

    static void t(Executor executor, Callable callable, Consumer consumer) {
        executor.execute(new ReplyRunnable(CalleeHandler.n(), callable, consumer));
    }
}
