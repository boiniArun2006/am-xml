package QmE;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class aC implements j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Integer f8363n;
    private final List rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Exception f8364t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aC)) {
            return false;
        }
        aC aCVar = (aC) obj;
        return Intrinsics.areEqual(this.f8363n, aCVar.f8363n) && Intrinsics.areEqual(this.rl, aCVar.rl) && Intrinsics.areEqual(this.f8364t, aCVar.f8364t);
    }

    public aC(Integer num, List projectIds, Exception exception) {
        Intrinsics.checkNotNullParameter(projectIds, "projectIds");
        Intrinsics.checkNotNullParameter(exception, "exception");
        this.f8363n = num;
        this.rl = projectIds;
        this.f8364t = exception;
    }

    public int hashCode() {
        Integer num = this.f8363n;
        return ((((num == null ? 0 : num.hashCode()) * 31) + this.rl.hashCode()) * 31) + this.f8364t.hashCode();
    }

    public final Exception n() {
        return this.f8364t;
    }

    public final Integer rl() {
        return this.f8363n;
    }

    public final List t() {
        return this.rl;
    }

    public String toString() {
        return "Failed(exportFormat=" + this.f8363n + ", projectIds=" + this.rl + ", exception=" + this.f8364t + ")";
    }
}
