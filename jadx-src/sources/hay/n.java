package hay;

import hay.CN3;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class n extends CN3 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final CN3.j f67973n;
    private final long rl;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CN3) {
            CN3 cn3 = (CN3) obj;
            if (this.f67973n.equals(cn3.t()) && this.rl == cn3.rl()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f67973n.hashCode() ^ 1000003) * 1000003;
        long j2 = this.rl;
        return iHashCode ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    @Override // hay.CN3
    public long rl() {
        return this.rl;
    }

    @Override // hay.CN3
    public CN3.j t() {
        return this.f67973n;
    }

    public String toString() {
        return "BackendResponse{status=" + this.f67973n + ", nextRequestWaitMillis=" + this.rl + "}";
    }

    n(CN3.j jVar, long j2) {
        if (jVar != null) {
            this.f67973n = jVar;
            this.rl = j2;
            return;
        }
        throw new NullPointerException("Null status");
    }
}
