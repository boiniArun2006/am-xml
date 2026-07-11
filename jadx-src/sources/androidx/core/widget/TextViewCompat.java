package androidx.core.widget;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.Editable;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.core.text.PrecomputedTextCompat;
import androidx.core.util.Preconditions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class TextViewCompat {

    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo
    public @interface AutoSizeTextType {
    }

    @RequiresApi
    private static class OreoCallback implements ActionMode.Callback {
        private boolean J2 = false;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private boolean f36958O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final ActionMode.Callback f36959n;
        private Method nr;
        private final TextView rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private Class f36960t;

        private boolean O(TextView textView) {
            return (textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled();
        }

        private void Uo(Menu menu) {
            Context context = this.rl.getContext();
            PackageManager packageManager = context.getPackageManager();
            boolean z2 = this.J2;
            Class cls = Integer.TYPE;
            if (!z2) {
                this.J2 = true;
                try {
                    Class<?> cls2 = Class.forName("com.android.internal.view.menu.MenuBuilder");
                    this.f36960t = cls2;
                    this.nr = cls2.getDeclaredMethod("removeItemAt", cls);
                    this.f36958O = true;
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                    this.f36960t = null;
                    this.nr = null;
                    this.f36958O = false;
                }
            }
            try {
                Method declaredMethod = (this.f36958O && this.f36960t.isInstance(menu)) ? this.nr : menu.getClass().getDeclaredMethod("removeItemAt", cls);
                for (int size = menu.size() - 1; size >= 0; size--) {
                    MenuItem item = menu.getItem(size);
                    if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                        declaredMethod.invoke(menu, Integer.valueOf(size));
                    }
                }
                List listT = t(context, packageManager);
                for (int i2 = 0; i2 < listT.size(); i2++) {
                    ResolveInfo resolveInfo = (ResolveInfo) listT.get(i2);
                    menu.add(0, 0, i2 + 100, resolveInfo.loadLabel(packageManager)).setIntent(rl(resolveInfo, this.rl)).setShowAsAction(1);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        private Intent n() {
            return new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
        }

        private List t(Context context, PackageManager packageManager) {
            ArrayList arrayList = new ArrayList();
            if (context instanceof Activity) {
                for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(n(), 0)) {
                    if (J2(resolveInfo, context)) {
                        arrayList.add(resolveInfo);
                    }
                }
            }
            return arrayList;
        }

        ActionMode.Callback nr() {
            return this.f36959n;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return this.f36959n.onActionItemClicked(actionMode, menuItem);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return this.f36959n.onCreateActionMode(actionMode, menu);
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            this.f36959n.onDestroyActionMode(actionMode);
        }

        OreoCallback(ActionMode.Callback callback, TextView textView) {
            this.f36959n = callback;
            this.rl = textView;
        }

        private boolean J2(ResolveInfo resolveInfo, Context context) {
            if (context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                return true;
            }
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            if (!activityInfo.exported) {
                return false;
            }
            String str = activityInfo.permission;
            if (str == null || context.checkSelfPermission(str) == 0) {
                return true;
            }
            return false;
        }

        private Intent rl(ResolveInfo resolveInfo, TextView textView) {
            Intent intentPutExtra = n().putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !O(textView));
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            return intentPutExtra.setClassName(activityInfo.packageName, activityInfo.name);
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            Uo(menu);
            return this.f36959n.onPrepareActionMode(actionMode, menu);
        }
    }

    @RequiresApi
    static class Api23Impl {
        static void J2(TextView textView, int i2) {
            textView.setHyphenationFrequency(i2);
        }

        static void O(TextView textView, PorterDuff.Mode mode) {
            textView.setCompoundDrawableTintMode(mode);
        }

        static int n(TextView textView) {
            return textView.getBreakStrategy();
        }

        static void nr(TextView textView, ColorStateList colorStateList) {
            textView.setCompoundDrawableTintList(colorStateList);
        }

        static int rl(TextView textView) {
            return textView.getHyphenationFrequency();
        }

        static void t(TextView textView, int i2) {
            textView.setBreakStrategy(i2);
        }
    }

    @RequiresApi
    static class Api24Impl {
        static DecimalFormatSymbols n(Locale locale) {
            return DecimalFormatSymbols.getInstance(locale);
        }
    }

    @RequiresApi
    static class Api26Impl {
        static void n(TextView textView, int i2, int i3, int i5, int i7) {
            textView.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i5, i7);
        }
    }

    @RequiresApi
    static class Api28Impl {
        static CharSequence n(PrecomputedText precomputedText) {
            return precomputedText;
        }

        static void nr(TextView textView, int i2) {
            textView.setFirstBaselineToTopHeight(i2);
        }

        static String[] rl(DecimalFormatSymbols decimalFormatSymbols) {
            return decimalFormatSymbols.getDigitStrings();
        }

        static PrecomputedText.Params t(TextView textView) {
            return textView.getTextMetricsParams();
        }
    }

    @RequiresApi
    static class Api34Impl {
        public static void n(TextView textView, int i2, float f3) {
            textView.setLineHeight(i2, f3);
        }
    }

    public static void HI(TextView textView, int i2, float f3) {
        if (Build.VERSION.SDK_INT >= 34) {
            Api34Impl.n(textView, i2, f3);
        } else {
            ty(textView, Math.round(TypedValue.applyDimension(i2, f3, textView.getResources().getDisplayMetrics())));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void KN(TextView textView, int i2, int i3, int i5, int i7) {
        if (Build.VERSION.SDK_INT >= 27) {
            Api26Impl.n(textView, i2, i3, i5, i7);
        } else if (textView instanceof AutoSizeableTextView) {
            ((AutoSizeableTextView) textView).setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i5, i7);
        }
    }

    private static int O(TextDirectionHeuristic textDirectionHeuristic) {
        TextDirectionHeuristic textDirectionHeuristic2;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        if (textDirectionHeuristic == textDirectionHeuristic3 || textDirectionHeuristic == (textDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            return 1;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.ANYRTL_LTR) {
            return 2;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LTR) {
            return 3;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.RTL) {
            return 4;
        }
        if (textDirectionHeuristic == TextDirectionHeuristics.LOCALE) {
            return 5;
        }
        if (textDirectionHeuristic == textDirectionHeuristic2) {
            return 6;
        }
        return textDirectionHeuristic == textDirectionHeuristic3 ? 7 : 1;
    }

    public static PrecomputedTextCompat.Params Uo(TextView textView) {
        if (Build.VERSION.SDK_INT >= 28) {
            return new PrecomputedTextCompat.Params(Api28Impl.t(textView));
        }
        PrecomputedTextCompat.Params.Builder builder = new PrecomputedTextCompat.Params.Builder(new TextPaint(textView.getPaint()));
        builder.rl(Api23Impl.n(textView));
        builder.t(Api23Impl.rl(textView));
        builder.nr(J2(textView));
        return builder.n();
    }

    public static ActionMode.Callback Z(TextView textView, ActionMode.Callback callback) {
        int i2 = Build.VERSION.SDK_INT;
        return (i2 < 26 || i2 > 27 || (callback instanceof OreoCallback) || callback == null) ? callback : new OreoCallback(callback, textView);
    }

    public static void ck(TextView textView, PrecomputedTextCompat precomputedTextCompat) {
        if (Build.VERSION.SDK_INT >= 29) {
            textView.setText(Api28Impl.n(precomputedTextCompat.t()));
        } else {
            if (!Uo(textView).n(precomputedTextCompat.rl())) {
                throw new IllegalArgumentException("Given text can not be applied to TextView.");
            }
            textView.setText(precomputedTextCompat);
        }
    }

    public static ActionMode.Callback o(ActionMode.Callback callback) {
        return (!(callback instanceof OreoCallback) || Build.VERSION.SDK_INT < 26) ? callback : ((OreoCallback) callback).nr();
    }

    public static void Ik(TextView textView, int i2) {
        textView.setTextAppearance(i2);
    }

    private static TextDirectionHeuristic J2(TextView textView) {
        if (textView.getTransformationMethod() instanceof PasswordTransformationMethod) {
            return TextDirectionHeuristics.LTR;
        }
        boolean z2 = true;
        if (Build.VERSION.SDK_INT >= 28 && (textView.getInputType() & 15) == 3) {
            byte directionality = Character.getDirectionality(Api28Impl.rl(Api24Impl.n(textView.getTextLocale()))[0].codePointAt(0));
            if (directionality != 1 && directionality != 2) {
                return TextDirectionHeuristics.LTR;
            }
            return TextDirectionHeuristics.RTL;
        }
        if (textView.getLayoutDirection() != 1) {
            z2 = false;
        }
        switch (textView.getTextDirection()) {
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            default:
                if (!z2) {
                }
                break;
        }
        return TextDirectionHeuristics.LTR;
    }

    public static void az(TextView textView, int i2) {
        int i3;
        Preconditions.nr(i2);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (textView.getIncludeFontPadding()) {
            i3 = fontMetricsInt.bottom;
        } else {
            i3 = fontMetricsInt.descent;
        }
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i2 - i3);
        }
    }

    public static void gh(TextView textView, Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        textView.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
    }

    public static void mUb(TextView textView, PorterDuff.Mode mode) {
        Preconditions.Uo(textView);
        Api23Impl.O(textView, mode);
    }

    public static Drawable[] n(TextView textView) {
        return textView.getCompoundDrawablesRelative();
    }

    public static int nr(TextView textView) {
        return textView.getMaxLines();
    }

    public static void qie(TextView textView, int i2) {
        int i3;
        Preconditions.nr(i2);
        if (Build.VERSION.SDK_INT >= 28) {
            Api28Impl.nr(textView, i2);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (textView.getIncludeFontPadding()) {
            i3 = fontMetricsInt.top;
        } else {
            i3 = fontMetricsInt.ascent;
        }
        if (i2 > Math.abs(i3)) {
            textView.setPadding(textView.getPaddingLeft(), i2 + i3, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void r(TextView textView, PrecomputedTextCompat.Params params) {
        textView.setTextDirection(O(params.nr()));
        textView.getPaint().set(params.O());
        Api23Impl.t(textView, params.rl());
        Api23Impl.J2(textView, params.t());
    }

    public static int rl(TextView textView) {
        return textView.getPaddingTop() - textView.getPaint().getFontMetricsInt().top;
    }

    public static int t(TextView textView) {
        return textView.getPaddingBottom() + textView.getPaint().getFontMetricsInt().bottom;
    }

    public static void ty(TextView textView, int i2) {
        Preconditions.nr(i2);
        if (i2 != textView.getPaint().getFontMetricsInt(null)) {
            textView.setLineSpacing(i2 - r0, 1.0f);
        }
    }

    public static void xMQ(TextView textView, ColorStateList colorStateList) {
        Preconditions.Uo(textView);
        Api23Impl.nr(textView, colorStateList);
    }
}
