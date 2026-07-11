package com.google.firebase.perf.config;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class n extends UGc {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static n f60609n;

    protected static synchronized n O() {
        try {
            if (f60609n == null) {
                f60609n = new n();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f60609n;
    }

    protected Boolean nr() {
        return Boolean.FALSE;
    }

    @Override // com.google.firebase.perf.config.UGc
    protected String rl() {
        return "firebase_performance_collection_deactivated";
    }

    private n() {
    }
}
