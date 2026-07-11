package d3z;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class Wre {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f63401n;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final n f63402t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Wre)) {
            return false;
        }
        Wre wre = (Wre) obj;
        return Intrinsics.areEqual(this.f63401n, wre.f63401n) && Intrinsics.areEqual(this.rl, wre.rl) && this.f63402t == wre.f63402t;
    }

    public Wre(String id, String purchaseToken, n revokeState) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(purchaseToken, "purchaseToken");
        Intrinsics.checkNotNullParameter(revokeState, "revokeState");
        this.f63401n = id;
        this.rl = purchaseToken;
        this.f63402t = revokeState;
    }

    public int hashCode() {
        return (((this.f63401n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f63402t.hashCode();
    }

    public final String n() {
        return this.f63401n;
    }

    public final String rl() {
        return this.rl;
    }

    public final n t() {
        return this.f63402t;
    }

    public String toString() {
        return "OneTimePurchaseUIModel(id=" + this.f63401n + ", purchaseToken=" + this.rl + ", revokeState=" + this.f63402t + ")";
    }
}
