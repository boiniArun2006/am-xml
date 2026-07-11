package androidx.dynamicanimation.animation;

import androidx.dynamicanimation.animation.DynamicAnimation;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class SpringForce implements Force {
    private double J2;
    private double KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private double f38307O;
    private double Uo;
    private final DynamicAnimation.MassState mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    double f38308n;
    private double nr;
    double rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f38309t;
    private double xMQ;

    public SpringForce() {
        this.f38308n = Math.sqrt(1500.0d);
        this.rl = 0.5d;
        this.f38309t = false;
        this.xMQ = Double.MAX_VALUE;
        this.mUb = new DynamicAnimation.MassState();
    }

    public SpringForce J2(float f3) {
        if (f3 <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f38308n = Math.sqrt(f3);
        this.f38309t = false;
        return this;
    }

    public SpringForce O(float f3) {
        this.xMQ = f3;
        return this;
    }

    public SpringForce nr(float f3) {
        if (f3 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.rl = f3;
        this.f38309t = false;
        return this;
    }

    private void rl() {
        if (this.f38309t) {
            return;
        }
        if (this.xMQ == Double.MAX_VALUE) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        double d2 = this.rl;
        if (d2 > 1.0d) {
            double d4 = this.f38308n;
            this.J2 = ((-d2) * d4) + (d4 * Math.sqrt((d2 * d2) - 1.0d));
            double d5 = this.rl;
            double d6 = this.f38308n;
            this.Uo = ((-d5) * d6) - (d6 * Math.sqrt((d5 * d5) - 1.0d));
        } else if (d2 >= 0.0d && d2 < 1.0d) {
            this.KN = this.f38308n * Math.sqrt(1.0d - (d2 * d2));
        }
        this.f38309t = true;
    }

    DynamicAnimation.MassState KN(double d2, double d4, long j2) {
        double dPow;
        double dCos;
        rl();
        double d5 = j2 / 1000.0d;
        double d6 = d2 - this.xMQ;
        double d7 = this.rl;
        if (d7 > 1.0d) {
            double d8 = this.Uo;
            double d9 = this.J2;
            double d10 = d6 - (((d8 * d6) - d4) / (d8 - d9));
            double d11 = ((d6 * d8) - d4) / (d8 - d9);
            dPow = (Math.pow(2.718281828459045d, d8 * d5) * d10) + (Math.pow(2.718281828459045d, this.J2 * d5) * d11);
            double d12 = this.Uo;
            double dPow2 = d10 * d12 * Math.pow(2.718281828459045d, d12 * d5);
            double d13 = this.J2;
            dCos = dPow2 + (d11 * d13 * Math.pow(2.718281828459045d, d13 * d5));
        } else if (d7 == 1.0d) {
            double d14 = this.f38308n;
            double d15 = d4 + (d14 * d6);
            double d16 = d6 + (d15 * d5);
            dPow = Math.pow(2.718281828459045d, (-d14) * d5) * d16;
            double dPow3 = d16 * Math.pow(2.718281828459045d, (-this.f38308n) * d5);
            double d17 = this.f38308n;
            dCos = (d15 * Math.pow(2.718281828459045d, (-d17) * d5)) + (dPow3 * (-d17));
        } else {
            double d18 = 1.0d / this.KN;
            double d19 = this.f38308n;
            double d20 = d18 * ((d7 * d19 * d6) + d4);
            dPow = Math.pow(2.718281828459045d, (-d7) * d19 * d5) * ((Math.cos(this.KN * d5) * d6) + (Math.sin(this.KN * d5) * d20));
            double d21 = this.f38308n;
            double d22 = this.rl;
            double dPow4 = Math.pow(2.718281828459045d, (-d22) * d21 * d5);
            double d23 = this.KN;
            double dSin = (-d23) * d6 * Math.sin(d23 * d5);
            double d24 = this.KN;
            dCos = ((-d21) * dPow * d22) + (dPow4 * (dSin + (d20 * d24 * Math.cos(d24 * d5))));
        }
        DynamicAnimation.MassState massState = this.mUb;
        massState.f38300n = (float) (dPow + this.xMQ);
        massState.rl = (float) dCos;
        return massState;
    }

    public float n() {
        return (float) this.xMQ;
    }

    void Uo(double d2) {
        double dAbs = Math.abs(d2);
        this.nr = dAbs;
        this.f38307O = dAbs * 62.5d;
    }

    public boolean t(float f3, float f4) {
        if (Math.abs(f4) < this.f38307O && Math.abs(f3 - n()) < this.nr) {
            return true;
        }
        return false;
    }

    public SpringForce(float f3) {
        this.f38308n = Math.sqrt(1500.0d);
        this.rl = 0.5d;
        this.f38309t = false;
        this.xMQ = Double.MAX_VALUE;
        this.mUb = new DynamicAnimation.MassState();
        this.xMQ = f3;
    }
}
