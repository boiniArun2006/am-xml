package FX;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f2631n;
    private final Integer nr;
    private final boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final j f2632t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return this.f2631n == nVar.f2631n && this.rl == nVar.rl && Intrinsics.areEqual(this.f2632t, nVar.f2632t) && Intrinsics.areEqual(this.nr, nVar.nr);
    }

    public n(boolean z2, boolean z3, j profile, Integer num) {
        Intrinsics.checkNotNullParameter(profile, "profile");
        this.f2631n = z2;
        this.rl = z3;
        this.f2632t = profile;
        this.nr = num;
    }

    public int hashCode() {
        int iHashCode = ((((Boolean.hashCode(this.f2631n) * 31) + Boolean.hashCode(this.rl)) * 31) + this.f2632t.hashCode()) * 31;
        Integer num = this.nr;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    public final j n() {
        return this.f2632t;
    }

    public final boolean nr() {
        return this.rl;
    }

    public final Integer rl() {
        return this.nr;
    }

    public final boolean t() {
        return this.f2631n;
    }

    public String toString() {
        return "CreatorRankingData(isAccepted=" + this.f2631n + ", isBlacklisted=" + this.rl + ", profile=" + this.f2632t + ", ranking=" + this.nr + ")";
    }
}
