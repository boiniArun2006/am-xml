package wqP;

import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class aC implements Executor {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Semaphore f75125n = new Semaphore(0);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f75126t = 0;

    @Override // java.util.concurrent.Executor
    public void execute(final Runnable runnable) {
        this.f75126t++;
        qz.f75138t.execute(new Runnable() { // from class: wqP.Dsr
            @Override // java.lang.Runnable
            public final void run() {
                aC.n(this.f75082n, runnable);
            }
        });
    }

    public void rl() {
        try {
            this.f75125n.acquire(this.f75126t);
            this.f75126t = 0;
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            n.n("Interrupted while waiting for background task", e2);
        }
    }

    public static /* synthetic */ void n(aC aCVar, Runnable runnable) {
        aCVar.getClass();
        runnable.run();
        aCVar.f75125n.release();
    }
}
