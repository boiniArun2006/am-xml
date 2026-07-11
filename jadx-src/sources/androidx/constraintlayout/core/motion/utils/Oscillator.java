package androidx.constraintlayout.core.motion.utils;

import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class Oscillator {
    int J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    MonotonicCurveFit f35290O;
    String nr;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    double[] f35292t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    float[] f35291n = new float[0];
    double[] rl = new double[0];
    double Uo = 6.283185307179586d;
    private boolean KN = false;

    public void J2() {
        double d2 = 0.0d;
        int i2 = 0;
        while (true) {
            float[] fArr = this.f35291n;
            if (i2 >= fArr.length) {
                break;
            }
            d2 += (double) fArr[i2];
            i2++;
        }
        double d4 = 0.0d;
        int i3 = 1;
        while (true) {
            float[] fArr2 = this.f35291n;
            if (i3 >= fArr2.length) {
                break;
            }
            int i5 = i3 - 1;
            float f3 = (fArr2[i5] + fArr2[i3]) / 2.0f;
            double[] dArr = this.rl;
            d4 += (dArr[i3] - dArr[i5]) * ((double) f3);
            i3++;
        }
        int i7 = 0;
        while (true) {
            float[] fArr3 = this.f35291n;
            if (i7 >= fArr3.length) {
                break;
            }
            fArr3[i7] = fArr3[i7] * ((float) (d2 / d4));
            i7++;
        }
        this.f35292t[0] = 0.0d;
        int i8 = 1;
        while (true) {
            float[] fArr4 = this.f35291n;
            if (i8 >= fArr4.length) {
                this.KN = true;
                return;
            }
            int i9 = i8 - 1;
            float f4 = (fArr4[i9] + fArr4[i8]) / 2.0f;
            double[] dArr2 = this.rl;
            double d5 = dArr2[i8] - dArr2[i9];
            double[] dArr3 = this.f35292t;
            dArr3[i8] = dArr3[i9] + (d5 * ((double) f4));
            i8++;
        }
    }

    public void Uo(int i2, String str) {
        this.J2 = i2;
        this.nr = str;
        if (str != null) {
            this.f35290O = MonotonicCurveFit.xMQ(str);
        }
    }

    public void n(double d2, float f3) {
        int length = this.f35291n.length + 1;
        int iBinarySearch = Arrays.binarySearch(this.rl, d2);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        this.rl = Arrays.copyOf(this.rl, length);
        this.f35291n = Arrays.copyOf(this.f35291n, length);
        this.f35292t = new double[length];
        double[] dArr = this.rl;
        System.arraycopy(dArr, iBinarySearch, dArr, iBinarySearch + 1, (length - iBinarySearch) - 1);
        this.rl[iBinarySearch] = d2;
        this.f35291n[iBinarySearch] = f3;
        this.KN = false;
    }

    double rl(double d2) {
        if (d2 <= 0.0d) {
            return 0.0d;
        }
        if (d2 >= 1.0d) {
            return 1.0d;
        }
        int iBinarySearch = Arrays.binarySearch(this.rl, d2);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        float[] fArr = this.f35291n;
        float f3 = fArr[iBinarySearch];
        int i2 = iBinarySearch - 1;
        float f4 = fArr[i2];
        double d4 = f3 - f4;
        double[] dArr = this.rl;
        double d5 = dArr[iBinarySearch];
        double d6 = dArr[i2];
        double d7 = d4 / (d5 - d6);
        return (d2 * d7) + (((double) f4) - (d7 * d6));
    }

    double t(double d2) {
        if (d2 <= 0.0d) {
            return 0.0d;
        }
        if (d2 >= 1.0d) {
            return 1.0d;
        }
        int iBinarySearch = Arrays.binarySearch(this.rl, d2);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 1;
        }
        float[] fArr = this.f35291n;
        float f3 = fArr[iBinarySearch];
        int i2 = iBinarySearch - 1;
        float f4 = fArr[i2];
        double d4 = f3 - f4;
        double[] dArr = this.rl;
        double d5 = dArr[iBinarySearch];
        double d6 = dArr[i2];
        double d7 = d4 / (d5 - d6);
        return this.f35292t[i2] + ((((double) f4) - (d7 * d6)) * (d2 - d6)) + ((d7 * ((d2 * d2) - (d6 * d6))) / 2.0d);
    }

    public String toString() {
        return "pos =" + Arrays.toString(this.rl) + " period=" + Arrays.toString(this.f35291n);
    }

    public double O(double d2, double d4) {
        double dAbs;
        double dT = t(d2) + d4;
        switch (this.J2) {
            case 1:
                return Math.signum(0.5d - (dT % 1.0d));
            case 2:
                dAbs = Math.abs((((dT * 4.0d) + 1.0d) % 4.0d) - 2.0d);
                break;
            case 3:
                return (((dT * 2.0d) + 1.0d) % 2.0d) - 1.0d;
            case 4:
                dAbs = ((dT * 2.0d) + 1.0d) % 2.0d;
                break;
            case 5:
                return Math.cos(this.Uo * (d4 + dT));
            case 6:
                double dAbs2 = 1.0d - Math.abs(((dT * 4.0d) % 4.0d) - 2.0d);
                dAbs = dAbs2 * dAbs2;
                break;
            case 7:
                return this.f35290O.t(dT % 1.0d, 0);
            default:
                return Math.sin(this.Uo * dT);
        }
        return 1.0d - dAbs;
    }

    public double nr(double d2, double d4, double d5) {
        double dT = d4 + t(d2);
        double dRl = rl(d2) + d5;
        switch (this.J2) {
            case 1:
                return 0.0d;
            case 2:
                return dRl * 4.0d * Math.signum((((dT * 4.0d) + 3.0d) % 4.0d) - 2.0d);
            case 3:
                return dRl * 2.0d;
            case 4:
                return (-dRl) * 2.0d;
            case 5:
                double d6 = this.Uo;
                return (-d6) * dRl * Math.sin(d6 * dT);
            case 6:
                return dRl * 4.0d * ((((dT * 4.0d) + 2.0d) % 4.0d) - 2.0d);
            case 7:
                return this.f35290O.J2(dT % 1.0d, 0);
            default:
                double d7 = this.Uo;
                return dRl * d7 * Math.cos(d7 * dT);
        }
    }
}
