package QmE;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Dsr implements j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Integer f8343n;
    private final List rl;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Dsr)) {
            return false;
        }
        Dsr dsr = (Dsr) obj;
        return Intrinsics.areEqual(this.f8343n, dsr.f8343n) && Intrinsics.areEqual(this.rl, dsr.rl);
    }

    public Dsr(Integer num, List projectIds) {
        Intrinsics.checkNotNullParameter(projectIds, "projectIds");
        this.f8343n = num;
        this.rl = projectIds;
    }

    public int hashCode() {
        Integer num = this.f8343n;
        return ((num == null ? 0 : num.hashCode()) * 31) + this.rl.hashCode();
    }

    public final Integer n() {
        return this.f8343n;
    }

    public final List rl() {
        return this.rl;
    }

    public String toString() {
        return "Completed(exportFormat=" + this.f8343n + ", projectIds=" + this.rl + ")";
    }
}
