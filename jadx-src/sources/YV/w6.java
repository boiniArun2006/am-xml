package YV;

import d8q.jqQ.QTafcm;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public final class w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f12154n;
    private final String nr;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f12155t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6)) {
            return false;
        }
        w6 w6Var = (w6) obj;
        return Intrinsics.areEqual(this.f12154n, w6Var.f12154n) && Intrinsics.areEqual(this.rl, w6Var.rl) && Intrinsics.areEqual(this.f12155t, w6Var.f12155t) && Intrinsics.areEqual(this.nr, w6Var.nr);
    }

    public w6(List features, String expiry, String str, String str2) {
        Intrinsics.checkNotNullParameter(features, "features");
        Intrinsics.checkNotNullParameter(expiry, "expiry");
        Intrinsics.checkNotNullParameter(str, QTafcm.FZf);
        this.f12154n = features;
        this.rl = expiry;
        this.f12155t = str;
        this.nr = str2;
    }

    public int hashCode() {
        int iHashCode = ((((this.f12154n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f12155t.hashCode()) * 31;
        String str = this.nr;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "BundleSubscription(features=" + this.f12154n + ", expiry=" + this.rl + ", productId=" + this.f12155t + ", planId=" + this.nr + ")";
    }
}
