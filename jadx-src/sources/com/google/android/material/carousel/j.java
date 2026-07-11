package com.google.android.material.carousel;

import androidx.core.math.MathUtils;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class j {
    float J2;
    final float KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    float f58794O;
    final int Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final int f58795n;
    int nr;
    float rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f58796t;

    private float n(float f3, int i2, float f4, int i3, int i5) {
        if (i2 <= 0) {
            f4 = 0.0f;
        }
        float f5 = i3 / 2.0f;
        return (f3 - ((i2 + f5) * f4)) / (i5 + f5);
    }

    private float J2() {
        return (this.J2 * this.Uo) + (this.f58794O * this.nr) + (this.rl * this.f58796t);
    }

    private boolean Uo() {
        int i2 = this.Uo;
        if (i2 <= 0 || this.f58796t <= 0 || this.nr <= 0) {
            return i2 <= 0 || this.f58796t <= 0 || this.J2 > this.rl;
        }
        float f3 = this.J2;
        float f4 = this.f58794O;
        return f3 > f4 && f4 > this.rl;
    }

    static j t(float f3, float f4, float f5, float f6, int[] iArr, float f7, int[] iArr2, float f8, int[] iArr3) {
        j jVar = null;
        int i2 = 1;
        for (int i3 : iArr3) {
            int length = iArr2.length;
            int i5 = 0;
            while (i5 < length) {
                int i7 = iArr2[i5];
                int length2 = iArr.length;
                int i8 = 0;
                while (i8 < length2) {
                    int i9 = length;
                    int i10 = i5;
                    int i11 = i2;
                    int i12 = length2;
                    int i13 = i8;
                    j jVar2 = new j(i11, f4, f5, f6, iArr[i8], f7, i7, f8, i3, f3);
                    if (jVar == null || jVar2.KN < jVar.KN) {
                        if (jVar2.KN == 0.0f) {
                            return jVar2;
                        }
                        jVar = jVar2;
                    }
                    int i14 = i11 + 1;
                    i8 = i13 + 1;
                    i5 = i10;
                    i2 = i14;
                    length = i9;
                    length2 = i12;
                }
                i5++;
                i2 = i2;
                length = length;
            }
        }
        return jVar;
    }

    int O() {
        return this.f58796t + this.nr + this.Uo;
    }

    public String toString() {
        return "Arrangement [priority=" + this.f58795n + ", smallCount=" + this.f58796t + ", smallSize=" + this.rl + ", mediumCount=" + this.nr + ", mediumSize=" + this.f58794O + ", largeCount=" + this.Uo + ", largeSize=" + this.J2 + ", cost=" + this.KN + "]";
    }

    j(int i2, float f3, float f4, float f5, int i3, float f6, int i5, float f7, int i7, float f8) {
        this.f58795n = i2;
        this.rl = MathUtils.n(f3, f4, f5);
        this.f58796t = i3;
        this.f58794O = f6;
        this.nr = i5;
        this.J2 = f7;
        this.Uo = i7;
        nr(f8, f4, f5, f7);
        this.KN = rl(f7);
    }

    private void nr(float f3, float f4, float f5, float f6) {
        float f7;
        float fJ2 = f3 - J2();
        int i2 = this.f58796t;
        if (i2 > 0 && fJ2 > 0.0f) {
            float f8 = this.rl;
            this.rl = f8 + Math.min(fJ2 / i2, f5 - f8);
        } else if (i2 > 0 && fJ2 < 0.0f) {
            float f9 = this.rl;
            this.rl = f9 + Math.max(fJ2 / i2, f4 - f9);
        }
        int i3 = this.f58796t;
        if (i3 > 0) {
            f7 = this.rl;
        } else {
            f7 = 0.0f;
        }
        this.rl = f7;
        float fN = n(f3, i3, f7, this.nr, this.Uo);
        this.J2 = fN;
        float f10 = (this.rl + fN) / 2.0f;
        this.f58794O = f10;
        int i5 = this.nr;
        if (i5 > 0 && fN != f6) {
            float f11 = (f6 - fN) * this.Uo;
            float fMin = Math.min(Math.abs(f11), f10 * 0.1f * i5);
            if (f11 > 0.0f) {
                this.f58794O -= fMin / this.nr;
                this.J2 += fMin / this.Uo;
            } else {
                this.f58794O += fMin / this.nr;
                this.J2 -= fMin / this.Uo;
            }
        }
    }

    private float rl(float f3) {
        if (!Uo()) {
            return Float.MAX_VALUE;
        }
        return Math.abs(f3 - this.J2) * this.f58795n;
    }
}
