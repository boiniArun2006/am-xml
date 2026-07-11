package k;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: k.w6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class C2203w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f69650n;
    private final pq.Ml rl;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2203w6)) {
            return false;
        }
        C2203w6 c2203w6 = (C2203w6) obj;
        return Intrinsics.areEqual(this.f69650n, c2203w6.f69650n) && Intrinsics.areEqual(this.rl, c2203w6.rl);
    }

    public C2203w6(String actionKind, pq.Ml info) {
        Intrinsics.checkNotNullParameter(actionKind, "actionKind");
        Intrinsics.checkNotNullParameter(info, "info");
        this.f69650n = actionKind;
        this.rl = info;
    }

    public int hashCode() {
        return (this.f69650n.hashCode() * 31) + this.rl.hashCode();
    }

    public final String n() {
        return this.f69650n;
    }

    public final pq.Ml rl() {
        return this.rl;
    }

    public String toString() {
        return "AdOrableTrackedAdsRevenue(actionKind=" + this.f69650n + ", info=" + this.rl + ")";
    }
}
