package SL;

import com.applovin.mediation.MaxAd;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final MaxAd f9733n;
    private final j rl;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6)) {
            return false;
        }
        w6 w6Var = (w6) obj;
        return Intrinsics.areEqual(this.f9733n, w6Var.f9733n) && Intrinsics.areEqual(this.rl, w6Var.rl);
    }

    public w6(MaxAd maxAd, j maxError) {
        Intrinsics.checkNotNullParameter(maxAd, "maxAd");
        Intrinsics.checkNotNullParameter(maxError, "maxError");
        this.f9733n = maxAd;
        this.rl = maxError;
    }

    public int hashCode() {
        return (this.f9733n.hashCode() * 31) + this.rl.hashCode();
    }

    public final MaxAd n() {
        return this.f9733n;
    }

    public final j rl() {
        return this.rl;
    }

    public String toString() {
        return "MaxDisplayFailure(maxAd=" + this.f9733n + ", maxError=" + this.rl + ")";
    }
}
