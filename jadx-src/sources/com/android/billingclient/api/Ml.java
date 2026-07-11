package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zze;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f47553n;
    private String rl;

    public static class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f47554n;
        private String rl = "";

        public j rl(String str) {
            this.rl = str;
            return this;
        }

        public j t(int i2) {
            this.f47554n = i2;
            return this;
        }

        public Ml n() {
            Ml ml = new Ml();
            ml.f47553n = this.f47554n;
            ml.rl = this.rl;
            return ml;
        }

        /* synthetic */ j(OS.Ln ln2) {
        }
    }

    public static j t() {
        return new j(null);
    }

    public String n() {
        return this.rl;
    }

    public int rl() {
        return this.f47553n;
    }

    public String toString() {
        return "Response Code: " + zze.zzi(this.f47553n) + ", Debug Message: " + this.rl;
    }
}
