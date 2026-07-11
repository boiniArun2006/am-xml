package com.google.firebase.storage;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class Z {
    private static Executor J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static Executor f60864O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static Z f60865n = new Z();
    private static Executor nr;
    private static Executor rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static Executor f60866t;

    public static void nr(Executor executor, Executor executor2) {
        rl = JWp.aC.rl(executor, 5);
        nr = JWp.aC.rl(executor, 3);
        f60866t = JWp.aC.rl(executor, 2);
        f60864O = JWp.aC.t(executor);
        J2 = executor2;
    }

    public static Z rl() {
        return f60865n;
    }

    public void J2(Runnable runnable) {
        rl.execute(runnable);
    }

    public void KN(Runnable runnable) {
        f60866t.execute(runnable);
    }

    public void O(Runnable runnable) {
        f60864O.execute(runnable);
    }

    public void Uo(Runnable runnable) {
        nr.execute(runnable);
    }

    public Executor n() {
        return rl;
    }

    public Executor t() {
        return J2;
    }
}
