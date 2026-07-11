package QmE;

import QmE.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class Zs implements j.QUT {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f8362n;
    private final boolean rl;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Zs)) {
            return false;
        }
        Zs zs = (Zs) obj;
        return Intrinsics.areEqual(this.f8362n, zs.f8362n) && this.rl == zs.rl;
    }

    public Zs(String url, boolean z2) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f8362n = url;
        this.rl = z2;
    }

    public int hashCode() {
        return (this.f8362n.hashCode() * 31) + Boolean.hashCode(this.rl);
    }

    public final String n() {
        return this.f8362n;
    }

    public final boolean rl() {
        return this.rl;
    }

    public String toString() {
        return "TemplateFavoriteToggled(url=" + this.f8362n + ", isFavorite=" + this.rl + ")";
    }
}
