package com.google.android.exoplayer2.util;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.Size;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class Log {
    public static final int LOG_LEVEL_ALL = 0;
    public static final int LOG_LEVEL_ERROR = 3;
    public static final int LOG_LEVEL_INFO = 1;
    public static final int LOG_LEVEL_OFF = Integer.MAX_VALUE;
    public static final int LOG_LEVEL_WARNING = 2;
    private static int logLevel = 0;
    private static boolean logStackTraces = true;

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface LogLevel {
    }

    public static void d(@Size String str, String str2) {
        if (logLevel == 0) {
            android.util.Log.d(str, str2);
        }
    }

    public static void e(@Size String str, String str2) {
        if (logLevel <= 3) {
            android.util.Log.e(str, str2);
        }
    }

    public static void i(@Size String str, String str2) {
        if (logLevel <= 1) {
            android.util.Log.i(str, str2);
        }
    }

    public static void w(@Size String str, String str2) {
        if (logLevel <= 2) {
            android.util.Log.w(str, str2);
        }
    }

    public static int getLogLevel() {
        return logLevel;
    }

    @Nullable
    public static String getThrowableString(@Nullable Throwable th) {
        if (th == null) {
            return null;
        }
        return isCausedByUnknownHostException(th) ? "UnknownHostException (no network)" : !logStackTraces ? th.getMessage() : android.util.Log.getStackTraceString(th).trim().replace("\t", "    ");
    }

    private static boolean isCausedByUnknownHostException(@Nullable Throwable th) {
        while (th != null) {
            if (th instanceof UnknownHostException) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    public static void setLogLevel(int i2) {
        logLevel = i2;
    }

    public static void setLogStackTraces(boolean z2) {
        logStackTraces = z2;
    }

    private Log() {
    }

    private static String appendThrowableString(String str, @Nullable Throwable th) {
        String throwableString = getThrowableString(th);
        if (!TextUtils.isEmpty(throwableString)) {
            return str + "\n  " + throwableString.replace("\n", "\n  ") + '\n';
        }
        return str;
    }

    public static void d(@Size String str, String str2, @Nullable Throwable th) {
        d(str, appendThrowableString(str2, th));
    }

    public static void e(@Size String str, String str2, @Nullable Throwable th) {
        e(str, appendThrowableString(str2, th));
    }

    public static void i(@Size String str, String str2, @Nullable Throwable th) {
        i(str, appendThrowableString(str2, th));
    }

    public static void w(@Size String str, String str2, @Nullable Throwable th) {
        w(str, appendThrowableString(str2, th));
    }
}
