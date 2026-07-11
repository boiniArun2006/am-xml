package androidx.media3.exoplayer;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.os.Looper;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.AuxEffectInfo;
import androidx.media3.common.Effect;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Player;
import androidx.media3.common.PriorityTaskManager;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.DefaultLivePlaybackSpeedControl;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.PlayerMessage;
import androidx.media3.exoplayer.analytics.AnalyticsCollector;
import androidx.media3.exoplayer.analytics.AnalyticsListener;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.ShuffleOrder;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.exoplayer.trackselection.TrackSelectionArray;
import androidx.media3.exoplayer.trackselection.TrackSelector;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import androidx.media3.exoplayer.upstream.DefaultBandwidthMeter;
import androidx.media3.exoplayer.video.VideoFrameMetadataListener;
import androidx.media3.exoplayer.video.spherical.CameraMotionListener;
import androidx.media3.extractor.DefaultExtractorsFactory;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public interface ExoPlayer extends Player {

    @UnstableApi
    public static final long DEFAULT_DETACH_SURFACE_TIMEOUT_MS = 2000;

    @UnstableApi
    public static final long DEFAULT_RELEASE_TIMEOUT_MS = 500;

    @UnstableApi
    public interface AudioOffloadListener {
        default void onOffloadedPlayback(boolean z2) {
        }

        default void onSleepingForOffloadChanged(boolean z2) {
        }
    }

    public static final class Builder {
        t1.CN3 analyticsCollectorFunction;
        AudioAttributes audioAttributes;
        t1.UGc bandwidthMeterSupplier;
        boolean buildCalled;
        Clock clock;
        final Context context;
        long detachSurfaceTimeoutMs;
        boolean deviceVolumeControlEnabled;
        boolean dynamicSchedulingEnabled;
        long foregroundModeTimeoutMs;
        boolean handleAudioBecomingNoisy;
        boolean handleAudioFocus;
        LivePlaybackSpeedControl livePlaybackSpeedControl;
        t1.UGc loadControlSupplier;
        Looper looper;
        long maxSeekToPreviousPositionMs;
        t1.UGc mediaSourceFactorySupplier;
        boolean pauseAtEndOfMediaItems;

        @Nullable
        PlaybackLooperProvider playbackLooperProvider;
        String playerName;
        int priority;

        @Nullable
        PriorityTaskManager priorityTaskManager;
        long releaseTimeoutMs;
        t1.UGc renderersFactorySupplier;
        long seekBackIncrementMs;
        long seekForwardIncrementMs;
        SeekParameters seekParameters;
        boolean skipSilenceEnabled;
        SuitableOutputChecker suitableOutputChecker;
        boolean suppressPlaybackOnUnsuitableOutput;
        t1.UGc trackSelectorSupplier;
        boolean useLazyPreparation;
        boolean usePlatformDiagnostics;
        int videoChangeFrameRateStrategy;
        int videoScalingMode;
        int wakeMode;

        public Builder(final Context context) {
            this(context, new t1.UGc() { // from class: androidx.media3.exoplayer.Ln
                @Override // t1.UGc
                public final Object get() {
                    return ExoPlayer.Builder.rl(context);
                }
            }, new t1.UGc() { // from class: androidx.media3.exoplayer.lej
                @Override // t1.UGc
                public final Object get() {
                    return ExoPlayer.Builder.O(context);
                }
            });
        }

        public static /* synthetic */ AnalyticsCollector HI(AnalyticsCollector analyticsCollector, Clock clock) {
            return analyticsCollector;
        }

        public static /* synthetic */ RenderersFactory Ik(RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        public static /* synthetic */ RenderersFactory J2(RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        public static /* synthetic */ MediaSource.Factory KN(MediaSource.Factory factory) {
            return factory;
        }

        public static /* synthetic */ LoadControl S(LoadControl loadControl) {
            return loadControl;
        }

        public static /* synthetic */ LoadControl Uo(LoadControl loadControl) {
            return loadControl;
        }

        public static /* synthetic */ BandwidthMeter Z(BandwidthMeter bandwidthMeter) {
            return bandwidthMeter;
        }

        public static /* synthetic */ TrackSelector az(TrackSelector trackSelector) {
            return trackSelector;
        }

        public static /* synthetic */ MediaSource.Factory ck(MediaSource.Factory factory) {
            return factory;
        }

        public static /* synthetic */ MediaSource.Factory mUb(MediaSource.Factory factory) {
            return factory;
        }

        public static /* synthetic */ RenderersFactory n(RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        public static /* synthetic */ TrackSelector o(TrackSelector trackSelector) {
            return trackSelector;
        }

        public static /* synthetic */ AnalyticsCollector r(AnalyticsCollector analyticsCollector, Clock clock) {
            return analyticsCollector;
        }

        public static /* synthetic */ MediaSource.Factory t(MediaSource.Factory factory) {
            return factory;
        }

        public static /* synthetic */ RenderersFactory ty(RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        public static /* synthetic */ BandwidthMeter xMQ(BandwidthMeter bandwidthMeter) {
            return bandwidthMeter;
        }

        @UnstableApi
        public Builder(final Context context, final RenderersFactory renderersFactory) {
            this(context, new t1.UGc() { // from class: androidx.media3.exoplayer.vd
                @Override // t1.UGc
                public final Object get() {
                    return ExoPlayer.Builder.Ik(renderersFactory);
                }
            }, new t1.UGc() { // from class: androidx.media3.exoplayer.Lu
                @Override // t1.UGc
                public final Object get() {
                    return ExoPlayer.Builder.nr(context);
                }
            });
            Assertions.checkNotNull(renderersFactory);
        }

        public static /* synthetic */ MediaSource.Factory O(Context context) {
            return new DefaultMediaSourceFactory(context, new DefaultExtractorsFactory());
        }

        public static /* synthetic */ TrackSelector XQ(Context context) {
            return new DefaultTrackSelector(context);
        }

        public static /* synthetic */ RenderersFactory gh(Context context) {
            return new DefaultRenderersFactory(context);
        }

        public static /* synthetic */ MediaSource.Factory nr(Context context) {
            return new DefaultMediaSourceFactory(context, new DefaultExtractorsFactory());
        }

        public static /* synthetic */ RenderersFactory rl(Context context) {
            return new DefaultRenderersFactory(context);
        }

        public ExoPlayer build() {
            Assertions.checkState(!this.buildCalled);
            this.buildCalled = true;
            return new ExoPlayerImpl(this, null);
        }

        SimpleExoPlayer buildSimpleExoPlayer() {
            Assertions.checkState(!this.buildCalled);
            this.buildCalled = true;
            return new SimpleExoPlayer(this);
        }

        @UnstableApi
        public Builder experimentalSetDynamicSchedulingEnabled(boolean z2) {
            Assertions.checkState(!this.buildCalled);
            this.dynamicSchedulingEnabled = z2;
            return this;
        }

        @UnstableApi
        public Builder experimentalSetForegroundModeTimeoutMs(long j2) {
            Assertions.checkState(!this.buildCalled);
            this.foregroundModeTimeoutMs = j2;
            return this;
        }

        @UnstableApi
        public Builder setAnalyticsCollector(final AnalyticsCollector analyticsCollector) {
            Assertions.checkState(!this.buildCalled);
            Assertions.checkNotNull(analyticsCollector);
            this.analyticsCollectorFunction = new t1.CN3() { // from class: androidx.media3.exoplayer.qf
                @Override // t1.CN3
                public final Object apply(Object obj) {
                    return ExoPlayer.Builder.r(analyticsCollector, (Clock) obj);
                }
            };
            return this;
        }

        public Builder setAudioAttributes(AudioAttributes audioAttributes, boolean z2) {
            Assertions.checkState(!this.buildCalled);
            this.audioAttributes = (AudioAttributes) Assertions.checkNotNull(audioAttributes);
            this.handleAudioFocus = z2;
            return this;
        }

        @UnstableApi
        public Builder setBandwidthMeter(final BandwidthMeter bandwidthMeter) {
            Assertions.checkState(!this.buildCalled);
            Assertions.checkNotNull(bandwidthMeter);
            this.bandwidthMeterSupplier = new t1.UGc() { // from class: androidx.media3.exoplayer.psW
                @Override // t1.UGc
                public final Object get() {
                    return ExoPlayer.Builder.Z(bandwidthMeter);
                }
            };
            return this;
        }

        @VisibleForTesting
        @UnstableApi
        public Builder setClock(Clock clock) {
            Assertions.checkState(!this.buildCalled);
            this.clock = clock;
            return this;
        }

        @UnstableApi
        public Builder setDetachSurfaceTimeoutMs(long j2) {
            Assertions.checkState(!this.buildCalled);
            this.detachSurfaceTimeoutMs = j2;
            return this;
        }

        @UnstableApi
        public Builder setDeviceVolumeControlEnabled(boolean z2) {
            Assertions.checkState(!this.buildCalled);
            this.deviceVolumeControlEnabled = z2;
            return this;
        }

        public Builder setHandleAudioBecomingNoisy(boolean z2) {
            Assertions.checkState(!this.buildCalled);
            this.handleAudioBecomingNoisy = z2;
            return this;
        }

        @UnstableApi
        public Builder setLivePlaybackSpeedControl(LivePlaybackSpeedControl livePlaybackSpeedControl) {
            Assertions.checkState(!this.buildCalled);
            this.livePlaybackSpeedControl = (LivePlaybackSpeedControl) Assertions.checkNotNull(livePlaybackSpeedControl);
            return this;
        }

        @UnstableApi
        public Builder setLoadControl(final LoadControl loadControl) {
            Assertions.checkState(!this.buildCalled);
            Assertions.checkNotNull(loadControl);
            this.loadControlSupplier = new t1.UGc() { // from class: androidx.media3.exoplayer.u
                @Override // t1.UGc
                public final Object get() {
                    return ExoPlayer.Builder.Uo(loadControl);
                }
            };
            return this;
        }

        @UnstableApi
        public Builder setLooper(Looper looper) {
            Assertions.checkState(!this.buildCalled);
            Assertions.checkNotNull(looper);
            this.looper = looper;
            return this;
        }

        @UnstableApi
        public Builder setMaxSeekToPreviousPositionMs(@IntRange long j2) {
            Assertions.checkArgument(j2 >= 0);
            Assertions.checkState(!this.buildCalled);
            this.maxSeekToPreviousPositionMs = j2;
            return this;
        }

        public Builder setMediaSourceFactory(final MediaSource.Factory factory) {
            Assertions.checkState(!this.buildCalled);
            Assertions.checkNotNull(factory);
            this.mediaSourceFactorySupplier = new t1.UGc() { // from class: androidx.media3.exoplayer.p
                @Override // t1.UGc
                public final Object get() {
                    return ExoPlayer.Builder.KN(factory);
                }
            };
            return this;
        }

        @UnstableApi
        public Builder setName(String str) {
            Assertions.checkState(!this.buildCalled);
            this.playerName = str;
            return this;
        }

        @UnstableApi
        public Builder setPauseAtEndOfMediaItems(boolean z2) {
            Assertions.checkState(!this.buildCalled);
            this.pauseAtEndOfMediaItems = z2;
            return this;
        }

        @UnstableApi
        public Builder setPlaybackLooper(Looper looper) {
            Assertions.checkState(!this.buildCalled);
            this.playbackLooperProvider = new PlaybackLooperProvider(looper);
            return this;
        }

        @RestrictTo
        @UnstableApi
        public Builder setPlaybackLooperProvider(PlaybackLooperProvider playbackLooperProvider) {
            Assertions.checkState(!this.buildCalled);
            this.playbackLooperProvider = playbackLooperProvider;
            return this;
        }

        @UnstableApi
        public Builder setPriority(int i2) {
            Assertions.checkState(!this.buildCalled);
            this.priority = i2;
            return this;
        }

        @UnstableApi
        public Builder setPriorityTaskManager(@Nullable PriorityTaskManager priorityTaskManager) {
            Assertions.checkState(!this.buildCalled);
            this.priorityTaskManager = priorityTaskManager;
            return this;
        }

        @UnstableApi
        public Builder setReleaseTimeoutMs(long j2) {
            Assertions.checkState(!this.buildCalled);
            this.releaseTimeoutMs = j2;
            return this;
        }

        @UnstableApi
        public Builder setRenderersFactory(final RenderersFactory renderersFactory) {
            Assertions.checkState(!this.buildCalled);
            Assertions.checkNotNull(renderersFactory);
            this.renderersFactorySupplier = new t1.UGc() { // from class: androidx.media3.exoplayer.iwV
                @Override // t1.UGc
                public final Object get() {
                    return ExoPlayer.Builder.n(renderersFactory);
                }
            };
            return this;
        }

        @UnstableApi
        public Builder setSeekBackIncrementMs(@IntRange long j2) {
            Assertions.checkArgument(j2 > 0);
            Assertions.checkState(!this.buildCalled);
            this.seekBackIncrementMs = j2;
            return this;
        }

        @UnstableApi
        public Builder setSeekForwardIncrementMs(@IntRange long j2) {
            Assertions.checkArgument(j2 > 0);
            Assertions.checkState(!this.buildCalled);
            this.seekForwardIncrementMs = j2;
            return this;
        }

        @UnstableApi
        public Builder setSeekParameters(SeekParameters seekParameters) {
            Assertions.checkState(!this.buildCalled);
            this.seekParameters = (SeekParameters) Assertions.checkNotNull(seekParameters);
            return this;
        }

        @UnstableApi
        public Builder setSkipSilenceEnabled(boolean z2) {
            Assertions.checkState(!this.buildCalled);
            this.skipSilenceEnabled = z2;
            return this;
        }

        @RestrictTo
        @VisibleForTesting
        @UnstableApi
        public Builder setSuitableOutputChecker(SuitableOutputChecker suitableOutputChecker) {
            Assertions.checkState(!this.buildCalled);
            this.suitableOutputChecker = suitableOutputChecker;
            return this;
        }

        @UnstableApi
        public Builder setSuppressPlaybackOnUnsuitableOutput(boolean z2) {
            Assertions.checkState(!this.buildCalled);
            this.suppressPlaybackOnUnsuitableOutput = z2;
            return this;
        }

        @UnstableApi
        public Builder setTrackSelector(final TrackSelector trackSelector) {
            Assertions.checkState(!this.buildCalled);
            Assertions.checkNotNull(trackSelector);
            this.trackSelectorSupplier = new t1.UGc() { // from class: androidx.media3.exoplayer.OU
                @Override // t1.UGc
                public final Object get() {
                    return ExoPlayer.Builder.az(trackSelector);
                }
            };
            return this;
        }

        @UnstableApi
        public Builder setUseLazyPreparation(boolean z2) {
            Assertions.checkState(!this.buildCalled);
            this.useLazyPreparation = z2;
            return this;
        }

        @UnstableApi
        public Builder setUsePlatformDiagnostics(boolean z2) {
            Assertions.checkState(!this.buildCalled);
            this.usePlatformDiagnostics = z2;
            return this;
        }

        @UnstableApi
        public Builder setVideoChangeFrameRateStrategy(int i2) {
            Assertions.checkState(!this.buildCalled);
            this.videoChangeFrameRateStrategy = i2;
            return this;
        }

        @UnstableApi
        public Builder setVideoScalingMode(int i2) {
            Assertions.checkState(!this.buildCalled);
            this.videoScalingMode = i2;
            return this;
        }

        public Builder setWakeMode(int i2) {
            Assertions.checkState(!this.buildCalled);
            this.wakeMode = i2;
            return this;
        }

        @UnstableApi
        public Builder(final Context context, final MediaSource.Factory factory) {
            this(context, new t1.UGc() { // from class: androidx.media3.exoplayer.l4Z
                @Override // t1.UGc
                public final Object get() {
                    return ExoPlayer.Builder.gh(context);
                }
            }, new t1.UGc() { // from class: androidx.media3.exoplayer.mz
                @Override // t1.UGc
                public final Object get() {
                    return ExoPlayer.Builder.t(factory);
                }
            });
            Assertions.checkNotNull(factory);
        }

        @UnstableApi
        public Builder(Context context, final RenderersFactory renderersFactory, final MediaSource.Factory factory) {
            this(context, new t1.UGc() { // from class: androidx.media3.exoplayer.M
                @Override // t1.UGc
                public final Object get() {
                    return ExoPlayer.Builder.J2(renderersFactory);
                }
            }, new t1.UGc() { // from class: androidx.media3.exoplayer.rv6
                @Override // t1.UGc
                public final Object get() {
                    return ExoPlayer.Builder.mUb(factory);
                }
            });
            Assertions.checkNotNull(renderersFactory);
            Assertions.checkNotNull(factory);
        }

        @UnstableApi
        public Builder(Context context, final RenderersFactory renderersFactory, final MediaSource.Factory factory, final TrackSelector trackSelector, final LoadControl loadControl, final BandwidthMeter bandwidthMeter, final AnalyticsCollector analyticsCollector) {
            this(context, new t1.UGc() { // from class: androidx.media3.exoplayer.h
                @Override // t1.UGc
                public final Object get() {
                    return ExoPlayer.Builder.ty(renderersFactory);
                }
            }, new t1.UGc() { // from class: androidx.media3.exoplayer.K
                @Override // t1.UGc
                public final Object get() {
                    return ExoPlayer.Builder.ck(factory);
                }
            }, new t1.UGc() { // from class: androidx.media3.exoplayer.Md
                @Override // t1.UGc
                public final Object get() {
                    return ExoPlayer.Builder.o(trackSelector);
                }
            }, new t1.UGc() { // from class: androidx.media3.exoplayer.Zs
                @Override // t1.UGc
                public final Object get() {
                    return ExoPlayer.Builder.S(loadControl);
                }
            }, new t1.UGc() { // from class: androidx.media3.exoplayer.P
                @Override // t1.UGc
                public final Object get() {
                    return ExoPlayer.Builder.xMQ(bandwidthMeter);
                }
            }, new t1.CN3() { // from class: androidx.media3.exoplayer.m
                @Override // t1.CN3
                public final Object apply(Object obj) {
                    return ExoPlayer.Builder.HI(analyticsCollector, (Clock) obj);
                }
            });
            Assertions.checkNotNull(renderersFactory);
            Assertions.checkNotNull(factory);
            Assertions.checkNotNull(trackSelector);
            Assertions.checkNotNull(bandwidthMeter);
            Assertions.checkNotNull(analyticsCollector);
        }

        private Builder(final Context context, t1.UGc uGc, t1.UGc uGc2) {
            this(context, uGc, uGc2, new t1.UGc() { // from class: androidx.media3.exoplayer.iF
                @Override // t1.UGc
                public final Object get() {
                    return ExoPlayer.Builder.XQ(context);
                }
            }, new yg(), new t1.UGc() { // from class: androidx.media3.exoplayer.pO
                @Override // t1.UGc
                public final Object get() {
                    return DefaultBandwidthMeter.getSingletonInstance(context);
                }
            }, new t1.CN3() { // from class: androidx.media3.exoplayer.Sis
                @Override // t1.CN3
                public final Object apply(Object obj) {
                    return new DefaultAnalyticsCollector((Clock) obj);
                }
            });
        }

        private Builder(Context context, t1.UGc uGc, t1.UGc uGc2, t1.UGc uGc3, t1.UGc uGc4, t1.UGc uGc5, t1.CN3 cn3) {
            this.context = (Context) Assertions.checkNotNull(context);
            this.renderersFactorySupplier = uGc;
            this.mediaSourceFactorySupplier = uGc2;
            this.trackSelectorSupplier = uGc3;
            this.loadControlSupplier = uGc4;
            this.bandwidthMeterSupplier = uGc5;
            this.analyticsCollectorFunction = cn3;
            this.looper = Util.getCurrentOrMainLooper();
            this.audioAttributes = AudioAttributes.DEFAULT;
            this.wakeMode = 0;
            this.videoScalingMode = 1;
            this.videoChangeFrameRateStrategy = 0;
            this.useLazyPreparation = true;
            this.seekParameters = SeekParameters.DEFAULT;
            this.seekBackIncrementMs = 5000L;
            this.seekForwardIncrementMs = 15000L;
            this.maxSeekToPreviousPositionMs = 3000L;
            this.livePlaybackSpeedControl = new DefaultLivePlaybackSpeedControl.Builder().build();
            this.clock = Clock.DEFAULT;
            this.releaseTimeoutMs = 500L;
            this.detachSurfaceTimeoutMs = 2000L;
            this.usePlatformDiagnostics = true;
            this.playerName = "";
            this.priority = -1000;
            this.suitableOutputChecker = new DefaultSuitableOutputChecker();
        }
    }

    void addAnalyticsListener(AnalyticsListener analyticsListener);

    @UnstableApi
    void addAudioOffloadListener(AudioOffloadListener audioOffloadListener);

    @UnstableApi
    void addMediaSource(int i2, MediaSource mediaSource);

    @UnstableApi
    void addMediaSource(MediaSource mediaSource);

    @UnstableApi
    void addMediaSources(int i2, List<MediaSource> list);

    @UnstableApi
    void addMediaSources(List<MediaSource> list);

    @UnstableApi
    void clearAuxEffectInfo();

    @UnstableApi
    void clearCameraMotionListener(CameraMotionListener cameraMotionListener);

    @UnstableApi
    void clearVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener);

    @UnstableApi
    PlayerMessage createMessage(PlayerMessage.Target target);

    @UnstableApi
    AnalyticsCollector getAnalyticsCollector();

    @Nullable
    @UnstableApi
    DecoderCounters getAudioDecoderCounters();

    @Nullable
    @UnstableApi
    Format getAudioFormat();

    @UnstableApi
    int getAudioSessionId();

    @UnstableApi
    Clock getClock();

    @UnstableApi
    @Deprecated
    TrackGroupArray getCurrentTrackGroups();

    @UnstableApi
    @Deprecated
    TrackSelectionArray getCurrentTrackSelections();

    @UnstableApi
    boolean getPauseAtEndOfMediaItems();

    @UnstableApi
    Looper getPlaybackLooper();

    @Override // androidx.media3.common.Player
    @Nullable
    ExoPlaybackException getPlayerError();

    @UnstableApi
    PreloadConfiguration getPreloadConfiguration();

    @UnstableApi
    Renderer getRenderer(int i2);

    @UnstableApi
    int getRendererCount();

    @UnstableApi
    int getRendererType(int i2);

    @Nullable
    @UnstableApi
    default Renderer getSecondaryRenderer(int i2) {
        return null;
    }

    @UnstableApi
    SeekParameters getSeekParameters();

    @UnstableApi
    boolean getSkipSilenceEnabled();

    @Nullable
    @UnstableApi
    TrackSelector getTrackSelector();

    @UnstableApi
    int getVideoChangeFrameRateStrategy();

    @Nullable
    @UnstableApi
    DecoderCounters getVideoDecoderCounters();

    @Nullable
    @UnstableApi
    Format getVideoFormat();

    @UnstableApi
    int getVideoScalingMode();

    @UnstableApi
    boolean isReleased();

    @UnstableApi
    boolean isSleepingForOffload();

    @UnstableApi
    boolean isTunnelingEnabled();

    @UnstableApi
    @Deprecated
    void prepare(MediaSource mediaSource);

    @UnstableApi
    @Deprecated
    void prepare(MediaSource mediaSource, boolean z2, boolean z3);

    @Override // androidx.media3.common.Player
    void release();

    void removeAnalyticsListener(AnalyticsListener analyticsListener);

    @UnstableApi
    void removeAudioOffloadListener(AudioOffloadListener audioOffloadListener);

    @Override // androidx.media3.common.Player
    void replaceMediaItem(int i2, MediaItem mediaItem);

    @Override // androidx.media3.common.Player
    void replaceMediaItems(int i2, int i3, List<MediaItem> list);

    @UnstableApi
    void setAudioSessionId(int i2);

    @UnstableApi
    void setAuxEffectInfo(AuxEffectInfo auxEffectInfo);

    @UnstableApi
    void setCameraMotionListener(CameraMotionListener cameraMotionListener);

    @UnstableApi
    void setForegroundMode(boolean z2);

    void setHandleAudioBecomingNoisy(boolean z2);

    @UnstableApi
    void setImageOutput(@Nullable ImageOutput imageOutput);

    @UnstableApi
    void setMediaSource(MediaSource mediaSource);

    @UnstableApi
    void setMediaSource(MediaSource mediaSource, long j2);

    @UnstableApi
    void setMediaSource(MediaSource mediaSource, boolean z2);

    @UnstableApi
    void setMediaSources(List<MediaSource> list);

    @UnstableApi
    void setMediaSources(List<MediaSource> list, int i2, long j2);

    @UnstableApi
    void setMediaSources(List<MediaSource> list, boolean z2);

    @UnstableApi
    void setPauseAtEndOfMediaItems(boolean z2);

    @RequiresApi
    @UnstableApi
    void setPreferredAudioDevice(@Nullable AudioDeviceInfo audioDeviceInfo);

    @UnstableApi
    void setPreloadConfiguration(PreloadConfiguration preloadConfiguration);

    @UnstableApi
    void setPriority(int i2);

    @UnstableApi
    void setPriorityTaskManager(@Nullable PriorityTaskManager priorityTaskManager);

    @UnstableApi
    void setSeekParameters(@Nullable SeekParameters seekParameters);

    @UnstableApi
    void setShuffleOrder(ShuffleOrder shuffleOrder);

    @UnstableApi
    void setSkipSilenceEnabled(boolean z2);

    @UnstableApi
    void setVideoChangeFrameRateStrategy(int i2);

    @UnstableApi
    void setVideoEffects(List<Effect> list);

    @UnstableApi
    void setVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener);

    @UnstableApi
    void setVideoScalingMode(int i2);

    void setWakeMode(int i2);

    @UnstableApi
    public static class PreloadConfiguration {
        public static final PreloadConfiguration DEFAULT = new PreloadConfiguration(-9223372036854775807L);
        public final long targetPreloadDurationUs;

        public PreloadConfiguration(long j2) {
            this.targetPreloadDurationUs = j2;
        }
    }
}
