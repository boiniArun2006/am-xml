package com.bendingspoons.pico.domain.uploader.internal.network.entities;

import com.bendingspoons.pico.domain.entities.network.PicoNetworkEvent;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.events.CrashEvent;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/bendingspoons/pico/domain/uploader/internal/network/entities/PicoNetworkPacket;", "", "delta", "", "lastEventTimestamp", "", CrashEvent.f62787f, "", "Lcom/bendingspoons/pico/domain/entities/network/PicoNetworkEvent;", "<init>", "(IDLjava/util/List;)V", "getDelta", "()I", "getLastEventTimestamp", "()D", "getEvents", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "toString", "", "pico_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PicoNetworkPacket {

    @Json(name = "delta")
    private final int delta;

    @Json(name = CrashEvent.f62787f)
    private final List<PicoNetworkEvent> events;

    @Json(name = "last_event_timestamp")
    private final double lastEventTimestamp;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PicoNetworkPacket copy$default(PicoNetworkPacket picoNetworkPacket, int i2, double d2, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = picoNetworkPacket.delta;
        }
        if ((i3 & 2) != 0) {
            d2 = picoNetworkPacket.lastEventTimestamp;
        }
        if ((i3 & 4) != 0) {
            list = picoNetworkPacket.events;
        }
        return picoNetworkPacket.copy(i2, d2, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getDelta() {
        return this.delta;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getLastEventTimestamp() {
        return this.lastEventTimestamp;
    }

    public final List<PicoNetworkEvent> component3() {
        return this.events;
    }

    public final PicoNetworkPacket copy(int delta, double lastEventTimestamp, List<PicoNetworkEvent> events) {
        Intrinsics.checkNotNullParameter(events, "events");
        return new PicoNetworkPacket(delta, lastEventTimestamp, events);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PicoNetworkPacket)) {
            return false;
        }
        PicoNetworkPacket picoNetworkPacket = (PicoNetworkPacket) other;
        return this.delta == picoNetworkPacket.delta && Double.compare(this.lastEventTimestamp, picoNetworkPacket.lastEventTimestamp) == 0 && Intrinsics.areEqual(this.events, picoNetworkPacket.events);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.delta) * 31) + Double.hashCode(this.lastEventTimestamp)) * 31) + this.events.hashCode();
    }

    public String toString() {
        return "PicoNetworkPacket(delta=" + this.delta + ", lastEventTimestamp=" + this.lastEventTimestamp + ", events=" + this.events + ")";
    }

    public PicoNetworkPacket(int i2, double d2, List<PicoNetworkEvent> events) {
        Intrinsics.checkNotNullParameter(events, "events");
        this.delta = i2;
        this.lastEventTimestamp = d2;
        this.events = events;
    }

    public final int getDelta() {
        return this.delta;
    }

    public final List<PicoNetworkEvent> getEvents() {
        return this.events;
    }

    public final double getLastEventTimestamp() {
        return this.lastEventTimestamp;
    }
}
