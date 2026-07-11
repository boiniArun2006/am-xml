package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
class ci extends LinearLayout {
    private View.OnLongClickListener E2;
    private final CheckableImageButton J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private CharSequence f59344O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private int f59345S;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f59346e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ImageView.ScaleType f59347g;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final TextInputLayout f59348n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private PorterDuff.Mode f59349o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ColorStateList f59350r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final TextView f59351t;

    private void iF() {
        int i2 = (this.f59344O == null || this.f59346e) ? 8 : 0;
        setVisibility((this.J2.getVisibility() == 0 || i2 == 0) ? 0 : 8);
        this.f59351t.setVisibility(i2);
        this.f59348n.m();
    }

    private void xMQ(TintTypedArray tintTypedArray) {
        this.f59351t.setVisibility(8);
        this.f59351t.setId(Rxk.Wre.bzg);
        this.f59351t.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        ViewCompat.pJg(this.f59351t, 1);
        HI(tintTypedArray.ty(Rxk.o.Xf, 0));
        int i2 = Rxk.o.RE;
        if (tintTypedArray.o(i2)) {
            ck(tintTypedArray.t(i2));
        }
        ty(tintTypedArray.ck(Rxk.o.dt));
    }

    void HI(int i2) {
        TextViewCompat.Ik(this.f59351t, i2);
    }

    void Ik(boolean z2) {
        this.J2.setCheckable(z2);
    }

    Drawable J2() {
        return this.J2.getDrawable();
    }

    ImageView.ScaleType KN() {
        return this.f59347g;
    }

    CharSequence O() {
        return this.J2.getContentDescription();
    }

    void S(View.OnLongClickListener onLongClickListener) {
        this.E2 = onLongClickListener;
        AbstractC1892c.xMQ(this.J2, onLongClickListener);
    }

    int Uo() {
        return this.f59345S;
    }

    void ViF(PorterDuff.Mode mode) {
        if (this.f59349o != mode) {
            this.f59349o = mode;
            AbstractC1892c.n(this.f59348n, this.J2, this.f59350r, mode);
        }
    }

    void WPU(ImageView.ScaleType scaleType) {
        this.f59347g = scaleType;
        AbstractC1892c.mUb(this.J2, scaleType);
    }

    void XQ(View.OnClickListener onClickListener) {
        AbstractC1892c.KN(this.J2, onClickListener, this.E2);
    }

    void Z(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i2 != this.f59345S) {
            this.f59345S = i2;
            AbstractC1892c.Uo(this.J2, i2);
        }
    }

    void aYN(ColorStateList colorStateList) {
        if (this.f59350r != colorStateList) {
            this.f59350r = colorStateList;
            AbstractC1892c.n(this.f59348n, this.J2, colorStateList, this.f59349o);
        }
    }

    void az() {
        AbstractC1892c.nr(this.f59348n, this.J2, this.f59350r);
    }

    void ck(ColorStateList colorStateList) {
        this.f59351t.setTextColor(colorStateList);
    }

    void g(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (this.f59351t.getVisibility() != 0) {
            accessibilityNodeInfoCompat.Uf(this.J2);
        } else {
            accessibilityNodeInfoCompat.EWS(this.f59351t);
            accessibilityNodeInfoCompat.Uf(this.f59351t);
        }
    }

    boolean gh() {
        return this.J2.getVisibility() == 0;
    }

    CharSequence n() {
        return this.f59344O;
    }

    TextView nr() {
        return this.f59351t;
    }

    void o(Drawable drawable) {
        this.J2.setImageDrawable(drawable);
        if (drawable != null) {
            AbstractC1892c.n(this.f59348n, this.J2, this.f59350r, this.f59349o);
            nY(true);
            az();
        } else {
            nY(false);
            XQ(null);
            S(null);
            r(null);
        }
    }

    void qie(boolean z2) {
        this.f59346e = z2;
        iF();
    }

    ColorStateList rl() {
        return this.f59351t.getTextColors();
    }

    void te() {
        EditText editText = this.f59348n.J2;
        if (editText == null) {
            return;
        }
        ViewCompat.HV(this.f59351t, gh() ? 0 : ViewCompat.E2(editText), editText.getCompoundPaddingTop(), getContext().getResources().getDimensionPixelSize(Rxk.Ml.nHg), editText.getCompoundPaddingBottom());
    }

    ci(TextInputLayout textInputLayout, TintTypedArray tintTypedArray) {
        super(textInputLayout.getContext());
        this.f59348n = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(Rxk.fuX.qie, (ViewGroup) this, false);
        this.J2 = checkableImageButton;
        AbstractC1892c.O(checkableImageButton);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.f59351t = appCompatTextView;
        mUb(tintTypedArray);
        xMQ(tintTypedArray);
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    private void mUb(TintTypedArray tintTypedArray) {
        if (X4.w6.KN(getContext())) {
            MarginLayoutParamsCompat.t((ViewGroup.MarginLayoutParams) this.J2.getLayoutParams(), 0);
        }
        XQ(null);
        S(null);
        int i2 = Rxk.o.f8871kG;
        if (tintTypedArray.o(i2)) {
            this.f59350r = X4.w6.rl(getContext(), tintTypedArray, i2);
        }
        int i3 = Rxk.o.Xp;
        if (tintTypedArray.o(i3)) {
            this.f59349o = com.google.android.material.internal.l3D.KN(tintTypedArray.gh(i3, -1), null);
        }
        int i5 = Rxk.o.ch;
        if (tintTypedArray.o(i5)) {
            o(tintTypedArray.Uo(i5));
            int i7 = Rxk.o.Ah;
            if (tintTypedArray.o(i7)) {
                r(tintTypedArray.ck(i7));
            }
            Ik(tintTypedArray.n(Rxk.o.Aq, true));
        }
        Z(tintTypedArray.J2(Rxk.o.ZVR, getResources().getDimensionPixelSize(Rxk.Ml.f8749Y)));
        int i8 = Rxk.o.nMV;
        if (tintTypedArray.o(i8)) {
            WPU(AbstractC1892c.rl(tintTypedArray.gh(i8, -1)));
        }
    }

    void nY(boolean z2) {
        int i2;
        if (gh() != z2) {
            CheckableImageButton checkableImageButton = this.J2;
            if (z2) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            checkableImageButton.setVisibility(i2);
            te();
            iF();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        te();
    }

    void r(CharSequence charSequence) {
        if (O() != charSequence) {
            this.J2.setContentDescription(charSequence);
        }
    }

    int t() {
        int measuredWidth;
        if (gh()) {
            measuredWidth = this.J2.getMeasuredWidth() + MarginLayoutParamsCompat.n((ViewGroup.MarginLayoutParams) this.J2.getLayoutParams());
        } else {
            measuredWidth = 0;
        }
        return ViewCompat.E2(this) + ViewCompat.E2(this.f59351t) + measuredWidth;
    }

    void ty(CharSequence charSequence) {
        CharSequence charSequence2;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        this.f59344O = charSequence2;
        this.f59351t.setText(charSequence);
        iF();
    }
}
