package com.google.android.material.button;

import Rxk.n;
import Rxk.o;
import X4.w6;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.internal.l3D;
import mfo.C;
import mfo.CN3;
import mfo.Pl;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
class j {
    private boolean Ik;
    private int J2;
    private int KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f58764O;
    private int Uo;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private int f58765Z;
    private Drawable az;
    private ColorStateList gh;
    private ColorStateList mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final MaterialButton f58766n;
    private int nr;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private LayerDrawable f58767o;
    private ColorStateList qie;
    private C rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f58769t;
    private PorterDuff.Mode xMQ;
    private static final boolean XQ = true;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private static final boolean f58763S = false;
    private boolean ty = false;
    private boolean HI = false;
    private boolean ck = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f58768r = true;

    private Drawable n() {
        CN3 cn3 = new CN3(this.rl);
        cn3.nHg(this.f58766n.getContext());
        DrawableCompat.HI(cn3, this.mUb);
        PorterDuff.Mode mode = this.xMQ;
        if (mode != null) {
            DrawableCompat.ck(cn3, mode);
        }
        cn3.B(this.KN, this.gh);
        CN3 cn32 = new CN3(this.rl);
        cn32.setTint(0);
        cn32.FX(this.KN, this.ty ? W3.j.nr(this.f58766n, n.ty) : 0);
        if (XQ) {
            CN3 cn33 = new CN3(this.rl);
            this.az = cn33;
            DrawableCompat.ty(cn33, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(ZOk.n.nr(this.qie), s7N(new LayerDrawable(new Drawable[]{cn32, cn3})), this.az);
            this.f58767o = rippleDrawable;
            return rippleDrawable;
        }
        ZOk.j jVar = new ZOk.j(this.rl);
        this.az = jVar;
        DrawableCompat.HI(jVar, ZOk.n.nr(this.qie));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{cn32, cn3, this.az});
        this.f58767o = layerDrawable;
        return s7N(layerDrawable);
    }

    private CN3 ty() {
        return Uo(true);
    }

    CN3 J2() {
        return Uo(false);
    }

    void Z() {
        this.HI = true;
        this.f58766n.setSupportBackgroundTintList(this.mUb);
        this.f58766n.setSupportBackgroundTintMode(this.xMQ);
    }

    private void N(C c2) {
        if (f58763S && !this.HI) {
            int iE2 = ViewCompat.E2(this.f58766n);
            int paddingTop = this.f58766n.getPaddingTop();
            int iFD = ViewCompat.fD(this.f58766n);
            int paddingBottom = this.f58766n.getPaddingBottom();
            T();
            ViewCompat.HV(this.f58766n, iE2, paddingTop, iFD, paddingBottom);
            return;
        }
        if (J2() != null) {
            J2().setShapeAppearanceModel(c2);
        }
        if (ty() != null) {
            ty().setShapeAppearanceModel(c2);
        }
        if (O() != null) {
            O().setShapeAppearanceModel(c2);
        }
    }

    private void T() {
        this.f58766n.setInternalBackground(n());
        CN3 cn3J2 = J2();
        if (cn3J2 != null) {
            cn3J2.M7(this.f58765Z);
            cn3J2.setState(this.f58766n.getDrawableState());
        }
    }

    private CN3 Uo(boolean z2) {
        LayerDrawable layerDrawable = this.f58767o;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return XQ ? (CN3) ((LayerDrawable) ((InsetDrawable) this.f58767o.getDrawable(0)).getDrawable()).getDrawable(!z2 ? 1 : 0) : (CN3) this.f58767o.getDrawable(!z2 ? 1 : 0);
    }

    private void X(int i2, int i3) {
        int iE2 = ViewCompat.E2(this.f58766n);
        int paddingTop = this.f58766n.getPaddingTop();
        int iFD = ViewCompat.fD(this.f58766n);
        int paddingBottom = this.f58766n.getPaddingBottom();
        int i5 = this.f58764O;
        int i7 = this.J2;
        this.J2 = i3;
        this.f58764O = i2;
        if (!this.HI) {
            T();
        }
        ViewCompat.HV(this.f58766n, iE2, (paddingTop + i2) - i5, iFD, (paddingBottom + i3) - i7);
    }

    private InsetDrawable s7N(Drawable drawable) {
        return new InsetDrawable(drawable, this.f58769t, this.f58764O, this.nr, this.J2);
    }

    void E2(PorterDuff.Mode mode) {
        if (this.xMQ != mode) {
            this.xMQ = mode;
            if (J2() == null || this.xMQ == null) {
                return;
            }
            DrawableCompat.ck(J2(), this.xMQ);
        }
    }

    boolean HI() {
        return this.HI;
    }

    boolean Ik() {
        return this.f58768r;
    }

    ColorStateList KN() {
        return this.qie;
    }

