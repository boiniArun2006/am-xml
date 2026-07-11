package com.android.billingclient.api;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f47536n;
    private final boolean rl;

    public static final class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f47537n;
        private boolean rl;

        private j() {
        }

        public j rl() {
            this.f47537n = true;
            return this;
        }

        public I28 n() {
            if (!this.f47537n) {
                throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
            }
            return new I28(true, this.rl);
        }
    }

    private I28(boolean z2, boolean z3) {
        this.f47536n = z2;
        this.rl = z3;
    }

    public static j t() {
        return new j();
    }

    boolean n() {
        return this.f47536n;
    }

    boolean rl() {
        return this.rl;
    }
}
