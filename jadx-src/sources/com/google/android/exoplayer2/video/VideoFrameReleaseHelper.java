package com.google.android.exoplayer2.video;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.Surface;
import android.view.WindowManager;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class VideoFrameReleaseHelper {
    private static final long MAX_ALLOWED_ADJUSTMENT_NS = 20000000;
    private static final int MINIMUM_FRAMES_WITHOUT_SYNC_TO_CLEAR_SURFACE_FRAME_RATE = 30;
    private static final long MINIMUM_MATCHING_FRAME_DURATION_FOR_HIGH_CONFIDENCE_NS = 5000000000L;
    private static final float MINIMUM_MEDIA_FRAME_RATE_CHANGE_FOR_UPDATE_HIGH_CONFIDENCE = 0.02f;
    private static final float MINIMUM_MEDIA_FRAME_RATE_CHANGE_FOR_UPDATE_LOW_CONFIDENCE = 1.0f;
    private static final String TAG = "VideoFrameReleaseHelper";
    private static final long VSYNC_OFFSET_PERCENTAGE = 80;
    private static final long VSYNC_SAMPLE_UPDATE_PERIOD_MS = 500;
    private int changeFrameRateStrategy;

    @Nullable
    private final DisplayHelper displayHelper;
    private float formatFrameRate;
    private long frameIndex;
    private final com.google.android.exoplayer2.video.n frameRateEstimator = new com.google.android.exoplayer2.video.n();
    private long lastAdjustedFrameIndex;
    private long lastAdjustedReleaseTimeNs;
    private long pendingLastAdjustedFrameIndex;
    private long pendingLastAdjustedReleaseTimeNs;
    private float playbackSpeed;
    private boolean started;

    @Nullable
    private Surface surface;
    private float surfaceMediaFrameRate;
    private float surfacePlaybackFrameRate;
    private long vsyncDurationNs;
    private long vsyncOffsetNs;

    @Nullable
    private final Ml vsyncSampler;

    /* JADX INFO: Access modifiers changed from: private */
    interface DisplayHelper {

        public interface Listener {
            void onDefaultDisplayChanged(@Nullable Display display);
        }

        void n();

        void rl(Listener listener);
    }

    private static final class Ml implements Choreographer.FrameCallback, Handler.Callback {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final Ml f58518o = new Ml();
        private Choreographer J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        private final HandlerThread f58519O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public volatile long f58520n = -9223372036854775807L;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private int f58521r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private final Handler f58522t;

        private void J2() {
            Choreographer choreographer = this.J2;
            if (choreographer != null) {
                int i2 = this.f58521r - 1;
                this.f58521r = i2;
                if (i2 == 0) {
                    choreographer.removeFrameCallback(this);
                    this.f58520n = -9223372036854775807L;
                }
            }
        }

        public static Ml nr() {
            return f58518o;
        }

        private void rl() {
            Choreographer choreographer = this.J2;
            if (choreographer != null) {
                int i2 = this.f58521r + 1;
                this.f58521r = i2;
                if (i2 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
        }

        public void O() {
            this.f58522t.sendEmptyMessage(2);
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j2) {
            this.f58520n = j2;
            ((Choreographer) Assertions.checkNotNull(this.J2)).postFrameCallbackDelayed(this, 500L);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 0) {
                t();
                return true;
            }
            if (i2 == 1) {
                rl();
                return true;
            }
            if (i2 != 2) {
                return false;
            }
            J2();
            return true;
        }

        public void n() {
            this.f58522t.sendEmptyMessage(1);
        }

        private Ml() {
            HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
            this.f58519O = handlerThread;
            handlerThread.start();
            Handler handlerCreateHandler = Util.createHandler(handlerThread.getLooper(), this);
            this.f58522t = handlerCreateHandler;
            handlerCreateHandler.sendEmptyMessage(0);
        }

        private void t() {
            try {
                this.J2 = Choreographer.getInstance();
            } catch (RuntimeException e2) {
                Log.w(VideoFrameReleaseHelper.TAG, "Vsync sampling disabled due to platform error", e2);
            }
        }
    }

    private static final class j {
        @DoNotInline
        public static void n(Surface surface, float f3) {
            try {
                surface.setFrameRate(f3, f3 == 0.0f ? 0 : 1);
            } catch (IllegalStateException e2) {
                Log.e(VideoFrameReleaseHelper.TAG, "Failed to call Surface.setFrameRate", e2);
            }
        }
    }

    private static final class n implements DisplayHelper {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final WindowManager f58523n;

        @Override // com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelper
        public void n() {
        }

        public static DisplayHelper t(Context context) {
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                return new n(windowManager);
            }
            return null;
        }

        @Override // com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelper
        public void rl(DisplayHelper.Listener listener) {
            listener.onDefaultDisplayChanged(this.f58523n.getDefaultDisplay());
        }

        private n(WindowManager windowManager) {
            this.f58523n = windowManager;
        }
    }

    private static final class w6 implements DisplayHelper, DisplayManager.DisplayListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final DisplayManager f58524n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private DisplayHelper.Listener f58525t;

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i2) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i2) {
        }

        public static DisplayHelper nr(Context context) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            if (displayManager != null) {
                return new w6(displayManager);
            }
            return null;
        }

        private Display t() {
            return this.f58524n.getDisplay(0);
        }

        @Override // com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelper
        public void n() {
            this.f58524n.unregisterDisplayListener(this);
            this.f58525t = null;
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i2) {
            DisplayHelper.Listener listener = this.f58525t;
            if (listener == null || i2 != 0) {
                return;
            }
            listener.onDefaultDisplayChanged(t());
        }

        @Override // com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelper
        public void rl(DisplayHelper.Listener listener) {
            this.f58525t = listener;
            this.f58524n.registerDisplayListener(this, Util.createHandlerForCurrentLooper());
            listener.onDefaultDisplayChanged(t());
        }

        private w6(DisplayManager displayManager) {
            this.f58524n = displayManager;
        }
    }

    private static boolean adjustmentAllowed(long j2, long j3) {
        return Math.abs(j2 - j3) <= MAX_ALLOWED_ADJUSTMENT_NS;
    }

    @Nullable
    private static DisplayHelper maybeBuildDisplayHelper(@Nullable Context context) {
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            displayHelperNr = Util.SDK_INT >= 17 ? w6.nr(applicationContext) : null;
            if (displayHelperNr == null) {
                return n.t(applicationContext);
            }
        }
        return displayHelperNr;
    }

    public void onStarted() {
        this.started = true;
        resetAdjustment();
        if (this.displayHelper != null) {
            ((Ml) Assertions.checkNotNull(this.vsyncSampler)).n();
            this.displayHelper.rl(new DisplayHelper.Listener() { // from class: com.google.android.exoplayer2.video.w6
                @Override // com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelper.Listener
                public final void onDefaultDisplayChanged(Display display) {
                    this.f58590n.updateDefaultDisplayRefreshRateParams(display);
                }
            });
        }
        updateSurfacePlaybackFrameRate(false);
    }

    public void onStopped() {
        this.started = false;
        DisplayHelper displayHelper = this.displayHelper;
        if (displayHelper != null) {
            displayHelper.n();
            ((Ml) Assertions.checkNotNull(this.vsyncSampler)).O();
        }
        clearSurfaceFrameRate();
    }

    private void clearSurfaceFrameRate() {
        Surface surface;
        if (Util.SDK_INT < 30 || (surface = this.surface) == null || this.changeFrameRateStrategy == Integer.MIN_VALUE || this.surfacePlaybackFrameRate == 0.0f) {
            return;
        }
        this.surfacePlaybackFrameRate = 0.0f;
        j.n(surface, 0.0f);
    }

    private static long closestVsync(long j2, long j3, long j4) {
        long j5;
        long j6 = j3 + (((j2 - j3) / j4) * j4);
        if (j2 <= j6) {
            j5 = j6 - j4;
        } else {
            long j7 = j4 + j6;
            j5 = j6;
            j6 = j7;
        }
        return j6 - j2 < j2 - j5 ? j6 : j5;
    }

    private void resetAdjustment() {
        this.frameIndex = 0L;
        this.lastAdjustedFrameIndex = -1L;
        this.pendingLastAdjustedFrameIndex = -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateDefaultDisplayRefreshRateParams(@Nullable Display display) {
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            this.vsyncDurationNs = refreshRate;
            this.vsyncOffsetNs = (refreshRate * VSYNC_OFFSET_PERCENTAGE) / 100;
        } else {
            Log.w(TAG, "Unable to query display refresh rate");
            this.vsyncDurationNs = -9223372036854775807L;
            this.vsyncOffsetNs = -9223372036854775807L;
        }
    }

    private void updateSurfaceMediaFrameRate() {
        if (Util.SDK_INT < 30 || this.surface == null) {
            return;
        }
        float fRl = this.frameRateEstimator.O() ? this.frameRateEstimator.rl() : this.formatFrameRate;
        float f3 = this.surfaceMediaFrameRate;
        if (fRl == f3) {
            return;
        }
        if (fRl != -1.0f && f3 != -1.0f) {
            if (Math.abs(fRl - this.surfaceMediaFrameRate) < ((!this.frameRateEstimator.O() || this.frameRateEstimator.nr() < MINIMUM_MATCHING_FRAME_DURATION_FOR_HIGH_CONFIDENCE_NS) ? 1.0f : MINIMUM_MEDIA_FRAME_RATE_CHANGE_FOR_UPDATE_HIGH_CONFIDENCE)) {
                return;
            }
        } else if (fRl == -1.0f && this.frameRateEstimator.t() < 30) {
            return;
        }
        this.surfaceMediaFrameRate = fRl;
        updateSurfacePlaybackFrameRate(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void updateSurfacePlaybackFrameRate(boolean z2) {
        Surface surface;
        float f3;
        if (Util.SDK_INT < 30 || (surface = this.surface) == null || this.changeFrameRateStrategy == Integer.MIN_VALUE) {
            return;
        }
        if (this.started) {
            float f4 = this.surfaceMediaFrameRate;
            f3 = f4 != -1.0f ? f4 * this.playbackSpeed : 0.0f;
        }
        if (z2 || this.surfacePlaybackFrameRate != f3) {
            this.surfacePlaybackFrameRate = f3;
            j.n(surface, f3);
        }
    }

    public long adjustReleaseTime(long j2) {
        long j3;
        if (this.lastAdjustedFrameIndex == -1 || !this.frameRateEstimator.O()) {
            j3 = j2;
        } else {
            long jN = this.lastAdjustedReleaseTimeNs + ((long) ((this.frameRateEstimator.n() * (this.frameIndex - this.lastAdjustedFrameIndex)) / this.playbackSpeed));
            if (adjustmentAllowed(j2, jN)) {
                j3 = jN;
            } else {
                resetAdjustment();
                j3 = j2;
            }
        }
        this.pendingLastAdjustedFrameIndex = this.frameIndex;
        this.pendingLastAdjustedReleaseTimeNs = j3;
        Ml ml = this.vsyncSampler;
        if (ml != null && this.vsyncDurationNs != -9223372036854775807L) {
            long j4 = ml.f58520n;
            if (j4 != -9223372036854775807L) {
                return closestVsync(j3, j4, this.vsyncDurationNs) - this.vsyncOffsetNs;
            }
        }
        return j3;
    }

    public void onFormatChanged(float f3) {
        this.formatFrameRate = f3;
        this.frameRateEstimator.Uo();
        updateSurfaceMediaFrameRate();
    }

    public void onNextFrame(long j2) {
        long j3 = this.pendingLastAdjustedFrameIndex;
        if (j3 != -1) {
            this.lastAdjustedFrameIndex = j3;
            this.lastAdjustedReleaseTimeNs = this.pendingLastAdjustedReleaseTimeNs;
        }
        this.frameIndex++;
        this.frameRateEstimator.J2(j2 * 1000);
        updateSurfaceMediaFrameRate();
    }

    public void onPlaybackSpeed(float f3) {
        this.playbackSpeed = f3;
        resetAdjustment();
        updateSurfacePlaybackFrameRate(false);
    }

    public void onSurfaceChanged(@Nullable Surface surface) {
        if (surface instanceof PlaceholderSurface) {
            surface = null;
        }
        if (this.surface == surface) {
            return;
        }
        clearSurfaceFrameRate();
        this.surface = surface;
        updateSurfacePlaybackFrameRate(true);
    }

    public void setChangeFrameRateStrategy(int i2) {
        if (this.changeFrameRateStrategy == i2) {
            return;
        }
        this.changeFrameRateStrategy = i2;
        updateSurfacePlaybackFrameRate(true);
    }

    public VideoFrameReleaseHelper(@Nullable Context context) {
        Ml mlNr;
        DisplayHelper displayHelperMaybeBuildDisplayHelper = maybeBuildDisplayHelper(context);
        this.displayHelper = displayHelperMaybeBuildDisplayHelper;
        if (displayHelperMaybeBuildDisplayHelper != null) {
            mlNr = Ml.nr();
        } else {
            mlNr = null;
        }
        this.vsyncSampler = mlNr;
        this.vsyncDurationNs = -9223372036854775807L;
        this.vsyncOffsetNs = -9223372036854775807L;
        this.formatFrameRate = -1.0f;
        this.playbackSpeed = 1.0f;
        this.changeFrameRateStrategy = 0;
    }

    public void onPositionReset() {
        resetAdjustment();
    }
}
