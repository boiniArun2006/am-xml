package Iy;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Map f4400n;
    private final boolean rl;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.areEqual(this.f4400n, nVar.f4400n) && this.rl == nVar.rl;
    }

    public n(Map localeNameStringMap, boolean z2) {
        Intrinsics.checkNotNullParameter(localeNameStringMap, "localeNameStringMap");
        this.f4400n = localeNameStringMap;
        this.rl = z2;
    }

    public int hashCode() {
        return (this.f4400n.hashCode() * 31) + Boolean.hashCode(this.rl);
    }

    public final boolean n() {
        return this.rl;
    }

    public final Map rl() {
        return this.f4400n;
    }

    public String toString() {
        return "LocalizedStrings(localeNameStringMap=" + this.f4400n + ", allowAppStrings=" + this.rl + ")";
    }
}
