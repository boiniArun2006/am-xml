package androidx.constraintlayout.core.motion.utils;

import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class MonotonicCurveFit extends CurveFit {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    double[] f35287O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private double[] f35288n;
    private boolean nr = true;
    private double[][] rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private double[][] f35289t;

    private static double gh(double d2, double d4, double d5, double d6, double d7, double d8) {
        double d9 = d4 * d4;
        double d10 = d4 * 6.0d;
        double d11 = (((((-6.0d) * d9) * d6) + (d10 * d6)) + ((6.0d * d9) * d5)) - (d10 * d5);
        double d12 = 3.0d * d2;
        return ((((d11 + ((d12 * d8) * d9)) + ((d12 * d7) * d9)) - (((2.0d * d2) * d8) * d4)) - (((4.0d * d2) * d7) * d4)) + (d2 * d7);
    }

    private static double qie(double d2, double d4, double d5, double d6, double d7, double d8) {
        double d9 = d4 * d4;
        double d10 = d9 * d4;
        double d11 = 3.0d * d9;
        double d12 = ((((((-2.0d) * d10) * d6) + (d11 * d6)) + ((d10 * 2.0d) * d5)) - (d11 * d5)) + d5;
        double d13 = d2 * d8;
        double d14 = d2 * d7;
        return ((((d12 + (d13 * d10)) + (d10 * d14)) - (d13 * d9)) - (((d2 * 2.0d) * d7) * d9)) + (d14 * d4);
    }

    public MonotonicCurveFit(double[] dArr, double[][] dArr2) {
        int length = dArr.length;
        int length2 = dArr2[0].length;
        this.f35287O = new double[length2];
        int i2 = length - 1;
        Class cls = Double.TYPE;
        double[][] dArr3 = (double[][]) Array.newInstance((Class<?>) cls, i2, length2);
        double[][] dArr4 = (double[][]) Array.newInstance((Class<?>) cls, length, length2);
        for (int i3 = 0; i3 < length2; i3++) {
            int i5 = 0;
            while (i5 < i2) {
                int i7 = i5 + 1;
                double d2 = dArr[i7] - dArr[i5];
                double[] dArr5 = dArr3[i5];
                double d4 = (dArr2[i7][i3] - dArr2[i5][i3]) / d2;
                dArr5[i3] = d4;
                if (i5 == 0) {
                    dArr4[i5][i3] = d4;
                } else {
                    dArr4[i5][i3] = (dArr3[i5 - 1][i3] + d4) * 0.5d;
                }
                i5 = i7;
            }
            dArr4[i2][i3] = dArr3[length - 2][i3];
        }
        for (int i8 = 0; i8 < i2; i8++) {
            for (int i9 = 0; i9 < length2; i9++) {
                double d5 = dArr3[i8][i9];
                if (d5 == 0.0d) {
                    dArr4[i8][i9] = 0.0d;
                    dArr4[i8 + 1][i9] = 0.0d;
                } else {
                    double d6 = dArr4[i8][i9] / d5;
                    int i10 = i8 + 1;
                    double d7 = dArr4[i10][i9] / d5;
                    double dHypot = Math.hypot(d6, d7);
                    if (dHypot > 9.0d) {
                        double d8 = 3.0d / dHypot;
                        double[] dArr6 = dArr4[i8];
                        double[] dArr7 = dArr3[i8];
                        dArr6[i9] = d6 * d8 * dArr7[i9];
                        dArr4[i10][i9] = d8 * d7 * dArr7[i9];
                    }
                }
            }
        }
        this.f35288n = dArr;
        this.rl = dArr2;
        this.f35289t = dArr4;
    }

    private static MonotonicCurveFit mUb(double[] dArr) {
        int length = (dArr.length * 3) - 2;
        int length2 = dArr.length - 1;
        double d2 = 1.0d / ((double) length2);
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, 1);
        double[] dArr3 = new double[length];
        for (int i2 = 0; i2 < dArr.length; i2++) {
            double d4 = dArr[i2];
            int i3 = i2 + length2;
            dArr2[i3][0] = d4;
            double d5 = ((double) i2) * d2;
            dArr3[i3] = d5;
            if (i2 > 0) {
                int i5 = (length2 * 2) + i2;
                dArr2[i5][0] = d4 + 1.0d;
                dArr3[i5] = d5 + 1.0d;
                int i7 = i2 - 1;
                dArr2[i7][0] = (d4 - 1.0d) - d2;
                dArr3[i7] = (d5 - 1.0d) - d2;
            }
        }
        return new MonotonicCurveFit(dArr3, dArr2);
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double J2(double d2, int i2) {
        double[] dArr = this.f35288n;
        int length = dArr.length;
        int i3 = 0;
        double d4 = dArr[0];
        if (d2 >= d4) {
            d4 = dArr[length - 1];
            if (d2 < d4) {
                d4 = d2;
            }
        }
        while (i3 < length - 1) {
            double[] dArr2 = this.f35288n;
            int i5 = i3 + 1;
            double d5 = dArr2[i5];
            if (d4 <= d5) {
                double d6 = dArr2[i3];
                double d7 = d5 - d6;
                double[][] dArr3 = this.rl;
                double d8 = dArr3[i3][i2];
                double d9 = dArr3[i5][i2];
                double[][] dArr4 = this.f35289t;
                return gh(d7, (d4 - d6) / d7, d8, d9, dArr4[i3][i2], dArr4[i5][i2]) / d7;
            }
            i3 = i5;
        }
        return 0.0d;
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public double[] KN() {
        return this.f35288n;
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void O(double d2, float[] fArr) {
        double[] dArr = this.f35288n;
        int length = dArr.length;
        int i2 = 0;
        int length2 = this.rl[0].length;
        if (this.nr) {
            double d4 = dArr[0];
            if (d2 <= d4) {
                Uo(d4, this.f35287O);
                for (int i3 = 0; i3 < length2; i3++) {
                    fArr[i3] = (float) (this.rl[0][i3] + ((d2 - this.f35288n[0]) * this.f35287O[i3]));
                }
                return;
            }
            int i5 = length - 1;
            double d5 = dArr[i5];
            if (d2 >= d5) {
                Uo(d5, this.f35287O);
                while (i2 < length2) {
                    fArr[i2] = (float) (this.rl[i5][i2] + ((d2 - this.f35288n[i5]) * this.f35287O[i2]));
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
            if (d2 == this.f35288n[i9]) {
                for (int i10 = 0; i10 < length2; i10++) {
                    fArr[i10] = (float) this.rl[i9][i10];
                }
            }
            double[] dArr2 = this.f35288n;
            int i11 = i9 + 1;
            double d6 = dArr2[i11];
            if (d2 < d6) {
                double d7 = dArr2[i9];
                double d8 = d6 - d7;
                double d9 = (d2 - d7) / d8;
                while (i2 < length2) {
                    double[][] dArr3 = this.rl;
                    double d10 = dArr3[i9][i2];
                    double d11 = dArr3[i11][i2];
                    double[][] dArr4 = this.f35289t;
                    fArr[i2] = (float) qie(d8, d9, d10, d11, dArr4[i9][i2], dArr4[i11][i2]);
                    i2++;
                }
                return;
            }
            i9 = i11;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void Uo(double d2, double[] dArr) {
        double[] dArr2 = this.f35288n;
        int length = dArr2.length;
        int length2 = this.rl[0].length;
        double d4 = dArr2[0];
        if (d2 > d4) {
            d4 = dArr2[length - 1];
            if (d2 < d4) {
                d4 = d2;
            }
        }
        int i2 = 0;
        while (i2 < length - 1) {
            double[] dArr3 = this.f35288n;
            int i3 = i2 + 1;
            double d5 = dArr3[i3];
            if (d4 <= d5) {
                double d6 = dArr3[i2];
                double d7 = d5 - d6;
                double d8 = (d4 - d6) / d7;
                for (int i5 = 0; i5 < length2; i5++) {
                    double[][] dArr4 = this.rl;
                    double d9 = dArr4[i2][i5];
                    double d10 = dArr4[i3][i5];
                    double[][] dArr5 = this.f35289t;
                    dArr[i5] = gh(d7, d8, d9, d10, dArr5[i2][i5], dArr5[i3][i5]) / d7;
                }
                return;
            }
            i2 = i3;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.CurveFit
    public void nr(double d2, double[] dArr) {
        double[] dArr2 = this.f35288n;
        int length = dArr2.length;
        int i2 = 0;
        int length2 = this.rl[0].length;
        if (this.nr) {
            double d4 = dArr2[0];
            if (d2 <= d4) {
                Uo(d4, this.f35287O);
                for (int i3 = 0; i3 < length2; i3++) {
                    dArr[i3] = this.rl[0][i3] + ((d2 - this.f35288n[0]) * this.f35287O[i3]);
                }
                return;
            }
            int i5 = length - 1;
            double d5 = dArr2[i5];
            if (d2 >= d5) {
                Uo(d5, this.f35287O);
                while (i2 < length2) {
                    dArr[i2] = this.rl[i5][i2] + ((d2 - this.f35288n[i5]) * this.f35287O[i2]);
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
            if (d2 == this.f35288n[i9]) {
                for (int i10 = 0; i10 < length2; i10++) {
                    dArr[i10] = this.rl[i9][i10];
                }
            }
            double[] dArr3 = this.f35288n;
            int i11 = i9 + 1;
            double d6 = dArr3[i11];
            if (d2 < d6) {
                double d7 = dArr3[i9];
                double d8 = d6 - d7;
                double d9 = (d2 - d7) / d8;
                while (i2 < length2) {
                    double[][] dArr4 = this.rl;
                    double d10 = dArr4[i9][i2];
                    double d11 = dArr4[i11][i2];
                    double[][] dArr5 = this.f35289t;
                    dArr[i2] = qie(d8, d9, d10, d11, dArr5[i9][i2], dArr5[i11][i2]);
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
        double[] dArr = this.f35288n;
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
            double[] dArr2 = this.f35288n;
            double d8 = dArr2[i3];
            if (d2 == d8) {
                return this.rl[i3][i2];
            }
            int i8 = i3 + 1;
            double d9 = dArr2[i8];
            if (d2 < d9) {
                double d10 = d9 - d8;
                double d11 = (d2 - d8) / d10;
                double[][] dArr3 = this.rl;
                double d12 = dArr3[i3][i2];
                double d13 = dArr3[i8][i2];
                double[][] dArr4 = this.f35289t;
                return qie(d10, d11, d12, d13, dArr4[i3][i2], dArr4[i8][i2]);
            }
            i3 = i8;
        }
        return 0.0d;
    }

    public static MonotonicCurveFit xMQ(String str) {
        double[] dArr = new double[str.length() / 2];
        int iIndexOf = str.indexOf(40) + 1;
        int iIndexOf2 = str.indexOf(44, iIndexOf);
        int i2 = 0;
        while (iIndexOf2 != -1) {
            dArr[i2] = Double.parseDouble(str.substring(iIndexOf, iIndexOf2).trim());
            iIndexOf = iIndexOf2 + 1;
            iIndexOf2 = str.indexOf(44, iIndexOf);
            i2++;
        }
        dArr[i2] = Double.parseDouble(str.substring(iIndexOf, str.indexOf(41, iIndexOf)).trim());
        return mUb(Arrays.copyOf(dArr, i2 + 1));
    }
}
