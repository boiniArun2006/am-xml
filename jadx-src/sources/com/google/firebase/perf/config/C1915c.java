package com.google.firebase.perf.config;

/* JADX INFO: renamed from: com.google.firebase.perf.config.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class C1915c extends UGc {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static C1915c f60601n;

    public static synchronized C1915c O() {
        try {
            if (f60601n == null) {
                f60601n = new C1915c();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f60601n;
    }

    @Override // com.google.firebase.perf.config.UGc
    protected String n() {
        return "com.google.firebase.perf.TraceEventCountForeground";
    }

    protected Long nr() {
        return 300L;
    }

    @Override // com.google.firebase.perf.config.UGc
    protected String t() {
        return "fpr_rl_trace_event_count_fg";
    }

    private C1915c() {
    }
}
