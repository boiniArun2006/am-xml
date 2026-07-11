package io.grpc.internal;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
class Ogx implements Executor {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final Logger f68349O = Logger.getLogger(Ogx.class.getName());

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f68350n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ArrayDeque f68351t;

    private void n() {
        while (true) {
            Runnable runnable = (Runnable) this.f68351t.poll();
            if (runnable == null) {
                return;
            }
            try {
                runnable.run();
            } catch (Throwable th) {
                f68349O.log(Level.SEVERE, "Exception while executing runnable " + runnable, th);
            }
        }
    }

    private void rl(Runnable runnable) {
        if (this.f68351t == null) {
            this.f68351t = new ArrayDeque(4);
        }
        this.f68351t.add(runnable);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        t1.Xo.ck(runnable, "'task' must not be null.");
        if (this.f68350n) {
            rl(runnable);
            return;
        }
        this.f68350n = true;
        try {
            runnable.run();
        } catch (Throwable th) {
            try {
                f68349O.log(Level.SEVERE, "Exception while executing runnable " + runnable, th);
                if (this.f68351t != null) {
                }
            } finally {
                if (this.f68351t != null) {
                    n();
                }
                this.f68350n = false;
            }
        }
    }

    Ogx() {
    }
}
