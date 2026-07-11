package androidx.media3.exoplayer.hls;

import android.content.Context;
import androidx.annotation.Nullable;
import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.AdViewProvider;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Metadata;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSpec;
import androidx.media3.datasource.DefaultDataSource;
import androidx.media3.exoplayer.drm.DrmSessionManagerProvider;
import androidx.media3.exoplayer.hls.HlsInterstitialsAdsLoader;
import androidx.media3.exoplayer.hls.HlsMediaSource;
import androidx.media3.exoplayer.hls.playlist.HlsMediaPlaylist;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.ads.AdsLoader;
import androidx.media3.exoplayer.source.ads.AdsMediaSource;
import androidx.media3.exoplayer.upstream.LoadErrorHandlingPolicy;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@UnstableApi
public final class HlsInterstitialsAdsLoader implements AdsLoader {
    private static final String TAG = "HlsInterstitiaAdsLoader";
    private boolean isReleased;

    @Nullable
    private Player player;
    private final PlayerListener playerListener = new PlayerListener();
    private final Map<Object, AdsLoader.EventListener> activeEventListeners = new HashMap();
    private final Map<Object, AdPlaybackState> activeAdPlaybackStates = new HashMap();
    private final List<Listener> listeners = new ArrayList();
    private final Set<Object> unsupportedAdsIds = new HashSet();

    public static final class AdsMediaSourceFactory implements MediaSource.Factory {
        private final AdViewProvider adViewProvider;
        private final HlsInterstitialsAdsLoader adsLoader;
        private final MediaSource.Factory mediaSourceFactory;

        public AdsMediaSourceFactory(HlsInterstitialsAdsLoader hlsInterstitialsAdsLoader, AdViewProvider adViewProvider, Context context) {
            this(hlsInterstitialsAdsLoader, context, null, adViewProvider);
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public int[] getSupportedTypes() {
            return new int[]{2};
        }

        public AdsMediaSourceFactory(HlsInterstitialsAdsLoader hlsInterstitialsAdsLoader, AdViewProvider adViewProvider, MediaSource.Factory factory) {
            this(hlsInterstitialsAdsLoader, null, factory, adViewProvider);
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public MediaSource createMediaSource(MediaItem mediaItem) {
            Assertions.checkNotNull(mediaItem.localConfiguration);
            MediaSource mediaSourceCreateMediaSource = this.mediaSourceFactory.createMediaSource(mediaItem);
            MediaItem.AdsConfiguration adsConfiguration = mediaItem.localConfiguration.adsConfiguration;
            if (adsConfiguration == null) {
                return mediaSourceCreateMediaSource;
            }
            if (adsConfiguration.adsId instanceof String) {
                return new AdsMediaSource(mediaSourceCreateMediaSource, new DataSpec(mediaItem.localConfiguration.adsConfiguration.adTagUri), Assertions.checkNotNull(mediaItem.localConfiguration.adsConfiguration.adsId), this.mediaSourceFactory, this.adsLoader, this.adViewProvider, false);
            }
            throw new IllegalArgumentException("Please use an AdsConfiguration with an adsId of type String when using HlsInterstitialsAdsLoader");
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public AdsMediaSourceFactory setDrmSessionManagerProvider(DrmSessionManagerProvider drmSessionManagerProvider) {
            this.mediaSourceFactory.setDrmSessionManagerProvider(drmSessionManagerProvider);
            return this;
        }

        @Override // androidx.media3.exoplayer.source.MediaSource.Factory
        public AdsMediaSourceFactory setLoadErrorHandlingPolicy(LoadErrorHandlingPolicy loadErrorHandlingPolicy) {
            this.mediaSourceFactory.setLoadErrorHandlingPolicy(loadErrorHandlingPolicy);
            return this;
        }

        private AdsMediaSourceFactory(HlsInterstitialsAdsLoader hlsInterstitialsAdsLoader, @Nullable Context context, @Nullable MediaSource.Factory factory, AdViewProvider adViewProvider) {
            boolean z2 = true;
            Assertions.checkArgument((context == null && factory == null) ? false : true);
            this.adsLoader = hlsInterstitialsAdsLoader;
            factory = factory == null ? new HlsMediaSource.Factory(new DefaultDataSource.Factory((Context) Assertions.checkNotNull(context))) : factory;
            this.mediaSourceFactory = factory;
            this.adViewProvider = adViewProvider;
            int[] supportedTypes = factory.getSupportedTypes();
            int length = supportedTypes.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z2 = false;
                    break;
                } else if (supportedTypes[i2] == 2) {
                    break;
                } else {
                    i2++;
                }
            }
            Assertions.checkState(z2);
        }
    }

