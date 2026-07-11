package OLt;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class CN3 extends Drawable implements Drawable.Callback, Ew, Z, w6 {
    private static final Matrix J2 = new Matrix();

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    protected Ew f7316O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Drawable f7317n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Ml f7318t = new Ml();

    @Override // OLt.Z
    public void Uo(Ew ew) {
        this.f7316O = ew;
    }

    protected Drawable ck(Drawable drawable) {
        Drawable drawable2 = this.f7317n;
        I28.nr(drawable2, null, null);
        I28.nr(drawable, null, null);
        I28.O(drawable, this.f7318t);
        I28.n(drawable, this);
        I28.nr(drawable, this, this);
        this.f7317n = drawable;
        return drawable2;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f7317n;
        if (drawable != null) {
            drawable.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        Drawable drawable = this.f7317n;
        return drawable == null ? super.getConstantState() : drawable.getConstantState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f7317n;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f7317n;
        return drawable == null ? super.getIntrinsicHeight() : drawable.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f7317n;
        return drawable == null ? super.getIntrinsicWidth() : drawable.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f7317n;
        if (drawable == null) {
            return 0;
        }
        return drawable.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Drawable drawable = this.f7317n;
        return drawable == null ? super.getPadding(rect) : drawable.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f7317n;
        if (drawable == null) {
            return false;
        }
        return drawable.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f7317n;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f7317n;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i2) {
        Drawable drawable = this.f7317n;
        return drawable == null ? super.onLevelChange(i2) : drawable.setLevel(i2);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f7317n;
        return drawable == null ? super.onStateChange(iArr) : drawable.setState(iArr);
    }

    @Override // OLt.Ew
    public void qie(RectF rectF) {
        Ew ew = this.f7316O;
        if (ew != null) {
            ew.qie(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.f7318t.rl(i2);
        Drawable drawable = this.f7317n;
        if (drawable != null) {
            drawable.setAlpha(i2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f7318t.t(colorFilter);
        Drawable drawable = this.f7317n;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z2) {
        this.f7318t.nr(z2);
        Drawable drawable = this.f7317n;
        if (drawable != null) {
            drawable.setDither(z2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z2) {
        this.f7318t.O(z2);
        Drawable drawable = this.f7317n;
        if (drawable != null) {
            drawable.setFilterBitmap(z2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f3, float f4) {
        Drawable drawable = this.f7317n;
        if (drawable != null) {
            drawable.setHotspot(f3, f4);
        }
    }

    protected void ty(Matrix matrix) {
        Ew ew = this.f7316O;
        if (ew != null) {
            ew.nr(matrix);
        } else {
            matrix.reset();
        }
    }

    public CN3(Drawable drawable) {
        this.f7317n = drawable;
        I28.nr(drawable, this, this);
    }

    public Drawable HI(Drawable drawable) {
        Drawable drawableCk = ck(drawable);
        invalidateSelf();
        return drawableCk;
    }

    @Override // OLt.w6
    public Drawable O(Drawable drawable) {
        return HI(drawable);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // OLt.w6
    public Drawable n() {
        return getCurrent();
    }

    @Override // OLt.Ew
    public void nr(Matrix matrix) {
        ty(matrix);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        scheduleSelf(runnable, j2);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z2, boolean z3) {
        boolean visible = super.setVisible(z2, z3);
        Drawable drawable = this.f7317n;
        if (drawable == null) {
            return visible;
        }
        return drawable.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
