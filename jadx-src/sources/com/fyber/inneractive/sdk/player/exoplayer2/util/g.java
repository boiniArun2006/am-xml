package com.fyber.inneractive.sdk.player.exoplayer2.util;

import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f56184a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f56185b = new long[32];

    public final void a(long j2) {
        int i2 = this.f56184a;
        long[] jArr = this.f56185b;
        if (i2 == jArr.length) {
            this.f56185b = Arrays.copyOf(jArr, i2 * 2);
        }
        long[] jArr2 = this.f56185b;
        int i3 = this.f56184a;
        this.f56184a = i3 + 1;
        jArr2[i3] = j2;
    }
}
