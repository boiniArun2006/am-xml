package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.LinearLayoutCompat;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public class ActionMenuView extends LinearLayoutCompat implements MenuBuilder.ItemInvoker, MenuView {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f13992B;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f13993D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private MenuPresenter.Callback f13994E;

    /* JADX INFO: renamed from: FX, reason: collision with root package name */
    private boolean f13995FX;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int f13996J;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    MenuBuilder.Callback f13997M;
    private int M7;
    private Context P5;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private MenuBuilder f13998U;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    OnMenuItemClickListener f13999a;
    private ActionMenuPresenter eF;
    private boolean p5;

    @RestrictTo
    public interface ActionMenuChildView {
        boolean n();

        boolean rl();
    }

    public static class LayoutParams extends LinearLayoutCompat.LayoutParams {
        boolean J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public boolean f14000O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f14001n;
        public boolean nr;
        public int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f14002t;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.LayoutParams) layoutParams);
            this.f14001n = layoutParams.f14001n;
        }

        public LayoutParams(int i2, int i3) {
            super(i2, i3);
            this.f14001n = false;
        }
    }

    private class MenuBuilderCallback implements MenuBuilder.Callback {
        MenuBuilderCallback() {
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public boolean n(MenuBuilder menuBuilder, MenuItem menuItem) {
            OnMenuItemClickListener onMenuItemClickListener = ActionMenuView.this.f13999a;
            return onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.MenuBuilder.Callback
        public void rl(MenuBuilder menuBuilder) {
            MenuBuilder.Callback callback = ActionMenuView.this.f13997M;
            if (callback != null) {
                callback.rl(menuBuilder);
            }
        }
    }

    public interface OnMenuItemClickListener {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    protected boolean N(int i2) {
        boolean zN = false;
        if (i2 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i2 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i2);
        if (i2 < getChildCount() && (childAt instanceof ActionMenuChildView)) {
            zN = ((ActionMenuChildView) childAt).n();
        }
        return (i2 <= 0 || !(childAt2 instanceof ActionMenuChildView)) ? zN : ((ActionMenuChildView) childAt2).rl() | zN;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    @RestrictTo
    public int getWindowAnimations() {
        return 0;
    }

    private static class ActionMenuPresenterCallback implements MenuPresenter.Callback {
        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public void rl(MenuBuilder menuBuilder, boolean z2) {
        }

        @Override // androidx.appcompat.view.menu.MenuPresenter.Callback
        public boolean t(MenuBuilder menuBuilder) {
            return false;
        }

        ActionMenuPresenterCallback() {
        }
    }

    public ActionMenuView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f3 = context.getResources().getDisplayMetrics().density;
        this.f13996J = (int) (56.0f * f3);
        this.f13993D = (int) (f3 * 4.0f);
        this.P5 = context;
        this.M7 = 0;
    }

    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v48 */
    private void bzg(int i2, int i3) {
        long j2;
        int i5;
        int i7;
        boolean z2;
        boolean z3;
        ?? r3;
        int i8;
        int mode = View.MeasureSpec.getMode(i3);
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i3);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i3, paddingTop, -2);
        int i9 = size - paddingLeft;
        int i10 = this.f13996J;
        int i11 = i9 / i10;
        int i12 = i9 % i10;
        if (i11 == 0) {
            setMeasuredDimension(i9, 0);
            return;
        }
        int i13 = i10 + (i12 / i11);
        int childCount = getChildCount();
        int iMax = 0;
        int i14 = 0;
        boolean z4 = false;
        int i15 = 0;
        int iMax2 = 0;
        int i16 = 0;
        long j3 = 0;
        while (i14 < childCount) {
            View childAt = getChildAt(i14);
            int i17 = size2;
            if (childAt.getVisibility() == 8) {
                i8 = i13;
            } else {
                boolean z5 = childAt instanceof ActionMenuItemView;
                i15++;
                if (z5) {
                    int i18 = this.f13993D;
                    z3 = z5;
                    r3 = 0;
                    childAt.setPadding(i18, 0, i18, 0);
                } else {
                    z3 = z5;
                    r3 = 0;
                }
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                layoutParams.J2 = r3;
                layoutParams.f14002t = r3;
                layoutParams.rl = r3;
                layoutParams.nr = r3;
                ((LinearLayout.LayoutParams) layoutParams).leftMargin = r3;
                ((LinearLayout.LayoutParams) layoutParams).rightMargin = r3;
                layoutParams.f14000O = z3 && ((ActionMenuItemView) childAt).o();
                int iRV9 = rV9(childAt, i13, layoutParams.f14001n ? 1 : i11, childMeasureSpec, paddingTop);
                iMax2 = Math.max(iMax2, iRV9);
                i8 = i13;
                if (layoutParams.nr) {
                    i16++;
                }
                if (layoutParams.f14001n) {
                    z4 = true;
                }
                i11 -= iRV9;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (iRV9 == 1) {
                    j3 |= (long) (1 << i14);
                }
            }
            i14++;
            size2 = i17;
            i13 = i8;
        }
        int i19 = size2;
        int i20 = i13;
        char c2 = 2;
        boolean z6 = z4 && i15 == 2;
        boolean z7 = false;
        while (i16 > 0 && i11 > 0) {
            int i21 = Integer.MAX_VALUE;
            long j4 = 0;
            char c4 = c2;
            int i22 = 0;
            int i23 = 0;
            j2 = 1;
            while (i23 < childCount) {
                LayoutParams layoutParams2 = (LayoutParams) getChildAt(i23).getLayoutParams();
                boolean z9 = z6;
                if (layoutParams2.nr) {
                    int i24 = layoutParams2.rl;
                    if (i24 < i21) {
                        j4 = 1 << i23;
                        i21 = i24;
                        i22 = 1;
                    } else if (i24 == i21) {
                        j4 |= 1 << i23;
                        i22++;
                    }
                }
                i23++;
                z6 = z9;
            }
            boolean z10 = z6;
            j3 |= j4;
            if (i22 > i11) {
                break;
            }
            int i25 = i21 + 1;
            int i26 = 0;
            while (i26 < childCount) {
                View childAt2 = getChildAt(i26);
                LayoutParams layoutParams3 = (LayoutParams) childAt2.getLayoutParams();
                long j5 = 1 << i26;
                if ((j4 & j5) == 0) {
                    if (layoutParams3.rl == i25) {
                        j3 |= j5;
                    }
                    i7 = i26;
                } else {
                    if (!z10 || !layoutParams3.f14000O) {
                        i7 = i26;
                        z2 = true;
                    } else if (i11 == 1) {
                        int i27 = this.f13993D;
                        z2 = true;
                        i7 = i26;
                        childAt2.setPadding(i27 + i20, 0, i27, 0);
                    } else {
                        i7 = i26;
                        z2 = true;
                    }
                    layoutParams3.rl++;
                    layoutParams3.J2 = z2;
                    i11--;
                }
                i26 = i7 + 1;
            }
            c2 = c4;
            z6 = z10;
            z7 = true;
        }
        j2 = 1;
        boolean z11 = !z4 && i15 == 1;
        if (i11 <= 0 || j3 == 0 || (i11 >= i15 - 1 && !z11 && iMax2 <= 1)) {
            i5 = 0;
        } else {
            float fBitCount = Long.bitCount(j3);
            if (z11) {
                i5 = 0;
            } else {
                if ((j3 & j2) != 0) {
                    i5 = 0;
                    if (!((LayoutParams) getChildAt(0).getLayoutParams()).f14000O) {
                        fBitCount -= 0.5f;
                    }
                } else {
                    i5 = 0;
                }
                int i28 = childCount - 1;
                if ((j3 & ((long) (1 << i28))) != 0 && !((LayoutParams) getChildAt(i28).getLayoutParams()).f14000O) {
                    fBitCount -= 0.5f;
                }
            }
            int i29 = fBitCount > 0.0f ? (int) ((i11 * i20) / fBitCount) : i5;
            boolean z12 = z7;
            for (int i30 = i5; i30 < childCount; i30++) {
                if ((j3 & ((long) (1 << i30))) != 0) {
                    View childAt3 = getChildAt(i30);
                    LayoutParams layoutParams4 = (LayoutParams) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        layoutParams4.f14002t = i29;
                        layoutParams4.J2 = true;
                        if (i30 == 0 && !layoutParams4.f14000O) {
                            ((LinearLayout.LayoutParams) layoutParams4).leftMargin = (-i29) / 2;
                        }
                        z12 = true;
                    } else if (layoutParams4.f14001n) {
                        layoutParams4.f14002t = i29;
                        layoutParams4.J2 = true;
                        ((LinearLayout.LayoutParams) layoutParams4).rightMargin = (-i29) / 2;
                        z12 = true;
                    } else {
                        if (i30 != 0) {
                            ((LinearLayout.LayoutParams) layoutParams4).leftMargin = i29 / 2;
                        }
                        if (i30 != childCount - 1) {
                            ((LinearLayout.LayoutParams) layoutParams4).rightMargin = i29 / 2;
                        }
                    }
                }
            }
            z7 = z12;
        }
        if (z7) {
            for (int i31 = i5; i31 < childCount; i31++) {
                View childAt4 = getChildAt(i31);
                LayoutParams layoutParams5 = (LayoutParams) childAt4.getLayoutParams();
                if (layoutParams5.J2) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((layoutParams5.rl * i20) + layoutParams5.f14002t, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i9, mode != 1073741824 ? iMax : i19);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    /* JADX INFO: renamed from: E2, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateDefaultLayoutParams() {
        LayoutParams layoutParams = new LayoutParams(-2, -2);
        ((LinearLayout.LayoutParams) layoutParams).gravity = 16;
        return layoutParams;
    }

    public boolean U() {
        ActionMenuPresenter actionMenuPresenter = this.eF;
        return actionMenuPresenter != null && actionMenuPresenter.rV9();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        LayoutParams layoutParams2 = layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : new LayoutParams(layoutParams);
        if (((LinearLayout.LayoutParams) layoutParams2).gravity <= 0) {
            ((LinearLayout.LayoutParams) layoutParams2).gravity = 16;
        }
        return layoutParams2;
    }

    public MenuBuilder Xw() {
        return this.f13998U;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public void fD() {
        ActionMenuPresenter actionMenuPresenter = this.eF;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.te();
        }
    }

    public Menu getMenu() {
        if (this.f13998U == null) {
            Context context = getContext();
            MenuBuilder menuBuilder = new MenuBuilder(context);
            this.f13998U = menuBuilder;
            menuBuilder.E(new MenuBuilderCallback());
            ActionMenuPresenter actionMenuPresenter = new ActionMenuPresenter(context);
            this.eF = actionMenuPresenter;
            actionMenuPresenter.v(true);
            ActionMenuPresenter actionMenuPresenter2 = this.eF;
            MenuPresenter.Callback actionMenuPresenterCallback = this.f13994E;
            if (actionMenuPresenterCallback == null) {
                actionMenuPresenterCallback = new ActionMenuPresenterCallback();
            }
            actionMenuPresenter2.nr(actionMenuPresenterCallback);
            this.f13998U.t(this.eF, this.P5);
            this.eF.s7N(this);
        }
        return this.f13998U;
    }

    public int getPopupTheme() {
        return this.M7;
    }

    public void jB(MenuPresenter.Callback callback, MenuBuilder.Callback callback2) {
        this.f13994E = callback;
        this.f13997M = callback2;
    }

    @Override // androidx.appcompat.view.menu.MenuView
    public void n(MenuBuilder menuBuilder) {
        this.f13998U = menuBuilder;
    }

    public boolean nHg() {
        ActionMenuPresenter actionMenuPresenter = this.eF;
        return actionMenuPresenter != null && actionMenuPresenter.E2();
    }

    @Override // androidx.appcompat.view.menu.MenuBuilder.ItemInvoker
    public boolean nr(MenuItemImpl menuItemImpl) {
        return this.f13998U.bzg(menuItemImpl, 0);
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i5, int i7) {
        int width;
        int paddingLeft;
        if (!this.f13995FX) {
            super.onLayout(z2, i2, i3, i5, i7);
            return;
        }
        int childCount = getChildCount();
        int i8 = (i7 - i3) / 2;
        int dividerWidth = getDividerWidth();
        int i9 = i5 - i2;
        int paddingRight = (i9 - getPaddingRight()) - getPaddingLeft();
        boolean zRl = ViewUtils.rl(this);
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                if (layoutParams.f14001n) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (N(i12)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zRl) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) layoutParams).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i13 = i8 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i13, width, measuredHeight + i13);
                    paddingRight -= measuredWidth;
                    i10 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) layoutParams).leftMargin) + ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                    N(i12);
                    i11++;
                }
            }
        }
        if (childCount == 1 && i10 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i14 = (i9 / 2) - (measuredWidth2 / 2);
            int i15 = i8 - (measuredHeight2 / 2);
            childAt2.layout(i14, i15, measuredWidth2 + i14, measuredHeight2 + i15);
            return;
        }
        int i16 = i11 - (i10 ^ 1);
        int iMax = Math.max(0, i16 > 0 ? paddingRight / i16 : 0);
        if (zRl) {
            int width2 = getWidth() - getPaddingRight();
            for (int i17 = 0; i17 < childCount; i17++) {
                View childAt3 = getChildAt(i17);
                LayoutParams layoutParams2 = (LayoutParams) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !layoutParams2.f14001n) {
                    int i18 = width2 - ((LinearLayout.LayoutParams) layoutParams2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i19 = i8 - (measuredHeight3 / 2);
                    childAt3.layout(i18 - measuredWidth3, i19, i18, measuredHeight3 + i19);
                    width2 = i18 - ((measuredWidth3 + ((LinearLayout.LayoutParams) layoutParams2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt4 = getChildAt(i20);
            LayoutParams layoutParams3 = (LayoutParams) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !layoutParams3.f14001n) {
                int i21 = paddingLeft2 + ((LinearLayout.LayoutParams) layoutParams3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i22 = i8 - (measuredHeight4 / 2);
                childAt4.layout(i21, i22, i21 + measuredWidth4, measuredHeight4 + i22);
                paddingLeft2 = i21 + measuredWidth4 + ((LinearLayout.LayoutParams) layoutParams3).rightMargin + iMax;
            }
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    protected void onMeasure(int i2, int i3) {
        MenuBuilder menuBuilder;
        boolean z2 = this.f13995FX;
        boolean z3 = View.MeasureSpec.getMode(i2) == 1073741824;
        this.f13995FX = z3;
        if (z2 != z3) {
            this.f13992B = 0;
        }
        int size = View.MeasureSpec.getSize(i2);
        if (this.f13995FX && (menuBuilder = this.f13998U) != null && size != this.f13992B) {
            this.f13992B = size;
            menuBuilder.rV9(true);
        }
        int childCount = getChildCount();
        if (this.f13995FX && childCount > 0) {
            bzg(i2, i3);
            return;
        }
        for (int i5 = 0; i5 < childCount; i5++) {
            LayoutParams layoutParams = (LayoutParams) getChildAt(i5).getLayoutParams();
            ((LinearLayout.LayoutParams) layoutParams).rightMargin = 0;
            ((LinearLayout.LayoutParams) layoutParams).leftMargin = 0;
        }
        super.onMeasure(i2, i3);
    }

    public boolean s7N() {
        ActionMenuPresenter actionMenuPresenter = this.eF;
        return actionMenuPresenter != null && actionMenuPresenter.X();
    }

    @RestrictTo
    public void setExpandedActionViewsExclusive(boolean z2) {
        this.eF.nHg(z2);
    }

    public void setOnMenuItemClickListener(OnMenuItemClickListener onMenuItemClickListener) {
        this.f13999a = onMenuItemClickListener;
    }

    @RestrictTo
    public void setOverflowReserved(boolean z2) {
        this.p5 = z2;
    }

    public void setPopupTheme(@StyleRes int i2) {
        if (this.M7 != i2) {
            this.M7 = i2;
            if (i2 == 0) {
                this.P5 = getContext();
            } else {
                this.P5 = new ContextThemeWrapper(getContext(), i2);
            }
        }
    }

    @RestrictTo
    public void setPresenter(ActionMenuPresenter actionMenuPresenter) {
        this.eF = actionMenuPresenter;
        actionMenuPresenter.s7N(this);
    }

    public boolean v() {
        return this.p5;
    }

    public boolean wTp() {
        ActionMenuPresenter actionMenuPresenter = this.eF;
        return actionMenuPresenter != null && actionMenuPresenter.T();
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    static int rV9(View view, int i2, int i3, int i5, int i7) {
        ActionMenuItemView actionMenuItemView;
        boolean z2;
        int i8;
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i5) - i7, View.MeasureSpec.getMode(i5));
        if (view instanceof ActionMenuItemView) {
            actionMenuItemView = (ActionMenuItemView) view;
        } else {
            actionMenuItemView = null;
        }
        boolean z3 = false;
        if (actionMenuItemView != null && actionMenuItemView.o()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (i3 > 0) {
            i8 = 2;
            if (!z2 || i3 >= 2) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i3 * i2, Integer.MIN_VALUE), iMakeMeasureSpec);
                int measuredWidth = view.getMeasuredWidth();
                int i9 = measuredWidth / i2;
                if (measuredWidth % i2 != 0) {
                    i9++;
                }
                if (!z2 || i9 >= 2) {
                    i8 = i9;
                }
            } else {
                i8 = 0;
            }
        }
        if (!layoutParams.f14001n && z2) {
            z3 = true;
        }
        layoutParams.nr = z3;
        layoutParams.rl = i8;
        view.measure(View.MeasureSpec.makeMeasureSpec(i2 * i8, 1073741824), iMakeMeasureSpec);
        return i8;
    }

    public LayoutParams T() {
        LayoutParams layoutParamsGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        layoutParamsGenerateDefaultLayoutParams.f14001n = true;
        return layoutParamsGenerateDefaultLayoutParams;
    }

    @Nullable
    public Drawable getOverflowIcon() {
        getMenu();
        return this.eF.fD();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        ActionMenuPresenter actionMenuPresenter = this.eF;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.KN(false);
            if (this.eF.T()) {
                this.eF.E2();
                this.eF.rV9();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        fD();
    }

    public void setOverflowIcon(@Nullable Drawable drawable) {
        getMenu();
        this.eF.wTp(drawable);
    }
}
