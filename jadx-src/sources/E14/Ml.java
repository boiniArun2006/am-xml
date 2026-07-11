package E14;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f2242n;
    private final List rl;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ml)) {
            return false;
        }
        Ml ml = (Ml) obj;
        return Intrinsics.areEqual(this.f2242n, ml.f2242n) && Intrinsics.areEqual(this.rl, ml.rl);
    }

    public Ml(String str, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f2242n = str;
        this.rl = items;
    }

    public int hashCode() {
        String str = this.f2242n;
        return ((str == null ? 0 : str.hashCode()) * 31) + this.rl.hashCode();
    }

    public final List n() {
        return this.rl;
    }

    public final String rl() {
        return this.f2242n;
    }

    public String toString() {
        return "SecretMenuSectionUIState(title=" + this.f2242n + ", items=" + this.rl + ")";
    }
}
