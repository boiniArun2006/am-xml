package com.google.android.material.button;

import Rxk.C;
import Rxk.n;
import Rxk.o;
import X4.w6;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatButton;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.TextViewCompat;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.internal.eO;
import com.google.android.material.internal.l3D;
import java.util.Iterator;
import java.util.LinkedHashSet;
import mfo.Pl;
import mfo.fuX;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class MaterialButton extends AppCompatButton implements Checkable, Pl {
    private Drawable E2;
    private final com.google.android.material.button.j J2;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private int f58739N;
    private int P5;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private PorterDuff.Mode f58740S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private int f58741T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private boolean f58742U;
    private int Xw;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f58743e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ColorStateList f58744g;
    private boolean jB;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private j f58745o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final LinkedHashSet f58746r;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f58747v;
    private static final int[] M7 = {R.attr.state_checkable};
    private static final int[] p5 = {R.attr.state_checked};
    private static final int eF = C.f8728r;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new j();

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        boolean f58748O;

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

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            rl(parcel);
        }

        private void rl(Parcel parcel) {
            boolean z2 = true;
            if (parcel.readInt() != 1) {
                z2 = false;
            }
            this.f58748O = z2;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f58748O ? 1 : 0);
        }
    }

    interface j {
        void n(MaterialButton materialButton, boolean z2);
    }

    public MaterialButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, n.WPU);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButton(Context context, AttributeSet attributeSet, int i2) {
        int i3 = eF;
        super(scw.j.t(context, attributeSet, i2, i3), attributeSet, i2);
        this.f58746r = new LinkedHashSet();
        this.jB = false;
        this.f58742U = false;
        Context context2 = getContext();
        TypedArray typedArrayXMQ = eO.xMQ(context2, attributeSet, o.Of6, i2, i3, new int[0]);
        this.Xw = typedArrayXMQ.getDimensionPixelSize(o.pr, 0);
        this.f58740S = l3D.KN(typedArrayXMQ.getInt(o.Vd, -1), PorterDuff.Mode.SRC_IN);
        this.f58744g = w6.n(getContext(), typedArrayXMQ, o.GT);
        this.E2 = w6.nr(getContext(), typedArrayXMQ, o.poH);
        this.P5 = typedArrayXMQ.getInteger(o.W1c, 1);
        this.f58741T = typedArrayXMQ.getDimensionPixelSize(o.ni, 0);
        com.google.android.material.button.j jVar = new com.google.android.material.button.j(this, mfo.C.O(context2, attributeSet, i2, i3).az());
        this.J2 = jVar;
        jVar.r(typedArrayXMQ);
        typedArrayXMQ.recycle();
        setCompoundDrawablePadding(this.Xw);
        xMQ(this.E2 != null);
    }

    private boolean O() {
        int i2 = this.P5;
        return i2 == 16 || i2 == 32;
    }

    private boolean Uo() {
        com.google.android.material.button.j jVar = this.J2;
        return (jVar == null || jVar.HI()) ? false : true;
    }

    private void mUb(int i2, int i3) {
        if (this.E2 == null || getLayout() == null) {
            return;
        }
        if (!nr() && !t()) {
            if (O()) {
                this.f58739N = 0;
                if (this.P5 == 16) {
                    this.f58747v = 0;
                    xMQ(false);
                    return;
                }
                int intrinsicHeight = this.f58741T;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.E2.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i3 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.Xw) - getPaddingBottom()) / 2);
                if (this.f58747v != iMax) {
                    this.f58747v = iMax;
                    xMQ(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f58747v = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i5 = this.P5;
        if (i5 == 1 || i5 == 3 || ((i5 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i5 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f58739N = 0;
            xMQ(false);
            return;
        }
        int intrinsicWidth = this.f58741T;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.E2.getIntrinsicWidth();
        }
        int textLayoutWidth = ((((i2 - getTextLayoutWidth()) - ViewCompat.fD(this)) - intrinsicWidth) - this.Xw) - ViewCompat.E2(this);
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        if (J2() != (this.P5 == 4)) {
            textLayoutWidth = -textLayoutWidth;
        }
        if (this.f58739N != textLayoutWidth) {
            this.f58739N = textLayoutWidth;
            xMQ(false);
        }
    }

    private boolean nr() {
        int i2 = this.P5;
        return i2 == 1 || i2 == 2;
    }

    private boolean t() {
        int i2 = this.P5;
        return i2 == 3 || i2 == 4;
    }

    private void xMQ(boolean z2) {
        Drawable drawable = this.E2;
        if (drawable != null) {
            Drawable drawableMutate = DrawableCompat.r(drawable).mutate();
            this.E2 = drawableMutate;
            DrawableCompat.HI(drawableMutate, this.f58744g);
            PorterDuff.Mode mode = this.f58740S;
            if (mode != null) {
                DrawableCompat.ck(this.E2, mode);
            }
            int intrinsicWidth = this.f58741T;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.E2.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f58741T;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.E2.getIntrinsicHeight();
            }
            Drawable drawable2 = this.E2;
            int i2 = this.f58739N;
            int i3 = this.f58747v;
            drawable2.setBounds(i2, i3, intrinsicWidth + i2, intrinsicHeight + i3);
            this.E2.setVisible(true, z2);
        }
        if (z2) {
            KN();
            return;
        }
        Drawable[] drawableArrN = TextViewCompat.n(this);
        Drawable drawable3 = drawableArrN[0];
        Drawable drawable4 = drawableArrN[1];
        Drawable drawable5 = drawableArrN[2];
        if ((!nr() || drawable3 == this.E2) && ((!t() || drawable5 == this.E2) && (!O() || drawable4 == this.E2))) {
            return;
        }
        KN();
    }

    @NonNull
    String getA11yClassName() {
        if (TextUtils.isEmpty(this.f58743e)) {
            return (rl() ? CompoundButton.class : Button.class).getName();
        }
        return this.f58743e;
    }

    public Drawable getIcon() {
        return this.E2;
    }

    public int getIconGravity() {
        return this.P5;
    }

    @Px
    public int getIconPadding() {
        return this.Xw;
    }

    @Px
    public int getIconSize() {
        return this.f58741T;
    }

    public ColorStateList getIconTint() {
        return this.f58744g;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f58740S;
    }

    @Dimension
    public int getInsetBottom() {
        return this.J2.t();
    }

    @Dimension
    public int getInsetTop() {
        return this.J2.nr();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.jB;
    }

    @Override // android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (rl()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, M7);
        }
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, p5);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.n());
        setChecked(savedState.f58748O);
    }

    @Override // android.view.View
    public boolean performClick() {
        if (this.J2.Ik()) {
            toggle();
        }
        return super.performClick();
    }

    public boolean rl() {
        com.google.android.material.button.j jVar = this.J2;
        return jVar != null && jVar.ck();
    }

    void setA11yClassName(@Nullable String str) {
        this.f58743e = str;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(@DrawableRes int i2) {
        setBackgroundDrawable(i2 != 0 ? AppCompatResources.rl(getContext(), i2) : null);
    }

    public void setIcon(@Nullable Drawable drawable) {
        if (this.E2 != drawable) {
            this.E2 = drawable;
            xMQ(true);
            mUb(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i2) {
        if (this.P5 != i2) {
            this.P5 = i2;
            mUb(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(@Px int i2) {
        if (this.Xw != i2) {
            this.Xw = i2;
            setCompoundDrawablePadding(i2);
        }
    }

    public void setIconResource(@DrawableRes int i2) {
        setIcon(i2 != 0 ? AppCompatResources.rl(getContext(), i2) : null);
    }

    public void setIconSize(@Px int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f58741T != i2) {
            this.f58741T = i2;
            xMQ(true);
        }
    }

    public void setIconTint(@Nullable ColorStateList colorStateList) {
        if (this.f58744g != colorStateList) {
            this.f58744g = colorStateList;
            xMQ(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f58740S != mode) {
            this.f58740S = mode;
            xMQ(false);
        }
    }

    public void setInsetBottom(@Dimension int i2) {
        this.J2.WPU(i2);
    }

    public void setInsetTop(@Dimension int i2) {
        this.J2.aYN(i2);
    }

    void setOnPressedChangeListenerInternal(@Nullable j jVar) {
        this.f58745o = jVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z2) {
        j jVar = this.f58745o;
        if (jVar != null) {
            jVar.n(this, z2);
        }
        super.setPressed(z2);
    }

    public void setToggleCheckedStateOnClick(boolean z2) {
        this.J2.e(z2);
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.jB);
    }

    private boolean J2() {
        if (ViewCompat.nY(this) == 1) {
            return true;
        }
        return false;
    }

    private void KN() {
        if (nr()) {
            TextViewCompat.gh(this, this.E2, null, null, null);
        } else if (t()) {
            TextViewCompat.gh(this, null, null, this.E2, null);
        } else if (O()) {
            TextViewCompat.gh(this, null, this.E2, null, null);
        }
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment != 1) {
            if (textAlignment != 6 && textAlignment != 3) {
                if (textAlignment != 4) {
                    return Layout.Alignment.ALIGN_NORMAL;
                }
                return Layout.Alignment.ALIGN_CENTER;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        if (gravity != 1) {
            if (gravity != 5 && gravity != 8388613) {
                return Layout.Alignment.ALIGN_NORMAL;
            }
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i2 = 0; i2 < lineCount; i2++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i2));
        }
        return (int) Math.ceil(fMax);
    }

    @Override // android.view.View
    @Nullable
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    @Nullable
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    @Px
    public int getCornerRadius() {
        if (Uo()) {
            return this.J2.rl();
        }
        return 0;
    }

    @Nullable
    public ColorStateList getRippleColor() {
        if (Uo()) {
            return this.J2.KN();
        }
        return null;
    }

    @NonNull
    public mfo.C getShapeAppearanceModel() {
        if (Uo()) {
            return this.J2.xMQ();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (Uo()) {
            return this.J2.mUb();
        }
        return null;
    }

    @Px
    public int getStrokeWidth() {
        if (Uo()) {
            return this.J2.gh();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    @Nullable
    @RestrictTo
    public ColorStateList getSupportBackgroundTintList() {
        if (Uo()) {
            return this.J2.qie();
        }
        return super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    @Nullable
    @RestrictTo
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        if (Uo()) {
            return this.J2.az();
        }
        return super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (Uo()) {
            fuX.J2(this, this.J2.J2());
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(rl());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i5, int i7) {
        super.onLayout(z2, i2, i3, i5, i7);
        mUb(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f58748O = this.jB;
        return savedState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i2, int i3, int i5) {
        super.onTextChanged(charSequence, i2, i3, i5);
        mUb(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.E2 != null) {
            if (this.E2.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    @Override // android.view.View
    public void setBackground(@NonNull Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(@ColorInt int i2) {
        if (Uo()) {
            this.J2.o(i2);
        } else {
            super.setBackgroundColor(i2);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(@NonNull Drawable drawable) {
        if (Uo()) {
            if (drawable != getBackground()) {
                Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
                this.J2.Z();
                super.setBackgroundDrawable(drawable);
                return;
            }
            getBackground().setState(drawable.getState());
            return;
        }
        super.setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z2) {
        if (Uo()) {
            this.J2.XQ(z2);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z2) {
        if (rl() && isEnabled() && this.jB != z2) {
            this.jB = z2;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                ((MaterialButtonToggleGroup) getParent()).az(this, this.jB);
            }
            if (!this.f58742U) {
                this.f58742U = true;
                Iterator it = this.f58746r.iterator();
                if (!it.hasNext()) {
                    this.f58742U = false;
                } else {
                    android.support.v4.media.j.n(it.next());
                    throw null;
                }
            }
        }
    }

    public void setCornerRadius(@Px int i2) {
        if (Uo()) {
            this.J2.S(i2);
        }
    }

    public void setCornerRadiusResource(@DimenRes int i2) {
        if (Uo()) {
            setCornerRadius(getResources().getDimensionPixelSize(i2));
        }
    }

    @Override // android.view.View
    @RequiresApi
    public void setElevation(float f3) {
        super.setElevation(f3);
        if (Uo()) {
            this.J2.J2().M7(f3);
        }
    }

    public void setIconTintResource(@ColorRes int i2) {
        setIconTint(AppCompatResources.n(getContext(), i2));
    }

    void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        if (Uo()) {
            this.J2.ViF(colorStateList);
        }
    }

    public void setRippleColorResource(@ColorRes int i2) {
        if (Uo()) {
            setRippleColor(AppCompatResources.n(getContext(), i2));
        }
    }

    @Override // mfo.Pl
    public void setShapeAppearanceModel(@NonNull mfo.C c2) {
        if (Uo()) {
            this.J2.nY(c2);
            return;
        }
        throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
    }

    void setShouldDrawSurfaceColorStroke(boolean z2) {
        if (Uo()) {
            this.J2.g(z2);
        }
    }

    public void setStrokeColor(@Nullable ColorStateList colorStateList) {
        if (Uo()) {
            this.J2.te(colorStateList);
        }
    }

    public void setStrokeColorResource(@ColorRes int i2) {
        if (Uo()) {
            setStrokeColor(AppCompatResources.n(getContext(), i2));
        }
    }

    public void setStrokeWidth(@Px int i2) {
        if (Uo()) {
            this.J2.iF(i2);
        }
    }

    public void setStrokeWidthResource(@DimenRes int i2) {
        if (Uo()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i2));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    @RestrictTo
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        if (Uo()) {
            this.J2.fD(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    @RestrictTo
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        if (Uo()) {
            this.J2.E2(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.view.View
    @RequiresApi
    public void setTextAlignment(int i2) {
        super.setTextAlignment(i2);
        mUb(getMeasuredWidth(), getMeasuredHeight());
    }
}
