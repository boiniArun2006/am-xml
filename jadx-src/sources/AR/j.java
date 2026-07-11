package AR;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class j {
    private final String J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final String f73O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f74n;
    private final double nr;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f75t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.areEqual(this.f74n, jVar.f74n) && Intrinsics.areEqual(this.rl, jVar.rl) && Intrinsics.areEqual(this.f75t, jVar.f75t) && Double.compare(this.nr, jVar.nr) == 0 && Intrinsics.areEqual(this.f73O, jVar.f73O) && Intrinsics.areEqual(this.J2, jVar.J2);
    }

    public j(String osVersionApi, String osVersionRelease, String osBuildId, double d2, String manufacturer, String model) {
        Intrinsics.checkNotNullParameter(osVersionApi, "osVersionApi");
        Intrinsics.checkNotNullParameter(osVersionRelease, "osVersionRelease");
        Intrinsics.checkNotNullParameter(osBuildId, "osBuildId");
        Intrinsics.checkNotNullParameter(manufacturer, "manufacturer");
        Intrinsics.checkNotNullParameter(model, "model");
        this.f74n = osVersionApi;
        this.rl = osVersionRelease;
        this.f75t = osBuildId;
        this.nr = d2;
        this.f73O = manufacturer;
        this.J2 = model;
    }

    public final double J2() {
        return this.nr;
    }

    public final String O() {
        return this.rl;
    }

    public int hashCode() {
        return (((((((((this.f74n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f75t.hashCode()) * 31) + Double.hashCode(this.nr)) * 31) + this.f73O.hashCode()) * 31) + this.J2.hashCode();
    }

    public final String n() {
        return this.f73O;
    }

    public final String nr() {
        return this.f74n;
    }

    public final String rl() {
        return this.J2;
    }

    public final String t() {
        return this.f75t;
    }

    public String toString() {
        return "DeviceInfo(osVersionApi=" + this.f74n + ", osVersionRelease=" + this.rl + ", osBuildId=" + this.f75t + ", screenSize=" + this.nr + ", manufacturer=" + this.f73O + ", model=" + this.J2 + ")";
    }
}
