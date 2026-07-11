package com.google.firebase.perf.config;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class Pl extends UGc {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static Pl f60593n;

    public static synchronized Pl J2() {
        try {
            if (f60593n == null) {
                f60593n = new Pl();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f60593n;
    }

    @Override // com.google.firebase.perf.config.UGc
    protected String n() {
        return "com.google.firebase.perf.SessionsCpuCaptureFrequencyForegroundMs";
    }

    protected Long nr() {
        return 100L;
    }

    @Override // com.google.firebase.perf.config.UGc
    protected String rl() {
        return "sessions_cpu_capture_frequency_fg_ms";
    }

    @Override // com.google.firebase.perf.config.UGc
    protected String t() {
        return "fpr_session_gauge_cpu_capture_frequency_fg_ms";
    }

    private Pl() {
    }

    protected Long O() {
        return Long.valueOf(nr().longValue() * 3);
    }
}
