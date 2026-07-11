package SpD;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class Dsr {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f9943n;
    private final String rl;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Dsr)) {
            return false;
        }
        Dsr dsr = (Dsr) obj;
        return this.f9943n == dsr.f9943n && Intrinsics.areEqual(this.rl, dsr.rl);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f9943n) * 31;
        String str = this.rl;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final int n() {
        return this.f9943n;
    }

    public final String rl() {
        return this.rl;
    }

    public String toString() {
        return "TimestampCorrection(delta=" + this.f9943n + ", lastEventTimestamp=" + this.rl + ")";
    }

    public Dsr(int i2, String str) {
        this.f9943n = i2;
        this.rl = str;
    }
}
