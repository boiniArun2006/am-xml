package Gs;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class fuX implements Runnable {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected final AtomicInteger f3750n = new AtomicInteger(0);

    protected abstract void J2(Object obj);

    protected abstract void O(Exception exc);

    protected abstract void nr();

    protected abstract void rl(Object obj);

    protected abstract Object t();

    public void n() {
        if (this.f3750n.compareAndSet(0, 2)) {
            nr();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f3750n.compareAndSet(0, 1)) {
            try {
                Object objT = t();
                this.f3750n.set(3);
                try {
                    J2(objT);
                } finally {
                    rl(objT);
                }
            } catch (Exception e2) {
                this.f3750n.set(4);
                O(e2);
            }
        }
    }
}
