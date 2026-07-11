package androidx.dynamicanimation.animation;

import androidx.dynamicanimation.animation.DynamicAnimation;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class FlingAnimation extends DynamicAnimation<FlingAnimation> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final DragForce f38301g;

    static final class DragForce implements Force {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private float f38302n;
        private float rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final DynamicAnimation.MassState f38303t;

        void rl(float f3) {
            this.rl = f3 * 62.5f;
        }

        DynamicAnimation.MassState t(float f3, float f4, long j2) {
            float f5 = j2;
            this.f38303t.rl = (float) (((double) f4) * Math.exp((f5 / 1000.0f) * this.f38302n));
            DynamicAnimation.MassState massState = this.f38303t;
            float f6 = this.f38302n;
            massState.f38300n = (float) (((double) (f3 - (f4 / f6))) + (((double) (f4 / f6)) * Math.exp((f6 * f5) / 1000.0f)));
            DynamicAnimation.MassState massState2 = this.f38303t;
            if (n(massState2.f38300n, massState2.rl)) {
                this.f38303t.rl = 0.0f;
            }
            return this.f38303t;
        }

        public boolean n(float f3, float f4) {
            if (Math.abs(f4) < this.rl) {
                return true;
            }
            return false;
        }
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    void HI(float f3) {
        this.f38301g.rl(f3);
    }

    boolean o(float f3, float f4) {
        return f3 >= this.Uo || f3 <= this.KN || this.f38301g.n(f3, f4);
    }

    @Override // androidx.dynamicanimation.animation.DynamicAnimation
    boolean r(long j2) {
        DynamicAnimation.MassState massStateT = this.f38301g.t(this.rl, this.f38297n, j2);
        float f3 = massStateT.f38300n;
        this.rl = f3;
        float f4 = massStateT.rl;
        this.f38297n = f4;
        float f5 = this.KN;
        if (f3 < f5) {
            this.rl = f5;
            return true;
        }
        float f6 = this.Uo;
        if (f3 <= f6) {
            return o(f3, f4);
        }
        this.rl = f6;
        return true;
    }
}
