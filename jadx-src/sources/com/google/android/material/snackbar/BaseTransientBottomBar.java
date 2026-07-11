package com.google.android.material.snackbar;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.internal.l3D;
import com.google.android.material.internal.s4;
import com.google.android.material.snackbar.w6;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class BaseTransientBottomBar {
    private int HI;
    private int Ik;
    private final TimeInterpolator J2;
    private final Context KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final TimeInterpolator f59162O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private List f59163S;
    private final ViewGroup Uo;
    private Behavior WPU;
    private boolean XQ;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private int f59164Z;
    private final AccessibilityManager aYN;
    private int ck;
    private int gh;
    private final com.google.android.material.snackbar.j mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f59165n;
    private final TimeInterpolator nr;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f59166o;
    private boolean qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f59167r;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f59168t;
    protected final QJ xMQ;
    private static final TimeInterpolator nY = G7.j.rl;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final TimeInterpolator f59161g = G7.j.f3385n;
    private static final TimeInterpolator te = G7.j.nr;
    private static final boolean fD = false;
    private static final int[] E2 = {Rxk.n.jB};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f59160e = BaseTransientBottomBar.class.getSimpleName();
    static final Handler iF = new Handler(Looper.getMainLooper(), new fuX());
    private boolean az = false;
    private final Runnable ty = new Dsr();
    w6.n ViF = new o();

    public static class Behavior extends SwipeDismissBehavior<View> {

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        private final z f59169X = new z(this);

        /* JADX INFO: Access modifiers changed from: private */
        public void p5(BaseTransientBottomBar baseTransientBottomBar) {
            this.f59169X.t(baseTransientBottomBar);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
        public boolean HI(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            this.f59169X.rl(coordinatorLayout, view, motionEvent);
            return super.HI(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior
        public boolean nHg(View view) {
            return this.f59169X.n(view);
        }
    }

    class C extends AccessibilityDelegateCompat {
        C() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean mUb(View view, int i2, Bundle bundle) {
            if (i2 != 1048576) {
                return super.mUb(view, i2, bundle);
            }
            BaseTransientBottomBar.this.aYN();
            return true;
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void Uo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.Uo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.n(1048576);
            accessibilityNodeInfoCompat.ul(true);
        }
    }

    class CN3 implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f59170n = 0;

        CN3() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.fD) {
                ViewCompat.FX(BaseTransientBottomBar.this.xMQ, iIntValue - this.f59170n);
            } else {
                BaseTransientBottomBar.this.xMQ.setTranslationY(iIntValue);
            }
            this.f59170n = iIntValue;
        }
    }

    class Dsr implements Runnable {
        Dsr() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseTransientBottomBar baseTransientBottomBar = BaseTransientBottomBar.this;
            if (baseTransientBottomBar.xMQ == null || baseTransientBottomBar.KN == null) {
                return;
            }
            int iHeight = (s4.n(BaseTransientBottomBar.this.KN).height() - BaseTransientBottomBar.this.X()) + ((int) BaseTransientBottomBar.this.xMQ.getTranslationY());
            if (iHeight >= BaseTransientBottomBar.this.f59166o) {
                BaseTransientBottomBar baseTransientBottomBar2 = BaseTransientBottomBar.this;
                baseTransientBottomBar2.f59164Z = baseTransientBottomBar2.f59166o;
                return;
            }
            ViewGroup.LayoutParams layoutParams = BaseTransientBottomBar.this.xMQ.getLayoutParams();
            if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                Log.w(BaseTransientBottomBar.f59160e, "Unable to apply gesture inset because layout params are not MarginLayoutParams");
                return;
            }
            BaseTransientBottomBar baseTransientBottomBar3 = BaseTransientBottomBar.this;
            baseTransientBottomBar3.f59164Z = baseTransientBottomBar3.f59166o;
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin += BaseTransientBottomBar.this.f59166o - iHeight;
            BaseTransientBottomBar.this.xMQ.requestLayout();
        }
    }

    class I28 implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f59172n;
        final /* synthetic */ int rl;

        I28(int i2) {
            this.rl = i2;
            this.f59172n = i2;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
            if (BaseTransientBottomBar.fD) {
                ViewCompat.FX(BaseTransientBottomBar.this.xMQ, iIntValue - this.f59172n);
            } else {
                BaseTransientBottomBar.this.xMQ.setTranslationY(iIntValue);
            }
            this.f59172n = iIntValue;
        }
    }

    class Ml extends AnimatorListenerAdapter {
        Ml() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.Xw();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.mUb.n(BaseTransientBottomBar.this.f59168t - BaseTransientBottomBar.this.f59165n, BaseTransientBottomBar.this.f59165n);
        }
    }

    class Pl implements SwipeDismissBehavior.w6 {
        Pl() {
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.w6
        public void rl(int i2) {
            if (i2 == 0) {
                com.google.android.material.snackbar.w6.t().gh(BaseTransientBottomBar.this.ViF);
            } else if (i2 == 1 || i2 == 2) {
                com.google.android.material.snackbar.w6.t().mUb(BaseTransientBottomBar.this.ViF);
            }
        }

        @Override // com.google.android.material.behavior.SwipeDismissBehavior.w6
        public void n(View view) {
            if (view.getParent() != null) {
                view.setVisibility(8);
            }
            BaseTransientBottomBar.this.ViF(0);
        }
    }

    protected static class QJ extends FrameLayout {

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        private static final View.OnTouchListener f59176N = new j();
        private PorterDuff.Mode E2;
        private final float J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private int f59177O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        private final int f59178S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        private boolean f59179T;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Rect f59180e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private ColorStateList f59181g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private BaseTransientBottomBar f59182n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final int f59183o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private final float f59184r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        mfo.C f59185t;

        protected QJ(Context context, AttributeSet attributeSet) {
            super(scw.j.t(context, attributeSet, 0, 0), attributeSet);
            Context context2 = getContext();
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, Rxk.o.Su);
            if (typedArrayObtainStyledAttributes.hasValue(Rxk.o.Q0)) {
                ViewCompat.fcU(this, typedArrayObtainStyledAttributes.getDimensionPixelSize(r2, 0));
            }
            this.f59177O = typedArrayObtainStyledAttributes.getInt(Rxk.o.f8835ON, 0);
            if (typedArrayObtainStyledAttributes.hasValue(Rxk.o.hJ4) || typedArrayObtainStyledAttributes.hasValue(Rxk.o.uQo)) {
                this.f59185t = mfo.C.O(context2, attributeSet, 0, 0).az();
            }
            this.J2 = typedArrayObtainStyledAttributes.getFloat(Rxk.o.vH3, 1.0f);
            setBackgroundTintList(X4.w6.n(context2, typedArrayObtainStyledAttributes, Rxk.o.NqA));
            setBackgroundTintMode(l3D.KN(typedArrayObtainStyledAttributes.getInt(Rxk.o.IL, -1), PorterDuff.Mode.SRC_IN));
            this.f59184r = typedArrayObtainStyledAttributes.getFloat(Rxk.o.Vm, 1.0f);
            this.f59183o = typedArrayObtainStyledAttributes.getDimensionPixelSize(Rxk.o.ybf, -1);
            this.f59178S = typedArrayObtainStyledAttributes.getDimensionPixelSize(Rxk.o.C5, -1);
            typedArrayObtainStyledAttributes.recycle();
            setOnTouchListener(f59176N);
            setFocusable(true);
            if (getBackground() == null) {
                ViewCompat.C(this, nr());
            }
        }

        void t(ViewGroup viewGroup) {
            this.f59179T = true;
            viewGroup.addView(this);
            this.f59179T = false;
        }

        class j implements View.OnTouchListener {
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                return true;
            }

            j() {
            }
        }

        private void O(ViewGroup.MarginLayoutParams marginLayoutParams) {
            this.f59180e = new Rect(marginLayoutParams.leftMargin, marginLayoutParams.topMargin, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
        }

        private Drawable nr() {
            int iGh = W3.j.gh(this, Rxk.n.ty, Rxk.n.gh, getBackgroundOverlayColorAlpha());
            mfo.C c2 = this.f59185t;
            Drawable drawableWPU = c2 != null ? BaseTransientBottomBar.WPU(iGh, c2) : BaseTransientBottomBar.S(iGh, getResources());
            if (this.f59181g == null) {
                return DrawableCompat.r(drawableWPU);
            }
            Drawable drawableR = DrawableCompat.r(drawableWPU);
            DrawableCompat.HI(drawableR, this.f59181g);
            return drawableR;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBaseTransientBottomBar(BaseTransientBottomBar baseTransientBottomBar) {
            this.f59182n = baseTransientBottomBar;
        }

        float getActionTextColorAlpha() {
            return this.f59184r;
        }

        int getAnimationMode() {
            return this.f59177O;
        }

        float getBackgroundOverlayColorAlpha() {
            return this.J2;
        }

        int getMaxInlineActionWidth() {
            return this.f59178S;
        }

        int getMaxWidth() {
            return this.f59183o;
        }

        void setAnimationMode(int i2) {
            this.f59177O = i2;
        }

        @Override // android.view.View
        public void setBackgroundDrawable(@Nullable Drawable drawable) {
            if (drawable != null && this.f59181g != null) {
                drawable = DrawableCompat.r(drawable.mutate());
                DrawableCompat.HI(drawable, this.f59181g);
                DrawableCompat.ck(drawable, this.E2);
            }
            super.setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
            this.f59181g = colorStateList;
            if (getBackground() != null) {
                Drawable drawableR = DrawableCompat.r(getBackground().mutate());
                DrawableCompat.HI(drawableR, colorStateList);
                DrawableCompat.ck(drawableR, this.E2);
                if (drawableR != getBackground()) {
                    super.setBackgroundDrawable(drawableR);
                }
            }
        }

        @Override // android.view.View
        public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
            this.E2 = mode;
            if (getBackground() != null) {
                Drawable drawableR = DrawableCompat.r(getBackground().mutate());
                DrawableCompat.ck(drawableR, mode);
                if (drawableR != getBackground()) {
                    super.setBackgroundDrawable(drawableR);
                }
            }
        }

        @Override // android.view.View
        public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
            setOnTouchListener(onClickListener != null ? null : f59176N);
            super.setOnClickListener(onClickListener);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            BaseTransientBottomBar baseTransientBottomBar = this.f59182n;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.wTp();
            }
            ViewCompat.piY(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            BaseTransientBottomBar baseTransientBottomBar = this.f59182n;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.v();
            }
        }

        @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z2, int i2, int i3, int i5, int i7) {
            super.onLayout(z2, i2, i3, i5, i7);
            BaseTransientBottomBar baseTransientBottomBar = this.f59182n;
            if (baseTransientBottomBar != null) {
                baseTransientBottomBar.rV9();
            }
        }

        @Override // android.widget.FrameLayout, android.view.View
        protected void onMeasure(int i2, int i3) {
            super.onMeasure(i2, i3);
            if (this.f59183o > 0) {
                int measuredWidth = getMeasuredWidth();
                int i5 = this.f59183o;
                if (measuredWidth > i5) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i5, 1073741824), i3);
                }
            }
        }

        @Override // android.view.View
        public void setBackground(@Nullable Drawable drawable) {
            setBackgroundDrawable(drawable);
        }

        @Override // android.view.View
        public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
            super.setLayoutParams(layoutParams);
            if (!this.f59179T && (layoutParams instanceof ViewGroup.MarginLayoutParams)) {
                O((ViewGroup.MarginLayoutParams) layoutParams);
                BaseTransientBottomBar baseTransientBottomBar = this.f59182n;
                if (baseTransientBottomBar != null) {
                    baseTransientBottomBar.a();
                }
            }
        }
    }

    class Wre extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f59186n;

        Wre(int i2) {
            this.f59186n = i2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.bzg(this.f59186n);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BaseTransientBottomBar.this.mUb.rl(0, BaseTransientBottomBar.this.rl);
        }
    }

    class Xo implements Runnable {
        Xo() {
        }

        @Override // java.lang.Runnable
        public void run() {
            QJ qj = BaseTransientBottomBar.this.xMQ;
            if (qj == null) {
                return;
            }
            if (qj.getParent() != null) {
                BaseTransientBottomBar.this.xMQ.setVisibility(0);
            }
            if (BaseTransientBottomBar.this.xMQ.getAnimationMode() == 1) {
                BaseTransientBottomBar.this.FX();
            } else {
                BaseTransientBottomBar.this.J();
            }
        }
    }

    class aC implements OnApplyWindowInsetsListener {
        aC() {
        }

        @Override // androidx.core.view.OnApplyWindowInsetsListener
        public WindowInsetsCompat n(View view, WindowInsetsCompat windowInsetsCompat) {
            BaseTransientBottomBar.this.HI = windowInsetsCompat.mUb();
            BaseTransientBottomBar.this.ck = windowInsetsCompat.gh();
            BaseTransientBottomBar.this.Ik = windowInsetsCompat.qie();
            BaseTransientBottomBar.this.a();
            return windowInsetsCompat;
        }
    }

    class eO extends AnimatorListenerAdapter {
        eO() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.Xw();
        }
    }

    class fuX implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 0) {
                ((BaseTransientBottomBar) message.obj).E();
                return true;
            }
            if (i2 != 1) {
                return false;
            }
            ((BaseTransientBottomBar) message.obj).N(message.arg1);
            return true;
        }

        fuX() {
        }
    }

    class j extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f59190n;

        j(int i2) {
            this.f59190n = i2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BaseTransientBottomBar.this.bzg(this.f59190n);
        }
    }

    class n implements ValueAnimator.AnimatorUpdateListener {
        n() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            BaseTransientBottomBar.this.xMQ.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    class o implements w6.n {
        o() {
        }

        @Override // com.google.android.material.snackbar.w6.n
        public void n(int i2) {
            Handler handler = BaseTransientBottomBar.iF;
            handler.sendMessage(handler.obtainMessage(1, i2, 0, BaseTransientBottomBar.this));
        }

        @Override // com.google.android.material.snackbar.w6.n
        public void show() {
            Handler handler = BaseTransientBottomBar.iF;
            handler.sendMessage(handler.obtainMessage(0, BaseTransientBottomBar.this));
        }
    }

    class qz implements Runnable {
        qz() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BaseTransientBottomBar.this.bzg(3);
        }
    }

    class w6 implements ValueAnimator.AnimatorUpdateListener {
        w6() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            BaseTransientBottomBar.this.xMQ.setScaleX(fFloatValue);
            BaseTransientBottomBar.this.xMQ.setScaleY(fFloatValue);
        }
    }

    public static class z {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private w6.n f59195n;

        public boolean n(View view) {
            return view instanceof QJ;
        }

        public void t(BaseTransientBottomBar baseTransientBottomBar) {
            this.f59195n = baseTransientBottomBar.ViF;
        }

        public z(SwipeDismissBehavior swipeDismissBehavior) {
            swipeDismissBehavior.jB(0.1f);
            swipeDismissBehavior.bzg(0.6f);
            swipeDismissBehavior.U(0);
        }

        public void rl(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    com.google.android.material.snackbar.w6.t().gh(this.f59195n);
                    return;
                }
                return;
            }
            if (coordinatorLayout.nY(view, (int) motionEvent.getX(), (int) motionEvent.getY())) {
                com.google.android.material.snackbar.w6.t().mUb(this.f59195n);
            }
        }
    }

    private void B(int i2) {
        ValueAnimator valueAnimatorNY = nY(1.0f, 0.0f);
        valueAnimatorNY.setDuration(this.rl);
        valueAnimatorNY.addListener(new j(i2));
        valueAnimatorNY.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void FX() {
        ValueAnimator valueAnimatorNY = nY(0.0f, 1.0f);
        ValueAnimator valueAnimatorFD = fD(0.8f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(valueAnimatorNY, valueAnimatorFD);
        animatorSet.setDuration(this.f59165n);
        animatorSet.addListener(new eO());
        animatorSet.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int X() {
        int[] iArr = new int[2];
        this.xMQ.getLocationInWindow(iArr);
        return iArr[1] + this.xMQ.getHeight();
    }

    public void aYN() {
        ViF(3);
    }

    public View g() {
        return null;
    }

    private void D(int i2) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(0, e());
        valueAnimator.setInterpolator(this.f59162O);
        valueAnimator.setDuration(this.f59168t);
        valueAnimator.addListener(new Wre(i2));
        valueAnimator.addUpdateListener(new CN3());
        valueAnimator.start();
    }

    private void P5(CoordinatorLayout.LayoutParams layoutParams) {
        SwipeDismissBehavior swipeDismissBehaviorIF = this.WPU;
        if (swipeDismissBehaviorIF == null) {
            swipeDismissBehaviorIF = iF();
        }
        if (swipeDismissBehaviorIF instanceof Behavior) {
            ((Behavior) swipeDismissBehaviorIF).p5(this);
        }
        swipeDismissBehaviorIF.Xw(new Pl());
        layoutParams.ty(swipeDismissBehaviorIF);
        if (g() == null) {
            layoutParams.Uo = 80;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static GradientDrawable S(int i2, Resources resources) {
        float dimension = resources.getDimension(Rxk.Ml.ijL);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(dimension);
        gradientDrawable.setColor(i2);
        return gradientDrawable;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static mfo.CN3 WPU(int i2, mfo.C c2) {
        mfo.CN3 cn3 = new mfo.CN3(c2);
        cn3.p5(ColorStateList.valueOf(i2));
        return cn3;
    }

    private void Z(int i2) {
        if (this.xMQ.getAnimationMode() == 1) {
            B(i2);
        } else {
            D(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        ViewGroup.LayoutParams layoutParams = this.xMQ.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            Log.w(f59160e, "Unable to update margins because layout params are not MarginLayoutParams");
            return;
        }
        if (this.xMQ.f59180e == null) {
            Log.w(f59160e, "Unable to update margins because original view margins are not set");
            return;
        }
        if (this.xMQ.getParent() == null) {
            return;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i2 = this.xMQ.f59180e.bottom + (g() != null ? this.f59167r : this.HI);
        int i3 = this.xMQ.f59180e.left + this.ck;
        int i5 = this.xMQ.f59180e.right + this.Ik;
        int i7 = this.xMQ.f59180e.top;
        boolean z2 = (marginLayoutParams.bottomMargin == i2 && marginLayoutParams.leftMargin == i3 && marginLayoutParams.rightMargin == i5 && marginLayoutParams.topMargin == i7) ? false : true;
        if (z2) {
            marginLayoutParams.bottomMargin = i2;
            marginLayoutParams.leftMargin = i3;
            marginLayoutParams.rightMargin = i5;
            marginLayoutParams.topMargin = i7;
            this.xMQ.requestLayout();
        }
        if ((z2 || this.f59164Z != this.f59166o) && Build.VERSION.SDK_INT >= 29 && p5()) {
            this.xMQ.removeCallbacks(this.ty);
            this.xMQ.post(this.ty);
        }
    }

    private int e() {
        int height = this.xMQ.getHeight();
        ViewGroup.LayoutParams layoutParams = this.xMQ.getLayoutParams();
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? height + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : height;
    }

    private boolean p5() {
        return this.f59166o > 0 && !this.qie && s7N();
    }

    private boolean s7N() {
        ViewGroup.LayoutParams layoutParams = this.xMQ.getLayoutParams();
        return (layoutParams instanceof CoordinatorLayout.LayoutParams) && (((CoordinatorLayout.LayoutParams) layoutParams).O() instanceof SwipeDismissBehavior);
    }

    final void E() {
        if (this.xMQ.getParent() == null) {
            ViewGroup.LayoutParams layoutParams = this.xMQ.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
                P5((CoordinatorLayout.LayoutParams) layoutParams);
            }
            this.xMQ.t(this.Uo);
            jB();
            this.xMQ.setVisibility(4);
        }
        if (ViewCompat.P5(this.xMQ)) {
            M();
        } else {
            this.XQ = true;
        }
    }

    boolean M7() {
        AccessibilityManager accessibilityManager = this.aYN;
        if (accessibilityManager == null) {
            return true;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(1);
        return enabledAccessibilityServiceList != null && enabledAccessibilityServiceList.isEmpty();
    }

    protected boolean T() {
        TypedArray typedArrayObtainStyledAttributes = this.KN.obtainStyledAttributes(E2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId != -1;
    }

    public BaseTransientBottomBar U(int i2) {
        this.gh = i2;
        return this;
    }

    protected SwipeDismissBehavior iF() {
        return new Behavior();
    }

    void o() {
        this.xMQ.post(new Xo());
    }

    void rV9() {
        if (this.XQ) {
            M();
            this.XQ = false;
        }
    }

    public int te() {
        return this.gh;
    }

    void wTp() {
        WindowInsets rootWindowInsets;
        if (Build.VERSION.SDK_INT < 29 || (rootWindowInsets = this.xMQ.getRootWindowInsets()) == null) {
            return;
        }
        this.f59166o = rootWindowInsets.getMandatorySystemGestureInsets().bottom;
        a();
    }

    protected BaseTransientBottomBar(Context context, ViewGroup viewGroup, View view, com.google.android.material.snackbar.j jVar) {
        if (viewGroup != null) {
            if (view != null) {
                if (jVar != null) {
                    this.Uo = viewGroup;
                    this.mUb = jVar;
                    this.KN = context;
                    com.google.android.material.internal.eO.n(context);
                    QJ qj = (QJ) LayoutInflater.from(context).inflate(E2(), viewGroup, false);
                    this.xMQ = qj;
                    qj.setBaseTransientBottomBar(this);
                    if (view instanceof SnackbarContentLayout) {
                        SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) view;
                        snackbarContentLayout.t(qj.getActionTextColorAlpha());
                        snackbarContentLayout.setMaxInlineActionWidth(qj.getMaxInlineActionWidth());
                    }
                    qj.addView(view);
                    ViewCompat.pJg(qj, 1);
                    ViewCompat.ul(qj, 1);
                    ViewCompat.eWT(qj, true);
                    ViewCompat.Org(qj, new aC());
                    ViewCompat.eTf(qj, new C());
                    this.aYN = (AccessibilityManager) context.getSystemService("accessibility");
                    int i2 = Rxk.n.te;
                    this.f59168t = IzQ.fuX.J2(context, i2, 250);
                    this.f59165n = IzQ.fuX.J2(context, i2, 150);
                    this.rl = IzQ.fuX.J2(context, Rxk.n.iF, 75);
                    int i3 = Rxk.n.nHg;
                    this.nr = IzQ.fuX.Uo(context, i3, f59161g);
                    this.J2 = IzQ.fuX.Uo(context, i3, te);
                    this.f59162O = IzQ.fuX.Uo(context, i3, nY);
                    return;
                }
                throw new IllegalArgumentException("Transient bottom bar must have non-null callback");
            }
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        }
        throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J() {
        int iE = e();
        if (fD) {
            ViewCompat.FX(this.xMQ, iE);
        } else {
            this.xMQ.setTranslationY(iE);
        }
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setIntValues(iE, 0);
        valueAnimator.setInterpolator(this.f59162O);
        valueAnimator.setDuration(this.f59168t);
        valueAnimator.addListener(new Ml());
        valueAnimator.addUpdateListener(new I28(iE));
        valueAnimator.start();
    }

    private void M() {
        if (M7()) {
            o();
            return;
        }
        if (this.xMQ.getParent() != null) {
            this.xMQ.setVisibility(0);
        }
        Xw();
    }

    private int XQ() {
        if (g() == null) {
            return 0;
        }
        int[] iArr = new int[2];
        g().getLocationOnScreen(iArr);
        int i2 = iArr[1];
        int[] iArr2 = new int[2];
        this.Uo.getLocationOnScreen(iArr2);
        return (iArr2[1] + this.Uo.getHeight()) - i2;
    }

    private ValueAnimator fD(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.J2);
        valueAnimatorOfFloat.addUpdateListener(new w6());
        return valueAnimatorOfFloat;
    }

    private void jB() {
        this.f59167r = XQ();
        a();
    }

    private ValueAnimator nY(float... fArr) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fArr);
        valueAnimatorOfFloat.setInterpolator(this.nr);
        valueAnimatorOfFloat.addUpdateListener(new n());
        return valueAnimatorOfFloat;
    }

    protected int E2() {
        if (T()) {
            return Rxk.fuX.nY;
        }
        return Rxk.fuX.f8787n;
    }

    final void N(int i2) {
        if (M7() && this.xMQ.getVisibility() == 0) {
            Z(i2);
        } else {
            bzg(i2);
        }
    }

    protected void ViF(int i2) {
        com.google.android.material.snackbar.w6.t().rl(this.ViF, i2);
    }

    void Xw() {
        int size;
        com.google.android.material.snackbar.w6.t().xMQ(this.ViF);
        if (this.f59163S != null && r0.size() - 1 >= 0) {
            android.support.v4.media.j.n(this.f59163S.get(size));
            throw null;
        }
    }

    void bzg(int i2) {
        int size;
        com.google.android.material.snackbar.w6.t().KN(this.ViF);
        if (this.f59163S != null && r2.size() - 1 >= 0) {
            android.support.v4.media.j.n(this.f59163S.get(size));
            throw null;
        }
        ViewParent parent = this.xMQ.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.xMQ);
        }
    }

    public void eF() {
        com.google.android.material.snackbar.w6.t().az(te(), this.ViF);
    }

    public boolean nHg() {
        return com.google.android.material.snackbar.w6.t().O(this.ViF);
    }

    void v() {
        if (nHg()) {
            iF.post(new qz());
        }
    }
}
