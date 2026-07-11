package androidx.drawerlayout.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.customview.view.AbsSavedState;
import androidx.customview.widget.Openable;
import androidx.customview.widget.ViewDragHelper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class DrawerLayout extends ViewGroup implements Openable {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private static final boolean f38243C;
    private static boolean Mx;
    static final boolean ofS;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private Drawable f38244B;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private CharSequence f38245D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private float f38246E;
    private final ViewDragCallback E2;

    /* JADX INFO: renamed from: FX, reason: collision with root package name */
    private Drawable f38247FX;

    /* JADX INFO: renamed from: GR, reason: collision with root package name */
    private boolean f38248GR;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private Object f38249I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private Drawable f38250J;
    private int J2;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private float f38251M;
    private boolean M7;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private boolean f38252N;
    private Drawable Nxk;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f38253O;
    private int P5;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final ViewDragHelper f38254S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private int f38255T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private int f38256U;
    private int Xw;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CharSequence f38257a;
    private Drawable dR0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ViewDragCallback f38258e;
    private List eF;
    private final AccessibilityViewCommand eTf;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ViewDragHelper f38259g;
    private Rect ijL;
    private int jB;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Drawable f38260k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Matrix f38261m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ChildAccessibilityDelegate f38262n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Paint f38263o;
    private DrawerListener p5;
    private final ArrayList piY;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f38264r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f38265t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f38266v;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private Drawable f38267z;
    private static final int[] xg = {R.attr.colorPrimaryDark};
    static final int[] pJg = {R.attr.layout_gravity};

    class AccessibilityDelegate extends AccessibilityDelegateCompat {
        private final Rect nr = new Rect();

        AccessibilityDelegate() {
        }

        private void HI(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2) {
            Rect rect = this.nr;
            accessibilityNodeInfoCompat2.ty(rect);
            accessibilityNodeInfoCompat.m(rect);
            accessibilityNodeInfoCompat.UF(accessibilityNodeInfoCompat2.J());
            accessibilityNodeInfoCompat.How(accessibilityNodeInfoCompat2.nY());
            accessibilityNodeInfoCompat.ofS(accessibilityNodeInfoCompat2.Ik());
            accessibilityNodeInfoCompat.fcU(accessibilityNodeInfoCompat2.Z());
            accessibilityNodeInfoCompat.Jk(accessibilityNodeInfoCompat2.bzg());
            accessibilityNodeInfoCompat.mYa(accessibilityNodeInfoCompat2.U());
            accessibilityNodeInfoCompat.dR0(accessibilityNodeInfoCompat2.nHg());
            accessibilityNodeInfoCompat.QZ6(accessibilityNodeInfoCompat2.M());
            accessibilityNodeInfoCompat.n(accessibilityNodeInfoCompat2.gh());
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void Uo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            if (DrawerLayout.ofS) {
                super.Uo(view, accessibilityNodeInfoCompat);
            } else {
                AccessibilityNodeInfoCompat accessibilityNodeInfoCompatI = AccessibilityNodeInfoCompat.I(accessibilityNodeInfoCompat);
                super.Uo(view, accessibilityNodeInfoCompatI);
                accessibilityNodeInfoCompat.VwL(view);
                Object objE = ViewCompat.e(view);
                if (objE instanceof View) {
                    accessibilityNodeInfoCompat.ER((View) objE);
                }
                HI(accessibilityNodeInfoCompat, accessibilityNodeInfoCompatI);
                accessibilityNodeInfoCompatI.Nxk();
                ty(accessibilityNodeInfoCompat, (ViewGroup) view);
            }
            accessibilityNodeInfoCompat.ofS("androidx.drawerlayout.widget.DrawerLayout");
            accessibilityNodeInfoCompat.qm(false);
            accessibilityNodeInfoCompat.mYa(false);
            accessibilityNodeInfoCompat.Y(AccessibilityNodeInfoCompat.AccessibilityActionCompat.f36849O);
            accessibilityNodeInfoCompat.Y(AccessibilityNodeInfoCompat.AccessibilityActionCompat.J2);
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean xMQ(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (DrawerLayout.ofS || DrawerLayout.g(view)) {
                return super.xMQ(viewGroup, view, accessibilityEvent);
            }
            return false;
        }

        private void ty(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, ViewGroup viewGroup) {
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (DrawerLayout.g(childAt)) {
                    accessibilityNodeInfoCompat.t(childAt);
                }
            }
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void J2(View view, AccessibilityEvent accessibilityEvent) {
            super.J2(view, accessibilityEvent);
            accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public boolean n(View view, AccessibilityEvent accessibilityEvent) {
            if (accessibilityEvent.getEventType() == 32) {
                List<CharSequence> text = accessibilityEvent.getText();
                View viewCk = DrawerLayout.this.ck();
                if (viewCk != null) {
                    CharSequence charSequenceO = DrawerLayout.this.o(DrawerLayout.this.Z(viewCk));
                    if (charSequenceO != null) {
                        text.add(charSequenceO);
                        return true;
                    }
                    return true;
                }
                return true;
            }
            return super.n(view, accessibilityEvent);
        }
    }

    public interface DrawerListener {
        void n(View view);

        void nr(View view, float f3);

        void rl(View view);

        void t(int i2);
    }

    public static abstract class SimpleDrawerListener implements DrawerListener {
        @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public void n(View view) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public void nr(View view, float f3) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public void rl(View view) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public void t(int i2) {
        }
    }

    private class ViewDragCallback extends ViewDragHelper.Callback {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final int f38277n;
        private ViewDragHelper rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Runnable f38278t = new Runnable() { // from class: androidx.drawerlayout.widget.DrawerLayout.ViewDragCallback.1
            @Override // java.lang.Runnable
            public void run() {
                ViewDragCallback.this.HI();
            }
        };

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void J2(int i2, int i3) {
            View viewTy = (i2 & 1) == 1 ? DrawerLayout.this.ty(3) : DrawerLayout.this.ty(5);
            if (viewTy == null || DrawerLayout.this.r(viewTy) != 0) {
                return;
            }
            this.rl.t(viewTy, i3);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public boolean Uo(int i2) {
            return false;
        }

        ViewDragCallback(int i2) {
            this.f38277n = i2;
        }

        private void ty() {
            View viewTy = DrawerLayout.this.ty(this.f38277n == 3 ? 5 : 3);
            if (viewTy != null) {
                DrawerLayout.this.J2(viewTy);
            }
        }

        void HI() {
            View viewTy;
            int width;
            int iViF = this.rl.ViF();
            boolean z2 = this.f38277n == 3;
            if (z2) {
                viewTy = DrawerLayout.this.ty(3);
                width = (viewTy != null ? -viewTy.getWidth() : 0) + iViF;
            } else {
                viewTy = DrawerLayout.this.ty(5);
                width = DrawerLayout.this.getWidth() - iViF;
            }
            if (viewTy != null) {
                if (((!z2 || viewTy.getLeft() >= width) && (z2 || viewTy.getLeft() <= width)) || DrawerLayout.this.r(viewTy) != 0) {
                    return;
                }
                LayoutParams layoutParams = (LayoutParams) viewTy.getLayoutParams();
                this.rl.U(viewTy, width, viewTy.getTop());
                layoutParams.f38272t = true;
                DrawerLayout.this.invalidate();
                ty();
                DrawerLayout.this.rl();
            }
        }

        public void Ik(ViewDragHelper viewDragHelper) {
            this.rl = viewDragHelper;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void KN(int i2, int i3) {
            DrawerLayout.this.postDelayed(this.f38278t, 160L);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public boolean az(View view, int i2) {
            return DrawerLayout.this.E2(view) && DrawerLayout.this.t(view, this.f38277n) && DrawerLayout.this.r(view) == 0;
        }

        public void ck() {
            DrawerLayout.this.removeCallbacks(this.f38278t);
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void mUb(int i2) {
            DrawerLayout.this.M(i2, this.rl.WPU());
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int n(View view, int i2, int i3) {
            if (DrawerLayout.this.t(view, 3)) {
                return Math.max(-view.getWidth(), Math.min(i2, 0));
            }
            int width = DrawerLayout.this.getWidth();
            return Math.max(width - view.getWidth(), Math.min(i2, width));
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int nr(View view) {
            if (DrawerLayout.this.E2(view)) {
                return view.getWidth();
            }
            return 0;
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void qie(View view, float f3, float f4) {
            int i2;
            float fXQ = DrawerLayout.this.XQ(view);
            int width = view.getWidth();
            if (DrawerLayout.this.t(view, 3)) {
                i2 = (f3 > 0.0f || (f3 == 0.0f && fXQ > 0.5f)) ? 0 : -width;
            } else {
                int width2 = DrawerLayout.this.getWidth();
                if (f3 < 0.0f || (f3 == 0.0f && fXQ > 0.5f)) {
                    width2 -= width;
                }
                i2 = width2;
            }
            this.rl.Xw(i2, view.getTop());
            DrawerLayout.this.invalidate();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void gh(View view, int i2, int i3, int i5, int i7) {
            float width;
            int i8;
            int width2 = view.getWidth();
            if (DrawerLayout.this.t(view, 3)) {
                width = i2 + width2;
            } else {
                width = DrawerLayout.this.getWidth() - i2;
            }
            float f3 = width / width2;
            DrawerLayout.this.p5(view, f3);
            if (f3 == 0.0f) {
                i8 = 4;
            } else {
                i8 = 0;
            }
            view.setVisibility(i8);
            DrawerLayout.this.invalidate();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public int rl(View view, int i2, int i3) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.ViewDragHelper.Callback
        public void xMQ(View view, int i2) {
            ((LayoutParams) view.getLayoutParams()).f38272t = false;
            ty();
        }
    }

    public DrawerLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, androidx.drawerlayout.R.attr.f38238n);
    }

    public void J2(View view) {
        Uo(view, true);
    }

    public void KN() {
        xMQ(false);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public void nr(int i2) {
        O(i2, true);
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i2, KeyEvent keyEvent) {
        if (i2 != 4 || !nY()) {
            return super.onKeyDown(i2, keyEvent);
        }
        keyEvent.startTracking();
        return true;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i2, KeyEvent keyEvent) {
        if (i2 != 4) {
            return super.onKeyUp(i2, keyEvent);
        }
        View viewCk = ck();
        if (viewCk != null && r(viewCk) == 0) {
            KN();
        }
        return viewCk != null;
    }

    public void s7N(int i2) {
        wTp(i2, true);
    }

    public void setDrawerLockMode(int i2) {
        M7(i2, 3);
        M7(i2, 5);
    }

    public void setStatusBarBackground(@Nullable Drawable drawable) {
        this.f38247FX = drawable;
        invalidate();
    }

    public void v(View view) {
        rV9(view, true);
    }

    static final class ChildAccessibilityDelegate extends AccessibilityDelegateCompat {
        ChildAccessibilityDelegate() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void Uo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.Uo(view, accessibilityNodeInfoCompat);
            if (!DrawerLayout.g(view)) {
                accessibilityNodeInfoCompat.ER(null);
            }
        }
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: androidx.drawerlayout.widget.DrawerLayout.SavedState.1
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
        int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f38273O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        int f38274Z;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f38275o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f38276r;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f38273O = 0;
            this.f38273O = parcel.readInt();
            this.J2 = parcel.readInt();
            this.f38276r = parcel.readInt();
            this.f38275o = parcel.readInt();
            this.f38274Z = parcel.readInt();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f38273O);
            parcel.writeInt(this.J2);
            parcel.writeInt(this.f38276r);
            parcel.writeInt(this.f38275o);
            parcel.writeInt(this.f38274Z);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
            this.f38273O = 0;
        }
    }

    public DrawerLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f38262n = new ChildAccessibilityDelegate();
        this.J2 = -1728053248;
        this.f38263o = new Paint();
        this.f38266v = true;
        this.Xw = 3;
        this.jB = 3;
        this.f38256U = 3;
        this.P5 = 3;
        this.Nxk = null;
        this.f38260k = null;
        this.dR0 = null;
        this.f38267z = null;
        this.eTf = new AccessibilityViewCommand() { // from class: androidx.drawerlayout.widget.DrawerLayout.1
            @Override // androidx.core.view.accessibility.AccessibilityViewCommand
            public boolean n(View view, AccessibilityViewCommand.CommandArguments commandArguments) {
                if (!DrawerLayout.this.fD(view) || DrawerLayout.this.r(view) == 2) {
                    return false;
                }
                DrawerLayout.this.J2(view);
                return true;
            }
        };
        setDescendantFocusability(262144);
        float f3 = getResources().getDisplayMetrics().density;
        this.f38253O = (int) ((64.0f * f3) + 0.5f);
        float f4 = f3 * 400.0f;
        ViewDragCallback viewDragCallback = new ViewDragCallback(3);
        this.E2 = viewDragCallback;
        ViewDragCallback viewDragCallback2 = new ViewDragCallback(5);
        this.f38258e = viewDragCallback2;
        ViewDragHelper viewDragHelperHI = ViewDragHelper.HI(this, 1.0f, viewDragCallback);
        this.f38254S = viewDragHelperHI;
        viewDragHelperHI.rV9(1);
        viewDragHelperHI.bzg(f4);
        viewDragCallback.Ik(viewDragHelperHI);
        ViewDragHelper viewDragHelperHI2 = ViewDragHelper.HI(this, 1.0f, viewDragCallback2);
        this.f38259g = viewDragHelperHI2;
        viewDragHelperHI2.rV9(2);
        viewDragHelperHI2.bzg(f4);
        viewDragCallback2.Ik(viewDragHelperHI2);
        setFocusableInTouchMode(true);
        ViewCompat.ul(this, 1);
        ViewCompat.eTf(this, new AccessibilityDelegate());
        setMotionEventSplittingEnabled(false);
        if (ViewCompat.WPU(this)) {
            setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: androidx.drawerlayout.widget.DrawerLayout.2
                @Override // android.view.View.OnApplyWindowInsetsListener
                public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    ((DrawerLayout) view).P5(windowInsets, windowInsets.getSystemWindowInsetTop() > 0);
                    return windowInsets.consumeSystemWindowInsets();
                }
            });
            setSystemUiVisibility(1280);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(xg);
            try {
                this.f38247FX = typedArrayObtainStyledAttributes.getDrawable(0);
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, androidx.drawerlayout.R.styleable.rl, i2, 0);
        try {
            int i3 = androidx.drawerlayout.R.styleable.f38242t;
            if (typedArrayObtainStyledAttributes2.hasValue(i3)) {
                this.f38265t = typedArrayObtainStyledAttributes2.getDimension(i3, 0.0f);
            } else {
                this.f38265t = getResources().getDimension(androidx.drawerlayout.R.dimen.f38239n);
            }
            typedArrayObtainStyledAttributes2.recycle();
            this.piY = new ArrayList();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes2.recycle();
            throw th;
        }
    }

    private void N(Drawable drawable, int i2) {
        if (drawable == null || !DrawableCompat.KN(drawable)) {
            return;
        }
        DrawableCompat.az(drawable, i2);
    }

    private boolean T(float f3, float f4, View view) {
        if (this.ijL == null) {
            this.ijL = new Rect();
        }
        view.getHitRect(this.ijL);
        return this.ijL.contains((int) f3, (int) f4);
    }

    private void U() {
        if (f38243C) {
            return;
        }
        this.f38244B = Xw();
        this.f38250J = jB();
    }

    static String WPU(int i2) {
        return (i2 & 3) == 3 ? "LEFT" : (i2 & 5) == 5 ? "RIGHT" : Integer.toHexString(i2);
    }

    private void eF(View view) {
        AccessibilityNodeInfoCompat.AccessibilityActionCompat accessibilityActionCompat = AccessibilityNodeInfoCompat.AccessibilityActionCompat.ViF;
        ViewCompat.k(view, accessibilityActionCompat.rl());
        if (!fD(view) || r(view) == 2) {
            return;
        }
        ViewCompat.z(view, accessibilityActionCompat, null, this.eTf);
    }

    void M(int i2, View view) {
        int i3;
        int iTe = this.f38254S.te();
        int iTe2 = this.f38259g.te();
        if (iTe == 1 || iTe2 == 1) {
            i3 = 1;
        } else {
            i3 = 2;
            if (iTe != 2 && iTe2 != 2) {
                i3 = 0;
            }
        }
        if (view != null && i2 == 0) {
            float f3 = ((LayoutParams) view.getLayoutParams()).rl;
            if (f3 == 0.0f) {
                mUb(view);
            } else if (f3 == 1.0f) {
                gh(view);
            }
        }
        if (i3 != this.f38255T) {
            this.f38255T = i3;
            List list = this.eF;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((DrawerListener) this.eF.get(size)).t(i3);
                }
            }
        }
    }

    public void P5(Object obj, boolean z2) {
        this.f38249I = obj;
        this.f38248GR = z2;
        setWillNotDraw(!z2 && getBackground() == null);
        requestLayout();
    }

    public void bzg(DrawerListener drawerListener) {
        List list;
        if (drawerListener == null || (list = this.eF) == null) {
            return;
        }
        list.remove(drawerListener);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    public float getDrawerElevation() {
        if (f38243C) {
            return this.f38265t;
        }
        return 0.0f;
    }

    @Nullable
    public Drawable getStatusBarBackgroundDrawable() {
        return this.f38247FX;
    }

    public void n(DrawerListener drawerListener) {
        if (drawerListener == null) {
            return;
        }
        if (this.eF == null) {
            this.eF = new ArrayList();
        }
        this.eF.add(drawerListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i5, int i7) {
        WindowInsets rootWindowInsets;
        float f3;
        int i8;
        boolean z3 = true;
        this.f38252N = true;
        int i9 = i5 - i2;
        int childCount = getChildCount();
        int i10 = 0;
        while (i10 < childCount) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (te(childAt)) {
                    int i11 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    childAt.layout(i11, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin, childAt.getMeasuredWidth() + i11, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + childAt.getMeasuredHeight());
                } else {
                    int measuredWidth = childAt.getMeasuredWidth();
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (t(childAt, 3)) {
                        float f4 = measuredWidth;
                        i8 = (-measuredWidth) + ((int) (layoutParams.rl * f4));
                        f3 = (measuredWidth + i8) / f4;
                    } else {
                        float f5 = measuredWidth;
                        f3 = (i9 - r11) / f5;
                        i8 = i9 - ((int) (layoutParams.rl * f5));
                    }
                    boolean z4 = f3 != layoutParams.rl ? z3 : false;
                    int i12 = layoutParams.f38271n & 112;
                    if (i12 == 16) {
                        int i13 = i7 - i3;
                        int i14 = (i13 - measuredHeight) / 2;
                        int i15 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                        if (i14 < i15) {
                            i14 = i15;
                        } else {
                            int i16 = i14 + measuredHeight;
                            int i17 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                            if (i16 > i13 - i17) {
                                i14 = (i13 - i17) - measuredHeight;
                            }
                        }
                        childAt.layout(i8, i14, measuredWidth + i8, measuredHeight + i14);
                    } else if (i12 != 80) {
                        int i18 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                        childAt.layout(i8, i18, measuredWidth + i8, measuredHeight + i18);
                    } else {
                        int i19 = i7 - i3;
                        childAt.layout(i8, (i19 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) - childAt.getMeasuredHeight(), measuredWidth + i8, i19 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
                    }
                    if (z4) {
                        p5(childAt, f3);
                    }
                    int i20 = layoutParams.rl > 0.0f ? 0 : 4;
                    if (childAt.getVisibility() != i20) {
                        childAt.setVisibility(i20);
                    }
                }
            }
            i10++;
            z3 = true;
        }
        if (Mx && (rootWindowInsets = getRootWindowInsets()) != null) {
            Insets insetsXMQ = WindowInsetsCompat.g(rootWindowInsets).xMQ();
            ViewDragHelper viewDragHelper = this.f38254S;
            viewDragHelper.v(Math.max(viewDragHelper.aYN(), insetsXMQ.f36410n));
            ViewDragHelper viewDragHelper2 = this.f38259g;
            viewDragHelper2.v(Math.max(viewDragHelper2.aYN(), insetsXMQ.f36411t));
        }
        this.f38252N = false;
        this.f38266v = false;
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode != 1073741824 || mode2 != 1073741824) {
            if (!isInEditMode()) {
                throw new IllegalArgumentException("DrawerLayout must be measured with MeasureSpec.EXACTLY.");
            }
            if (mode == 0) {
                size = 300;
            }
            if (mode2 == 0) {
                size2 = 300;
            }
        }
        setMeasuredDimension(size, size2);
        boolean z2 = this.f38249I != null && ViewCompat.WPU(this);
        int iNY = ViewCompat.nY(this);
        int childCount = getChildCount();
        boolean z3 = false;
        boolean z4 = false;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (z2) {
                    int iRl = GravityCompat.rl(layoutParams.f38271n, iNY);
                    if (ViewCompat.WPU(childAt)) {
                        WindowInsets windowInsetsReplaceSystemWindowInsets = (WindowInsets) this.f38249I;
                        if (iRl == 3) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        } else if (iRl == 5) {
                            windowInsetsReplaceSystemWindowInsets = windowInsetsReplaceSystemWindowInsets.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets.getSystemWindowInsetBottom());
                        }
                        childAt.dispatchApplyWindowInsets(windowInsetsReplaceSystemWindowInsets);
                    } else {
                        WindowInsets windowInsetsReplaceSystemWindowInsets2 = (WindowInsets) this.f38249I;
                        if (iRl == 3) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), 0, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        } else if (iRl == 5) {
                            windowInsetsReplaceSystemWindowInsets2 = windowInsetsReplaceSystemWindowInsets2.replaceSystemWindowInsets(0, windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight(), windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom());
                        }
                        ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetLeft();
                        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetTop();
                        ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetRight();
                        ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = windowInsetsReplaceSystemWindowInsets2.getSystemWindowInsetBottom();
                    }
                }
                if (te(childAt)) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec((size - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, 1073741824), View.MeasureSpec.makeMeasureSpec((size2 - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, 1073741824));
                } else {
                    if (!E2(childAt)) {
                        throw new IllegalStateException("Child " + childAt + " at index " + i5 + " does not have a valid layout_gravity - must be Gravity.LEFT, Gravity.RIGHT or Gravity.NO_GRAVITY");
                    }
                    if (f38243C) {
                        float fXQ = ViewCompat.XQ(childAt);
                        float f3 = this.f38265t;
                        if (fXQ != f3) {
                            ViewCompat.fcU(childAt, f3);
                        }
                    }
                    int iZ = Z(childAt) & 7;
                    boolean z5 = iZ == 3;
                    if ((z5 && z3) || (!z5 && z4)) {
                        throw new IllegalStateException("Child drawer has absolute gravity " + WPU(iZ) + " but this DrawerLayout already has a drawer view along that edge");
                    }
                    if (z5) {
                        z3 = true;
                    } else {
                        z4 = true;
                    }
                    childAt.measure(ViewGroup.getChildMeasureSpec(i2, this.f38253O + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, ((ViewGroup.MarginLayoutParams) layoutParams).width), ViewGroup.getChildMeasureSpec(i3, ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, ((ViewGroup.MarginLayoutParams) layoutParams).height));
                }
            }
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        View viewTy;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.n());
        int i2 = savedState.f38273O;
        if (i2 != 0 && (viewTy = ty(i2)) != null) {
            v(viewTy);
        }
        int i3 = savedState.J2;
        if (i3 != 3) {
            M7(i3, 3);
        }
        int i5 = savedState.f38276r;
        if (i5 != 3) {
            M7(i5, 5);
        }
        int i7 = savedState.f38275o;
        if (i7 != 3) {
            M7(i7, 8388611);
        }
        int i8 = savedState.f38274Z;
        if (i8 != 3) {
            M7(i8, 8388613);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        View viewHI;
        this.f38254S.X(motionEvent);
        this.f38259g.X(motionEvent);
        int action = motionEvent.getAction() & 255;
        boolean z2 = false;
        if (action == 0) {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            this.f38246E = x2;
            this.f38251M = y2;
            this.M7 = false;
        } else if (action == 1) {
            float x3 = motionEvent.getX();
            float y3 = motionEvent.getY();
            View viewXQ = this.f38254S.XQ((int) x3, (int) y3);
            if (viewXQ == null || !te(viewXQ)) {
                z2 = true;
                xMQ(z2);
            } else {
                float f3 = x3 - this.f38246E;
                float f4 = y3 - this.f38251M;
                int iG = this.f38254S.g();
                if ((f3 * f3) + (f4 * f4) >= iG * iG || (viewHI = HI()) == null || r(viewHI) == 2) {
                }
                xMQ(z2);
            }
        } else if (action == 3) {
            xMQ(true);
            this.M7 = false;
        }
        return true;
    }

    void qie(View view, float f3) {
        List list = this.eF;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                ((DrawerListener) this.eF.get(size)).nr(view, f3);
            }
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (this.f38252N) {
            return;
        }
        super.requestLayout();
    }

    void rl() {
        if (this.M7) {
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            getChildAt(i2).dispatchTouchEvent(motionEventObtain);
        }
        motionEventObtain.recycle();
        this.M7 = true;
    }

    public void setDrawerElevation(float f3) {
        this.f38265t = f3;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (E2(childAt)) {
                ViewCompat.fcU(childAt, this.f38265t);
            }
        }
    }

    @Deprecated
    public void setDrawerListener(DrawerListener drawerListener) {
        DrawerListener drawerListener2 = this.p5;
        if (drawerListener2 != null) {
            bzg(drawerListener2);
        }
        if (drawerListener != null) {
            n(drawerListener);
        }
        this.p5 = drawerListener;
    }

    public void setScrimColor(@ColorInt int i2) {
        this.J2 = i2;
        invalidate();
    }

    public void setStatusBarBackgroundColor(@ColorInt int i2) {
        this.f38247FX = new ColorDrawable(i2);
        invalidate();
    }

    static {
        int i2 = Build.VERSION.SDK_INT;
        boolean z2 = true;
        ofS = true;
        f38243C = true;
        if (i2 < 29) {
            z2 = false;
        }
        Mx = z2;
    }

    private void E(View view, boolean z2) {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((!z2 && !E2(childAt)) || (z2 && childAt == view)) {
                ViewCompat.ul(childAt, 1);
            } else {
                ViewCompat.ul(childAt, 4);
            }
        }
    }

    private MotionEvent S(MotionEvent motionEvent, View view) {
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(scrollX, scrollY);
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            if (this.f38261m == null) {
                this.f38261m = new Matrix();
            }
            matrix.invert(this.f38261m);
            motionEventObtain.transform(this.f38261m);
        }
        return motionEventObtain;
    }

    private boolean ViF() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (((LayoutParams) getChildAt(i2).getLayoutParams()).f38272t) {
                return true;
            }
        }
        return false;
    }

    private Drawable Xw() {
        int iNY = ViewCompat.nY(this);
        if (iNY == 0) {
            Drawable drawable = this.Nxk;
            if (drawable != null) {
                N(drawable, iNY);
                return this.Nxk;
            }
        } else {
            Drawable drawable2 = this.f38260k;
            if (drawable2 != null) {
                N(drawable2, iNY);
                return this.f38260k;
            }
        }
        return this.dR0;
    }

    private static boolean aYN(View view) {
        Drawable background = view.getBackground();
        if (background == null || background.getOpacity() != -1) {
            return false;
        }
        return true;
    }

    private boolean az(MotionEvent motionEvent, View view) {
        if (!view.getMatrix().isIdentity()) {
            MotionEvent motionEventS = S(motionEvent, view);
            boolean zDispatchGenericMotionEvent = view.dispatchGenericMotionEvent(motionEventS);
            motionEventS.recycle();
            return zDispatchGenericMotionEvent;
        }
        float scrollX = getScrollX() - view.getLeft();
        float scrollY = getScrollY() - view.getTop();
        motionEvent.offsetLocation(scrollX, scrollY);
        boolean zDispatchGenericMotionEvent2 = view.dispatchGenericMotionEvent(motionEvent);
        motionEvent.offsetLocation(-scrollX, -scrollY);
        return zDispatchGenericMotionEvent2;
    }

    static boolean g(View view) {
        if (ViewCompat.aYN(view) != 4 && ViewCompat.aYN(view) != 2) {
            return true;
        }
        return false;
    }

    private Drawable jB() {
        int iNY = ViewCompat.nY(this);
        if (iNY == 0) {
            Drawable drawable = this.f38260k;
            if (drawable != null) {
                N(drawable, iNY);
                return this.f38260k;
            }
        } else {
            Drawable drawable2 = this.Nxk;
            if (drawable2 != null) {
                N(drawable2, iNY);
                return this.Nxk;
            }
        }
        return this.f38267z;
    }

    private boolean nY() {
        if (ck() != null) {
            return true;
        }
        return false;
    }

    boolean E2(View view) {
        int iRl = GravityCompat.rl(((LayoutParams) view.getLayoutParams()).f38271n, ViewCompat.nY(view));
        if ((iRl & 3) != 0 || (iRl & 5) != 0) {
            return true;
        }
        return false;
    }

    View HI() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if ((((LayoutParams) childAt.getLayoutParams()).nr & 1) == 1) {
                return childAt;
            }
        }
        return null;
    }

    public int Ik(int i2) {
        int i3;
        int i5;
        int i7;
        int i8;
        int iNY = ViewCompat.nY(this);
        if (i2 != 3) {
            if (i2 != 5) {
                if (i2 != 8388611) {
                    if (i2 == 8388613) {
                        int i9 = this.P5;
                        if (i9 != 3) {
                            return i9;
                        }
                        if (iNY == 0) {
                            i8 = this.jB;
                        } else {
                            i8 = this.Xw;
                        }
                        if (i8 != 3) {
                            return i8;
                        }
                        return 0;
                    }
                    return 0;
                }
                int i10 = this.f38256U;
                if (i10 != 3) {
                    return i10;
                }
                if (iNY == 0) {
                    i7 = this.Xw;
                } else {
                    i7 = this.jB;
                }
                if (i7 != 3) {
                    return i7;
                }
                return 0;
            }
            int i11 = this.jB;
            if (i11 != 3) {
                return i11;
            }
            if (iNY == 0) {
                i5 = this.P5;
            } else {
                i5 = this.f38256U;
            }
            if (i5 != 3) {
                return i5;
            }
            return 0;
        }
        int i12 = this.Xw;
        if (i12 != 3) {
            return i12;
        }
        if (iNY == 0) {
            i3 = this.f38256U;
        } else {
            i3 = this.P5;
        }
        if (i3 != 3) {
            return i3;
        }
        return 0;
    }

    public void M7(int i2, int i3) {
        View viewTy;
        ViewDragHelper viewDragHelper;
        int iRl = GravityCompat.rl(i3, ViewCompat.nY(this));
        if (i3 != 3) {
            if (i3 != 5) {
                if (i3 != 8388611) {
                    if (i3 == 8388613) {
                        this.P5 = i2;
                    }
                } else {
                    this.f38256U = i2;
                }
            } else {
                this.jB = i2;
            }
        } else {
            this.Xw = i2;
        }
        if (i2 != 0) {
            if (iRl == 3) {
                viewDragHelper = this.f38254S;
            } else {
                viewDragHelper = this.f38259g;
            }
            viewDragHelper.rl();
        }
        if (i2 != 1) {
            if (i2 == 2 && (viewTy = ty(iRl)) != null) {
                v(viewTy);
                return;
            }
            return;
        }
        View viewTy2 = ty(iRl);
        if (viewTy2 != null) {
            J2(viewTy2);
        }
    }

    public void O(int i2, boolean z2) {
        View viewTy = ty(i2);
        if (viewTy != null) {
            Uo(viewTy, z2);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + WPU(i2));
    }

    public void Uo(View view, boolean z2) {
        if (E2(view)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (this.f38266v) {
                layoutParams.rl = 0.0f;
                layoutParams.nr = 0;
            } else if (z2) {
                layoutParams.nr |= 4;
                if (t(view, 3)) {
                    this.f38254S.U(view, -view.getWidth(), view.getTop());
                } else {
                    this.f38259g.U(view, getWidth(), view.getTop());
                }
            } else {
                nHg(view, 0.0f);
                M(0, view);
                view.setVisibility(4);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    public boolean X(View view) {
        if (E2(view)) {
            if (((LayoutParams) view.getLayoutParams()).rl > 0.0f) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    float XQ(View view) {
        return ((LayoutParams) view.getLayoutParams()).rl;
    }

    int Z(View view) {
        return GravityCompat.rl(((LayoutParams) view.getLayoutParams()).f38271n, ViewCompat.nY(this));
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList arrayList, int i2, int i3) {
        if (getDescendantFocusability() == 393216) {
            return;
        }
        int childCount = getChildCount();
        boolean z2 = false;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            if (E2(childAt)) {
                if (fD(childAt)) {
                    childAt.addFocusables(arrayList, i2, i3);
                    z2 = true;
                }
            } else {
                this.piY.add(childAt);
            }
        }
        if (!z2) {
            int size = this.piY.size();
            for (int i7 = 0; i7 < size; i7++) {
                View view = (View) this.piY.get(i7);
                if (view.getVisibility() == 0) {
                    view.addFocusables(arrayList, i2, i3);
                }
            }
        }
        this.piY.clear();
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i2, layoutParams);
        if (HI() == null && !E2(view)) {
            ViewCompat.ul(view, 1);
        } else {
            ViewCompat.ul(view, 4);
        }
        if (!ofS) {
            ViewCompat.eTf(view, this.f38262n);
        }
    }

    View ck() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (E2(childAt) && X(childAt)) {
                return childAt;
            }
        }
        return null;
    }

    @Override // android.view.View
    public void computeScroll() {
        int childCount = getChildCount();
        float fMax = 0.0f;
        for (int i2 = 0; i2 < childCount; i2++) {
            fMax = Math.max(fMax, ((LayoutParams) getChildAt(i2).getLayoutParams()).rl);
        }
        this.f38264r = fMax;
        boolean zTy = this.f38254S.ty(true);
        boolean zTy2 = this.f38259g.ty(true);
        if (!zTy && !zTy2) {
            return;
        }
        ViewCompat.GR(this);
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() != 10 && this.f38264r > 0.0f) {
            int childCount = getChildCount();
            if (childCount != 0) {
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                for (int i2 = childCount - 1; i2 >= 0; i2--) {
                    View childAt = getChildAt(i2);
                    if (T(x2, y2, childAt) && !te(childAt) && az(motionEvent, childAt)) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j2) {
        int height = getHeight();
        boolean zTe = te(view);
        int width = getWidth();
        int iSave = canvas.save();
        int i2 = 0;
        if (zTe) {
            int childCount = getChildCount();
            int i3 = 0;
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = getChildAt(i5);
                if (childAt != view && childAt.getVisibility() == 0 && aYN(childAt) && E2(childAt) && childAt.getHeight() >= height) {
                    if (t(childAt, 3)) {
                        int right = childAt.getRight();
                        if (right > i3) {
                            i3 = right;
                        }
                    } else {
                        int left = childAt.getLeft();
                        if (left < width) {
                            width = left;
                        }
                    }
                }
            }
            canvas.clipRect(i3, 0, width, getHeight());
            i2 = i3;
        }
        boolean zDrawChild = super.drawChild(canvas, view, j2);
        canvas.restoreToCount(iSave);
        float f3 = this.f38264r;
        if (f3 > 0.0f && zTe) {
            this.f38263o.setColor((this.J2 & 16777215) | (((int) ((((-16777216) & r14) >>> 24) * f3)) << 24));
            canvas.drawRect(i2, 0.0f, width, getHeight(), this.f38263o);
            return zDrawChild;
        }
        if (this.f38244B != null && t(view, 3)) {
            int intrinsicWidth = this.f38244B.getIntrinsicWidth();
            int right2 = view.getRight();
            float fMax = Math.max(0.0f, Math.min(right2 / this.f38254S.ViF(), 1.0f));
            this.f38244B.setBounds(right2, view.getTop(), intrinsicWidth + right2, view.getBottom());
            this.f38244B.setAlpha((int) (fMax * 255.0f));
            this.f38244B.draw(canvas);
            return zDrawChild;
        }
        if (this.f38250J != null && t(view, 5)) {
            int intrinsicWidth2 = this.f38250J.getIntrinsicWidth();
            int left2 = view.getLeft();
            float fMax2 = Math.max(0.0f, Math.min((getWidth() - left2) / this.f38259g.ViF(), 1.0f));
            this.f38250J.setBounds(left2 - intrinsicWidth2, view.getTop(), left2, view.getBottom());
            this.f38250J.setAlpha((int) (fMax2 * 255.0f));
            this.f38250J.draw(canvas);
        }
        return zDrawChild;
    }

    public boolean e(int i2) {
        View viewTy = ty(i2);
        if (viewTy != null) {
            return X(viewTy);
        }
        return false;
    }

    public boolean fD(View view) {
        if (E2(view)) {
            if ((((LayoutParams) view.getLayoutParams()).nr & 1) == 1) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    void gh(View view) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if ((layoutParams.nr & 1) == 0) {
            layoutParams.nr = 1;
            List list = this.eF;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((DrawerListener) this.eF.get(size)).n(view);
                }
            }
            E(view, true);
            eF(view);
            if (hasWindowFocus()) {
                sendAccessibilityEvent(32);
            }
        }
    }

    public boolean iF(int i2) {
        View viewTy = ty(i2);
        if (viewTy != null) {
            return fD(viewTy);
        }
        return false;
    }

    void mUb(View view) {
        View rootView;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if ((layoutParams.nr & 1) == 1) {
            layoutParams.nr = 0;
            List list = this.eF;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((DrawerListener) this.eF.get(size)).rl(view);
                }
            }
            E(view, false);
            eF(view);
            if (hasWindowFocus() && (rootView = getRootView()) != null) {
                rootView.sendAccessibilityEvent(32);
            }
        }
    }

    void nHg(View view, float f3) {
        float fXQ = XQ(view);
        float width = view.getWidth();
        int i2 = ((int) (width * f3)) - ((int) (fXQ * width));
        if (!t(view, 3)) {
            i2 = -i2;
        }
        view.offsetLeftAndRight(i2);
        p5(view, f3);
    }

    public CharSequence o(int i2) {
        int iRl = GravityCompat.rl(i2, ViewCompat.nY(this));
        if (iRl == 3) {
            return this.f38245D;
        }
        if (iRl == 5) {
            return this.f38257a;
        }
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f38266v = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f38266v = true;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int systemWindowInsetTop;
        super.onDraw(canvas);
        if (this.f38248GR && this.f38247FX != null) {
            Object obj = this.f38249I;
            if (obj != null) {
                systemWindowInsetTop = ((WindowInsets) obj).getSystemWindowInsetTop();
            } else {
                systemWindowInsetTop = 0;
            }
            if (systemWindowInsetTop > 0) {
                this.f38247FX.setBounds(0, 0, getWidth(), systemWindowInsetTop);
                this.f38247FX.draw(canvas);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        View viewXQ;
        int actionMasked = motionEvent.getActionMasked();
        boolean zJB = this.f38254S.jB(motionEvent) | this.f38259g.jB(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked == 3) {
                    }
                } else if (this.f38254S.O(3)) {
                    this.E2.ck();
                    this.f38258e.ck();
                }
                z2 = false;
            } else {
                xMQ(true);
                this.M7 = false;
                z2 = false;
            }
        } else {
            float x2 = motionEvent.getX();
            float y2 = motionEvent.getY();
            this.f38246E = x2;
            this.f38251M = y2;
            if (this.f38264r > 0.0f && (viewXQ = this.f38254S.XQ((int) x2, (int) y2)) != null && te(viewXQ)) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.M7 = false;
        }
        if (zJB || z2 || ViF() || this.M7) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i2) {
        U();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        boolean z2;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i2).getLayoutParams();
            int i3 = layoutParams.nr;
            boolean z3 = true;
            if (i3 == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (i3 != 2) {
                z3 = false;
            }
            if (z2 || z3) {
                savedState.f38273O = layoutParams.f38271n;
                break;
            }
        }
        savedState.J2 = this.Xw;
        savedState.f38276r = this.jB;
        savedState.f38275o = this.f38256U;
        savedState.f38274Z = this.P5;
        return savedState;
    }

    void p5(View view, float f3) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (f3 == layoutParams.rl) {
            return;
        }
        layoutParams.rl = f3;
        qie(view, f3);
    }

    public int r(View view) {
        if (E2(view)) {
            return Ik(((LayoutParams) view.getLayoutParams()).f38271n);
        }
        throw new IllegalArgumentException("View " + view + " is not a drawer");
    }

    public void rV9(View view, boolean z2) {
        if (E2(view)) {
            LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
            if (this.f38266v) {
                layoutParams.rl = 1.0f;
                layoutParams.nr = 1;
                E(view, true);
                eF(view);
            } else if (z2) {
                layoutParams.nr |= 2;
                if (t(view, 3)) {
                    this.f38254S.U(view, 0, view.getTop());
                } else {
                    this.f38259g.U(view, getWidth() - view.getWidth(), view.getTop());
                }
            } else {
                nHg(view, 1.0f);
                M(0, view);
                view.setVisibility(0);
            }
            invalidate();
            return;
        }
        throw new IllegalArgumentException("View " + view + " is not a sliding drawer");
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z2) {
        super.requestDisallowInterceptTouchEvent(z2);
        if (z2) {
            xMQ(true);
        }
    }

    public void setStatusBarBackground(int i2) {
        this.f38247FX = i2 != 0 ? ContextCompat.getDrawable(getContext(), i2) : null;
        invalidate();
    }

    boolean t(View view, int i2) {
        if ((Z(view) & i2) == i2) {
            return true;
        }
        return false;
    }

    boolean te(View view) {
        if (((LayoutParams) view.getLayoutParams()).f38271n == 0) {
            return true;
        }
        return false;
    }

    View ty(int i2) {
        int iRl = GravityCompat.rl(i2, ViewCompat.nY(this)) & 7;
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if ((Z(childAt) & 7) == iRl) {
                return childAt;
            }
        }
        return null;
    }

    public void wTp(int i2, boolean z2) {
        View viewTy = ty(i2);
        if (viewTy != null) {
            rV9(viewTy, z2);
            return;
        }
        throw new IllegalArgumentException("No drawer view found with gravity " + WPU(i2));
    }

    void xMQ(boolean z2) {
        boolean zU;
        int childCount = getChildCount();
        boolean z3 = false;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (E2(childAt) && (!z2 || layoutParams.f38272t)) {
                int width = childAt.getWidth();
                if (t(childAt, 3)) {
                    zU = this.f38254S.U(childAt, -width, childAt.getTop());
                } else {
                    zU = this.f38259g.U(childAt, getWidth(), childAt.getTop());
                }
                z3 |= zU;
                layoutParams.f38272t = false;
            }
        }
        this.E2.ck();
        this.f38258e.ck();
        if (z3) {
            invalidate();
        }
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f38271n;
        int nr;
        float rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        boolean f38272t;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f38271n = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, DrawerLayout.pJg);
            this.f38271n = typedArrayObtainStyledAttributes.getInt(0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public LayoutParams(int i2, int i3) {
            super(i2, i3);
            this.f38271n = 0;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.f38271n = 0;
            this.f38271n = layoutParams.f38271n;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f38271n = 0;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f38271n = 0;
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }
}
