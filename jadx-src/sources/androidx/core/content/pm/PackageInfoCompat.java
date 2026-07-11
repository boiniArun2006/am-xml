package androidx.core.content.pm;

import android.content.pm.PackageInfo;
import android.os.Build;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class PackageInfoCompat {

    @RequiresApi
    private static class Api28Impl {
        static long n(PackageInfo packageInfo) {
            return packageInfo.getLongVersionCode();
        }
    }

    public static long n(PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? Api28Impl.n(packageInfo) : packageInfo.versionCode;
    }
}
