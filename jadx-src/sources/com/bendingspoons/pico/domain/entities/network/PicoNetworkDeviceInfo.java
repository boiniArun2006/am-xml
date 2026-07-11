package com.bendingspoons.pico.domain.entities.network;

import androidx.resourceinspection.annotation.og.qfEYuUHwj;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.AppLovinBridge;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003JE\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020#HÖ\u0001J\t\u0010$\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u001e\u0010\u0014\u001a\u00020\u00038G@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\r\"\u0004\b\u0016\u0010\u0017¨\u0006%"}, d2 = {"Lcom/bendingspoons/pico/domain/entities/network/PicoNetworkDeviceInfo;", "", "androidVersion", "", "osVersionRelease", "osBuildId", "screenSize", "", "manufacturer", "model", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;)V", "getAndroidVersion", "()Ljava/lang/String;", "getOsVersionRelease", "getOsBuildId", "getScreenSize", "()D", "getManufacturer", "getModel", AppLovinBridge.f61288f, "getPlatform", "setPlatform", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "pico_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PicoNetworkDeviceInfo {

    @Json(name = "android_version")
    private final String androidVersion;

    @Json(name = "manufacturer")
    private final String manufacturer;

    @Json(name = "model")
    private final String model;

    @Json(name = "os_build_id")
    private final String osBuildId;

    @Json(name = "os_version_release")
    private final String osVersionRelease;

    @Json(name = AppLovinBridge.f61288f)
    private String platform;

    @Json(name = "screen_size")
    private final double screenSize;

    public static /* synthetic */ PicoNetworkDeviceInfo copy$default(PicoNetworkDeviceInfo picoNetworkDeviceInfo, String str, String str2, String str3, double d2, String str4, String str5, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = picoNetworkDeviceInfo.androidVersion;
        }
        if ((i2 & 2) != 0) {
            str2 = picoNetworkDeviceInfo.osVersionRelease;
        }
        if ((i2 & 4) != 0) {
            str3 = picoNetworkDeviceInfo.osBuildId;
        }
        if ((i2 & 8) != 0) {
            d2 = picoNetworkDeviceInfo.screenSize;
        }
        if ((i2 & 16) != 0) {
            str4 = picoNetworkDeviceInfo.manufacturer;
        }
        if ((i2 & 32) != 0) {
            str5 = picoNetworkDeviceInfo.model;
        }
        double d4 = d2;
        String str6 = str3;
        return picoNetworkDeviceInfo.copy(str, str2, str6, d4, str4, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAndroidVersion() {
        return this.androidVersion;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getOsVersionRelease() {
        return this.osVersionRelease;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOsBuildId() {
        return this.osBuildId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final double getScreenSize() {
        return this.screenSize;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getManufacturer() {
        return this.manufacturer;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getModel() {
        return this.model;
    }

    public final PicoNetworkDeviceInfo copy(String androidVersion, String osVersionRelease, String osBuildId, double screenSize, String manufacturer, String model) {
        Intrinsics.checkNotNullParameter(androidVersion, "androidVersion");
        Intrinsics.checkNotNullParameter(osVersionRelease, "osVersionRelease");
        Intrinsics.checkNotNullParameter(osBuildId, "osBuildId");
        Intrinsics.checkNotNullParameter(manufacturer, "manufacturer");
        Intrinsics.checkNotNullParameter(model, "model");
        return new PicoNetworkDeviceInfo(androidVersion, osVersionRelease, osBuildId, screenSize, manufacturer, model);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PicoNetworkDeviceInfo)) {
            return false;
        }
        PicoNetworkDeviceInfo picoNetworkDeviceInfo = (PicoNetworkDeviceInfo) other;
        return Intrinsics.areEqual(this.androidVersion, picoNetworkDeviceInfo.androidVersion) && Intrinsics.areEqual(this.osVersionRelease, picoNetworkDeviceInfo.osVersionRelease) && Intrinsics.areEqual(this.osBuildId, picoNetworkDeviceInfo.osBuildId) && Double.compare(this.screenSize, picoNetworkDeviceInfo.screenSize) == 0 && Intrinsics.areEqual(this.manufacturer, picoNetworkDeviceInfo.manufacturer) && Intrinsics.areEqual(this.model, picoNetworkDeviceInfo.model);
    }

    public int hashCode() {
        return (((((((((this.androidVersion.hashCode() * 31) + this.osVersionRelease.hashCode()) * 31) + this.osBuildId.hashCode()) * 31) + Double.hashCode(this.screenSize)) * 31) + this.manufacturer.hashCode()) * 31) + this.model.hashCode();
    }

    public String toString() {
        return "PicoNetworkDeviceInfo(androidVersion=" + this.androidVersion + qfEYuUHwj.nDMWqGL + this.osVersionRelease + ", osBuildId=" + this.osBuildId + ", screenSize=" + this.screenSize + ", manufacturer=" + this.manufacturer + ", model=" + this.model + ")";
    }

    public PicoNetworkDeviceInfo(String androidVersion, String osVersionRelease, String osBuildId, double d2, String manufacturer, String model) {
        Intrinsics.checkNotNullParameter(androidVersion, "androidVersion");
        Intrinsics.checkNotNullParameter(osVersionRelease, "osVersionRelease");
        Intrinsics.checkNotNullParameter(osBuildId, "osBuildId");
        Intrinsics.checkNotNullParameter(manufacturer, "manufacturer");
        Intrinsics.checkNotNullParameter(model, "model");
        this.androidVersion = androidVersion;
        this.osVersionRelease = osVersionRelease;
        this.osBuildId = osBuildId;
        this.screenSize = d2;
        this.manufacturer = manufacturer;
        this.model = model;
        this.platform = StringsKt.trim((CharSequence) (manufacturer + " " + model)).toString();
    }

    public final String getAndroidVersion() {
        return this.androidVersion;
    }

    public final String getManufacturer() {
        return this.manufacturer;
    }

    public final String getModel() {
        return this.model;
    }

    public final String getOsBuildId() {
        return this.osBuildId;
    }

    public final String getOsVersionRelease() {
        return this.osVersionRelease;
    }

    @Deprecated(message = "Use `manufacturer` and `model` instead.")
    public final String getPlatform() {
        return this.platform;
    }

    public final double getScreenSize() {
        return this.screenSize;
    }

    public final void setPlatform(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.platform = str;
    }
}
