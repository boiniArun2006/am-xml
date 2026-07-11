package com.google.android.material.progressindicator;

import YgZ.uQga.IYJfqUyym;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
abstract class fuX extends Drawable implements Animatable2Compat {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final Property f59094v = new w6(Float.class, "growFraction");
    private Animatable2Compat.AnimationCallback E2;
    private ValueAnimator J2;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private int f59095N;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private float f59097S;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private float f59099X;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private boolean f59100Z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f59101e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List f59102g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final Context f59103n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f59104o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ValueAnimator f59105r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final com.google.android.material.progressindicator.n f59106t;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    final Paint f59098T = new Paint();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    Dc4.j f59096O = new Dc4.j();

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    class j extends AnimatorListenerAdapter {
        j() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            fuX.this.J2();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    class n extends AnimatorListenerAdapter {
        n() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            fuX.super.setVisible(false, false);
            fuX.this.O();
        }
    }

    private void qie() {
        if (this.J2 == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<fuX, Float>) f59094v, 0.0f, 1.0f);
            this.J2 = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(500L);
            this.J2.setInterpolator(G7.j.rl);
            ck(this.J2);
        }
        if (this.f59105r == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, (Property<fuX, Float>) f59094v, 1.0f, 0.0f);
            this.f59105r = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(500L);
            this.f59105r.setInterpolator(G7.j.rl);
            HI(this.f59105r);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z2, boolean z3) {
        return Ik(z2, z3, true);
    }

    public void start() {
        r(true, true, false);
    }

    public void stop() {
        r(false, true, false);
    }

    public boolean xMQ() {
        return Ik(false, false, false);
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    class w6 extends Property {
        w6(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public Float get(fuX fux) {
            return Float.valueOf(fux.KN());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
        public void set(fuX fux, Float f3) {
            fux.ty(f3.floatValue());
        }
    }

    private void HI(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f59105r;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
        }
        this.f59105r = valueAnimator;
        valueAnimator.addListener(new n());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J2() {
        Animatable2Compat.AnimationCallback animationCallback = this.E2;
        if (animationCallback != null) {
            animationCallback.t(this);
        }
        List list = this.f59102g;
        if (list == null || this.f59101e) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Animatable2Compat.AnimationCallback) it.next()).t(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O() {
        Animatable2Compat.AnimationCallback animationCallback = this.E2;
        if (animationCallback != null) {
            animationCallback.rl(this);
        }
        List list = this.f59102g;
        if (list == null || this.f59101e) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Animatable2Compat.AnimationCallback) it.next()).rl(this);
        }
    }

    private void Uo(ValueAnimator... valueAnimatorArr) {
        boolean z2 = this.f59101e;
        this.f59101e = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.end();
        }
        this.f59101e = z2;
    }

    private void ck(ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.J2;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException(IYJfqUyym.uOuFnjaflJfPC);
        }
        this.J2 = valueAnimator;
        valueAnimator.addListener(new j());
    }

    private void nr(ValueAnimator... valueAnimatorArr) {
        boolean z2 = this.f59101e;
        this.f59101e = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.cancel();
        }
        this.f59101e = z2;
    }

    public boolean Ik(boolean z2, boolean z3, boolean z4) {
        return r(z2, z3, z4 && this.f59096O.n(this.f59103n.getContentResolver()) > 0.0f);
    }

    float KN() {
        if (this.f59106t.rl() || this.f59106t.n()) {
            return (this.f59100Z || this.f59104o) ? this.f59097S : this.f59099X;
        }
        return 1.0f;
    }

    public void az(Animatable2Compat.AnimationCallback animationCallback) {
        if (this.f59102g == null) {
            this.f59102g = new ArrayList();
        }
        if (this.f59102g.contains(animationCallback)) {
            return;
        }
        this.f59102g.add(animationCallback);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f59095N;
    }

    public boolean gh() {
        ValueAnimator valueAnimator = this.J2;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.f59104o;
    }

    public boolean mUb() {
        ValueAnimator valueAnimator = this.f59105r;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.f59100Z;
    }

    public boolean o(Animatable2Compat.AnimationCallback animationCallback) {
        List list = this.f59102g;
        if (list == null || !list.contains(animationCallback)) {
            return false;
        }
        this.f59102g.remove(animationCallback);
        if (!this.f59102g.isEmpty()) {
            return true;
        }
        this.f59102g = null;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.f59095N = i2;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f59098T.setColorFilter(colorFilter);
        invalidateSelf();
    }

    void ty(float f3) {
        if (this.f59099X != f3) {
            this.f59099X = f3;
            invalidateSelf();
        }
    }

    fuX(Context context, com.google.android.material.progressindicator.n nVar) {
        this.f59103n = context;
        this.f59106t = nVar;
        setAlpha(255);
    }

    public boolean isRunning() {
        if (!gh() && !mUb()) {
            return false;
        }
        return true;
    }

    boolean r(boolean z2, boolean z3, boolean z4) {
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        boolean zN;
        qie();
        boolean z5 = false;
        if (!isVisible() && !z2) {
            return false;
        }
        if (z2) {
            valueAnimator = this.J2;
        } else {
            valueAnimator = this.f59105r;
        }
        if (z2) {
            valueAnimator2 = this.f59105r;
        } else {
            valueAnimator2 = this.J2;
        }
        if (!z4) {
            if (valueAnimator2.isRunning()) {
                nr(valueAnimator2);
            }
            if (valueAnimator.isRunning()) {
                valueAnimator.end();
            } else {
                Uo(valueAnimator);
            }
            return super.setVisible(z2, false);
        }
        if (valueAnimator.isRunning()) {
            return false;
        }
        if (!z2 || super.setVisible(z2, false)) {
            z5 = true;
        }
        if (z2) {
            zN = this.f59106t.rl();
        } else {
            zN = this.f59106t.n();
        }
        if (!zN) {
            Uo(valueAnimator);
            return z5;
        }
        if (!z3 && valueAnimator.isPaused()) {
            valueAnimator.resume();
            return z5;
        }
        valueAnimator.start();
        return z5;
    }
}
