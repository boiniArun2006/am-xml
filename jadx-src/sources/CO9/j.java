package CO9;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f915n;
    private final long rl;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.areEqual(this.f915n, jVar.f915n) && this.rl == jVar.rl;
    }

    public j(String versionName, long j2) {
        Intrinsics.checkNotNullParameter(versionName, "versionName");
        this.f915n = versionName;
        this.rl = j2;
    }

    public int hashCode() {
        return (this.f915n.hashCode() * 31) + Long.hashCode(this.rl);
    }

    public final long n() {
        return this.rl;
    }

    public final String rl() {
        return this.f915n;
    }

    public String toString() {
        return "AppVersionInfo(versionName=" + this.f915n + ", versionCode=" + this.rl + ")";
    }
}
