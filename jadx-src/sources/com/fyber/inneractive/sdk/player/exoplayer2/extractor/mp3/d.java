package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3;

import com.fyber.inneractive.sdk.player.exoplayer2.util.z;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f55115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f55116b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f55117c;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final boolean a() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long a(long j2) {
        return this.f55116b[z.a(this.f55115a, j2, true)];
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b
    public final long b(long j2) {
        return this.f55115a[z.a(this.f55116b, j2, true)];
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long c() {
        return this.f55117c;
    }

    public d(long[] jArr, long[] jArr2, long j2) {
        this.f55115a = jArr;
        this.f55116b = jArr2;
        this.f55117c = j2;
    }
}
