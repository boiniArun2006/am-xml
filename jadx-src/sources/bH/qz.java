package bH;

import DSG.Wre;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
final class qz {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Wre.Ml f43255n;
    private final List rl;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qz)) {
            return false;
        }
        qz qzVar = (qz) obj;
        return Intrinsics.areEqual(this.f43255n, qzVar.f43255n) && Intrinsics.areEqual(this.rl, qzVar.rl);
    }

    public qz(Wre.Ml menu, List items) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f43255n = menu;
        this.rl = items;
    }

    public int hashCode() {
        return (this.f43255n.hashCode() * 31) + this.rl.hashCode();
    }

    public final List n() {
        return this.rl;
    }

    public String toString() {
        return "SyntheticMenu(menu=" + this.f43255n + ", items=" + this.rl + ")";
    }
}
