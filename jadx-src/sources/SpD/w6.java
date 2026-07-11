package SpD;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class w6 {
    private final String HI;
    private final String J2;
    private final String KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final String f9959O;
    private final String Uo;
    private final String az;
    private final int ck;
    private final String gh;
    private final String mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f9960n;
    private final String nr;
    private final String qie;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f9961t;
    private final boolean ty;
    private final String xMQ;

    public w6(String appVersion, String bundleVersion, String country, String deviceAndroidVersion, String deviceLanguage, String deviceModel, String deviceOsBuildId, String deviceOsVersionRelease, String devicePlatform, String deviceScreenSize, String locale, String sdkVersion, String sessionId, boolean z2, String timezoneName, int i2) {
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(bundleVersion, "bundleVersion");
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(deviceAndroidVersion, "deviceAndroidVersion");
        Intrinsics.checkNotNullParameter(deviceLanguage, "deviceLanguage");
        Intrinsics.checkNotNullParameter(deviceModel, "deviceModel");
        Intrinsics.checkNotNullParameter(deviceOsBuildId, "deviceOsBuildId");
        Intrinsics.checkNotNullParameter(deviceOsVersionRelease, "deviceOsVersionRelease");
        Intrinsics.checkNotNullParameter(devicePlatform, "devicePlatform");
        Intrinsics.checkNotNullParameter(deviceScreenSize, "deviceScreenSize");
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(sdkVersion, "sdkVersion");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(timezoneName, "timezoneName");
        this.f9960n = appVersion;
        this.rl = bundleVersion;
        this.f9961t = country;
        this.nr = deviceAndroidVersion;
        this.f9959O = deviceLanguage;
        this.J2 = deviceModel;
        this.Uo = deviceOsBuildId;
        this.KN = deviceOsVersionRelease;
        this.xMQ = devicePlatform;
        this.mUb = deviceScreenSize;
        this.gh = locale;
        this.qie = sdkVersion;
        this.az = sessionId;
        this.ty = z2;
        this.HI = timezoneName;
        this.ck = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w6)) {
            return false;
        }
        w6 w6Var = (w6) obj;
        return Intrinsics.areEqual(this.f9960n, w6Var.f9960n) && Intrinsics.areEqual(this.rl, w6Var.rl) && Intrinsics.areEqual(this.f9961t, w6Var.f9961t) && Intrinsics.areEqual(this.nr, w6Var.nr) && Intrinsics.areEqual(this.f9959O, w6Var.f9959O) && Intrinsics.areEqual(this.J2, w6Var.J2) && Intrinsics.areEqual(this.Uo, w6Var.Uo) && Intrinsics.areEqual(this.KN, w6Var.KN) && Intrinsics.areEqual(this.xMQ, w6Var.xMQ) && Intrinsics.areEqual(this.mUb, w6Var.mUb) && Intrinsics.areEqual(this.gh, w6Var.gh) && Intrinsics.areEqual(this.qie, w6Var.qie) && Intrinsics.areEqual(this.az, w6Var.az) && this.ty == w6Var.ty && Intrinsics.areEqual(this.HI, w6Var.HI) && this.ck == w6Var.ck;
    }

    public final String HI() {
        return this.HI;
    }

    public final String J2() {
        return this.J2;
    }

    public final String KN() {
        return this.KN;
    }

    public final String O() {
        return this.f9959O;
    }

    public final String Uo() {
        return this.Uo;
    }

    public final String az() {
        return this.az;
    }

    public final int ck() {
        return this.ck;
    }

    public final String gh() {
        return this.gh;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((this.f9960n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f9961t.hashCode()) * 31) + this.nr.hashCode()) * 31) + this.f9959O.hashCode()) * 31) + this.J2.hashCode()) * 31) + this.Uo.hashCode()) * 31) + this.KN.hashCode()) * 31) + this.xMQ.hashCode()) * 31) + this.mUb.hashCode()) * 31) + this.gh.hashCode()) * 31) + this.qie.hashCode()) * 31) + this.az.hashCode()) * 31) + Boolean.hashCode(this.ty)) * 31) + this.HI.hashCode()) * 31) + Integer.hashCode(this.ck);
    }

    public final String mUb() {
        return this.mUb;
    }

    public final String n() {
        return this.f9960n;
    }

    public final String nr() {
        return this.nr;
    }

    public final String qie() {
        return this.qie;
    }

    public final String rl() {
        return this.rl;
    }

    public final String t() {
        return this.f9961t;
    }

    public String toString() {
        return "PicoXContext(appVersion=" + this.f9960n + ", bundleVersion=" + this.rl + ", country=" + this.f9961t + ", deviceAndroidVersion=" + this.nr + ", deviceLanguage=" + this.f9959O + ", deviceModel=" + this.J2 + ", deviceOsBuildId=" + this.Uo + ", deviceOsVersionRelease=" + this.KN + ", devicePlatform=" + this.xMQ + ", deviceScreenSize=" + this.mUb + ", locale=" + this.gh + ", sdkVersion=" + this.qie + ", sessionId=" + this.az + ", timezoneDaylightSaving=" + this.ty + ", timezoneName=" + this.HI + ", timezoneSeconds=" + this.ck + ")";
    }

    public final boolean ty() {
        return this.ty;
    }

    public final String xMQ() {
        return this.xMQ;
    }
}
