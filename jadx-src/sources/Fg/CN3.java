package Fg;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class CN3 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f2792n;
    private final String rl;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CN3)) {
            return false;
        }
        CN3 cn3 = (CN3) obj;
        return Intrinsics.areEqual(this.f2792n, cn3.f2792n) && Intrinsics.areEqual(this.rl, cn3.rl);
    }

    public CN3(String userId, String projectPackageId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(projectPackageId, "projectPackageId");
        this.f2792n = userId;
        this.rl = projectPackageId;
    }

    public int hashCode() {
        return (this.f2792n.hashCode() * 31) + this.rl.hashCode();
    }

    public final String n() {
        return this.rl;
    }

    public final String rl() {
        return this.f2792n;
    }

    public String toString() {
        return "ProjectPackageLinkInfo(userId=" + this.f2792n + ", projectPackageId=" + this.rl + ")";
    }
}
