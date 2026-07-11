package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.material.progressindicator.Dsr;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class Ml extends aC {
    private final com.google.android.material.progressindicator.n J2;
    private float KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final FastOutSlowInInterpolator f59085O;
    private int Uo;
    Animatable2Compat.AnimationCallback mUb;
    private ObjectAnimator nr;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ObjectAnimator f59086t;
    private float xMQ;
    private static final int[] gh = {0, 1350, 2700, 4050};
    private static final int[] qie = {667, 2017, 3367, 4717};
    private static final int[] az = {1000, 2350, 3700, 5050};
    private static final Property ty = new w6(Float.class, "animationFraction");
    private static final Property HI = new C0788Ml(Float.class, "completeEndFraction");

    class j extends AnimatorListenerAdapter {
        j() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            Ml ml = Ml.this;
            ml.Uo = (ml.Uo + 4) % Ml.this.J2.f59124t.length;
        }
    }

    class n extends AnimatorListenerAdapter {
        n() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            Ml.this.n();
            Ml ml = Ml.this;
            Animatable2Compat.AnimationCallback animationCallback = ml.mUb;
            if (animationCallback != null) {
                animationCallback.rl(ml.f59093n);
            }
        }
    }

    public Ml(Wre wre) {
        super(1);
        this.Uo = 0;
        this.mUb = null;
        this.J2 = wre;
        this.f59085O = new FastOutSlowInInterpolator();
    }

    private void Ik() {
        if (this.f59086t == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<Ml, Float>) ty, 0.0f, 1.0f);
            this.f59086t = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(5400L);
            this.f59086t.setInterpolator(null);
            this.f59086t.setRepeatCount(-1);
            this.f59086t.addListener(new j());
        }
        if (this.nr == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, (Property<Ml, Float>) HI, 0.0f, 1.0f);
            this.nr = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(333L);
            this.nr.setInterpolator(this.f59085O);
            this.nr.addListener(new n());
        }
    }

    private void r(int i2) {
        for (int i3 = 0; i3 < 4; i3++) {
            float fRl = rl(i2, az[i3], 333);
            if (fRl >= 0.0f && fRl <= 1.0f) {
                int i5 = i3 + this.Uo;
                int[] iArr = this.J2.f59124t;
                int length = i5 % iArr.length;
                int length2 = (length + 1) % iArr.length;
                int i7 = iArr[length];
                int i8 = iArr[length2];
                ((Dsr.j) this.rl.get(0)).f59082t = G7.w6.rl().evaluate(this.f59085O.getInterpolation(fRl), Integer.valueOf(i7), Integer.valueOf(i8)).intValue();
                return;
            }
        }
    }

    @Override // com.google.android.material.progressindicator.aC
    public void KN() {
        this.mUb = null;
    }

    void o() {
        this.Uo = 0;
        ((Dsr.j) this.rl.get(0)).f59082t = this.J2.f59124t[0];
        this.xMQ = 0.0f;
    }

    /* JADX INFO: renamed from: com.google.android.material.progressindicator.Ml$Ml, reason: collision with other inner class name */
    class C0788Ml extends Property {
        C0788Ml(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Float get(Ml ml) {
            return Float.valueOf(ml.ck());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public void set(Ml ml, Float f3) {
            ml.XQ(f3.floatValue());
        }
    }

    class w6 extends Property {
        w6(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Float get(Ml ml) {
            return Float.valueOf(ml.HI());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public void set(Ml ml, Float f3) {
            ml.Z(f3.floatValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float HI() {
        return this.KN;
    }

    private void S(int i2) {
        Dsr.j jVar = (Dsr.j) this.rl.get(0);
        float f3 = this.KN;
        jVar.f59081n = (f3 * 1520.0f) - 20.0f;
        jVar.rl = f3 * 1520.0f;
        for (int i3 = 0; i3 < 4; i3++) {
            jVar.rl += this.f59085O.getInterpolation(rl(i2, gh[i3], 667)) * 250.0f;
            jVar.f59081n += this.f59085O.getInterpolation(rl(i2, qie[i3], 667)) * 250.0f;
        }
        float f4 = jVar.f59081n;
        float f5 = jVar.rl;
        jVar.f59081n = (f4 + ((f5 - f4) * this.xMQ)) / 360.0f;
        jVar.rl = f5 / 360.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void XQ(float f3) {
        this.xMQ = f3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float ck() {
        return this.xMQ;
    }

    @Override // com.google.android.material.progressindicator.aC
    void J2() {
        ObjectAnimator objectAnimator = this.nr;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (this.f59093n.isVisible()) {
            this.nr.start();
        } else {
            n();
        }
    }

    void Z(float f3) {
        this.KN = f3;
        int i2 = (int) (f3 * 5400.0f);
        S(i2);
        r(i2);
        this.f59093n.invalidateSelf();
    }

    @Override // com.google.android.material.progressindicator.aC
    void n() {
        ObjectAnimator objectAnimator = this.f59086t;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.aC
    public void nr(Animatable2Compat.AnimationCallback animationCallback) {
        this.mUb = animationCallback;
    }

    @Override // com.google.android.material.progressindicator.aC
    void Uo() {
        Ik();
        o();
        this.f59086t.start();
    }

    @Override // com.google.android.material.progressindicator.aC
    public void t() {
        o();
    }
}
