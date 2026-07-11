package androidx.media3.exoplayer.source;

import androidx.annotation.Nullable;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.upstream.Allocator;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@UnstableApi
public final class ClippingMediaSource extends WrappingMediaSource {
    private final boolean allowDynamicClippingUpdates;
    private final boolean allowUnseekableMedia;

    @Nullable
    private IllegalClippingException clippingError;

    @Nullable
    private ClippingTimeline clippingTimeline;
    private final boolean enableInitialDiscontinuity;
    private final long endUs;
    private final ArrayList<ClippingMediaPeriod> mediaPeriods;
    private long periodEndUs;
    private long periodStartUs;
    private final boolean relativeToDefaultPosition;
    private final long startUs;
    private final Timeline.Window window;

    public static final class Builder {
        private boolean allowDynamicClippingUpdates;
        private boolean allowUnseekableMedia;
        private boolean buildCalled;
        private boolean enableInitialDiscontinuity = true;
        private long endPositionUs = Long.MIN_VALUE;
        private final MediaSource mediaSource;
        private boolean relativeToDefaultPosition;
        private long startPositionUs;

        public ClippingMediaSource build() {
            this.buildCalled = true;
            return new ClippingMediaSource(this);
        }

        public Builder setAllowDynamicClippingUpdates(boolean z2) {
            Assertions.checkState(!this.buildCalled);
            this.allowDynamicClippingUpdates = z2;
            return this;
        }

        public Builder setAllowUnseekableMedia(boolean z2) {
            Assertions.checkState(!this.buildCalled);
            this.allowUnseekableMedia = z2;
            return this;
        }

        public Builder setEnableInitialDiscontinuity(boolean z2) {
            Assertions.checkState(!this.buildCalled);
            this.enableInitialDiscontinuity = z2;
            return this;
        }

        public Builder setEndPositionUs(long j2) {
            Assertions.checkState(!this.buildCalled);
            this.endPositionUs = j2;
            return this;
        }

        public Builder setRelativeToDefaultPosition(boolean z2) {
            Assertions.checkState(!this.buildCalled);
            this.relativeToDefaultPosition = z2;
            return this;
        }

        public Builder setStartPositionUs(long j2) {
            Assertions.checkArgument(j2 >= 0);
            Assertions.checkState(!this.buildCalled);
            this.startPositionUs = j2;
            return this;
        }

        public Builder(MediaSource mediaSource) {
            this.mediaSource = (MediaSource) Assertions.checkNotNull(mediaSource);
        }

        public Builder setEndPositionMs(long j2) {
            return setEndPositionUs(Util.msToUs(j2));
        }

        public Builder setStartPositionMs(long j2) {
            return setStartPositionUs(Util.msToUs(j2));
        }
    }

    private static final class ClippingTimeline extends ForwardingTimeline {
        private final long durationUs;
        private final long endUs;
        private final boolean isDynamic;
        private final long startUs;

        @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
        public Timeline.Period getPeriod(int i2, Timeline.Period period, boolean z2) {
            this.timeline.getPeriod(0, period, z2);
            long positionInWindowUs = period.getPositionInWindowUs() - this.startUs;
            long j2 = this.durationUs;
            return period.set(period.id, period.uid, 0, j2 != -9223372036854775807L ? j2 - positionInWindowUs : -9223372036854775807L, positionInWindowUs);
        }

