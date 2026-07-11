package Z8;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class o extends UGc {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f12368n;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof UGc) && this.f12368n == ((UGc) obj).t();
    }

    public int hashCode() {
        long j2 = this.f12368n;
        return ((int) (j2 ^ (j2 >>> 32))) ^ 1000003;
    }

    @Override // Z8.UGc
    public long t() {
        return this.f12368n;
    }

    public String toString() {
        return "LogResponse{nextRequestWaitMillis=" + this.f12368n + "}";
    }

    o(long j2) {
        this.f12368n = j2;
    }
}
