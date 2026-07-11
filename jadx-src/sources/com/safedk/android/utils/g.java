package com.safedk.android.utils;

import android.os.SystemClock;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f63153a = "RegexFactory";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<String, Pattern> f63154b = new HashMap();

    public static Pattern a(String str, int i2) {
        Pattern patternCompile = f63154b.get(str);
        if (patternCompile == null) {
            try {
                synchronized (f63154b) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    patternCompile = i2 == 0 ? Pattern.compile(str) : Pattern.compile(str, i2);
                    f63154b.put(str, patternCompile);
                    Logger.d(f63153a, "pattern initialization completed in ", Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime), "ms, regex: ", str);
                }
            } catch (Throwable th) {
                Logger.d(f63153a, "pattern initialization failed", th);
            }
        }
        return patternCompile;
    }

    public static Pattern a(String str) {
        return a(str, 0);
    }
}
