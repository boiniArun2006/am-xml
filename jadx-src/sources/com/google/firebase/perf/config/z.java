package com.google.firebase.perf.config;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class z extends UGc {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static z f60616n;

    public static synchronized z J2() {
        try {
            if (f60616n == null) {
                f60616n = new z();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f60616n;
    }

    @Override // com.google.firebase.perf.config.UGc
    protected String n() {
        return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyForegroundMs";
    }

    protected Long nr() {
        return 100L;
    }

    @Override // com.google.firebase.perf.config.UGc
    protected String rl() {
        return "sessions_memory_capture_frequency_fg_ms";
    }

    @Override // com.google.firebase.perf.config.UGc
    protected String t() {
        return "fpr_session_gauge_memory_capture_frequency_fg_ms";
    }

    private z() {
    }

    protected Long O() {
        return Long.valueOf(nr().longValue() * 3);
    }
}
