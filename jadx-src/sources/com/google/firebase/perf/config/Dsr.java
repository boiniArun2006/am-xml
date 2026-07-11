package com.google.firebase.perf.config;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class Dsr extends UGc {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static Dsr f60590n;

    protected static synchronized Dsr J2() {
        try {
            if (f60590n == null) {
                f60590n = new Dsr();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f60590n;
    }

    @Override // com.google.firebase.perf.config.UGc
    protected String n() {
        return "com.google.firebase.perf.NetworkRequestSamplingRate";
    }

    protected Double nr() {
        return Double.valueOf(1.0d);
    }

    @Override // com.google.firebase.perf.config.UGc
    protected String t() {
        return "fpr_vc_network_request_sampling_rate";
    }

    private Dsr() {
    }

    protected Double O() {
        return Double.valueOf(nr().doubleValue() / 1000.0d);
    }
}
