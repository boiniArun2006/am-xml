package com.google.android.exoplayer2;

import android.content.Context;
import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.DefaultLivePlaybackSpeedControl;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.PlayerMessage;
import com.google.android.exoplayer2.analytics.AnalyticsCollector;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.audio.AuxEffectInfo;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.extractor.DefaultExtractorsFactory;
import com.google.android.exoplayer2.source.DefaultMediaSourceFactory;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.ShuffleOrder;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.text.CueGroup;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.upstream.DefaultBandwidthMeter;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.PriorityTaskManager;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.VideoFrameMetadataListener;
import com.google.android.exoplayer2.video.VideoSize;
import com.google.android.exoplayer2.video.spherical.CameraMotionListener;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public interface ExoPlayer extends Player {
    public static final long DEFAULT_DETACH_SURFACE_TIMEOUT_MS = 2000;
    public static final long DEFAULT_RELEASE_TIMEOUT_MS = 500;

    @Deprecated
    public interface AudioComponent {
        @Deprecated
        void clearAuxEffectInfo();

        @Deprecated
        AudioAttributes getAudioAttributes();

        @Deprecated
        int getAudioSessionId();

        @Deprecated
        boolean getSkipSilenceEnabled();

        @Deprecated
        float getVolume();

        @Deprecated
        void setAudioAttributes(AudioAttributes audioAttributes, boolean z2);

        @Deprecated
        void setAudioSessionId(int i2);

        @Deprecated
        void setAuxEffectInfo(AuxEffectInfo auxEffectInfo);

        @Deprecated
        void setSkipSilenceEnabled(boolean z2);

        @Deprecated
        void setVolume(float f3);
    }

    public interface AudioOffloadListener {
        default void onExperimentalOffloadSchedulingEnabledChanged(boolean z2) {
        }

        default void onExperimentalSleepingForOffloadChanged(boolean z2) {
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
        long foregroundModeTimeoutMs;
        boolean handleAudioBecomingNoisy;
        boolean handleAudioFocus;
        LivePlaybackSpeedControl livePlaybackSpeedControl;
        t1.UGc loadControlSupplier;
        Looper looper;
        t1.UGc mediaSourceFactorySupplier;
        boolean pauseAtEndOfMediaItems;

        @Nullable
        PriorityTaskManager priorityTaskManager;
        long releaseTimeoutMs;
        t1.UGc renderersFactorySupplier;
        long seekBackIncrementMs;
        long seekForwardIncrementMs;
        SeekParameters seekParameters;
        boolean skipSilenceEnabled;
        t1.UGc trackSelectorSupplier;
        boolean useLazyPreparation;
        boolean usePlatformDiagnostics;
        int videoChangeFrameRateStrategy;
        int videoScalingMode;
        int wakeMode;

        public Builder(final Context context) {
            this(context, new t1.UGc() { // from class: com.google.android.exoplayer2.l3D
                @Override // t1.UGc
                public final Object get() {
                    return ExoPlayer.Builder.rl(context);
                }
            }, new t1.UGc() { // from class: com.google.android.exoplayer2.r
                @Override // t1.UGc
                public final Object get() {
                    return ExoPlayer.Builder.mUb(context);
                }
            });
        }

        public static /* synthetic */ BandwidthMeter HI(BandwidthMeter bandwidthMeter) {
            return bandwidthMeter;
        }

        public static /* synthetic */ RenderersFactory Ik(RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        public static /* synthetic */ RenderersFactory J2(RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        public static /* synthetic */ RenderersFactory KN(RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        public static /* synthetic */ MediaSource.Factory O(MediaSource.Factory factory) {
            return factory;
        }

        public static /* synthetic */ RenderersFactory S(RenderersFactory renderersFactory) {
            return renderersFactory;
        }

        public static /* synthetic */ AnalyticsCollector Uo(AnalyticsCollector analyticsCollector, Clock clock) {
            return analyticsCollector;
        }

        public static /* synthetic */ LoadControl XQ(LoadControl loadControl) {
            return loadControl;
        }

        public static /* synthetic */ AnalyticsCollector Z(AnalyticsCollector analyticsCollector, Clock clock) {
            return analyticsCollector;
        }

        public static /* synthetic */ LoadControl n(LoadControl loadControl) {
            return loadControl;
        }

        public static /* synthetic */ TrackSelector nr(TrackSelector trackSelector) {
            return trackSelector;
        }

        public static /* synthetic */ BandwidthMeter o(BandwidthMeter bandwidthMeter) {
            return bandwidthMeter;
        }

        public static /* synthetic */ MediaSource.Factory qie(MediaSource.Factory factory) {
            return factory;
        }

        public static /* synthetic */ MediaSource.Factory r(MediaSource.Factory factory) {
            return factory;
        }

        public static /* synthetic */ MediaSource.Factory t(MediaSource.Factory factory) {
            return factory;
        }

        public static /* synthetic */ TrackSelector ty(TrackSelector trackSelector) {
            return trackSelector;
        }

        public Builder(final Context context, final RenderersFactory renderersFactory) {
            this(context, new t1.UGc() { // from class: com.google.android.exoplayer2.o
                @Override // t1.UGc
                public final Object get() {
                    return ExoPlayer.Builder.KN(renderersFactory);
                }
            }, new t1.UGc() { // from class: com.google.android.exoplayer2.qz
                @Override // t1.UGc
                public final Object get() {
                    return ExoPlayer.Builder.az(context);
                }
            });
        }

        public static /* synthetic */ MediaSource.Factory az(Context context) {
            return new DefaultMediaSourceFactory(context, new DefaultExtractorsFactory());
        }

        public static /* synthetic */ TrackSelector ck(Context context) {
            return new DefaultTrackSelector(context);
        }

        public static /* synthetic */ MediaSource.Factory mUb(Context context) {
            return new DefaultMediaSourceFactory(context, new DefaultExtractorsFactory());
        }

        public static /* synthetic */ RenderersFactory rl(Context context) {
            return new DefaultRenderersFactory(context);
        }

        public static /* synthetic */ RenderersFactory xMQ(Context context) {
            return new DefaultRenderersFactory(context);
        }

        public ExoPlayer build() {
            Assertions.checkState(!this.buildCalled);
            this.buildCalled = true;
            return new KH(this, null);
        }

        SimpleExoPlayer buildSimpleExoPlayer() {
            Assertions.checkState(!this.buildCalled);
            this.buildCalled = true;
            return new SimpleExoPlayer(this);
        }

        public Builder experimentalSetForegroundModeTimeoutMs(long j2) {
            Assertions.checkState(!this.buildCalled);
            this.foregroundModeTimeoutMs = j2;
            return this;
        }

        public Builder setAnalyticsCollector(final AnalyticsCollector analyticsCollector) {
            Assertions.checkState(!this.buildCalled);
            this.analyticsCollectorFunction = new t1.CN3() { // from class: com.google.android.exoplayer2.s4
                @Override // t1.CN3
                public final Object apply(Object obj) {
                    return ExoPlayer.Builder.Uo(analyticsCollector, (Clock) obj);
                }
            };
            return this;
        }

        public Builder setAudioAttributes(AudioAttributes audioAttributes, boolean z2) {
            Assertions.checkState(!this.buildCalled);
            this.audioAttributes = audioAttributes;
            this.handleAudioFocus = z2;
            return this;
        }

        public Builder setBandwidthMeter(final BandwidthMeter bandwidthMeter) {
            Assertions.checkState(!this.buildCalled);
            this.bandwidthMeterSupplier = new t1.UGc() { // from class: com.google.android.exoplayer2.g9s
                @Override // t1.UGc
                public final Object get() {
                    return ExoPlayer.Builder.HI(bandwidthMeter);
                }
            };
            return this;
        }

        @VisibleForTesting
        public Builder setClock(Clock clock) {
            Assertions.checkState(!this.buildCalled);
            this.clock = clock;
            return this;
        }

        public Builder setDetachSurfaceTimeoutMs(long j2) {
            Assertions.checkState(!this.buildCalled);
            this.detachSurfaceTimeoutMs = j2;
            return this;
        }

        public Builder setHandleAudioBecomingNoisy(boolean z2) {
            Assertions.checkState(!this.buildCalled);
            this.handleAudioBecomingNoisy = z2;
            return this;
        }

        public Builder setLivePlaybackSpeedControl(LivePlaybackSpeedControl livePlaybackSpeedControl) {
            Assertions.checkState(!this.buildCalled);
            this.livePlaybackSpeedControl = livePlaybackSpeedControl;
            return this;
        }

        public Builder setLoadControl(final LoadControl loadControl) {
            Assertions.checkState(!this.buildCalled);
            this.loadControlSupplier = new t1.UGc() { // from class: com.google.android.exoplayer2.CN3
                @Override // t1.UGc
                public final Object get() {
                    return ExoPlayer.Builder.XQ(loadControl);
                }
            };
            return this;
        }

        public Builder setLooper(Looper looper) {
            Assertions.checkState(!this.buildCalled);
            this.looper = looper;
            return this;
        }

        public Builder setMediaSourceFactory(final MediaSource.Factory factory) {
            Assertions.checkState(!this.buildCalled);
            this.mediaSourceFactorySupplier = new t1.UGc() { // from class: com.google.android.exoplayer2.Q
                @Override // t1.UGc
                public final Object get() {
                    return ExoPlayer.Builder.t(factory);
                }
            };
            return this;
        }

        public Builder setPauseAtEndOfMediaItems(boolean z2) {
            Assertions.checkState(!this.buildCalled);
            this.pauseAtEndOfMediaItems = z2;
            return this;
        }

        public Builder setPriorityTaskManager(@Nullable PriorityTaskManager priorityTaskManager) {
            Assertions.checkState(!this.buildCalled);
            this.priorityTaskManager = priorityTaskManager;
            return this;
        }

        public Builder setReleaseTimeoutMs(long j2) {
            Assertions.checkState(!this.buildCalled);
            this.releaseTimeoutMs = j2;
            return this;
        }

        public Builder setRenderersFactory(final RenderersFactory renderersFactory) {
            Assertions.checkState(!this.buildCalled);
            this.renderersFactorySupplier = new t1.UGc() { // from class: com.google.android.exoplayer2.UGc
                @Override // t1.UGc
                public final Object get() {
                    return ExoPlayer.Builder.J2(renderersFactory);
                }
            };
            return this;
        }

        public Builder setSeekBackIncrementMs(@IntRange long j2) {
            Assertions.checkArgument(j2 > 0);
            Assertions.checkState(!this.buildCalled);
            this.seekBackIncrementMs = j2;
            return this;
        }

        public Builder setSeekForwardIncrementMs(@IntRange long j2) {
            Assertions.checkArgument(j2 > 0);
            Assertions.checkState(!this.buildCalled);
            this.seekForwardIncrementMs = j2;
            return this;
        }

        public Builder setSeekParameters(SeekParameters seekParameters) {
            Assertions.checkState(!this.buildCalled);
            this.seekParameters = seekParameters;
            return this;
        }

        public Builder setSkipSilenceEnabled(boolean z2) {
            Assertions.checkState(!this.buildCalled);
            this.skipSilenceEnabled = z2;
            return this;
        }

        public Builder setTrackSelector(final TrackSelector trackSelector) {
            Assertions.checkState(!this.buildCalled);
            this.trackSelectorSupplier = new t1.UGc() { // from class: com.google.android.exoplayer2.aC
                @Override // t1.UGc
                public final Object get() {
                    return ExoPlayer.Builder.nr(trackSelector);
                }
            };
            return this;
        }

        public Builder setUseLazyPreparation(boolean z2) {
            Assertions.checkState(!this.buildCalled);
            this.useLazyPreparation = z2;
            return this;
        }

        public Builder setUsePlatformDiagnostics(boolean z2) {
            Assertions.checkState(!this.buildCalled);
            this.usePlatformDiagnostics = z2;
            return this;
        }

        public Builder setVideoChangeFrameRateStrategy(int i2) {
            Assertions.checkState(!this.buildCalled);
            this.videoChangeFrameRateStrategy = i2;
            return this;
        }

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

        public Builder(final Context context, final MediaSource.Factory factory) {
            this(context, new t1.UGc() { // from class: com.google.android.exoplayer2.Pl
                @Override // t1.UGc
                public final Object get() {
                    return ExoPlayer.Builder.xMQ(context);
                }
            }, new t1.UGc() { // from class: com.google.android.exoplayer2.Xo
                @Override // t1.UGc
                public final Object get() {
                    return ExoPlayer.Builder.r(factory);
                }
            });
        }

        public Builder(Context context, final RenderersFactory renderersFactory, final MediaSource.Factory factory) {
            this(context, new t1.UGc() { // from class: com.google.android.exoplayer2.SPz
                @Override // t1.UGc
                public final Object get() {
                    return ExoPlayer.Builder.S(renderersFactory);
                }
            }, new t1.UGc() { // from class: com.google.android.exoplayer2.ci
                @Override // t1.UGc
                public final Object get() {
                    return ExoPlayer.Builder.O(factory);
                }
            });
        }

        public Builder(Context context, final RenderersFactory renderersFactory, final MediaSource.Factory factory, final TrackSelector trackSelector, final LoadControl loadControl, final BandwidthMeter bandwidthMeter, final AnalyticsCollector analyticsCollector) {
            this(context, new t1.UGc() { // from class: com.google.android.exoplayer2.afx
                @Override // t1.UGc
                public final Object get() {
                    return ExoPlayer.Builder.Ik(renderersFactory);
                }
            }, new t1.UGc() { // from class: com.google.android.exoplayer2.Z
                @Override // t1.UGc
                public final Object get() {
                    return ExoPlayer.Builder.qie(factory);
                }
            }, new t1.UGc() { // from class: com.google.android.exoplayer2.Ew
                @Override // t1.UGc
                public final Object get() {
                    return ExoPlayer.Builder.ty(trackSelector);
                }
            }, new t1.UGc() { // from class: com.google.android.exoplayer2.nKK
                @Override // t1.UGc
                public final Object get() {
                    return ExoPlayer.Builder.n(loadControl);
                }
            }, new t1.UGc() { // from class: com.google.android.exoplayer2.fuX
                @Override // t1.UGc
                public final Object get() {
                    return ExoPlayer.Builder.o(bandwidthMeter);
                }
            }, new t1.CN3() { // from class: com.google.android.exoplayer2.Dsr
                @Override // t1.CN3
                public final Object apply(Object obj) {
                    return ExoPlayer.Builder.Z(analyticsCollector, (Clock) obj);
                }
            });
        }

        private Builder(final Context context, t1.UGc uGc, t1.UGc uGc2) {
            this(context, uGc, uGc2, new t1.UGc() { // from class: com.google.android.exoplayer2.eO
                @Override // t1.UGc
                public final Object get() {
                    return ExoPlayer.Builder.ck(context);
                }
            }, new t1.UGc() { // from class: com.google.android.exoplayer2.z
                @Override // t1.UGc
                public final Object get() {
                    return new DefaultLoadControl();
                }
            }, new t1.UGc() { // from class: com.google.android.exoplayer2.QJ
                @Override // t1.UGc
                public final Object get() {
                    return DefaultBandwidthMeter.getSingletonInstance(context);
                }
            }, new t1.CN3() { // from class: com.google.android.exoplayer2.c
                @Override // t1.CN3
                public final Object apply(Object obj) {
                    return new DefaultAnalyticsCollector((Clock) obj);
                }
            });
        }

        private Builder(Context context, t1.UGc uGc, t1.UGc uGc2, t1.UGc uGc3, t1.UGc uGc4, t1.UGc uGc5, t1.CN3 cn3) {
            this.context = context;
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
            this.livePlaybackSpeedControl = new DefaultLivePlaybackSpeedControl.Builder().build();
            this.clock = Clock.DEFAULT;
            this.releaseTimeoutMs = 500L;
            this.detachSurfaceTimeoutMs = 2000L;
            this.usePlatformDiagnostics = true;
        }
    }

    @Deprecated
    public interface DeviceComponent {
        @Deprecated
        void decreaseDeviceVolume();

        @Deprecated
        DeviceInfo getDeviceInfo();

        @Deprecated
        int getDeviceVolume();

        @Deprecated
        void increaseDeviceVolume();

        @Deprecated
        boolean isDeviceMuted();

        @Deprecated
        void setDeviceMuted(boolean z2);

        @Deprecated
        void setDeviceVolume(int i2);
    }

    @Deprecated
    public interface TextComponent {
        @Deprecated
        CueGroup getCurrentCues();
    }

    @Deprecated
    public interface VideoComponent {
        @Deprecated
        void clearCameraMotionListener(CameraMotionListener cameraMotionListener);

        @Deprecated
        void clearVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener);

        @Deprecated
        void clearVideoSurface();

        @Deprecated
        void clearVideoSurface(@Nullable Surface surface);

        @Deprecated
        void clearVideoSurfaceHolder(@Nullable SurfaceHolder surfaceHolder);

        @Deprecated
        void clearVideoSurfaceView(@Nullable SurfaceView surfaceView);

        @Deprecated
        void clearVideoTextureView(@Nullable TextureView textureView);

        @Deprecated
        int getVideoChangeFrameRateStrategy();

        @Deprecated
        int getVideoScalingMode();

        @Deprecated
        VideoSize getVideoSize();

        @Deprecated
        void setCameraMotionListener(CameraMotionListener cameraMotionListener);

        @Deprecated
        void setVideoChangeFrameRateStrategy(int i2);

        @Deprecated
        void setVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener);

        @Deprecated
        void setVideoScalingMode(int i2);

        @Deprecated
        void setVideoSurface(@Nullable Surface surface);

        @Deprecated
        void setVideoSurfaceHolder(@Nullable SurfaceHolder surfaceHolder);

        @Deprecated
        void setVideoSurfaceView(@Nullable SurfaceView surfaceView);

        @Deprecated
        void setVideoTextureView(@Nullable TextureView textureView);
    }

    void addAnalyticsListener(AnalyticsListener analyticsListener);

    void addAudioOffloadListener(AudioOffloadListener audioOffloadListener);

    void addMediaSource(int i2, MediaSource mediaSource);

    void addMediaSource(MediaSource mediaSource);

    void addMediaSources(int i2, List<MediaSource> list);

    void addMediaSources(List<MediaSource> list);

    void clearAuxEffectInfo();

    void clearCameraMotionListener(CameraMotionListener cameraMotionListener);

    void clearVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener);

    PlayerMessage createMessage(PlayerMessage.Target target);

    boolean experimentalIsSleepingForOffload();

    void experimentalSetOffloadSchedulingEnabled(boolean z2);

    AnalyticsCollector getAnalyticsCollector();

    @Nullable
    @Deprecated
    AudioComponent getAudioComponent();

    @Nullable
    DecoderCounters getAudioDecoderCounters();

    @Nullable
    Format getAudioFormat();

    int getAudioSessionId();

    Clock getClock();

    @Deprecated
    TrackGroupArray getCurrentTrackGroups();

    @Deprecated
    TrackSelectionArray getCurrentTrackSelections();

    @Nullable
    @Deprecated
    DeviceComponent getDeviceComponent();

    boolean getPauseAtEndOfMediaItems();

    Looper getPlaybackLooper();

    @Override // com.google.android.exoplayer2.Player
    @Nullable
    ExoPlaybackException getPlayerError();

    Renderer getRenderer(int i2);

    int getRendererCount();

    int getRendererType(int i2);

    SeekParameters getSeekParameters();

    boolean getSkipSilenceEnabled();

    @Nullable
    @Deprecated
    TextComponent getTextComponent();

    @Nullable
    TrackSelector getTrackSelector();

    int getVideoChangeFrameRateStrategy();

    @Nullable
    @Deprecated
    VideoComponent getVideoComponent();

    @Nullable
    DecoderCounters getVideoDecoderCounters();

    @Nullable
    Format getVideoFormat();

    int getVideoScalingMode();

    @Deprecated
    void prepare(MediaSource mediaSource);

    @Deprecated
    void prepare(MediaSource mediaSource, boolean z2, boolean z3);

    void removeAnalyticsListener(AnalyticsListener analyticsListener);

    void removeAudioOffloadListener(AudioOffloadListener audioOffloadListener);

    @Deprecated
    void retry();

    void setAudioAttributes(AudioAttributes audioAttributes, boolean z2);

    void setAudioSessionId(int i2);

    void setAuxEffectInfo(AuxEffectInfo auxEffectInfo);

    void setCameraMotionListener(CameraMotionListener cameraMotionListener);

    void setForegroundMode(boolean z2);

    void setHandleAudioBecomingNoisy(boolean z2);

    @Deprecated
    void setHandleWakeLock(boolean z2);

    void setMediaSource(MediaSource mediaSource);

    void setMediaSource(MediaSource mediaSource, long j2);

    void setMediaSource(MediaSource mediaSource, boolean z2);

    void setMediaSources(List<MediaSource> list);

    void setMediaSources(List<MediaSource> list, int i2, long j2);

    void setMediaSources(List<MediaSource> list, boolean z2);

    void setPauseAtEndOfMediaItems(boolean z2);

    void setPriorityTaskManager(@Nullable PriorityTaskManager priorityTaskManager);

    void setSeekParameters(@Nullable SeekParameters seekParameters);

    void setShuffleOrder(ShuffleOrder shuffleOrder);

    void setSkipSilenceEnabled(boolean z2);

    void setVideoChangeFrameRateStrategy(int i2);

    void setVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener);

    void setVideoScalingMode(int i2);

    void setWakeMode(int i2);
}
