package AL;

import Be4.Dsr;
import Z.CN3;
import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class Ml extends Drawable implements Drawable.Callback, Animatable {
    private float J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private float f37O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Drawable f38n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f39r = 1.0f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final CN3 f40t;

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f38n.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.f38n.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f38n.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f38n.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f38n.getOpacity();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Object obj = this.f38n;
        return (obj instanceof Animatable) && ((Animatable) obj).isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        int intrinsicWidth = this.f38n.getIntrinsicWidth();
        int intrinsicHeight = this.f38n.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            this.f38n.setBounds(rect);
            this.f37O = 0.0f;
            this.J2 = 0.0f;
            this.f39r = 1.0f;
            return;
        }
        int iWidth = rect.width();
        int iHeight = rect.height();
        double dT = Dsr.t(intrinsicWidth, intrinsicHeight, iWidth, iHeight, this.f40t);
        double d2 = 2;
        int iRoundToInt = MathKt.roundToInt((((double) iWidth) - (((double) intrinsicWidth) * dT)) / d2);
        int iRoundToInt2 = MathKt.roundToInt((((double) iHeight) - (((double) intrinsicHeight) * dT)) / d2);
        this.f38n.setBounds(iRoundToInt, iRoundToInt2, intrinsicWidth + iRoundToInt, intrinsicHeight + iRoundToInt2);
        this.f37O = rect.left;
        this.J2 = rect.top;
        this.f39r = (float) dT;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i2) {
        return this.f38n.setLevel(i2);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        return this.f38n.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.f38n.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f38n.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i2) {
        this.f38n.setTint(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintBlendMode(BlendMode blendMode) {
        this.f38n.setTintBlendMode(blendMode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f38n.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f38n.setTintMode(mode);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Object obj = this.f38n;
        if (obj instanceof Animatable) {
            ((Animatable) obj).start();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Object obj = this.f38n;
        if (obj instanceof Animatable) {
            ((Animatable) obj).stop();
        }
    }

    public Ml(Drawable drawable, CN3 cn3) {
        this.f38n = drawable;
        this.f40t = cn3;
        drawable.setCallback(this);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int iSave = canvas.save();
        try {
            canvas.translate(this.f37O, this.J2);
            float f3 = this.f39r;
            canvas.scale(f3, f3);
            this.f38n.draw(canvas);
        } finally {
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        scheduleSelf(runnable, j2);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
