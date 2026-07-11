package Ax;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class qz {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final FX.n f194n;
    private final float rl;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qz)) {
            return false;
        }
        qz qzVar = (qz) obj;
        return Intrinsics.areEqual(this.f194n, qzVar.f194n) && Float.compare(this.rl, qzVar.rl) == 0;
    }

    public qz(FX.n creatorRankingData, float f3) {
        Intrinsics.checkNotNullParameter(creatorRankingData, "creatorRankingData");
        this.f194n = creatorRankingData;
        this.rl = f3;
    }

    public int hashCode() {
        return (this.f194n.hashCode() * 31) + Float.hashCode(this.rl);
    }

    public final float n() {
        return this.rl;
    }

    public final FX.n rl() {
        return this.f194n;
    }

    public String toString() {
        return "CreatorRankingCardMenuState(creatorRankingData=" + this.f194n + ", cardVerticalPositionInWindow=" + this.rl + ")";
    }
}
