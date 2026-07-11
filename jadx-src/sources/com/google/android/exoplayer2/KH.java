package com.google.android.exoplayer2;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.DoNotInline;
import com.google.android.exoplayer2.AudioBecomingNoisyManager;
import com.google.android.exoplayer2.AudioFocusManager;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.ExoPlayerImplInternal;
import com.google.android.exoplayer2.MediaSourceList;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.PlayerMessage;
import com.google.android.exoplayer2.StreamVolumeManager;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.analytics.AnalyticsCollector;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.analytics.MediaMetricsListener;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.audio.AuxEffectInfo;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.MetadataOutput;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.ShuffleOrder;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.CueGroup;
import com.google.android.exoplayer2.text.TextOutput;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.trackselection.TrackSelectionArray;
import com.google.android.exoplayer2.trackselection.TrackSelectionParameters;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectorResult;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.ConditionVariable;
import com.google.android.exoplayer2.util.FlagSet;
import com.google.android.exoplayer2.util.HandlerWrapper;
import com.google.android.exoplayer2.util.ListenerSet;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.PriorityTaskManager;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.VideoDecoderOutputBufferRenderer;
import com.google.android.exoplayer2.video.VideoFrameMetadataListener;
import com.google.android.exoplayer2.video.VideoRendererEventListener;
import com.google.android.exoplayer2.video.VideoSize;
import com.google.android.exoplayer2.video.spherical.CameraMotionListener;
import com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
final class KH extends BasePlayer implements ExoPlayer, ExoPlayer.AudioComponent, ExoPlayer.VideoComponent, ExoPlayer.TextComponent, ExoPlayer.DeviceComponent {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private TextureView f57422B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private boolean f57423C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f57424D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private SurfaceHolder f57425E;
    private int E2;

    /* JADX INFO: renamed from: FX, reason: collision with root package name */
    private boolean f57426FX;

    /* JADX INFO: renamed from: G7, reason: collision with root package name */
    private VideoSize f57427G7;

    /* JADX INFO: renamed from: GR, reason: collision with root package name */
    private DecoderCounters f57428GR;
    private final boolean HI;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private int f57429I;
    private final AnalyticsCollector Ik;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private int f57430J;
    private final Renderer[] J2;
    private long Jk;
    private final HandlerWrapper KN;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private SphericalGLSurfaceView f57431M;
    private AudioTrack M7;
    private DeviceInfo Mx;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private boolean f57432N;
    private DecoderCounters Nxk;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Player f57433O;
    private Format P5;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final Clock f57434S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private int f57435T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private Format f57436U;
    private final TrackSelector Uo;
    private final AudioBecomingNoisyManager ViF;
    private final w6 WPU;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private int f57437X;
    private final long XQ;
    private MediaMetadata Xw;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private int f57438Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final long f57439Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f57440a;
    private final Ml aYN;
    private final Timeline.Period az;
    private Player.Commands bzg;
    private final MediaSource.Factory ck;
    private float dR0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f57441e;
    private Surface eF;
    private boolean eTf;
    private T eWT;
    private final long fD;
    private MediaMetadata fcU;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final StreamVolumeManager f57442g;
    private final ListenerSet gh;
    private final nSC iF;
    private VideoFrameMetadataListener ijL;
    private MediaMetadata jB;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private AudioAttributes f57443k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private CameraMotionListener f57444m;
    private final ExoPlayerImplInternal mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final TrackSelectorResult f57445n;
    private int n1;
    private int nHg;
    private final AudioFocusManager nY;
    private final Context nr;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final BandwidthMeter f57446o;
    private boolean ofS;
    private Object p5;
    private PriorityTaskManager pJg;
    private CueGroup piY;
    private final CopyOnWriteArraySet qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Looper f57447r;
    private boolean rV9;
    final Player.Commands rl;
    private boolean s7N;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ConditionVariable f57448t;
    private final Y5 te;
    private final List ty;
    private int ul;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private ShuffleOrder f57449v;
    private SeekParameters wTp;
    private final ExoPlayerImplInternal.PlaybackInfoUpdateListener xMQ;
    private boolean xg;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f57450z;

    private static final class I28 implements CM {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Object f57451n;
        private Timeline rl;

        @Override // com.google.android.exoplayer2.CM
        public Timeline getTimeline() {
            return this.rl;
        }

        @Override // com.google.android.exoplayer2.CM
        public Object getUid() {
            return this.f57451n;
        }

        public I28(Object obj, Timeline timeline) {
            this.f57451n = obj;
            this.rl = timeline;
        }
    }

    private static final class Ml implements VideoFrameMetadataListener, CameraMotionListener, PlayerMessage.Target {
        private CameraMotionListener J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private VideoFrameMetadataListener f57452O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private VideoFrameMetadataListener f57453n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private CameraMotionListener f57454t;

        private Ml() {
        }

        @Override // com.google.android.exoplayer2.PlayerMessage.Target
        public void handleMessage(int i2, Object obj) {
            if (i2 == 7) {
                this.f57453n = (VideoFrameMetadataListener) obj;
                return;
            }
            if (i2 == 8) {
                this.f57454t = (CameraMotionListener) obj;
                return;
            }
            if (i2 != 10000) {
                return;
            }
            SphericalGLSurfaceView sphericalGLSurfaceView = (SphericalGLSurfaceView) obj;
            if (sphericalGLSurfaceView == null) {
                this.f57452O = null;
                this.J2 = null;
            } else {
                this.f57452O = sphericalGLSurfaceView.getVideoFrameMetadataListener();
                this.J2 = sphericalGLSurfaceView.getCameraMotionListener();
            }
        }

        @Override // com.google.android.exoplayer2.video.spherical.CameraMotionListener
        public void onCameraMotion(long j2, float[] fArr) {
            CameraMotionListener cameraMotionListener = this.J2;
            if (cameraMotionListener != null) {
                cameraMotionListener.onCameraMotion(j2, fArr);
            }
            CameraMotionListener cameraMotionListener2 = this.f57454t;
            if (cameraMotionListener2 != null) {
                cameraMotionListener2.onCameraMotion(j2, fArr);
            }
        }

        @Override // com.google.android.exoplayer2.video.spherical.CameraMotionListener
        public void onCameraMotionReset() {
            CameraMotionListener cameraMotionListener = this.J2;
            if (cameraMotionListener != null) {
                cameraMotionListener.onCameraMotionReset();
            }
            CameraMotionListener cameraMotionListener2 = this.f57454t;
            if (cameraMotionListener2 != null) {
                cameraMotionListener2.onCameraMotionReset();
            }
        }

