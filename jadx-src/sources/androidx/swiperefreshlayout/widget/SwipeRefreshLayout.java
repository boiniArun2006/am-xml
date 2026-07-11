package androidx.swiperefreshlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.ListView;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.core.content.ContextCompat;
import androidx.core.view.NestedScrollingChild;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.NestedScrollingParent;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.ViewCompat;
import androidx.core.widget.ListViewCompat;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class SwipeRefreshLayout extends ViewGroup implements NestedScrollingParent, NestedScrollingChild {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private static final String f42093C = "SwipeRefreshLayout";
    private static final int[] Mx = {R.attr.enabled};

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    float f42094B;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    int f42095D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    CircleImageView f42096E;
    private final int[] E2;

    /* JADX INFO: renamed from: FX, reason: collision with root package name */
    protected int f42097FX;

    /* JADX INFO: renamed from: GR, reason: collision with root package name */
    private Animation f42098GR;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    CircularProgressDrawable f42099I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    protected int f42100J;
    private int J2;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private int f42101M;
    boolean M7;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private int f42102N;
    private Animation Nxk;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    boolean f42103O;
    private int P5;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final NestedScrollingParentHelper f42104S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private boolean f42105T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private boolean f42106U;
    private float Xw;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f42107a;
    private Animation dR0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int[] f42108e;
    private final DecelerateInterpolator eF;
    private OnChildScrollUpCallback eTf;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final NestedScrollingChildHelper f42109g;
    private int ijL;
    private float jB;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Animation f42110k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    boolean f42111m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private View f42112n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f42113o;
    private final Animation ofS;
    private boolean p5;
    private final Animation pJg;
    boolean piY;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f42114r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    OnRefreshListener f42115t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    int f42116v;
    private Animation.AnimationListener xg;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Animation f42117z;

    public interface OnChildScrollUpCallback {
        boolean n(SwipeRefreshLayout swipeRefreshLayout, View view);
    }

    public interface OnRefreshListener {
        void n();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        if (i3 > 0) {
            float f3 = this.f42113o;
            if (f3 > 0.0f) {
                float f4 = i3;
                if (f4 > f3) {
                    iArr[1] = i3 - ((int) f3);
                    this.f42113o = 0.0f;
                } else {
                    this.f42113o = f3 - f4;
                    iArr[1] = i3;
                }
                KN(this.f42113o);
            }
        }
        if (this.f42111m && i3 > 0 && this.f42113o == 0.0f && Math.abs(i3 - iArr[1]) > 0) {
            this.f42096E.setVisibility(8);
        }
        int[] iArr2 = this.E2;
        if (dispatchNestedPreScroll(i2 - iArr[0], i3 - iArr[1], iArr2, null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    public void setDistanceToTriggerSync(int i2) {
        this.f42114r = i2;
    }

    public void setRefreshing(boolean z2) {
        if (!z2 || this.f42103O == z2) {
            r(z2, false);
            return;
        }
        this.f42103O = z2;
        setTargetOffsetTopAndBottom((!this.f42111m ? this.f42095D + this.f42100J : this.f42095D) - this.f42116v);
        this.piY = false;
        ViF(this.xg);
    }

    private void J2(float f3) {
        if (f3 > this.f42114r) {
            r(true, true);
            return;
        }
        this.f42103O = false;
        this.f42099I.mUb(0.0f, 0.0f);
        rl(this.f42116v, !this.M7 ? new Animation.AnimationListener() { // from class: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.5
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
                if (swipeRefreshLayout.M7) {
                    return;
                }
                swipeRefreshLayout.WPU(null);
            }
        } : null);
        this.f42099I.nr(false);
    }

    private void KN(float f3) {
        this.f42099I.nr(true);
        float fMin = Math.min(1.0f, Math.abs(f3 / this.f42114r));
        float fMax = (((float) Math.max(((double) fMin) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float fAbs = Math.abs(f3) - this.f42114r;
        int i2 = this.f42107a;
        if (i2 <= 0) {
            i2 = this.f42111m ? this.f42095D - this.f42100J : this.f42095D;
        }
        float f4 = i2;
        double dMax = Math.max(0.0f, Math.min(fAbs, f4 * 2.0f) / f4) / 4.0f;
        float fPow = ((float) (dMax - Math.pow(dMax, 2.0d))) * 2.0f;
        int i3 = this.f42100J + ((int) ((f4 * fMin) + (f4 * fPow * 2.0f)));
        if (this.f42096E.getVisibility() != 0) {
            this.f42096E.setVisibility(0);
        }
        if (!this.M7) {
            this.f42096E.setScaleX(1.0f);
            this.f42096E.setScaleY(1.0f);
        }
        if (this.M7) {
            setAnimationProgress(Math.min(1.0f, f3 / this.f42114r));
        }
        if (f3 < this.f42114r) {
            if (this.f42099I.getAlpha() > 76 && !Uo(this.f42110k)) {
                S();
            }
        } else if (this.f42099I.getAlpha() < 255 && !Uo(this.dR0)) {
            XQ();
        }
        this.f42099I.mUb(0.0f, Math.min(0.8f, fMax * 0.8f));
        this.f42099I.O(Math.min(1.0f, fMax));
        this.f42099I.Uo((((fMax * 0.4f) - 0.25f) + (fPow * 2.0f)) * 0.5f);
        setTargetOffsetTopAndBottom(i3 - this.f42116v);
    }

    private void O() {
        if (this.f42112n == null) {
            for (int i2 = 0; i2 < getChildCount(); i2++) {
                View childAt = getChildAt(i2);
                if (!childAt.equals(this.f42096E)) {
                    this.f42112n = childAt;
                    return;
                }
            }
        }
    }

    private void S() {
        this.f42110k = o(this.f42099I.getAlpha(), 76);
    }

    private boolean Uo(Animation animation) {
        return (animation == null || !animation.hasStarted() || animation.hasEnded()) ? false : true;
    }

    private void ViF(Animation.AnimationListener animationListener) {
        this.f42096E.setVisibility(0);
        this.f42099I.setAlpha(255);
        Animation animation = new Animation() { // from class: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.2
            @Override // android.view.animation.Animation
            public void applyTransformation(float f3, Transformation transformation) {
                SwipeRefreshLayout.this.setAnimationProgress(f3);
            }
        };
        this.f42098GR = animation;
        animation.setDuration(this.f42102N);
        if (animationListener != null) {
            this.f42096E.rl(animationListener);
        }
        this.f42096E.clearAnimation();
        this.f42096E.startAnimation(this.f42098GR);
    }

    private void XQ() {
        this.dR0 = o(this.f42099I.getAlpha(), 255);
    }

    private void Z(float f3) {
        float f4 = this.jB;
        float f5 = f3 - f4;
        int i2 = this.J2;
        if (f5 <= i2 || this.f42106U) {
            return;
        }
        this.Xw = f4 + i2;
        this.f42106U = true;
        this.f42099I.setAlpha(76);
    }

    private void aYN(int i2, Animation.AnimationListener animationListener) {
        this.f42097FX = i2;
        this.f42094B = this.f42096E.getScaleX();
        Animation animation = new Animation() { // from class: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.8
            @Override // android.view.animation.Animation
            public void applyTransformation(float f3, Transformation transformation) {
                SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
                float f4 = swipeRefreshLayout.f42094B;
                swipeRefreshLayout.setAnimationProgress(f4 + ((-f4) * f3));
                SwipeRefreshLayout.this.qie(f3);
            }
        };
        this.f42117z = animation;
        animation.setDuration(150L);
        if (animationListener != null) {
            this.f42096E.rl(animationListener);
        }
        this.f42096E.clearAnimation();
        this.f42096E.startAnimation(this.f42117z);
    }

    private void n(int i2, Animation.AnimationListener animationListener) {
        this.f42097FX = i2;
        this.pJg.reset();
        this.pJg.setDuration(200L);
        this.pJg.setInterpolator(this.eF);
        if (animationListener != null) {
            this.f42096E.rl(animationListener);
        }
        this.f42096E.clearAnimation();
        this.f42096E.startAnimation(this.pJg);
    }

    private void nr() {
        this.f42096E = new CircleImageView(getContext(), -328966);
        CircularProgressDrawable circularProgressDrawable = new CircularProgressDrawable(getContext());
        this.f42099I = circularProgressDrawable;
        circularProgressDrawable.qie(1);
        this.f42096E.setImageDrawable(this.f42099I);
        this.f42096E.setVisibility(8);
        addView(this.f42096E);
    }

    private Animation o(final int i2, final int i3) {
        Animation animation = new Animation() { // from class: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.4
            @Override // android.view.animation.Animation
            public void applyTransformation(float f3, Transformation transformation) {
                SwipeRefreshLayout.this.f42099I.setAlpha((int) (i2 + ((i3 - r0) * f3)));
            }
        };
        animation.setDuration(300L);
        this.f42096E.rl(null);
        this.f42096E.clearAnimation();
        this.f42096E.startAnimation(animation);
        return animation;
    }

    private void r(boolean z2, boolean z3) {
        if (this.f42103O != z2) {
            this.piY = z3;
            O();
            this.f42103O = z2;
            if (z2) {
                n(this.f42116v, this.xg);
            } else {
                WPU(this.xg);
            }
        }
    }

    private void rl(int i2, Animation.AnimationListener animationListener) {
        if (this.M7) {
            aYN(i2, animationListener);
            return;
        }
        this.f42097FX = i2;
        this.ofS.reset();
        this.ofS.setDuration(200L);
        this.ofS.setInterpolator(this.eF);
        if (animationListener != null) {
            this.f42096E.rl(animationListener);
        }
        this.f42096E.clearAnimation();
        this.f42096E.startAnimation(this.ofS);
    }

    private void setColorViewAlpha(int i2) {
        this.f42096E.getBackground().setAlpha(i2);
        this.f42099I.setAlpha(i2);
    }

    void Ik() {
        this.f42096E.clearAnimation();
        this.f42099I.stop();
        this.f42096E.setVisibility(8);
        setColorViewAlpha(255);
        if (this.M7) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.f42100J - this.f42116v);
        }
        this.f42116v = this.f42096E.getTop();
    }

    void WPU(Animation.AnimationListener animationListener) {
        Animation animation = new Animation() { // from class: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.3
            @Override // android.view.animation.Animation
            public void applyTransformation(float f3, Transformation transformation) {
                SwipeRefreshLayout.this.setAnimationProgress(1.0f - f3);
            }
        };
        this.Nxk = animation;
        animation.setDuration(150L);
        this.f42096E.rl(animationListener);
        this.f42096E.clearAnimation();
        this.f42096E.startAnimation(this.Nxk);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f3, float f4, boolean z2) {
        return this.f42109g.n(f3, f4, z2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f3, float f4) {
        return this.f42109g.rl(f3, f4);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return this.f42109g.t(i2, i3, iArr, iArr2);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i2, int i3, int i5, int i7, int[] iArr) {
        return this.f42109g.J2(i2, i3, i5, i7, iArr);
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i2, int i3) {
        int i5 = this.f42101M;
        return i5 < 0 ? i3 : i3 == i2 + (-1) ? i5 : i3 >= i5 ? i3 + 1 : i3;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f42104S.n();
    }

    public int getProgressCircleDiameter() {
        return this.ijL;
    }

    public int getProgressViewEndOffset() {
        return this.f42095D;
    }

    public int getProgressViewStartOffset() {
        return this.f42100J;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return this.f42109g.gh();
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f42109g.az();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i2, int i3, int i5, int i7) {
        dispatchNestedScroll(i2, i3, i5, i7, this.f42108e);
        if (i7 + this.f42108e[1] >= 0 || t()) {
            return;
        }
        float fAbs = this.f42113o + Math.abs(r11);
        this.f42113o = fAbs;
        KN(fAbs);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i2) {
        this.f42104S.rl(view, view2, i2);
        startNestedScroll(i2 & 2);
        this.f42113o = 0.0f;
        this.f42105T = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        this.f42104S.nr(view);
        this.f42105T = false;
        float f3 = this.f42113o;
        if (f3 > 0.0f) {
            J2(f3);
            this.f42113o = 0.0f;
        }
        stopNestedScroll();
    }

    void qie(float f3) {
        setTargetOffsetTopAndBottom((this.f42097FX + ((int) ((this.f42100J - r0) * f3))) - this.f42096E.getTop());
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z2) {
        View view = this.f42112n;
        if (view == null || ViewCompat.M7(view)) {
            super.requestDisallowInterceptTouchEvent(z2);
        }
    }

    void setAnimationProgress(float f3) {
        this.f42096E.setScaleX(f3);
        this.f42096E.setScaleY(f3);
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        this.f42109g.ty(z2);
    }

    public void setOnChildScrollUpCallback(@Nullable OnChildScrollUpCallback onChildScrollUpCallback) {
        this.eTf = onChildScrollUpCallback;
    }

    public void setOnRefreshListener(@Nullable OnRefreshListener onRefreshListener) {
        this.f42115t = onRefreshListener;
    }

    public void setProgressBackgroundColorSchemeColor(@ColorInt int i2) {
        this.f42096E.setBackgroundColor(i2);
    }

    public void setSize(int i2) {
        if (i2 == 0 || i2 == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i2 == 0) {
                this.ijL = (int) (displayMetrics.density * 56.0f);
            } else {
                this.ijL = (int) (displayMetrics.density * 40.0f);
            }
            this.f42096E.setImageDrawable(null);
            this.f42099I.qie(i2);
            this.f42096E.setImageDrawable(this.f42099I);
        }
    }

    public void setSlingshotDistance(@Px int i2) {
        this.f42107a = i2;
    }

    void setTargetOffsetTopAndBottom(int i2) {
        this.f42096E.bringToFront();
        ViewCompat.FX(this.f42096E, i2);
        this.f42116v = this.f42096E.getTop();
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i2) {
        return this.f42109g.ck(i2);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        this.f42109g.r();
    }

    public boolean t() {
        OnChildScrollUpCallback onChildScrollUpCallback = this.eTf;
        if (onChildScrollUpCallback != null) {
            return onChildScrollUpCallback.n(this, this.f42112n);
        }
        View view = this.f42112n;
        return view instanceof ListView ? ListViewCompat.n((ListView) view, -1) : view.canScrollVertically(-1);
    }

    public SwipeRefreshLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f42103O = false;
        this.f42114r = -1.0f;
        this.E2 = new int[2];
        this.f42108e = new int[2];
        this.P5 = -1;
        this.f42101M = -1;
        this.xg = new Animation.AnimationListener() { // from class: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.1
            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                OnRefreshListener onRefreshListener;
                SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
                if (!swipeRefreshLayout.f42103O) {
                    swipeRefreshLayout.Ik();
                    return;
                }
                swipeRefreshLayout.f42099I.setAlpha(255);
                SwipeRefreshLayout.this.f42099I.start();
                SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
                if (swipeRefreshLayout2.piY && (onRefreshListener = swipeRefreshLayout2.f42115t) != null) {
                    onRefreshListener.n();
                }
                SwipeRefreshLayout swipeRefreshLayout3 = SwipeRefreshLayout.this;
                swipeRefreshLayout3.f42116v = swipeRefreshLayout3.f42096E.getTop();
            }
        };
        this.pJg = new Animation() { // from class: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.6
            @Override // android.view.animation.Animation
            public void applyTransformation(float f3, Transformation transformation) {
                SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
                int iAbs = !swipeRefreshLayout.f42111m ? swipeRefreshLayout.f42095D - Math.abs(swipeRefreshLayout.f42100J) : swipeRefreshLayout.f42095D;
                SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
                SwipeRefreshLayout.this.setTargetOffsetTopAndBottom((swipeRefreshLayout2.f42097FX + ((int) ((iAbs - r1) * f3))) - swipeRefreshLayout2.f42096E.getTop());
                SwipeRefreshLayout.this.f42099I.O(1.0f - f3);
            }
        };
        this.ofS = new Animation() { // from class: androidx.swiperefreshlayout.widget.SwipeRefreshLayout.7
            @Override // android.view.animation.Animation
            public void applyTransformation(float f3, Transformation transformation) {
                SwipeRefreshLayout.this.qie(f3);
            }
        };
        this.J2 = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f42102N = getResources().getInteger(R.integer.config_mediumAnimTime);
        setWillNotDraw(false);
        this.eF = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.ijL = (int) (displayMetrics.density * 40.0f);
        nr();
        setChildrenDrawingOrderEnabled(true);
        int i2 = (int) (displayMetrics.density * 64.0f);
        this.f42095D = i2;
        this.f42114r = i2;
        this.f42104S = new NestedScrollingParentHelper(this);
        this.f42109g = new NestedScrollingChildHelper(this);
        setNestedScrollingEnabled(true);
        int i3 = -this.ijL;
        this.f42116v = i3;
        this.f42100J = i3;
        qie(1.0f);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, Mx);
        setEnabled(typedArrayObtainStyledAttributes.getBoolean(0, true));
        typedArrayObtainStyledAttributes.recycle();
    }

    private void ck(MotionEvent motionEvent) {
        int i2;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.P5) {
            if (actionIndex == 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            this.P5 = motionEvent.getPointerId(i2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Ik();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0058  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        O();
        int actionMasked = motionEvent.getActionMasked();
        if (this.p5 && actionMasked == 0) {
            this.p5 = false;
        }
        if (!isEnabled() || this.p5 || t() || this.f42103O || this.f42105T) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 6) {
                            ck(motionEvent);
                        }
                    }
                } else {
                    int i2 = this.P5;
                    if (i2 == -1) {
                        Log.e(f42093C, "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int iFindPointerIndex = motionEvent.findPointerIndex(i2);
                    if (iFindPointerIndex < 0) {
                        return false;
                    }
                    Z(motionEvent.getY(iFindPointerIndex));
                }
            } else {
                this.f42106U = false;
                this.P5 = -1;
            }
        } else {
            setTargetOffsetTopAndBottom(this.f42100J - this.f42096E.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.P5 = pointerId;
            this.f42106U = false;
            int iFindPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (iFindPointerIndex2 < 0) {
                return false;
            }
            this.jB = motionEvent.getY(iFindPointerIndex2);
        }
        return this.f42106U;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i5, int i7) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.f42112n == null) {
                O();
            }
            View view = this.f42112n;
            if (view == null) {
                return;
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
            int measuredWidth2 = this.f42096E.getMeasuredWidth();
            int measuredHeight2 = this.f42096E.getMeasuredHeight();
            int i8 = measuredWidth / 2;
            int i9 = measuredWidth2 / 2;
            int i10 = this.f42116v;
            this.f42096E.layout(i8 - i9, i10, i8 + i9, measuredHeight2 + i10);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f42112n == null) {
            O();
        }
        View view = this.f42112n;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            this.f42096E.measure(View.MeasureSpec.makeMeasureSpec(this.ijL, 1073741824), View.MeasureSpec.makeMeasureSpec(this.ijL, 1073741824));
            this.f42101M = -1;
            for (int i5 = 0; i5 < getChildCount(); i5++) {
                if (getChildAt(i5) == this.f42096E) {
                    this.f42101M = i5;
                    return;
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f3, float f4, boolean z2) {
        return dispatchNestedFling(f3, f4, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f3, float f4) {
        return dispatchNestedPreFling(f3, f4);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i2) {
        if (isEnabled() && !this.p5 && !this.f42103O && (i2 & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.p5 && actionMasked == 0) {
            this.p5 = false;
        }
        if (!isEnabled() || this.p5 || t() || this.f42103O || this.f42105T) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 3) {
                        return false;
                    }
                    if (actionMasked != 5) {
                        if (actionMasked == 6) {
                            ck(motionEvent);
                        }
                    } else {
                        int actionIndex = motionEvent.getActionIndex();
                        if (actionIndex < 0) {
                            Log.e(f42093C, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                            return false;
                        }
                        this.P5 = motionEvent.getPointerId(actionIndex);
                    }
                } else {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.P5);
                    if (iFindPointerIndex < 0) {
                        Log.e(f42093C, "Got ACTION_MOVE event but have an invalid active pointer id.");
                        return false;
                    }
                    float y2 = motionEvent.getY(iFindPointerIndex);
                    Z(y2);
                    if (this.f42106U) {
                        float f3 = (y2 - this.Xw) * 0.5f;
                        if (f3 <= 0.0f) {
                            return false;
                        }
                        KN(f3);
                    }
                }
            } else {
                int iFindPointerIndex2 = motionEvent.findPointerIndex(this.P5);
                if (iFindPointerIndex2 < 0) {
                    Log.e(f42093C, "Got ACTION_UP event but don't have an active pointer id.");
                    return false;
                }
                if (this.f42106U) {
                    float y3 = (motionEvent.getY(iFindPointerIndex2) - this.Xw) * 0.5f;
                    this.f42106U = false;
                    J2(y3);
                }
                this.P5 = -1;
                return false;
            }
        } else {
            this.P5 = motionEvent.getPointerId(0);
            this.f42106U = false;
        }
        return true;
    }

    @Deprecated
    public void setColorScheme(@ColorRes int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(@ColorInt int... iArr) {
        O();
        this.f42099I.J2(iArr);
    }

    public void setColorSchemeResources(@ColorRes int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr2[i2] = ContextCompat.getColor(context, iArr[i2]);
        }
        setColorSchemeColors(iArr2);
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        if (!z2) {
            Ik();
        }
    }

    @Deprecated
    public void setProgressBackgroundColor(int i2) {
        setProgressBackgroundColorSchemeResource(i2);
    }

    public void setProgressBackgroundColorSchemeResource(@ColorRes int i2) {
        setProgressBackgroundColorSchemeColor(ContextCompat.getColor(getContext(), i2));
    }
}
