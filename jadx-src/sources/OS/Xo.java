package OS;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class Xo {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.android.billingclient.api.Ml f7454n;
    private final List rl;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Xo)) {
            return false;
        }
        Xo xo = (Xo) obj;
        return Intrinsics.areEqual(this.f7454n, xo.f7454n) && Intrinsics.areEqual(this.rl, xo.rl);
    }

    public Xo(com.android.billingclient.api.Ml billingResult, List list) {
        Intrinsics.checkNotNullParameter(billingResult, "billingResult");
        this.f7454n = billingResult;
        this.rl = list;
    }

    public int hashCode() {
        int iHashCode = this.f7454n.hashCode() * 31;
        List list = this.rl;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public final com.android.billingclient.api.Ml n() {
        return this.f7454n;
    }

    public final List rl() {
        return this.rl;
    }

    public String toString() {
        return "ProductDetailsResult(billingResult=" + this.f7454n + ", productDetailsList=" + this.rl + ")";
    }
}
