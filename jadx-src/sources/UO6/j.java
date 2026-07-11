package UO6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
final class j {
    private final double J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final double f10686O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f10687n;
    private final double nr;
    private final double rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final double f10688t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f10687n == jVar.f10687n && Double.compare(this.rl, jVar.rl) == 0 && Double.compare(this.f10688t, jVar.f10688t) == 0 && Double.compare(this.nr, jVar.nr) == 0 && Double.compare(this.f10686O, jVar.f10686O) == 0 && Double.compare(this.J2, jVar.J2) == 0;
    }

    public final int J2() {
        return this.f10687n;
    }

    public final double O() {
        return this.nr;
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.f10687n) * 31) + Double.hashCode(this.rl)) * 31) + Double.hashCode(this.f10688t)) * 31) + Double.hashCode(this.nr)) * 31) + Double.hashCode(this.f10686O)) * 31) + Double.hashCode(this.J2);
    }

    public final double n() {
        return this.f10686O;
    }

    public final double nr() {
        return this.rl;
    }

    public final double rl() {
        return this.f10688t;
    }

    public final double t() {
        return this.J2;
    }

    public String toString() {
        return "BitrateTable(resolution=" + this.f10687n + ", min=" + this.rl + ", low=" + this.f10688t + ", recommended=" + this.nr + ", high=" + this.f10686O + ", max=" + this.J2 + ")";
    }

    public j(int i2, double d2, double d4, double d5, double d6, double d7) {
        this.f10687n = i2;
        this.rl = d2;
        this.f10688t = d4;
        this.nr = d5;
        this.f10686O = d6;
        this.J2 = d7;
    }
}
