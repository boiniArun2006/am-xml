package QmE;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class qz implements j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Integer f8615n;
    private final List rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Exception f8616t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qz)) {
            return false;
        }
        qz qzVar = (qz) obj;
        return Intrinsics.areEqual(this.f8615n, qzVar.f8615n) && Intrinsics.areEqual(this.rl, qzVar.rl) && Intrinsics.areEqual(this.f8616t, qzVar.f8616t);
    }

    public qz(Integer num, List projectIds, Exception exception) {
        Intrinsics.checkNotNullParameter(projectIds, "projectIds");
        Intrinsics.checkNotNullParameter(exception, "exception");
        this.f8615n = num;
        this.rl = projectIds;
        this.f8616t = exception;
    }

    public int hashCode() {
        Integer num = this.f8615n;
        return ((((num == null ? 0 : num.hashCode()) * 31) + this.rl.hashCode()) * 31) + this.f8616t.hashCode();
    }

    public final Exception n() {
        return this.f8616t;
    }

    public final Integer rl() {
        return this.f8615n;
    }

    public final List t() {
        return this.rl;
    }

    public String toString() {
        return "Failed(exportFormat=" + this.f8615n + ", projectIds=" + this.rl + ", exception=" + this.f8616t + ")";
    }
}
