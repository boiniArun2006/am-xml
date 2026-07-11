package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.CustomAttribute;
import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.utils.KeyFrameArray;
import java.lang.reflect.Array;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class TimeCycleSplineSet {
    protected static float gh = 6.2831855f;
    protected String J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    protected int f35306O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected CurveFit f35307n;
    protected long xMQ;
    protected int rl = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected int[] f35308t = new int[10];
    protected float[][] nr = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 10, 3);
    protected float[] Uo = new float[3];
    protected boolean KN = false;
    protected float mUb = Float.NaN;

    public static class CustomSet extends TimeCycleSplineSet {
        float[] HI;
        KeyFrameArray.FloatArray az;
        KeyFrameArray.CustomArray qie;
        float[] ty;

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void O(int i2) {
            int iRl = this.qie.rl();
            int iRl2 = this.qie.t(0).rl();
            double[] dArr = new double[iRl];
            int i3 = iRl2 + 2;
            this.ty = new float[i3];
            this.HI = new float[iRl2];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, iRl, i3);
            for (int i5 = 0; i5 < iRl; i5++) {
                int iN = this.qie.n(i5);
                CustomAttribute customAttributeT = this.qie.t(i5);
                float[] fArrT = this.az.t(i5);
                dArr[i5] = ((double) iN) * 0.01d;
                customAttributeT.n(this.ty);
                int i7 = 0;
                while (true) {
                    if (i7 < this.ty.length) {
                        dArr2[i5][i7] = r8[i7];
                        i7++;
                    }
                }
                double[] dArr3 = dArr2[i5];
                dArr3[iRl2] = fArrT[0];
                dArr3[iRl2 + 1] = fArrT[1];
            }
            this.f35307n = CurveFit.n(i2, dArr, dArr2);
        }

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void rl(int i2, float f3, float f4, int i3, float f5) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }
    }

    public static class CustomVarSet extends TimeCycleSplineSet {
        float[] HI;
        KeyFrameArray.FloatArray az;
        KeyFrameArray.CustomVar qie;
        float[] ty;

        public void J2(int i2, CustomVariable customVariable, float f3, int i3, float f4) {
            this.qie.n(i2, customVariable);
            this.az.n(i2, new float[]{f3, f4});
            this.rl = Math.max(this.rl, i3);
        }

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void O(int i2) {
            int iO = this.qie.O();
            int iAz = this.qie.J2(0).az();
            double[] dArr = new double[iO];
            int i3 = iAz + 2;
            this.ty = new float[i3];
            this.HI = new float[iAz];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, iO, i3);
            for (int i5 = 0; i5 < iO; i5++) {
                int iT = this.qie.t(i5);
                CustomVariable customVariableJ2 = this.qie.J2(i5);
                float[] fArrT = this.az.t(i5);
                dArr[i5] = ((double) iT) * 0.01d;
                customVariableJ2.gh(this.ty);
                int i7 = 0;
                while (true) {
                    if (i7 < this.ty.length) {
                        dArr2[i5][i7] = r8[i7];
                        i7++;
                    }
                }
                double[] dArr3 = dArr2[i5];
                dArr3[iAz] = fArrT[0];
                dArr3[iAz + 1] = fArrT[1];
            }
            this.f35307n = CurveFit.n(i2, dArr, dArr2);
        }

        @Override // androidx.constraintlayout.core.motion.utils.TimeCycleSplineSet
        public void rl(int i2, float f3, float f4, int i3, float f5) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute,...)");
        }
    }

    protected static class Sort {
        static void n(int[] iArr, float[][] fArr, int i2, int i3) {
            int[] iArr2 = new int[iArr.length + 10];
            iArr2[0] = i3;
            iArr2[1] = i2;
            int i5 = 2;
            while (i5 > 0) {
                int i7 = iArr2[i5 - 1];
                int i8 = i5 - 2;
                int i9 = iArr2[i8];
                if (i7 < i9) {
                    int iRl = rl(iArr, fArr, i7, i9);
                    iArr2[i8] = iRl - 1;
                    iArr2[i5 - 1] = i7;
                    int i10 = i5 + 1;
                    iArr2[i5] = i9;
                    i5 += 2;
                    iArr2[i10] = iRl + 1;
                } else {
                    i5 = i8;
                }
            }
        }

        private static int rl(int[] iArr, float[][] fArr, int i2, int i3) {
            int i5 = iArr[i3];
            int i7 = i2;
            while (i2 < i3) {
                if (iArr[i2] <= i5) {
                    t(iArr, fArr, i7, i2);
                    i7++;
                }
                i2++;
            }
            t(iArr, fArr, i7, i3);
            return i7;
        }

        private static void t(int[] iArr, float[][] fArr, int i2, int i3) {
            int i5 = iArr[i2];
            iArr[i2] = iArr[i3];
            iArr[i3] = i5;
            float[] fArr2 = fArr[i2];
            fArr[i2] = fArr[i3];
            fArr[i3] = fArr2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void O(int i2) {
        int i3 = this.f35306O;
        if (i3 == 0) {
            System.err.println("Error no points added to " + this.J2);
            return;
        }
        Sort.n(this.f35308t, this.nr, 0, i3 - 1);
        int i5 = 1;
        int i7 = 0;
        while (true) {
            int[] iArr = this.f35308t;
            if (i5 >= iArr.length) {
                break;
            }
            if (iArr[i5] != iArr[i5 - 1]) {
                i7++;
            }
            i5++;
        }
        if (i7 == 0) {
            i7 = 1;
        }
        double[] dArr = new double[i7];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i7, 3);
        int i8 = 0;
        for (int i9 = 0; i9 < this.f35306O; i9++) {
            if (i9 > 0) {
                int[] iArr2 = this.f35308t;
                if (iArr2[i9] != iArr2[i9 - 1]) {
                    dArr[i8] = ((double) this.f35308t[i9]) * 0.01d;
                    double[] dArr3 = dArr2[i8];
                    float[] fArr = this.nr[i9];
                    dArr3[0] = fArr[0];
                    dArr3[1] = fArr[1];
                    dArr3[2] = fArr[2];
                    i8++;
                }
            }
        }
        this.f35307n = CurveFit.n(i2, dArr, dArr2);
    }

    protected float n(float f3) {
        float fAbs;
        switch (this.rl) {
            case 1:
                return Math.signum(f3 * gh);
            case 2:
                fAbs = Math.abs(f3);
                break;
            case 3:
                return (((f3 * 2.0f) + 1.0f) % 2.0f) - 1.0f;
            case 4:
                fAbs = ((f3 * 2.0f) + 1.0f) % 2.0f;
                break;
            case 5:
                return (float) Math.cos(f3 * gh);
            case 6:
                float fAbs2 = 1.0f - Math.abs(((f3 * 4.0f) % 4.0f) - 2.0f);
                fAbs = fAbs2 * fAbs2;
                break;
            default:
                return (float) Math.sin(f3 * gh);
        }
        return 1.0f - fAbs;
    }

    public void nr(String str) {
        this.J2 = str;
    }

    public void rl(int i2, float f3, float f4, int i3, float f5) {
        int[] iArr = this.f35308t;
        int i5 = this.f35306O;
        iArr[i5] = i2;
        float[] fArr = this.nr[i5];
        fArr[0] = f3;
        fArr[1] = f4;
        fArr[2] = f5;
        this.rl = Math.max(this.rl, i3);
        this.f35306O++;
    }

    protected void t(long j2) {
        this.xMQ = j2;
    }

    public String toString() {
        String str = this.J2;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i2 = 0; i2 < this.f35306O; i2++) {
            str = str + "[" + this.f35308t[i2] + " , " + decimalFormat.format(this.nr[i2]) + "] ";
        }
        return str;
    }
}
