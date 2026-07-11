package androidx.appcompat.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.core.graphics.Insets;
import androidx.core.view.NestedScrollingParent;
import androidx.core.view.NestedScrollingParent2;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@RestrictTo
public class ActionBarOverlayLayout extends ViewGroup implements DecorContentParent, NestedScrollingParent, NestedScrollingParent2, NestedScrollingParent3 {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private WindowInsetsCompat f13947B;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private OverScroller f13948D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private WindowInsetsCompat f13949E;
    private boolean E2;

    /* JADX INFO: renamed from: FX, reason: collision with root package name */
    private WindowInsetsCompat f13950FX;

    /* JADX INFO: renamed from: GR, reason: collision with root package name */
    private final Runnable f13951GR;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    final AnimatorListenerAdapter f13952I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private ActionBarVisibilityCallback f13953J;
    ActionBarContainer J2;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private WindowInsetsCompat f13954M;
    private final Rect M7;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private int f13955N;
    private final Runnable Nxk;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private ContentFrameLayout f13956O;
    private final Rect P5;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private boolean f13957S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private int f13958T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private final Rect f13959U;
    private final Rect Xw;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ViewPropertyAnimator f13960a;
    private final NoSystemUiLayoutFlagView dR0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f13961e;
    private final Rect eF;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f13962g;
    private final Rect jB;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final NestedScrollingParentHelper f13963k;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f13964n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Drawable f13965o;
    private final Rect p5;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private DecorToolbar f13966r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f13967t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Rect f13968v;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    static final int[] f13946z = {R.attr.rl, android.R.attr.windowContentOverlay};
    private static final WindowInsetsCompat piY = new WindowInsetsCompat.Builder().nr(Insets.t(0, 1, 0, 1)).n();
    private static final Rect ijL = new Rect();

    public interface ActionBarVisibilityCallback {
        void O();

        void n();

        void nr();

        void onWindowVisibilityChanged(int i2);

        void rl();

