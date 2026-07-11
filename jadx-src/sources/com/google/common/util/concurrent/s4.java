package com.google.common.util.concurrent;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
abstract class s4 {
    static void n(Throwable th) {
        t1.Xo.HI(th);
        if (th instanceof InterruptedException) {
            Thread.currentThread().interrupt();
        }
    }
}
