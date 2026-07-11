package C6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class kO4 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f764n;
    private final long rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f765t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kO4)) {
            return false;
        }
        kO4 ko4 = (kO4) obj;
        return this.f764n == ko4.f764n && this.rl == ko4.rl && this.f765t == ko4.f765t;
    }

    public int hashCode() {
        return (((Long.hashCode(this.f764n) * 31) + Long.hashCode(this.rl)) * 31) + Integer.hashCode(this.f765t);
    }

    public final long n() {
        return this.rl;
    }

    public final long rl() {
        return this.f764n;
    }

    public final int t() {
        return this.f765t;
    }

    public String toString() {
        return "TestFrame(framePtsUs=" + this.f764n + ", decodeTsUs=" + this.rl + ", layerNum=" + this.f765t + ")";
    }

    public kO4(long j2, long j3, int i2) {
        this.f764n = j2;
        this.rl = j3;
        this.f765t = i2;
    }
}
