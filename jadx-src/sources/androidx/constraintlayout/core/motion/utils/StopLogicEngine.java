package androidx.constraintlayout.core.motion.utils;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class StopLogicEngine implements StopEngine {
    private float HI;
    private float J2;
    private float KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private float f35300O;
    private float Uo;
    private float az;
    private String gh;
    private int mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f35301n;
    private float nr;
    private float rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f35302t;
    private float ty;
    private float xMQ;
    private boolean qie = false;
    private boolean ck = false;

    public static class Decelerate implements StopEngine {
        private float J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private float f35303O;
        private boolean Uo = false;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private float f35304n;
        private float nr;
        private float rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private float f35305t;

        public void t(float f3, float f4, float f5) {
            this.Uo = false;
            this.f35304n = f4;
            this.rl = f5;
            this.J2 = f3;
            float f6 = (f4 - f3) / (f5 / 2.0f);
            this.f35303O = f6;
            this.f35305t = (-f5) / f6;
        }

        @Override // androidx.constraintlayout.core.motion.utils.StopEngine
        public float getInterpolation(float f3) {
            if (f3 > this.f35303O) {
                this.Uo = true;
                return this.f35304n;
            }
            nr(f3);
            return this.J2 + ((this.rl + ((this.f35305t * f3) / 2.0f)) * f3);
        }

        @Override // androidx.constraintlayout.core.motion.utils.StopEngine
        public float n() {
            return this.nr;
        }

        public float nr(float f3) {
            if (f3 > this.f35303O) {
                return 0.0f;
            }
            float f4 = this.rl + (this.f35305t * f3);
            this.nr = f4;
            return f4;
        }

        @Override // androidx.constraintlayout.core.motion.utils.StopEngine
        public boolean rl() {
            return this.Uo;
        }
    }

    private void J2(float f3, float f4, float f5, float f6, float f7) {
        this.ck = false;
        this.xMQ = f4;
        if (f3 == 0.0f) {
            f3 = 1.0E-4f;
        }
        float f8 = f3 / f5;
        float f9 = (f8 * f3) / 2.0f;
        if (f3 < 0.0f) {
            float fSqrt = (float) Math.sqrt((f4 - ((((-f3) / f5) * f3) / 2.0f)) * f5);
            if (fSqrt < f6) {
                this.gh = "backward accelerate, decelerate";
                this.mUb = 2;
                this.f35301n = f3;
                this.rl = fSqrt;
                this.f35302t = 0.0f;
                float f10 = (fSqrt - f3) / f5;
                this.nr = f10;
                this.f35300O = fSqrt / f5;
                this.Uo = ((f3 + fSqrt) * f10) / 2.0f;
                this.KN = f4;
                this.xMQ = f4;
                return;
            }
            this.gh = "backward accelerate cruse decelerate";
            this.mUb = 3;
            this.f35301n = f3;
            this.rl = f6;
            this.f35302t = f6;
            float f11 = (f6 - f3) / f5;
            this.nr = f11;
            float f12 = f6 / f5;
            this.J2 = f12;
            float f13 = ((f3 + f6) * f11) / 2.0f;
            float f14 = (f12 * f6) / 2.0f;
            this.f35300O = ((f4 - f13) - f14) / f6;
            this.Uo = f13;
            this.KN = f4 - f14;
            this.xMQ = f4;
            return;
        }
        if (f9 >= f4) {
            this.gh = "hard stop";
            this.mUb = 1;
            this.f35301n = f3;
            this.rl = 0.0f;
            this.Uo = f4;
            this.nr = (2.0f * f4) / f3;
            return;
        }
        float f15 = f4 - f9;
        float f16 = f15 / f3;
        if (f16 + f8 < f7) {
            this.gh = "cruse decelerate";
            this.mUb = 2;
            this.f35301n = f3;
            this.rl = f3;
            this.f35302t = 0.0f;
            this.Uo = f15;
            this.KN = f4;
            this.nr = f16;
            this.f35300O = f8;
            return;
        }
        float fSqrt2 = (float) Math.sqrt((f5 * f4) + ((f3 * f3) / 2.0f));
        float f17 = (fSqrt2 - f3) / f5;
        this.nr = f17;
        float f18 = fSqrt2 / f5;
        this.f35300O = f18;
        if (fSqrt2 < f6) {
            this.gh = "accelerate decelerate";
            this.mUb = 2;
            this.f35301n = f3;
            this.rl = fSqrt2;
            this.f35302t = 0.0f;
            this.nr = f17;
            this.f35300O = f18;
            this.Uo = ((f3 + fSqrt2) * f17) / 2.0f;
            this.KN = f4;
            return;
        }
        this.gh = "accelerate cruse decelerate";
        this.mUb = 3;
        this.f35301n = f3;
        this.rl = f6;
        this.f35302t = f6;
        float f19 = (f6 - f3) / f5;
        this.nr = f19;
        float f20 = f6 / f5;
        this.J2 = f20;
        float f21 = ((f3 + f6) * f19) / 2.0f;
        float f22 = (f20 * f6) / 2.0f;
        this.f35300O = ((f4 - f21) - f22) / f6;
        this.Uo = f21;
        this.KN = f4 - f22;
        this.xMQ = f4;
    }

    private float t(float f3) {
        this.ck = false;
        float f4 = this.nr;
        if (f3 <= f4) {
            float f5 = this.f35301n;
            return (f5 * f3) + ((((this.rl - f5) * f3) * f3) / (f4 * 2.0f));
        }
        int i2 = this.mUb;
        if (i2 == 1) {
            return this.Uo;
        }
        float f6 = f3 - f4;
        float f7 = this.f35300O;
        if (f6 < f7) {
            float f8 = this.Uo;
            float f9 = this.rl;
            return f8 + (f9 * f6) + ((((this.f35302t - f9) * f6) * f6) / (f7 * 2.0f));
        }
        if (i2 == 2) {
            return this.KN;
        }
        float f10 = f6 - f7;
        float f11 = this.J2;
        if (f10 > f11) {
            this.ck = true;
            return this.xMQ;
        }
        float f12 = this.KN;
        float f13 = this.f35302t;
        return (f12 + (f13 * f10)) - (((f13 * f10) * f10) / (f11 * 2.0f));
    }

    public void nr(float f3, float f4, float f5, float f6, float f7, float f8) {
        this.ck = false;
        this.az = f3;
        boolean z2 = f3 > f4;
        this.qie = z2;
        if (z2) {
            J2(-f5, f3 - f4, f7, f8, f6);
        } else {
            J2(f5, f4 - f3, f7, f8, f6);
        }
    }

    public float O(float f3) {
        float f4 = this.nr;
        if (f3 <= f4) {
            float f5 = this.f35301n;
            return f5 + (((this.rl - f5) * f3) / f4);
        }
        int i2 = this.mUb;
        if (i2 == 1) {
            return 0.0f;
        }
        float f6 = f3 - f4;
        float f7 = this.f35300O;
        if (f6 < f7) {
            float f8 = this.rl;
            return f8 + (((this.f35302t - f8) * f6) / f7);
        }
        if (i2 == 2) {
            return 0.0f;
        }
        float f9 = f6 - f7;
        float f10 = this.J2;
        if (f9 >= f10) {
            return 0.0f;
        }
        float f11 = this.f35302t;
        return f11 - ((f9 * f11) / f10);
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float n() {
        return this.qie ? -O(this.HI) : O(this.HI);
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public float getInterpolation(float f3) {
        float fT = t(f3);
        this.ty = fT;
        this.HI = f3;
        if (this.qie) {
            return this.az - fT;
        }
        return this.az + fT;
    }

    @Override // androidx.constraintlayout.core.motion.utils.StopEngine
    public boolean rl() {
        if (n() < 1.0E-5f && Math.abs(this.xMQ - this.ty) < 1.0E-5f) {
            return true;
        }
        return false;
    }
}
