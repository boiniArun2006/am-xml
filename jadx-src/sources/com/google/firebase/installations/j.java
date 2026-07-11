package com.google.firebase.installations;

import com.google.firebase.installations.Wre;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class j extends Wre {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f60552n;
    private final long rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final long f60553t;

    static final class n extends Wre.j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private String f60554n;
        private Long rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private Long f60555t;

        @Override // com.google.firebase.installations.Wre.j
        public Wre n() {
            String str = "";
            if (this.f60554n == null) {
                str = " token";
            }
            if (this.rl == null) {
                str = str + " tokenExpirationTimestamp";
            }
            if (this.f60555t == null) {
                str = str + " tokenCreationTimestamp";
            }
            if (str.isEmpty()) {
                return new j(this.f60554n, this.rl.longValue(), this.f60555t.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.firebase.installations.Wre.j
        public Wre.j rl(String str) {
            if (str == null) {
                throw new NullPointerException("Null token");
            }
            this.f60554n = str;
            return this;
        }

        n() {
        }

        @Override // com.google.firebase.installations.Wre.j
        public Wre.j nr(long j2) {
            this.rl = Long.valueOf(j2);
            return this;
        }

        @Override // com.google.firebase.installations.Wre.j
        public Wre.j t(long j2) {
            this.f60555t = Long.valueOf(j2);
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Wre) {
            Wre wre = (Wre) obj;
            if (this.f60552n.equals(wre.rl()) && this.rl == wre.nr() && this.f60553t == wre.t()) {
                return true;
            }
        }
        return false;
    }

    private j(String str, long j2, long j3) {
        this.f60552n = str;
        this.rl = j2;
        this.f60553t = j3;
    }

    public int hashCode() {
        int iHashCode = (this.f60552n.hashCode() ^ 1000003) * 1000003;
        long j2 = this.rl;
        long j3 = this.f60553t;
        return ((iHashCode ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)));
    }

    @Override // com.google.firebase.installations.Wre
    public long nr() {
        return this.rl;
    }

    @Override // com.google.firebase.installations.Wre
    public String rl() {
        return this.f60552n;
    }

    @Override // com.google.firebase.installations.Wre
    public long t() {
        return this.f60553t;
    }

    public String toString() {
        return "InstallationTokenResult{token=" + this.f60552n + ", tokenExpirationTimestamp=" + this.rl + ", tokenCreationTimestamp=" + this.f60553t + "}";
    }
}
