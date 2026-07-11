package io.grpc.internal;

import io.grpc.Pl;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class hQ extends Pl.CN3 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final io.grpc.n f68611n;
    private final io.grpc.QJ rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final JP.DAz f68612t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && hQ.class == obj.getClass()) {
            hQ hQVar = (hQ) obj;
            if (t1.C.n(this.f68611n, hQVar.f68611n) && t1.C.n(this.rl, hQVar.rl) && t1.C.n(this.f68612t, hQVar.f68612t)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return t1.C.rl(this.f68611n, this.rl, this.f68612t);
    }

    @Override // io.grpc.Pl.CN3
    public io.grpc.n n() {
        return this.f68611n;
    }

    @Override // io.grpc.Pl.CN3
    public io.grpc.QJ rl() {
        return this.rl;
    }

    @Override // io.grpc.Pl.CN3
    public JP.DAz t() {
        return this.f68612t;
    }

    public final String toString() {
        return "[method=" + this.f68612t + " headers=" + this.rl + " callOptions=" + this.f68611n + "]";
    }

    public hQ(JP.DAz dAz, io.grpc.QJ qj, io.grpc.n nVar) {
        this.f68612t = (JP.DAz) t1.Xo.ck(dAz, "method");
        this.rl = (io.grpc.QJ) t1.Xo.ck(qj, "headers");
        this.f68611n = (io.grpc.n) t1.Xo.ck(nVar, "callOptions");
    }
}
