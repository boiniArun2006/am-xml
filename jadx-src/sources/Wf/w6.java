package Wf;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f11552n;
    private final List nr;
    private final List rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List f11553t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6)) {
            return false;
        }
        w6 w6Var = (w6) obj;
        return Intrinsics.areEqual(this.f11552n, w6Var.f11552n) && Intrinsics.areEqual(this.rl, w6Var.rl) && Intrinsics.areEqual(this.f11553t, w6Var.f11553t) && Intrinsics.areEqual(this.nr, w6Var.nr);
    }

    public w6(List activeSubscriptionIds, List activeNonConsumableIds, List activeBundleSubscriptionIds, List activeConsumableIds) {
        Intrinsics.checkNotNullParameter(activeSubscriptionIds, "activeSubscriptionIds");
        Intrinsics.checkNotNullParameter(activeNonConsumableIds, "activeNonConsumableIds");
        Intrinsics.checkNotNullParameter(activeBundleSubscriptionIds, "activeBundleSubscriptionIds");
        Intrinsics.checkNotNullParameter(activeConsumableIds, "activeConsumableIds");
        this.f11552n = activeSubscriptionIds;
        this.rl = activeNonConsumableIds;
        this.f11553t = activeBundleSubscriptionIds;
        this.nr = activeConsumableIds;
    }

    public int hashCode() {
        return (((((this.f11552n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f11553t.hashCode()) * 31) + this.nr.hashCode();
    }

    public final List n() {
        return this.f11553t;
    }

    public final List nr() {
        return this.f11552n;
    }

    public final List rl() {
        return this.nr;
    }

    public final List t() {
        return this.rl;
    }

    public String toString() {
        return "UserInfo(activeSubscriptionIds=" + this.f11552n + ", activeNonConsumableIds=" + this.rl + ", activeBundleSubscriptionIds=" + this.f11553t + ", activeConsumableIds=" + this.nr + ")";
    }
}
