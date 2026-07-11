package com.facebook.soloader;

import android.os.Trace;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Wre
class Api18TraceUtils {
    public static void n(String str, String str2, String str3) {
        String str4 = str + str2 + str3;
        if (str4.length() > 127 && str2 != null) {
            str4 = str + str2.substring(0, (127 - str.length()) - str3.length()) + str3;
        }
        Trace.beginSection(str4);
    }

    Api18TraceUtils() {
    }

    public static void rl() {
        Trace.endSection();
    }
}
