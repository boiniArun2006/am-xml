package KfI;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class j {
    private final List J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final l3D f5711O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f5712n;
    private final String nr;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f5713t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return Intrinsics.areEqual(this.f5712n, jVar.f5712n) && Intrinsics.areEqual(this.rl, jVar.rl) && Intrinsics.areEqual(this.f5713t, jVar.f5713t) && Intrinsics.areEqual(this.nr, jVar.nr) && Intrinsics.areEqual(this.f5711O, jVar.f5711O) && Intrinsics.areEqual(this.J2, jVar.J2);
    }

    public j(String packageName, String versionName, String appBuildVersion, String deviceManufacturer, l3D currentProcessDetails, List appProcessDetails) {
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(versionName, "versionName");
        Intrinsics.checkNotNullParameter(appBuildVersion, "appBuildVersion");
        Intrinsics.checkNotNullParameter(deviceManufacturer, "deviceManufacturer");
        Intrinsics.checkNotNullParameter(currentProcessDetails, "currentProcessDetails");
        Intrinsics.checkNotNullParameter(appProcessDetails, "appProcessDetails");
        this.f5712n = packageName;
        this.rl = versionName;
        this.f5713t = appBuildVersion;
        this.nr = deviceManufacturer;
        this.f5711O = currentProcessDetails;
        this.J2 = appProcessDetails;
    }

    public final String J2() {
        return this.rl;
    }

    public final String O() {
        return this.f5712n;
    }

    public int hashCode() {
        return (((((((((this.f5712n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f5713t.hashCode()) * 31) + this.nr.hashCode()) * 31) + this.f5711O.hashCode()) * 31) + this.J2.hashCode();
    }

    public final String n() {
        return this.f5713t;
    }

    public final String nr() {
        return this.nr;
    }

    public final List rl() {
        return this.J2;
    }

    public final l3D t() {
        return this.f5711O;
    }

    public String toString() {
        return "AndroidApplicationInfo(packageName=" + this.f5712n + ", versionName=" + this.rl + ", appBuildVersion=" + this.f5713t + ", deviceManufacturer=" + this.nr + ", currentProcessDetails=" + this.f5711O + ", appProcessDetails=" + this.J2 + ')';
    }
}
