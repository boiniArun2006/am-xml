package com.google.android.material.checkbox;

import Rxk.C;
import Rxk.I28;
import Rxk.Wre;
import Rxk.aC;
import Rxk.n;
import Rxk.o;
import X4.w6;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.AnimatedStateListDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.autofill.AutofillManager;
import android.widget.CompoundButton;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.StringRes;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.widget.CompoundButtonCompat;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat;
import com.google.android.material.drawable.Ml;
import com.google.android.material.internal.eO;
import com.google.android.material.internal.l3D;
import com.safedk.android.analytics.AppLovinBridge;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class MaterialCheckBox extends AppCompatCheckBox {

    /* JADX INFO: renamed from: GR, reason: collision with root package name */
    private static final int f58799GR;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private static final int[][] f58800I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f58802a;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private final Animatable2Compat.AnimationCallback f58803B;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private CharSequence f58804E;
    private boolean E2;

    /* JADX INFO: renamed from: FX, reason: collision with root package name */
    private final AnimatedVectorDrawableCompat f58805FX;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private CompoundButton.OnCheckedChangeListener f58806M;
    private int M7;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private Drawable f58807N;
    private PorterDuff.Mode P5;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private ColorStateList f58808S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private CharSequence f58809T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    ColorStateList f58810U;
    private boolean Xw;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f58811e;
    private boolean eF;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f58812g;
    ColorStateList jB;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final LinkedHashSet f58813o;
    private int[] p5;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final LinkedHashSet f58814r;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Drawable f58815v;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private static final int f58801J = C.XQ;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final int[] f58798D = {n.M7};

    static class SavedState extends View.BaseSavedState {

        @NonNull
        public static final Parcelable.Creator<SavedState> CREATOR = new j();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f58816n;

        class j implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }

            j() {
            }
        }

        /* synthetic */ SavedState(Parcel parcel, j jVar) {
            this(parcel);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private String n() {
            int i2 = this.f58816n;
            return i2 != 1 ? i2 != 2 ? "unchecked" : "indeterminate" : "checked";
        }

        public String toString() {
            return "MaterialCheckBox.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " CheckedState=" + n() + "}";
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f58816n = ((Integer) parcel.readValue(getClass().getClassLoader())).intValue();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeValue(Integer.valueOf(this.f58816n));
        }
    }

    class j extends Animatable2Compat.AnimationCallback {
        j() {
        }

        @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
        public void rl(Drawable drawable) {
            super.rl(drawable);
            ColorStateList colorStateList = MaterialCheckBox.this.jB;
            if (colorStateList != null) {
                DrawableCompat.HI(drawable, colorStateList);
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback
        public void t(Drawable drawable) {
            super.t(drawable);
            MaterialCheckBox materialCheckBox = MaterialCheckBox.this;
            ColorStateList colorStateList = materialCheckBox.jB;
            if (colorStateList != null) {
                DrawableCompat.ty(drawable, colorStateList.getColorForState(materialCheckBox.p5, MaterialCheckBox.this.jB.getDefaultColor()));
            }
        }
    }

    public MaterialCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, n.f8799O);
    }

    private void xMQ() {
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (getCheckedState() == 2) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f58798D);
        }
        if (nr()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f58802a);
        }
        this.p5 = Ml.O(iArrOnCreateDrawableState);
        xMQ();
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(@DrawableRes int i2) {
        setButtonDrawable(AppCompatResources.rl(getContext(), i2));
    }

    static {
        int i2 = n.P5;
        f58802a = new int[]{i2};
        f58800I = new int[][]{new int[]{R.attr.state_enabled, i2}, new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};
        f58799GR = Resources.getSystem().getIdentifier("btn_check_material_anim", "drawable", AppLovinBridge.f61290h);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialCheckBox(Context context, AttributeSet attributeSet, int i2) {
        int i3 = f58801J;
        super(scw.j.t(context, attributeSet, i2, i3), attributeSet, i2);
        this.f58814r = new LinkedHashSet();
        this.f58813o = new LinkedHashSet();
        this.f58805FX = AnimatedVectorDrawableCompat.n(getContext(), I28.J2);
        this.f58803B = new j();
        Context context2 = getContext();
        this.f58807N = CompoundButtonCompat.n(this);
        this.jB = getSuperButtonTintList();
        setSupportButtonTintList(null);
        TintTypedArray tintTypedArrayMUb = eO.mUb(context2, attributeSet, o.sYH, i2, i3, new int[0]);
        this.f58815v = tintTypedArrayMUb.Uo(o.DtL);
        if (this.f58807N != null && eO.Uo(context2) && t(tintTypedArrayMUb)) {
            super.setButtonDrawable((Drawable) null);
            this.f58807N = AppCompatResources.rl(context2, I28.f8732O);
            this.Xw = true;
            if (this.f58815v == null) {
                this.f58815v = AppCompatResources.rl(context2, I28.Uo);
            }
        }
        this.f58810U = w6.rl(context2, tintTypedArrayMUb, o.Pzf);
        this.P5 = l3D.KN(tintTypedArrayMUb.gh(o.NQ2, -1), PorterDuff.Mode.SRC_IN);
        this.f58812g = tintTypedArrayMUb.n(o.vMk, false);
        this.E2 = tintTypedArrayMUb.n(o.aJ, true);
        this.f58811e = tintTypedArrayMUb.n(o.Rf, false);
        this.f58809T = tintTypedArrayMUb.ck(o.pt);
        int i5 = o.taU;
        if (tintTypedArrayMUb.o(i5)) {
            setCheckedState(tintTypedArrayMUb.gh(i5, 0));
        }
        tintTypedArrayMUb.aYN();
        O();
    }

    private void J2() {
        if (Build.VERSION.SDK_INT < 30 || this.f58804E != null) {
            return;
        }
        super.setStateDescription(getButtonStateDescription());
    }

    private void KN() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Drawable drawable = this.f58807N;
        if (drawable != null && (colorStateList2 = this.jB) != null) {
            DrawableCompat.HI(drawable, colorStateList2);
        }
        Drawable drawable2 = this.f58815v;
        if (drawable2 == null || (colorStateList = this.f58810U) == null) {
            return;
        }
        DrawableCompat.HI(drawable2, colorStateList);
    }

    private void O() {
        this.f58807N = Ml.t(this.f58807N, this.jB, CompoundButtonCompat.t(this));
        this.f58815v = Ml.t(this.f58815v, this.f58810U, this.P5);
        Uo();
        KN();
        super.setButtonDrawable(Ml.n(this.f58807N, this.f58815v));
        refreshDrawableState();
    }

    private void Uo() {
        AnimatedVectorDrawableCompat animatedVectorDrawableCompat;
        if (this.Xw) {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat2 = this.f58805FX;
            if (animatedVectorDrawableCompat2 != null) {
                animatedVectorDrawableCompat2.Uo(this.f58803B);
                this.f58805FX.t(this.f58803B);
            }
            Drawable drawable = this.f58807N;
            if (!(drawable instanceof AnimatedStateListDrawable) || (animatedVectorDrawableCompat = this.f58805FX) == null) {
                return;
            }
            int i2 = Wre.rl;
            int i3 = Wre.jB;
            ((AnimatedStateListDrawable) drawable).addTransition(i2, i3, animatedVectorDrawableCompat, false);
            ((AnimatedStateListDrawable) this.f58807N).addTransition(Wre.KN, i3, this.f58805FX, false);
        }
    }

    @NonNull
    private String getButtonStateDescription() {
        int i2 = this.M7;
        return i2 == 1 ? getResources().getString(aC.gh) : i2 == 0 ? getResources().getString(aC.az) : getResources().getString(aC.qie);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f58808S == null) {
            int[][] iArr = f58800I;
            int[] iArr2 = new int[iArr.length];
            int iNr = W3.j.nr(this, n.KN);
            int iNr2 = W3.j.nr(this, n.mUb);
            int iNr3 = W3.j.nr(this, n.ty);
            int iNr4 = W3.j.nr(this, n.gh);
            iArr2[0] = W3.j.mUb(iNr3, iNr2, 1.0f);
            iArr2[1] = W3.j.mUb(iNr3, iNr, 1.0f);
            iArr2[2] = W3.j.mUb(iNr3, iNr4, 0.54f);
            iArr2[3] = W3.j.mUb(iNr3, iNr4, 0.38f);
            iArr2[4] = W3.j.mUb(iNr3, iNr4, 0.38f);
            this.f58808S = new ColorStateList(iArr, iArr2);
        }
        return this.f58808S;
    }

    @Nullable
    private ColorStateList getSuperButtonTintList() {
        ColorStateList colorStateList = this.jB;
        return colorStateList != null ? colorStateList : super.getButtonTintList() != null ? super.getButtonTintList() : getSupportButtonTintList();
    }

    private boolean t(TintTypedArray tintTypedArray) {
        return tintTypedArray.ty(o.c2, 0) == f58799GR && tintTypedArray.ty(o.eF0, 0) == 0;
    }

    @Override // android.widget.CompoundButton
    @Nullable
    public Drawable getButtonDrawable() {
        return this.f58807N;
    }

    @Nullable
    public Drawable getButtonIconDrawable() {
        return this.f58815v;
    }

    @Nullable
    public ColorStateList getButtonIconTintList() {
        return this.f58810U;
    }

    @NonNull
    public PorterDuff.Mode getButtonIconTintMode() {
        return this.P5;
    }

    @Override // android.widget.CompoundButton
    @Nullable
    public ColorStateList getButtonTintList() {
        return this.jB;
    }

    public int getCheckedState() {
        return this.M7;
    }

    @Nullable
    public CharSequence getErrorAccessibilityLabel() {
        return this.f58809T;
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public boolean isChecked() {
        return this.M7 == 1;
    }

    public boolean nr() {
        return this.f58811e;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        Drawable drawableN;
        if (!this.E2 || !TextUtils.isEmpty(getText()) || (drawableN = CompoundButtonCompat.n(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - drawableN.getIntrinsicWidth()) / 2) * (l3D.Uo(this) ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = drawableN.getBounds();
            DrawableCompat.qie(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setCheckedState(savedState.f58816n);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton
    public void setButtonDrawable(@Nullable Drawable drawable) {
        this.f58807N = drawable;
        this.Xw = false;
        O();
    }

    public void setButtonIconDrawable(@Nullable Drawable drawable) {
        this.f58815v = drawable;
        O();
    }

    public void setButtonIconTintList(@Nullable ColorStateList colorStateList) {
        if (this.f58810U == colorStateList) {
            return;
        }
        this.f58810U = colorStateList;
        O();
    }

    public void setButtonIconTintMode(@NonNull PorterDuff.Mode mode) {
        if (this.P5 == mode) {
            return;
        }
        this.P5 = mode;
        O();
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintList(@Nullable ColorStateList colorStateList) {
        if (this.jB == colorStateList) {
            return;
        }
        this.jB = colorStateList;
        O();
    }

    public void setCenterIfNoTextEnabled(boolean z2) {
        this.E2 = z2;
    }

    public void setCheckedState(int i2) {
        AutofillManager autofillManagerN;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener;
        if (this.M7 != i2) {
            this.M7 = i2;
            super.setChecked(i2 == 1);
            refreshDrawableState();
            J2();
            if (this.eF) {
                return;
            }
            this.eF = true;
            LinkedHashSet linkedHashSet = this.f58813o;
            if (linkedHashSet != null) {
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    android.support.v4.media.j.n(it.next());
                    throw null;
                }
            }
            if (this.M7 != 2 && (onCheckedChangeListener = this.f58806M) != null) {
                onCheckedChangeListener.onCheckedChanged(this, isChecked());
            }
            if (Build.VERSION.SDK_INT >= 26 && (autofillManagerN = androidx.compose.ui.autofill.n.n(getContext().getSystemService(androidx.compose.ui.autofill.j.n()))) != null) {
                autofillManagerN.notifyValueChanged(this);
            }
            this.eF = false;
        }
    }

    public void setErrorAccessibilityLabel(@Nullable CharSequence charSequence) {
        this.f58809T = charSequence;
    }

    public void setErrorAccessibilityLabelResource(@StringRes int i2) {
        setErrorAccessibilityLabel(i2 != 0 ? getResources().getText(i2) : null);
    }

    public void setErrorShown(boolean z2) {
        if (this.f58811e == z2) {
            return;
        }
        this.f58811e = z2;
        refreshDrawableState();
        Iterator it = this.f58814r.iterator();
        if (it.hasNext()) {
            android.support.v4.media.j.n(it.next());
            throw null;
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(@Nullable CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.f58806M = onCheckedChangeListener;
    }

    @Override // android.widget.CompoundButton, android.view.View
    @RequiresApi
    public void setStateDescription(@Nullable CharSequence charSequence) {
        this.f58804E = charSequence;
        if (charSequence == null) {
            J2();
        } else {
            super.setStateDescription(charSequence);
        }
    }

    public void setUseMaterialThemeColors(boolean z2) {
        this.f58812g = z2;
        if (z2) {
            CompoundButtonCompat.nr(this, getMaterialThemeColorsTintList());
        } else {
            CompoundButtonCompat.nr(this, null);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f58812g && this.jB == null && this.f58810U == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (accessibilityNodeInfo != null && nr()) {
            accessibilityNodeInfo.setText(((Object) accessibilityNodeInfo.getText()) + ", " + ((Object) this.f58809T));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f58816n = getCheckedState();
        return savedState;
    }

    public void setButtonIconDrawableResource(@DrawableRes int i2) {
        setButtonIconDrawable(AppCompatResources.rl(getContext(), i2));
    }

    @Override // android.widget.CompoundButton
    public void setButtonTintMode(@Nullable PorterDuff.Mode mode) {
        setSupportButtonTintMode(mode);
        O();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        setCheckedState(z2 ? 1 : 0);
    }

    @Override // android.widget.TextView, android.view.View
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        xMQ();
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        setChecked(!isChecked());
    }
}
