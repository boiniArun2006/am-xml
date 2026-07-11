package OS;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: OS.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class C1423z {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.android.billingclient.api.Ml f7469n;
    private final List rl;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1423z)) {
            return false;
        }
        C1423z c1423z = (C1423z) obj;
        return Intrinsics.areEqual(this.f7469n, c1423z.f7469n) && Intrinsics.areEqual(this.rl, c1423z.rl);
    }

    public C1423z(com.android.billingclient.api.Ml billingResult, List list) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        this.f7469n = billingResult;
        this.rl = list;
    }

    public int hashCode() {
        int iHashCode = this.f7469n.hashCode() * 31;
        List list = this.rl;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final com.android.billingclient.api.Ml n() {
        return this.f7469n;
    }

    public final List rl() {
        return this.rl;
    }

    public String toString() {
        return "PurchaseHistoryResult(billingResult=" + this.f7469n + ", purchaseHistoryRecordList=" + this.rl + ")";
    }
}
