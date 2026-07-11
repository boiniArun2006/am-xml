package com.google.android.exoplayer2.audio;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import android.media.PlaybackParams;
import android.media.metrics.LogSessionId;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.audio.AudioProcessor;
import com.google.android.exoplayer2.audio.AudioSink;
import com.google.android.exoplayer2.audio.AudioTrackPositionTracker;
import com.google.android.exoplayer2.audio.DefaultAudioTrackBufferSizeProvider;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class DefaultAudioSink implements AudioSink {
    private static final int AUDIO_TRACK_RETRY_DURATION_MS = 100;
    private static final int AUDIO_TRACK_SMALLER_BUFFER_RETRY_SIZE = 1000000;
    public static final float DEFAULT_PLAYBACK_SPEED = 1.0f;
    private static final boolean DEFAULT_SKIP_SILENCE = false;
    private static final int ERROR_NATIVE_DEAD_OBJECT = -32;
    public static final float MAX_PITCH = 8.0f;
    public static final float MAX_PLAYBACK_SPEED = 8.0f;
    public static final float MIN_PITCH = 0.1f;
    public static final float MIN_PLAYBACK_SPEED = 0.1f;
    public static final int OFFLOAD_MODE_DISABLED = 0;
    public static final int OFFLOAD_MODE_ENABLED_GAPLESS_DISABLED = 3;
    public static final int OFFLOAD_MODE_ENABLED_GAPLESS_NOT_REQUIRED = 2;
    public static final int OFFLOAD_MODE_ENABLED_GAPLESS_REQUIRED = 1;
    public static final int OUTPUT_MODE_OFFLOAD = 1;
    public static final int OUTPUT_MODE_PASSTHROUGH = 2;
    public static final int OUTPUT_MODE_PCM = 0;
    private static final String TAG = "DefaultAudioSink";
    public static boolean failOnSpuriousAudioTimestamp;
    private AudioProcessor[] activeAudioProcessors;

    @Nullable
    private I28 afterDrainParameters;
    private AudioAttributes audioAttributes;
    private final AudioCapabilities audioCapabilities;
    private final AudioProcessorChain audioProcessorChain;
    private int audioSessionId;

    @Nullable
    private AudioTrack audioTrack;
    private final w6 audioTrackBufferSizeProvider;
    private PlaybackParameters audioTrackPlaybackParameters;
    private final AudioTrackPositionTracker audioTrackPositionTracker;
    private AuxEffectInfo auxEffectInfo;

    @Nullable
    private ByteBuffer avSyncHeader;
    private int bytesUntilNextAvSync;
    private final qz channelMappingAudioProcessor;
    private Ml configuration;
    private int drainingAudioProcessorIndex;
    private final boolean enableAudioTrackPlaybackParams;
    private final boolean enableFloatOutput;
    private boolean externalAudioSessionIdProvided;
    private int framesPerEncodedSample;
    private boolean handledEndOfStream;
    private final Wre initializationExceptionPendingExceptionHolder;

    @Nullable
    private ByteBuffer inputBuffer;
    private int inputBufferAccessUnitCount;
    private boolean isWaitingForOffloadEndOfStreamHandled;
    private long lastFeedElapsedRealtimeMs;

    @Nullable
    private AudioSink.Listener listener;
    private I28 mediaPositionParameters;
    private final ArrayDeque<I28> mediaPositionParametersCheckpoints;
    private boolean offloadDisabledUntilNextConfiguration;
    private final int offloadMode;
    private fuX offloadStreamEventCallbackV29;

    @Nullable
    private ByteBuffer outputBuffer;
    private ByteBuffer[] outputBuffers;

    @Nullable
    private Ml pendingConfiguration;

    @Nullable
    private PlayerId playerId;
    private boolean playing;
    private byte[] preV21OutputBuffer;
    private int preV21OutputBufferOffset;
    private final ConditionVariable releasingConditionVariable;
    private long startMediaTimeUs;
    private boolean startMediaTimeUsNeedsInit;
    private boolean startMediaTimeUsNeedsSync;
    private boolean stoppedAudioTrack;
    private long submittedEncodedFrames;
    private long submittedPcmBytes;
    private final AudioProcessor[] toFloatPcmAvailableAudioProcessors;
    private final AudioProcessor[] toIntPcmAvailableAudioProcessors;
    private final z trimmingAudioProcessor;
    private boolean tunneling;
    private float volume;
    private final Wre writeExceptionPendingExceptionHolder;
    private long writtenEncodedFrames;
    private long writtenPcmBytes;

    public interface AudioProcessorChain {
        PlaybackParameters applyPlaybackParameters(PlaybackParameters playbackParameters);

        boolean applySkipSilenceEnabled(boolean z2);

        AudioProcessor[] getAudioProcessors();

        long getMediaDuration(long j2);

        long getSkippedOutputFrameCount();
    }

    public static final class Builder {

        @Nullable
        private AudioProcessorChain audioProcessorChain;
        private boolean enableAudioTrackPlaybackParams;
        private boolean enableFloatOutput;
        private AudioCapabilities audioCapabilities = AudioCapabilities.DEFAULT_AUDIO_CAPABILITIES;
        private int offloadMode = 0;
        w6 audioTrackBufferSizeProvider = w6.f57663n;

        public DefaultAudioSink build() {
            if (this.audioProcessorChain == null) {
                this.audioProcessorChain = new DefaultAudioProcessorChain(new AudioProcessor[0]);
            }
            return new DefaultAudioSink(this, (j) null);
        }

        public Builder setAudioTrackBufferSizeProvider(w6 w6Var) {
            this.audioTrackBufferSizeProvider = w6Var;
            return this;
        }

        public Builder setEnableAudioTrackPlaybackParams(boolean z2) {
            this.enableAudioTrackPlaybackParams = z2;
            return this;
        }

        public Builder setEnableFloatOutput(boolean z2) {
            this.enableFloatOutput = z2;
            return this;
        }

        public Builder setOffloadMode(int i2) {
            this.offloadMode = i2;
            return this;
        }

        public Builder setAudioCapabilities(AudioCapabilities audioCapabilities) {
            Assertions.checkNotNull(audioCapabilities);
            this.audioCapabilities = audioCapabilities;
            return this;
        }

        public Builder setAudioProcessorChain(AudioProcessorChain audioProcessorChain) {
            Assertions.checkNotNull(audioProcessorChain);
            this.audioProcessorChain = audioProcessorChain;
            return this;
        }

        public Builder setAudioProcessors(AudioProcessor[] audioProcessorArr) {
            Assertions.checkNotNull(audioProcessorArr);
            return setAudioProcessorChain(new DefaultAudioProcessorChain(audioProcessorArr));
        }
    }

    private final class CN3 implements AudioTrackPositionTracker.Listener {
        private CN3() {
        }

        /* synthetic */ CN3(DefaultAudioSink defaultAudioSink, j jVar) {
            this();
        }

        @Override // com.google.android.exoplayer2.audio.AudioTrackPositionTracker.Listener
        public void onInvalidLatency(long j2) {
            Log.w(DefaultAudioSink.TAG, "Ignoring impossibly large audio latency: " + j2);
        }

        @Override // com.google.android.exoplayer2.audio.AudioTrackPositionTracker.Listener
        public void onPositionAdvancing(long j2) {
            if (DefaultAudioSink.this.listener != null) {
                DefaultAudioSink.this.listener.onPositionAdvancing(j2);
            }
        }

        @Override // com.google.android.exoplayer2.audio.AudioTrackPositionTracker.Listener
        public void onPositionFramesMismatch(long j2, long j3, long j4, long j5) {
            String str = "Spurious audio timestamp (frame position mismatch): " + j2 + ", " + j3 + ", " + j4 + ", " + j5 + ", " + DefaultAudioSink.this.getSubmittedFrames() + ", " + DefaultAudioSink.this.getWrittenFrames();
            if (DefaultAudioSink.failOnSpuriousAudioTimestamp) {
                throw new InvalidAudioTrackTimestampException(str, null);
            }
            Log.w(DefaultAudioSink.TAG, str);
        }

        @Override // com.google.android.exoplayer2.audio.AudioTrackPositionTracker.Listener
        public void onSystemTimeUsMismatch(long j2, long j3, long j4, long j5) {
            String str = "Spurious audio timestamp (system clock mismatch): " + j2 + ", " + j3 + ", " + j4 + ", " + j5 + ", " + DefaultAudioSink.this.getSubmittedFrames() + ", " + DefaultAudioSink.this.getWrittenFrames();
            if (DefaultAudioSink.failOnSpuriousAudioTimestamp) {
                throw new InvalidAudioTrackTimestampException(str, null);
            }
            Log.w(DefaultAudioSink.TAG, str);
        }

        @Override // com.google.android.exoplayer2.audio.AudioTrackPositionTracker.Listener
        public void onUnderrun(int i2, long j2) {
            if (DefaultAudioSink.this.listener != null) {
                DefaultAudioSink.this.listener.onUnderrun(i2, j2, SystemClock.elapsedRealtime() - DefaultAudioSink.this.lastFeedElapsedRealtimeMs);
            }
        }
    }

    public static class DefaultAudioProcessorChain implements AudioProcessorChain {
        private final AudioProcessor[] audioProcessors;
        private final SilenceSkippingAudioProcessor silenceSkippingAudioProcessor;
        private final SonicAudioProcessor sonicAudioProcessor;

        public DefaultAudioProcessorChain(AudioProcessor... audioProcessorArr) {
            this(audioProcessorArr, new SilenceSkippingAudioProcessor(), new SonicAudioProcessor());
        }

        public DefaultAudioProcessorChain(AudioProcessor[] audioProcessorArr, SilenceSkippingAudioProcessor silenceSkippingAudioProcessor, SonicAudioProcessor sonicAudioProcessor) {
            AudioProcessor[] audioProcessorArr2 = new AudioProcessor[audioProcessorArr.length + 2];
            this.audioProcessors = audioProcessorArr2;
            System.arraycopy(audioProcessorArr, 0, audioProcessorArr2, 0, audioProcessorArr.length);
            this.silenceSkippingAudioProcessor = silenceSkippingAudioProcessor;
            this.sonicAudioProcessor = sonicAudioProcessor;
            audioProcessorArr2[audioProcessorArr.length] = silenceSkippingAudioProcessor;
            audioProcessorArr2[audioProcessorArr.length + 1] = sonicAudioProcessor;
        }

        @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.AudioProcessorChain
        public PlaybackParameters applyPlaybackParameters(PlaybackParameters playbackParameters) {
            this.sonicAudioProcessor.setSpeed(playbackParameters.speed);
            this.sonicAudioProcessor.setPitch(playbackParameters.pitch);
            return playbackParameters;
        }

        @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.AudioProcessorChain
        public boolean applySkipSilenceEnabled(boolean z2) {
            this.silenceSkippingAudioProcessor.setEnabled(z2);
            return z2;
        }

        @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.AudioProcessorChain
        public AudioProcessor[] getAudioProcessors() {
            return this.audioProcessors;
        }

        @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.AudioProcessorChain
        public long getMediaDuration(long j2) {
            return this.sonicAudioProcessor.getMediaDuration(j2);
        }

        @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.AudioProcessorChain
        public long getSkippedOutputFrameCount() {
            return this.silenceSkippingAudioProcessor.getSkippedFrames();
        }
    }

    private static final class I28 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final PlaybackParameters f57651n;
        public final long nr;
        public final boolean rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final long f57652t;

        /* synthetic */ I28(PlaybackParameters playbackParameters, boolean z2, long j2, long j3, j jVar) {
            this(playbackParameters, z2, j2, j3);
        }

        private I28(PlaybackParameters playbackParameters, boolean z2, long j2, long j3) {
            this.f57651n = playbackParameters;
            this.rl = z2;
            this.f57652t = j2;
            this.nr = j3;
        }
    }

    public static final class InvalidAudioTrackTimestampException extends RuntimeException {
        /* synthetic */ InvalidAudioTrackTimestampException(String str, j jVar) {
            this(str);
        }

        private InvalidAudioTrackTimestampException(String str) {
            super(str);
        }
    }

    private static final class Ml {
        public final int J2;
        public final int KN;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public final int f57653O;
        public final int Uo;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final Format f57654n;
        public final int nr;
        public final int rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final int f57655t;
        public final AudioProcessor[] xMQ;

        private AudioTrack J2(boolean z2, AudioAttributes audioAttributes, int i2) {
            return new AudioTrack.Builder().setAudioAttributes(xMQ(audioAttributes, z2)).setAudioFormat(DefaultAudioSink.getAudioFormat(this.f57653O, this.J2, this.Uo)).setTransferMode(1).setBufferSizeInBytes(this.KN).setSessionId(i2).setOffloadedPlayback(this.f57655t == 1).build();
        }

        private AudioTrack O(boolean z2, AudioAttributes audioAttributes, int i2) {
            return new AudioTrack(xMQ(audioAttributes, z2), DefaultAudioSink.getAudioFormat(this.f57653O, this.J2, this.Uo), this.KN, 1, i2);
        }

        private AudioTrack Uo(AudioAttributes audioAttributes, int i2) {
            int streamTypeForAudioUsage = Util.getStreamTypeForAudioUsage(audioAttributes.usage);
            return i2 == 0 ? new AudioTrack(streamTypeForAudioUsage, this.f57653O, this.J2, this.Uo, this.KN, 1) : new AudioTrack(streamTypeForAudioUsage, this.f57653O, this.J2, this.Uo, this.KN, 1, i2);
        }

        private static android.media.AudioAttributes mUb() {
            return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }

        private AudioTrack nr(boolean z2, AudioAttributes audioAttributes, int i2) {
            int i3 = Util.SDK_INT;
            return i3 >= 29 ? J2(z2, audioAttributes, i2) : i3 >= 21 ? O(z2, audioAttributes, i2) : Uo(audioAttributes, i2);
        }

        private static android.media.AudioAttributes xMQ(AudioAttributes audioAttributes, boolean z2) {
            return z2 ? mUb() : audioAttributes.getAudioAttributesV21().audioAttributes;
        }

        public boolean qie() {
            return this.f57655t == 1;
        }

        public boolean rl(Ml ml) {
            return ml.f57655t == this.f57655t && ml.Uo == this.Uo && ml.f57653O == this.f57653O && ml.J2 == this.J2 && ml.nr == this.nr;
        }

        public Ml t(int i2) {
            return new Ml(this.f57654n, this.rl, this.f57655t, this.nr, this.f57653O, this.J2, this.Uo, i2, this.xMQ);
        }

        public Ml(Format format, int i2, int i3, int i5, int i7, int i8, int i9, int i10, AudioProcessor[] audioProcessorArr) {
            this.f57654n = format;
            this.rl = i2;
            this.f57655t = i3;
            this.nr = i5;
            this.f57653O = i7;
            this.J2 = i8;
            this.Uo = i9;
            this.KN = i10;
            this.xMQ = audioProcessorArr;
        }

        public long KN(long j2) {
            return (j2 * 1000000) / ((long) this.f57653O);
        }

        public long gh(long j2) {
            return (j2 * 1000000) / ((long) this.f57654n.sampleRate);
        }

        public AudioTrack n(boolean z2, AudioAttributes audioAttributes, int i2) throws AudioSink.InitializationException {
            try {
                AudioTrack audioTrackNr = nr(z2, audioAttributes, i2);
                int state = audioTrackNr.getState();
                if (state == 1) {
                    return audioTrackNr;
                }
                try {
                    audioTrackNr.release();
                } catch (Exception unused) {
                }
                throw new AudioSink.InitializationException(state, this.f57653O, this.J2, this.KN, this.f57654n, qie(), null);
            } catch (IllegalArgumentException | UnsupportedOperationException e2) {
                throw new AudioSink.InitializationException(0, this.f57653O, this.J2, this.KN, this.f57654n, qie(), e2);
            }
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface OffloadMode {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface OutputMode {
    }

    private final class fuX {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Handler f57658n = new Handler();
        private final AudioTrack$StreamEventCallback rl;

        class j extends AudioTrack$StreamEventCallback {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ DefaultAudioSink f57660n;

            j(DefaultAudioSink defaultAudioSink) {
                this.f57660n = defaultAudioSink;
            }

            public void onDataRequest(AudioTrack audioTrack, int i2) {
                Assertions.checkState(audioTrack == DefaultAudioSink.this.audioTrack);
                if (DefaultAudioSink.this.listener == null || !DefaultAudioSink.this.playing) {
                    return;
                }
                DefaultAudioSink.this.listener.onOffloadBufferEmptying();
            }

            public void onTearDown(AudioTrack audioTrack) {
                Assertions.checkState(audioTrack == DefaultAudioSink.this.audioTrack);
                if (DefaultAudioSink.this.listener == null || !DefaultAudioSink.this.playing) {
                    return;
                }
                DefaultAudioSink.this.listener.onOffloadBufferEmptying();
            }
        }

        public fuX() {
            this.rl = new j(DefaultAudioSink.this);
        }

        public void n(AudioTrack audioTrack) {
            Handler handler = this.f57658n;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new androidx.media3.common.util.Wre(handler), this.rl);
        }

        public void rl(AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.rl);
            this.f57658n.removeCallbacksAndMessages(null);
        }
    }

    class j extends Thread {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ AudioTrack f57661n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str, AudioTrack audioTrack) {
            super(str);
            this.f57661n = audioTrack;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                this.f57661n.flush();
                this.f57661n.release();
            } finally {
                DefaultAudioSink.this.releasingConditionVariable.open();
            }
        }
    }

    interface w6 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final w6 f57663n = new DefaultAudioTrackBufferSizeProvider.Builder().build();

        int getBufferSizeInBytes(int i2, int i3, int i5, int i7, int i8, double d2);
    }

    /* synthetic */ DefaultAudioSink(Builder builder, j jVar) {
        this(builder);
    }

    private void flushAudioProcessors() {
        int i2 = 0;
        while (true) {
            AudioProcessor[] audioProcessorArr = this.activeAudioProcessors;
            if (i2 >= audioProcessorArr.length) {
                return;
            }
            AudioProcessor audioProcessor = audioProcessorArr[i2];
            audioProcessor.flush();
            this.outputBuffers[i2] = audioProcessor.getOutput();
            i2++;
        }
    }

    private static int getFramesPerEncodedSample(int i2, ByteBuffer byteBuffer) {
        switch (i2) {
            case 5:
            case 6:
            case 18:
                return Ac3Util.parseAc3SyncframeAudioSampleCount(byteBuffer);
            case 7:
            case 8:
                return DtsUtil.parseDtsAudioSampleCount(byteBuffer);
            case 9:
                int mpegAudioFrameSampleCount = MpegAudioUtil.parseMpegAudioFrameSampleCount(Util.getBigEndianInt(byteBuffer, byteBuffer.position()));
                if (mpegAudioFrameSampleCount != -1) {
                    return mpegAudioFrameSampleCount;
                }
                throw new IllegalArgumentException();
            case 10:
                return 1024;
            case 11:
            case 12:
                return 2048;
            case 13:
            default:
                throw new IllegalStateException("Unexpected audio encoding: " + i2);
            case 14:
                int iFindTrueHdSyncframeOffset = Ac3Util.findTrueHdSyncframeOffset(byteBuffer);
                if (iFindTrueHdSyncframeOffset == -1) {
                    return 0;
                }
                return Ac3Util.parseTrueHdSyncframeAudioSampleCount(byteBuffer, iFindTrueHdSyncframeOffset) * 16;
            case 15:
                return 512;
            case 16:
                return 1024;
            case 17:
                return Ac4Util.parseAc4SyncframeAudioSampleCount(byteBuffer);
        }
    }

    @RequiresApi
    private static int writeNonBlockingV21(AudioTrack audioTrack, ByteBuffer byteBuffer, int i2) {
        return audioTrack.write(byteBuffer, i2, 1);
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void handleDiscontinuity() {
        this.startMediaTimeUsNeedsSync = true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void pause() {
        this.playing = false;
        if (isAudioTrackInitialized() && this.audioTrackPositionTracker.ck()) {
            this.audioTrack.pause();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void play() {
        this.playing = true;
        if (isAudioTrackInitialized()) {
            this.audioTrackPositionTracker.XQ();
            this.audioTrack.play();
        }
    }

    private static final class Wre {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final long f57656n;
        private Exception rl;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private long f57657t;

        public void n() {
            this.rl = null;
        }

        public Wre(long j2) {
            this.f57656n = j2;
        }

        public void rl(Exception exc) throws Exception {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (this.rl == null) {
                this.rl = exc;
                this.f57657t = this.f57656n + jElapsedRealtime;
            }
            if (jElapsedRealtime >= this.f57657t) {
                Exception exc2 = this.rl;
                if (exc2 != exc) {
                    exc2.addSuppressed(exc);
                }
                Exception exc3 = this.rl;
                n();
                throw exc3;
            }
        }
    }

    private static final class n {
        @DoNotInline
        public static void n(AudioTrack audioTrack, PlayerId playerId) {
            LogSessionId logSessionId = playerId.getLogSessionId();
            if (!logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
                audioTrack.setLogSessionId(logSessionId);
            }
        }
    }

    @Deprecated
    public DefaultAudioSink(@Nullable AudioCapabilities audioCapabilities, AudioProcessor[] audioProcessorArr) {
        this(new Builder().setAudioCapabilities((AudioCapabilities) t1.Dsr.n(audioCapabilities, AudioCapabilities.DEFAULT_AUDIO_CAPABILITIES)).setAudioProcessors(audioProcessorArr));
    }

    private long applyMediaPositionParameters(long j2) {
        while (!this.mediaPositionParametersCheckpoints.isEmpty() && j2 >= this.mediaPositionParametersCheckpoints.getFirst().nr) {
            this.mediaPositionParameters = this.mediaPositionParametersCheckpoints.remove();
        }
        I28 i28 = this.mediaPositionParameters;
        long j3 = j2 - i28.nr;
        if (i28.f57651n.equals(PlaybackParameters.DEFAULT)) {
            return this.mediaPositionParameters.f57652t + j3;
        }
        if (this.mediaPositionParametersCheckpoints.isEmpty()) {
            return this.mediaPositionParameters.f57652t + this.audioProcessorChain.getMediaDuration(j3);
        }
        I28 first = this.mediaPositionParametersCheckpoints.getFirst();
        return first.f57652t - Util.getMediaDurationForPlayoutDuration(first.nr - j2, this.mediaPositionParameters.f57651n.speed);
    }

    private long applySkipping(long j2) {
        return j2 + this.configuration.KN(this.audioProcessorChain.getSkippedOutputFrameCount());
    }

    private AudioTrack buildAudioTrack(Ml ml) throws AudioSink.InitializationException {
        try {
            return ml.n(this.tunneling, this.audioAttributes, this.audioSessionId);
        } catch (AudioSink.InitializationException e2) {
            AudioSink.Listener listener = this.listener;
            if (listener != null) {
                listener.onAudioSinkError(e2);
            }
            throw e2;
        }
    }

    private AudioTrack buildAudioTrackWithRetry() throws AudioSink.InitializationException {
        try {
            return buildAudioTrack((Ml) Assertions.checkNotNull(this.configuration));
        } catch (AudioSink.InitializationException e2) {
            Ml ml = this.configuration;
            if (ml.KN > 1000000) {
                Ml mlT = ml.t(1000000);
                try {
                    AudioTrack audioTrackBuildAudioTrack = buildAudioTrack(mlT);
                    this.configuration = mlT;
                    return audioTrackBuildAudioTrack;
                } catch (AudioSink.InitializationException e3) {
                    e2.addSuppressed(e3);
                    maybeDisableOffload();
                    throw e2;
                }
            }
            maybeDisableOffload();
            throw e2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0029 -> B:5:0x0009). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean drainToEndOfStream() throws Exception {
        boolean z2;
        int i2;
        AudioProcessor[] audioProcessorArr;
        if (this.drainingAudioProcessorIndex == -1) {
            this.drainingAudioProcessorIndex = 0;
            z2 = true;
            i2 = this.drainingAudioProcessorIndex;
            audioProcessorArr = this.activeAudioProcessors;
            if (i2 < audioProcessorArr.length) {
                AudioProcessor audioProcessor = audioProcessorArr[i2];
                if (z2) {
                    audioProcessor.queueEndOfStream();
                }
                processBuffers(-9223372036854775807L);
                if (!audioProcessor.isEnded()) {
                    return false;
                }
                this.drainingAudioProcessorIndex++;
                z2 = true;
                i2 = this.drainingAudioProcessorIndex;
                audioProcessorArr = this.activeAudioProcessors;
                if (i2 < audioProcessorArr.length) {
                    ByteBuffer byteBuffer = this.outputBuffer;
                    if (byteBuffer != null) {
                        writeBuffer(byteBuffer, -9223372036854775807L);
                        if (this.outputBuffer != null) {
                            return false;
                        }
                    }
                    this.drainingAudioProcessorIndex = -1;
                    return true;
                }
            }
        } else {
            z2 = false;
            i2 = this.drainingAudioProcessorIndex;
            audioProcessorArr = this.activeAudioProcessors;
            if (i2 < audioProcessorArr.length) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @RequiresApi
    public static AudioFormat getAudioFormat(int i2, int i3, int i5) {
        return new AudioFormat.Builder().setSampleRate(i2).setChannelMask(i3).setEncoding(i5).build();
    }

    private I28 getMediaPositionParameters() {
        I28 i28 = this.afterDrainParameters;
        return i28 != null ? i28 : !this.mediaPositionParametersCheckpoints.isEmpty() ? this.mediaPositionParametersCheckpoints.getLast() : this.mediaPositionParameters;
    }

    @RequiresApi
    private int getOffloadedPlaybackSupport(AudioFormat audioFormat, android.media.AudioAttributes audioAttributes) {
        int i2 = Util.SDK_INT;
        if (i2 >= 31) {
            return AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        }
        if (AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
            return (i2 == 30 && Util.MODEL.startsWith("Pixel")) ? 2 : 1;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getSubmittedFrames() {
        Ml ml = this.configuration;
        return ml.f57655t == 0 ? this.submittedPcmBytes / ((long) ml.rl) : this.submittedEncodedFrames;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getWrittenFrames() {
        Ml ml = this.configuration;
        return ml.f57655t == 0 ? this.writtenPcmBytes / ((long) ml.nr) : this.writtenEncodedFrames;
    }

    private void initializeAudioTrack() throws AudioSink.InitializationException {
        PlayerId playerId;
        this.releasingConditionVariable.block();
        AudioTrack audioTrackBuildAudioTrackWithRetry = buildAudioTrackWithRetry();
        this.audioTrack = audioTrackBuildAudioTrackWithRetry;
        if (isOffloadedPlayback(audioTrackBuildAudioTrackWithRetry)) {
            registerStreamEventCallbackV29(this.audioTrack);
            if (this.offloadMode != 3) {
                AudioTrack audioTrack = this.audioTrack;
                Format format = this.configuration.f57654n;
                audioTrack.setOffloadDelayPadding(format.encoderDelay, format.encoderPadding);
            }
        }
        if (Util.SDK_INT >= 31 && (playerId = this.playerId) != null) {
            n.n(this.audioTrack, playerId);
        }
        this.audioSessionId = this.audioTrack.getAudioSessionId();
        AudioTrackPositionTracker audioTrackPositionTracker = this.audioTrackPositionTracker;
        AudioTrack audioTrack2 = this.audioTrack;
        Ml ml = this.configuration;
        audioTrackPositionTracker.o(audioTrack2, ml.f57655t == 2, ml.Uo, ml.nr, ml.KN);
        setVolumeInternal();
        int i2 = this.auxEffectInfo.effectId;
        if (i2 != 0) {
            this.audioTrack.attachAuxEffect(i2);
            this.audioTrack.setAuxEffectSendLevel(this.auxEffectInfo.sendLevel);
        }
        this.startMediaTimeUsNeedsInit = true;
    }

    private static boolean isAudioTrackDeadObject(int i2) {
        return (Util.SDK_INT >= 24 && i2 == -6) || i2 == ERROR_NATIVE_DEAD_OBJECT;
    }

    private boolean isAudioTrackInitialized() {
        return this.audioTrack != null;
    }

    private static boolean isOffloadedPlayback(AudioTrack audioTrack) {
        return Util.SDK_INT >= 29 && audioTrack.isOffloadedPlayback();
    }

    private void maybeDisableOffload() {
        if (this.configuration.qie()) {
            this.offloadDisabledUntilNextConfiguration = true;
        }
    }

    private void playPendingData() {
        if (this.stoppedAudioTrack) {
            return;
        }
        this.stoppedAudioTrack = true;
        this.audioTrackPositionTracker.Uo(getWrittenFrames());
        this.audioTrack.stop();
        this.bytesUntilNextAvSync = 0;
    }

    private void processBuffers(long j2) throws Exception {
        ByteBuffer byteBuffer;
        int length = this.activeAudioProcessors.length;
        int i2 = length;
        while (i2 >= 0) {
            if (i2 > 0) {
                byteBuffer = this.outputBuffers[i2 - 1];
            } else {
                byteBuffer = this.inputBuffer;
                if (byteBuffer == null) {
                    byteBuffer = AudioProcessor.EMPTY_BUFFER;
                }
            }
            if (i2 == length) {
                writeBuffer(byteBuffer, j2);
            } else {
                AudioProcessor audioProcessor = this.activeAudioProcessors[i2];
                if (i2 > this.drainingAudioProcessorIndex) {
                    audioProcessor.queueInput(byteBuffer);
                }
                ByteBuffer output = audioProcessor.getOutput();
                this.outputBuffers[i2] = output;
                if (output.hasRemaining()) {
                    i2++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i2--;
            }
        }
    }

    @RequiresApi
    private void registerStreamEventCallbackV29(AudioTrack audioTrack) {
        if (this.offloadStreamEventCallbackV29 == null) {
            this.offloadStreamEventCallbackV29 = new fuX();
        }
        this.offloadStreamEventCallbackV29.n(audioTrack);
    }

    private void resetSinkStateForFlush() {
        this.submittedPcmBytes = 0L;
        this.submittedEncodedFrames = 0L;
        this.writtenPcmBytes = 0L;
        this.writtenEncodedFrames = 0L;
        this.isWaitingForOffloadEndOfStreamHandled = false;
        this.framesPerEncodedSample = 0;
        this.mediaPositionParameters = new I28(getAudioProcessorPlaybackParameters(), getSkipSilenceEnabled(), 0L, 0L, null);
        this.startMediaTimeUs = 0L;
        this.afterDrainParameters = null;
        this.mediaPositionParametersCheckpoints.clear();
        this.inputBuffer = null;
        this.inputBufferAccessUnitCount = 0;
        this.outputBuffer = null;
        this.stoppedAudioTrack = false;
        this.handledEndOfStream = false;
        this.drainingAudioProcessorIndex = -1;
        this.avSyncHeader = null;
        this.bytesUntilNextAvSync = 0;
        this.trimmingAudioProcessor.rl();
        flushAudioProcessors();
    }

    private void setupAudioProcessors() {
        AudioProcessor[] audioProcessorArr = this.configuration.xMQ;
        ArrayList arrayList = new ArrayList();
        for (AudioProcessor audioProcessor : audioProcessorArr) {
            if (audioProcessor.isActive()) {
                arrayList.add(audioProcessor);
            } else {
                audioProcessor.flush();
            }
        }
        int size = arrayList.size();
        this.activeAudioProcessors = (AudioProcessor[]) arrayList.toArray(new AudioProcessor[size]);
        this.outputBuffers = new ByteBuffer[size];
        flushAudioProcessors();
    }

    private boolean shouldApplyAudioProcessorPlaybackParameters() {
        return (this.tunneling || !"audio/raw".equals(this.configuration.f57654n.sampleMimeType) || shouldUseFloatOutput(this.configuration.f57654n.pcmEncoding)) ? false : true;
    }

    private boolean shouldUseFloatOutput(int i2) {
        return this.enableFloatOutput && Util.isEncodingHighResolutionPcm(i2);
    }

    private boolean useOffloadedPlayback(Format format, AudioAttributes audioAttributes) {
        int encoding;
        int audioTrackChannelConfig;
        int offloadedPlaybackSupport;
        if (Util.SDK_INT < 29 || this.offloadMode == 0 || (encoding = MimeTypes.getEncoding((String) Assertions.checkNotNull(format.sampleMimeType), format.codecs)) == 0 || (audioTrackChannelConfig = Util.getAudioTrackChannelConfig(format.channelCount)) == 0 || (offloadedPlaybackSupport = getOffloadedPlaybackSupport(getAudioFormat(format.sampleRate, audioTrackChannelConfig, encoding), audioAttributes.getAudioAttributesV21().audioAttributes)) == 0) {
            return false;
        }
        if (offloadedPlaybackSupport == 1) {
            return ((format.encoderDelay != 0 || format.encoderPadding != 0) && (this.offloadMode == 1)) ? false : true;
        }
        if (offloadedPlaybackSupport == 2) {
            return true;
        }
        throw new IllegalStateException();
    }

    @RequiresApi
    private int writeNonBlockingWithAvSyncV21(AudioTrack audioTrack, ByteBuffer byteBuffer, int i2, long j2) {
        if (Util.SDK_INT >= 26) {
            return audioTrack.write(byteBuffer, i2, 1, j2 * 1000);
        }
        if (this.avSyncHeader == null) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
            this.avSyncHeader = byteBufferAllocate;
            byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
            this.avSyncHeader.putInt(1431633921);
        }
        if (this.bytesUntilNextAvSync == 0) {
            this.avSyncHeader.putInt(4, i2);
            this.avSyncHeader.putLong(8, j2 * 1000);
            this.avSyncHeader.position(0);
            this.bytesUntilNextAvSync = i2;
        }
        int iRemaining = this.avSyncHeader.remaining();
        if (iRemaining > 0) {
            int iWrite = audioTrack.write(this.avSyncHeader, iRemaining, 1);
            if (iWrite < 0) {
                this.bytesUntilNextAvSync = 0;
                return iWrite;
            }
            if (iWrite < iRemaining) {
                return 0;
            }
        }
        int iWriteNonBlockingV21 = writeNonBlockingV21(audioTrack, byteBuffer, i2);
        if (iWriteNonBlockingV21 < 0) {
            this.bytesUntilNextAvSync = 0;
            return iWriteNonBlockingV21;
        }
        this.bytesUntilNextAvSync -= iWriteNonBlockingV21;
        return iWriteNonBlockingV21;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void configure(Format format, int i2, @Nullable int[] iArr) throws AudioSink.ConfigurationException {
        int i3;
        int iIntValue;
        int iIntValue2;
        int i5;
        int i7;
        AudioProcessor[] audioProcessorArr;
        int i8;
        int pcmFrameSize;
        int i9;
        int[] iArr2;
        if ("audio/raw".equals(format.sampleMimeType)) {
            Assertions.checkArgument(Util.isEncodingLinearPcm(format.pcmEncoding));
            int pcmFrameSize2 = Util.getPcmFrameSize(format.pcmEncoding, format.channelCount);
            AudioProcessor[] audioProcessorArr2 = shouldUseFloatOutput(format.pcmEncoding) ? this.toFloatPcmAvailableAudioProcessors : this.toIntPcmAvailableAudioProcessors;
            this.trimmingAudioProcessor.t(format.encoderDelay, format.encoderPadding);
            if (Util.SDK_INT < 21 && format.channelCount == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i10 = 0; i10 < 6; i10++) {
                    iArr2[i10] = i10;
                }
            } else {
                iArr2 = iArr;
            }
            this.channelMappingAudioProcessor.n(iArr2);
            AudioProcessor.AudioFormat audioFormat = new AudioProcessor.AudioFormat(format.sampleRate, format.channelCount, format.pcmEncoding);
            for (AudioProcessor audioProcessor : audioProcessorArr2) {
                try {
                    AudioProcessor.AudioFormat audioFormatConfigure = audioProcessor.configure(audioFormat);
                    if (audioProcessor.isActive()) {
                        audioFormat = audioFormatConfigure;
                    }
                } catch (AudioProcessor.UnhandledAudioFormatException e2) {
                    throw new AudioSink.ConfigurationException(e2, format);
                }
            }
            iIntValue = audioFormat.encoding;
            i3 = audioFormat.sampleRate;
            iIntValue2 = Util.getAudioTrackChannelConfig(audioFormat.channelCount);
            AudioProcessor[] audioProcessorArr3 = audioProcessorArr2;
            i8 = pcmFrameSize2;
            audioProcessorArr = audioProcessorArr3;
            i7 = 0;
            pcmFrameSize = Util.getPcmFrameSize(iIntValue, audioFormat.channelCount);
        } else {
            AudioProcessor[] audioProcessorArr4 = new AudioProcessor[0];
            i3 = format.sampleRate;
            if (useOffloadedPlayback(format, this.audioAttributes)) {
                iIntValue = MimeTypes.getEncoding((String) Assertions.checkNotNull(format.sampleMimeType), format.codecs);
                iIntValue2 = Util.getAudioTrackChannelConfig(format.channelCount);
                i5 = 1;
            } else {
                Pair<Integer, Integer> encodingAndChannelConfigForPassthrough = this.audioCapabilities.getEncodingAndChannelConfigForPassthrough(format);
                if (encodingAndChannelConfigForPassthrough == null) {
                    throw new AudioSink.ConfigurationException("Unable to configure passthrough for: " + format, format);
                }
                iIntValue = ((Integer) encodingAndChannelConfigForPassthrough.first).intValue();
                iIntValue2 = ((Integer) encodingAndChannelConfigForPassthrough.second).intValue();
                i5 = 2;
            }
            i7 = i5;
            audioProcessorArr = audioProcessorArr4;
            i8 = -1;
            pcmFrameSize = -1;
        }
        int i11 = iIntValue;
        int i12 = i3;
        if (i2 != 0) {
            i9 = i2;
        } else {
            int bufferSizeInBytes = this.audioTrackBufferSizeProvider.getBufferSizeInBytes(getAudioTrackMinBufferSize(i12, iIntValue2, i11), i11, i7, pcmFrameSize, i12, this.enableAudioTrackPlaybackParams ? 8.0d : 1.0d);
            i11 = i11;
            i9 = bufferSizeInBytes;
        }
        if (i11 == 0) {
            throw new AudioSink.ConfigurationException("Invalid output encoding (mode=" + i7 + ") for: " + format, format);
        }
        if (iIntValue2 == 0) {
            throw new AudioSink.ConfigurationException("Invalid output channel config (mode=" + i7 + ") for: " + format, format);
        }
        this.offloadDisabledUntilNextConfiguration = false;
        Ml ml = new Ml(format, i8, i7, pcmFrameSize, i12, iIntValue2, i11, i9, audioProcessorArr);
        if (isAudioTrackInitialized()) {
            this.pendingConfiguration = ml;
        } else {
            this.configuration = ml;
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void disableTunneling() {
        if (this.tunneling) {
            this.tunneling = false;
            flush();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void enableTunnelingV21() {
        Assertions.checkState(Util.SDK_INT >= 21);
        Assertions.checkState(this.externalAudioSessionIdProvided);
        if (this.tunneling) {
            return;
        }
        this.tunneling = true;
        flush();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void experimentalFlushWithoutAudioTrackRelease() {
        if (Util.SDK_INT < 25) {
            flush();
            return;
        }
        this.writeExceptionPendingExceptionHolder.n();
        this.initializationExceptionPendingExceptionHolder.n();
        if (isAudioTrackInitialized()) {
            resetSinkStateForFlush();
            if (this.audioTrackPositionTracker.xMQ()) {
                this.audioTrack.pause();
            }
            this.audioTrack.flush();
            this.audioTrackPositionTracker.Ik();
            AudioTrackPositionTracker audioTrackPositionTracker = this.audioTrackPositionTracker;
            AudioTrack audioTrack = this.audioTrack;
            Ml ml = this.configuration;
            audioTrackPositionTracker.o(audioTrack, ml.f57655t == 2, ml.Uo, ml.nr, ml.KN);
            this.startMediaTimeUsNeedsInit = true;
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public AudioAttributes getAudioAttributes() {
        return this.audioAttributes;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public int getFormatSupport(Format format) {
        if (!"audio/raw".equals(format.sampleMimeType)) {
            return ((this.offloadDisabledUntilNextConfiguration || !useOffloadedPlayback(format, this.audioAttributes)) && !this.audioCapabilities.isPassthroughPlaybackSupported(format)) ? 0 : 2;
        }
        if (Util.isEncodingLinearPcm(format.pcmEncoding)) {
            int i2 = format.pcmEncoding;
            return (i2 == 2 || (this.enableFloatOutput && i2 == 4)) ? 2 : 1;
        }
        Log.w(TAG, "Invalid PCM encoding: " + format.pcmEncoding);
        return 0;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public PlaybackParameters getPlaybackParameters() {
        return this.enableAudioTrackPlaybackParams ? this.audioTrackPlaybackParameters : getAudioProcessorPlaybackParameters();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean handleBuffer(ByteBuffer byteBuffer, long j2, int i2) throws Exception {
        ByteBuffer byteBuffer2 = this.inputBuffer;
        Assertions.checkArgument(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.pendingConfiguration != null) {
            if (!drainToEndOfStream()) {
                return false;
            }
            if (this.pendingConfiguration.rl(this.configuration)) {
                this.configuration = this.pendingConfiguration;
                this.pendingConfiguration = null;
                if (isOffloadedPlayback(this.audioTrack) && this.offloadMode != 3) {
                    if (this.audioTrack.getPlayState() == 3) {
                        this.audioTrack.setOffloadEndOfStream();
                    }
                    AudioTrack audioTrack = this.audioTrack;
                    Format format = this.configuration.f57654n;
                    audioTrack.setOffloadDelayPadding(format.encoderDelay, format.encoderPadding);
                    this.isWaitingForOffloadEndOfStreamHandled = true;
                }
            } else {
                playPendingData();
                if (hasPendingData()) {
                    return false;
                }
                flush();
            }
            applyAudioProcessorPlaybackParametersAndSkipSilence(j2);
        }
        if (!isAudioTrackInitialized()) {
            try {
                initializeAudioTrack();
            } catch (AudioSink.InitializationException e2) {
                if (e2.isRecoverable) {
                    throw e2;
                }
                this.initializationExceptionPendingExceptionHolder.rl(e2);
                return false;
            }
        }
        this.initializationExceptionPendingExceptionHolder.n();
        if (this.startMediaTimeUsNeedsInit) {
            this.startMediaTimeUs = Math.max(0L, j2);
            this.startMediaTimeUsNeedsSync = false;
            this.startMediaTimeUsNeedsInit = false;
            if (this.enableAudioTrackPlaybackParams && Util.SDK_INT >= 23) {
                setAudioTrackPlaybackParametersV23(this.audioTrackPlaybackParameters);
            }
            applyAudioProcessorPlaybackParametersAndSkipSilence(j2);
            if (this.playing) {
                play();
            }
        }
        if (!this.audioTrackPositionTracker.gh(getWrittenFrames())) {
            return false;
        }
        if (this.inputBuffer == null) {
            Assertions.checkArgument(byteBuffer.order() == ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            Ml ml = this.configuration;
            if (ml.f57655t != 0 && this.framesPerEncodedSample == 0) {
                int framesPerEncodedSample = getFramesPerEncodedSample(ml.Uo, byteBuffer);
                this.framesPerEncodedSample = framesPerEncodedSample;
                if (framesPerEncodedSample == 0) {
                    return true;
                }
            }
            if (this.afterDrainParameters != null) {
                if (!drainToEndOfStream()) {
                    return false;
                }
                applyAudioProcessorPlaybackParametersAndSkipSilence(j2);
                this.afterDrainParameters = null;
            }
            long jGh = this.startMediaTimeUs + this.configuration.gh(getSubmittedFrames() - this.trimmingAudioProcessor.n());
            if (!this.startMediaTimeUsNeedsSync && Math.abs(jGh - j2) > 200000) {
                this.listener.onAudioSinkError(new AudioSink.UnexpectedDiscontinuityException(j2, jGh));
                this.startMediaTimeUsNeedsSync = true;
            }
            if (this.startMediaTimeUsNeedsSync) {
                if (!drainToEndOfStream()) {
                    return false;
                }
                long j3 = j2 - jGh;
                this.startMediaTimeUs += j3;
                this.startMediaTimeUsNeedsSync = false;
                applyAudioProcessorPlaybackParametersAndSkipSilence(j2);
                AudioSink.Listener listener = this.listener;
                if (listener != null && j3 != 0) {
                    listener.onPositionDiscontinuity();
                }
            }
            if (this.configuration.f57655t == 0) {
                this.submittedPcmBytes += (long) byteBuffer.remaining();
            } else {
                this.submittedEncodedFrames += ((long) this.framesPerEncodedSample) * ((long) i2);
            }
            this.inputBuffer = byteBuffer;
            this.inputBufferAccessUnitCount = i2;
        }
        processBuffers(j2);
        if (!this.inputBuffer.hasRemaining()) {
            this.inputBuffer = null;
            this.inputBufferAccessUnitCount = 0;
            return true;
        }
        if (!this.audioTrackPositionTracker.mUb(getWrittenFrames())) {
            return false;
        }
        Log.w(TAG, "Resetting stalled audio track");
        flush();
        return true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void playToEndOfStream() throws AudioSink.WriteException {
        if (!this.handledEndOfStream && isAudioTrackInitialized() && drainToEndOfStream()) {
            playPendingData();
            this.handledEndOfStream = true;
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setAudioAttributes(AudioAttributes audioAttributes) {
        if (this.audioAttributes.equals(audioAttributes)) {
            return;
        }
        this.audioAttributes = audioAttributes;
        if (this.tunneling) {
            return;
        }
        flush();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setAudioSessionId(int i2) {
        if (this.audioSessionId != i2) {
            this.audioSessionId = i2;
            this.externalAudioSessionIdProvided = i2 != 0;
            flush();
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setAuxEffectInfo(AuxEffectInfo auxEffectInfo) {
        if (this.auxEffectInfo.equals(auxEffectInfo)) {
            return;
        }
        int i2 = auxEffectInfo.effectId;
        float f3 = auxEffectInfo.sendLevel;
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack != null) {
            if (this.auxEffectInfo.effectId != i2) {
                audioTrack.attachAuxEffect(i2);
            }
            if (i2 != 0) {
                this.audioTrack.setAuxEffectSendLevel(f3);
            }
        }
        this.auxEffectInfo = auxEffectInfo;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setListener(AudioSink.Listener listener) {
        this.listener = listener;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
        PlaybackParameters playbackParameters2 = new PlaybackParameters(Util.constrainValue(playbackParameters.speed, 0.1f, 8.0f), Util.constrainValue(playbackParameters.pitch, 0.1f, 8.0f));
        if (!this.enableAudioTrackPlaybackParams || Util.SDK_INT < 23) {
            setAudioProcessorPlaybackParametersAndSkipSilence(playbackParameters2, getSkipSilenceEnabled());
        } else {
            setAudioTrackPlaybackParametersV23(playbackParameters2);
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setPlayerId(@Nullable PlayerId playerId) {
        this.playerId = playerId;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setVolume(float f3) {
        if (this.volume != f3) {
            this.volume = f3;
            setVolumeInternal();
        }
    }

    private void applyAudioProcessorPlaybackParametersAndSkipSilence(long j2) {
        PlaybackParameters playbackParametersApplyPlaybackParameters;
        boolean zApplySkipSilenceEnabled;
        if (shouldApplyAudioProcessorPlaybackParameters()) {
            playbackParametersApplyPlaybackParameters = this.audioProcessorChain.applyPlaybackParameters(getAudioProcessorPlaybackParameters());
        } else {
            playbackParametersApplyPlaybackParameters = PlaybackParameters.DEFAULT;
        }
        PlaybackParameters playbackParameters = playbackParametersApplyPlaybackParameters;
        if (shouldApplyAudioProcessorPlaybackParameters()) {
            zApplySkipSilenceEnabled = this.audioProcessorChain.applySkipSilenceEnabled(getSkipSilenceEnabled());
        } else {
            zApplySkipSilenceEnabled = false;
        }
        boolean z2 = zApplySkipSilenceEnabled;
        this.mediaPositionParametersCheckpoints.add(new I28(playbackParameters, z2, Math.max(0L, j2), this.configuration.KN(getWrittenFrames()), null));
        setupAudioProcessors();
        AudioSink.Listener listener = this.listener;
        if (listener != null) {
            listener.onSkipSilenceEnabledChanged(z2);
        }
    }

    private PlaybackParameters getAudioProcessorPlaybackParameters() {
        return getMediaPositionParameters().f57651n;
    }

    private static int getAudioTrackMinBufferSize(int i2, int i3, int i5) {
        boolean z2;
        int minBufferSize = AudioTrack.getMinBufferSize(i2, i3, i5);
        if (minBufferSize != -2) {
            z2 = true;
        } else {
            z2 = false;
        }
        Assertions.checkState(z2);
        return minBufferSize;
    }

    private void setAudioProcessorPlaybackParametersAndSkipSilence(PlaybackParameters playbackParameters, boolean z2) {
        I28 mediaPositionParameters = getMediaPositionParameters();
        if (playbackParameters.equals(mediaPositionParameters.f57651n) && z2 == mediaPositionParameters.rl) {
            return;
        }
        I28 i28 = new I28(playbackParameters, z2, -9223372036854775807L, -9223372036854775807L, null);
        if (isAudioTrackInitialized()) {
            this.afterDrainParameters = i28;
        } else {
            this.mediaPositionParameters = i28;
        }
    }

    @RequiresApi
    private void setAudioTrackPlaybackParametersV23(PlaybackParameters playbackParameters) {
        if (isAudioTrackInitialized()) {
            try {
                this.audioTrack.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(playbackParameters.speed).setPitch(playbackParameters.pitch).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e2) {
                Log.w(TAG, "Failed to set playback params", e2);
            }
            playbackParameters = new PlaybackParameters(this.audioTrack.getPlaybackParams().getSpeed(), this.audioTrack.getPlaybackParams().getPitch());
            this.audioTrackPositionTracker.Z(playbackParameters.speed);
        }
        this.audioTrackPlaybackParameters = playbackParameters;
    }

    private void setVolumeInternal() {
        if (!isAudioTrackInitialized()) {
            return;
        }
        if (Util.SDK_INT >= 21) {
            setVolumeInternalV21(this.audioTrack, this.volume);
        } else {
            setVolumeInternalV3(this.audioTrack, this.volume);
        }
    }

    @RequiresApi
    private static void setVolumeInternalV21(AudioTrack audioTrack, float f3) {
        audioTrack.setVolume(f3);
    }

    private static void setVolumeInternalV3(AudioTrack audioTrack, float f3) {
        audioTrack.setStereoVolume(f3, f3);
    }

    private void writeBuffer(ByteBuffer byteBuffer, long j2) throws Exception {
        DefaultAudioSink defaultAudioSink;
        ByteBuffer byteBuffer2;
        int iWriteNonBlockingV21;
        boolean z2;
        AudioSink.Listener listener;
        boolean z3;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer3 = this.outputBuffer;
            boolean z4 = true;
            if (byteBuffer3 != null) {
                if (byteBuffer3 == byteBuffer) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                Assertions.checkArgument(z3);
            } else {
                this.outputBuffer = byteBuffer;
                if (Util.SDK_INT < 21) {
                    int iRemaining = byteBuffer.remaining();
                    byte[] bArr = this.preV21OutputBuffer;
                    if (bArr == null || bArr.length < iRemaining) {
                        this.preV21OutputBuffer = new byte[iRemaining];
                    }
                    int iPosition = byteBuffer.position();
                    byteBuffer.get(this.preV21OutputBuffer, 0, iRemaining);
                    byteBuffer.position(iPosition);
                    this.preV21OutputBufferOffset = 0;
                }
            }
            int iRemaining2 = byteBuffer.remaining();
            if (Util.SDK_INT < 21) {
                int iT = this.audioTrackPositionTracker.t(this.writtenPcmBytes);
                if (iT > 0) {
                    iWriteNonBlockingV21 = this.audioTrack.write(this.preV21OutputBuffer, this.preV21OutputBufferOffset, Math.min(iRemaining2, iT));
                    if (iWriteNonBlockingV21 > 0) {
                        this.preV21OutputBufferOffset += iWriteNonBlockingV21;
                        byteBuffer.position(byteBuffer.position() + iWriteNonBlockingV21);
                    }
                } else {
                    iWriteNonBlockingV21 = 0;
                }
                defaultAudioSink = this;
                byteBuffer2 = byteBuffer;
            } else if (this.tunneling) {
                if (j2 != -9223372036854775807L) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Assertions.checkState(z2);
                defaultAudioSink = this;
                byteBuffer2 = byteBuffer;
                iWriteNonBlockingV21 = defaultAudioSink.writeNonBlockingWithAvSyncV21(this.audioTrack, byteBuffer2, iRemaining2, j2);
            } else {
                defaultAudioSink = this;
                byteBuffer2 = byteBuffer;
                iWriteNonBlockingV21 = writeNonBlockingV21(defaultAudioSink.audioTrack, byteBuffer2, iRemaining2);
            }
            defaultAudioSink.lastFeedElapsedRealtimeMs = SystemClock.elapsedRealtime();
            if (iWriteNonBlockingV21 < 0) {
                boolean zIsAudioTrackDeadObject = isAudioTrackDeadObject(iWriteNonBlockingV21);
                if (zIsAudioTrackDeadObject) {
                    maybeDisableOffload();
                }
                AudioSink.WriteException writeException = new AudioSink.WriteException(iWriteNonBlockingV21, defaultAudioSink.configuration.f57654n, zIsAudioTrackDeadObject);
                AudioSink.Listener listener2 = defaultAudioSink.listener;
                if (listener2 != null) {
                    listener2.onAudioSinkError(writeException);
                }
                if (!writeException.isRecoverable) {
                    defaultAudioSink.writeExceptionPendingExceptionHolder.rl(writeException);
                    return;
                }
                throw writeException;
            }
            defaultAudioSink.writeExceptionPendingExceptionHolder.n();
            if (isOffloadedPlayback(defaultAudioSink.audioTrack)) {
                if (defaultAudioSink.writtenEncodedFrames > 0) {
                    defaultAudioSink.isWaitingForOffloadEndOfStreamHandled = false;
                }
                if (defaultAudioSink.playing && (listener = defaultAudioSink.listener) != null && iWriteNonBlockingV21 < iRemaining2 && !defaultAudioSink.isWaitingForOffloadEndOfStreamHandled) {
                    listener.onOffloadBufferFull();
                }
            }
            int i2 = defaultAudioSink.configuration.f57655t;
            if (i2 == 0) {
                defaultAudioSink.writtenPcmBytes += (long) iWriteNonBlockingV21;
            }
            if (iWriteNonBlockingV21 == iRemaining2) {
                if (i2 != 0) {
                    if (byteBuffer2 != defaultAudioSink.inputBuffer) {
                        z4 = false;
                    }
                    Assertions.checkState(z4);
                    defaultAudioSink.writtenEncodedFrames += ((long) defaultAudioSink.framesPerEncodedSample) * ((long) defaultAudioSink.inputBufferAccessUnitCount);
                }
                defaultAudioSink.outputBuffer = null;
            }
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void flush() {
        if (isAudioTrackInitialized()) {
            resetSinkStateForFlush();
            if (this.audioTrackPositionTracker.xMQ()) {
                this.audioTrack.pause();
            }
            if (isOffloadedPlayback(this.audioTrack)) {
                ((fuX) Assertions.checkNotNull(this.offloadStreamEventCallbackV29)).rl(this.audioTrack);
            }
            AudioTrack audioTrack = this.audioTrack;
            this.audioTrack = null;
            if (Util.SDK_INT < 21 && !this.externalAudioSessionIdProvided) {
                this.audioSessionId = 0;
            }
            Ml ml = this.pendingConfiguration;
            if (ml != null) {
                this.configuration = ml;
                this.pendingConfiguration = null;
            }
            this.audioTrackPositionTracker.Ik();
            this.releasingConditionVariable.close();
            new j("ExoPlayer:AudioTrackReleaseThread", audioTrack).start();
        }
        this.writeExceptionPendingExceptionHolder.n();
        this.initializationExceptionPendingExceptionHolder.n();
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public long getCurrentPositionUs(boolean z2) {
        if (isAudioTrackInitialized() && !this.startMediaTimeUsNeedsInit) {
            return applySkipping(applyMediaPositionParameters(Math.min(this.audioTrackPositionTracker.nr(z2), this.configuration.KN(getWrittenFrames()))));
        }
        return Long.MIN_VALUE;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean getSkipSilenceEnabled() {
        return getMediaPositionParameters().rl;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean hasPendingData() {
        if (isAudioTrackInitialized() && this.audioTrackPositionTracker.KN(getWrittenFrames())) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean isEnded() {
        if (isAudioTrackInitialized()) {
            if (!this.handledEndOfStream || hasPendingData()) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void reset() {
        flush();
        for (AudioProcessor audioProcessor : this.toIntPcmAvailableAudioProcessors) {
            audioProcessor.reset();
        }
        for (AudioProcessor audioProcessor2 : this.toFloatPcmAvailableAudioProcessors) {
            audioProcessor2.reset();
        }
        this.playing = false;
        this.offloadDisabledUntilNextConfiguration = false;
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public void setSkipSilenceEnabled(boolean z2) {
        setAudioProcessorPlaybackParametersAndSkipSilence(getAudioProcessorPlaybackParameters(), z2);
    }

    @Override // com.google.android.exoplayer2.audio.AudioSink
    public boolean supportsFormat(Format format) {
        if (getFormatSupport(format) != 0) {
            return true;
        }
        return false;
    }

    @Deprecated
    public DefaultAudioSink(@Nullable AudioCapabilities audioCapabilities, AudioProcessor[] audioProcessorArr, boolean z2) {
        this(new Builder().setAudioCapabilities((AudioCapabilities) t1.Dsr.n(audioCapabilities, AudioCapabilities.DEFAULT_AUDIO_CAPABILITIES)).setAudioProcessors(audioProcessorArr).setEnableFloatOutput(z2));
    }

    @Deprecated
    public DefaultAudioSink(@Nullable AudioCapabilities audioCapabilities, AudioProcessorChain audioProcessorChain, boolean z2, boolean z3, int i2) {
        this(new Builder().setAudioCapabilities((AudioCapabilities) t1.Dsr.n(audioCapabilities, AudioCapabilities.DEFAULT_AUDIO_CAPABILITIES)).setAudioProcessorChain(audioProcessorChain).setEnableFloatOutput(z2).setEnableAudioTrackPlaybackParams(z3).setOffloadMode(i2));
    }

    private DefaultAudioSink(Builder builder) {
        this.audioCapabilities = builder.audioCapabilities;
        AudioProcessorChain audioProcessorChain = builder.audioProcessorChain;
        this.audioProcessorChain = audioProcessorChain;
        int i2 = Util.SDK_INT;
        this.enableFloatOutput = i2 >= 21 && builder.enableFloatOutput;
        this.enableAudioTrackPlaybackParams = i2 >= 23 && builder.enableAudioTrackPlaybackParams;
        this.offloadMode = i2 >= 29 ? builder.offloadMode : 0;
        this.audioTrackBufferSizeProvider = builder.audioTrackBufferSizeProvider;
        this.releasingConditionVariable = new ConditionVariable(true);
        this.audioTrackPositionTracker = new AudioTrackPositionTracker(new CN3(this, null));
        qz qzVar = new qz();
        this.channelMappingAudioProcessor = qzVar;
        z zVar = new z();
        this.trimmingAudioProcessor = zVar;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new Xo(), qzVar, zVar);
        Collections.addAll(arrayList, audioProcessorChain.getAudioProcessors());
        this.toIntPcmAvailableAudioProcessors = (AudioProcessor[]) arrayList.toArray(new AudioProcessor[0]);
        this.toFloatPcmAvailableAudioProcessors = new AudioProcessor[]{new Pl()};
        this.volume = 1.0f;
        this.audioAttributes = AudioAttributes.DEFAULT;
        this.audioSessionId = 0;
        this.auxEffectInfo = new AuxEffectInfo(0, 0.0f);
        PlaybackParameters playbackParameters = PlaybackParameters.DEFAULT;
        this.mediaPositionParameters = new I28(playbackParameters, false, 0L, 0L, null);
        this.audioTrackPlaybackParameters = playbackParameters;
        this.drainingAudioProcessorIndex = -1;
        this.activeAudioProcessors = new AudioProcessor[0];
        this.outputBuffers = new ByteBuffer[0];
        this.mediaPositionParametersCheckpoints = new ArrayDeque<>();
        this.initializationExceptionPendingExceptionHolder = new Wre(100L);
        this.writeExceptionPendingExceptionHolder = new Wre(100L);
    }
}
