package C6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
final class hQ {
    private final long nr;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final long f757t;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f756n = System.nanoTime();
    private long rl = System.nanoTime();

    public hQ(long j2, long j3) {
        this.f757t = j2 * 1000000;
        this.nr = j3 * 1000000;
    }

    public final boolean n() {
        long jNanoTime = System.nanoTime();
        if (jNanoTime - this.rl <= this.nr && jNanoTime - this.f756n <= this.f757t) {
            return false;
        }
        return true;
    }

    public final void rl() {
        this.rl = System.nanoTime();
    }
}
