package BC;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class n extends C {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f404n;
    private final Wre rl;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C) {
            C c2 = (C) obj;
            if (this.f404n == c2.t() && this.rl.equals(c2.nr())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f404n ^ 1000003) * 1000003) ^ this.rl.hashCode();
    }

    @Override // BC.C
    public Wre nr() {
        return this.rl;
    }

    @Override // BC.C
    public int t() {
        return this.f404n;
    }

    public String toString() {
        return "Overlay{largestBatchId=" + this.f404n + ", mutation=" + this.rl + "}";
    }

    n(int i2, Wre wre) {
        this.f404n = i2;
        if (wre != null) {
            this.rl = wre;
            return;
        }
        throw new NullPointerException("Null mutation");
    }
}
