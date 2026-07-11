package com.facebook.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class afx {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Object f52788n;
    private CountDownLatch rl;

    public afx(final Callable callable) {
        Intrinsics.checkNotNullParameter(callable, "callable");
        this.rl = new CountDownLatch(1);
        com.facebook.s4.Z().execute(new FutureTask(new Callable() { // from class: com.facebook.internal.g9s
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return afx.rl(this.f52793n, callable);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void rl(afx this$0, Callable callable) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(callable, "$callable");
        try {
            this$0.f52788n = callable.call();
        } finally {
            CountDownLatch countDownLatch = this$0.rl;
            if (countDownLatch != null) {
                countDownLatch.countDown();
            }
        }
    }
}
