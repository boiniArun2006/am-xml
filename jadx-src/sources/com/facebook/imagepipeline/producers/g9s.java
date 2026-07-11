package com.facebook.imagepipeline.producers;

import YgZ.uQga.IYJfqUyym;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class g9s implements M5 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Executor f52560n;

    @Override // com.facebook.imagepipeline.producers.M5
    public void n(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
    }

    @Override // com.facebook.imagepipeline.producers.M5
    public void rl(Runnable runnable) {
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.f52560n.execute(runnable);
    }

    public g9s(Executor executor) {
        if (executor != null) {
            this.f52560n = executor;
            return;
        }
        throw new IllegalStateException(IYJfqUyym.qUqzenFibkw);
    }
}
