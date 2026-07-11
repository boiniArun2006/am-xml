package l0;

import android.os.Build;
import android.util.Log;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class j {
    private static String O(String str) {
        if (Build.VERSION.SDK_INT < 26) {
            return n("TRuntime.", str);
        }
        return "TRuntime." + str;
    }

    private static String n(String str, String str2) {
        String str3 = str + str2;
        return str3.length() > 23 ? str3.substring(0, 23) : str3;
    }

    public static void J2(String str, String str2, Object obj) {
        String strO = O(str);
        if (Log.isLoggable(strO, 4)) {
            Log.i(strO, String.format(str2, obj));
        }
    }

    public static void Uo(String str, String str2, Object obj) {
        String strO = O(str);
        if (Log.isLoggable(strO, 5)) {
            Log.w(strO, String.format(str2, obj));
        }
    }

    public static void nr(String str, String str2, Throwable th) {
        String strO = O(str);
        if (Log.isLoggable(strO, 6)) {
            Log.e(strO, str2, th);
        }
    }

    public static void rl(String str, String str2, Object obj) {
        String strO = O(str);
        if (Log.isLoggable(strO, 3)) {
            Log.d(strO, String.format(str2, obj));
        }
    }

    public static void t(String str, String str2, Object... objArr) {
        String strO = O(str);
        if (Log.isLoggable(strO, 3)) {
            Log.d(strO, String.format(str2, objArr));
        }
    }
}
