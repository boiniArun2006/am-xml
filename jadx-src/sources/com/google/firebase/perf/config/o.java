package com.google.firebase.perf.config;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class o extends UGc {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static o f60610n;

    protected static synchronized o O() {
        try {
            if (f60610n == null) {
                f60610n = new o();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f60610n;
    }

    @Override // com.google.firebase.perf.config.UGc
    protected String n() {
        return "com.google.firebase.perf.SdkEnabled";
    }

    protected Boolean nr() {
        return Boolean.TRUE;
    }

    @Override // com.google.firebase.perf.config.UGc
    protected String t() {
        return "fpr_enabled";
    }

    protected o() {
    }
}
