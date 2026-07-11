package O2;

import android.content.Context;
import android.content.pm.PackageManager;
import okhttp3.HttpUrl;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class Pl {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static Boolean f7251n;

    public static void n(boolean z2, String str) {
        if (!z2) {
            throw new IllegalArgumentException(str);
        }
    }

    public static boolean rl(Context context) {
        Boolean bool = f7251n;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Boolean boolValueOf = Boolean.valueOf(context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("firebase_performance_logcat_enabled", false));
            f7251n = boolValueOf;
            return boolValueOf.booleanValue();
        } catch (PackageManager.NameNotFoundException | NullPointerException e2) {
            yMa.j.O().n("No perf logcat meta data found " + e2.getMessage());
            return false;
        }
    }

    public static String O(String str, int i2) {
        int iLastIndexOf;
        if (str.length() <= i2) {
            return str;
        }
        if (str.charAt(i2) == '/') {
            return str.substring(0, i2);
        }
        HttpUrl httpUrl = HttpUrl.parse(str);
        if (httpUrl == null) {
            return str.substring(0, i2);
        }
        if (httpUrl.encodedPath().lastIndexOf(47) >= 0 && (iLastIndexOf = str.lastIndexOf(47, i2 - 1)) >= 0) {
            return str.substring(0, iLastIndexOf);
        }
        return str.substring(0, i2);
    }

    public static String nr(String str) {
        HttpUrl httpUrl = HttpUrl.parse(str);
        if (httpUrl != null) {
            return httpUrl.newBuilder().username("").password("").query(null).fragment(null).toString();
        }
        return str;
    }

    public static int t(long j2) {
        if (j2 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j2 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j2;
    }
}
