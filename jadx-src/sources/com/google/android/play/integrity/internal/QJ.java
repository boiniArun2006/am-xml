package com.google.android.play.integrity.internal;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class QJ extends l3D {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f59569n;
    private final long rl;

    QJ(int i2, long j2) {
        this.f59569n = i2;
        this.rl = j2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof l3D) {
            l3D l3d = (l3D) obj;
            if (this.f59569n == l3d.n() && this.rl == l3d.rl()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j2 = this.rl;
        return ((int) (j2 ^ (j2 >>> 32))) ^ ((this.f59569n ^ 1000003) * 1000003);
    }

    @Override // com.google.android.play.integrity.internal.l3D
    public final int n() {
        return this.f59569n;
    }

    @Override // com.google.android.play.integrity.internal.l3D
    public final long rl() {
        return this.rl;
    }

    public final String toString() {
        return "EventRecord{eventType=" + this.f59569n + ", eventTimestamp=" + this.rl + "}";
    }
}
