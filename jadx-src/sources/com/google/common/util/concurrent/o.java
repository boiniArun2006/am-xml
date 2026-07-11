package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
class o implements Xo {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Object f59862n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final Xo f59861t = new o(null);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static final Pl f59860O = new Pl(o.class);

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z2) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public Object get() {
        return this.f59862n;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return true;
    }

    @Override // com.google.common.util.concurrent.Xo
    public void addListener(Runnable runnable, Executor executor) {
        t1.Xo.ck(runnable, "Runnable was null.");
        t1.Xo.ck(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e2) {
            f59860O.n().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    @Override // java.util.concurrent.Future
    public Object get(long j2, TimeUnit timeUnit) {
        t1.Xo.HI(timeUnit);
        return get();
    }

    public String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + this.f59862n + "]]";
    }

    o(Object obj) {
        this.f59862n = obj;
    }
}
