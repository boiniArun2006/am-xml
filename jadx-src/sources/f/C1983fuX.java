package f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: f.fuX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class C1983fuX implements sqD.I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final EnumC1973CN3 f64026n;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1983fuX) && this.f64026n == ((C1983fuX) obj).f64026n;
    }

    public C1983fuX(EnumC1973CN3 destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.f64026n = destination;
    }

    public int hashCode() {
        return this.f64026n.hashCode();
    }

    public final EnumC1973CN3 rl() {
        return this.f64026n;
    }

    public String toString() {
        return "NavigateExperience(destination=" + this.f64026n + ")";
    }
}
