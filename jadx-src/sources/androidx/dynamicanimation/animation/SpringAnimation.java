package androidx.dynamicanimation.animation;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import androidx.dynamicanimation.animation.DynamicAnimation;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class SpringAnimation extends DynamicAnimation<SpringAnimation> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private SpringForce f38306g;
    private boolean iF;
    private float te;

    public SpringAnimation(FloatValueHolder floatValueHolder) {
        super(floatValueHolder);
        this.f38306g = null;
        this.te = Float.MAX_VALUE;
        this.iF = false;
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    void HI(float f3) {
    }

    private void S() {
        SpringForce springForce = this.f38306g;
        if (springForce == null) {
            throw new UnsupportedOperationException("Incomplete SpringAnimation: Either final position or a spring force needs to be set.");
        }
        double dN = springForce.n();
        if (dN > this.Uo) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (dN < this.KN) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
    }

    public SpringAnimation WPU(SpringForce springForce) {
        this.f38306g = springForce;
        return this;
    }

    boolean XQ(float f3, float f4) {
        return this.f38306g.t(f3, f4);
    }

    public boolean Z() {
        return this.f38306g.rl > 0.0d;
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    boolean r(long j2) {
        if (this.iF) {
            float f3 = this.te;
            if (f3 != Float.MAX_VALUE) {
                this.f38306g.O(f3);
                this.te = Float.MAX_VALUE;
            }
            this.rl = this.f38306g.n();
            this.f38297n = 0.0f;
            this.iF = false;
            return true;
        }
        if (this.te != Float.MAX_VALUE) {
            this.f38306g.n();
            long j3 = j2 / 2;
            DynamicAnimation.MassState massStateKN = this.f38306g.KN(this.rl, this.f38297n, j3);
            this.f38306g.O(this.te);
            this.te = Float.MAX_VALUE;
            DynamicAnimation.MassState massStateKN2 = this.f38306g.KN(massStateKN.f38300n, massStateKN.rl, j3);
            this.rl = massStateKN2.f38300n;
            this.f38297n = massStateKN2.rl;
        } else {
            DynamicAnimation.MassState massStateKN3 = this.f38306g.KN(this.rl, this.f38297n, j2);
            this.rl = massStateKN3.f38300n;
            this.f38297n = massStateKN3.rl;
        }
        float fMax = Math.max(this.rl, this.KN);
        this.rl = fMax;
        float fMin = Math.min(fMax, this.Uo);
        this.rl = fMin;
        if (!XQ(fMin, this.f38297n)) {
            return false;
        }
        this.rl = this.f38306g.n();
        this.f38297n = 0.0f;
        return true;
    }

    public void aYN() {
        if (Z()) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                if (this.J2) {
                    this.iF = true;
                    return;
                }
                return;
            }
            throw new AndroidRuntimeException("Animations may only be started on the main thread");
        }
        throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    public void ck() {
        S();
        this.f38306g.Uo(J2());
        super.ck();
    }

    public void o(float f3) {
        if (Uo()) {
            this.te = f3;
            return;
        }
        if (this.f38306g == null) {
            this.f38306g = new SpringForce(f3);
        }
        this.f38306g.O(f3);
        ck();
    }

    public SpringAnimation(Object obj, FloatPropertyCompat floatPropertyCompat) {
        super(obj, floatPropertyCompat);
        this.f38306g = null;
        this.te = Float.MAX_VALUE;
        this.iF = false;
    }
}
