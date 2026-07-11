package com.google.firebase.perf.config;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class CN3 extends UGc {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static CN3 f60589n;

    public static synchronized CN3 O() {
        try {
            if (f60589n == null) {
                f60589n = new CN3();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f60589n;
    }

    @Override // com.google.firebase.perf.config.UGc
    protected String n() {
        return "com.google.firebase.perf.NetworkEventCountBackground";
    }

    protected Long nr() {
        return 70L;
    }

    @Override // com.google.firebase.perf.config.UGc
    protected String t() {
        return "fpr_rl_network_event_count_bg";
    }

    private CN3() {
    }
}
