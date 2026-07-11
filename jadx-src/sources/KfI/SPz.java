package KfI;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class SPz {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final aC f5662n;
    private final Ew rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final n f5663t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SPz)) {
            return false;
        }
        SPz sPz = (SPz) obj;
        return this.f5662n == sPz.f5662n && Intrinsics.areEqual(this.rl, sPz.rl) && Intrinsics.areEqual(this.f5663t, sPz.f5663t);
    }

    public SPz(aC eventType, Ew sessionData, n applicationInfo) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        Intrinsics.checkNotNullParameter(sessionData, "sessionData");
        Intrinsics.checkNotNullParameter(applicationInfo, "applicationInfo");
        this.f5662n = eventType;
        this.rl = sessionData;
        this.f5663t = applicationInfo;
    }

    public int hashCode() {
        return (((this.f5662n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f5663t.hashCode();
    }

    public final n n() {
        return this.f5663t;
    }

    public final aC rl() {
        return this.f5662n;
    }

    public final Ew t() {
        return this.rl;
    }

    public String toString() {
        return "SessionEvent(eventType=" + this.f5662n + ", sessionData=" + this.rl + ", applicationInfo=" + this.f5663t + ')';
    }
}
