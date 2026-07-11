package androidx.media3.exoplayer.dash.manifest;

import androidx.media3.common.util.UnstableApi;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@UnstableApi
public final class ServiceDescriptionElement {
    public final long maxOffsetMs;
    public final float maxPlaybackSpeed;
    public final long minOffsetMs;
    public final float minPlaybackSpeed;
    public final long targetOffsetMs;

    public ServiceDescriptionElement(long j2, long j3, long j4, float f3, float f4) {
        this.targetOffsetMs = j2;
        this.minOffsetMs = j3;
        this.maxOffsetMs = j4;
        this.minPlaybackSpeed = f3;
        this.maxPlaybackSpeed = f4;
    }
}
