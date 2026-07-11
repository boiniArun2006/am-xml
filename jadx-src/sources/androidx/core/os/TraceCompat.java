package androidx.core.os;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import androidx.annotation.RequiresApi;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Deprecated
public final class TraceCompat {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static Method f36547O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static long f36548n;
    private static Method nr;
    private static Method rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static Method f36549t;

    @RequiresApi
    static class Api29Impl {
        static boolean n() {
            return Trace.isEnabled();
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f36548n = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                rl = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                f36549t = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                nr = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f36547O = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e2) {
                Log.i("TraceCompat", "Unable to initialize via reflection.", e2);
            }
        }
    }

    public static boolean t() {
        if (Build.VERSION.SDK_INT >= 29) {
            return Api29Impl.n();
        }
        try {
            return ((Boolean) rl.invoke(null, Long.valueOf(f36548n))).booleanValue();
        } catch (Exception unused) {
            Log.v("TraceCompat", "Unable to invoke isTagEnabled() via reflection.");
            return false;
        }
    }

    public static void n(String str) {
        Trace.beginSection(str);
    }

    public static void rl() {
        Trace.endSection();
    }
}
