package com.google.firebase.perf.config;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class l3D extends UGc {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static l3D f60608n;

    public static synchronized l3D O() {
        try {
            if (f60608n == null) {
                f60608n = new l3D();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f60608n;
    }

    @Override // com.google.firebase.perf.config.UGc
    protected String n() {
        return "com.google.firebase.perf.TraceEventCountBackground";
    }

    protected Long nr() {
        return 30L;
    }

    @Override // com.google.firebase.perf.config.UGc
    protected String t() {
        return "fpr_rl_trace_event_count_bg";
    }

    private l3D() {
    }
}
