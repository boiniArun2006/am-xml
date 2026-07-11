package Fyf;

import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Date f3374n;
    private final Date rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f3375t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.areEqual(this.f3374n, jVar.f3374n) && Intrinsics.areEqual(this.rl, jVar.rl) && this.f3375t == jVar.f3375t;
    }

    public j(Date firstInstallDate, Date lastUpdateDate, boolean z2) {
        Intrinsics.checkNotNullParameter(firstInstallDate, "firstInstallDate");
        Intrinsics.checkNotNullParameter(lastUpdateDate, "lastUpdateDate");
        this.f3374n = firstInstallDate;
        this.rl = lastUpdateDate;
        this.f3375t = z2;
    }

    public int hashCode() {
        return (((this.f3374n.hashCode() * 31) + this.rl.hashCode()) * 31) + Boolean.hashCode(this.f3375t);
    }

    public final Date n() {
        return this.f3374n;
    }

    public final boolean rl() {
        return this.f3375t;
    }

    public String toString() {
        return "InstallInfo(firstInstallDate=" + this.f3374n + ", lastUpdateDate=" + this.rl + ", isInstalledBeforeBSP=" + this.f3375t + ")";
    }
}
