package KfI;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Ew {
    private final String J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final I28 f5642O;
    private final String Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f5643n;
    private final long nr;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f5644t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ew)) {
            return false;
        }
        Ew ew = (Ew) obj;
        return Intrinsics.areEqual(this.f5643n, ew.f5643n) && Intrinsics.areEqual(this.rl, ew.rl) && this.f5644t == ew.f5644t && this.nr == ew.nr && Intrinsics.areEqual(this.f5642O, ew.f5642O) && Intrinsics.areEqual(this.J2, ew.J2) && Intrinsics.areEqual(this.Uo, ew.Uo);
    }

    public Ew(String sessionId, String firstSessionId, int i2, long j2, I28 dataCollectionStatus, String firebaseInstallationId, String firebaseAuthenticationToken) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(firstSessionId, "firstSessionId");
        Intrinsics.checkNotNullParameter(dataCollectionStatus, "dataCollectionStatus");
        Intrinsics.checkNotNullParameter(firebaseInstallationId, "firebaseInstallationId");
        Intrinsics.checkNotNullParameter(firebaseAuthenticationToken, "firebaseAuthenticationToken");
        this.f5643n = sessionId;
        this.rl = firstSessionId;
        this.f5644t = i2;
        this.nr = j2;
        this.f5642O = dataCollectionStatus;
        this.J2 = firebaseInstallationId;
        this.Uo = firebaseAuthenticationToken;
    }

    public final String J2() {
        return this.f5643n;
    }

    public final String O() {
        return this.rl;
    }

    public final int Uo() {
        return this.f5644t;
    }

    public int hashCode() {
        return (((((((((((this.f5643n.hashCode() * 31) + this.rl.hashCode()) * 31) + Integer.hashCode(this.f5644t)) * 31) + Long.hashCode(this.nr)) * 31) + this.f5642O.hashCode()) * 31) + this.J2.hashCode()) * 31) + this.Uo.hashCode();
    }

    public final I28 n() {
        return this.f5642O;
    }

    public final String nr() {
        return this.J2;
    }

    public final long rl() {
        return this.nr;
    }

    public final String t() {
        return this.Uo;
    }

    public String toString() {
        return "SessionInfo(sessionId=" + this.f5643n + ", firstSessionId=" + this.rl + ", sessionIndex=" + this.f5644t + ", eventTimestampUs=" + this.nr + ", dataCollectionStatus=" + this.f5642O + ", firebaseInstallationId=" + this.J2 + ", firebaseAuthenticationToken=" + this.Uo + ')';
    }
}
