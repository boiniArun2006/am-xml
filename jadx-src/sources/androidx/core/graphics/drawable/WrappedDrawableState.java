package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
final class WrappedDrawableState extends Drawable.ConstantState {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f36450n;
    PorterDuff.Mode nr;
    Drawable.ConstantState rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    ColorStateList f36451t;

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        int i2 = this.f36450n;
        Drawable.ConstantState constantState = this.rl;
        return i2 | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    boolean n() {
        return this.rl != null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        return new WrappedDrawableApi21(this, resources);
    }

    WrappedDrawableState(WrappedDrawableState wrappedDrawableState) {
        this.f36451t = null;
        this.nr = WrappedDrawableApi14.f36443Z;
        if (wrappedDrawableState != null) {
            this.f36450n = wrappedDrawableState.f36450n;
            this.rl = wrappedDrawableState.rl;
            this.f36451t = wrappedDrawableState.f36451t;
            this.nr = wrappedDrawableState.nr;
        }
    }
}
