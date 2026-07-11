package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.animation.Interpolator;
import androidx.core.math.MathUtils;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import androidx.vectordrawable.graphics.drawable.AnimationUtilsCompat;
import com.google.android.material.progressindicator.Dsr;
import java.util.Iterator;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class Pl extends aC {
    private final com.google.android.material.progressindicator.n J2;
    private boolean KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Interpolator[] f59089O;
    private int Uo;
    Animatable2Compat.AnimationCallback mUb;
    private ObjectAnimator nr;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private ObjectAnimator f59090t;
    private float xMQ;
    private static final int[] gh = {533, 567, 850, 750};
    private static final int[] qie = {1267, 1000, 333, 0};
    private static final Property az = new w6(Float.class, "animationFraction");

    class j extends AnimatorListenerAdapter {
        j() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            Pl pl = Pl.this;
            pl.Uo = (pl.Uo + 1) % Pl.this.J2.f59124t.length;
            Pl.this.KN = true;
        }
    }

    class n extends AnimatorListenerAdapter {
        n() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            Pl.this.n();
            Pl pl = Pl.this;
            Animatable2Compat.AnimationCallback animationCallback = pl.mUb;
            if (animationCallback != null) {
                animationCallback.rl(pl.f59093n);
            }
        }
    }

    public Pl(Context context, Xo xo) {
        super(2);
        this.Uo = 0;
        this.mUb = null;
        this.J2 = xo;
        this.f59089O = new Interpolator[]{AnimationUtilsCompat.n(context, Rxk.j.f8791n), AnimationUtilsCompat.n(context, Rxk.j.rl), AnimationUtilsCompat.n(context, Rxk.j.f8792t), AnimationUtilsCompat.n(context, Rxk.j.nr)};
    }

    private void o(int i2) {
        for (int i3 = 0; i3 < this.rl.size(); i3++) {
            Dsr.j jVar = (Dsr.j) this.rl.get(i3);
            int[] iArr = qie;
            int i5 = i3 * 2;
            int i7 = iArr[i5];
            int[] iArr2 = gh;
            jVar.f59081n = MathUtils.n(this.f59089O[i5].getInterpolation(rl(i2, i7, iArr2[i5])), 0.0f, 1.0f);
            int i8 = i5 + 1;
            jVar.rl = MathUtils.n(this.f59089O[i8].getInterpolation(rl(i2, iArr[i8], iArr2[i8])), 0.0f, 1.0f);
        }
    }

    void Ik() {
        this.Uo = 0;
        Iterator it = this.rl.iterator();
        while (it.hasNext()) {
            ((Dsr.j) it.next()).f59082t = this.J2.f59124t[0];
        }
    }

    @Override // com.google.android.material.progressindicator.aC
    public void KN() {
        this.mUb = null;
    }

    class w6 extends Property {
        w6(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Float get(Pl pl) {
            return Float.valueOf(pl.ty());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public void set(Pl pl, Float f3) {
            pl.r(f3.floatValue());
        }
    }

    private void HI() {
        if (this.f59090t == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<Pl, Float>) az, 0.0f, 1.0f);
            this.f59090t = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(1800L);
            this.f59090t.setInterpolator(null);
            this.f59090t.setRepeatCount(-1);
            this.f59090t.addListener(new j());
        }
        if (this.nr == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, (Property<Pl, Float>) az, 1.0f);
            this.nr = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(1800L);
            this.nr.setInterpolator(null);
            this.nr.addListener(new n());
        }
    }

    private void ck() {
        if (this.KN) {
            Iterator it = this.rl.iterator();
            while (it.hasNext()) {
                ((Dsr.j) it.next()).f59082t = this.J2.f59124t[this.Uo];
            }
            this.KN = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float ty() {
        return this.xMQ;
    }

    @Override // com.google.android.material.progressindicator.aC
    public void J2() {
        ObjectAnimator objectAnimator = this.nr;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        n();
        if (this.f59093n.isVisible()) {
            this.nr.setFloatValues(this.xMQ, 1.0f);
            this.nr.setDuration((long) ((1.0f - this.xMQ) * 1800.0f));
            this.nr.start();
        }
    }

    @Override // com.google.android.material.progressindicator.aC
    public void n() {
        ObjectAnimator objectAnimator = this.f59090t;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.aC
    public void nr(Animatable2Compat.AnimationCallback animationCallback) {
        this.mUb = animationCallback;
    }

    void r(float f3) {
        this.xMQ = f3;
        o((int) (f3 * 1800.0f));
        ck();
        this.f59093n.invalidateSelf();
    }

    @Override // com.google.android.material.progressindicator.aC
    public void Uo() {
        HI();
        Ik();
        this.f59090t.start();
    }

    @Override // com.google.android.material.progressindicator.aC
    public void t() {
        Ik();
    }
}
