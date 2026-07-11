package cg;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class Wre {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final long f43782O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final long f43783n;
    private final long nr;
    private final long rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final long f43784t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Wre)) {
            return false;
        }
        Wre wre = (Wre) obj;
        return this.f43783n == wre.f43783n && this.rl == wre.rl && this.f43784t == wre.f43784t && this.nr == wre.nr && this.f43782O == wre.f43782O;
    }

    public static /* synthetic */ Wre rl(Wre wre, long j2, long j3, long j4, long j5, long j6, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = wre.f43783n;
        }
        long j7 = j2;
        if ((i2 & 2) != 0) {
            j3 = wre.rl;
        }
        return wre.n(j7, j3, (i2 & 4) != 0 ? wre.f43784t : j4, (i2 & 8) != 0 ? wre.nr : j5, (i2 & 16) != 0 ? wre.f43782O : j6);
    }

    public final long J2() {
        return this.f43784t;
    }

    public final long O() {
        return this.rl;
    }

    public final long Uo() {
        return this.nr;
    }

    public int hashCode() {
        return (((((((Long.hashCode(this.f43783n) * 31) + Long.hashCode(this.rl)) * 31) + Long.hashCode(this.f43784t)) * 31) + Long.hashCode(this.nr)) * 31) + Long.hashCode(this.f43782O);
    }

    public final Wre n(long j2, long j3, long j4, long j5, long j6) {
        return new Wre(j2, j3, j4, j5, j6);
    }

    public final long nr() {
        return this.f43783n;
    }

    public final long t() {
        return this.f43782O;
    }

    public String toString() {
        return "CreatorProgramData(downloadCount=" + this.f43783n + ", downloadDelayedCount=" + this.rl + ", tokenCount=" + this.f43784t + ", tokenDelayedCount=" + this.nr + ", delayedCountTimestamp=" + this.f43782O + ")";
    }

    public Wre(long j2, long j3, long j4, long j5, long j6) {
        this.f43783n = j2;
        this.rl = j3;
        this.f43784t = j4;
        this.nr = j5;
        this.f43782O = j6;
    }
}
