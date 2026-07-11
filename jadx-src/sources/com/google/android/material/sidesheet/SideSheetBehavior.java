package com.google.android.material.sidesheet;

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
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.math.MathUtils;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.ViewDragHelper;
import androidx.view.BackEventCompat;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import mfo.C;
import mfo.CN3;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> implements IzQ.n {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static final int f59134B = aC.te;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private static final int f59135J = C.HI;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f59136E;
    private int E2;

    /* JADX INFO: renamed from: FX, reason: collision with root package name */
    private final ViewDragHelper.Callback f59137FX;
    private ColorStateList J2;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final Set f59138M;
    private int M7;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private int f59139N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private CN3 f59140O;
    private WeakReference P5;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private boolean f59141S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private float f59142T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private WeakReference f59143U;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private boolean f59144X;
    private int Xw;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private float f59145Z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ViewDragHelper f59146e;
    private IzQ.CN3 eF;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f59147g;
    private int jB;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private com.google.android.material.sidesheet.w6 f59148n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final w6 f59149o;
    private VelocityTracker p5;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private mfo.C f59150r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f59151t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f59152v;

    class j extends ViewDragHelper.Callback {
        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void mUb(int i2) {
            if (i2 == 1 && SideSheetBehavior.this.f59141S) {
                SideSheetBehavior.this.EWS(1);
            }
        }

        j() {
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public boolean az(View view, int i2) {
            return (SideSheetBehavior.this.f59147g == 1 || SideSheetBehavior.this.f59143U == null || SideSheetBehavior.this.f59143U.get() != view) ? false : true;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void gh(View view, int i2, int i3, int i5, int i7) {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            View viewNxk = SideSheetBehavior.this.Nxk();
            if (viewNxk != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) viewNxk.getLayoutParams()) != null) {
                SideSheetBehavior.this.f59148n.ck(marginLayoutParams, view.getLeft(), view.getRight());
                viewNxk.setLayoutParams(marginLayoutParams);
            }
            SideSheetBehavior.this.J(view, i2);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int n(View view, int i2, int i3) {
            return MathUtils.rl(i2, SideSheetBehavior.this.f59148n.Uo(), SideSheetBehavior.this.f59148n.J2());
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int nr(View view) {
            return SideSheetBehavior.this.f59139N + SideSheetBehavior.this.piY();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void qie(View view, float f3, float f4) {
            int iE = SideSheetBehavior.this.E(view, f3, f4);
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            sideSheetBehavior.How(view, iE, sideSheetBehavior.K());
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int rl(View view, int i2, int i3) {
            return view.getTop();
        }
    }

    class n extends AnimatorListenerAdapter {
        n() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            SideSheetBehavior.this.EWS(5);
            if (SideSheetBehavior.this.f59143U == null || SideSheetBehavior.this.f59143U.get() == null) {
                return;
            }
            ((View) SideSheetBehavior.this.f59143U.get()).requestLayout();
        }
    }

    class w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f59156n;
        private boolean rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Runnable f59157t = new Runnable() { // from class: com.google.android.material.sidesheet.I28
            @Override // java.lang.Runnable
            public final void run() {
                SideSheetBehavior.w6.n(this.f59133n);
            }
        };

        public static /* synthetic */ void n(w6 w6Var) {
            w6Var.rl = false;
            if (SideSheetBehavior.this.f59146e != null && SideSheetBehavior.this.f59146e.ty(true)) {
                w6Var.rl(w6Var.f59156n);
            } else if (SideSheetBehavior.this.f59147g == 2) {
                SideSheetBehavior.this.EWS(w6Var.f59156n);
            }
        }

        w6() {
        }

        void rl(int i2) {
            if (SideSheetBehavior.this.f59143U == null || SideSheetBehavior.this.f59143U.get() == null) {
                return;
            }
            this.f59156n = i2;
            if (this.rl) {
                return;
            }
            ViewCompat.Nxk((View) SideSheetBehavior.this.f59143U.get(), this.f59157t);
            this.rl = true;
        }
    }

    public SideSheetBehavior() {
        this.f59149o = new w6();
        this.f59141S = true;
        this.f59147g = 5;
        this.E2 = 5;
        this.f59142T = 0.1f;
        this.M7 = -1;
        this.f59138M = new LinkedHashSet();
        this.f59137FX = new j();
    }

    private void Jk(View view, AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat, int i2) {
        ViewCompat.z(view, accessibilityActionCompat, null, FX(i2));
    }

    private float eF(float f3, float f4) {
        return Math.abs(f3 - f4);
    }

    public boolean K() {
        return true;
    }

    public void Po6(final int i2) {
        if (i2 == 1 || i2 == 2) {
            StringBuilder sb = new StringBuilder();
            sb.append("STATE_");
            sb.append(i2 == 1 ? "DRAGGING" : "SETTLING");
            sb.append(" should not be set externally.");
            throw new IllegalArgumentException(sb.toString());
        }
        WeakReference weakReference = this.f59143U;
        if (weakReference == null || weakReference.get() == null) {
            EWS(i2);
        } else {
            qm((View) this.f59143U.get(), new Runnable() { // from class: WJ.n
                @Override // java.lang.Runnable
                public final void run() {
                    SideSheetBehavior.nHg(this.f11448n, i2);
                }
            });
        }
    }

    int ijL(int i2) {
        if (i2 == 3) {
            return Y();
        }
        if (i2 == 5) {
            return this.f59148n.O();
        }
        throw new IllegalArgumentException("Invalid state to get outer edge offset: " + i2);
    }

    int xg() {
        return 500;
    }

    float z() {
        return 0.5f;
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new j();

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final int f59153O;

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
            this.f59153O = parcel.readInt();
        }

        public SavedState(Parcelable parcelable, SideSheetBehavior sideSheetBehavior) {
            super(parcelable);
            this.f59153O = sideSheetBehavior.f59147g;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f59153O);
        }
    }

    private void B(Context context) {
        if (this.f59150r == null) {
            return;
        }
        CN3 cn3 = new CN3(this.f59150r);
        this.f59140O = cn3;
        cn3.nHg(context);
        ColorStateList colorStateList = this.J2;
        if (colorStateList != null) {
            this.f59140O.p5(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.f59140O.setTint(typedValue.data);
    }

    private void ER() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        WeakReference weakReference = this.f59143U;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        View view = (View) this.f59143U.get();
        View viewNxk = Nxk();
        if (viewNxk == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) viewNxk.getLayoutParams()) == null) {
            return;
        }
        this.f59148n.HI(marginLayoutParams, (int) ((this.f59139N * view.getScaleX()) + this.jB));
        viewNxk.requestLayout();
    }

    private AccessibilityViewCommand FX(final int i2) {
        return new AccessibilityViewCommand() { // from class: WJ.j
            @Override // androidx.core.view.accessibility.AccessibilityViewCommand
            public final boolean n(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
                return SideSheetBehavior.N(this.f11447n, i2, view, commandArguments);
            }
        };
    }

    private void HV(int i2) {
        com.google.android.material.sidesheet.w6 w6Var = this.f59148n;
        if (w6Var == null || w6Var.mUb() != i2) {
            if (i2 == 0) {
                this.f59148n = new com.google.android.material.sidesheet.n(this);
                if (this.f59150r == null || Mx()) {
                    return;
                }
                C.n nVarS = this.f59150r.S();
                nVarS.E2(0.0f).WPU(0.0f);
                lLA(nVarS.az());
                return;
            }
            if (i2 == 1) {
                this.f59148n = new com.google.android.material.sidesheet.j(this);
                if (this.f59150r == null || C()) {
                    return;
                }
                C.n nVarS2 = this.f59150r.S();
                nVarS2.g(0.0f).o(0.0f);
                lLA(nVarS2.az());
                return;
            }
            throw new IllegalArgumentException("Invalid sheet edge position value: " + i2 + ". Must be 0 or 1.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void J(View view, int i2) {
        if (this.f59138M.isEmpty()) {
            return;
        }
        this.f59148n.rl(i2);
        Iterator it = this.f59138M.iterator();
        if (it.hasNext()) {
            android.support.v4.media.j.n(it.next());
            throw null;
        }
    }

    private void M() {
        WeakReference weakReference = this.P5;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.P5 = null;
    }

    private void Rl() {
        VelocityTracker velocityTracker = this.p5;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.p5 = null;
        }
    }

    private boolean fcU(float f3) {
        return this.f59148n.gh(f3);
    }

    private boolean hRu() {
        if (this.f59146e != null) {
            return this.f59141S || this.f59147g == 1;
        }
        return false;
    }

    private int k() {
        com.google.android.material.sidesheet.w6 w6Var = this.f59148n;
        return (w6Var == null || w6Var.mUb() == 0) ? 5 : 3;
    }

    private void kSg(View view) {
        int i2 = this.f59147g == 5 ? 4 : 0;
        if (view.getVisibility() != i2) {
            view.setVisibility(i2);
        }
    }

    private void lLA(mfo.C c2) {
        CN3 cn3 = this.f59140O;
        if (cn3 != null) {
            cn3.setShapeAppearanceModel(c2);
        }
    }

    private void n1(CoordinatorLayout coordinatorLayout) {
        int i2;
        View viewFindViewById;
        if (this.P5 != null || (i2 = this.M7) == -1 || (viewFindViewById = coordinatorLayout.findViewById(i2)) == null) {
            return;
        }
        this.P5 = new WeakReference(viewFindViewById);
    }

    public static /* synthetic */ void nHg(SideSheetBehavior sideSheetBehavior, int i2) {
        View view = (View) sideSheetBehavior.f59143U.get();
        if (view != null) {
            sideSheetBehavior.How(view, i2, false);
        }
    }

    private CoordinatorLayout.LayoutParams ofS() {
        View view;
        WeakReference weakReference = this.f59143U;
        if (weakReference == null || (view = (View) weakReference.get()) == null || !(view.getLayoutParams() instanceof CoordinatorLayout.LayoutParams)) {
            return null;
        }
        return (CoordinatorLayout.LayoutParams) view.getLayoutParams();
    }

    private int p5(int i2, View view) {
        int i3 = this.f59147g;
        if (i3 == 1 || i3 == 2) {
            return i2 - this.f59148n.KN(view);
        }
        if (i3 == 3) {
            return 0;
        }
        if (i3 == 5) {
            return this.f59148n.O();
        }
        throw new IllegalStateException("Unexpected value: " + this.f59147g);
    }

    public static /* synthetic */ void s7N(SideSheetBehavior sideSheetBehavior, ViewGroup.MarginLayoutParams marginLayoutParams, int i2, View view, ValueAnimator valueAnimator) {
        sideSheetBehavior.f59148n.HI(marginLayoutParams, G7.j.t(i2, 0, valueAnimator.getAnimatedFraction()));
        view.requestLayout();
    }

    private void tUK() {
        View view;
        WeakReference weakReference = this.f59143U;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        ViewCompat.k(view, 262144);
        ViewCompat.k(view, 1048576);
        if (this.f59147g != 5) {
            Jk(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.ViF, 5);
        }
        if (this.f59147g != 3) {
            Jk(view, AccessibilityNodeInfoCompat.AccessibilityActionCompat.WPU, 3);
        }
    }

    void EWS(int i2) {
        View view;
        if (this.f59147g == i2) {
            return;
        }
        this.f59147g = i2;
        if (i2 == 3 || i2 == 5) {
            this.E2 = i2;
        }
        WeakReference weakReference = this.f59143U;
        if (weakReference == null || (view = (View) weakReference.get()) == null) {
            return;
        }
        kSg(view);
        Iterator it = this.f59138M.iterator();
        if (it.hasNext()) {
            android.support.v4.media.j.n(it.next());
            throw null;
        }
        tUK();
    }

    int I() {
        return this.f59139N;
    }

    public View Nxk() {
        WeakReference weakReference = this.P5;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // IzQ.n
    public void O() {
        IzQ.CN3 cn3 = this.eF;
        if (cn3 == null) {
            return;
        }
        BackEventCompat backEventCompatT = cn3.t();
        if (backEventCompatT == null || Build.VERSION.SDK_INT < 34) {
            Po6(5);
        } else {
            this.eF.KN(backEventCompatT, k(), new n(), GR());
        }
    }

    public void Org(boolean z2) {
        this.f59141S = z2;
    }

    boolean UhV(View view, float f3) {
        return this.f59148n.ty(view, f3);
    }

    public int Y() {
        return this.f59148n.nr();
    }

    public float dR0() {
        return this.f59142T;
    }

    int eTf() {
        return this.f59152v;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public Parcelable iF(CoordinatorLayout coordinatorLayout, View view) {
        return new SavedState(super.iF(coordinatorLayout, view), this);
    }

    int m() {
        return this.Xw;
    }

    public void mYa(int i2) {
        this.M7 = i2;
        M();
        WeakReference weakReference = this.f59143U;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (i2 == -1 || !ViewCompat.P5(view)) {
                return;
            }
            view.requestLayout();
        }
    }

    @Override // IzQ.n
    public void nr(BackEventCompat backEventCompat) {
        IzQ.CN3 cn3 = this.eF;
        if (cn3 == null) {
            return;
        }
        cn3.qie(backEventCompat, k());
        ER();
    }

    ViewDragHelper pJg() {
        return this.f59146e;
    }

    int piY() {
        return this.jB;
    }

    @Override // IzQ.n
    public void rl() {
        IzQ.CN3 cn3 = this.eF;
        if (cn3 == null) {
            return;
        }
        cn3.J2();
    }

    @Override // IzQ.n
    public void t(BackEventCompat backEventCompat) {
        IzQ.CN3 cn3 = this.eF;
        if (cn3 == null) {
            return;
        }
        cn3.mUb(backEventCompat);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void te(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        if (savedState.n() != null) {
            super.te(coordinatorLayout, view, savedState.n());
        }
        int i2 = savedState.f59153O;
        if (i2 == 1 || i2 == 2) {
            i2 = 5;
        }
        this.f59147g = i2;
        this.E2 = i2;
    }

    private boolean C() {
        CoordinatorLayout.LayoutParams layoutParamsOfS = ofS();
        if (layoutParamsOfS != null && ((ViewGroup.MarginLayoutParams) layoutParamsOfS).leftMargin > 0) {
            return true;
        }
        return false;
    }

    private void D(View view) {
        if (ViewCompat.HI(view) == null) {
            ViewCompat.ofS(view, view.getResources().getString(f59134B));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int E(View view, float f3, float f4) {
        if (fcU(f3)) {
            return 3;
        }
        if (UhV(view, f3)) {
            if (!this.f59148n.az(f3, f4) && !this.f59148n.qie(view)) {
                return 3;
            }
            return 5;
        }
        if (f3 != 0.0f && Ml.n(f3, f4)) {
            return 5;
        }
        int left = view.getLeft();
        if (Math.abs(left - Y()) < Math.abs(left - this.f59148n.O())) {
            return 3;
        }
        return 5;
    }

    private boolean G7(MotionEvent motionEvent) {
        if (!hRu() || eF(this.f59136E, motionEvent.getX()) <= this.f59146e.g()) {
            return false;
        }
        return true;
    }

    private void GD(View view, int i2) {
        int i3;
        if (GravityCompat.rl(((CoordinatorLayout.LayoutParams) view.getLayoutParams()).f36134t, i2) == 3) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        HV(i3);
    }

    private ValueAnimator.AnimatorUpdateListener GR() {
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        final View viewNxk = Nxk();
        if (viewNxk == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) viewNxk.getLayoutParams()) == null) {
            return null;
        }
        final int iT = this.f59148n.t(marginLayoutParams);
        return new ValueAnimator.AnimatorUpdateListener() { // from class: WJ.w6
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SideSheetBehavior.s7N(this.f11450n, marginLayoutParams, iT, viewNxk, valueAnimator);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void How(View view, int i2, boolean z2) {
        if (ul(view, i2, z2)) {
            EWS(2);
            this.f59149o.rl(i2);
        } else {
            EWS(i2);
        }
    }

    private boolean Mx() {
        CoordinatorLayout.LayoutParams layoutParamsOfS = ofS();
        if (layoutParamsOfS != null && ((ViewGroup.MarginLayoutParams) layoutParamsOfS).rightMargin > 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean N(SideSheetBehavior sideSheetBehavior, int i2, View view, AccessibilityViewCommand.CommandArguments commandArguments) {
        sideSheetBehavior.Po6(i2);
        return true;
    }

    private int a(int i2, int i3, int i5, int i7) {
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

    private boolean eWT(View view) {
        ViewParent parent = view.getParent();
        if (parent != null && parent.isLayoutRequested() && ViewCompat.U(view)) {
            return true;
        }
        return false;
    }

    private boolean i(View view) {
        if ((view.isShown() || ViewCompat.HI(view) != null) && this.f59141S) {
            return true;
        }
        return false;
    }

    private void qm(View view, Runnable runnable) {
        if (eWT(view)) {
            view.post(runnable);
        } else {
            runnable.run();
        }
    }

    private boolean ul(View view, int i2, boolean z2) {
        int iIjL = ijL(i2);
        ViewDragHelper viewDragHelperPJg = pJg();
        if (viewDragHelperPJg != null) {
            if (z2) {
                if (viewDragHelperPJg.Xw(iIjL, view.getTop())) {
                    return true;
                }
                return false;
            }
            if (viewDragHelperPJg.U(view, iIjL, view.getTop())) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean HI(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        ViewDragHelper viewDragHelper;
        if (!i(view)) {
            this.f59144X = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            Rl();
        }
        if (this.p5 == null) {
            this.p5 = VelocityTracker.obtain();
        }
        this.p5.addMovement(motionEvent);
        if (actionMasked != 0) {
            if ((actionMasked == 1 || actionMasked == 3) && this.f59144X) {
                this.f59144X = false;
                return false;
            }
        } else {
            this.f59136E = (int) motionEvent.getX();
        }
        if (!this.f59144X && (viewDragHelper = this.f59146e) != null && viewDragHelper.jB(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean Ik(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i5, int i7) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(a(i2, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, -1, marginLayoutParams.width), a(i5, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i7, -1, marginLayoutParams.height));
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean T(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        if (!view.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f59147g == 1 && actionMasked == 0) {
            return true;
        }
        if (hRu()) {
            this.f59146e.X(motionEvent);
        }
        if (actionMasked == 0) {
            Rl();
        }
        if (this.p5 == null) {
            this.p5 = VelocityTracker.obtain();
        }
        this.p5.addMovement(motionEvent);
        if (hRu() && actionMasked == 2 && !this.f59144X && G7(motionEvent)) {
            this.f59146e.t(view, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f59144X;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean ck(CoordinatorLayout coordinatorLayout, View view, int i2) {
        int iN;
        if (ViewCompat.WPU(coordinatorLayout) && !ViewCompat.WPU(view)) {
            view.setFitsSystemWindows(true);
        }
        if (this.f59143U == null) {
            this.f59143U = new WeakReference(view);
            this.eF = new IzQ.CN3(view);
            CN3 cn3 = this.f59140O;
            if (cn3 != null) {
                ViewCompat.C(view, cn3);
                CN3 cn32 = this.f59140O;
                float fXQ = this.f59145Z;
                if (fXQ == -1.0f) {
                    fXQ = ViewCompat.XQ(view);
                }
                cn32.M7(fXQ);
            } else {
                ColorStateList colorStateList = this.J2;
                if (colorStateList != null) {
                    ViewCompat.Mx(view, colorStateList);
                }
            }
            kSg(view);
            tUK();
            if (ViewCompat.aYN(view) == 0) {
                ViewCompat.ul(view, 1);
            }
            D(view);
        }
        GD(view, i2);
        if (this.f59146e == null) {
            this.f59146e = ViewDragHelper.ck(coordinatorLayout, this.f59137FX);
        }
        int iKN = this.f59148n.KN(view);
        coordinatorLayout.X(view, i2);
        this.f59152v = coordinatorLayout.getWidth();
        this.Xw = this.f59148n.xMQ(coordinatorLayout);
        this.f59139N = view.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams != null) {
            iN = this.f59148n.n(marginLayoutParams);
        } else {
            iN = 0;
        }
        this.jB = iN;
        ViewCompat.M(view, p5(iKN, view));
        n1(coordinatorLayout);
        Iterator it = this.f59138M.iterator();
        while (it.hasNext()) {
            android.support.v4.media.j.n(it.next());
        }
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void gh(CoordinatorLayout.LayoutParams layoutParams) {
        super.gh(layoutParams);
        this.f59143U = null;
        this.f59146e = null;
        this.eF = null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public void ty() {
        super.ty();
        this.f59143U = null;
        this.f59146e = null;
        this.eF = null;
    }

    public SideSheetBehavior(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f59149o = new w6();
        this.f59141S = true;
        this.f59147g = 5;
        this.E2 = 5;
        this.f59142T = 0.1f;
        this.M7 = -1;
        this.f59138M = new LinkedHashSet();
        this.f59137FX = new j();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, o.M63);
        int i2 = o.Cn5;
        if (typedArrayObtainStyledAttributes.hasValue(i2)) {
            this.J2 = X4.w6.n(context, typedArrayObtainStyledAttributes, i2);
        }
        if (typedArrayObtainStyledAttributes.hasValue(o.xn)) {
            this.f59150r = mfo.C.O(context, attributeSet, 0, f59135J).az();
        }
        int i3 = o.lv;
        if (typedArrayObtainStyledAttributes.hasValue(i3)) {
            mYa(typedArrayObtainStyledAttributes.getResourceId(i3, -1));
        }
        B(context);
        this.f59145Z = typedArrayObtainStyledAttributes.getDimension(o.gv8, -1.0f);
        Org(typedArrayObtainStyledAttributes.getBoolean(o.sv, true));
        typedArrayObtainStyledAttributes.recycle();
        this.f59151t = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}
