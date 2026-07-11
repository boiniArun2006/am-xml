package E14;

import androidx.media3.exoplayer.hls.offline.Oqje.QiDPjiOCZHDS;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class w6 {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final String f2247O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f2248n;
    private final j nr;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f2249t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6)) {
            return false;
        }
        w6 w6Var = (w6) obj;
        return Intrinsics.areEqual(this.f2248n, w6Var.f2248n) && Intrinsics.areEqual(this.rl, w6Var.rl) && Intrinsics.areEqual(this.f2249t, w6Var.f2249t) && Intrinsics.areEqual(this.nr, w6Var.nr) && Intrinsics.areEqual(this.f2247O, w6Var.f2247O);
    }

    public w6(String id, String title, String str, j content, String str2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(str, QiDPjiOCZHDS.bgfZEnbMAVoH);
        Intrinsics.checkNotNullParameter(content, "content");
        this.f2248n = id;
        this.rl = title;
        this.f2249t = str;
        this.nr = content;
        this.f2247O = str2;
    }

    public final String O() {
        return this.rl;
    }

    public int hashCode() {
        int iHashCode = ((((((this.f2248n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f2249t.hashCode()) * 31) + this.nr.hashCode()) * 31;
        String str = this.f2247O;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final j n() {
        return this.nr;
    }

    public final String nr() {
        return this.f2248n;
    }

    public final String rl() {
        return this.f2247O;
    }

    public final String t() {
        return this.f2249t;
    }

    public String toString() {
        return "SecretMenuItemUIState(id=" + this.f2248n + ", title=" + this.rl + ", headerEmoji=" + this.f2249t + ", content=" + this.nr + ", description=" + this.f2247O + ")";
    }
}
