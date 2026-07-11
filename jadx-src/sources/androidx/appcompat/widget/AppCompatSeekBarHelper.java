package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.appcompat.R;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
class AppCompatSeekBarHelper extends AppCompatProgressBarHelper {
    private ColorStateList J2;
    private boolean KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private Drawable f14113O;
    private PorterDuff.Mode Uo;
    private final SeekBar nr;
    private boolean xMQ;

    private void J2() {
        Drawable drawable = this.f14113O;
        if (drawable != null) {
            if (this.KN || this.xMQ) {
                Drawable drawableR = DrawableCompat.r(drawable.mutate());
                this.f14113O = drawableR;
                if (this.KN) {
                    DrawableCompat.HI(drawableR, this.J2);
                }
                if (this.xMQ) {
                    DrawableCompat.ck(this.f14113O, this.Uo);
                }
                if (this.f14113O.isStateful()) {
                    this.f14113O.setState(this.nr.getDrawableState());
                }
            }
        }
    }

    void KN() {
        Drawable drawable = this.f14113O;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.nr.getDrawableState())) {
            this.nr.invalidateDrawable(drawable);
        }
    }

    void Uo(Canvas canvas) {
        if (this.f14113O != null) {
            int max = this.nr.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f14113O.getIntrinsicWidth();
                int intrinsicHeight = this.f14113O.getIntrinsicHeight();
                int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i3 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f14113O.setBounds(-i2, -i3, i2, i3);
                float width = ((this.nr.getWidth() - this.nr.getPaddingLeft()) - this.nr.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(this.nr.getPaddingLeft(), this.nr.getHeight() / 2);
                for (int i5 = 0; i5 <= max; i5++) {
                    this.f14113O.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    void mUb(Drawable drawable) {
        Drawable drawable2 = this.f14113O;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f14113O = drawable;
        if (drawable != null) {
            drawable.setCallback(this.nr);
            DrawableCompat.az(drawable, this.nr.getLayoutDirection());
            if (drawable.isStateful()) {
                drawable.setState(this.nr.getDrawableState());
            }
            J2();
        }
        this.nr.invalidate();
    }

    void xMQ() {
        Drawable drawable = this.f14113O;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    AppCompatSeekBarHelper(SeekBar seekBar) {
        super(seekBar);
        this.J2 = null;
        this.Uo = null;
        this.KN = false;
        this.xMQ = false;
        this.nr = seekBar;
    }

    @Override // androidx.appcompat.widget.AppCompatProgressBarHelper
    void t(AttributeSet attributeSet, int i2) {
        super.t(attributeSet, i2);
        Context context = this.nr.getContext();
        int[] iArr = R.styleable.eF;
        TintTypedArray tintTypedArrayS = TintTypedArray.S(context, attributeSet, iArr, i2, 0);
        SeekBar seekBar = this.nr;
        ViewCompat.ijL(seekBar, seekBar.getContext(), iArr, attributeSet, tintTypedArrayS.r(), i2, 0);
        Drawable drawableKN = tintTypedArrayS.KN(R.styleable.f13494E);
        if (drawableKN != null) {
            this.nr.setThumb(drawableKN);
        }
        mUb(tintTypedArrayS.Uo(R.styleable.f13505M));
        int i3 = R.styleable.f13491B;
        if (tintTypedArrayS.o(i3)) {
            this.Uo = DrawableUtils.O(tintTypedArrayS.gh(i3, -1), this.Uo);
            this.xMQ = true;
        }
        int i5 = R.styleable.f13496FX;
        if (tintTypedArrayS.o(i5)) {
            this.J2 = tintTypedArrayS.t(i5);
            this.KN = true;
        }
        tintTypedArrayS.aYN();
        J2();
    }
}
