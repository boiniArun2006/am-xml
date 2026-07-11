package GUx;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f3549n;
    private final Date rl;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.areEqual(this.f3549n, jVar.f3549n) && Intrinsics.areEqual(this.rl, jVar.rl);
    }

    public j(String sessionId, Date startDate) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(startDate, "startDate");
        this.f3549n = sessionId;
        this.rl = startDate;
    }

    public int hashCode() {
        return (this.f3549n.hashCode() * 31) + this.rl.hashCode();
    }

    public final String n() {
        return this.f3549n;
    }

    public final Date rl() {
        return this.rl;
    }

    public String toString() {
        return "RunningSessionData(sessionId=" + this.f3549n + ", startDate=" + this.rl + ")";
    }
}
