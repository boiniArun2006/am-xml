package androidx.media3.common.audio;

import androidx.annotation.GuardedBy;
import androidx.annotation.IntRange;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.LongArrayQueue;
import androidx.media3.common.util.SpeedProviderUtil;
import androidx.media3.common.util.TimestampConsumer;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Queue;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@UnstableApi
public final class SpeedChangingAudioProcessor implements AudioProcessor {
    private float currentSpeed;
    private boolean endOfStreamQueuedToSonic;
    private long framesRead;

    @GuardedBy
    private AudioProcessor.AudioFormat inputAudioFormat;
    private boolean inputEnded;
    private final Object lock;

    @GuardedBy
    private final LongArrayQueue pendingCallbackInputTimesUs;

    @GuardedBy
    private final Queue<TimestampConsumer> pendingCallbacks;
    private AudioProcessor.AudioFormat pendingInputAudioFormat;
    private AudioProcessor.AudioFormat pendingOutputAudioFormat;
    private final SynchronizedSonicAudioProcessor sonicAudioProcessor;
    private final SpeedProvider speedProvider;

    private static long getDurationUsAfterProcessorApplied(SpeedProvider speedProvider, int i2, long j2) {
        return Util.sampleCountToDurationUs(getSampleCountAfterProcessorApplied(speedProvider, i2, Util.scaleLargeValue(j2, i2, 1000000L, RoundingMode.HALF_EVEN)), i2);
    }

    @VisibleForTesting
    static long getInputFrameCountForOutput(SpeedProvider speedProvider, @IntRange int i2, @IntRange long j2) {
        int i3 = i2;
        Assertions.checkArgument(i3 > 0);
        Assertions.checkArgument(j2 >= 0);
        long j3 = j2;
        long expectedInputFrameCountForOutputFrameCount = 0;
        while (j3 > 0) {
            long nextSpeedChangeSamplePosition = SpeedProviderUtil.getNextSpeedChangeSamplePosition(speedProvider, expectedInputFrameCountForOutputFrameCount, i2);
            float sampleAlignedSpeed = SpeedProviderUtil.getSampleAlignedSpeed(speedProvider, expectedInputFrameCountForOutputFrameCount, i2);
            long expectedFrameCountAfterProcessorApplied = Sonic.getExpectedFrameCountAfterProcessorApplied(i3, i2, sampleAlignedSpeed, sampleAlignedSpeed, nextSpeedChangeSamplePosition - expectedInputFrameCountForOutputFrameCount);
            if (nextSpeedChangeSamplePosition == -1 || expectedFrameCountAfterProcessorApplied > j3) {
                expectedInputFrameCountForOutputFrameCount += Sonic.getExpectedInputFrameCountForOutputFrameCount(i2, i2, sampleAlignedSpeed, sampleAlignedSpeed, j3);
                j3 = 0;
            } else {
                j3 -= expectedFrameCountAfterProcessorApplied;
                expectedInputFrameCountForOutputFrameCount = nextSpeedChangeSamplePosition;
            }
            i3 = i2;
        }
        return expectedInputFrameCountForOutputFrameCount;
    }

