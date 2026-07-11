package com.google.android.exoplayer2.audio;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class MpegAudioUtil {
    public static final int MAX_FRAME_SIZE_BYTES = 4096;
    public static final int MAX_RATE_BYTES_PER_SECOND = 40000;
    private static final int SAMPLES_PER_FRAME_L1 = 384;
    private static final int SAMPLES_PER_FRAME_L2 = 1152;
    private static final int SAMPLES_PER_FRAME_L3_V1 = 1152;
    private static final int SAMPLES_PER_FRAME_L3_V2 = 576;
    private static final String[] MIME_TYPE_BY_LAYER = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    private static final int[] SAMPLING_RATE_V1 = {44100, 48000, 32000};
    private static final int[] BITRATE_V1_L1 = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    private static final int[] BITRATE_V2_L1 = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    private static final int[] BITRATE_V1_L2 = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    private static final int[] BITRATE_V1_L3 = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    private static final int[] BITRATE_V2 = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* JADX INFO: Access modifiers changed from: private */
    public static int getFrameSizeInSamples(int i2, int i3) {
        if (i3 == 1) {
            if (i2 == 3) {
                return 1152;
            }
            return SAMPLES_PER_FRAME_L3_V2;
        }
        if (i3 == 2) {
            return 1152;
        }
        if (i3 == 3) {
            return 384;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isMagicPresent(int i2) {
        return (i2 & (-2097152)) == -2097152;
    }

    public static final class Header {
        public int bitrate;
        public int channels;
        public int frameSize;

        @Nullable
        public String mimeType;
        public int sampleRate;
        public int samplesPerFrame;
        public int version;

        public boolean setForHeaderData(int i2) {
            int i3;
            int i5;
            int i7;
            int i8;
            int i9;
            int i10;
            if (!MpegAudioUtil.isMagicPresent(i2) || (i3 = (i2 >>> 19) & 3) == 1 || (i5 = (i2 >>> 17) & 3) == 0 || (i7 = (i2 >>> 12) & 15) == 0 || i7 == 15 || (i8 = (i2 >>> 10) & 3) == 3) {
                return false;
            }
            this.version = i3;
            this.mimeType = MpegAudioUtil.MIME_TYPE_BY_LAYER[3 - i5];
            int i11 = MpegAudioUtil.SAMPLING_RATE_V1[i8];
            this.sampleRate = i11;
            int i12 = 2;
            if (i3 == 2) {
                this.sampleRate = i11 / 2;
            } else if (i3 == 0) {
                this.sampleRate = i11 / 4;
            }
            int i13 = (i2 >>> 9) & 1;
            this.samplesPerFrame = MpegAudioUtil.getFrameSizeInSamples(i3, i5);
            if (i5 == 3) {
                if (i3 == 3) {
                    i10 = MpegAudioUtil.BITRATE_V1_L1[i7 - 1];
                } else {
                    i10 = MpegAudioUtil.BITRATE_V2_L1[i7 - 1];
                }
                this.bitrate = i10;
                this.frameSize = (((i10 * 12) / this.sampleRate) + i13) * 4;
            } else {
                int i14 = 144;
                if (i3 == 3) {
                    if (i5 == 2) {
                        i9 = MpegAudioUtil.BITRATE_V1_L2[i7 - 1];
                    } else {
                        i9 = MpegAudioUtil.BITRATE_V1_L3[i7 - 1];
                    }
                    this.bitrate = i9;
                    this.frameSize = ((i9 * 144) / this.sampleRate) + i13;
                } else {
                    int i15 = MpegAudioUtil.BITRATE_V2[i7 - 1];
                    this.bitrate = i15;
                    if (i5 == 1) {
                        i14 = 72;
                    }
                    this.frameSize = ((i14 * i15) / this.sampleRate) + i13;
                }
            }
            if (((i2 >> 6) & 3) == 3) {
                i12 = 1;
            }
            this.channels = i12;
            return true;
        }
    }

    private MpegAudioUtil() {
    }

    public static int getFrameSize(int i2) {
        int i3;
        int i5;
        int i7;
        int i8;
        int i9;
        int i10;
        if (!isMagicPresent(i2) || (i3 = (i2 >>> 19) & 3) == 1 || (i5 = (i2 >>> 17) & 3) == 0 || (i7 = (i2 >>> 12) & 15) == 0 || i7 == 15 || (i8 = (i2 >>> 10) & 3) == 3) {
            return -1;
        }
        int i11 = SAMPLING_RATE_V1[i8];
        if (i3 == 2) {
            i11 /= 2;
        } else if (i3 == 0) {
            i11 /= 4;
        }
        int i12 = (i2 >>> 9) & 1;
        if (i5 == 3) {
            if (i3 == 3) {
                i10 = BITRATE_V1_L1[i7 - 1];
            } else {
                i10 = BITRATE_V2_L1[i7 - 1];
            }
            return (((i10 * 12) / i11) + i12) * 4;
        }
        if (i3 == 3) {
            if (i5 == 2) {
                i9 = BITRATE_V1_L2[i7 - 1];
            } else {
                i9 = BITRATE_V1_L3[i7 - 1];
            }
        } else {
            i9 = BITRATE_V2[i7 - 1];
        }
        int i13 = 144;
        if (i3 == 3) {
            return ((i9 * 144) / i11) + i12;
        }
        if (i5 == 1) {
            i13 = 72;
        }
        return ((i13 * i9) / i11) + i12;
    }

    public static int parseMpegAudioFrameSampleCount(int i2) {
        int i3;
        int i5;
        if (!isMagicPresent(i2) || (i3 = (i2 >>> 19) & 3) == 1 || (i5 = (i2 >>> 17) & 3) == 0) {
            return -1;
        }
        int i7 = (i2 >>> 12) & 15;
        int i8 = (i2 >>> 10) & 3;
        if (i7 == 0 || i7 == 15 || i8 == 3) {
            return -1;
        }
        return getFrameSizeInSamples(i3, i5);
    }
}
