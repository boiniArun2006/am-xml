package com.fyber.inneractive.sdk.player.exoplayer2.util;

import java.nio.charset.Charset;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f56206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f56207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f56208c;

    public n() {
    }

    public final int a() {
        byte[] bArr = this.f56206a;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    public final int b() {
        byte[] bArr = this.f56206a;
        int i2 = this.f56207b;
        int i3 = i2 + 1;
        this.f56207b = i3;
        int i5 = (bArr[i2] & UByte.MAX_VALUE) << 24;
        int i7 = i2 + 2;
        this.f56207b = i7;
        int i8 = ((bArr[i3] & UByte.MAX_VALUE) << 16) | i5;
        int i9 = i2 + 3;
        this.f56207b = i9;
        int i10 = i8 | ((bArr[i7] & UByte.MAX_VALUE) << 8);
        this.f56207b = i2 + 4;
        return (bArr[i9] & UByte.MAX_VALUE) | i10;
    }

    public final void c(int i2) {
        this.f56206a = a() < i2 ? new byte[i2] : this.f56206a;
        this.f56208c = i2;
        this.f56207b = 0;
    }

    public final void d(int i2) {
        if (i2 < 0 || i2 > this.f56206a.length) {
            throw new IllegalArgumentException();
        }
        this.f56208c = i2;
    }

    public final void e(int i2) {
        if (i2 < 0 || i2 > this.f56208c) {
            throw new IllegalArgumentException();
        }
        this.f56207b = i2;
    }

    public n(int i2) {
        this.f56206a = new byte[i2];
        this.f56208c = i2;
    }

    public final void a(byte[] bArr, int i2, int i3) {
        System.arraycopy(this.f56206a, this.f56207b, bArr, i2, i3);
        this.f56207b += i3;
    }

    public final String b(int i2) {
        String str = new String(this.f56206a, this.f56207b, i2, Charset.defaultCharset());
        this.f56207b += i2;
        return str;
    }

    public final int f() {
        byte[] bArr = this.f56206a;
        int i2 = this.f56207b;
        int i3 = i2 + 1;
        this.f56207b = i3;
        int i5 = bArr[i2] & UByte.MAX_VALUE;
        this.f56207b = i2 + 2;
        return ((bArr[i3] & UByte.MAX_VALUE) << 8) | i5;
    }

    public final long g() {
        byte[] bArr = this.f56206a;
        int i2 = this.f56207b;
        int i3 = i2 + 1;
        this.f56207b = i3;
        long j2 = (((long) bArr[i2]) & 255) << 56;
        int i5 = i2 + 2;
        this.f56207b = i5;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 48);
        int i7 = i2 + 3;
        this.f56207b = i7;
        long j4 = j3 | ((((long) bArr[i5]) & 255) << 40);
        int i8 = i2 + 4;
        this.f56207b = i8;
        long j5 = j4 | ((((long) bArr[i7]) & 255) << 32);
        int i9 = i2 + 5;
        this.f56207b = i9;
        long j6 = j5 | ((((long) bArr[i8]) & 255) << 24);
        int i10 = i2 + 6;
        this.f56207b = i10;
        long j7 = j6 | ((((long) bArr[i9]) & 255) << 16);
        int i11 = i2 + 7;
        this.f56207b = i11;
        long j9 = j7 | ((((long) bArr[i10]) & 255) << 8);
        this.f56207b = i2 + 8;
        return (((long) bArr[i11]) & 255) | j9;
    }

    public final void h() {
        int i2 = this.f56208c;
        int i3 = this.f56207b;
        if (i2 - i3 == 0) {
            return;
        }
        while (i3 < this.f56208c && this.f56206a[i3] != 0) {
            i3++;
        }
        byte[] bArr = this.f56206a;
        int i5 = this.f56207b;
        new String(bArr, i5, i3 - i5);
        this.f56207b = i3;
        if (i3 < this.f56208c) {
            this.f56207b = i3 + 1;
        }
    }

    public final int j() {
        byte[] bArr = this.f56206a;
        int i2 = this.f56207b;
        this.f56207b = i2 + 1;
        return bArr[i2] & UByte.MAX_VALUE;
    }

    public final long k() {
        byte[] bArr = this.f56206a;
        int i2 = this.f56207b;
        int i3 = i2 + 1;
        this.f56207b = i3;
        long j2 = (((long) bArr[i2]) & 255) << 24;
        int i5 = i2 + 2;
        this.f56207b = i5;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 16);
        int i7 = i2 + 3;
        this.f56207b = i7;
        long j4 = j3 | ((((long) bArr[i5]) & 255) << 8);
        this.f56207b = i2 + 4;
        return (((long) bArr[i7]) & 255) | j4;
    }

    public final int l() {
        byte[] bArr = this.f56206a;
        int i2 = this.f56207b;
        int i3 = i2 + 1;
        this.f56207b = i3;
        int i5 = (bArr[i2] & UByte.MAX_VALUE) << 16;
        int i7 = i2 + 2;
        this.f56207b = i7;
        int i8 = ((bArr[i3] & UByte.MAX_VALUE) << 8) | i5;
        this.f56207b = i2 + 3;
        return (bArr[i7] & UByte.MAX_VALUE) | i8;
    }

    public final int o() {
        byte[] bArr = this.f56206a;
        int i2 = this.f56207b;
        int i3 = i2 + 1;
        this.f56207b = i3;
        int i5 = (bArr[i2] & UByte.MAX_VALUE) << 8;
        this.f56207b = i2 + 2;
        return (bArr[i3] & UByte.MAX_VALUE) | i5;
    }

    public final int i() {
        return (j() << 21) | (j() << 14) | (j() << 7) | j();
    }

    public final int m() {
        int iB = b();
        if (iB >= 0) {
            return iB;
        }
        throw new IllegalStateException(com.fyber.inneractive.sdk.player.exoplayer2.m.a("Top bit not zero: ", iB));
    }

    public final long n() {
        long jG = g();
        if (jG >= 0) {
            return jG;
        }
        throw new IllegalStateException("Top bit not zero: " + jG);
    }

    public final String a(int i2) {
        if (i2 == 0) {
            return "";
        }
        int i3 = this.f56207b;
        int i5 = (i3 + i2) - 1;
        String str = new String(this.f56206a, i3, (i5 >= this.f56208c || this.f56206a[i5] != 0) ? i2 : i2 - 1);
        this.f56207b += i2;
        return str;
    }

    public final int d() {
        byte[] bArr = this.f56206a;
        int i2 = this.f56207b;
        int i3 = i2 + 1;
        this.f56207b = i3;
        int i5 = bArr[i2] & UByte.MAX_VALUE;
        int i7 = i2 + 2;
        this.f56207b = i7;
        int i8 = ((bArr[i3] & UByte.MAX_VALUE) << 8) | i5;
        int i9 = i2 + 3;
        this.f56207b = i9;
        int i10 = i8 | ((bArr[i7] & UByte.MAX_VALUE) << 16);
        this.f56207b = i2 + 4;
        return ((bArr[i9] & UByte.MAX_VALUE) << 24) | i10;
    }

    public final long e() {
        byte[] bArr = this.f56206a;
        int i2 = this.f56207b;
        int i3 = i2 + 1;
        this.f56207b = i3;
        long j2 = ((long) bArr[i2]) & 255;
        int i5 = i2 + 2;
        this.f56207b = i5;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 8);
        int i7 = i2 + 3;
        this.f56207b = i7;
        long j4 = j3 | ((((long) bArr[i5]) & 255) << 16);
        this.f56207b = i2 + 4;
        return ((((long) bArr[i7]) & 255) << 24) | j4;
    }

    public n(byte[] bArr) {
        this.f56206a = bArr;
        this.f56208c = bArr.length;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String c() {
        int i2 = this.f56208c;
        int i3 = this.f56207b;
        if (i2 - i3 == 0) {
            return null;
        }
        while (i3 < this.f56208c) {
            byte b2 = this.f56206a[i3];
            int i5 = z.f56234a;
            if (b2 == 10 || b2 == 13) {
                break;
            }
            i3++;
        }
        int i7 = this.f56207b;
        if (i3 - i7 >= 3) {
            byte[] bArr = this.f56206a;
            if (bArr[i7] == -17 && bArr[i7 + 1] == -69 && bArr[i7 + 2] == -65) {
                this.f56207b = i7 + 3;
            }
        }
        byte[] bArr2 = this.f56206a;
        int i8 = this.f56207b;
        String str = new String(bArr2, i8, i3 - i8);
        this.f56207b = i3;
        int i9 = this.f56208c;
        if (i3 != i9) {
            byte[] bArr3 = this.f56206a;
            if (bArr3[i3] == 13) {
                int i10 = i3 + 1;
                this.f56207b = i10;
                if (i10 != i9) {
                    int i11 = this.f56207b;
                    if (bArr3[i11] == 10) {
                        this.f56207b = i11 + 1;
                    }
                }
            }
        }
        return str;
    }

    public n(int i2, byte[] bArr) {
        this.f56206a = bArr;
        this.f56208c = i2;
    }
}
