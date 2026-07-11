package com.facebook.imagepipeline.producers;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class YzO implements M5 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Executor f52522n;
    private boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Deque f52523t;

    @Override // com.facebook.imagepipeline.producers.M5
    public synchronized void n(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.f52523t.remove(runnable);
    }

    @Override // com.facebook.imagepipeline.producers.M5
    public synchronized void rl(Runnable runnable) {
        try {
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            if (this.rl) {
                this.f52523t.add(runnable);
            } else {
                this.f52522n.execute(runnable);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public YzO(Executor executor) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f52522n = executor;
        this.f52523t = new ArrayDeque();
    }
}
