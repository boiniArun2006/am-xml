package androidx.core.os;

import android.content.res.Configuration;
import android.os.LocaleList;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class ConfigurationCompat {

    @RequiresApi
    static class Api24Impl {
        static LocaleList n(Configuration configuration) {
            return configuration.getLocales();
        }

        static void rl(Configuration configuration, LocaleListCompat localeListCompat) {
            configuration.setLocales((LocaleList) localeListCompat.mUb());
        }
    }

    public static LocaleListCompat n(Configuration configuration) {
        return LocaleListCompat.gh(Api24Impl.n(configuration));
    }

    public static void rl(Configuration configuration, LocaleListCompat localeListCompat) {
        Api24Impl.rl(configuration, localeListCompat);
    }
}
