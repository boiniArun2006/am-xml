package com.bendingspoons.pico.domain.entities.network;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B7\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J\u0015\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0003J?\u0010\u0012\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0004HÖ\u0001R\"\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\"\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u0019"}, d2 = {"Lcom/bendingspoons/pico/domain/entities/network/PicoNetworkUser;", "", "ids", "", "", "info", "Lcom/bendingspoons/pico/domain/entities/network/PicoNetworkBaseUserInfo;", "additionalInfo", "<init>", "(Ljava/util/Map;Lcom/bendingspoons/pico/domain/entities/network/PicoNetworkBaseUserInfo;Ljava/util/Map;)V", "getIds", "()Ljava/util/Map;", "getInfo", "()Lcom/bendingspoons/pico/domain/entities/network/PicoNetworkBaseUserInfo;", "getAdditionalInfo", "component1", "component2", "component3", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "pico_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PicoNetworkUser {

    @Json(name = "additional_info")
    private final Map<String, Object> additionalInfo;

    @Json(name = "ids")
    private final Map<String, String> ids;

    @Json(name = "info")
    private final PicoNetworkBaseUserInfo info;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PicoNetworkUser copy$default(PicoNetworkUser picoNetworkUser, Map map, PicoNetworkBaseUserInfo picoNetworkBaseUserInfo, Map map2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            map = picoNetworkUser.ids;
        }
        if ((i2 & 2) != 0) {
            picoNetworkBaseUserInfo = picoNetworkUser.info;
        }
        if ((i2 & 4) != 0) {
            map2 = picoNetworkUser.additionalInfo;
        }
        return picoNetworkUser.copy(map, picoNetworkBaseUserInfo, map2);
    }

    public final Map<String, String> component1() {
        return this.ids;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PicoNetworkBaseUserInfo getInfo() {
        return this.info;
    }

    public final Map<String, Object> component3() {
        return this.additionalInfo;
    }

    public final PicoNetworkUser copy(Map<String, String> ids, PicoNetworkBaseUserInfo info, Map<String, ? extends Object> additionalInfo) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
        return new PicoNetworkUser(ids, info, additionalInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PicoNetworkUser)) {
            return false;
        }
        PicoNetworkUser picoNetworkUser = (PicoNetworkUser) other;
        return Intrinsics.areEqual(this.ids, picoNetworkUser.ids) && Intrinsics.areEqual(this.info, picoNetworkUser.info) && Intrinsics.areEqual(this.additionalInfo, picoNetworkUser.additionalInfo);
    }

    public int hashCode() {
        return (((this.ids.hashCode() * 31) + this.info.hashCode()) * 31) + this.additionalInfo.hashCode();
    }

    public String toString() {
        return "PicoNetworkUser(ids=" + this.ids + ", info=" + this.info + ", additionalInfo=" + this.additionalInfo + ")";
    }

    public PicoNetworkUser(Map<String, String> ids, PicoNetworkBaseUserInfo info, Map<String, ? extends Object> additionalInfo) {
        Intrinsics.checkNotNullParameter(ids, "ids");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(additionalInfo, "additionalInfo");
        this.ids = ids;
        this.info = info;
        this.additionalInfo = additionalInfo;
    }

    public final Map<String, Object> getAdditionalInfo() {
        return this.additionalInfo;
    }

    public final Map<String, String> getIds() {
        return this.ids;
    }

    public final PicoNetworkBaseUserInfo getInfo() {
        return this.info;
    }
}
