package com.google.common.util.concurrent;

import com.google.common.util.concurrent.I28;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
class r extends I28.j implements RunnableFuture {

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private volatile qz f59866S;

    private final class j extends qz {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final Callable f59867O;

        j(Callable callable) {
            this.f59867O = (Callable) t1.Xo.HI(callable);
        }

        @Override // com.google.common.util.concurrent.qz
        String J2() {
            return this.f59867O.toString();
        }

        @Override // com.google.common.util.concurrent.qz
        Object O() {
            return this.f59867O.call();
        }

        @Override // com.google.common.util.concurrent.qz
        void n(Throwable th) {
            r.this.te(th);
        }

        @Override // com.google.common.util.concurrent.qz
        final boolean nr() {
            return r.this.isDone();
        }

        @Override // com.google.common.util.concurrent.qz
        void rl(Object obj) {
            r.this.g(obj);
        }
    }

    static r E2(Runnable runnable, Object obj) {
        return new r(Executors.callable(runnable, obj));
    }

    static r e(Callable callable) {
        return new r(callable);
    }

    @Override // com.google.common.util.concurrent.j
    protected String aYN() {
        qz qzVar = this.f59866S;
        if (qzVar == null) {
            return super.aYN();
        }
        return "task=[" + qzVar + "]";
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
        qz qzVar = this.f59866S;
        if (qzVar != null) {
            qzVar.run();
        }
        this.f59866S = null;
    }

    r(Callable callable) {
        this.f59866S = new j(callable);
    }

    @Override // com.google.common.util.concurrent.j
    protected void az() {
        qz qzVar;
        super.az();
        if (fD() && (qzVar = this.f59866S) != null) {
            qzVar.t();
        }
        this.f59866S = null;
    }
}
