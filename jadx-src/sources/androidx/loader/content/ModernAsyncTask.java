package androidx.loader.content;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
abstract class ModernAsyncTask<Result> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static Handler f39103r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private volatile Status f39106t = Status.PENDING;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final AtomicBoolean f39104O = new AtomicBoolean();
    final AtomicBoolean J2 = new AtomicBoolean();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final FutureTask f39105n = new FutureTask<Result>(new Callable<Result>() { // from class: androidx.loader.content.ModernAsyncTask.1
        @Override // java.util.concurrent.Callable
        public Object call() {
            ModernAsyncTask.this.J2.set(true);
            Object objRl = null;
            try {
                Process.setThreadPriority(10);
                objRl = ModernAsyncTask.this.rl();
                Binder.flushPendingCommands();
                return objRl;
            } finally {
            }
        }
    }) { // from class: androidx.loader.content.ModernAsyncTask.2
        @Override // java.util.concurrent.FutureTask
        protected void done() {
            try {
                ModernAsyncTask.this.mUb(get());
            } catch (InterruptedException e2) {
                Log.w("AsyncTask", e2);
            } catch (CancellationException unused) {
                ModernAsyncTask.this.mUb(null);
            } catch (ExecutionException e3) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e3.getCause());
            } catch (Throwable th) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th);
            }
        }
    };

    public enum Status {
        PENDING,
        RUNNING,
        FINISHED
    }

    protected void KN(Object obj) {
    }

    protected void Uo(Object obj) {
    }

    protected abstract Object rl();

    /* JADX INFO: renamed from: androidx.loader.content.ModernAsyncTask$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        static final /* synthetic */ int[] f39111n;

        static {
            int[] iArr = new int[Status.values().length];
            f39111n = iArr;
            try {
                iArr[Status.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39111n[Status.FINISHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private static Handler O() {
        Handler handler;
        synchronized (ModernAsyncTask.class) {
            try {
                if (f39103r == null) {
                    f39103r = new Handler(Looper.getMainLooper());
                }
                handler = f39103r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handler;
    }

    public final boolean J2() {
        return this.f39104O.get();
    }

    void mUb(Object obj) {
        if (this.J2.get()) {
            return;
        }
        xMQ(obj);
    }

    public final boolean n(boolean z2) {
        this.f39104O.set(true);
        return this.f39105n.cancel(z2);
    }

    public final void t(Executor executor) {
        if (this.f39106t == Status.PENDING) {
            this.f39106t = Status.RUNNING;
            executor.execute(this.f39105n);
            return;
        }
        int i2 = AnonymousClass4.f39111n[this.f39106t.ordinal()];
        if (i2 == 1) {
            throw new IllegalStateException("Cannot execute task: the task is already running.");
        }
        if (i2 == 2) {
            throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
        }
        throw new IllegalStateException("We should never reach this state");
    }

    ModernAsyncTask() {
    }

    void nr(Object obj) {
        if (J2()) {
            Uo(obj);
        } else {
            KN(obj);
        }
        this.f39106t = Status.FINISHED;
    }

    void xMQ(final Object obj) {
        O().post(new Runnable() { // from class: androidx.loader.content.ModernAsyncTask.3
            @Override // java.lang.Runnable
            public void run() {
                ModernAsyncTask.this.nr(obj);
            }
        });
    }
}
