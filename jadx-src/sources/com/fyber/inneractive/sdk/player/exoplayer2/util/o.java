package com.fyber.inneractive.sdk.player.exoplayer2.util;

import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f56209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f56210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f56211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f56212d = 0;

    public final boolean a(int i2) {
        int i3 = this.f56211c;
        int i5 = i2 / 8;
        int i7 = i3 + i5;
        int i8 = (this.f56212d + i2) - (i5 * 8);
        if (i8 > 7) {
            i7++;
            i8 -= 8;
        }
        while (true) {
            int i9 = i3 + 1;
            if (i9 > i7 || i7 >= this.f56210b) {
                break;
            }
            if (c(i9)) {
                i7++;
                i3 += 3;
            } else {
                i3 = i9;
            }
        }
        int i10 = this.f56210b;
        if (i7 >= i10) {
            return i7 == i10 && i8 == 0;
        }
        return true;
    }

    public final int b(int i2) {
        int i3;
        this.f56212d += i2;
        int i5 = 0;
        while (true) {
            i3 = this.f56212d;
            if (i3 <= 8) {
                break;
            }
            int i7 = i3 - 8;
            this.f56212d = i7;
            byte[] bArr = this.f56209a;
            int i8 = this.f56211c;
            i5 |= (bArr[i8] & UByte.MAX_VALUE) << i7;
            if (!c(i8 + 1)) {
                i = 1;
            }
            this.f56211c = i8 + i;
        }
        byte[] bArr2 = this.f56209a;
        int i9 = this.f56211c;
        int i10 = ((-1) >>> (32 - i2)) & (i5 | ((bArr2[i9] & UByte.MAX_VALUE) >> (8 - i3)));
        if (i3 == 8) {
            this.f56212d = 0;
            this.f56211c = i9 + (c(i9 + 1) ? 2 : 1);
        }
        a();
        return i10;
    }

    public final boolean c() {
        boolean z2 = (this.f56209a[this.f56211c] & (128 >> this.f56212d)) != 0;
        f();
        return z2;
    }

    public final void d(int i2) {
        int i3 = this.f56211c;
        int i5 = i2 / 8;
        int i7 = i3 + i5;
        this.f56211c = i7;
        int i8 = (i2 - (i5 * 8)) + this.f56212d;
        this.f56212d = i8;
        if (i8 > 7) {
            this.f56211c = i7 + 1;
            this.f56212d = i8 - 8;
        }
        while (true) {
            int i9 = i3 + 1;
            if (i9 > this.f56211c) {
                a();
                return;
            } else if (c(i9)) {
                this.f56211c++;
                i3 += 3;
            } else {
                i3 = i9;
            }
        }
    }

    public final void f() {
        int i2 = this.f56212d + 1;
        this.f56212d = i2;
        if (i2 == 8) {
            this.f56212d = 0;
            int i3 = this.f56211c;
            this.f56211c = i3 + (c(i3 + 1) ? 2 : 1);
        }
        a();
    }

    public o(byte[] bArr, int i2, int i3) {
        this.f56209a = bArr;
        this.f56211c = i2;
        this.f56210b = i3;
        a();
    }

    public final boolean c(int i2) {
        if (2 > i2 || i2 >= this.f56210b) {
            return false;
        }
        byte[] bArr = this.f56209a;
        return bArr[i2] == 3 && bArr[i2 + (-2)] == 0 && bArr[i2 - 1] == 0;
    }

    public final int e() {
        int i2;
        int iD = d();
        if (iD % 2 == 0) {
            i2 = -1;
        } else {
            i2 = 1;
        }
        return ((iD + 1) / 2) * i2;
    }

    public final void a() {
        int i2 = this.f56211c;
        if (i2 >= 0) {
            int i3 = this.f56210b;
            if (i2 < i3) {
                return;
            }
            if (i2 == i3 && this.f56212d == 0) {
                return;
            }
        }
        throw new IllegalStateException();
    }

    public final boolean b() {
        int i2 = this.f56211c;
        int i3 = this.f56212d;
        int i5 = 0;
        while (this.f56211c < this.f56210b && !c()) {
            i5++;
        }
        boolean z2 = this.f56211c == this.f56210b;
        this.f56211c = i2;
        this.f56212d = i3;
        return !z2 && a((i5 * 2) + 1);
    }

    public final int d() {
        int i2 = 0;
        while (!c()) {
            i2++;
        }
        return ((1 << i2) - 1) + (i2 > 0 ? b(i2) : 0);
    }
}
