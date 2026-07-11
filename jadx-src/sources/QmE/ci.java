package QmE;

import QmE.j;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class ci implements j.QUT {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f8367n;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ci) && Intrinsics.areEqual(this.f8367n, ((ci) obj).f8367n);
    }

    public ci(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f8367n = url;
    }

    public int hashCode() {
        return this.f8367n.hashCode();
    }

    public final String n() {
        return this.f8367n;
    }

    public String toString() {
        return "TemplateTapped(url=" + this.f8367n + ")";
    }
}
