package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.annotation.DrawableRes;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.Px;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.UiThread;
import androidx.appcompat.R;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.core.graphics.TypefaceCompat;
import androidx.core.text.PrecomputedTextCompat;
import androidx.core.view.TintableBackgroundView;
import androidx.core.widget.AutoSizeableTextView;
import androidx.core.widget.TextViewCompat;
import androidx.core.widget.TintableCompoundDrawablesView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class AppCompatTextView extends TextView implements TintableBackgroundView, TintableCompoundDrawablesView, AutoSizeableTextView, EmojiCompatConfigurationView {
    private AppCompatEmojiTextHelper J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final AppCompatTextClassifierHelper f14147O;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private Future f14148S;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AppCompatBackgroundHelper f14149n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private SuperCaller f14150o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f14151r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final AppCompatTextHelper f14152t;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    @RequiresApi
    @RestrictTo
    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion {
        private int J2;
        private int KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private int f14153O;
        private int Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f14154n;
        private int nr;
        private int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private int f14155t;
        private int xMQ;

        public void mapProperties(PropertyMapper propertyMapper) {
            this.rl = propertyMapper.mapInt("autoSizeMaxTextSize", R.attr.f13441r);
            this.f14155t = propertyMapper.mapInt("autoSizeMinTextSize", R.attr.f13440o);
            this.nr = propertyMapper.mapInt("autoSizeStepGranularity", R.attr.f13432Z);
            this.f14153O = propertyMapper.mapIntEnum("autoSizeTextType", R.attr.XQ, new IntFunction<String>() { // from class: androidx.appcompat.widget.AppCompatTextView.InspectionCompanion.1
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
            this.f14154n = true;
        }

        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void readProperties(AppCompatTextView appCompatTextView, PropertyReader propertyReader) {
            if (!this.f14154n) {
                throw w6.n();
            }
            propertyReader.readInt(this.rl, appCompatTextView.getAutoSizeMaxTextSize());
            propertyReader.readInt(this.f14155t, appCompatTextView.getAutoSizeMinTextSize());
            propertyReader.readInt(this.nr, appCompatTextView.getAutoSizeStepGranularity());
            propertyReader.readIntEnum(this.f14153O, appCompatTextView.getAutoSizeTextType());
            propertyReader.readObject(this.J2, appCompatTextView.getBackgroundTintList());
            propertyReader.readObject(this.Uo, appCompatTextView.getBackgroundTintMode());
            propertyReader.readObject(this.KN, appCompatTextView.getCompoundDrawableTintList());
            propertyReader.readObject(this.xMQ, appCompatTextView.getCompoundDrawableTintMode());
        }
    }

    private interface SuperCaller {
        int[] J2();

        int KN();

        void O(int i2, float f3);

        TextClassifier Uo();

        int gh();

        void mUb(int i2);

        void n(int[] iArr, int i2);

        int nr();

        void qie(int i2);

        void rl(int i2);

        void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i3, int i5, int i7);

        int t();

        void xMQ(TextClassifier textClassifier);
    }

    @RequiresApi
    class SuperCallerApi26 implements SuperCaller {
        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public void O(int i2, float f3) {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public void mUb(int i2) {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public void rl(int i2) {
        }

        SuperCallerApi26() {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public int[] J2() {
            return AppCompatTextView.super.getAutoSizeTextAvailableSizes();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public int KN() {
            return AppCompatTextView.super.getAutoSizeMaxTextSize();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public TextClassifier Uo() {
            return AppCompatTextView.super.getTextClassifier();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public int gh() {
            return AppCompatTextView.super.getAutoSizeStepGranularity();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public void n(int[] iArr, int i2) {
            AppCompatTextView.super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public int nr() {
            return AppCompatTextView.super.getAutoSizeMinTextSize();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public void qie(int i2) {
            AppCompatTextView.super.setAutoSizeTextTypeWithDefaults(i2);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i3, int i5, int i7) {
            AppCompatTextView.super.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i5, i7);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public int t() {
            return AppCompatTextView.super.getAutoSizeTextType();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public void xMQ(TextClassifier textClassifier) {
            AppCompatTextView.super.setTextClassifier(textClassifier);
        }
    }

    @RequiresApi
    class SuperCallerApi28 extends SuperCallerApi26 {
        SuperCallerApi28() {
            super();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCallerApi26, androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public void mUb(int i2) {
            AppCompatTextView.super.setFirstBaselineToTopHeight(i2);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCallerApi26, androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public void rl(int i2) {
            AppCompatTextView.super.setLastBaselineToBottomHeight(i2);
        }
    }

    @RequiresApi
    class SuperCallerApi34 extends SuperCallerApi28 {
        SuperCallerApi34() {
            super();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.SuperCallerApi26, androidx.appcompat.widget.AppCompatTextView.SuperCaller
        public void O(int i2, float f3) {
            AppCompatTextView.super.setLineHeight(i2, f3);
        }
    }

    public AppCompatTextView(Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper appCompatTextHelper = this.f14152t;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.ck();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper appCompatTextHelper = this.f14152t;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.ck();
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(@IntRange @Px int i2) {
        TextViewCompat.ty(this, i2);
    }

    public AppCompatTextView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, android.R.attr.textViewStyle);
    }

    @NonNull
    private AppCompatEmojiTextHelper getEmojiTextViewHelper() {
        if (this.J2 == null) {
            this.J2 = new AppCompatEmojiTextHelper(this);
        }
        return this.J2;
    }

    private void r() {
        Future future = this.f14148S;
        if (future != null) {
            try {
                this.f14148S = null;
                TextViewCompat.ck(this, (PrecomputedTextCompat) future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView
    @RestrictTo
    public int getAutoSizeMaxTextSize() {
        if (ViewUtils.f14454t) {
            return getSuperCaller().KN();
        }
        AppCompatTextHelper appCompatTextHelper = this.f14152t;
        if (appCompatTextHelper != null) {
            return appCompatTextHelper.O();
        }
        return -1;
    }

    @Override // android.widget.TextView
    @RestrictTo
    public int getAutoSizeMinTextSize() {
        if (ViewUtils.f14454t) {
            return getSuperCaller().nr();
        }
        AppCompatTextHelper appCompatTextHelper = this.f14152t;
        if (appCompatTextHelper != null) {
            return appCompatTextHelper.J2();
        }
        return -1;
    }

    @Override // android.widget.TextView
    @RestrictTo
    public int getAutoSizeStepGranularity() {
        if (ViewUtils.f14454t) {
            return getSuperCaller().gh();
        }
        AppCompatTextHelper appCompatTextHelper = this.f14152t;
        if (appCompatTextHelper != null) {
            return appCompatTextHelper.Uo();
        }
        return -1;
    }

    @Override // android.widget.TextView
    @RestrictTo
    public int[] getAutoSizeTextAvailableSizes() {
        if (ViewUtils.f14454t) {
            return getSuperCaller().J2();
        }
        AppCompatTextHelper appCompatTextHelper = this.f14152t;
        return appCompatTextHelper != null ? appCompatTextHelper.KN() : new int[0];
    }

    @Override // android.widget.TextView
    @RestrictTo
    public int getAutoSizeTextType() {
        if (ViewUtils.f14454t) {
            return getSuperCaller().t() == 1 ? 1 : 0;
        }
        AppCompatTextHelper appCompatTextHelper = this.f14152t;
        if (appCompatTextHelper != null) {
            return appCompatTextHelper.xMQ();
        }
        return 0;
    }

    @RequiresApi
    @UiThread
    SuperCaller getSuperCaller() {
        if (this.f14150o == null) {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 34) {
                this.f14150o = new SuperCallerApi34();
            } else if (i2 >= 28) {
                this.f14150o = new SuperCallerApi28();
            } else if (i2 >= 26) {
                this.f14150o = new SuperCallerApi26();
            }
        }
        return this.f14150o;
    }

    @Nullable
    @RestrictTo
    public ColorStateList getSupportBackgroundTintList() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f14149n;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.t();
        }
        return null;
    }

    @Nullable
    @RestrictTo
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f14149n;
        if (appCompatBackgroundHelper != null) {
            return appCompatBackgroundHelper.nr();
        }
        return null;
    }

    @Nullable
    @RestrictTo
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f14152t.mUb();
    }

    @Nullable
    @RestrictTo
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f14152t.gh();
    }

    @Override // android.widget.TextView
    @NonNull
    @RequiresApi
    public TextClassifier getTextClassifier() {
        AppCompatTextClassifierHelper appCompatTextClassifierHelper;
        return (Build.VERSION.SDK_INT >= 28 || (appCompatTextClassifierHelper = this.f14147O) == null) ? getSuperCaller().Uo() : appCompatTextClassifierHelper.n();
    }

    @Override // android.widget.TextView, androidx.core.widget.AutoSizeableTextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i3, int i5, int i7) {
        if (ViewUtils.f14454t) {
            getSuperCaller().setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i5, i7);
            return;
        }
        AppCompatTextHelper appCompatTextHelper = this.f14152t;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.Z(i2, i3, i5, i7);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i2) {
        if (ViewUtils.f14454t) {
            getSuperCaller().n(iArr, i2);
            return;
        }
        AppCompatTextHelper appCompatTextHelper = this.f14152t;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.XQ(iArr, i2);
        }
    }

    @Override // android.widget.TextView
    @RestrictTo
    public void setAutoSizeTextTypeWithDefaults(int i2) {
        if (ViewUtils.f14454t) {
            getSuperCaller().qie(i2);
            return;
        }
        AppCompatTextHelper appCompatTextHelper = this.f14152t;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.S(i2);
        }
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(@IntRange @Px int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().mUb(i2);
        } else {
            TextViewCompat.qie(this, i2);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(@IntRange @Px int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().rl(i2);
        } else {
            TextViewCompat.az(this, i2);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i2, float f3) {
        if (Build.VERSION.SDK_INT >= 34) {
            getSuperCaller().O(i2, f3);
        } else {
            TextViewCompat.HI(this, i2, f3);
        }
    }

    @RestrictTo
    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f14149n;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.xMQ(colorStateList);
        }
    }

    @RestrictTo
    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f14149n;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.mUb(mode);
        }
    }

    @RestrictTo
    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList) {
        this.f14152t.WPU(colorStateList);
        this.f14152t.rl();
    }

    @RestrictTo
    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode mode) {
        this.f14152t.aYN(mode);
        this.f14152t.rl();
    }

    @Override // android.widget.TextView
    @RequiresApi
    public void setTextClassifier(@Nullable TextClassifier textClassifier) {
        AppCompatTextClassifierHelper appCompatTextClassifierHelper;
        if (Build.VERSION.SDK_INT >= 28 || (appCompatTextClassifierHelper = this.f14147O) == null) {
            getSuperCaller().xMQ(textClassifier);
        } else {
            appCompatTextClassifierHelper.rl(textClassifier);
        }
    }

    public void setTextFuture(@Nullable Future<PrecomputedTextCompat> future) {
        this.f14148S = future;
        if (future != null) {
            requestLayout();
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i2, float f3) {
        if (ViewUtils.f14454t) {
            super.setTextSize(i2, f3);
            return;
        }
        AppCompatTextHelper appCompatTextHelper = this.f14152t;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.g(i2, f3);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i2) {
        if (this.f14151r) {
            return;
        }
        Typeface typefaceN = (typeface == null || i2 <= 0) ? null : TypefaceCompat.n(getContext(), typeface, i2);
        this.f14151r = true;
        if (typefaceN != null) {
            typeface = typefaceN;
        }
        try {
            super.setTypeface(typeface, i2);
        } finally {
            this.f14151r = false;
        }
    }

    public AppCompatTextView(Context context, AttributeSet attributeSet, int i2) {
        super(TintContextWrapper.rl(context), attributeSet, i2);
        this.f14151r = false;
        this.f14150o = null;
        ThemeUtils.n(this, getContext());
        AppCompatBackgroundHelper appCompatBackgroundHelper = new AppCompatBackgroundHelper(this);
        this.f14149n = appCompatBackgroundHelper;
        appCompatBackgroundHelper.O(attributeSet, i2);
        AppCompatTextHelper appCompatTextHelper = new AppCompatTextHelper(this);
        this.f14152t = appCompatTextHelper;
        appCompatTextHelper.az(attributeSet, i2);
        appCompatTextHelper.rl();
        this.f14147O = new AppCompatTextClassifierHelper(this);
        getEmojiTextViewHelper().t(attributeSet, i2);
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f14149n;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.rl();
        }
        AppCompatTextHelper appCompatTextHelper = this.f14152t;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.rl();
        }
    }

    @Override // android.widget.TextView
    @Nullable
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return TextViewCompat.o(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return TextViewCompat.rl(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return TextViewCompat.t(this);
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        r();
        return super.getText();
    }

    @NonNull
    public PrecomputedTextCompat.Params getTextMetricsParamsCompat() {
        return TextViewCompat.Uo(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f14152t.r(this, inputConnectionOnCreateInputConnection, editorInfo);
        return AppCompatHintHelper.n(inputConnectionOnCreateInputConnection, editorInfo, this);
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 30 && i2 < 33 && onCheckIsTextEditor()) {
            ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i5, int i7) {
        super.onLayout(z2, i2, i3, i5, i7);
        AppCompatTextHelper appCompatTextHelper = this.f14152t;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.HI(z2, i2, i3, i5, i7);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i2, int i3) {
        r();
        super.onMeasure(i2, i3);
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i2, int i3, int i5) {
        super.onTextChanged(charSequence, i2, i3, i5);
        AppCompatTextHelper appCompatTextHelper = this.f14152t;
        if (appCompatTextHelper != null && !ViewUtils.f14454t && appCompatTextHelper.qie()) {
            this.f14152t.t();
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
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f14149n;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.J2(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@DrawableRes int i2) {
        super.setBackgroundResource(i2);
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.f14149n;
        if (appCompatBackgroundHelper != null) {
            appCompatBackgroundHelper.Uo(i2);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper appCompatTextHelper = this.f14152t;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.ck();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        AppCompatTextHelper appCompatTextHelper = this.f14152t;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.ck();
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

    public void setPrecomputedText(@NonNull PrecomputedTextCompat precomputedTextCompat) {
        TextViewCompat.ck(this, precomputedTextCompat);
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        AppCompatTextHelper appCompatTextHelper = this.f14152t;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.Ik(context, i2);
        }
    }

    public void setTextMetricsParamsCompat(@NonNull PrecomputedTextCompat.Params params) {
        TextViewCompat.r(this, params);
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i5, int i7) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i2 != 0 ? AppCompatResources.rl(context, i2) : null, i3 != 0 ? AppCompatResources.rl(context, i3) : null, i5 != 0 ? AppCompatResources.rl(context, i5) : null, i7 != 0 ? AppCompatResources.rl(context, i7) : null);
        AppCompatTextHelper appCompatTextHelper = this.f14152t;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.ck();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i5, int i7) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i2 != 0 ? AppCompatResources.rl(context, i2) : null, i3 != 0 ? AppCompatResources.rl(context, i3) : null, i5 != 0 ? AppCompatResources.rl(context, i5) : null, i7 != 0 ? AppCompatResources.rl(context, i7) : null);
        AppCompatTextHelper appCompatTextHelper = this.f14152t;
        if (appCompatTextHelper != null) {
            appCompatTextHelper.ck();
        }
    }
}
