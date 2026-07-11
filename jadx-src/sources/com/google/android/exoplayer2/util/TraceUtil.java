package com.google.android.exoplayer2.util;

import android.os.Trace;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class TraceUtil {
    public static void beginSection(String str) {
        if (Util.SDK_INT >= 18) {
            beginSectionV18(str);
        }
    }

    public static void endSection() {
        if (Util.SDK_INT >= 18) {
            endSectionV18();
        }
    }

    private TraceUtil() {
    }

    @RequiresApi
    private static void beginSectionV18(String str) {
        Trace.beginSection(str);
    }

    @RequiresApi
    private static void endSectionV18() {
        Trace.endSection();
    }
}
