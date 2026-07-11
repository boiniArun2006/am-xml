package com.google.firebase;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class j extends Pl {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f60562n;
    private final long rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final long f60563t;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Pl) {
            Pl pl = (Pl) obj;
            if (this.f60562n == pl.t() && this.rl == pl.rl() && this.f60563t == pl.nr()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j2 = this.f60562n;
        long j3 = this.rl;
        int i2 = (((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003;
        long j4 = this.f60563t;
        return i2 ^ ((int) ((j4 >>> 32) ^ j4));
    }

    @Override // com.google.firebase.Pl
    public long nr() {
        return this.f60563t;
    }

    @Override // com.google.firebase.Pl
    public long rl() {
        return this.rl;
    }

    @Override // com.google.firebase.Pl
    public long t() {
        return this.f60562n;
    }

    public String toString() {
        return "StartupTime{epochMillis=" + this.f60562n + ", elapsedRealtime=" + this.rl + ", uptimeMillis=" + this.f60563t + "}";
    }

    j(long j2, long j3, long j4) {
        this.f60562n = j2;
        this.rl = j3;
        this.f60563t = j4;
    }
}
