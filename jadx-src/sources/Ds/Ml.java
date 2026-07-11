package Ds;

import j$.time.LocalDateTime;
import kotlin.jvm.internal.Intrinsics;
import qcD.nehv.Apsps;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f1934n;
    private final String nr;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final LocalDateTime f1935t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ml)) {
            return false;
        }
        Ml ml = (Ml) obj;
        return Intrinsics.areEqual(this.f1934n, ml.f1934n) && Intrinsics.areEqual(this.rl, ml.rl) && Intrinsics.areEqual(this.f1935t, ml.f1935t) && Intrinsics.areEqual(this.nr, ml.nr);
    }

    public Ml(String version, String str, LocalDateTime effectiveDateUTC, String str2) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(str, Apsps.RnIMAKLlRzIyPu);
        Intrinsics.checkNotNullParameter(effectiveDateUTC, "effectiveDateUTC");
        this.f1934n = version;
        this.rl = str;
        this.f1935t = effectiveDateUTC;
        this.nr = str2;
    }

    public int hashCode() {
        int iHashCode = ((((this.f1934n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f1935t.hashCode()) * 31;
        String str = this.nr;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String n() {
        return this.nr;
    }

    public final String rl() {
        return this.f1934n;
    }

    public String toString() {
        return "TermsOfService(version=" + this.f1934n + ", url=" + this.rl + ", effectiveDateUTC=" + this.f1935t + ", updateMessage=" + this.nr + ")";
    }
}
