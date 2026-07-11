package com.google.android.material.bottomsheet;

import Rxk.C;
import Rxk.aC;
import Rxk.o;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.Insets;
import androidx.core.math.MathUtils;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.ViewDragHelper;
import androidx.view.BackEventCompat;
import com.google.android.material.internal.l3D;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> implements IzQ.n {
    private static final int UhV = C.xMQ;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private mfo.C f58692B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f58693C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final CN3 f58694D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f58695E;
    private mfo.CN3 E2;
    final SparseIntArray EWS;

    /* JADX INFO: renamed from: FX, reason: collision with root package name */
    private boolean f58696FX;

    /* JADX INFO: renamed from: G7, reason: collision with root package name */
    private int f58697G7;
    boolean GD;

    /* JADX INFO: renamed from: GR, reason: collision with root package name */
    int f58698GR;
    private int HV;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    int f58699I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private boolean f58700J;
    private float J2;
    WeakReference Jk;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private int f58701M;
    private boolean M7;
    private float Mx;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private int f58702N;
    int Nxk;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f58703O;
    int Org;
    private boolean P5;
    private Map Po6;
    private final ArrayList Rl;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private int f58704S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private int f58705T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private boolean f58706U;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private int f58707X;
    private boolean Xw;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    float f58708Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private boolean f58709Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ValueAnimator f58710a;
    float dR0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ColorStateList f58711e;
    private boolean eF;
    int eTf;
    int eWT;
    int fcU;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f58712g;
    private final ViewDragHelper.Callback hRu;
    private boolean ijL;
    private boolean jB;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f58713k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    int f58714m;
    IzQ.Wre mYa;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f58715n;
    WeakReference n1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f58716o;
    private int ofS;
    private boolean p5;
    private boolean pJg;
    private boolean piY;
    private VelocityTracker qm;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f58717r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f58718t;
    WeakReference ul;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f58719v;
    ViewDragHelper xg;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    boolean f58720z;

    private class CN3 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f58721n;
        private boolean rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Runnable f58722t;

        class j implements Runnable {
            j() {
            }

            @Override // java.lang.Runnable
            public void run() {
                CN3.this.rl = false;
                ViewDragHelper viewDragHelper = BottomSheetBehavior.this.xg;
                if (viewDragHelper != null && viewDragHelper.ty(true)) {
                    CN3 cn3 = CN3.this;
                    cn3.t(cn3.f58721n);
                    return;
                }
                CN3 cn32 = CN3.this;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.f58714m == 2) {
                    bottomSheetBehavior.a63(cn32.f58721n);
                }
            }
        }

        private CN3() {
            this.f58722t = new j();
        }

        void t(int i2) {
            WeakReference weakReference = BottomSheetBehavior.this.ul;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f58721n = i2;
            if (this.rl) {
                return;
            }
            ViewCompat.Nxk((View) BottomSheetBehavior.this.ul.get(), this.f58722t);
            this.rl = true;
        }

        /* synthetic */ CN3(BottomSheetBehavior bottomSheetBehavior, j jVar) {
            this();
        }
    }

    class I28 extends ViewDragHelper.Callback {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private long f58724n;

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void mUb(int i2) {
            if (i2 == 1 && BottomSheetBehavior.this.ijL) {
                BottomSheetBehavior.this.a63(1);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:39:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:6:0x0010  */
        @Override // androidx.customview.widget.ViewDragHelper.Callback
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void qie(View view, float f3, float f4) {
            int i2 = 6;
            if (f4 >= 0.0f) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.f58720z && bottomSheetBehavior.VwL(view, f4)) {
                    if ((Math.abs(f3) < Math.abs(f4) && f4 > BottomSheetBehavior.this.f58717r) || ty(view)) {
                        i2 = 5;
                    } else if (BottomSheetBehavior.this.f58718t || Math.abs(view.getTop() - BottomSheetBehavior.this.ofS()) < Math.abs(view.getTop() - BottomSheetBehavior.this.Nxk)) {
                    }
                } else if (f4 == 0.0f || Math.abs(f3) > Math.abs(f4)) {
                    int top = view.getTop();
                    if (!BottomSheetBehavior.this.f58718t) {
                        BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                        int i3 = bottomSheetBehavior2.Nxk;
                        if (top < i3) {
                            if (top >= Math.abs(top - bottomSheetBehavior2.f58713k)) {
                                if (BottomSheetBehavior.this.mI()) {
                                }
                            }
                        } else if (Math.abs(top - i3) >= Math.abs(top - BottomSheetBehavior.this.f58713k) || BottomSheetBehavior.this.mI()) {
                        }
                    } else if (Math.abs(top - BottomSheetBehavior.this.f58698GR) < Math.abs(top - BottomSheetBehavior.this.f58713k)) {
                    }
                } else if (!BottomSheetBehavior.this.f58718t) {
                    int top2 = view.getTop();
                    if (Math.abs(top2 - BottomSheetBehavior.this.Nxk) >= Math.abs(top2 - BottomSheetBehavior.this.f58713k) || BottomSheetBehavior.this.mI()) {
                    }
                }
            } else if (BottomSheetBehavior.this.f58718t) {
                i2 = 3;
            } else {
                int top3 = view.getTop();
                long jCurrentTimeMillis = System.currentTimeMillis() - this.f58724n;
                if (BottomSheetBehavior.this.mI()) {
                    if (!BottomSheetBehavior.this.QZ6(jCurrentTimeMillis, (top3 * 100.0f) / r10.eWT)) {
                        i2 = 4;
                    }
                } else if (top3 <= BottomSheetBehavior.this.Nxk) {
                }
                i2 = 3;
            }
            BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
            bottomSheetBehavior3.Bu(view, i2, bottomSheetBehavior3.T3L());
        }

        I28() {
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int O(View view) {
            return BottomSheetBehavior.this.dR0() ? BottomSheetBehavior.this.eWT : BottomSheetBehavior.this.f58713k;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public boolean az(View view, int i2) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i3 = bottomSheetBehavior.f58714m;
            if (i3 == 1 || bottomSheetBehavior.GD) {
                return false;
            }
            if (i3 == 3 && bottomSheetBehavior.Org == i2) {
                WeakReference weakReference = bottomSheetBehavior.Jk;
                View view2 = weakReference != null ? (View) weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.f58724n = System.currentTimeMillis();
            WeakReference weakReference2 = BottomSheetBehavior.this.ul;
            return weakReference2 != null && weakReference2.get() == view;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void gh(View view, int i2, int i3, int i5, int i7) {
            BottomSheetBehavior.this.eTf(i3);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int rl(View view, int i2, int i3) {
            return MathUtils.rl(i2, BottomSheetBehavior.this.ofS(), O(view));
        }

        private boolean ty(View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            if (top > (bottomSheetBehavior.eWT + bottomSheetBehavior.ofS()) / 2) {
                return true;
            }
            return false;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int n(View view, int i2, int i3) {
            return view.getLeft();
        }
    }

    class Ml implements l3D.w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ boolean f58725n;

        Ml(boolean z2) {
            this.f58725n = z2;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0080  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00a3  */
        @Override // com.google.android.material.internal.l3D.w6
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public WindowInsetsCompat n(View view, WindowInsetsCompat windowInsetsCompat, l3D.Ml ml) {
            boolean z2;
            int i2;
            int i3;
            Insets insetsJ2 = windowInsetsCompat.J2(WindowInsetsCompat.Type.xMQ());
            Insets insetsJ22 = windowInsetsCompat.J2(WindowInsetsCompat.Type.J2());
            BottomSheetBehavior.this.f58701M = insetsJ2.rl;
            boolean zUo = l3D.Uo(view);
            int paddingBottom = view.getPaddingBottom();
            int paddingLeft = view.getPaddingLeft();
            int paddingRight = view.getPaddingRight();
            if (BottomSheetBehavior.this.Xw) {
                BottomSheetBehavior.this.f58695E = windowInsetsCompat.mUb();
                paddingBottom = ml.nr + BottomSheetBehavior.this.f58695E;
            }
            if (BottomSheetBehavior.this.jB) {
                if (zUo) {
                    i3 = ml.f59049t;
                } else {
                    i3 = ml.f59048n;
                }
                paddingLeft = i3 + insetsJ2.f36410n;
            }
            if (BottomSheetBehavior.this.f58706U) {
                if (zUo) {
                    i2 = ml.f59048n;
                } else {
                    i2 = ml.f59049t;
                }
                paddingRight = i2 + insetsJ2.f36411t;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            boolean z3 = true;
            if (BottomSheetBehavior.this.M7) {
                int i5 = marginLayoutParams.leftMargin;
                int i7 = insetsJ2.f36410n;
                if (i5 != i7) {
                    marginLayoutParams.leftMargin = i7;
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            if (BottomSheetBehavior.this.p5) {
                int i8 = marginLayoutParams.rightMargin;
                int i9 = insetsJ2.f36411t;
                if (i8 != i9) {
                    marginLayoutParams.rightMargin = i9;
                    z2 = true;
                }
            }
            if (BottomSheetBehavior.this.eF) {
                int i10 = marginLayoutParams.topMargin;
                int i11 = insetsJ2.rl;
                if (i10 != i11) {
                    marginLayoutParams.topMargin = i11;
                } else {
                    z3 = z2;
                }
            }
            if (z3) {
                view.setLayoutParams(marginLayoutParams);
            }
            view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
            if (this.f58725n) {
                BottomSheetBehavior.this.f58702N = insetsJ22.nr;
            }
            if (BottomSheetBehavior.this.Xw || this.f58725n) {
                BottomSheetBehavior.this.Qu(false);
                return windowInsetsCompat;
            }
            return windowInsetsCompat;
        }
    }

    class Wre implements AccessibilityViewCommand {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ int f58730n;

        Wre(int i2) {
            this.f58730n = i2;
        }

        @Override // androidx.core.view.accessibility.AccessibilityViewCommand
        public boolean n(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
            BottomSheetBehavior.this.RQ(this.f58730n);
            return true;
        }
    }

    class j implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ View f58732n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f58733t;

        j(View view, int i2) {
            this.f58732n = view;
            this.f58733t = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.Bu(this.f58732n, this.f58733t, false);
        }
    }

    class n extends AnimatorListenerAdapter {
        n() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomSheetBehavior.this.a63(5);
            WeakReference weakReference = BottomSheetBehavior.this.ul;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            ((View) BottomSheetBehavior.this.ul.get()).requestLayout();
        }
    }

    class w6 implements ValueAnimator.AnimatorUpdateListener {
        w6() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.E2 != null) {
                BottomSheetBehavior.this.E2.eF(fFloatValue);
            }
        }
    }

    public BottomSheetBehavior() {
        this.f58715n = 0;
        this.f58718t = true;
        this.f58703O = false;
        this.f58707X = -1;
        this.f58705T = -1;
        this.f58694D = new CN3(this, null);
        this.f58708Y = 0.5f;
        this.dR0 = -1.0f;
        this.ijL = true;
        this.f58714m = 4;
        this.eTf = 4;
        this.Mx = 0.1f;
        this.Rl = new ArrayList();
        this.HV = -1;
        this.EWS = new SparseIntArray();
        this.hRu = new I28();
    }

    private int C(int i2) {
        if (i2 == 3) {
            return ofS();
        }
        if (i2 == 4) {
            return this.f58713k;
        }
        if (i2 == 5) {
            return this.eWT;
        }
        if (i2 == 6) {
            return this.Nxk;
        }
        throw new IllegalArgumentException("Invalid state to get top offset: " + i2);
    }

    private float I(float f3, RoundedCorner roundedCorner) {
        if (roundedCorner != null) {
            float radius = roundedCorner.getRadius();
            if (radius > 0.0f && f3 > 0.0f) {
                return radius / f3;
            }
        }
        return 0.0f;
    }

    private void f(int i2, boolean z2) {
        boolean zFcU;
        ValueAnimator valueAnimator;
        if (i2 == 2 || this.f58700J == (zFcU = fcU()) || this.E2 == null) {
            return;
        }
        this.f58700J = zFcU;
        if (!z2 || (valueAnimator = this.f58710a) == null) {
            ValueAnimator valueAnimator2 = this.f58710a;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f58710a.cancel();
            }
            this.E2.eF(this.f58700J ? Nxk() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            this.f58710a.reverse();
        } else {
            this.f58710a.setFloatValues(this.E2.WPU(), zFcU ? Nxk() : 1.0f);
            this.f58710a.start();
        }
    }

    private void mYa() {
        this.Org = -1;
        this.HV = -1;
        VelocityTracker velocityTracker = this.qm;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.qm = null;
        }
    }

    private void qm(View view, AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat, int i2) {
        ViewCompat.z(view, accessibilityActionCompat, null, piY(i2));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean E2(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i2, int i3) {
        this.ofS = 0;
        this.f58693C = false;
        return (i2 & 2) != 0;
    }

    public final void ER(int i2, boolean z2) {
        if (i2 == -1) {
            if (this.f58709Z) {
                return;
            } else {
                this.f58709Z = true;
            }
        } else {
            if (!this.f58709Z && this.f58716o == i2) {
                return;
            }
            this.f58709Z = false;
            this.f58716o = Math.max(0, i2);
        }
        Qu(z2);
    }

    public boolean QZ6(long j2, float f3) {
        return false;
    }

    public void RQ(int i2) {
        if (i2 == 1 || i2 == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("STATE_");
            sb.append(i2 == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        }
        if (!this.f58720z && i2 == 5) {
            Log.w("BottomSheetBehavior", "Cannot set state: " + i2);
            return;
        }
        int i3 = (i2 == 6 && this.f58718t && C(i2) <= this.f58698GR) ? 3 : i2;
        WeakReference weakReference = this.ul;
        if (weakReference == null || weakReference.get() == null) {
            a63(i2);
        } else {
            View view = (View) this.ul.get();
            HV(view, new j(view, i3));
        }
    }

    public boolean Rl() {
        return true;
    }

    public boolean T3L() {
        return true;
    }

    public void UhV(float f3) {
        if (f3 <= 0.0f || f3 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f58708Y = f3;
        if (this.ul != null) {
            GR();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void XQ(CoordinatorLayout coordinatorLayout, View view, View view2, int i2, int i3, int[] iArr, int i5) {
        if (i5 == 1) {
            return;
        }
        WeakReference weakReference = this.Jk;
        View view3 = weakReference != null ? (View) weakReference.get() : null;
        if (!Rl() || view2 == view3) {
            int top = view.getTop();
            int i7 = top - i3;
            if (i3 > 0) {
                if (i7 < ofS()) {
                    int iOfS = top - ofS();
                    iArr[1] = iOfS;
                    ViewCompat.FX(view, -iOfS);
                    a63(3);
                } else {
                    if (!this.ijL) {
                        return;
                    }
                    iArr[1] = i3;
                    ViewCompat.FX(view, -i3);
                    a63(1);
                }
            } else if (i3 < 0 && !view2.canScrollVertically(-1)) {
                if (i7 > this.f58713k && !dR0()) {
                    int i8 = top - this.f58713k;
                    iArr[1] = i8;
                    ViewCompat.FX(view, -i8);
                    a63(4);
                } else {
                    if (!this.ijL) {
                        return;
                    }
                    iArr[1] = i3;
                    ViewCompat.FX(view, -i3);
                    a63(1);
                }
            }
            eTf(view.getTop());
            this.ofS = i3;
            this.f58693C = true;
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void aYN(CoordinatorLayout coordinatorLayout, View view, View view2, int i2, int i3, int i5, int i7, int i8, int[] iArr) {
    }

    public boolean mI() {
        return false;
    }

    public boolean n1() {
        return true;
    }

    public void tUK(int i2) {
        ER(i2, false);
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new j();
        int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final int f58726O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        boolean f58727Z;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f58728o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        boolean f58729r;

        class j implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }

            j() {
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f58726O = parcel.readInt();
            this.J2 = parcel.readInt();
            this.f58729r = parcel.readInt() == 1;
            this.f58728o = parcel.readInt() == 1;
            this.f58727Z = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f58726O);
            parcel.writeInt(this.J2);
            parcel.writeInt(this.f58729r ? 1 : 0);
            parcel.writeInt(this.f58728o ? 1 : 0);
            parcel.writeInt(this.f58727Z ? 1 : 0);
        }

        public SavedState(Parcelable parcelable, BottomSheetBehavior bottomSheetBehavior) {
            super(parcelable);
            this.f58726O = bottomSheetBehavior.f58714m;
            this.J2 = bottomSheetBehavior.f58716o;
            this.f58729r = bottomSheetBehavior.f58718t;
            this.f58728o = bottomSheetBehavior.f58720z;
            this.f58727Z = bottomSheetBehavior.piY;
        }
    }

    private void F(View view) {
        boolean z2 = (Build.VERSION.SDK_INT < 29 || eWT() || this.f58709Z) ? false : true;
        if (this.Xw || this.jB || this.f58706U || this.M7 || this.p5 || this.eF || z2) {
            l3D.rl(view, new Ml(z2));
        }
    }

    private boolean G7() {
        WeakReference weakReference = this.ul;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            ((View) this.ul.get()).getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    private void GR() {
        this.Nxk = (int) (this.eWT * (1.0f - this.f58708Y));
    }

    private float Mx() {
        VelocityTracker velocityTracker = this.qm;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.J2);
        return this.qm.getYVelocity(this.Org);
    }

    private float Nxk() {
        WeakReference weakReference;
        WindowInsets rootWindowInsets;
        if (this.E2 == null || (weakReference = this.ul) == null || weakReference.get() == null || Build.VERSION.SDK_INT < 31) {
            return 0.0f;
        }
        View view = (View) this.ul.get();
        if (!G7() || (rootWindowInsets = view.getRootWindowInsets()) == null) {
            return 0.0f;
        }
        return Math.max(I(this.E2.iF(), rootWindowInsets.getRoundedCorner(0)), I(this.E2.fD(), rootWindowInsets.getRoundedCorner(1)));
    }

    private void Org(SavedState savedState) {
        int i2 = this.f58715n;
        if (i2 == 0) {
            return;
        }
        if (i2 == -1 || (i2 & 1) == 1) {
            this.f58716o = savedState.J2;
        }
        if (i2 == -1 || (i2 & 2) == 2) {
            this.f58718t = savedState.f58729r;
        }
        if (i2 == -1 || (i2 & 4) == 4) {
            this.f58720z = savedState.f58728o;
        }
        if (i2 == -1 || (i2 & 8) == 8) {
            this.piY = savedState.f58727Z;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Qu(boolean z2) {
        View view;
        if (this.ul != null) {
            a();
            if (this.f58714m != 4 || (view = (View) this.ul.get()) == null) {
                return;
            }
            if (z2) {
                RQ(4);
            } else {
                view.requestLayout();
            }
        }
    }

    private void Uf(View view, int i2) {
        if (view == null) {
            return;
        }
        z(view, i2);
        if (!this.f58718t && this.f58714m != 6) {
            this.EWS.put(i2, D(view, aC.f8779n, 6));
        }
        if (this.f58720z && n1() && this.f58714m != 5) {
            qm(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ViF, 5);
        }
        int i3 = this.f58714m;
        if (i3 == 3) {
            qm(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.aYN, this.f58718t ? 4 : 6);
            return;
        }
        if (i3 == 4) {
            qm(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.WPU, this.f58718t ? 3 : 6);
        } else {
            if (i3 != 6) {
                return;
            }
            qm(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.aYN, 4);
            qm(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.WPU, 3);
        }
    }

    private int Y() {
        int i2;
        return this.f58709Z ? Math.min(Math.max(this.f58704S, this.eWT - ((this.fcU * 9) / 16)), this.f58697G7) + this.f58695E : (this.f58719v || this.Xw || (i2 = this.f58702N) <= 0) ? this.f58716o + this.f58695E : Math.max(this.f58716o, i2 + this.f58712g);
    }

    private boolean fcU() {
        if (this.f58714m == 3) {
            return this.f58696FX || G7();
        }
        return false;
    }

    private void ijL(Context context) {
        if (this.f58692B == null) {
            return;
        }
        mfo.CN3 cn3 = new mfo.CN3(this.f58692B);
        this.E2 = cn3;
        cn3.nHg(context);
        ColorStateList colorStateList = this.f58711e;
        if (colorStateList != null) {
            this.E2.p5(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.E2.setTint(typedValue.data);
    }

    private float k(int i2) {
        float f3;
        float fOfS;
        int i3 = this.f58713k;
        if (i2 > i3 || i3 == ofS()) {
            int i5 = this.f58713k;
            f3 = i5 - i2;
            fOfS = this.eWT - i5;
        } else {
            int i7 = this.f58713k;
            f3 = i7 - i2;
            fOfS = i7 - ofS();
        }
        return f3 / fOfS;
    }

    private void p0N() {
        WeakReference weakReference = this.ul;
        if (weakReference != null) {
            Uf((View) weakReference.get(), 0);
        }
        WeakReference weakReference2 = this.n1;
        if (weakReference2 != null) {
            Uf((View) weakReference2.get(), 1);
        }
    }

    private AccessibilityViewCommand piY(int i2) {
        return new Wre(i2);
    }

    private boolean tFV() {
        if (this.xg != null) {
            return this.ijL || this.f58714m == 1;
        }
        return false;
    }

    private void ub(boolean z2) {
        Map map;
        WeakReference weakReference = this.ul;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = ((View) weakReference.get()).getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z2) {
                if (this.Po6 != null) {
                    return;
                } else {
                    this.Po6 = new HashMap(childCount);
                }
            }
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = coordinatorLayout.getChildAt(i2);
                if (childAt != this.ul.get()) {
                    if (z2) {
                        this.Po6.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        if (this.f58703O) {
                            ViewCompat.ul(childAt, 4);
                        }
                    } else if (this.f58703O && (map = this.Po6) != null && map.containsKey(childAt)) {
                        ViewCompat.ul(childAt, ((Integer) this.Po6.get(childAt)).intValue());
                    }
                }
            }
            if (!z2) {
                this.Po6 = null;
            } else if (this.f58703O) {
                ((View) this.ul.get()).sendAccessibilityEvent(8);
            }
        }
    }

    private void z(View view, int i2) {
        if (view == null) {
            return;
        }
        ViewCompat.k(view, 524288);
        ViewCompat.k(view, 262144);
        ViewCompat.k(view, 1048576);
        int i3 = this.EWS.get(i2, -1);
        if (i3 != -1) {
            ViewCompat.k(view, i3);
            this.EWS.delete(i2);
        }
    }

    public void EWS(boolean z2) {
        if (this.f58718t == z2) {
            return;
        }
        this.f58718t = z2;
        if (this.ul != null) {
            a();
        }
        a63((this.f58718t && this.f58714m == 6) ? 3 : this.f58714m);
        f(this.f58714m, true);
        p0N();
    }

    public void GD(boolean z2) {
        this.ijL = z2;
    }

    public void How(int i2) {
        this.f58707X = i2;
    }

    public void K(int i2) {
        this.f58705T = i2;
    }

    @Override // IzQ.n
    public void O() {
        IzQ.Wre wre = this.mYa;
        if (wre == null) {
            return;
        }
        BackEventCompat backEventCompatT = wre.t();
        if (backEventCompatT == null || Build.VERSION.SDK_INT < 34) {
            RQ(this.f58720z ? 5 : 4);
        } else if (this.f58720z) {
            this.mYa.KN(backEventCompatT, new n());
        } else {
            this.mYa.xMQ(backEventCompatT, null);
            RQ(4);
        }
    }

    public void Po6(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.f58699I = i2;
        f(this.f58714m, true);
    }

    boolean VwL(View view, float f3) {
        if (this.piY) {
            return true;
        }
        if (n1() && view.getTop() >= this.f58713k) {
            return Math.abs((((float) view.getTop()) + (f3 * this.Mx)) - ((float) this.f58713k)) / ((float) Y()) > 0.5f;
        }
        return false;
    }

    public void W(boolean z2) {
        this.piY = z2;
    }

    void a63(int i2) {
        if (this.f58714m == i2) {
            return;
        }
        this.f58714m = i2;
        if (i2 == 4 || i2 == 3 || i2 == 6 || (this.f58720z && i2 == 5)) {
            this.eTf = i2;
        }
        WeakReference weakReference = this.ul;
        if (weakReference == null || ((View) weakReference.get()) == null) {
            return;
        }
        if (i2 == 3) {
            ub(true);
        } else if (i2 == 6 || i2 == 5 || i2 == 4) {
            ub(false);
        }
        f(i2, true);
        if (this.Rl.size() <= 0) {
            p0N();
        } else {
            android.support.v4.media.j.n(this.Rl.get(0));
            throw null;
        }
    }

    void eTf(int i2) {
        if (((View) this.ul.get()) == null || this.Rl.isEmpty()) {
            return;
        }
        k(i2);
        if (this.Rl.size() <= 0) {
            return;
        }
        android.support.v4.media.j.n(this.Rl.get(0));
        throw null;
    }

    public boolean eWT() {
        return this.f58719v;
    }

    public void hRu(boolean z2) {
        this.f58719v = z2;
    }

    public void i(boolean z2) {
        if (this.f58720z != z2) {
            this.f58720z = z2;
            if (!z2 && this.f58714m == 5) {
                RQ(4);
            }
            p0N();
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public Parcelable iF(CoordinatorLayout coordinatorLayout, View view) {
        return new SavedState(super.iF(coordinatorLayout, view), this);
    }

    public void kSg(int i2) {
        this.f58717r = i2;
    }

    public void lLA(int i2) {
        this.f58715n = i2;
    }

    @Override // IzQ.n
    public void nr(BackEventCompat backEventCompat) {
        IzQ.Wre wre = this.mYa;
        if (wre == null) {
            return;
        }
        wre.qie(backEventCompat);
    }

    public int ofS() {
        if (this.f58718t) {
            return this.f58698GR;
        }
        return Math.max(this.f58699I, this.P5 ? 0 : this.f58701M);
    }

    @Override // IzQ.n
    public void rl() {
        IzQ.Wre wre = this.mYa;
        if (wre == null) {
            return;
        }
        wre.J2();
    }

    @Override // IzQ.n
    public void t(BackEventCompat backEventCompat) {
        IzQ.Wre wre = this.mYa;
        if (wre == null) {
            return;
        }
        wre.mUb(backEventCompat);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void te(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.te(coordinatorLayout, view, savedState.n());
        Org(savedState);
        int i2 = savedState.f58726O;
        if (i2 == 1 || i2 == 2) {
            this.f58714m = 4;
            this.eTf = 4;
        } else {
            this.f58714m = i2;
            this.eTf = i2;
        }
    }

    public boolean ul() {
        return this.f58720z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Bu(View view, int i2, boolean z2) {
        int iC = C(i2);
        ViewDragHelper viewDragHelper = this.xg;
        if (viewDragHelper != null && (!z2 ? viewDragHelper.U(view, view.getLeft(), iC) : viewDragHelper.Xw(view.getLeft(), iC))) {
            a63(2);
            f(i2, true);
            this.f58694D.t(i2);
            return;
        }
        a63(i2);
    }

    private int D(View view, int i2, int i3) {
        return ViewCompat.t(view, view.getResources().getString(i2), piY(i3));
    }

    private void HV(View view, Runnable runnable) {
        if (Jk(view)) {
            view.post(runnable);
        } else {
            runnable.run();
        }
    }

    private boolean Jk(View view) {
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && ViewCompat.U(view)) {
            return true;
        }
        return false;
    }

    private void a() {
        int iY = Y();
        if (this.f58718t) {
            this.f58713k = Math.max(this.eWT - iY, this.f58698GR);
        } else {
            this.f58713k = this.eWT - iY;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean dR0() {
        if (ul() && n1()) {
            return true;
        }
        return false;
    }

    private void m() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(Nxk(), 1.0f);
        this.f58710a = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f58710a.addUpdateListener(new w6());
    }

    private int pJg(int i2, int i3, int i5, int i7) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, i3, i7);
        if (i5 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode != 1073741824) {
            if (size != 0) {
                i5 = Math.min(size, i5);
            }
            return View.MeasureSpec.makeMeasureSpec(i5, Integer.MIN_VALUE);
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(size, i5), 1073741824);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean HI(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        boolean z2;
        View view2;
        int i2;
        ViewDragHelper viewDragHelper;
        if (view.isShown() && this.ijL) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                mYa();
            }
            if (this.qm == null) {
                this.qm = VelocityTracker.obtain();
            }
            this.qm.addMovement(motionEvent);
            View view3 = null;
            if (actionMasked != 0) {
                if (actionMasked == 1 || actionMasked == 3) {
                    this.GD = false;
                    this.Org = -1;
                    if (this.pJg) {
                        this.pJg = false;
                        return false;
                    }
                }
            } else {
                int x2 = (int) motionEvent.getX();
                this.HV = (int) motionEvent.getY();
                if (this.f58714m != 2) {
                    WeakReference weakReference = this.Jk;
                    if (weakReference != null) {
                        view2 = (View) weakReference.get();
                    } else {
                        view2 = null;
                    }
                    if (view2 != null && coordinatorLayout.nY(view2, x2, this.HV)) {
                        this.Org = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.GD = true;
                    }
                }
                if (this.Org == -1 && !coordinatorLayout.nY(view, x2, this.HV)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.pJg = z2;
            }
            if (!this.pJg && (viewDragHelper = this.xg) != null && viewDragHelper.jB(motionEvent)) {
                return true;
            }
            WeakReference weakReference2 = this.Jk;
            if (weakReference2 != null) {
                view3 = (View) weakReference2.get();
            }
            if (actionMasked != 2 || view3 == null || this.pJg || this.f58714m == 1 || coordinatorLayout.nY(view3, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.xg == null || (i2 = this.HV) == -1 || Math.abs(i2 - motionEvent.getY()) <= this.xg.g()) {
                return false;
            }
            return true;
        }
        this.pJg = true;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean Ik(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i5, int i7) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(pJg(i2, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, this.f58707X, marginLayoutParams.width), pJg(i5, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i7, this.f58705T, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean T(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f58714m == 1 && actionMasked == 0) {
            return true;
        }
        if (tFV()) {
            this.xg.X(motionEvent);
        }
        if (actionMasked == 0) {
            mYa();
        }
        if (this.qm == null) {
            this.qm = VelocityTracker.obtain();
        }
        this.qm.addMovement(motionEvent);
        if (tFV() && actionMasked == 2 && !this.pJg && Math.abs(this.HV - motionEvent.getY()) > this.xg.g()) {
            this.xg.t(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.pJg;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a9  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void X(CoordinatorLayout coordinatorLayout, View view, View view2, int i2) {
        WeakReference weakReference;
        int i3 = 3;
        if (view.getTop() == ofS()) {
            a63(3);
            return;
        }
        if (Rl() && ((weakReference = this.Jk) == null || view2 != weakReference.get() || !this.f58693C)) {
            return;
        }
        if (this.ofS > 0) {
            if (!this.f58718t && view.getTop() > this.Nxk) {
                i3 = 6;
            }
        } else if (this.f58720z && VwL(view, Mx())) {
            i3 = 5;
        } else if (this.ofS == 0) {
            int top = view.getTop();
            if (this.f58718t) {
                if (Math.abs(top - this.f58698GR) >= Math.abs(top - this.f58713k)) {
                    i3 = 4;
                }
            } else {
                int i5 = this.Nxk;
                if (top < i5) {
                    if (top >= Math.abs(top - this.f58713k)) {
                        if (mI()) {
                        }
                    }
                } else if (Math.abs(top - i5) < Math.abs(top - this.f58713k)) {
                }
            }
        } else {
            if (!this.f58718t) {
                int top2 = view.getTop();
                if (Math.abs(top2 - this.Nxk) < Math.abs(top2 - this.f58713k)) {
                }
            }
            i3 = 4;
        }
        Bu(view, i3, false);
        this.f58693C = false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean ck(CoordinatorLayout coordinatorLayout, View view, int i2) {
        if (ViewCompat.WPU(coordinatorLayout) && !ViewCompat.WPU(view)) {
            view.setFitsSystemWindows(true);
        }
        if (this.ul == null) {
            this.f58704S = coordinatorLayout.getResources().getDimensionPixelSize(Rxk.Ml.f8756n);
            F(view);
            ViewCompat.K(view, new com.google.android.material.bottomsheet.j(view));
            this.ul = new WeakReference(view);
            this.mYa = new IzQ.Wre(view);
            mfo.CN3 cn3 = this.E2;
            if (cn3 != null) {
                ViewCompat.C(view, cn3);
                mfo.CN3 cn32 = this.E2;
                float fXQ = this.dR0;
                if (fXQ == -1.0f) {
                    fXQ = ViewCompat.XQ(view);
                }
                cn32.M7(fXQ);
            } else {
                ColorStateList colorStateList = this.f58711e;
                if (colorStateList != null) {
                    ViewCompat.Mx(view, colorStateList);
                }
            }
            p0N();
            if (ViewCompat.aYN(view) == 0) {
                ViewCompat.ul(view, 1);
            }
        }
        if (this.xg == null) {
            this.xg = ViewDragHelper.ck(coordinatorLayout, this.hRu);
        }
        int top = view.getTop();
        coordinatorLayout.X(view, i2);
        this.fcU = coordinatorLayout.getWidth();
        this.eWT = coordinatorLayout.getHeight();
        int height = view.getHeight();
        this.f58697G7 = height;
        int iMin = this.eWT;
        int i3 = iMin - height;
        int i5 = this.f58701M;
        if (i3 < i5) {
            if (this.P5) {
                int i7 = this.f58705T;
                if (i7 != -1) {
                    iMin = Math.min(iMin, i7);
                }
                this.f58697G7 = iMin;
            } else {
                int iMin2 = iMin - i5;
                int i8 = this.f58705T;
                if (i8 != -1) {
                    iMin2 = Math.min(iMin2, i8);
                }
                this.f58697G7 = iMin2;
            }
        }
        this.f58698GR = Math.max(0, this.eWT - this.f58697G7);
        GR();
        a();
        int i9 = this.f58714m;
        if (i9 == 3) {
            ViewCompat.FX(view, ofS());
        } else if (i9 == 6) {
            ViewCompat.FX(view, this.Nxk);
        } else if (this.f58720z && i9 == 5) {
            ViewCompat.FX(view, this.eWT);
        } else if (i9 == 4) {
            ViewCompat.FX(view, this.f58713k);
        } else if (i9 == 1 || i9 == 2) {
            ViewCompat.FX(view, top - view.getTop());
        }
        f(this.f58714m, false);
        this.Jk = new WeakReference(xg(view));
        if (this.Rl.size() <= 0) {
            return true;
        }
        android.support.v4.media.j.n(this.Rl.get(0));
        throw null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void gh(CoordinatorLayout.LayoutParams layoutParams) {
        super.gh(layoutParams);
        this.ul = null;
        this.xg = null;
        this.mYa = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean o(CoordinatorLayout coordinatorLayout, View view, View view2, float f3, float f4) {
        WeakReference weakReference;
        if (!Rl() || (weakReference = this.Jk) == null || view2 != weakReference.get() || (this.f58714m == 3 && !super.o(coordinatorLayout, view, view2, f3, f4))) {
            return false;
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void ty() {
        super.ty();
        this.ul = null;
        this.xg = null;
        this.mYa = null;
    }

    View xg(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (ViewCompat.M7(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View viewXg = xg(viewGroup.getChildAt(i2));
                if (viewXg != null) {
                    return viewXg;
                }
            }
        }
        return null;
    }

    public BottomSheetBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        int i2;
        super(context, attributeSet);
        this.f58715n = 0;
        this.f58718t = true;
        this.f58703O = false;
        this.f58707X = -1;
        this.f58705T = -1;
        this.f58694D = new CN3(this, null);
        this.f58708Y = 0.5f;
        this.dR0 = -1.0f;
        this.ijL = true;
        this.f58714m = 4;
        this.eTf = 4;
        this.Mx = 0.1f;
        this.Rl = new ArrayList();
        this.HV = -1;
        this.EWS = new SparseIntArray();
        this.hRu = new I28();
        this.f58712g = context.getResources().getDimensionPixelSize(Rxk.Ml.f8749Y);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o.f8870k);
        int i3 = o.ijL;
        if (typedArrayObtainStyledAttributes.hasValue(i3)) {
            this.f58711e = X4.w6.n(context, typedArrayObtainStyledAttributes, i3);
        }
        if (typedArrayObtainStyledAttributes.hasValue(o.HV)) {
            this.f58692B = mfo.C.O(context, attributeSet, Rxk.n.nr, UhV).az();
        }
        ijL(context);
        m();
        this.dR0 = typedArrayObtainStyledAttributes.getDimension(o.piY, -1.0f);
        int i5 = o.dR0;
        if (typedArrayObtainStyledAttributes.hasValue(i5)) {
            How(typedArrayObtainStyledAttributes.getDimensionPixelSize(i5, -1));
        }
        int i7 = o.f8891z;
        if (typedArrayObtainStyledAttributes.hasValue(i7)) {
            K(typedArrayObtainStyledAttributes.getDimensionPixelSize(i7, -1));
        }
        int i8 = o.f8814C;
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(i8);
        if (typedValuePeekValue != null && (i2 = typedValuePeekValue.data) == -1) {
            tUK(i2);
        } else {
            tUK(typedArrayObtainStyledAttributes.getDimensionPixelSize(i8, -1));
        }
        i(typedArrayObtainStyledAttributes.getBoolean(o.ofS, false));
        hRu(typedArrayObtainStyledAttributes.getBoolean(o.eWT, false));
        EWS(typedArrayObtainStyledAttributes.getBoolean(o.xg, true));
        W(typedArrayObtainStyledAttributes.getBoolean(o.fcU, false));
        GD(typedArrayObtainStyledAttributes.getBoolean(o.f8874m, true));
        lLA(typedArrayObtainStyledAttributes.getInt(o.Mx, 0));
        UhV(typedArrayObtainStyledAttributes.getFloat(o.pJg, 0.5f));
        int i9 = o.eTf;
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(i9);
        if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
            Po6(typedValuePeekValue2.data);
        } else {
            Po6(typedArrayObtainStyledAttributes.getDimensionPixelOffset(i9, 0));
        }
        kSg(typedArrayObtainStyledAttributes.getInt(o.f8821G7, 500));
        this.Xw = typedArrayObtainStyledAttributes.getBoolean(o.Rl, false);
        this.jB = typedArrayObtainStyledAttributes.getBoolean(o.qm, false);
        this.f58706U = typedArrayObtainStyledAttributes.getBoolean(o.mYa, false);
        this.P5 = typedArrayObtainStyledAttributes.getBoolean(o.Org, true);
        this.M7 = typedArrayObtainStyledAttributes.getBoolean(o.ul, false);
        this.p5 = typedArrayObtainStyledAttributes.getBoolean(o.n1, false);
        this.eF = typedArrayObtainStyledAttributes.getBoolean(o.Jk, false);
        this.f58696FX = typedArrayObtainStyledAttributes.getBoolean(o.GD, true);
        typedArrayObtainStyledAttributes.recycle();
        this.J2 = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
