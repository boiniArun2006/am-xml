package tu;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class w6 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f74068n;
    private long rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f74069t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6)) {
            return false;
        }
        w6 w6Var = (w6) obj;
        return Intrinsics.areEqual(this.f74068n, w6Var.f74068n) && this.rl == w6Var.rl && Intrinsics.areEqual(this.f74069t, w6Var.f74069t);
    }

    public int hashCode() {
        String str = this.f74068n;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + Long.hashCode(this.rl)) * 31;
        String str2 = this.f74069t;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String n() {
        return this.f74068n;
    }

    public final long rl() {
        return this.rl;
    }

    public final String t() {
        return this.f74069t;
    }

    public String toString() {
        return "AudioGenreInfo(displayName=" + this.f74068n + ", genreId=" + this.rl + ", genreName=" + this.f74069t + ")";
    }

    public w6(String str, long j2, String str2) {
        this.f74068n = str;
        this.rl = j2;
        this.f74069t = str2;
    }
}
