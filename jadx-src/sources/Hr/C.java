package Hr;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class C extends o {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f3949n;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f3950t;

    public C(long j2, int i2, int i3) {
        super(null);
        this.f3949n = j2;
        this.rl = i2;
        this.f3950t = i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c2 = (C) obj;
        return this.f3949n == c2.f3949n && this.rl == c2.rl && this.f3950t == c2.f3950t;
    }

    public int hashCode() {
        return (((Long.hashCode(this.f3949n) * 31) + Integer.hashCode(this.rl)) * 31) + Integer.hashCode(this.f3950t);
    }

    public final long n() {
        return this.f3949n;
    }

    public final int rl() {
        return this.rl;
    }

    public String toString() {
        return "SampleData(pts=" + this.f3949n + ", size=" + this.rl + ", flags=" + this.f3950t + ")";
    }
}
