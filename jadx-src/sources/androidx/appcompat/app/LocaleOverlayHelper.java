package androidx.appcompat.app;

import androidx.annotation.RequiresApi;
import androidx.core.os.LocaleListCompat;
import java.util.LinkedHashSet;
import java.util.Locale;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@RequiresApi
final class LocaleOverlayHelper {
    private static LocaleListCompat n(LocaleListCompat localeListCompat, LocaleListCompat localeListCompat2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i2 = 0;
        while (i2 < localeListCompat.KN() + localeListCompat2.KN()) {
            Locale localeNr = i2 < localeListCompat.KN() ? localeListCompat.nr(i2) : localeListCompat2.nr(i2 - localeListCompat.KN());
            if (localeNr != null) {
                linkedHashSet.add(localeNr);
            }
            i2++;
        }
        return LocaleListCompat.n((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
    }

    static LocaleListCompat rl(LocaleListCompat localeListCompat, LocaleListCompat localeListCompat2) {
        return (localeListCompat == null || localeListCompat.Uo()) ? LocaleListCompat.O() : n(localeListCompat, localeListCompat2);
    }
}
