package com.google.firebase.perf.config;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class Wre extends UGc {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static Wre f60598n;
    private static final Map rl = Collections.unmodifiableMap(new j());

    class j extends HashMap {
        j() {
            put(461L, "FIREPERF_AUTOPUSH");
            put(462L, "FIREPERF");
            put(675L, "FIREPERF_INTERNAL_LOW");
            put(676L, "FIREPERF_INTERNAL_HIGH");
        }
    }

    protected static String J2(long j2) {
        return (String) rl.get(Long.valueOf(j2));
    }

    public static synchronized Wre O() {
        try {
            if (f60598n == null) {
                f60598n = new Wre();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f60598n;
    }

    protected static boolean Uo(long j2) {
        return rl.containsKey(Long.valueOf(j2));
    }

    @Override // com.google.firebase.perf.config.UGc
    protected String n() {
        return "com.google.firebase.perf.LogSourceName";
    }

    protected String nr() {
        return Li.j.f6186t;
    }

    @Override // com.google.firebase.perf.config.UGc
    protected String t() {
        return "fpr_log_source";
    }

    private Wre() {
    }
}
