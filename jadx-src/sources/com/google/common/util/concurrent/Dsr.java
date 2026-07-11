package com.google.common.util.concurrent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class Dsr extends C {

    private static final class j implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final Future f59821n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final fuX f59822t;

        @Override // java.lang.Runnable
        public void run() {
            Throwable thN;
            Object obj = this.f59821n;
            if ((obj instanceof dsf.j) && (thN = dsf.n.n((dsf.j) obj)) != null) {
                this.f59822t.onFailure(thN);
                return;
            }
            try {
                this.f59822t.onSuccess(Dsr.rl(this.f59821n));
            } catch (ExecutionException e2) {
                this.f59822t.onFailure(e2.getCause());
            } catch (Throwable th) {
                this.f59822t.onFailure(th);
            }
        }

        j(Future future, fuX fux) {
            this.f59821n = future;
            this.f59822t = fux;
        }

        public String toString() {
            return t1.Dsr.t(this).gh(this.f59822t).toString();
        }
    }

    public static Xo t() {
        return o.f59861t;
    }

    public static void n(Xo xo, fuX fux, Executor executor) {
        t1.Xo.HI(fux);
        xo.addListener(new j(xo, fux), executor);
    }

    public static Object rl(Future future) {
        t1.Xo.aYN(future.isDone(), "Future was expected to be done: %s", future);
        return SPz.n(future);
    }
}
