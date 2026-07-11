package k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f69647n;
    private final pq.Ml rl;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ml)) {
            return false;
        }
        Ml ml = (Ml) obj;
        return Intrinsics.areEqual(this.f69647n, ml.f69647n) && Intrinsics.areEqual(this.rl, ml.rl);
    }

    public Ml(String actionKind, pq.Ml info) {
        Intrinsics.checkNotNullParameter(actionKind, "actionKind");
        Intrinsics.checkNotNullParameter(info, "info");
        this.f69647n = actionKind;
        this.rl = info;
    }

    public int hashCode() {
        return (this.f69647n.hashCode() * 31) + this.rl.hashCode();
    }

    public final String n() {
        return this.f69647n;
    }

    public final pq.Ml rl() {
        return this.rl;
    }

    public String toString() {
        return "AdOrableTrackedEvent(actionKind=" + this.f69647n + ", info=" + this.rl + ")";
    }
}
