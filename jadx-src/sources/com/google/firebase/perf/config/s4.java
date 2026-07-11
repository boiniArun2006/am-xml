package com.google.firebase.perf.config;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class s4 extends UGc {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static s4 f60614n;

    protected static synchronized s4 J2() {
        try {
            if (f60614n == null) {
                f60614n = new s4();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f60614n;
    }

    @Override // com.google.firebase.perf.config.UGc
    protected String n() {
        return "com.google.firebase.perf.TraceSamplingRate";
    }

    protected Double nr() {
        return Double.valueOf(1.0d);
    }

    @Override // com.google.firebase.perf.config.UGc
    protected String t() {
        return "fpr_vc_trace_sampling_rate";
    }

    private s4() {
    }

    protected Double O() {
        return Double.valueOf(nr().doubleValue() / 1000.0d);
    }
}
