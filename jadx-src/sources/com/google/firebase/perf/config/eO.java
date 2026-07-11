package com.google.firebase.perf.config;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class eO extends UGc {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static eO f60603n;

    public static synchronized eO O() {
        try {
            if (f60603n == null) {
                f60603n = new eO();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f60603n;
    }

    @Override // com.google.firebase.perf.config.UGc
    protected String n() {
        return "com.google.firebase.perf.SessionsMemoryCaptureFrequencyBackgroundMs";
    }

    protected Long nr() {
        return 0L;
    }

    @Override // com.google.firebase.perf.config.UGc
    protected String rl() {
        return "sessions_memory_capture_frequency_bg_ms";
    }

    @Override // com.google.firebase.perf.config.UGc
    protected String t() {
        return "fpr_session_gauge_memory_capture_frequency_bg_ms";
    }

    private eO() {
    }
}
