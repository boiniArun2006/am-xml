package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.appcompat.R;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.CompoundButtonCompat;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
class AppCompatCompoundButtonHelper {
    private boolean J2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final CompoundButton f14068n;
    private ColorStateList rl = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private PorterDuff.Mode f14069t = null;
    private boolean nr = false;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f14067O = false;

    void J2(ColorStateList colorStateList) {
        this.rl = colorStateList;
        this.nr = true;
        n();
    }

    void O() {
        if (this.J2) {
            this.J2 = false;
        } else {
            this.J2 = true;
            n();
        }
    }

    void Uo(PorterDuff.Mode mode) {
        this.f14069t = mode;
        this.f14067O = true;
        n();
    }

    void n() {
        Drawable drawableN = CompoundButtonCompat.n(this.f14068n);
        if (drawableN != null) {
            if (this.nr || this.f14067O) {
                Drawable drawableMutate = DrawableCompat.r(drawableN).mutate();
                if (this.nr) {
                    DrawableCompat.HI(drawableMutate, this.rl);
                }
                if (this.f14067O) {
                    DrawableCompat.ck(drawableMutate, this.f14069t);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f14068n.getDrawableState());
                }
                this.f14068n.setButtonDrawable(drawableMutate);
            }
        }
    }

    void nr(AttributeSet attributeSet, int i2) {
        int i3;
        int iTy;
        int iTy2;
        Context context = this.f14068n.getContext();
        int[] iArr = R.styleable.VwL;
        TintTypedArray tintTypedArrayS = TintTypedArray.S(context, attributeSet, iArr, i2, 0);
        CompoundButton compoundButton = this.f14068n;
        ViewCompat.ijL(compoundButton, compoundButton.getContext(), iArr, attributeSet, tintTypedArrayS.r(), i2, 0);
        try {
            int i5 = R.styleable.T3L;
            if (!tintTypedArrayS.o(i5) || (iTy2 = tintTypedArrayS.ty(i5, 0)) == 0) {
                i3 = R.styleable.mI;
                if (tintTypedArrayS.o(i3) && (iTy = tintTypedArrayS.ty(i3, 0)) != 0) {
                    CompoundButton compoundButton2 = this.f14068n;
                    compoundButton2.setButtonDrawable(AppCompatResources.rl(compoundButton2.getContext(), iTy));
                }
            } else {
                try {
                    CompoundButton compoundButton3 = this.f14068n;
                    compoundButton3.setButtonDrawable(AppCompatResources.rl(compoundButton3.getContext(), iTy2));
                } catch (Resources.NotFoundException unused) {
                    i3 = R.styleable.mI;
                    if (tintTypedArrayS.o(i3)) {
                        CompoundButton compoundButton22 = this.f14068n;
                        compoundButton22.setButtonDrawable(AppCompatResources.rl(compoundButton22.getContext(), iTy));
                    }
                }
            }
            int i7 = R.styleable.Bu;
            if (tintTypedArrayS.o(i7)) {
                CompoundButtonCompat.nr(this.f14068n, tintTypedArrayS.t(i7));
            }
            int i8 = R.styleable.p0N;
            if (tintTypedArrayS.o(i8)) {
                CompoundButtonCompat.O(this.f14068n, DrawableUtils.O(tintTypedArrayS.gh(i8, -1), null));
            }
            tintTypedArrayS.aYN();
        } catch (Throwable th) {
            tintTypedArrayS.aYN();
            throw th;
        }
    }

    ColorStateList rl() {
        return this.rl;
    }

    PorterDuff.Mode t() {
        return this.f14069t;
    }

    AppCompatCompoundButtonHelper(CompoundButton compoundButton) {
        this.f14068n = compoundButton;
    }
}
