package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.R;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
class AppCompatBackgroundHelper {
    private TintInfo J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private TintInfo f14042O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final View f14043n;
    private TintInfo nr;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f14044t = -1;
    private final AppCompatDrawableManager rl = AppCompatDrawableManager.rl();

    void J2(Drawable drawable) {
        this.f14044t = -1;
        KN(null);
        rl();
    }

    private boolean gh() {
        return this.nr != null;
    }

    private boolean n(Drawable drawable) {
        if (this.J2 == null) {
            this.J2 = new TintInfo();
        }
        TintInfo tintInfo = this.J2;
        tintInfo.n();
        ColorStateList colorStateListR = ViewCompat.r(this.f14043n);
        if (colorStateListR != null) {
            tintInfo.nr = true;
            tintInfo.f14383n = colorStateListR;
        }
        PorterDuff.Mode modeO = ViewCompat.o(this.f14043n);
        if (modeO != null) {
            tintInfo.f14384t = true;
            tintInfo.rl = modeO;
        }
        if (!tintInfo.nr && !tintInfo.f14384t) {
            return false;
        }
        AppCompatDrawableManager.xMQ(drawable, tintInfo, this.f14043n.getDrawableState());
        return true;
    }

    void KN(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.nr == null) {
                this.nr = new TintInfo();
            }
            TintInfo tintInfo = this.nr;
            tintInfo.f14383n = colorStateList;
            tintInfo.nr = true;
        } else {
            this.nr = null;
        }
        rl();
    }

    void O(AttributeSet attributeSet, int i2) {
        Context context = this.f14043n.getContext();
        int[] iArr = R.styleable.Yq;
        TintTypedArray tintTypedArrayS = TintTypedArray.S(context, attributeSet, iArr, i2, 0);
        View view = this.f14043n;
        ViewCompat.ijL(view, view.getContext(), iArr, attributeSet, tintTypedArrayS.r(), i2, 0);
        try {
            int i3 = R.styleable.f13497G;
            if (tintTypedArrayS.o(i3)) {
                this.f14044t = tintTypedArrayS.ty(i3, -1);
                ColorStateList colorStateListJ2 = this.rl.J2(this.f14043n.getContext(), this.f14044t);
                if (colorStateListJ2 != null) {
                    KN(colorStateListJ2);
                }
            }
            int i5 = R.styleable.f11;
            if (tintTypedArrayS.o(i5)) {
                ViewCompat.Mx(this.f14043n, tintTypedArrayS.t(i5));
            }
            int i7 = R.styleable.cAB;
            if (tintTypedArrayS.o(i7)) {
                ViewCompat.G7(this.f14043n, DrawableUtils.O(tintTypedArrayS.gh(i7, -1), null));
            }
            tintTypedArrayS.aYN();
        } catch (Throwable th) {
            tintTypedArrayS.aYN();
            throw th;
        }
    }

    void Uo(int i2) {
        this.f14044t = i2;
        AppCompatDrawableManager appCompatDrawableManager = this.rl;
        KN(appCompatDrawableManager != null ? appCompatDrawableManager.J2(this.f14043n.getContext(), i2) : null);
        rl();
    }

    void mUb(PorterDuff.Mode mode) {
        if (this.f14042O == null) {
            this.f14042O = new TintInfo();
        }
        TintInfo tintInfo = this.f14042O;
        tintInfo.rl = mode;
        tintInfo.f14384t = true;
        rl();
    }

    PorterDuff.Mode nr() {
        TintInfo tintInfo = this.f14042O;
        if (tintInfo != null) {
            return tintInfo.rl;
        }
        return null;
    }

    void rl() {
        Drawable background = this.f14043n.getBackground();
        if (background != null) {
            if (gh() && n(background)) {
                return;
            }
            TintInfo tintInfo = this.f14042O;
            if (tintInfo != null) {
                AppCompatDrawableManager.xMQ(background, tintInfo, this.f14043n.getDrawableState());
                return;
            }
            TintInfo tintInfo2 = this.nr;
            if (tintInfo2 != null) {
                AppCompatDrawableManager.xMQ(background, tintInfo2, this.f14043n.getDrawableState());
            }
        }
    }

    ColorStateList t() {
        TintInfo tintInfo = this.f14042O;
        if (tintInfo != null) {
            return tintInfo.f14383n;
        }
        return null;
    }

    void xMQ(ColorStateList colorStateList) {
        if (this.f14042O == null) {
            this.f14042O = new TintInfo();
        }
        TintInfo tintInfo = this.f14042O;
        tintInfo.f14383n = colorStateList;
        tintInfo.nr = true;
        rl();
    }

    AppCompatBackgroundHelper(View view) {
        this.f14043n = view;
    }
}
