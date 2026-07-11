package com.facebook.soloader;

import android.os.Build;
import android.util.Log;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class qz {
    public static void J2(String str, String str2) {
        if (O(str, 2)) {
            Log.v(str, str2);
        }
    }

    public static void n(String str, String str2) {
        if (O(str, 3)) {
            Log.d(str, str2);
        }
    }

    public static void nr(String str, String str2) {
        if (O(str, 4)) {
            Log.i(str, str2);
        }
    }

    private static boolean O(String str, int i2) {
        return (Build.VERSION.SDK_INT > 25 || str.length() <= 23) ? Log.isLoggable(str, i2) : Log.isLoggable(str.substring(0, 23), i2);
    }

    public static void KN(String str, String str2, Throwable th) {
        Log.w(str, str2, th);
    }

    public static void Uo(String str, String str2) {
        Log.w(str, str2);
    }

    public static void rl(String str, String str2) {
        Log.e(str, str2);
    }

    public static void t(String str, String str2, Throwable th) {
        Log.e(str, str2, th);
    }
}
