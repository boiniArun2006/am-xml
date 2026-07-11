package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f55409a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f55410b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f55411c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f55412d;

    public final boolean a() {
        boolean z2 = (((this.f55409a[this.f55411c] & UByte.MAX_VALUE) >> this.f55412d) & 1) == 1;
        b(1);
        return z2;
    }

    public final void b(int i2) {
        int i3 = i2 / 8;
        int i5 = this.f55411c + i3;
        this.f55411c = i5;
        int i7 = (i2 - (i3 * 8)) + this.f55412d;
        this.f55412d = i7;
        if (i7 > 7) {
            this.f55411c = i5 + 1;
            this.f55412d = i7 - 8;
        }
        int i8 = this.f55411c;
        if (i8 >= 0) {
            int i9 = this.f55410b;
            if (i8 < i9) {
                return;
            }
            if (i8 == i9 && this.f55412d == 0) {
                return;
            }
        }
        throw new IllegalStateException();
    }

    public m(byte[] bArr) {
        this.f55409a = bArr;
        this.f55410b = bArr.length;
    }

    public final int a(int i2) {
        int i3 = this.f55411c;
        int iMin = Math.min(i2, 8 - this.f55412d);
        int i5 = i3 + 1;
        int i7 = ((this.f55409a[i3] & UByte.MAX_VALUE) >> this.f55412d) & (255 >> (8 - iMin));
        while (iMin < i2) {
            i7 |= (this.f55409a[i5] & UByte.MAX_VALUE) << iMin;
            iMin += 8;
            i5++;
        }
        int i8 = i7 & ((-1) >>> (32 - i2));
        b(i2);
        return i8;
    }
}
