package com.bendingspoons.pico.domain.entities.network;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.brandsafety.creatives.infos.PangleCreativeInfo;
import com.safedk.android.analytics.events.base.StatsEvent;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0005HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\tHÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0001HÆ\u0003JQ\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÆ\u0001J\u0013\u0010'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0011\"\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001e\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000f\"\u0004\b\u0019\u0010\u001aR \u0010\u000b\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u0006-"}, d2 = {"Lcom/bendingspoons/pico/domain/entities/network/PicoNetworkEvent;", "", "id", "", StatsEvent.f62824A, "", "requestTimestamp", PangleCreativeInfo.f62498a, "user", "Lcom/bendingspoons/pico/domain/entities/network/PicoNetworkUser;", "type", "data", "<init>", "(Ljava/lang/String;DDLjava/lang/String;Lcom/bendingspoons/pico/domain/entities/network/PicoNetworkUser;Ljava/lang/String;Ljava/lang/Object;)V", "getId", "()Ljava/lang/String;", "getTimestamp", "()D", "getRequestTimestamp", "setRequestTimestamp", "(D)V", "getApp", "getUser", "()Lcom/bendingspoons/pico/domain/entities/network/PicoNetworkUser;", "getType", "setType", "(Ljava/lang/String;)V", "getData", "()Ljava/lang/Object;", "setData", "(Ljava/lang/Object;)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "pico_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PicoNetworkEvent {

    @Json(name = PangleCreativeInfo.f62498a)
    private final String app;

    @Json(name = "data")
    private Object data;

    @Json(name = "id")
    private final String id;

    @Json(name = "request_timestamp")
    private double requestTimestamp;

    @Json(name = StatsEvent.f62824A)
    private final double timestamp;

    @Json(name = "type")
    private String type;

    @Json(name = "user")
    private final PicoNetworkUser user;

    public static /* synthetic */ PicoNetworkEvent copy$default(PicoNetworkEvent picoNetworkEvent, String str, double d2, double d4, String str2, PicoNetworkUser picoNetworkUser, String str3, Object obj, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            str = picoNetworkEvent.id;
        }
        if ((i2 & 2) != 0) {
            d2 = picoNetworkEvent.timestamp;
        }
        if ((i2 & 4) != 0) {
            d4 = picoNetworkEvent.requestTimestamp;
        }
        if ((i2 & 8) != 0) {
            str2 = picoNetworkEvent.app;
        }
        if ((i2 & 16) != 0) {
            picoNetworkUser = picoNetworkEvent.user;
        }
        if ((i2 & 32) != 0) {
            str3 = picoNetworkEvent.type;
        }
        if ((i2 & 64) != 0) {
            obj = picoNetworkEvent.data;
        }
        double d5 = d4;
        return picoNetworkEvent.copy(str, d2, d5, str2, picoNetworkUser, str3, obj);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final double getRequestTimestamp() {
        return this.requestTimestamp;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getApp() {
        return this.app;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final PicoNetworkUser getUser() {
        return this.user;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final Object getData() {
        return this.data;
    }

    public final PicoNetworkEvent copy(String id, double timestamp, double requestTimestamp, String app, PicoNetworkUser user, String type, Object data) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(type, "type");
        return new PicoNetworkEvent(id, timestamp, requestTimestamp, app, user, type, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PicoNetworkEvent)) {
            return false;
        }
        PicoNetworkEvent picoNetworkEvent = (PicoNetworkEvent) other;
        return Intrinsics.areEqual(this.id, picoNetworkEvent.id) && Double.compare(this.timestamp, picoNetworkEvent.timestamp) == 0 && Double.compare(this.requestTimestamp, picoNetworkEvent.requestTimestamp) == 0 && Intrinsics.areEqual(this.app, picoNetworkEvent.app) && Intrinsics.areEqual(this.user, picoNetworkEvent.user) && Intrinsics.areEqual(this.type, picoNetworkEvent.type) && Intrinsics.areEqual(this.data, picoNetworkEvent.data);
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.id.hashCode() * 31) + Double.hashCode(this.timestamp)) * 31) + Double.hashCode(this.requestTimestamp)) * 31) + this.app.hashCode()) * 31) + this.user.hashCode()) * 31) + this.type.hashCode()) * 31;
        Object obj = this.data;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "PicoNetworkEvent(id=" + this.id + ", timestamp=" + this.timestamp + ", requestTimestamp=" + this.requestTimestamp + ", app=" + this.app + ", user=" + this.user + ", type=" + this.type + ", data=" + this.data + ")";
    }

    public PicoNetworkEvent(String id, double d2, double d4, String app, PicoNetworkUser user, String type, Object obj) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(app, "app");
        Intrinsics.checkNotNullParameter(user, "user");
        Intrinsics.checkNotNullParameter(type, "type");
        this.id = id;
        this.timestamp = d2;
        this.requestTimestamp = d4;
        this.app = app;
        this.user = user;
        this.type = type;
        this.data = obj;
    }

    public final String getApp() {
        return this.app;
    }

    public final Object getData() {
        return this.data;
    }

    public final String getId() {
        return this.id;
    }

    public final double getRequestTimestamp() {
        return this.requestTimestamp;
    }

    public final double getTimestamp() {
        return this.timestamp;
    }

    public final String getType() {
        return this.type;
    }

    public final PicoNetworkUser getUser() {
        return this.user;
    }

    public final void setData(Object obj) {
        this.data = obj;
    }

    public final void setRequestTimestamp(double d2) {
        this.requestTimestamp = d2;
    }

    public final void setType(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.type = str;
    }
}
