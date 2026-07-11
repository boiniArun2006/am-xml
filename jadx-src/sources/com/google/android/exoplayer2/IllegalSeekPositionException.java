package com.google.android.exoplayer2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class IllegalSeekPositionException extends IllegalStateException {
    public final long positionMs;
    public final Timeline timeline;
    public final int windowIndex;

    public IllegalSeekPositionException(Timeline timeline, int i2, long j2) {
        this.timeline = timeline;
        this.windowIndex = i2;
        this.positionMs = j2;
    }
}
