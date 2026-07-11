package com.google.firebase.firestore;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public class DAz {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f60302n;
    private final boolean rl;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DAz)) {
            return false;
        }
        DAz dAz = (DAz) obj;
        return this.f60302n == dAz.f60302n && this.rl == dAz.rl;
    }

    public int hashCode() {
        return ((this.f60302n ? 1 : 0) * 31) + (this.rl ? 1 : 0);
    }

    public String toString() {
        return "SnapshotMetadata{hasPendingWrites=" + this.f60302n + ", isFromCache=" + this.rl + '}';
    }

    DAz(boolean z2, boolean z3) {
        this.f60302n = z2;
        this.rl = z3;
    }
}
