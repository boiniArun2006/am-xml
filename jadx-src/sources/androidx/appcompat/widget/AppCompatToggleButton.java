package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import android.widget.ToggleButton;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.TintableCompoundDrawablesView;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class AppCompatToggleButton extends ToggleButton implements TintableBackgroundView, EmojiCompatConfigurationView, TintableCompoundDrawablesView {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private AppCompatEmojiTextHelper f14162O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AppCompatBackgroundHelper f14163n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final AppCompatTextHelper f14164t;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
    @RequiresApi
    @RestrictTo
    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private int f14165O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f14166n;
        private int nr;
        private int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f14167t;

        public void mapProperties(PropertyMapper propertyMapper) {
            this.rl = propertyMapper.mapObject("backgroundTint", R.attr.f13427S);
            this.f14167t = propertyMapper.mapObject("backgroundTintMode", R.attr.WPU);
            this.nr = propertyMapper.mapObject("drawableTint", R.attr.f13417E);
            this.f14165O = propertyMapper.mapObject("drawableTintMode", R.attr.f13424M);
            this.f14166n = true;
        }

        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void readProperties(AppCompatToggleButton appCompatToggleButton, PropertyReader propertyReader) {
            if (!this.f14166n) {
                throw w6.n();
            }
            propertyReader.readObject(this.rl, appCompatToggleButton.getBackgroundTintList());
            propertyReader.readObject(this.f14167t, appCompatToggleButton.getBackgroundTintMode());
            propertyReader.readObject(this.nr, appCompatToggleButton.getCompoundDrawableTintList());
            propertyReader.readObject(this.f14165O, appCompatToggleButton.getCompoundDrawableTintMode());
        }
    }

    public AppCompatToggleButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, android.R.attr.buttonStyleToggle);
    }

    public AppCompatToggleButton(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        ThemeUtils.n(this, getContext());
        AppCompatBackgroundHelper appCompatBackgroundHelper = new AppCompatBackgroundHelper(this);
        this.f14163n = appCompatBackgroundHelper;
        appCompatBackgroundHelper.O(attributeSet, i2);
        AppCompatTextHelper appCompatTextHelper = new AppCompatTextHelper(this);
        this.f14164t = appCompatTextHelper;
        appCompatTextHelper.az(attributeSet, i2);
        getEmojiTextViewHelper().t(attributeSet, i2);
    }

    @NonNull
    private AppCompatEmojiTextHelper getEmojiTextViewHelper() {
        if (this.f14162O == null) {
            this.f14162O = new AppCompatEmojiTextHelper(this);
        }
        return this.f14162O;
    }

    @Nullable
    @RestrictTo
    public ColorStateList getSupportBackgroundTintList() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f14163n;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.t();
        }
        return null;
    }

    @Nullable
    @RestrictTo
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f14163n;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.nr();
        }
        return null;
    }

    @Nullable
    @RestrictTo
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f14164t.mUb();
    }

    @Nullable
    @RestrictTo
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f14164t.gh();
    }

    @RestrictTo
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f14163n;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.xMQ(colorStateList);
        }
    }

    @RestrictTo
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f14163n;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.mUb(mode);
        }
    }

    @RestrictTo
    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList) {
        this.f14164t.WPU(colorStateList);
        this.f14164t.rl();
    }

    @RestrictTo
    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode mode) {
        this.f14164t.aYN(mode);
        this.f14164t.rl();
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f14163n;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.rl();
        }
        AppCompatTextHelper appCompatTextHelper = this.f14164t;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.rl();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().nr(z2);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f14163n;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.J2(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i2) {
        super.setBackgroundResource(i2);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f14163n;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.Uo(i2);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper appCompatTextHelper = this.f14164t;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.ck();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper appCompatTextHelper = this.f14164t;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.ck();
        }
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().O(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().n(inputFilterArr));
    }
}
