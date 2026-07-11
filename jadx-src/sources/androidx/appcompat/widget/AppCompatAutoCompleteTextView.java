package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import android.widget.AutoCompleteTextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.TextViewCompat;
import androidx.core.widget.TintableCompoundDrawablesView;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public class AppCompatAutoCompleteTextView extends AutoCompleteTextView implements TintableBackgroundView, EmojiCompatConfigurationView, TintableCompoundDrawablesView {
    private static final int[] J2 = {R.attr.popupBackground};

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final AppCompatEmojiEditTextHelper f14036O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AppCompatBackgroundHelper f14037n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final AppCompatTextHelper f14038t;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
    @RequiresApi
    @RestrictTo
    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private int f14039O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f14040n;
        private int nr;
        private int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f14041t;

        public void mapProperties(PropertyMapper propertyMapper) {
            this.rl = propertyMapper.mapObject("backgroundTint", androidx.appcompat.R.attr.f13427S);
            this.f14041t = propertyMapper.mapObject("backgroundTintMode", androidx.appcompat.R.attr.WPU);
            this.nr = propertyMapper.mapObject("drawableTint", androidx.appcompat.R.attr.f13417E);
            this.f14039O = propertyMapper.mapObject("drawableTintMode", androidx.appcompat.R.attr.f13424M);
            this.f14040n = true;
        }

        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void readProperties(AppCompatAutoCompleteTextView appCompatAutoCompleteTextView, PropertyReader propertyReader) {
            if (!this.f14040n) {
                throw w6.n();
            }
            propertyReader.readObject(this.rl, appCompatAutoCompleteTextView.getBackgroundTintList());
            propertyReader.readObject(this.f14041t, appCompatAutoCompleteTextView.getBackgroundTintMode());
            propertyReader.readObject(this.nr, appCompatAutoCompleteTextView.getCompoundDrawableTintList());
            propertyReader.readObject(this.f14039O, appCompatAutoCompleteTextView.getCompoundDrawableTintMode());
        }
    }

    public AppCompatAutoCompleteTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, androidx.appcompat.R.attr.Ik);
    }

    public AppCompatAutoCompleteTextView(Context context, AttributeSet attributeSet, int i2) {
        super(TintContextWrapper.rl(context), attributeSet, i2);
        ThemeUtils.n(this, getContext());
        TintTypedArray tintTypedArrayS = TintTypedArray.S(getContext(), attributeSet, J2, i2, 0);
        if (tintTypedArrayS.o(0)) {
            setDropDownBackgroundDrawable(tintTypedArrayS.Uo(0));
        }
        tintTypedArrayS.aYN();
        AppCompatBackgroundHelper appCompatBackgroundHelper = new AppCompatBackgroundHelper(this);
        this.f14037n = appCompatBackgroundHelper;
        appCompatBackgroundHelper.O(attributeSet, i2);
        AppCompatTextHelper appCompatTextHelper = new AppCompatTextHelper(this);
        this.f14038t = appCompatTextHelper;
        appCompatTextHelper.az(attributeSet, i2);
        appCompatTextHelper.rl();
        AppCompatEmojiEditTextHelper appCompatEmojiEditTextHelper = new AppCompatEmojiEditTextHelper(this);
        this.f14036O = appCompatEmojiEditTextHelper;
        appCompatEmojiEditTextHelper.t(attributeSet, i2);
        n(appCompatEmojiEditTextHelper);
    }

    @Nullable
    @RestrictTo
    public ColorStateList getSupportBackgroundTintList() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f14037n;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.t();
        }
        return null;
    }

    @Nullable
    @RestrictTo
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f14037n;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.nr();
        }
        return null;
    }

    @Nullable
    @RestrictTo
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f14038t.mUb();
    }

    @Nullable
    @RestrictTo
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f14038t.gh();
    }

    public void setEmojiCompatEnabled(boolean z2) {
        this.f14036O.O(z2);
    }

    @Override // android.widget.TextView
    public void setKeyListener(@Nullable KeyListener keyListener) {
        super.setKeyListener(this.f14036O.n(keyListener));
    }

    @RestrictTo
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f14037n;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.xMQ(colorStateList);
        }
    }

    @RestrictTo
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f14037n;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.mUb(mode);
        }
    }

    @RestrictTo
    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList) {
        this.f14038t.WPU(colorStateList);
        this.f14038t.rl();
    }

    @RestrictTo
    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode mode) {
        this.f14038t.aYN(mode);
        this.f14038t.rl();
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f14037n;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.rl();
        }
        AppCompatTextHelper appCompatTextHelper = this.f14038t;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.rl();
        }
    }

    @Override // android.widget.TextView
    @Nullable
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return TextViewCompat.o(super.getCustomSelectionActionModeCallback());
    }

    void n(AppCompatEmojiEditTextHelper appCompatEmojiEditTextHelper) {
        KeyListener keyListener = getKeyListener();
        if (appCompatEmojiEditTextHelper.rl(keyListener)) {
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListenerN = appCompatEmojiEditTextHelper.n(keyListener);
            if (keyListenerN != keyListener) {
                super.setKeyListener(keyListenerN);
                super.setRawInputType(inputType);
                super.setFocusable(zIsFocusable);
                super.setClickable(zIsClickable);
                super.setLongClickable(zIsLongClickable);
            }
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.f14036O.nr(AppCompatHintHelper.n(super.onCreateInputConnection(editorInfo), editorInfo, this), editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f14037n;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.J2(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i2) {
        super.setBackgroundResource(i2);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f14037n;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.Uo(i2);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper appCompatTextHelper = this.f14038t;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.ck();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper appCompatTextHelper = this.f14038t;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.ck();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@Nullable ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(TextViewCompat.Z(this, callback));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(@DrawableRes int i2) {
        setDropDownBackgroundDrawable(AppCompatResources.rl(getContext(), i2));
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        AppCompatTextHelper appCompatTextHelper = this.f14038t;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.Ik(context, i2);
        }
    }
}
