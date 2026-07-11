package com.bendingspoons.pico.data.repository.internal.entity.picoEvent;

import androidx.annotation.Keep;
import com.bendingspoons.pico.domain.entities.PicoEvent;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import pq.I28;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u000e\u001a\u00020\u000fJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0006HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u001a"}, d2 = {"Lcom/bendingspoons/pico/data/repository/internal/entity/picoEvent/PicoEventData;", "", "id", "", "type", "data", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V", "getId", "()Ljava/lang/String;", "getType", "getData", "()Ljava/util/Map;", "toDomain", "Lcom/bendingspoons/pico/domain/entities/PicoEvent;", "component1", "component2", "component3", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "pico_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PicoEventData {
    private final Map<String, Object> data;
    private final String id;
    private final String type;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PicoEventData copy$default(PicoEventData picoEventData, String str, String str2, Map map, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = picoEventData.id;
        }
        if ((i2 & 2) != 0) {
            str2 = picoEventData.type;
        }
        if ((i2 & 4) != 0) {
            map = picoEventData.data;
        }
        return picoEventData.copy(str, str2, map);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final Map<String, Object> component3() {
        return this.data;
    }

    public final PicoEventData copy(String id, String type, Map<String, ? extends Object> data) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(data, "data");
        return new PicoEventData(id, type, data);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PicoEventData)) {
            return false;
        }
        PicoEventData picoEventData = (PicoEventData) other;
        return Intrinsics.areEqual(this.id, picoEventData.id) && Intrinsics.areEqual(this.type, picoEventData.type) && Intrinsics.areEqual(this.data, picoEventData.data);
    }

    public int hashCode() {
        return (((this.id.hashCode() * 31) + this.type.hashCode()) * 31) + this.data.hashCode();
    }

    public String toString() {
        return "PicoEventData(id=" + this.id + ", type=" + this.type + ", data=" + this.data + ")";
    }

    public PicoEventData(String id, String type, Map<String, ? extends Object> data) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(data, "data");
        this.id = id;
        this.type = type;
        this.data = data;
    }

    public final Map<String, Object> getData() {
        return this.data;
    }

    public final String getId() {
        return this.id;
    }

    public final String getType() {
        return this.type;
    }

    public final PicoEvent toDomain() {
        return new PicoEvent(this.id, this.type, I28.t(this.data));
    }
}
