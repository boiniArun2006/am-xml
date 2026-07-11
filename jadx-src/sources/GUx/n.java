package GUx;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f3550n;
    private final double rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f3551t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.areEqual(this.f3550n, nVar.f3550n) && Double.compare(this.rl, nVar.rl) == 0 && this.f3551t == nVar.f3551t;
    }

    public n(String sessionId, double d2, boolean z2) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.f3550n = sessionId;
        this.rl = d2;
        this.f3551t = z2;
    }

    public int hashCode() {
        return (((this.f3550n.hashCode() * 31) + Double.hashCode(this.rl)) * 31) + Boolean.hashCode(this.f3551t);
    }

    public final double n() {
        return this.rl;
    }

    public final boolean rl() {
        return this.f3551t;
    }

    public final String t() {
        return this.f3550n;
    }

    public String toString() {
        return "StoredSessionData(sessionId=" + this.f3550n + ", durationInSeconds=" + this.rl + ", hasBeenLogged=" + this.f3551t + ")";
    }
}
