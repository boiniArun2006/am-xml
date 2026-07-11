package QmE;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class Pl implements j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Integer f8354n;
    private final List rl;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pl)) {
            return false;
        }
        Pl pl = (Pl) obj;
        return Intrinsics.areEqual(this.f8354n, pl.f8354n) && Intrinsics.areEqual(this.rl, pl.rl);
    }

    public Pl(Integer num, List projectIds) {
        Intrinsics.checkNotNullParameter(projectIds, "projectIds");
        this.f8354n = num;
        this.rl = projectIds;
    }

    public int hashCode() {
        Integer num = this.f8354n;
        return ((num == null ? 0 : num.hashCode()) * 31) + this.rl.hashCode();
    }

    public final Integer n() {
        return this.f8354n;
    }

    public final List rl() {
        return this.rl;
    }

    public String toString() {
        return "Started(exportFormat=" + this.f8354n + ", projectIds=" + this.rl + ")";
    }
}
