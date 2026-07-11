package QmE;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class o implements j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Integer f8612n;
    private final List rl;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return Intrinsics.areEqual(this.f8612n, oVar.f8612n) && Intrinsics.areEqual(this.rl, oVar.rl);
    }

    public o(Integer num, List projectIds) {
        Intrinsics.checkNotNullParameter(projectIds, "projectIds");
        this.f8612n = num;
        this.rl = projectIds;
    }

    public int hashCode() {
        Integer num = this.f8612n;
        return ((num == null ? 0 : num.hashCode()) * 31) + this.rl.hashCode();
    }

    public final Integer n() {
        return this.f8612n;
    }

    public final List rl() {
        return this.rl;
    }

    public String toString() {
        return "Completed(exportFormat=" + this.f8612n + ", projectIds=" + this.rl + ")";
    }
}
