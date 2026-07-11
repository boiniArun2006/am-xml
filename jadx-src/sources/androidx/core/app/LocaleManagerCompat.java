package androidx.core.app;

import android.app.LocaleManager;
import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import androidx.annotation.RequiresApi;
import androidx.core.os.LocaleListCompat;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class LocaleManagerCompat {

    @RequiresApi
    static class Api21Impl {
    }

    @RequiresApi
    static class Api24Impl {
    }

    @RequiresApi
    static class Api33Impl {
        static LocaleList n(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }
    }

    public static LocaleListCompat n(Context context) {
        if (Build.VERSION.SDK_INT < 33) {
            return LocaleListCompat.t(AppLocalesStorageHelper.rl(context));
        }
        Object objRl = rl(context);
        return objRl != null ? LocaleListCompat.gh(Api33Impl.n(objRl)) : LocaleListCompat.O();
    }

    private static Object rl(Context context) {
        return context.getSystemService("locale");
    }
}
