package OS;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class l3D {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.android.billingclient.api.Ml f7462n;
    private final List rl;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l3D)) {
            return false;
        }
        l3D l3d = (l3D) obj;
        return Intrinsics.areEqual(this.f7462n, l3d.f7462n) && Intrinsics.areEqual(this.rl, l3d.rl);
    }

    public l3D(com.android.billingclient.api.Ml billingResult, List purchasesList) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        Intrinsics.checkNotNullParameter(purchasesList, "purchasesList");
        this.f7462n = billingResult;
        this.rl = purchasesList;
    }

    public int hashCode() {
        return (this.f7462n.hashCode() * 31) + this.rl.hashCode();
    }

    public final com.android.billingclient.api.Ml n() {
        return this.f7462n;
    }

    public final List rl() {
        return this.rl;
    }

    public String toString() {
        return "PurchasesResult(billingResult=" + this.f7462n + ", purchasesList=" + this.rl + ")";
    }
}
