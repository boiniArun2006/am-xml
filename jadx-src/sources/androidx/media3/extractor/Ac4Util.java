package androidx.media3.extractor;

import androidx.annotation.Nullable;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import com.vungle.ads.internal.protos.Sdk;
import java.nio.ByteBuffer;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@UnstableApi
public final class Ac4Util {
    public static final int AC40_SYNCWORD = 44096;
    public static final int AC41_SYNCWORD = 44097;
    private static final int CHANNEL_COUNT_2 = 2;
    private static final int CHANNEL_MODE_22_2 = 15;
    private static final int CHANNEL_MODE_3_0 = 2;
    private static final int CHANNEL_MODE_5_0 = 3;
    private static final int CHANNEL_MODE_5_1 = 4;
    private static final int CHANNEL_MODE_7_0_322 = 9;
    private static final int CHANNEL_MODE_7_0_34 = 5;
    private static final int CHANNEL_MODE_7_0_4 = 11;
    private static final int CHANNEL_MODE_7_0_52 = 7;
    private static final int CHANNEL_MODE_7_1_322 = 10;
    private static final int CHANNEL_MODE_7_1_34 = 6;
    private static final int CHANNEL_MODE_7_1_4 = 12;
    private static final int CHANNEL_MODE_7_1_52 = 8;
    private static final int CHANNEL_MODE_9_0_4 = 13;
    private static final int CHANNEL_MODE_9_1_4 = 14;
    private static final int CHANNEL_MODE_MONO = 0;
    private static final int CHANNEL_MODE_STEREO = 1;
    private static final int CHANNEL_MODE_UNKNOWN = -1;
    public static final int HEADER_SIZE_FOR_PARSER = 16;
    public static final int MAX_RATE_BYTES_PER_SECOND = 336000;
    private static final int[] SAMPLE_COUNT = {2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, Sdk.SDKError.Reason.CONCURRENT_PLAYBACK_UNSUPPORTED_VALUE, Sdk.SDKError.Reason.CONCURRENT_PLAYBACK_UNSUPPORTED_VALUE, 2048};
    public static final int SAMPLE_HEADER_SIZE = 7;

    private static final class Ac4Presentation {
        public int channelMode;
        public boolean hasBackChannels;
        public boolean isChannelCoded;
        public int level;
        public int numOfUmxObjects;
        public int topChannelPairs;

        private Ac4Presentation() {
            this.isChannelCoded = true;
            this.channelMode = -1;
            this.numOfUmxObjects = -1;
            this.hasBackChannels = true;
            this.topChannelPairs = 2;
            this.level = 0;
        }
    }

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

    private static int getChannelCountFromChannelMode(int i2) {
        switch (i2) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 5;
            case 4:
                return 6;
            case 5:
            case 7:
            case 9:
                return 7;
            case 6:
            case 8:
            case 10:
                return 8;
            case 11:
                return 11;
            case 12:
                return 12;
            case 13:
                return 13;
            case 14:
                return 14;
            case 15:
                return 24;
            default:
                return -1;
        }
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

    private static void parseDsiSubstream(ParsableBitArray parsableBitArray, Ac4Presentation ac4Presentation) throws ParserException {
        int bits = parsableBitArray.readBits(5);
        parsableBitArray.skipBits(2);
        if (parsableBitArray.readBit()) {
            parsableBitArray.skipBits(5);
        }
        if (bits >= 7 && bits <= 10) {
            parsableBitArray.skipBit();
        }
        if (parsableBitArray.readBit()) {
            int bits2 = parsableBitArray.readBits(3);
            if (ac4Presentation.channelMode == -1 && bits >= 0 && bits <= 15 && (bits2 == 0 || bits2 == 1)) {
                ac4Presentation.channelMode = bits;
            }
            if (parsableBitArray.readBit()) {
                skipDsiLanguage(parsableBitArray);
            }
        }
    }

