package com.alightcreative.app.motion.scene;

import androidx.compose.runtime.internal.StabilityInferred;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/alightcreative/app/motion/scene/FrameStats;", "", "frame", "", "activeVideoLayers", "activeAudioTracks", "activeEffects", "", "", "<init>", "(IIILjava/util/List;)V", "getFrame", "()I", "getActiveVideoLayers", "getActiveAudioTracks", "getActiveEffects", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", InneractiveMediationNameConsts.OTHER, "hashCode", "toString", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class FrameStats {
    public static final int $stable = 8;
    private final int activeAudioTracks;
    private final List<String> activeEffects;
    private final int activeVideoLayers;
    private final int frame;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FrameStats copy$default(FrameStats frameStats, int i2, int i3, int i5, List list, int i7, Object obj) {
        if ((i7 & 1) != 0) {
            i2 = frameStats.frame;
        }
        if ((i7 & 2) != 0) {
            i3 = frameStats.activeVideoLayers;
        }
        if ((i7 & 4) != 0) {
            i5 = frameStats.activeAudioTracks;
        }
        if ((i7 & 8) != 0) {
            list = frameStats.activeEffects;
        }
        return frameStats.copy(i2, i3, i5, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getFrame() {
        return this.frame;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getActiveVideoLayers() {
        return this.activeVideoLayers;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getActiveAudioTracks() {
        return this.activeAudioTracks;
    }

    public final List<String> component4() {
        return this.activeEffects;
    }

    public final FrameStats copy(int frame, int activeVideoLayers, int activeAudioTracks, List<String> activeEffects) {
        Intrinsics.checkNotNullParameter(activeEffects, "activeEffects");
        return new FrameStats(frame, activeVideoLayers, activeAudioTracks, activeEffects);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FrameStats)) {
            return false;
        }
        FrameStats frameStats = (FrameStats) other;
        return this.frame == frameStats.frame && this.activeVideoLayers == frameStats.activeVideoLayers && this.activeAudioTracks == frameStats.activeAudioTracks && Intrinsics.areEqual(this.activeEffects, frameStats.activeEffects);
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.frame) * 31) + Integer.hashCode(this.activeVideoLayers)) * 31) + Integer.hashCode(this.activeAudioTracks)) * 31) + this.activeEffects.hashCode();
    }

    public String toString() {
        return "FrameStats(frame=" + this.frame + ", activeVideoLayers=" + this.activeVideoLayers + ", activeAudioTracks=" + this.activeAudioTracks + ", activeEffects=" + this.activeEffects + ")";
    }

    public FrameStats(int i2, int i3, int i5, List<String> activeEffects) {
        Intrinsics.checkNotNullParameter(activeEffects, "activeEffects");
        this.frame = i2;
        this.activeVideoLayers = i3;
        this.activeAudioTracks = i5;
        this.activeEffects = activeEffects;
    }

    public final int getActiveAudioTracks() {
        return this.activeAudioTracks;
    }

    public final List<String> getActiveEffects() {
        return this.activeEffects;
    }

    public final int getActiveVideoLayers() {
        return this.activeVideoLayers;
    }

    public final int getFrame() {
        return this.frame;
    }
}
