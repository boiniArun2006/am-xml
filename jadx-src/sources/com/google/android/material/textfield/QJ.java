package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.TintTypedArray;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityManagerCompat;
import androidx.core.widget.TextViewCompat;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
class QJ extends LinearLayout {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private AccessibilityManagerCompat.TouchExplorationStateChangeListener f59270E;
    private int E2;

    /* JADX INFO: renamed from: FX, reason: collision with root package name */
    private final TextInputLayout.Wre f59271FX;
    private ColorStateList J2;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private final TextWatcher f59272M;
    private boolean M7;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private PorterDuff.Mode f59273N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final CheckableImageButton f59274O;
    private final TextView P5;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final CheckableImageButton f59275S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private ColorStateList f59276T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private CharSequence f59277U;
    private ImageView.ScaleType Xw;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final LinkedHashSet f59278e;
    private final AccessibilityManager eF;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Ml f59279g;
    private View.OnLongClickListener jB;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final TextInputLayout f59280n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private View.OnLongClickListener f59281o;
    private EditText p5;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private PorterDuff.Mode f59282r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final FrameLayout f59283t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f59284v;

    private static class Ml {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final SparseArray f59285n = new SparseArray();
        private final int nr;
        private final QJ rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final int f59286t;

        private l3D rl(int i2) {
            if (i2 == -1) {
                return new CN3(this.rl);
            }
            if (i2 == 0) {
                return new Q(this.rl);
            }
            if (i2 == 1) {
                return new SPz(this.rl, this.nr);
            }
            if (i2 == 2) {
                return new Wre(this.rl);
            }
            if (i2 == 3) {
                return new eO(this.rl);
            }
            throw new IllegalArgumentException("Invalid end icon mode: " + i2);
        }

        l3D t(int i2) {
            l3D l3d = (l3D) this.f59285n.get(i2);
            if (l3d != null) {
                return l3d;
            }
            l3D l3dRl = rl(i2);
            this.f59285n.append(i2, l3dRl);
            return l3dRl;
        }

        Ml(QJ qj, TintTypedArray tintTypedArray) {
            this.rl = qj;
            this.f59286t = tintTypedArray.ty(Rxk.o.D1, 0);
            this.nr = tintTypedArray.ty(Rxk.o.f8827JR, 0);
        }
    }

    class j extends com.google.android.material.internal.Xo {
        j() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            QJ.this.az().n(editable);
        }

