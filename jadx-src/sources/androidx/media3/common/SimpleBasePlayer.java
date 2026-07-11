package androidx.media3.common;

import android.graphics.Rect;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.Player;
import androidx.media3.common.SimpleBasePlayer;
import androidx.media3.common.Timeline;
import androidx.media3.common.Tracks;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.HandlerWrapper;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.common.util.Size;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import com.google.common.collect.nKK;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@UnstableApi
public abstract class SimpleBasePlayer extends BasePlayer {
    private static final long POSITION_DISCONTINUITY_THRESHOLD_MS = 1000;
    private final HandlerWrapper applicationHandler;
    private final Looper applicationLooper;
    private final ListenerSet<Player.Listener> listeners;
    private final HashSet<com.google.common.util.concurrent.Xo> pendingOperations;
    private final Timeline.Period period;
    private boolean released;
    private State state;

    protected static final class LivePositionSupplier implements PositionSupplier {
        private long finalValue = -9223372036854775807L;
        private final PositionSupplier livePosition;

        public void disconnect(long j2) {
            this.finalValue = j2;
        }

        @Override // androidx.media3.common.SimpleBasePlayer.PositionSupplier
        public long get() {
            long j2 = this.finalValue;
            return j2 != -9223372036854775807L ? j2 : this.livePosition.get();
        }

        public LivePositionSupplier(PositionSupplier positionSupplier) {
            this.livePosition = positionSupplier;
        }
    }

    protected static final class MediaItemData {
        public final long defaultPositionUs;
        public final long durationUs;
        public final long elapsedRealtimeEpochOffsetMs;
        public final boolean isDynamic;
        public final boolean isPlaceholder;
        public final boolean isSeekable;

        @Nullable
        public final MediaItem.LiveConfiguration liveConfiguration;

        @Nullable
        public final Object manifest;
        public final MediaItem mediaItem;

        @Nullable
        public final MediaMetadata mediaMetadata;
        private final long[] periodPositionInWindowUs;
        public final com.google.common.collect.nKK periods;
        public final long positionInFirstPeriodUs;
        public final long presentationStartTimeMs;
        public final Tracks tracks;
        public final Object uid;
        public final long windowStartTimeMs;

        public static final class Builder {
            private long defaultPositionUs;
            private long durationUs;
            private long elapsedRealtimeEpochOffsetMs;
            private boolean isDynamic;
            private boolean isPlaceholder;
            private boolean isSeekable;

            @Nullable
            private MediaItem.LiveConfiguration liveConfiguration;

            @Nullable
            private Object manifest;
            private MediaItem mediaItem;

            @Nullable
            private MediaMetadata mediaMetadata;
            private com.google.common.collect.nKK periods;
            private long positionInFirstPeriodUs;
            private long presentationStartTimeMs;
            private Tracks tracks;
            private Object uid;
            private long windowStartTimeMs;

            public Builder(Object obj) {
                this.uid = obj;
                this.tracks = Tracks.EMPTY;
                this.mediaItem = MediaItem.EMPTY;
                this.mediaMetadata = null;
                this.manifest = null;
                this.liveConfiguration = null;
                this.presentationStartTimeMs = -9223372036854775807L;
                this.windowStartTimeMs = -9223372036854775807L;
                this.elapsedRealtimeEpochOffsetMs = -9223372036854775807L;
                this.isSeekable = false;
                this.isDynamic = false;
                this.defaultPositionUs = 0L;
                this.durationUs = -9223372036854775807L;
                this.positionInFirstPeriodUs = 0L;
                this.isPlaceholder = false;
                this.periods = com.google.common.collect.nKK.r();
            }

            public MediaItemData build() {
                return new MediaItemData(this);
            }

            public Builder setDefaultPositionUs(long j2) {
                Assertions.checkArgument(j2 >= 0);
                this.defaultPositionUs = j2;
                return this;
            }

            public Builder setElapsedRealtimeEpochOffsetMs(long j2) {
                this.elapsedRealtimeEpochOffsetMs = j2;
                return this;
            }

            public Builder setIsDynamic(boolean z2) {
                this.isDynamic = z2;
                return this;
            }

            public Builder setIsPlaceholder(boolean z2) {
                this.isPlaceholder = z2;
                return this;
            }

            public Builder setIsSeekable(boolean z2) {
                this.isSeekable = z2;
                return this;
            }

            public Builder setLiveConfiguration(@Nullable MediaItem.LiveConfiguration liveConfiguration) {
                this.liveConfiguration = liveConfiguration;
                return this;
            }

            public Builder setManifest(@Nullable Object obj) {
                this.manifest = obj;
                return this;
            }

            public Builder setMediaItem(MediaItem mediaItem) {
                this.mediaItem = mediaItem;
                return this;
            }

            public Builder setMediaMetadata(@Nullable MediaMetadata mediaMetadata) {
                this.mediaMetadata = mediaMetadata;
                return this;
            }

            public Builder setPositionInFirstPeriodUs(long j2) {
                Assertions.checkArgument(j2 >= 0);
                this.positionInFirstPeriodUs = j2;
                return this;
            }

            public Builder setPresentationStartTimeMs(long j2) {
                this.presentationStartTimeMs = j2;
                return this;
            }

            public Builder setTracks(Tracks tracks) {
                this.tracks = tracks;
                return this;
            }

            public Builder setUid(Object obj) {
                this.uid = obj;
                return this;
            }

            public Builder setWindowStartTimeMs(long j2) {
                this.windowStartTimeMs = j2;
                return this;
            }

            public Builder setPeriods(List<PeriodData> list) {
                boolean z2;
                int size = list.size();
                int i2 = 0;
                while (i2 < size - 1) {
                    if (list.get(i2).durationUs != -9223372036854775807L) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    Assertions.checkArgument(z2, "Periods other than last need a duration");
                    int i3 = i2 + 1;
                    for (int i5 = i3; i5 < size; i5++) {
                        Assertions.checkArgument(!list.get(i2).uid.equals(list.get(i5).uid), "Duplicate PeriodData UIDs in period list");
                    }
                    i2 = i3;
                }
                this.periods = com.google.common.collect.nKK.ty(list);
                return this;
            }

            public Builder setDurationUs(long j2) {
                boolean z2;
                if (j2 != -9223372036854775807L && j2 < 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                Assertions.checkArgument(z2);
                this.durationUs = j2;
                return this;
            }

            private Builder(MediaItemData mediaItemData) {
                this.uid = mediaItemData.uid;
                this.tracks = mediaItemData.tracks;
                this.mediaItem = mediaItemData.mediaItem;
                this.mediaMetadata = mediaItemData.mediaMetadata;
                this.manifest = mediaItemData.manifest;
                this.liveConfiguration = mediaItemData.liveConfiguration;
                this.presentationStartTimeMs = mediaItemData.presentationStartTimeMs;
                this.windowStartTimeMs = mediaItemData.windowStartTimeMs;
                this.elapsedRealtimeEpochOffsetMs = mediaItemData.elapsedRealtimeEpochOffsetMs;
                this.isSeekable = mediaItemData.isSeekable;
                this.isDynamic = mediaItemData.isDynamic;
                this.defaultPositionUs = mediaItemData.defaultPositionUs;
                this.durationUs = mediaItemData.durationUs;
                this.positionInFirstPeriodUs = mediaItemData.positionInFirstPeriodUs;
                this.isPlaceholder = mediaItemData.isPlaceholder;
                this.periods = mediaItemData.periods;
            }
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MediaItemData)) {
                return false;
            }
            MediaItemData mediaItemData = (MediaItemData) obj;
            return this.uid.equals(mediaItemData.uid) && this.tracks.equals(mediaItemData.tracks) && this.mediaItem.equals(mediaItemData.mediaItem) && Objects.equals(this.mediaMetadata, mediaItemData.mediaMetadata) && Objects.equals(this.manifest, mediaItemData.manifest) && Objects.equals(this.liveConfiguration, mediaItemData.liveConfiguration) && this.presentationStartTimeMs == mediaItemData.presentationStartTimeMs && this.windowStartTimeMs == mediaItemData.windowStartTimeMs && this.elapsedRealtimeEpochOffsetMs == mediaItemData.elapsedRealtimeEpochOffsetMs && this.isSeekable == mediaItemData.isSeekable && this.isDynamic == mediaItemData.isDynamic && this.defaultPositionUs == mediaItemData.defaultPositionUs && this.durationUs == mediaItemData.durationUs && this.positionInFirstPeriodUs == mediaItemData.positionInFirstPeriodUs && this.isPlaceholder == mediaItemData.isPlaceholder && this.periods.equals(mediaItemData.periods);
        }

