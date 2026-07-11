package j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
final class qz {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final int f69279O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f69280n;
    private final int nr;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f69281t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qz)) {
            return false;
        }
        qz qzVar = (qz) obj;
        return this.f69280n == qzVar.f69280n && this.rl == qzVar.rl && this.f69281t == qzVar.f69281t && this.nr == qzVar.nr && this.f69279O == qzVar.f69279O;
    }

    public final int J2() {
        if (this.nr > 0) {
            return 2160;
        }
        if (this.f69281t > 0) {
            return 1440;
        }
        if (this.rl > 0) {
            return 1080;
        }
        return this.f69280n > 0 ? 720 : 540;
    }

    public final int O() {
        return this.f69279O;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.f69280n) * 31) + Integer.hashCode(this.rl)) * 31) + Integer.hashCode(this.f69281t)) * 31) + Integer.hashCode(this.nr)) * 31) + Integer.hashCode(this.f69279O);
    }

    public final int n() {
        return this.rl;
    }

    public final int nr() {
        return this.f69280n;
    }

    public final int rl() {
        return this.f69281t;
    }

    public final int t() {
        return this.nr;
    }

    public String toString() {
        return "DeviceCapabilities(maxLayers720=" + this.f69280n + ", maxLayers1080=" + this.rl + ", maxLayers1440=" + this.f69281t + ", maxLayers2160=" + this.nr + ", maxRes=" + this.f69279O + ")";
    }

    public qz(int i2, int i3, int i5, int i7, int i8) {
        this.f69280n = i2;
        this.rl = i3;
        this.f69281t = i5;
        this.nr = i7;
        this.f69279O = i8;
    }
}
