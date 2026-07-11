package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.cardview.R;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
class RoundRectDrawableWithShadow extends Drawable {
    private static final double Ik = Math.cos(Math.toRadians(45.0d));

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    static RoundRectHelper f14652r;
    private float J2;
    private float KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final RectF f14653O;
    private Path Uo;
    private final int az;
    private ColorStateList gh;
    private float mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f14654n;
    private Paint nr;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Paint f14655t;
    private final int ty;
    private float xMQ;
    private boolean qie = true;
    private boolean HI = true;
    private boolean ck = false;
    private Paint rl = new Paint(5);

    interface RoundRectHelper {
        void n(Canvas canvas, RectF rectF, float f3, Paint paint);
    }

    private void o(float f3, float f4) {
        if (f3 < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + f3 + ". Must be >= 0");
        }
        if (f4 < 0.0f) {
            throw new IllegalArgumentException("Invalid max shadow size " + f4 + ". Must be >= 0");
        }
        float fZ = Z(f3);
        float fZ2 = Z(f4);
        if (fZ > fZ2) {
            if (!this.ck) {
                this.ck = true;
            }
            fZ = fZ2;
        }
        if (this.mUb == fZ && this.KN == fZ2) {
            return;
        }
        this.mUb = fZ;
        this.KN = fZ2;
        this.xMQ = (int) ((fZ * 1.5f) + this.f14654n + 0.5f);
        this.qie = true;
        invalidateSelf();
    }

    void ck(float f3) {
        if (f3 < 0.0f) {
            throw new IllegalArgumentException("Invalid radius " + f3 + ". Must be >= 0");
        }
        float f4 = (int) (f3 + 0.5f);
        if (this.J2 == f4) {
            return;
        }
        this.J2 = f4;
        this.qie = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    private void O(Canvas canvas) {
        Canvas canvas2;
        float f3 = this.J2;
        float f4 = (-f3) - this.xMQ;
        float f5 = f3 + this.f14654n + (this.mUb / 2.0f);
        float f6 = 2.0f * f5;
        boolean z2 = this.f14653O.width() - f6 > 0.0f;
        boolean z3 = this.f14653O.height() - f6 > 0.0f;
        int iSave = canvas.save();
        RectF rectF = this.f14653O;
        canvas.translate(rectF.left + f5, rectF.top + f5);
        canvas.drawPath(this.Uo, this.f14655t);
        if (z2) {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, f4, this.f14653O.width() - f6, -this.J2, this.nr);
        } else {
            canvas2 = canvas;
        }
        canvas2.restoreToCount(iSave);
        int iSave2 = canvas2.save();
        RectF rectF2 = this.f14653O;
        canvas2.translate(rectF2.right - f5, rectF2.bottom - f5);
        canvas2.rotate(180.0f);
        canvas2.drawPath(this.Uo, this.f14655t);
        if (z2) {
            canvas2.drawRect(0.0f, f4, this.f14653O.width() - f6, (-this.J2) + this.xMQ, this.nr);
        }
        canvas2.restoreToCount(iSave2);
        int iSave3 = canvas2.save();
        RectF rectF3 = this.f14653O;
        canvas2.translate(rectF3.left + f5, rectF3.bottom - f5);
        canvas2.rotate(270.0f);
        canvas2.drawPath(this.Uo, this.f14655t);
        if (z3) {
            canvas2.drawRect(0.0f, f4, this.f14653O.height() - f6, -this.J2, this.nr);
        }
        canvas2.restoreToCount(iSave3);
        int iSave4 = canvas2.save();
        RectF rectF4 = this.f14653O;
        canvas2.translate(rectF4.right - f5, rectF4.top + f5);
        canvas2.rotate(90.0f);
        canvas2.drawPath(this.Uo, this.f14655t);
        if (z3) {
            canvas2.drawRect(0.0f, f4, this.f14653O.height() - f6, -this.J2, this.nr);
        }
        canvas2.restoreToCount(iSave4);
    }

    private int Z(float f3) {
        int i2 = (int) (f3 + 0.5f);
        return i2 % 2 == 1 ? i2 - 1 : i2;
    }

    private void n(Rect rect) {
        float f3 = this.KN;
        float f4 = 1.5f * f3;
        this.f14653O.set(rect.left + f3, rect.top + f4, rect.right - f3, rect.bottom - f4);
        rl();
    }

    static float nr(float f3, float f4, boolean z2) {
        return z2 ? (float) (((double) (f3 * 1.5f)) + ((1.0d - Ik) * ((double) f4))) : f3 * 1.5f;
    }

    private void rl() {
        float f3 = this.J2;
        RectF rectF = new RectF(-f3, -f3, f3, f3);
        RectF rectF2 = new RectF(rectF);
        float f4 = this.xMQ;
        rectF2.inset(-f4, -f4);
        Path path = this.Uo;
        if (path == null) {
            this.Uo = new Path();
        } else {
            path.reset();
        }
        this.Uo.setFillType(Path.FillType.EVEN_ODD);
        this.Uo.moveTo(-this.J2, 0.0f);
        this.Uo.rLineTo(-this.xMQ, 0.0f);
        this.Uo.arcTo(rectF2, 180.0f, 90.0f, false);
        this.Uo.arcTo(rectF, 270.0f, -90.0f, false);
        this.Uo.close();
        float f5 = this.J2;
        float f6 = f5 / (this.xMQ + f5);
        Paint paint = this.f14655t;
        float f7 = this.J2 + this.xMQ;
        int i2 = this.az;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new RadialGradient(0.0f, 0.0f, f7, new int[]{i2, i2, this.ty}, new float[]{0.0f, f6, 1.0f}, tileMode));
        Paint paint2 = this.nr;
        float f8 = this.J2;
        float f9 = this.xMQ;
        float f10 = (-f8) + f9;
        float f11 = (-f8) - f9;
        int i3 = this.az;
        paint2.setShader(new LinearGradient(0.0f, f10, 0.0f, f11, new int[]{i3, i3, this.ty}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
        this.nr.setAntiAlias(false);
    }

    static float t(float f3, float f4, boolean z2) {
        return z2 ? (float) (((double) f3) + ((1.0d - Ik) * ((double) f4))) : f3;
    }

    private void ty(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.gh = colorStateList;
        this.rl.setColor(colorStateList.getColorForState(getState(), this.gh.getDefaultColor()));
    }

    void Ik(float f3) {
        o(this.mUb, f3);
    }

    ColorStateList J2() {
        return this.gh;
    }

    float Uo() {
        return this.J2;
    }

    void az(boolean z2) {
        this.HI = z2;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.qie) {
            n(getBounds());
            this.qie = false;
        }
        canvas.translate(0.0f, this.mUb / 2.0f);
        O(canvas);
        canvas.translate(0.0f, (-this.mUb) / 2.0f);
        f14652r.n(canvas, this.f14653O, this.J2, this.rl);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int iCeil = (int) Math.ceil(nr(this.KN, this.J2, this.HI));
        int iCeil2 = (int) Math.ceil(t(this.KN, this.J2, this.HI));
        rect.set(iCeil2, iCeil, iCeil2, iCeil);
        return true;
    }

    float gh() {
        float f3 = this.KN;
        return (Math.max(f3, this.J2 + this.f14654n + (f3 / 2.0f)) * 2.0f) + ((this.KN + this.f14654n) * 2.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.gh;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    float mUb() {
        float f3 = this.KN;
        return (Math.max(f3, this.J2 + this.f14654n + ((f3 * 1.5f) / 2.0f)) * 2.0f) + (((this.KN * 1.5f) + this.f14654n) * 2.0f);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.gh;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.rl.getColor() == colorForState) {
            return false;
        }
        this.rl.setColor(colorForState);
        this.qie = true;
        invalidateSelf();
        return true;
    }

    float qie() {
        return this.mUb;
    }

    void r(float f3) {
        o(f3, this.KN);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.rl.setAlpha(i2);
        this.f14655t.setAlpha(i2);
        this.nr.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.rl.setColorFilter(colorFilter);
    }

    float xMQ() {
        return this.KN;
    }

    RoundRectDrawableWithShadow(Resources resources, ColorStateList colorStateList, float f3, float f4, float f5) {
        this.az = resources.getColor(R.color.nr);
        this.ty = resources.getColor(R.color.f14632t);
        this.f14654n = resources.getDimensionPixelSize(R.dimen.f14633n);
        ty(colorStateList);
        Paint paint = new Paint(5);
        this.f14655t = paint;
        paint.setStyle(Paint.Style.FILL);
        this.J2 = (int) (f3 + 0.5f);
        this.f14653O = new RectF();
        Paint paint2 = new Paint(this.f14655t);
        this.nr = paint2;
        paint2.setAntiAlias(false);
        o(f4, f5);
    }

    void HI(ColorStateList colorStateList) {
        ty(colorStateList);
        invalidateSelf();
    }

    void KN(Rect rect) {
        getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.qie = true;
    }
}
