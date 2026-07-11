package androidx.constraintlayout.core.motion.utils;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class LinearCurveFit extends CurveFit {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    double[] f35284O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private double[] f35285n;
    private boolean nr = true;
    private double[][] rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private double f35286t;

    /* JADX WARN: Removed duplicated region for block: B:4:0x000a A[PHI: r3
      0x000a: PHI (r3v4 double) = (r3v0 double), (r3v2 double) binds: [B:3:0x0008, B:6:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public double J2(double d2, int i2) {
        double[] dArr = this.f35285n;
        int length = dArr.length;
        int i3 = 0;
        double d4 = dArr[0];
        if (d2 < d4) {
            d2 = d4;
        } else {
            d4 = dArr[length - 1];
            if (d2 >= d4) {
            }
        }
        while (i3 < length - 1) {
            double[] dArr2 = this.f35285n;
            int i5 = i3 + 1;
            double d5 = dArr2[i5];
            if (d2 <= d5) {
                double d6 = d5 - dArr2[i3];
                double[][] dArr3 = this.rl;
                return (dArr3[i5][i2] - dArr3[i3][i2]) / d6;
            }
            i3 = i5;
        }
        return 0.0d;
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double[] KN() {
        return this.f35285n;
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void O(double d2, float[] fArr) {
        double[] dArr = this.f35285n;
        int length = dArr.length;
        int i2 = 0;
        int length2 = this.rl[0].length;
        if (this.nr) {
            double d4 = dArr[0];
            if (d2 <= d4) {
                Uo(d4, this.f35284O);
                for (int i3 = 0; i3 < length2; i3++) {
                    fArr[i3] = (float) (this.rl[0][i3] + ((d2 - this.f35285n[0]) * this.f35284O[i3]));
                }
                return;
            }
            int i5 = length - 1;
            double d5 = dArr[i5];
            if (d2 >= d5) {
                Uo(d5, this.f35284O);
                while (i2 < length2) {
                    fArr[i2] = (float) (this.rl[i5][i2] + ((d2 - this.f35285n[i5]) * this.f35284O[i2]));
                    i2++;
                }
                return;
            }
        } else {
            if (d2 <= dArr[0]) {
                for (int i7 = 0; i7 < length2; i7++) {
                    fArr[i7] = (float) this.rl[0][i7];
                }
                return;
            }
            int i8 = length - 1;
            if (d2 >= dArr[i8]) {
                while (i2 < length2) {
                    fArr[i2] = (float) this.rl[i8][i2];
                    i2++;
                }
                return;
            }
        }
        int i9 = 0;
        while (i9 < length - 1) {
            if (d2 == this.f35285n[i9]) {
                for (int i10 = 0; i10 < length2; i10++) {
                    fArr[i10] = (float) this.rl[i9][i10];
                }
            }
            double[] dArr2 = this.f35285n;
            int i11 = i9 + 1;
            double d6 = dArr2[i11];
            if (d2 < d6) {
                double d7 = dArr2[i9];
                double d8 = (d2 - d7) / (d6 - d7);
                while (i2 < length2) {
                    double[][] dArr3 = this.rl;
                    fArr[i2] = (float) ((dArr3[i9][i2] * (1.0d - d8)) + (dArr3[i11][i2] * d8));
                    i2++;
                }
                return;
            }
            i9 = i11;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x000f A[PHI: r4
      0x000f: PHI (r4v5 double) = (r4v0 double), (r4v2 double) binds: [B:3:0x000d, B:6:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void Uo(double d2, double[] dArr) {
        double[] dArr2 = this.f35285n;
        int length = dArr2.length;
        int length2 = this.rl[0].length;
        double d4 = dArr2[0];
        if (d2 <= d4) {
            d2 = d4;
        } else {
            d4 = dArr2[length - 1];
            if (d2 >= d4) {
            }
        }
        int i2 = 0;
        while (i2 < length - 1) {
            double[] dArr3 = this.f35285n;
            int i3 = i2 + 1;
            double d5 = dArr3[i3];
            if (d2 <= d5) {
                double d6 = d5 - dArr3[i2];
                for (int i5 = 0; i5 < length2; i5++) {
                    double[][] dArr4 = this.rl;
                    dArr[i5] = (dArr4[i3][i5] - dArr4[i2][i5]) / d6;
                }
                return;
            }
            i2 = i3;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void nr(double d2, double[] dArr) {
        double[] dArr2 = this.f35285n;
        int length = dArr2.length;
        int i2 = 0;
        int length2 = this.rl[0].length;
        if (this.nr) {
            double d4 = dArr2[0];
            if (d2 <= d4) {
                Uo(d4, this.f35284O);
                for (int i3 = 0; i3 < length2; i3++) {
                    dArr[i3] = this.rl[0][i3] + ((d2 - this.f35285n[0]) * this.f35284O[i3]);
                }
                return;
            }
            int i5 = length - 1;
            double d5 = dArr2[i5];
            if (d2 >= d5) {
                Uo(d5, this.f35284O);
                while (i2 < length2) {
                    dArr[i2] = this.rl[i5][i2] + ((d2 - this.f35285n[i5]) * this.f35284O[i2]);
                    i2++;
                }
                return;
            }
        } else {
            if (d2 <= dArr2[0]) {
                for (int i7 = 0; i7 < length2; i7++) {
                    dArr[i7] = this.rl[0][i7];
                }
                return;
            }
            int i8 = length - 1;
            if (d2 >= dArr2[i8]) {
                while (i2 < length2) {
                    dArr[i2] = this.rl[i8][i2];
                    i2++;
                }
                return;
            }
        }
        int i9 = 0;
        while (i9 < length - 1) {
            if (d2 == this.f35285n[i9]) {
                for (int i10 = 0; i10 < length2; i10++) {
                    dArr[i10] = this.rl[i9][i10];
                }
            }
            double[] dArr3 = this.f35285n;
            int i11 = i9 + 1;
            double d6 = dArr3[i11];
            if (d2 < d6) {
                double d7 = dArr3[i9];
                double d8 = (d2 - d7) / (d6 - d7);
                while (i2 < length2) {
                    double[][] dArr4 = this.rl;
                    dArr[i2] = (dArr4[i9][i2] * (1.0d - d8)) + (dArr4[i11][i2] * d8);
                    i2++;
                }
                return;
            }
            i9 = i11;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double t(double d2, int i2) {
        double d4;
        double d5;
        double dJ2;
        double[] dArr = this.f35285n;
        int length = dArr.length;
        int i3 = 0;
        if (this.nr) {
            double d6 = dArr[0];
            if (d2 <= d6) {
                d4 = this.rl[0][i2];
                d5 = d2 - d6;
                dJ2 = J2(d6, i2);
            } else {
                int i5 = length - 1;
                double d7 = dArr[i5];
                if (d2 >= d7) {
                    d4 = this.rl[i5][i2];
                    d5 = d2 - d7;
                    dJ2 = J2(d7, i2);
                }
            }
            return d4 + (d5 * dJ2);
        }
        if (d2 <= dArr[0]) {
            return this.rl[0][i2];
        }
        int i7 = length - 1;
        if (d2 >= dArr[i7]) {
            return this.rl[i7][i2];
        }
        while (i3 < length - 1) {
            double[] dArr2 = this.f35285n;
            double d8 = dArr2[i3];
            if (d2 == d8) {
                return this.rl[i3][i2];
            }
            int i8 = i3 + 1;
            double d9 = dArr2[i8];
            if (d2 < d9) {
                double d10 = (d2 - d8) / (d9 - d8);
                double[][] dArr3 = this.rl;
                return (dArr3[i3][i2] * (1.0d - d10)) + (dArr3[i8][i2] * d10);
            }
            i3 = i8;
        }
        return 0.0d;
    }

    public LinearCurveFit(double[] dArr, double[][] dArr2) {
        this.f35286t = Double.NaN;
        int length = dArr2[0].length;
        this.f35284O = new double[length];
        this.f35285n = dArr;
        this.rl = dArr2;
        if (length > 2) {
            int i2 = 0;
            double d2 = 0.0d;
            while (true) {
                double d4 = d2;
                if (i2 < dArr.length) {
                    double d5 = dArr2[i2][0];
                    if (i2 > 0) {
                        Math.hypot(d5 - d2, d5 - d4);
                    }
                    i2++;
                    d2 = d5;
                } else {
                    this.f35286t = 0.0d;
                    return;
                }
            }
        }
    }
}
