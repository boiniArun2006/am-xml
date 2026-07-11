package QmE;

import QmE.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class r implements j.QUT {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f8617n;
    private final boolean rl;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Intrinsics.areEqual(this.f8617n, rVar.f8617n) && this.rl == rVar.rl;
    }

    public r(String url, boolean z2) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f8617n = url;
        this.rl = z2;
    }

    public int hashCode() {
        return (this.f8617n.hashCode() * 31) + Boolean.hashCode(this.rl);
    }

    public final String n() {
        return this.f8617n;
    }

    public final boolean rl() {
        return this.rl;
    }

    public String toString() {
        return "TemplateFavoriteToggled(url=" + this.f8617n + ", isFavorite=" + this.rl + ")";
    }
}
