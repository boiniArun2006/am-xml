package io.grpc.internal;

import JP.M;
import io.grpc.internal.aC;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: renamed from: io.grpc.internal.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class C2175o implements g9 {
    private static final Logger J2 = Logger.getLogger(C2175o.class.getName());

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private M.Ml f68641O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ScheduledExecutorService f68642n;
    private aC nr;
    private final JP.M rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final aC.j f68643t;

    public static /* synthetic */ void rl(C2175o c2175o) {
        M.Ml ml = c2175o.f68641O;
        if (ml != null && ml.rl()) {
            c2175o.f68641O.n();
        }
        c2175o.nr = null;
    }

    @Override // io.grpc.internal.g9
    public void n(Runnable runnable) {
        this.rl.O();
        if (this.nr == null) {
            this.nr = this.f68643t.get();
        }
        M.Ml ml = this.f68641O;
        if (ml == null || !ml.rl()) {
            long jN = this.nr.n();
            this.f68641O = this.rl.t(runnable, jN, TimeUnit.NANOSECONDS, this.f68642n);
            J2.log(Level.FINE, "Scheduling DNS resolution backoff for {0}ns", Long.valueOf(jN));
        }
    }

    @Override // io.grpc.internal.g9
    public void reset() {
        this.rl.O();
        this.rl.execute(new Runnable() { // from class: io.grpc.internal.C
            @Override // java.lang.Runnable
            public final void run() {
                C2175o.rl(this.f68238n);
            }
        });
    }

    C2175o(aC.j jVar, ScheduledExecutorService scheduledExecutorService, JP.M m2) {
        this.f68643t = jVar;
        this.f68642n = scheduledExecutorService;
        this.rl = m2;
    }
}
