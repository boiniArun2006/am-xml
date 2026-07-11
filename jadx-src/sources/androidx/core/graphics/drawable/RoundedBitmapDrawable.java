package androidx.core.graphics.drawable;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class RoundedBitmapDrawable extends Drawable {
    private float J2;
    private final RectF KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Matrix f36440O;
    final Rect Uo;
    private int gh;
    private boolean mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final Bitmap f36441n;
    private final BitmapShader nr;
    private int qie;
    private int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Paint f36442t;
    private boolean xMQ;

    private static boolean t(float f3) {
        return f3 > 0.05f;
    }

    private void nr() {
        this.J2 = Math.min(this.qie, this.gh) / 2;
    }

    void O() {
        RoundedBitmapDrawable roundedBitmapDrawable;
        if (this.xMQ) {
            if (this.mUb) {
                int iMin = Math.min(this.gh, this.qie);
                roundedBitmapDrawable = this;
                roundedBitmapDrawable.rl(this.rl, iMin, iMin, getBounds(), this.Uo);
                int iMin2 = Math.min(roundedBitmapDrawable.Uo.width(), roundedBitmapDrawable.Uo.height());
                roundedBitmapDrawable.Uo.inset(Math.max(0, (roundedBitmapDrawable.Uo.width() - iMin2) / 2), Math.max(0, (roundedBitmapDrawable.Uo.height() - iMin2) / 2));
                roundedBitmapDrawable.J2 = iMin2 * 0.5f;
            } else {
                roundedBitmapDrawable = this;
                roundedBitmapDrawable.rl(roundedBitmapDrawable.rl, roundedBitmapDrawable.gh, roundedBitmapDrawable.qie, getBounds(), roundedBitmapDrawable.Uo);
            }
            roundedBitmapDrawable.KN.set(roundedBitmapDrawable.Uo);
            if (roundedBitmapDrawable.nr != null) {
                Matrix matrix = roundedBitmapDrawable.f36440O;
                RectF rectF = roundedBitmapDrawable.KN;
                matrix.setTranslate(rectF.left, rectF.top);
                roundedBitmapDrawable.f36440O.preScale(roundedBitmapDrawable.KN.width() / roundedBitmapDrawable.f36441n.getWidth(), roundedBitmapDrawable.KN.height() / roundedBitmapDrawable.f36441n.getHeight());
                roundedBitmapDrawable.nr.setLocalMatrix(roundedBitmapDrawable.f36440O);
                roundedBitmapDrawable.f36442t.setShader(roundedBitmapDrawable.nr);
            }
            roundedBitmapDrawable.xMQ = false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Bitmap bitmap = this.f36441n;
        if (bitmap == null) {
            return;
        }
        O();
        if (this.f36442t.getShader() == null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.Uo, this.f36442t);
            return;
        }
        RectF rectF = this.KN;
        float f3 = this.J2;
        canvas.drawRoundRect(rectF, f3, f3, this.f36442t);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f36442t.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f36442t.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.qie;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.gh;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Bitmap bitmap;
        return (this.rl != 119 || this.mUb || (bitmap = this.f36441n) == null || bitmap.hasAlpha() || this.f36442t.getAlpha() < 255 || t(this.J2)) ? -3 : -1;
    }

    public float n() {
        return this.J2;
    }

    void rl(int i2, int i3, int i5, Rect rect, Rect rect2) {
        throw new UnsupportedOperationException();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        if (i2 != this.f36442t.getAlpha()) {
            this.f36442t.setAlpha(i2);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f36442t.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z2) {
        this.f36442t.setDither(z2);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z2) {
        this.f36442t.setFilterBitmap(z2);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.mUb) {
            nr();
        }
        this.xMQ = true;
    }
}
