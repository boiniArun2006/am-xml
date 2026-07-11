package OS;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class o {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.android.billingclient.api.Ml f7463n;
    private final String rl;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.areEqual(this.f7463n, oVar.f7463n) && Intrinsics.areEqual(this.rl, oVar.rl);
    }

    public o(com.android.billingclient.api.Ml billingResult, String str) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        this.f7463n = billingResult;
        this.rl = str;
    }

    public int hashCode() {
        int iHashCode = this.f7463n.hashCode() * 31;
        String str = this.rl;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final com.android.billingclient.api.Ml n() {
        return this.f7463n;
    }

    public String toString() {
        return "ConsumeResult(billingResult=" + this.f7463n + ", purchaseToken=" + this.rl + ")";
    }
}
