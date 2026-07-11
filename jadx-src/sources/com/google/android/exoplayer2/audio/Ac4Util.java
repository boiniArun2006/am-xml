package com.google.android.exoplayer2.audio;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.vungle.ads.internal.protos.Sdk;
import java.nio.ByteBuffer;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class Ac4Util {
    public static final int AC40_SYNCWORD = 44096;
    public static final int AC41_SYNCWORD = 44097;
    private static final int CHANNEL_COUNT_2 = 2;
    public static final int HEADER_SIZE_FOR_PARSER = 16;
    public static final int MAX_RATE_BYTES_PER_SECOND = 336000;
    private static final int[] SAMPLE_COUNT = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, Sdk.SDKError.Reason.CONCURRENT_PLAYBACK_UNSUPPORTED_VALUE, Sdk.SDKError.Reason.CONCURRENT_PLAYBACK_UNSUPPORTED_VALUE, 2048};
    public static final int SAMPLE_HEADER_SIZE = 7;

    public static final class SyncFrameInfo {
        public final int bitstreamVersion;
        public final int channelCount;
        public final int frameSize;
        public final int sampleCount;
        public final int sampleRate;

        private SyncFrameInfo(int i2, int i3, int i5, int i7, int i8) {
            this.bitstreamVersion = i2;
            this.channelCount = i3;
            this.sampleRate = i5;
            this.frameSize = i7;
            this.sampleCount = i8;
        }
    }

    public static void getAc4SampleHeader(int i2, ParsableByteArray parsableByteArray) {
        parsableByteArray.reset(7);
        byte[] data = parsableByteArray.getData();
        data[0] = -84;
        data[1] = 64;
        data[2] = -1;
        data[3] = -1;
        data[4] = (byte) ((i2 >> 16) & 255);
        data[5] = (byte) ((i2 >> 8) & 255);
        data[6] = (byte) (i2 & 255);
    }

    public static Format parseAc4AnnexEFormat(ParsableByteArray parsableByteArray, String str, String str2, @Nullable DrmInitData drmInitData) {
        parsableByteArray.skipBytes(1);
        return new Format.Builder().setId(str).setSampleMimeType("audio/ac4").setChannelCount(2).setSampleRate(((parsableByteArray.readUnsignedByte() & 32) >> 5) == 1 ? 48000 : 44100).setDrmInitData(drmInitData).setLanguage(str2).build();
    }

    public static int parseAc4SyncframeSize(byte[] bArr, int i2) {
        int i3 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        int i5 = ((bArr[2] & UByte.MAX_VALUE) << 8) | (bArr[3] & UByte.MAX_VALUE);
        if (i5 == 65535) {
            i5 = ((bArr[4] & UByte.MAX_VALUE) << 16) | ((bArr[5] & UByte.MAX_VALUE) << 8) | (bArr[6] & UByte.MAX_VALUE);
        } else {
            i3 = 4;
        }
        if (i2 == 44097) {
            i3 += 2;
        }
        return i5 + i3;
    }

    private static int readVariableBits(ParsableBitArray parsableBitArray, int i2) {
        int i3 = 0;
        while (true) {
            int bits = i3 + parsableBitArray.readBits(i2);
            if (!parsableBitArray.readBit()) {
                return bits;
            }
            i3 = (bits + 1) << i2;
        }
    }

    public static int parseAc4SyncframeAudioSampleCount(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int iPosition = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(iPosition);
        return parseAc4SyncframeInfo(new ParsableBitArray(bArr)).sampleCount;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0082, code lost:
    
        if (r11 != 11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0089, code lost:
    
        if (r11 != 11) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x008e, code lost:
    
        if (r11 != 8) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static SyncFrameInfo parseAc4SyncframeInfo(ParsableBitArray parsableBitArray) {
        int i2;
        int i3;
        int i5;
        int i7;
        int bits = parsableBitArray.readBits(16);
        int bits2 = parsableBitArray.readBits(16);
        if (bits2 == 65535) {
            bits2 = parsableBitArray.readBits(24);
            i2 = 7;
        } else {
            i2 = 4;
        }
        int i8 = bits2 + i2;
        if (bits == 44097) {
            i8 += 2;
        }
        int i9 = i8;
        int bits3 = parsableBitArray.readBits(2);
        if (bits3 == 3) {
            bits3 += readVariableBits(parsableBitArray, 2);
        }
        int i10 = bits3;
        int bits4 = parsableBitArray.readBits(10);
        if (parsableBitArray.readBit() && parsableBitArray.readBits(3) > 0) {
            parsableBitArray.skipBits(2);
        }
        int i11 = 48000;
        if (parsableBitArray.readBit()) {
            i3 = 48000;
        } else {
            i3 = 48000;
            i11 = 44100;
        }
        int bits5 = parsableBitArray.readBits(4);
        if (i11 != 44100 || bits5 != 13) {
            if (i11 == i3) {
                int[] iArr = SAMPLE_COUNT;
                if (bits5 < iArr.length) {
                    int i12 = iArr[bits5];
                    int i13 = bits4 % 5;
                    if (i13 == 1) {
                        if (bits5 != 3) {
                        }
                        i5 = i12 + 1;
                    } else if (i13 == 2) {
                        if (bits5 != 8) {
                        }
                        i5 = i12 + 1;
                    } else if (i13 != 3) {
                        if (i13 == 4) {
                            if (bits5 != 3) {
                                if (bits5 != 8) {
                                }
                            }
                            i5 = i12 + 1;
                        }
                        i7 = i12;
                    }
                } else {
                    i5 = 0;
                }
            }
            return new SyncFrameInfo(i10, 2, i11, i9, i7);
        }
        i5 = SAMPLE_COUNT[bits5];
        i7 = i5;
        return new SyncFrameInfo(i10, 2, i11, i9, i7);
    }

    private Ac4Util() {
    }
}
