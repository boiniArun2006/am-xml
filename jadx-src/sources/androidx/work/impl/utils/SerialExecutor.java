package androidx.work.impl.utils;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class SerialExecutor implements Executor {
    private volatile Runnable J2;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Executor f42999t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ArrayDeque f42998n = new ArrayDeque();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Object f42997O = new Object();

    static class Task implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final SerialExecutor f43000n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final Runnable f43001t;

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f43001t.run();
            } finally {
                this.f43000n.rl();
            }
        }

        Task(SerialExecutor serialExecutor, Runnable runnable) {
            this.f43000n = serialExecutor;
            this.f43001t = runnable;
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        synchronized (this.f42997O) {
            try {
                this.f42998n.add(new Task(this, runnable));
                if (this.J2 == null) {
                    rl();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean n() {
        boolean z2;
        synchronized (this.f42997O) {
            z2 = !this.f42998n.isEmpty();
        }
        return z2;
    }

    void rl() {
        synchronized (this.f42997O) {
            try {
                Runnable runnable = (Runnable) this.f42998n.poll();
                this.J2 = runnable;
                if (runnable != null) {
                    this.f42999t.execute(this.J2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public SerialExecutor(Executor executor) {
        this.f42999t = executor;
    }
}
