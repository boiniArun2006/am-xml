package com.bendingspoons.pico.domain.entities.network;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0018"}, d2 = {"Lcom/bendingspoons/pico/domain/entities/network/PicoNetworkTimezoneInfo;", "", "seconds", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "daylightSaving", "", "<init>", "(ILjava/lang/String;Z)V", "getSeconds", "()I", "getName", "()Ljava/lang/String;", "getDaylightSaving", "()Z", "component1", "component2", "component3", "copy", "equals", InneractiveMediationNameConsts.OTHER, "hashCode", "toString", "pico_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PicoNetworkTimezoneInfo {

    @Json(name = "daylight_saving")
    private final boolean daylightSaving;

    @Json(name = AppMeasurementSdk.ConditionalUserProperty.NAME)
    private final String name;

    @Json(name = "seconds")
    private final int seconds;

    public static /* synthetic */ PicoNetworkTimezoneInfo copy$default(PicoNetworkTimezoneInfo picoNetworkTimezoneInfo, int i2, String str, boolean z2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = picoNetworkTimezoneInfo.seconds;
        }
        if ((i3 & 2) != 0) {
            str = picoNetworkTimezoneInfo.name;
        }
        if ((i3 & 4) != 0) {
            z2 = picoNetworkTimezoneInfo.daylightSaving;
        }
        return picoNetworkTimezoneInfo.copy(i2, str, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSeconds() {
        return this.seconds;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getDaylightSaving() {
        return this.daylightSaving;
    }

    public final PicoNetworkTimezoneInfo copy(int seconds, String name, boolean daylightSaving) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new PicoNetworkTimezoneInfo(seconds, name, daylightSaving);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PicoNetworkTimezoneInfo)) {
            return false;
        }
        PicoNetworkTimezoneInfo picoNetworkTimezoneInfo = (PicoNetworkTimezoneInfo) other;
        return this.seconds == picoNetworkTimezoneInfo.seconds && Intrinsics.areEqual(this.name, picoNetworkTimezoneInfo.name) && this.daylightSaving == picoNetworkTimezoneInfo.daylightSaving;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.seconds) * 31) + this.name.hashCode()) * 31) + Boolean.hashCode(this.daylightSaving);
    }

    public String toString() {
        return "PicoNetworkTimezoneInfo(seconds=" + this.seconds + ", name=" + this.name + ", daylightSaving=" + this.daylightSaving + ")";
    }

    public PicoNetworkTimezoneInfo(int i2, String name, boolean z2) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.seconds = i2;
        this.name = name;
        this.daylightSaving = z2;
    }

    public final boolean getDaylightSaving() {
        return this.daylightSaving;
    }

    public final String getName() {
        return this.name;
    }

    public final int getSeconds() {
        return this.seconds;
    }
}
