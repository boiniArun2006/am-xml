package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f55336a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f55337b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int[] f55338c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f55339d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long[] f55340e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int[] f55341f;

    public v(long[] jArr, int[] iArr, int i2, long[] jArr2, int[] iArr2) {
        if (iArr.length == jArr2.length) {
            if (jArr.length == jArr2.length) {
                if (iArr2.length == jArr2.length) {
                    this.f55337b = jArr;
                    this.f55338c = iArr;
                    this.f55339d = i2;
                    this.f55340e = jArr2;
                    this.f55341f = iArr2;
                    this.f55336a = jArr.length;
                    return;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }
}
