package com.bendingspoons.spidersense.data.storageManager.entities;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import com.bendingspoons.spidersense.domain.entities.CompleteDebugEvent;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J'\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006 "}, d2 = {"Lcom/bendingspoons/spidersense/data/storageManager/entities/CompleteDebugEventEntity;", "", "id", "", "storedAt", "", "completeDebugEventData", "Lcom/bendingspoons/spidersense/domain/entities/CompleteDebugEvent;", "<init>", "(Ljava/lang/String;DLcom/bendingspoons/spidersense/domain/entities/CompleteDebugEvent;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getStoredAt", "()D", "setStoredAt", "(D)V", "getCompleteDebugEventData", "()Lcom/bendingspoons/spidersense/domain/entities/CompleteDebugEvent;", "setCompleteDebugEventData", "(Lcom/bendingspoons/spidersense/domain/entities/CompleteDebugEvent;)V", "component1", "component2", "component3", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "spidersense_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Entity
public final /* data */ class CompleteDebugEventEntity {
    public static final int $stable = 8;
    private CompleteDebugEvent completeDebugEventData;

    @PrimaryKey
    private String id;
    private double storedAt;

    public static /* synthetic */ CompleteDebugEventEntity copy$default(CompleteDebugEventEntity completeDebugEventEntity, String str, double d2, CompleteDebugEvent completeDebugEvent, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = completeDebugEventEntity.id;
        }
        if ((i2 & 2) != 0) {
            d2 = completeDebugEventEntity.storedAt;
        }
        if ((i2 & 4) != 0) {
            completeDebugEvent = completeDebugEventEntity.completeDebugEventData;
        }
        return completeDebugEventEntity.copy(str, d2, completeDebugEvent);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final double getStoredAt() {
        return this.storedAt;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final CompleteDebugEvent getCompleteDebugEventData() {
        return this.completeDebugEventData;
    }

    public final CompleteDebugEventEntity copy(String id, double storedAt, CompleteDebugEvent completeDebugEventData) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(completeDebugEventData, "completeDebugEventData");
        return new CompleteDebugEventEntity(id, storedAt, completeDebugEventData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CompleteDebugEventEntity)) {
            return false;
        }
        CompleteDebugEventEntity completeDebugEventEntity = (CompleteDebugEventEntity) other;
        return Intrinsics.areEqual(this.id, completeDebugEventEntity.id) && Double.compare(this.storedAt, completeDebugEventEntity.storedAt) == 0 && Intrinsics.areEqual(this.completeDebugEventData, completeDebugEventEntity.completeDebugEventData);
    }

    public int hashCode() {
        return (((this.id.hashCode() * 31) + Double.hashCode(this.storedAt)) * 31) + this.completeDebugEventData.hashCode();
    }

    public String toString() {
        return "CompleteDebugEventEntity(id=" + this.id + ", storedAt=" + this.storedAt + ", completeDebugEventData=" + this.completeDebugEventData + ")";
    }

    public CompleteDebugEventEntity(String id, double d2, CompleteDebugEvent completeDebugEventData) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(completeDebugEventData, "completeDebugEventData");
        this.id = id;
        this.storedAt = d2;
        this.completeDebugEventData = completeDebugEventData;
    }

    public final CompleteDebugEvent getCompleteDebugEventData() {
        return this.completeDebugEventData;
    }

    public final String getId() {
        return this.id;
    }

    public final double getStoredAt() {
        return this.storedAt;
    }

    public final void setCompleteDebugEventData(CompleteDebugEvent completeDebugEvent) {
        Intrinsics.checkNotNullParameter(completeDebugEvent, "<set-?>");
        this.completeDebugEventData = completeDebugEvent;
    }

    public final void setId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.id = str;
    }

    public final void setStoredAt(double d2) {
        this.storedAt = d2;
    }
}
