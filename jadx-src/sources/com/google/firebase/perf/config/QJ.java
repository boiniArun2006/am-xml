package com.google.firebase.perf.config;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class QJ extends UGc {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static QJ f60596n;

    public static synchronized QJ J2() {
        try {
            if (f60596n == null) {
                f60596n = new QJ();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f60596n;
    }

    @Override // com.google.firebase.perf.config.UGc
    protected String n() {
        return "com.google.firebase.perf.SessionSamplingRate";
    }

    @Override // com.google.firebase.perf.config.UGc
    protected String rl() {
        return "sessions_sampling_percentage";
    }

    @Override // com.google.firebase.perf.config.UGc
    protected String t() {
        return "fpr_vc_session_sampling_rate";
    }

    private QJ() {
    }

    protected Double O() {
        return Double.valueOf(nr().doubleValue() / 1000.0d);
    }

    protected Double nr() {
        return Double.valueOf(0.01d);
    }
}
