package androidx.constraintlayout.core.motion.utils;

import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class StepCurve extends Easing {
    MonotonicCurveFit nr;

    private static MonotonicCurveFit nr(double[] dArr) {
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
        MonotonicCurveFit monotonicCurveFit = new MonotonicCurveFit(dArr3, dArr2);
        System.out.println(" 0 " + monotonicCurveFit.t(0.0d, 0));
        System.out.println(" 1 " + monotonicCurveFit.t(1.0d, 0));
        return monotonicCurveFit;
    }

    @Override // androidx.constraintlayout.core.motion.utils.Easing
    public double n(double d2) {
        return this.nr.t(d2, 0);
    }

    @Override // androidx.constraintlayout.core.motion.utils.Easing
    public double rl(double d2) {
        return this.nr.J2(d2, 0);
    }

    StepCurve(String str) {
        this.f35265n = str;
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
        this.nr = nr(Arrays.copyOf(dArr, i2 + 1));
    }
}
