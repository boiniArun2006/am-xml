package pUk;

import pUk.eO;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
final class n extends eO.j {
    private final C J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final UGc f72024O;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int f72025r;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eO.j) {
            eO.j jVar = (eO.j) obj;
            if (this.f72024O.equals(jVar.xMQ()) && this.J2.equals(jVar.Uo()) && this.f72025r == jVar.KN()) {
                return true;
            }
        }
        return false;
    }

    @Override // pUk.eO.j
    public int KN() {
        return this.f72025r;
    }

    @Override // pUk.eO.j
    public C Uo() {
        return this.J2;
    }

    public int hashCode() {
        return ((((this.f72024O.hashCode() ^ 1000003) * 1000003) ^ this.J2.hashCode()) * 1000003) ^ this.f72025r;
    }

    public String toString() {
        return "IndexOffset{readTime=" + this.f72024O + ", documentKey=" + this.J2 + ", largestBatchId=" + this.f72025r + "}";
    }

    @Override // pUk.eO.j
    public UGc xMQ() {
        return this.f72024O;
    }

    n(UGc uGc, C c2, int i2) {
        if (uGc != null) {
            this.f72024O = uGc;
            if (c2 != null) {
                this.J2 = c2;
                this.f72025r = i2;
                return;
            }
            throw new NullPointerException("Null documentKey");
        }
        throw new NullPointerException("Null readTime");
    }
}
