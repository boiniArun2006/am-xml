package androidx.media3.exoplayer.source;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.upstream.Allocator;
import com.google.common.collect.nKK;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@UnstableApi
public final class ConcatenatingMediaSource2 extends CompositeMediaSource<Integer> {
    private static final int MSG_UPDATE_TIMELINE = 1;

    @GuardedBy
    private MediaItem mediaItem;
    private final IdentityHashMap<MediaPeriod, MediaSourceHolder> mediaSourceByMediaPeriod;
    private final com.google.common.collect.nKK mediaSourceHolders;

    @Nullable
    private Handler playbackThreadHandler;
    private boolean timelineUpdateScheduled;

    public static final class Builder {
        private int index;

        @Nullable
        private MediaItem mediaItem;

        @Nullable
        private MediaSource.Factory mediaSourceFactory;
        private final nKK.j mediaSourceHoldersBuilder = com.google.common.collect.nKK.gh();

        public Builder add(MediaItem mediaItem) {
            return add(mediaItem, -9223372036854775807L);
        }

        public Builder add(MediaItem mediaItem, long j2) {
            Assertions.checkNotNull(mediaItem);
            if (j2 == -9223372036854775807L) {
                MediaItem.ClippingConfiguration clippingConfiguration = mediaItem.clippingConfiguration;
                if (clippingConfiguration.endPositionMs != Long.MIN_VALUE) {
                    j2 = Util.usToMs(clippingConfiguration.endPositionUs - clippingConfiguration.startPositionUs);
                }
            }
            Assertions.checkStateNotNull(this.mediaSourceFactory, "Must use useDefaultMediaSourceFactory or setMediaSourceFactory first.");
            return add(this.mediaSourceFactory.createMediaSource(mediaItem), j2);
        }

        public ConcatenatingMediaSource2 build() {
            Assertions.checkArgument(this.index > 0, "Must add at least one source to the concatenation.");
            if (this.mediaItem == null) {
                this.mediaItem = MediaItem.fromUri(Uri.EMPTY);
            }
            return new ConcatenatingMediaSource2(this.mediaItem, this.mediaSourceHoldersBuilder.gh());
        }

        public Builder setMediaItem(MediaItem mediaItem) {
            this.mediaItem = mediaItem;
            return this;
        }

        public Builder useDefaultMediaSourceFactory(Context context) {
            return setMediaSourceFactory(new DefaultMediaSourceFactory(context));
        }

        public Builder setMediaSourceFactory(MediaSource.Factory factory) {
            this.mediaSourceFactory = (MediaSource.Factory) Assertions.checkNotNull(factory);
            return this;
        }

        public Builder add(MediaSource mediaSource) {
            return add(mediaSource, -9223372036854775807L);
        }

        public Builder add(MediaSource mediaSource, long j2) {
            Assertions.checkNotNull(mediaSource);
            Assertions.checkState(((mediaSource instanceof ProgressiveMediaSource) && j2 == -9223372036854775807L) ? false : true, "Progressive media source must define an initial placeholder duration.");
            nKK.j jVar = this.mediaSourceHoldersBuilder;
            int i2 = this.index;
            this.index = i2 + 1;
            jVar.n(new MediaSourceHolder(mediaSource, i2, Util.msToUs(j2)));
            return this;
        }
    }

    private static final class ConcatenatedTimeline extends Timeline {
        private final long defaultPositionUs;
        private final long durationUs;
        private final com.google.common.collect.nKK firstPeriodIndices;
        private final boolean isDynamic;
        private final boolean isSeekable;

        @Nullable
        private final Object manifest;
        private final MediaItem mediaItem;
        private final com.google.common.collect.nKK periodOffsetsInWindowUs;
        private final com.google.common.collect.nKK timelines;

        @Override // androidx.media3.common.Timeline
        public int getWindowCount() {
            return 1;
        }

        private int getChildIndexByPeriodIndex(int i2) {
            return Util.binarySearchFloor((List<? extends Comparable<? super Integer>>) this.firstPeriodIndices, Integer.valueOf(i2 + 1), false, false);
        }

