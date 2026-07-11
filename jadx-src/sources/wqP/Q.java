package wqP;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
class Q implements Executor {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Executor f75110n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Semaphore f75111t;

    @Override // java.util.concurrent.Executor
    public void execute(final Runnable runnable) {
        if (!this.f75111t.tryAcquire()) {
            runnable.run();
            return;
        }
        try {
            this.f75110n.execute(new Runnable() { // from class: wqP.UGc
                @Override // java.lang.Runnable
                public final void run() {
                    Q.n(this.f75118n, runnable);
                }
            });
        } catch (RejectedExecutionException unused) {
            runnable.run();
        }
    }

    Q(int i2, Executor executor) {
        this.f75111t = new Semaphore(i2);
        this.f75110n = executor;
    }

    public static /* synthetic */ void n(Q q2, Runnable runnable) {
        q2.getClass();
        runnable.run();
        q2.f75111t.release();
    }
}
