package KfI;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class r {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f5739n;
    private final long nr;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f5740t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Intrinsics.areEqual(this.f5739n, rVar.f5739n) && Intrinsics.areEqual(this.rl, rVar.rl) && this.f5740t == rVar.f5740t && this.nr == rVar.nr;
    }

    public r(String sessionId, String firstSessionId, int i2, long j2) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(firstSessionId, "firstSessionId");
        this.f5739n = sessionId;
        this.rl = firstSessionId;
        this.f5740t = i2;
        this.nr = j2;
    }

    public int hashCode() {
        return (((((this.f5739n.hashCode() * 31) + this.rl.hashCode()) * 31) + Integer.hashCode(this.f5740t)) * 31) + Long.hashCode(this.nr);
    }

    public final String n() {
        return this.rl;
    }

    public final long nr() {
        return this.nr;
    }

    public final String rl() {
        return this.f5739n;
    }

    public final int t() {
        return this.f5740t;
    }

    public String toString() {
        return "SessionDetails(sessionId=" + this.f5739n + ", firstSessionId=" + this.rl + ", sessionIndex=" + this.f5740t + ", sessionStartTimestampUs=" + this.nr + ')';
    }
}
