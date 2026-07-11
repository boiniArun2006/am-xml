package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.coordinatorlayout.R;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Pools;
import androidx.core.view.GravityCompat;
import androidx.core.view.NestedScrollingParent2;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class CoordinatorLayout extends ViewGroup implements NestedScrollingParent2, NestedScrollingParent3 {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    static final Comparator f36112B;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    static final String f36113E;

    /* JADX INFO: renamed from: FX, reason: collision with root package name */
    static final ThreadLocal f36114FX;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private static final Pools.Pool f36115J;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    static final Class[] f36116M;
    private boolean E2;
    private final List J2;
    ViewGroup.OnHierarchyChangeListener M7;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private View f36117N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final List f36118O;
    private Drawable P5;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final int[] f36119S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private View f36120T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private boolean f36121U;
    private boolean Xw;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int[] f36122e;
    private final NestedScrollingParentHelper eF;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f36123g;
    private WindowInsetsCompat jB;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f36124n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int[] f36125o;
    private OnApplyWindowInsetsListener p5;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Paint f36126r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final DirectedAcyclicGraph f36127t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private OnPreDrawListener f36128v;

    public interface AttachedBehavior {
        Behavior n();
    }

    public static abstract class Behavior<V extends View> {
        public Behavior() {
        }

        public boolean HI(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        public boolean Ik(CoordinatorLayout coordinatorLayout, View view, int i2, int i3, int i5, int i7) {
            return false;
        }

        public boolean J2(CoordinatorLayout coordinatorLayout, View view, Rect rect) {
            return false;
        }

        public float KN(CoordinatorLayout coordinatorLayout, View view) {
            return 0.0f;
        }

        public void S(CoordinatorLayout coordinatorLayout, View view, View view2, int i2, int i3, int i5, int i7) {
        }

        public boolean T(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
            return false;
        }

        public int Uo(CoordinatorLayout coordinatorLayout, View view) {
            return -16777216;
        }

        public void ViF(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i2) {
        }

        public void Z(CoordinatorLayout coordinatorLayout, View view, View view2, int i2, int i3, int[] iArr) {
        }

        public void aYN(CoordinatorLayout coordinatorLayout, View view, View view2, int i2, int i3, int i5, int i7, int i8, int[] iArr) {
            iArr[0] = iArr[0] + i5;
            iArr[1] = iArr[1] + i7;
            WPU(coordinatorLayout, view, view2, i2, i3, i5, i7, i8);
        }

        public void az(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        public boolean ck(CoordinatorLayout coordinatorLayout, View view, int i2) {
            return false;
        }

        public void e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        }

        public boolean fD(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i2) {
            return false;
        }

        public boolean g(CoordinatorLayout coordinatorLayout, View view, Rect rect, boolean z2) {
            return false;
        }

        public void gh(LayoutParams layoutParams) {
        }

        public WindowInsetsCompat mUb(CoordinatorLayout coordinatorLayout, View view, WindowInsetsCompat windowInsetsCompat) {
            return windowInsetsCompat;
        }

        public boolean o(CoordinatorLayout coordinatorLayout, View view, View view2, float f3, float f4) {
            return false;
        }

        public boolean qie(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public boolean r(CoordinatorLayout coordinatorLayout, View view, View view2, float f3, float f4, boolean z2) {
            return false;
        }

        public void te(CoordinatorLayout coordinatorLayout, View view, Parcelable parcelable) {
        }

        public void ty() {
        }

        public boolean xMQ(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return false;
        }

        public Behavior(Context context, AttributeSet attributeSet) {
        }

        public boolean E2(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i2, int i3) {
            if (i3 == 0) {
                return fD(coordinatorLayout, view, view2, view3, i2);
            }
            return false;
        }

        public void WPU(CoordinatorLayout coordinatorLayout, View view, View view2, int i2, int i3, int i5, int i7, int i8) {
            if (i8 == 0) {
                S(coordinatorLayout, view, view2, i2, i3, i5, i7);
            }
        }

        public void X(CoordinatorLayout coordinatorLayout, View view, View view2, int i2) {
            if (i2 == 0) {
                e(coordinatorLayout, view, view2);
            }
        }

        public void XQ(CoordinatorLayout coordinatorLayout, View view, View view2, int i2, int i3, int[] iArr, int i5) {
            if (i5 == 0) {
                Z(coordinatorLayout, view, view2, i2, i3, iArr);
            }
        }

        public Parcelable iF(CoordinatorLayout coordinatorLayout, View view) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        public void nY(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i2, int i3) {
            if (i3 == 0) {
                ViF(coordinatorLayout, view, view2, view3, i2);
            }
        }

        public boolean n(CoordinatorLayout coordinatorLayout, View view) {
            if (KN(coordinatorLayout, view) > 0.0f) {
                return true;
            }
            return false;
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    public @interface DefaultBehavior {
        Class value();
    }

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface DispatchChangeEvent {
    }

    private class HierarchyChangeListener implements ViewGroup.OnHierarchyChangeListener {
        HierarchyChangeListener() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.M7;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.e(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.M7;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        private boolean HI;
        final Rect Ik;
        int J2;
        public int KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public int f36131O;
        public int Uo;
        private boolean az;
        private boolean ck;
        View gh;
        int mUb;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Behavior f36132n;
        public int nr;
        View qie;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f36133r;
        boolean rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f36134t;
        private boolean ty;
        int xMQ;

        public LayoutParams(int i2, int i3) {
            super(i2, i3);
            this.rl = false;
            this.f36134t = 0;
            this.nr = 0;
            this.f36131O = -1;
            this.J2 = -1;
            this.Uo = 0;
            this.KN = 0;
            this.Ik = new Rect();
        }

        void gh(int i2) {
            Ik(i2, false);
        }

        void mUb() {
            this.ck = false;
        }

        void qie() {
            this.az = false;
        }

        private void az(View view, CoordinatorLayout coordinatorLayout) {
            View viewFindViewById = coordinatorLayout.findViewById(this.J2);
            this.gh = viewFindViewById;
            if (viewFindViewById == null) {
                if (coordinatorLayout.isInEditMode()) {
                    this.qie = null;
                    this.gh = null;
                    return;
                }
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.J2) + " to anchor view " + view);
            }
            if (viewFindViewById == coordinatorLayout) {
                if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
                this.qie = null;
                this.gh = null;
                return;
            }
            for (ViewParent parent = viewFindViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                if (parent == view) {
                    if (!coordinatorLayout.isInEditMode()) {
                        throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                    }
                    this.qie = null;
                    this.gh = null;
                    return;
                }
                if (parent instanceof View) {
                    viewFindViewById = parent;
                }
            }
            this.qie = viewFindViewById;
        }

        private boolean o(View view, CoordinatorLayout coordinatorLayout) {
            if (this.gh.getId() != this.J2) {
                return false;
            }
            View view2 = this.gh;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent == null || parent == view) {
                    this.qie = null;
                    this.gh = null;
                    return false;
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
            this.qie = view2;
            return true;
        }

        void HI(boolean z2) {
            this.ck = z2;
        }

        void Ik(int i2, boolean z2) {
            if (i2 == 0) {
                this.ty = z2;
            } else {
                if (i2 != 1) {
                    return;
                }
                this.HI = z2;
            }
        }

        boolean J2() {
            return this.ck;
        }

        boolean KN(CoordinatorLayout coordinatorLayout, View view) {
            boolean z2 = this.az;
            if (z2) {
                return true;
            }
            Behavior behavior = this.f36132n;
            boolean zN = (behavior != null ? behavior.n(coordinatorLayout, view) : false) | z2;
            this.az = zN;
            return zN;
        }

        public Behavior O() {
            return this.f36132n;
        }

        Rect Uo() {
            return this.Ik;
        }

        void ck(Rect rect) {
            this.Ik.set(rect);
        }

        boolean n() {
            return this.gh == null && this.J2 != -1;
        }

        View nr(CoordinatorLayout coordinatorLayout, View view) {
            if (this.J2 == -1) {
                this.qie = null;
                this.gh = null;
                return null;
            }
            if (this.gh == null || !o(view, coordinatorLayout)) {
                az(view, coordinatorLayout);
            }
            return this.gh;
        }

        boolean rl(CoordinatorLayout coordinatorLayout, View view, View view2) {
            if (view2 == this.qie || r(view2, ViewCompat.nY(coordinatorLayout))) {
                return true;
            }
            Behavior behavior = this.f36132n;
            return behavior != null && behavior.xMQ(coordinatorLayout, view, view2);
        }

        boolean t() {
            if (this.f36132n == null) {
                this.az = false;
            }
            return this.az;
        }

        public void ty(Behavior behavior) {
            Behavior behavior2 = this.f36132n;
            if (behavior2 != behavior) {
                if (behavior2 != null) {
                    behavior2.ty();
                }
                this.f36132n = behavior;
                this.f36133r = null;
                this.rl = true;
                if (behavior != null) {
                    behavior.gh(this);
                }
            }
        }

        boolean xMQ(int i2) {
            if (i2 == 0) {
                return this.ty;
            }
            if (i2 != 1) {
                return false;
            }
            return this.HI;
        }

        private boolean r(View view, int i2) {
            int iRl = GravityCompat.rl(((LayoutParams) view.getLayoutParams()).Uo, i2);
            if (iRl != 0 && (GravityCompat.rl(this.KN, i2) & iRl) == iRl) {
                return true;
            }
            return false;
        }

        LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.rl = false;
            this.f36134t = 0;
            this.nr = 0;
            this.f36131O = -1;
            this.J2 = -1;
            this.Uo = 0;
            this.KN = 0;
            this.Ik = new Rect();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f36109O);
            this.f36134t = typedArrayObtainStyledAttributes.getInteger(R.styleable.J2, 0);
            this.J2 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.Uo, -1);
            this.nr = typedArrayObtainStyledAttributes.getInteger(R.styleable.KN, 0);
            this.f36131O = typedArrayObtainStyledAttributes.getInteger(R.styleable.qie, -1);
            this.Uo = typedArrayObtainStyledAttributes.getInt(R.styleable.gh, 0);
            this.KN = typedArrayObtainStyledAttributes.getInt(R.styleable.mUb, 0);
            int i2 = R.styleable.xMQ;
            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i2);
            this.rl = zHasValue;
            if (zHasValue) {
                this.f36132n = CoordinatorLayout.N(context, attributeSet, typedArrayObtainStyledAttributes.getString(i2));
            }
            typedArrayObtainStyledAttributes.recycle();
            Behavior behavior = this.f36132n;
            if (behavior != null) {
                behavior.gh(this);
            }
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.rl = false;
            this.f36134t = 0;
            this.nr = 0;
            this.f36131O = -1;
            this.J2 = -1;
            this.Uo = 0;
            this.KN = 0;
            this.Ik = new Rect();
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.rl = false;
            this.f36134t = 0;
            this.nr = 0;
            this.f36131O = -1;
            this.J2 = -1;
            this.Uo = 0;
            this.KN = 0;
            this.Ik = new Rect();
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.rl = false;
            this.f36134t = 0;
            this.nr = 0;
            this.f36131O = -1;
            this.J2 = -1;
            this.Uo = 0;
            this.KN = 0;
            this.Ik = new Rect();
        }
    }

    class OnPreDrawListener implements ViewTreeObserver.OnPreDrawListener {
        OnPreDrawListener() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.e(0);
            return true;
        }
    }

    public CoordinatorLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f36107n);
    }

    private static int U(int i2) {
        if (i2 == 0) {
            return 8388661;
        }
        return i2;
    }

    private static int Xw(int i2) {
        if (i2 == 0) {
            return 17;
        }
        return i2;
    }

    private static int jB(int i2) {
        if ((i2 & 7) == 0) {
            i2 |= 8388611;
        }
        return (i2 & 112) == 0 ? i2 | 48 : i2;
    }

    private static int t(int i2, int i3, int i5) {
        return i2 < i3 ? i3 : i2 > i5 ? i5 : i2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
        gh(view, i2, i3, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i2, int i3, int i5, int i7) {
        ty(view, i2, i3, i5, i7, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i2) {
        xMQ(view, view2, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i2) {
        return HI(view, view2, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        mUb(view, 0);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void ty(View view, int i2, int i3, int i5, int i7, int i8) {
        az(view, i2, i3, i5, i7, 0, this.f36119S);
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: androidx.coordinatorlayout.widget.CoordinatorLayout.SavedState.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
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
        };

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        SparseArray f36136O;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int i2 = parcel.readInt();
            int[] iArr = new int[i2];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.f36136O = new SparseArray(i2);
            for (int i3 = 0; i3 < i2; i3++) {
                this.f36136O.append(iArr[i3], parcelableArray[i3]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            int size;
            super.writeToParcel(parcel, i2);
            SparseArray sparseArray = this.f36136O;
            if (sparseArray != null) {
                size = sparseArray.size();
            } else {
                size = 0;
            }
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i3 = 0; i3 < size; i3++) {
                iArr[i3] = this.f36136O.keyAt(i3);
                parcelableArr[i3] = (Parcelable) this.f36136O.valueAt(i3);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i2);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    static class ViewElevationComparator implements Comparator<View> {
        ViewElevationComparator() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            float fV = ViewCompat.v(view);
            float fV2 = ViewCompat.v(view2);
            if (fV > fV2) {
                return -1;
            }
            if (fV < fV2) {
                return 1;
            }
            return 0;
        }
    }

    static {
        Package r02 = CoordinatorLayout.class.getPackage();
        f36113E = r02 != null ? r02.getName() : null;
        f36112B = new ViewElevationComparator();
        f36116M = new Class[]{Context.class, AttributeSet.class};
        f36114FX = new ThreadLocal();
        f36115J = new Pools.SynchronizedPool(12);
    }

    public CoordinatorLayout(Context context, AttributeSet attributeSet, int i2) {
        CoordinatorLayout coordinatorLayout;
        Context context2;
        super(context, attributeSet, i2);
        this.f36124n = new ArrayList();
        this.f36127t = new DirectedAcyclicGraph();
        this.f36118O = new ArrayList();
        this.J2 = new ArrayList();
        this.f36125o = new int[2];
        this.f36119S = new int[2];
        this.eF = new NestedScrollingParentHelper(this);
        TypedArray typedArrayObtainStyledAttributes = i2 == 0 ? context.obtainStyledAttributes(attributeSet, R.styleable.rl, 0, R.style.f36108n) : context.obtainStyledAttributes(attributeSet, R.styleable.rl, i2, 0);
        if (Build.VERSION.SDK_INT < 29) {
            coordinatorLayout = this;
            context2 = context;
        } else if (i2 == 0) {
            coordinatorLayout = this;
            context2 = context;
            coordinatorLayout.saveAttributeDataForStyleable(context2, R.styleable.rl, attributeSet, typedArrayObtainStyledAttributes, 0, R.style.f36108n);
        } else {
            context2 = context;
            coordinatorLayout = this;
            coordinatorLayout.saveAttributeDataForStyleable(context2, R.styleable.rl, attributeSet, typedArrayObtainStyledAttributes, i2, 0);
        }
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.f36111t, 0);
        if (resourceId != 0) {
            Resources resources = context2.getResources();
            coordinatorLayout.f36122e = resources.getIntArray(resourceId);
            float f3 = resources.getDisplayMetrics().density;
            int length = coordinatorLayout.f36122e.length;
            for (int i3 = 0; i3 < length; i3++) {
                coordinatorLayout.f36122e[i3] = (int) (r12[i3] * f3);
            }
        }
        coordinatorLayout.P5 = typedArrayObtainStyledAttributes.getDrawable(R.styleable.nr);
        typedArrayObtainStyledAttributes.recycle();
        eF();
        super.setOnHierarchyChangeListener(new HierarchyChangeListener());
        if (ViewCompat.aYN(this) == 0) {
            ViewCompat.ul(this, 1);
        }
    }

    private boolean ViF(View view) {
        return this.f36127t.xMQ(view);
    }

    private int XQ(int i2) {
        int[] iArr = this.f36122e;
        if (iArr == null) {
            Log.e("CoordinatorLayout", "No keylines defined for " + this + " - attempted index lookup " + i2);
            return 0;
        }
        if (i2 >= 0 && i2 < iArr.length) {
            return iArr[i2];
        }
        Log.e("CoordinatorLayout", "Keyline index " + i2 + " out of range for " + this);
        return 0;
    }

    private void Z(View view, int i2, Rect rect, Rect rect2, LayoutParams layoutParams, int i3, int i5) {
        int iRl = GravityCompat.rl(Xw(layoutParams.f36134t), i2);
        int iRl2 = GravityCompat.rl(jB(layoutParams.nr), i2);
        int i7 = iRl & 7;
        int i8 = iRl & 112;
        int i9 = iRl2 & 7;
        int i10 = iRl2 & 112;
        int iWidth = i9 != 1 ? i9 != 5 ? rect.left : rect.right : rect.left + (rect.width() / 2);
        int iHeight = i10 != 16 ? i10 != 80 ? rect.top : rect.bottom : rect.top + (rect.height() / 2);
        if (i7 == 1) {
            iWidth -= i3 / 2;
        } else if (i7 != 5) {
            iWidth -= i3;
        }
        if (i8 == 16) {
            iHeight -= i5 / 2;
        } else if (i8 != 80) {
            iHeight -= i5;
        }
        rect2.set(iWidth, iHeight, i3 + iWidth, i5 + iHeight);
    }

    private static Rect n() {
        Rect rect = (Rect) f36115J.acquire();
        return rect == null ? new Rect() : rect;
    }

    private boolean nHg(MotionEvent motionEvent, int i2) {
        int actionMasked = motionEvent.getActionMasked();
        List list = this.f36118O;
        aYN(list);
        int size = list.size();
        MotionEvent motionEventObtain = null;
        boolean zHI = false;
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            View view = (View) list.get(i3);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Behavior behaviorO = layoutParams.O();
            if (!(zHI || z2) || actionMasked == 0) {
                if (!zHI && behaviorO != null) {
                    if (i2 == 0) {
                        zHI = behaviorO.HI(this, view, motionEvent);
                    } else if (i2 == 1) {
                        zHI = behaviorO.T(this, view, motionEvent);
                    }
                    if (zHI) {
                        this.f36120T = view;
                    }
                }
                boolean zT2 = layoutParams.t();
                boolean zKN = layoutParams.KN(this, view);
                z2 = zKN && !zT2;
                if (zKN && !z2) {
                    break;
                }
            } else if (behaviorO != null) {
                if (motionEventObtain == null) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i2 == 0) {
                    behaviorO.HI(this, view, motionEventObtain);
                } else if (i2 == 1) {
                    behaviorO.T(this, view, motionEventObtain);
                }
            }
        }
        list.clear();
        return zHI;
    }

    private void s7N() {
        this.f36124n.clear();
        this.f36127t.t();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            LayoutParams layoutParamsWPU = WPU(childAt);
            layoutParamsWPU.nr(this, childAt);
            this.f36127t.rl(childAt);
            for (int i3 = 0; i3 < childCount; i3++) {
                if (i3 != i2) {
                    View childAt2 = getChildAt(i3);
                    if (layoutParamsWPU.rl(this, childAt, childAt2)) {
                        if (!this.f36127t.nr(childAt2)) {
                            this.f36127t.rl(childAt2);
                        }
                        this.f36127t.n(childAt2, childAt);
                    }
                }
            }
        }
        this.f36124n.addAll(this.f36127t.KN());
        Collections.reverse(this.f36124n);
    }

    public List Ik(View view) {
        List listUo = this.f36127t.Uo(view);
        this.J2.clear();
        if (listUo != null) {
            this.J2.addAll(listUo);
        }
        return this.J2;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: KN, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: Uo, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public void az(View view, int i2, int i3, int i5, int i7, int i8, int[] iArr) {
        Behavior behaviorO;
        int childCount = getChildCount();
        boolean z2 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.xMQ(i8) && (behaviorO = layoutParams.O()) != null) {
                    int[] iArr2 = this.f36125o;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    behaviorO.aYN(this, childAt, view, i2, i3, i5, i7, i8, iArr2);
                    int[] iArr3 = this.f36125o;
                    iMax = i5 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    int[] iArr4 = this.f36125o;
                    iMax2 = i7 > 0 ? Math.max(iMax2, iArr4[1]) : Math.min(iMax2, iArr4[1]);
                    z2 = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z2) {
            e(1);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008f  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected boolean drawChild(Canvas canvas, View view, long j2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Behavior behavior = layoutParams.f36132n;
        if (behavior != null) {
            float fKN = behavior.KN(this, view);
            if (fKN > 0.0f) {
                if (this.f36126r == null) {
                    this.f36126r = new Paint();
                }
                this.f36126r.setColor(layoutParams.f36132n.Uo(this, view));
                this.f36126r.setAlpha(t(Math.round(fKN * 255.0f), 0, 255));
                int iSave = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.f36126r);
                canvas.restoreToCount(iSave);
            }
        }
        return super.drawChild(canvas, view, j2);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final void e(int i2) {
        int i3;
        boolean zQie;
        int iNY = ViewCompat.nY(this);
        int size = this.f36124n.size();
        Rect rectN = n();
        Rect rectN2 = n();
        Rect rectN3 = n();
        for (int i5 = 0; i5 < size; i5++) {
            View view = (View) this.f36124n.get(i5);
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (i2 != 0 || view.getVisibility() != 8) {
                for (int i7 = 0; i7 < i5; i7++) {
                    if (layoutParams.qie == ((View) this.f36124n.get(i7))) {
                        E2(view, iNY);
                    }
                }
                ck(view, true, rectN2);
                if (layoutParams.Uo != 0 && !rectN2.isEmpty()) {
                    int iRl = GravityCompat.rl(layoutParams.Uo, iNY);
                    int i8 = iRl & 112;
                    if (i8 == 48) {
                        rectN.top = Math.max(rectN.top, rectN2.bottom);
                    } else if (i8 == 80) {
                        rectN.bottom = Math.max(rectN.bottom, getHeight() - rectN2.top);
                    }
                    int i9 = iRl & 7;
                    if (i9 == 3) {
                        rectN.left = Math.max(rectN.left, rectN2.right);
                    } else if (i9 == 5) {
                        rectN.right = Math.max(rectN.right, getWidth() - rectN2.left);
                    }
                }
                if (layoutParams.KN != 0 && view.getVisibility() == 0) {
                    fD(view, rectN, iNY);
                }
                if (i2 != 2) {
                    S(view, rectN3);
                    if (!rectN3.equals(rectN2)) {
                        wTp(view, rectN2);
                        for (i3 = i5 + 1; i3 < size; i3++) {
                            View view2 = (View) this.f36124n.get(i3);
                            LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
                            Behavior behaviorO = layoutParams2.O();
                            if (behaviorO != null && behaviorO.xMQ(this, view2, view)) {
                                if (i2 == 0 && layoutParams2.J2()) {
                                    layoutParams2.mUb();
                                } else {
                                    if (i2 != 2) {
                                        zQie = behaviorO.qie(this, view2, view);
                                    } else {
                                        behaviorO.az(this, view2, view);
                                        zQie = true;
                                    }
                                    if (i2 == 1) {
                                        layoutParams2.HI(zQie);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    while (i3 < size) {
                    }
                }
            }
        }
        v(rectN);
        v(rectN2);
        v(rectN3);
    }

    @RestrictTo
    public final WindowInsetsCompat getLastWindowInsets() {
        return this.jB;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.eF.n();
    }

    @Nullable
    public Drawable getStatusBarBackground() {
        return this.P5;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void mUb(View view, int i2) {
        this.eF.O(view, i2);
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (layoutParams.xMQ(i2)) {
                Behavior behaviorO = layoutParams.O();
                if (behaviorO != null) {
                    behaviorO.X(this, childAt, view, i2);
                }
                layoutParams.gh(i2);
                layoutParams.mUb();
            }
        }
        this.f36117N = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012f  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected void onMeasure(int i2, int i3) {
        int i5;
        int i7;
        int i8;
        int i9;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        Behavior behaviorO;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        View view;
        int i18;
        int i19;
        int iMax;
        CoordinatorLayout coordinatorLayout = this;
        coordinatorLayout.s7N();
        coordinatorLayout.J2();
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        int iNY = ViewCompat.nY(coordinatorLayout);
        boolean z2 = iNY == 1;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        int i20 = paddingLeft + paddingRight;
        int i21 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        boolean z3 = coordinatorLayout.jB != null && ViewCompat.WPU(coordinatorLayout);
        int size3 = coordinatorLayout.f36124n.size();
        int i22 = 0;
        int iCombineMeasuredStates = 0;
        while (i22 < size3) {
            View view2 = (View) coordinatorLayout.f36124n.get(i22);
            int i23 = suggestedMinimumWidth;
            if (view2.getVisibility() == 8) {
                i12 = size3;
                i9 = i22;
                i18 = paddingRight;
                i14 = iNY;
                suggestedMinimumWidth = i23;
                i10 = paddingLeft;
            } else {
                LayoutParams layoutParams = (LayoutParams) view2.getLayoutParams();
                int i24 = layoutParams.f36131O;
                if (i24 < 0 || mode == 0) {
                    i5 = suggestedMinimumHeight;
                } else {
                    int iXQ = coordinatorLayout.XQ(i24);
                    int iRl = GravityCompat.rl(U(layoutParams.f36134t), iNY) & 7;
                    i5 = suggestedMinimumHeight;
                    if ((iRl == 3 && !z2) || (iRl == 5 && z2)) {
                        iMax = Math.max(0, (size - paddingRight) - iXQ);
                    } else if ((iRl == 5 && !z2) || (iRl == 3 && z2)) {
                        iMax = Math.max(0, iXQ - paddingLeft);
                    }
                    int i25 = i22;
                    i8 = iMax;
                    i7 = i25;
                    if (z3 || ViewCompat.WPU(view2)) {
                        i9 = i7;
                        iMakeMeasureSpec = i2;
                        iMakeMeasureSpec2 = i3;
                    } else {
                        i9 = i7;
                        int iGh = coordinatorLayout.jB.gh() + coordinatorLayout.jB.qie();
                        int iAz = coordinatorLayout.jB.az() + coordinatorLayout.jB.mUb();
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - iGh, mode);
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - iAz, mode2);
                    }
                    behaviorO = layoutParams.O();
                    if (behaviorO == null) {
                        i12 = size3;
                        int i26 = iMakeMeasureSpec;
                        view = view2;
                        i10 = paddingLeft;
                        i11 = i23;
                        i14 = iNY;
                        i15 = i5;
                        i18 = paddingRight;
                        i19 = iCombineMeasuredStates;
                        int i27 = iMakeMeasureSpec2;
                        boolean zIk = behaviorO.Ik(this, view, i26, i8, i27, 0);
                        i17 = i26;
                        i13 = i8;
                        i16 = i27;
                        if (zIk) {
                            coordinatorLayout = this;
                        }
                        suggestedMinimumWidth = Math.max(i11, i20 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
                        int iMax2 = Math.max(i15, i21 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(i19, view.getMeasuredState());
                        suggestedMinimumHeight = iMax2;
                    } else {
                        i10 = paddingLeft;
                        i11 = i23;
                        i12 = size3;
                        i13 = i8;
                        i14 = iNY;
                        i15 = i5;
                        i16 = iMakeMeasureSpec2;
                        i17 = iMakeMeasureSpec;
                        view = view2;
                        i18 = paddingRight;
                        i19 = iCombineMeasuredStates;
                    }
                    View view3 = view;
                    coordinatorLayout = this;
                    coordinatorLayout.T(view3, i17, i13, i16, 0);
                    view = view3;
                    suggestedMinimumWidth = Math.max(i11, i20 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
                    int iMax22 = Math.max(i15, i21 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(i19, view.getMeasuredState());
                    suggestedMinimumHeight = iMax22;
                }
                i7 = i22;
                i8 = 0;
                if (z3) {
                    i9 = i7;
                    iMakeMeasureSpec = i2;
                    iMakeMeasureSpec2 = i3;
                    behaviorO = layoutParams.O();
                    if (behaviorO == null) {
                    }
                    View view32 = view;
                    coordinatorLayout = this;
                    coordinatorLayout.T(view32, i17, i13, i16, 0);
                    view = view32;
                    suggestedMinimumWidth = Math.max(i11, i20 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
                    int iMax222 = Math.max(i15, i21 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(i19, view.getMeasuredState());
                    suggestedMinimumHeight = iMax222;
                }
            }
            i22 = i9 + 1;
            paddingLeft = i10;
            paddingRight = i18;
            size3 = i12;
            iNY = i14;
        }
        int i28 = iCombineMeasuredStates;
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i2, (-16777216) & i28), View.resolveSizeAndState(suggestedMinimumHeight, i3, i28 << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.n());
        SparseArray sparseArray = savedState.f36136O;
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            Behavior behaviorO = WPU(childAt).O();
            if (id != -1 && behaviorO != null && (parcelable2 = (Parcelable) sparseArray.get(id)) != null) {
                behaviorO.te(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelableIF;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray sparseArray = new SparseArray();
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            int id = childAt.getId();
            Behavior behaviorO = ((LayoutParams) childAt.getLayoutParams()).O();
            if (id != -1 && behaviorO != null && (parcelableIF = behaviorO.iF(this, childAt)) != null) {
                sparseArray.append(id, parcelableIF);
            }
        }
        savedState.f36136O = sparseArray;
        return savedState;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015 A[PHI: r3
      0x0015: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0024, B:5:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zNHg;
        boolean zT2;
        MotionEvent motionEventObtain;
        int actionMasked = motionEvent.getActionMasked();
        if (this.f36120T == null) {
            zNHg = nHg(motionEvent, 1);
            if (!zNHg) {
                zT2 = false;
            }
            motionEventObtain = null;
            if (this.f36120T != null) {
                zT2 |= super.onTouchEvent(motionEvent);
            } else if (zNHg) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEventObtain);
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
            if (actionMasked == 1 && actionMasked != 3) {
                return zT2;
            }
            bzg(false);
            return zT2;
        }
        zNHg = false;
        Behavior behaviorO = ((LayoutParams) this.f36120T.getLayoutParams()).O();
        if (behaviorO != null) {
            zT2 = behaviorO.T(this, this.f36120T, motionEvent);
        }
        motionEventObtain = null;
        if (this.f36120T != null) {
        }
        if (motionEventObtain != null) {
        }
        if (actionMasked == 1) {
        }
        bzg(false);
        return zT2;
    }

    final WindowInsetsCompat p5(WindowInsetsCompat windowInsetsCompat) {
        if (ObjectsCompat.n(this.jB, windowInsetsCompat)) {
            return windowInsetsCompat;
        }
        this.jB = windowInsetsCompat;
        boolean z2 = false;
        boolean z3 = windowInsetsCompat != null && windowInsetsCompat.az() > 0;
        this.f36121U = z3;
        if (!z3 && getBackground() == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        WindowInsetsCompat windowInsetsCompatO = O(windowInsetsCompat);
        requestLayout();
        return windowInsetsCompatO;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: qie, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    void rV9() {
        if (this.E2 && this.f36128v != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f36128v);
        }
        this.Xw = false;
    }

    void rl() {
        if (this.E2) {
            if (this.f36128v == null) {
                this.f36128v = new OnPreDrawListener();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f36128v);
        }
        this.Xw = true;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.M7 = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(@Nullable Drawable drawable) {
        Drawable drawable2 = this.P5;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.P5 = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.P5.setState(getDrawableState());
                }
                DrawableCompat.az(this.P5, ViewCompat.nY(this));
                this.P5.setVisible(getVisibility() == 0, false);
                this.P5.setCallback(this);
            }
            ViewCompat.GR(this);
        }
    }

    public void setStatusBarBackgroundColor(@ColorInt int i2) {
        setStatusBarBackground(new ColorDrawable(i2));
    }

    public void setStatusBarBackgroundResource(@DrawableRes int i2) {
        setStatusBarBackground(i2 != 0 ? ContextCompat.getDrawable(getContext(), i2) : null);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void xMQ(View view, View view2, int i2, int i3) {
        Behavior behaviorO;
        View view3;
        View view4;
        int i5;
        int i7;
        this.eF.t(view, view2, i2, i3);
        this.f36117N = view2;
        int childCount = getChildCount();
        int i8 = 0;
        while (i8 < childCount) {
            View childAt = getChildAt(i8);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (layoutParams.xMQ(i3) && (behaviorO = layoutParams.O()) != null) {
                view3 = view;
                view4 = view2;
                i5 = i2;
                i7 = i3;
                behaviorO.nY(this, childAt, view3, view4, i5, i7);
            } else {
                view3 = view;
                view4 = view2;
                i5 = i2;
                i7 = i3;
            }
            i8++;
            view = view3;
            view2 = view4;
            i2 = i5;
            i3 = i7;
        }
    }

    private void M7(View view, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = layoutParams.mUb;
        if (i3 != i2) {
            ViewCompat.FX(view, i2 - i3);
            layoutParams.mUb = i2;
        }
    }

    static Behavior N(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = f36113E;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal threadLocal = f36114FX;
            Map map = (Map) threadLocal.get();
            if (map == null) {
                map = new HashMap();
                threadLocal.set(map);
            }
            Constructor<?> constructor = (Constructor) map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f36116M);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return (Behavior) constructor.newInstance(context, attributeSet);
        } catch (Exception e2) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e2);
        }
    }

    private WindowInsetsCompat O(WindowInsetsCompat windowInsetsCompat) {
        Behavior behaviorO;
        if (windowInsetsCompat.r()) {
            return windowInsetsCompat;
        }
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (ViewCompat.WPU(childAt) && (behaviorO = ((LayoutParams) childAt.getLayoutParams()).O()) != null) {
                windowInsetsCompat = behaviorO.mUb(this, childAt, windowInsetsCompat);
                if (windowInsetsCompat.r()) {
                    return windowInsetsCompat;
                }
            }
        }
        return windowInsetsCompat;
    }

    private void P5(View view, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int i3 = layoutParams.xMQ;
        if (i3 != i2) {
            ViewCompat.M(view, i2 - i3);
            layoutParams.xMQ = i2;
        }
    }

    private void aYN(List list) {
        int childDrawingOrder;
        list.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i2 = childCount - 1; i2 >= 0; i2--) {
            if (zIsChildrenDrawingOrderEnabled) {
                childDrawingOrder = getChildDrawingOrder(childCount, i2);
            } else {
                childDrawingOrder = i2;
            }
            list.add(getChildAt(childDrawingOrder));
        }
        Comparator comparator = f36112B;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    private void bzg(boolean z2) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            Behavior behaviorO = ((LayoutParams) childAt.getLayoutParams()).O();
            if (behaviorO != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z2) {
                    behaviorO.HI(this, childAt, motionEventObtain);
                } else {
                    behaviorO.T(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            ((LayoutParams) getChildAt(i3).getLayoutParams()).qie();
        }
        this.f36120T = null;
        this.f36123g = false;
    }

    private void eF() {
        if (ViewCompat.WPU(this)) {
            if (this.p5 == null) {
                this.p5 = new OnApplyWindowInsetsListener() { // from class: androidx.coordinatorlayout.widget.CoordinatorLayout.1
                    @Override // androidx.core.view.OnApplyWindowInsetsListener
                    public WindowInsetsCompat n(View view, WindowInsetsCompat windowInsetsCompat) {
                        return CoordinatorLayout.this.p5(windowInsetsCompat);
                    }
                };
            }
            ViewCompat.Org(this, this.p5);
            setSystemUiVisibility(1280);
            return;
        }
        ViewCompat.Org(this, null);
    }

    private void fD(View view, Rect rect, int i2) {
        boolean z2;
        boolean z3;
        int width;
        int i3;
        int i5;
        int i7;
        int height;
        int i8;
        int i9;
        int i10;
        if (ViewCompat.P5(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            Behavior behaviorO = layoutParams.O();
            Rect rectN = n();
            Rect rectN2 = n();
            rectN2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (behaviorO != null && behaviorO.J2(this, view, rectN)) {
                if (!rectN2.contains(rectN)) {
                    throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectN.toShortString() + " | Bounds:" + rectN2.toShortString());
                }
            } else {
                rectN.set(rectN2);
            }
            v(rectN2);
            if (rectN.isEmpty()) {
                v(rectN);
                return;
            }
            int iRl = GravityCompat.rl(layoutParams.KN, i2);
            boolean z4 = true;
            if ((iRl & 48) == 48 && (i9 = (rectN.top - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - layoutParams.mUb) < (i10 = rect.top)) {
                M7(view, i10 - i9);
                z2 = true;
            } else {
                z2 = false;
            }
            if ((iRl & 80) == 80 && (height = ((getHeight() - rectN.bottom) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) + layoutParams.mUb) < (i8 = rect.bottom)) {
                M7(view, height - i8);
                z2 = true;
            }
            if (!z2) {
                M7(view, 0);
            }
            if ((iRl & 3) == 3 && (i5 = (rectN.left - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - layoutParams.xMQ) < (i7 = rect.left)) {
                P5(view, i7 - i5);
                z3 = true;
            } else {
                z3 = false;
            }
            if ((iRl & 5) == 5 && (width = ((getWidth() - rectN.right) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin) + layoutParams.xMQ) < (i3 = rect.right)) {
                P5(view, width - i3);
            } else {
                z4 = z3;
            }
            if (!z4) {
                P5(view, 0);
            }
            v(rectN);
        }
    }

    private void g(View view, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        Rect rectN = n();
        rectN.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        if (this.jB != null && ViewCompat.WPU(this) && !ViewCompat.WPU(view)) {
            rectN.left += this.jB.gh();
            rectN.top += this.jB.az();
            rectN.right -= this.jB.qie();
            rectN.bottom -= this.jB.mUb();
        }
        Rect rectN2 = n();
        GravityCompat.n(jB(layoutParams.f36134t), view.getMeasuredWidth(), view.getMeasuredHeight(), rectN, rectN2, i2);
        view.layout(rectN2.left, rectN2.top, rectN2.right, rectN2.bottom);
        v(rectN);
        v(rectN2);
    }

    private void iF(View view, int i2, int i3) {
        int i5;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int iRl = GravityCompat.rl(U(layoutParams.f36134t), i3);
        int i7 = iRl & 7;
        int i8 = iRl & 112;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i3 == 1) {
            i2 = width - i2;
        }
        int iXQ = XQ(i2) - measuredWidth;
        if (i7 != 1) {
            if (i7 == 5) {
                iXQ += measuredWidth;
            }
        } else {
            iXQ += measuredWidth / 2;
        }
        if (i8 != 16) {
            if (i8 != 80) {
                i5 = 0;
            } else {
                i5 = measuredHeight;
            }
        } else {
            i5 = measuredHeight / 2;
        }
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, Math.min(iXQ, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, Math.min(i5, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth + iMax, measuredHeight + iMax2);
    }

    private void nr(LayoutParams layoutParams, Rect rect, int i2, int i3) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i2) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i3) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin));
        rect.set(iMax, iMax2, i2 + iMax, i3 + iMax2);
    }

    private void te(View view, View view2, int i2) {
        Rect rectN = n();
        Rect rectN2 = n();
        try {
            r(view2, rectN);
            o(view, i2, rectN, rectN2);
            view.layout(rectN2.left, rectN2.top, rectN2.right, rectN2.bottom);
        } finally {
            v(rectN);
            v(rectN2);
        }
    }

    private static void v(Rect rect) {
        rect.setEmpty();
        f36115J.n(rect);
    }

    void E2(View view, int i2) {
        Behavior behaviorO;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (layoutParams.gh != null) {
            Rect rectN = n();
            Rect rectN2 = n();
            Rect rectN3 = n();
            r(layoutParams.gh, rectN);
            boolean z2 = false;
            ck(view, false, rectN2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            Z(view, i2, rectN, rectN3, layoutParams, measuredWidth, measuredHeight);
            if (rectN3.left != rectN2.left || rectN3.top != rectN2.top) {
                z2 = true;
            }
            nr(layoutParams, rectN3, measuredWidth, measuredHeight);
            int i3 = rectN3.left - rectN2.left;
            int i5 = rectN3.top - rectN2.top;
            if (i3 != 0) {
                ViewCompat.M(view, i3);
            }
            if (i5 != 0) {
                ViewCompat.FX(view, i5);
            }
            if (z2 && (behaviorO = layoutParams.O()) != null) {
                behaviorO.qie(this, view, layoutParams.gh);
            }
            v(rectN);
            v(rectN2);
            v(rectN3);
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean HI(View view, View view2, int i2, int i3) {
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                Behavior behaviorO = layoutParams.O();
                if (behaviorO != null) {
                    boolean zE2 = behaviorO.E2(this, childAt, view, view2, i2, i3);
                    z2 |= zE2;
                    layoutParams.Ik(i3, zE2);
                } else {
                    layoutParams.Ik(i3, false);
                }
            }
        }
        return z2;
    }

    void J2() {
        int childCount = getChildCount();
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= childCount) {
                break;
            }
            if (ViF(getChildAt(i2))) {
                z2 = true;
                break;
            }
            i2++;
        }
        if (z2 != this.Xw) {
            if (z2) {
                rl();
            } else {
                rV9();
            }
        }
    }

    void S(View view, Rect rect) {
        rect.set(((LayoutParams) view.getLayoutParams()).Uo());
    }

    public void T(View view, int i2, int i3, int i5, int i7) {
        measureChildWithMargins(view, i2, i3, i5, i7);
    }

    /* JADX WARN: Multi-variable type inference failed */
    LayoutParams WPU(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!layoutParams.rl) {
            if (view instanceof AttachedBehavior) {
                Behavior behaviorN = ((AttachedBehavior) view).n();
                if (behaviorN == null) {
                    Log.e("CoordinatorLayout", "Attached behavior class is null");
                }
                layoutParams.ty(behaviorN);
                layoutParams.rl = true;
                return layoutParams;
            }
            DefaultBehavior defaultBehavior = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                defaultBehavior = (DefaultBehavior) superclass.getAnnotation(DefaultBehavior.class);
                if (defaultBehavior != null) {
                    break;
                }
            }
            if (defaultBehavior != null) {
                try {
                    layoutParams.ty((Behavior) defaultBehavior.value().getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                } catch (Exception e2) {
                    Log.e("CoordinatorLayout", "Default behavior class " + defaultBehavior.value().getName() + " could not be instantiated. Did you forget a default constructor?", e2);
                }
            }
            layoutParams.rl = true;
        }
        return layoutParams;
    }

    public void X(View view, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (!layoutParams.n()) {
            View view2 = layoutParams.gh;
            if (view2 != null) {
                te(view, view2, i2);
                return;
            }
            int i3 = layoutParams.f36131O;
            if (i3 >= 0) {
                iF(view, i3, i2);
                return;
            } else {
                g(view, i2);
                return;
            }
        }
        throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
    }

    void ck(View view, boolean z2, Rect rect) {
        if (!view.isLayoutRequested() && view.getVisibility() != 8) {
            if (z2) {
                r(view, rect);
                return;
            } else {
                rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                return;
            }
        }
        rect.setEmpty();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        boolean state;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.P5;
        if (drawable != null && drawable.isStateful()) {
            state = drawable.setState(drawableState);
        } else {
            state = false;
        }
        if (state) {
            invalidate();
        }
    }

    @VisibleForTesting
    final List<View> getDependencySortedChildren() {
        s7N();
        return Collections.unmodifiableList(this.f36124n);
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void gh(View view, int i2, int i3, int[] iArr, int i5) {
        Behavior behaviorO;
        int iMin;
        int iMin2;
        int childCount = getChildCount();
        boolean z2 = false;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.xMQ(i5) && (behaviorO = layoutParams.O()) != null) {
                    int[] iArr2 = this.f36125o;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    behaviorO.XQ(this, childAt, view, i2, i3, iArr2, i5);
                    int[] iArr3 = this.f36125o;
                    if (i2 > 0) {
                        iMin = Math.max(i7, iArr3[0]);
                    } else {
                        iMin = Math.min(i7, iArr3[0]);
                    }
                    i7 = iMin;
                    int[] iArr4 = this.f36125o;
                    if (i3 > 0) {
                        iMin2 = Math.max(i8, iArr4[1]);
                    } else {
                        iMin2 = Math.min(i8, iArr4[1]);
                    }
                    i8 = iMin2;
                    z2 = true;
                }
            }
        }
        iArr[0] = i7;
        iArr[1] = i8;
        if (z2) {
            e(1);
        }
    }

    public boolean nY(View view, int i2, int i3) {
        Rect rectN = n();
        r(view, rectN);
        try {
            return rectN.contains(i2, i3);
        } finally {
            v(rectN);
        }
    }

    void o(View view, int i2, Rect rect, Rect rect2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        Z(view, i2, rect, rect2, layoutParams, measuredWidth, measuredHeight);
        nr(layoutParams, rect2, measuredWidth, measuredHeight);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        bzg(false);
        if (this.Xw) {
            if (this.f36128v == null) {
                this.f36128v = new OnPreDrawListener();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f36128v);
        }
        if (this.jB == null && ViewCompat.WPU(this)) {
            ViewCompat.piY(this);
        }
        this.E2 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bzg(false);
        if (this.Xw && this.f36128v != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f36128v);
        }
        View view = this.f36117N;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.E2 = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int iAz;
        super.onDraw(canvas);
        if (this.f36121U && this.P5 != null) {
            WindowInsetsCompat windowInsetsCompat = this.jB;
            if (windowInsetsCompat != null) {
                iAz = windowInsetsCompat.az();
            } else {
                iAz = 0;
            }
            if (iAz > 0) {
                this.P5.setBounds(0, 0, getWidth(), iAz);
                this.P5.draw(canvas);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            bzg(true);
        }
        boolean zNHg = nHg(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zNHg;
        }
        bzg(true);
        return zNHg;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i5, int i7) {
        Behavior behaviorO;
        int iNY = ViewCompat.nY(this);
        int size = this.f36124n.size();
        for (int i8 = 0; i8 < size; i8++) {
            View view = (View) this.f36124n.get(i8);
            if (view.getVisibility() != 8 && ((behaviorO = ((LayoutParams) view.getLayoutParams()).O()) == null || !behaviorO.ck(this, view, iNY))) {
                X(view, iNY);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0015  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onNestedFling(View view, float f3, float f4, boolean z2) {
        Behavior behaviorO;
        View view2;
        float f5;
        float f6;
        boolean z3;
        int childCount = getChildCount();
        int i2 = 0;
        boolean zR = false;
        while (i2 < childCount) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 8) {
                view2 = view;
                f5 = f3;
                f6 = f4;
                z3 = z2;
            } else {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.xMQ(0) && (behaviorO = layoutParams.O()) != null) {
                    view2 = view;
                    f5 = f3;
                    f6 = f4;
                    z3 = z2;
                    zR |= behaviorO.r(this, childAt, view2, f5, f6, z3);
                }
            }
            i2++;
            view = view2;
            f3 = f5;
            f4 = f6;
            z2 = z3;
        }
        if (zR) {
            e(1);
        }
        return zR;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0015  */
    @Override // android.view.ViewGroup, android.view.ViewParent
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onNestedPreFling(View view, float f3, float f4) {
        Behavior behaviorO;
        View view2;
        float f5;
        float f6;
        int childCount = getChildCount();
        int i2 = 0;
        boolean zO = false;
        while (i2 < childCount) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() == 8) {
                view2 = view;
                f5 = f3;
                f6 = f4;
            } else {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.xMQ(0) && (behaviorO = layoutParams.O()) != null) {
                    view2 = view;
                    f5 = f3;
                    f6 = f4;
                    zO |= behaviorO.o(this, childAt, view2, f5, f6);
                }
            }
            i2++;
            view = view2;
            f3 = f5;
            f4 = f6;
        }
        return zO;
    }

    void r(View view, Rect rect) {
        ViewGroupUtils.n(this, view, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        Behavior behaviorO = ((LayoutParams) view.getLayoutParams()).O();
        if (behaviorO != null && behaviorO.g(this, view, rect, z2)) {
            return true;
        }
        return super.requestChildRectangleOnScreen(view, rect, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z2) {
        super.requestDisallowInterceptTouchEvent(z2);
        if (z2 && !this.f36123g) {
            bzg(false);
            this.f36123g = true;
        }
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z2) {
        super.setFitsSystemWindows(z2);
        eF();
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        boolean z2;
        super.setVisibility(i2);
        if (i2 == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Drawable drawable = this.P5;
        if (drawable != null && drawable.isVisible() != z2) {
            this.P5.setVisible(z2, false);
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.P5) {
            return false;
        }
        return true;
    }

    void wTp(View view, Rect rect) {
        ((LayoutParams) view.getLayoutParams()).ck(rect);
    }
}
