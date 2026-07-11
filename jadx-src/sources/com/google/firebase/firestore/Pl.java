package com.google.firebase.firestore;

import com.caoccao.javet.values.primitive.V8ValueNull;
import wqP.AbstractC2418c;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class Pl {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f60331n;
    private final long nr;
    private final boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f60332t;

    public static final class n {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private boolean f60333O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f60334n;
        private long nr;
        private boolean rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f60335t;

        public n() {
            this.f60333O = false;
            this.f60334n = "firestore.googleapis.com";
            this.rl = true;
            this.f60335t = true;
            this.nr = 104857600L;
        }

        public Pl J2() {
            if (this.rl || !this.f60334n.equals("firestore.googleapis.com")) {
                return new Pl(this);
            }
            throw new IllegalStateException("You can't set the 'sslEnabled' setting unless you also set a non-default 'host'.");
        }

        public n KN(boolean z2) {
            this.f60335t = z2;
            this.f60333O = true;
            return this;
        }

        public n Uo(String str) {
            this.f60334n = (String) AbstractC2418c.t(str, "Provided host must not be null.");
            return this;
        }

        public n xMQ(boolean z2) {
            this.rl = z2;
            return this;
        }

        static /* synthetic */ UGc n(n nVar) {
            nVar.getClass();
            return null;
        }

        public n(Pl pl) {
            this.f60333O = false;
            AbstractC2418c.t(pl, "Provided settings must not be null.");
            this.f60334n = pl.f60331n;
            this.rl = pl.rl;
            this.f60335t = pl.f60332t;
            long j2 = pl.nr;
            this.nr = j2;
            if (!this.f60335t || j2 != 104857600) {
                this.f60333O = true;
            }
            if (!this.f60333O) {
                Pl.O(pl);
            } else {
                Pl.O(pl);
                wqP.n.t(true, "Given settings object mixes both cache config APIs, which is impossible.", new Object[0]);
            }
        }
    }

    public UGc J2() {
        return null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Pl.class != obj.getClass()) {
            return false;
        }
        Pl pl = (Pl) obj;
        return this.rl == pl.rl && this.f60332t == pl.f60332t && this.nr == pl.nr && this.f60331n.equals(pl.f60331n);
    }

    private Pl(n nVar) {
        this.f60331n = nVar.f60334n;
        this.rl = nVar.rl;
        this.f60332t = nVar.f60335t;
        this.nr = nVar.nr;
        n.n(nVar);
    }

    public String KN() {
        return this.f60331n;
    }

    public long Uo() {
        return this.nr;
    }

    public int hashCode() {
        int iHashCode = ((((this.f60331n.hashCode() * 31) + (this.rl ? 1 : 0)) * 31) + (this.f60332t ? 1 : 0)) * 31;
        long j2 = this.nr;
        return (iHashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31;
    }

    public boolean mUb() {
        return this.rl;
    }

    public String toString() {
        if (("FirebaseFirestoreSettings{host=" + this.f60331n + ", sslEnabled=" + this.rl + ", persistenceEnabled=" + this.f60332t + ", cacheSizeBytes=" + this.nr + ", cacheSettings=" + ((Object) null)) == null) {
            return V8ValueNull.NULL;
        }
        throw null;
    }

    public boolean xMQ() {
        return this.f60332t;
    }

    static /* synthetic */ UGc O(Pl pl) {
        pl.getClass();
        return null;
    }
}
