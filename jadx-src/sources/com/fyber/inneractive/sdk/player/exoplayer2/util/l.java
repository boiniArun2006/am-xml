package com.fyber.inneractive.sdk.player.exoplayer2.util;

import android.util.Log;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f56198a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float[] f56199b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f56200c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int[] f56201d = new int[10];

    public static int a(int i2, byte[] bArr) {
        int i3;
        synchronized (f56200c) {
            int i5 = 0;
            int i7 = 0;
            while (i5 < i2) {
                while (true) {
                    if (i5 >= i2 - 2) {
                        i5 = i2;
                        break;
                    }
                    try {
                        if (bArr[i5] == 0 && bArr[i5 + 1] == 0 && bArr[i5 + 2] == 3) {
                            break;
                        }
                        i5++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i5 < i2) {
                    int[] iArr = f56201d;
                    if (iArr.length <= i7) {
                        f56201d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f56201d[i7] = i5;
                    i5 += 3;
                    i7++;
                }
            }
            i3 = i2 - i7;
            int i8 = 0;
            int i9 = 0;
            for (int i10 = 0; i10 < i7; i10++) {
                int i11 = f56201d[i10] - i9;
                System.arraycopy(bArr, i9, bArr, i8, i11);
                int i12 = i8 + i11;
                int i13 = i12 + 1;
                bArr[i12] = 0;
                i8 = i12 + 2;
                bArr[i13] = 0;
                i9 += i11 + 3;
            }
            System.arraycopy(bArr, i9, bArr, i8, i3 - i8);
        }
        return i3;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0169  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static k a(byte[] bArr, int i2, int i3) {
        int iD;
        boolean z2;
        boolean z3;
        int iD2;
        boolean z4;
        boolean zC2;
        float f3;
        o oVar = new o(bArr, i2, i3);
        oVar.d(8);
        int iB = oVar.b(8);
        oVar.d(16);
        int iD3 = oVar.d();
        if (iB == 100 || iB == 110 || iB == 122 || iB == 244 || iB == 44 || iB == 83 || iB == 86 || iB == 118 || iB == 128 || iB == 138) {
            iD = oVar.d();
            boolean zC3 = iD == 3 ? oVar.c() : false;
            oVar.d();
            oVar.d();
            oVar.f();
            if (oVar.c()) {
                int i5 = iD != 3 ? 8 : 12;
                int i7 = 0;
                while (i7 < i5) {
                    if (oVar.c()) {
                        int i8 = i7 < 6 ? 16 : 64;
                        int iE = 8;
                        int i9 = 8;
                        for (int i10 = 0; i10 < i8; i10++) {
                            if (iE != 0) {
                                iE = ((oVar.e() + i9) + 256) % 256;
                            }
                            if (iE != 0) {
                                i9 = iE;
                            }
                        }
                    }
                    i7++;
                }
            }
            z2 = zC3;
        } else {
            iD = 1;
            z2 = false;
        }
        int iD4 = oVar.d() + 4;
        int iD5 = oVar.d();
        if (iD5 == 0) {
            iD2 = oVar.d() + 4;
            z3 = z2;
        } else {
            if (iD5 == 1) {
                boolean zC4 = oVar.c();
                oVar.e();
                oVar.e();
                long jD = oVar.d();
                z3 = z2;
                for (int i11 = 0; i11 < jD; i11++) {
                    oVar.d();
                }
                z4 = zC4;
                iD2 = 0;
                oVar.d();
                oVar.f();
                int iD6 = oVar.d() + 1;
                int iD7 = oVar.d() + 1;
                zC2 = oVar.c();
                int i12 = 2 - (zC2 ? 1 : 0);
                int i13 = iD7 * i12;
                if (!zC2) {
                    oVar.f();
                }
                oVar.f();
                int i14 = iD6 * 16;
                int i15 = i13 * 16;
                if (oVar.c()) {
                    int iD8 = oVar.d();
                    int iD9 = oVar.d();
                    int iD10 = oVar.d();
                    int iD11 = oVar.d();
                    if (iD != 0) {
                        int i16 = iD == 3 ? 1 : 2;
                        i12 *= iD == 1 ? 2 : 1;
                        i = i16;
                    }
                    i14 -= (iD8 + iD9) * i;
                    i15 -= (iD10 + iD11) * i12;
                }
                int i17 = i14;
                int i18 = i15;
                if (oVar.c() || !oVar.c()) {
                    f3 = 1.0f;
                } else {
                    int iB2 = oVar.b(8);
                    if (iB2 == 255) {
                        int iB3 = oVar.b(16);
                        int iB4 = oVar.b(16);
                        if (iB3 != 0 && iB4 != 0) {
                            f3 = iB3 / iB4;
                        }
                    } else {
                        float[] fArr = f56199b;
                        if (iB2 < 17) {
                            f3 = fArr[iB2];
                        } else {
                            Log.w("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + iB2);
                            f3 = 1.0f;
                        }
                    }
                }
                return new k(iD3, i17, i18, f3, z3, zC2, iD4, iD5, iD2, z4);
            }
            z3 = z2;
            iD2 = 0;
        }
        z4 = false;
        oVar.d();
        oVar.f();
        int iD62 = oVar.d() + 1;
        int iD72 = oVar.d() + 1;
        zC2 = oVar.c();
        int i122 = 2 - (zC2 ? 1 : 0);
        int i132 = iD72 * i122;
        if (!zC2) {
        }
        oVar.f();
        int i142 = iD62 * 16;
        int i152 = i132 * 16;
        if (oVar.c()) {
        }
        int i172 = i142;
        int i182 = i152;
        if (oVar.c()) {
            f3 = 1.0f;
        }
        return new k(iD3, i172, i182, f3, z3, zC2, iD4, iD5, iD2, z4);
    }

    public static int a(byte[] bArr, int i2, int i3, boolean[] zArr) {
        int i5 = i3 - i2;
        if (i5 < 0) {
            throw new IllegalStateException();
        }
        if (i5 == 0) {
            return i3;
        }
        if (zArr[0]) {
            a(zArr);
            return i2 - 3;
        }
        if (i5 > 1 && zArr[1] && bArr[i2] == 1) {
            a(zArr);
            return i2 - 2;
        }
        if (i5 > 2 && zArr[2] && bArr[i2] == 0 && bArr[i2 + 1] == 1) {
            a(zArr);
            return i2 - 1;
        }
        int i7 = i3 - 1;
        int i8 = i2 + 2;
        while (i8 < i7) {
            byte b2 = bArr[i8];
            if ((b2 & 254) == 0) {
                int i9 = i8 - 2;
                if (bArr[i9] == 0 && bArr[i8 - 1] == 0 && b2 == 1) {
                    a(zArr);
                    return i9;
                }
                i8 -= 2;
            }
            i8 += 3;
        }
        zArr[0] = i5 <= 2 ? !(i5 != 2 ? !(zArr[1] && bArr[i7] == 1) : !(zArr[2] && bArr[i3 + (-2)] == 0 && bArr[i7] == 1)) : bArr[i3 + (-3)] == 0 && bArr[i3 + (-2)] == 0 && bArr[i7] == 1;
        zArr[1] = i5 <= 1 ? zArr[2] && bArr[i7] == 0 : bArr[i3 + (-2)] == 0 && bArr[i7] == 0;
        zArr[2] = bArr[i7] == 0;
        return i3;
    }

    public static void a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }
}
