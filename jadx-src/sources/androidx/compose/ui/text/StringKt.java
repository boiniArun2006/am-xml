package androidx.compose.ui.text;

import androidx.compose.ui.text.intl.Locale;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.platform.AndroidStringDelegate_androidKt;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0004\u001a\u0019\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0006\u0010\u0004\u001a\u0019\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\u0004\u001a\u0019\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0019\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\f\u0010\u000b\u001a\u0019\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000b\u001a\u0019\u0010\u000e\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000b\"\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0010¨\u0006\u0012"}, d2 = {"", "Landroidx/compose/ui/text/intl/Locale;", "locale", "Uo", "(Ljava/lang/String;Landroidx/compose/ui/text/intl/Locale;)Ljava/lang/String;", "O", c.f62177j, "t", "Landroidx/compose/ui/text/intl/LocaleList;", "localeList", "KN", "(Ljava/lang/String;Landroidx/compose/ui/text/intl/LocaleList;)Ljava/lang/String;", "J2", "rl", "nr", "Landroidx/compose/ui/text/PlatformStringDelegate;", "Landroidx/compose/ui/text/PlatformStringDelegate;", "stringDelegate", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class StringKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final PlatformStringDelegate f33494n = AndroidStringDelegate_androidKt.n();

    public static final String O(String str, Locale locale) {
        return f33494n.rl(str, locale.getPlatformLocale());
    }

    public static final String Uo(String str, Locale locale) {
        return f33494n.t(str, locale.getPlatformLocale());
    }

    public static final String n(String str, Locale locale) {
        return f33494n.nr(str, locale.getPlatformLocale());
    }

    public static final String t(String str, Locale locale) {
        return f33494n.n(str, locale.getPlatformLocale());
    }

    public static final String J2(String str, LocaleList localeList) {
        Locale localeJ2;
        if (localeList.isEmpty()) {
            localeJ2 = Locale.INSTANCE.n();
        } else {
            localeJ2 = localeList.J2(0);
        }
        return O(str, localeJ2);
    }

    public static final String KN(String str, LocaleList localeList) {
        Locale localeJ2;
        if (localeList.isEmpty()) {
            localeJ2 = Locale.INSTANCE.n();
        } else {
            localeJ2 = localeList.J2(0);
        }
        return Uo(str, localeJ2);
    }

    public static final String nr(String str, LocaleList localeList) {
        Locale localeJ2;
        if (localeList.isEmpty()) {
            localeJ2 = Locale.INSTANCE.n();
        } else {
            localeJ2 = localeList.J2(0);
        }
        return t(str, localeJ2);
    }

    public static final String rl(String str, LocaleList localeList) {
        Locale localeJ2;
        if (localeList.isEmpty()) {
            localeJ2 = Locale.INSTANCE.n();
        } else {
            localeJ2 = localeList.J2(0);
        }
        return n(str, localeJ2);
    }
}
