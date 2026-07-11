package com.bendingspoons.picox.persistence.internal.entity;

import SpD.PicoXEvent;
import androidx.annotation.Keep;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Entity
@Keep
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/bendingspoons/picox/persistence/internal/entity/PicoXEventEntity;", "", "", "id", "LSpD/I28;", "eventData", "<init>", "(Ljava/lang/String;LSpD/I28;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "LSpD/I28;", "getEventData", "()LSpD/I28;", "setEventData", "(LSpD/I28;)V", "picox_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PicoXEventEntity {
    private PicoXEvent eventData;

    @PrimaryKey
    private String id;

    public PicoXEventEntity(String id, PicoXEvent eventData) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        this.id = id;
        this.eventData = eventData;
    }

    public final PicoXEvent getEventData() {
        return this.eventData;
    }

    public final String getId() {
        return this.id;
    }

    public final void setEventData(PicoXEvent picoXEvent) {
        Intrinsics.checkNotNullParameter(picoXEvent, "<set-?>");
        this.eventData = picoXEvent;
    }

    public final void setId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.id = str;
    }
}
