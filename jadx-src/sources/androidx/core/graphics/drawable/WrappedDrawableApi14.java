package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
class WrappedDrawableApi14 extends Drawable implements Drawable.Callback, WrappedDrawable, TintAwareDrawable {

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    static final PorterDuff.Mode f36443Z = PorterDuff.Mode.SRC_IN;
    WrappedDrawableState J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f36444O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f36445n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    Drawable f36446o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f36447r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private PorterDuff.Mode f36448t;

    protected boolean t() {
        return true;
    }

    private void O(Resources resources) {
        Drawable.ConstantState constantState;
        WrappedDrawableState wrappedDrawableState = this.J2;
        if (wrappedDrawableState == null || (constantState = wrappedDrawableState.rl) == null) {
            return;
        }
        rl(constantState.newDrawable(resources));
    }

    private WrappedDrawableState nr() {
        return new WrappedDrawableState(this.J2);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f36446o.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        WrappedDrawableState wrappedDrawableState = this.J2;
        if (wrappedDrawableState == null || !wrappedDrawableState.n()) {
            return null;
        }
        this.J2.f36450n = getChangingConfigurations();
        return this.J2;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        return this.f36446o.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f36446o.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f36446o.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getLayoutDirection() {
        return DrawableCompat.J2(this.f36446o);
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f36446o.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f36446o.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f36446o.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.f36446o.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        return this.f36446o.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f36446o.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return DrawableCompat.KN(this.f36446o);
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f36446o.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f36447r && super.mutate() == this) {
            this.J2 = nr();
            Drawable drawable = this.f36446o;
            if (drawable != null) {
                drawable.mutate();
            }
            WrappedDrawableState wrappedDrawableState = this.J2;
            if (wrappedDrawableState != null) {
                Drawable drawable2 = this.f36446o;
                wrappedDrawableState.rl = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f36447r = true;
        }
        return this;
    }

    @Override // androidx.core.graphics.drawable.WrappedDrawable
    public final Drawable n() {
        return this.f36446o;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f36446o;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i2) {
        return DrawableCompat.az(this.f36446o, i2);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i2) {
        return this.f36446o.setLevel(i2);
    }

    @Override // androidx.core.graphics.drawable.WrappedDrawable
    public final void rl(Drawable drawable) {
        Drawable drawable2 = this.f36446o;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f36446o = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            WrappedDrawableState wrappedDrawableState = this.J2;
            if (wrappedDrawableState != null) {
                wrappedDrawableState.rl = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.f36446o.setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z2) {
        DrawableCompat.mUb(this.f36446o, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i2) {
        this.f36446o.setChangingConfigurations(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f36446o.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z2) {
        this.f36446o.setDither(z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z2) {
        this.f36446o.setFilterBitmap(z2);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        return J2(iArr) || this.f36446o.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.J2.f36451t = colorStateList;
        J2(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.J2.nr = mode;
        J2(getState());
    }

    WrappedDrawableApi14(WrappedDrawableState wrappedDrawableState, Resources resources) {
        this.J2 = wrappedDrawableState;
        O(resources);
    }

    private boolean J2(int[] iArr) {
        if (!t()) {
            return false;
        }
        WrappedDrawableState wrappedDrawableState = this.J2;
        ColorStateList colorStateList = wrappedDrawableState.f36451t;
        PorterDuff.Mode mode = wrappedDrawableState.nr;
        if (colorStateList != null && mode != null) {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!this.f36444O || colorForState != this.f36445n || mode != this.f36448t) {
                setColorFilter(colorForState, mode);
                this.f36445n = colorForState;
                this.f36448t = mode;
                this.f36444O = true;
                return true;
            }
        } else {
            this.f36444O = false;
            clearColorFilter();
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int changingConfigurations;
        int changingConfigurations2 = super.getChangingConfigurations();
        WrappedDrawableState wrappedDrawableState = this.J2;
        if (wrappedDrawableState != null) {
            changingConfigurations = wrappedDrawableState.getChangingConfigurations();
        } else {
            changingConfigurations = 0;
        }
        return changingConfigurations2 | changingConfigurations | this.f36446o.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        WrappedDrawableState wrappedDrawableState;
        if (t() && (wrappedDrawableState = this.J2) != null) {
            colorStateList = wrappedDrawableState.f36451t;
        } else {
            colorStateList = null;
        }
        if ((colorStateList != null && colorStateList.isStateful()) || this.f36446o.isStateful()) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j2) {
        scheduleSelf(runnable, j2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i2) {
        setTintList(ColorStateList.valueOf(i2));
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z2, boolean z3) {
        if (!super.setVisible(z2, z3) && !this.f36446o.setVisible(z2, z3)) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
