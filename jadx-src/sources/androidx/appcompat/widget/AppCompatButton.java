package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import android.widget.Button;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.AutoSizeableTextView;
import androidx.core.widget.TextViewCompat;
import androidx.core.widget.TintableCompoundDrawablesView;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class AppCompatButton extends Button implements TintableBackgroundView, AutoSizeableTextView, TintableCompoundDrawablesView, EmojiCompatConfigurationView {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private AppCompatEmojiTextHelper f14045O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AppCompatBackgroundHelper f14046n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final AppCompatTextHelper f14047t;

    @RequiresApi
    @RestrictTo
    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion {
        private int J2;
        private int KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private int f14048O;
        private int Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f14049n;
        private int nr;
        private int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f14050t;
        private int xMQ;

        public void mapProperties(PropertyMapper propertyMapper) {
            this.rl = propertyMapper.mapInt("autoSizeMaxTextSize", R.attr.f13441r);
            this.f14050t = propertyMapper.mapInt("autoSizeMinTextSize", R.attr.f13440o);
            this.nr = propertyMapper.mapInt("autoSizeStepGranularity", R.attr.f13432Z);
            this.f14048O = propertyMapper.mapIntEnum("autoSizeTextType", R.attr.XQ, new IntFunction<String>() { // from class: androidx.appcompat.widget.AppCompatButton.InspectionCompanion.1
                @Override // java.util.function.IntFunction
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public String apply(int i2) {
                    return i2 != 0 ? i2 != 1 ? String.valueOf(i2) : "uniform" : "none";
                }
            });
            this.J2 = propertyMapper.mapObject("backgroundTint", R.attr.f13427S);
            this.Uo = propertyMapper.mapObject("backgroundTintMode", R.attr.WPU);
            this.KN = propertyMapper.mapObject("drawableTint", R.attr.f13417E);
            this.xMQ = propertyMapper.mapObject("drawableTintMode", R.attr.f13424M);
            this.f14049n = true;
        }

        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void readProperties(AppCompatButton appCompatButton, PropertyReader propertyReader) {
            if (!this.f14049n) {
                throw w6.n();
            }
            propertyReader.readInt(this.rl, appCompatButton.getAutoSizeMaxTextSize());
            propertyReader.readInt(this.f14050t, appCompatButton.getAutoSizeMinTextSize());
            propertyReader.readInt(this.nr, appCompatButton.getAutoSizeStepGranularity());
            propertyReader.readIntEnum(this.f14048O, appCompatButton.getAutoSizeTextType());
            propertyReader.readObject(this.J2, appCompatButton.getBackgroundTintList());
            propertyReader.readObject(this.Uo, appCompatButton.getBackgroundTintMode());
            propertyReader.readObject(this.KN, appCompatButton.getCompoundDrawableTintList());
            propertyReader.readObject(this.xMQ, appCompatButton.getCompoundDrawableTintMode());
        }
    }

    public AppCompatButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.aYN);
    }

    public AppCompatButton(Context context, AttributeSet attributeSet, int i2) {
        super(TintContextWrapper.rl(context), attributeSet, i2);
        ThemeUtils.n(this, getContext());
        AppCompatBackgroundHelper appCompatBackgroundHelper = new AppCompatBackgroundHelper(this);
        this.f14046n = appCompatBackgroundHelper;
        appCompatBackgroundHelper.O(attributeSet, i2);
        AppCompatTextHelper appCompatTextHelper = new AppCompatTextHelper(this);
        this.f14047t = appCompatTextHelper;
        appCompatTextHelper.az(attributeSet, i2);
        appCompatTextHelper.rl();
        getEmojiTextViewHelper().t(attributeSet, i2);
    }

    @NonNull
    private AppCompatEmojiTextHelper getEmojiTextViewHelper() {
        if (this.f14045O == null) {
            this.f14045O = new AppCompatEmojiTextHelper(this);
        }
        return this.f14045O;
    }

    @Override // android.widget.TextView
    @RestrictTo
    public int getAutoSizeMaxTextSize() {
        if (ViewUtils.f14454t) {
            return super.getAutoSizeMaxTextSize();
        }
        AppCompatTextHelper appCompatTextHelper = this.f14047t;
        if (appCompatTextHelper != null) {
            return appCompatTextHelper.O();
        }
        return -1;
    }

    @Override // android.widget.TextView
    @RestrictTo
    public int getAutoSizeMinTextSize() {
        if (ViewUtils.f14454t) {
            return super.getAutoSizeMinTextSize();
        }
        AppCompatTextHelper appCompatTextHelper = this.f14047t;
        if (appCompatTextHelper != null) {
            return appCompatTextHelper.J2();
        }
        return -1;
    }

    @Override // android.widget.TextView
    @RestrictTo
    public int getAutoSizeStepGranularity() {
        if (ViewUtils.f14454t) {
            return super.getAutoSizeStepGranularity();
        }
        AppCompatTextHelper appCompatTextHelper = this.f14047t;
        if (appCompatTextHelper != null) {
            return appCompatTextHelper.Uo();
        }
        return -1;
    }

    @Override // android.widget.TextView
    @RestrictTo
    public int[] getAutoSizeTextAvailableSizes() {
        if (ViewUtils.f14454t) {
            return super.getAutoSizeTextAvailableSizes();
        }
        AppCompatTextHelper appCompatTextHelper = this.f14047t;
        return appCompatTextHelper != null ? appCompatTextHelper.KN() : new int[0];
    }

    @Override // android.widget.TextView
    @RestrictTo
    public int getAutoSizeTextType() {
        if (ViewUtils.f14454t) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        AppCompatTextHelper appCompatTextHelper = this.f14047t;
        if (appCompatTextHelper != null) {
            return appCompatTextHelper.xMQ();
        }
        return 0;
    }

    @Nullable
    @RestrictTo
    public ColorStateList getSupportBackgroundTintList() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f14046n;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.t();
        }
        return null;
    }

    @Nullable
    @RestrictTo
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f14046n;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.nr();
        }
        return null;
    }

    @Nullable
    @RestrictTo
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f14047t.mUb();
    }

    @Nullable
    @RestrictTo
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f14047t.gh();
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i3, int i5, int i7) {
        if (ViewUtils.f14454t) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i5, i7);
            return;
        }
        AppCompatTextHelper appCompatTextHelper = this.f14047t;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.Z(i2, i3, i5, i7);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i2) {
        if (ViewUtils.f14454t) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
            return;
        }
        AppCompatTextHelper appCompatTextHelper = this.f14047t;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.XQ(iArr, i2);
        }
    }

    @Override // android.widget.TextView
    @RestrictTo
    public void setAutoSizeTextTypeWithDefaults(int i2) {
        if (ViewUtils.f14454t) {
            super.setAutoSizeTextTypeWithDefaults(i2);
            return;
        }
        AppCompatTextHelper appCompatTextHelper = this.f14047t;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.S(i2);
        }
    }

    public void setSupportAllCaps(boolean z2) {
        AppCompatTextHelper appCompatTextHelper = this.f14047t;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.o(z2);
        }
    }

    @RestrictTo
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f14046n;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.xMQ(colorStateList);
        }
    }

    @RestrictTo
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f14046n;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.mUb(mode);
        }
    }

    @RestrictTo
    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList) {
        this.f14047t.WPU(colorStateList);
        this.f14047t.rl();
    }

    @RestrictTo
    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode mode) {
        this.f14047t.aYN(mode);
        this.f14047t.rl();
    }

    @Override // android.widget.TextView
    public void setTextSize(int i2, float f3) {
        if (ViewUtils.f14454t) {
            super.setTextSize(i2, f3);
            return;
        }
        AppCompatTextHelper appCompatTextHelper = this.f14047t;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.g(i2, f3);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f14046n;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.rl();
        }
        AppCompatTextHelper appCompatTextHelper = this.f14047t;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.rl();
        }
    }

    @Override // android.widget.TextView
    @Nullable
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return TextViewCompat.o(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i5, int i7) {
        super.onLayout(z2, i2, i3, i5, i7);
        AppCompatTextHelper appCompatTextHelper = this.f14047t;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.HI(z2, i2, i3, i5, i7);
        }
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i2, int i3, int i5) {
        super.onTextChanged(charSequence, i2, i3, i5);
        AppCompatTextHelper appCompatTextHelper = this.f14047t;
        if (appCompatTextHelper != null && !ViewUtils.f14454t && appCompatTextHelper.qie()) {
            this.f14047t.t();
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
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f14046n;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.J2(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i2) {
        super.setBackgroundResource(i2);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f14046n;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.Uo(i2);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@Nullable ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.Z(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().O(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().n(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        AppCompatTextHelper appCompatTextHelper = this.f14047t;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.Ik(context, i2);
        }
    }
}
