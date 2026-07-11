package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckedTextView;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.CheckedTextViewCompat;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@RestrictTo
class AppCompatCheckedTextViewHelper {
    private boolean J2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final CheckedTextView f14065n;
    private ColorStateList rl = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private PorterDuff.Mode f14066t = null;
    private boolean nr = false;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f14064O = false;

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
        this.f14066t = mode;
        this.f14064O = true;
        n();
    }

    void n() {
        Drawable drawableN = CheckedTextViewCompat.n(this.f14065n);
        if (drawableN != null) {
            if (this.nr || this.f14064O) {
                Drawable drawableMutate = DrawableCompat.r(drawableN).mutate();
                if (this.nr) {
                    DrawableCompat.HI(drawableMutate, this.rl);
                }
                if (this.f14064O) {
                    DrawableCompat.ck(drawableMutate, this.f14066t);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f14065n.getDrawableState());
                }
                this.f14065n.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    void nr(AttributeSet attributeSet, int i2) {
        int i3;
        int iTy;
        int iTy2;
        Context context = this.f14065n.getContext();
        int[] iArr = R.styleable.RQ;
        TintTypedArray tintTypedArrayS = TintTypedArray.S(context, attributeSet, iArr, i2, 0);
        CheckedTextView checkedTextView = this.f14065n;
        ViewCompat.ijL(checkedTextView, checkedTextView.getContext(), iArr, attributeSet, tintTypedArrayS.r(), i2, 0);
        try {
            int i5 = R.styleable.f13495F;
            if (!tintTypedArrayS.o(i5) || (iTy2 = tintTypedArrayS.ty(i5, 0)) == 0) {
                i3 = R.styleable.a63;
                if (tintTypedArrayS.o(i3) && (iTy = tintTypedArrayS.ty(i3, 0)) != 0) {
                    CheckedTextView checkedTextView2 = this.f14065n;
                    checkedTextView2.setCheckMarkDrawable(AppCompatResources.rl(checkedTextView2.getContext(), iTy));
                }
            } else {
                try {
                    CheckedTextView checkedTextView3 = this.f14065n;
                    checkedTextView3.setCheckMarkDrawable(AppCompatResources.rl(checkedTextView3.getContext(), iTy2));
                } catch (Resources.NotFoundException unused) {
                    i3 = R.styleable.a63;
                    if (tintTypedArrayS.o(i3)) {
                        CheckedTextView checkedTextView22 = this.f14065n;
                        checkedTextView22.setCheckMarkDrawable(AppCompatResources.rl(checkedTextView22.getContext(), iTy));
                    }
                }
            }
            int i7 = R.styleable.QZ6;
            if (tintTypedArrayS.o(i7)) {
                CheckedTextViewCompat.rl(this.f14065n, tintTypedArrayS.t(i7));
            }
            int i8 = R.styleable.tFV;
            if (tintTypedArrayS.o(i8)) {
                CheckedTextViewCompat.t(this.f14065n, DrawableUtils.O(tintTypedArrayS.gh(i8, -1), null));
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
        return this.f14066t;
    }

    AppCompatCheckedTextViewHelper(CheckedTextView checkedTextView) {
        this.f14065n = checkedTextView;
    }
}
