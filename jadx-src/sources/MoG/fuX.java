package MoG;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class fuX {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Xo f6766n;
    private final d2n.Wre rl;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fuX)) {
            return false;
        }
        fuX fux = (fuX) obj;
        return Intrinsics.areEqual(this.f6766n, fux.f6766n) && Intrinsics.areEqual(this.rl, fux.rl);
    }

    public fuX(Xo item, d2n.Wre range) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(range, "range");
        this.f6766n = item;
        this.rl = range;
    }

    public int hashCode() {
        return (this.f6766n.hashCode() * 31) + this.rl.hashCode();
    }

    public final Xo n() {
        return this.f6766n;
    }

    public final d2n.Wre rl() {
        return this.rl;
    }

    public String toString() {
        return "FMCompositionBlock(item=" + this.f6766n + ", range=" + this.rl + ')';
    }
}
