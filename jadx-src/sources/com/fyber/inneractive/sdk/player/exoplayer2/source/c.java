package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.controller.b0;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f55892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f55893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f55894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f55895d;

    public c(f fVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar, int i2, int i3, com.fyber.inneractive.sdk.player.exoplayer2.o oVar, int i5, Object obj, long j2, long j3, long j4, long j5, long j6) {
        this.f55895d = fVar;
        this.f55892a = obj;
        this.f55893b = j2;
        this.f55894c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b0 b0Var = this.f55895d.f55914b;
        com.fyber.inneractive.sdk.player.exoplayer2.b.a(this.f55893b);
        f.a(this.f55895d, this.f55894c);
        IAlog.a("%s AdaptiveMediaSourceEventListener onLoadCanceled called.", b0Var.a());
    }
}
