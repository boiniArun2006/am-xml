package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.controller.b0;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f55905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f55906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f55907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ IOException f55908d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f f55909e;

    public d(f fVar, com.fyber.inneractive.sdk.player.exoplayer2.upstream.k kVar, int i2, int i3, com.fyber.inneractive.sdk.player.exoplayer2.o oVar, int i5, Object obj, long j2, long j3, long j4, long j5, long j6, IOException iOException, boolean z2) {
        this.f55909e = fVar;
        this.f55905a = obj;
        this.f55906b = j2;
        this.f55907c = j3;
        this.f55908d = iOException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b0 b0Var = this.f55909e.f55914b;
        com.fyber.inneractive.sdk.player.exoplayer2.b.a(this.f55906b);
        f.a(this.f55909e, this.f55907c);
        IAlog.a("%s AdaptiveMediaSourceEventListener onLoadError called. with exception %s", b0Var.a(), this.f55908d);
    }
}