    public interface Listener {
        default void onAdCompleted(MediaItem mediaItem, Object obj, int i2, int i3) {
        }

        default void onContentTimelineChanged(MediaItem mediaItem, Object obj, Timeline timeline) {
        }

        default void onMetadata(MediaItem mediaItem, Object obj, int i2, int i3, Metadata metadata) {
        }

        default void onPrepareCompleted(MediaItem mediaItem, Object obj, int i2, int i3) {
        }

        default void onPrepareError(MediaItem mediaItem, Object obj, int i2, int i3, IOException iOException) {
        }

        default void onStart(MediaItem mediaItem, Object obj, AdViewProvider adViewProvider) {
        }

        default void onStop(MediaItem mediaItem, Object obj, AdPlaybackState adPlaybackState) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class PlayerListener implements Player.Listener {
        private final Timeline.Period period;

        private PlayerListener() {
            this.period = new Timeline.Period();
        }

        private void markAdAsPlayedAndNotifyListeners(final MediaItem mediaItem, final Object obj, final int i2, final int i3) {
            AdPlaybackState adPlaybackState = (AdPlaybackState) HlsInterstitialsAdsLoader.this.activeAdPlaybackStates.get(obj);
            if (adPlaybackState != null) {
                HlsInterstitialsAdsLoader.this.putAndNotifyAdPlaybackStateUpdate(obj, adPlaybackState.withPlayedAd(i2, i3));
                HlsInterstitialsAdsLoader.this.notifyListeners(new Consumer() { // from class: androidx.media3.exoplayer.hls.Wre
                    @Override // androidx.media3.common.util.Consumer
                    public final void accept(Object obj2) {
                        ((HlsInterstitialsAdsLoader.Listener) obj2).onAdCompleted(mediaItem, obj, i2, i3);
                    }
                });
            }
        }

        @Override // androidx.media3.common.Player.Listener
        public void onMetadata(final Metadata metadata) {
            Player player = HlsInterstitialsAdsLoader.this.player;
            if (player == null || !player.isPlayingAd()) {
                return;
            }
            player.getCurrentTimeline().getPeriod(player.getCurrentPeriodIndex(), this.period);
            final Object obj = this.period.adPlaybackState.adsId;
            if (obj == null || !HlsInterstitialsAdsLoader.this.activeAdPlaybackStates.containsKey(obj)) {
                return;
            }
            final MediaItem mediaItem = (MediaItem) Assertions.checkNotNull(player.getCurrentMediaItem());
            final int currentAdGroupIndex = player.getCurrentAdGroupIndex();
            final int currentAdIndexInAdGroup = player.getCurrentAdIndexInAdGroup();
            HlsInterstitialsAdsLoader.this.notifyListeners(new Consumer() { // from class: androidx.media3.exoplayer.hls.CN3
                @Override // androidx.media3.common.util.Consumer
                public final void accept(Object obj2) {
                    ((HlsInterstitialsAdsLoader.Listener) obj2).onMetadata(mediaItem, obj, currentAdGroupIndex, currentAdIndexInAdGroup, metadata);
                }
            });
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlaybackStateChanged(int i2) {
            Player player = HlsInterstitialsAdsLoader.this.player;
            if (i2 == 4 && player != null && player.isPlayingAd()) {
                player.getCurrentTimeline().getPeriod(player.getCurrentPeriodIndex(), this.period);
                Object obj = this.period.adPlaybackState.adsId;
                if (obj == null || !HlsInterstitialsAdsLoader.this.activeAdPlaybackStates.containsKey(obj)) {
                    return;
                }
                markAdAsPlayedAndNotifyListeners((MediaItem) Assertions.checkNotNull(player.getCurrentMediaItem()), obj, player.getCurrentAdGroupIndex(), player.getCurrentAdIndexInAdGroup());
            }
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i2) {
            if (i2 != 0 || HlsInterstitialsAdsLoader.this.player == null || positionInfo.mediaItem == null || positionInfo.adGroupIndex == -1) {
                return;
            }
            HlsInterstitialsAdsLoader.this.player.getCurrentTimeline().getPeriod(positionInfo.periodIndex, this.period);
            Object obj = this.period.adPlaybackState.adsId;
            if (obj == null || !HlsInterstitialsAdsLoader.this.activeAdPlaybackStates.containsKey(obj)) {
                return;
            }
            markAdAsPlayedAndNotifyListeners(positionInfo.mediaItem, obj, positionInfo.adGroupIndex, positionInfo.adIndexInAdGroup);
        }
    }

    private static boolean isLiveMediaItem(MediaItem mediaItem, Timeline timeline) {
        int firstWindowIndex = timeline.getFirstWindowIndex(false);
        Timeline.Window window = new Timeline.Window();
        while (firstWindowIndex != -1) {
            timeline.getWindow(firstWindowIndex, window);
            if (window.mediaItem.equals(mediaItem)) {
                return window.isLive();
            }
            firstWindowIndex = timeline.getNextWindowIndex(firstWindowIndex, 0, false);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyListeners(Consumer<Listener> consumer) {
        for (int i2 = 0; i2 < this.listeners.size(); i2++) {
            consumer.accept(this.listeners.get(i2));
        }
    }

    @Override // androidx.media3.exoplayer.source.ads.AdsLoader
    public void setSupportedContentTypes(int... iArr) {
        for (int i2 : iArr) {
            if (i2 == 2) {
                return;
            }
        }
        throw new IllegalArgumentException();
    }

    private static long getInterstitialDurationUs(HlsMediaPlaylist.Interstitial interstitial, long j2) {
        long j3 = interstitial.playoutLimitUs;
        if (j3 != -9223372036854775807L) {
            return j3;
        }
        long j4 = interstitial.durationUs;
        if (j4 != -9223372036854775807L) {
            return j4;
        }
        long j5 = interstitial.endDateUnixUs;
        if (j5 != -9223372036854775807L) {
            return j5 - interstitial.startDateUnixUs;
        }
        long j6 = interstitial.plannedDurationUs;
        return j6 != -9223372036854775807L ? j6 : j2;
    }

    private static boolean isHlsMediaItem(MediaItem mediaItem) {
        MediaItem.LocalConfiguration localConfiguration = (MediaItem.LocalConfiguration) Assertions.checkNotNull(mediaItem.localConfiguration);
        return Objects.equals(localConfiguration.mimeType, "application/x-mpegURL") || Util.inferContentType(localConfiguration.uri) == 2;
    }

    private static AdPlaybackState mapHlsInterstitialsToAdPlaybackState(HlsMediaPlaylist hlsMediaPlaylist, AdPlaybackState adPlaybackState) {
        long[] jArr;
        AdPlaybackState adPlaybackStateWithNewAdGroup = adPlaybackState;
        for (int i2 = 0; i2 < hlsMediaPlaylist.interstitials.size(); i2++) {
            HlsMediaPlaylist.Interstitial interstitial = (HlsMediaPlaylist.Interstitial) hlsMediaPlaylist.interstitials.get(i2);
            if (interstitial.assetUri == null) {
                Log.w(TAG, "Ignoring interstitials with X-ASSET-LIST. Not yet supported.");
            } else {
                long j2 = interstitial.cue.contains(HlsMediaPlaylist.Interstitial.CUE_TRIGGER_PRE) ? 0L : interstitial.cue.contains("POST") ? Long.MIN_VALUE : interstitial.startDateUnixUs - hlsMediaPlaylist.startTimeUs;
                int adGroupIndexForPositionUs = adPlaybackStateWithNewAdGroup.getAdGroupIndexForPositionUs(j2, hlsMediaPlaylist.durationUs);
                if (adGroupIndexForPositionUs == -1) {
                    adPlaybackStateWithNewAdGroup = adPlaybackStateWithNewAdGroup.withNewAdGroup(0, j2);
                    adGroupIndexForPositionUs = 0;
                } else if (adPlaybackStateWithNewAdGroup.getAdGroup(adGroupIndexForPositionUs).timeUs != j2) {
                    adGroupIndexForPositionUs++;
                    adPlaybackStateWithNewAdGroup = adPlaybackStateWithNewAdGroup.withNewAdGroup(adGroupIndexForPositionUs, j2);
                }
                int iMax = Math.max(adPlaybackStateWithNewAdGroup.getAdGroup(adGroupIndexForPositionUs).count, 0);
                long interstitialDurationUs = getInterstitialDurationUs(interstitial, -9223372036854775807L);
                if (iMax == 0) {
                    jArr = new long[1];
                } else {
                    long[] jArr2 = adPlaybackStateWithNewAdGroup.getAdGroup(adGroupIndexForPositionUs).durationsUs;
                    long[] jArr3 = new long[jArr2.length + 1];
                    System.arraycopy(jArr2, 0, jArr3, 0, jArr2.length);
                    jArr = jArr3;
                }
                jArr[jArr.length - 1] = interstitialDurationUs;
                long j3 = interstitial.resumeOffsetUs;
                if (j3 == -9223372036854775807L) {
                    j3 = interstitialDurationUs != -9223372036854775807L ? interstitialDurationUs : 0L;
                }
                adPlaybackStateWithNewAdGroup = adPlaybackStateWithNewAdGroup.withAdCount(adGroupIndexForPositionUs, iMax + 1).withAdDurationsUs(adGroupIndexForPositionUs, jArr).withContentResumeOffsetUs(adGroupIndexForPositionUs, adPlaybackStateWithNewAdGroup.getAdGroup(adGroupIndexForPositionUs).contentResumeOffsetUs + j3).withAvailableAdMediaItem(adGroupIndexForPositionUs, iMax, MediaItem.fromUri(interstitial.assetUri));
            }
        }
        return adPlaybackStateWithNewAdGroup;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void putAndNotifyAdPlaybackStateUpdate(Object obj, AdPlaybackState adPlaybackState) {
        if (adPlaybackState.equals(this.activeAdPlaybackStates.put(obj, adPlaybackState))) {
            return;
        }
        AdsLoader.EventListener eventListener = this.activeEventListeners.get(obj);
        if (eventListener != null) {
            eventListener.onAdPlaybackState(adPlaybackState);
        } else {
            this.activeAdPlaybackStates.remove(obj);
        }
    }

    public void addListener(Listener listener) {
        this.listeners.add(listener);
    }

    @Override // androidx.media3.exoplayer.source.ads.AdsLoader
    public void release() {
        if (this.activeEventListeners.isEmpty()) {
            this.player = null;
        }
        this.isReleased = true;
    }

    public void removeListener(Listener listener) {
        this.listeners.remove(listener);
    }

    @Override // androidx.media3.exoplayer.source.ads.AdsLoader
    public void setPlayer(@Nullable Player player) {
        boolean z2 = true;
        Assertions.checkState(!this.isReleased);
        if (Objects.equals(this.player, player)) {
            return;
        }
        if (this.player != null && !this.activeEventListeners.isEmpty()) {
            this.player.removeListener(this.playerListener);
        }
        if (player != null && !this.activeEventListeners.isEmpty()) {
            z2 = false;
        }
        Assertions.checkState(z2);
        this.player = player;
    }

    @Override // androidx.media3.exoplayer.source.ads.AdsLoader
    public void start(AdsMediaSource adsMediaSource, DataSpec dataSpec, final Object obj, final AdViewProvider adViewProvider, AdsLoader.EventListener eventListener) {
        if (this.isReleased) {
            eventListener.onAdPlaybackState(new AdPlaybackState(obj, new long[0]));
            return;
        }
        if (this.activeAdPlaybackStates.containsKey(obj) || this.unsupportedAdsIds.contains(obj)) {
            throw new IllegalStateException("media item with adsId='" + obj + "' already started. Make sure adsIds are unique within the same playlist.");
        }
        if (this.activeEventListeners.isEmpty()) {
            ((Player) Assertions.checkStateNotNull(this.player, "setPlayer(Player) needs to be called")).addListener(this.playerListener);
        }
        this.activeEventListeners.put(obj, eventListener);
        final MediaItem mediaItem = adsMediaSource.getMediaItem();
        Player player = this.player;
        if (player != null && isSupportedMediaItem(mediaItem, player.getCurrentTimeline())) {
            this.activeAdPlaybackStates.put(obj, AdPlaybackState.NONE);
            notifyListeners(new Consumer() { // from class: androidx.media3.exoplayer.hls.w6
                @Override // androidx.media3.common.util.Consumer
                public final void accept(Object obj2) {
                    ((HlsInterstitialsAdsLoader.Listener) obj2).onStart(mediaItem, obj, adViewProvider);
                }
            });
            return;
        }
        putAndNotifyAdPlaybackStateUpdate(obj, new AdPlaybackState(obj, new long[0]));
        if (this.player != null) {
            Log.w(TAG, "Unsupported media item. Playing without ads for adsId=" + obj);
            this.unsupportedAdsIds.add(obj);
        }
    }

    private static boolean isSupportedMediaItem(MediaItem mediaItem, Timeline timeline) {
        if (isHlsMediaItem(mediaItem) && !isLiveMediaItem(mediaItem, timeline)) {
            return true;
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.source.ads.AdsLoader
    public void handleContentTimelineChanged(final AdsMediaSource adsMediaSource, final Timeline timeline) {
        final Object adsId = adsMediaSource.getAdsId();
        if (this.isReleased) {
            AdsLoader.EventListener eventListenerRemove = this.activeEventListeners.remove(adsId);
            if (eventListenerRemove != null) {
                this.unsupportedAdsIds.remove(adsId);
                if (((AdPlaybackState) Assertions.checkNotNull(this.activeAdPlaybackStates.remove(adsId))).equals(AdPlaybackState.NONE)) {
                    eventListenerRemove.onAdPlaybackState(new AdPlaybackState(adsId, new long[0]));
                    return;
                }
                return;
            }
            return;
        }
        if (((AdPlaybackState) Assertions.checkNotNull(this.activeAdPlaybackStates.get(adsId))).equals(AdPlaybackState.NONE)) {
            AdPlaybackState adPlaybackState = new AdPlaybackState(adsId, new long[0]);
            Object obj = timeline.getWindow(0, new Timeline.Window()).manifest;
            if (obj instanceof HlsManifest) {
                adPlaybackState = mapHlsInterstitialsToAdPlaybackState(((HlsManifest) obj).mediaPlaylist, adPlaybackState);
            }
            putAndNotifyAdPlaybackStateUpdate(adsId, adPlaybackState);
            if (!this.unsupportedAdsIds.contains(adsId)) {
                notifyListeners(new Consumer() { // from class: androidx.media3.exoplayer.hls.j
                    @Override // androidx.media3.common.util.Consumer
                    public final void accept(Object obj2) {
                        HlsInterstitialsAdsLoader.Listener listener = (HlsInterstitialsAdsLoader.Listener) obj2;
                        listener.onContentTimelineChanged(adsMediaSource.getMediaItem(), adsId, timeline);
                    }
                });
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.ads.AdsLoader
    public void handlePrepareComplete(final AdsMediaSource adsMediaSource, final int i2, final int i3) {
        final Object adsId = adsMediaSource.getAdsId();
        if (!this.isReleased && !this.unsupportedAdsIds.contains(adsId)) {
            notifyListeners(new Consumer() { // from class: androidx.media3.exoplayer.hls.I28
                @Override // androidx.media3.common.util.Consumer
                public final void accept(Object obj) {
                    HlsInterstitialsAdsLoader.Listener listener = (HlsInterstitialsAdsLoader.Listener) obj;
                    listener.onPrepareCompleted(adsMediaSource.getMediaItem(), adsId, i2, i3);
                }
            });
        }
    }

    @Override // androidx.media3.exoplayer.source.ads.AdsLoader
    public void handlePrepareError(final AdsMediaSource adsMediaSource, final int i2, final int i3, final IOException iOException) {
        final Object adsId = adsMediaSource.getAdsId();
        putAndNotifyAdPlaybackStateUpdate(adsId, ((AdPlaybackState) Assertions.checkNotNull(this.activeAdPlaybackStates.get(adsId))).withAdLoadError(i2, i3));
        if (!this.isReleased && !this.unsupportedAdsIds.contains(adsId)) {
            notifyListeners(new Consumer() { // from class: androidx.media3.exoplayer.hls.n
                @Override // androidx.media3.common.util.Consumer
                public final void accept(Object obj) {
                    HlsInterstitialsAdsLoader.Listener listener = (HlsInterstitialsAdsLoader.Listener) obj;
                    listener.onPrepareError(adsMediaSource.getMediaItem(), adsId, i2, i3, iOException);
                }
            });
        }
    }

    @Override // androidx.media3.exoplayer.source.ads.AdsLoader
    public void stop(final AdsMediaSource adsMediaSource, AdsLoader.EventListener eventListener) {
        Object adsId = adsMediaSource.getAdsId();
        this.activeEventListeners.remove(adsId);
        final AdPlaybackState adPlaybackStateRemove = this.activeAdPlaybackStates.remove(adsId);
        if (this.player != null && this.activeEventListeners.isEmpty()) {
            this.player.removeListener(this.playerListener);
            if (this.isReleased) {
                this.player = null;
            }
        }
        if (!this.isReleased && !this.unsupportedAdsIds.contains(adsId)) {
            notifyListeners(new Consumer() { // from class: androidx.media3.exoplayer.hls.Ml
                @Override // androidx.media3.common.util.Consumer
                public final void accept(Object obj) {
                    AdsMediaSource adsMediaSource2 = adsMediaSource;
                    ((HlsInterstitialsAdsLoader.Listener) obj).onStop(adsMediaSource2.getMediaItem(), adsMediaSource2.getAdsId(), (AdPlaybackState) Assertions.checkNotNull(adPlaybackStateRemove));
                }
            });
        }
        this.unsupportedAdsIds.remove(adsId);
    }
}
