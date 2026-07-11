package com.bendingspoons.pico.data.repository.internal.entity.picoEvent;

import androidx.annotation.Keep;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Entity
@Keep
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/bendingspoons/pico/data/repository/internal/entity/picoEvent/PicoEventEntity;", "", "", "id", "LQAv/j;", "eventData", "", "committed", "<init>", "(Ljava/lang/String;LQAv/j;Z)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "LQAv/j;", "getEventData", "()LQAv/j;", "setEventData", "(LQAv/j;)V", "Z", "getCommitted", "()Z", "setCommitted", "(Z)V", "pico_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PicoEventEntity {
    private boolean committed;
    private QAv.j eventData;

    @PrimaryKey
    private String id;

    public PicoEventEntity(String id, QAv.j eventData, boolean z2) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        this.id = id;
        this.eventData = eventData;
        this.committed = z2;
    }

    public final boolean getCommitted() {
        return this.committed;
    }

    public final QAv.j getEventData() {
        return this.eventData;
    }

    public final String getId() {
        return this.id;
    }

    public final void setCommitted(boolean z2) {
        this.committed = z2;
    }

    public final void setEventData(QAv.j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<set-?>");
        this.eventData = jVar;
    }

    public final void setId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.id = str;
    }
}
