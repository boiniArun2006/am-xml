package com.google.firebase.perf.config;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class I28 extends UGc {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static I28 f60591n;

    protected static synchronized I28 O() {
        try {
            if (f60591n == null) {
                f60591n = new I28();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f60591n;
    }

    @Override // com.google.firebase.perf.config.UGc
    protected String n() {
        return "com.google.firebase.perf.FragmentSamplingRate";
    }

    protected Double nr() {
        return Double.valueOf(0.0d);
    }

    @Override // com.google.firebase.perf.config.UGc
    protected String rl() {
        return "fragment_sampling_percentage";
    }

    @Override // com.google.firebase.perf.config.UGc
    protected String t() {
        return "fpr_vc_fragment_sampling_rate";
    }

    private I28() {
    }
}
