package Ds;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f1943n;
    private final String rl;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6)) {
            return false;
        }
        w6 w6Var = (w6) obj;
        return Intrinsics.areEqual(this.f1943n, w6Var.f1943n) && Intrinsics.areEqual(this.rl, w6Var.rl);
    }

    public w6(String version, String url) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f1943n = version;
        this.rl = url;
    }

    public int hashCode() {
        return (this.f1943n.hashCode() * 31) + this.rl.hashCode();
    }

    public final String n() {
        return this.rl;
    }

    public final String rl() {
        return this.f1943n;
    }

    public String toString() {
        return "PrivacyNotice(version=" + this.f1943n + ", url=" + this.rl + ")";
    }
}
