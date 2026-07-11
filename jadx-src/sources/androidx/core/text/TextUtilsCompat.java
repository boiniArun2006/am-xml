package androidx.core.text;

import android.text.TextUtils;
import java.util.Locale;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class TextUtilsCompat {
    public static int n(Locale locale) {
        return TextUtils.getLayoutDirectionFromLocale(locale);
    }
}
