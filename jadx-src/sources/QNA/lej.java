package QNA;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class lej {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f8128n;
    private final String rl;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lej)) {
            return false;
        }
        lej lejVar = (lej) obj;
        return Intrinsics.areEqual(this.f8128n, lejVar.f8128n) && Intrinsics.areEqual(this.rl, lejVar.rl);
    }

    public int hashCode() {
        String str = this.f8128n;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.rl;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String n() {
        return this.rl;
    }

    public final String rl() {
        return this.f8128n;
    }

    public String toString() {
        return "FirebaseInstallationId(fid=" + this.f8128n + ", authToken=" + this.rl + ')';
    }

    public lej(String str, String str2) {
        this.f8128n = str;
        this.rl = str2;
    }
}
