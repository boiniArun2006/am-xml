package YV;

import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map f12144n;
    private final Lazy nr;
    private final Map rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Map f12145t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.areEqual(this.f12144n, nVar.f12144n) && Intrinsics.areEqual(this.rl, nVar.rl) && Intrinsics.areEqual(this.f12145t, nVar.f12145t);
    }

    public n(Map subscriptions, Map consumables, Map nonConsumables) {
        Intrinsics.checkNotNullParameter(subscriptions, "subscriptions");
        Intrinsics.checkNotNullParameter(consumables, "consumables");
        Intrinsics.checkNotNullParameter(nonConsumables, "nonConsumables");
        this.f12144n = subscriptions;
        this.rl = consumables;
        this.f12145t = nonConsumables;
        this.nr = LazyKt.lazy(new Function0() { // from class: YV.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return n.rl(this.f12143n);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map rl(n nVar) {
        return MapsKt.plus(MapsKt.plus(nVar.f12144n, nVar.rl), nVar.f12145t);
    }

    public final Map O() {
        return this.f12145t;
    }

    public int hashCode() {
        return (((this.f12144n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f12145t.hashCode();
    }

    public final Map nr() {
        return this.rl;
    }

    public final Map t() {
        return (Map) this.nr.getValue();
    }

    public String toString() {
        return "AvailableProducts(subscriptions=" + this.f12144n + ", consumables=" + this.rl + ", nonConsumables=" + this.f12145t + ")";
    }
}
