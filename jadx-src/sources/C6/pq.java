package C6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class pq {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f783n;
    private final boolean rl;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pq)) {
            return false;
        }
        pq pqVar = (pq) obj;
        return this.f783n == pqVar.f783n && this.rl == pqVar.rl;
    }

    public int hashCode() {
        return (Long.hashCode(this.f783n) * 31) + Boolean.hashCode(this.rl);
    }

    public final long n() {
        return this.f783n;
    }

    public String toString() {
        return "OutputFrame(presentationTimeUs=" + this.f783n + ", eos=" + this.rl + ")";
    }

    public pq(long j2, boolean z2) {
        this.f783n = j2;
        this.rl = z2;
    }
}
