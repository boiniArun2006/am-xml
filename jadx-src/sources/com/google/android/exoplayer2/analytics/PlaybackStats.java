package com.google.android.exoplayer2.analytics;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class PlaybackStats {
    public static final PlaybackStats EMPTY = merge(new PlaybackStats[0]);
    public static final int PLAYBACK_STATE_ABANDONED = 15;
    public static final int PLAYBACK_STATE_BUFFERING = 6;
    static final int PLAYBACK_STATE_COUNT = 16;
    public static final int PLAYBACK_STATE_ENDED = 11;
    public static final int PLAYBACK_STATE_FAILED = 13;
    public static final int PLAYBACK_STATE_INTERRUPTED_BY_AD = 14;
    public static final int PLAYBACK_STATE_JOINING_BACKGROUND = 1;
    public static final int PLAYBACK_STATE_JOINING_FOREGROUND = 2;
    public static final int PLAYBACK_STATE_NOT_STARTED = 0;
    public static final int PLAYBACK_STATE_PAUSED = 4;
    public static final int PLAYBACK_STATE_PAUSED_BUFFERING = 7;
    public static final int PLAYBACK_STATE_PLAYING = 3;
    public static final int PLAYBACK_STATE_SEEKING = 5;
    public static final int PLAYBACK_STATE_STOPPED = 12;
    public static final int PLAYBACK_STATE_SUPPRESSED = 9;
    public static final int PLAYBACK_STATE_SUPPRESSED_BUFFERING = 10;
    public final int abandonedBeforeReadyCount;
    public final int adPlaybackCount;
    public final List<EventTimeAndFormat> audioFormatHistory;
    public final int backgroundJoiningCount;
    public final int endedCount;
    public final int fatalErrorCount;
    public final List<EventTimeAndException> fatalErrorHistory;
    public final int fatalErrorPlaybackCount;
    public final long firstReportedTimeMs;
    public final int foregroundPlaybackCount;
    public final int initialAudioFormatBitrateCount;
    public final int initialVideoFormatBitrateCount;
    public final int initialVideoFormatHeightCount;
    public final long maxRebufferTimeMs;
    public final List<long[]> mediaTimeHistory;
    public final int nonFatalErrorCount;
    public final List<EventTimeAndException> nonFatalErrorHistory;
    public final int playbackCount;
    private final long[] playbackStateDurationsMs;
    public final List<EventTimeAndPlaybackState> playbackStateHistory;
    public final long totalAudioFormatBitrateTimeProduct;
    public final long totalAudioFormatTimeMs;
    public final long totalAudioUnderruns;
    public final long totalBandwidthBytes;
    public final long totalBandwidthTimeMs;
    public final long totalDroppedFrames;
    public final long totalInitialAudioFormatBitrate;
    public final long totalInitialVideoFormatBitrate;
    public final int totalInitialVideoFormatHeight;
    public final int totalPauseBufferCount;
    public final int totalPauseCount;
    public final int totalRebufferCount;
    public final int totalSeekCount;
    public final long totalValidJoinTimeMs;
    public final long totalVideoFormatBitrateTimeMs;
    public final long totalVideoFormatBitrateTimeProduct;
    public final long totalVideoFormatHeightTimeMs;
    public final long totalVideoFormatHeightTimeProduct;
    public final int validJoinTimeCount;
    public final List<EventTimeAndFormat> videoFormatHistory;

    public static final class EventTimeAndException {
        public final AnalyticsListener.EventTime eventTime;
        public final Exception exception;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || EventTimeAndException.class != obj.getClass()) {
                return false;
            }
            EventTimeAndException eventTimeAndException = (EventTimeAndException) obj;
            if (this.eventTime.equals(eventTimeAndException.eventTime)) {
                return this.exception.equals(eventTimeAndException.exception);
            }
            return false;
        }

        public int hashCode() {
            return (this.eventTime.hashCode() * 31) + this.exception.hashCode();
        }

        public EventTimeAndException(AnalyticsListener.EventTime eventTime, Exception exc) {
            this.eventTime = eventTime;
            this.exception = exc;
        }
    }

    public static final class EventTimeAndFormat {
        public final AnalyticsListener.EventTime eventTime;

        @Nullable
        public final Format format;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && EventTimeAndFormat.class == obj.getClass()) {
                EventTimeAndFormat eventTimeAndFormat = (EventTimeAndFormat) obj;
                if (!this.eventTime.equals(eventTimeAndFormat.eventTime)) {
                    return false;
                }
                Format format = this.format;
                Format format2 = eventTimeAndFormat.format;
                if (format != null) {
                    return format.equals(format2);
                }
                if (format2 == null) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            int iHashCode = this.eventTime.hashCode() * 31;
            Format format = this.format;
            return iHashCode + (format != null ? format.hashCode() : 0);
        }

        public EventTimeAndFormat(AnalyticsListener.EventTime eventTime, @Nullable Format format) {
            this.eventTime = eventTime;
            this.format = format;
        }
    }

    public static final class EventTimeAndPlaybackState {
        public final AnalyticsListener.EventTime eventTime;
        public final int playbackState;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || EventTimeAndPlaybackState.class != obj.getClass()) {
                return false;
            }
            EventTimeAndPlaybackState eventTimeAndPlaybackState = (EventTimeAndPlaybackState) obj;
            if (this.playbackState != eventTimeAndPlaybackState.playbackState) {
                return false;
            }
            return this.eventTime.equals(eventTimeAndPlaybackState.eventTime);
        }

        public int hashCode() {
            return (this.eventTime.hashCode() * 31) + this.playbackState;
        }

        public EventTimeAndPlaybackState(AnalyticsListener.EventTime eventTime, int i2) {
            this.eventTime = eventTime;
            this.playbackState = i2;
        }
    }

    PlaybackStats(int i2, long[] jArr, List<EventTimeAndPlaybackState> list, List<long[]> list2, long j2, int i3, int i5, int i7, int i8, long j3, int i9, int i10, int i11, int i12, int i13, long j4, int i14, List<EventTimeAndFormat> list3, List<EventTimeAndFormat> list4, long j5, long j6, long j7, long j9, long j10, long j11, int i15, int i16, int i17, long j12, int i18, long j13, long j14, long j15, long j16, long j17, int i19, int i20, int i21, List<EventTimeAndException> list5, List<EventTimeAndException> list6) {
        this.playbackCount = i2;
        this.playbackStateDurationsMs = jArr;
        this.playbackStateHistory = Collections.unmodifiableList(list);
        this.mediaTimeHistory = Collections.unmodifiableList(list2);
        this.firstReportedTimeMs = j2;
        this.foregroundPlaybackCount = i3;
        this.abandonedBeforeReadyCount = i5;
        this.endedCount = i7;
        this.backgroundJoiningCount = i8;
        this.totalValidJoinTimeMs = j3;
        this.validJoinTimeCount = i9;
        this.totalPauseCount = i10;
        this.totalPauseBufferCount = i11;
        this.totalSeekCount = i12;
        this.totalRebufferCount = i13;
        this.maxRebufferTimeMs = j4;
        this.adPlaybackCount = i14;
        this.videoFormatHistory = Collections.unmodifiableList(list3);
        this.audioFormatHistory = Collections.unmodifiableList(list4);
        this.totalVideoFormatHeightTimeMs = j5;
        this.totalVideoFormatHeightTimeProduct = j6;
        this.totalVideoFormatBitrateTimeMs = j7;
        this.totalVideoFormatBitrateTimeProduct = j9;
        this.totalAudioFormatTimeMs = j10;
        this.totalAudioFormatBitrateTimeProduct = j11;
        this.initialVideoFormatHeightCount = i15;
        this.initialVideoFormatBitrateCount = i16;
        this.totalInitialVideoFormatHeight = i17;
        this.totalInitialVideoFormatBitrate = j12;
        this.initialAudioFormatBitrateCount = i18;
        this.totalInitialAudioFormatBitrate = j13;
        this.totalBandwidthTimeMs = j14;
        this.totalBandwidthBytes = j15;
        this.totalDroppedFrames = j16;
        this.totalAudioUnderruns = j17;
        this.fatalErrorPlaybackCount = i19;
        this.fatalErrorCount = i20;
        this.nonFatalErrorCount = i21;
        this.fatalErrorHistory = Collections.unmodifiableList(list5);
        this.nonFatalErrorHistory = Collections.unmodifiableList(list6);
    }

    public long getTotalJoinTimeMs() {
        return getPlaybackStateDurationMs(2);
    }

    public long getTotalPausedTimeMs() {
        return getPlaybackStateDurationMs(4) + getPlaybackStateDurationMs(7);
    }

    public long getTotalPlayTimeMs() {
        return getPlaybackStateDurationMs(3);
    }

    public long getTotalRebufferTimeMs() {
        return getPlaybackStateDurationMs(6);
    }

    public long getTotalSeekTimeMs() {
        return getPlaybackStateDurationMs(5);
    }

    public long getTotalWaitTimeMs() {
        return getPlaybackStateDurationMs(2) + getPlaybackStateDurationMs(6) + getPlaybackStateDurationMs(5);
    }

    public static PlaybackStats merge(PlaybackStats... playbackStatsArr) {
        PlaybackStats[] playbackStatsArr2 = playbackStatsArr;
        int i2 = 16;
        long[] jArr = new long[16];
        int length = playbackStatsArr2.length;
        int i3 = 0;
        int i5 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        long j7 = 0;
        long j9 = 0;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        long j13 = -1;
        long j14 = -1;
        long j15 = -1;
        long jMax = -9223372036854775807L;
        int i20 = -1;
        long jMin = -9223372036854775807L;
        long j16 = -9223372036854775807L;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        while (i21 < length) {
            long j17 = j13;
            PlaybackStats playbackStats = playbackStatsArr2[i21];
            i3 += playbackStats.playbackCount;
            int i24 = 0;
            while (i24 < i2) {
                jArr[i24] = jArr[i24] + playbackStats.playbackStateDurationsMs[i24];
                i24++;
                i2 = 16;
            }
            if (jMin == -9223372036854775807L) {
                jMin = playbackStats.firstReportedTimeMs;
            } else {
                long j18 = playbackStats.firstReportedTimeMs;
                if (j18 != -9223372036854775807L) {
                    jMin = Math.min(jMin, j18);
                }
            }
            i5 += playbackStats.foregroundPlaybackCount;
            i22 += playbackStats.abandonedBeforeReadyCount;
            i23 += playbackStats.endedCount;
            i7 += playbackStats.backgroundJoiningCount;
            if (j16 == -9223372036854775807L) {
                j16 = playbackStats.totalValidJoinTimeMs;
            } else {
                long j19 = playbackStats.totalValidJoinTimeMs;
                if (j19 != -9223372036854775807L) {
                    j16 += j19;
                }
            }
            i8 += playbackStats.validJoinTimeCount;
            i9 += playbackStats.totalPauseCount;
            i10 += playbackStats.totalPauseBufferCount;
            i11 += playbackStats.totalSeekCount;
            i12 += playbackStats.totalRebufferCount;
            if (jMax == -9223372036854775807L) {
                jMax = playbackStats.maxRebufferTimeMs;
            } else {
                long j20 = playbackStats.maxRebufferTimeMs;
                if (j20 != -9223372036854775807L) {
                    jMax = Math.max(jMax, j20);
                }
            }
            i13 += playbackStats.adPlaybackCount;
            j2 += playbackStats.totalVideoFormatHeightTimeMs;
            j3 += playbackStats.totalVideoFormatHeightTimeProduct;
            j4 += playbackStats.totalVideoFormatBitrateTimeMs;
            j5 += playbackStats.totalVideoFormatBitrateTimeProduct;
            j6 += playbackStats.totalAudioFormatTimeMs;
            j7 += playbackStats.totalAudioFormatBitrateTimeProduct;
            i14 += playbackStats.initialVideoFormatHeightCount;
            i15 += playbackStats.initialVideoFormatBitrateCount;
            if (i20 == -1) {
                i20 = playbackStats.totalInitialVideoFormatHeight;
            } else {
                int i25 = playbackStats.totalInitialVideoFormatHeight;
                if (i25 != -1) {
                    i20 += i25;
                }
            }
            if (j14 == j17) {
                j14 = playbackStats.totalInitialVideoFormatBitrate;
            } else {
                long j21 = playbackStats.totalInitialVideoFormatBitrate;
                if (j21 != j17) {
                    j14 += j21;
                }
            }
            i16 += playbackStats.initialAudioFormatBitrateCount;
            if (j15 == j17) {
                j15 = playbackStats.totalInitialAudioFormatBitrate;
            } else {
                long j22 = playbackStats.totalInitialAudioFormatBitrate;
                if (j22 != j17) {
                    j15 += j22;
                }
            }
            j9 += playbackStats.totalBandwidthTimeMs;
            j10 += playbackStats.totalBandwidthBytes;
            j11 += playbackStats.totalDroppedFrames;
            j12 += playbackStats.totalAudioUnderruns;
            i17 += playbackStats.fatalErrorPlaybackCount;
            i18 += playbackStats.fatalErrorCount;
            i19 += playbackStats.nonFatalErrorCount;
            i21++;
            playbackStatsArr2 = playbackStatsArr;
            j13 = j17;
            i2 = 16;
        }
        long j23 = jMax;
        List list = Collections.EMPTY_LIST;
        return new PlaybackStats(i3, jArr, list, list, jMin, i5, i22, i23, i7, j16, i8, i9, i10, i11, i12, j23, i13, list, list, j2, j3, j4, j5, j6, j7, i14, i15, i20, j14, i16, j15, j9, j10, j11, j12, i17, i18, i19, list, list);
    }

    public float getAbandonedBeforeReadyRatio() {
        int i2 = this.abandonedBeforeReadyCount;
        int i3 = this.playbackCount;
        int i5 = this.foregroundPlaybackCount;
        int i7 = i2 - (i3 - i5);
        if (i5 == 0) {
            return 0.0f;
        }
        return i7 / i5;
    }

    public float getEndedRatio() {
        int i2 = this.foregroundPlaybackCount;
        if (i2 == 0) {
            return 0.0f;
        }
        return this.endedCount / i2;
    }

    public float getFatalErrorRatio() {
        int i2 = this.foregroundPlaybackCount;
        if (i2 == 0) {
            return 0.0f;
        }
        return this.fatalErrorPlaybackCount / i2;
    }

    public int getMeanAudioFormatBitrate() {
        long j2 = this.totalAudioFormatTimeMs;
        if (j2 == 0) {
            return -1;
        }
        return (int) (this.totalAudioFormatBitrateTimeProduct / j2);
    }

    public int getMeanBandwidth() {
        long j2 = this.totalBandwidthTimeMs;
        if (j2 == 0) {
            return -1;
        }
        return (int) ((this.totalBandwidthBytes * 8000) / j2);
    }

    public long getMeanElapsedTimeMs() {
        if (this.playbackCount == 0) {
            return -9223372036854775807L;
        }
        return getTotalElapsedTimeMs() / ((long) this.playbackCount);
    }

    public int getMeanInitialAudioFormatBitrate() {
        int i2 = this.initialAudioFormatBitrateCount;
        if (i2 == 0) {
            return -1;
        }
        return (int) (this.totalInitialAudioFormatBitrate / ((long) i2));
    }

    public int getMeanInitialVideoFormatBitrate() {
        int i2 = this.initialVideoFormatBitrateCount;
        if (i2 == 0) {
            return -1;
        }
        return (int) (this.totalInitialVideoFormatBitrate / ((long) i2));
    }

    public int getMeanInitialVideoFormatHeight() {
        int i2 = this.initialVideoFormatHeightCount;
        if (i2 == 0) {
            return -1;
        }
        return this.totalInitialVideoFormatHeight / i2;
    }

    public long getMeanJoinTimeMs() {
        int i2 = this.validJoinTimeCount;
        if (i2 == 0) {
            return -9223372036854775807L;
        }
        return this.totalValidJoinTimeMs / ((long) i2);
    }

    public float getMeanNonFatalErrorCount() {
        int i2 = this.foregroundPlaybackCount;
        if (i2 == 0) {
            return 0.0f;
        }
        return this.nonFatalErrorCount / i2;
    }

    public float getMeanPauseBufferCount() {
        int i2 = this.foregroundPlaybackCount;
        if (i2 == 0) {
            return 0.0f;
        }
        return this.totalPauseBufferCount / i2;
    }

    public float getMeanPauseCount() {
        int i2 = this.foregroundPlaybackCount;
        if (i2 == 0) {
            return 0.0f;
        }
        return this.totalPauseCount / i2;
    }

    public long getMeanPausedTimeMs() {
        if (this.foregroundPlaybackCount == 0) {
            return -9223372036854775807L;
        }
        return getTotalPausedTimeMs() / ((long) this.foregroundPlaybackCount);
    }

    public long getMeanPlayAndWaitTimeMs() {
        if (this.foregroundPlaybackCount == 0) {
            return -9223372036854775807L;
        }
        return getTotalPlayAndWaitTimeMs() / ((long) this.foregroundPlaybackCount);
    }

    public long getMeanPlayTimeMs() {
        if (this.foregroundPlaybackCount == 0) {
            return -9223372036854775807L;
        }
        return getTotalPlayTimeMs() / ((long) this.foregroundPlaybackCount);
    }

    public float getMeanRebufferCount() {
        int i2 = this.foregroundPlaybackCount;
        if (i2 == 0) {
            return 0.0f;
        }
        return this.totalRebufferCount / i2;
    }

    public long getMeanRebufferTimeMs() {
        if (this.foregroundPlaybackCount == 0) {
            return -9223372036854775807L;
        }
        return getTotalRebufferTimeMs() / ((long) this.foregroundPlaybackCount);
    }

    public float getMeanSeekCount() {
        int i2 = this.foregroundPlaybackCount;
        if (i2 == 0) {
            return 0.0f;
        }
        return this.totalSeekCount / i2;
    }

    public long getMeanSeekTimeMs() {
        if (this.foregroundPlaybackCount == 0) {
            return -9223372036854775807L;
        }
        return getTotalSeekTimeMs() / ((long) this.foregroundPlaybackCount);
    }

    public long getMeanSingleRebufferTimeMs() {
        if (this.totalRebufferCount == 0) {
            return -9223372036854775807L;
        }
        return (getPlaybackStateDurationMs(6) + getPlaybackStateDurationMs(7)) / ((long) this.totalRebufferCount);
    }

    public long getMeanSingleSeekTimeMs() {
        if (this.totalSeekCount == 0) {
            return -9223372036854775807L;
        }
        return getTotalSeekTimeMs() / ((long) this.totalSeekCount);
    }

    public float getMeanTimeBetweenFatalErrors() {
        return 1.0f / getFatalErrorRate();
    }

    public float getMeanTimeBetweenNonFatalErrors() {
        return 1.0f / getNonFatalErrorRate();
    }

    public float getMeanTimeBetweenRebuffers() {
        return 1.0f / getRebufferRate();
    }

    public int getMeanVideoFormatBitrate() {
        long j2 = this.totalVideoFormatBitrateTimeMs;
        if (j2 == 0) {
            return -1;
        }
        return (int) (this.totalVideoFormatBitrateTimeProduct / j2);
    }

    public int getMeanVideoFormatHeight() {
        long j2 = this.totalVideoFormatHeightTimeMs;
        if (j2 == 0) {
            return -1;
        }
        return (int) (this.totalVideoFormatHeightTimeProduct / j2);
    }

    public long getMeanWaitTimeMs() {
        if (this.foregroundPlaybackCount == 0) {
            return -9223372036854775807L;
        }
        return getTotalWaitTimeMs() / ((long) this.foregroundPlaybackCount);
    }

    public long getMediaTimeMsAtRealtimeMs(long j2) {
        if (this.mediaTimeHistory.isEmpty()) {
            return -9223372036854775807L;
        }
        int i2 = 0;
        while (i2 < this.mediaTimeHistory.size() && this.mediaTimeHistory.get(i2)[0] <= j2) {
            i2++;
        }
        if (i2 == 0) {
            return this.mediaTimeHistory.get(0)[1];
        }
        if (i2 == this.mediaTimeHistory.size()) {
            List<long[]> list = this.mediaTimeHistory;
            return list.get(list.size() - 1)[1];
        }
        int i3 = i2 - 1;
        long j3 = this.mediaTimeHistory.get(i3)[0];
        long j4 = this.mediaTimeHistory.get(i3)[1];
        long j5 = this.mediaTimeHistory.get(i2)[0];
        long j6 = this.mediaTimeHistory.get(i2)[1];
        long j7 = j5 - j3;
        if (j7 == 0) {
            return j4;
        }
        return j4 + ((long) ((j6 - j4) * ((j2 - j3) / j7)));
    }

    public int getPlaybackStateAtTime(long j2) {
        int i2 = 0;
        for (EventTimeAndPlaybackState eventTimeAndPlaybackState : this.playbackStateHistory) {
            if (eventTimeAndPlaybackState.eventTime.realtimeMs > j2) {
                break;
            }
            i2 = eventTimeAndPlaybackState.playbackState;
        }
        return i2;
    }

    public long getPlaybackStateDurationMs(int i2) {
        return this.playbackStateDurationsMs[i2];
    }

    public long getTotalElapsedTimeMs() {
        long j2 = 0;
        for (int i2 = 0; i2 < 16; i2++) {
            j2 += this.playbackStateDurationsMs[i2];
        }
        return j2;
    }

    public float getAudioUnderrunRate() {
        long totalPlayTimeMs = getTotalPlayTimeMs();
        if (totalPlayTimeMs == 0) {
            return 0.0f;
        }
        return (this.totalAudioUnderruns * 1000.0f) / totalPlayTimeMs;
    }

    public float getDroppedFramesRate() {
        long totalPlayTimeMs = getTotalPlayTimeMs();
        if (totalPlayTimeMs == 0) {
            return 0.0f;
        }
        return (this.totalDroppedFrames * 1000.0f) / totalPlayTimeMs;
    }

    public float getFatalErrorRate() {
        long totalPlayTimeMs = getTotalPlayTimeMs();
        if (totalPlayTimeMs == 0) {
            return 0.0f;
        }
        return (this.fatalErrorCount * 1000.0f) / totalPlayTimeMs;
    }

    public float getJoinTimeRatio() {
        long totalPlayAndWaitTimeMs = getTotalPlayAndWaitTimeMs();
        if (totalPlayAndWaitTimeMs == 0) {
            return 0.0f;
        }
        return getTotalJoinTimeMs() / totalPlayAndWaitTimeMs;
    }

    public float getNonFatalErrorRate() {
        long totalPlayTimeMs = getTotalPlayTimeMs();
        if (totalPlayTimeMs == 0) {
            return 0.0f;
        }
        return (this.nonFatalErrorCount * 1000.0f) / totalPlayTimeMs;
    }

    public float getRebufferRate() {
        long totalPlayTimeMs = getTotalPlayTimeMs();
        if (totalPlayTimeMs == 0) {
            return 0.0f;
        }
        return (this.totalRebufferCount * 1000.0f) / totalPlayTimeMs;
    }

    public float getRebufferTimeRatio() {
        long totalPlayAndWaitTimeMs = getTotalPlayAndWaitTimeMs();
        if (totalPlayAndWaitTimeMs == 0) {
            return 0.0f;
        }
        return getTotalRebufferTimeMs() / totalPlayAndWaitTimeMs;
    }

    public float getSeekTimeRatio() {
        long totalPlayAndWaitTimeMs = getTotalPlayAndWaitTimeMs();
        if (totalPlayAndWaitTimeMs == 0) {
            return 0.0f;
        }
        return getTotalSeekTimeMs() / totalPlayAndWaitTimeMs;
    }

    public long getTotalPlayAndWaitTimeMs() {
        return getTotalPlayTimeMs() + getTotalWaitTimeMs();
    }

    public float getWaitTimeRatio() {
        long totalPlayAndWaitTimeMs = getTotalPlayAndWaitTimeMs();
        if (totalPlayAndWaitTimeMs == 0) {
            return 0.0f;
        }
        return getTotalWaitTimeMs() / totalPlayAndWaitTimeMs;
    }
}
