package KfI;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class l3D {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f5714n;
    private final boolean nr;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f5715t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l3D)) {
            return false;
        }
        l3D l3d = (l3D) obj;
        return Intrinsics.areEqual(this.f5714n, l3d.f5714n) && this.rl == l3d.rl && this.f5715t == l3d.f5715t && this.nr == l3d.nr;
    }

    public l3D(String processName, int i2, int i3, boolean z2) {
        Intrinsics.checkNotNullParameter(processName, "processName");
        this.f5714n = processName;
        this.rl = i2;
        this.f5715t = i3;
        this.nr = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7 */
    public int hashCode() {
        int iHashCode = ((((this.f5714n.hashCode() * 31) + Integer.hashCode(this.rl)) * 31) + Integer.hashCode(this.f5715t)) * 31;
        boolean z2 = this.nr;
        ?? r12 = z2;
        if (z2) {
            r12 = 1;
        }
        return iHashCode + r12;
    }

    public final int n() {
        return this.f5715t;
    }

    public final boolean nr() {
        return this.nr;
    }

    public final int rl() {
        return this.rl;
    }

    public final String t() {
        return this.f5714n;
    }

    public String toString() {
        return "ProcessDetails(processName=" + this.f5714n + ", pid=" + this.rl + ", importance=" + this.f5715t + ", isDefaultProcess=" + this.nr + ')';
    }
}
