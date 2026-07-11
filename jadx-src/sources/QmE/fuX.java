package QmE;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class fuX implements j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Integer f8369n;
    private final List rl;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fuX)) {
            return false;
        }
        fuX fux = (fuX) obj;
        return Intrinsics.areEqual(this.f8369n, fux.f8369n) && Intrinsics.areEqual(this.rl, fux.rl);
    }

    public fuX(Integer num, List projectIds) {
        Intrinsics.checkNotNullParameter(projectIds, "projectIds");
        this.f8369n = num;
        this.rl = projectIds;
    }

    public int hashCode() {
        Integer num = this.f8369n;
        return ((num == null ? 0 : num.hashCode()) * 31) + this.rl.hashCode();
    }

    public final Integer n() {
        return this.f8369n;
    }

    public final List rl() {
        return this.rl;
    }

    public String toString() {
        return "Canceled(exportFormat=" + this.f8369n + ", projectIds=" + this.rl + ")";
    }
}
