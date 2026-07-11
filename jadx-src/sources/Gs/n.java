package Gs;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class n extends AbstractExecutorService {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final Class f3752S = n.class;
    private final BlockingQueue J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private volatile int f3753O;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final AtomicInteger f3754Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f3755n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final AtomicInteger f3756o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final j f3757r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Executor f3758t;

    private class j implements Runnable {
        private j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Runnable runnable = (Runnable) n.this.J2.poll();
                if (runnable != null) {
                    runnable.run();
                } else {
                    Dzy.j.HI(n.f3752S, "%s: Worker has nothing to run", n.this.f3755n);
                }
                int iDecrementAndGet = n.this.f3756o.decrementAndGet();
                if (n.this.J2.isEmpty()) {
                    Dzy.j.ck(n.f3752S, "%s: worker finished; %d workers left", n.this.f3755n, Integer.valueOf(iDecrementAndGet));
                } else {
                    n.this.U();
                }
            } catch (Throwable th) {
                int iDecrementAndGet2 = n.this.f3756o.decrementAndGet();
                if (n.this.J2.isEmpty()) {
                    Dzy.j.ck(n.f3752S, "%s: worker finished; %d workers left", n.this.f3755n, Integer.valueOf(iDecrementAndGet2));
                } else {
                    n.this.U();
                }
                throw th;
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U() {
        int i2 = this.f3756o.get();
        while (i2 < this.f3753O) {
            int i3 = i2 + 1;
            if (this.f3756o.compareAndSet(i2, i3)) {
                Dzy.j.Ik(f3752S, "%s: starting worker %d of %d", this.f3755n, Integer.valueOf(i3), Integer.valueOf(this.f3753O));
                this.f3758t.execute(this.f3757r);
                return;
            } else {
                Dzy.j.HI(f3752S, "%s: race in startWorkerIfNeeded; retrying", this.f3755n);
                i2 = this.f3756o.get();
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j2, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        if (runnable == null) {
            throw new NullPointerException("runnable parameter is null");
        }
        if (!this.J2.offer(runnable)) {
            throw new RejectedExecutionException(this.f3755n + " queue is full, size=" + this.J2.size());
        }
        int size = this.J2.size();
        int i2 = this.f3754Z.get();
        if (size > i2 && this.f3754Z.compareAndSet(i2, size)) {
            Dzy.j.ck(f3752S, "%s: max pending work in queue = %d", this.f3755n, Integer.valueOf(size));
        }
        U();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        throw new UnsupportedOperationException();
    }

    public n(String str, int i2, Executor executor, BlockingQueue blockingQueue) {
        if (i2 > 0) {
            this.f3755n = str;
            this.f3758t = executor;
            this.f3753O = i2;
            this.J2 = blockingQueue;
            this.f3757r = new j();
            this.f3756o = new AtomicInteger(0);
            this.f3754Z = new AtomicInteger(0);
            return;
        }
        throw new IllegalArgumentException("max concurrency must be > 0");
    }
}
