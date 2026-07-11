package androidx.constraintlayout.core.motion.utils;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class VelocityMatrix {
    float J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    float f35316O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    float f35317n;
    float nr;
    float rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    float f35318t;

    public void rl() {
        this.f35316O = 0.0f;
        this.nr = 0.0f;
        this.f35318t = 0.0f;
        this.rl = 0.0f;
        this.f35317n = 0.0f;
    }

    public void J2(SplineSet splineSet, SplineSet splineSet2, float f3) {
        if (splineSet != null) {
            this.f35317n = splineSet.rl(f3);
        }
        if (splineSet2 != null) {
            this.rl = splineSet2.rl(f3);
        }
    }

    public void KN(SplineSet splineSet, SplineSet splineSet2, float f3) {
        if (splineSet != null) {
            this.f35318t = splineSet.rl(f3);
        }
        if (splineSet2 != null) {
            this.nr = splineSet2.rl(f3);
        }
    }

    public void O(KeyCycleOscillator keyCycleOscillator, KeyCycleOscillator keyCycleOscillator2, float f3) {
        if (keyCycleOscillator != null) {
            this.f35317n = keyCycleOscillator.rl(f3);
        }
        if (keyCycleOscillator2 != null) {
            this.rl = keyCycleOscillator2.rl(f3);
        }
    }

    public void Uo(KeyCycleOscillator keyCycleOscillator, KeyCycleOscillator keyCycleOscillator2, float f3) {
        if (keyCycleOscillator != null) {
            this.f35318t = keyCycleOscillator.rl(f3);
        }
        if (keyCycleOscillator2 != null) {
            this.nr = keyCycleOscillator2.rl(f3);
        }
    }

    public void n(float f3, float f4, int i2, int i3, float[] fArr) {
        float f5 = fArr[0];
        float f6 = fArr[1];
        float f7 = (f3 - 0.5f) * 2.0f;
        float f8 = (f4 - 0.5f) * 2.0f;
        float f9 = f5 + this.f35318t;
        float f10 = f6 + this.nr;
        float f11 = f9 + (this.f35317n * f7);
        float f12 = f10 + (this.rl * f8);
        float radians = (float) Math.toRadians(this.J2);
        float radians2 = (float) Math.toRadians(this.f35316O);
        double d2 = radians;
        double d4 = i3 * f8;
        float fSin = f11 + (((float) ((((double) ((-i2) * f7)) * Math.sin(d2)) - (Math.cos(d2) * d4))) * radians2);
        float fCos = f12 + (radians2 * ((float) ((((double) (i2 * f7)) * Math.cos(d2)) - (d4 * Math.sin(d2)))));
        fArr[0] = fSin;
        fArr[1] = fCos;
    }

    public void nr(SplineSet splineSet, float f3) {
        if (splineSet != null) {
            this.f35316O = splineSet.rl(f3);
            this.J2 = splineSet.n(f3);
        }
    }

    public void t(KeyCycleOscillator keyCycleOscillator, float f3) {
        if (keyCycleOscillator != null) {
            this.f35316O = keyCycleOscillator.rl(f3);
        }
    }
}
