package androidx.tracing;

import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@RequiresApi
final class TraceApi29Impl {
    public static void n(String str, int i2) {
        android.os.Trace.beginAsyncSection(str, i2);
    }

    public static void rl(String str, int i2) {
        android.os.Trace.endAsyncSection(str, i2);
    }

    @DoNotInline
    public static boolean t() {
        return android.os.Trace.isEnabled();
    }
}
