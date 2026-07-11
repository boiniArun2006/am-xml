package androidx.media3.extractor;

import androidx.annotation.Nullable;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.RendererCapabilities;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@UnstableApi
public final class DtsUtil {
    public static final int DTS_EXPRESS_MAX_RATE_BITS_PER_SECOND = 768000;
    public static final int DTS_HD_MAX_RATE_BYTES_PER_SECOND = 2250000;
    public static final int DTS_MAX_RATE_BYTES_PER_SECOND = 192000;
    private static final byte FIRST_BYTE_14B_BE = 31;
    private static final byte FIRST_BYTE_14B_LE = -1;
    private static final byte FIRST_BYTE_BE = 127;
    private static final byte FIRST_BYTE_EXTSS_BE = 100;
    private static final byte FIRST_BYTE_EXTSS_LE = 37;
    private static final byte FIRST_BYTE_LE = -2;
    private static final byte FIRST_BYTE_UHD_FTOC_NONSYNC_BE = 113;
    private static final byte FIRST_BYTE_UHD_FTOC_NONSYNC_LE = -24;
    private static final byte FIRST_BYTE_UHD_FTOC_SYNC_BE = 64;
    private static final byte FIRST_BYTE_UHD_FTOC_SYNC_LE = -14;
    public static final int FRAME_TYPE_CORE = 1;
    public static final int FRAME_TYPE_EXTENSION_SUBSTREAM = 2;
    public static final int FRAME_TYPE_UHD_NON_SYNC = 4;
    public static final int FRAME_TYPE_UHD_SYNC = 3;
    public static final int FRAME_TYPE_UNKNOWN = 0;
    private static final int SYNC_VALUE_14B_BE = 536864768;
    private static final int SYNC_VALUE_14B_LE = -14745368;
    private static final int SYNC_VALUE_BE = 2147385345;
    private static final int SYNC_VALUE_EXTSS_BE = 1683496997;
    private static final int SYNC_VALUE_EXTSS_LE = 622876772;
    private static final int SYNC_VALUE_LE = -25230976;
    private static final int SYNC_VALUE_UHD_FTOC_NONSYNC_BE = 1908687592;
    private static final int SYNC_VALUE_UHD_FTOC_NONSYNC_LE = -398277519;
    private static final int SYNC_VALUE_UHD_FTOC_SYNC_BE = 1078008818;
    private static final int SYNC_VALUE_UHD_FTOC_SYNC_LE = -233094848;
    private static final int[] CHANNELS_BY_AMODE = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    private static final int[] SAMPLE_RATE_BY_SFREQ = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};
    private static final int[] TWICE_BITRATE_KBPS_BY_RATE = {64, 112, 128, 192, 224, 256, RendererCapabilities.DECODER_SUPPORT_MASK, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};
    private static final int[] SAMPLE_RATE_BY_INDEX = {8000, 16000, 32000, 64000, 128000, 22050, 44100, 88200, 176400, 352800, 12000, 24000, 48000, 96000, 192000, 384000};
    private static final int[] UHD_FTOC_PAYLOAD_LENGTH_TABLE = {5, 8, 10, 12};
    private static final int[] UHD_METADATA_CHUNK_SIZE_LENGTH_TABLE = {6, 9, 12, 15};
    private static final int[] UHD_AUDIO_CHUNK_ID_LENGTH_TABLE = {2, 4, 6, 8};
    private static final int[] UHD_AUDIO_CHUNK_SIZE_LENGTH_TABLE = {9, 11, 13, 16};
    private static final int[] UHD_HEADER_SIZE_LENGTH_TABLE = {5, 8, 10, 12};

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface DtsAudioMimeType {
    }

    public static final class DtsHeader {
        public final int bitrate;
        public final int channelCount;
        public final long frameDurationUs;
        public final int frameSize;
        public final String mimeType;
        public final int sampleRate;

        private DtsHeader(String str, int i2, int i3, int i5, long j2, int i7) {
            this.mimeType = str;
            this.channelCount = i2;
            this.sampleRate = i3;
            this.frameSize = i5;
            this.frameDurationUs = j2;
            this.bitrate = i7;
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface FrameType {
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int getDtsFrameSize(byte[] bArr) {
        int i2;
        byte b2;
        int i3;
        int i5;
        byte b4;
        boolean z2 = false;
        byte b5 = bArr[0];
        if (b5 != -2) {
            if (b5 == -1) {
                i5 = ((bArr[7] & 3) << 12) | ((bArr[6] & 255) << 4);
                b4 = bArr[9];
            } else if (b5 != 31) {
                i2 = ((bArr[5] & 3) << 12) | ((bArr[6] & 255) << 4);
                b2 = bArr[7];
            } else {
                i5 = ((bArr[6] & 3) << 12) | ((bArr[7] & 255) << 4);
                b4 = bArr[8];
            }
            i3 = (((b4 & 60) >> 2) | i5) + 1;
            z2 = true;
            return !z2 ? (i3 * 16) / 14 : i3;
        }
        i2 = ((bArr[4] & 3) << 12) | ((bArr[7] & 255) << 4);
        b2 = bArr[6];
        i3 = (((b2 & 240) >> 4) | i2) + 1;
        if (!z2) {
        }
    }

    public static int getFrameType(int i2) {
        if (i2 == SYNC_VALUE_BE || i2 == SYNC_VALUE_LE || i2 == SYNC_VALUE_14B_BE || i2 == SYNC_VALUE_14B_LE) {
            return 1;
        }
        if (i2 == SYNC_VALUE_EXTSS_BE || i2 == SYNC_VALUE_EXTSS_LE) {
            return 2;
        }
        if (i2 == SYNC_VALUE_UHD_FTOC_SYNC_BE || i2 == SYNC_VALUE_UHD_FTOC_SYNC_LE) {
            return 3;
        }
        return (i2 == SYNC_VALUE_UHD_FTOC_NONSYNC_BE || i2 == SYNC_VALUE_UHD_FTOC_NONSYNC_LE) ? 4 : 0;
    }

    private static ParsableBitArray getNormalizedFrame(byte[] bArr) {
        byte b2 = bArr[0];
        if (b2 == 127 || b2 == 100 || b2 == 64 || b2 == 113) {
            return new ParsableBitArray(bArr);
        }
        byte[] bArrCopyOf = Arrays.copyOf(bArr, bArr.length);
        if (isLittleEndianFrameHeader(bArrCopyOf)) {
            for (int i2 = 0; i2 < bArrCopyOf.length - 1; i2 += 2) {
                byte b4 = bArrCopyOf[i2];
                int i3 = i2 + 1;
                bArrCopyOf[i2] = bArrCopyOf[i3];
                bArrCopyOf[i3] = b4;
            }
        }
        ParsableBitArray parsableBitArray = new ParsableBitArray(bArrCopyOf);
        if (bArrCopyOf[0] == 31) {
            ParsableBitArray parsableBitArray2 = new ParsableBitArray(bArrCopyOf);
            while (parsableBitArray2.bitsLeft() >= 16) {
                parsableBitArray2.skipBits(2);
                parsableBitArray.putInt(parsableBitArray2.readBits(14), 14);
            }
        }
        parsableBitArray.reset(bArrCopyOf);
        return parsableBitArray;
    }

    private static boolean isLittleEndianFrameHeader(byte[] bArr) {
        byte b2 = bArr[0];
        return b2 == -2 || b2 == -1 || b2 == 37 || b2 == -14 || b2 == -24;
    }

    public static int parseDtsAudioSampleCount(byte[] bArr) {
        int i2;
        byte b2;
        int i3;
        byte b4;
        byte b5 = bArr[0];
        if (b5 != -2) {
            if (b5 == -1) {
                i2 = (bArr[4] & 7) << 4;
                b4 = bArr[7];
            } else if (b5 != 31) {
                i2 = (bArr[4] & 1) << 6;
                b2 = bArr[5];
            } else {
                i2 = (bArr[5] & 7) << 4;
                b4 = bArr[6];
            }
            i3 = b4 & 60;
            return (((i3 >> 2) | i2) + 1) * 32;
        }
        i2 = (bArr[5] & 1) << 6;
        b2 = bArr[4];
        i3 = b2 & 252;
        return (((i3 >> 2) | i2) + 1) * 32;
    }

    private static int parseUnsignedVarInt(ParsableBitArray parsableBitArray, int[] iArr, boolean z2) {
        int i2 = 0;
        int i3 = 0;
        for (int i5 = 0; i5 < 3 && parsableBitArray.readBit(); i5++) {
            i3++;
        }
        if (z2) {
            int i7 = 0;
            while (i2 < i3) {
                i7 += 1 << iArr[i2];
                i2++;
            }
            i2 = i7;
        }
        return i2 + parsableBitArray.readBits(iArr[i3]);
    }

    private static void checkCrc(byte[] bArr, int i2) throws ParserException {
        int i3 = i2 - 2;
        if (((bArr[i2 - 1] & 255) | ((bArr[i3] << 8) & 65535)) != Util.crc16(bArr, 0, i3, 65535)) {
            throw ParserException.createForMalformedContainer("CRC check failed", null);
        }
    }

    private DtsUtil() {
    }

    public static Format parseDtsFormat(byte[] bArr, @Nullable String str, @Nullable String str2, int i2, String str3, @Nullable DrmInitData drmInitData) {
        int i3;
        int i5;
        ParsableBitArray normalizedFrame = getNormalizedFrame(bArr);
        normalizedFrame.skipBits(60);
        int i7 = CHANNELS_BY_AMODE[normalizedFrame.readBits(6)];
        int i8 = SAMPLE_RATE_BY_SFREQ[normalizedFrame.readBits(4)];
        int bits = normalizedFrame.readBits(5);
        int[] iArr = TWICE_BITRATE_KBPS_BY_RATE;
        if (bits >= iArr.length) {
            i3 = -1;
        } else {
            i3 = (iArr[bits] * 1000) / 2;
        }
        normalizedFrame.skipBits(10);
        if (normalizedFrame.readBits(2) > 0) {
            i5 = 1;
        } else {
            i5 = 0;
        }
        return new Format.Builder().setId(str).setContainerMimeType(str3).setSampleMimeType("audio/vnd.dts").setAverageBitrate(i3).setChannelCount(i7 + i5).setSampleRate(i8).setDrmInitData(drmInitData).setLanguage(str2).setRoleFlags(i2).build();
    }

    public static DtsHeader parseDtsHdHeader(byte[] bArr) throws ParserException {
        int i2;
        int i3;
        int bits;
        int i5;
        long jScaleLargeTimestamp;
        int i7;
        ParsableBitArray normalizedFrame = getNormalizedFrame(bArr);
        normalizedFrame.skipBits(40);
        int bits2 = normalizedFrame.readBits(2);
        if (!normalizedFrame.readBit()) {
            i2 = 16;
            i3 = 8;
        } else {
            i2 = 20;
            i3 = 12;
        }
        normalizedFrame.skipBits(i3);
        int bits3 = normalizedFrame.readBits(i2) + 1;
        boolean bit = normalizedFrame.readBit();
        int bits4 = -1;
        int i8 = 0;
        if (bit) {
            bits = normalizedFrame.readBits(2);
            int bits5 = (normalizedFrame.readBits(3) + 1) * 512;
            if (normalizedFrame.readBit()) {
                normalizedFrame.skipBits(36);
            }
            int bits6 = normalizedFrame.readBits(3) + 1;
            int bits7 = normalizedFrame.readBits(3) + 1;
            if (bits6 == 1 && bits7 == 1) {
                int i9 = bits2 + 1;
                int bits8 = normalizedFrame.readBits(i9);
                for (int i10 = 0; i10 < i9; i10++) {
                    if (((bits8 >> i10) & 1) == 1) {
                        normalizedFrame.skipBits(8);
                    }
                }
                if (normalizedFrame.readBit()) {
                    normalizedFrame.skipBits(2);
                    int bits9 = (normalizedFrame.readBits(2) + 1) << 2;
                    int bits10 = normalizedFrame.readBits(2) + 1;
                    while (i8 < bits10) {
                        normalizedFrame.skipBits(bits9);
                        i8++;
                    }
                }
                i8 = bits5;
            } else {
                throw ParserException.createForUnsupportedContainerFeature("Multiple audio presentations or assets not supported");
            }
        } else {
            bits = -1;
        }
        normalizedFrame.skipBits(i2);
        normalizedFrame.skipBits(12);
        if (bit) {
            if (normalizedFrame.readBit()) {
                normalizedFrame.skipBits(4);
            }
            if (normalizedFrame.readBit()) {
                normalizedFrame.skipBits(24);
            }
            if (normalizedFrame.readBit()) {
                normalizedFrame.skipBytes(normalizedFrame.readBits(10) + 1);
            }
            normalizedFrame.skipBits(5);
            i5 = SAMPLE_RATE_BY_INDEX[normalizedFrame.readBits(4)];
            bits4 = normalizedFrame.readBits(8) + 1;
        } else {
            i5 = -2147483647;
        }
        int i11 = i5;
        if (bit) {
            if (bits != 0) {
                if (bits != 1) {
                    if (bits == 2) {
                        i7 = 48000;
                    } else {
                        throw ParserException.createForMalformedContainer("Unsupported reference clock code in DTS HD header: " + bits, null);
                    }
                } else {
                    i7 = 44100;
                }
            } else {
                i7 = 32000;
            }
            jScaleLargeTimestamp = Util.scaleLargeTimestamp(i8, 1000000L, i7);
        } else {
            jScaleLargeTimestamp = -9223372036854775807L;
        }
        return new DtsHeader("audio/vnd.dts.hd;profile=lbr", bits4, i11, bits3, jScaleLargeTimestamp, 0);
    }

    public static int parseDtsHdHeaderSize(byte[] bArr) {
        int i2;
        ParsableBitArray normalizedFrame = getNormalizedFrame(bArr);
        normalizedFrame.skipBits(42);
        if (normalizedFrame.readBit()) {
            i2 = 12;
        } else {
            i2 = 8;
        }
        return normalizedFrame.readBits(i2) + 1;
    }

    public static DtsHeader parseDtsUhdHeader(byte[] bArr, AtomicInteger atomicInteger) throws ParserException {
        int i2;
        int bits;
        long jScaleLargeTimestamp;
        AtomicInteger atomicInteger2;
        int i3;
        int i5;
        ParsableBitArray normalizedFrame = getNormalizedFrame(bArr);
        int unsignedVarInt = 0;
        if (normalizedFrame.readBits(32) == SYNC_VALUE_UHD_FTOC_SYNC_BE) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        int unsignedVarInt2 = parseUnsignedVarInt(normalizedFrame, UHD_FTOC_PAYLOAD_LENGTH_TABLE, true) + 1;
        if (i2 != 0) {
            if (normalizedFrame.readBit()) {
                checkCrc(bArr, unsignedVarInt2);
                int bits2 = normalizedFrame.readBits(2);
                if (bits2 != 0) {
                    if (bits2 != 1) {
                        if (bits2 == 2) {
                            i3 = RendererCapabilities.DECODER_SUPPORT_MASK;
                        } else {
                            throw ParserException.createForMalformedContainer("Unsupported base duration index in DTS UHD header: " + bits2, null);
                        }
                    } else {
                        i3 = 480;
                    }
                } else {
                    i3 = 512;
                }
                int bits3 = i3 * (normalizedFrame.readBits(3) + 1);
                int bits4 = normalizedFrame.readBits(2);
                if (bits4 != 0) {
                    if (bits4 != 1) {
                        if (bits4 == 2) {
                            i5 = 48000;
                        } else {
                            throw ParserException.createForMalformedContainer("Unsupported clock rate index in DTS UHD header: " + bits4, null);
                        }
                    } else {
                        i5 = 44100;
                    }
                } else {
                    i5 = 32000;
                }
                if (normalizedFrame.readBit()) {
                    normalizedFrame.skipBits(36);
                }
                bits = (1 << normalizedFrame.readBits(2)) * i5;
                jScaleLargeTimestamp = Util.scaleLargeTimestamp(bits3, 1000000L, i5);
            } else {
                throw ParserException.createForUnsupportedContainerFeature("Only supports full channel mask-based audio presentation");
            }
        } else {
            bits = -2147483647;
            jScaleLargeTimestamp = -9223372036854775807L;
        }
        int i7 = bits;
        long j2 = jScaleLargeTimestamp;
        int unsignedVarInt3 = 0;
        for (int i8 = 0; i8 < i2; i8++) {
            unsignedVarInt3 += parseUnsignedVarInt(normalizedFrame, UHD_METADATA_CHUNK_SIZE_LENGTH_TABLE, true);
        }
        if (i2 != 0) {
            atomicInteger2 = atomicInteger;
            atomicInteger2.set(parseUnsignedVarInt(normalizedFrame, UHD_AUDIO_CHUNK_ID_LENGTH_TABLE, true));
        } else {
            atomicInteger2 = atomicInteger;
        }
        if (atomicInteger2.get() != 0) {
            unsignedVarInt = parseUnsignedVarInt(normalizedFrame, UHD_AUDIO_CHUNK_SIZE_LENGTH_TABLE, true);
        }
        return new DtsHeader("audio/vnd.dts.uhd;profile=p2", 2, i7, unsignedVarInt2 + unsignedVarInt3 + unsignedVarInt, j2, 0);
    }

    public static int parseDtsUhdHeaderSize(byte[] bArr) {
        ParsableBitArray normalizedFrame = getNormalizedFrame(bArr);
        normalizedFrame.skipBits(32);
        return parseUnsignedVarInt(normalizedFrame, UHD_HEADER_SIZE_LENGTH_TABLE, true) + 1;
    }

    public static int parseDtsAudioSampleCount(ByteBuffer byteBuffer) {
        int i2;
        byte b2;
        int i3;
        byte b4;
        if (byteBuffer.getInt(0) == SYNC_VALUE_UHD_FTOC_SYNC_LE || byteBuffer.getInt(0) == SYNC_VALUE_UHD_FTOC_NONSYNC_LE) {
            return 1024;
        }
        if (byteBuffer.getInt(0) == SYNC_VALUE_EXTSS_LE) {
            return 4096;
        }
        int iPosition = byteBuffer.position();
        byte b5 = byteBuffer.get(iPosition);
        if (b5 != -2) {
            if (b5 == -1) {
                i2 = (byteBuffer.get(iPosition + 4) & 7) << 4;
                b4 = byteBuffer.get(iPosition + 7);
            } else if (b5 != 31) {
                i2 = (byteBuffer.get(iPosition + 4) & 1) << 6;
                b2 = byteBuffer.get(iPosition + 5);
            } else {
                i2 = (byteBuffer.get(iPosition + 5) & 7) << 4;
                b4 = byteBuffer.get(iPosition + 6);
            }
            i3 = b4 & 60;
            return (((i3 >> 2) | i2) + 1) * 32;
        }
        i2 = (byteBuffer.get(iPosition + 5) & 1) << 6;
        b2 = byteBuffer.get(iPosition + 4);
        i3 = b2 & 252;
        return (((i3 >> 2) | i2) + 1) * 32;
    }
}
