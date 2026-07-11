package SpD;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class j {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final String f9956O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f9957n;
    private final String nr;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f9958t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.areEqual(this.f9957n, jVar.f9957n) && Intrinsics.areEqual(this.rl, jVar.rl) && Intrinsics.areEqual(this.f9958t, jVar.f9958t) && Intrinsics.areEqual(this.nr, jVar.nr) && Intrinsics.areEqual(this.f9956O, jVar.f9956O);
    }

    public j(String str, String str2, String androidId, String backupPersistentId, String nonBackupPersistentId) {
        Intrinsics.checkNotNullParameter(androidId, "androidId");
        Intrinsics.checkNotNullParameter(backupPersistentId, "backupPersistentId");
        Intrinsics.checkNotNullParameter(nonBackupPersistentId, "nonBackupPersistentId");
        this.f9957n = str;
        this.rl = str2;
        this.f9958t = androidId;
        this.nr = backupPersistentId;
        this.f9956O = nonBackupPersistentId;
    }

    public final String O() {
        return this.f9956O;
    }

    public int hashCode() {
        String str = this.f9957n;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.rl;
        return ((((((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.f9958t.hashCode()) * 31) + this.nr.hashCode()) * 31) + this.f9956O.hashCode();
    }

    public final String n() {
        return this.rl;
    }

    public final String nr() {
        return this.nr;
    }

    public final String rl() {
        return this.f9958t;
    }

    public final String t() {
        return this.f9957n;
    }

    public String toString() {
        return "Identifiers(appSetId=" + this.f9957n + ", aaid=" + this.rl + ", androidId=" + this.f9958t + ", backupPersistentId=" + this.nr + ", nonBackupPersistentId=" + this.f9956O + ")";
    }
}
