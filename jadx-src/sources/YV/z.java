package YV;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class z {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f12156n;
    private final Boolean rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final pq.Ml f12157t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return Intrinsics.areEqual(this.f12156n, zVar.f12156n) && Intrinsics.areEqual(this.rl, zVar.rl) && Intrinsics.areEqual(this.f12157t, zVar.f12157t);
    }

    public z(String trigger, Boolean bool, pq.Ml ml) {
        Intrinsics.checkNotNullParameter(trigger, "trigger");
        this.f12156n = trigger;
        this.rl = bool;
        this.f12157t = ml;
    }

    public int hashCode() {
        int iHashCode = this.f12156n.hashCode() * 31;
        Boolean bool = this.rl;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        pq.Ml ml = this.f12157t;
        return iHashCode2 + (ml != null ? ml.hashCode() : 0);
    }

    public final pq.Ml n() {
        return this.f12157t;
    }

    public final String rl() {
        return this.f12156n;
    }

    public final Boolean t() {
        return this.rl;
    }

    public String toString() {
        return "TrackingData(trigger=" + this.f12156n + ", isFirstPaywall=" + this.rl + ", additionalInfo=" + this.f12157t + ")";
    }
}
