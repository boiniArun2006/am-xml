package vxB;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f74771n;
    private final boolean rl;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.areEqual(this.f74771n, jVar.f74771n) && this.rl == jVar.rl;
    }

    public j(String name, boolean z2) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.f74771n = name;
        this.rl = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        int iHashCode = this.f74771n.hashCode() * 31;
        boolean z2 = this.rl;
        ?? r12 = z2;
        if (z2) {
            r12 = 1;
        }
        return iHashCode + r12;
    }

    public final String n() {
        return this.f74771n;
    }

    public final boolean rl() {
        return this.rl;
    }

    public String toString() {
        return "GateKeeper(name=" + this.f74771n + ", value=" + this.rl + ')';
    }
}
