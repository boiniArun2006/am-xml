package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@RequiresApi
class RoundRectDrawable extends Drawable {
    private ColorStateList KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private float f14649O;
    private ColorStateList mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f14650n;
    private final Rect nr;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final RectF f14651t;
    private PorterDuffColorFilter xMQ;
    private boolean J2 = false;
    private boolean Uo = true;
    private PorterDuff.Mode gh = PorterDuff.Mode.SRC_IN;
    private final Paint rl = new Paint(5);

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    private void O(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.KN = colorStateList;
        this.rl.setColor(colorStateList.getColorForState(getState(), this.KN.getDefaultColor()));
    }

    private PorterDuffColorFilter n(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    private void xMQ(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f14651t.set(rect.left, rect.top, rect.right, rect.bottom);
        this.nr.set(rect);
        if (this.J2) {
            this.nr.inset((int) Math.ceil(RoundRectDrawableWithShadow.t(this.f14649O, this.f14650n, this.Uo)), (int) Math.ceil(RoundRectDrawableWithShadow.nr(this.f14649O, this.f14650n, this.Uo)));
            this.f14651t.set(this.nr);
        }
    }

    void KN(float f3) {
        if (f3 == this.f14650n) {
            return;
        }
        this.f14650n = f3;
        xMQ(null);
        invalidateSelf();
    }

    void Uo(float f3, boolean z2, boolean z3) {
        if (f3 == this.f14649O && this.J2 == z2 && this.Uo == z3) {
            return;
        }
        this.f14649O = f3;
        this.J2 = z2;
        this.Uo = z3;
        xMQ(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z2;
        Paint paint = this.rl;
        if (this.xMQ == null || paint.getColorFilter() != null) {
            z2 = false;
        } else {
            paint.setColorFilter(this.xMQ);
            z2 = true;
        }
        RectF rectF = this.f14651t;
        float f3 = this.f14650n;
        canvas.drawRoundRect(rectF, f3, f3, paint);
        if (z2) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.nr, this.f14650n);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.mUb;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.KN;
        return (colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful();
    }

    public float nr() {
        return this.f14650n;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.KN;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z2 = colorForState != this.rl.getColor();
        if (z2) {
            this.rl.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.mUb;
        if (colorStateList2 == null || (mode = this.gh) == null) {
            return z2;
        }
        this.xMQ = n(colorStateList2, mode);
        return true;
    }

    public ColorStateList rl() {
        return this.KN;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.rl.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.rl.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.mUb = colorStateList;
        this.xMQ = n(colorStateList, this.gh);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.gh = mode;
        this.xMQ = n(this.mUb, mode);
        invalidateSelf();
    }

    float t() {
        return this.f14649O;
    }

    RoundRectDrawable(ColorStateList colorStateList, float f3) {
        this.f14650n = f3;
        O(colorStateList);
        this.f14651t = new RectF();
        this.nr = new Rect();
    }

    public void J2(ColorStateList colorStateList) {
        O(colorStateList);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        xMQ(rect);
    }
}
