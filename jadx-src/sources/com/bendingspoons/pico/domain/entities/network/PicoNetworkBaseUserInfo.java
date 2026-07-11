package com.bendingspoons.pico.domain.entities.network;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b&\b\u0081\b\u0018\u00002\u00020\u0001Bw\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0003HÆ\u0003J\t\u0010+\u001a\u00020\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\t\u0010-\u001a\u00020\nHÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u0010/\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001fJ\t\u00100\u001a\u00020\u000eHÆ\u0003J\t\u00101\u001a\u00020\u0010HÆ\u0003J\u0015\u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00130\u0012HÆ\u0003J\u0096\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\u0014\b\u0002\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00130\u0012HÆ\u0001¢\u0006\u0002\u00104J\u0013\u00105\u001a\u00020\n2\b\u00106\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00107\u001a\u00020\u0013HÖ\u0001J\t\u00108\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u000b\u0010\u001fR\u001a\u0010\f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\f\u0010\u001fR\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\"\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00130\u00128\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&¨\u00069"}, d2 = {"Lcom/bendingspoons/pico/domain/entities/network/PicoNetworkBaseUserInfo;", "", "country", "", "language", "appLanguage", "locale", "appVersion", "bundleVersion", "installedBeforePico", "", "isBaseline", "isFree", "timezone", "Lcom/bendingspoons/pico/domain/entities/network/PicoNetworkTimezoneInfo;", "device", "Lcom/bendingspoons/pico/domain/entities/network/PicoNetworkDeviceInfo;", "experiment", "", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/Boolean;Lcom/bendingspoons/pico/domain/entities/network/PicoNetworkTimezoneInfo;Lcom/bendingspoons/pico/domain/entities/network/PicoNetworkDeviceInfo;Ljava/util/Map;)V", "getCountry", "()Ljava/lang/String;", "getLanguage", "getAppLanguage", "getLocale", "getAppVersion", "getBundleVersion", "getInstalledBeforePico", "()Z", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getTimezone", "()Lcom/bendingspoons/pico/domain/entities/network/PicoNetworkTimezoneInfo;", "getDevice", "()Lcom/bendingspoons/pico/domain/entities/network/PicoNetworkDeviceInfo;", "getExperiment", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/Boolean;Lcom/bendingspoons/pico/domain/entities/network/PicoNetworkTimezoneInfo;Lcom/bendingspoons/pico/domain/entities/network/PicoNetworkDeviceInfo;Ljava/util/Map;)Lcom/bendingspoons/pico/domain/entities/network/PicoNetworkBaseUserInfo;", "equals", InneractiveMediationNameConsts.OTHER, "hashCode", "toString", "pico_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PicoNetworkBaseUserInfo {

    @Json(name = "app_language")
    private final String appLanguage;

    @Json(name = "app_version")
    private final String appVersion;

    @Json(name = "bundle_version")
    private final String bundleVersion;

    @Json(name = "country")
    private final String country;

    @Json(name = "device")
    private final PicoNetworkDeviceInfo device;

    @Json(name = "experiment")
    private final Map<String, Integer> experiment;

    @Json(name = "installed_before_pico")
    private final boolean installedBeforePico;

    @Json(name = "is_baseline")
    private final Boolean isBaseline;

    @Json(name = "is_free")
    private final Boolean isFree;

    @Json(name = "language")
    private final String language;

    @Json(name = "locale")
    private final String locale;

    @Json(name = "timezone")
    private final PicoNetworkTimezoneInfo timezone;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PicoNetworkBaseUserInfo copy$default(PicoNetworkBaseUserInfo picoNetworkBaseUserInfo, String str, String str2, String str3, String str4, String str5, String str6, boolean z2, Boolean bool, Boolean bool2, PicoNetworkTimezoneInfo picoNetworkTimezoneInfo, PicoNetworkDeviceInfo picoNetworkDeviceInfo, Map map, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = picoNetworkBaseUserInfo.country;
        }
        if ((i2 & 2) != 0) {
            str2 = picoNetworkBaseUserInfo.language;
        }
        if ((i2 & 4) != 0) {
            str3 = picoNetworkBaseUserInfo.appLanguage;
        }
        if ((i2 & 8) != 0) {
            str4 = picoNetworkBaseUserInfo.locale;
        }
        if ((i2 & 16) != 0) {
            str5 = picoNetworkBaseUserInfo.appVersion;
        }
        if ((i2 & 32) != 0) {
            str6 = picoNetworkBaseUserInfo.bundleVersion;
        }
        if ((i2 & 64) != 0) {
            z2 = picoNetworkBaseUserInfo.installedBeforePico;
        }
        if ((i2 & 128) != 0) {
            bool = picoNetworkBaseUserInfo.isBaseline;
        }
        if ((i2 & 256) != 0) {
            bool2 = picoNetworkBaseUserInfo.isFree;
        }
        if ((i2 & 512) != 0) {
            picoNetworkTimezoneInfo = picoNetworkBaseUserInfo.timezone;
        }
        if ((i2 & 1024) != 0) {
            picoNetworkDeviceInfo = picoNetworkBaseUserInfo.device;
        }
        if ((i2 & 2048) != 0) {
            map = picoNetworkBaseUserInfo.experiment;
        }
        PicoNetworkDeviceInfo picoNetworkDeviceInfo2 = picoNetworkDeviceInfo;
        Map map2 = map;
        Boolean bool3 = bool2;
        PicoNetworkTimezoneInfo picoNetworkTimezoneInfo2 = picoNetworkTimezoneInfo;
        boolean z3 = z2;
        Boolean bool4 = bool;
        String str7 = str5;
        String str8 = str6;
        return picoNetworkBaseUserInfo.copy(str, str2, str3, str4, str7, str8, z3, bool4, bool3, picoNetworkTimezoneInfo2, picoNetworkDeviceInfo2, map2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final PicoNetworkTimezoneInfo getTimezone() {
        return this.timezone;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final PicoNetworkDeviceInfo getDevice() {
        return this.device;
    }

    public final Map<String, Integer> component12() {
        return this.experiment;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLanguage() {
        return this.language;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAppLanguage() {
        return this.appLanguage;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getLocale() {
        return this.locale;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getAppVersion() {
        return this.appVersion;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getBundleVersion() {
        return this.bundleVersion;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final boolean getInstalledBeforePico() {
        return this.installedBeforePico;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final Boolean getIsBaseline() {
        return this.isBaseline;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final Boolean getIsFree() {
        return this.isFree;
    }

    public final PicoNetworkBaseUserInfo copy(String country, String language, String appLanguage, String locale, String appVersion, String bundleVersion, boolean installedBeforePico, Boolean isBaseline, Boolean isFree, PicoNetworkTimezoneInfo timezone, PicoNetworkDeviceInfo device, Map<String, Integer> experiment) {
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(appLanguage, "appLanguage");
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(bundleVersion, "bundleVersion");
        Intrinsics.checkNotNullParameter(timezone, "timezone");
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(experiment, "experiment");
        return new PicoNetworkBaseUserInfo(country, language, appLanguage, locale, appVersion, bundleVersion, installedBeforePico, isBaseline, isFree, timezone, device, experiment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PicoNetworkBaseUserInfo)) {
            return false;
        }
        PicoNetworkBaseUserInfo picoNetworkBaseUserInfo = (PicoNetworkBaseUserInfo) other;
        return Intrinsics.areEqual(this.country, picoNetworkBaseUserInfo.country) && Intrinsics.areEqual(this.language, picoNetworkBaseUserInfo.language) && Intrinsics.areEqual(this.appLanguage, picoNetworkBaseUserInfo.appLanguage) && Intrinsics.areEqual(this.locale, picoNetworkBaseUserInfo.locale) && Intrinsics.areEqual(this.appVersion, picoNetworkBaseUserInfo.appVersion) && Intrinsics.areEqual(this.bundleVersion, picoNetworkBaseUserInfo.bundleVersion) && this.installedBeforePico == picoNetworkBaseUserInfo.installedBeforePico && Intrinsics.areEqual(this.isBaseline, picoNetworkBaseUserInfo.isBaseline) && Intrinsics.areEqual(this.isFree, picoNetworkBaseUserInfo.isFree) && Intrinsics.areEqual(this.timezone, picoNetworkBaseUserInfo.timezone) && Intrinsics.areEqual(this.device, picoNetworkBaseUserInfo.device) && Intrinsics.areEqual(this.experiment, picoNetworkBaseUserInfo.experiment);
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.country.hashCode() * 31) + this.language.hashCode()) * 31) + this.appLanguage.hashCode()) * 31) + this.locale.hashCode()) * 31) + this.appVersion.hashCode()) * 31) + this.bundleVersion.hashCode()) * 31) + Boolean.hashCode(this.installedBeforePico)) * 31;
        Boolean bool = this.isBaseline;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isFree;
        return ((((((iHashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 31) + this.timezone.hashCode()) * 31) + this.device.hashCode()) * 31) + this.experiment.hashCode();
    }

    public String toString() {
        return "PicoNetworkBaseUserInfo(country=" + this.country + ", language=" + this.language + ", appLanguage=" + this.appLanguage + ", locale=" + this.locale + ", appVersion=" + this.appVersion + ", bundleVersion=" + this.bundleVersion + ", installedBeforePico=" + this.installedBeforePico + ", isBaseline=" + this.isBaseline + ", isFree=" + this.isFree + ", timezone=" + this.timezone + ", device=" + this.device + ", experiment=" + this.experiment + ")";
    }

    public PicoNetworkBaseUserInfo(String country, String language, String appLanguage, String locale, String appVersion, String bundleVersion, boolean z2, Boolean bool, Boolean bool2, PicoNetworkTimezoneInfo timezone, PicoNetworkDeviceInfo device, Map<String, Integer> experiment) {
        Intrinsics.checkNotNullParameter(country, "country");
        Intrinsics.checkNotNullParameter(language, "language");
        Intrinsics.checkNotNullParameter(appLanguage, "appLanguage");
        Intrinsics.checkNotNullParameter(locale, "locale");
        Intrinsics.checkNotNullParameter(appVersion, "appVersion");
        Intrinsics.checkNotNullParameter(bundleVersion, "bundleVersion");
        Intrinsics.checkNotNullParameter(timezone, "timezone");
        Intrinsics.checkNotNullParameter(device, "device");
        Intrinsics.checkNotNullParameter(experiment, "experiment");
        this.country = country;
        this.language = language;
        this.appLanguage = appLanguage;
        this.locale = locale;
        this.appVersion = appVersion;
        this.bundleVersion = bundleVersion;
        this.installedBeforePico = z2;
        this.isBaseline = bool;
        this.isFree = bool2;
        this.timezone = timezone;
        this.device = device;
        this.experiment = experiment;
    }

    public final String getAppLanguage() {
        return this.appLanguage;
    }

    public final String getAppVersion() {
        return this.appVersion;
    }

    public final String getBundleVersion() {
        return this.bundleVersion;
    }

    public final String getCountry() {
        return this.country;
    }

    public final PicoNetworkDeviceInfo getDevice() {
        return this.device;
    }

    public final Map<String, Integer> getExperiment() {
        return this.experiment;
    }

    public final boolean getInstalledBeforePico() {
        return this.installedBeforePico;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final String getLocale() {
        return this.locale;
    }

    public final PicoNetworkTimezoneInfo getTimezone() {
        return this.timezone;
    }

    public final Boolean isBaseline() {
        return this.isBaseline;
    }

    public final Boolean isFree() {
        return this.isFree;
    }
}
