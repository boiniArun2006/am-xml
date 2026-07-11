package com.fyber.inneractive.sdk.player.exoplayer2.util;

import android.os.SystemClock;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class u implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f56226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f56227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f56228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.s f56229d = com.fyber.inneractive.sdk.player.exoplayer2.s.f55880d;

    public final void a(long j2) {
        this.f56227b = j2;
        if (this.f56226a) {
            this.f56228c = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.util.h
    public final long b() {
        long j2 = this.f56227b;
        if (!this.f56226a) {
            return j2;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f56228c;
        com.fyber.inneractive.sdk.player.exoplayer2.s sVar = this.f56229d;
        if (sVar.f55881a != 1.0f) {
            return (jElapsedRealtime * ((long) sVar.f55883c)) + j2;
        }
        int i2 = com.fyber.inneractive.sdk.player.exoplayer2.b.f54688a;
        return (jElapsedRealtime != -9223372036854775807L ? 1000 * jElapsedRealtime : -9223372036854775807L) + j2;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.util.h
    public final com.fyber.inneractive.sdk.player.exoplayer2.s a(com.fyber.inneractive.sdk.player.exoplayer2.s sVar) {
        if (this.f56226a) {
            a(b());
        }
        this.f56229d = sVar;
        return sVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.util.h
    public final com.fyber.inneractive.sdk.player.exoplayer2.s a() {
        return this.f56229d;
    }
}
