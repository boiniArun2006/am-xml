package com.google.android.exoplayer2.audio;

import com.google.android.exoplayer2.audio.DefaultAudioSink;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public class DefaultAudioTrackBufferSizeProvider implements DefaultAudioSink.w6 {
    private static final int AC3_BUFFER_MULTIPLICATION_FACTOR = 2;
    private static final int MAX_PCM_BUFFER_DURATION_US = 750000;
    private static final int MIN_PCM_BUFFER_DURATION_US = 250000;
    private static final int OFFLOAD_BUFFER_DURATION_US = 50000000;
    private static final int PASSTHROUGH_BUFFER_DURATION_US = 250000;
    private static final int PCM_BUFFER_MULTIPLICATION_FACTOR = 4;
    public final int ac3BufferMultiplicationFactor;
    protected final int maxPcmBufferDurationUs;
    protected final int minPcmBufferDurationUs;
    protected final int offloadBufferDurationUs;
    protected final int passthroughBufferDurationUs;
    protected final int pcmBufferMultiplicationFactor;

    public static class Builder {
        private int minPcmBufferDurationUs = 250000;
        private int maxPcmBufferDurationUs = DefaultAudioTrackBufferSizeProvider.MAX_PCM_BUFFER_DURATION_US;
        private int pcmBufferMultiplicationFactor = 4;
        private int passthroughBufferDurationUs = 250000;
        private int offloadBufferDurationUs = DefaultAudioTrackBufferSizeProvider.OFFLOAD_BUFFER_DURATION_US;
        private int ac3BufferMultiplicationFactor = 2;

        public DefaultAudioTrackBufferSizeProvider build() {
            return new DefaultAudioTrackBufferSizeProvider(this);
        }

        public Builder setAc3BufferMultiplicationFactor(int i2) {
            this.ac3BufferMultiplicationFactor = i2;
            return this;
        }

        public Builder setMaxPcmBufferDurationUs(int i2) {
            this.maxPcmBufferDurationUs = i2;
            return this;
        }

        public Builder setMinPcmBufferDurationUs(int i2) {
            this.minPcmBufferDurationUs = i2;
            return this;
        }

        public Builder setOffloadBufferDurationUs(int i2) {
            this.offloadBufferDurationUs = i2;
            return this;
        }

        public Builder setPassthroughBufferDurationUs(int i2) {
            this.passthroughBufferDurationUs = i2;
            return this;
        }

        public Builder setPcmBufferMultiplicationFactor(int i2) {
            this.pcmBufferMultiplicationFactor = i2;
            return this;
        }
    }

    protected static int durationUsToBytes(int i2, int i3, int i5) {
        return com.google.common.primitives.Wre.nr(((((long) i2) * ((long) i3)) * ((long) i5)) / 1000000);
    }

    protected int get1xBufferSizeInBytes(int i2, int i3, int i5, int i7, int i8) {
        if (i5 == 0) {
            return getPcmBufferSizeInBytes(i2, i8, i7);
        }
        if (i5 == 1) {
            return getOffloadBufferSizeInBytes(i3);
        }
        if (i5 == 2) {
            return getPassthroughBufferSizeInBytes(i3);
        }
        throw new IllegalArgumentException();
    }

    protected int getPassthroughBufferSizeInBytes(int i2) {
        int i3 = this.passthroughBufferDurationUs;
        if (i2 == 5) {
            i3 *= this.ac3BufferMultiplicationFactor;
        }
        return com.google.common.primitives.Wre.nr((((long) i3) * ((long) getMaximumEncodedRateBytesPerSecond(i2))) / 1000000);
    }

    protected int getPcmBufferSizeInBytes(int i2, int i3, int i5) {
        return Util.constrainValue(i2 * this.pcmBufferMultiplicationFactor, durationUsToBytes(this.minPcmBufferDurationUs, i3, i5), durationUsToBytes(this.maxPcmBufferDurationUs, i3, i5));
    }

    protected DefaultAudioTrackBufferSizeProvider(Builder builder) {
        this.minPcmBufferDurationUs = builder.minPcmBufferDurationUs;
        this.maxPcmBufferDurationUs = builder.maxPcmBufferDurationUs;
        this.pcmBufferMultiplicationFactor = builder.pcmBufferMultiplicationFactor;
        this.passthroughBufferDurationUs = builder.passthroughBufferDurationUs;
        this.offloadBufferDurationUs = builder.offloadBufferDurationUs;
        this.ac3BufferMultiplicationFactor = builder.ac3BufferMultiplicationFactor;
    }

    protected static int getMaximumEncodedRateBytesPerSecond(int i2) {
        switch (i2) {
            case 5:
                return 80000;
            case 6:
            case 18:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            case 13:
            default:
                throw new IllegalArgumentException();
            case 14:
                return 3062500;
            case 15:
                return 8000;
            case 16:
                return 256000;
            case 17:
                return 336000;
        }
    }

    @Override // com.google.android.exoplayer2.audio.DefaultAudioSink.w6
    public int getBufferSizeInBytes(int i2, int i3, int i5, int i7, int i8, double d2) {
        return (((Math.max(i2, (int) (((double) get1xBufferSizeInBytes(i2, i3, i5, i7, i8)) * d2)) + i7) - 1) / i7) * i7;
    }

    protected int getOffloadBufferSizeInBytes(int i2) {
        return com.google.common.primitives.Wre.nr((((long) this.offloadBufferDurationUs) * ((long) getMaximumEncodedRateBytesPerSecond(i2))) / 1000000);
    }
}
