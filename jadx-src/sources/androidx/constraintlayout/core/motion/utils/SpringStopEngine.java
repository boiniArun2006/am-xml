package androidx.constraintlayout.core.motion.utils;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class SpringStopEngine implements StopEngine {
    private float J2;
    private float KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private double f35297O;
    private float Uo;
    private float mUb;
    private double nr;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private double f35299t;
    private float xMQ;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    double f35298n = 0.5d;
    private boolean rl = false;
    private int gh = 0;

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float n() {
        return 0.0f;
    }

    public void nr(float f3, float f4, float f5, float f6, float f7, float f8, float f9, int i2) {
        this.nr = f4;
        this.f35298n = f8;
        this.rl = false;
        this.Uo = f3;
        this.f35297O = f5;
        this.f35299t = f7;
        this.xMQ = f6;
        this.mUb = f9;
        this.gh = i2;
        this.J2 = 0.0f;
    }

    private void t(double d2) {
        if (d2 <= 0.0d) {
            return;
        }
        double d4 = this.f35299t;
        double d5 = this.f35298n;
        int iSqrt = (int) ((9.0d / ((Math.sqrt(d4 / ((double) this.xMQ)) * d2) * 4.0d)) + 1.0d);
        double d6 = d2 / ((double) iSqrt);
        int i2 = 0;
        while (i2 < iSqrt) {
            float f3 = this.Uo;
            double d7 = this.nr;
            float f4 = this.KN;
            double d8 = d4;
            double d9 = ((-d4) * (((double) f3) - d7)) - (((double) f4) * d5);
            float f5 = this.xMQ;
            double d10 = d5;
            double d11 = ((double) f4) + (((d9 / ((double) f5)) * d6) / 2.0d);
            double d12 = ((((-((((double) f3) + ((d6 * d11) / 2.0d)) - d7)) * d8) - (d11 * d10)) / ((double) f5)) * d6;
            double d13 = ((double) f4) + (d12 / 2.0d);
            float f6 = f4 + ((float) d12);
            this.KN = f6;
            float f7 = f3 + ((float) (d13 * d6));
            this.Uo = f7;
            int i3 = this.gh;
            if (i3 > 0) {
                if (f7 < 0.0f && (i3 & 1) == 1) {
                    this.Uo = -f7;
                    this.KN = -f6;
                }
                float f8 = this.Uo;
                if (f8 > 1.0f && (i3 & 2) == 2) {
                    this.Uo = 2.0f - f8;
                    this.KN = -this.KN;
                }
            }
            i2++;
            d4 = d8;
            d5 = d10;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getInterpolation(float f3) {
        t(f3 - this.J2);
        this.J2 = f3;
        if (rl()) {
            this.Uo = (float) this.nr;
        }
        return this.Uo;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public boolean rl() {
        double d2 = ((double) this.Uo) - this.nr;
        double d4 = this.f35299t;
        double d5 = this.KN;
        return Math.sqrt((((d5 * d5) * ((double) this.xMQ)) + ((d4 * d2) * d2)) / d4) <= ((double) this.mUb);
    }
}
