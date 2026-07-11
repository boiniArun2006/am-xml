package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.ViewCompat;
import androidx.core.widget.ImageViewCompat;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@RestrictTo
public class AppCompatImageHelper {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private int f14087O = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ImageView f14088n;
    private TintInfo nr;
    private TintInfo rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private TintInfo f14089t;

    private boolean n(Drawable drawable) {
        if (this.nr == null) {
            this.nr = new TintInfo();
        }
        TintInfo tintInfo = this.nr;
        tintInfo.n();
        ColorStateList colorStateListN = ImageViewCompat.n(this.f14088n);
        if (colorStateListN != null) {
            tintInfo.nr = true;
            tintInfo.f14383n = colorStateListN;
        }
        PorterDuff.Mode modeRl = ImageViewCompat.rl(this.f14088n);
        if (modeRl != null) {
            tintInfo.f14384t = true;
            tintInfo.rl = modeRl;
        }
        if (!tintInfo.nr && !tintInfo.f14384t) {
            return false;
        }
        AppCompatDrawableManager.xMQ(drawable, tintInfo, this.f14088n.getDrawableState());
        return true;
    }

    private boolean qie() {
        return this.rl != null;
    }

    boolean J2() {
        return !(this.f14088n.getBackground() instanceof RippleDrawable);
    }

    PorterDuff.Mode O() {
        TintInfo tintInfo = this.f14089t;
        if (tintInfo != null) {
            return tintInfo.rl;
        }
        return null;
    }

    public void Uo(AttributeSet attributeSet, int i2) {
        int iTy;
        Context context = this.f14088n.getContext();
        int[] iArr = R.styleable.f13512U;
        TintTypedArray tintTypedArrayS = TintTypedArray.S(context, attributeSet, iArr, i2, 0);
        ImageView imageView = this.f14088n;
        ViewCompat.ijL(imageView, imageView.getContext(), iArr, attributeSet, tintTypedArrayS.r(), i2, 0);
        try {
            Drawable drawable = this.f14088n.getDrawable();
            if (drawable == null && (iTy = tintTypedArrayS.ty(R.styleable.P5, -1)) != -1 && (drawable = AppCompatResources.rl(this.f14088n.getContext(), iTy)) != null) {
                this.f14088n.setImageDrawable(drawable);
            }
            if (drawable != null) {
                DrawableUtils.rl(drawable);
            }
            int i3 = R.styleable.M7;
            if (tintTypedArrayS.o(i3)) {
                ImageViewCompat.t(this.f14088n, tintTypedArrayS.t(i3));
            }
            int i5 = R.styleable.p5;
            if (tintTypedArrayS.o(i5)) {
                ImageViewCompat.nr(this.f14088n, DrawableUtils.O(tintTypedArrayS.gh(i5, -1), null));
            }
            tintTypedArrayS.aYN();
        } catch (Throwable th) {
            tintTypedArrayS.aYN();
            throw th;
        }
    }

    void gh(PorterDuff.Mode mode) {
        if (this.f14089t == null) {
            this.f14089t = new TintInfo();
        }
        TintInfo tintInfo = this.f14089t;
        tintInfo.rl = mode;
        tintInfo.f14384t = true;
        t();
    }

    void mUb(ColorStateList colorStateList) {
        if (this.f14089t == null) {
            this.f14089t = new TintInfo();
        }
        TintInfo tintInfo = this.f14089t;
        tintInfo.f14383n = colorStateList;
        tintInfo.nr = true;
        t();
    }

    ColorStateList nr() {
        TintInfo tintInfo = this.f14089t;
        if (tintInfo != null) {
            return tintInfo.f14383n;
        }
        return null;
    }

    void rl() {
        if (this.f14088n.getDrawable() != null) {
            this.f14088n.getDrawable().setLevel(this.f14087O);
        }
    }

    void t() {
        Drawable drawable = this.f14088n.getDrawable();
        if (drawable != null) {
            DrawableUtils.rl(drawable);
        }
        if (drawable != null) {
            if (qie() && n(drawable)) {
                return;
            }
            TintInfo tintInfo = this.f14089t;
            if (tintInfo != null) {
                AppCompatDrawableManager.xMQ(drawable, tintInfo, this.f14088n.getDrawableState());
                return;
            }
            TintInfo tintInfo2 = this.rl;
            if (tintInfo2 != null) {
                AppCompatDrawableManager.xMQ(drawable, tintInfo2, this.f14088n.getDrawableState());
            }
        }
    }

    public void xMQ(int i2) {
        if (i2 != 0) {
            Drawable drawableRl = AppCompatResources.rl(this.f14088n.getContext(), i2);
            if (drawableRl != null) {
                DrawableUtils.rl(drawableRl);
            }
            this.f14088n.setImageDrawable(drawableRl);
        } else {
            this.f14088n.setImageDrawable(null);
        }
        t();
    }

    public AppCompatImageHelper(ImageView imageView) {
        this.f14088n = imageView;
    }

    void KN(Drawable drawable) {
        this.f14087O = drawable.getLevel();
    }
}