        private long getPeriodDurationUs(Timeline.Period period, int i2) {
            if (period.durationUs == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return (i2 == this.periodOffsetsInWindowUs.size() + (-1) ? this.durationUs : ((Long) this.periodOffsetsInWindowUs.get(i2 + 1)).longValue()) - ((Long) this.periodOffsetsInWindowUs.get(i2)).longValue();
        }

        @Override // androidx.media3.common.Timeline
        public int getIndexOfPeriod(Object obj) {
            if (!(obj instanceof Pair) || !(((Pair) obj).first instanceof Integer)) {
                return -1;
            }
            int childIndex = ConcatenatingMediaSource2.getChildIndex(obj);
            int indexOfPeriod = ((Timeline) this.timelines.get(childIndex)).getIndexOfPeriod(ConcatenatingMediaSource2.getChildPeriodUid(obj));
            if (indexOfPeriod == -1) {
                return -1;
            }
            return ((Integer) this.firstPeriodIndices.get(childIndex)).intValue() + indexOfPeriod;
        }

        @Override // androidx.media3.common.Timeline
        public int getPeriodCount() {
            return this.periodOffsetsInWindowUs.size();
        }

        @Override // androidx.media3.common.Timeline
        public Timeline.Window getWindow(int i2, Timeline.Window window, long j2) {
            return window.set(Timeline.Window.SINGLE_WINDOW_UID, this.mediaItem, this.manifest, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, this.isSeekable, this.isDynamic, null, this.defaultPositionUs, this.durationUs, 0, getPeriodCount() - 1, -((Long) this.periodOffsetsInWindowUs.get(0)).longValue());
        }

        public ConcatenatedTimeline(MediaItem mediaItem, com.google.common.collect.nKK nkk, com.google.common.collect.nKK nkk2, com.google.common.collect.nKK nkk3, boolean z2, boolean z3, long j2, long j3, @Nullable Object obj) {
            this.mediaItem = mediaItem;
            this.timelines = nkk;
            this.firstPeriodIndices = nkk2;
            this.periodOffsetsInWindowUs = nkk3;
            this.isSeekable = z2;
            this.isDynamic = z3;
            this.durationUs = j2;
            this.defaultPositionUs = j3;
            this.manifest = obj;
        }

        @Override // androidx.media3.common.Timeline
        public Timeline.Period getPeriod(int i2, Timeline.Period period, boolean z2) {
            int childIndexByPeriodIndex = getChildIndexByPeriodIndex(i2);
            ((Timeline) this.timelines.get(childIndexByPeriodIndex)).getPeriod(i2 - ((Integer) this.firstPeriodIndices.get(childIndexByPeriodIndex)).intValue(), period, z2);
            period.windowIndex = 0;
            period.positionInWindowUs = ((Long) this.periodOffsetsInWindowUs.get(i2)).longValue();
            period.durationUs = getPeriodDurationUs(period, i2);
            if (z2) {
                period.uid = ConcatenatingMediaSource2.getPeriodUid(childIndexByPeriodIndex, Assertions.checkNotNull(period.uid));
            }
            return period;
        }

        @Override // androidx.media3.common.Timeline
        public Timeline.Period getPeriodByUid(Object obj, Timeline.Period period) {
            int childIndex = ConcatenatingMediaSource2.getChildIndex(obj);
            Object childPeriodUid = ConcatenatingMediaSource2.getChildPeriodUid(obj);
            Timeline timeline = (Timeline) this.timelines.get(childIndex);
            int iIntValue = ((Integer) this.firstPeriodIndices.get(childIndex)).intValue() + timeline.getIndexOfPeriod(childPeriodUid);
            timeline.getPeriodByUid(childPeriodUid, period);
            period.windowIndex = 0;
            period.positionInWindowUs = ((Long) this.periodOffsetsInWindowUs.get(iIntValue)).longValue();
            period.durationUs = getPeriodDurationUs(period, iIntValue);
            period.uid = obj;
            return period;
        }

        @Override // androidx.media3.common.Timeline
        public Object getUidOfPeriod(int i2) {
            int childIndexByPeriodIndex = getChildIndexByPeriodIndex(i2);
            return ConcatenatingMediaSource2.getPeriodUid(childIndexByPeriodIndex, ((Timeline) this.timelines.get(childIndexByPeriodIndex)).getUidOfPeriod(i2 - ((Integer) this.firstPeriodIndices.get(childIndexByPeriodIndex)).intValue()));
        }
    }

