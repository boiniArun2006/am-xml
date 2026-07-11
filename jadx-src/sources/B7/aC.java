package B7;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
final class aC {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final F6.j f259n;
    private final as.n rl;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aC)) {
            return false;
        }
        aC aCVar = (aC) obj;
        return Intrinsics.areEqual(this.f259n, aCVar.f259n) && Intrinsics.areEqual(this.rl, aCVar.rl);
    }

    public aC(F6.j compositionSlice, as.n audioFragment) {
        Intrinsics.checkNotNullParameter(compositionSlice, "compositionSlice");
        Intrinsics.checkNotNullParameter(audioFragment, "audioFragment");
        this.f259n = compositionSlice;
        this.rl = audioFragment;
    }

    public int hashCode() {
        return (this.f259n.hashCode() * 31) + this.rl.hashCode();
    }

    public final as.n n() {
        return this.rl;
    }

    public final F6.j rl() {
        return this.f259n;
    }

    public final d2n.Wre t() {
        return this.f259n.O();
    }

    public String toString() {
        return "BufferedData(compositionSlice=" + this.f259n + ", audioFragment=" + this.rl + ')';
    }
}
