package SpD;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class Wre {
    private final String J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final String f9948O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final fuX f9949n;
    private final String nr;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f9950t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Wre)) {
            return false;
        }
        Wre wre = (Wre) obj;
        return this.f9949n == wre.f9949n && Intrinsics.areEqual(this.rl, wre.rl) && Intrinsics.areEqual(this.f9950t, wre.f9950t) && Intrinsics.areEqual(this.nr, wre.nr) && Intrinsics.areEqual(this.f9948O, wre.f9948O) && Intrinsics.areEqual(this.J2, wre.J2);
    }

    public Wre(fuX pingType, String str, String str2, String str3, String str4, String currentAppVersion) {
        Intrinsics.checkNotNullParameter(pingType, "pingType");
        Intrinsics.checkNotNullParameter(currentAppVersion, "currentAppVersion");
        this.f9949n = pingType;
        this.rl = str;
        this.f9950t = str2;
        this.nr = str3;
        this.f9948O = str4;
        this.J2 = currentAppVersion;
    }

    public final fuX J2() {
        return this.f9949n;
    }

    public final String O() {
        return this.f9948O;
    }

    public int hashCode() {
        int iHashCode = this.f9949n.hashCode() * 31;
        String str = this.rl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f9950t;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.nr;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f9948O;
        return ((iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.J2.hashCode();
    }

    public final String n() {
        return this.rl;
    }

    public final String nr() {
        return this.nr;
    }

    public final String rl() {
        return this.J2;
    }

    public final String t() {
        return this.f9950t;
    }

    public String toString() {
        return "PingPayload(pingType=" + this.f9949n + ", backupPersistentIdStatus=" + this.rl + ", nonBackupPersistentIdStatus=" + this.f9950t + ", oldAppVersion=" + this.nr + ", oldBundleVersion=" + this.f9948O + ", currentAppVersion=" + this.J2 + ")";
    }
}