        @Override // com.google.android.exoplayer2.video.VideoFrameMetadataListener
        public void onVideoFrameAboutToBeRendered(long j2, long j3, Format format, MediaFormat mediaFormat) {
            long j4;
            long j5;
            Format format2;
            MediaFormat mediaFormat2;
            VideoFrameMetadataListener videoFrameMetadataListener = this.f57452O;
            if (videoFrameMetadataListener != null) {
                videoFrameMetadataListener.onVideoFrameAboutToBeRendered(j2, j3, format, mediaFormat);
                mediaFormat2 = mediaFormat;
                format2 = format;
                j5 = j3;
                j4 = j2;
            } else {
                j4 = j2;
                j5 = j3;
                format2 = format;
                mediaFormat2 = mediaFormat;
            }
            VideoFrameMetadataListener videoFrameMetadataListener2 = this.f57453n;
            if (videoFrameMetadataListener2 != null) {
                videoFrameMetadataListener2.onVideoFrameAboutToBeRendered(j4, j5, format2, mediaFormat2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class w6 implements VideoRendererEventListener, AudioRendererEventListener, TextOutput, MetadataOutput, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, SphericalGLSurfaceView.VideoSurfaceListener, AudioFocusManager.PlayerControl, AudioBecomingNoisyManager.EventListener, StreamVolumeManager.Listener, ExoPlayer.AudioOffloadListener {
        private w6() {
        }

        @Override // com.google.android.exoplayer2.text.TextOutput
        public void onCues(final List list) {
            KH.this.gh.sendEvent(27, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.Mf
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onCues((List<Cue>) list);
                }
            });
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // com.google.android.exoplayer2.AudioFocusManager.PlayerControl
        public void executePlayerCommand(int i2) {
            boolean playWhenReady = KH.this.getPlayWhenReady();
            KH.this.K(playWhenReady, i2, KH.xg(playWhenReady, i2));
        }

        @Override // com.google.android.exoplayer2.AudioBecomingNoisyManager.EventListener
        public void onAudioBecomingNoisy() {
            KH.this.K(false, -1, 3);
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public void onAudioCodecError(Exception exc) {
            KH.this.Ik.onAudioCodecError(exc);
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public void onAudioDecoderInitialized(String str, long j2, long j3) {
            KH.this.Ik.onAudioDecoderInitialized(str, j2, j3);
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public void onAudioDecoderReleased(String str) {
            KH.this.Ik.onAudioDecoderReleased(str);
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public void onAudioDisabled(DecoderCounters decoderCounters) {
            KH.this.Ik.onAudioDisabled(decoderCounters);
            KH.this.P5 = null;
            KH.this.Nxk = null;
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public void onAudioEnabled(DecoderCounters decoderCounters) {
            KH.this.Nxk = decoderCounters;
            KH.this.Ik.onAudioEnabled(decoderCounters);
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public void onAudioInputFormatChanged(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
            KH.this.P5 = format;
            KH.this.Ik.onAudioInputFormatChanged(format, decoderReuseEvaluation);
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public void onAudioPositionAdvancing(long j2) {
            KH.this.Ik.onAudioPositionAdvancing(j2);
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public void onAudioSinkError(Exception exc) {
            KH.this.Ik.onAudioSinkError(exc);
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public void onAudioUnderrun(int i2, long j2, long j3) {
            KH.this.Ik.onAudioUnderrun(i2, j2, j3);
        }

        @Override // com.google.android.exoplayer2.text.TextOutput
        public void onCues(final CueGroup cueGroup) {
            KH.this.piY = cueGroup;
            KH.this.gh.sendEvent(27, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.o7q
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onCues(cueGroup);
                }
            });
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public void onDroppedFrames(int i2, long j2) {
            KH.this.Ik.onDroppedFrames(i2, j2);
        }

        @Override // com.google.android.exoplayer2.ExoPlayer.AudioOffloadListener
        public void onExperimentalSleepingForOffloadChanged(boolean z2) {
            KH.this.ER();
        }

        @Override // com.google.android.exoplayer2.metadata.MetadataOutput
        public void onMetadata(final Metadata metadata) {
            KH kh = KH.this;
            kh.fcU = kh.fcU.buildUpon().populateFromMetadata(metadata).build();
            MediaMetadata mediaMetadataNxk = KH.this.Nxk();
            if (!mediaMetadataNxk.equals(KH.this.Xw)) {
                KH.this.Xw = mediaMetadataNxk;
                KH.this.gh.queueEvent(14, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.xZD
                    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                    public final void invoke(Object obj) {
                        ((Player.Listener) obj).onMediaMetadataChanged(KH.this.Xw);
                    }
                });
            }
            KH.this.gh.queueEvent(28, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.M5
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onMetadata(metadata);
                }
            });
            KH.this.gh.flushEvents();
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public void onRenderedFirstFrame(Object obj, long j2) {
            KH.this.Ik.onRenderedFirstFrame(obj, j2);
            if (KH.this.p5 == obj) {
                KH.this.gh.sendEvent(26, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.YzO
                    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                    public final void invoke(Object obj2) {
                        ((Player.Listener) obj2).onRenderedFirstFrame();
                    }
                });
            }
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public void onSkipSilenceEnabledChanged(final boolean z2) {
            if (KH.this.f57450z == z2) {
                return;
            }
            KH.this.f57450z = z2;
            KH.this.gh.sendEvent(23, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.FKk
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onSkipSilenceEnabledChanged(z2);
                }
            });
        }

        @Override // com.google.android.exoplayer2.StreamVolumeManager.Listener
        public void onStreamTypeChanged(int i2) {
            final DeviceInfo deviceInfoY = KH.Y(KH.this.f57442g);
            if (deviceInfoY.equals(KH.this.Mx)) {
                return;
            }
            KH.this.Mx = deviceInfoY;
            KH.this.gh.sendEvent(29, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.Fl
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onDeviceInfoChanged(deviceInfoY);
                }
            });
        }

        @Override // com.google.android.exoplayer2.StreamVolumeManager.Listener
        public void onStreamVolumeChanged(final int i2, final boolean z2) {
            KH.this.gh.sendEvent(30, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.QaP
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onDeviceVolumeChanged(i2, z2);
                }
            });
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
            KH.this.EWS(surfaceTexture);
            KH.this.n1(i2, i3);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            KH.this.hRu(null);
            KH.this.n1(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
            KH.this.n1(i2, i3);
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public void onVideoCodecError(Exception exc) {
            KH.this.Ik.onVideoCodecError(exc);
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public void onVideoDecoderInitialized(String str, long j2, long j3) {
            KH.this.Ik.onVideoDecoderInitialized(str, j2, j3);
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public void onVideoDecoderReleased(String str) {
            KH.this.Ik.onVideoDecoderReleased(str);
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public void onVideoDisabled(DecoderCounters decoderCounters) {
            KH.this.Ik.onVideoDisabled(decoderCounters);
            KH.this.f57436U = null;
            KH.this.f57428GR = null;
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public void onVideoEnabled(DecoderCounters decoderCounters) {
            KH.this.f57428GR = decoderCounters;
            KH.this.Ik.onVideoEnabled(decoderCounters);
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public void onVideoFrameProcessingOffset(long j2, int i2) {
            KH.this.Ik.onVideoFrameProcessingOffset(j2, i2);
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public void onVideoInputFormatChanged(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
            KH.this.f57436U = format;
            KH.this.Ik.onVideoInputFormatChanged(format, decoderReuseEvaluation);
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public void onVideoSizeChanged(final VideoSize videoSize) {
            KH.this.f57427G7 = videoSize;
            KH.this.gh.sendEvent(25, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.R6
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onVideoSizeChanged(videoSize);
                }
            });
        }

        @Override // com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView.VideoSurfaceListener
        public void onVideoSurfaceCreated(Surface surface) {
            KH.this.hRu(surface);
        }

        @Override // com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView.VideoSurfaceListener
        public void onVideoSurfaceDestroyed(Surface surface) {
            KH.this.hRu(null);
        }

        @Override // com.google.android.exoplayer2.AudioFocusManager.PlayerControl
        public void setVolumeMultiplier(float f3) {
            KH.this.HV();
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i5) {
            KH.this.n1(i3, i5);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            if (KH.this.f57426FX) {
                KH.this.hRu(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            if (KH.this.f57426FX) {
                KH.this.hRu(null);
            }
            KH.this.n1(0, 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K(boolean z2, int i2, int i3) {
        int i5 = 0;
        boolean z3 = z2 && i2 != -1;
        if (z3 && i2 != 1) {
            i5 = 1;
        }
        T t3 = this.eWT;
        if (t3.qie == z3 && t3.az == i5) {
            return;
        }
        this.f57437X++;
        T tO = t3.O(z3, i5);
        this.mUb.tUK(z3, i5);
        How(tO, 0, i3, false, false, 5, -9223372036854775807L, -1);
    }

    private void Po6(SurfaceHolder surfaceHolder) {
        this.f57426FX = false;
        this.f57425E = surfaceHolder;
        surfaceHolder.addCallback(this.WPU);
        Surface surface = this.f57425E.getSurface();
        if (surface == null || !surface.isValid()) {
            n1(0, 0);
        } else {
            Rect surfaceFrame = this.f57425E.getSurfaceFrame();
            n1(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    private T Rl(int i2, int i3) {
        Assertions.checkArgument(i2 >= 0 && i3 >= i2 && i3 <= this.ty.size());
        int currentMediaItemIndex = getCurrentMediaItemIndex();
        Timeline currentTimeline = getCurrentTimeline();
        int size = this.ty.size();
        this.f57437X++;
        qm(i2, i3);
        Timeline timelineK = k();
        T tEWT = eWT(this.eWT, timelineK, eTf(currentTimeline, timelineK));
        int i5 = tEWT.f57506O;
        if (i5 != 1 && i5 != 4 && i2 < i3 && i3 == size && currentMediaItemIndex >= tEWT.f57507n.getWindowCount()) {
            tEWT = tEWT.KN(4);
        }
        this.mUb.dR0(i2, i3, this.f57449v);
        return tEWT;
    }

    private void UhV(boolean z2, ExoPlaybackException exoPlaybackException) {
        T tRl;
        if (z2) {
            tRl = Rl(0, this.ty.size()).J2(null);
        } else {
            T t3 = this.eWT;
            tRl = t3.rl(t3.rl);
            tRl.Ik = tRl.f57508o;
            tRl.f57509r = 0L;
        }
        T tKN = tRl.KN(1);
        if (exoPlaybackException != null) {
            tKN = tKN.J2(exoPlaybackException);
        }
        T t4 = tKN;
        this.f57437X++;
        this.mUb.HBN();
        How(t4, 0, 1, false, t4.f57507n.isEmpty() && !this.eWT.f57507n.isEmpty(), 4, ijL(t4), -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int xg(boolean z2, int i2) {
        return (!z2 || i2 == 1) ? 1 : 2;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void addMediaSource(MediaSource mediaSource) {
        lLA();
        addMediaSources(Collections.singletonList(mediaSource));
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void addMediaSources(List list) {
        lLA();
        addMediaSources(this.ty.size(), list);
    }

    @Override // com.google.android.exoplayer2.Player
    public void clearVideoSurface() {
        lLA();
        mYa();
        hRu(null);
        n1(0, 0);
    }

    @Override // com.google.android.exoplayer2.Player
    public void prepare() {
        lLA();
        boolean playWhenReady = getPlayWhenReady();
        int iCk = this.nY.ck(playWhenReady, 2);
        K(playWhenReady, iCk, xg(playWhenReady, iCk));
        T t3 = this.eWT;
        if (t3.f57506O != 1) {
            return;
        }
        T tJ2 = t3.J2(null);
        T tKN = tJ2.KN(tJ2.f57507n.isEmpty() ? 4 : 2);
        this.f57437X++;
        this.mUb.I();
        How(tKN, 1, 1, false, false, 5, -9223372036854775807L, -1);
    }

    @Override // com.google.android.exoplayer2.Player
    public void setMediaItems(List list, boolean z2) {
        lLA();
        setMediaSources(dR0(list), z2);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setMediaSource(MediaSource mediaSource) {
        lLA();
        setMediaSources(Collections.singletonList(mediaSource));
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setMediaSources(List list) {
        lLA();
        setMediaSources(list, true);
    }

    @Override // com.google.android.exoplayer2.Player
    public void stop() {
        lLA();
        stop(false);
    }

    private static final class n {
        @DoNotInline
        public static PlayerId n(Context context, KH kh, boolean z2) {
            MediaMetricsListener mediaMetricsListenerCreate = MediaMetricsListener.create(context);
            if (mediaMetricsListenerCreate == null) {
                Log.w("ExoPlayerImpl", "MediaMetricsService unavailable.");
                return new PlayerId(LogSessionId.LOG_SESSION_ID_NONE);
            }
            if (z2) {
                kh.addAnalyticsListener(mediaMetricsListenerCreate);
            }
            return new PlayerId(mediaMetricsListenerCreate.getLogSessionId());
        }
    }

    static {
        ExoPlayerLibraryInfo.registerModule("goog.exo.exoplayer");
    }

    public KH(ExoPlayer.Builder builder, Player player) {
        boolean z2;
        ConditionVariable conditionVariable = new ConditionVariable();
        this.f57448t = conditionVariable;
        try {
            Log.i("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [" + ExoPlayerLibraryInfo.VERSION_SLASHY + "] [" + Util.DEVICE_DEBUG_INFO + "]");
            Context applicationContext = builder.context.getApplicationContext();
            this.nr = applicationContext;
            AnalyticsCollector analyticsCollector = (AnalyticsCollector) builder.analyticsCollectorFunction.apply(builder.clock);
            this.Ik = analyticsCollector;
            this.pJg = builder.priorityTaskManager;
            this.f57443k = builder.audioAttributes;
            this.f57430J = builder.videoScalingMode;
            this.f57424D = builder.videoChangeFrameRateStrategy;
            this.f57450z = builder.skipSilenceEnabled;
            this.fD = builder.detachSurfaceTimeoutMs;
            w6 w6Var = new w6();
            this.WPU = w6Var;
            Ml ml = new Ml();
            this.aYN = ml;
            Handler handler = new Handler(builder.looper);
            Renderer[] rendererArrCreateRenderers = ((RenderersFactory) builder.renderersFactorySupplier.get()).createRenderers(handler, w6Var, w6Var, w6Var, w6Var);
            this.J2 = rendererArrCreateRenderers;
            Assertions.checkState(rendererArrCreateRenderers.length > 0);
            TrackSelector trackSelector = (TrackSelector) builder.trackSelectorSupplier.get();
            this.Uo = trackSelector;
            this.ck = (MediaSource.Factory) builder.mediaSourceFactorySupplier.get();
            BandwidthMeter bandwidthMeter = (BandwidthMeter) builder.bandwidthMeterSupplier.get();
            this.f57446o = bandwidthMeter;
            this.HI = builder.useLazyPreparation;
            this.wTp = builder.seekParameters;
            this.f57439Z = builder.seekBackIncrementMs;
            this.XQ = builder.seekForwardIncrementMs;
            this.rV9 = builder.pauseAtEndOfMediaItems;
            Looper looper = builder.looper;
            this.f57447r = looper;
            Clock clock = builder.clock;
            this.f57434S = clock;
            Player player2 = player == null ? this : player;
            this.f57433O = player2;
            this.gh = new ListenerSet(looper, clock, new ListenerSet.IterationFinishedEvent() { // from class: com.google.android.exoplayer2.Zs
                @Override // com.google.android.exoplayer2.util.ListenerSet.IterationFinishedEvent
                public final void invoke(Object obj, FlagSet flagSet) {
                    ((Player.Listener) obj).onEvents(this.f57516n.f57433O, new Player.Events(flagSet));
                }
            });
            this.qie = new CopyOnWriteArraySet();
            this.ty = new ArrayList();
            this.f57449v = new ShuffleOrder.DefaultShuffleOrder(0);
            TrackSelectorResult trackSelectorResult = new TrackSelectorResult(new RendererConfiguration[rendererArrCreateRenderers.length], new ExoTrackSelection[rendererArrCreateRenderers.length], Tracks.EMPTY, null);
            this.f57445n = trackSelectorResult;
            this.az = new Timeline.Period();
            Player.Commands commandsBuild = new Player.Commands.Builder().addAll(1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28, 31).addIf(29, trackSelector.isSetParametersSupported()).build();
            this.rl = commandsBuild;
            this.bzg = new Player.Commands.Builder().addAll(commandsBuild).add(4).add(10).build();
            this.KN = clock.createHandler(looper, null);
            ExoPlayerImplInternal.PlaybackInfoUpdateListener playbackInfoUpdateListener = new ExoPlayerImplInternal.PlaybackInfoUpdateListener() { // from class: com.google.android.exoplayer2.P
                @Override // com.google.android.exoplayer2.ExoPlayerImplInternal.PlaybackInfoUpdateListener
                public final void onPlaybackInfoUpdate(ExoPlayerImplInternal.PlaybackInfoUpdate playbackInfoUpdate) {
                    KH kh = this.f57491n;
                    kh.KN.post(new Runnable() { // from class: com.google.android.exoplayer2.pO
                        @Override // java.lang.Runnable
                        public final void run() {
                            kh.Mx(playbackInfoUpdate);
                        }
                    });
                }
            };
            this.xMQ = playbackInfoUpdateListener;
            this.eWT = T.gh(trackSelectorResult);
            analyticsCollector.setPlayer(player2, looper);
            int i2 = Util.SDK_INT;
            ExoPlayerImplInternal exoPlayerImplInternal = new ExoPlayerImplInternal(rendererArrCreateRenderers, trackSelector, trackSelectorResult, (LoadControl) builder.loadControlSupplier.get(), bandwidthMeter, this.E2, this.f57441e, analyticsCollector, this.wTp, builder.livePlaybackSpeedControl, builder.releaseTimeoutMs, this.rV9, looper, clock, playbackInfoUpdateListener, i2 < 31 ? new PlayerId() : n.n(applicationContext, this, builder.usePlatformDiagnostics));
            this.mUb = exoPlayerImplInternal;
            this.dR0 = 1.0f;
            this.E2 = 0;
            MediaMetadata mediaMetadata = MediaMetadata.EMPTY;
            this.Xw = mediaMetadata;
            this.jB = mediaMetadata;
            this.fcU = mediaMetadata;
            this.ul = -1;
            if (i2 < 21) {
                z2 = false;
                this.f57438Y = G7(0);
            } else {
                z2 = false;
                this.f57438Y = Util.generateAudioSessionIdV21(applicationContext);
            }
            this.piY = CueGroup.EMPTY;
            this.eTf = true;
            addListener(analyticsCollector);
            bandwidthMeter.addEventListener(new Handler(looper), analyticsCollector);
            addAudioOffloadListener(w6Var);
            long j2 = builder.foregroundModeTimeoutMs;
            if (j2 > 0) {
                exoPlayerImplInternal.HI(j2);
            }
            AudioBecomingNoisyManager audioBecomingNoisyManager = new AudioBecomingNoisyManager(builder.context, handler, w6Var);
            this.ViF = audioBecomingNoisyManager;
            audioBecomingNoisyManager.rl(builder.handleAudioBecomingNoisy);
            AudioFocusManager audioFocusManager = new AudioFocusManager(builder.context, handler, w6Var);
            this.nY = audioFocusManager;
            audioFocusManager.az(builder.handleAudioFocus ? this.f57443k : null);
            StreamVolumeManager streamVolumeManager = new StreamVolumeManager(builder.context, handler, w6Var);
            this.f57442g = streamVolumeManager;
            streamVolumeManager.az(Util.getStreamTypeForAudioUsage(this.f57443k.usage));
            Y5 y5 = new Y5(builder.context);
            this.te = y5;
            y5.n(builder.wakeMode != 0 ? true : z2);
            nSC nsc = new nSC(builder.context);
            this.iF = nsc;
            nsc.n(builder.wakeMode == 2 ? true : z2);
            this.Mx = Y(streamVolumeManager);
            this.f57427G7 = VideoSize.UNKNOWN;
            trackSelector.setAudioAttributes(this.f57443k);
            Org(1, 10, Integer.valueOf(this.f57438Y));
            Org(2, 10, Integer.valueOf(this.f57438Y));
            Org(1, 3, this.f57443k);
            Org(2, 4, Integer.valueOf(this.f57430J));
            Org(2, 5, Integer.valueOf(this.f57424D));
            Org(1, 9, Boolean.valueOf(this.f57450z));
            Org(2, 7, ml);
            Org(6, 8, ml);
            conditionVariable.open();
        } catch (Throwable th) {
            this.f57448t.open();
            throw th;
        }
    }

    private static long C(T t3) {
        Timeline.Window window = new Timeline.Window();
        Timeline.Period period = new Timeline.Period();
        t3.f57507n.getPeriodByUid(t3.rl.periodUid, period);
        return t3.f57510t == -9223372036854775807L ? t3.f57507n.getWindow(period.windowIndex, window).getDefaultPositionUs() : period.getPositionInWindowUs() + t3.f57510t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void EWS(SurfaceTexture surfaceTexture) {
        Surface surface = new Surface(surfaceTexture);
        hRu(surface);
        this.eF = surface;
    }

    private int G7(int i2) {
        AudioTrack audioTrack = this.M7;
        if (audioTrack != null && audioTrack.getAudioSessionId() != i2) {
            this.M7.release();
            this.M7 = null;
        }
        if (this.M7 == null) {
            this.M7 = new AudioTrack(3, Sdk.SDKError.Reason.VUNGLE_OIT_CREATION_ERROR_VALUE, 4, 2, 2, 0, i2);
        }
        return this.M7.getAudioSessionId();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void GD(List list, int i2, long j2, boolean z2) {
        long j3;
        int i3;
        int i5;
        int firstWindowIndex = i2;
        int iM = m();
        long currentPosition = getCurrentPosition();
        this.f57437X++;
        if (!this.ty.isEmpty()) {
            qm(0, this.ty.size());
        }
        List listGR = GR(0, list);
        Timeline timelineK = k();
        if (!timelineK.isEmpty() && firstWindowIndex >= timelineK.getWindowCount()) {
            throw new IllegalSeekPositionException(timelineK, firstWindowIndex, j2);
        }
        if (z2) {
            firstWindowIndex = timelineK.getFirstWindowIndex(this.f57441e);
            j3 = -9223372036854775807L;
        } else {
            if (firstWindowIndex == -1) {
                i3 = iM;
                j3 = currentPosition;
                T tEWT = eWT(this.eWT, timelineK, ul(timelineK, i3, j3));
                i5 = tEWT.f57506O;
                if (i3 != -1 && i5 != 1) {
                    i5 = (!timelineK.isEmpty() || i3 >= timelineK.getWindowCount()) ? 4 : 2;
                }
                T tKN = tEWT.KN(i5);
                this.mUb.UhV(listGR, i3, Util.msToUs(j3), this.f57449v);
                How(tKN, 0, 1, false, this.eWT.rl.periodUid.equals(tKN.rl.periodUid) && !this.eWT.f57507n.isEmpty(), 4, ijL(tKN), -1);
            }
            j3 = j2;
        }
        i3 = firstWindowIndex;
        T tEWT2 = eWT(this.eWT, timelineK, ul(timelineK, i3, j3));
        i5 = tEWT2.f57506O;
        if (i3 != -1) {
            if (timelineK.isEmpty()) {
            }
        }
        T tKN2 = tEWT2.KN(i5);
        this.mUb.UhV(listGR, i3, Util.msToUs(j3), this.f57449v);
        How(tKN2, 0, 1, false, this.eWT.rl.periodUid.equals(tKN2.rl.periodUid) && !this.eWT.f57507n.isEmpty(), 4, ijL(tKN2), -1);
    }

    private List GR(int i2, List list) {
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            MediaSourceList.w6 w6Var = new MediaSourceList.w6((MediaSource) list.get(i3), this.HI);
            arrayList.add(w6Var);
            this.ty.add(i3 + i2, new I28(w6Var.rl, w6Var.f57475n.getTimeline()));
        }
        this.f57449v = this.f57449v.cloneAndInsert(i2, arrayList.size());
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void HV() {
        Org(1, 2, Float.valueOf(this.dR0 * this.nY.Uo()));
    }

    private void How(final T t3, final int i2, final int i3, boolean z2, boolean z3, final int i5, long j2, int i7) {
        T t4 = this.eWT;
        this.eWT = t3;
        Pair pairPiY = piY(t3, t4, z3, i5, !t4.f57507n.equals(t3.f57507n));
        boolean zBooleanValue = ((Boolean) pairPiY.first).booleanValue();
        final int iIntValue = ((Integer) pairPiY.second).intValue();
        MediaMetadata mediaMetadataNxk = this.Xw;
        if (zBooleanValue) {
            mediaItem = t3.f57507n.isEmpty() ? null : t3.f57507n.getWindow(t3.f57507n.getPeriodByUid(t3.rl.periodUid, this.az).windowIndex, this.window).mediaItem;
            this.fcU = MediaMetadata.EMPTY;
        }
        if (zBooleanValue || !t4.mUb.equals(t3.mUb)) {
            this.fcU = this.fcU.buildUpon().populateFromMetadata(t3.mUb).build();
            mediaMetadataNxk = Nxk();
        }
        boolean zEquals = mediaMetadataNxk.equals(this.Xw);
        this.Xw = mediaMetadataNxk;
        boolean z4 = t4.qie != t3.qie;
        boolean z5 = t4.f57506O != t3.f57506O;
        if (z5 || z4) {
            ER();
        }
        boolean z6 = t4.Uo;
        boolean z7 = t3.Uo;
        boolean z9 = z6 != z7;
        if (z9) {
            tUK(z7);
        }
        if (!t4.f57507n.equals(t3.f57507n)) {
            this.gh.queueEvent(0, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.O
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    Player.Listener listener = (Player.Listener) obj;
                    listener.onTimelineChanged(t3.f57507n, i2);
                }
            });
        }
        if (z3) {
            final Player.PositionInfo positionInfoOfS = ofS(i5, t4, i7);
            final Player.PositionInfo positionInfoPJg = pJg(j2);
            this.gh.queueEvent(11, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.Ln
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    KH.HI(i5, positionInfoOfS, positionInfoPJg, (Player.Listener) obj);
                }
            });
        }
        if (zBooleanValue) {
            this.gh.queueEvent(1, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.lej
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onMediaItemTransition(mediaItem, iIntValue);
                }
            });
        }
        if (t4.J2 != t3.J2) {
            this.gh.queueEvent(10, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.iwV
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onPlayerErrorChanged(t3.J2);
                }
            });
            if (t3.J2 != null) {
                this.gh.queueEvent(10, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.M
                    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                    public final void invoke(Object obj) {
                        ((Player.Listener) obj).onPlayerError(t3.J2);
                    }
                });
            }
        }
        TrackSelectorResult trackSelectorResult = t4.xMQ;
        TrackSelectorResult trackSelectorResult2 = t3.xMQ;
        if (trackSelectorResult != trackSelectorResult2) {
            this.Uo.onSelectionActivated(trackSelectorResult2.info);
            this.gh.queueEvent(2, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.rv6
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onTracksChanged(t3.xMQ.tracks);
                }
            });
        }
        if (!zEquals) {
            final MediaMetadata mediaMetadata = this.Xw;
            this.gh.queueEvent(14, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.vd
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onMediaMetadataChanged(mediaMetadata);
                }
            });
        }
        if (z9) {
            this.gh.queueEvent(3, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.Lu
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    KH.aYN(t3, (Player.Listener) obj);
                }
            });
        }
        if (z5 || z4) {
            this.gh.queueEvent(-1, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.h
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    T t5 = t3;
                    ((Player.Listener) obj).onPlayerStateChanged(t5.qie, t5.f57506O);
                }
            });
        }
        if (z5) {
            this.gh.queueEvent(4, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.psW
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onPlaybackStateChanged(t3.f57506O);
                }
            });
        }
        if (z4) {
            this.gh.queueEvent(5, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.LEl
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    Player.Listener listener = (Player.Listener) obj;
                    listener.onPlayWhenReadyChanged(t3.qie, i3);
                }
            });
        }
        if (t4.az != t3.az) {
            this.gh.queueEvent(6, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.gnv
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onPlaybackSuppressionReasonChanged(t3.az);
                }
            });
        }
        if (fcU(t4) != fcU(t3)) {
            this.gh.queueEvent(7, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.fg
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onIsPlayingChanged(KH.fcU(t3));
                }
            });
        }
        if (!t4.ty.equals(t3.ty)) {
            this.gh.queueEvent(12, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.u
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onPlaybackParametersChanged(t3.ty);
                }
            });
        }
        if (z2) {
            this.gh.queueEvent(-1, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.qf
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onSeekProcessed();
                }
            });
        }
        i();
        this.gh.flushEvents();
        if (t4.HI != t3.HI) {
            Iterator it = this.qie.iterator();
            while (it.hasNext()) {
                ((ExoPlayer.AudioOffloadListener) it.next()).onExperimentalOffloadSchedulingEnabledChanged(t3.HI);
            }
        }
        if (t4.ck != t3.ck) {
            Iterator it2 = this.qie.iterator();
            while (it2.hasNext()) {
                ((ExoPlayer.AudioOffloadListener) it2.next()).onExperimentalSleepingForOffloadChanged(t3.ck);
            }
        }
    }

    private long Jk(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, long j2) {
        timeline.getPeriodByUid(mediaPeriodId.periodUid, this.az);
        return j2 + this.az.getPositionInWindowUs();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Mx(ExoPlayerImplInternal.PlaybackInfoUpdate playbackInfoUpdate) {
        long jJk;
        int i2 = this.f57437X - playbackInfoUpdate.operationAcks;
        this.f57437X = i2;
        boolean z2 = true;
        if (playbackInfoUpdate.positionDiscontinuity) {
            this.f57435T = playbackInfoUpdate.discontinuityReason;
            this.f57432N = true;
        }
        if (playbackInfoUpdate.hasPlayWhenReadyChangeReason) {
            this.nHg = playbackInfoUpdate.playWhenReadyChangeReason;
        }
        if (i2 == 0) {
            Timeline timeline = playbackInfoUpdate.playbackInfo.f57507n;
            if (!this.eWT.f57507n.isEmpty() && timeline.isEmpty()) {
                this.ul = -1;
                this.Jk = 0L;
                this.n1 = 0;
            }
            if (!timeline.isEmpty()) {
                List listRl = ((h6y) timeline).rl();
                Assertions.checkState(listRl.size() == this.ty.size());
                for (int i3 = 0; i3 < listRl.size(); i3++) {
                    ((I28) this.ty.get(i3)).rl = (Timeline) listRl.get(i3);
                }
            }
            long j2 = -9223372036854775807L;
            if (this.f57432N) {
                if (playbackInfoUpdate.playbackInfo.rl.equals(this.eWT.rl) && playbackInfoUpdate.playbackInfo.nr == this.eWT.f57508o) {
                    z2 = false;
                }
                if (z2) {
                    if (timeline.isEmpty() || playbackInfoUpdate.playbackInfo.rl.isAd()) {
                        jJk = playbackInfoUpdate.playbackInfo.nr;
                    } else {
                        T t3 = playbackInfoUpdate.playbackInfo;
                        jJk = Jk(timeline, t3.rl, t3.nr);
                    }
                    j2 = jJk;
                }
            } else {
                z2 = false;
            }
            long j3 = j2;
            this.f57432N = false;
            How(playbackInfoUpdate.playbackInfo, 1, this.nHg, false, z2, this.f57435T, j3, -1);
        }
    }

    private void Org(int i2, int i3, Object obj) {
        for (Renderer renderer : this.J2) {
            if (renderer.getTrackType() == i2) {
                z(renderer).setType(i3).setPayload(obj).send();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static DeviceInfo Y(StreamVolumeManager streamVolumeManager) {
        return new DeviceInfo(0, streamVolumeManager.O(), streamVolumeManager.nr());
    }

    public static /* synthetic */ void aYN(T t3, Player.Listener listener) {
        listener.onLoadingChanged(t3.Uo);
        listener.onIsLoadingChanged(t3.Uo);
    }

    private List dR0(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            arrayList.add(this.ck.createMediaSource((MediaItem) list.get(i2)));
        }
        return arrayList;
    }

    private T eWT(T t3, Timeline timeline, Pair pair) {
        Assertions.checkArgument(timeline.isEmpty() || pair != null);
        Timeline timeline2 = t3.f57507n;
        T tMUb = t3.mUb(timeline);
        if (timeline.isEmpty()) {
            MediaSource.MediaPeriodId mediaPeriodIdQie = T.qie();
            long jMsToUs = Util.msToUs(this.Jk);
            T tRl = tMUb.t(mediaPeriodIdQie, jMsToUs, jMsToUs, jMsToUs, 0L, TrackGroupArray.EMPTY, this.f57445n, com.google.common.collect.nKK.r()).rl(mediaPeriodIdQie);
            tRl.Ik = tRl.f57508o;
            return tRl;
        }
        Object obj = tMUb.rl.periodUid;
        boolean zEquals = obj.equals(((Pair) Util.castNonNull(pair)).first);
        MediaSource.MediaPeriodId mediaPeriodId = !zEquals ? new MediaSource.MediaPeriodId(pair.first) : tMUb.rl;
        long jLongValue = ((Long) pair.second).longValue();
        long jMsToUs2 = Util.msToUs(getContentPosition());
        if (!timeline2.isEmpty()) {
            jMsToUs2 -= timeline2.getPeriodByUid(obj, this.az).getPositionInWindowUs();
        }
        if (!zEquals || jLongValue < jMsToUs2) {
            MediaSource.MediaPeriodId mediaPeriodId2 = mediaPeriodId;
            Assertions.checkState(!mediaPeriodId2.isAd());
            T tRl2 = tMUb.t(mediaPeriodId2, jLongValue, jLongValue, jLongValue, 0L, !zEquals ? TrackGroupArray.EMPTY : tMUb.KN, !zEquals ? this.f57445n : tMUb.xMQ, !zEquals ? com.google.common.collect.nKK.r() : tMUb.mUb).rl(mediaPeriodId2);
            tRl2.Ik = jLongValue;
            return tRl2;
        }
        if (jLongValue != jMsToUs2) {
            MediaSource.MediaPeriodId mediaPeriodId3 = mediaPeriodId;
            Assertions.checkState(!mediaPeriodId3.isAd());
            long jMax = Math.max(0L, tMUb.f57509r - (jLongValue - jMsToUs2));
            long j2 = tMUb.Ik;
            if (tMUb.gh.equals(tMUb.rl)) {
                j2 = jLongValue + jMax;
            }
            T t4 = tMUb.t(mediaPeriodId3, jLongValue, jLongValue, jLongValue, jMax, tMUb.KN, tMUb.xMQ, tMUb.mUb);
            t4.Ik = j2;
            return t4;
        }
        int indexOfPeriod = timeline.getIndexOfPeriod(tMUb.gh.periodUid);
        if (indexOfPeriod != -1 && timeline.getPeriod(indexOfPeriod, this.az).windowIndex == timeline.getPeriodByUid(mediaPeriodId.periodUid, this.az).windowIndex) {
            return tMUb;
        }
        timeline.getPeriodByUid(mediaPeriodId.periodUid, this.az);
        long adDurationUs = mediaPeriodId.isAd() ? this.az.getAdDurationUs(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup) : this.az.durationUs;
        MediaSource.MediaPeriodId mediaPeriodId4 = mediaPeriodId;
        T tRl3 = tMUb.t(mediaPeriodId4, tMUb.f57508o, tMUb.f57508o, tMUb.nr, adDurationUs - tMUb.f57508o, tMUb.KN, tMUb.xMQ, tMUb.mUb).rl(mediaPeriodId4);
        tRl3.Ik = adDurationUs;
        return tRl3;
    }

    private static boolean fcU(T t3) {
        return t3.f57506O == 3 && t3.qie && t3.az == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hRu(Object obj) {
        boolean z2;
        ArrayList arrayList = new ArrayList();
        Renderer[] rendererArr = this.J2;
        int length = rendererArr.length;
        int i2 = 0;
        while (true) {
            z2 = true;
            if (i2 >= length) {
                break;
            }
            Renderer renderer = rendererArr[i2];
            if (renderer.getTrackType() == 2) {
                arrayList.add(z(renderer).setType(1).setPayload(obj).send());
            }
            i2++;
        }
        Object obj2 = this.p5;
        if (obj2 == null || obj2 == obj) {
            z2 = false;
        } else {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((PlayerMessage) it.next()).blockUntilDelivered(this.fD);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
            }
            z2 = false;
            Object obj3 = this.p5;
            Surface surface = this.eF;
            if (obj3 == surface) {
                surface.release();
                this.eF = null;
            }
        }
        this.p5 = obj;
        if (z2) {
            UhV(false, ExoPlaybackException.createForUnexpected(new ExoTimeoutException(3), 1003));
        }
    }

    private void i() {
        Player.Commands commands = this.bzg;
        Player.Commands availableCommands = Util.getAvailableCommands(this.f57433O, this.rl);
        this.bzg = availableCommands;
        if (availableCommands.equals(commands)) {
            return;
        }
        this.gh.queueEvent(13, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.Sis
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((Player.Listener) obj).onAvailableCommandsChanged(this.f57500n.bzg);
            }
        });
    }

    private long ijL(T t3) {
        return t3.f57507n.isEmpty() ? Util.msToUs(this.Jk) : t3.rl.isAd() ? t3.f57508o : Jk(t3.f57507n, t3.rl, t3.f57508o);
    }

    private Timeline k() {
        return new h6y(this.ty, this.f57449v);
    }

    private void lLA() {
        this.f57448t.blockUninterruptible();
        if (Thread.currentThread() != getApplicationLooper().getThread()) {
            String invariant = Util.formatInvariant("Player is accessed on the wrong thread.\nCurrent thread: '%s'\nExpected thread: '%s'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread", Thread.currentThread().getName(), getApplicationLooper().getThread().getName());
            if (this.eTf) {
                throw new IllegalStateException(invariant);
            }
            Log.w("ExoPlayerImpl", invariant, this.xg ? null : new IllegalStateException());
            this.xg = true;
        }
    }

    private int m() {
        if (this.eWT.f57507n.isEmpty()) {
            return this.ul;
        }
        T t3 = this.eWT;
        return t3.f57507n.getPeriodByUid(t3.rl.periodUid, this.az).windowIndex;
    }

    private void mYa() {
        if (this.f57431M != null) {
            z(this.aYN).setType(10000).setPayload(null).send();
            this.f57431M.removeVideoSurfaceListener(this.WPU);
            this.f57431M = null;
        }
        TextureView textureView = this.f57422B;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != this.WPU) {
                Log.w("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f57422B.setSurfaceTextureListener(null);
            }
            this.f57422B = null;
        }
        SurfaceHolder surfaceHolder = this.f57425E;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(this.WPU);
            this.f57425E = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n1(final int i2, final int i3) {
        if (i2 == this.f57440a && i3 == this.f57429I) {
            return;
        }
        this.f57440a = i2;
        this.f57429I = i3;
        this.gh.sendEvent(24, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.yg
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((Player.Listener) obj).onSurfaceSizeChanged(i2, i3);
            }
        });
    }

    private Player.PositionInfo ofS(int i2, T t3, int i3) {
        int i5;
        Object obj;
        MediaItem mediaItem;
        Object obj2;
        int i7;
        long jC;
        long jC2;
        Timeline.Period period = new Timeline.Period();
        if (t3.f57507n.isEmpty()) {
            i5 = i3;
            obj = null;
            mediaItem = null;
            obj2 = null;
            i7 = -1;
        } else {
            Object obj3 = t3.rl.periodUid;
            t3.f57507n.getPeriodByUid(obj3, period);
            int i8 = period.windowIndex;
            int indexOfPeriod = t3.f57507n.getIndexOfPeriod(obj3);
            Object obj4 = t3.f57507n.getWindow(i8, this.window).uid;
            mediaItem = this.window.mediaItem;
            obj2 = obj3;
            i7 = indexOfPeriod;
            obj = obj4;
            i5 = i8;
        }
        if (i2 == 0) {
            if (t3.rl.isAd()) {
                MediaSource.MediaPeriodId mediaPeriodId = t3.rl;
                jC = period.getAdDurationUs(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup);
                jC2 = C(t3);
            } else {
                jC = t3.rl.nextAdGroupIndex != -1 ? C(this.eWT) : period.positionInWindowUs + period.durationUs;
                jC2 = jC;
            }
        } else if (t3.rl.isAd()) {
            jC = t3.f57508o;
            jC2 = C(t3);
        } else {
            jC = period.positionInWindowUs + t3.f57508o;
            jC2 = jC;
        }
        long jUsToMs = Util.usToMs(jC);
        long jUsToMs2 = Util.usToMs(jC2);
        MediaSource.MediaPeriodId mediaPeriodId2 = t3.rl;
        return new Player.PositionInfo(obj, i5, mediaItem, obj2, i7, jUsToMs, jUsToMs2, mediaPeriodId2.adGroupIndex, mediaPeriodId2.adIndexInAdGroup);
    }

    private Pair piY(T t3, T t4, boolean z2, int i2, boolean z3) {
        Timeline timeline = t4.f57507n;
        Timeline timeline2 = t3.f57507n;
        if (timeline2.isEmpty() && timeline.isEmpty()) {
            return new Pair(Boolean.FALSE, -1);
        }
        int i3 = 3;
        if (timeline2.isEmpty() != timeline.isEmpty()) {
            return new Pair(Boolean.TRUE, 3);
        }
        if (timeline.getWindow(timeline.getPeriodByUid(t4.rl.periodUid, this.az).windowIndex, this.window).uid.equals(timeline2.getWindow(timeline2.getPeriodByUid(t3.rl.periodUid, this.az).windowIndex, this.window).uid)) {
            return (z2 && i2 == 0 && t4.rl.windowSequenceNumber < t3.rl.windowSequenceNumber) ? new Pair(Boolean.TRUE, 0) : new Pair(Boolean.FALSE, -1);
        }
        if (z2 && i2 == 0) {
            i3 = 1;
        } else if (z2 && i2 == 1) {
            i3 = 2;
        } else if (!z3) {
            throw new IllegalStateException();
        }
        return new Pair(Boolean.TRUE, Integer.valueOf(i3));
    }

    private void qm(int i2, int i3) {
        for (int i5 = i3 - 1; i5 >= i2; i5--) {
            this.ty.remove(i5);
        }
        this.f57449v = this.f57449v.cloneAndRemove(i2, i3);
    }

    private void tUK(boolean z2) {
        PriorityTaskManager priorityTaskManager = this.pJg;
        if (priorityTaskManager != null) {
            if (z2 && !this.ofS) {
                priorityTaskManager.add(0);
                this.ofS = true;
            } else {
                if (z2 || !this.ofS) {
                    return;
                }
                priorityTaskManager.remove(0);
                this.ofS = false;
            }
        }
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void addAudioOffloadListener(ExoPlayer.AudioOffloadListener audioOffloadListener) {
        this.qie.add(audioOffloadListener);
    }

    @Override // com.google.android.exoplayer2.Player
    public Looper getApplicationLooper() {
        return this.f57447r;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public Clock getClock() {
        return this.f57434S;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public Looper getPlaybackLooper() {
        return this.mUb.WPU();
    }

    @Override // com.google.android.exoplayer2.Player
    public ExoPlaybackException getPlayerError() {
        lLA();
        return this.eWT.J2;
    }

    @Override // com.google.android.exoplayer2.Player
    public void release() {
        AudioTrack audioTrack;
        Log.i("ExoPlayerImpl", "Release " + Integer.toHexString(System.identityHashCode(this)) + " [" + ExoPlayerLibraryInfo.VERSION_SLASHY + "] [" + Util.DEVICE_DEBUG_INFO + "] [" + ExoPlayerLibraryInfo.registeredModules() + "]");
        lLA();
        if (Util.SDK_INT < 21 && (audioTrack = this.M7) != null) {
            audioTrack.release();
            this.M7 = null;
        }
        this.ViF.rl(false);
        this.f57442g.gh();
        this.te.rl(false);
        this.iF.rl(false);
        this.nY.xMQ();
        if (!this.mUb.Nxk()) {
            this.gh.sendEvent(10, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.l4Z
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onPlayerError(ExoPlaybackException.createForUnexpected(new ExoTimeoutException(1), 1003));
                }
            });
        }
        this.gh.release();
        this.KN.removeCallbacksAndMessages(null);
        this.f57446o.removeEventListener(this.Ik);
        T tKN = this.eWT.KN(1);
        this.eWT = tKN;
        T tRl = tKN.rl(tKN.rl);
        this.eWT = tRl;
        tRl.Ik = tRl.f57508o;
        this.eWT.f57509r = 0L;
        this.Ik.release();
        this.Uo.release();
        mYa();
        Surface surface = this.eF;
        if (surface != null) {
            surface.release();
            this.eF = null;
        }
        if (this.ofS) {
            ((PriorityTaskManager) Assertions.checkNotNull(this.pJg)).remove(0);
            this.ofS = false;
        }
        this.piY = CueGroup.EMPTY;
        this.f57423C = true;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void removeAnalyticsListener(AnalyticsListener analyticsListener) {
        this.Ik.removeListener(analyticsListener);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void removeAudioOffloadListener(ExoPlayer.AudioOffloadListener audioOffloadListener) {
        this.qie.remove(audioOffloadListener);
    }

    void setThrowsWhenUsingWrongThread(boolean z2) {
        this.eTf = z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ER() {
        int playbackState = getPlaybackState();
        boolean z2 = true;
        if (playbackState != 1) {
            if (playbackState != 2 && playbackState != 3) {
                if (playbackState != 4) {
                    throw new IllegalStateException();
                }
            } else {
                boolean zExperimentalIsSleepingForOffload = experimentalIsSleepingForOffload();
                Y5 y5 = this.te;
                if (!getPlayWhenReady() || zExperimentalIsSleepingForOffload) {
                    z2 = false;
                }
                y5.rl(z2);
                this.iF.rl(getPlayWhenReady());
                return;
            }
        }
        this.te.rl(false);
        this.iF.rl(false);
    }

    public static /* synthetic */ void HI(int i2, Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, Player.Listener listener) {
        listener.onPositionDiscontinuity(i2);
        listener.onPositionDiscontinuity(positionInfo, positionInfo2, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public MediaMetadata Nxk() {
        Timeline currentTimeline = getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            return this.fcU;
        }
        return this.fcU.buildUpon().populate(currentTimeline.getWindow(getCurrentMediaItemIndex(), this.window).mediaItem.mediaMetadata).build();
    }

    private Pair eTf(Timeline timeline, Timeline timeline2) {
        boolean z2;
        long contentPosition = getContentPosition();
        int iM = -1;
        if (!timeline.isEmpty() && !timeline2.isEmpty()) {
            Pair<Object, Long> periodPositionUs = timeline.getPeriodPositionUs(this.window, this.az, getCurrentMediaItemIndex(), Util.msToUs(contentPosition));
            Object obj = ((Pair) Util.castNonNull(periodPositionUs)).first;
            if (timeline2.getIndexOfPeriod(obj) != -1) {
                return periodPositionUs;
            }
            Object objG7 = ExoPlayerImplInternal.G7(this.window, this.az, this.E2, this.f57441e, obj, timeline, timeline2);
            if (objG7 != null) {
                timeline2.getPeriodByUid(objG7, this.az);
                int i2 = this.az.windowIndex;
                return ul(timeline2, i2, timeline2.getWindow(i2, this.window).getDefaultPositionMs());
            }
            return ul(timeline2, -1, -9223372036854775807L);
        }
        if (!timeline.isEmpty() && timeline2.isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            iM = m();
        }
        if (z2) {
            contentPosition = -9223372036854775807L;
        }
        return ul(timeline2, iM, contentPosition);
    }

    private Player.PositionInfo pJg(long j2) {
        Object obj;
        int indexOfPeriod;
        MediaItem mediaItem;
        Object obj2;
        long jUsToMs;
        int currentMediaItemIndex = getCurrentMediaItemIndex();
        if (!this.eWT.f57507n.isEmpty()) {
            T t3 = this.eWT;
            Object obj3 = t3.rl.periodUid;
            t3.f57507n.getPeriodByUid(obj3, this.az);
            indexOfPeriod = this.eWT.f57507n.getIndexOfPeriod(obj3);
            obj2 = obj3;
            obj = this.eWT.f57507n.getWindow(currentMediaItemIndex, this.window).uid;
            mediaItem = this.window.mediaItem;
        } else {
            obj = null;
            indexOfPeriod = -1;
            mediaItem = null;
            obj2 = null;
        }
        int i2 = indexOfPeriod;
        long jUsToMs2 = Util.usToMs(j2);
        if (this.eWT.rl.isAd()) {
            jUsToMs = Util.usToMs(C(this.eWT));
        } else {
            jUsToMs = jUsToMs2;
        }
        MediaSource.MediaPeriodId mediaPeriodId = this.eWT.rl;
        return new Player.PositionInfo(obj, currentMediaItemIndex, mediaItem, obj2, i2, jUsToMs2, jUsToMs, mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup);
    }

    private Pair ul(Timeline timeline, int i2, long j2) {
        if (timeline.isEmpty()) {
            this.ul = i2;
            if (j2 == -9223372036854775807L) {
                j2 = 0;
            }
            this.Jk = j2;
            this.n1 = 0;
            return null;
        }
        if (i2 == -1 || i2 >= timeline.getWindowCount()) {
            i2 = timeline.getFirstWindowIndex(this.f57441e);
            j2 = timeline.getWindow(i2, this.window).getDefaultPositionMs();
        }
        return timeline.getPeriodPositionUs(this.window, this.az, i2, Util.msToUs(j2));
    }

    private PlayerMessage z(PlayerMessage.Target target) {
        int iM = m();
        ExoPlayerImplInternal exoPlayerImplInternal = this.mUb;
        Timeline timeline = this.eWT.f57507n;
        if (iM == -1) {
            iM = 0;
        }
        return new PlayerMessage(exoPlayerImplInternal, target, timeline, iM, this.f57434S, exoPlayerImplInternal.WPU());
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void addAnalyticsListener(AnalyticsListener analyticsListener) {
        Assertions.checkNotNull(analyticsListener);
        this.Ik.addListener(analyticsListener);
    }

    @Override // com.google.android.exoplayer2.Player
    public void addListener(Player.Listener listener) {
        Assertions.checkNotNull(listener);
        this.gh.add(listener);
    }

    @Override // com.google.android.exoplayer2.Player
    public void addMediaItems(int i2, List list) {
        lLA();
        addMediaSources(Math.min(i2, this.ty.size()), dR0(list));
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void addMediaSource(int i2, MediaSource mediaSource) {
        lLA();
        addMediaSources(i2, Collections.singletonList(mediaSource));
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void addMediaSources(int i2, List list) {
        lLA();
        Assertions.checkArgument(i2 >= 0);
        Timeline currentTimeline = getCurrentTimeline();
        this.f57437X++;
        List listGR = GR(i2, list);
        Timeline timelineK = k();
        T tEWT = eWT(this.eWT, timelineK, eTf(currentTimeline, timelineK));
        this.mUb.J2(i2, listGR, this.f57449v);
        How(tEWT, 0, 1, false, false, 5, -9223372036854775807L, -1);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public void clearAuxEffectInfo() {
        lLA();
        setAuxEffectInfo(new AuxEffectInfo(0, 0.0f));
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void clearCameraMotionListener(CameraMotionListener cameraMotionListener) {
        lLA();
        if (this.f57444m != cameraMotionListener) {
            return;
        }
        z(this.aYN).setType(8).setPayload(null).send();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void clearVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener) {
        lLA();
        if (this.ijL != videoFrameMetadataListener) {
            return;
        }
        z(this.aYN).setType(7).setPayload(null).send();
    }

    @Override // com.google.android.exoplayer2.Player
    public void clearVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
        lLA();
        if (surfaceHolder != null && surfaceHolder == this.f57425E) {
            clearVideoSurface();
        }
    }

    @Override // com.google.android.exoplayer2.Player
    public void clearVideoSurfaceView(SurfaceView surfaceView) {
        SurfaceHolder holder;
        lLA();
        if (surfaceView == null) {
            holder = null;
        } else {
            holder = surfaceView.getHolder();
        }
        clearVideoSurfaceHolder(holder);
    }

    @Override // com.google.android.exoplayer2.Player
    public void clearVideoTextureView(TextureView textureView) {
        lLA();
        if (textureView != null && textureView == this.f57422B) {
            clearVideoSurface();
        }
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public PlayerMessage createMessage(PlayerMessage.Target target) {
        lLA();
        return z(target);
    }

    @Override // com.google.android.exoplayer2.Player
    public void decreaseDeviceVolume() {
        lLA();
        this.f57442g.t();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public boolean experimentalIsSleepingForOffload() {
        lLA();
        return this.eWT.ck;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void experimentalSetOffloadSchedulingEnabled(boolean z2) {
        lLA();
        this.mUb.ck(z2);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public AnalyticsCollector getAnalyticsCollector() {
        lLA();
        return this.Ik;
    }

    @Override // com.google.android.exoplayer2.Player
    public AudioAttributes getAudioAttributes() {
        lLA();
        return this.f57443k;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public ExoPlayer.AudioComponent getAudioComponent() {
        lLA();
        return this;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public DecoderCounters getAudioDecoderCounters() {
        lLA();
        return this.Nxk;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public Format getAudioFormat() {
        lLA();
        return this.P5;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public int getAudioSessionId() {
        lLA();
        return this.f57438Y;
    }

    @Override // com.google.android.exoplayer2.Player
    public Player.Commands getAvailableCommands() {
        lLA();
        return this.bzg;
    }

    @Override // com.google.android.exoplayer2.Player
    public long getBufferedPosition() {
        lLA();
        if (isPlayingAd()) {
            T t3 = this.eWT;
            if (t3.gh.equals(t3.rl)) {
                return Util.usToMs(this.eWT.Ik);
            }
            return getDuration();
        }
        return getContentBufferedPosition();
    }

    @Override // com.google.android.exoplayer2.Player
    public long getContentBufferedPosition() {
        lLA();
        if (this.eWT.f57507n.isEmpty()) {
            return this.Jk;
        }
        T t3 = this.eWT;
        if (t3.gh.windowSequenceNumber != t3.rl.windowSequenceNumber) {
            return t3.f57507n.getWindow(getCurrentMediaItemIndex(), this.window).getDurationMs();
        }
        long j2 = t3.Ik;
        if (this.eWT.gh.isAd()) {
            T t4 = this.eWT;
            Timeline.Period periodByUid = t4.f57507n.getPeriodByUid(t4.gh.periodUid, this.az);
            long adGroupTimeUs = periodByUid.getAdGroupTimeUs(this.eWT.gh.adGroupIndex);
            if (adGroupTimeUs == Long.MIN_VALUE) {
                j2 = periodByUid.durationUs;
            } else {
                j2 = adGroupTimeUs;
            }
        }
        T t5 = this.eWT;
        return Util.usToMs(Jk(t5.f57507n, t5.gh, j2));
    }

    @Override // com.google.android.exoplayer2.Player
    public long getContentPosition() {
        lLA();
        if (isPlayingAd()) {
            T t3 = this.eWT;
            t3.f57507n.getPeriodByUid(t3.rl.periodUid, this.az);
            T t4 = this.eWT;
            if (t4.f57510t == -9223372036854775807L) {
                return t4.f57507n.getWindow(getCurrentMediaItemIndex(), this.window).getDefaultPositionMs();
            }
            return this.az.getPositionInWindowMs() + Util.usToMs(this.eWT.f57510t);
        }
        return getCurrentPosition();
    }

    @Override // com.google.android.exoplayer2.Player
    public int getCurrentAdGroupIndex() {
        lLA();
        if (isPlayingAd()) {
            return this.eWT.rl.adGroupIndex;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.Player
    public int getCurrentAdIndexInAdGroup() {
        lLA();
        if (isPlayingAd()) {
            return this.eWT.rl.adIndexInAdGroup;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.Player
    public CueGroup getCurrentCues() {
        lLA();
        return this.piY;
    }

    @Override // com.google.android.exoplayer2.Player
    public int getCurrentMediaItemIndex() {
        lLA();
        int iM = m();
        if (iM == -1) {
            return 0;
        }
        return iM;
    }

    @Override // com.google.android.exoplayer2.Player
    public int getCurrentPeriodIndex() {
        lLA();
        if (this.eWT.f57507n.isEmpty()) {
            return this.n1;
        }
        T t3 = this.eWT;
        return t3.f57507n.getIndexOfPeriod(t3.rl.periodUid);
    }

    @Override // com.google.android.exoplayer2.Player
    public long getCurrentPosition() {
        lLA();
        return Util.usToMs(ijL(this.eWT));
    }

    @Override // com.google.android.exoplayer2.Player
    public Timeline getCurrentTimeline() {
        lLA();
        return this.eWT.f57507n;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public TrackGroupArray getCurrentTrackGroups() {
        lLA();
        return this.eWT.KN;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public TrackSelectionArray getCurrentTrackSelections() {
        lLA();
        return new TrackSelectionArray(this.eWT.xMQ.selections);
    }

    @Override // com.google.android.exoplayer2.Player
    public Tracks getCurrentTracks() {
        lLA();
        return this.eWT.xMQ.tracks;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public ExoPlayer.DeviceComponent getDeviceComponent() {
        lLA();
        return this;
    }

    @Override // com.google.android.exoplayer2.Player
    public DeviceInfo getDeviceInfo() {
        lLA();
        return this.Mx;
    }

    @Override // com.google.android.exoplayer2.Player
    public int getDeviceVolume() {
        lLA();
        return this.f57442g.Uo();
    }

    @Override // com.google.android.exoplayer2.Player
    public long getDuration() {
        lLA();
        if (isPlayingAd()) {
            T t3 = this.eWT;
            MediaSource.MediaPeriodId mediaPeriodId = t3.rl;
            t3.f57507n.getPeriodByUid(mediaPeriodId.periodUid, this.az);
            return Util.usToMs(this.az.getAdDurationUs(mediaPeriodId.adGroupIndex, mediaPeriodId.adIndexInAdGroup));
        }
        return getContentDuration();
    }

    @Override // com.google.android.exoplayer2.Player
    public long getMaxSeekToPreviousPosition() {
        lLA();
        return 3000L;
    }

    @Override // com.google.android.exoplayer2.Player
    public MediaMetadata getMediaMetadata() {
        lLA();
        return this.Xw;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public boolean getPauseAtEndOfMediaItems() {
        lLA();
        return this.rV9;
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean getPlayWhenReady() {
        lLA();
        return this.eWT.qie;
    }

    @Override // com.google.android.exoplayer2.Player
    public PlaybackParameters getPlaybackParameters() {
        lLA();
        return this.eWT.ty;
    }

    @Override // com.google.android.exoplayer2.Player
    public int getPlaybackState() {
        lLA();
        return this.eWT.f57506O;
    }

    @Override // com.google.android.exoplayer2.Player
    public int getPlaybackSuppressionReason() {
        lLA();
        return this.eWT.az;
    }

    @Override // com.google.android.exoplayer2.Player
    public MediaMetadata getPlaylistMetadata() {
        lLA();
        return this.jB;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public Renderer getRenderer(int i2) {
        lLA();
        return this.J2[i2];
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public int getRendererCount() {
        lLA();
        return this.J2.length;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public int getRendererType(int i2) {
        lLA();
        return this.J2[i2].getTrackType();
    }

    @Override // com.google.android.exoplayer2.Player
    public int getRepeatMode() {
        lLA();
        return this.E2;
    }

    @Override // com.google.android.exoplayer2.Player
    public long getSeekBackIncrement() {
        lLA();
        return this.f57439Z;
    }

    @Override // com.google.android.exoplayer2.Player
    public long getSeekForwardIncrement() {
        lLA();
        return this.XQ;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public SeekParameters getSeekParameters() {
        lLA();
        return this.wTp;
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean getShuffleModeEnabled() {
        lLA();
        return this.f57441e;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public boolean getSkipSilenceEnabled() {
        lLA();
        return this.f57450z;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public ExoPlayer.TextComponent getTextComponent() {
        lLA();
        return this;
    }

    @Override // com.google.android.exoplayer2.Player
    public long getTotalBufferedDuration() {
        lLA();
        return Util.usToMs(this.eWT.f57509r);
    }

    @Override // com.google.android.exoplayer2.Player
    public TrackSelectionParameters getTrackSelectionParameters() {
        lLA();
        return this.Uo.getParameters();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public TrackSelector getTrackSelector() {
        lLA();
        return this.Uo;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public int getVideoChangeFrameRateStrategy() {
        lLA();
        return this.f57424D;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public ExoPlayer.VideoComponent getVideoComponent() {
        lLA();
        return this;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public DecoderCounters getVideoDecoderCounters() {
        lLA();
        return this.f57428GR;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public Format getVideoFormat() {
        lLA();
        return this.f57436U;
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public int getVideoScalingMode() {
        lLA();
        return this.f57430J;
    }

    @Override // com.google.android.exoplayer2.Player
    public VideoSize getVideoSize() {
        lLA();
        return this.f57427G7;
    }

    @Override // com.google.android.exoplayer2.Player
    public float getVolume() {
        lLA();
        return this.dR0;
    }

    @Override // com.google.android.exoplayer2.Player
    public void increaseDeviceVolume() {
        lLA();
        this.f57442g.xMQ();
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean isDeviceMuted() {
        lLA();
        return this.f57442g.mUb();
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean isLoading() {
        lLA();
        return this.eWT.Uo;
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean isPlayingAd() {
        lLA();
        return this.eWT.rl.isAd();
    }

    @Override // com.google.android.exoplayer2.Player
    public void moveMediaItems(int i2, int i3, int i5) {
        boolean z2;
        lLA();
        if (i2 >= 0 && i2 <= i3 && i3 <= this.ty.size() && i5 >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Assertions.checkArgument(z2);
        Timeline currentTimeline = getCurrentTimeline();
        this.f57437X++;
        int iMin = Math.min(i5, this.ty.size() - (i3 - i2));
        Util.moveItems(this.ty, i2, i3, iMin);
        Timeline timelineK = k();
        T tEWT = eWT(this.eWT, timelineK, eTf(currentTimeline, timelineK));
        this.mUb.FX(i2, i3, iMin, this.f57449v);
        How(tEWT, 0, 1, false, false, 5, -9223372036854775807L, -1);
    }

    @Override // com.google.android.exoplayer2.Player
    public void removeListener(Player.Listener listener) {
        Assertions.checkNotNull(listener);
        this.gh.remove(listener);
    }

    @Override // com.google.android.exoplayer2.Player
    public void removeMediaItems(int i2, int i3) {
        lLA();
        T tRl = Rl(i2, Math.min(i3, this.ty.size()));
        How(tRl, 0, 1, false, !tRl.rl.periodUid.equals(this.eWT.rl.periodUid), 4, ijL(tRl), -1);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void retry() {
        lLA();
        prepare();
    }

    @Override // com.google.android.exoplayer2.Player
    public void seekTo(int i2, long j2) {
        lLA();
        this.Ik.notifySeekStarted();
        Timeline timeline = this.eWT.f57507n;
        if (i2 >= 0 && (timeline.isEmpty() || i2 < timeline.getWindowCount())) {
            int i3 = 1;
            this.f57437X++;
            if (isPlayingAd()) {
                Log.w("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                ExoPlayerImplInternal.PlaybackInfoUpdate playbackInfoUpdate = new ExoPlayerImplInternal.PlaybackInfoUpdate(this.eWT);
                playbackInfoUpdate.incrementPendingOperationAcks(1);
                this.xMQ.onPlaybackInfoUpdate(playbackInfoUpdate);
                return;
            }
            if (getPlaybackState() != 1) {
                i3 = 2;
            }
            int currentMediaItemIndex = getCurrentMediaItemIndex();
            T tEWT = eWT(this.eWT.KN(i3), timeline, ul(timeline, i2, j2));
            this.mUb.eWT(timeline, i2, Util.msToUs(j2));
            How(tEWT, 0, 1, true, true, 1, ijL(tEWT), currentMediaItemIndex);
            return;
        }
        throw new IllegalSeekPositionException(timeline, i2, j2);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public void setAudioAttributes(final AudioAttributes audioAttributes, boolean z2) {
        AudioAttributes audioAttributes2;
        lLA();
        if (this.f57423C) {
            return;
        }
        if (!Util.areEqual(this.f57443k, audioAttributes)) {
            this.f57443k = audioAttributes;
            Org(1, 3, audioAttributes);
            this.f57442g.az(Util.getStreamTypeForAudioUsage(audioAttributes.usage));
            this.gh.queueEvent(20, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.K
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onAudioAttributesChanged(audioAttributes);
                }
            });
        }
        AudioFocusManager audioFocusManager = this.nY;
        if (z2) {
            audioAttributes2 = audioAttributes;
        } else {
            audioAttributes2 = null;
        }
        audioFocusManager.az(audioAttributes2);
        this.Uo.setAudioAttributes(audioAttributes);
        boolean playWhenReady = getPlayWhenReady();
        int iCk = this.nY.ck(playWhenReady, getPlaybackState());
        K(playWhenReady, iCk, xg(playWhenReady, iCk));
        this.gh.flushEvents();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public void setAudioSessionId(final int i2) {
        lLA();
        if (this.f57438Y == i2) {
            return;
        }
        if (i2 == 0) {
            if (Util.SDK_INT < 21) {
                i2 = G7(0);
            } else {
                i2 = Util.generateAudioSessionIdV21(this.nr);
            }
        } else if (Util.SDK_INT < 21) {
            G7(i2);
        }
        this.f57438Y = i2;
        Org(1, 10, Integer.valueOf(i2));
        Org(2, 10, Integer.valueOf(i2));
        this.gh.sendEvent(21, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.iF
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((Player.Listener) obj).onAudioSessionIdChanged(i2);
            }
        });
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public void setAuxEffectInfo(AuxEffectInfo auxEffectInfo) {
        lLA();
        Org(1, 6, auxEffectInfo);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void setCameraMotionListener(CameraMotionListener cameraMotionListener) {
        lLA();
        this.f57444m = cameraMotionListener;
        z(this.aYN).setType(8).setPayload(cameraMotionListener).send();
    }

    @Override // com.google.android.exoplayer2.Player
    public void setDeviceMuted(boolean z2) {
        lLA();
        this.f57442g.qie(z2);
    }

    @Override // com.google.android.exoplayer2.Player
    public void setDeviceVolume(int i2) {
        lLA();
        this.f57442g.ty(i2);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setForegroundMode(boolean z2) {
        lLA();
        if (this.s7N != z2) {
            this.s7N = z2;
            if (!this.mUb.Po6(z2)) {
                UhV(false, ExoPlaybackException.createForUnexpected(new ExoTimeoutException(2), 1003));
            }
        }
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setHandleAudioBecomingNoisy(boolean z2) {
        lLA();
        if (this.f57423C) {
            return;
        }
        this.ViF.rl(z2);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setHandleWakeLock(boolean z2) {
        lLA();
        setWakeMode(z2 ? 1 : 0);
    }

    @Override // com.google.android.exoplayer2.Player
    public void setMediaItems(List list, int i2, long j2) {
        lLA();
        setMediaSources(dR0(list), i2, j2);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setMediaSource(MediaSource mediaSource, long j2) {
        lLA();
        setMediaSources(Collections.singletonList(mediaSource), 0, j2);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setMediaSources(List list, boolean z2) {
        lLA();
        GD(list, -1, -9223372036854775807L, z2);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setPauseAtEndOfMediaItems(boolean z2) {
        lLA();
        if (this.rV9 == z2) {
            return;
        }
        this.rV9 = z2;
        this.mUb.K(z2);
    }

    @Override // com.google.android.exoplayer2.Player
    public void setPlayWhenReady(boolean z2) {
        lLA();
        int iCk = this.nY.ck(z2, getPlaybackState());
        K(z2, iCk, xg(z2, iCk));
    }

    @Override // com.google.android.exoplayer2.Player
    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
        lLA();
        if (playbackParameters == null) {
            playbackParameters = PlaybackParameters.DEFAULT;
        }
        if (this.eWT.ty.equals(playbackParameters)) {
            return;
        }
        T tUo = this.eWT.Uo(playbackParameters);
        this.f57437X++;
        this.mUb.lLA(playbackParameters);
        How(tUo, 0, 1, false, false, 5, -9223372036854775807L, -1);
    }

    @Override // com.google.android.exoplayer2.Player
    public void setPlaylistMetadata(MediaMetadata mediaMetadata) {
        lLA();
        Assertions.checkNotNull(mediaMetadata);
        if (mediaMetadata.equals(this.jB)) {
            return;
        }
        this.jB = mediaMetadata;
        this.gh.sendEvent(15, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.Md
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((Player.Listener) obj).onPlaylistMetadataChanged(this.f57465n.jB);
            }
        });
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setPriorityTaskManager(PriorityTaskManager priorityTaskManager) {
        lLA();
        if (Util.areEqual(this.pJg, priorityTaskManager)) {
            return;
        }
        if (this.ofS) {
            ((PriorityTaskManager) Assertions.checkNotNull(this.pJg)).remove(0);
        }
        if (priorityTaskManager != null && isLoading()) {
            priorityTaskManager.add(0);
            this.ofS = true;
        } else {
            this.ofS = false;
        }
        this.pJg = priorityTaskManager;
    }

    @Override // com.google.android.exoplayer2.Player
    public void setRepeatMode(final int i2) {
        lLA();
        if (this.E2 != i2) {
            this.E2 = i2;
            this.mUb.W(i2);
            this.gh.queueEvent(8, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.m
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onRepeatModeChanged(i2);
                }
            });
            i();
            this.gh.flushEvents();
        }
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setSeekParameters(SeekParameters seekParameters) {
        lLA();
        if (seekParameters == null) {
            seekParameters = SeekParameters.DEFAULT;
        }
        if (!this.wTp.equals(seekParameters)) {
            this.wTp = seekParameters;
            this.mUb.a63(seekParameters);
        }
    }

    @Override // com.google.android.exoplayer2.Player
    public void setShuffleModeEnabled(final boolean z2) {
        lLA();
        if (this.f57441e != z2) {
            this.f57441e = z2;
            this.mUb.QZ6(z2);
            this.gh.queueEvent(9, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.DAz
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onShuffleModeEnabledChanged(z2);
                }
            });
            i();
            this.gh.flushEvents();
        }
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setShuffleOrder(ShuffleOrder shuffleOrder) {
        lLA();
        Timeline timelineK = k();
        T tEWT = eWT(this.eWT, timelineK, ul(timelineK, getCurrentMediaItemIndex(), getCurrentPosition()));
        this.f57437X++;
        this.f57449v = shuffleOrder;
        this.mUb.VwL(shuffleOrder);
        How(tEWT, 0, 1, false, false, 5, -9223372036854775807L, -1);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public void setSkipSilenceEnabled(final boolean z2) {
        lLA();
        if (this.f57450z == z2) {
            return;
        }
        this.f57450z = z2;
        Org(1, 9, Boolean.valueOf(z2));
        this.gh.sendEvent(23, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.mz
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((Player.Listener) obj).onSkipSilenceEnabledChanged(z2);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player
    public void setTrackSelectionParameters(final TrackSelectionParameters trackSelectionParameters) {
        lLA();
        if (this.Uo.isSetParametersSupported() && !trackSelectionParameters.equals(this.Uo.getParameters())) {
            this.Uo.setParameters(trackSelectionParameters);
            this.gh.sendEvent(19, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.OU
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onTrackSelectionParametersChanged(trackSelectionParameters);
                }
            });
        }
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void setVideoChangeFrameRateStrategy(int i2) {
        lLA();
        if (this.f57424D == i2) {
            return;
        }
        this.f57424D = i2;
        Org(2, 5, Integer.valueOf(i2));
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void setVideoFrameMetadataListener(VideoFrameMetadataListener videoFrameMetadataListener) {
        lLA();
        this.ijL = videoFrameMetadataListener;
        z(this.aYN).setType(7).setPayload(videoFrameMetadataListener).send();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void setVideoScalingMode(int i2) {
        lLA();
        this.f57430J = i2;
        Org(2, 4, Integer.valueOf(i2));
    }

    @Override // com.google.android.exoplayer2.Player
    public void setVideoSurface(Surface surface) {
        int i2;
        lLA();
        mYa();
        hRu(surface);
        if (surface == null) {
            i2 = 0;
        } else {
            i2 = -1;
        }
        n1(i2, i2);
    }

    @Override // com.google.android.exoplayer2.Player
    public void setVideoSurfaceHolder(SurfaceHolder surfaceHolder) {
        lLA();
        if (surfaceHolder == null) {
            clearVideoSurface();
            return;
        }
        mYa();
        this.f57426FX = true;
        this.f57425E = surfaceHolder;
        surfaceHolder.addCallback(this.WPU);
        Surface surface = surfaceHolder.getSurface();
        if (surface != null && surface.isValid()) {
            hRu(surface);
            Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
            n1(surfaceFrame.width(), surfaceFrame.height());
        } else {
            hRu(null);
            n1(0, 0);
        }
    }

    @Override // com.google.android.exoplayer2.Player
    public void setVideoSurfaceView(SurfaceView surfaceView) {
        SurfaceHolder holder;
        lLA();
        if (surfaceView instanceof VideoDecoderOutputBufferRenderer) {
            mYa();
            hRu(surfaceView);
            Po6(surfaceView.getHolder());
        } else {
            if (surfaceView instanceof SphericalGLSurfaceView) {
                mYa();
                this.f57431M = (SphericalGLSurfaceView) surfaceView;
                z(this.aYN).setType(10000).setPayload(this.f57431M).send();
                this.f57431M.addVideoSurfaceListener(this.WPU);
                hRu(this.f57431M.getVideoSurface());
                Po6(surfaceView.getHolder());
                return;
            }
            if (surfaceView == null) {
                holder = null;
            } else {
                holder = surfaceView.getHolder();
            }
            setVideoSurfaceHolder(holder);
        }
    }

    @Override // com.google.android.exoplayer2.Player
    public void setVideoTextureView(TextureView textureView) {
        SurfaceTexture surfaceTexture;
        lLA();
        if (textureView == null) {
            clearVideoSurface();
            return;
        }
        mYa();
        this.f57422B = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            Log.w("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.WPU);
        if (textureView.isAvailable()) {
            surfaceTexture = textureView.getSurfaceTexture();
        } else {
            surfaceTexture = null;
        }
        if (surfaceTexture == null) {
            hRu(null);
            n1(0, 0);
        } else {
            EWS(surfaceTexture);
            n1(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Override // com.google.android.exoplayer2.Player
    public void setVolume(float f3) {
        lLA();
        final float fConstrainValue = Util.constrainValue(f3, 0.0f, 1.0f);
        if (this.dR0 == fConstrainValue) {
            return;
        }
        this.dR0 = fConstrainValue;
        HV();
        this.gh.sendEvent(22, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.p
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                ((Player.Listener) obj).onVolumeChanged(fConstrainValue);
            }
        });
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setWakeMode(int i2) {
        lLA();
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    return;
                }
                this.te.n(true);
                this.iF.n(true);
                return;
            }
            this.te.n(true);
            this.iF.n(false);
            return;
        }
        this.te.n(false);
        this.iF.n(false);
    }

    @Override // com.google.android.exoplayer2.Player
    public void stop(boolean z2) {
        lLA();
        this.nY.ck(getPlayWhenReady(), 1);
        UhV(z2, null);
        this.piY = CueGroup.EMPTY;
    }

    @Override // com.google.android.exoplayer2.Player
    public void clearVideoSurface(Surface surface) {
        lLA();
        if (surface == null || surface != this.p5) {
            return;
        }
        clearVideoSurface();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setMediaSources(List list, int i2, long j2) {
        lLA();
        GD(list, i2, j2, false);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void setMediaSource(MediaSource mediaSource, boolean z2) {
        lLA();
        setMediaSources(Collections.singletonList(mediaSource), z2);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void prepare(MediaSource mediaSource) {
        lLA();
        setMediaSource(mediaSource);
        prepare();
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public void prepare(MediaSource mediaSource, boolean z2, boolean z3) {
        lLA();
        setMediaSource(mediaSource, z2);
        prepare();
    }
}