    public static long getSampleCountAfterProcessorApplied(SpeedProvider speedProvider, @IntRange int i2, @IntRange long j2) {
        Assertions.checkArgument(speedProvider != null);
        Assertions.checkArgument(i2 > 0);
        long j3 = 0;
        Assertions.checkArgument(j2 >= 0);
        long expectedFrameCountAfterProcessorApplied = 0;
        while (j3 < j2) {
            long nextSpeedChangeSamplePosition = SpeedProviderUtil.getNextSpeedChangeSamplePosition(speedProvider, j3, i2);
            if (nextSpeedChangeSamplePosition == -1 || nextSpeedChangeSamplePosition > j2) {
                nextSpeedChangeSamplePosition = j2;
            }
            float sampleAlignedSpeed = SpeedProviderUtil.getSampleAlignedSpeed(speedProvider, j3, i2);
            expectedFrameCountAfterProcessorApplied += Sonic.getExpectedFrameCountAfterProcessorApplied(i2, i2, sampleAlignedSpeed, sampleAlignedSpeed, nextSpeedChangeSamplePosition - j3);
            j3 = nextSpeedChangeSamplePosition;
        }
        return expectedFrameCountAfterProcessorApplied;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void flush() {
        this.inputEnded = false;
        resetInternalState(false);
        synchronized (this.lock) {
            this.inputAudioFormat = this.pendingInputAudioFormat;
            this.sonicAudioProcessor.flush();
            processPendingCallbacks();
        }
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void queueEndOfStream() {
        this.inputEnded = true;
        if (this.endOfStreamQueuedToSonic) {
            return;
        }
        this.sonicAudioProcessor.queueEndOfStream();
        this.endOfStreamQueuedToSonic = true;
    }

    private void processPendingCallbacks() {
        synchronized (this.lock) {
            try {
                if (this.inputAudioFormat.sampleRate == -1) {
                    return;
                }
                while (!this.pendingCallbacks.isEmpty()) {
                    this.pendingCallbacks.remove().onTimestamp(getDurationUsAfterProcessorApplied(this.speedProvider, this.inputAudioFormat.sampleRate, this.pendingCallbackInputTimesUs.remove()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void resetInternalState(boolean z2) {
        if (z2) {
            this.currentSpeed = 1.0f;
        }
        this.framesRead = 0L;
        this.endOfStreamQueuedToSonic = false;
    }

    private void updateSpeed(float f3) {
        if (f3 != this.currentSpeed) {
            this.currentSpeed = f3;
            this.sonicAudioProcessor.setSpeed(f3);
            this.sonicAudioProcessor.setPitch(f3);
            this.sonicAudioProcessor.flush();
            this.endOfStreamQueuedToSonic = false;
        }
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public AudioProcessor.AudioFormat configure(AudioProcessor.AudioFormat audioFormat) throws AudioProcessor.UnhandledAudioFormatException {
        this.pendingInputAudioFormat = audioFormat;
        AudioProcessor.AudioFormat audioFormatConfigure = this.sonicAudioProcessor.configure(audioFormat);
        this.pendingOutputAudioFormat = audioFormatConfigure;
        return audioFormatConfigure;
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public long getDurationAfterProcessorApplied(long j2) {
        return SpeedProviderUtil.getDurationAfterSpeedProviderApplied(this.speedProvider, j2);
    }

    public long getMediaDurationUs(long j2) {
        int i2;
        synchronized (this.lock) {
            i2 = this.inputAudioFormat.sampleRate;
        }
        if (i2 == -1) {
            return j2;
        }
        return Util.sampleCountToDurationUs(getInputFrameCountForOutput(this.speedProvider, i2, Util.scaleLargeValue(j2, i2, 1000000L, RoundingMode.HALF_EVEN)), i2);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public ByteBuffer getOutput() {
        return this.sonicAudioProcessor.getOutput();
    }

    public void getSpeedAdjustedTimeAsync(long j2, TimestampConsumer timestampConsumer) {
        synchronized (this.lock) {
            try {
                int i2 = this.inputAudioFormat.sampleRate;
                if (i2 != -1) {
                    timestampConsumer.onTimestamp(getDurationUsAfterProcessorApplied(this.speedProvider, i2, j2));
                } else {
                    this.pendingCallbackInputTimesUs.add(j2);
                    this.pendingCallbacks.add(timestampConsumer);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public boolean isActive() {
        return !this.pendingOutputAudioFormat.equals(AudioProcessor.AudioFormat.NOT_SET);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public boolean isEnded() {
        return this.inputEnded && this.sonicAudioProcessor.isEnded();
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void queueInput(ByteBuffer byteBuffer) {
        AudioProcessor.AudioFormat audioFormat;
        int i2;
        synchronized (this.lock) {
            audioFormat = this.inputAudioFormat;
        }
        float sampleAlignedSpeed = SpeedProviderUtil.getSampleAlignedSpeed(this.speedProvider, this.framesRead, audioFormat.sampleRate);
        long nextSpeedChangeSamplePosition = SpeedProviderUtil.getNextSpeedChangeSamplePosition(this.speedProvider, this.framesRead, audioFormat.sampleRate);
        updateSpeed(sampleAlignedSpeed);
        int iLimit = byteBuffer.limit();
        if (nextSpeedChangeSamplePosition != -1) {
            i2 = (int) ((nextSpeedChangeSamplePosition - this.framesRead) * ((long) audioFormat.bytesPerFrame));
            byteBuffer.limit(Math.min(iLimit, byteBuffer.position() + i2));
        } else {
            i2 = -1;
        }
        long jPosition = byteBuffer.position();
        this.sonicAudioProcessor.queueInput(byteBuffer);
        if (i2 != -1 && ((long) byteBuffer.position()) - jPosition == i2) {
            this.sonicAudioProcessor.queueEndOfStream();
            this.endOfStreamQueuedToSonic = true;
        }
        long jPosition2 = ((long) byteBuffer.position()) - jPosition;
        Assertions.checkState(jPosition2 % ((long) audioFormat.bytesPerFrame) == 0, "A frame was not queued completely.");
        this.framesRead += jPosition2 / ((long) audioFormat.bytesPerFrame);
        byteBuffer.limit(iLimit);
    }

    public SpeedChangingAudioProcessor(SpeedProvider speedProvider) {
        AudioProcessor.AudioFormat audioFormat = AudioProcessor.AudioFormat.NOT_SET;
        this.pendingInputAudioFormat = audioFormat;
        this.pendingOutputAudioFormat = audioFormat;
        this.inputAudioFormat = audioFormat;
        this.speedProvider = speedProvider;
        Object obj = new Object();
        this.lock = obj;
        this.sonicAudioProcessor = new SynchronizedSonicAudioProcessor(obj, true);
        this.pendingCallbackInputTimesUs = new LongArrayQueue();
        this.pendingCallbacks = new ArrayDeque();
        resetInternalState(true);
    }

    @Override // androidx.media3.common.audio.AudioProcessor
    public void reset() {
        flush();
        AudioProcessor.AudioFormat audioFormat = AudioProcessor.AudioFormat.NOT_SET;
        this.pendingInputAudioFormat = audioFormat;
        this.pendingOutputAudioFormat = audioFormat;
        synchronized (this.lock) {
            this.inputAudioFormat = audioFormat;
            this.pendingCallbackInputTimesUs.clear();
            this.pendingCallbacks.clear();
        }
        resetInternalState(true);
        this.sonicAudioProcessor.reset();
    }
}