        @Override // com.google.android.material.internal.Xo, android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i5) {
            QJ.this.az().rl(charSequence, i2, i3, i5);
        }
    }

    class n implements TextInputLayout.Wre {
        n() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.Wre
        public void n(TextInputLayout textInputLayout) {
            if (QJ.this.p5 == textInputLayout.getEditText()) {
                return;
            }
            if (QJ.this.p5 != null) {
                QJ.this.p5.removeTextChangedListener(QJ.this.f59272M);
                if (QJ.this.p5.getOnFocusChangeListener() == QJ.this.az().O()) {
                    QJ.this.p5.setOnFocusChangeListener(null);
                }
            }
            QJ.this.p5 = textInputLayout.getEditText();
            if (QJ.this.p5 != null) {
                QJ.this.p5.addTextChangedListener(QJ.this.f59272M);
            }
            QJ.this.az().ty(QJ.this.p5);
            QJ qj = QJ.this;
            qj.k(qj.az());
        }
    }

    class w6 implements View.OnAttachStateChangeListener {
        w6() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            QJ.this.Uo();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            QJ.this.v();
        }
    }

    private void Jk() {
        int visibility = this.P5.getVisibility();
        int i2 = (this.f59277U == null || this.M7) ? 8 : 0;
        if (visibility != i2) {
            az().Ik(i2 == 0);
        }
        eWT();
        this.P5.setVisibility(i2);
        this.f59280n.m();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Uo() {
        if (this.f59270E == null || this.eF == null || !ViewCompat.U(this)) {
            return;
        }
        AccessibilityManagerCompat.n(this.eF, this.f59270E);
    }

    private int Z(l3D l3d) {
        int i2 = this.f59279g.f59286t;
        return i2 == 0 ? l3d.nr() : i2;
    }

    private void eWT() {
        this.f59283t.setVisibility((this.f59275S.getVisibility() != 0 || X()) ? 8 : 0);
        setVisibility((e() || X() || ((this.f59277U == null || this.M7) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    private void fD(TintTypedArray tintTypedArray) {
        this.P5.setVisibility(8);
        this.P5.setId(Rxk.Wre.Xw);
        this.P5.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        ViewCompat.pJg(this.P5, 1);
        ofS(tintTypedArray.ty(Rxk.o.G8, 0));
        int i2 = Rxk.o.xY;
        if (tintTypedArray.o(i2)) {
            C(tintTypedArray.t(i2));
        }
        pJg(tintTypedArray.ck(Rxk.o.Ek5));
    }

    private void fcU(boolean z2) {
        if (!z2 || ty() == null) {
            AbstractC1892c.n(this.f59280n, this.f59275S, this.f59276T, this.f59273N);
            return;
        }
        Drawable drawableMutate = DrawableCompat.r(ty()).mutate();
        DrawableCompat.ty(drawableMutate, this.f59280n.getErrorCurrentTextColors());
        this.f59275S.setImageDrawable(drawableMutate);
    }

    private void iF(TintTypedArray tintTypedArray) {
        int i2 = Rxk.o.Rx;
        if (tintTypedArray.o(i2)) {
            this.J2 = X4.w6.rl(getContext(), tintTypedArray, i2);
        }
        int i3 = Rxk.o.cT;
        if (tintTypedArray.o(i3)) {
            this.f59282r = com.google.android.material.internal.l3D.KN(tintTypedArray.gh(i3, -1), null);
        }
        int i5 = Rxk.o.eLq;
        if (tintTypedArray.o(i5)) {
            a(tintTypedArray.Uo(i5));
        }
        this.f59274O.setContentDescription(getResources().getText(Rxk.aC.J2));
        ViewCompat.ul(this.f59274O, 2);
        this.f59274O.setClickable(false);
        this.f59274O.setPressable(false);
        this.f59274O.setFocusable(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(l3D l3d) {
        if (this.p5 == null) {
            return;
        }
        if (l3d.O() != null) {
            this.p5.setOnFocusChangeListener(l3d.O());
        }
        if (l3d.Uo() != null) {
            this.f59275S.setOnFocusChangeListener(l3d.Uo());
        }
    }

    private void mUb(int i2) {
        Iterator it = this.f59278e.iterator();
        if (it.hasNext()) {
            android.support.v4.media.j.n(it.next());
            throw null;
        }
    }

    private void te(TintTypedArray tintTypedArray) {
        int i2 = Rxk.o.f8890yd;
        if (!tintTypedArray.o(i2)) {
            int i3 = Rxk.o.Pc;
            if (tintTypedArray.o(i3)) {
                this.f59276T = X4.w6.rl(getContext(), tintTypedArray, i3);
            }
            int i5 = Rxk.o.yl;
            if (tintTypedArray.o(i5)) {
                this.f59273N = com.google.android.material.internal.l3D.KN(tintTypedArray.gh(i5, -1), null);
            }
        }
        int i7 = Rxk.o.fIU;
        if (tintTypedArray.o(i7)) {
            p5(tintTypedArray.gh(i7, 0));
            int i8 = Rxk.o.cL;
            if (tintTypedArray.o(i8)) {
                jB(tintTypedArray.ck(i8));
            }
            bzg(tintTypedArray.n(Rxk.o.G8P, true));
        } else if (tintTypedArray.o(i2)) {
            int i9 = Rxk.o.z7;
            if (tintTypedArray.o(i9)) {
                this.f59276T = X4.w6.rl(getContext(), tintTypedArray, i9);
            }
            int i10 = Rxk.o.pzT;
            if (tintTypedArray.o(i10)) {
                this.f59273N = com.google.android.material.internal.l3D.KN(tintTypedArray.gh(i10, -1), null);
            }
            p5(tintTypedArray.n(i2, false) ? 1 : 0);
            jB(tintTypedArray.ck(Rxk.o.NU));
        }
        M7(tintTypedArray.J2(Rxk.o.RW, getResources().getDimensionPixelSize(Rxk.Ml.f8749Y)));
        int i11 = Rxk.o.FG8;
        if (tintTypedArray.o(i11)) {
            M(AbstractC1892c.rl(tintTypedArray.gh(i11, -1)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        AccessibilityManager accessibilityManager;
        AccessibilityManagerCompat.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.f59270E;
        if (touchExplorationStateChangeListener == null || (accessibilityManager = this.eF) == null) {
            return;
        }
        AccessibilityManagerCompat.rl(accessibilityManager, touchExplorationStateChangeListener);
    }

    private CheckableImageButton xMQ(ViewGroup viewGroup, LayoutInflater layoutInflater, int i2) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(Rxk.fuX.gh, viewGroup, false);
        checkableImageButton.setId(i2);
        AbstractC1892c.O(checkableImageButton);
        if (X4.w6.KN(getContext())) {
            MarginLayoutParamsCompat.nr((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), 0);
        }
        return checkableImageButton;
    }

    void B(PorterDuff.Mode mode) {
        if (this.f59273N != mode) {
            this.f59273N = mode;
            AbstractC1892c.n(this.f59280n, this.f59275S, this.f59276T, mode);
        }
    }

    void C(ColorStateList colorStateList) {
        this.P5.setTextColor(colorStateList);
    }

    void D(int i2) {
        a(i2 != 0 ? AppCompatResources.rl(getContext(), i2) : null);
        s7N();
    }

    void E(View.OnLongClickListener onLongClickListener) {
        this.jB = onLongClickListener;
        AbstractC1892c.xMQ(this.f59275S, onLongClickListener);
    }

    void FX(ColorStateList colorStateList) {
        if (this.f59276T != colorStateList) {
            this.f59276T = colorStateList;
            AbstractC1892c.n(this.f59280n, this.f59275S, colorStateList, this.f59273N);
        }
    }

    void GR(View.OnLongClickListener onLongClickListener) {
        this.f59281o = onLongClickListener;
        AbstractC1892c.xMQ(this.f59274O, onLongClickListener);
    }

    int HI() {
        return this.f59284v;
    }

    void I(View.OnClickListener onClickListener) {
        AbstractC1892c.KN(this.f59274O, onClickListener, this.f59281o);
    }

    ImageView.ScaleType Ik() {
        return this.Xw;
    }

    void KN() {
        this.f59275S.performClick();
        this.f59275S.jumpDrawablesToCurrentState();
    }

    void M(ImageView.ScaleType scaleType) {
        this.Xw = scaleType;
        AbstractC1892c.mUb(this.f59275S, scaleType);
        AbstractC1892c.mUb(this.f59274O, scaleType);
    }

    void M7(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i2 != this.f59284v) {
            this.f59284v = i2;
            AbstractC1892c.Uo(this.f59275S, i2);
            AbstractC1892c.Uo(this.f59274O, i2);
        }
    }

    void Nxk(ColorStateList colorStateList) {
        if (this.J2 != colorStateList) {
            this.J2 = colorStateList;
            AbstractC1892c.n(this.f59280n, this.f59274O, colorStateList, this.f59282r);
        }
    }

    void P5(Drawable drawable) {
        this.f59275S.setImageDrawable(drawable);
        if (drawable != null) {
            AbstractC1892c.n(this.f59280n, this.f59275S, this.f59276T, this.f59273N);
            nHg();
        }
    }

    Drawable S() {
        return this.f59275S.getDrawable();
    }

    void T(boolean z2) {
        this.M7 = z2;
        Jk();
    }

    void U(int i2) {
        P5(i2 != 0 ? AppCompatResources.rl(getContext(), i2) : null);
    }

    CharSequence WPU() {
        return this.f59277U;
    }

    boolean X() {
        return this.f59274O.getVisibility() == 0;
    }

    CharSequence XQ() {
        return this.f59275S.getContentDescription();
    }

    void Xw(int i2) {
        jB(i2 != 0 ? getResources().getText(i2) : null);
    }

    void Y(PorterDuff.Mode mode) {
        if (this.f59282r != mode) {
            this.f59282r = mode;
            AbstractC1892c.n(this.f59280n, this.f59274O, this.J2, mode);
        }
    }

    void a(Drawable drawable) {
        this.f59274O.setImageDrawable(drawable);
        ul();
        AbstractC1892c.n(this.f59280n, this.f59274O, this.J2, this.f59282r);
    }

    ColorStateList aYN() {
        return this.P5.getTextColors();
    }

    l3D az() {
        return this.f59279g.t(this.E2);
    }

    void bzg(boolean z2) {
        this.f59275S.setCheckable(z2);
    }

    int ck() {
        return this.E2;
    }

    void dR0(int i2) {
        z(i2 != 0 ? getResources().getText(i2) : null);
    }

    boolean e() {
        return this.f59283t.getVisibility() == 0 && this.f59275S.getVisibility() == 0;
    }

    void eF(View.OnClickListener onClickListener) {
        AbstractC1892c.KN(this.f59275S, onClickListener, this.jB);
    }

    void eTf(ColorStateList colorStateList) {
        this.f59276T = colorStateList;
        AbstractC1892c.n(this.f59280n, this.f59275S, colorStateList, this.f59273N);
    }

    boolean g() {
        return this.E2 != 0;
    }

    void ijL(Drawable drawable) {
        this.f59275S.setImageDrawable(drawable);
    }

    void m(boolean z2) {
        if (z2 && this.E2 != 1) {
            p5(1);
        } else {
            if (z2) {
                return;
            }
            p5(0);
        }
    }

    void n1() {
        if (this.f59280n.J2 == null) {
            return;
        }
        ViewCompat.HV(this.P5, getContext().getResources().getDimensionPixelSize(Rxk.Ml.nHg), this.f59280n.J2.getPaddingTop(), (e() || X()) ? 0 : ViewCompat.fD(this.f59280n.J2), this.f59280n.J2.getPaddingBottom());
    }

    void nHg() {
        AbstractC1892c.nr(this.f59280n, this.f59275S, this.f59276T);
    }

    TextView nY() {
        return this.P5;
    }

    Drawable o() {
        return this.f59274O.getDrawable();
    }

    void ofS(int i2) {
        TextViewCompat.Ik(this.P5, i2);
    }

    void p5(int i2) {
        if (this.E2 == i2) {
            return;
        }
        G7(az());
        int i3 = this.E2;
        this.E2 = i2;
        mUb(i3);
        J(i2 != 0);
        l3D l3dAz = az();
        U(Z(l3dAz));
        Xw(l3dAz.t());
        bzg(l3dAz.qie());
        if (!l3dAz.xMQ(this.f59280n.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + this.f59280n.getBoxBackgroundMode() + " is not supported by the end icon mode " + i2);
        }
        Mx(l3dAz);
        eF(l3dAz.J2());
        EditText editText = this.p5;
        if (editText != null) {
            l3dAz.ty(editText);
            k(l3dAz);
        }
        AbstractC1892c.n(this.f59280n, this.f59275S, this.f59276T, this.f59273N);
        wTp(true);
    }

    void piY(int i2) {
        ijL(i2 != 0 ? AppCompatResources.rl(getContext(), i2) : null);
    }

    CharSequence qie() {
        return this.f59275S.getContentDescription();
    }

    CheckableImageButton r() {
        return this.f59275S;
    }

    void rV9(boolean z2) {
        this.f59275S.setActivated(z2);
    }

    void s7N() {
        AbstractC1892c.nr(this.f59280n, this.f59274O, this.J2);
    }

    Drawable ty() {
        return this.f59275S.getDrawable();
    }

    void xg(PorterDuff.Mode mode) {
        this.f59273N = mode;
        AbstractC1892c.n(this.f59280n, this.f59275S, this.f59276T, mode);
    }

    void z(CharSequence charSequence) {
        this.f59275S.setContentDescription(charSequence);
    }

    QJ(TextInputLayout textInputLayout, TintTypedArray tintTypedArray) {
        super(textInputLayout.getContext());
        this.E2 = 0;
        this.f59278e = new LinkedHashSet();
        this.f59272M = new j();
        n nVar = new n();
        this.f59271FX = nVar;
        this.eF = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f59280n = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f59283t = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonXMQ = xMQ(this, layoutInflaterFrom, Rxk.Wre.nHg);
        this.f59274O = checkableImageButtonXMQ;
        CheckableImageButton checkableImageButtonXMQ2 = xMQ(frameLayout, layoutInflaterFrom, Rxk.Wre.f8762N);
        this.f59275S = checkableImageButtonXMQ2;
        this.f59279g = new Ml(this, tintTypedArray);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.P5 = appCompatTextView;
        iF(tintTypedArray);
        te(tintTypedArray);
        fD(tintTypedArray);
        frameLayout.addView(checkableImageButtonXMQ2);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(checkableImageButtonXMQ);
        textInputLayout.xMQ(nVar);
        addOnAttachStateChangeListener(new w6());
    }

    private void G7(l3D l3d) {
        v();
        this.f59270E = null;
        l3d.XQ();
    }

    private void Mx(l3D l3d) {
        l3d.o();
        this.f59270E = l3d.KN();
        Uo();
    }

    private void ul() {
        boolean z2;
        int i2 = 0;
        if (o() != null && this.f59280n.rV9() && this.f59280n.D()) {
            z2 = true;
        } else {
            z2 = false;
        }
        CheckableImageButton checkableImageButton = this.f59274O;
        if (!z2) {
            i2 = 8;
        }
        checkableImageButton.setVisibility(i2);
        eWT();
        n1();
        if (!g()) {
            this.f59280n.m();
        }
    }

    boolean E2() {
        if (g() && this.f59275S.isChecked()) {
            return true;
        }
        return false;
    }

    void J(boolean z2) {
        int i2;
        if (e() != z2) {
            CheckableImageButton checkableImageButton = this.f59275S;
            if (z2) {
                i2 = 0;
            } else {
                i2 = 8;
            }
            checkableImageButton.setVisibility(i2);
            eWT();
            n1();
            this.f59280n.m();
        }
    }

    void N() {
        ul();
        s7N();
        nHg();
        if (az().Z()) {
            fcU(this.f59280n.D());
        }
    }

    int ViF() {
        int measuredWidth;
        if (!e() && !X()) {
            measuredWidth = 0;
        } else {
            measuredWidth = this.f59275S.getMeasuredWidth() + MarginLayoutParamsCompat.rl((ViewGroup.MarginLayoutParams) this.f59275S.getLayoutParams());
        }
        return ViewCompat.fD(this) + ViewCompat.fD(this.P5) + measuredWidth;
    }

    CheckableImageButton gh() {
        if (X()) {
            return this.f59274O;
        }
        if (g() && e()) {
            return this.f59275S;
        }
        return null;
    }

    void jB(CharSequence charSequence) {
        if (qie() != charSequence) {
            this.f59275S.setContentDescription(charSequence);
        }
    }

    void pJg(CharSequence charSequence) {
        CharSequence charSequence2;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        this.f59277U = charSequence2;
        this.P5.setText(charSequence);
        Jk();
    }

    void wTp(boolean z2) {
        boolean z3;
        boolean zIsActivated;
        boolean zIsChecked;
        l3D l3dAz = az();
        boolean z4 = true;
        if (l3dAz.qie() && (zIsChecked = this.f59275S.isChecked()) != l3dAz.az()) {
            this.f59275S.setChecked(!zIsChecked);
            z3 = true;
        } else {
            z3 = false;
        }
        if (l3dAz.mUb() && (zIsActivated = this.f59275S.isActivated()) != l3dAz.gh()) {
            rV9(!zIsActivated);
        } else {
            z4 = z3;
        }
        if (!z2 && !z4) {
            return;
        }
        nHg();
    }
}
