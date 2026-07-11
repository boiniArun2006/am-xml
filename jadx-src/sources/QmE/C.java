package QmE;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class C implements j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Integer f8340n;
    private final List rl;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c2 = (C) obj;
        return Intrinsics.areEqual(this.f8340n, c2.f8340n) && Intrinsics.areEqual(this.rl, c2.rl);
    }

    public C(Integer num, List projectIds) {
        Intrinsics.checkNotNullParameter(projectIds, "projectIds");
        this.f8340n = num;
        this.rl = projectIds;
    }

    public int hashCode() {
        Integer num = this.f8340n;
        return ((num == null ? 0 : num.hashCode()) * 31) + this.rl.hashCode();
    }

    public final Integer n() {
        return this.f8340n;
    }

    public final List rl() {
        return this.rl;
    }

    public String toString() {
        return "Started(exportFormat=" + this.f8340n + ", projectIds=" + this.rl + ")";
    }
}
