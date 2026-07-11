package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

import com.fyber.inneractive.sdk.player.exoplayer2.util.z;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class a implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f54720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f54721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f54722c;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final boolean a() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long a(long j2) {
        return this.f54720a[z.a(this.f54721b, j2, true)];
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long c() {
        return this.f54722c;
    }

    public a(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f54720a = jArr;
        this.f54721b = jArr3;
        int length = iArr.length;
        if (length > 0) {
            int i2 = length - 1;
            this.f54722c = jArr2[i2] + jArr3[i2];
        } else {
            this.f54722c = 0L;
        }
    }
}
