package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3;

import com.fyber.inneractive.sdk.player.exoplayer2.util.z;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class e implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f55118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f55119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f55120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f55121d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f55122e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f55123f;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final boolean a() {
        return this.f55121d != null;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long a(long j2) {
        if (!a()) {
            return this.f55118a;
        }
        float f3 = (j2 * 100.0f) / this.f55119b;
        if (f3 > 0.0f) {
            if (f3 >= 100.0f) {
                f = 256.0f;
            } else {
                int i2 = (int) f3;
                f = i2 != 0 ? this.f55121d[i2 - 1] : 0.0f;
                f += (f3 - i2) * ((i2 < 99 ? this.f55121d[i2] : 256.0f) - f);
            }
        }
        long jRound = Math.round(((double) f) * 0.00390625d * this.f55122e);
        long j3 = this.f55118a;
        long j4 = jRound + j3;
        long j5 = this.f55120c;
        return Math.min(j4, j5 != -1 ? j5 - 1 : ((j3 - ((long) this.f55123f)) + this.f55122e) - 1);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.b
    public final long b(long j2) {
        if (!a()) {
            return 0L;
        }
        if (j2 < this.f55118a) {
            return 0L;
        }
        double d2 = ((j2 - r4) * 256.0d) / this.f55122e;
        int iA = z.a(this.f55121d, (long) d2, false);
        int i2 = iA + 1;
        long j3 = (((long) i2) * this.f55119b) / 100;
        long j4 = i2 == 0 ? 0L : this.f55121d[iA];
        return j3 + ((i2 == 99 ? 256L : this.f55121d[i2]) == j4 ? 0L : (long) (((d2 - j4) * (((r7 * ((long) (iA + 2))) / 100) - j3)) / (r16 - j4)));
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.q
    public final long c() {
        return this.f55119b;
    }

    public e(long j2, long j3, long j4, long[] jArr, long j5, int i2) {
        this.f55118a = j2;
        this.f55119b = j3;
        this.f55120c = j4;
        this.f55121d = jArr;
        this.f55122e = j5;
        this.f55123f = i2;
    }
}