        @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
        public Timeline.Window getWindow(int i2, Timeline.Window window, long j2) {
            this.timeline.getWindow(0, window, 0L);
            long j3 = window.positionInFirstPeriodUs;
            long j4 = this.startUs;
            window.positionInFirstPeriodUs = j3 + j4;
            window.durationUs = this.durationUs;
            window.isDynamic = this.isDynamic;
            long j5 = window.defaultPositionUs;
            if (j5 != -9223372036854775807L) {
                long jMax = Math.max(j5, j4);
                window.defaultPositionUs = jMax;
                long j6 = this.endUs;
                if (j6 != -9223372036854775807L) {
                    jMax = Math.min(jMax, j6);
                }
                window.defaultPositionUs = jMax - this.startUs;
            }
            long jUsToMs = Util.usToMs(this.startUs);
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

        public ClippingTimeline(Timeline timeline, long j2, long j3, boolean z2) throws IllegalClippingException {
            long jMax;
            long j4;
            super(timeline);
            if (j3 != Long.MIN_VALUE && j3 < j2) {
                throw new IllegalClippingException(2, j2, j3);
            }
            boolean z3 = false;
            if (timeline.getPeriodCount() == 1) {
                Timeline.Window window = timeline.getWindow(0, new Timeline.Window());
                long jMax2 = Math.max(0L, j2);
                if (!z2 && !window.isPlaceholder && jMax2 != 0 && !window.isSeekable) {
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
                        jMax2 = jMax;
                    }
                }
                this.startUs = jMax2;
                this.endUs = jMax;
                if (jMax == -9223372036854775807L) {
                    j4 = -9223372036854775807L;
                } else {
                    j4 = jMax - jMax2;
                }
                this.durationUs = j4;
                if (window.isDynamic && (jMax == -9223372036854775807L || (j5 != -9223372036854775807L && jMax == j5))) {
                    z3 = true;
                }
                this.isDynamic = z3;
                return;
            }
            throw new IllegalClippingException(0);
        }
    }

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
            this(i2, -9223372036854775807L, -9223372036854775807L);
        }

        public IllegalClippingException(int i2, long j2, long j3) {
            super("Illegal clipping: " + getReasonDescription(i2, j2, j3));
            this.reason = i2;
        }

        private static String getReasonDescription(int i2, long j2, long j3) {
            if (i2 == 0) {
                return "invalid period count";
            }
            if (i2 == 1) {
                return "not seekable to start";
            }
            if (i2 != 2) {
                return "unknown";
            }
            Assertions.checkState((j2 == -9223372036854775807L || j3 == -9223372036854775807L) ? false : true);
            return "start exceeds end. Start time: " + j2 + ", End time: " + j3;
        }
    }

    @Deprecated
    public ClippingMediaSource(MediaSource mediaSource, long j2, long j3) {
        this(new Builder(mediaSource).setStartPositionUs(j2).setEndPositionUs(j3));
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
            ClippingTimeline clippingTimeline = new ClippingTimeline(timeline, j2, j, this.allowUnseekableMedia);
            this.clippingTimeline = clippingTimeline;
            refreshSourceInfo(clippingTimeline);
        } catch (IllegalClippingException e2) {
            this.clippingError = e2;
            for (int i3 = 0; i3 < this.mediaPeriods.size(); i3++) {
                this.mediaPeriods.get(i3).setClippingError(this.clippingError);
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j2) {
        ClippingMediaPeriod clippingMediaPeriod = new ClippingMediaPeriod(this.mediaSource.createPeriod(mediaPeriodId, allocator, j2), this.enableInitialDiscontinuity, this.periodStartUs, this.periodEndUs);
        this.mediaPeriods.add(clippingMediaPeriod);
        return clippingMediaPeriod;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.MediaSource
    public void maybeThrowSourceInfoRefreshError() throws IOException {
        IllegalClippingException illegalClippingException = this.clippingError;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        super.maybeThrowSourceInfoRefreshError();
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource
    protected void onChildSourceInfoRefreshed(Timeline timeline) {
        if (this.clippingError != null) {
            return;
        }
        refreshClippedTimeline(timeline);
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        Assertions.checkState(this.mediaPeriods.remove(mediaPeriod));
        this.mediaSource.releasePeriod(((ClippingMediaPeriod) mediaPeriod).mediaPeriod);
        if (!this.mediaPeriods.isEmpty() || this.allowDynamicClippingUpdates) {
            return;
        }
        refreshClippedTimeline(((ClippingTimeline) Assertions.checkNotNull(this.clippingTimeline)).timeline);
    }

    @Override // androidx.media3.exoplayer.source.WrappingMediaSource, androidx.media3.exoplayer.source.MediaSource
    public boolean canUpdateMediaItem(MediaItem mediaItem) {
        if (getMediaItem().clippingConfiguration.equals(mediaItem.clippingConfiguration) && this.mediaSource.canUpdateMediaItem(mediaItem)) {
            return true;
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    protected void releaseSourceInternal() {
        super.releaseSourceInternal();
        this.clippingError = null;
        this.clippingTimeline = null;
    }

    @Deprecated
    public ClippingMediaSource(MediaSource mediaSource, long j2) {
        this(new Builder(mediaSource).setEndPositionUs(j2).setRelativeToDefaultPosition(true));
    }

    @Deprecated
    public ClippingMediaSource(MediaSource mediaSource, long j2, long j3, boolean z2, boolean z3, boolean z4) {
        this(new Builder(mediaSource).setStartPositionUs(j2).setEndPositionUs(j3).setEnableInitialDiscontinuity(z2).setAllowDynamicClippingUpdates(z3).setRelativeToDefaultPosition(z4));
    }

    private ClippingMediaSource(Builder builder) {
        super(builder.mediaSource);
        this.startUs = builder.startPositionUs;
        this.endUs = builder.endPositionUs;
        this.enableInitialDiscontinuity = builder.enableInitialDiscontinuity;
        this.allowDynamicClippingUpdates = builder.allowDynamicClippingUpdates;
        this.relativeToDefaultPosition = builder.relativeToDefaultPosition;
        this.allowUnseekableMedia = builder.allowUnseekableMedia;
        this.mediaPeriods = new ArrayList<>();
        this.window = new Timeline.Window();
    }
}
