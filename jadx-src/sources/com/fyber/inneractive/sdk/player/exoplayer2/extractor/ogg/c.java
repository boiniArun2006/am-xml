package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.fyber.inneractive.sdk.player.exoplayer2.util.z;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class c implements h, com.fyber.inneractive.sdk.player.exoplayer2.extractor.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f55370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f55371b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f55372c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f55373d = -1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d f55374e;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final boolean a() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.q b() {
        return this;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h
    public final long c(long j2) {
        long j3 = (((long) this.f55374e.f55404i) * j2) / 1000000;
        this.f55373d = this.f55370a[z.a(this.f55370a, j3, true)];
        return j3;
    }

    public c(d dVar) {
        this.f55374e = dVar;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h
    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        long j2 = this.f55373d;
        if (j2 < 0) {
            return -1L;
        }
        long j3 = -(j2 + 2);
        this.f55373d = -1L;
        return j3;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long a(long j2) {
        return this.f55372c + this.f55371b[z.a(this.f55370a, (((long) this.f55374e.f55404i) * j2) / 1000000, true)];
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long c() {
        com.fyber.inneractive.sdk.player.exoplayer2.util.f fVar = this.f55374e.f55375n;
        return (fVar.f56183d * 1000000) / ((long) fVar.f56180a);
    }
}
