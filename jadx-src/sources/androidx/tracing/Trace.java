package androidx.tracing;

import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class Trace {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static long f42128n;
    private static Method nr;
    private static Method rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static Method f42129t;

    public static boolean KN() {
        return Build.VERSION.SDK_INT >= 29 ? TraceApi29Impl.t() : xMQ();
    }

    private static void O(String str, int i2) {
        try {
            if (nr == null) {
                nr = android.os.Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            }
            nr.invoke(null, Long.valueOf(f42128n), str, Integer.valueOf(i2));
        } catch (Exception e2) {
            Uo("asyncTraceEnd", e2);
        }
    }

    private static void Uo(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static void n(String str, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            TraceApi29Impl.n(mUb(str), i2);
        } else {
            rl(mUb(str), i2);
        }
    }

    public static void nr(String str, int i2) {
        if (Build.VERSION.SDK_INT >= 29) {
            TraceApi29Impl.rl(mUb(str), i2);
        } else {
            O(mUb(str), i2);
        }
    }

    private static void rl(String str, int i2) {
        try {
            if (f42129t == null) {
                f42129t = android.os.Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
            }
            f42129t.invoke(null, Long.valueOf(f42128n), str, Integer.valueOf(i2));
        } catch (Exception e2) {
            Uo("asyncTraceBegin", e2);
        }
    }

    private static boolean xMQ() {
        try {
            if (rl == null) {
                f42128n = android.os.Trace.class.getField("TRACE_TAG_APP").getLong(null);
                rl = android.os.Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) rl.invoke(null, Long.valueOf(f42128n))).booleanValue();
        } catch (Exception e2) {
            Uo("isTagEnabled", e2);
            return false;
        }
    }

    public static void J2() {
        TraceApi18Impl.rl();
    }

    private static String mUb(String str) {
        if (str.length() <= 127) {
            return str;
        }
        return str.substring(0, 127);
    }

    public static void t(String str) {
        TraceApi18Impl.n(mUb(str));
    }
}
