package com.google.android.exoplayer2.trackselection;

import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.chunk.MediaChunk;
import com.google.android.exoplayer2.source.chunk.MediaChunkIterator;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.M;
import com.google.common.collect.h;
import com.google.common.collect.lej;
import com.google.common.collect.nKK;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public class AdaptiveTrackSelection extends BaseTrackSelection {
    public static final float DEFAULT_BANDWIDTH_FRACTION = 0.7f;
    public static final float DEFAULT_BUFFERED_FRACTION_TO_LIVE_EDGE_FOR_QUALITY_INCREASE = 0.75f;
    public static final int DEFAULT_MAX_DURATION_FOR_QUALITY_DECREASE_MS = 25000;
    public static final int DEFAULT_MAX_HEIGHT_TO_DISCARD = 719;
    public static final int DEFAULT_MAX_WIDTH_TO_DISCARD = 1279;
    public static final int DEFAULT_MIN_DURATION_FOR_QUALITY_INCREASE_MS = 10000;
    public static final int DEFAULT_MIN_DURATION_TO_RETAIN_AFTER_DISCARD_MS = 25000;
    private static final long MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS = 1000;
    private static final String TAG = "AdaptiveTrackSelection";
    private final nKK adaptationCheckpoints;
    private final float bandwidthFraction;
    private final BandwidthMeter bandwidthMeter;
    private final float bufferedFractionToLiveEdgeForQualityIncrease;
    private final Clock clock;

    @Nullable
    private MediaChunk lastBufferEvaluationMediaChunk;
    private long lastBufferEvaluationMs;
    private final long maxDurationForQualityDecreaseUs;
    private final int maxHeightToDiscard;
    private final int maxWidthToDiscard;
    private final long minDurationForQualityIncreaseUs;
    private final long minDurationToRetainAfterDiscardUs;
    private float playbackSpeed;
    private int reason;
    private int selectedIndex;

    public static final class AdaptationCheckpoint {
        public final long allocatedBandwidth;
        public final long totalBandwidth;

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AdaptationCheckpoint)) {
                return false;
            }
            AdaptationCheckpoint adaptationCheckpoint = (AdaptationCheckpoint) obj;
            return this.totalBandwidth == adaptationCheckpoint.totalBandwidth && this.allocatedBandwidth == adaptationCheckpoint.allocatedBandwidth;
        }

        public int hashCode() {
            return (((int) this.totalBandwidth) * 31) + ((int) this.allocatedBandwidth);
        }

        public AdaptationCheckpoint(long j2, long j3) {
            this.totalBandwidth = j2;
            this.allocatedBandwidth = j3;
        }
    }

    public static class Factory implements ExoTrackSelection.Factory {
        private final float bandwidthFraction;
        private final float bufferedFractionToLiveEdgeForQualityIncrease;
        private final Clock clock;
        private final int maxDurationForQualityDecreaseMs;
        private final int maxHeightToDiscard;
        private final int maxWidthToDiscard;
        private final int minDurationForQualityIncreaseMs;
        private final int minDurationToRetainAfterDiscardMs;

        public Factory() {
            this(10000, 25000, 25000, 0.7f);
        }

        public Factory(int i2, int i3, int i5, float f3) {
            this(i2, i3, i5, 1279, 719, f3, 0.75f, Clock.DEFAULT);
        }

        protected AdaptiveTrackSelection createAdaptiveTrackSelection(TrackGroup trackGroup, int[] iArr, int i2, BandwidthMeter bandwidthMeter, nKK nkk) {
            return new AdaptiveTrackSelection(trackGroup, iArr, i2, bandwidthMeter, this.minDurationForQualityIncreaseMs, this.maxDurationForQualityDecreaseMs, this.minDurationToRetainAfterDiscardMs, this.maxWidthToDiscard, this.maxHeightToDiscard, this.bandwidthFraction, this.bufferedFractionToLiveEdgeForQualityIncrease, nkk, this.clock);
        }

        public Factory(int i2, int i3, int i5, int i7, int i8, float f3) {
            this(i2, i3, i5, i7, i8, f3, 0.75f, Clock.DEFAULT);
        }

        /* JADX WARN: Removed duplicated region for block: B:9:0x0015  */
        @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection.Factory
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final ExoTrackSelection[] createTrackSelections(ExoTrackSelection.Definition[] definitionArr, BandwidthMeter bandwidthMeter, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline) {
            BandwidthMeter bandwidthMeter2;
            ExoTrackSelection exoTrackSelectionCreateAdaptiveTrackSelection;
            nKK adaptationCheckpoints = AdaptiveTrackSelection.getAdaptationCheckpoints(definitionArr);
            ExoTrackSelection[] exoTrackSelectionArr = new ExoTrackSelection[definitionArr.length];
            int i2 = 0;
            while (i2 < definitionArr.length) {
                ExoTrackSelection.Definition definition = definitionArr[i2];
                if (definition != null) {
                    int[] iArr = definition.tracks;
                    if (iArr.length == 0) {
                        bandwidthMeter2 = bandwidthMeter;
                    } else {
                        if (iArr.length == 1) {
                            exoTrackSelectionCreateAdaptiveTrackSelection = new FixedTrackSelection(definition.group, iArr[0], definition.type);
                            bandwidthMeter2 = bandwidthMeter;
                        } else {
                            bandwidthMeter2 = bandwidthMeter;
                            exoTrackSelectionCreateAdaptiveTrackSelection = createAdaptiveTrackSelection(definition.group, iArr, definition.type, bandwidthMeter2, (nKK) adaptationCheckpoints.get(i2));
                        }
                        exoTrackSelectionArr[i2] = exoTrackSelectionCreateAdaptiveTrackSelection;
                    }
                }
                i2++;
                bandwidthMeter = bandwidthMeter2;
            }
            return exoTrackSelectionArr;
        }

        public Factory(int i2, int i3, int i5, float f3, float f4, Clock clock) {
            this(i2, i3, i5, 1279, 719, f3, f4, clock);
        }

        public Factory(int i2, int i3, int i5, int i7, int i8, float f3, float f4, Clock clock) {
            this.minDurationForQualityIncreaseMs = i2;
            this.maxDurationForQualityDecreaseMs = i3;
            this.minDurationToRetainAfterDiscardMs = i5;
            this.maxWidthToDiscard = i7;
            this.maxHeightToDiscard = i8;
            this.bandwidthFraction = f3;
            this.bufferedFractionToLiveEdgeForQualityIncrease = f4;
            this.clock = clock;
        }
    }

    public AdaptiveTrackSelection(TrackGroup trackGroup, int[] iArr, BandwidthMeter bandwidthMeter) {
        this(trackGroup, iArr, 0, bandwidthMeter, 10000L, 25000L, 25000L, 1279, 719, 0.7f, 0.75f, nKK.r(), Clock.DEFAULT);
    }

    private static long[][] getSortedTrackBitrates(ExoTrackSelection.Definition[] definitionArr) {
        long[][] jArr = new long[definitionArr.length][];
        for (int i2 = 0; i2 < definitionArr.length; i2++) {
            ExoTrackSelection.Definition definition = definitionArr[i2];
            if (definition == null) {
                jArr[i2] = new long[0];
            } else {
                jArr[i2] = new long[definition.tracks.length];
                int i3 = 0;
                while (true) {
                    if (i3 >= definition.tracks.length) {
                        break;
                    }
                    jArr[i2][i3] = definition.group.getFormat(r5[i3]).bitrate;
                    i3++;
                }
                Arrays.sort(jArr[i2]);
            }
        }
        return jArr;
    }

    protected boolean canSelectFormat(Format format, int i2, long j2) {
        return ((long) i2) <= j2;
    }

    @Override // com.google.android.exoplayer2.trackselection.BaseTrackSelection, com.google.android.exoplayer2.trackselection.ExoTrackSelection
    @CallSuper
    public void disable() {
        this.lastBufferEvaluationMediaChunk = null;
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    @Nullable
    public Object getSelectionData() {
        return null;
    }

    private static void addCheckpoint(List<nKK.j> list, long[] jArr) {
        long j2 = 0;
        for (long j3 : jArr) {
            j2 += j3;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            nKK.j jVar = list.get(i2);
            if (jVar != null) {
                jVar.n(new AdaptationCheckpoint(j2, jArr[i2]));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static nKK getAdaptationCheckpoints(ExoTrackSelection.Definition[] definitionArr) {
        ArrayList arrayList = new ArrayList();
        for (ExoTrackSelection.Definition definition : definitionArr) {
            if (definition == null || definition.tracks.length <= 1) {
                arrayList.add(null);
            } else {
                nKK.j jVarGh = nKK.gh();
                jVarGh.n(new AdaptationCheckpoint(0L, 0L));
                arrayList.add(jVarGh);
            }
        }
        long[][] sortedTrackBitrates = getSortedTrackBitrates(definitionArr);
        int[] iArr = new int[sortedTrackBitrates.length];
        long[] jArr = new long[sortedTrackBitrates.length];
        for (int i2 = 0; i2 < sortedTrackBitrates.length; i2++) {
            long[] jArr2 = sortedTrackBitrates[i2];
            jArr[i2] = jArr2.length == 0 ? 0L : jArr2[0];
        }
        addCheckpoint(arrayList, jArr);
        nKK switchOrder = getSwitchOrder(sortedTrackBitrates);
        for (int i3 = 0; i3 < switchOrder.size(); i3++) {
            int iIntValue = ((Integer) switchOrder.get(i3)).intValue();
            int i5 = iArr[iIntValue] + 1;
            iArr[iIntValue] = i5;
            jArr[iIntValue] = sortedTrackBitrates[iIntValue][i5];
            addCheckpoint(arrayList, jArr);
        }
        for (int i7 = 0; i7 < definitionArr.length; i7++) {
            if (arrayList.get(i7) != null) {
                jArr[i7] = jArr[i7] * 2;
            }
        }
        addCheckpoint(arrayList, jArr);
        nKK.j jVarGh2 = nKK.gh();
        for (int i8 = 0; i8 < arrayList.size(); i8++) {
            nKK.j jVar = (nKK.j) arrayList.get(i8);
            jVarGh2.n(jVar == null ? nKK.r() : jVar.gh());
        }
        return jVarGh2.gh();
    }

    private long getNextChunkDurationUs(MediaChunkIterator[] mediaChunkIteratorArr, List<? extends MediaChunk> list) {
        int i2 = this.selectedIndex;
        if (i2 < mediaChunkIteratorArr.length && mediaChunkIteratorArr[i2].next()) {
            MediaChunkIterator mediaChunkIterator = mediaChunkIteratorArr[this.selectedIndex];
            return mediaChunkIterator.getChunkEndTimeUs() - mediaChunkIterator.getChunkStartTimeUs();
        }
        for (MediaChunkIterator mediaChunkIterator2 : mediaChunkIteratorArr) {
            if (mediaChunkIterator2.next()) {
                return mediaChunkIterator2.getChunkEndTimeUs() - mediaChunkIterator2.getChunkStartTimeUs();
            }
        }
        return getLastChunkDurationUs(list);
    }

    private long getTotalAllocatableBandwidth(long j2) {
        long bitrateEstimate = (long) (this.bandwidthMeter.getBitrateEstimate() * this.bandwidthFraction);
        long timeToFirstByteEstimateUs = this.bandwidthMeter.getTimeToFirstByteEstimateUs();
        if (timeToFirstByteEstimateUs == -9223372036854775807L || j2 == -9223372036854775807L) {
            return (long) (bitrateEstimate / this.playbackSpeed);
        }
        float f3 = j2;
        return (long) ((bitrateEstimate * Math.max((f3 / this.playbackSpeed) - timeToFirstByteEstimateUs, 0.0f)) / f3);
    }

    @Override // com.google.android.exoplayer2.trackselection.BaseTrackSelection, com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public int evaluateQueueSize(long j2, List<? extends MediaChunk> list) {
        int i2;
        int i3;
        long jElapsedRealtime = this.clock.elapsedRealtime();
        if (!shouldEvaluateQueueSize(jElapsedRealtime, list)) {
            return list.size();
        }
        this.lastBufferEvaluationMs = jElapsedRealtime;
        this.lastBufferEvaluationMediaChunk = list.isEmpty() ? null : (MediaChunk) lej.nr(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long playoutDurationForMediaDuration = Util.getPlayoutDurationForMediaDuration(list.get(size - 1).startTimeUs - j2, this.playbackSpeed);
        long minDurationToRetainAfterDiscardUs = getMinDurationToRetainAfterDiscardUs();
        if (playoutDurationForMediaDuration >= minDurationToRetainAfterDiscardUs) {
            Format format = getFormat(determineIdealSelectedIndex(jElapsedRealtime, getLastChunkDurationUs(list)));
            for (int i5 = 0; i5 < size; i5++) {
                MediaChunk mediaChunk = list.get(i5);
                Format format2 = mediaChunk.trackFormat;
                if (Util.getPlayoutDurationForMediaDuration(mediaChunk.startTimeUs - j2, this.playbackSpeed) >= minDurationToRetainAfterDiscardUs && format2.bitrate < format.bitrate && (i2 = format2.height) != -1 && i2 <= this.maxHeightToDiscard && (i3 = format2.width) != -1 && i3 <= this.maxWidthToDiscard && i2 < format.height) {
                    return i5;
                }
            }
        }
        return size;
    }

    protected long getMinDurationToRetainAfterDiscardUs() {
        return this.minDurationToRetainAfterDiscardUs;
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public int getSelectedIndex() {
        return this.selectedIndex;
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public int getSelectionReason() {
        return this.reason;
    }

    @Override // com.google.android.exoplayer2.trackselection.BaseTrackSelection, com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public void onPlaybackSpeed(float f3) {
        this.playbackSpeed = f3;
    }

    protected boolean shouldEvaluateQueueSize(long j2, List<? extends MediaChunk> list) {
        long j3 = this.lastBufferEvaluationMs;
        if (j3 == -9223372036854775807L || j2 - j3 >= 1000) {
            return true;
        }
        return (list.isEmpty() || ((MediaChunk) lej.nr(list)).equals(this.lastBufferEvaluationMediaChunk)) ? false : true;
    }

    @Override // com.google.android.exoplayer2.trackselection.ExoTrackSelection
    public void updateSelectedTrack(long j2, long j3, long j4, List<? extends MediaChunk> list, MediaChunkIterator[] mediaChunkIteratorArr) {
        long jElapsedRealtime = this.clock.elapsedRealtime();
        long nextChunkDurationUs = getNextChunkDurationUs(mediaChunkIteratorArr, list);
        int i2 = this.reason;
        if (i2 == 0) {
            this.reason = 1;
            this.selectedIndex = determineIdealSelectedIndex(jElapsedRealtime, nextChunkDurationUs);
            return;
        }
        int i3 = this.selectedIndex;
        int iIndexOf = list.isEmpty() ? -1 : indexOf(((MediaChunk) lej.nr(list)).trackFormat);
        if (iIndexOf != -1) {
            i2 = ((MediaChunk) lej.nr(list)).trackSelectionReason;
            i3 = iIndexOf;
        }
        int iDetermineIdealSelectedIndex = determineIdealSelectedIndex(jElapsedRealtime, nextChunkDurationUs);
        if (!isBlacklisted(i3, jElapsedRealtime)) {
            Format format = getFormat(i3);
            Format format2 = getFormat(iDetermineIdealSelectedIndex);
            long jMinDurationForQualityIncreaseUs = minDurationForQualityIncreaseUs(j4, nextChunkDurationUs);
            int i5 = format2.bitrate;
            int i7 = format.bitrate;
            if ((i5 > i7 && j3 < jMinDurationForQualityIncreaseUs) || (i5 < i7 && j3 >= this.maxDurationForQualityDecreaseUs)) {
                iDetermineIdealSelectedIndex = i3;
            }
        }
        if (iDetermineIdealSelectedIndex != i3) {
            i2 = 3;
        }
        this.reason = i2;
        this.selectedIndex = iDetermineIdealSelectedIndex;
    }

    protected AdaptiveTrackSelection(TrackGroup trackGroup, int[] iArr, int i2, BandwidthMeter bandwidthMeter, long j2, long j3, long j4, int i3, int i5, float f3, float f4, List<AdaptationCheckpoint> list, Clock clock) {
        long j5;
        super(trackGroup, iArr, i2);
        if (j4 < j2) {
            Log.w(TAG, "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j5 = j2;
        } else {
            j5 = j4;
        }
        this.bandwidthMeter = bandwidthMeter;
        this.minDurationForQualityIncreaseUs = j2 * 1000;
        this.maxDurationForQualityDecreaseUs = j3 * 1000;
        this.minDurationToRetainAfterDiscardUs = j5 * 1000;
        this.maxWidthToDiscard = i3;
        this.maxHeightToDiscard = i5;
        this.bandwidthFraction = f3;
        this.bufferedFractionToLiveEdgeForQualityIncrease = f4;
        this.adaptationCheckpoints = nKK.ty(list);
        this.clock = clock;
        this.playbackSpeed = 1.0f;
        this.reason = 0;
        this.lastBufferEvaluationMs = -9223372036854775807L;
    }

    private int determineIdealSelectedIndex(long j2, long j3) {
        long allocatedBandwidth = getAllocatedBandwidth(j3);
        int i2 = 0;
        for (int i3 = 0; i3 < this.length; i3++) {
            if (j2 == Long.MIN_VALUE || !isBlacklisted(i3, j2)) {
                Format format = getFormat(i3);
                if (canSelectFormat(format, format.bitrate, allocatedBandwidth)) {
                    return i3;
                }
                i2 = i3;
            }
        }
        return i2;
    }

    private long getAllocatedBandwidth(long j2) {
        long totalAllocatableBandwidth = getTotalAllocatableBandwidth(j2);
        if (this.adaptationCheckpoints.isEmpty()) {
            return totalAllocatableBandwidth;
        }
        int i2 = 1;
        while (i2 < this.adaptationCheckpoints.size() - 1 && ((AdaptationCheckpoint) this.adaptationCheckpoints.get(i2)).totalBandwidth < totalAllocatableBandwidth) {
            i2++;
        }
        AdaptationCheckpoint adaptationCheckpoint = (AdaptationCheckpoint) this.adaptationCheckpoints.get(i2 - 1);
        AdaptationCheckpoint adaptationCheckpoint2 = (AdaptationCheckpoint) this.adaptationCheckpoints.get(i2);
        long j3 = adaptationCheckpoint.totalBandwidth;
        float f3 = (totalAllocatableBandwidth - j3) / (adaptationCheckpoint2.totalBandwidth - j3);
        return adaptationCheckpoint.allocatedBandwidth + ((long) (f3 * (adaptationCheckpoint2.allocatedBandwidth - r2)));
    }

    private long getLastChunkDurationUs(List<? extends MediaChunk> list) {
        if (list.isEmpty()) {
            return -9223372036854775807L;
        }
        MediaChunk mediaChunk = (MediaChunk) lej.nr(list);
        long j2 = mediaChunk.startTimeUs;
        if (j2 != -9223372036854775807L) {
            long j3 = mediaChunk.endTimeUs;
            if (j3 != -9223372036854775807L) {
                return j3 - j2;
            }
        }
        return -9223372036854775807L;
    }

    private static nKK getSwitchOrder(long[][] jArr) {
        double d2;
        M mO = h.t().n().O();
        for (int i2 = 0; i2 < jArr.length; i2++) {
            long[] jArr2 = jArr[i2];
            if (jArr2.length > 1) {
                int length = jArr2.length;
                double[] dArr = new double[length];
                int i3 = 0;
                while (true) {
                    long[] jArr3 = jArr[i2];
                    double dLog = 0.0d;
                    if (i3 >= jArr3.length) {
                        break;
                    }
                    long j2 = jArr3[i3];
                    if (j2 != -1) {
                        dLog = Math.log(j2);
                    }
                    dArr[i3] = dLog;
                    i3++;
                }
                int i5 = length - 1;
                double d4 = dArr[i5] - dArr[0];
                int i7 = 0;
                while (i7 < i5) {
                    double d5 = dArr[i7];
                    i7++;
                    double d6 = (d5 + dArr[i7]) * 0.5d;
                    if (d4 == 0.0d) {
                        d2 = 1.0d;
                    } else {
                        d2 = (d6 - dArr[0]) / d4;
                    }
                    mO.put(Double.valueOf(d2), Integer.valueOf(i2));
                }
            }
        }
        return nKK.ty(mO.values());
    }

    private long minDurationForQualityIncreaseUs(long j2, long j3) {
        if (j2 == -9223372036854775807L) {
            return this.minDurationForQualityIncreaseUs;
        }
        if (j3 != -9223372036854775807L) {
            j2 -= j3;
        }
        return Math.min((long) (j2 * this.bufferedFractionToLiveEdgeForQualityIncrease), this.minDurationForQualityIncreaseUs);
    }

    @Override // com.google.android.exoplayer2.trackselection.BaseTrackSelection, com.google.android.exoplayer2.trackselection.ExoTrackSelection
    @CallSuper
    public void enable() {
        this.lastBufferEvaluationMs = -9223372036854775807L;
        this.lastBufferEvaluationMediaChunk = null;
    }
}
