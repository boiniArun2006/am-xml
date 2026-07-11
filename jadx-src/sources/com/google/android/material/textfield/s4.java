package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class s4 {
    private int HI;
    private boolean Ik;
    private final TimeInterpolator J2;
    private final TextInputLayout KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final TimeInterpolator f59364O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private ColorStateList f59365S;
    private final Context Uo;
    private TextView ViF;
    private CharSequence WPU;
    private int XQ;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private int f59366Z;
    private boolean aYN;
    private final float az;
    private CharSequence ck;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ColorStateList f59367g;
    private FrameLayout gh;
    private int mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f59368n;
    private int nY;
    private final TimeInterpolator nr;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private CharSequence f59369o;
    private Animator qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private TextView f59370r;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f59371t;
    private Typeface te;
    private int ty;
    private LinearLayout xMQ;

    class j extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f59373n;
        final /* synthetic */ TextView nr;
        final /* synthetic */ TextView rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f59374t;

        j(int i2, TextView textView, int i3, TextView textView2) {
            this.f59373n = i2;
            this.rl = textView;
            this.f59374t = i3;
            this.nr = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            s4.this.ty = this.f59373n;
            s4.this.qie = null;
            TextView textView = this.rl;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f59374t == 1 && s4.this.f59370r != null) {
                    s4.this.f59370r.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.nr;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.nr.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.nr;
            if (textView != null) {
                textView.setVisibility(0);
                this.nr.setAlpha(0.0f);
            }
        }
    }

    class n extends View.AccessibilityDelegate {
        n() {
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            EditText editText = s4.this.KN.getEditText();
            if (editText != null) {
                accessibilityNodeInfo.setLabeledBy(editText);
            }
        }
    }

    private boolean ViF(int i2) {
        return (i2 != 1 || this.f59370r == null || TextUtils.isEmpty(this.ck)) ? false : true;
    }

    private TextView az(int i2) {
        if (i2 == 1) {
            return this.f59370r;
        }
        if (i2 != 2) {
            return null;
        }
        return this.ViF;
    }

    void WPU() {
        this.ck = null;
        KN();
        if (this.ty == 1) {
            if (!this.aYN || TextUtils.isEmpty(this.WPU)) {
                this.HI = 0;
            } else {
                this.HI = 2;
            }
        }
        P5(this.ty, this.HI, Xw(this.f59370r, ""));
    }

    boolean nY(int i2) {
        return i2 == 0 || i2 == 1;
    }

    private void P5(int i2, int i3, boolean z2) {
        s4 s4Var;
        if (i2 == i3) {
            return;
        }
        if (z2) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.qie = animatorSet;
            ArrayList arrayList = new ArrayList();
            s4Var = this;
            s4Var.xMQ(arrayList, this.aYN, this.ViF, 2, i2, i3);
            s4Var.xMQ(arrayList, s4Var.Ik, s4Var.f59370r, 1, i2, i3);
            G7.n.n(animatorSet, arrayList);
            animatorSet.addListener(s4Var.new j(i3, az(i2), i2, az(i3)));
            animatorSet.start();
        } else {
            s4Var = this;
            fD(i2, i3);
        }
        s4Var.KN.eTf();
        s4Var.KN.Mx(z2);
        s4Var.KN.Jk();
    }

    private int S(boolean z2, int i2, int i3) {
        return z2 ? this.Uo.getResources().getDimensionPixelSize(i2) : i3;
    }

    private boolean Uo() {
        return (this.xMQ == null || this.KN.getEditText() == null) ? false : true;
    }

    private boolean Xw(TextView textView, CharSequence charSequence) {
        if (ViewCompat.P5(this.KN) && this.KN.isEnabled()) {
            return (this.HI == this.ty && textView != null && TextUtils.equals(textView.getText(), charSequence)) ? false : true;
        }
        return false;
    }

    private void bzg(ViewGroup viewGroup, int i2) {
        if (i2 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    private void fD(int i2, int i3) {
        TextView textViewAz;
        TextView textViewAz2;
        if (i2 == i3) {
            return;
        }
        if (i3 != 0 && (textViewAz2 = az(i3)) != null) {
            textViewAz2.setVisibility(0);
            textViewAz2.setAlpha(1.0f);
        }
        if (i2 != 0 && (textViewAz = az(i2)) != null) {
            textViewAz.setVisibility(4);
            if (i2 == 1) {
                textViewAz.setText((CharSequence) null);
            }
        }
        this.ty = i3;
    }

    private ObjectAnimator gh(TextView textView) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.az, 0.0f);
        objectAnimatorOfFloat.setDuration(this.f59368n);
        objectAnimatorOfFloat.setInterpolator(this.nr);
        return objectAnimatorOfFloat;
    }

    private ObjectAnimator mUb(TextView textView, boolean z2) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z2 ? 1.0f : 0.0f);
        objectAnimatorOfFloat.setDuration(z2 ? this.rl : this.f59371t);
        objectAnimatorOfFloat.setInterpolator(z2 ? this.f59364O : this.J2);
        return objectAnimatorOfFloat;
    }

    private void v(TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    private void xMQ(List list, boolean z2, TextView textView, int i2, int i3, int i5) {
        if (textView == null || !z2) {
            return;
        }
        if (i2 == i5 || i2 == i3) {
            ObjectAnimator objectAnimatorMUb = mUb(textView, i5 == i2);
            if (i2 == i5 && i3 != 0) {
                objectAnimatorMUb.setStartDelay(this.f59371t);
            }
            list.add(objectAnimatorMUb);
            if (i5 != i2 || i3 == 0) {
                return;
            }
            ObjectAnimator objectAnimatorGh = gh(textView);
            objectAnimatorGh.setStartDelay(this.f59371t);
            list.add(objectAnimatorGh);
        }
    }

    void E2(int i2) {
        this.f59366Z = i2;
        TextView textView = this.f59370r;
        if (textView != null) {
            ViewCompat.pJg(textView, i2);
        }
    }

    CharSequence HI() {
        return this.f59369o;
    }

    int Ik() {
        TextView textView = this.f59370r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    void KN() {
        Animator animator = this.qie;
        if (animator != null) {
            animator.cancel();
        }
    }

    void N(ColorStateList colorStateList) {
        this.f59365S = colorStateList;
        TextView textView = this.f59370r;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    void O(TextView textView, int i2) {
        if (this.xMQ == null && this.gh == null) {
            LinearLayout linearLayout = new LinearLayout(this.Uo);
            this.xMQ = linearLayout;
            linearLayout.setOrientation(0);
            this.KN.addView(this.xMQ, -1, -2);
            this.gh = new FrameLayout(this.Uo);
            this.xMQ.addView(this.gh, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.KN.getEditText() != null) {
                J2();
            }
        }
        if (nY(i2)) {
            this.gh.setVisibility(0);
            this.gh.addView(textView);
        } else {
            this.xMQ.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.xMQ.setVisibility(0);
        this.mUb++;
    }

    void T(int i2) {
        this.XQ = i2;
        TextView textView = this.f59370r;
        if (textView != null) {
            this.KN.J(textView, i2);
        }
    }

    void X(boolean z2) {
        if (this.Ik == z2) {
            return;
        }
        KN();
        if (z2) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.Uo);
            this.f59370r = appCompatTextView;
            appCompatTextView.setId(Rxk.Wre.wTp);
            this.f59370r.setTextAlignment(5);
            Typeface typeface = this.te;
            if (typeface != null) {
                this.f59370r.setTypeface(typeface);
            }
            T(this.XQ);
            N(this.f59365S);
            e(this.f59369o);
            E2(this.f59366Z);
            this.f59370r.setVisibility(4);
            O(this.f59370r, 0);
        } else {
            WPU();
            iF(this.f59370r, 0);
            this.f59370r = null;
            this.KN.eTf();
            this.KN.Jk();
        }
        this.Ik = z2;
    }

    int XQ() {
        TextView textView = this.ViF;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    View Z() {
        return this.ViF;
    }

    CharSequence ck() {
        return this.ck;
    }

    void e(CharSequence charSequence) {
        this.f59369o = charSequence;
        TextView textView = this.f59370r;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    boolean g() {
        return this.Ik;
    }

    void iF(TextView textView, int i2) {
        FrameLayout frameLayout;
        if (this.xMQ == null) {
            return;
        }
        if (!nY(i2) || (frameLayout = this.gh) == null) {
            this.xMQ.removeView(textView);
        } else {
            frameLayout.removeView(textView);
        }
        int i3 = this.mUb - 1;
        this.mUb = i3;
        bzg(this.xMQ, i3);
    }

    void nHg(int i2) {
        this.nY = i2;
        TextView textView = this.ViF;
        if (textView != null) {
            TextViewCompat.Ik(textView, i2);
        }
    }

    CharSequence o() {
        return this.WPU;
    }

    boolean qie() {
        return ViF(this.HI);
    }

    ColorStateList r() {
        TextView textView = this.f59370r;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    void rV9(Typeface typeface) {
        if (typeface != this.te) {
            this.te = typeface;
            v(this.f59370r, typeface);
            v(this.ViF, typeface);
        }
    }

    void s7N(boolean z2) {
        if (this.aYN == z2) {
            return;
        }
        KN();
        if (z2) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.Uo);
            this.ViF = appCompatTextView;
            appCompatTextView.setId(Rxk.Wre.f8774v);
            this.ViF.setTextAlignment(5);
            Typeface typeface = this.te;
            if (typeface != null) {
                this.ViF.setTypeface(typeface);
            }
            this.ViF.setVisibility(4);
            ViewCompat.pJg(this.ViF, 1);
            nHg(this.nY);
            wTp(this.f59367g);
            O(this.ViF, 1);
            this.ViF.setAccessibilityDelegate(new n());
        } else {
            aYN();
            iF(this.ViF, 1);
            this.ViF = null;
            this.KN.eTf();
            this.KN.Jk();
        }
        this.aYN = z2;
    }

    boolean te() {
        return this.aYN;
    }

    int ty() {
        return this.f59366Z;
    }

    void wTp(ColorStateList colorStateList) {
        this.f59367g = colorStateList;
        TextView textView = this.ViF;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    public s4(TextInputLayout textInputLayout) {
        Context context = textInputLayout.getContext();
        this.Uo = context;
        this.KN = textInputLayout;
        this.az = context.getResources().getDimensionPixelSize(Rxk.Ml.KN);
        int i2 = Rxk.n.f8801T;
        this.f59368n = IzQ.fuX.J2(context, i2, Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE);
        this.rl = IzQ.fuX.J2(context, Rxk.n.E2, 167);
        this.f59371t = IzQ.fuX.J2(context, i2, 167);
        int i3 = Rxk.n.f8798N;
        this.nr = IzQ.fuX.Uo(context, i3, G7.j.nr);
        TimeInterpolator timeInterpolator = G7.j.f3385n;
        this.f59364O = IzQ.fuX.Uo(context, i3, timeInterpolator);
        this.J2 = IzQ.fuX.Uo(context, Rxk.n.s7N, timeInterpolator);
    }

    void J2() {
        if (Uo()) {
            EditText editText = this.KN.getEditText();
            boolean zKN = X4.w6.KN(this.Uo);
            LinearLayout linearLayout = this.xMQ;
            int i2 = Rxk.Ml.f8746T;
            ViewCompat.HV(linearLayout, S(zKN, i2, ViewCompat.E2(editText)), S(zKN, Rxk.Ml.f8743N, this.Uo.getResources().getDimensionPixelSize(Rxk.Ml.f8748X)), S(zKN, i2, ViewCompat.fD(editText)), 0);
        }
    }

    void U(CharSequence charSequence) {
        KN();
        this.WPU = charSequence;
        this.ViF.setText(charSequence);
        int i2 = this.ty;
        if (i2 != 2) {
            this.HI = 2;
        }
        P5(i2, this.HI, Xw(this.ViF, charSequence));
    }

    void aYN() {
        KN();
        int i2 = this.ty;
        if (i2 == 2) {
            this.HI = 0;
        }
        P5(i2, this.HI, Xw(this.ViF, ""));
    }

    void jB(CharSequence charSequence) {
        KN();
        this.ck = charSequence;
        this.f59370r.setText(charSequence);
        int i2 = this.ty;
        if (i2 != 1) {
            this.HI = 1;
        }
        P5(i2, this.HI, Xw(this.f59370r, charSequence));
    }
}
