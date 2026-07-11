package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.material.progressindicator.Dsr;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class qz extends aC {
    private static final Property xMQ = new n(Float.class, "animationFraction");
    private int J2;
    private float KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final com.google.android.material.progressindicator.n f59127O;
    private boolean Uo;
    private FastOutSlowInInterpolator nr;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ObjectAnimator f59128t;

    class j extends AnimatorListenerAdapter {
        j() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            qz qzVar = qz.this;
            qzVar.J2 = (qzVar.J2 + 1) % qz.this.f59127O.f59124t.length;
            qz.this.Uo = true;
        }
    }

    public qz(Xo xo) {
        super(3);
        this.J2 = 1;
        this.f59127O = xo;
        this.nr = new FastOutSlowInInterpolator();
    }

    void Ik() {
        this.Uo = true;
        this.J2 = 1;
        for (Dsr.j jVar : this.rl) {
            com.google.android.material.progressindicator.n nVar = this.f59127O;
            jVar.f59082t = nVar.f59124t[0];
            jVar.nr = nVar.Uo / 2;
        }
    }

    @Override // com.google.android.material.progressindicator.aC
    public void J2() {
    }

    @Override // com.google.android.material.progressindicator.aC
    public void KN() {
    }

    @Override // com.google.android.material.progressindicator.aC
    public void nr(Animatable2Compat.AnimationCallback animationCallback) {
    }

    class n extends Property {
        n(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Float get(qz qzVar) {
            return Float.valueOf(qzVar.ty());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public void set(qz qzVar, Float f3) {
            qzVar.r(f3.floatValue());
        }
    }

    private void HI() {
        if (this.f59128t == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<qz, Float>) xMQ, 0.0f, 1.0f);
            this.f59128t = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(333L);
            this.f59128t.setInterpolator(null);
            this.f59128t.setRepeatCount(-1);
            this.f59128t.addListener(new j());
        }
    }

    private void ck() {
        if (!this.Uo || ((Dsr.j) this.rl.get(1)).rl >= 1.0f) {
            return;
        }
        ((Dsr.j) this.rl.get(2)).f59082t = ((Dsr.j) this.rl.get(1)).f59082t;
        ((Dsr.j) this.rl.get(1)).f59082t = ((Dsr.j) this.rl.get(0)).f59082t;
        ((Dsr.j) this.rl.get(0)).f59082t = this.f59127O.f59124t[this.J2];
        this.Uo = false;
    }

    private void o(int i2) {
        ((Dsr.j) this.rl.get(0)).f59081n = 0.0f;
        float fRl = rl(i2, 0, 667);
        Dsr.j jVar = (Dsr.j) this.rl.get(0);
        Dsr.j jVar2 = (Dsr.j) this.rl.get(1);
        float interpolation = this.nr.getInterpolation(fRl);
        jVar2.f59081n = interpolation;
        jVar.rl = interpolation;
        Dsr.j jVar3 = (Dsr.j) this.rl.get(1);
        Dsr.j jVar4 = (Dsr.j) this.rl.get(2);
        float interpolation2 = this.nr.getInterpolation(fRl + 0.49925038f);
        jVar4.f59081n = interpolation2;
        jVar3.rl = interpolation2;
        ((Dsr.j) this.rl.get(2)).rl = 1.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float ty() {
        return this.KN;
    }

    @Override // com.google.android.material.progressindicator.aC
    public void n() {
        ObjectAnimator objectAnimator = this.f59128t;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    void r(float f3) {
        this.KN = f3;
        o((int) (f3 * 333.0f));
        ck();
        this.f59093n.invalidateSelf();
    }

    @Override // com.google.android.material.progressindicator.aC
    public void Uo() {
        HI();
        Ik();
        this.f59128t.start();
    }

    @Override // com.google.android.material.progressindicator.aC
    public void t() {
        Ik();
    }
}
