package d3z;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class Q {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f63398n;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Q) && Intrinsics.areEqual(this.f63398n, ((Q) obj).f63398n);
    }

    public Q(String id) {
        Intrinsics.checkNotNullParameter(id, "id");
        this.f63398n = id;
    }

    public int hashCode() {
        return this.f63398n.hashCode();
    }

    public final String n() {
        return this.f63398n;
    }

    public String toString() {
        return "SubscriptionPurchaseUIModel(id=" + this.f63398n + ")";
    }
}
