package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import android.widget.RadioButton;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.TintableCompoundButton;
import androidx.core.widget.TintableCompoundDrawablesView;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class AppCompatRadioButton extends RadioButton implements TintableCompoundButton, TintableBackgroundView, EmojiCompatConfigurationView, TintableCompoundDrawablesView {
    private AppCompatEmojiTextHelper J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final AppCompatTextHelper f14105O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AppCompatCompoundButtonHelper f14106n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final AppCompatBackgroundHelper f14107t;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    @RequiresApi
    @RestrictTo
    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion {
        private int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private int f14108O;
        private int Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f14109n;
        private int nr;
        private int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f14110t;

        public void mapProperties(PropertyMapper propertyMapper) {
            this.rl = propertyMapper.mapObject("backgroundTint", R.attr.f13427S);
            this.f14110t = propertyMapper.mapObject("backgroundTintMode", R.attr.WPU);
            this.nr = propertyMapper.mapObject("buttonTint", R.attr.ViF);
            this.f14108O = propertyMapper.mapObject("buttonTintMode", R.attr.nY);
            this.J2 = propertyMapper.mapObject("drawableTint", R.attr.f13417E);
            this.Uo = propertyMapper.mapObject("drawableTintMode", R.attr.f13424M);
            this.f14109n = true;
        }

        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void readProperties(AppCompatRadioButton appCompatRadioButton, PropertyReader propertyReader) {
            if (!this.f14109n) {
                throw w6.n();
            }
            propertyReader.readObject(this.rl, appCompatRadioButton.getBackgroundTintList());
            propertyReader.readObject(this.f14110t, appCompatRadioButton.getBackgroundTintMode());
            propertyReader.readObject(this.nr, appCompatRadioButton.getButtonTintList());
            propertyReader.readObject(this.f14108O, appCompatRadioButton.getButtonTintMode());
            propertyReader.readObject(this.J2, appCompatRadioButton.getCompoundDrawableTintList());
            propertyReader.readObject(this.Uo, appCompatRadioButton.getCompoundDrawableTintMode());
        }
    }

    public AppCompatRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.eTf);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        AppCompatCompoundButtonHelper appCompatCompoundButtonHelper = this.f14106n;
        if (appCompatCompoundButtonHelper != null) {
            appCompatCompoundButtonHelper.O();
        }
    }

    public AppCompatRadioButton(Context context, AttributeSet attributeSet, int i2) {
        super(TintContextWrapper.rl(context), attributeSet, i2);
        ThemeUtils.n(this, getContext());
        AppCompatCompoundButtonHelper appCompatCompoundButtonHelper = new AppCompatCompoundButtonHelper(this);
        this.f14106n = appCompatCompoundButtonHelper;
        appCompatCompoundButtonHelper.nr(attributeSet, i2);
        AppCompatBackgroundHelper appCompatBackgroundHelper = new AppCompatBackgroundHelper(this);
        this.f14107t = appCompatBackgroundHelper;
        appCompatBackgroundHelper.O(attributeSet, i2);
        AppCompatTextHelper appCompatTextHelper = new AppCompatTextHelper(this);
        this.f14105O = appCompatTextHelper;
        appCompatTextHelper.az(attributeSet, i2);
        getEmojiTextViewHelper().t(attributeSet, i2);
    }

    @NonNull
    private AppCompatEmojiTextHelper getEmojiTextViewHelper() {
        if (this.J2 == null) {
            this.J2 = new AppCompatEmojiTextHelper(this);
        }
        return this.J2;
    }

    @Nullable
    @RestrictTo
    public ColorStateList getSupportBackgroundTintList() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f14107t;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.t();
        }
        return null;
    }

    @Nullable
    @RestrictTo
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f14107t;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.nr();
        }
        return null;
    }

    @Override // androidx.core.widget.TintableCompoundButton
    @Nullable
    @RestrictTo
    public ColorStateList getSupportButtonTintList() {
        AppCompatCompoundButtonHelper appCompatCompoundButtonHelper = this.f14106n;
        if (appCompatCompoundButtonHelper != null) {
            return appCompatCompoundButtonHelper.rl();
        }
        return null;
    }

    @Nullable
    @RestrictTo
    public PorterDuff.Mode getSupportButtonTintMode() {
        AppCompatCompoundButtonHelper appCompatCompoundButtonHelper = this.f14106n;
        if (appCompatCompoundButtonHelper != null) {
            return appCompatCompoundButtonHelper.t();
        }
        return null;
    }

    @Nullable
    @RestrictTo
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f14105O.mUb();
    }

    @Nullable
    @RestrictTo
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f14105O.gh();
    }

    @RestrictTo
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f14107t;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.xMQ(colorStateList);
        }
    }

    @RestrictTo
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f14107t;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.mUb(mode);
        }
    }

    @Override // androidx.core.widget.TintableCompoundButton
    @RestrictTo
    public void setSupportButtonTintList(@Nullable ColorStateList colorStateList) {
        AppCompatCompoundButtonHelper appCompatCompoundButtonHelper = this.f14106n;
        if (appCompatCompoundButtonHelper != null) {
            appCompatCompoundButtonHelper.J2(colorStateList);
        }
    }

    @Override // androidx.core.widget.TintableCompoundButton
    @RestrictTo
    public void setSupportButtonTintMode(@Nullable PorterDuff.Mode mode) {
        AppCompatCompoundButtonHelper appCompatCompoundButtonHelper = this.f14106n;
        if (appCompatCompoundButtonHelper != null) {
            appCompatCompoundButtonHelper.Uo(mode);
        }
    }

    @RestrictTo
    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList) {
        this.f14105O.WPU(colorStateList);
        this.f14105O.rl();
    }

    @RestrictTo
    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode mode) {
        this.f14105O.aYN(mode);
        this.f14105O.rl();
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f14107t;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.rl();
        }
        AppCompatTextHelper appCompatTextHelper = this.f14105O;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.rl();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().nr(z2);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f14107t;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.J2(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i2) {
        super.setBackgroundResource(i2);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f14107t;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.Uo(i2);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper appCompatTextHelper = this.f14105O;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.ck();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper appCompatTextHelper = this.f14105O;
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

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(@DrawableRes int i2) {
        setButtonDrawable(AppCompatResources.rl(getContext(), i2));
    }
}
