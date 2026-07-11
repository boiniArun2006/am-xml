package com.google.firebase.remoteconfig.internal;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class UGc implements N67.aC {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f60731n;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final N67.C f60732t;

    public static class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private long f60733n;
        private int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private N67.C f60734t;

        private n() {
        }

        public UGc n() {
            return new UGc(this.f60733n, this.rl, this.f60734t);
        }

        public n nr(long j2) {
            this.f60733n = j2;
            return this;
        }

        n rl(N67.C c2) {
            this.f60734t = c2;
            return this;
        }

        n t(int i2) {
            this.rl = i2;
            return this;
        }
    }

    private UGc(long j2, int i2, N67.C c2) {
        this.f60731n = j2;
        this.rl = i2;
        this.f60732t = c2;
    }

    static n rl() {
        return new n();
    }

    @Override // N67.aC
    public int n() {
        return this.rl;
    }
}
