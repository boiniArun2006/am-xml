package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3;

import com.fyber.inneractive.sdk.player.exoplayer2.util.z;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f55097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f55098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f55099c;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final boolean a() {
        return this.f55099c != -9223372036854775807L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long a(long j2) {
        long j3 = this.f55099c;
        if (j3 == -9223372036854775807L) {
            return 0L;
        }
        int i2 = z.f56234a;
        long jMax = Math.max(0L, Math.min(j2, j3));
        return ((jMax * ((long) this.f55098b)) / 8000000) + this.f55097a;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b
    public final long b(long j2) {
        return (Math.max(0L, j2 - this.f55097a) * 8000000) / ((long) this.f55098b);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long c() {
        return this.f55099c;
    }

    public a(int i2, long j2, long j3) {
        long jB;
        this.f55097a = j2;
        this.f55098b = i2;
        if (j3 == -1) {
            jB = -9223372036854775807L;
        } else {
            jB = b(j3);
        }
        this.f55099c = jB;
    }
}
