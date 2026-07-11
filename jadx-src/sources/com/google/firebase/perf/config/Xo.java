package com.google.firebase.perf.config;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class Xo extends UGc {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static Xo f60599n;

    public static synchronized Xo O() {
        try {
            if (f60599n == null) {
                f60599n = new Xo();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f60599n;
    }

    @Override // com.google.firebase.perf.config.UGc
    protected String n() {
        return "com.google.firebase.perf.SessionsMaxDurationMinutes";
    }

    protected Long nr() {
        return 240L;
    }

    @Override // com.google.firebase.perf.config.UGc
    protected String rl() {
        return "sessions_max_length_minutes";
    }

    @Override // com.google.firebase.perf.config.UGc
    protected String t() {
        return "fpr_session_max_duration_min";
    }

    private Xo() {
    }
}
