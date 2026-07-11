package com.bendingspoons.pico.domain.entities;

import Gw.C1369j;
import YgZ.uQga.IYJfqUyym;
import androidx.annotation.Keep;
import androidx.annotation.VisibleForTesting;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import pq.Ml;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001fB#\b\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ.\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\nJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u000e¨\u0006 "}, d2 = {"Lcom/bendingspoons/pico/domain/entities/PicoEvent;", "", "", "id", "type", "Lpq/Ml;", "data", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lpq/Ml;)V", "component1$pico_release", "()Ljava/lang/String;", "component1", "component2", "component3", "()Lpq/Ml;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lpq/Ml;)Lcom/bendingspoons/pico/domain/entities/PicoEvent;", "toString", "", "hashCode", "()I", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId$pico_release", "getType", "Lpq/Ml;", "getData", "Companion", "j", "pico_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class PicoEvent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String SESSION_TYPE = "Session";
    private final Ml data;
    private final String id;
    private final String type;

    /* JADX INFO: renamed from: com.bendingspoons.pico.domain.entities.PicoEvent$j, reason: from kotlin metadata */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PicoEvent n(String type, Ml data) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(data, "data");
            return new PicoEvent(null, type, data, 1, null);
        }

        public final PicoEvent rl(C1369j sessionData) {
            Intrinsics.checkNotNullParameter(sessionData, "sessionData");
            return n(PicoEvent.SESSION_TYPE, sessionData.n());
        }
    }

    @VisibleForTesting
    public PicoEvent(String id, String type, Ml data) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(data, "data");
        this.id = id;
        this.type = type;
        this.data = data;
    }

    /* JADX INFO: renamed from: component1$pico_release, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PicoEvent)) {
            return false;
        }
        PicoEvent picoEvent = (PicoEvent) other;
        return Intrinsics.areEqual(this.id, picoEvent.id) && Intrinsics.areEqual(this.type, picoEvent.type) && Intrinsics.areEqual(this.data, picoEvent.data);
    }

    public int hashCode() {
        return (((this.id.hashCode() * 31) + this.type.hashCode()) * 31) + this.data.hashCode();
    }

    public String toString() {
        return "PicoEvent(id=" + this.id + ", type=" + this.type + ", data=" + this.data + ")";
    }

    public static /* synthetic */ PicoEvent copy$default(PicoEvent picoEvent, String str, String str2, Ml ml, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = picoEvent.id;
        }
        if ((i2 & 2) != 0) {
            str2 = picoEvent.type;
        }
        if ((i2 & 4) != 0) {
            ml = picoEvent.data;
        }
        return picoEvent.copy(str, str2, ml);
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Ml getData() {
        return this.data;
    }

    public final PicoEvent copy(String id, String type, Ml data) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(type, IYJfqUyym.XdHmwFLe);
        Intrinsics.checkNotNullParameter(data, "data");
        return new PicoEvent(id, type, data);
    }

    public final Ml getData() {
        return this.data;
    }

    public final String getId$pico_release() {
        return this.id;
    }

    public final String getType() {
        return this.type;
    }

    public /* synthetic */ PicoEvent(String str, String str2, Ml ml, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? UUID.randomUUID().toString() : str, str2, ml);
    }
}
