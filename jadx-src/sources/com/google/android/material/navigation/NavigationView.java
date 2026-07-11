package com.google.android.material.navigation;

import IzQ.CN3;
import Rxk.o;
import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.annotation.VisibleForTesting;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.customview.view.AbsSavedState;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.view.BackEventCompat;
import com.google.android.material.internal.C;
import com.google.android.material.internal.Dsr;
import com.google.android.material.internal.eO;
import com.google.android.material.internal.fuX;
import com.google.android.material.internal.s4;
import i7B.j;
import java.util.Objects;
import mfo.C;
import mfo.Xo;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class NavigationView extends C implements IzQ.n {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final CN3 f59061E;
    private final Dsr E2;

    /* JADX INFO: renamed from: FX, reason: collision with root package name */
    private final DrawerLayout.DrawerListener f59062FX;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final IzQ.w6 f59063M;
    private final boolean M7;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private final int[] f59064N;
    private int P5;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private final int f59065T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private boolean f59066U;
    private ViewTreeObserver.OnGlobalLayoutListener Xw;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Ml f59067e;
    private final Xo eF;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final fuX f59068g;
    private boolean jB;
    private final int p5;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private MenuInflater f59069v;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static final int[] f59058B = {R.attr.state_checked};

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private static final int[] f59060J = {-16842910};

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final int f59059D = Rxk.C.mUb;

    public interface Ml {
        boolean n(MenuItem menuItem);
    }

    class j extends DrawerLayout.SimpleDrawerListener {
        j() {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.SimpleDrawerListener, androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public void n(View view) {
            NavigationView navigationView = NavigationView.this;
            if (view == navigationView) {
                final IzQ.w6 w6Var = navigationView.f59063M;
                Objects.requireNonNull(w6Var);
                view.post(new Runnable() { // from class: com.google.android.material.navigation.Ml
                    @Override // java.lang.Runnable
                    public final void run() {
                        w6Var.nr();
                    }
                });
            }
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.SimpleDrawerListener, androidx.drawerlayout.widget.DrawerLayout.DrawerListener
        public void rl(View view) {
            NavigationView navigationView = NavigationView.this;
            if (view == navigationView) {
                navigationView.f59063M.O();
                NavigationView.this.Z();
            }
        }
    }

    class n implements MenuBuilder.Callback {
        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public void rl(MenuBuilder menuBuilder) {
        }

        n() {
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public boolean n(MenuBuilder menuBuilder, MenuItem menuItem) {
            Ml ml = NavigationView.this.f59067e;
            return ml != null && ml.n(menuItem);
        }
    }

    class w6 implements ViewTreeObserver.OnGlobalLayoutListener {
        w6() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            NavigationView navigationView = NavigationView.this;
            navigationView.getLocationOnScreen(navigationView.f59064N);
            boolean z2 = true;
            boolean z3 = NavigationView.this.f59064N[1] == 0;
            NavigationView.this.E2.E2(z3);
            NavigationView navigationView2 = NavigationView.this;
            navigationView2.setDrawTopInsetForeground(z3 && navigationView2.o());
            NavigationView.this.setDrawLeftInsetForeground(NavigationView.this.f59064N[0] == 0 || NavigationView.this.f59064N[0] + NavigationView.this.getWidth() == 0);
            Activity activityN = com.google.android.material.internal.n.n(NavigationView.this.getContext());
            if (activityN != null) {
                Rect rectN = s4.n(activityN);
                boolean z4 = rectN.height() - NavigationView.this.getHeight() == NavigationView.this.f59064N[1];
                boolean z5 = Color.alpha(activityN.getWindow().getNavigationBarColor()) != 0;
                NavigationView navigationView3 = NavigationView.this;
                navigationView3.setDrawBottomInsetForeground(z4 && z5 && navigationView3.r());
                if (rectN.width() != NavigationView.this.f59064N[0] && rectN.width() - NavigationView.this.getWidth() != NavigationView.this.f59064N[0]) {
                    z2 = false;
                }
                NavigationView.this.setDrawRightInsetForeground(z2);
            }
        }
    }

    public NavigationView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, Rxk.n.f8811v);
    }

    public void setCheckedItem(@IdRes int i2) {
        MenuItem menuItemFindItem = this.f59068g.findItem(i2);
        if (menuItemFindItem != null) {
            this.E2.e((MenuItemImpl) menuItemFindItem);
        }
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new j();

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public Bundle f59070O;

        class j implements Parcelable.ClassLoaderCreator {
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

            j() {
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f59070O = parcel.readBundle(classLoader);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeBundle(this.f59070O);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NavigationView(Context context, AttributeSet attributeSet, int i2) {
        int i3;
        int i5 = f59059D;
        super(scw.j.t(context, attributeSet, i2, i5), attributeSet, i2);
        Dsr dsr = new Dsr();
        this.E2 = dsr;
        this.f59064N = new int[2];
        this.jB = true;
        this.f59066U = true;
        this.P5 = 0;
        this.eF = Xo.n(this);
        this.f59061E = new CN3(this);
        this.f59063M = new IzQ.w6(this);
        this.f59062FX = new j();
        Context context2 = getContext();
        fuX fux = new fuX(context2);
        this.f59068g = fux;
        TintTypedArray tintTypedArrayMUb = eO.mUb(context2, attributeSet, o.f8854aL, i2, i5, new int[0]);
        int i7 = o.EG3;
        if (tintTypedArrayMUb.o(i7)) {
            ViewCompat.C(this, tintTypedArrayMUb.Uo(i7));
        }
        int iJ2 = tintTypedArrayMUb.J2(o.f8839R, 0);
        this.P5 = iJ2;
        this.M7 = iJ2 == 0;
        this.p5 = getResources().getDimensionPixelSize(Rxk.Ml.f8745S);
        Drawable background = getBackground();
        ColorStateList colorStateListJ2 = com.google.android.material.drawable.Ml.J2(background);
        if (background == null || colorStateListJ2 != null) {
            mfo.CN3 cn3 = new mfo.CN3(mfo.C.O(context2, attributeSet, i2, i5).az());
            if (colorStateListJ2 != null) {
                cn3.p5(colorStateListJ2);
            }
            cn3.nHg(context2);
            ViewCompat.C(this, cn3);
        }
        if (tintTypedArrayMUb.o(o.DT)) {
            setElevation(tintTypedArrayMUb.J2(r2, 0));
        }
        setFitsSystemWindows(tintTypedArrayMUb.n(o.Lc, false));
        this.f59065T = tintTypedArrayMUb.J2(o.p1, 0);
        int i8 = o.XPq;
        ColorStateList colorStateListT = tintTypedArrayMUb.o(i8) ? tintTypedArrayMUb.t(i8) : null;
        int i9 = o.joB;
        int iTy = tintTypedArrayMUb.o(i9) ? tintTypedArrayMUb.ty(i9, 0) : 0;
        if (iTy == 0 && colorStateListT == null) {
            colorStateListT = gh(R.attr.textColorSecondary);
        }
        int i10 = o.ib;
        ColorStateList colorStateListT2 = tintTypedArrayMUb.o(i10) ? tintTypedArrayMUb.t(i10) : gh(R.attr.textColorSecondary);
        int i11 = o.LN;
        int iTy2 = tintTypedArrayMUb.o(i11) ? tintTypedArrayMUb.ty(i11, 0) : 0;
        boolean zN = tintTypedArrayMUb.n(o.mjs, true);
        int i12 = o.md;
        if (tintTypedArrayMUb.o(i12)) {
            setItemIconSize(tintTypedArrayMUb.J2(i12, 0));
        }
        int i13 = o.WNG;
        ColorStateList colorStateListT3 = tintTypedArrayMUb.o(i13) ? tintTypedArrayMUb.t(i13) : null;
        if (iTy2 == 0 && colorStateListT3 == null) {
            colorStateListT3 = gh(R.attr.textColorPrimary);
        }
        Drawable drawableUo = tintTypedArrayMUb.Uo(o.QZ);
        if (drawableUo == null && HI(tintTypedArrayMUb)) {
            drawableUo = qie(tintTypedArrayMUb);
            ColorStateList colorStateListRl = X4.w6.rl(context2, tintTypedArrayMUb, o.in7);
            if (colorStateListRl != null) {
                dsr.s7N(new RippleDrawable(ZOk.n.nr(colorStateListRl), null, az(tintTypedArrayMUb, null)));
            }
        }
        int i14 = o.TPh;
        if (tintTypedArrayMUb.o(i14)) {
            i3 = 0;
            setItemHorizontalPadding(tintTypedArrayMUb.J2(i14, 0));
        } else {
            i3 = 0;
        }
        int i15 = o.Xt;
        if (tintTypedArrayMUb.o(i15)) {
            setItemVerticalPadding(tintTypedArrayMUb.J2(i15, i3));
        }
        setDividerInsetStart(tintTypedArrayMUb.J2(o.Efj, i3));
        setDividerInsetEnd(tintTypedArrayMUb.J2(o.oPT, i3));
        setSubheaderInsetStart(tintTypedArrayMUb.J2(o.wY, i3));
        setSubheaderInsetEnd(tintTypedArrayMUb.J2(o.RWu, i3));
        setTopInsetScrimEnabled(tintTypedArrayMUb.n(o.f8837P, this.jB));
        setBottomInsetScrimEnabled(tintTypedArrayMUb.n(o.ai, this.f59066U));
        int iJ22 = tintTypedArrayMUb.J2(o.hRk, i3);
        setItemMaxLines(tintTypedArrayMUb.gh(o.f8846V, 1));
        fux.E(new n());
        dsr.N(1);
        dsr.gh(context2, fux);
        if (iTy != 0) {
            dsr.FX(iTy);
        }
        dsr.eF(colorStateListT);
        dsr.bzg(colorStateListT2);
        dsr.p5(getOverScrollMode());
        if (iTy2 != 0) {
            dsr.jB(iTy2);
        }
        dsr.U(zN);
        dsr.P5(colorStateListT3);
        dsr.nHg(drawableUo);
        dsr.v(iJ22);
        fux.rl(dsr);
        addView((View) dsr.nY(this));
        int i16 = o.NkL;
        if (tintTypedArrayMUb.o(i16)) {
            Ik(tintTypedArrayMUb.ty(i16, 0));
        }
        int i17 = o.f8843SA;
        if (tintTypedArrayMUb.o(i17)) {
            ck(tintTypedArrayMUb.ty(i17, 0));
        }
        tintTypedArrayMUb.aYN();
        WPU();
    }

    private boolean HI(TintTypedArray tintTypedArray) {
        return tintTypedArray.o(o.sm) || tintTypedArray.o(o.f8872kd);
    }

    private void WPU() {
        this.Xw = new w6();
        getViewTreeObserver().addOnGlobalLayoutListener(this.Xw);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z() {
        if (!this.M7 || this.P5 == 0) {
            return;
        }
        this.P5 = 0;
        XQ(getWidth(), getHeight());
    }

    private Drawable az(TintTypedArray tintTypedArray, ColorStateList colorStateList) {
        mfo.CN3 cn3 = new mfo.CN3(mfo.C.rl(getContext(), tintTypedArray.ty(o.sm, 0), tintTypedArray.ty(o.f8872kd, 0)).az());
        cn3.p5(colorStateList);
        return new InsetDrawable((Drawable) cn3, tintTypedArray.J2(o.Qf, 0), tintTypedArray.J2(o.YJB, 0), tintTypedArray.J2(o.I4, 0), tintTypedArray.J2(o.CE, 0));
    }

    private MenuInflater getMenuInflater() {
        if (this.f59069v == null) {
            this.f59069v = new SupportMenuInflater(getContext());
        }
        return this.f59069v;
    }

    private ColorStateList gh(int i2) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i2, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListN = AppCompatResources.n(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(androidx.appcompat.R.attr.wTp, typedValue, true)) {
            return null;
        }
        int i3 = typedValue.data;
        int defaultColor = colorStateListN.getDefaultColor();
        int[] iArr = f59060J;
        return new ColorStateList(new int[][]{iArr, f59058B, FrameLayout.EMPTY_STATE_SET}, new int[]{colorStateListN.getColorForState(iArr, defaultColor), i3, defaultColor});
    }

    public void Ik(int i2) {
        this.E2.B(true);
        getMenuInflater().inflate(i2, this.f59068g);
        this.E2.B(false);
        this.E2.KN(false);
    }

    public View ck(int i2) {
        return this.E2.fD(i2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        this.eF.nr(canvas, new j.InterfaceC0967j() { // from class: com.google.android.material.navigation.w6
            @Override // i7B.j.InterfaceC0967j
            public final void n(Canvas canvas2) {
                super/*android.view.View*/.dispatchDraw(canvas2);
            }
        });
    }

    @VisibleForTesting
    CN3 getBackHelper() {
        return this.f59061E;
    }

    @Nullable
    public MenuItem getCheckedItem() {
        return this.E2.ty();
    }

    @Px
    public int getDividerInsetEnd() {
        return this.E2.HI();
    }

    @Px
    public int getDividerInsetStart() {
        return this.E2.ck();
    }

    public int getHeaderCount() {
        return this.E2.Ik();
    }

    @Nullable
    public Drawable getItemBackground() {
        return this.E2.o();
    }

    @Dimension
    public int getItemHorizontalPadding() {
        return this.E2.Z();
    }

    @Dimension
    public int getItemIconPadding() {
        return this.E2.XQ();
    }

    @Nullable
    public ColorStateList getItemIconTintList() {
        return this.E2.aYN();
    }

    public int getItemMaxLines() {
        return this.E2.S();
    }

    @Nullable
    public ColorStateList getItemTextColor() {
        return this.E2.WPU();
    }

    @Px
    public int getItemVerticalPadding() {
        return this.E2.ViF();
    }

    @NonNull
    public Menu getMenu() {
        return this.f59068g;
    }

    @Px
    public int getSubheaderInsetEnd() {
        return this.E2.g();
    }

    @Px
    public int getSubheaderInsetStart() {
        return this.E2.te();
    }

    @Override // com.google.android.material.internal.C
    protected void n(WindowInsetsCompat windowInsetsCompat) {
        this.E2.az(windowInsetsCompat);
    }

    public boolean o() {
        return this.jB;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.n());
        this.f59068g.M7(savedState.f59070O);
    }

    public boolean r() {
        return this.f59066U;
    }

    public void setBottomInsetScrimEnabled(boolean z2) {
        this.f59066U = z2;
    }

    public void setDividerInsetEnd(@Px int i2) {
        this.E2.X(i2);
    }

    public void setDividerInsetStart(@Px int i2) {
        this.E2.T(i2);
    }

    @RestrictTo
    @VisibleForTesting
    public void setForceCompatClippingEnabled(boolean z2) {
        this.eF.Uo(this, z2);
    }

    public void setItemBackground(@Nullable Drawable drawable) {
        this.E2.nHg(drawable);
    }

    public void setItemHorizontalPadding(@Dimension int i2) {
        this.E2.wTp(i2);
    }

    public void setItemHorizontalPaddingResource(@DimenRes int i2) {
        this.E2.wTp(getResources().getDimensionPixelSize(i2));
    }

    public void setItemIconPadding(@Dimension int i2) {
        this.E2.v(i2);
    }

    public void setItemIconPaddingResource(int i2) {
        this.E2.v(getResources().getDimensionPixelSize(i2));
    }

    public void setItemIconSize(@Dimension int i2) {
        this.E2.rV9(i2);
    }

    public void setItemIconTintList(@Nullable ColorStateList colorStateList) {
        this.E2.bzg(colorStateList);
    }

    public void setItemMaxLines(int i2) {
        this.E2.Xw(i2);
    }

    public void setItemTextAppearance(@StyleRes int i2) {
        this.E2.jB(i2);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z2) {
        this.E2.U(z2);
    }

    public void setItemTextColor(@Nullable ColorStateList colorStateList) {
        this.E2.P5(colorStateList);
    }

    public void setItemVerticalPadding(@Px int i2) {
        this.E2.M7(i2);
    }

    public void setItemVerticalPaddingResource(@DimenRes int i2) {
        this.E2.M7(getResources().getDimensionPixelSize(i2));
    }

    public void setNavigationItemSelectedListener(@Nullable Ml ml) {
        this.f59067e = ml;
    }

    public void setSubheaderInsetEnd(@Px int i2) {
        this.E2.E(i2);
    }

    public void setSubheaderInsetStart(@Px int i2) {
        this.E2.M(i2);
    }

    public void setTopInsetScrimEnabled(boolean z2) {
        this.jB = z2;
    }

    public View ty(int i2) {
        return this.E2.r(i2);
    }

    private Pair S() {
        ViewParent parent = getParent();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if ((parent instanceof DrawerLayout) && (layoutParams instanceof DrawerLayout.LayoutParams)) {
            return new Pair((DrawerLayout) parent, (DrawerLayout.LayoutParams) layoutParams);
        }
        throw new IllegalStateException("NavigationView back progress requires the direct parent view to be a DrawerLayout.");
    }

    private void XQ(int i2, int i3) {
        boolean z2;
        if ((getParent() instanceof DrawerLayout) && (getLayoutParams() instanceof DrawerLayout.LayoutParams)) {
            if ((this.P5 > 0 || this.M7) && (getBackground() instanceof mfo.CN3)) {
                if (GravityCompat.rl(((DrawerLayout.LayoutParams) getLayoutParams()).f38271n, ViewCompat.nY(this)) == 3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                mfo.CN3 cn3 = (mfo.CN3) getBackground();
                C.n nVarHI = cn3.g().S().HI(this.P5);
                if (z2) {
                    nVarHI.g(0.0f);
                    nVarHI.o(0.0f);
                } else {
                    nVarHI.E2(0.0f);
                    nVarHI.WPU(0.0f);
                }
                mfo.C cAz = nVarHI.az();
                cn3.setShapeAppearanceModel(cAz);
                this.eF.J2(this, cAz);
                this.eF.O(this, new RectF(0.0f, 0.0f, i2, i3));
                this.eF.KN(this, true);
            }
        }
    }

    private Drawable qie(TintTypedArray tintTypedArray) {
        return az(tintTypedArray, X4.w6.rl(getContext(), tintTypedArray, o.h6));
    }

    @Override // IzQ.n
    public void O() {
        Pair pairS = S();
        DrawerLayout drawerLayout = (DrawerLayout) pairS.first;
        BackEventCompat backEventCompatT = this.f59061E.t();
        if (backEventCompatT != null && Build.VERSION.SDK_INT >= 34) {
            this.f59061E.KN(backEventCompatT, ((DrawerLayout.LayoutParams) pairS.second).f38271n, com.google.android.material.navigation.n.rl(drawerLayout, this), com.google.android.material.navigation.n.t(drawerLayout));
            return;
        }
        drawerLayout.J2(this);
    }

    @Override // IzQ.n
    public void nr(BackEventCompat backEventCompat) {
        this.f59061E.qie(backEventCompat, ((DrawerLayout.LayoutParams) S().second).f38271n);
        if (this.M7) {
            this.P5 = G7.j.t(0, this.p5, this.f59061E.n(backEventCompat.getProgress()));
            XQ(getWidth(), getHeight());
        }
    }

    @Override // com.google.android.material.internal.C, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        mfo.fuX.O(this);
        ViewParent parent = getParent();
        if ((parent instanceof DrawerLayout) && this.f59063M.rl()) {
            DrawerLayout drawerLayout = (DrawerLayout) parent;
            drawerLayout.bzg(this.f59062FX);
            drawerLayout.n(this.f59062FX);
            if (drawerLayout.fD(this)) {
                this.f59063M.nr();
            }
        }
    }

    @Override // com.google.android.material.internal.C, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.Xw);
        ViewParent parent = getParent();
        if (parent instanceof DrawerLayout) {
            ((DrawerLayout) parent).bzg(this.f59062FX);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec(this.f59065T, 1073741824);
            }
        } else {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i2), this.f59065T), 1073741824);
        }
        super.onMeasure(i2, i3);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.f59070O = bundle;
        this.f59068g.eF(bundle);
        return savedState;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i5, int i7) {
        super.onSizeChanged(i2, i3, i5, i7);
        XQ(i2, i3);
    }

    @Override // IzQ.n
    public void rl() {
        S();
        this.f59061E.J2();
        Z();
    }

    public void setCheckedItem(@NonNull MenuItem menuItem) {
        MenuItem menuItemFindItem = this.f59068g.findItem(menuItem.getItemId());
        if (menuItemFindItem != null) {
            this.E2.e((MenuItemImpl) menuItemFindItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }

    @Override // android.view.View
    public void setElevation(float f3) {
        super.setElevation(f3);
        mfo.fuX.nr(this, f3);
    }

    public void setItemBackgroundResource(@DrawableRes int i2) {
        setItemBackground(ContextCompat.getDrawable(getContext(), i2));
    }

    @Override // android.view.View
    public void setOverScrollMode(int i2) {
        super.setOverScrollMode(i2);
        Dsr dsr = this.E2;
        if (dsr != null) {
            dsr.p5(i2);
        }
    }

    @Override // IzQ.n
    public void t(BackEventCompat backEventCompat) {
        S();
        this.f59061E.mUb(backEventCompat);
    }
}
