package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.zzco;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class CN3 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final zzco f47526n;

    public static class j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private zzco f47527n;

        public CN3 n() {
            if (this.f47527n != null) {
                return new CN3(this, null);
            }
            throw new IllegalArgumentException("Product list must be set to a non empty list.");
        }

        public j rl(List list) {
            if (list == null || list.isEmpty()) {
                throw new IllegalArgumentException("Product list cannot be empty.");
            }
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                n nVar = (n) it.next();
                if (!"play_pass_subs".equals(nVar.t())) {
                    hashSet.add(nVar.t());
                }
            }
            if (hashSet.size() > 1) {
                throw new IllegalArgumentException("All products should be of the same product type.");
            }
            this.f47527n = zzco.zzk(list);
            return this;
        }

        /* synthetic */ j(OS.Lu lu) {
        }
    }

    public static j n() {
        return new j(null);
    }

    public final zzco rl() {
        return this.f47526n;
    }

    public static class n {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final String f47528n;
        private final String rl;

        public static class j {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private String f47529n;
            private String rl;

            public j rl(String str) {
                this.f47529n = str;
                return this;
            }

            public j t(String str) {
                this.rl = str;
                return this;
            }

            public n n() {
                if ("first_party".equals(this.rl)) {
                    throw new IllegalArgumentException("Serialized doc id must be provided for first party products.");
                }
                if (this.f47529n == null) {
                    throw new IllegalArgumentException("Product id must be provided.");
                }
                if (this.rl != null) {
                    return new n(this, null);
                }
                throw new IllegalArgumentException("Product type must be provided.");
            }

            /* synthetic */ j(OS.Lu lu) {
            }
        }

        public static j n() {
            return new j(null);
        }

        public final String rl() {
            return this.f47528n;
        }

        public final String t() {
            return this.rl;
        }

        /* synthetic */ n(j jVar, OS.Lu lu) {
            this.f47528n = jVar.f47529n;
            this.rl = jVar.rl;
        }
    }

    public final String t() {
        return ((n) this.f47526n.get(0)).t();
    }

    /* synthetic */ CN3(j jVar, OS.Lu lu) {
        this.f47526n = jVar.f47527n;
    }
}
