package com.facebook.imagepipeline.producers;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class nKK extends Ew implements jl.Ml {
    private final jl.Ml nr;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final jl.I28 f52586t;

    @Override // jl.Ml
    public void O(mz producerContext) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        jl.I28 i28 = this.f52586t;
        if (i28 != null) {
            i28.t(producerContext.M(), producerContext.getId(), producerContext.a());
        }
        jl.Ml ml = this.nr;
        if (ml != null) {
            ml.O(producerContext);
        }
    }

    @Override // jl.Ml
    public void Uo(mz producerContext) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        jl.I28 i28 = this.f52586t;
        if (i28 != null) {
            i28.gh(producerContext.getId());
        }
        jl.Ml ml = this.nr;
        if (ml != null) {
            ml.Uo(producerContext);
        }
    }

    @Override // jl.Ml
    public void n(mz producerContext) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        jl.I28 i28 = this.f52586t;
        if (i28 != null) {
            i28.n(producerContext.M(), producerContext.n(), producerContext.getId(), producerContext.a());
        }
        jl.Ml ml = this.nr;
        if (ml != null) {
            ml.n(producerContext);
        }
    }

    @Override // jl.Ml
    public void xMQ(mz producerContext, Throwable th) {
        Intrinsics.checkNotNullParameter(producerContext, "producerContext");
        jl.I28 i28 = this.f52586t;
        if (i28 != null) {
            i28.xMQ(producerContext.M(), producerContext.getId(), th, producerContext.a());
        }
        jl.Ml ml = this.nr;
        if (ml != null) {
            ml.xMQ(producerContext, th);
        }
    }

    public nKK(jl.I28 i28, jl.Ml ml) {
        super(i28, ml);
        this.f52586t = i28;
        this.nr = ml;
    }
}
