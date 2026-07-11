package Fw3;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
final class fuX {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final d2n.Wre f3257n;
    private final gB.I28 rl;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fuX)) {
            return false;
        }
        fuX fux = (fuX) obj;
        return Intrinsics.areEqual(this.f3257n, fux.f3257n) && Intrinsics.areEqual(this.rl, fux.rl);
    }

    public fuX(d2n.Wre range, gB.I28 resource) {
        Intrinsics.checkNotNullParameter(range, "range");
        Intrinsics.checkNotNullParameter(resource, "resource");
        this.f3257n = range;
        this.rl = resource;
    }

    public int hashCode() {
        return (this.f3257n.hashCode() * 31) + this.rl.hashCode();
    }

    public final d2n.Wre n() {
        return this.f3257n;
    }

    public final gB.I28 rl() {
        return this.rl;
    }

    public String toString() {
        return "ResourceBlock(range=" + this.f3257n + ", resource=" + this.rl + ')';
    }
}
