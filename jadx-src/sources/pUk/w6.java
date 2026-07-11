package pUk;

import pUk.eO;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class w6 extends eO.n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f72031n;
    private final eO.j rl;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof eO.n) {
            eO.n nVar = (eO.n) obj;
            if (this.f72031n == nVar.nr() && this.rl.equals(nVar.t())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j2 = this.f72031n;
        return ((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003) ^ this.rl.hashCode();
    }

    @Override // pUk.eO.n
    public long nr() {
        return this.f72031n;
    }

    @Override // pUk.eO.n
    public eO.j t() {
        return this.rl;
    }

    public String toString() {
        return "IndexState{sequenceNumber=" + this.f72031n + ", offset=" + this.rl + "}";
    }

    w6(long j2, eO.j jVar) {
        this.f72031n = j2;
        if (jVar != null) {
            this.rl = jVar;
            return;
        }
        throw new NullPointerException("Null offset");
    }
}
