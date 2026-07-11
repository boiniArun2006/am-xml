package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f54653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f54654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f54655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f54656d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f54657e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final short[] f54658f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f54659g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public short[] f54660h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f54661i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public short[] f54662j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f54663k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public short[] f54664l;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f54669q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f54670r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f54671s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f54672t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f54674v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f54675w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f54676x;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f54665m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f54666n = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f54673u = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f54667o = 1.0f;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f54668p = 1.0f;

    public final void a(int i2) {
        int i3 = this.f54669q + i2;
        int i5 = this.f54659g;
        if (i3 > i5) {
            int i7 = (i5 / 2) + i2 + i5;
            this.f54659g = i7;
            this.f54660h = Arrays.copyOf(this.f54660h, i7 * this.f54654b);
        }
    }

    public final void b(int i2) {
        int i3 = this.f54670r + i2;
        int i5 = this.f54661i;
        if (i3 > i5) {
            int i7 = (i5 / 2) + i2 + i5;
            this.f54661i = i7;
            this.f54662j = Arrays.copyOf(this.f54662j, i7 * this.f54654b);
        }
    }

    public w(int i2, int i3) {
        this.f54653a = i2;
        this.f54654b = i3;
        this.f54655c = i2 / Sdk.SDKError.Reason.CONCURRENT_PLAYBACK_UNSUPPORTED_VALUE;
        int i5 = i2 / 65;
        this.f54656d = i5;
        int i7 = i5 * 2;
        this.f54657e = i7;
        this.f54658f = new short[i7];
        this.f54659g = i7;
        int i8 = i3 * i7;
        this.f54660h = new short[i8];
        this.f54661i = i7;
        this.f54662j = new short[i8];
        this.f54663k = i7;
        this.f54664l = new short[i8];
    }

    public final void a(short[] sArr, int i2, int i3) {
        int i5 = this.f54657e / i3;
        int i7 = this.f54654b;
        int i8 = i3 * i7;
        int i9 = i2 * i7;
        for (int i10 = 0; i10 < i5; i10++) {
            int i11 = 0;
            for (int i12 = 0; i12 < i8; i12++) {
                i11 += sArr[(i10 * i8) + i9 + i12];
            }
            this.f54658f[i10] = (short) (i11 / i8);
        }
    }

    public final int a(short[] sArr, int i2, int i3, int i5) {
        int i7 = i2 * this.f54654b;
        int i8 = 255;
        int i9 = 1;
        int i10 = 0;
        int i11 = 0;
        while (i3 <= i5) {
            int i12 = 0;
            for (int i13 = 0; i13 < i3; i13++) {
                short s2 = sArr[i7 + i13];
                short s3 = sArr[i7 + i3 + i13];
                i12 += s2 >= s3 ? s2 - s3 : s3 - s2;
            }
            if (i12 * i10 < i9 * i3) {
                i10 = i3;
                i9 = i12;
            }
            if (i12 * i8 > i11 * i3) {
                i8 = i3;
                i11 = i12;
            }
            i3++;
        }
        this.f54675w = i9 / i10;
        this.f54676x = i11 / i8;
        return i10;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0253 A[LOOP:4: B:13:0x0048->B:103:0x0253, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0175 A[EDGE_INSN: B:113:0x0175->B:65:0x0175 BREAK  A[LOOP:4: B:13:0x0048->B:103:0x0253], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        int iA;
        int i2;
        float f3;
        int i3;
        int iMin;
        int i5;
        int i7;
        float f4;
        int i8;
        int i9;
        int i10 = this.f54670r;
        float f5 = this.f54667o / this.f54668p;
        double d2 = f5;
        float f6 = 1.0f;
        int i11 = 1;
        if (d2 <= 1.00001d && d2 >= 0.99999d) {
            short[] sArr = this.f54660h;
            int i12 = this.f54669q;
            b(i12);
            int i13 = this.f54654b;
            System.arraycopy(sArr, 0, this.f54662j, this.f54670r * i13, i13 * i12);
            this.f54670r += i12;
            this.f54669q = 0;
        } else {
            int i14 = this.f54669q;
            if (i14 >= this.f54657e) {
                int i15 = 0;
                while (true) {
                    int i16 = this.f54672t;
                    if (i16 > 0) {
                        iMin = Math.min(this.f54657e, i16);
                        short[] sArr2 = this.f54660h;
                        b(iMin);
                        int i17 = this.f54654b;
                        System.arraycopy(sArr2, i15 * i17, this.f54662j, this.f54670r * i17, i17 * iMin);
                        this.f54670r += iMin;
                        this.f54672t -= iMin;
                        f3 = f6;
                        i3 = i11;
                    } else {
                        short[] sArr3 = this.f54660h;
                        int i18 = this.f54653a;
                        int i19 = i18 > 4000 ? i18 / Sdk.SDKError.Reason.VUNGLE_OIT_CREATION_ERROR_VALUE : i11;
                        if (this.f54654b == i11 && i19 == i11) {
                            iA = a(sArr3, i15, this.f54655c, this.f54656d);
                        } else {
                            a(sArr3, i15, i19);
                            int iA2 = a(this.f54658f, 0, this.f54655c / i19, this.f54656d / i19);
                            if (i19 != i11) {
                                int i20 = iA2 * i19;
                                int i21 = i19 * 4;
                                int i22 = i20 - i21;
                                int i23 = i20 + i21;
                                int i24 = this.f54655c;
                                if (i22 < i24) {
                                    i22 = i24;
                                }
                                int i25 = this.f54656d;
                                if (i23 > i25) {
                                    i23 = i25;
                                }
                                if (this.f54654b == i11) {
                                    iA = a(sArr3, i15, i22, i23);
                                } else {
                                    a(sArr3, i15, i11);
                                    iA = a(this.f54658f, 0, i22, i23);
                                }
                            } else {
                                iA = iA2;
                            }
                        }
                        int i26 = this.f54675w;
                        int i27 = (i26 == 0 || (i7 = this.f54673u) == 0 || this.f54676x > i26 * 3 || i26 * 2 <= this.f54674v * 3) ? iA : i7;
                        this.f54674v = i26;
                        this.f54673u = iA;
                        if (d2 > 1.0d) {
                            short[] sArr4 = this.f54660h;
                            if (f5 >= 2.0f) {
                                i5 = (int) (i27 / (f5 - f6));
                            } else {
                                this.f54672t = (int) (((2.0f - f5) * i27) / (f5 - f6));
                                i5 = i27;
                            }
                            b(i5);
                            int i28 = i27;
                            a(i5, this.f54654b, this.f54662j, this.f54670r, sArr4, i15, sArr4, i15 + i28);
                            this.f54670r += i5;
                            f3 = f6;
                            i3 = i11;
                            i15 = i28 + i5 + i15;
                            if (this.f54657e + i15 <= i14) {
                                break;
                            }
                            f6 = f3;
                            i11 = i3;
                        } else {
                            int i29 = i27;
                            short[] sArr5 = this.f54660h;
                            if (f5 < 0.5f) {
                                i2 = (int) ((i29 * f5) / (f6 - f5));
                            } else {
                                this.f54672t = (int) ((((2.0f * f5) - f6) * i29) / (f6 - f5));
                                i2 = i29;
                            }
                            int i30 = i29 + i2;
                            b(i30);
                            int i31 = this.f54654b;
                            f3 = f6;
                            i3 = i11;
                            System.arraycopy(sArr5, i15 * i31, this.f54662j, this.f54670r * i31, i31 * i29);
                            int i32 = i15;
                            a(i2, this.f54654b, this.f54662j, this.f54670r + i29, sArr5, i15 + i29, sArr5, i32);
                            i15 = i32;
                            this.f54670r += i30;
                            iMin = i2;
                        }
                    }
                    i15 += iMin;
                    if (this.f54657e + i15 <= i14) {
                    }
                }
                int i33 = this.f54669q - i15;
                short[] sArr6 = this.f54660h;
                int i34 = this.f54654b;
                System.arraycopy(sArr6, i15 * i34, sArr6, 0, i34 * i33);
                this.f54669q = i33;
            }
            f4 = this.f54668p;
            if (f4 != f3 || this.f54670r == i10) {
            }
            int i35 = this.f54653a;
            int i36 = (int) (i35 / f4);
            while (true) {
                if (i36 <= 16384 && i35 <= 16384) {
                    break;
                }
                i36 /= 2;
                i35 /= 2;
            }
            int i37 = this.f54670r - i10;
            int i38 = this.f54671s + i37;
            int i39 = this.f54663k;
            if (i38 > i39) {
                int i40 = (i39 / 2) + i37 + i39;
                this.f54663k = i40;
                this.f54664l = Arrays.copyOf(this.f54664l, i40 * this.f54654b);
            }
            short[] sArr7 = this.f54662j;
            int i41 = this.f54654b;
            System.arraycopy(sArr7, i10 * i41, this.f54664l, this.f54671s * i41, i41 * i37);
            this.f54670r = i10;
            this.f54671s += i37;
            int i42 = 0;
            while (true) {
                int i43 = this.f54671s;
                int i44 = i43 - 1;
                if (i42 >= i44) {
                    if (i44 == 0) {
                        return;
                    }
                    short[] sArr8 = this.f54664l;
                    int i45 = this.f54654b;
                    System.arraycopy(sArr8, i44 * i45, sArr8, 0, (i43 - i44) * i45);
                    this.f54671s -= i44;
                    return;
                }
                while (true) {
                    i8 = this.f54665m + 1;
                    int i46 = i8 * i36;
                    i9 = this.f54666n;
                    if (i46 <= i9 * i35) {
                        break;
                    }
                    b(i3);
                    int i47 = 0;
                    while (true) {
                        int i48 = this.f54654b;
                        if (i47 < i48) {
                            short[] sArr9 = this.f54662j;
                            int i49 = (this.f54670r * i48) + i47;
                            short[] sArr10 = this.f54664l;
                            int i50 = (i42 * i48) + i47;
                            short s2 = sArr10[i50];
                            short s3 = sArr10[i50 + i48];
                            int i51 = this.f54666n * i35;
                            int i52 = this.f54665m;
                            int i53 = i52 * i36;
                            int i54 = (i52 + 1) * i36;
                            int i55 = i54 - i51;
                            int i56 = i54 - i53;
                            sArr9[i49] = (short) ((((i56 - i55) * s3) + (s2 * i55)) / i56);
                            i47++;
                        }
                    }
                    i3 = 1;
                    this.f54666n++;
                    this.f54670r++;
                }
                this.f54665m = i8;
                if (i8 == i35) {
                    this.f54665m = 0;
                    if (i9 == i36) {
                        this.f54666n = 0;
                    } else {
                        throw new IllegalStateException();
                    }
                }
                i42++;
            }
        }
        f3 = 1.0f;
        i3 = 1;
        f4 = this.f54668p;
        if (f4 != f3) {
        }
    }

    public static void a(int i2, int i3, short[] sArr, int i5, short[] sArr2, int i7, short[] sArr3, int i8) {
        for (int i9 = 0; i9 < i3; i9++) {
            int i10 = (i5 * i3) + i9;
            int i11 = (i8 * i3) + i9;
            int i12 = (i7 * i3) + i9;
            for (int i13 = 0; i13 < i2; i13++) {
                sArr[i10] = (short) (((sArr3[i11] * i13) + ((i2 - i13) * sArr2[i12])) / i2);
                i10 += i3;
                i12 += i3;
                i11 += i3;
            }
        }
    }
}
