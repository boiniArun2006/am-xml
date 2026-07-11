package com.bendingspoons.spidersense.domain.network.entities;

import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.safedk.android.analytics.events.CrashEvent;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/bendingspoons/spidersense/domain/network/entities/NetworkPacket;", "", "userId", "", "sentAt", "", CrashEvent.f62787f, "", "Lcom/bendingspoons/spidersense/domain/network/entities/DebugEventForBackend;", "<init>", "(Ljava/lang/String;DLjava/util/List;)V", "getUserId", "()Ljava/lang/String;", "getSentAt", "()D", "getEvents", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "spidersense_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class NetworkPacket {
    public static final int $stable = 8;

    @Json(name = "payloads")
    private final List<DebugEventForBackend> events;

    @Json(name = "sent_at")
    private final double sentAt;

    @Json(name = "user_id")
    private final String userId;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NetworkPacket copy$default(NetworkPacket networkPacket, String str, double d2, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = networkPacket.userId;
        }
        if ((i2 & 2) != 0) {
            d2 = networkPacket.sentAt;
        }
        if ((i2 & 4) != 0) {
            list = networkPacket.events;
        }
        return networkPacket.copy(str, d2, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getSentAt() {
        return this.sentAt;
    }

    public final List<DebugEventForBackend> component3() {
        return this.events;
    }

    public final NetworkPacket copy(String userId, double sentAt, List<DebugEventForBackend> events) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(events, "events");
        return new NetworkPacket(userId, sentAt, events);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NetworkPacket)) {
            return false;
        }
        NetworkPacket networkPacket = (NetworkPacket) other;
        return Intrinsics.areEqual(this.userId, networkPacket.userId) && Double.compare(this.sentAt, networkPacket.sentAt) == 0 && Intrinsics.areEqual(this.events, networkPacket.events);
    }

    public int hashCode() {
        return (((this.userId.hashCode() * 31) + Double.hashCode(this.sentAt)) * 31) + this.events.hashCode();
    }

    public String toString() {
        return "NetworkPacket(userId=" + this.userId + ", sentAt=" + this.sentAt + ", events=" + this.events + ")";
    }

    public NetworkPacket(String userId, double d2, List<DebugEventForBackend> events) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(events, "events");
        this.userId = userId;
        this.sentAt = d2;
        this.events = events;
    }

    public final List<DebugEventForBackend> getEvents() {
        return this.events;
    }

    public final double getSentAt() {
        return this.sentAt;
    }

    public final String getUserId() {
        return this.userId;
    }
}
