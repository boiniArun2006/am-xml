package YV;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class QJ {
    private final List J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Map f12121O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final boolean f12122n;
    private final List nr;
    private final List rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List f12123t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof QJ)) {
            return false;
        }
        QJ qj = (QJ) obj;
        return this.f12122n == qj.f12122n && Intrinsics.areEqual(this.rl, qj.rl) && Intrinsics.areEqual(this.f12123t, qj.f12123t) && Intrinsics.areEqual(this.nr, qj.nr) && Intrinsics.areEqual(this.f12121O, qj.f12121O) && Intrinsics.areEqual(this.J2, qj.J2);
    }

    public QJ(boolean z2, List activeSubscriptionIds, List activeNonConsumableIds, List activeBundleSubscriptions, Map availableConsumableCredits, List otherActiveSubscriptions) {
        Intrinsics.checkNotNullParameter(activeSubscriptionIds, "activeSubscriptionIds");
        Intrinsics.checkNotNullParameter(activeNonConsumableIds, "activeNonConsumableIds");
        Intrinsics.checkNotNullParameter(activeBundleSubscriptions, "activeBundleSubscriptions");
        Intrinsics.checkNotNullParameter(availableConsumableCredits, "availableConsumableCredits");
        Intrinsics.checkNotNullParameter(otherActiveSubscriptions, "otherActiveSubscriptions");
        this.f12122n = z2;
        this.rl = activeSubscriptionIds;
        this.f12123t = activeNonConsumableIds;
        this.nr = activeBundleSubscriptions;
        this.f12121O = availableConsumableCredits;
        this.J2 = otherActiveSubscriptions;
    }

    public final boolean O() {
        return this.f12122n;
    }

    public int hashCode() {
        return (((((((((Boolean.hashCode(this.f12122n) * 31) + this.rl.hashCode()) * 31) + this.f12123t.hashCode()) * 31) + this.nr.hashCode()) * 31) + this.f12121O.hashCode()) * 31) + this.J2.hashCode();
    }

    public final List n() {
        return this.nr;
    }

    public final List nr() {
        return this.J2;
    }

    public final List rl() {
        return this.f12123t;
    }

    public final List t() {
        return this.rl;
    }

    public String toString() {
        return "UserInfo(isFreeUser=" + this.f12122n + ", activeSubscriptionIds=" + this.rl + ", activeNonConsumableIds=" + this.f12123t + ", activeBundleSubscriptions=" + this.nr + ", availableConsumableCredits=" + this.f12121O + ", otherActiveSubscriptions=" + this.J2 + ")";
    }
}
