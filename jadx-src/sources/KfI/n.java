package KfI;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class n {
    private final j J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final QJ f5719O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f5720n;
    private final String nr;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f5721t;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return Intrinsics.areEqual(this.f5720n, nVar.f5720n) && Intrinsics.areEqual(this.rl, nVar.rl) && Intrinsics.areEqual(this.f5721t, nVar.f5721t) && Intrinsics.areEqual(this.nr, nVar.nr) && this.f5719O == nVar.f5719O && Intrinsics.areEqual(this.J2, nVar.J2);
    }

    public n(String appId, String deviceModel, String sessionSdkVersion, String osVersion, QJ logEnvironment, j androidAppInfo) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(sessionSdkVersion, "sessionSdkVersion");
        Intrinsics.checkNotNullParameter(osVersion, "osVersion");
        Intrinsics.checkNotNullParameter(logEnvironment, "logEnvironment");
        Intrinsics.checkNotNullParameter(androidAppInfo, "androidAppInfo");
        this.f5720n = appId;
        this.rl = deviceModel;
        this.f5721t = sessionSdkVersion;
        this.nr = osVersion;
        this.f5719O = logEnvironment;
        this.J2 = androidAppInfo;
    }

    public final String J2() {
        return this.f5721t;
    }

    public final String O() {
        return this.nr;
    }

    public int hashCode() {
        return (((((((((this.f5720n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f5721t.hashCode()) * 31) + this.nr.hashCode()) * 31) + this.f5719O.hashCode()) * 31) + this.J2.hashCode();
    }

    public final j n() {
        return this.J2;
    }

    public final QJ nr() {
        return this.f5719O;
    }

    public final String rl() {
        return this.f5720n;
    }

    public final String t() {
        return this.rl;
    }

    public String toString() {
        return "ApplicationInfo(appId=" + this.f5720n + ", deviceModel=" + this.rl + ", sessionSdkVersion=" + this.f5721t + ", osVersion=" + this.nr + ", logEnvironment=" + this.f5719O + ", androidAppInfo=" + this.J2 + ')';
    }
}
