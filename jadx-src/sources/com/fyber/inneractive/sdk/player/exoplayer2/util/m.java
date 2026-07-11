package com.fyber.inneractive.sdk.player.exoplayer2.util;

import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f56202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f56203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f56204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f56205d;

    public m(byte[] bArr) {
        int length = bArr.length;
        this.f56202a = bArr;
        this.f56205d = length;
    }

    public final int a(int i2) {
        int i3;
        this.f56204c += i2;
        int i5 = 0;
        while (true) {
            i3 = this.f56204c;
            if (i3 <= 8) {
                break;
            }
            int i7 = i3 - 8;
            this.f56204c = i7;
            byte[] bArr = this.f56202a;
            int i8 = this.f56203b;
            this.f56203b = i8 + 1;
            i5 |= (bArr[i8] & UByte.MAX_VALUE) << i7;
        }
        byte[] bArr2 = this.f56202a;
        int i9 = this.f56203b;
        int i10 = ((-1) >>> (32 - i2)) & (i5 | ((bArr2[i9] & UByte.MAX_VALUE) >> (8 - i3)));
        if (i3 == 8) {
            this.f56204c = 0;
            this.f56203b = i9 + 1;
        }
        a();
        return i10;
    }

    public final void b(int i2) {
        int i3 = i2 / 8;
        this.f56203b = i3;
        this.f56204c = i2 - (i3 * 8);
        a();
    }

    public final void c(int i2) {
        int i3 = i2 / 8;
        int i5 = this.f56203b + i3;
        this.f56203b = i5;
        int i7 = (i2 - (i3 * 8)) + this.f56204c;
        this.f56204c = i7;
        if (i7 > 7) {
            this.f56203b = i5 + 1;
            this.f56204c = i7 - 8;
        }
        a();
    }

    public final boolean b() {
        byte[] bArr = this.f56202a;
        int i2 = this.f56203b;
        byte b2 = bArr[i2];
        int i3 = this.f56204c;
        boolean z2 = (b2 & (128 >> i3)) != 0;
        int i5 = i3 + 1;
        this.f56204c = i5;
        if (i5 == 8) {
            this.f56204c = 0;
            this.f56203b = i2 + 1;
        }
        a();
        return z2;
    }

    public final void a() {
        int i2 = this.f56203b;
        if (i2 >= 0) {
            int i3 = this.f56205d;
            if (i2 < i3) {
                return;
            }
            if (i2 == i3 && this.f56204c == 0) {
                return;
            }
        }
        throw new IllegalStateException();
    }
}