        void t(boolean z2);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i2, int i3) {
            super(i2, i3);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f3, float f4) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
    }

    public void setIcon(int i2) {
        g();
        this.f13966r.setIcon(i2);
    }

    public void setShowingForActionMode(boolean z2) {
    }

    public void setUiOptions(int i2) {
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    private static final class NoSystemUiLayoutFlagView extends View {
        @Override // android.view.View
        public int getWindowSystemUiVisibility() {
            return 0;
        }

        NoSystemUiLayoutFlagView(Context context) {
            super(context);
            setWillNotDraw(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private DecorToolbar XQ(View view) {
        if (view instanceof DecorToolbar) {
            return (DecorToolbar) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    private boolean iF(float f3) {
        this.f13948D.fling(0, 0, 0, (int) f3, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.f13948D.getFinalY() > this.J2.getHeight();
    }

    private boolean r() {
        ViewCompat.J2(this.dR0, piY, this.f13959U);
        return !this.f13959U.equals(ijL);
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean HI(View view, View view2, int i2, int i3) {
        return i3 == 0 && onStartNestedScroll(view, view2, i2);
    }

    void S() {
        removeCallbacks(this.f13951GR);
        removeCallbacks(this.Nxk);
        ViewPropertyAnimator viewPropertyAnimator = this.f13960a;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public boolean aYN() {
        return this.f13957S;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    void g() {
        if (this.f13956O == null) {
            this.f13956O = (ContentFrameLayout) findViewById(R.id.rl);
            this.J2 = (ActionBarContainer) findViewById(R.id.f13477t);
            this.f13966r = XQ(findViewById(R.id.f13474n));
        }
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.J2;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f13963k.n();
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void gh(View view, int i2, int i3, int[] iArr, int i5) {
        if (i5 == 0) {
            onNestedPreScroll(view, i2, i3, iArr);
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void mUb(View view, int i2) {
        if (i2 == 0) {
            onStopNestedScroll(view);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-1, -1);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f3, float f4, boolean z2) {
        if (!this.E2 || !z2) {
            return false;
        }
        if (iF(f4)) {
            ck();
        } else {
            te();
        }
        this.f13961e = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i2, int i3, int i5, int i7) {
        int i8 = this.f13958T + i3;
        this.f13958T = i8;
        setActionBarHideOffset(i8);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i2) {
        this.f13963k.rl(view, view2, i2);
        this.f13958T = getActionBarHideOffset();
        S();
        ActionBarVisibilityCallback actionBarVisibilityCallback = this.f13953J;
        if (actionBarVisibilityCallback != null) {
            actionBarVisibilityCallback.O();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i2) {
        if ((i2 & 2) == 0 || this.J2.getVisibility() != 0) {
            return false;
        }
        return this.E2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        if (this.E2 && !this.f13961e) {
            if (this.f13958T <= this.J2.getHeight()) {
                nY();
            } else {
                ViF();
            }
        }
        ActionBarVisibilityCallback actionBarVisibilityCallback = this.f13953J;
        if (actionBarVisibilityCallback != null) {
            actionBarVisibilityCallback.rl();
        }
    }

    public void setActionBarVisibilityCallback(ActionBarVisibilityCallback actionBarVisibilityCallback) {
        this.f13953J = actionBarVisibilityCallback;
        if (getWindowToken() != null) {
            this.f13953J.onWindowVisibilityChanged(this.f13967t);
            int i2 = this.f13955N;
            if (i2 != 0) {
                onWindowSystemUiVisibilityChanged(i2);
                ViewCompat.piY(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z2) {
        this.f13962g = z2;
    }

    public void setHideOnContentScrollEnabled(boolean z2) {
        if (z2 != this.E2) {
            this.E2 = z2;
            if (z2) {
                return;
            }
            S();
            setActionBarHideOffset(0);
        }
    }

    public void setOverlayMode(boolean z2) {
        this.f13957S = z2;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void ty(View view, int i2, int i3, int i5, int i7, int i8) {
        if (i8 == 0) {
            onNestedScroll(view, i2, i3, i5, i7);
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void xMQ(View view, View view2, int i2, int i3) {
        if (i3 == 0) {
            onNestedScrollAccepted(view, view2, i2);
        }
    }

    public ActionBarOverlayLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13967t = 0;
        this.f13968v = new Rect();
        this.Xw = new Rect();
        this.jB = new Rect();
        this.f13959U = new Rect();
        this.P5 = new Rect();
        this.M7 = new Rect();
        this.p5 = new Rect();
        this.eF = new Rect();
        WindowInsetsCompat windowInsetsCompat = WindowInsetsCompat.rl;
        this.f13949E = windowInsetsCompat;
        this.f13954M = windowInsetsCompat;
        this.f13950FX = windowInsetsCompat;
        this.f13947B = windowInsetsCompat;
        this.f13952I = new AnimatorListenerAdapter() { // from class: androidx.appcompat.widget.ActionBarOverlayLayout.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
                ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
                actionBarOverlayLayout.f13960a = null;
                actionBarOverlayLayout.f13961e = false;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
                actionBarOverlayLayout.f13960a = null;
                actionBarOverlayLayout.f13961e = false;
            }
        };
        this.f13951GR = new Runnable() { // from class: androidx.appcompat.widget.ActionBarOverlayLayout.2
            @Override // java.lang.Runnable
            public void run() {
                ActionBarOverlayLayout.this.S();
                ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
                actionBarOverlayLayout.f13960a = actionBarOverlayLayout.J2.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f13952I);
            }
        };
        this.Nxk = new Runnable() { // from class: androidx.appcompat.widget.ActionBarOverlayLayout.3
            @Override // java.lang.Runnable
            public void run() {
                ActionBarOverlayLayout.this.S();
                ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
                actionBarOverlayLayout.f13960a = actionBarOverlayLayout.J2.animate().translationY(-ActionBarOverlayLayout.this.J2.getHeight()).setListener(ActionBarOverlayLayout.this.f13952I);
            }
        };
        WPU(context);
        this.f13963k = new NestedScrollingParentHelper(this);
        NoSystemUiLayoutFlagView noSystemUiLayoutFlagView = new NoSystemUiLayoutFlagView(context);
        this.dR0 = noSystemUiLayoutFlagView;
        addView(noSystemUiLayoutFlagView);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean Ik(View view, Rect rect, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        if (z2) {
            int i2 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
            int i3 = rect.left;
            if (i2 != i3) {
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = i3;
                z6 = true;
            } else {
                z6 = false;
            }
        }
        if (z3) {
            int i5 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
            int i7 = rect.top;
            if (i5 != i7) {
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = i7;
                z6 = true;
            }
        }
        if (z5) {
            int i8 = ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
            int i9 = rect.right;
            if (i8 != i9) {
                ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = i9;
                z6 = true;
            }
        }
        if (z4) {
            int i10 = ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
            int i11 = rect.bottom;
            if (i10 != i11) {
                ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = i11;
                return true;
            }
        }
        return z6;
    }

    private void ViF() {
        S();
        postDelayed(this.Nxk, 600L);
    }

    private void WPU(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f13946z);
        boolean z2 = false;
        this.f13964n = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f13965o = drawable;
        if (drawable == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        typedArrayObtainStyledAttributes.recycle();
        this.f13948D = new OverScroller(context);
    }

    private void ck() {
        S();
        this.Nxk.run();
    }

    private void nY() {
        S();
        postDelayed(this.f13951GR, 600L);
    }

    private void te() {
        S();
        this.f13951GR.run();
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void J2() {
        g();
        this.f13966r.J2();
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void KN(int i2) {
        g();
        if (i2 != 2) {
            if (i2 != 5) {
                if (i2 != 109) {
                    return;
                }
                setOverlayMode(true);
                return;
            }
            this.f13966r.WPU();
            return;
        }
        this.f13966r.ck();
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public boolean O() {
        g();
        return this.f13966r.O();
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public boolean Uo() {
        g();
        return this.f13966r.Uo();
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public void az(View view, int i2, int i3, int i5, int i7, int i8, int[] iArr) {
        ty(view, i2, i3, i5, i7, i8);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int bottom;
        super.draw(canvas);
        if (this.f13965o != null) {
            if (this.J2.getVisibility() == 0) {
                bottom = (int) (this.J2.getBottom() + this.J2.getTranslationY() + 0.5f);
            } else {
                bottom = 0;
            }
            this.f13965o.setBounds(0, bottom, getWidth(), this.f13965o.getIntrinsicHeight() + bottom);
            this.f13965o.draw(canvas);
        }
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    public CharSequence getTitle() {
        g();
        return this.f13966r.getTitle();
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public boolean n() {
        g();
        return this.f13966r.n();
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void nr(Menu menu, MenuPresenter.Callback callback) {
        g();
        this.f13966r.nr(menu, callback);
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        g();
        WindowInsetsCompat windowInsetsCompatTe = WindowInsetsCompat.te(windowInsets, this);
        boolean zIk = Ik(this.J2, new Rect(windowInsetsCompatTe.gh(), windowInsetsCompatTe.az(), windowInsetsCompatTe.qie(), windowInsetsCompatTe.mUb()), true, true, false, true);
        ViewCompat.J2(this, windowInsetsCompatTe, this.f13968v);
        Rect rect = this.f13968v;
        WindowInsetsCompat windowInsetsCompatCk = windowInsetsCompatTe.ck(rect.left, rect.top, rect.right, rect.bottom);
        this.f13949E = windowInsetsCompatCk;
        boolean z2 = true;
        if (!this.f13954M.equals(windowInsetsCompatCk)) {
            this.f13954M = this.f13949E;
            zIk = true;
        }
        if (!this.Xw.equals(this.f13968v)) {
            this.Xw.set(this.f13968v);
        } else {
            z2 = zIk;
        }
        if (z2) {
            requestLayout();
        }
        return windowInsetsCompatTe.n().t().rl().nY();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        WPU(getContext());
        ViewCompat.piY(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        S();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i5, int i7) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i9 = ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + paddingLeft;
                int i10 = ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + paddingTop;
                childAt.layout(i9, i10, measuredWidth + i9, measuredHeight + i10);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        boolean z2;
        int measuredHeight;
        g();
        measureChildWithMargins(this.J2, i2, 0, i3, 0);
        LayoutParams layoutParams = (LayoutParams) this.J2.getLayoutParams();
        int iMax = Math.max(0, this.J2.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin);
        int iMax2 = Math.max(0, this.J2.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.J2.getMeasuredState());
        if ((ViewCompat.wTp(this) & 256) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            measuredHeight = this.f13964n;
            if (this.f13962g && this.J2.getTabContainer() != null) {
                measuredHeight += this.f13964n;
            }
        } else {
            measuredHeight = this.J2.getVisibility() != 8 ? this.J2.getMeasuredHeight() : 0;
        }
        this.jB.set(this.f13968v);
        this.f13950FX = this.f13949E;
        if (!this.f13957S && !z2 && r()) {
            Rect rect = this.jB;
            rect.top += measuredHeight;
            rect.bottom = rect.bottom;
            this.f13950FX = this.f13950FX.ck(0, measuredHeight, 0, 0);
        } else {
            this.f13950FX = new WindowInsetsCompat.Builder(this.f13950FX).nr(Insets.t(this.f13950FX.gh(), this.f13950FX.az() + measuredHeight, this.f13950FX.qie(), this.f13950FX.mUb())).n();
        }
        Ik(this.f13956O, this.jB, true, true, true, true);
        if (!this.f13947B.equals(this.f13950FX)) {
            WindowInsetsCompat windowInsetsCompat = this.f13950FX;
            this.f13947B = windowInsetsCompat;
            ViewCompat.Uo(this.f13956O, windowInsetsCompat);
        }
        measureChildWithMargins(this.f13956O, i2, 0, i3, 0);
        LayoutParams layoutParams2 = (LayoutParams) this.f13956O.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f13956O.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f13956O.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f13956O.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i2, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(iMax4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i3, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int i2) {
        boolean z2;
        super.onWindowSystemUiVisibilityChanged(i2);
        g();
        int i3 = this.f13955N ^ i2;
        this.f13955N = i2;
        boolean z3 = false;
        if ((i2 & 4) == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if ((i2 & 256) != 0) {
            z3 = true;
        }
        ActionBarVisibilityCallback actionBarVisibilityCallback = this.f13953J;
        if (actionBarVisibilityCallback != null) {
            actionBarVisibilityCallback.t(!z3);
            if (!z2 && z3) {
                this.f13953J.nr();
            } else {
                this.f13953J.n();
            }
        }
        if ((i3 & 256) != 0 && this.f13953J != null) {
            ViewCompat.piY(this);
        }
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        this.f13967t = i2;
        ActionBarVisibilityCallback actionBarVisibilityCallback = this.f13953J;
        if (actionBarVisibilityCallback != null) {
            actionBarVisibilityCallback.onWindowVisibilityChanged(i2);
        }
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void qie() {
        g();
        this.f13966r.r();
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public boolean rl() {
        g();
        return this.f13966r.rl();
    }

    public void setActionBarHideOffset(int i2) {
        S();
        this.J2.setTranslationY(-Math.max(0, Math.min(i2, this.J2.getHeight())));
    }

    public void setIcon(Drawable drawable) {
        g();
        this.f13966r.setIcon(drawable);
    }

    public void setLogo(int i2) {
        g();
        this.f13966r.Z(i2);
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void setWindowCallback(Window.Callback callback) {
        g();
        this.f13966r.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public void setWindowTitle(CharSequence charSequence) {
        g();
        this.f13966r.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.widget.DecorContentParent
    public boolean t() {
        g();
        return this.f13966r.t();
    }
}
