package f;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: f.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class C1985n implements sqD.I28 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final EnumC1978Wre f64029n;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1985n) && this.f64029n == ((C1985n) obj).f64029n;
    }

    public C1985n(EnumC1978Wre adType) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        this.f64029n = adType;
    }

    public int hashCode() {
        return this.f64029n.hashCode();
    }

    public final EnumC1978Wre rl() {
        return this.f64029n;
    }

    public String toString() {
        return "AdExperience(adType=" + this.f64029n + ")";
    }
}
