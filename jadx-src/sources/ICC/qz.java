package ICC;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class qz {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f4097n;
    private final int nr;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f4098t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qz)) {
            return false;
        }
        qz qzVar = (qz) obj;
        return this.f4097n == qzVar.f4097n && this.rl == qzVar.rl && this.f4098t == qzVar.f4098t && this.nr == qzVar.nr;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f4097n) * 31) + Integer.hashCode(this.rl)) * 31) + Integer.hashCode(this.f4098t)) * 31) + Integer.hashCode(this.nr);
    }

    public final int n() {
        return this.rl;
    }

    public final int rl() {
        return this.nr;
    }

    public String toString() {
        return "PeakMediaCompUsage(audioCount=" + this.f4097n + ", maxAudioUsage=" + this.rl + ", videoCount=" + this.f4098t + ", maxVideoCount=" + this.nr + ")";
    }

    public qz(int i2, int i3, int i5, int i7) {
        this.f4097n = i2;
        this.rl = i3;
        this.f4098t = i5;
        this.nr = i7;
    }
}