    private static void parseDsiSubstreamGroup(ParsableBitArray parsableBitArray, Ac4Presentation ac4Presentation) throws ParserException {
        parsableBitArray.skipBits(2);
        boolean bit = parsableBitArray.readBit();
        int bits = parsableBitArray.readBits(8);
        for (int i2 = 0; i2 < bits; i2++) {
            parsableBitArray.skipBits(2);
            if (parsableBitArray.readBit()) {
                parsableBitArray.skipBits(5);
            }
            if (bit) {
                parsableBitArray.skipBits(24);
            } else {
                if (parsableBitArray.readBit()) {
                    if (!parsableBitArray.readBit()) {
                        parsableBitArray.skipBits(4);
                    }
                    ac4Presentation.numOfUmxObjects = parsableBitArray.readBits(6) + 1;
                }
                parsableBitArray.skipBits(4);
            }
        }
        if (parsableBitArray.readBit()) {
            parsableBitArray.skipBits(3);
            if (parsableBitArray.readBit()) {
                skipDsiLanguage(parsableBitArray);
            }
        }
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

    private static void skipDsiLanguage(ParsableBitArray parsableBitArray) throws ParserException {
        int bits = parsableBitArray.readBits(6);
        if (bits < 2 || bits > 42) {
            throw ParserException.createForUnsupportedContainerFeature(String.format("Invalid language tag bytes number: %d. Must be between 2 and 42.", Integer.valueOf(bits)));
        }
        parsableBitArray.skipBits(bits * 8);
    }

    /* JADX WARN: Removed duplicated region for block: B:158:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x02ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Format parseAc4AnnexEFormat(ParsableByteArray parsableByteArray, String str, @Nullable String str2, @Nullable DrmInitData drmInitData) throws ParserException {
        int adjustedChannelCount;
        boolean bit;
        int bits;
        int bits2;
        int bits3;
        int iBitsLeft;
        boolean z2;
        boolean bit2;
        ParsableBitArray parsableBitArray = new ParsableBitArray();
        parsableBitArray.reset(parsableByteArray);
        int iBitsLeft2 = parsableBitArray.bitsLeft();
        int bits4 = parsableBitArray.readBits(3);
        if (bits4 > 1) {
            throw ParserException.createForUnsupportedContainerFeature("Unsupported AC-4 DSI version: " + bits4);
        }
        int bits5 = parsableBitArray.readBits(7);
        int i2 = parsableBitArray.readBit() ? 48000 : 44100;
        parsableBitArray.skipBits(4);
        int bits6 = parsableBitArray.readBits(9);
        if (bits5 > 1) {
            if (bits4 == 0) {
                throw ParserException.createForUnsupportedContainerFeature("Invalid AC-4 DSI version: " + bits4);
            }
            if (parsableBitArray.readBit()) {
                parsableBitArray.skipBits(16);
                if (parsableBitArray.readBit()) {
                    parsableBitArray.skipBits(128);
                }
            }
        }
        if (bits4 == 1) {
            if (!skipDsiBitrate(parsableBitArray)) {
                throw ParserException.createForUnsupportedContainerFeature("Invalid AC-4 DSI bitrate.");
            }
            parsableBitArray.byteAlign();
        }
        Ac4Presentation ac4Presentation = new Ac4Presentation();
        for (int i3 = 0; i3 < bits6; i3++) {
            if (bits4 == 0) {
                bit = parsableBitArray.readBit();
                bits = parsableBitArray.readBits(5);
                bits2 = parsableBitArray.readBits(5);
                bits3 = 0;
                iBitsLeft = 0;
                z2 = false;
            } else {
                int bits7 = parsableBitArray.readBits(8);
                bits3 = parsableBitArray.readBits(8);
                if (bits3 == 255) {
                    bits3 += parsableBitArray.readBits(16);
                }
                if (bits7 > 2) {
                    parsableBitArray.skipBits(bits3 * 8);
                } else {
                    iBitsLeft = (iBitsLeft2 - parsableBitArray.bitsLeft()) / 8;
                    int bits8 = parsableBitArray.readBits(5);
                    z2 = bits8 == 31;
                    bits2 = bits7;
                    bits = bits8;
                    bit = false;
                }
            }
            if (bit || z2 || bits != 6) {
                ac4Presentation.level = parsableBitArray.readBits(3);
                if (parsableBitArray.readBit()) {
                    parsableBitArray.skipBits(5);
                }
                parsableBitArray.skipBits(2);
                int i5 = 1;
                if (bits4 == 1 && (bits2 == 1 || bits2 == 2)) {
                    parsableBitArray.skipBits(2);
                }
                parsableBitArray.skipBits(5);
                parsableBitArray.skipBits(10);
                if (bits4 == 1) {
                    if (bits2 > 0) {
                        ac4Presentation.isChannelCoded = parsableBitArray.readBit();
                    }
                    if (ac4Presentation.isChannelCoded) {
                        if (bits2 == 1 || bits2 == 2) {
                            int bits9 = parsableBitArray.readBits(5);
                            if (bits9 >= 0 && bits9 <= 15) {
                                ac4Presentation.channelMode = bits9;
                            }
                            if (bits9 >= 11 && bits9 <= 14) {
                                ac4Presentation.hasBackChannels = parsableBitArray.readBit();
                                ac4Presentation.topChannelPairs = parsableBitArray.readBits(2);
                            }
                        }
                        parsableBitArray.skipBits(24);
                        i5 = 1;
                    }
                    if (bits2 == i5 || bits2 == 2) {
                        if (parsableBitArray.readBit() && parsableBitArray.readBit()) {
                            parsableBitArray.skipBits(2);
                        }
                        if (parsableBitArray.readBit()) {
                            parsableBitArray.skipBit();
                            int i7 = 8;
                            int bits10 = parsableBitArray.readBits(8);
                            int i8 = 0;
                            while (i8 < bits10) {
                                parsableBitArray.skipBits(i7);
                                i8++;
                                i7 = 8;
                            }
                        }
                    }
                }
                if (!bit && !z2) {
                    parsableBitArray.skipBit();
                    if (bits == 0 || bits == 1 || bits == 2) {
                        if (bits2 == 0) {
                            for (int i9 = 0; i9 < 2; i9++) {
                                parseDsiSubstream(parsableBitArray, ac4Presentation);
                            }
                        } else {
                            for (int i10 = 0; i10 < 2; i10++) {
                                parseDsiSubstreamGroup(parsableBitArray, ac4Presentation);
                            }
                        }
                    } else if (bits == 3 || bits == 4) {
                        if (bits2 == 0) {
                            for (int i11 = 0; i11 < 3; i11++) {
                                parseDsiSubstream(parsableBitArray, ac4Presentation);
                            }
                        } else {
                            for (int i12 = 0; i12 < 3; i12++) {
                                parseDsiSubstreamGroup(parsableBitArray, ac4Presentation);
                            }
                        }
                    } else if (bits != 5) {
                        int bits11 = parsableBitArray.readBits(7);
                        for (int i13 = 0; i13 < bits11; i13++) {
                            parsableBitArray.skipBits(8);
                        }
                    } else if (bits2 == 0) {
                        parseDsiSubstream(parsableBitArray, ac4Presentation);
                    } else {
                        int bits12 = parsableBitArray.readBits(3);
                        for (int i14 = 0; i14 < bits12 + 2; i14++) {
                            parseDsiSubstreamGroup(parsableBitArray, ac4Presentation);
                        }
                    }
                } else if (bits2 == 0) {
                    parseDsiSubstream(parsableBitArray, ac4Presentation);
                } else {
                    parseDsiSubstreamGroup(parsableBitArray, ac4Presentation);
                }
                parsableBitArray.skipBit();
                bit2 = parsableBitArray.readBit();
            } else {
                bit2 = true;
            }
            if (bit2) {
                int bits13 = parsableBitArray.readBits(7);
                for (int i15 = 0; i15 < bits13; i15++) {
                    parsableBitArray.skipBits(15);
                }
            }
            if (bits2 > 0) {
                if (parsableBitArray.readBit() && !skipDsiBitrate(parsableBitArray)) {
                    throw ParserException.createForUnsupportedContainerFeature("Can't parse bitrate DSI.");
                }
                if (parsableBitArray.readBit()) {
                    parsableBitArray.byteAlign();
                    parsableBitArray.skipBytes(parsableBitArray.readBits(16));
                    int bits14 = parsableBitArray.readBits(5);
                    for (int i16 = 0; i16 < bits14; i16++) {
                        parsableBitArray.skipBits(3);
                        parsableBitArray.skipBits(8);
                    }
                }
            }
            parsableBitArray.byteAlign();
            if (bits4 == 1) {
                int iBitsLeft3 = ((iBitsLeft2 - parsableBitArray.bitsLeft()) / 8) - iBitsLeft;
                if (bits3 < iBitsLeft3) {
                    throw ParserException.createForUnsupportedContainerFeature("pres_bytes is smaller than presentation bytes read.");
                }
                parsableBitArray.skipBytes(bits3 - iBitsLeft3);
            }
            if (ac4Presentation.isChannelCoded && ac4Presentation.channelMode == -1) {
                throw ParserException.createForUnsupportedContainerFeature("Can't determine channel mode of presentation " + i3);
            }
            if (ac4Presentation.isChannelCoded) {
                adjustedChannelCount = ac4Presentation.numOfUmxObjects + 1;
                if (ac4Presentation.level == 4 && adjustedChannelCount == 17) {
                    adjustedChannelCount = 21;
                }
            } else {
                adjustedChannelCount = getAdjustedChannelCount(ac4Presentation.channelMode, ac4Presentation.hasBackChannels, ac4Presentation.topChannelPairs);
            }
            if (adjustedChannelCount <= 0) {
                return new Format.Builder().setId(str).setSampleMimeType("audio/ac4").setChannelCount(adjustedChannelCount).setSampleRate(i2).setDrmInitData(drmInitData).setLanguage(str2).build();
            }
            throw ParserException.createForUnsupportedContainerFeature("Can't determine channel count of presentation.");
        }
        if (ac4Presentation.isChannelCoded) {
        }
        if (adjustedChannelCount <= 0) {
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

    private static int getAdjustedChannelCount(int i2, boolean z2, int i3) {
        int channelCountFromChannelMode = getChannelCountFromChannelMode(i2);
        if (i2 != 11 && i2 != 12 && i2 != 13 && i2 != 14) {
            return channelCountFromChannelMode;
        }
        if (!z2) {
            channelCountFromChannelMode -= 2;
        }
        if (i3 != 0) {
            if (i3 != 1) {
                return channelCountFromChannelMode;
            }
            return channelCountFromChannelMode - 2;
        }
        return channelCountFromChannelMode - 4;
    }

    private static boolean skipDsiBitrate(ParsableBitArray parsableBitArray) {
        if (parsableBitArray.bitsLeft() < 66) {
            return false;
        }
        parsableBitArray.skipBits(66);
        return true;
    }
}
