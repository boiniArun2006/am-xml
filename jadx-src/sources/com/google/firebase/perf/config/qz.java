package com.google.firebase.perf.config;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class qz extends UGc {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static qz f60611n;

    public static synchronized qz O() {
        try {
            if (f60611n == null) {
                f60611n = new qz();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f60611n;
    }

    @Override // com.google.firebase.perf.config.UGc
    protected String n() {
        return "com.google.firebase.perf.SessionsCpuCaptureFrequencyBackgroundMs";
    }

    protected Long nr() {
        return 0L;
    }

    @Override // com.google.firebase.perf.config.UGc
    protected String rl() {
        return "sessions_cpu_capture_frequency_bg_ms";
    }

    @Override // com.google.firebase.perf.config.UGc
    protected String t() {
        return "fpr_session_gauge_cpu_capture_frequency_bg_ms";
    }

    private qz() {
    }
}
