package Ds;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f1933n;
    private final String rl;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I28)) {
            return false;
        }
        I28 i28 = (I28) obj;
        return Intrinsics.areEqual(this.f1933n, i28.f1933n) && Intrinsics.areEqual(this.rl, i28.rl);
    }

    public int hashCode() {
        String str = this.f1933n;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.rl;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "UserInfo(lastAcceptedTosVersion=" + this.f1933n + ", lastAcknowledgedPnVersion=" + this.rl + ")";
    }

    public I28(String str, String str2) {
        this.f1933n = str;
        this.rl = str2;
    }
}
