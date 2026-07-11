package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
class Wre extends l3D {
    private final int J2;
    private final TimeInterpolator KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final int f59339O;
    private final TimeInterpolator Uo;
    private ValueAnimator az;
    private final View.OnFocusChangeListener gh;
    private final View.OnClickListener mUb;
    private AnimatorSet qie;
    private EditText xMQ;

    class j extends AnimatorListenerAdapter {
        j() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            Wre.this.rl.J(true);
        }
    }

    class n extends AnimatorListenerAdapter {
        n() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            Wre.this.rl.J(false);
        }
    }

    private ValueAnimator iF() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.8f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(this.KN);
        valueAnimatorOfFloat.setDuration(this.J2);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.I28
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Wre.ViF(this.f59267n, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    private boolean E2() {
        EditText editText = this.xMQ;
        if (editText != null) {
            return (editText.hasFocus() || this.nr.hasFocus()) && this.xMQ.getText().length() > 0;
        }
        return false;
    }

    public static /* synthetic */ void S(Wre wre, View view) {
        EditText editText = wre.xMQ;
        if (editText == null) {
            return;
        }
        Editable text = editText.getText();
        if (text != null) {
            text.clear();
        }
        wre.r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(boolean z2) {
        boolean z3 = this.rl.e() == z2;
        if (z2 && !this.qie.isRunning()) {
            this.az.cancel();
            this.qie.start();
            if (z3) {
                this.qie.end();
                return;
            }
            return;
        }
        if (z2) {
            return;
        }
        this.qie.cancel();
        this.az.start();
        if (z3) {
            this.az.end();
        }
    }

    @Override // com.google.android.material.textfield.l3D
    void Ik(boolean z2) {
        if (this.rl.WPU() == null) {
            return;
        }
        g(z2);
    }

    @Override // com.google.android.material.textfield.l3D
    View.OnClickListener J2() {
        return this.mUb;
    }

    @Override // com.google.android.material.textfield.l3D
    View.OnFocusChangeListener O() {
        return this.gh;
    }

    @Override // com.google.android.material.textfield.l3D
    View.OnFocusChangeListener Uo() {
        return this.gh;
    }

    @Override // com.google.android.material.textfield.l3D
    void XQ() {
        EditText editText = this.xMQ;
        if (editText != null) {
            editText.post(new Runnable() { // from class: com.google.android.material.textfield.Ml
                @Override // java.lang.Runnable
                public final void run() {
                    this.f59268n.g(true);
                }
            });
        }
    }

    @Override // com.google.android.material.textfield.l3D
    void n(Editable editable) {
        if (this.rl.WPU() != null) {
            return;
        }
        g(E2());
    }

    @Override // com.google.android.material.textfield.l3D
    int nr() {
        return Rxk.I28.mUb;
    }

    @Override // com.google.android.material.textfield.l3D
    int t() {
        return Rxk.aC.f8775O;
    }

    @Override // com.google.android.material.textfield.l3D
    public void ty(EditText editText) {
        this.xMQ = editText;
        this.f59358n.setEndIconVisible(E2());
    }

    Wre(QJ qj) {
        super(qj);
        this.mUb = new View.OnClickListener() { // from class: com.google.android.material.textfield.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Wre.S(this.f59357n, view);
            }
        };
        this.gh = new View.OnFocusChangeListener() { // from class: com.google.android.material.textfield.n
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z2) {
                Wre wre = this.f59360n;
                wre.g(wre.E2());
            }
        };
        Context context = qj.getContext();
        int i2 = Rxk.n.f8803X;
        this.f59339O = IzQ.fuX.J2(context, i2, 100);
        this.J2 = IzQ.fuX.J2(qj.getContext(), i2, 150);
        this.Uo = IzQ.fuX.Uo(qj.getContext(), Rxk.n.s7N, G7.j.f3385n);
        this.KN = IzQ.fuX.Uo(qj.getContext(), Rxk.n.nHg, G7.j.nr);
    }

    public static /* synthetic */ void ViF(Wre wre, ValueAnimator valueAnimator) {
        wre.getClass();
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        wre.nr.setScaleX(fFloatValue);
        wre.nr.setScaleY(fFloatValue);
    }

    public static /* synthetic */ void aYN(Wre wre, ValueAnimator valueAnimator) {
        wre.getClass();
        wre.nr.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    private void fD() {
        ValueAnimator valueAnimatorIF = iF();
        ValueAnimator valueAnimatorTe = te(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.qie = animatorSet;
        animatorSet.playTogether(valueAnimatorIF, valueAnimatorTe);
        this.qie.addListener(new j());
        ValueAnimator valueAnimatorTe2 = te(1.0f, 0.0f);
        this.az = valueAnimatorTe2;
        valueAnimatorTe2.addListener(new n());
    }

    private ValueAnimator te(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.Uo);
        valueAnimatorOfFloat.setDuration(this.f59339O);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.w6
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                Wre.aYN(this.f59377n, valueAnimator);
            }
        });
        return valueAnimatorOfFloat;
    }

    @Override // com.google.android.material.textfield.l3D
    void o() {
        fD();
    }
}
