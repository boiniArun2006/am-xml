package androidx.constraintlayout.core.motion.utils;

import androidx.constraintlayout.core.motion.CustomAttribute;
import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.motion.utils.KeyFrameArray;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.Arrays;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class SplineSet {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private String f35294O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected CurveFit f35295n;
    private int nr;
    protected int[] rl = new int[10];

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected float[] f35296t = new float[10];

    private static class CoreSpline extends SplineSet {
        String J2;
        long Uo;

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void J2(TypedValues typedValues, float f3) {
            typedValues.t(typedValues.n(this.J2), n(f3));
        }

        CoreSpline(String str, long j2) {
            this.J2 = str;
            this.Uo = j2;
        }
    }

    public static class CustomSet extends SplineSet {
        KeyFrameArray.CustomArray J2;
        float[] Uo;

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void KN(int i2) {
            int iRl = this.J2.rl();
            int iRl2 = this.J2.t(0).rl();
            double[] dArr = new double[iRl];
            this.Uo = new float[iRl2];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, iRl, iRl2);
            for (int i3 = 0; i3 < iRl; i3++) {
                int iN = this.J2.n(i3);
                CustomAttribute customAttributeT = this.J2.t(i3);
                dArr[i3] = ((double) iN) * 0.01d;
                customAttributeT.n(this.Uo);
                int i5 = 0;
                while (true) {
                    if (i5 < this.Uo.length) {
                        dArr2[i3][i5] = r6[i5];
                        i5++;
                    }
                }
            }
            this.f35295n = CurveFit.n(i2, dArr, dArr2);
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void O(int i2, float f3) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }
    }

    public static class CustomSpline extends SplineSet {
        String J2;
        float[] KN;
        KeyFrameArray.CustomVar Uo;

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void J2(TypedValues typedValues, float f3) {
            mUb((MotionWidget) typedValues, f3);
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void KN(int i2) {
            int iO = this.Uo.O();
            int iAz = this.Uo.J2(0).az();
            double[] dArr = new double[iO];
            this.KN = new float[iAz];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, iO, iAz);
            for (int i3 = 0; i3 < iO; i3++) {
                int iT = this.Uo.t(i3);
                CustomVariable customVariableJ2 = this.Uo.J2(i3);
                dArr[i3] = ((double) iT) * 0.01d;
                customVariableJ2.gh(this.KN);
                int i5 = 0;
                while (true) {
                    if (i5 < this.KN.length) {
                        dArr2[i3][i5] = r6[i5];
                        i5++;
                    }
                }
            }
            this.f35295n = CurveFit.n(i2, dArr, dArr2);
        }

        @Override // androidx.constraintlayout.core.motion.utils.SplineSet
        public void O(int i2, float f3) {
            throw new RuntimeException("don't call for custom attribute call setPoint(pos, ConstraintAttribute)");
        }

        public void mUb(MotionWidget motionWidget, float f3) {
            this.f35295n.O(f3, this.KN);
            this.Uo.J2(0).Ik(motionWidget, this.KN);
        }

        public void xMQ(int i2, CustomVariable customVariable) {
            this.Uo.n(i2, customVariable);
        }

        public CustomSpline(String str, KeyFrameArray.CustomVar customVar) {
            this.J2 = str.split(",")[1];
            this.Uo = customVar;
        }
    }

    private static class Sort {
        static void n(int[] iArr, float[] fArr, int i2, int i3) {
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

        private static int rl(int[] iArr, float[] fArr, int i2, int i3) {
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

        private static void t(int[] iArr, float[] fArr, int i2, int i3) {
            int i5 = iArr[i2];
            iArr[i2] = iArr[i3];
            iArr[i3] = i5;
            float f3 = fArr[i2];
            fArr[i2] = fArr[i3];
            fArr[i3] = f3;
        }
    }

    public static SplineSet nr(String str, long j2) {
        return new CoreSpline(str, j2);
    }

    public static SplineSet t(String str, KeyFrameArray.CustomVar customVar) {
        return new CustomSpline(str, customVar);
    }

    public void J2(TypedValues typedValues, float f3) {
        typedValues.t(TypedValues.AttributesType.n(this.f35294O), n(f3));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void KN(int i2) {
        int i3 = this.nr;
        if (i3 == 0) {
            return;
        }
        Sort.n(this.rl, this.f35296t, 0, i3 - 1);
        int i5 = 1;
        for (int i7 = 1; i7 < this.nr; i7++) {
            int[] iArr = this.rl;
            if (iArr[i7 - 1] != iArr[i7]) {
                i5++;
            }
        }
        double[] dArr = new double[i5];
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, i5, 1);
        int i8 = 0;
        for (int i9 = 0; i9 < this.nr; i9++) {
            if (i9 > 0) {
                int[] iArr2 = this.rl;
                if (iArr2[i9] != iArr2[i9 - 1]) {
                    dArr[i8] = ((double) this.rl[i9]) * 0.01d;
                    dArr2[i8][0] = this.f35296t[i9];
                    i8++;
                }
            }
        }
        this.f35295n = CurveFit.n(i2, dArr, dArr2);
    }

    public void O(int i2, float f3) {
        int[] iArr = this.rl;
        if (iArr.length < this.nr + 1) {
            this.rl = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f35296t;
            this.f35296t = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.rl;
        int i3 = this.nr;
        iArr2[i3] = i2;
        this.f35296t[i3] = f3;
        this.nr = i3 + 1;
    }

    public void Uo(String str) {
        this.f35294O = str;
    }

    public float n(float f3) {
        return (float) this.f35295n.t(f3, 0);
    }

    public float rl(float f3) {
        return (float) this.f35295n.J2(f3, 0);
    }

    public String toString() {
        String str = this.f35294O;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i2 = 0; i2 < this.nr; i2++) {
            str = str + "[" + this.rl[i2] + " , " + decimalFormat.format(this.f35296t[i2]) + "] ";
        }
        return str;
    }
}
