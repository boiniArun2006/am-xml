package com.bendingspoons.pico.data.repository.internal.entity.picoEvent;

import androidx.annotation.Keep;
import com.bendingspoons.pico.domain.internal.PicoBaseInfo;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.events.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u001c\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JD\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\bHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010\u0015R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010)\u001a\u0004\b*\u0010\u0017¨\u0006+"}, d2 = {"Lcom/bendingspoons/pico/data/repository/internal/entity/picoEvent/PicoInternalEventData;", "", "Lcom/bendingspoons/pico/data/repository/internal/entity/picoEvent/PicoEventData;", a.f62811a, "Lcom/bendingspoons/pico/domain/internal/PicoBaseInfo;", "picoBaseInfo", "Lcom/bendingspoons/pico/data/repository/internal/entity/picoEvent/PicoAdditionalInfoData;", "picoAdditionalInfoData", "", "", "userAdditionalInfo", "<init>", "(Lcom/bendingspoons/pico/data/repository/internal/entity/picoEvent/PicoEventData;Lcom/bendingspoons/pico/domain/internal/PicoBaseInfo;Lcom/bendingspoons/pico/data/repository/internal/entity/picoEvent/PicoAdditionalInfoData;Ljava/util/Map;)V", "LQAv/j;", "toDomain", "()LQAv/j;", "component1", "()Lcom/bendingspoons/pico/data/repository/internal/entity/picoEvent/PicoEventData;", "component2", "()Lcom/bendingspoons/pico/domain/internal/PicoBaseInfo;", "component3", "()Lcom/bendingspoons/pico/data/repository/internal/entity/picoEvent/PicoAdditionalInfoData;", "component4", "()Ljava/util/Map;", "copy", "(Lcom/bendingspoons/pico/data/repository/internal/entity/picoEvent/PicoEventData;Lcom/bendingspoons/pico/domain/internal/PicoBaseInfo;Lcom/bendingspoons/pico/data/repository/internal/entity/picoEvent/PicoAdditionalInfoData;Ljava/util/Map;)Lcom/bendingspoons/pico/data/repository/internal/entity/picoEvent/PicoInternalEventData;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Lcom/bendingspoons/pico/data/repository/internal/entity/picoEvent/PicoEventData;", "getEvent", "Lcom/bendingspoons/pico/domain/internal/PicoBaseInfo;", "getPicoBaseInfo", "Lcom/bendingspoons/pico/data/repository/internal/entity/picoEvent/PicoAdditionalInfoData;", "getPicoAdditionalInfoData", "Ljava/util/Map;", "getUserAdditionalInfo", "pico_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PicoInternalEventData {
    private final PicoEventData event;
    private final PicoAdditionalInfoData picoAdditionalInfoData;
    private final PicoBaseInfo picoBaseInfo;
    private final Map<String, Object> userAdditionalInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PicoInternalEventData copy$default(PicoInternalEventData picoInternalEventData, PicoEventData picoEventData, PicoBaseInfo picoBaseInfo, PicoAdditionalInfoData picoAdditionalInfoData, Map map, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            picoEventData = picoInternalEventData.event;
        }
        if ((i2 & 2) != 0) {
            picoBaseInfo = picoInternalEventData.picoBaseInfo;
        }
        if ((i2 & 4) != 0) {
            picoAdditionalInfoData = picoInternalEventData.picoAdditionalInfoData;
        }
        if ((i2 & 8) != 0) {
            map = picoInternalEventData.userAdditionalInfo;
        }
        return picoInternalEventData.copy(picoEventData, picoBaseInfo, picoAdditionalInfoData, map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PicoEventData getEvent() {
        return this.event;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PicoBaseInfo getPicoBaseInfo() {
        return this.picoBaseInfo;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final PicoAdditionalInfoData getPicoAdditionalInfoData() {
        return this.picoAdditionalInfoData;
    }

    public final Map<String, Object> component4() {
        return this.userAdditionalInfo;
    }

    public final PicoInternalEventData copy(PicoEventData event, PicoBaseInfo picoBaseInfo, PicoAdditionalInfoData picoAdditionalInfoData, Map<String, ? extends Object> userAdditionalInfo) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(picoBaseInfo, "picoBaseInfo");
        Intrinsics.checkNotNullParameter(picoAdditionalInfoData, "picoAdditionalInfoData");
        Intrinsics.checkNotNullParameter(userAdditionalInfo, "userAdditionalInfo");
        return new PicoInternalEventData(event, picoBaseInfo, picoAdditionalInfoData, userAdditionalInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PicoInternalEventData)) {
            return false;
        }
        PicoInternalEventData picoInternalEventData = (PicoInternalEventData) other;
        return Intrinsics.areEqual(this.event, picoInternalEventData.event) && Intrinsics.areEqual(this.picoBaseInfo, picoInternalEventData.picoBaseInfo) && Intrinsics.areEqual(this.picoAdditionalInfoData, picoInternalEventData.picoAdditionalInfoData) && Intrinsics.areEqual(this.userAdditionalInfo, picoInternalEventData.userAdditionalInfo);
    }

    public int hashCode() {
        return (((((this.event.hashCode() * 31) + this.picoBaseInfo.hashCode()) * 31) + this.picoAdditionalInfoData.hashCode()) * 31) + this.userAdditionalInfo.hashCode();
    }

    public String toString() {
        return "PicoInternalEventData(event=" + this.event + ", picoBaseInfo=" + this.picoBaseInfo + ", picoAdditionalInfoData=" + this.picoAdditionalInfoData + ", userAdditionalInfo=" + this.userAdditionalInfo + ")";
    }

    public PicoInternalEventData(PicoEventData event, PicoBaseInfo picoBaseInfo, PicoAdditionalInfoData picoAdditionalInfoData, Map<String, ? extends Object> userAdditionalInfo) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(picoBaseInfo, "picoBaseInfo");
        Intrinsics.checkNotNullParameter(picoAdditionalInfoData, "picoAdditionalInfoData");
        Intrinsics.checkNotNullParameter(userAdditionalInfo, "userAdditionalInfo");
        this.event = event;
        this.picoBaseInfo = picoBaseInfo;
        this.picoAdditionalInfoData = picoAdditionalInfoData;
        this.userAdditionalInfo = userAdditionalInfo;
    }

    public final PicoEventData getEvent() {
        return this.event;
    }

    public final PicoAdditionalInfoData getPicoAdditionalInfoData() {
        return this.picoAdditionalInfoData;
    }

    public final PicoBaseInfo getPicoBaseInfo() {
        return this.picoBaseInfo;
    }

    public final Map<String, Object> getUserAdditionalInfo() {
        return this.userAdditionalInfo;
    }

    public final QAv.j toDomain() {
        return new QAv.j(this.event.toDomain(), this.picoBaseInfo, this.picoAdditionalInfoData.toDomain(), this.userAdditionalInfo);
    }
}
