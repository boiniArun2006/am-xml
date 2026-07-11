package com.google.android.material.chip;

import Rxk.C;
import Rxk.aC;
import Rxk.o;
import X4.Ml;
import X4.Wre;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.annotation.AnimatorRes;
import androidx.annotation.BoolRes;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StringRes;
import androidx.annotation.StyleRes;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.customview.widget.ExploreByTouchHelper;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.j;
import com.google.android.material.internal.CN3;
import com.google.android.material.internal.eO;
import com.google.android.material.internal.l3D;
import com.safedk.android.analytics.reporters.b;
import java.util.List;
import mfo.Pl;
import mfo.fuX;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public class Chip extends AppCompatCheckBox implements j.InterfaceC0784j, Pl, Checkable {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private final RectF f58821E;
    private CompoundButton.OnCheckedChangeListener E2;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final Wre f58822M;
    private final w6 M7;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private boolean f58823N;
    private CharSequence P5;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private RippleDrawable f58824S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private boolean f58825T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private int f58826U;
    private boolean Xw;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f58827e;
    private final Rect eF;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private View.OnClickListener f58828g;
    private int jB;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private InsetDrawable f58829o;
    private boolean p5;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private com.google.android.material.chip.j f58830r;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f58831v;

    /* JADX INFO: renamed from: FX, reason: collision with root package name */
    private static final int f58819FX = C.f8727o;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private static final Rect f58817B = new Rect();

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private static final int[] f58820J = {R.attr.state_selected};

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private static final int[] f58818D = {R.attr.state_checkable};

    class j extends Wre {
        @Override // X4.Wre
        public void n(int i2) {
        }

        j() {
        }

        @Override // X4.Wre
        public void rl(Typeface typeface, boolean z2) {
            Chip chip = Chip.this;
            chip.setText(chip.f58830r.n7u() ? Chip.this.f58830r.f() : Chip.this.getText());
            Chip.this.requestLayout();
            Chip.this.invalidate();
        }
    }

    class n extends ViewOutlineProvider {
        n() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (Chip.this.f58830r != null) {
                Chip.this.f58830r.getOutline(outline);
            } else {
                outline.setAlpha(0.0f);
            }
        }
    }

    private class w6 extends ExploreByTouchHelper {
        @Override // androidx.customview.widget.ExploreByTouchHelper
        protected void bzg(int i2, boolean z2) {
            if (i2 == 1) {
                Chip.this.f58831v = z2;
                Chip.this.refreshDrawableState();
            }
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        protected void iF(List list) {
            list.add(0);
            if (Chip.this.ty() && Chip.this.o() && Chip.this.f58828g != null) {
                list.add(1);
            }
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        protected void rV9(int i2, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            if (i2 != 1) {
                accessibilityNodeInfoCompat.fcU("");
                accessibilityNodeInfoCompat.ijL(Chip.f58817B);
                return;
            }
            CharSequence closeIconContentDescription = Chip.this.getCloseIconContentDescription();
            if (closeIconContentDescription != null) {
                accessibilityNodeInfoCompat.fcU(closeIconContentDescription);
            } else {
                CharSequence text = Chip.this.getText();
                accessibilityNodeInfoCompat.fcU(Chip.this.getContext().getString(aC.ty, TextUtils.isEmpty(text) ? "" : text).trim());
            }
            accessibilityNodeInfoCompat.ijL(Chip.this.getCloseIconTouchBoundsInt());
            accessibilityNodeInfoCompat.rl(AccessibilityNodeInfoCompat.AccessibilityActionCompat.xMQ);
            accessibilityNodeInfoCompat.Jk(Chip.this.isEnabled());
        }

        w6(Chip chip) {
            super(chip);
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        protected boolean nHg(int i2, int i3, Bundle bundle) {
            if (i3 != 16) {
                return false;
            }
            if (i2 == 0) {
                return Chip.this.performClick();
            }
            if (i2 == 1) {
                return Chip.this.Z();
            }
            return false;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        protected int te(float f3, float f4) {
            return (Chip.this.ty() && Chip.this.getCloseIconTouchBounds().contains(f3, f4)) ? 1 : 0;
        }

        @Override // androidx.customview.widget.ExploreByTouchHelper
        protected void v(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            accessibilityNodeInfoCompat.xg(Chip.this.r());
            accessibilityNodeInfoCompat.C(Chip.this.isClickable());
            accessibilityNodeInfoCompat.ofS(Chip.this.getAccessibilityClassName());
            accessibilityNodeInfoCompat.Bu(Chip.this.getText());
        }
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, Rxk.n.J2);
    }

    public boolean Z() {
        boolean z2 = false;
        playSoundEffect(0);
        View.OnClickListener onClickListener = this.f58828g;
        if (onClickListener != null) {
            onClickListener.onClick(this);
            z2 = true;
        }
        if (this.p5) {
            this.M7.p5(1, 1);
        }
        return z2;
    }

    public void setCheckedIconVisible(@BoolRes int i2) {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            jVar.g6(i2);
        }
    }

    public void setChipIconVisible(@BoolRes int i2) {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            jVar.H(i2);
        }
    }

    public void setCloseIconVisible(@BoolRes int i2) {
        setCloseIconVisible(getResources().getBoolean(i2));
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i5, int i7) {
        if (i2 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i5 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(i2, i3, i5, i7);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i5, int i7) {
        if (i2 != 0) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (i5 != 0) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesWithIntrinsicBounds(i2, i3, i5, i7);
    }

    @RestrictTo
    public void setInternalOnCheckedChangeListener(@Nullable CN3 cn3) {
    }

    @Override // android.widget.TextView
    public void setLines(int i2) {
        if (i2 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setLines(i2);
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i2) {
        if (i2 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMaxLines(i2);
    }

    @Override // android.widget.TextView
    public void setMinLines(int i2) {
        if (i2 > 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setMinLines(i2);
    }

    public void setTextAppearance(@Nullable Ml ml) {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            jVar.HFS(ml);
        }
        te();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public Chip(Context context, AttributeSet attributeSet, int i2) {
        int i3 = f58819FX;
        super(scw.j.t(context, attributeSet, i2, i3), attributeSet, i2);
        this.eF = new Rect();
        this.f58821E = new RectF();
        this.f58822M = new j();
        Context context2 = getContext();
        iF(attributeSet);
        com.google.android.material.chip.j jVarOfS = com.google.android.material.chip.j.ofS(context2, attributeSet, i2, i3);
        HI(context2, attributeSet, i2);
        setChipDrawable(jVarOfS);
        jVarOfS.M7(ViewCompat.XQ(this));
        TypedArray typedArrayXMQ = eO.xMQ(context2, attributeSet, o.How, i2, i3, new int[0]);
        boolean zHasValue = typedArrayXMQ.hasValue(o.f8881s);
        typedArrayXMQ.recycle();
        this.M7 = new w6(this);
        aYN();
        if (!zHasValue) {
            ck();
        }
        setChecked(this.f58827e);
        setText(jVarOfS.f());
        setEllipsize(jVarOfS.VwL());
        te();
        if (!this.f58830r.n7u()) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        g();
        if (S()) {
            setMinHeight(this.f58826U);
        }
        this.jB = ViewCompat.nY(this);
        super.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: KP.j
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z2) {
                Chip.rl(this.f5302n, compoundButton, z2);
            }
        });
    }

    private void HI(Context context, AttributeSet attributeSet, int i2) {
        TypedArray typedArrayXMQ = eO.xMQ(context, attributeSet, o.How, i2, f58819FX, new int[0]);
        this.Xw = typedArrayXMQ.getBoolean(o.vl, false);
        this.f58826U = (int) Math.ceil(typedArrayXMQ.getDimension(o.HBN, (float) Math.ceil(l3D.t(getContext(), 48))));
        typedArrayXMQ.recycle();
    }

    private void Ik(int i2, int i3, int i5, int i7) {
        this.f58829o = new InsetDrawable((Drawable) this.f58830r, i2, i3, i5, i7);
    }

    private void ViF() {
        if (ZOk.n.f12388n) {
            nY();
            return;
        }
        this.f58830r.lRt(true);
        ViewCompat.C(this, getBackgroundDrawable());
        g();
        az();
    }

    private void WPU(com.google.android.material.chip.j jVar) {
        if (jVar != null) {
            jVar.WH(null);
        }
    }

    private void XQ() {
        if (this.f58829o != null) {
            this.f58829o = null;
            setMinWidth(0);
            setMinHeight((int) getChipMinHeight());
            ViF();
        }
    }

    private void ck() {
        setOutlineProvider(new n());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public RectF getCloseIconTouchBounds() {
        this.f58821E.setEmpty();
        if (ty() && this.f58828g != null) {
            this.f58830r.F(this.f58821E);
        }
        return this.f58821E;
    }

    @Nullable
    private Ml getTextAppearance() {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            return jVar.ub();
        }
        return null;
    }

    private void iF(AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "background") != null) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", b.f62856d, 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        }
    }

    private void nY() {
        this.f58824S = new RippleDrawable(ZOk.n.nr(this.f58830r.p0N()), getBackgroundDrawable(), null);
        this.f58830r.lRt(false);
        ViewCompat.C(this, this.f58824S);
        g();
    }

    public static /* synthetic */ void rl(Chip chip, CompoundButton compoundButton, boolean z2) {
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = chip.E2;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(compoundButton, z2);
        }
    }

    private void setCloseIconHovered(boolean z2) {
        if (this.f58823N != z2) {
            this.f58823N = z2;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z2) {
        if (this.f58825T != z2) {
            this.f58825T = z2;
            refreshDrawableState();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ty() {
        com.google.android.material.chip.j jVar = this.f58830r;
        return (jVar == null || jVar.tUK() == null) ? false : true;
    }

    public boolean S() {
        return this.Xw;
    }

    @Override // android.view.View
    protected boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return !this.p5 ? super.dispatchHoverEvent(motionEvent) : this.M7.S(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.p5) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (!this.M7.WPU(keyEvent) || this.M7.g() == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    @NonNull
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.P5)) {
            return this.P5;
        }
        if (!r()) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        getParent();
        return "android.widget.Button";
    }

    @Nullable
    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f58829o;
        return insetDrawable == null ? this.f58830r : insetDrawable;
    }

    @Nullable
    public Drawable getCheckedIcon() {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            return jVar.qm();
        }
        return null;
    }

    @Nullable
    public ColorStateList getCheckedIconTint() {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            return jVar.mYa();
        }
        return null;
    }

    @Nullable
    public ColorStateList getChipBackgroundColor() {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            return jVar.Org();
        }
        return null;
    }

    public float getChipCornerRadius() {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            return Math.max(0.0f, jVar.HV());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.f58830r;
    }

    public float getChipEndPadding() {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            return jVar.GD();
        }
        return 0.0f;
    }

    @Nullable
    public Drawable getChipIcon() {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            return jVar.Po6();
        }
        return null;
    }

    public float getChipIconSize() {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            return jVar.EWS();
        }
        return 0.0f;
    }

    @Nullable
    public ColorStateList getChipIconTint() {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            return jVar.hRu();
        }
        return null;
    }

    public float getChipMinHeight() {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            return jVar.UhV();
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            return jVar.i();
        }
        return 0.0f;
    }

    @Nullable
    public ColorStateList getChipStrokeColor() {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            return jVar.K();
        }
        return null;
    }

    public float getChipStrokeWidth() {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            return jVar.How();
        }
        return 0.0f;
    }

    @Nullable
    public Drawable getCloseIcon() {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            return jVar.tUK();
        }
        return null;
    }

    @Nullable
    public CharSequence getCloseIconContentDescription() {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            return jVar.ER();
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            return jVar.lLA();
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            return jVar.kSg();
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            return jVar.W();
        }
        return 0.0f;
    }

    @Nullable
    public ColorStateList getCloseIconTint() {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            return jVar.a63();
        }
        return null;
    }

    @Override // android.widget.TextView
    @Nullable
    public TextUtils.TruncateAt getEllipsize() {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            return jVar.VwL();
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(Rect rect) {
        if (this.p5 && (this.M7.g() == 1 || this.M7.aYN() == 1)) {
            rect.set(getCloseIconTouchBoundsInt());
        } else {
            super.getFocusedRect(rect);
        }
    }

    @Nullable
    public G7.Ml getHideMotionSpec() {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            return jVar.mI();
        }
        return null;
    }

    public float getIconEndPadding() {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            return jVar.T3L();
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            return jVar.Bu();
        }
        return 0.0f;
    }

    @Nullable
    public ColorStateList getRippleColor() {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            return jVar.p0N();
        }
        return null;
    }

    @NonNull
    public mfo.C getShapeAppearanceModel() {
        return this.f58830r.g();
    }

    @Nullable
    public G7.Ml getShowMotionSpec() {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            return jVar.Uf();
        }
        return null;
    }

    public float getTextEndPadding() {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            return jVar.Qu();
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            return jVar.HBN();
        }
        return 0.0f;
    }

    @Override // com.google.android.material.chip.j.InterfaceC0784j
    public void n() {
        qie(this.f58826U);
        requestLayout();
        invalidateOutline();
    }

    public boolean o() {
        com.google.android.material.chip.j jVar = this.f58830r;
        return jVar != null && jVar.EF();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 2);
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f58820J);
        }
        if (r()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, f58818D);
        }
        return iArrOnCreateDrawableState;
    }

    public boolean qie(int i2) {
        this.f58826U = i2;
        if (!S()) {
            if (this.f58829o != null) {
                XQ();
            } else {
                ViF();
            }
            return false;
        }
        int iMax = Math.max(0, i2 - this.f58830r.getIntrinsicHeight());
        int iMax2 = Math.max(0, i2 - this.f58830r.getIntrinsicWidth());
        if (iMax2 <= 0 && iMax <= 0) {
            if (this.f58829o != null) {
                XQ();
            } else {
                ViF();
            }
            return false;
        }
        int i3 = iMax2 > 0 ? iMax2 / 2 : 0;
        int i5 = iMax > 0 ? iMax / 2 : 0;
        if (this.f58829o != null) {
            Rect rect = new Rect();
            this.f58829o.getPadding(rect);
            if (rect.top == i5 && rect.bottom == i5 && rect.left == i3 && rect.right == i3) {
                ViF();
                return true;
            }
        }
        if (getMinHeight() != i2) {
            setMinHeight(i2);
        }
        if (getMinWidth() != i2) {
            setMinWidth(i2);
        }
        Ik(i3, i5, i3, i5);
        ViF();
        return true;
    }

    public boolean r() {
        com.google.android.material.chip.j jVar = this.f58830r;
        return jVar != null && jVar.JVN();
    }

    public void setAccessibilityClassName(@Nullable CharSequence charSequence) {
        this.P5 = charSequence;
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundResource(int i2) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(@Nullable ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z2) {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            jVar.v0j(z2);
        }
    }

    public void setCheckableResource(@BoolRes int i2) {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            jVar.o9(i2);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar == null) {
            this.f58827e = z2;
        } else if (jVar.JVN()) {
            super.setChecked(z2);
        }
    }

    public void setCheckedIcon(@Nullable Drawable drawable) {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            jVar.n7b(drawable);
        }
    }

    public void setCheckedIconResource(@DrawableRes int i2) {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            jVar.Aum(i2);
        }
    }

    public void setCheckedIconTint(@Nullable ColorStateList colorStateList) {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            jVar.s(colorStateList);
        }
    }

    public void setCheckedIconTintResource(@ColorRes int i2) {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            jVar.Lp6(i2);
        }
    }

    public void setChipBackgroundColor(@Nullable ColorStateList colorStateList) {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            jVar.jO(colorStateList);
        }
    }

    public void setChipBackgroundColorResource(@ColorRes int i2) {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            jVar.Toy(i2);
        }
    }

    @Deprecated
    public void setChipCornerRadius(float f3) {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            jVar.wKp(f3);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(@DimenRes int i2) {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            jVar.Th(i2);
        }
    }

    public void setChipDrawable(@NonNull com.google.android.material.chip.j jVar) {
        com.google.android.material.chip.j jVar2 = this.f58830r;
        if (jVar2 != jVar) {
            WPU(jVar2);
            this.f58830r = jVar;
            jVar.Om(false);
            mUb(this.f58830r);
            qie(this.f58826U);
        }
    }

    public void setChipEndPadding(float f3) {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            jVar.xzo(f3);
        }
    }

    public void setChipEndPaddingResource(@DimenRes int i2) {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            jVar.XNZ(i2);
        }
    }

    public void setChipIcon(@Nullable Drawable drawable) {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            jVar.lNy(drawable);
        }
    }

    public void setChipIconResource(@DrawableRes int i2) {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            jVar.I9f(i2);
        }
    }

    public void setChipIconSize(float f3) {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            jVar.D76(f3);
        }
    }

    public void setChipIconSizeResource(@DimenRes int i2) {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            jVar.NP(i2);
        }
    }

    public void setChipIconTint(@Nullable ColorStateList colorStateList) {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            jVar.QgZ(colorStateList);
        }
    }

    public void setChipIconTintResource(@ColorRes int i2) {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            jVar.j(i2);
        }
    }

    public void setChipMinHeight(float f3) {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            jVar.LPV(f3);
        }
    }

    public void setChipMinHeightResource(@DimenRes int i2) {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            jVar.rxp(i2);
        }
    }

    public void setChipStartPadding(float f3) {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            jVar.Fp(f3);
        }
    }

    public void setChipStartPaddingResource(@DimenRes int i2) {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            jVar.Ro(i2);
        }
    }

    public void setChipStrokeColor(@Nullable ColorStateList colorStateList) {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            jVar.SR(colorStateList);
        }
    }

    public void setChipStrokeColorResource(@ColorRes int i2) {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            jVar.EN(i2);
        }
    }

    public void setChipStrokeWidth(float f3) {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            jVar.pS(f3);
        }
    }

    public void setChipStrokeWidthResource(@DimenRes int i2) {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            jVar.tEO(i2);
        }
    }

    public void setCloseIcon(@Nullable Drawable drawable) {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            jVar.h(drawable);
        }
        aYN();
    }

    public void setCloseIconContentDescription(@Nullable CharSequence charSequence) {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            jVar.l(charSequence);
        }
    }

    public void setCloseIconEndPadding(float f3) {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            jVar.eo(f3);
        }
    }

    public void setCloseIconEndPaddingResource(@DimenRes int i2) {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            jVar.uQ(i2);
        }
    }

    public void setCloseIconResource(@DrawableRes int i2) {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            jVar.wKY(i2);
        }
        aYN();
    }

    public void setCloseIconSize(float f3) {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            jVar.mx(f3);
        }
    }

    public void setCloseIconSizeResource(@DimenRes int i2) {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            jVar.lS(i2);
        }
    }

    public void setCloseIconStartPadding(float f3) {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            jVar.iV(f3);
        }
    }

    public void setCloseIconStartPaddingResource(@DimenRes int i2) {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            jVar.I4p(i2);
        }
    }

    public void setCloseIconTint(@Nullable ColorStateList colorStateList) {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            jVar.Co(colorStateList);
        }
    }

    public void setCloseIconTintResource(@ColorRes int i2) {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            jVar.q9(i2);
        }
    }

    public void setCloseIconVisible(boolean z2) {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            jVar.A(z2);
        }
        aYN();
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 != null) {
            throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
        }
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.f58830r == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            throw new UnsupportedOperationException("Text within a chip are not allowed to scroll.");
        }
        super.setEllipsize(truncateAt);
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            jVar.oz(truncateAt);
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z2) {
        this.Xw = z2;
        qie(this.f58826U);
    }

    public void setHideMotionSpec(@Nullable G7.Ml ml) {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            jVar.qva(ml);
        }
    }

    public void setHideMotionSpecResource(@AnimatorRes int i2) {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            jVar.d(i2);
        }
    }

    public void setIconEndPadding(float f3) {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            jVar.rT(f3);
        }
    }

    public void setIconEndPaddingResource(@DimenRes int i2) {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            jVar.L(i2);
        }
    }

    public void setIconStartPadding(float f3) {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            jVar.Lu(f3);
        }
    }

    public void setIconStartPaddingResource(@DimenRes int i2) {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            jVar.HE(i2);
        }
    }

    @Override // android.view.View
    public void setLayoutDirection(int i2) {
        if (this.f58830r == null) {
            return;
        }
        super.setLayoutDirection(i2);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(@Nullable CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.E2 = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.f58828g = onClickListener;
        aYN();
    }

    public void setRippleColor(@Nullable ColorStateList colorStateList) {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            jVar.c32(colorStateList);
        }
        if (this.f58830r.X4T()) {
            return;
        }
        nY();
    }

    public void setRippleColorResource(@ColorRes int i2) {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            jVar.l2(i2);
            if (this.f58830r.X4T()) {
                return;
            }
            nY();
        }
    }

    @Override // mfo.Pl
    public void setShapeAppearanceModel(@NonNull mfo.C c2) {
        this.f58830r.setShapeAppearanceModel(c2);
    }

    public void setShowMotionSpec(@Nullable G7.Ml ml) {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            jVar.t1J(ml);
        }
    }

    public void setShowMotionSpecResource(@AnimatorRes int i2) {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            jVar.GH3(i2);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z2) {
        if (!z2) {
            throw new UnsupportedOperationException("Chip does not support multi-line text");
        }
        super.setSingleLine(z2);
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(jVar.n7u() ? null : charSequence, bufferType);
        com.google.android.material.chip.j jVar2 = this.f58830r;
        if (jVar2 != null) {
            jVar2.w(charSequence);
        }
    }

    public void setTextEndPadding(float f3) {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            jVar.Xli(f3);
        }
    }

    public void setTextEndPaddingResource(@DimenRes int i2) {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            jVar.fq(i2);
        }
    }

    public void setTextStartPadding(float f3) {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            jVar.wYi(f3);
        }
    }

    public void setTextStartPaddingResource(@DimenRes int i2) {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            jVar.TVk(i2);
        }
    }

    private void aYN() {
        if (ty() && o() && this.f58828g != null) {
            ViewCompat.eTf(this, this.M7);
            this.p5 = true;
        } else {
            ViewCompat.eTf(this, null);
            this.p5 = false;
        }
    }

    private void az() {
        if (getBackgroundDrawable() == this.f58829o && this.f58830r.getCallback() == null) {
            this.f58830r.setCallback(this.f58829o);
        }
    }

    private void g() {
        com.google.android.material.chip.j jVar;
        if (!TextUtils.isEmpty(getText()) && (jVar = this.f58830r) != null) {
            int iGD = (int) (jVar.GD() + this.f58830r.Qu() + this.f58830r.ijL());
            int i2 = (int) (this.f58830r.i() + this.f58830r.HBN() + this.f58830r.k());
            if (this.f58829o != null) {
                Rect rect = new Rect();
                this.f58829o.getPadding(rect);
                i2 += rect.left;
                iGD += rect.right;
            }
            ViewCompat.HV(this, i2, getPaddingTop(), iGD, getPaddingBottom());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        this.eF.set((int) closeIconTouchBounds.left, (int) closeIconTouchBounds.top, (int) closeIconTouchBounds.right, (int) closeIconTouchBounds.bottom);
        return this.eF;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    private int[] gh() {
        ?? IsEnabled = isEnabled();
        int i2 = IsEnabled;
        if (this.f58831v) {
            i2 = IsEnabled + 1;
        }
        int i3 = i2;
        if (this.f58823N) {
            i3 = i2 + 1;
        }
        int i5 = i3;
        if (this.f58825T) {
            i5 = i3 + 1;
        }
        int i7 = i5;
        if (isChecked()) {
            i7 = i5 + 1;
        }
        int[] iArr = new int[i7];
        int i8 = 0;
        if (isEnabled()) {
            iArr[0] = 16842910;
            i8 = 1;
        }
        if (this.f58831v) {
            iArr[i8] = 16842908;
            i8++;
        }
        if (this.f58823N) {
            iArr[i8] = 16843623;
            i8++;
        }
        if (this.f58825T) {
            iArr[i8] = 16842919;
            i8++;
        }
        if (isChecked()) {
            iArr[i8] = 16842913;
        }
        return iArr;
    }

    private void mUb(com.google.android.material.chip.j jVar) {
        jVar.WH(this);
    }

    private void te() {
        TextPaint paint = getPaint();
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            paint.drawableState = jVar.getState();
        }
        Ml textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.ty(getContext(), paint, this.f58822M);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        boolean zBZm;
        super.drawableStateChanged();
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null && jVar.xVH()) {
            zBZm = this.f58830r.bZm(gh());
        } else {
            zBZm = false;
        }
        if (zBZm) {
            invalidate();
        }
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        fuX.J2(this, this.f58830r);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onFocusChanged(boolean z2, int i2, Rect rect) {
        super.onFocusChanged(z2, i2, rect);
        if (this.p5) {
            this.M7.N(z2, i2, rect);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10) {
                setCloseIconHovered(false);
            }
        } else {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        accessibilityNodeInfo.setCheckable(r());
        accessibilityNodeInfo.setClickable(isClickable());
        getParent();
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i2) {
        if (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) {
            return PointerIcon.getSystemIcon(getContext(), 1002);
        }
        return super.onResolvePointerIcon(motionEvent, i2);
    }

    @Override // android.widget.TextView, android.view.View
    public void onRtlPropertiesChanged(int i2) {
        super.onRtlPropertiesChanged(i2);
        if (this.jB != i2) {
            this.jB = i2;
            g();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r0 != 3) goto L22;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        boolean zContains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.f58825T) {
                        if (!zContains) {
                            setCloseIconPressed(false);
                        }
                        z2 = true;
                    }
                }
                z2 = false;
            } else {
                if (this.f58825T) {
                    Z();
                    z2 = true;
                }
                setCloseIconPressed(false);
            }
            z2 = false;
            setCloseIconPressed(false);
        } else {
            if (zContains) {
                setCloseIconPressed(true);
                z2 = true;
            }
            z2 = false;
        }
        if (z2 || super.onTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.f58824S) {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        } else {
            super.setBackground(drawable);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatCheckBox, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable != getBackgroundDrawable() && drawable != this.f58824S) {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        } else {
            super.setBackgroundDrawable(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z2) {
        setCheckedIconVisible(z2);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(@BoolRes int i2) {
        setCheckedIconVisible(i2);
    }

    public void setCheckedIconVisible(boolean z2) {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            jVar.Mh(z2);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z2) {
        setChipIconVisible(z2);
    }

    @Deprecated
    public void setChipIconEnabledResource(@BoolRes int i2) {
        setChipIconVisible(i2);
    }

    public void setChipIconVisible(boolean z2) {
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            jVar.waP(z2);
        }
    }

    @Deprecated
    public void setChipText(@Nullable CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(@StringRes int i2) {
        setText(getResources().getString(i2));
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z2) {
        setCloseIconVisible(z2);
    }

    @Deprecated
    public void setCloseIconEnabledResource(@BoolRes int i2) {
        setCloseIconVisible(i2);
    }

    @Override // android.view.View
    @RequiresApi
    public void setElevation(float f3) {
        super.setElevation(f3);
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            jVar.M7(f3);
        }
    }

    @Override // android.widget.TextView
    public void setGravity(int i2) {
        if (i2 != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i2);
        }
    }

    @Override // android.widget.TextView
    public void setMaxWidth(@Px int i2) {
        super.setMaxWidth(i2);
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            jVar.fW(i2);
        }
    }

    public void setTextAppearanceResource(@StyleRes int i2) {
        setTextAppearance(getContext(), i2);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i2, float f3) {
        super.setTextSize(i2, f3);
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            jVar.C7B(TypedValue.applyDimension(i2, f3, getResources().getDisplayMetrics()));
        }
        te();
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set start drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set end drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            throw new UnsupportedOperationException("Please set left drawable using R.attr#chipIcon.");
        }
        if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
            return;
        }
        throw new UnsupportedOperationException("Please set right drawable using R.attr#closeIcon.");
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            jVar.eb(i2);
        }
        te();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i2) {
        super.setTextAppearance(i2);
        com.google.android.material.chip.j jVar = this.f58830r;
        if (jVar != null) {
            jVar.eb(i2);
        }
        te();
    }
}
