package wqP;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import wqP.I28;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class I28 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ArrayList f75085t = new ArrayList();
    private final ArrayList rl = new ArrayList();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final w6 f75084n = new w6();

    public enum Ml {
        ALL,
        LISTEN_STREAM_IDLE,
        LISTEN_STREAM_CONNECTION_BACKOFF,
        WRITE_STREAM_IDLE,
        WRITE_STREAM_CONNECTION_BACKOFF,
        HEALTH_CHECK_TIMEOUT,
        ONLINE_STATE_TIMEOUT,
        GARBAGE_COLLECTION,
        RETRY_TRANSACTION,
        CONNECTIVITY_ATTEMPT_TIMER,
        INDEX_BACKFILL
    }

    public class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Ml f75097n;
        private ScheduledFuture nr;
        private final long rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Runnable f75098t;

        private n(Ml ml, long j2, Runnable runnable) {
            this.f75097n = ml;
            this.rl = j2;
            this.f75098t = runnable;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void J2(long j2) {
            this.nr = I28.this.f75084n.schedule(new Runnable() { // from class: wqP.Wre
                @Override // java.lang.Runnable
                public final void run() {
                    this.f75120n.nr();
                }
            }, j2, TimeUnit.MILLISECONDS);
        }

        private void O() {
            wqP.n.t(this.nr != null, "Caller should have verified scheduledFuture is non-null.", new Object[0]);
            this.nr = null;
            I28.this.az(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void nr() {
            I28.this.ty();
            if (this.nr != null) {
                O();
                this.f75098t.run();
            }
        }

        public void t() {
            I28.this.ty();
            ScheduledFuture scheduledFuture = this.nr;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                O();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class w6 implements Executor {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final Thread f75099O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final ScheduledThreadPoolExecutor f75100n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f75101t;

        class j extends ScheduledThreadPoolExecutor {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ I28 f75102n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(int i2, ThreadFactory threadFactory, I28 i28) {
                super(i2, threadFactory);
                this.f75102n = i28;
            }

            @Override // java.util.concurrent.ThreadPoolExecutor
            protected void afterExecute(Runnable runnable, Throwable th) {
                super.afterExecute(runnable, th);
                if (th == null && (runnable instanceof Future)) {
                    Future future = (Future) runnable;
                    try {
                        if (future.isDone()) {
                            future.get();
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    } catch (CancellationException unused2) {
                    } catch (ExecutionException e2) {
                        th = e2.getCause();
                    }
                }
                if (th != null) {
                    I28.this.qie(th);
                }
            }
        }

        private class n implements Runnable, ThreadFactory {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final CountDownLatch f75105n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private Runnable f75106t;

            private n() {
                this.f75105n = new CountDownLatch(1);
            }

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                wqP.n.t(this.f75106t == null, "Only one thread may be created in an AsyncQueue.", new Object[0]);
                this.f75106t = runnable;
                this.f75105n.countDown();
                return w6.this.f75099O;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    this.f75105n.await();
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
                this.f75106t.run();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized boolean mUb() {
            return this.f75101t;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public synchronized ScheduledFuture schedule(Runnable runnable, long j2, TimeUnit timeUnit) {
            if (this.f75101t) {
                return null;
            }
            return this.f75100n.schedule(runnable, j2, timeUnit);
        }

        @Override // java.util.concurrent.Executor
        public synchronized void execute(Runnable runnable) {
            if (!this.f75101t) {
                this.f75100n.execute(runnable);
            }
        }

        w6() {
            n nVar = new n();
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(nVar);
            this.f75099O = threadNewThread;
            threadNewThread.setName("FirestoreWorker");
            threadNewThread.setDaemon(true);
            threadNewThread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: wqP.CN3
                @Override // java.lang.Thread.UncaughtExceptionHandler
                public final void uncaughtException(Thread thread, Throwable th) {
                    I28.this.qie(th);
                }
            });
            j jVar = new j(1, nVar, I28.this);
            this.f75100n = jVar;
            jVar.setKeepAliveTime(3L, TimeUnit.SECONDS);
            this.f75101t = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void gh() {
            this.f75100n.shutdownNow();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Task xMQ(final Callable callable) {
            final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
            try {
                execute(new Runnable() { // from class: wqP.fuX
                    @Override // java.lang.Runnable
                    public final void run() {
                        I28.w6.n(taskCompletionSource, callable);
                    }
                });
            } catch (RejectedExecutionException unused) {
                QJ.nr(I28.class.getSimpleName(), "Refused to enqueue task after panic", new Object[0]);
            }
            return taskCompletionSource.getTask();
        }

        public static /* synthetic */ void n(TaskCompletionSource taskCompletionSource, Callable callable) {
            try {
                taskCompletionSource.setResult(callable.call());
            } catch (Exception e2) {
                taskCompletionSource.setException(e2);
                throw new RuntimeException(e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void az(n nVar) {
        wqP.n.t(this.rl.remove(nVar), "Delayed task not found.", new Object[0]);
    }

    public static /* synthetic */ void rl(Throwable th) {
        if (!(th instanceof OutOfMemoryError)) {
            throw new RuntimeException("Internal error in Cloud Firestore (25.1.4).", th);
        }
        OutOfMemoryError outOfMemoryError = new OutOfMemoryError("Firestore (25.1.4) ran out of memory. Check your queries to make sure they are not loading an excessive amount of data.");
        outOfMemoryError.initCause(th);
        throw outOfMemoryError;
    }

    public Task J2(final Runnable runnable) {
        return Uo(new Callable() { // from class: wqP.Ml
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return I28.n(runnable);
            }
        });
    }

    public n KN(Ml ml, long j2, Runnable runnable) {
        if (this.f75085t.contains(ml)) {
            j2 = 0;
        }
        n nVarO = O(ml, j2, runnable);
        this.rl.add(nVarO);
        return nVarO;
    }

    public Task Uo(Callable callable) {
        return this.f75084n.xMQ(callable);
    }

    public boolean gh() {
        return this.f75084n.mUb();
    }

    public Executor mUb() {
        return this.f75084n;
    }

    public void qie(final Throwable th) {
        this.f75084n.gh();
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: wqP.w6
            @Override // java.lang.Runnable
            public final void run() {
                I28.rl(th);
            }
        });
    }

    private n O(Ml ml, long j2, Runnable runnable) {
        n nVar = new n(ml, System.currentTimeMillis() + j2, runnable);
        nVar.J2(j2);
        return nVar;
    }

    public static /* synthetic */ Void n(Runnable runnable) {
        runnable.run();
        return null;
    }

    public void ty() {
        Thread threadCurrentThread = Thread.currentThread();
        if (this.f75084n.f75099O == threadCurrentThread) {
        } else {
            throw wqP.n.n("We are running on the wrong thread. Expected to be on the AsyncQueue thread %s/%d but was %s/%d", this.f75084n.f75099O.getName(), Long.valueOf(this.f75084n.f75099O.getId()), threadCurrentThread.getName(), Long.valueOf(threadCurrentThread.getId()));
        }
    }

    public void xMQ(Runnable runnable) {
        J2(runnable);
    }
}
