package com.google.firebase.perf.config;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class Ml extends UGc {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static Ml f60592n;

    protected static synchronized Ml O() {
        try {
            if (f60592n == null) {
                f60592n = new Ml();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f60592n;
    }

    @Override // com.google.firebase.perf.config.UGc
    protected String n() {
        return "com.google.firebase.perf.ExperimentTTID";
    }

    protected Boolean nr() {
        return Boolean.FALSE;
    }

    @Override // com.google.firebase.perf.config.UGc
    protected String rl() {
        return "experiment_app_start_ttid";
    }

    @Override // com.google.firebase.perf.config.UGc
    protected String t() {
        return "fpr_experiment_app_start_ttid";
    }

    private Ml() {
    }
}
