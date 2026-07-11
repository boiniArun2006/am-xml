package com.fyber.inneractive.sdk.player.exoplayer2;

import androidx.media3.exoplayer.dash.DashMediaSource;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.l f54690a = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f54691b = ((long) 15000) * 1000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f54692c = ((long) 30000) * 1000;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f54693d = 2500000;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f54694e = DashMediaSource.MIN_LIVE_DEFAULT_START_POSITION_US;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f54695f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f54696g;

    public final void a(boolean z2) {
        this.f54695f = 0;
        this.f54696g = false;
        if (z2) {
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.l lVar = this.f54690a;
            synchronized (lVar) {
                lVar.a(0);
            }
        }
    }
}