        private MediaItemData(Builder builder) {
            int i2 = 0;
            if (builder.liveConfiguration == null) {
                Assertions.checkArgument(builder.presentationStartTimeMs == -9223372036854775807L, "presentationStartTimeMs can only be set if liveConfiguration != null");
                Assertions.checkArgument(builder.windowStartTimeMs == -9223372036854775807L, "windowStartTimeMs can only be set if liveConfiguration != null");
                Assertions.checkArgument(builder.elapsedRealtimeEpochOffsetMs == -9223372036854775807L, "elapsedRealtimeEpochOffsetMs can only be set if liveConfiguration != null");
            } else if (builder.presentationStartTimeMs != -9223372036854775807L && builder.windowStartTimeMs != -9223372036854775807L) {
                Assertions.checkArgument(builder.windowStartTimeMs >= builder.presentationStartTimeMs, "windowStartTimeMs can't be less than presentationStartTimeMs");
            }
            int size = builder.periods.size();
            if (builder.durationUs != -9223372036854775807L) {
                Assertions.checkArgument(builder.defaultPositionUs <= builder.durationUs, "defaultPositionUs can't be greater than durationUs");
            }
            this.uid = builder.uid;
            this.tracks = builder.tracks;
            this.mediaItem = builder.mediaItem;
            this.mediaMetadata = builder.mediaMetadata;
            this.manifest = builder.manifest;
            this.liveConfiguration = builder.liveConfiguration;
            this.presentationStartTimeMs = builder.presentationStartTimeMs;
            this.windowStartTimeMs = builder.windowStartTimeMs;
            this.elapsedRealtimeEpochOffsetMs = builder.elapsedRealtimeEpochOffsetMs;
            this.isSeekable = builder.isSeekable;
            this.isDynamic = builder.isDynamic;
            this.defaultPositionUs = builder.defaultPositionUs;
            this.durationUs = builder.durationUs;
            long j2 = builder.positionInFirstPeriodUs;
            this.positionInFirstPeriodUs = j2;
            this.isPlaceholder = builder.isPlaceholder;
            com.google.common.collect.nKK nkk = builder.periods;
            this.periods = nkk;
            long[] jArr = new long[nkk.size()];
            this.periodPositionInWindowUs = jArr;
            if (nkk.isEmpty()) {
                return;
            }
            jArr[0] = -j2;
            while (i2 < size - 1) {
                long[] jArr2 = this.periodPositionInWindowUs;
                int i3 = i2 + 1;
                jArr2[i3] = jArr2[i2] + ((PeriodData) this.periods.get(i2)).durationUs;
                i2 = i3;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Timeline.Period getPeriod(int i2, int i3, Timeline.Period period) {
            if (this.periods.isEmpty()) {
                Object obj = this.uid;
                period.set(obj, obj, i2, this.positionInFirstPeriodUs + this.durationUs, 0L, AdPlaybackState.NONE, this.isPlaceholder);
                return period;
            }
            PeriodData periodData = (PeriodData) this.periods.get(i3);
            Object obj2 = periodData.uid;
            period.set(obj2, Pair.create(this.uid, obj2), i2, periodData.durationUs, this.periodPositionInWindowUs[i3], periodData.adPlaybackState, periodData.isPlaceholder);
            return period;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object getPeriodUid(int i2) {
            if (this.periods.isEmpty()) {
                return this.uid;
            }
            return Pair.create(this.uid, ((PeriodData) this.periods.get(i2)).uid);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Timeline.Window getWindow(int i2, Timeline.Window window) {
            int size;
            boolean z2;
            if (this.periods.isEmpty()) {
                size = 1;
                z2 = true;
            } else {
                size = this.periods.size();
                z2 = true;
            }
            window.set(this.uid, this.mediaItem, this.manifest, this.presentationStartTimeMs, this.windowStartTimeMs, this.elapsedRealtimeEpochOffsetMs, this.isSeekable, this.isDynamic, this.liveConfiguration, this.defaultPositionUs, this.durationUs, i2, (i2 + size) - 1, this.positionInFirstPeriodUs);
            window.isPlaceholder = this.isPlaceholder;
            return window;
        }

        public Builder buildUpon() {
            return new Builder();
        }

        public int hashCode() {
            int iHashCode = (((((Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE + this.uid.hashCode()) * 31) + this.tracks.hashCode()) * 31) + this.mediaItem.hashCode()) * 31;
            MediaMetadata mediaMetadata = this.mediaMetadata;
            int iHashCode2 = (iHashCode + (mediaMetadata == null ? 0 : mediaMetadata.hashCode())) * 31;
            Object obj = this.manifest;
            int iHashCode3 = (iHashCode2 + (obj == null ? 0 : obj.hashCode())) * 31;
            MediaItem.LiveConfiguration liveConfiguration = this.liveConfiguration;
            int iHashCode4 = (iHashCode3 + (liveConfiguration != null ? liveConfiguration.hashCode() : 0)) * 31;
            long j2 = this.presentationStartTimeMs;
            int i2 = (iHashCode4 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.windowStartTimeMs;
            int i3 = (i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
            long j4 = this.elapsedRealtimeEpochOffsetMs;
            int i5 = (((((i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31) + (this.isSeekable ? 1 : 0)) * 31) + (this.isDynamic ? 1 : 0)) * 31;
            long j5 = this.defaultPositionUs;
            int i7 = (i5 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
            long j6 = this.durationUs;
            int i8 = (i7 + ((int) (j6 ^ (j6 >>> 32)))) * 31;
            long j7 = this.positionInFirstPeriodUs;
            return ((((i8 + ((int) (j7 ^ (j7 >>> 32)))) * 31) + (this.isPlaceholder ? 1 : 0)) * 31) + this.periods.hashCode();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static MediaItemData buildFromState(State state, int i2, Timeline.Period period, Timeline.Window window) {
            boolean z2;
            MediaMetadata mediaMetadata;
            Tracks tracks;
            if (SimpleBasePlayer.getCurrentMediaItemIndexInternal(state) == i2) {
                z2 = true;
            } else {
                z2 = false;
            }
            state.timeline.getWindow(i2, window);
            nKK.j jVarGh = com.google.common.collect.nKK.gh();
            for (int i3 = window.firstPeriodIndex; i3 <= window.lastPeriodIndex; i3++) {
                state.timeline.getPeriod(i3, period, true);
                jVarGh.n(new PeriodData.Builder(Assertions.checkNotNull(period.uid)).setAdPlaybackState(period.adPlaybackState).setDurationUs(period.durationUs).setIsPlaceholder(period.isPlaceholder).build());
            }
            Builder mediaItem = new Builder(window.uid).setDefaultPositionUs(window.defaultPositionUs).setDurationUs(window.durationUs).setElapsedRealtimeEpochOffsetMs(window.elapsedRealtimeEpochOffsetMs).setIsDynamic(window.isDynamic).setIsPlaceholder(window.isPlaceholder).setIsSeekable(window.isSeekable).setLiveConfiguration(window.liveConfiguration).setManifest(window.manifest).setMediaItem(window.mediaItem);
            if (z2) {
                mediaMetadata = state.currentMetadata;
            } else {
                mediaMetadata = null;
            }
            Builder presentationStartTimeMs = mediaItem.setMediaMetadata(mediaMetadata).setPeriods(jVarGh.gh()).setPositionInFirstPeriodUs(window.positionInFirstPeriodUs).setPresentationStartTimeMs(window.presentationStartTimeMs);
            if (z2) {
                tracks = state.currentTracks;
            } else {
                tracks = Tracks.EMPTY;
            }
            return presentationStartTimeMs.setTracks(tracks).setWindowStartTimeMs(window.windowStartTimeMs).build();
        }
    }

    protected static final class PeriodData {
        public final AdPlaybackState adPlaybackState;
        public final long durationUs;
        public final boolean isPlaceholder;
        public final Object uid;

        public static final class Builder {
            private AdPlaybackState adPlaybackState;
            private long durationUs;
            private boolean isPlaceholder;
            private Object uid;

            public Builder(Object obj) {
                this.uid = obj;
                this.durationUs = 0L;
                this.adPlaybackState = AdPlaybackState.NONE;
                this.isPlaceholder = false;
            }

            public PeriodData build() {
                return new PeriodData(this);
            }

            public Builder setAdPlaybackState(AdPlaybackState adPlaybackState) {
                this.adPlaybackState = adPlaybackState;
                return this;
            }

            public Builder setIsPlaceholder(boolean z2) {
                this.isPlaceholder = z2;
                return this;
            }

            public Builder setUid(Object obj) {
                this.uid = obj;
                return this;
            }

            public Builder setDurationUs(long j2) {
                boolean z2;
                if (j2 != -9223372036854775807L && j2 < 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                Assertions.checkArgument(z2);
                this.durationUs = j2;
                return this;
            }

            private Builder(PeriodData periodData) {
                this.uid = periodData.uid;
                this.durationUs = periodData.durationUs;
                this.adPlaybackState = periodData.adPlaybackState;
                this.isPlaceholder = periodData.isPlaceholder;
            }
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PeriodData)) {
                return false;
            }
            PeriodData periodData = (PeriodData) obj;
            return this.uid.equals(periodData.uid) && this.durationUs == periodData.durationUs && this.adPlaybackState.equals(periodData.adPlaybackState) && this.isPlaceholder == periodData.isPlaceholder;
        }

        private PeriodData(Builder builder) {
            this.uid = builder.uid;
            this.durationUs = builder.durationUs;
            this.adPlaybackState = builder.adPlaybackState;
            this.isPlaceholder = builder.isPlaceholder;
        }

        public Builder buildUpon() {
            return new Builder();
        }

        public int hashCode() {
            int iHashCode = (Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE + this.uid.hashCode()) * 31;
            long j2 = this.durationUs;
            return ((((iHashCode + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.adPlaybackState.hashCode()) * 31) + (this.isPlaceholder ? 1 : 0);
        }
    }

    private static final class PlaceholderUid {
        private PlaceholderUid() {
        }
    }

    private static final class PlaylistTimeline extends Timeline {
        private final int[] firstPeriodIndexByWindowIndex;
        private final HashMap<Object, Integer> periodIndexByUid;
        private final com.google.common.collect.nKK playlist;
        private final int[] windowIndexByPeriodIndex;

        private static int getPeriodCountInMediaItem(MediaItemData mediaItemData) {
            if (mediaItemData.periods.isEmpty()) {
                return 1;
            }
            return mediaItemData.periods.size();
        }

        @Override // androidx.media3.common.Timeline
        public int getIndexOfPeriod(Object obj) {
            Integer num = this.periodIndexByUid.get(obj);
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }

        @Override // androidx.media3.common.Timeline
        public Timeline.Period getPeriod(int i2, Timeline.Period period, boolean z2) {
            int i3 = this.windowIndexByPeriodIndex[i2];
            return ((MediaItemData) this.playlist.get(i3)).getPeriod(i3, i2 - this.firstPeriodIndexByWindowIndex[i3], period);
        }

        @Override // androidx.media3.common.Timeline
        public Timeline.Period getPeriodByUid(Object obj, Timeline.Period period) {
            return getPeriod(((Integer) Assertions.checkNotNull(this.periodIndexByUid.get(obj))).intValue(), period, true);
        }

        @Override // androidx.media3.common.Timeline
        public int getPeriodCount() {
            return this.windowIndexByPeriodIndex.length;
        }

        @Override // androidx.media3.common.Timeline
        public Object getUidOfPeriod(int i2) {
            int i3 = this.windowIndexByPeriodIndex[i2];
            return ((MediaItemData) this.playlist.get(i3)).getPeriodUid(i2 - this.firstPeriodIndexByWindowIndex[i3]);
        }

        @Override // androidx.media3.common.Timeline
        public Timeline.Window getWindow(int i2, Timeline.Window window, long j2) {
            return ((MediaItemData) this.playlist.get(i2)).getWindow(this.firstPeriodIndexByWindowIndex[i2], window);
        }

        @Override // androidx.media3.common.Timeline
        public int getWindowCount() {
            return this.playlist.size();
        }

        public PlaylistTimeline(List<MediaItemData> list) {
            int size = list.size();
            this.playlist = com.google.common.collect.nKK.ty(list);
            this.firstPeriodIndexByWindowIndex = new int[size];
            int periodCountInMediaItem = 0;
            for (int i2 = 0; i2 < size; i2++) {
                MediaItemData mediaItemData = list.get(i2);
                this.firstPeriodIndexByWindowIndex[i2] = periodCountInMediaItem;
                periodCountInMediaItem += getPeriodCountInMediaItem(mediaItemData);
            }
            this.windowIndexByPeriodIndex = new int[periodCountInMediaItem];
            this.periodIndexByUid = new HashMap<>();
            int i3 = 0;
            for (int i5 = 0; i5 < size; i5++) {
                MediaItemData mediaItemData2 = list.get(i5);
                for (int i7 = 0; i7 < getPeriodCountInMediaItem(mediaItemData2); i7++) {
                    this.periodIndexByUid.put(mediaItemData2.getPeriodUid(i7), Integer.valueOf(i3));
                    this.windowIndexByPeriodIndex[i3] = i5;
                    i3++;
                }
            }
        }

        @Override // androidx.media3.common.Timeline
        public int getFirstWindowIndex(boolean z2) {
            return super.getFirstWindowIndex(z2);
        }

        @Override // androidx.media3.common.Timeline
        public int getLastWindowIndex(boolean z2) {
            return super.getLastWindowIndex(z2);
        }

        @Override // androidx.media3.common.Timeline
        public int getNextWindowIndex(int i2, int i3, boolean z2) {
            return super.getNextWindowIndex(i2, i3, z2);
        }

        @Override // androidx.media3.common.Timeline
        public int getPreviousWindowIndex(int i2, int i3, boolean z2) {
            return super.getPreviousWindowIndex(i2, i3, z2);
        }
    }

    protected interface PositionSupplier {
        public static final PositionSupplier ZERO = getConstant(0);

        static /* synthetic */ long n(long j2) {
            return j2;
        }

        long get();

        static PositionSupplier getConstant(final long j2) {
            return new PositionSupplier() { // from class: androidx.media3.common.CM
                @Override // androidx.media3.common.SimpleBasePlayer.PositionSupplier
                public final long get() {
                    return SimpleBasePlayer.PositionSupplier.n(j2);
                }
            };
        }

        static PositionSupplier getExtrapolating(final long j2, final float f3) {
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            return new PositionSupplier() { // from class: androidx.media3.common.L0y
                @Override // androidx.media3.common.SimpleBasePlayer.PositionSupplier
                public final long get() {
                    return SimpleBasePlayer.PositionSupplier.rl(j2, jElapsedRealtime, f3);
                }
            };
        }

        static /* synthetic */ long rl(long j2, long j3, float f3) {
            return j2 + ((long) ((SystemClock.elapsedRealtime() - j3) * f3));
        }
    }

    public static final class State {
        public final PositionSupplier adBufferedPositionMsSupplier;
        public final PositionSupplier adPositionMsSupplier;
        public final AudioAttributes audioAttributes;
        public final Player.Commands availableCommands;
        public final PositionSupplier contentBufferedPositionMsSupplier;
        public final PositionSupplier contentPositionMsSupplier;
        public final int currentAdGroupIndex;
        public final int currentAdIndexInAdGroup;
        public final CueGroup currentCues;
        public final int currentMediaItemIndex;
        public final MediaMetadata currentMetadata;
        public final Tracks currentTracks;
        public final DeviceInfo deviceInfo;

        @IntRange
        public final int deviceVolume;
        public final long discontinuityPositionMs;
        public final boolean hasPositionDiscontinuity;
        public final boolean isDeviceMuted;
        public final boolean isLoading;
        public final long maxSeekToPreviousPositionMs;
        public final boolean newlyRenderedFirstFrame;
        public final boolean playWhenReady;
        public final int playWhenReadyChangeReason;
        public final PlaybackParameters playbackParameters;
        public final int playbackState;
        public final int playbackSuppressionReason;

        @Nullable
        public final PlaybackException playerError;
        public final MediaMetadata playlistMetadata;
        public final int positionDiscontinuityReason;
        public final int repeatMode;
        public final long seekBackIncrementMs;
        public final long seekForwardIncrementMs;
        public final boolean shuffleModeEnabled;
        public final Size surfaceSize;
        public final Metadata timedMetadata;
        public final Timeline timeline;
        public final PositionSupplier totalBufferedDurationMsSupplier;
        public final TrackSelectionParameters trackSelectionParameters;
        private final boolean usesDerivedMediaMetadata;
        public final VideoSize videoSize;

        @FloatRange
        public final float volume;

        public static final class Builder {
            private PositionSupplier adBufferedPositionMsSupplier;

            @Nullable
            private Long adPositionMs;
            private PositionSupplier adPositionMsSupplier;
            private AudioAttributes audioAttributes;
            private Player.Commands availableCommands;
            private PositionSupplier contentBufferedPositionMsSupplier;

            @Nullable
            private Long contentPositionMs;
            private PositionSupplier contentPositionMsSupplier;
            private int currentAdGroupIndex;
            private int currentAdIndexInAdGroup;
            private CueGroup currentCues;
            private int currentMediaItemIndex;

            @Nullable
            private MediaMetadata currentMetadata;

            @Nullable
            private Tracks currentTracks;
            private DeviceInfo deviceInfo;
            private int deviceVolume;
            private long discontinuityPositionMs;
            private boolean hasPositionDiscontinuity;
            private boolean isDeviceMuted;
            private boolean isLoading;
            private long maxSeekToPreviousPositionMs;
            private boolean newlyRenderedFirstFrame;
            private boolean playWhenReady;
            private int playWhenReadyChangeReason;
            private PlaybackParameters playbackParameters;
            private int playbackState;
            private int playbackSuppressionReason;

            @Nullable
            private PlaybackException playerError;

            @Nullable
            private com.google.common.collect.nKK playlist;
            private MediaMetadata playlistMetadata;
            private int positionDiscontinuityReason;
            private int repeatMode;
            private long seekBackIncrementMs;
            private long seekForwardIncrementMs;
            private boolean shuffleModeEnabled;
            private Size surfaceSize;
            private Metadata timedMetadata;
            private Timeline timeline;
            private PositionSupplier totalBufferedDurationMsSupplier;
            private TrackSelectionParameters trackSelectionParameters;
            private VideoSize videoSize;
            private float volume;

            public Builder clearPositionDiscontinuity() {
                this.hasPositionDiscontinuity = false;
                return this;
            }

            public Builder setAdPositionMs(long j2) {
                this.adPositionMs = Long.valueOf(j2);
                return this;
            }

            public Builder setContentPositionMs(long j2) {
                this.contentPositionMs = Long.valueOf(j2);
                return this;
            }

            public Builder setCurrentAd(int i2, int i3) {
                Assertions.checkArgument((i2 == -1) == (i3 == -1));
                this.currentAdGroupIndex = i2;
                this.currentAdIndexInAdGroup = i3;
                return this;
            }

            public Builder setPlaylist(List<MediaItemData> list) {
                HashSet hashSet = new HashSet();
                for (int i2 = 0; i2 < list.size(); i2++) {
                    Assertions.checkArgument(hashSet.add(list.get(i2).uid), "Duplicate MediaItemData UID in playlist");
                }
                this.playlist = com.google.common.collect.nKK.ty(list);
                this.timeline = new PlaylistTimeline(this.playlist);
                this.currentTracks = null;
                this.currentMetadata = null;
                return this;
            }

            public Builder setPositionDiscontinuity(int i2, long j2) {
                this.hasPositionDiscontinuity = true;
                this.positionDiscontinuityReason = i2;
                this.discontinuityPositionMs = j2;
                return this;
            }

            public Builder setVolume(@FloatRange float f3) {
                Assertions.checkArgument(f3 >= 0.0f && f3 <= 1.0f);
                this.volume = f3;
                return this;
            }

            public Builder() {
                this.availableCommands = Player.Commands.EMPTY;
                this.playWhenReady = false;
                this.playWhenReadyChangeReason = 1;
                this.playbackState = 1;
                this.playbackSuppressionReason = 0;
                this.playerError = null;
                this.repeatMode = 0;
                this.shuffleModeEnabled = false;
                this.isLoading = false;
                this.seekBackIncrementMs = 5000L;
                this.seekForwardIncrementMs = 15000L;
                this.maxSeekToPreviousPositionMs = 3000L;
                this.playbackParameters = PlaybackParameters.DEFAULT;
                this.trackSelectionParameters = TrackSelectionParameters.DEFAULT;
                this.audioAttributes = AudioAttributes.DEFAULT;
                this.volume = 1.0f;
                this.videoSize = VideoSize.UNKNOWN;
                this.currentCues = CueGroup.EMPTY_TIME_ZERO;
                this.deviceInfo = DeviceInfo.UNKNOWN;
                this.deviceVolume = 0;
                this.isDeviceMuted = false;
                this.surfaceSize = Size.UNKNOWN;
                this.newlyRenderedFirstFrame = false;
                this.timedMetadata = new Metadata(-9223372036854775807L, new Metadata.Entry[0]);
                this.playlist = com.google.common.collect.nKK.r();
                this.timeline = Timeline.EMPTY;
                this.currentTracks = null;
                this.currentMetadata = null;
                this.playlistMetadata = MediaMetadata.EMPTY;
                this.currentMediaItemIndex = -1;
                this.currentAdGroupIndex = -1;
                this.currentAdIndexInAdGroup = -1;
                this.contentPositionMs = null;
                this.contentPositionMsSupplier = PositionSupplier.getConstant(-9223372036854775807L);
                this.adPositionMs = null;
                PositionSupplier positionSupplier = PositionSupplier.ZERO;
                this.adPositionMsSupplier = positionSupplier;
                this.contentBufferedPositionMsSupplier = PositionSupplier.getConstant(-9223372036854775807L);
                this.adBufferedPositionMsSupplier = positionSupplier;
                this.totalBufferedDurationMsSupplier = positionSupplier;
                this.hasPositionDiscontinuity = false;
                this.positionDiscontinuityReason = 5;
                this.discontinuityPositionMs = 0L;
            }

            public State build() {
                return new State(this);
            }

            public Builder setAdBufferedPositionMs(PositionSupplier positionSupplier) {
                this.adBufferedPositionMsSupplier = positionSupplier;
                return this;
            }

            public Builder setAdPositionMs(PositionSupplier positionSupplier) {
                this.adPositionMs = null;
                this.adPositionMsSupplier = positionSupplier;
                return this;
            }

            public Builder setAudioAttributes(AudioAttributes audioAttributes) {
                this.audioAttributes = audioAttributes;
                return this;
            }

            public Builder setAvailableCommands(Player.Commands commands) {
                this.availableCommands = commands;
                return this;
            }

            public Builder setContentBufferedPositionMs(PositionSupplier positionSupplier) {
                this.contentBufferedPositionMsSupplier = positionSupplier;
                return this;
            }

            public Builder setContentPositionMs(PositionSupplier positionSupplier) {
                this.contentPositionMs = null;
                this.contentPositionMsSupplier = positionSupplier;
                return this;
            }

            public Builder setCurrentCues(CueGroup cueGroup) {
                this.currentCues = cueGroup;
                return this;
            }

            public Builder setCurrentMediaItemIndex(int i2) {
                this.currentMediaItemIndex = i2;
                return this;
            }

            public Builder setDeviceInfo(DeviceInfo deviceInfo) {
                this.deviceInfo = deviceInfo;
                return this;
            }

            public Builder setDeviceVolume(@IntRange int i2) {
                Assertions.checkArgument(i2 >= 0);
                this.deviceVolume = i2;
                return this;
            }

            public Builder setIsDeviceMuted(boolean z2) {
                this.isDeviceMuted = z2;
                return this;
            }

            public Builder setIsLoading(boolean z2) {
                this.isLoading = z2;
                return this;
            }

            public Builder setMaxSeekToPreviousPositionMs(long j2) {
                this.maxSeekToPreviousPositionMs = j2;
                return this;
            }

            public Builder setNewlyRenderedFirstFrame(boolean z2) {
                this.newlyRenderedFirstFrame = z2;
                return this;
            }

            public Builder setPlayWhenReady(boolean z2, int i2) {
                this.playWhenReady = z2;
                this.playWhenReadyChangeReason = i2;
                return this;
            }

            public Builder setPlaybackParameters(PlaybackParameters playbackParameters) {
                this.playbackParameters = playbackParameters;
                return this;
            }

            public Builder setPlaybackState(int i2) {
                this.playbackState = i2;
                return this;
            }

            public Builder setPlaybackSuppressionReason(int i2) {
                this.playbackSuppressionReason = i2;
                return this;
            }

            public Builder setPlayerError(@Nullable PlaybackException playbackException) {
                this.playerError = playbackException;
                return this;
            }

            public Builder setPlaylistMetadata(MediaMetadata mediaMetadata) {
                this.playlistMetadata = mediaMetadata;
                return this;
            }

            public Builder setRepeatMode(int i2) {
                this.repeatMode = i2;
                return this;
            }

            public Builder setSeekBackIncrementMs(long j2) {
                this.seekBackIncrementMs = j2;
                return this;
            }

            public Builder setSeekForwardIncrementMs(long j2) {
                this.seekForwardIncrementMs = j2;
                return this;
            }

            public Builder setShuffleModeEnabled(boolean z2) {
                this.shuffleModeEnabled = z2;
                return this;
            }

            public Builder setSurfaceSize(Size size) {
                this.surfaceSize = size;
                return this;
            }

            public Builder setTimedMetadata(Metadata metadata) {
                this.timedMetadata = metadata;
                return this;
            }

            public Builder setTotalBufferedDurationMs(PositionSupplier positionSupplier) {
                this.totalBufferedDurationMsSupplier = positionSupplier;
                return this;
            }

            public Builder setTrackSelectionParameters(TrackSelectionParameters trackSelectionParameters) {
                this.trackSelectionParameters = trackSelectionParameters;
                return this;
            }

            public Builder setVideoSize(VideoSize videoSize) {
                this.videoSize = videoSize;
                return this;
            }

            public Builder setPlaylist(Timeline timeline, Tracks tracks, @Nullable MediaMetadata mediaMetadata) {
                this.playlist = null;
                this.timeline = timeline;
                this.currentTracks = tracks;
                this.currentMetadata = mediaMetadata;
                return this;
            }

            private Builder(State state) {
                this.availableCommands = state.availableCommands;
                this.playWhenReady = state.playWhenReady;
                this.playWhenReadyChangeReason = state.playWhenReadyChangeReason;
                this.playbackState = state.playbackState;
                this.playbackSuppressionReason = state.playbackSuppressionReason;
                this.playerError = state.playerError;
                this.repeatMode = state.repeatMode;
                this.shuffleModeEnabled = state.shuffleModeEnabled;
                this.isLoading = state.isLoading;
                this.seekBackIncrementMs = state.seekBackIncrementMs;
                this.seekForwardIncrementMs = state.seekForwardIncrementMs;
                this.maxSeekToPreviousPositionMs = state.maxSeekToPreviousPositionMs;
                this.playbackParameters = state.playbackParameters;
                this.trackSelectionParameters = state.trackSelectionParameters;
                this.audioAttributes = state.audioAttributes;
                this.volume = state.volume;
                this.videoSize = state.videoSize;
                this.currentCues = state.currentCues;
                this.deviceInfo = state.deviceInfo;
                this.deviceVolume = state.deviceVolume;
                this.isDeviceMuted = state.isDeviceMuted;
                this.surfaceSize = state.surfaceSize;
                this.newlyRenderedFirstFrame = state.newlyRenderedFirstFrame;
                this.timedMetadata = state.timedMetadata;
                Timeline timeline = state.timeline;
                this.timeline = timeline;
                if (timeline instanceof PlaylistTimeline) {
                    this.playlist = ((PlaylistTimeline) timeline).playlist;
                } else {
                    this.currentTracks = state.currentTracks;
                    this.currentMetadata = state.usesDerivedMediaMetadata ? null : state.currentMetadata;
                }
                this.playlistMetadata = state.playlistMetadata;
                this.currentMediaItemIndex = state.currentMediaItemIndex;
                this.currentAdGroupIndex = state.currentAdGroupIndex;
                this.currentAdIndexInAdGroup = state.currentAdIndexInAdGroup;
                this.contentPositionMs = null;
                this.contentPositionMsSupplier = state.contentPositionMsSupplier;
                this.adPositionMs = null;
                this.adPositionMsSupplier = state.adPositionMsSupplier;
                this.contentBufferedPositionMsSupplier = state.contentBufferedPositionMsSupplier;
                this.adBufferedPositionMsSupplier = state.adBufferedPositionMsSupplier;
                this.totalBufferedDurationMsSupplier = state.totalBufferedDurationMsSupplier;
                this.hasPositionDiscontinuity = state.hasPositionDiscontinuity;
                this.positionDiscontinuityReason = state.positionDiscontinuityReason;
                this.discontinuityPositionMs = state.discontinuityPositionMs;
            }
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            return this.playWhenReady == state.playWhenReady && this.playWhenReadyChangeReason == state.playWhenReadyChangeReason && this.availableCommands.equals(state.availableCommands) && this.playbackState == state.playbackState && this.playbackSuppressionReason == state.playbackSuppressionReason && Objects.equals(this.playerError, state.playerError) && this.repeatMode == state.repeatMode && this.shuffleModeEnabled == state.shuffleModeEnabled && this.isLoading == state.isLoading && this.seekBackIncrementMs == state.seekBackIncrementMs && this.seekForwardIncrementMs == state.seekForwardIncrementMs && this.maxSeekToPreviousPositionMs == state.maxSeekToPreviousPositionMs && this.playbackParameters.equals(state.playbackParameters) && this.trackSelectionParameters.equals(state.trackSelectionParameters) && this.audioAttributes.equals(state.audioAttributes) && this.volume == state.volume && this.videoSize.equals(state.videoSize) && this.currentCues.equals(state.currentCues) && this.deviceInfo.equals(state.deviceInfo) && this.deviceVolume == state.deviceVolume && this.isDeviceMuted == state.isDeviceMuted && this.surfaceSize.equals(state.surfaceSize) && this.newlyRenderedFirstFrame == state.newlyRenderedFirstFrame && this.timedMetadata.equals(state.timedMetadata) && this.timeline.equals(state.timeline) && this.currentTracks.equals(state.currentTracks) && this.currentMetadata.equals(state.currentMetadata) && this.playlistMetadata.equals(state.playlistMetadata) && this.currentMediaItemIndex == state.currentMediaItemIndex && this.currentAdGroupIndex == state.currentAdGroupIndex && this.currentAdIndexInAdGroup == state.currentAdIndexInAdGroup && this.contentPositionMsSupplier.equals(state.contentPositionMsSupplier) && this.adPositionMsSupplier.equals(state.adPositionMsSupplier) && this.contentBufferedPositionMsSupplier.equals(state.contentBufferedPositionMsSupplier) && this.adBufferedPositionMsSupplier.equals(state.adBufferedPositionMsSupplier) && this.totalBufferedDurationMsSupplier.equals(state.totalBufferedDurationMsSupplier) && this.hasPositionDiscontinuity == state.hasPositionDiscontinuity && this.positionDiscontinuityReason == state.positionDiscontinuityReason && this.discontinuityPositionMs == state.discontinuityPositionMs;
        }

        /* JADX WARN: Removed duplicated region for block: B:56:0x010b  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0123  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x0138  */
        /* JADX WARN: Removed duplicated region for block: B:81:0x018a  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private State(Builder builder) {
            int i2;
            boolean z2;
            Tracks tracks = builder.currentTracks;
            MediaMetadata combinedMediaMetadata = builder.currentMetadata;
            if (!builder.timeline.isEmpty()) {
                int i3 = builder.currentMediaItemIndex;
                if (i3 == -1) {
                    i2 = 0;
                } else {
                    Assertions.checkArgument(builder.currentMediaItemIndex < builder.timeline.getWindowCount(), "currentMediaItemIndex must be less than playlist.size()");
                    i2 = i3;
                }
                if (builder.currentAdGroupIndex != -1) {
                    Timeline.Period period = new Timeline.Period();
                    builder.timeline.getPeriod(SimpleBasePlayer.getPeriodIndexFromWindowPosition(builder.timeline, i2, builder.contentPositionMs != null ? builder.contentPositionMs.longValue() : builder.contentPositionMsSupplier.get(), new Timeline.Window(), period), period);
                    Assertions.checkArgument(builder.currentAdGroupIndex < period.getAdGroupCount(), "PeriodData has less ad groups than adGroupIndex");
                    int adCountInAdGroup = period.getAdCountInAdGroup(builder.currentAdGroupIndex);
                    if (adCountInAdGroup != -1) {
                        Assertions.checkArgument(builder.currentAdIndexInAdGroup < adCountInAdGroup, "Ad group has less ads than adIndexInGroupIndex");
                    }
                }
                if (builder.playlist != null) {
                    MediaItemData mediaItemData = (MediaItemData) builder.playlist.get(i2);
                    Tracks tracks2 = mediaItemData.tracks;
                    combinedMediaMetadata = mediaItemData.mediaMetadata;
                    tracks = tracks2;
                }
                if (combinedMediaMetadata == null) {
                    combinedMediaMetadata = SimpleBasePlayer.getCombinedMediaMetadata(builder.timeline.getWindow(i2, new Timeline.Window()).mediaItem, (Tracks) Assertions.checkNotNull(tracks));
                    z2 = true;
                }
                if (builder.playerError != null) {
                    Assertions.checkArgument(builder.playbackState == 1, "Player error only allowed in STATE_IDLE");
                }
                if (builder.playbackState != 1 || builder.playbackState == 4) {
                    Assertions.checkArgument(!builder.isLoading, "isLoading only allowed when not in STATE_IDLE or STATE_ENDED");
                }
                PositionSupplier extrapolating = builder.contentPositionMs != null ? (builder.currentAdGroupIndex == -1 && builder.playWhenReady && builder.playbackState == 3 && builder.playbackSuppressionReason == 0 && builder.contentPositionMs.longValue() != -9223372036854775807L) ? PositionSupplier.getExtrapolating(builder.contentPositionMs.longValue(), builder.playbackParameters.speed) : PositionSupplier.getConstant(builder.contentPositionMs.longValue()) : builder.contentPositionMsSupplier;
                PositionSupplier extrapolating2 = builder.adPositionMs != null ? (builder.currentAdGroupIndex != -1 && builder.playWhenReady && builder.playbackState == 3 && builder.playbackSuppressionReason == 0) ? PositionSupplier.getExtrapolating(builder.adPositionMs.longValue(), 1.0f) : PositionSupplier.getConstant(builder.adPositionMs.longValue()) : builder.adPositionMsSupplier;
                this.availableCommands = builder.availableCommands;
                this.playWhenReady = builder.playWhenReady;
                this.playWhenReadyChangeReason = builder.playWhenReadyChangeReason;
                this.playbackState = builder.playbackState;
                this.playbackSuppressionReason = builder.playbackSuppressionReason;
                this.playerError = builder.playerError;
                this.repeatMode = builder.repeatMode;
                this.shuffleModeEnabled = builder.shuffleModeEnabled;
                this.isLoading = builder.isLoading;
                this.seekBackIncrementMs = builder.seekBackIncrementMs;
                this.seekForwardIncrementMs = builder.seekForwardIncrementMs;
                this.maxSeekToPreviousPositionMs = builder.maxSeekToPreviousPositionMs;
                this.playbackParameters = builder.playbackParameters;
                this.trackSelectionParameters = builder.trackSelectionParameters;
                this.audioAttributes = builder.audioAttributes;
                this.volume = builder.volume;
                this.videoSize = builder.videoSize;
                this.currentCues = builder.currentCues;
                this.deviceInfo = builder.deviceInfo;
                this.deviceVolume = builder.deviceVolume;
                this.isDeviceMuted = builder.isDeviceMuted;
                this.surfaceSize = builder.surfaceSize;
                this.newlyRenderedFirstFrame = builder.newlyRenderedFirstFrame;
                this.timedMetadata = builder.timedMetadata;
                this.timeline = builder.timeline;
                this.currentTracks = (Tracks) Assertions.checkNotNull(tracks);
                this.currentMetadata = combinedMediaMetadata;
                this.playlistMetadata = builder.playlistMetadata;
                this.currentMediaItemIndex = builder.currentMediaItemIndex;
                this.currentAdGroupIndex = builder.currentAdGroupIndex;
                this.currentAdIndexInAdGroup = builder.currentAdIndexInAdGroup;
                this.contentPositionMsSupplier = extrapolating;
                this.adPositionMsSupplier = extrapolating2;
                this.contentBufferedPositionMsSupplier = builder.contentBufferedPositionMsSupplier;
                this.adBufferedPositionMsSupplier = builder.adBufferedPositionMsSupplier;
                this.totalBufferedDurationMsSupplier = builder.totalBufferedDurationMsSupplier;
                this.hasPositionDiscontinuity = builder.hasPositionDiscontinuity;
                this.positionDiscontinuityReason = builder.positionDiscontinuityReason;
                this.discontinuityPositionMs = builder.discontinuityPositionMs;
                this.usesDerivedMediaMetadata = z2;
            }
            Assertions.checkArgument(builder.playbackState == 1 || builder.playbackState == 4, "Empty playlist only allowed in STATE_IDLE or STATE_ENDED");
            Assertions.checkArgument(builder.currentAdGroupIndex == -1 && builder.currentAdIndexInAdGroup == -1, "Ads not allowed if playlist is empty");
            tracks = tracks == null ? Tracks.EMPTY : tracks;
            if (combinedMediaMetadata == null) {
                combinedMediaMetadata = MediaMetadata.EMPTY;
            }
            z2 = false;
            if (builder.playerError != null) {
            }
            if (builder.playbackState != 1) {
                Assertions.checkArgument(!builder.isLoading, "isLoading only allowed when not in STATE_IDLE or STATE_ENDED");
            }
            if (builder.contentPositionMs != null) {
            }
            if (builder.adPositionMs != null) {
            }
            this.availableCommands = builder.availableCommands;
            this.playWhenReady = builder.playWhenReady;
            this.playWhenReadyChangeReason = builder.playWhenReadyChangeReason;
            this.playbackState = builder.playbackState;
            this.playbackSuppressionReason = builder.playbackSuppressionReason;
            this.playerError = builder.playerError;
            this.repeatMode = builder.repeatMode;
            this.shuffleModeEnabled = builder.shuffleModeEnabled;
            this.isLoading = builder.isLoading;
            this.seekBackIncrementMs = builder.seekBackIncrementMs;
            this.seekForwardIncrementMs = builder.seekForwardIncrementMs;
            this.maxSeekToPreviousPositionMs = builder.maxSeekToPreviousPositionMs;
            this.playbackParameters = builder.playbackParameters;
            this.trackSelectionParameters = builder.trackSelectionParameters;
            this.audioAttributes = builder.audioAttributes;
            this.volume = builder.volume;
            this.videoSize = builder.videoSize;
            this.currentCues = builder.currentCues;
            this.deviceInfo = builder.deviceInfo;
            this.deviceVolume = builder.deviceVolume;
            this.isDeviceMuted = builder.isDeviceMuted;
            this.surfaceSize = builder.surfaceSize;
            this.newlyRenderedFirstFrame = builder.newlyRenderedFirstFrame;
            this.timedMetadata = builder.timedMetadata;
            this.timeline = builder.timeline;
            this.currentTracks = (Tracks) Assertions.checkNotNull(tracks);
            this.currentMetadata = combinedMediaMetadata;
            this.playlistMetadata = builder.playlistMetadata;
            this.currentMediaItemIndex = builder.currentMediaItemIndex;
            this.currentAdGroupIndex = builder.currentAdGroupIndex;
            this.currentAdIndexInAdGroup = builder.currentAdIndexInAdGroup;
            this.contentPositionMsSupplier = extrapolating;
            this.adPositionMsSupplier = extrapolating2;
            this.contentBufferedPositionMsSupplier = builder.contentBufferedPositionMsSupplier;
            this.adBufferedPositionMsSupplier = builder.adBufferedPositionMsSupplier;
            this.totalBufferedDurationMsSupplier = builder.totalBufferedDurationMsSupplier;
            this.hasPositionDiscontinuity = builder.hasPositionDiscontinuity;
            this.positionDiscontinuityReason = builder.positionDiscontinuityReason;
            this.discontinuityPositionMs = builder.discontinuityPositionMs;
            this.usesDerivedMediaMetadata = z2;
        }

        public Builder buildUpon() {
            return new Builder();
        }

        public com.google.common.collect.nKK getPlaylist() {
            Timeline timeline = this.timeline;
            if (timeline instanceof PlaylistTimeline) {
                return ((PlaylistTimeline) timeline).playlist;
            }
            Timeline.Window window = new Timeline.Window();
            Timeline.Period period = new Timeline.Period();
            nKK.j jVarQie = com.google.common.collect.nKK.qie(this.timeline.getWindowCount());
            for (int i2 = 0; i2 < this.timeline.getWindowCount(); i2++) {
                jVarQie.n(MediaItemData.buildFromState(this, i2, period, window));
            }
            return jVarQie.gh();
        }

        public int hashCode() {
            int iHashCode = (((((((((Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE + this.availableCommands.hashCode()) * 31) + (this.playWhenReady ? 1 : 0)) * 31) + this.playWhenReadyChangeReason) * 31) + this.playbackState) * 31) + this.playbackSuppressionReason) * 31;
            PlaybackException playbackException = this.playerError;
            int iHashCode2 = (((((((iHashCode + (playbackException == null ? 0 : playbackException.hashCode())) * 31) + this.repeatMode) * 31) + (this.shuffleModeEnabled ? 1 : 0)) * 31) + (this.isLoading ? 1 : 0)) * 31;
            long j2 = this.seekBackIncrementMs;
            int i2 = (iHashCode2 + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.seekForwardIncrementMs;
            int i3 = (i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31;
            long j4 = this.maxSeekToPreviousPositionMs;
            int iHashCode3 = (((((((((((((((((((((((((((((((((((((((((((((((((((((i3 + ((int) (j4 ^ (j4 >>> 32)))) * 31) + this.playbackParameters.hashCode()) * 31) + this.trackSelectionParameters.hashCode()) * 31) + this.audioAttributes.hashCode()) * 31) + Float.floatToRawIntBits(this.volume)) * 31) + this.videoSize.hashCode()) * 31) + this.currentCues.hashCode()) * 31) + this.deviceInfo.hashCode()) * 31) + this.deviceVolume) * 31) + (this.isDeviceMuted ? 1 : 0)) * 31) + this.surfaceSize.hashCode()) * 31) + (this.newlyRenderedFirstFrame ? 1 : 0)) * 31) + this.timedMetadata.hashCode()) * 31) + this.timeline.hashCode()) * 31) + this.currentTracks.hashCode()) * 31) + this.currentMetadata.hashCode()) * 31) + this.playlistMetadata.hashCode()) * 31) + this.currentMediaItemIndex) * 31) + this.currentAdGroupIndex) * 31) + this.currentAdIndexInAdGroup) * 31) + this.contentPositionMsSupplier.hashCode()) * 31) + this.adPositionMsSupplier.hashCode()) * 31) + this.contentBufferedPositionMsSupplier.hashCode()) * 31) + this.adBufferedPositionMsSupplier.hashCode()) * 31) + this.totalBufferedDurationMsSupplier.hashCode()) * 31) + (this.hasPositionDiscontinuity ? 1 : 0)) * 31) + this.positionDiscontinuityReason) * 31;
            long j5 = this.discontinuityPositionMs;
            return iHashCode3 + ((int) (j5 ^ (j5 >>> 32)));
        }
    }

    protected SimpleBasePlayer(Looper looper) {
        this(looper, Clock.DEFAULT);
    }

    public static /* synthetic */ State ijL(State state) {
        return state;
    }

    public static /* synthetic */ com.google.common.util.concurrent.Xo r(com.google.common.util.concurrent.Xo xo, Object obj) {
        return xo;
    }

    private void setMediaItemsInternal(final List<MediaItem> list, final int i2, final long j2) {
        Assertions.checkArgument(i2 == -1 || i2 >= 0);
        final State state = this.state;
        if (shouldHandleCommand(20) || (list.size() == 1 && shouldHandleCommand(31))) {
            updateStateForPendingOperation(handleSetMediaItems(list, i2, j2), new t1.UGc() { // from class: androidx.media3.common.Zs
                @Override // t1.UGc
                public final Object get() {
                    return SimpleBasePlayer.n(this.f39268n, list, state, i2, j2);
                }
            });
        }
    }

    private void updateStateAndInformListeners(final State state, boolean z2, boolean z3) {
        State state2 = this.state;
        this.state = state;
        if (state.hasPositionDiscontinuity || state.newlyRenderedFirstFrame) {
            this.state = state.buildUpon().clearPositionDiscontinuity().setNewlyRenderedFirstFrame(false).build();
        }
        boolean z4 = state2.playWhenReady != state.playWhenReady;
        boolean z5 = state2.playbackState != state.playbackState;
        final int positionDiscontinuityReason = getPositionDiscontinuityReason(state2, state, z2, this.window, this.period);
        boolean zEquals = state2.timeline.equals(state.timeline);
        final int mediaItemTransitionReason = getMediaItemTransitionReason(state2, state, positionDiscontinuityReason, z3, this.window);
        if (!zEquals) {
            final int timelineChangeReason = getTimelineChangeReason(state2.timeline, state.timeline, this.window);
            this.listeners.queueEvent(0, new ListenerSet.Event() { // from class: androidx.media3.common.pO
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    Player.Listener listener = (Player.Listener) obj;
                    listener.onTimelineChanged(state.timeline, timelineChangeReason);
                }
            });
        }
        if (positionDiscontinuityReason != -1) {
            final Player.PositionInfo positionInfo = getPositionInfo(state2, false, this.window, this.period);
            final Player.PositionInfo positionInfo2 = getPositionInfo(state, state.hasPositionDiscontinuity, this.window, this.period);
            this.listeners.queueEvent(11, new ListenerSet.Event() { // from class: androidx.media3.common.Q
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    SimpleBasePlayer.e(positionDiscontinuityReason, positionInfo, positionInfo2, (Player.Listener) obj);
                }
            });
        }
        if (mediaItemTransitionReason != -1) {
            final MediaItem mediaItem = state.timeline.isEmpty() ? null : state.timeline.getWindow(getCurrentMediaItemIndexInternal(state), this.window).mediaItem;
            this.listeners.queueEvent(1, new ListenerSet.Event() { // from class: androidx.media3.common.Ln
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onMediaItemTransition(mediaItem, mediaItemTransitionReason);
                }
            });
        }
        if (!Objects.equals(state2.playerError, state.playerError)) {
            this.listeners.queueEvent(10, new ListenerSet.Event() { // from class: androidx.media3.common.iwV
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onPlayerErrorChanged(state.playerError);
                }
            });
            if (state.playerError != null) {
                this.listeners.queueEvent(10, new ListenerSet.Event() { // from class: androidx.media3.common.M
                    @Override // androidx.media3.common.util.ListenerSet.Event
                    public final void invoke(Object obj) {
                        ((Player.Listener) obj).onPlayerError((PlaybackException) Util.castNonNull(state.playerError));
                    }
                });
            }
        }
        if (!state2.trackSelectionParameters.equals(state.trackSelectionParameters)) {
            this.listeners.queueEvent(19, new ListenerSet.Event() { // from class: androidx.media3.common.rv6
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onTrackSelectionParametersChanged(state.trackSelectionParameters);
                }
            });
        }
        if (!state2.currentTracks.equals(state.currentTracks)) {
            this.listeners.queueEvent(2, new ListenerSet.Event() { // from class: androidx.media3.common.Lu
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onTracksChanged(state.currentTracks);
                }
            });
        }
        if (!state2.currentMetadata.equals(state.currentMetadata)) {
            this.listeners.queueEvent(14, new ListenerSet.Event() { // from class: androidx.media3.common.h
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onMediaMetadataChanged(state.currentMetadata);
                }
            });
        }
        if (state2.isLoading != state.isLoading) {
            this.listeners.queueEvent(3, new ListenerSet.Event() { // from class: androidx.media3.common.K
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    SimpleBasePlayer.te(state, (Player.Listener) obj);
                }
            });
        }
        if (z4 || z5) {
            this.listeners.queueEvent(-1, new ListenerSet.Event() { // from class: androidx.media3.common.psW
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    SimpleBasePlayer.State state3 = state;
                    ((Player.Listener) obj).onPlayerStateChanged(state3.playWhenReady, state3.playbackState);
                }
            });
        }
        if (z5) {
            this.listeners.queueEvent(4, new ListenerSet.Event() { // from class: androidx.media3.common.Mf
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onPlaybackStateChanged(state.playbackState);
                }
            });
        }
        if (z4 || state2.playWhenReadyChangeReason != state.playWhenReadyChangeReason) {
            this.listeners.queueEvent(5, new ListenerSet.Event() { // from class: androidx.media3.common.kO4
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    SimpleBasePlayer.State state3 = state;
                    ((Player.Listener) obj).onPlayWhenReadyChanged(state3.playWhenReady, state3.playWhenReadyChangeReason);
                }
            });
        }
        if (state2.playbackSuppressionReason != state.playbackSuppressionReason) {
            this.listeners.queueEvent(6, new ListenerSet.Event() { // from class: androidx.media3.common.c7r
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onPlaybackSuppressionReasonChanged(state.playbackSuppressionReason);
                }
            });
        }
        if (isPlaying(state2) != isPlaying(state)) {
            this.listeners.queueEvent(7, new ListenerSet.Event() { // from class: androidx.media3.common.t
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onIsPlayingChanged(SimpleBasePlayer.isPlaying(state));
                }
            });
        }
        if (!state2.playbackParameters.equals(state.playbackParameters)) {
            this.listeners.queueEvent(12, new ListenerSet.Event() { // from class: androidx.media3.common.cA
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onPlaybackParametersChanged(state.playbackParameters);
                }
            });
        }
        if (state2.repeatMode != state.repeatMode) {
            this.listeners.queueEvent(8, new ListenerSet.Event() { // from class: androidx.media3.common.g9
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onRepeatModeChanged(state.repeatMode);
                }
            });
        }
        if (state2.shuffleModeEnabled != state.shuffleModeEnabled) {
            this.listeners.queueEvent(9, new ListenerSet.Event() { // from class: androidx.media3.common.l3D
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onShuffleModeEnabledChanged(state.shuffleModeEnabled);
                }
            });
        }
        if (state2.seekBackIncrementMs != state.seekBackIncrementMs) {
            this.listeners.queueEvent(16, new ListenerSet.Event() { // from class: androidx.media3.common.c
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onSeekBackIncrementChanged(state.seekBackIncrementMs);
                }
            });
        }
        if (state2.seekForwardIncrementMs != state.seekForwardIncrementMs) {
            this.listeners.queueEvent(17, new ListenerSet.Event() { // from class: androidx.media3.common.s4
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onSeekForwardIncrementChanged(state.seekForwardIncrementMs);
                }
            });
        }
        if (state2.maxSeekToPreviousPositionMs != state.maxSeekToPreviousPositionMs) {
            this.listeners.queueEvent(18, new ListenerSet.Event() { // from class: androidx.media3.common.UGc
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onMaxSeekToPreviousPositionChanged(state.maxSeekToPreviousPositionMs);
                }
            });
        }
        if (!state2.audioAttributes.equals(state.audioAttributes)) {
            this.listeners.queueEvent(20, new ListenerSet.Event() { // from class: androidx.media3.common.r
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onAudioAttributesChanged(state.audioAttributes);
                }
            });
        }
        if (!state2.videoSize.equals(state.videoSize)) {
            this.listeners.queueEvent(25, new ListenerSet.Event() { // from class: androidx.media3.common.SPz
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onVideoSizeChanged(state.videoSize);
                }
            });
        }
        if (!state2.deviceInfo.equals(state.deviceInfo)) {
            this.listeners.queueEvent(29, new ListenerSet.Event() { // from class: androidx.media3.common.ci
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onDeviceInfoChanged(state.deviceInfo);
                }
            });
        }
        if (!state2.playlistMetadata.equals(state.playlistMetadata)) {
            this.listeners.queueEvent(15, new ListenerSet.Event() { // from class: androidx.media3.common.g9s
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onPlaylistMetadataChanged(state.playlistMetadata);
                }
            });
        }
        if (state.newlyRenderedFirstFrame) {
            this.listeners.queueEvent(26, new afx());
        }
        if (!state2.surfaceSize.equals(state.surfaceSize)) {
            this.listeners.queueEvent(24, new ListenerSet.Event() { // from class: androidx.media3.common.Ew
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    SimpleBasePlayer.State state3 = state;
                    ((Player.Listener) obj).onSurfaceSizeChanged(state3.surfaceSize.getWidth(), state3.surfaceSize.getHeight());
                }
            });
        }
        if (state2.volume != state.volume) {
            this.listeners.queueEvent(22, new ListenerSet.Event() { // from class: androidx.media3.common.nKK
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onVolumeChanged(state.volume);
                }
            });
        }
        if (state2.deviceVolume != state.deviceVolume || state2.isDeviceMuted != state.isDeviceMuted) {
            this.listeners.queueEvent(30, new ListenerSet.Event() { // from class: androidx.media3.common.DAz
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    SimpleBasePlayer.State state3 = state;
                    ((Player.Listener) obj).onDeviceVolumeChanged(state3.deviceVolume, state3.isDeviceMuted);
                }
            });
        }
        if (!state2.currentCues.equals(state.currentCues)) {
            this.listeners.queueEvent(27, new ListenerSet.Event() { // from class: androidx.media3.common.u
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    SimpleBasePlayer.U(state, (Player.Listener) obj);
                }
            });
        }
        if (!state2.timedMetadata.equals(state.timedMetadata) && state.timedMetadata.presentationTimeUs != -9223372036854775807L) {
            this.listeners.queueEvent(28, new ListenerSet.Event() { // from class: androidx.media3.common.qf
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onMetadata(state.timedMetadata);
                }
            });
        }
        if (!state2.availableCommands.equals(state.availableCommands)) {
            this.listeners.queueEvent(13, new ListenerSet.Event() { // from class: androidx.media3.common.lej
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onAvailableCommandsChanged(state.availableCommands);
                }
            });
        }
        this.listeners.flushEvents();
    }

    private void updateStateForPendingOperation(com.google.common.util.concurrent.Xo xo, t1.UGc uGc) {
        updateStateForPendingOperation(xo, uGc, false, false);
    }

    @Override // androidx.media3.common.Player
    public final void clearVideoSurface() {
        clearVideoOutput(null);
    }

    @Override // androidx.media3.common.Player
    @Deprecated
    public final void decreaseDeviceVolume() {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(26)) {
            updateStateForPendingOperation(handleDecreaseDeviceVolume(1), new t1.UGc() { // from class: androidx.media3.common.OU
                @Override // t1.UGc
                public final Object get() {
                    return state.buildUpon().setDeviceVolume(Math.max(0, r0.deviceVolume - 1)).build();
                }
            });
        }
    }

    protected State getPlaceholderState(State state) {
        return state;
    }

    protected abstract State getState();

    @Override // androidx.media3.common.Player
    @Deprecated
    public final void increaseDeviceVolume() {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(26)) {
            updateStateForPendingOperation(handleIncreaseDeviceVolume(1), new t1.UGc() { // from class: androidx.media3.common.QaP
                @Override // t1.UGc
                public final Object get() {
                    SimpleBasePlayer.State state2 = state;
                    return state2.buildUpon().setDeviceVolume(state2.deviceVolume + 1).build();
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    @Deprecated
    public final void setDeviceMuted(final boolean z2) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(26)) {
            updateStateForPendingOperation(handleSetDeviceMuted(z2, 1), new t1.UGc() { // from class: androidx.media3.common.xZD
                @Override // t1.UGc
                public final Object get() {
                    return state.buildUpon().setIsDeviceMuted(z2).build();
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    @Deprecated
    public final void setDeviceVolume(final int i2) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(25)) {
            updateStateForPendingOperation(handleSetDeviceVolume(i2, 1), new t1.UGc() { // from class: androidx.media3.common.Z
                @Override // t1.UGc
                public final Object get() {
                    return state.buildUpon().setDeviceVolume(i2).build();
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    public final void setMediaItems(List<MediaItem> list, boolean z2) {
        verifyApplicationThreadAndInitState();
        setMediaItemsInternal(list, z2 ? -1 : this.state.currentMediaItemIndex, z2 ? -9223372036854775807L : this.state.contentPositionMsSupplier.get());
    }

    protected SimpleBasePlayer(Looper looper, Clock clock) {
        this.applicationLooper = looper;
        this.applicationHandler = clock.createHandler(looper, null);
        this.pendingOperations = new HashSet<>();
        this.period = new Timeline.Period();
        this.listeners = new ListenerSet<>(looper, clock, new ListenerSet.IterationFinishedEvent() { // from class: androidx.media3.common.p
            @Override // androidx.media3.common.util.ListenerSet.IterationFinishedEvent
            public final void invoke(Object obj, FlagSet flagSet) {
                SimpleBasePlayer.o(this.f39304n, (Player.Listener) obj, flagSet);
            }
        });
    }

    public static /* synthetic */ State HI(SimpleBasePlayer simpleBasePlayer, State state, List list, int i2, int i3) {
        List<MediaItemData> listBuildMutablePlaylistFromState = buildMutablePlaylistFromState(state, simpleBasePlayer.period, simpleBasePlayer.window);
        for (int i5 = 0; i5 < list.size(); i5++) {
            listBuildMutablePlaylistFromState.add(i5 + i2, simpleBasePlayer.getPlaceholderMediaItemData((MediaItem) list.get(i5)));
        }
        State stateWithNewPlaylist = !state.timeline.isEmpty() ? getStateWithNewPlaylist(state, listBuildMutablePlaylistFromState, simpleBasePlayer.period, simpleBasePlayer.window) : getStateWithNewPlaylistAndPosition(state, listBuildMutablePlaylistFromState, state.currentMediaItemIndex, state.contentPositionMsSupplier.get(), simpleBasePlayer.window);
        if (i3 >= i2) {
            return stateWithNewPlaylist;
        }
        Util.removeRange(listBuildMutablePlaylistFromState, i3, i2);
        return getStateWithNewPlaylist(stateWithNewPlaylist, listBuildMutablePlaylistFromState, simpleBasePlayer.period, simpleBasePlayer.window);
    }

    public static /* synthetic */ State N(SimpleBasePlayer simpleBasePlayer, State state, int i2, int i3, int i5) {
        List<MediaItemData> listBuildMutablePlaylistFromState = buildMutablePlaylistFromState(state, simpleBasePlayer.period, simpleBasePlayer.window);
        Util.moveItems(listBuildMutablePlaylistFromState, i2, i3, i5);
        return getStateWithNewPlaylist(state, listBuildMutablePlaylistFromState, simpleBasePlayer.period, simpleBasePlayer.window);
    }

    public static /* synthetic */ State O(SimpleBasePlayer simpleBasePlayer, boolean z2, State state, int i2, long j2) {
        if (!z2) {
            return getStateWithNewPlaylistAndPosition(state, null, i2, j2, simpleBasePlayer.window);
        }
        simpleBasePlayer.getClass();
        return state;
    }

    public static /* synthetic */ void U(State state, Player.Listener listener) {
        listener.onCues(state.currentCues.cues);
        listener.onCues(state.currentCues);
    }

    private static List<MediaItemData> buildMutablePlaylistFromState(State state, Timeline.Period period, Timeline.Window window) {
        if (state.timeline instanceof PlaylistTimeline) {
            return new ArrayList(((PlaylistTimeline) state.timeline).playlist);
        }
        ArrayList arrayList = new ArrayList(state.timeline.getWindowCount());
        for (int i2 = 0; i2 < state.timeline.getWindowCount(); i2++) {
            arrayList.add(MediaItemData.buildFromState(state, i2, period, window));
        }
        return arrayList;
    }

    private static State buildStateForNewPosition(State.Builder builder, State state, long j2, Timeline timeline, int i2, long j3, boolean z2, Timeline.Window window) {
        long defaultPositionMs;
        int i3 = i2;
        long positionOrDefaultInMediaItem = getPositionOrDefaultInMediaItem(j2, state, window);
        boolean z3 = false;
        if (timeline.isEmpty() || (i3 != -1 && i3 < timeline.getWindowCount())) {
            defaultPositionMs = j3;
        } else {
            defaultPositionMs = -9223372036854775807L;
            i3 = 0;
        }
        if (!timeline.isEmpty() && defaultPositionMs == -9223372036854775807L) {
            defaultPositionMs = timeline.getWindow(i3, window).getDefaultPositionMs();
        }
        boolean z4 = state.timeline.isEmpty() || timeline.isEmpty();
        boolean z5 = (z4 || state.timeline.getWindow(getCurrentMediaItemIndexInternal(state), window).uid.equals(timeline.getWindow(i3, window).uid)) ? false : true;
        if (timeline.isEmpty()) {
            builder.setPlaylist(timeline, Tracks.EMPTY, null);
        } else if (timeline instanceof PlaylistTimeline) {
            MediaItemData mediaItemData = (MediaItemData) ((PlaylistTimeline) timeline).playlist.get(i3);
            builder.setPlaylist(timeline, mediaItemData.tracks, mediaItemData.mediaMetadata);
        } else {
            if (!z4 && !z5) {
                z3 = true;
            }
            builder.setPlaylist(timeline, z3 ? state.currentTracks : Tracks.EMPTY, z3 ? state.currentMetadata : null);
        }
        if (z4 || z5 || defaultPositionMs < positionOrDefaultInMediaItem) {
            builder.setCurrentMediaItemIndex(i3).setCurrentAd(-1, -1).setContentPositionMs(defaultPositionMs).setContentBufferedPositionMs(PositionSupplier.getConstant(defaultPositionMs)).setTotalBufferedDurationMs(PositionSupplier.ZERO);
        } else if (defaultPositionMs == positionOrDefaultInMediaItem) {
            builder.setCurrentMediaItemIndex(i3);
            if (state.currentAdGroupIndex == -1 || !z2) {
                builder.setCurrentAd(-1, -1).setTotalBufferedDurationMs(PositionSupplier.getConstant(getContentBufferedPositionMsInternal(state, window) - positionOrDefaultInMediaItem));
            } else {
                builder.setTotalBufferedDurationMs(PositionSupplier.getConstant(state.adBufferedPositionMsSupplier.get() - state.adPositionMsSupplier.get()));
            }
        } else {
            builder.setCurrentMediaItemIndex(i3).setCurrentAd(-1, -1).setContentPositionMs(defaultPositionMs).setContentBufferedPositionMs(PositionSupplier.getConstant(Math.max(getContentBufferedPositionMsInternal(state, window), defaultPositionMs))).setTotalBufferedDurationMs(PositionSupplier.getConstant(Math.max(0L, state.totalBufferedDurationMsSupplier.get() - (defaultPositionMs - positionOrDefaultInMediaItem))));
        }
        return builder.build();
    }

    public static /* synthetic */ void ck(SimpleBasePlayer simpleBasePlayer, com.google.common.util.concurrent.Xo xo) {
        Util.castNonNull(simpleBasePlayer.state);
        simpleBasePlayer.pendingOperations.remove(xo);
        if (!simpleBasePlayer.pendingOperations.isEmpty() || simpleBasePlayer.released) {
            return;
        }
        simpleBasePlayer.updateStateAndInformListeners(simpleBasePlayer.getState(), false, false);
    }

    public static /* synthetic */ State fD(SimpleBasePlayer simpleBasePlayer, State state, List list, int i2) {
        List<MediaItemData> listBuildMutablePlaylistFromState = buildMutablePlaylistFromState(state, simpleBasePlayer.period, simpleBasePlayer.window);
        for (int i3 = 0; i3 < list.size(); i3++) {
            listBuildMutablePlaylistFromState.add(i3 + i2, simpleBasePlayer.getPlaceholderMediaItemData((MediaItem) list.get(i3)));
        }
        return !state.timeline.isEmpty() ? getStateWithNewPlaylist(state, listBuildMutablePlaylistFromState, simpleBasePlayer.period, simpleBasePlayer.window) : getStateWithNewPlaylistAndPosition(state, listBuildMutablePlaylistFromState, state.currentMediaItemIndex, state.contentPositionMsSupplier.get(), simpleBasePlayer.window);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static MediaMetadata getCombinedMediaMetadata(MediaItem mediaItem, Tracks tracks) {
        MediaMetadata.Builder builder = new MediaMetadata.Builder();
        int size = tracks.getGroups().size();
        for (int i2 = 0; i2 < size; i2++) {
            Tracks.Group group = (Tracks.Group) tracks.getGroups().get(i2);
            for (int i3 = 0; i3 < group.length; i3++) {
                if (group.isTrackSelected(i3)) {
                    Format trackFormat = group.getTrackFormat(i3);
                    if (trackFormat.metadata != null) {
                        for (int i5 = 0; i5 < trackFormat.metadata.length(); i5++) {
                            trackFormat.metadata.get(i5).populateMediaMetadata(builder);
                        }
                    }
                }
            }
        }
        return builder.populate(mediaItem.mediaMetadata).build();
    }

    private static long getContentBufferedPositionMsInternal(State state, Timeline.Window window) {
        return getPositionOrDefaultInMediaItem(state.contentBufferedPositionMsSupplier.get(), state, window);
    }

    private static long getContentPositionMsInternal(State state, Timeline.Window window) {
        return getPositionOrDefaultInMediaItem(state.contentPositionMsSupplier.get(), state, window);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getCurrentMediaItemIndexInternal(State state) {
        int i2 = state.currentMediaItemIndex;
        if (i2 != -1) {
            return i2;
        }
        return 0;
    }

    private static long getCurrentPeriodOrAdPositionMs(State state, Object obj, Timeline.Period period, Timeline.Window window) {
        return state.currentAdGroupIndex != -1 ? state.adPositionMsSupplier.get() : getContentPositionMsInternal(state, window) - state.timeline.getPeriodByUid(obj, period).getPositionInWindowMs();
    }

    private static int getMediaItemTransitionReason(State state, State state2, int i2, boolean z2, Timeline.Window window) {
        Timeline timeline = state.timeline;
        Timeline timeline2 = state2.timeline;
        if (timeline2.isEmpty() && timeline.isEmpty()) {
            return -1;
        }
        if (timeline2.isEmpty() != timeline.isEmpty()) {
            return 3;
        }
        Object obj = state.timeline.getWindow(getCurrentMediaItemIndexInternal(state), window).uid;
        Object obj2 = state2.timeline.getWindow(getCurrentMediaItemIndexInternal(state2), window).uid;
        if ((obj instanceof PlaceholderUid) && !(obj2 instanceof PlaceholderUid)) {
            return -1;
        }
        if (!obj.equals(obj2)) {
            if (i2 == 0) {
                return 1;
            }
            return i2 == 1 ? 2 : 3;
        }
        if (i2 != 0 || getContentPositionMsInternal(state, window) <= getContentPositionMsInternal(state2, window)) {
            return (i2 == 1 && z2) ? 2 : -1;
        }
        return 0;
    }

    private static long getPeriodOrAdDurationMs(State state, Object obj, Timeline.Period period) {
        state.timeline.getPeriodByUid(obj, period);
        int i2 = state.currentAdGroupIndex;
        return Util.usToMs(i2 == -1 ? period.durationUs : period.getAdDurationUs(i2, state.currentAdIndexInAdGroup));
    }

    private static int getPositionDiscontinuityReason(State state, State state2, boolean z2, Timeline.Window window, Timeline.Period period) {
        if (state2.hasPositionDiscontinuity) {
            return state2.positionDiscontinuityReason;
        }
        if (z2) {
            return 1;
        }
        if (state.timeline.isEmpty()) {
            return -1;
        }
        if (state2.timeline.isEmpty()) {
            return 4;
        }
        Object uidOfPeriod = state.timeline.getUidOfPeriod(getCurrentPeriodIndexInternal(state, window, period));
        Object uidOfPeriod2 = state2.timeline.getUidOfPeriod(getCurrentPeriodIndexInternal(state2, window, period));
        if ((uidOfPeriod instanceof PlaceholderUid) && !(uidOfPeriod2 instanceof PlaceholderUid)) {
            return -1;
        }
        if (uidOfPeriod2.equals(uidOfPeriod) && state.currentAdGroupIndex == state2.currentAdGroupIndex && state.currentAdIndexInAdGroup == state2.currentAdIndexInAdGroup) {
            long currentPeriodOrAdPositionMs = getCurrentPeriodOrAdPositionMs(state, uidOfPeriod, period, window);
            if (Math.abs(currentPeriodOrAdPositionMs - getCurrentPeriodOrAdPositionMs(state2, uidOfPeriod2, period, window)) < 1000) {
                return -1;
            }
            long periodOrAdDurationMs = getPeriodOrAdDurationMs(state, uidOfPeriod, period);
            return (periodOrAdDurationMs == -9223372036854775807L || currentPeriodOrAdPositionMs < periodOrAdDurationMs) ? 5 : 0;
        }
        if (state2.timeline.getIndexOfPeriod(uidOfPeriod) == -1) {
            return 4;
        }
        long currentPeriodOrAdPositionMs2 = getCurrentPeriodOrAdPositionMs(state, uidOfPeriod, period, window);
        long periodOrAdDurationMs2 = getPeriodOrAdDurationMs(state, uidOfPeriod, period);
        return (periodOrAdDurationMs2 == -9223372036854775807L || currentPeriodOrAdPositionMs2 < periodOrAdDurationMs2) ? 3 : 0;
    }

    private static boolean isPlaying(State state) {
        return state.playWhenReady && state.playbackState == 3 && state.playbackSuppressionReason == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postOrRunOnApplicationHandler(Runnable runnable) {
        if (this.applicationHandler.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            this.applicationHandler.post(runnable);
        }
    }

    private boolean shouldHandleCommand(int i2) {
        return !this.released && this.state.availableCommands.contains(i2);
    }

    public static /* synthetic */ State t(SimpleBasePlayer simpleBasePlayer, State state, int i2, int i3) {
        List<MediaItemData> listBuildMutablePlaylistFromState = buildMutablePlaylistFromState(state, simpleBasePlayer.period, simpleBasePlayer.window);
        Util.removeRange(listBuildMutablePlaylistFromState, i2, i3);
        return getStateWithNewPlaylist(state, listBuildMutablePlaylistFromState, simpleBasePlayer.period, simpleBasePlayer.window);
    }

    public static /* synthetic */ void te(State state, Player.Listener listener) {
        listener.onLoadingChanged(state.isLoading);
        listener.onIsLoadingChanged(state.isLoading);
    }

    private void updateStateForPendingOperation(final com.google.common.util.concurrent.Xo xo, t1.UGc uGc, boolean z2, boolean z3) {
        if (xo.isDone() && this.pendingOperations.isEmpty()) {
            updateStateAndInformListeners(getState(), z2, z3);
            return;
        }
        this.pendingOperations.add(xo);
        updateStateAndInformListeners(getPlaceholderState((State) uGc.get()), z2, z3);
        xo.addListener(new Runnable() { // from class: androidx.media3.common.m
            @Override // java.lang.Runnable
            public final void run() {
                SimpleBasePlayer.ck(this.f39296n, xo);
            }
        }, new Executor() { // from class: androidx.media3.common.iF
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                this.f39289n.postOrRunOnApplicationHandler(runnable);
            }
        });
    }

    @Override // androidx.media3.common.Player
    public final void addListener(Player.Listener listener) {
        this.listeners.add((Player.Listener) Assertions.checkNotNull(listener));
    }

    @Override // androidx.media3.common.Player
    public final void clearVideoSurface(@Nullable Surface surface) {
        clearVideoOutput(surface);
    }

    @Override // androidx.media3.common.Player
    public final Looper getApplicationLooper() {
        return this.applicationLooper;
    }

    protected MediaItemData getPlaceholderMediaItemData(MediaItem mediaItem) {
        return new MediaItemData.Builder(new PlaceholderUid()).setMediaItem(mediaItem).setIsDynamic(true).setIsPlaceholder(true).build();
    }

    protected com.google.common.util.concurrent.Xo handleAddMediaItems(int i2, List<MediaItem> list) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_CHANGE_MEDIA_ITEMS");
    }

    protected com.google.common.util.concurrent.Xo handleClearVideoOutput(@Nullable Object obj) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_VIDEO_SURFACE");
    }

    protected com.google.common.util.concurrent.Xo handleDecreaseDeviceVolume(int i2) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_ADJUST_DEVICE_VOLUME or COMMAND_ADJUST_DEVICE_VOLUME_WITH_FLAGS");
    }

    protected com.google.common.util.concurrent.Xo handleIncreaseDeviceVolume(int i2) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_ADJUST_DEVICE_VOLUME or COMMAND_ADJUST_DEVICE_VOLUME_WITH_FLAGS");
    }

    protected com.google.common.util.concurrent.Xo handleMoveMediaItems(int i2, int i3, int i5) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_CHANGE_MEDIA_ITEMS");
    }

    protected com.google.common.util.concurrent.Xo handlePrepare() {
        throw new IllegalStateException("Missing implementation to handle COMMAND_PREPARE");
    }

    protected com.google.common.util.concurrent.Xo handleRelease() {
        throw new IllegalStateException("Missing implementation to handle COMMAND_RELEASE");
    }

    protected com.google.common.util.concurrent.Xo handleRemoveMediaItems(int i2, int i3) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_CHANGE_MEDIA_ITEMS");
    }

    protected com.google.common.util.concurrent.Xo handleSeek(int i2, long j2, int i3) {
        throw new IllegalStateException("Missing implementation to handle one of the COMMAND_SEEK_*");
    }

    protected com.google.common.util.concurrent.Xo handleSetAudioAttributes(AudioAttributes audioAttributes, boolean z2) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_AUDIO_ATTRIBUTES");
    }

    protected com.google.common.util.concurrent.Xo handleSetDeviceMuted(boolean z2, int i2) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_ADJUST_DEVICE_VOLUME or COMMAND_ADJUST_DEVICE_VOLUME_WITH_FLAGS");
    }

    protected com.google.common.util.concurrent.Xo handleSetDeviceVolume(@IntRange int i2, int i3) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_DEVICE_VOLUME or COMMAND_SET_DEVICE_VOLUME_WITH_FLAGS");
    }

    protected com.google.common.util.concurrent.Xo handleSetMediaItems(List<MediaItem> list, int i2, long j2) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_MEDIA_ITEM(S)");
    }

    protected com.google.common.util.concurrent.Xo handleSetPlayWhenReady(boolean z2) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_PLAY_PAUSE");
    }

    protected com.google.common.util.concurrent.Xo handleSetPlaybackParameters(PlaybackParameters playbackParameters) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_SPEED_AND_PITCH");
    }

    protected com.google.common.util.concurrent.Xo handleSetPlaylistMetadata(MediaMetadata mediaMetadata) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_PLAYLIST_METADATA");
    }

    protected com.google.common.util.concurrent.Xo handleSetRepeatMode(int i2) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_REPEAT_MODE");
    }

    protected com.google.common.util.concurrent.Xo handleSetShuffleModeEnabled(boolean z2) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_SHUFFLE_MODE");
    }

    protected com.google.common.util.concurrent.Xo handleSetTrackSelectionParameters(TrackSelectionParameters trackSelectionParameters) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_TRACK_SELECTION_PARAMETERS");
    }

    protected com.google.common.util.concurrent.Xo handleSetVideoOutput(Object obj) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_VIDEO_SURFACE");
    }

    protected com.google.common.util.concurrent.Xo handleSetVolume(@FloatRange float f3) {
        throw new IllegalStateException("Missing implementation to handle COMMAND_SET_VOLUME");
    }

    protected com.google.common.util.concurrent.Xo handleStop() {
        throw new IllegalStateException("Missing implementation to handle COMMAND_STOP");
    }

    private void clearVideoOutput(@Nullable Object obj) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (!shouldHandleCommand(27)) {
            return;
        }
        updateStateForPendingOperation(handleClearVideoOutput(obj), new t1.UGc() { // from class: androidx.media3.common.M5
            @Override // t1.UGc
            public final Object get() {
                return state.buildUpon().setSurfaceSize(Size.ZERO).build();
            }
        });
    }

    public static /* synthetic */ void e(int i2, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, Player.Listener listener) {
        listener.onPositionDiscontinuity(i2);
        listener.onPositionDiscontinuity(positionInfo, positionInfo2, i2);
    }

    private static int getCurrentPeriodIndexInternal(State state, Timeline.Window window, Timeline.Period period) {
        int currentMediaItemIndexInternal = getCurrentMediaItemIndexInternal(state);
        if (state.timeline.isEmpty()) {
            return currentMediaItemIndexInternal;
        }
        return getPeriodIndexFromWindowPosition(state.timeline, currentMediaItemIndexInternal, getContentPositionMsInternal(state, window), window, period);
    }

    private static int getMediaItemIndexInNewPlaylist(Timeline timeline, Timeline timeline2, int i2, Timeline.Period period, Timeline.Window window) {
        if (timeline.isEmpty()) {
            if (i2 >= timeline2.getWindowCount()) {
                return -1;
            }
            return i2;
        }
        Object objCheckNotNull = Assertions.checkNotNull(timeline.getPeriod(timeline.getWindow(i2, window).firstPeriodIndex, period, true).uid);
        if (timeline2.getIndexOfPeriod(objCheckNotNull) == -1) {
            return -1;
        }
        return timeline2.getPeriodByUid(objCheckNotNull, period).windowIndex;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int getPeriodIndexFromWindowPosition(Timeline timeline, int i2, long j2, Timeline.Window window, Timeline.Period period) {
        return timeline.getIndexOfPeriod(timeline.getPeriodPositionUs(window, period, i2, Util.msToUs(j2)).first);
    }

    private static Player.PositionInfo getPositionInfo(State state, boolean z2, Timeline.Window window, Timeline.Period period) {
        MediaItem mediaItem;
        Object obj;
        Object obj2;
        int i2;
        long contentPositionMsInternal;
        long j2;
        int currentMediaItemIndexInternal = getCurrentMediaItemIndexInternal(state);
        if (!state.timeline.isEmpty()) {
            int currentPeriodIndexInternal = getCurrentPeriodIndexInternal(state, window, period);
            Object obj3 = state.timeline.getPeriod(currentPeriodIndexInternal, period, true).uid;
            obj = state.timeline.getWindow(currentMediaItemIndexInternal, window).uid;
            obj2 = obj3;
            mediaItem = window.mediaItem;
            i2 = currentPeriodIndexInternal;
        } else {
            mediaItem = null;
            obj = null;
            obj2 = null;
            i2 = -1;
        }
        if (z2) {
            j2 = state.discontinuityPositionMs;
            contentPositionMsInternal = state.currentAdGroupIndex == -1 ? j2 : getContentPositionMsInternal(state, window);
        } else {
            contentPositionMsInternal = getContentPositionMsInternal(state, window);
            j2 = state.currentAdGroupIndex != -1 ? state.adPositionMsSupplier.get() : contentPositionMsInternal;
        }
        return new Player.PositionInfo(obj, currentMediaItemIndexInternal, mediaItem, obj2, i2, j2, contentPositionMsInternal, state.currentAdGroupIndex, state.currentAdIndexInAdGroup);
    }

    private static State getStateWithNewPlaylist(State state, List<MediaItemData> list, Timeline.Period period, Timeline.Window window) {
        long j2;
        State.Builder builderBuildUpon = state.buildUpon();
        PlaylistTimeline playlistTimeline = new PlaylistTimeline(list);
        Timeline timeline = state.timeline;
        long j3 = state.contentPositionMsSupplier.get();
        int currentMediaItemIndexInternal = getCurrentMediaItemIndexInternal(state);
        int mediaItemIndexInNewPlaylist = getMediaItemIndexInNewPlaylist(timeline, playlistTimeline, currentMediaItemIndexInternal, period, window);
        if (mediaItemIndexInNewPlaylist == -1) {
            j2 = -9223372036854775807L;
        } else {
            j2 = j3;
        }
        for (int i2 = currentMediaItemIndexInternal + 1; mediaItemIndexInNewPlaylist == -1 && i2 < timeline.getWindowCount(); i2++) {
            mediaItemIndexInNewPlaylist = getMediaItemIndexInNewPlaylist(timeline, playlistTimeline, i2, period, window);
        }
        if (state.playbackState != 1 && mediaItemIndexInNewPlaylist == -1) {
            builderBuildUpon.setPlaybackState(4).setIsLoading(false);
        }
        return buildStateForNewPosition(builderBuildUpon, state, j3, playlistTimeline, mediaItemIndexInNewPlaylist, j2, true, window);
    }

    private static State getStateWithNewPlaylistAndPosition(State state, @Nullable List<MediaItemData> list, int i2, long j2, Timeline.Window window) {
        Timeline playlistTimeline;
        State.Builder builderBuildUpon = state.buildUpon();
        if (list == null) {
            playlistTimeline = state.timeline;
        } else {
            playlistTimeline = new PlaylistTimeline(list);
        }
        if (state.playbackState != 1) {
            if (!playlistTimeline.isEmpty() && (i2 == -1 || i2 < playlistTimeline.getWindowCount())) {
                builderBuildUpon.setPlaybackState(2);
            } else {
                builderBuildUpon.setPlaybackState(4).setIsLoading(false);
            }
        }
        return buildStateForNewPosition(builderBuildUpon, state, state.contentPositionMsSupplier.get(), playlistTimeline, i2, j2, false, window);
    }

    private static Size getSurfaceHolderSize(SurfaceHolder surfaceHolder) {
        if (!surfaceHolder.getSurface().isValid()) {
            return Size.ZERO;
        }
        Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
        return new Size(surfaceFrame.width(), surfaceFrame.height());
    }

    private static int getTimelineChangeReason(Timeline timeline, Timeline timeline2, Timeline.Window window) {
        if (timeline.getWindowCount() != timeline2.getWindowCount()) {
            return 0;
        }
        int i2 = 0;
        while (true) {
            boolean z2 = true;
            if (i2 >= timeline.getWindowCount()) {
                return 1;
            }
            Object obj = timeline.getWindow(i2, window).uid;
            Object obj2 = timeline2.getWindow(i2, window).uid;
            if (!(obj instanceof PlaceholderUid) || (obj2 instanceof PlaceholderUid)) {
                z2 = false;
            }
            if (!obj.equals(obj2) && !z2) {
                return 0;
            }
            i2++;
        }
    }

    public static /* synthetic */ State jB(SimpleBasePlayer simpleBasePlayer, State state) {
        simpleBasePlayer.getClass();
        return state.buildUpon().setPlaybackState(1).setTotalBufferedDurationMs(PositionSupplier.ZERO).setContentBufferedPositionMs(PositionSupplier.getConstant(getContentPositionMsInternal(state, simpleBasePlayer.window))).setAdBufferedPositionMs(state.adPositionMsSupplier).setIsLoading(false).build();
    }

    public static /* synthetic */ State n(SimpleBasePlayer simpleBasePlayer, List list, State state, int i2, long j2) {
        simpleBasePlayer.getClass();
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            arrayList.add(simpleBasePlayer.getPlaceholderMediaItemData((MediaItem) list.get(i3)));
        }
        return getStateWithNewPlaylistAndPosition(state, arrayList, i2, j2, simpleBasePlayer.window);
    }

    public static /* synthetic */ void o(SimpleBasePlayer simpleBasePlayer, Player.Listener listener, FlagSet flagSet) {
        simpleBasePlayer.getClass();
        listener.onEvents(simpleBasePlayer, new Player.Events(flagSet));
    }

    public static /* synthetic */ State ty(State state) {
        int i2;
        State.Builder playerError = state.buildUpon().setPlayerError(null);
        if (state.timeline.isEmpty()) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        return playerError.setPlaybackState(i2).build();
    }

    private void verifyApplicationThreadAndInitState() {
        verifyApplicationThread();
        if (this.state == null) {
            this.state = getState();
        }
    }

    @Override // androidx.media3.common.Player
    public final void addMediaItems(int i2, final List<MediaItem> list) {
        boolean z2;
        verifyApplicationThreadAndInitState();
        if (i2 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Assertions.checkArgument(z2);
        final State state = this.state;
        int windowCount = state.timeline.getWindowCount();
        if (shouldHandleCommand(20) && !list.isEmpty()) {
            final int iMin = Math.min(i2, windowCount);
            updateStateForPendingOperation(handleAddMediaItems(iMin, list), new t1.UGc() { // from class: androidx.media3.common.Sis
                @Override // t1.UGc
                public final Object get() {
                    return SimpleBasePlayer.fD(this.f39258n, state, list, iMin);
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    public final void clearVideoSurfaceHolder(@Nullable SurfaceHolder surfaceHolder) {
        clearVideoOutput(surfaceHolder);
    }

    @Override // androidx.media3.common.Player
    public final void clearVideoSurfaceView(@Nullable SurfaceView surfaceView) {
        clearVideoOutput(surfaceView);
    }

    @Override // androidx.media3.common.Player
    public final void clearVideoTextureView(@Nullable TextureView textureView) {
        clearVideoOutput(textureView);
    }

    @Override // androidx.media3.common.Player
    public final AudioAttributes getAudioAttributes() {
        verifyApplicationThreadAndInitState();
        return this.state.audioAttributes;
    }

    @Override // androidx.media3.common.Player
    public final Player.Commands getAvailableCommands() {
        verifyApplicationThreadAndInitState();
        return this.state.availableCommands;
    }

    @Override // androidx.media3.common.Player
    public final long getBufferedPosition() {
        verifyApplicationThreadAndInitState();
        if (isPlayingAd()) {
            return Math.max(this.state.adBufferedPositionMsSupplier.get(), this.state.adPositionMsSupplier.get());
        }
        return getContentBufferedPosition();
    }

    @Override // androidx.media3.common.Player
    public final long getContentBufferedPosition() {
        verifyApplicationThreadAndInitState();
        return Math.max(getContentBufferedPositionMsInternal(this.state, this.window), getContentPositionMsInternal(this.state, this.window));
    }

    @Override // androidx.media3.common.Player
    public final long getContentPosition() {
        verifyApplicationThreadAndInitState();
        return getContentPositionMsInternal(this.state, this.window);
    }

    @Override // androidx.media3.common.Player
    public final int getCurrentAdGroupIndex() {
        verifyApplicationThreadAndInitState();
        return this.state.currentAdGroupIndex;
    }

    @Override // androidx.media3.common.Player
    public final int getCurrentAdIndexInAdGroup() {
        verifyApplicationThreadAndInitState();
        return this.state.currentAdIndexInAdGroup;
    }

    @Override // androidx.media3.common.Player
    public final CueGroup getCurrentCues() {
        verifyApplicationThreadAndInitState();
        return this.state.currentCues;
    }

    @Override // androidx.media3.common.Player
    public final int getCurrentMediaItemIndex() {
        verifyApplicationThreadAndInitState();
        return getCurrentMediaItemIndexInternal(this.state);
    }

    @Override // androidx.media3.common.Player
    public final int getCurrentPeriodIndex() {
        verifyApplicationThreadAndInitState();
        return getCurrentPeriodIndexInternal(this.state, this.window, this.period);
    }

    @Override // androidx.media3.common.Player
    public final long getCurrentPosition() {
        verifyApplicationThreadAndInitState();
        if (isPlayingAd()) {
            return this.state.adPositionMsSupplier.get();
        }
        return getContentPosition();
    }

    @Override // androidx.media3.common.Player
    public final Timeline getCurrentTimeline() {
        verifyApplicationThreadAndInitState();
        return this.state.timeline;
    }

    @Override // androidx.media3.common.Player
    public final Tracks getCurrentTracks() {
        verifyApplicationThreadAndInitState();
        return this.state.currentTracks;
    }

    @Override // androidx.media3.common.Player
    public final DeviceInfo getDeviceInfo() {
        verifyApplicationThreadAndInitState();
        return this.state.deviceInfo;
    }

    @Override // androidx.media3.common.Player
    public final int getDeviceVolume() {
        verifyApplicationThreadAndInitState();
        return this.state.deviceVolume;
    }

    @Override // androidx.media3.common.Player
    public final long getDuration() {
        verifyApplicationThreadAndInitState();
        if (isPlayingAd()) {
            this.state.timeline.getPeriod(getCurrentPeriodIndex(), this.period);
            Timeline.Period period = this.period;
            State state = this.state;
            return Util.usToMs(period.getAdDurationUs(state.currentAdGroupIndex, state.currentAdIndexInAdGroup));
        }
        return getContentDuration();
    }

    @Override // androidx.media3.common.Player
    public final long getMaxSeekToPreviousPosition() {
        verifyApplicationThreadAndInitState();
        return this.state.maxSeekToPreviousPositionMs;
    }

    @Override // androidx.media3.common.Player
    public final MediaMetadata getMediaMetadata() {
        verifyApplicationThreadAndInitState();
        return this.state.currentMetadata;
    }

    @Override // androidx.media3.common.Player
    public final boolean getPlayWhenReady() {
        verifyApplicationThreadAndInitState();
        return this.state.playWhenReady;
    }

    @Override // androidx.media3.common.Player
    public final PlaybackParameters getPlaybackParameters() {
        verifyApplicationThreadAndInitState();
        return this.state.playbackParameters;
    }

    @Override // androidx.media3.common.Player
    public final int getPlaybackState() {
        verifyApplicationThreadAndInitState();
        return this.state.playbackState;
    }

    @Override // androidx.media3.common.Player
    public final int getPlaybackSuppressionReason() {
        verifyApplicationThreadAndInitState();
        return this.state.playbackSuppressionReason;
    }

    @Override // androidx.media3.common.Player
    @Nullable
    public final PlaybackException getPlayerError() {
        verifyApplicationThreadAndInitState();
        return this.state.playerError;
    }

    @Override // androidx.media3.common.Player
    public final MediaMetadata getPlaylistMetadata() {
        verifyApplicationThreadAndInitState();
        return this.state.playlistMetadata;
    }

    @Override // androidx.media3.common.Player
    public final int getRepeatMode() {
        verifyApplicationThreadAndInitState();
        return this.state.repeatMode;
    }

    @Override // androidx.media3.common.Player
    public final long getSeekBackIncrement() {
        verifyApplicationThreadAndInitState();
        return this.state.seekBackIncrementMs;
    }

    @Override // androidx.media3.common.Player
    public final long getSeekForwardIncrement() {
        verifyApplicationThreadAndInitState();
        return this.state.seekForwardIncrementMs;
    }

    @Override // androidx.media3.common.Player
    public final boolean getShuffleModeEnabled() {
        verifyApplicationThreadAndInitState();
        return this.state.shuffleModeEnabled;
    }

    @Override // androidx.media3.common.Player
    public final Size getSurfaceSize() {
        verifyApplicationThreadAndInitState();
        return this.state.surfaceSize;
    }

    @Override // androidx.media3.common.Player
    public final long getTotalBufferedDuration() {
        verifyApplicationThreadAndInitState();
        return this.state.totalBufferedDurationMsSupplier.get();
    }

    @Override // androidx.media3.common.Player
    public final TrackSelectionParameters getTrackSelectionParameters() {
        verifyApplicationThreadAndInitState();
        return this.state.trackSelectionParameters;
    }

    @Override // androidx.media3.common.Player
    public final VideoSize getVideoSize() {
        verifyApplicationThreadAndInitState();
        return this.state.videoSize;
    }

    @Override // androidx.media3.common.Player
    public final float getVolume() {
        verifyApplicationThreadAndInitState();
        return this.state.volume;
    }

    protected com.google.common.util.concurrent.Xo handleReplaceMediaItems(int i2, int i3, List<MediaItem> list) {
        com.google.common.util.concurrent.Xo xoHandleAddMediaItems = handleAddMediaItems(i3, list);
        if (i2 == i3) {
            return xoHandleAddMediaItems;
        }
        final com.google.common.util.concurrent.Xo xoHandleRemoveMediaItems = handleRemoveMediaItems(i2, i3);
        return Util.transformFutureAsync(xoHandleAddMediaItems, new com.google.common.util.concurrent.w6() { // from class: androidx.media3.common.RzR
            @Override // com.google.common.util.concurrent.w6
            public final com.google.common.util.concurrent.Xo apply(Object obj) {
                return SimpleBasePlayer.r(xoHandleRemoveMediaItems, obj);
            }
        });
    }

    protected final void invalidateState() {
        verifyApplicationThreadAndInitState();
        if (this.pendingOperations.isEmpty() && !this.released) {
            updateStateAndInformListeners(getState(), false, false);
        }
    }

    @Override // androidx.media3.common.Player
    public final boolean isDeviceMuted() {
        verifyApplicationThreadAndInitState();
        return this.state.isDeviceMuted;
    }

    @Override // androidx.media3.common.Player
    public final boolean isLoading() {
        verifyApplicationThreadAndInitState();
        return this.state.isLoading;
    }

    @Override // androidx.media3.common.Player
    public final boolean isPlayingAd() {
        verifyApplicationThreadAndInitState();
        if (this.state.currentAdGroupIndex != -1) {
            return true;
        }
        return false;
    }

    @Override // androidx.media3.common.Player
    public final void moveMediaItems(final int i2, int i3, int i5) {
        boolean z2;
        verifyApplicationThreadAndInitState();
        if (i2 >= 0 && i3 >= i2 && i5 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Assertions.checkArgument(z2);
        final State state = this.state;
        int windowCount = state.timeline.getWindowCount();
        if (shouldHandleCommand(20) && windowCount != 0 && i2 < windowCount) {
            final int iMin = Math.min(i3, windowCount);
            final int iMin2 = Math.min(i5, windowCount - (iMin - i2));
            if (i2 != iMin && iMin2 != i2) {
                updateStateForPendingOperation(handleMoveMediaItems(i2, iMin, iMin2), new t1.UGc() { // from class: androidx.media3.common.YzO
                    @Override // t1.UGc
                    public final Object get() {
                        return SimpleBasePlayer.N(this.f39262n, state, i2, iMin, iMin2);
                    }
                });
            }
        }
    }

    @Override // androidx.media3.common.Player
    public final void prepare() {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (!shouldHandleCommand(2)) {
            return;
        }
        updateStateForPendingOperation(handlePrepare(), new t1.UGc() { // from class: androidx.media3.common.hQ
            @Override // t1.UGc
            public final Object get() {
                return SimpleBasePlayer.ty(state);
            }
        });
    }

    @Override // androidx.media3.common.Player
    public final void release() {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (!shouldHandleCommand(32)) {
            return;
        }
        updateStateForPendingOperation(handleRelease(), new t1.UGc() { // from class: androidx.media3.common.KH
            @Override // t1.UGc
            public final Object get() {
                return SimpleBasePlayer.ijL(state);
            }
        });
        this.released = true;
        this.listeners.release();
        this.state = this.state.buildUpon().setPlaybackState(1).setTotalBufferedDurationMs(PositionSupplier.ZERO).setContentBufferedPositionMs(PositionSupplier.getConstant(getContentPositionMsInternal(state, this.window))).setAdBufferedPositionMs(state.adPositionMsSupplier).setIsLoading(false).build();
    }

    @Override // androidx.media3.common.Player
    public final void removeListener(Player.Listener listener) {
        verifyApplicationThreadAndInitState();
        this.listeners.remove(listener);
    }

    @Override // androidx.media3.common.Player
    public final void removeMediaItems(final int i2, int i3) {
        boolean z2;
        final int iMin;
        verifyApplicationThreadAndInitState();
        if (i2 >= 0 && i3 >= i2) {
            z2 = true;
        } else {
            z2 = false;
        }
        Assertions.checkArgument(z2);
        final State state = this.state;
        int windowCount = state.timeline.getWindowCount();
        if (shouldHandleCommand(20) && windowCount != 0 && i2 < windowCount && i2 != (iMin = Math.min(i3, windowCount))) {
            updateStateForPendingOperation(handleRemoveMediaItems(i2, iMin), new t1.UGc() { // from class: androidx.media3.common.R6
                @Override // t1.UGc
                public final Object get() {
                    return SimpleBasePlayer.t(this.f39251n, state, i2, iMin);
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    public final void replaceMediaItems(final int i2, int i3, final List<MediaItem> list) {
        boolean z2;
        verifyApplicationThreadAndInitState();
        if (i2 >= 0 && i2 <= i3) {
            z2 = true;
        } else {
            z2 = false;
        }
        Assertions.checkArgument(z2);
        final State state = this.state;
        int windowCount = state.timeline.getWindowCount();
        if (shouldHandleCommand(20) && i2 <= windowCount) {
            final int iMin = Math.min(i3, windowCount);
            updateStateForPendingOperation(handleReplaceMediaItems(i2, iMin, list), new t1.UGc() { // from class: androidx.media3.common.Md
                @Override // t1.UGc
                public final Object get() {
                    return SimpleBasePlayer.HI(this.f39237n, state, list, iMin, i2);
                }
            });
        }
    }

    @Override // androidx.media3.common.BasePlayer
    protected final void seekTo(final int i2, final long j2, int i3, boolean z2) {
        boolean z3;
        final boolean z4;
        verifyApplicationThreadAndInitState();
        if (i2 != -1 && i2 < 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        Assertions.checkArgument(z3);
        final State state = this.state;
        if (!shouldHandleCommand(i3)) {
            return;
        }
        if (i2 != -1 && !isPlayingAd() && (state.timeline.isEmpty() || i2 < state.timeline.getWindowCount())) {
            z4 = false;
        } else {
            z4 = true;
        }
        updateStateForPendingOperation(handleSeek(i2, j2, i3), new t1.UGc() { // from class: androidx.media3.common.Fl
            @Override // t1.UGc
            public final Object get() {
                return SimpleBasePlayer.O(this.f39223n, z4, state, i2, j2);
            }
        }, !z4, z2);
    }

    @Override // androidx.media3.common.Player
    public final void setAudioAttributes(final AudioAttributes audioAttributes, boolean z2) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (!shouldHandleCommand(35)) {
            return;
        }
        updateStateForPendingOperation(handleSetAudioAttributes(audioAttributes, z2), new t1.UGc() { // from class: androidx.media3.common.FKk
            @Override // t1.UGc
            public final Object get() {
                return state.buildUpon().setAudioAttributes(audioAttributes).build();
            }
        });
    }

    @Override // androidx.media3.common.Player
    public final void setPlayWhenReady(final boolean z2) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (!shouldHandleCommand(1)) {
            return;
        }
        updateStateForPendingOperation(handleSetPlayWhenReady(z2), new t1.UGc() { // from class: androidx.media3.common.QJ
            @Override // t1.UGc
            public final Object get() {
                return state.buildUpon().setPlayWhenReady(z2, 1).build();
            }
        });
    }

    @Override // androidx.media3.common.Player
    public final void setPlaybackParameters(final PlaybackParameters playbackParameters) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (!shouldHandleCommand(13)) {
            return;
        }
        updateStateForPendingOperation(handleSetPlaybackParameters(playbackParameters), new t1.UGc() { // from class: androidx.media3.common.RGN
            @Override // t1.UGc
            public final Object get() {
                return state.buildUpon().setPlaybackParameters(playbackParameters).build();
            }
        });
    }

    @Override // androidx.media3.common.Player
    public final void setPlaylistMetadata(final MediaMetadata mediaMetadata) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (!shouldHandleCommand(19)) {
            return;
        }
        updateStateForPendingOperation(handleSetPlaylistMetadata(mediaMetadata), new t1.UGc() { // from class: androidx.media3.common.O
            @Override // t1.UGc
            public final Object get() {
                return state.buildUpon().setPlaylistMetadata(mediaMetadata).build();
            }
        });
    }

    @Override // androidx.media3.common.Player
    public final void setRepeatMode(final int i2) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (!shouldHandleCommand(15)) {
            return;
        }
        updateStateForPendingOperation(handleSetRepeatMode(i2), new t1.UGc() { // from class: androidx.media3.common.LEl
            @Override // t1.UGc
            public final Object get() {
                return state.buildUpon().setRepeatMode(i2).build();
            }
        });
    }

    @Override // androidx.media3.common.Player
    public final void setShuffleModeEnabled(final boolean z2) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (!shouldHandleCommand(14)) {
            return;
        }
        updateStateForPendingOperation(handleSetShuffleModeEnabled(z2), new t1.UGc() { // from class: androidx.media3.common.l4Z
            @Override // t1.UGc
            public final Object get() {
                return state.buildUpon().setShuffleModeEnabled(z2).build();
            }
        });
    }

    @Override // androidx.media3.common.Player
    public final void setTrackSelectionParameters(final TrackSelectionParameters trackSelectionParameters) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (!shouldHandleCommand(29)) {
            return;
        }
        updateStateForPendingOperation(handleSetTrackSelectionParameters(trackSelectionParameters), new t1.UGc() { // from class: androidx.media3.common.xuv
            @Override // t1.UGc
            public final Object get() {
                return state.buildUpon().setTrackSelectionParameters(trackSelectionParameters).build();
            }
        });
    }

    @Override // androidx.media3.common.Player
    public final void setVideoSurface(@Nullable Surface surface) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (!shouldHandleCommand(27)) {
            return;
        }
        if (surface == null) {
            clearVideoSurface();
        } else {
            updateStateForPendingOperation(handleSetVideoOutput(surface), new t1.UGc() { // from class: androidx.media3.common.P
                @Override // t1.UGc
                public final Object get() {
                    return state.buildUpon().setSurfaceSize(Size.UNKNOWN).build();
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    public final void setVideoSurfaceHolder(@Nullable final SurfaceHolder surfaceHolder) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (!shouldHandleCommand(27)) {
            return;
        }
        if (surfaceHolder == null) {
            clearVideoSurface();
        } else {
            updateStateForPendingOperation(handleSetVideoOutput(surfaceHolder), new t1.UGc() { // from class: androidx.media3.common.fg
                @Override // t1.UGc
                public final Object get() {
                    return state.buildUpon().setSurfaceSize(SimpleBasePlayer.getSurfaceHolderSize(surfaceHolder)).build();
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    public final void setVideoSurfaceView(@Nullable final SurfaceView surfaceView) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (!shouldHandleCommand(27)) {
            return;
        }
        if (surfaceView == null) {
            clearVideoSurface();
        } else {
            updateStateForPendingOperation(handleSetVideoOutput(surfaceView), new t1.UGc() { // from class: androidx.media3.common.o7q
                @Override // t1.UGc
                public final Object get() {
                    return state.buildUpon().setSurfaceSize(SimpleBasePlayer.getSurfaceHolderSize(surfaceView.getHolder())).build();
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    public final void setVideoTextureView(@Nullable TextureView textureView) {
        final Size size;
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (!shouldHandleCommand(27)) {
            return;
        }
        if (textureView == null) {
            clearVideoSurface();
            return;
        }
        if (textureView.isAvailable()) {
            size = new Size(textureView.getWidth(), textureView.getHeight());
        } else {
            size = Size.ZERO;
        }
        updateStateForPendingOperation(handleSetVideoOutput(textureView), new t1.UGc() { // from class: androidx.media3.common.vd
            @Override // t1.UGc
            public final Object get() {
                return state.buildUpon().setSurfaceSize(size).build();
            }
        });
    }

    @Override // androidx.media3.common.Player
    public final void setVolume(final float f3) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (!shouldHandleCommand(24)) {
            return;
        }
        updateStateForPendingOperation(handleSetVolume(f3), new t1.UGc() { // from class: androidx.media3.common.gnv
            @Override // t1.UGc
            public final Object get() {
                return state.buildUpon().setVolume(f3).build();
            }
        });
    }

    @Override // androidx.media3.common.Player
    public final void stop() {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (!shouldHandleCommand(3)) {
            return;
        }
        updateStateForPendingOperation(handleStop(), new t1.UGc() { // from class: androidx.media3.common.pq
            @Override // t1.UGc
            public final Object get() {
                return SimpleBasePlayer.jB(this.f39306n, state);
            }
        });
    }

    protected final void verifyApplicationThread() {
        if (Thread.currentThread() == this.applicationLooper.getThread()) {
        } else {
            throw new IllegalStateException(Util.formatInvariant("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\n", Thread.currentThread().getName(), this.applicationLooper.getThread().getName()));
        }
    }

    private static long getPositionOrDefaultInMediaItem(long j2, State state, Timeline.Window window) {
        if (j2 != -9223372036854775807L) {
            return j2;
        }
        if (state.timeline.isEmpty()) {
            return 0L;
        }
        return state.timeline.getWindow(getCurrentMediaItemIndexInternal(state), window).getDefaultPositionMs();
    }

    @Override // androidx.media3.common.Player
    public final void setMediaItems(List<MediaItem> list, int i2, long j2) {
        verifyApplicationThreadAndInitState();
        if (i2 == -1) {
            State state = this.state;
            int i3 = state.currentMediaItemIndex;
            long j3 = state.contentPositionMsSupplier.get();
            i2 = i3;
            j2 = j3;
        }
        setMediaItemsInternal(list, i2, j2);
    }

    @Override // androidx.media3.common.Player
    public final void decreaseDeviceVolume(int i2) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(34)) {
            updateStateForPendingOperation(handleDecreaseDeviceVolume(i2), new t1.UGc() { // from class: androidx.media3.common.qYU
                @Override // t1.UGc
                public final Object get() {
                    return state.buildUpon().setDeviceVolume(Math.max(0, r0.deviceVolume - 1)).build();
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    public final void increaseDeviceVolume(int i2) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(34)) {
            updateStateForPendingOperation(handleIncreaseDeviceVolume(i2), new t1.UGc() { // from class: androidx.media3.common.yg
                @Override // t1.UGc
                public final Object get() {
                    SimpleBasePlayer.State state2 = state;
                    return state2.buildUpon().setDeviceVolume(state2.deviceVolume + 1).build();
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    public final void setDeviceMuted(final boolean z2, int i2) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(34)) {
            updateStateForPendingOperation(handleSetDeviceMuted(z2, i2), new t1.UGc() { // from class: androidx.media3.common.B
                @Override // t1.UGc
                public final Object get() {
                    return state.buildUpon().setIsDeviceMuted(z2).build();
                }
            });
        }
    }

    @Override // androidx.media3.common.Player
    public final void setDeviceVolume(final int i2, int i3) {
        verifyApplicationThreadAndInitState();
        final State state = this.state;
        if (shouldHandleCommand(33)) {
            updateStateForPendingOperation(handleSetDeviceVolume(i2, i3), new t1.UGc() { // from class: androidx.media3.common.mz
                @Override // t1.UGc
                public final Object get() {
                    return state.buildUpon().setDeviceVolume(i2).build();
                }
            });
        }
    }
}
