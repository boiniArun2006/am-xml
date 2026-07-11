package mg4;

import java.util.Set;
import kgE.Zs;
import kgE.psW;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class n {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final psW f70993O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Zs f70994n;
    private final String nr;
    private final Set rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Ml f70995t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f70994n == nVar.f70994n && Intrinsics.areEqual(this.rl, nVar.rl) && Intrinsics.areEqual(this.f70995t, nVar.f70995t) && Intrinsics.areEqual(this.nr, nVar.nr) && Intrinsics.areEqual(this.f70993O, nVar.f70993O);
    }

    public n(Zs queryState, Set activeBenefits, Ml availableSubscriptions, String str, psW psw) {
        Intrinsics.checkNotNullParameter(queryState, "queryState");
        Intrinsics.checkNotNullParameter(activeBenefits, "activeBenefits");
        Intrinsics.checkNotNullParameter(availableSubscriptions, "availableSubscriptions");
        this.f70994n = queryState;
        this.rl = activeBenefits;
        this.f70995t = availableSubscriptions;
        this.nr = str;
        this.f70993O = psw;
    }

    public final Zs O() {
        return this.f70994n;
    }

    public int hashCode() {
        int iHashCode = ((((this.f70994n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f70995t.hashCode()) * 31;
        String str = this.nr;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        psW psw = this.f70993O;
        return iHashCode2 + (psw != null ? psw.hashCode() : 0);
    }

    public final Set n() {
        return this.rl;
    }

    public final String nr() {
        return this.nr;
    }

    public final Ml rl() {
        return this.f70995t;
    }

    public final psW t() {
        return this.f70993O;
    }

    public String toString() {
        return "SubscriptionState(queryState=" + this.f70994n + ", activeBenefits=" + this.rl + ", availableSubscriptions=" + this.f70995t + ", pendingSku=" + this.nr + ", pastPurchase=" + this.f70993O + ")";
    }
}
