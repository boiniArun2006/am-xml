package AR;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class I28 {
    private final String J2;
    private final Boolean KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final String f66O;
    private final boolean Uo;
    private final j gh;
    private final n mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f67n;
    private final String nr;
    private final Map qie;
    private final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f68t;
    private final Boolean xMQ;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof I28)) {
            return false;
        }
        I28 i28 = (I28) obj;
        return Intrinsics.areEqual(this.f67n, i28.f67n) && Intrinsics.areEqual(this.rl, i28.rl) && Intrinsics.areEqual(this.f68t, i28.f68t) && Intrinsics.areEqual(this.nr, i28.nr) && Intrinsics.areEqual(this.f66O, i28.f66O) && Intrinsics.areEqual(this.J2, i28.J2) && this.Uo == i28.Uo && Intrinsics.areEqual(this.KN, i28.KN) && Intrinsics.areEqual(this.xMQ, i28.xMQ) && Intrinsics.areEqual(this.mUb, i28.mUb) && Intrinsics.areEqual(this.gh, i28.gh) && Intrinsics.areEqual(this.qie, i28.qie);
    }

    public I28(String country, String language, String appLanguage, String locale, String appVersion, String bundleVersion, boolean z2, Boolean bool, Boolean bool2, n timezone, j device, Map experiment) {
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(appLanguage, "appLanguage");
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(bundleVersion, "bundleVersion");
        Intrinsics.checkNotNullParameter(timezone, "timezone");
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(experiment, "experiment");
        this.f67n = country;
        this.rl = language;
        this.f68t = appLanguage;
        this.nr = locale;
        this.f66O = appVersion;
        this.J2 = bundleVersion;
        this.Uo = z2;
        this.KN = bool;
        this.xMQ = bool2;
        this.mUb = timezone;
        this.gh = device;
        this.qie = experiment;
    }

    public final Map J2() {
        return this.qie;
    }

    public final String KN() {
        return this.rl;
    }

    public final j O() {
        return this.gh;
    }

    public final boolean Uo() {
        return this.Uo;
    }

    public final Boolean gh() {
        return this.KN;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.f67n.hashCode() * 31) + this.rl.hashCode()) * 31) + this.f68t.hashCode()) * 31) + this.nr.hashCode()) * 31) + this.f66O.hashCode()) * 31) + this.J2.hashCode()) * 31) + Boolean.hashCode(this.Uo)) * 31;
        Boolean bool = this.KN;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.xMQ;
        return ((((((iHashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 31) + this.mUb.hashCode()) * 31) + this.gh.hashCode()) * 31) + this.qie.hashCode();
    }

    public final n mUb() {
        return this.mUb;
    }

    public final String n() {
        return this.f68t;
    }

    public final String nr() {
        return this.f67n;
    }

    public final Boolean qie() {
        return this.xMQ;
    }

    public final String rl() {
        return this.f66O;
    }

    public final String t() {
        return this.J2;
    }

    public String toString() {
        return "UserInfo(country=" + this.f67n + ", language=" + this.rl + ", appLanguage=" + this.f68t + ", locale=" + this.nr + ", appVersion=" + this.f66O + ", bundleVersion=" + this.J2 + ", installedBeforePico=" + this.Uo + ", isBaseline=" + this.KN + ", isFree=" + this.xMQ + ", timezone=" + this.mUb + ", device=" + this.gh + ", experiment=" + this.qie + ")";
    }

    public final String xMQ() {
        return this.nr;
    }
}
