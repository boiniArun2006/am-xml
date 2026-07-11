package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.DifferentialMotionFlingController;
import androidx.core.view.DifferentialMotionFlingTarget;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.NestedScrollingChild3;
import androidx.core.view.NestedScrollingChildHelper;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.ScrollFeedbackProviderCompat;
import androidx.core.view.ScrollingView;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityRecordCompat;
import cS.Zv.SzFNXybiSxdx;
import java.util.ArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class NestedScrollView extends FrameLayout implements NestedScrollingParent3, NestedScrollingChild3, ScrollingView {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private SavedState f36935B;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final NestedScrollingChildHelper f36936D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final int[] f36937E;
    private boolean E2;

    /* JADX INFO: renamed from: FX, reason: collision with root package name */
    private int f36938FX;

    /* JADX INFO: renamed from: GR, reason: collision with root package name */
    final DifferentialMotionFlingTargetImpl f36939GR;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private OnScrollChangeListener f36940I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private final NestedScrollingParentHelper f36941J;
    private OverScroller J2;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private int f36942M;
    private int M7;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private boolean f36943N;
    DifferentialMotionFlingController Nxk;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Rect f36944O;
    private int P5;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    ScrollFeedbackProviderCompat f36945S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private View f36946T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private int f36947U;
    private boolean Xw;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f36948a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f36949e;
    private final int[] eF;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f36950g;
    private boolean jB;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final float f36951n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public EdgeEffect f36952o;
    private int p5;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public EdgeEffect f36953r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f36954t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private VelocityTracker f36955v;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final float f36933k = (float) (Math.log(0.78d) / Math.log(0.9d));
    private static final AccessibilityDelegate dR0 = new AccessibilityDelegate();

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int[] f36934z = {R.attr.fillViewport};

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    class DifferentialMotionFlingTargetImpl implements DifferentialMotionFlingTarget {
        @Override // androidx.core.view.DifferentialMotionFlingTarget
        public boolean n(float f3) {
            if (f3 == 0.0f) {
                return false;
            }
            t();
            NestedScrollView.this.S((int) f3);
            return true;
        }

        DifferentialMotionFlingTargetImpl() {
        }

        @Override // androidx.core.view.DifferentialMotionFlingTarget
        public float rl() {
            return -NestedScrollView.this.getVerticalScrollFactorCompat();
        }

        @Override // androidx.core.view.DifferentialMotionFlingTarget
        public void t() {
            NestedScrollView.this.J2.abortAnimation();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    public interface OnScrollChangeListener {
        void n(NestedScrollView nestedScrollView, int i2, int i3, int i5, int i7);
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.core.widget.NestedScrollView.SavedState.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        };

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f36957n;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f36957n = parcel.readInt();
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f36957n + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f36957n);
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, androidx.core.R.attr.f36141t);
    }

    private boolean E2(View view) {
        return !X(view, 0, getHeight());
    }

    private static int J2(int i2, int i3, int i5) {
        if (i3 >= i5 || i2 < 0) {
            return 0;
        }
        return i3 + i2 > i5 ? i5 - i3 : i2;
    }

    private boolean M7(EdgeEffect edgeEffect, int i2) {
        if (i2 > 0) {
            return true;
        }
        return aYN(-i2) < EdgeEffectCompat.rl(edgeEffect) * ((float) getHeight());
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private View XQ(boolean z2, int i2, int i3) {
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z3 = false;
        for (int i5 = 0; i5 < size; i5++) {
            View view2 = focusables.get(i5);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i2 < bottom && top < i3) {
                boolean z4 = i2 < top && bottom < i3;
                if (view == null) {
                    view = view2;
                    z3 = z4;
                } else {
                    boolean z5 = (z2 && top < view.getTop()) || (!z2 && bottom > view.getBottom());
                    if (z3) {
                        if (z4 && z5) {
                            view = view2;
                        }
                    } else if (z4) {
                        view = view2;
                        z3 = true;
                    } else if (z5) {
                    }
                }
            }
        }
        return view;
    }

    private int Xw(int i2, int i3, int i5, boolean z2) {
        return jB(i2, -1, null, i3, i5, z2);
    }

    private static boolean e(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && e((View) parent, view2);
    }

    private void o() {
        this.p5 = -1;
        this.f36943N = false;
        wTp();
        J(0);
        this.f36953r.onRelease();
        this.f36952o.onRelease();
    }

    private void rV9(boolean z2) {
        if (z2) {
            FX(2, 1);
        } else {
            J(1);
        }
        this.f36938FX = getScrollY();
        postInvalidateOnAnimation();
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean HI(View view, View view2, int i2, int i3) {
        return (i2 & 2) != 0;
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // android.view.View
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return qie(i2, i3, iArr, iArr2, 0);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void gh(View view, int i2, int i3, int[] iArr, int i5) {
        qie(i2, i3, iArr, null, i5);
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return ViF(0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        gh(view, i2, i3, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i2, int i3, int i5, int i7) {
        T(i7, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i2) {
        xMQ(view, view2, i2, 0);
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (i2 == 2) {
            i2 = 130;
        } else if (i2 == 1) {
            i2 = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i2) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i2);
        if (viewFindNextFocus == null || E2(viewFindNextFocus)) {
            return false;
        }
        return viewFindNextFocus.requestFocus(i2, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i2) {
        return HI(view, view2, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        mUb(view, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.E2 = true;
        super.requestLayout();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i2) {
        return FX(i2, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        J(0);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void ty(View view, int i2, int i3, int i5, int i7, int i8) {
        T(i7, i8, null);
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    static class AccessibilityDelegate extends AccessibilityDelegateCompat {
        AccessibilityDelegate() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void J2(View view, AccessibilityEvent accessibilityEvent) {
            boolean z2;
            super.J2(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            if (nestedScrollView.getScrollRange() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            accessibilityEvent.setScrollable(z2);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            AccessibilityRecordCompat.n(accessibilityEvent, nestedScrollView.getScrollX());
            AccessibilityRecordCompat.rl(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void Uo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            int scrollRange;
            super.Uo(view, accessibilityNodeInfoCompat);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityNodeInfoCompat.ofS(ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                accessibilityNodeInfoCompat.F(true);
                if (nestedScrollView.getScrollY() > 0) {
                    accessibilityNodeInfoCompat.rl(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f36858r);
                    accessibilityNodeInfoCompat.rl(AccessibilityNodeInfoCompat.AccessibilityActionCompat.iF);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    accessibilityNodeInfoCompat.rl(AccessibilityNodeInfoCompat.AccessibilityActionCompat.Ik);
                    accessibilityNodeInfoCompat.rl(AccessibilityNodeInfoCompat.AccessibilityActionCompat.E2);
                }
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean mUb(View view, int i2, Bundle bundle) {
            if (super.mUb(view, i2, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i2 != 4096) {
                if (i2 != 8192 && i2 != 16908344) {
                    if (i2 != 16908346) {
                        return false;
                    }
                } else {
                    int iMax = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (iMax == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.M(0, iMax, true);
                    return true;
                }
            }
            int iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (iMin == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.M(0, iMin, true);
            return true;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    @RequiresApi
    static class Api21Impl {
        static boolean n(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    @RequiresApi
    private static final class Api35Impl {
        public static void n(View view, float f3) {
            try {
                view.setFrameContentVelocity(f3);
            } catch (LinkageError unused) {
            }
        }
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f36944O = new Rect();
        this.E2 = true;
        this.f36949e = false;
        this.f36946T = null;
        this.f36943N = false;
        this.jB = true;
        this.p5 = -1;
        this.eF = new int[2];
        this.f36937E = new int[2];
        DifferentialMotionFlingTargetImpl differentialMotionFlingTargetImpl = new DifferentialMotionFlingTargetImpl();
        this.f36939GR = differentialMotionFlingTargetImpl;
        this.Nxk = new DifferentialMotionFlingController(getContext(), differentialMotionFlingTargetImpl);
        this.f36953r = EdgeEffectCompat.n(context, attributeSet);
        this.f36952o = EdgeEffectCompat.n(context, attributeSet);
        this.f36951n = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        te();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f36934z, i2, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f36941J = new NestedScrollingParentHelper(this);
        this.f36936D = new NestedScrollingChildHelper(this);
        setNestedScrollingEnabled(true);
        ViewCompat.eTf(this, dR0);
    }

    private boolean B(MotionEvent motionEvent) {
        boolean z2;
        if (EdgeEffectCompat.rl(this.f36953r) != 0.0f) {
            EdgeEffectCompat.nr(this.f36953r, 0.0f, motionEvent.getX() / getWidth());
            z2 = true;
        } else {
            z2 = false;
        }
        if (EdgeEffectCompat.rl(this.f36952o) == 0.0f) {
            return z2;
        }
        EdgeEffectCompat.nr(this.f36952o, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    private void Ik(int i2) {
        if (i2 != 0) {
            if (this.jB) {
                p5(0, i2);
            } else {
                scrollBy(0, i2);
            }
        }
    }

    private void U(View view) {
        view.getDrawingRect(this.f36944O);
        offsetDescendantRectToMyCoords(view, this.f36944O);
        int iUo = Uo(this.f36944O);
        if (iUo != 0) {
            scrollBy(0, iUo);
        }
    }

    private boolean X(View view, int i2, int i3) {
        view.getDrawingRect(this.f36944O);
        offsetDescendantRectToMyCoords(view, this.f36944O);
        return this.f36944O.bottom + i2 >= getScrollY() && this.f36944O.top - i2 <= getScrollY() + i3;
    }

    private void fD(int i2, int i3) {
        this.f36950g = i2;
        this.p5 = i3;
        FX(2, 0);
    }

    private void g() {
        VelocityTracker velocityTracker = this.f36955v;
        if (velocityTracker == null) {
            this.f36955v = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    private ScrollFeedbackProviderCompat getScrollFeedbackProvider() {
        if (this.f36945S == null) {
            this.f36945S = ScrollFeedbackProviderCompat.n(this);
        }
        return this.f36945S;
    }

    private void iF() {
        if (this.f36955v == null) {
            this.f36955v = VelocityTracker.obtain();
        }
    }

    private void n() {
        this.J2.abortAnimation();
        J(1);
    }

    private boolean r(int i2) {
        if (EdgeEffectCompat.rl(this.f36953r) != 0.0f) {
            if (M7(this.f36953r, i2)) {
                this.f36953r.onAbsorb(i2);
                return true;
            }
            S(-i2);
            return true;
        }
        if (EdgeEffectCompat.rl(this.f36952o) == 0.0f) {
            return false;
        }
        int i3 = -i2;
        if (M7(this.f36952o, i3)) {
            this.f36952o.onAbsorb(i3);
            return true;
        }
        S(i3);
        return true;
    }

    private void te() {
        this.J2 = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f36947U = viewConfiguration.getScaledTouchSlop();
        this.P5 = viewConfiguration.getScaledMinimumFlingVelocity();
        this.M7 = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    private void wTp() {
        VelocityTracker velocityTracker = this.f36955v;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f36955v = null;
        }
    }

    public boolean FX(int i2, int i3) {
        return this.f36936D.Ik(i2, i3);
    }

    public void J(int i2) {
        this.f36936D.o(i2);
    }

    void M(int i2, int i3, boolean z2) {
        E(i2, i3, 250, z2);
    }

    public boolean ViF(int i2) {
        return this.f36936D.qie(i2);
    }

    public boolean WPU(int i2) {
        int childCount;
        boolean z2 = i2 == 130;
        int height = getHeight();
        Rect rect = this.f36944O;
        rect.top = 0;
        rect.bottom = height;
        if (z2 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f36944O.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f36944O;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f36944O;
        return bzg(i2, rect3.top, rect3.bottom);
    }

    public boolean Z(KeyEvent keyEvent) {
        this.f36944O.setEmpty();
        if (!O()) {
            if (isFocused() && keyEvent.getKeyCode() != 4) {
                View viewFindFocus = findFocus();
                if (viewFindFocus == this) {
                    viewFindFocus = null;
                }
                View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
                if (viewFindNextFocus != null && viewFindNextFocus != this && viewFindNextFocus.requestFocus(130)) {
                    return true;
                }
            }
            return false;
        }
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                return keyEvent.isAltPressed() ? WPU(33) : t(33);
            }
            if (keyCode == 20) {
                return keyEvent.isAltPressed() ? WPU(130) : t(130);
            }
            if (keyCode == 62) {
                s7N(keyEvent.isShiftPressed() ? 33 : 130);
                return false;
            }
            if (keyCode == 92) {
                return WPU(33);
            }
            if (keyCode == 93) {
                return WPU(130);
            }
            if (keyCode == 122) {
                s7N(33);
                return false;
            }
            if (keyCode == 123) {
                s7N(130);
                return false;
            }
        }
        return false;
    }

    public void ck(int i2, int i3, int i5, int i7, int[] iArr, int i8, int[] iArr2) {
        this.f36936D.O(i2, i3, i5, i7, iArr, i8, iArr2);
    }

    @Override // android.view.View
    public void computeScroll() {
        int i2;
        if (this.J2.isFinished()) {
            return;
        }
        this.J2.computeScrollOffset();
        int currY = this.J2.getCurrY();
        int iKN = KN(currY - this.f36938FX);
        this.f36938FX = currY;
        int[] iArr = this.f36937E;
        iArr[1] = 0;
        qie(0, iKN, iArr, null, 1);
        int i3 = iKN - this.f36937E[1];
        int scrollRange = getScrollRange();
        if (Build.VERSION.SDK_INT >= 35) {
            Api35Impl.n(this, Math.abs(this.J2.getCurrVelocity()));
        }
        if (i3 != 0) {
            int scrollY = getScrollY();
            nHg(0, i3, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            i2 = scrollRange;
            int scrollY2 = getScrollY() - scrollY;
            int i5 = i3 - scrollY2;
            int[] iArr2 = this.f36937E;
            iArr2[1] = 0;
            ck(0, scrollY2, 0, i5, this.eF, 1, iArr2);
            i3 = i5 - this.f36937E[1];
        } else {
            i2 = scrollRange;
        }
        if (i3 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && i2 > 0)) {
                if (i3 < 0) {
                    if (this.f36953r.isFinished()) {
                        this.f36953r.onAbsorb((int) this.J2.getCurrVelocity());
                    }
                } else if (this.f36952o.isFinished()) {
                    this.f36952o.onAbsorb((int) this.J2.getCurrVelocity());
                }
            }
            n();
        }
        if (this.J2.isFinished()) {
            J(1);
        } else {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f3, float f4, boolean z2) {
        return this.f36936D.n(f3, f4, z2);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f3, float f4) {
        return this.f36936D.rl(f3, f4);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i2, int i3, int i5, int i7, int[] iArr) {
        return this.f36936D.J2(i2, i3, i5, i7, iArr);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f36941J.n();
    }

    @VisibleForTesting
    float getVerticalScrollFactorCompat() {
        if (this.f36948a == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f36948a = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f36948a;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f36936D.az();
    }

    int jB(int i2, int i3, MotionEvent motionEvent, int i5, int i7, boolean z2) {
        int i8;
        int i9;
        VelocityTracker velocityTracker;
        if (i7 == 1) {
            FX(2, i7);
        }
        boolean z3 = false;
        if (qie(0, i2, this.f36937E, this.eF, i7)) {
            int i10 = i2 - this.f36937E[1];
            i9 = this.eF[1];
            i8 = i10;
        } else {
            i8 = i2;
            i9 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        boolean z4 = nr() && !z2;
        int i11 = i8;
        boolean z5 = nHg(0, i8, 0, scrollY, 0, scrollRange, 0, 0, true) && !ViF(i7);
        int scrollY2 = getScrollY() - scrollY;
        if (motionEvent != null && scrollY2 != 0) {
            getScrollFeedbackProvider().t(motionEvent.getDeviceId(), motionEvent.getSource(), i3, scrollY2);
        }
        int[] iArr = this.f36937E;
        iArr[1] = 0;
        ck(0, scrollY2, 0, i11 - scrollY2, this.eF, i7, iArr);
        int i12 = i9 + this.eF[1];
        int i13 = i11 - this.f36937E[1];
        int i14 = scrollY + i13;
        if (i14 < 0) {
            if (z4) {
                EdgeEffectCompat.nr(this.f36953r, (-i13) / getHeight(), i5 / getWidth());
                if (motionEvent != null) {
                    getScrollFeedbackProvider().rl(motionEvent.getDeviceId(), motionEvent.getSource(), i3, true);
                }
                if (!this.f36952o.isFinished()) {
                    this.f36952o.onRelease();
                }
            }
        } else if (i14 > scrollRange && z4) {
            EdgeEffectCompat.nr(this.f36952o, i13 / getHeight(), 1.0f - (i5 / getWidth()));
            if (motionEvent != null) {
                getScrollFeedbackProvider().rl(motionEvent.getDeviceId(), motionEvent.getSource(), i3, false);
            }
            if (!this.f36953r.isFinished()) {
                this.f36953r.onRelease();
            }
        }
        if (this.f36953r.isFinished() && this.f36952o.isFinished()) {
            z3 = z5;
        } else {
            postInvalidateOnAnimation();
        }
        if (z3 && i7 == 0 && (velocityTracker = this.f36955v) != null) {
            velocityTracker.clear();
        }
        if (i7 == 1) {
            J(i7);
            this.f36953r.onRelease();
            this.f36952o.onRelease();
        }
        return i12;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void mUb(View view, int i2) {
        this.f36941J.O(view, i2);
        J(i2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f3, float f4, boolean z2) {
        if (z2) {
            return false;
        }
        dispatchNestedFling(0.0f, f4, true);
        S((int) f4);
        return true;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f36935B = savedState;
        requestLayout();
    }

    public final void p5(int i2, int i3) {
        eF(i2, i3, 250, false);
    }

    public boolean qie(int i2, int i3, int[] iArr, int[] iArr2, int i5) {
        return this.f36936D.nr(i2, i3, iArr, iArr2, i5);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.E2) {
            this.f36946T = view2;
        } else {
            U(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z2) {
        if (z2) {
            wTp();
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    public boolean s7N(int i2) {
        boolean z2 = i2 == 130;
        int height = getHeight();
        if (z2) {
            this.f36944O.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f36944O;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f36944O.top = getScrollY() - height;
            Rect rect2 = this.f36944O;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f36944O;
        int i3 = rect3.top;
        int i5 = height + i3;
        rect3.bottom = i5;
        return bzg(i2, i3, i5);
    }

    public void setFillViewport(boolean z2) {
        if (z2 != this.Xw) {
            this.Xw = z2;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z2) {
        this.f36936D.ty(z2);
    }

    public void setOnScrollChangeListener(OnScrollChangeListener onScrollChangeListener) {
        this.f36940I = onScrollChangeListener;
    }

    public void setSmoothScrollingEnabled(boolean z2) {
        this.jB = z2;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void xMQ(View view, View view2, int i2, int i3) {
        this.f36941J.t(view, view2, i2, i3);
        FX(2, i3);
    }

    private void N(MotionEvent motionEvent) {
        int i2;
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.p5) {
            if (actionIndex == 0) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            this.f36950g = (int) motionEvent.getY(i2);
            this.p5 = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.f36955v;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private boolean O() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                return true;
            }
        }
        return false;
    }

    private boolean P5(Rect rect, boolean z2) {
        boolean z3;
        int iUo = Uo(rect);
        if (iUo != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            if (z2) {
                scrollBy(0, iUo);
                return z3;
            }
            p5(0, iUo);
        }
        return z3;
    }

    private void T(int i2, int i3, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i2);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f36936D.O(0, scrollY2, 0, i2 - scrollY2, null, i3, iArr);
    }

    private float aYN(int i2) {
        double dLog = Math.log((Math.abs(i2) * 0.35f) / (this.f36951n * 0.015f));
        float f3 = f36933k;
        return (float) (((double) (this.f36951n * 0.015f)) * Math.exp((((double) f3) / (((double) f3) - 1.0d)) * dLog));
    }

    private boolean bzg(int i2, int i3, int i5) {
        boolean z2;
        int i7;
        int height = getHeight();
        int scrollY = getScrollY();
        int i8 = height + scrollY;
        boolean z3 = false;
        if (i2 == 33) {
            z2 = true;
        } else {
            z2 = false;
        }
        View viewXQ = XQ(z2, i3, i5);
        if (viewXQ == null) {
            viewXQ = this;
        }
        if (i3 < scrollY || i5 > i8) {
            if (z2) {
                i7 = i3 - scrollY;
            } else {
                i7 = i5 - i8;
            }
            Xw(i7, 0, 1, true);
            z3 = true;
        }
        if (viewXQ != findFocus()) {
            viewXQ.requestFocus(i2);
        }
        return z3;
    }

    private void eF(int i2, int i3, int i5, boolean z2) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f36954t > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.J2.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i3 + scrollY, Math.max(0, height - height2))) - scrollY, i5);
            rV9(z2);
        } else {
            if (!this.J2.isFinished()) {
                n();
            }
            scrollBy(i2, i3);
        }
        this.f36954t = AnimationUtils.currentAnimationTimeMillis();
    }

    private boolean nY(int i2, int i3) {
        if (getChildCount() > 0) {
            int scrollY = getScrollY();
            View childAt = getChildAt(0);
            if (i3 >= childAt.getTop() - scrollY && i3 < childAt.getBottom() - scrollY && i2 >= childAt.getLeft() && i2 < childAt.getRight()) {
                return true;
            }
        }
        return false;
    }

    private boolean nr() {
        int overScrollMode = getOverScrollMode();
        if (overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int v(int i2, float f3) {
        float fNr;
        int iRound;
        float width = f3 / getWidth();
        float height = i2 / getHeight();
        float f4 = 0.0f;
        if (EdgeEffectCompat.rl(this.f36953r) != 0.0f) {
            fNr = -EdgeEffectCompat.nr(this.f36953r, -height, width);
            if (EdgeEffectCompat.rl(this.f36953r) == 0.0f) {
                this.f36953r.onRelease();
            }
        } else {
            if (EdgeEffectCompat.rl(this.f36952o) != 0.0f) {
                fNr = EdgeEffectCompat.nr(this.f36952o, height, 1.0f - width);
                if (EdgeEffectCompat.rl(this.f36952o) == 0.0f) {
                    this.f36952o.onRelease();
                }
            }
            iRound = Math.round(f4 * getHeight());
            if (iRound != 0) {
                invalidate();
            }
            return iRound;
        }
        f4 = fNr;
        iRound = Math.round(f4 * getHeight());
        if (iRound != 0) {
        }
        return iRound;
    }

    void E(int i2, int i3, int i5, boolean z2) {
        eF(i2 - getScrollX(), i3 - getScrollY(), i5, z2);
    }

    int KN(int i2) {
        int height = getHeight();
        if (i2 > 0 && EdgeEffectCompat.rl(this.f36953r) != 0.0f) {
            int iRound = Math.round(((-height) / 4.0f) * EdgeEffectCompat.nr(this.f36953r, ((-i2) * 4.0f) / height, 0.5f));
            if (iRound != i2) {
                this.f36953r.finish();
            }
            return i2 - iRound;
        }
        if (i2 < 0 && EdgeEffectCompat.rl(this.f36952o) != 0.0f) {
            float f3 = height;
            int iRound2 = Math.round((f3 / 4.0f) * EdgeEffectCompat.nr(this.f36952o, (i2 * 4.0f) / f3, 0.5f));
            if (iRound2 != i2) {
                this.f36952o.finish();
            }
            return i2 - iRound2;
        }
        return i2;
    }

    public void S(int i2) {
        if (getChildCount() > 0) {
            this.J2.fling(getScrollX(), getScrollY(), 0, i2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            rV9(true);
            if (Build.VERSION.SDK_INT >= 35) {
                Api35Impl.n(this, Math.abs(this.J2.getCurrVelocity()));
            }
        }
    }

    protected int Uo(Rect rect) {
        int i2;
        int i3;
        int i5;
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i7 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        if (rect.bottom < childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin) {
            i2 = i7 - verticalFadingEdgeLength;
        } else {
            i2 = i7;
        }
        int i8 = rect.bottom;
        if (i8 > i2 && rect.top > scrollY) {
            if (rect.height() > height) {
                i5 = rect.top - scrollY;
            } else {
                i5 = rect.bottom - i2;
            }
            return Math.min(i5, (childAt.getBottom() + layoutParams.bottomMargin) - i7);
        }
        if (rect.top >= scrollY || i8 >= i2) {
            return 0;
        }
        if (rect.height() > height) {
            i3 = 0 - (i2 - rect.bottom);
        } else {
            i3 = 0 - (scrollY - rect.top);
        }
        return Math.max(i3, -getScrollY());
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public void az(View view, int i2, int i3, int i5, int i7, int i8, int[] iArr) {
        T(i7, i8, iArr);
    }

    @Override // android.view.View
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        if (scrollY > iMax) {
            return bottom + (scrollY - iMax);
        }
        return bottom;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!super.dispatchKeyEvent(keyEvent) && !Z(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        int paddingLeft2 = 0;
        if (!this.f36953r.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (Api21Impl.n(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (Api21Impl.n(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            this.f36953r.setSize(width, height);
            if (this.f36953r.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        if (!this.f36952o.isFinished()) {
            int iSave2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int iMax = Math.max(getScrollRange(), scrollY) + height2;
            if (Api21Impl.n(this)) {
                width2 -= getPaddingLeft() + getPaddingRight();
                paddingLeft2 = getPaddingLeft();
            }
            if (Api21Impl.n(this)) {
                height2 -= getPaddingTop() + getPaddingBottom();
                iMax -= getPaddingBottom();
            }
            canvas.translate(paddingLeft2 - width2, iMax);
            canvas.rotate(180.0f, width2, 0.0f);
            this.f36952o.setSize(width2, height2);
            if (this.f36952o.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave2);
        }
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // android.view.ViewGroup
    protected void measureChild(View view, int i2, int i3) {
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i2, int i3, int i5, int i7) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    boolean nHg(int i2, int i3, int i5, int i7, int i8, int i9, int i10, int i11, boolean z2) {
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i12;
        int i13;
        boolean z7;
        boolean z9;
        int i14;
        int overScrollMode = getOverScrollMode();
        if (computeHorizontalScrollRange() > computeHorizontalScrollExtent()) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (computeVerticalScrollRange() > computeVerticalScrollExtent()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (overScrollMode != 0 && (overScrollMode != 1 || !z3)) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (overScrollMode != 0 && (overScrollMode != 1 || !z4)) {
            z6 = false;
        } else {
            z6 = true;
        }
        int i15 = i5 + i2;
        if (!z5) {
            i12 = 0;
        } else {
            i12 = i10;
        }
        int i16 = i7 + i3;
        if (!z6) {
            i13 = 0;
        } else {
            i13 = i11;
        }
        int i17 = -i12;
        int i18 = i12 + i8;
        int i19 = -i13;
        int i20 = i13 + i9;
        if (i15 > i18) {
            i15 = i18;
            z7 = true;
        } else if (i15 < i17) {
            z7 = true;
            i15 = i17;
        } else {
            z7 = false;
        }
        if (i16 > i20) {
            i16 = i20;
            z9 = true;
        } else if (i16 < i19) {
            z9 = true;
            i16 = i19;
        } else {
            z9 = false;
        }
        if (z9 && !ViF(1)) {
            int i21 = i15;
            this.J2.springBack(i21, i16, 0, 0, 0, getScrollRange());
            i14 = i21;
        } else {
            i14 = i15;
        }
        onOverScrolled(i14, i16, z7, z9);
        if (!z7 && !z9) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f36949e = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i2;
        int width;
        float axisValue;
        if (motionEvent.getAction() == 8 && !this.f36943N) {
            if (MotionEventCompat.n(motionEvent, 2)) {
                axisValue = motionEvent.getAxisValue(9);
                i2 = 9;
                width = (int) motionEvent.getX();
            } else if (MotionEventCompat.n(motionEvent, 4194304)) {
                float axisValue2 = motionEvent.getAxisValue(26);
                width = getWidth() / 2;
                i2 = 26;
                axisValue = axisValue2;
            } else {
                i2 = 0;
                width = 0;
                axisValue = 0.0f;
            }
            if (axisValue != 0.0f) {
                jB(-((int) (axisValue * getVerticalScrollFactorCompat())), i2, motionEvent, width, 1, MotionEventCompat.n(motionEvent, 8194));
                if (i2 != 0) {
                    this.Nxk.Uo(motionEvent, i2);
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z2 = true;
        if (action == 2 && this.f36943N) {
            return true;
        }
        int i2 = action & 255;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 6) {
                            N(motionEvent);
                        }
                    }
                } else {
                    int i3 = this.p5;
                    if (i3 != -1) {
                        int iFindPointerIndex = motionEvent.findPointerIndex(i3);
                        if (iFindPointerIndex == -1) {
                            Log.e("NestedScrollView", "Invalid pointerId=" + i3 + " in onInterceptTouchEvent");
                        } else {
                            int y2 = (int) motionEvent.getY(iFindPointerIndex);
                            if (Math.abs(y2 - this.f36950g) > this.f36947U && (2 & getNestedScrollAxes()) == 0) {
                                this.f36943N = true;
                                this.f36950g = y2;
                                iF();
                                this.f36955v.addMovement(motionEvent);
                                this.f36942M = 0;
                                ViewParent parent = getParent();
                                if (parent != null) {
                                    parent.requestDisallowInterceptTouchEvent(true);
                                }
                            }
                        }
                    }
                }
            } else {
                this.f36943N = false;
                this.p5 = -1;
                wTp();
                if (this.J2.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                J(0);
            }
        } else {
            int y3 = (int) motionEvent.getY();
            if (!nY((int) motionEvent.getX(), y3)) {
                if (!B(motionEvent) && this.J2.isFinished()) {
                    z2 = false;
                }
                this.f36943N = z2;
                wTp();
            } else {
                this.f36950g = y3;
                this.p5 = motionEvent.getPointerId(0);
                g();
                this.f36955v.addMovement(motionEvent);
                this.J2.computeScrollOffset();
                if (!B(motionEvent) && this.J2.isFinished()) {
                    z2 = false;
                }
                this.f36943N = z2;
                FX(2, 0);
            }
        }
        return this.f36943N;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i5, int i7) {
        super.onLayout(z2, i2, i3, i5, i7);
        int measuredHeight = 0;
        this.E2 = false;
        View view = this.f36946T;
        if (view != null && e(view, this)) {
            U(this.f36946T);
        }
        this.f36946T = null;
        if (!this.f36949e) {
            if (this.f36935B != null) {
                scrollTo(getScrollX(), this.f36935B.f36957n);
                this.f36935B = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i7 - i3) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iJ2 = J2(scrollY, paddingTop, measuredHeight);
            if (iJ2 != scrollY) {
                scrollTo(getScrollX(), iJ2);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f36949e = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.Xw && View.MeasureSpec.getMode(i3) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f3, float f4) {
        return dispatchNestedPreFling(f3, f4);
    }

    @Override // android.view.View
    protected void onOverScrolled(int i2, int i3, boolean z2, boolean z3) {
        super.scrollTo(i2, i3);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f36957n = getScrollY();
        return savedState;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i2, int i3, int i5, int i7) {
        super.onScrollChanged(i2, i3, i5, i7);
        OnScrollChangeListener onScrollChangeListener = this.f36940I;
        if (onScrollChangeListener != null) {
            onScrollChangeListener.n(this, i2, i3, i5, i7);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i5, int i7) {
        super.onSizeChanged(i2, i3, i5, i7);
        View viewFindFocus = findFocus();
        if (viewFindFocus != null && this != viewFindFocus && X(viewFindFocus, 0, i7)) {
            viewFindFocus.getDrawingRect(this.f36944O);
            offsetDescendantRectToMyCoords(viewFindFocus, this.f36944O);
            Ik(Uo(this.f36944O));
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        NestedScrollView nestedScrollView;
        ViewParent parent;
        iF();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f36942M = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(0.0f, this.f36942M);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                N(motionEvent);
                                this.f36950g = (int) motionEvent.getY(motionEvent.findPointerIndex(this.p5));
                            }
                        } else {
                            int actionIndex = motionEvent.getActionIndex();
                            this.f36950g = (int) motionEvent.getY(actionIndex);
                            this.p5 = motionEvent.getPointerId(actionIndex);
                        }
                    } else {
                        if (this.f36943N && getChildCount() > 0 && this.J2.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                            postInvalidateOnAnimation();
                        }
                        o();
                    }
                } else {
                    int iFindPointerIndex = motionEvent.findPointerIndex(this.p5);
                    if (iFindPointerIndex == -1) {
                        Log.e("NestedScrollView", "Invalid pointerId=" + this.p5 + " in onTouchEvent");
                    } else {
                        int y2 = (int) motionEvent.getY(iFindPointerIndex);
                        int i2 = this.f36950g - y2;
                        int iV = i2 - v(i2, motionEvent.getX(iFindPointerIndex));
                        if (!this.f36943N && Math.abs(iV) > this.f36947U) {
                            ViewParent parent2 = getParent();
                            if (parent2 != null) {
                                parent2.requestDisallowInterceptTouchEvent(true);
                            }
                            this.f36943N = true;
                            iV = iV > 0 ? iV - this.f36947U : iV + this.f36947U;
                        }
                        int i3 = iV;
                        if (this.f36943N) {
                            nestedScrollView = this;
                            int iJB = nestedScrollView.jB(i3, 1, motionEvent, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                            nestedScrollView.f36950g = y2 - iJB;
                            nestedScrollView.f36942M += iJB;
                        }
                    }
                }
                nestedScrollView = this;
            } else {
                nestedScrollView = this;
                VelocityTracker velocityTracker = nestedScrollView.f36955v;
                velocityTracker.computeCurrentVelocity(1000, nestedScrollView.M7);
                int yVelocity = (int) velocityTracker.getYVelocity(nestedScrollView.p5);
                if (Math.abs(yVelocity) >= nestedScrollView.P5) {
                    if (!r(yVelocity)) {
                        int i5 = -yVelocity;
                        float f3 = i5;
                        if (!dispatchNestedPreFling(0.0f, f3)) {
                            dispatchNestedFling(0.0f, f3, true);
                            S(i5);
                        }
                    }
                } else if (nestedScrollView.J2.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                o();
            }
        } else {
            nestedScrollView = this;
            if (getChildCount() == 0) {
                return false;
            }
            if (nestedScrollView.f36943N && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!nestedScrollView.J2.isFinished()) {
                n();
            }
            fD((int) motionEvent.getY(), motionEvent.getPointerId(0));
        }
        VelocityTracker velocityTracker2 = nestedScrollView.f36955v;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return P5(rect, z2);
    }

    @Override // android.view.View
    public void scrollTo(int i2, int i3) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int iJ2 = J2(i2, width, width2);
            int iJ22 = J2(i3, height, height2);
            if (iJ2 != getScrollX() || iJ22 != getScrollY()) {
                super.scrollTo(iJ2, iJ22);
            }
        }
    }

    public boolean t(int i2) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i2);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus != null && X(viewFindNextFocus, maxScrollAmount, getHeight())) {
            viewFindNextFocus.getDrawingRect(this.f36944O);
            offsetDescendantRectToMyCoords(viewFindNextFocus, this.f36944O);
            Xw(Uo(this.f36944O), 0, 1, true);
            viewFindNextFocus.requestFocus(i2);
        } else {
            if (i2 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i2 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i2 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            Xw(maxScrollAmount, 0, 1, true);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && E2(viewFindFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2) {
        if (getChildCount() <= 0) {
            super.addView(view, i2);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i2, layoutParams);
            return;
        }
        throw new IllegalStateException(SzFNXybiSxdx.voNfy);
    }
}
