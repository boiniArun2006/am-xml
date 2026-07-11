package androidx.media3.exoplayer.source.ads;

import androidx.annotation.VisibleForTesting;
import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.source.ForwardingTimeline;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@VisibleForTesting
@UnstableApi
public final class SinglePeriodAdTimeline extends ForwardingTimeline {
    private final AdPlaybackState adPlaybackState;

    @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
    public Timeline.Period getPeriod(int i2, Timeline.Period period, boolean z2) {
        this.timeline.getPeriod(i2, period, z2);
        long j2 = period.durationUs;
        if (j2 == -9223372036854775807L) {
            j2 = this.adPlaybackState.contentDurationUs;
        }
        period.set(period.id, period.uid, period.windowIndex, j2, period.getPositionInWindowUs(), this.adPlaybackState, period.isPlaceholder);
        return period;
    }

    public SinglePeriodAdTimeline(Timeline timeline, AdPlaybackState adPlaybackState) {
        boolean z2;
        super(timeline);
        if (timeline.getPeriodCount() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        Assertions.checkState(z2);
        Assertions.checkState(timeline.getWindowCount() == 1);
        this.adPlaybackState = adPlaybackState;
    }
}
