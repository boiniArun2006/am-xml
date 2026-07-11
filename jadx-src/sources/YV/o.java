package YV;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class o {
    private final qz J2;
    private final boolean KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final String f12146O;
    private final boolean Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f12147n;
    private final long nr;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f12148t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.areEqual(this.f12147n, oVar.f12147n) && Intrinsics.areEqual(this.rl, oVar.rl) && Intrinsics.areEqual(this.f12148t, oVar.f12148t) && this.nr == oVar.nr && Intrinsics.areEqual(this.f12146O, oVar.f12146O) && this.J2 == oVar.J2 && this.Uo == oVar.Uo && this.KN == oVar.KN;
    }

    public o(String str, String packageName, String str2, long j2, String purchaseToken, qz purchaseState, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(purchaseToken, "purchaseToken");
        Intrinsics.checkNotNullParameter(purchaseState, "purchaseState");
        this.f12147n = str;
        this.rl = packageName;
        this.f12148t = str2;
        this.nr = j2;
        this.f12146O = purchaseToken;
        this.J2 = purchaseState;
        this.Uo = z2;
        this.KN = z3;
    }

    public final String J2() {
        return this.f12146O;
    }

    public final boolean KN() {
        return this.KN;
    }

    public final long O() {
        return this.nr;
    }

    public final boolean Uo() {
        return this.Uo;
    }

    public int hashCode() {
        String str = this.f12147n;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.rl.hashCode()) * 31;
        String str2 = this.f12148t;
        return ((((((((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Long.hashCode(this.nr)) * 31) + this.f12146O.hashCode()) * 31) + this.J2.hashCode()) * 31) + Boolean.hashCode(this.Uo)) * 31) + Boolean.hashCode(this.KN);
    }

    public final String n() {
        return this.f12147n;
    }

    public final qz nr() {
        return this.J2;
    }

    public final String rl() {
        return this.rl;
    }

    public final String t() {
        return this.f12148t;
    }

    public String toString() {
        return "Purchase(orderId=" + this.f12147n + ", packageName=" + this.rl + ", productId=" + this.f12148t + ", purchaseTime=" + this.nr + ", purchaseToken=" + this.f12146O + ", purchaseState=" + this.J2 + ", isAcknowledged=" + this.Uo + ", isAutoRenewing=" + this.KN + ")";
    }
}
