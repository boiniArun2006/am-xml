package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import android.widget.ImageButton;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.TintableImageSourceView;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class AppCompatImageButton extends ImageButton implements TintableBackgroundView, TintableImageSourceView {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private boolean f14081O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AppCompatBackgroundHelper f14082n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final AppCompatImageHelper f14083t;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
    @RequiresApi
    @RestrictTo
    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private int f14084O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f14085n;
        private int nr;
        private int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f14086t;

        public void mapProperties(PropertyMapper propertyMapper) {
            this.rl = propertyMapper.mapObject("backgroundTint", R.attr.f13427S);
            this.f14086t = propertyMapper.mapObject("backgroundTintMode", R.attr.WPU);
            this.nr = propertyMapper.mapObject("tint", R.attr.Org);
            this.f14084O = propertyMapper.mapObject("tintMode", R.attr.HV);
            this.f14085n = true;
        }

        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void readProperties(AppCompatImageButton appCompatImageButton, PropertyReader propertyReader) {
            if (!this.f14085n) {
                throw w6.n();
            }
            propertyReader.readObject(this.rl, appCompatImageButton.getBackgroundTintList());
            propertyReader.readObject(this.f14086t, appCompatImageButton.getBackgroundTintMode());
            propertyReader.readObject(this.nr, appCompatImageButton.getImageTintList());
            propertyReader.readObject(this.f14084O, appCompatImageButton.getImageTintMode());
        }
    }

    public AppCompatImageButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.f13416D);
    }

    public AppCompatImageButton(Context context, AttributeSet attributeSet, int i2) {
        super(TintContextWrapper.rl(context), attributeSet, i2);
        this.f14081O = false;
        ThemeUtils.n(this, getContext());
        AppCompatBackgroundHelper appCompatBackgroundHelper = new AppCompatBackgroundHelper(this);
        this.f14082n = appCompatBackgroundHelper;
        appCompatBackgroundHelper.O(attributeSet, i2);
        AppCompatImageHelper appCompatImageHelper = new AppCompatImageHelper(this);
        this.f14083t = appCompatImageHelper;
        appCompatImageHelper.Uo(attributeSet, i2);
    }

    @Nullable
    @RestrictTo
    public ColorStateList getSupportBackgroundTintList() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f14082n;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.t();
        }
        return null;
    }

    @Nullable
    @RestrictTo
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f14082n;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.nr();
        }
        return null;
    }

    @Nullable
    @RestrictTo
    public ColorStateList getSupportImageTintList() {
        AppCompatImageHelper appCompatImageHelper = this.f14083t;
        if (appCompatImageHelper != null) {
            return appCompatImageHelper.nr();
        }
        return null;
    }

    @Nullable
    @RestrictTo
    public PorterDuff.Mode getSupportImageTintMode() {
        AppCompatImageHelper appCompatImageHelper = this.f14083t;
        if (appCompatImageHelper != null) {
            return appCompatImageHelper.O();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f14083t.J2() && super.hasOverlappingRendering();
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@Nullable Drawable drawable) {
        AppCompatImageHelper appCompatImageHelper = this.f14083t;
        if (appCompatImageHelper != null && drawable != null && !this.f14081O) {
            appCompatImageHelper.KN(drawable);
        }
        super.setImageDrawable(drawable);
        AppCompatImageHelper appCompatImageHelper2 = this.f14083t;
        if (appCompatImageHelper2 != null) {
            appCompatImageHelper2.t();
            if (this.f14081O) {
                return;
            }
            this.f14083t.rl();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(@DrawableRes int i2) {
        this.f14083t.xMQ(i2);
    }

    @RestrictTo
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f14082n;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.xMQ(colorStateList);
        }
    }

    @RestrictTo
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f14082n;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.mUb(mode);
        }
    }

    @RestrictTo
    public void setSupportImageTintList(@Nullable ColorStateList colorStateList) {
        AppCompatImageHelper appCompatImageHelper = this.f14083t;
        if (appCompatImageHelper != null) {
            appCompatImageHelper.mUb(colorStateList);
        }
    }

    @RestrictTo
    public void setSupportImageTintMode(@Nullable PorterDuff.Mode mode) {
        AppCompatImageHelper appCompatImageHelper = this.f14083t;
        if (appCompatImageHelper != null) {
            appCompatImageHelper.gh(mode);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f14082n;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.rl();
        }
        AppCompatImageHelper appCompatImageHelper = this.f14083t;
        if (appCompatImageHelper != null) {
            appCompatImageHelper.t();
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f14082n;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.J2(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i2) {
        super.setBackgroundResource(i2);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f14082n;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.Uo(i2);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        AppCompatImageHelper appCompatImageHelper = this.f14083t;
        if (appCompatImageHelper != null) {
            appCompatImageHelper.t();
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i2) {
        super.setImageLevel(i2);
        this.f14081O = true;
    }

    @Override // android.widget.ImageView
    public void setImageURI(@Nullable Uri uri) {
        super.setImageURI(uri);
        AppCompatImageHelper appCompatImageHelper = this.f14083t;
        if (appCompatImageHelper != null) {
            appCompatImageHelper.t();
        }
    }
}
