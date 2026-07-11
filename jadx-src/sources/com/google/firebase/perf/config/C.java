package com.google.firebase.perf.config;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class C extends UGc {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static C f60588n;

    protected static synchronized C O() {
        try {
            if (f60588n == null) {
                f60588n = new C();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f60588n;
    }

    @Override // com.google.firebase.perf.config.UGc
    protected String n() {
        return "com.google.firebase.perf.SdkDisabledVersions";
    }

    protected String nr() {
        return "";
    }

    @Override // com.google.firebase.perf.config.UGc
    protected String t() {
        return "fpr_disabled_android_versions";
    }

    protected C() {
    }
}
