package io.grpc.internal;

import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: io.grpc.internal.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class RunnableC2176p implements Runnable {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Logger f68645t = Logger.getLogger(RunnableC2176p.class.getName());

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Runnable f68646n;

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f68646n.run();
        } catch (Throwable th) {
            f68645t.log(Level.SEVERE, "Exception while executing runnable " + this.f68646n, th);
            t1.SPz.J2(th);
            throw new AssertionError(th);
        }
    }

    public String toString() {
        return "LogExceptionRunnable(" + this.f68646n + ")";
    }

    public RunnableC2176p(Runnable runnable) {
        this.f68646n = (Runnable) t1.Xo.ck(runnable, "task");
    }
}
