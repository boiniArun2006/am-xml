package com.alightcreative.app.motion.scene;

import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lcom/alightcreative/app/motion/scene/EngineState;", "", "trackId", "", "<init>", "(J)V", "getTrackId", "()J", "component1", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "", "toString", "", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class EngineState {
    public static final int $stable = 0;
    private final long trackId;

    public static /* synthetic */ EngineState copy$default(EngineState engineState, long j2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j2 = engineState.trackId;
        }
        return engineState.copy(j2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTrackId() {
        return this.trackId;
    }

    public final EngineState copy(long trackId) {
        return new EngineState(trackId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof EngineState) && this.trackId == ((EngineState) other).trackId;
    }

    public int hashCode() {
        return Long.hashCode(this.trackId);
    }

    public String toString() {
        return "EngineState(trackId=" + this.trackId + ")";
    }

    public final long getTrackId() {
        return this.trackId;
    }

    public EngineState(long j2) {
        this.trackId = j2;
    }
}
