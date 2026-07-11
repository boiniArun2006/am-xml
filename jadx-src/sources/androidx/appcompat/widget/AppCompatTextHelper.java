package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.LocaleList;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.appcompat.R;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.util.TypedValueCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.core.widget.TextViewCompat;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
class AppCompatTextHelper {
    private TintInfo J2;
    private TintInfo KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private TintInfo f14139O;
    private TintInfo Uo;
    private boolean az;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final TextView f14140n;
    private TintInfo nr;
    private Typeface qie;
    private TintInfo rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private TintInfo f14141t;
    private final AppCompatTextViewAutoSizeHelper xMQ;
    private int mUb = 0;
    private int gh = -1;

    private void ViF(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = this.f14140n.getCompoundDrawablesRelative();
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            TextView textView = this.f14140n;
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative2 = this.f14140n.getCompoundDrawablesRelative();
        Drawable drawable7 = compoundDrawablesRelative2[0];
        if (drawable7 != null || compoundDrawablesRelative2[2] != null) {
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative2[1];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative2[3];
            }
            this.f14140n.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, compoundDrawablesRelative2[2], drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.f14140n.getCompoundDrawables();
        TextView textView2 = this.f14140n;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView2.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    @RequiresApi
    static class Api21Impl {
        @DoNotInline
        static Locale n(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    @RequiresApi
    static class Api24Impl {
        @DoNotInline
        static LocaleList n(String str) {
            return LocaleList.forLanguageTags(str);
        }

        @DoNotInline
        static void rl(TextView textView, LocaleList localeList) {
            textView.setTextLocales(localeList);
        }
    }

    @RequiresApi
    static class Api26Impl {
        @DoNotInline
        static int n(TextView textView) {
            return textView.getAutoSizeStepGranularity();
        }

        @DoNotInline
        static boolean nr(TextView textView, String str) {
            return textView.setFontVariationSettings(str);
        }

        @DoNotInline
        static void rl(TextView textView, int i2, int i3, int i5, int i7) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i5, i7);
        }

        @DoNotInline
        static void t(TextView textView, int[] iArr, int i2) {
            textView.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
        }
    }

    @RequiresApi
    static class Api28Impl {
        @DoNotInline
        static Typeface n(Typeface typeface, int i2, boolean z2) {
            return Typeface.create(typeface, i2, z2);
        }
    }

    private void iF(Context context, TintTypedArray tintTypedArray) {
        String strHI;
        this.mUb = tintTypedArray.gh(R.styleable.lRt, this.mUb);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            int iGh = tintTypedArray.gh(R.styleable.gxH, -1);
            this.gh = iGh;
            if (iGh != -1) {
                this.mUb &= 2;
            }
        }
        int i3 = R.styleable.yA;
        if (!tintTypedArray.o(i3) && !tintTypedArray.o(R.styleable.YiW)) {
            int i5 = R.styleable.TVk;
            if (tintTypedArray.o(i5)) {
                this.az = false;
                int iGh2 = tintTypedArray.gh(i5, 1);
                if (iGh2 == 1) {
                    this.qie = Typeface.SANS_SERIF;
                    return;
                } else if (iGh2 == 2) {
                    this.qie = Typeface.SERIF;
                    return;
                } else {
                    if (iGh2 != 3) {
                        return;
                    }
                    this.qie = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.qie = null;
        int i7 = R.styleable.YiW;
        if (tintTypedArray.o(i7)) {
            i3 = i7;
        }
        final int i8 = this.gh;
        final int i9 = this.mUb;
        if (!context.isRestricted()) {
            final WeakReference weakReference = new WeakReference(this.f14140n);
            try {
                Typeface typefaceMUb = tintTypedArray.mUb(i3, this.mUb, new ResourcesCompat.FontCallback() { // from class: androidx.appcompat.widget.AppCompatTextHelper.1
                    @Override // androidx.core.content.res.ResourcesCompat.FontCallback
                    public void J2(int i10) {
                    }

                    @Override // androidx.core.content.res.ResourcesCompat.FontCallback
                    public void Uo(Typeface typeface) {
                        int i10;
                        if (Build.VERSION.SDK_INT >= 28 && (i10 = i8) != -1) {
                            typeface = Api28Impl.n(typeface, i10, (i9 & 2) != 0);
                        }
                        AppCompatTextHelper.this.ty(weakReference, typeface);
                    }
                });
                if (typefaceMUb != null) {
                    if (i2 < 28 || this.gh == -1) {
                        this.qie = typefaceMUb;
                    } else {
                        this.qie = Api28Impl.n(Typeface.create(typefaceMUb, 0), this.gh, (this.mUb & 2) != 0);
                    }
                }
                this.az = this.qie == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.qie != null || (strHI = tintTypedArray.HI(i3)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.gh == -1) {
            this.qie = Typeface.create(strHI, this.mUb);
        } else {
            this.qie = Api28Impl.n(Typeface.create(strHI, 0), this.gh, (this.mUb & 2) != 0);
        }
    }

    private void n(Drawable drawable, TintInfo tintInfo) {
        if (drawable == null || tintInfo == null) {
            return;
        }
        AppCompatDrawableManager.xMQ(drawable, tintInfo, this.f14140n.getDrawableState());
    }

    private void nY() {
        TintInfo tintInfo = this.KN;
        this.rl = tintInfo;
        this.f14141t = tintInfo;
        this.nr = tintInfo;
        this.f14139O = tintInfo;
        this.J2 = tintInfo;
        this.Uo = tintInfo;
    }

    private void te(int i2, float f3) {
        this.xMQ.Z(i2, f3);
    }

    void HI(boolean z2, int i2, int i3, int i5, int i7) {
        if (ViewUtils.f14454t) {
            return;
        }
        t();
    }

    void Ik(Context context, int i2) {
        String strHI;
        TintTypedArray tintTypedArrayZ = TintTypedArray.Z(context, i2, R.styleable.C7B);
        int i3 = R.styleable.Sax;
        if (tintTypedArrayZ.o(i3)) {
            o(tintTypedArrayZ.n(i3, false));
        }
        int i5 = Build.VERSION.SDK_INT;
        int i7 = R.styleable.wYi;
        if (tintTypedArrayZ.o(i7) && tintTypedArrayZ.J2(i7, -1) == 0) {
            this.f14140n.setTextSize(0, 0.0f);
        }
        iF(context, tintTypedArrayZ);
        if (i5 >= 26) {
            int i8 = R.styleable.f13519c;
            if (tintTypedArrayZ.o(i8) && (strHI = tintTypedArrayZ.HI(i8)) != null) {
                Api26Impl.nr(this.f14140n, strHI);
            }
        }
        tintTypedArrayZ.aYN();
        Typeface typeface = this.qie;
        if (typeface != null) {
            this.f14140n.setTypeface(typeface, this.mUb);
        }
    }

    int J2() {
        return this.xMQ.Uo();
    }

    int[] KN() {
        return this.xMQ.xMQ();
    }

    int O() {
        return this.xMQ.J2();
    }

    void S(int i2) {
        this.xMQ.r(i2);
    }

    int Uo() {
        return this.xMQ.KN();
    }

    void WPU(ColorStateList colorStateList) {
        if (this.KN == null) {
            this.KN = new TintInfo();
        }
        TintInfo tintInfo = this.KN;
        tintInfo.f14383n = colorStateList;
        tintInfo.nr = colorStateList != null;
        nY();
    }

    void XQ(int[] iArr, int i2) {
        this.xMQ.Ik(iArr, i2);
    }

    void Z(int i2, int i3, int i5, int i7) {
        this.xMQ.ck(i2, i3, i5, i7);
    }

    void aYN(PorterDuff.Mode mode) {
        if (this.KN == null) {
            this.KN = new TintInfo();
        }
        TintInfo tintInfo = this.KN;
        tintInfo.rl = mode;
        tintInfo.f14384t = mode != null;
        nY();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    void az(AttributeSet attributeSet, int i2) {
        boolean zN;
        boolean z2;
        String strHI;
        String strHI2;
        boolean z3;
        int iN;
        float fJ2;
        Context context = this.f14140n.getContext();
        AppCompatDrawableManager appCompatDrawableManagerRl = AppCompatDrawableManager.rl();
        int[] iArr = R.styleable.f13502J;
        TintTypedArray tintTypedArrayS = TintTypedArray.S(context, attributeSet, iArr, i2, 0);
        TextView textView = this.f14140n;
        ViewCompat.ijL(textView, textView.getContext(), iArr, attributeSet, tintTypedArrayS.r(), i2, 0);
        int iTy = tintTypedArrayS.ty(R.styleable.f13493D, -1);
        int i3 = R.styleable.f13499GR;
        if (tintTypedArrayS.o(i3)) {
            this.rl = nr(context, appCompatDrawableManagerRl, tintTypedArrayS.ty(i3, 0));
        }
        int i5 = R.styleable.f13517a;
        if (tintTypedArrayS.o(i5)) {
            this.f14141t = nr(context, appCompatDrawableManagerRl, tintTypedArrayS.ty(i5, 0));
        }
        int i7 = R.styleable.Nxk;
        if (tintTypedArrayS.o(i7)) {
            this.nr = nr(context, appCompatDrawableManagerRl, tintTypedArrayS.ty(i7, 0));
        }
        int i8 = R.styleable.f13501I;
        if (tintTypedArrayS.o(i8)) {
            this.f14139O = nr(context, appCompatDrawableManagerRl, tintTypedArrayS.ty(i8, 0));
        }
        int i9 = R.styleable.f13515Y;
        if (tintTypedArrayS.o(i9)) {
            this.J2 = nr(context, appCompatDrawableManagerRl, tintTypedArrayS.ty(i9, 0));
        }
        int i10 = R.styleable.f13528k;
        if (tintTypedArrayS.o(i10)) {
            this.Uo = nr(context, appCompatDrawableManagerRl, tintTypedArrayS.ty(i10, 0));
        }
        tintTypedArrayS.aYN();
        boolean z4 = this.f14140n.getTransformationMethod() instanceof PasswordTransformationMethod;
        if (iTy != -1) {
            TintTypedArray tintTypedArrayZ = TintTypedArray.Z(context, iTy, R.styleable.C7B);
            if (!z4) {
                int i11 = R.styleable.Sax;
                if (tintTypedArrayZ.o(i11)) {
                    zN = tintTypedArrayZ.n(i11, false);
                    z2 = true;
                } else {
                    zN = false;
                    z2 = false;
                }
                iF(context, tintTypedArrayZ);
                int i12 = Build.VERSION.SDK_INT;
                int i13 = R.styleable.kQ;
                strHI2 = tintTypedArrayZ.o(i13) ? tintTypedArrayZ.HI(i13) : null;
                if (i12 >= 26) {
                    int i14 = R.styleable.f13519c;
                    strHI = tintTypedArrayZ.o(i14) ? tintTypedArrayZ.HI(i14) : null;
                    tintTypedArrayZ.aYN();
                }
            }
        } else {
            zN = false;
            z2 = false;
            strHI = null;
            strHI2 = null;
        }
        TintTypedArray tintTypedArrayS2 = TintTypedArray.S(context, attributeSet, R.styleable.C7B, i2, 0);
        if (!z4) {
            int i15 = R.styleable.Sax;
            if (tintTypedArrayS2.o(i15)) {
                zN = tintTypedArrayS2.n(i15, false);
                z3 = true;
            } else {
                z3 = z2;
            }
        }
        int i16 = Build.VERSION.SDK_INT;
        int i17 = R.styleable.kQ;
        if (tintTypedArrayS2.o(i17)) {
            strHI2 = tintTypedArrayS2.HI(i17);
        }
        if (i16 >= 26) {
            int i18 = R.styleable.f13519c;
            if (tintTypedArrayS2.o(i18)) {
                strHI = tintTypedArrayS2.HI(i18);
            }
        }
        if (i16 >= 28) {
            int i19 = R.styleable.wYi;
            if (tintTypedArrayS2.o(i19) && tintTypedArrayS2.J2(i19, -1) == 0) {
                this.f14140n.setTextSize(0, 0.0f);
            }
        }
        iF(context, tintTypedArrayS2);
        tintTypedArrayS2.aYN();
        if (!z4 && z3) {
            o(zN);
        }
        Typeface typeface = this.qie;
        if (typeface != null) {
            if (this.gh == -1) {
                this.f14140n.setTypeface(typeface, this.mUb);
            } else {
                this.f14140n.setTypeface(typeface);
            }
        }
        if (strHI != null) {
            Api26Impl.nr(this.f14140n, strHI);
        }
        if (strHI2 != null) {
            Api24Impl.rl(this.f14140n, Api24Impl.n(strHI2));
        }
        this.xMQ.HI(attributeSet, i2);
        if (ViewUtils.f14454t && this.xMQ.mUb() != 0) {
            int[] iArrXMQ = this.xMQ.xMQ();
            if (iArrXMQ.length > 0) {
                if (Api26Impl.n(this.f14140n) != -1.0f) {
                    Api26Impl.rl(this.f14140n, this.xMQ.Uo(), this.xMQ.J2(), this.xMQ.KN(), 0);
                } else {
                    Api26Impl.t(this.f14140n, iArrXMQ, 0);
                }
            }
        }
        TintTypedArray tintTypedArrayXQ = TintTypedArray.XQ(context, attributeSet, R.styleable.dR0);
        int iTy2 = tintTypedArrayXQ.ty(R.styleable.ofS, -1);
        Drawable drawableT = iTy2 != -1 ? appCompatDrawableManagerRl.t(context, iTy2) : null;
        int iTy3 = tintTypedArrayXQ.ty(R.styleable.eWT, -1);
        Drawable drawableT2 = iTy3 != -1 ? appCompatDrawableManagerRl.t(context, iTy3) : null;
        int iTy4 = tintTypedArrayXQ.ty(R.styleable.f13492C, -1);
        Drawable drawableT3 = iTy4 != -1 ? appCompatDrawableManagerRl.t(context, iTy4) : null;
        int iTy5 = tintTypedArrayXQ.ty(R.styleable.xg, -1);
        Drawable drawableT4 = iTy5 != -1 ? appCompatDrawableManagerRl.t(context, iTy5) : null;
        int iTy6 = tintTypedArrayXQ.ty(R.styleable.Mx, -1);
        Drawable drawableT5 = iTy6 != -1 ? appCompatDrawableManagerRl.t(context, iTy6) : null;
        int iTy7 = tintTypedArrayXQ.ty(R.styleable.pJg, -1);
        ViF(drawableT, drawableT2, drawableT3, drawableT4, drawableT5, iTy7 != -1 ? appCompatDrawableManagerRl.t(context, iTy7) : null);
        int i20 = R.styleable.f13498G7;
        if (tintTypedArrayXQ.o(i20)) {
            TextViewCompat.xMQ(this.f14140n, tintTypedArrayXQ.t(i20));
        }
        int i21 = R.styleable.fcU;
        if (tintTypedArrayXQ.o(i21)) {
            TextViewCompat.mUb(this.f14140n, DrawableUtils.O(tintTypedArrayXQ.gh(i21, -1), null));
        }
        int iJ2 = tintTypedArrayXQ.J2(R.styleable.n1, -1);
        int iJ22 = tintTypedArrayXQ.J2(R.styleable.Jk, -1);
        int i22 = R.styleable.Rl;
        if (tintTypedArrayXQ.o(i22)) {
            TypedValue typedValueWPU = tintTypedArrayXQ.WPU(i22);
            if (typedValueWPU == null || typedValueWPU.type != 5) {
                fJ2 = tintTypedArrayXQ.J2(i22, -1);
                iN = -1;
            } else {
                iN = TypedValueCompat.n(typedValueWPU.data);
                fJ2 = TypedValue.complexToFloat(typedValueWPU.data);
            }
        } else {
            iN = -1;
            fJ2 = -1.0f;
        }
        tintTypedArrayXQ.aYN();
        if (iJ2 != -1) {
            TextViewCompat.qie(this.f14140n, iJ2);
        }
        if (iJ22 != -1) {
            TextViewCompat.az(this.f14140n, iJ22);
        }
        if (fJ2 != -1.0f) {
            if (iN == -1) {
                TextViewCompat.ty(this.f14140n, (int) fJ2);
            } else {
                TextViewCompat.HI(this.f14140n, iN, fJ2);
            }
        }
    }

    void g(int i2, float f3) {
        if (ViewUtils.f14454t || qie()) {
            return;
        }
        te(i2, f3);
    }

    PorterDuff.Mode gh() {
        TintInfo tintInfo = this.KN;
        if (tintInfo != null) {
            return tintInfo.rl;
        }
        return null;
    }

    ColorStateList mUb() {
        TintInfo tintInfo = this.KN;
        if (tintInfo != null) {
            return tintInfo.f14383n;
        }
        return null;
    }

    void o(boolean z2) {
        this.f14140n.setAllCaps(z2);
    }

    boolean qie() {
        return this.xMQ.ty();
    }

    void r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        EditorInfoCompat.J2(editorInfo, textView.getText());
    }

    void rl() {
        if (this.rl != null || this.f14141t != null || this.nr != null || this.f14139O != null) {
            Drawable[] compoundDrawables = this.f14140n.getCompoundDrawables();
            n(compoundDrawables[0], this.rl);
            n(compoundDrawables[1], this.f14141t);
            n(compoundDrawables[2], this.nr);
            n(compoundDrawables[3], this.f14139O);
        }
        if (this.J2 == null && this.Uo == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.f14140n.getCompoundDrawablesRelative();
        n(compoundDrawablesRelative[0], this.J2);
        n(compoundDrawablesRelative[2], this.Uo);
    }

    void t() {
        this.xMQ.n();
    }

    void ty(WeakReference weakReference, final Typeface typeface) {
        if (this.az) {
            this.qie = typeface;
            final TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                if (!textView.isAttachedToWindow()) {
                    textView.setTypeface(typeface, this.mUb);
                } else {
                    final int i2 = this.mUb;
                    textView.post(new Runnable() { // from class: androidx.appcompat.widget.AppCompatTextHelper.2
                        @Override // java.lang.Runnable
                        public void run() {
                            textView.setTypeface(typeface, i2);
                        }
                    });
                }
            }
        }
    }

    int xMQ() {
        return this.xMQ.mUb();
    }

    AppCompatTextHelper(TextView textView) {
        this.f14140n = textView;
        this.xMQ = new AppCompatTextViewAutoSizeHelper(textView);
    }

    private static TintInfo nr(Context context, AppCompatDrawableManager appCompatDrawableManager, int i2) {
        ColorStateList colorStateListJ2 = appCompatDrawableManager.J2(context, i2);
        if (colorStateListJ2 != null) {
            TintInfo tintInfo = new TintInfo();
            tintInfo.nr = true;
            tintInfo.f14383n = colorStateListJ2;
            return tintInfo;
        }
        return null;
    }

    void ck() {
        rl();
    }
}
