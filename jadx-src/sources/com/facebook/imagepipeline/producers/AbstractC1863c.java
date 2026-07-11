package com.facebook.imagepipeline.producers;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.facebook.imagepipeline.producers.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class AbstractC1863c extends w6 {
    private final Pl rl;

    public AbstractC1863c(Pl consumer) {
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        this.rl = consumer;
    }

    public final Pl HI() {
        return this.rl;
    }

    @Override // com.facebook.imagepipeline.producers.w6
    protected void J2() {
        this.rl.n();
    }

    @Override // com.facebook.imagepipeline.producers.w6
    protected void Uo(Throwable t3) {
        Intrinsics.checkNotNullParameter(t3, "t");
        this.rl.onFailure(t3);
    }

    @Override // com.facebook.imagepipeline.producers.w6
    protected void xMQ(float f3) {
        this.rl.t(f3);
    }
}
