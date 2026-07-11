package com.google.android.exoplayer2.source.ads;

import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.ForwardingTimeline;
import com.google.android.exoplayer2.util.Assertions;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@VisibleForTesting
public final class SinglePeriodAdTimeline extends ForwardingTimeline {
    private final AdPlaybackState adPlaybackState;

    @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
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
