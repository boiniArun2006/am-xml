package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.controller.b0;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f55910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f55911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ f f55912c;

    public e(f fVar, int i2, com.fyber.inneractive.sdk.player.exoplayer2.o oVar, int i3, Object obj, long j2) {
        this.f55912c = fVar;
        this.f55910a = obj;
        this.f55911b = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b0 b0Var = this.f55912c.f55914b;
        com.fyber.inneractive.sdk.player.exoplayer2.b.a(this.f55911b);
        IAlog.a("%s AdaptiveMediaSourceEventListener onDownstreamFormatChanged called.", b0Var.a());
    }
}
