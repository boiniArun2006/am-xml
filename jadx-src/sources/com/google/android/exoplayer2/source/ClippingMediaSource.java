package com.google.android.exoplayer2.source;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.upstream.Allocator;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class ClippingMediaSource extends CompositeMediaSource<Void> {
    private final boolean allowDynamicClippingUpdates;

    @Nullable
    private IllegalClippingException clippingError;

    @Nullable
    private j clippingTimeline;
    private final boolean enableInitialDiscontinuity;
    private final long endUs;
    private final ArrayList<ClippingMediaPeriod> mediaPeriods;
    private final MediaSource mediaSource;
    private long periodEndUs;
    private long periodStartUs;
    private final boolean relativeToDefaultPosition;
    private final long startUs;
    private final Timeline.Window window;

    public static final class IllegalClippingException extends IOException {
        public static final int REASON_INVALID_PERIOD_COUNT = 0;
        public static final int REASON_NOT_SEEKABLE_TO_START = 1;
        public static final int REASON_START_EXCEEDS_END = 2;
        public final int reason;

        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface Reason {
        }

        public IllegalClippingException(int i2) {
            super("Illegal clipping: " + getReasonDescription(i2));
            this.reason = i2;
        }

        private static String getReasonDescription(int i2) {
            return i2 != 0 ? i2 != 1 ? i2 != 2 ? "unknown" : "start exceeds end" : "not seekable to start" : "invalid period count";
        }
    }

    private static final class j extends ForwardingTimeline {
        private final boolean J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final long f58068O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final long f58069n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final long f58070t;

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public Timeline.Period getPeriod(int i2, Timeline.Period period, boolean z2) {
            this.timeline.getPeriod(0, period, z2);
            long positionInWindowUs = period.getPositionInWindowUs() - this.f58069n;
            long j2 = this.f58068O;
            return period.set(period.id, period.uid, 0, j2 != -9223372036854775807L ? j2 - positionInWindowUs : -9223372036854775807L, positionInWindowUs);
        }

        @Override // com.google.android.exoplayer2.source.ForwardingTimeline, com.google.android.exoplayer2.Timeline
        public Timeline.Window getWindow(int i2, Timeline.Window window, long j2) {
            this.timeline.getWindow(0, window, 0L);
            long j3 = window.positionInFirstPeriodUs;
            long j4 = this.f58069n;
            window.positionInFirstPeriodUs = j3 + j4;
            window.durationUs = this.f58068O;
            window.isDynamic = this.J2;
            long j5 = window.defaultPositionUs;
            if (j5 != -9223372036854775807L) {
                long jMax = Math.max(j5, j4);
                window.defaultPositionUs = jMax;
                long j6 = this.f58070t;
                if (j6 != -9223372036854775807L) {
                    jMax = Math.min(jMax, j6);
                }
                window.defaultPositionUs = jMax - this.f58069n;
            }
            long jUsToMs = Util.usToMs(this.f58069n);
            long j7 = window.presentationStartTimeMs;
            if (j7 != -9223372036854775807L) {
                window.presentationStartTimeMs = j7 + jUsToMs;
            }
            long j9 = window.windowStartTimeMs;
            if (j9 != -9223372036854775807L) {
                window.windowStartTimeMs = j9 + jUsToMs;
            }
            return window;
        }

        public j(Timeline timeline, long j2, long j3) throws IllegalClippingException {
            long jMax;
            long j4;
            super(timeline);
            boolean z2 = false;
            if (timeline.getPeriodCount() == 1) {
                Timeline.Window window = timeline.getWindow(0, new Timeline.Window());
                long jMax2 = Math.max(0L, j2);
                if (!window.isPlaceholder && jMax2 != 0 && !window.isSeekable) {
                    throw new IllegalClippingException(1);
                }
                if (j3 == Long.MIN_VALUE) {
                    jMax = window.durationUs;
                } else {
                    jMax = Math.max(0L, j3);
                }
                long j5 = window.durationUs;
                if (j5 != -9223372036854775807L) {
                    jMax = jMax > j5 ? j5 : jMax;
                    if (jMax2 > jMax) {
                        throw new IllegalClippingException(2);
                    }
                }
                this.f58069n = jMax2;
                this.f58070t = jMax;
                if (jMax == -9223372036854775807L) {
                    j4 = -9223372036854775807L;
                } else {
                    j4 = jMax - jMax2;
                }
                this.f58068O = j4;
                if (window.isDynamic && (jMax == -9223372036854775807L || (j5 != -9223372036854775807L && jMax == j5))) {
                    z2 = true;
                }
                this.J2 = z2;
                return;
            }
            throw new IllegalClippingException(0);
        }
    }

    public ClippingMediaSource(MediaSource mediaSource, long j2, long j3) {
        this(mediaSource, j2, j3, true, false, false);
    }

    public ClippingMediaSource(MediaSource mediaSource, long j2) {
        this(mediaSource, 0L, j2, true, false, true);
    }

    private void refreshClippedTimeline(Timeline timeline) {
        long j2;
        timeline.getWindow(0, this.window);
        long positionInFirstPeriodUs = this.window.getPositionInFirstPeriodUs();
        if (this.clippingTimeline == null || this.mediaPeriods.isEmpty() || this.allowDynamicClippingUpdates) {
            j2 = this.startUs;
            long j3 = this.endUs;
            if (this.relativeToDefaultPosition) {
                long defaultPositionUs = this.window.getDefaultPositionUs();
                j2 += defaultPositionUs;
                j3 += defaultPositionUs;
            }
            this.periodStartUs = positionInFirstPeriodUs + j2;
            this.periodEndUs = this.endUs != Long.MIN_VALUE ? positionInFirstPeriodUs + j3 : Long.MIN_VALUE;
            int size = this.mediaPeriods.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.mediaPeriods.get(i2).updateClipping(this.periodStartUs, this.periodEndUs);
            }
            j = j3;
        } else {
            j2 = this.periodStartUs - positionInFirstPeriodUs;
            if (this.endUs != Long.MIN_VALUE) {
                j = this.periodEndUs - positionInFirstPeriodUs;
            }
        }
        try {
            j jVar = new j(timeline, j2, j);
            this.clippingTimeline = jVar;
            refreshSourceInfo(jVar);
        } catch (IllegalClippingException e2) {
            this.clippingError = e2;
            for (int i3 = 0; i3 < this.mediaPeriods.size(); i3++) {
                this.mediaPeriods.get(i3).setClippingError(this.clippingError);
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j2) {
        ClippingMediaPeriod clippingMediaPeriod = new ClippingMediaPeriod(this.mediaSource.createPeriod(mediaPeriodId, allocator, j2), this.enableInitialDiscontinuity, this.periodStartUs, this.periodEndUs);
        this.mediaPeriods.add(clippingMediaPeriod);
        return clippingMediaPeriod;
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public MediaItem getMediaItem() {
        return this.mediaSource.getMediaItem();
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        IllegalClippingException illegalClippingException = this.clippingError;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        super.maybeThrowSourceInfoRefreshError();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.exoplayer2.source.CompositeMediaSource
    public void onChildSourceInfoRefreshed(Void r12, MediaSource mediaSource, Timeline timeline) {
        if (this.clippingError != null) {
            return;
        }
        refreshClippedTimeline(timeline);
    }

    @Override // com.google.android.exoplayer2.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        Assertions.checkState(this.mediaPeriods.remove(mediaPeriod));
        this.mediaSource.releasePeriod(((ClippingMediaPeriod) mediaPeriod).mediaPeriod);
        if (!this.mediaPeriods.isEmpty() || this.allowDynamicClippingUpdates) {
            return;
        }
        refreshClippedTimeline(((j) Assertions.checkNotNull(this.clippingTimeline)).timeline);
    }

    public ClippingMediaSource(MediaSource mediaSource, long j2, long j3, boolean z2, boolean z3, boolean z4) {
        Assertions.checkArgument(j2 >= 0);
        this.mediaSource = (MediaSource) Assertions.checkNotNull(mediaSource);
        this.startUs = j2;
        this.endUs = j3;
        this.enableInitialDiscontinuity = z2;
        this.allowDynamicClippingUpdates = z3;
        this.relativeToDefaultPosition = z4;
        this.mediaPeriods = new ArrayList<>();
        this.window = new Timeline.Window();
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    protected void prepareSourceInternal(@Nullable TransferListener transferListener) {
        super.prepareSourceInternal(transferListener);
        prepareChildSource(null, this.mediaSource);
    }

    @Override // com.google.android.exoplayer2.source.CompositeMediaSource, com.google.android.exoplayer2.source.BaseMediaSource
    protected void releaseSourceInternal() {
        super.releaseSourceInternal();
        this.clippingError = null;
        this.clippingTimeline = null;
    }
}
