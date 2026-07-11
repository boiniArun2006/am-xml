package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.controller.b0;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f55884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f55885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f55886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f55887d;

    public a(f fVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar, int i2, int i3, com.fyber.inneractive.sdk.player.exoplayer2.o oVar, int i5, Object obj, long j2, long j3, long j4) {
        this.f55887d = fVar;
        this.f55884a = obj;
        this.f55885b = j2;
        this.f55886c = j3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b0 b0Var = this.f55887d.f55914b;
        com.fyber.inneractive.sdk.player.exoplayer2.b.a(this.f55885b);
        f.a(this.f55887d, this.f55886c);
        IAlog.a("%s AdaptiveMediaSourceEventListener onLoadStarted called.", b0Var.a());
    }
}