    private void disableUnusedMediaSources() {
        for (int i2 = 0; i2 < this.mediaSourceHolders.size(); i2++) {
            MediaSourceHolder mediaSourceHolder = (MediaSourceHolder) this.mediaSourceHolders.get(i2);
            if (mediaSourceHolder.activeMediaPeriods == 0) {
                disableChildSource(Integer.valueOf(mediaSourceHolder.index));
            }
        }
    }

    private static int getChildIndexFromChildWindowSequenceNumber(long j2, int i2) {
        return (int) (j2 % ((long) i2));
    }

    private static long getChildWindowSequenceNumber(long j2, int i2, int i3) {
        return (j2 * ((long) i2)) + ((long) i3);
    }

    private static long getWindowSequenceNumberFromChildWindowSequenceNumber(long j2, int i2) {
        return j2 / ((long) i2);
    }

    private void updateTimeline() {
        this.timelineUpdateScheduled = false;
        ConcatenatedTimeline concatenatedTimelineMaybeCreateConcatenatedTimeline = maybeCreateConcatenatedTimeline();
        if (concatenatedTimelineMaybeCreateConcatenatedTimeline != null) {
            refreshSourceInfo(concatenatedTimelineMaybeCreateConcatenatedTimeline);
        }
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public boolean canUpdateMediaItem(MediaItem mediaItem) {
        return true;
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    protected void enableInternal() {
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public synchronized MediaItem getMediaItem() {
        return this.mediaItem;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public int getWindowIndexForChildWindowIndex(Integer num, int i2) {
        return 0;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public synchronized void updateMediaItem(MediaItem mediaItem) {
        this.mediaItem = mediaItem;
    }

    static final class MediaSourceHolder {
        public int activeMediaPeriods;
        public final int index;
        public final long initialPlaceholderDurationUs;
        public final MaskingMediaSource mediaSource;
        public final HashMap<Object, Long> periodTimeOffsetsByUid = new HashMap<>();

        public MediaSourceHolder(MediaSource mediaSource, int i2, long j2) {
            this.mediaSource = new MaskingMediaSource(mediaSource, false);
            this.index = i2;
            this.initialPlaceholderDurationUs = j2;
        }
    }

    private ConcatenatingMediaSource2(MediaItem mediaItem, com.google.common.collect.nKK nkk) {
        this.mediaItem = mediaItem;
        this.mediaSourceHolders = nkk;
        this.mediaSourceByMediaPeriod = new IdentityHashMap<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getChildIndex(Object obj) {
        return ((Integer) ((Pair) obj).first).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object getChildPeriodUid(Object obj) {
        return ((Pair) obj).second;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean handleMessage(Message message) {
        if (message.what == 1) {
            updateTimeline();
        }
        return true;
    }

    @Nullable
    private ConcatenatedTimeline maybeCreateConcatenatedTimeline() {
        nKK.j jVar;
        nKK.j jVar2;
        int i2;
        long j2;
        long j3;
        Timeline.Window window;
        boolean z2;
        ConcatenatingMediaSource2 concatenatingMediaSource2 = this;
        Timeline.Window window2 = new Timeline.Window();
        Timeline.Period period = new Timeline.Period();
        nKK.j jVarGh = com.google.common.collect.nKK.gh();
        nKK.j jVarGh2 = com.google.common.collect.nKK.gh();
        nKK.j jVarGh3 = com.google.common.collect.nKK.gh();
        int size = concatenatingMediaSource2.mediaSourceHolders.size();
        boolean z3 = true;
        boolean z4 = true;
        boolean z5 = true;
        int i3 = 0;
        Object obj = null;
        int periodCount = 0;
        boolean z6 = false;
        boolean z7 = false;
        long j4 = 0;
        long j5 = 0;
        long j6 = 0;
        while (i3 < size) {
            MediaSourceHolder mediaSourceHolder = (MediaSourceHolder) concatenatingMediaSource2.mediaSourceHolders.get(i3);
            Timeline timeline = mediaSourceHolder.mediaSource.getTimeline();
            Assertions.checkArgument(timeline.isEmpty() ^ z3, "Can't concatenate empty child Timeline.");
            jVarGh.n(timeline);
            jVarGh2.n(Integer.valueOf(periodCount));
            periodCount += timeline.getPeriodCount();
            int i5 = 0;
            while (i5 < timeline.getWindowCount()) {
                timeline.getWindow(i5, window2);
                if (!z6) {
                    z6 = z3;
                    obj = window2.manifest;
                }
                z4 = (z4 && Objects.equals(obj, window2.manifest)) ? z3 : false;
                Timeline timeline2 = timeline;
                long j7 = window2.durationUs;
                if (j7 == -9223372036854775807L) {
                    j7 = mediaSourceHolder.initialPlaceholderDurationUs;
                    if (j7 == -9223372036854775807L) {
                        return null;
                    }
                }
                j4 += j7;
                if (mediaSourceHolder.index == 0 && i5 == 0) {
                    jVar = jVarGh;
                    jVar2 = jVarGh2;
                    j5 = window2.defaultPositionUs;
                    j6 = -window2.positionInFirstPeriodUs;
                } else {
                    jVar = jVarGh;
                    jVar2 = jVarGh2;
                }
                z5 &= window2.isSeekable || window2.isPlaceholder;
                z7 |= window2.isDynamic;
                int i7 = window2.firstPeriodIndex;
                while (i7 <= window2.lastPeriodIndex) {
                    jVarGh3.n(Long.valueOf(j6));
                    Timeline timeline3 = timeline2;
                    timeline3.getPeriod(i7, period, true);
                    nKK.j jVar3 = jVarGh3;
                    long j9 = period.durationUs;
                    if (j9 == -9223372036854775807L) {
                        Assertions.checkArgument(window2.firstPeriodIndex == window2.lastPeriodIndex, "Can't apply placeholder duration to multiple periods with unknown duration in a single window.");
                        j9 = window2.positionInFirstPeriodUs + j7;
                    }
                    if (i7 != window2.firstPeriodIndex || ((mediaSourceHolder.index == 0 && i5 == 0) || j9 == -9223372036854775807L)) {
                        i2 = i7;
                        j2 = j9;
                        j3 = 0;
                    } else {
                        i2 = i7;
                        j3 = -window2.positionInFirstPeriodUs;
                        j2 = j9 + j3;
                    }
                    Object objCheckNotNull = Assertions.checkNotNull(period.uid);
                    int i8 = i2;
                    if (mediaSourceHolder.activeMediaPeriods == 0 || !mediaSourceHolder.periodTimeOffsetsByUid.containsKey(objCheckNotNull)) {
                        window = window2;
                    } else {
                        window = window2;
                        if (!mediaSourceHolder.periodTimeOffsetsByUid.get(objCheckNotNull).equals(Long.valueOf(j3))) {
                            z2 = false;
                        }
                        Assertions.checkArgument(z2, "Can't handle windows with changing offset in first period.");
                        mediaSourceHolder.periodTimeOffsetsByUid.put(objCheckNotNull, Long.valueOf(j3));
                        j6 += j2;
                        i7 = i8 + 1;
                        jVarGh3 = jVar3;
                        timeline2 = timeline3;
                        window2 = window;
                    }
                    z2 = true;
                    Assertions.checkArgument(z2, "Can't handle windows with changing offset in first period.");
                    mediaSourceHolder.periodTimeOffsetsByUid.put(objCheckNotNull, Long.valueOf(j3));
                    j6 += j2;
                    i7 = i8 + 1;
                    jVarGh3 = jVar3;
                    timeline2 = timeline3;
                    window2 = window;
                }
                i5++;
                jVarGh = jVar;
                jVarGh2 = jVar2;
                timeline = timeline2;
                z3 = true;
            }
            i3++;
            concatenatingMediaSource2 = this;
            z3 = true;
        }
        return new ConcatenatedTimeline(getMediaItem(), jVarGh.gh(), jVarGh2.gh(), jVarGh3.gh(), z5, z7, j4, j5, z4 ? obj : null);
    }

    private void scheduleTimelineUpdate() {
        if (this.timelineUpdateScheduled) {
            return;
        }
        ((Handler) Assertions.checkNotNull(this.playbackThreadHandler)).obtainMessage(1).sendToTarget();
        this.timelineUpdateScheduled = true;
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public MediaPeriod createPeriod(MediaSource.MediaPeriodId mediaPeriodId, Allocator allocator, long j2) {
        MediaSourceHolder mediaSourceHolder = (MediaSourceHolder) this.mediaSourceHolders.get(getChildIndex(mediaPeriodId.periodUid));
        MediaSource.MediaPeriodId mediaPeriodIdCopyWithWindowSequenceNumber = mediaPeriodId.copyWithPeriodUid(getChildPeriodUid(mediaPeriodId.periodUid)).copyWithWindowSequenceNumber(getChildWindowSequenceNumber(mediaPeriodId.windowSequenceNumber, this.mediaSourceHolders.size(), mediaSourceHolder.index));
        enableChildSource(Integer.valueOf(mediaSourceHolder.index));
        mediaSourceHolder.activeMediaPeriods++;
        long jLongValue = mediaPeriodId.isAd() ? 0L : ((Long) Assertions.checkNotNull(mediaSourceHolder.periodTimeOffsetsByUid.get(mediaPeriodIdCopyWithWindowSequenceNumber.periodUid))).longValue();
        TimeOffsetMediaPeriod timeOffsetMediaPeriod = new TimeOffsetMediaPeriod(mediaSourceHolder.mediaSource.createPeriod(mediaPeriodIdCopyWithWindowSequenceNumber, allocator, j2 - jLongValue), jLongValue);
        this.mediaSourceByMediaPeriod.put(timeOffsetMediaPeriod, mediaSourceHolder);
        disableUnusedMediaSources();
        return timeOffsetMediaPeriod;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    @Nullable
    public MediaSource.MediaPeriodId getMediaPeriodIdForChildMediaPeriodId(Integer num, MediaSource.MediaPeriodId mediaPeriodId) {
        if (num.intValue() != getChildIndexFromChildWindowSequenceNumber(mediaPeriodId.windowSequenceNumber, this.mediaSourceHolders.size())) {
            return null;
        }
        return mediaPeriodId.copyWithPeriodUid(getPeriodUid(num.intValue(), mediaPeriodId.periodUid)).copyWithWindowSequenceNumber(getWindowSequenceNumberFromChildWindowSequenceNumber(mediaPeriodId.windowSequenceNumber, this.mediaSourceHolders.size()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public long getMediaTimeForChildMediaTime(Integer num, long j2, @Nullable MediaSource.MediaPeriodId mediaPeriodId) {
        Long l2;
        return (j2 == -9223372036854775807L || mediaPeriodId == null || mediaPeriodId.isAd() || (l2 = ((MediaSourceHolder) this.mediaSourceHolders.get(num.intValue())).periodTimeOffsetsByUid.get(mediaPeriodId.periodUid)) == null) ? j2 : j2 + Util.usToMs(l2.longValue());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.media3.exoplayer.source.CompositeMediaSource
    public void onChildSourceInfoRefreshed(Integer num, MediaSource mediaSource, Timeline timeline) {
        scheduleTimelineUpdate();
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    public void releasePeriod(MediaPeriod mediaPeriod) {
        ((MediaSourceHolder) Assertions.checkNotNull(this.mediaSourceByMediaPeriod.remove(mediaPeriod))).mediaSource.releasePeriod(((TimeOffsetMediaPeriod) mediaPeriod).getWrappedMediaPeriod());
        r0.activeMediaPeriods--;
        if (this.mediaSourceByMediaPeriod.isEmpty()) {
            return;
        }
        disableUnusedMediaSources();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object getPeriodUid(int i2, Object obj) {
        return Pair.create(Integer.valueOf(i2), obj);
    }

    @Override // androidx.media3.exoplayer.source.MediaSource
    @Nullable
    public Timeline getInitialTimeline() {
        return maybeCreateConcatenatedTimeline();
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    protected void prepareSourceInternal(@Nullable TransferListener transferListener) {
        super.prepareSourceInternal(transferListener);
        this.playbackThreadHandler = new Handler(new Handler.Callback() { // from class: androidx.media3.exoplayer.source.Ml
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f39720n.handleMessage(message);
            }
        });
        for (int i2 = 0; i2 < this.mediaSourceHolders.size(); i2++) {
            prepareChildSource(Integer.valueOf(i2), ((MediaSourceHolder) this.mediaSourceHolders.get(i2)).mediaSource);
        }
        scheduleTimelineUpdate();
    }

    @Override // androidx.media3.exoplayer.source.CompositeMediaSource, androidx.media3.exoplayer.source.BaseMediaSource
    protected void releaseSourceInternal() {
        super.releaseSourceInternal();
        Handler handler = this.playbackThreadHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.playbackThreadHandler = null;
        }
        this.timelineUpdateScheduled = false;
    }
}
