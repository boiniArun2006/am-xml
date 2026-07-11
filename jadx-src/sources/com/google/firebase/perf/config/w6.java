package com.google.firebase.perf.config;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class w6 extends UGc {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static w6 f60615n;

    protected static synchronized w6 nr() {
        try {
            if (f60615n == null) {
                f60615n = new w6();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f60615n;
    }

    @Override // com.google.firebase.perf.config.UGc
    protected String n() {
        return "isEnabled";
    }

    @Override // com.google.firebase.perf.config.UGc
    protected String rl() {
        return "firebase_performance_collection_enabled";
    }

    private w6() {
    }
}
