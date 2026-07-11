package com.google.firebase.perf.config;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class aC extends UGc {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static aC f60600n;

    public static synchronized aC O() {
        try {
            if (f60600n == null) {
                f60600n = new aC();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f60600n;
    }

    @Override // com.google.firebase.perf.config.UGc
    protected String n() {
        return "com.google.firebase.perf.TimeLimitSec";
    }

    protected Long nr() {
        return 600L;
    }

    @Override // com.google.firebase.perf.config.UGc
    protected String t() {
        return "fpr_rl_time_limit_sec";
    }

    private aC() {
    }
}
