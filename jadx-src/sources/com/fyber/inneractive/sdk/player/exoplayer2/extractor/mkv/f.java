package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mkv;

import com.fyber.inneractive.sdk.player.exoplayer2.util.n;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f55091a = new n(8);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f55092b;

    public final long a(com.fyber.inneractive.sdk.player.exoplayer2.extractor.b bVar) {
        int i2 = 0;
        bVar.a(this.f55091a.f56206a, 0, 1, false);
        int i3 = this.f55091a.f56206a[0] & UByte.MAX_VALUE;
        if (i3 == 0) {
            return Long.MIN_VALUE;
        }
        int i5 = 128;
        int i7 = 0;
        while ((i3 & i5) == 0) {
            i5 >>= 1;
            i7++;
        }
        int i8 = i3 & (~i5);
        bVar.a(this.f55091a.f56206a, 1, i7, false);
        while (i2 < i7) {
            i2++;
            i8 = (this.f55091a.f56206a[i2] & UByte.MAX_VALUE) + (i8 << 8);
        }
        this.f55092b = i7 + 1 + this.f55092b;
        return i8;
    }
}
