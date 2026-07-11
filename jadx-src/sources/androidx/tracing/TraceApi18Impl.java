package androidx.tracing;

import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@RequiresApi
final class TraceApi18Impl {
    public static void n(String str) {
        android.os.Trace.beginSection(str);
    }

    public static void rl() {
        android.os.Trace.endSection();
    }
}
