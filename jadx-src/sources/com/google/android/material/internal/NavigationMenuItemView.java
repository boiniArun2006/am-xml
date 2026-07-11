package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.TooltipCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.TextViewCompat;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@RestrictTo
public class NavigationMenuItemView extends I28 implements MenuView.ItemView {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int[] f59000z = {R.attr.state_checked};

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    boolean f59001B;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private final CheckedTextView f59002D;

    /* JADX INFO: renamed from: FX, reason: collision with root package name */
    private boolean f59003FX;

    /* JADX INFO: renamed from: GR, reason: collision with root package name */
    private ColorStateList f59004GR;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private MenuItemImpl f59005I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    boolean f59006J;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private int f59007M;
    private boolean Nxk;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private FrameLayout f59008a;
    private final AccessibilityDelegateCompat dR0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Drawable f59009k;

    class j extends AccessibilityDelegateCompat {
        j() {
        }

        @Override // androidx.core.view.AccessibilityDelegateCompat
        public void Uo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.Uo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.xg(NavigationMenuItemView.this.f59001B);
        }
    }

    public NavigationMenuItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public boolean O() {
        return false;
    }

    public void setIcon(@Nullable Drawable drawable) {
        if (drawable != null) {
            if (this.Nxk) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = DrawableCompat.r(drawable).mutate();
                DrawableCompat.HI(drawable, this.f59004GR);
            }
            int i2 = this.f59007M;
            drawable.setBounds(0, 0, i2, i2);
        } else if (this.f59003FX) {
            if (this.f59009k == null) {
                Drawable drawableJ2 = ResourcesCompat.J2(getResources(), Rxk.I28.gh, getContext().getTheme());
                this.f59009k = drawableJ2;
                if (drawableJ2 != null) {
                    int i3 = this.f59007M;
                    drawableJ2.setBounds(0, 0, i3, i3);
                }
            }
            drawable = this.f59009k;
        }
        TextViewCompat.gh(this.f59002D, drawable, null, null, null);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f59006J = true;
        j jVar = new j();
        this.dR0 = jVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(Rxk.fuX.mUb, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(Rxk.Ml.rl));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(Rxk.Wre.J2);
        this.f59002D = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        ViewCompat.eTf(checkedTextView, jVar);
    }

    private StateListDrawable E2() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(androidx.appcompat.R.attr.nHg, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(f59000z, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    private boolean T() {
        return this.f59005I.getTitle() == null && this.f59005I.getIcon() == null && this.f59005I.getActionView() != null;
    }

    private void setActionView(@Nullable View view) {
        if (view != null) {
            if (this.f59008a == null) {
                this.f59008a = (FrameLayout) ((ViewStub) findViewById(Rxk.Wre.f8763O)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f59008a.removeAllViews();
            this.f59008a.addView(view);
        }
    }

    public void X() {
        FrameLayout frameLayout = this.f59008a;
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        this.f59002D.setCompoundDrawables(null, null, null, null);
    }

    public void e(MenuItemImpl menuItemImpl, boolean z2) {
        this.f59006J = z2;
        t(menuItemImpl, 0);
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public MenuItemImpl getItemData() {
        return this.f59005I;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        MenuItemImpl menuItemImpl = this.f59005I;
        if (menuItemImpl != null && menuItemImpl.isCheckable() && this.f59005I.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f59000z);
        }
        return iArrOnCreateDrawableState;
    }

    public void setIconPadding(int i2) {
        this.f59002D.setCompoundDrawablePadding(i2);
    }

    public void setIconSize(@Dimension int i2) {
        this.f59007M = i2;
    }

    void setIconTintList(ColorStateList colorStateList) {
        this.f59004GR = colorStateList;
        this.Nxk = colorStateList != null;
        MenuItemImpl menuItemImpl = this.f59005I;
        if (menuItemImpl != null) {
            setIcon(menuItemImpl.getIcon());
        }
    }

    public void setMaxLines(int i2) {
        this.f59002D.setMaxLines(i2);
    }

    public void setNeedsEmptyIcon(boolean z2) {
        this.f59003FX = z2;
    }

    public void setTextAppearance(int i2) {
        TextViewCompat.Ik(this.f59002D, i2);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f59002D.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f59002D.setText(charSequence);
    }

    @Override // androidx.appcompat.view.menu.MenuView.ItemView
    public void t(MenuItemImpl menuItemImpl, int i2) {
        this.f59005I = menuItemImpl;
        if (menuItemImpl.getItemId() > 0) {
            setId(menuItemImpl.getItemId());
        }
        setVisibility(menuItemImpl.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            ViewCompat.C(this, E2());
        }
        setCheckable(menuItemImpl.isCheckable());
        setChecked(menuItemImpl.isChecked());
        setEnabled(menuItemImpl.isEnabled());
        setTitle(menuItemImpl.getTitle());
        setIcon(menuItemImpl.getIcon());
        setActionView(menuItemImpl.getActionView());
        setContentDescription(menuItemImpl.getContentDescription());
        TooltipCompat.n(this, menuItemImpl.getTooltipText());
        fD();
    }

    private void fD() {
        if (T()) {
            this.f59002D.setVisibility(8);
            FrameLayout frameLayout = this.f59008a;
            if (frameLayout != null) {
                LinearLayoutCompat.LayoutParams layoutParams = (LinearLayoutCompat.LayoutParams) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) layoutParams).width = -1;
                this.f59008a.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        this.f59002D.setVisibility(0);
        FrameLayout frameLayout2 = this.f59008a;
        if (frameLayout2 != null) {
            LinearLayoutCompat.LayoutParams layoutParams2 = (LinearLayoutCompat.LayoutParams) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) layoutParams2).width = -2;
            this.f59008a.setLayoutParams(layoutParams2);
        }
    }

    public void setCheckable(boolean z2) {
        refreshDrawableState();
        if (this.f59001B != z2) {
            this.f59001B = z2;
            this.dR0.qie(this.f59002D, 2048);
        }
    }

    public void setChecked(boolean z2) {
        int i2;
        refreshDrawableState();
        this.f59002D.setChecked(z2);
        CheckedTextView checkedTextView = this.f59002D;
        Typeface typeface = checkedTextView.getTypeface();
        if (z2 && this.f59006J) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        checkedTextView.setTypeface(typeface, i2);
    }

    public void setHorizontalPadding(int i2) {
        setPadding(i2, getPaddingTop(), i2, getPaddingBottom());
    }
}