    public Pl O() {
        LayerDrawable layerDrawable = this.f58767o;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return this.f58767o.getNumberOfLayers() > 2 ? (Pl) this.f58767o.getDrawable(2) : (Pl) this.f58767o.getDrawable(1);
    }

    void S(int i2) {
        if (this.ck && this.Uo == i2) {
            return;
        }
        this.Uo = i2;
        this.ck = true;
        nY(this.rl.WPU(i2));
    }

    void ViF(ColorStateList colorStateList) {
        if (this.qie != colorStateList) {
            this.qie = colorStateList;
            boolean z2 = XQ;
            if (z2 && (this.f58766n.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f58766n.getBackground()).setColor(ZOk.n.nr(colorStateList));
            } else {
                if (z2 || !(this.f58766n.getBackground() instanceof ZOk.j)) {
                    return;
                }
                ((ZOk.j) this.f58766n.getBackground()).setTintList(ZOk.n.nr(colorStateList));
            }
        }
    }

    public void WPU(int i2) {
        X(this.f58764O, i2);
    }

    void XQ(boolean z2) {
        this.Ik = z2;
    }

    public void aYN(int i2) {
        X(i2, this.J2);
    }

    PorterDuff.Mode az() {
        return this.xMQ;
    }

    boolean ck() {
        return this.Ik;
    }

    void e(boolean z2) {
        this.f58768r = z2;
    }

    void fD(ColorStateList colorStateList) {
        if (this.mUb != colorStateList) {
            this.mUb = colorStateList;
            if (J2() != null) {
                DrawableCompat.HI(J2(), this.mUb);
            }
        }
    }

    void g(boolean z2) {
        this.ty = z2;
        nHg();
    }

    int gh() {
        return this.KN;
    }

    void iF(int i2) {
        if (this.KN != i2) {
            this.KN = i2;
            nHg();
        }
    }

    ColorStateList mUb() {
        return this.gh;
    }

    void nY(C c2) {
        this.rl = c2;
        N(c2);
    }

    public int nr() {
        return this.f58764O;
    }

    ColorStateList qie() {
        return this.mUb;
    }

    void r(TypedArray typedArray) {
        this.f58769t = typedArray.getDimensionPixelOffset(o.iu, 0);
        this.nr = typedArray.getDimensionPixelOffset(o.Qg8, 0);
        this.f58764O = typedArray.getDimensionPixelOffset(o.tdZ, 0);
        this.J2 = typedArray.getDimensionPixelOffset(o.GRh, 0);
        int i2 = o.NC9;
        if (typedArray.hasValue(i2)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(i2, -1);
            this.Uo = dimensionPixelSize;
            nY(this.rl.WPU(dimensionPixelSize));
            this.ck = true;
        }
        this.KN = typedArray.getDimensionPixelSize(o.ZwA, 0);
        this.xMQ = l3D.KN(typedArray.getInt(o.W5k, -1), PorterDuff.Mode.SRC_IN);
        this.mUb = w6.n(this.f58766n.getContext(), typedArray, o.UR);
        this.gh = w6.n(this.f58766n.getContext(), typedArray, o.WKb);
        this.qie = w6.n(this.f58766n.getContext(), typedArray, o.f8855b);
        this.Ik = typedArray.getBoolean(o.f8840Rc, false);
        this.f58765Z = typedArray.getDimensionPixelSize(o.ex, 0);
        this.f58768r = typedArray.getBoolean(o.jE, true);
        int iE2 = ViewCompat.E2(this.f58766n);
        int paddingTop = this.f58766n.getPaddingTop();
        int iFD = ViewCompat.fD(this.f58766n);
        int paddingBottom = this.f58766n.getPaddingBottom();
        if (typedArray.hasValue(o.jX)) {
            Z();
        } else {
            T();
        }
        ViewCompat.HV(this.f58766n, iE2 + this.f58769t, paddingTop + this.f58764O, iFD + this.nr, paddingBottom + this.J2);
    }

    int rl() {
        return this.Uo;
    }

    public int t() {
        return this.J2;
    }

    void te(ColorStateList colorStateList) {
        if (this.gh != colorStateList) {
            this.gh = colorStateList;
            nHg();
        }
    }

    C xMQ() {
        return this.rl;
    }

    j(MaterialButton materialButton, C c2) {
        this.f58766n = materialButton;
        this.rl = c2;
    }

    private void nHg() {
        int iNr;
        CN3 cn3J2 = J2();
        CN3 cn3Ty = ty();
        if (cn3J2 != null) {
            cn3J2.B(this.KN, this.gh);
            if (cn3Ty != null) {
                float f3 = this.KN;
                if (this.ty) {
                    iNr = W3.j.nr(this.f58766n, n.ty);
                } else {
                    iNr = 0;
                }
                cn3Ty.FX(f3, iNr);
            }
        }
    }

    void o(int i2) {
        if (J2() != null) {
            J2().setTint(i2);
        }
    }
}
