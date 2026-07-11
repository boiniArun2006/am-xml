package JWp;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.Semaphore;
import uOq.ci;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
class o implements Executor {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final LinkedBlockingQueue f4585O = new LinkedBlockingQueue();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Executor f4586n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Semaphore f4587t;

    private Runnable rl(final Runnable runnable) {
        return new Runnable() { // from class: JWp.C
            @Override // java.lang.Runnable
            public final void run() {
                o.n(this.f4578n, runnable);
            }
        };
    }

    private void t() {
        while (this.f4587t.tryAcquire()) {
            Runnable runnable = (Runnable) this.f4585O.poll();
            if (runnable == null) {
                this.f4587t.release();
                return;
            }
            this.f4586n.execute(rl(runnable));
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f4585O.offer(runnable);
        t();
    }

    o(Executor executor, int i2) {
        boolean z2;
        if (i2 > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        ci.n(z2, "concurrency must be positive.");
        this.f4586n = executor;
        this.f4587t = new Semaphore(i2, true);
    }

    public static /* synthetic */ void n(o oVar, Runnable runnable) {
        oVar.getClass();
        try {
            runnable.run();
        } finally {
            oVar.f4587t.release();
            oVar.t();
        }
    }
}
