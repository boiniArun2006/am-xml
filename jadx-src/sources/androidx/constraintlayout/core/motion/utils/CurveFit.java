package androidx.constraintlayout.core.motion.utils;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class CurveFit {

    static class Constant extends CurveFit {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        double f35263n;
        double[] rl;

        @Override // androidx.constraintlayout.core.motion.utils.CurveFit
        public double J2(double d2, int i2) {
            return 0.0d;
        }

        @Override // androidx.constraintlayout.core.motion.utils.CurveFit
        public void O(double d2, float[] fArr) {
            int i2 = 0;
            while (true) {
                double[] dArr = this.rl;
                if (i2 >= dArr.length) {
                    return;
                }
                fArr[i2] = (float) dArr[i2];
                i2++;
            }
        }

        @Override // androidx.constraintlayout.core.motion.utils.CurveFit
        public void Uo(double d2, double[] dArr) {
            for (int i2 = 0; i2 < this.rl.length; i2++) {
                dArr[i2] = 0.0d;
            }
        }

        @Override // androidx.constraintlayout.core.motion.utils.CurveFit
        public double[] KN() {
            return new double[]{this.f35263n};
        }

        @Override // androidx.constraintlayout.core.motion.utils.CurveFit
        public void nr(double d2, double[] dArr) {
            double[] dArr2 = this.rl;
            System.arraycopy(dArr2, 0, dArr, 0, dArr2.length);
        }

        @Override // androidx.constraintlayout.core.motion.utils.CurveFit
        public double t(double d2, int i2) {
            return this.rl[i2];
        }

        Constant(double d2, double[] dArr) {
            this.f35263n = d2;
            this.rl = dArr;
        }
    }

    public static CurveFit n(int i2, double[] dArr, double[][] dArr2) {
        if (dArr.length == 1) {
            i2 = 2;
        }
        return i2 != 0 ? i2 != 2 ? new LinearCurveFit(dArr, dArr2) : new Constant(dArr[0], dArr2[0]) : new MonotonicCurveFit(dArr, dArr2);
    }

    public abstract double J2(double d2, int i2);

    public abstract double[] KN();

    public abstract void O(double d2, float[] fArr);

    public abstract void Uo(double d2, double[] dArr);

    public abstract void nr(double d2, double[] dArr);

    public abstract double t(double d2, int i2);

    public static CurveFit rl(int[] iArr, double[] dArr, double[][] dArr2) {
        return new ArcCurveFit(iArr, dArr, dArr2);
    }
}
