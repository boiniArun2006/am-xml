package com.google.firebase.perf.config;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class fuX extends UGc {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static fuX f60604n;

    public static synchronized fuX O() {
        try {
            if (f60604n == null) {
                f60604n = new fuX();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f60604n;
    }

    @Override // com.google.firebase.perf.config.UGc
    protected String n() {
        return "com.google.firebase.perf.NetworkEventCountForeground";
    }

    protected Long nr() {
        return 700L;
    }

    @Override // com.google.firebase.perf.config.UGc
    protected String t() {
        return "fpr_rl_network_event_count_fg";
    }

    private fuX() {
    }
}
