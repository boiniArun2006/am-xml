package androidx.media3.extractor.mp4;

import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.browser.trusted.sharing.KcI.qUrazMnwDskFs;
import androidx.media3.common.C;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.container.MdtaMetadataEntry;
import androidx.media3.container.Mp4AlternateGroupData;
import androidx.media3.container.Mp4Box;
import androidx.media3.container.Mp4LocationData;
import androidx.media3.container.Mp4TimestampData;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.Ac3Util;
import androidx.media3.extractor.Ac4Util;
import androidx.media3.extractor.AvcConfig;
import androidx.media3.extractor.DolbyVisionConfig;
import androidx.media3.extractor.ExtractorUtil;
import androidx.media3.extractor.GaplessInfoHolder;
import androidx.media3.extractor.HevcConfig;
import androidx.media3.extractor.OpusUtil;
import androidx.media3.extractor.VorbisUtil;
import androidx.media3.extractor.mp4.FixedSampleSizeRechunker;
import com.google.common.collect.nKK;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
@UnstableApi
public final class BoxParser {
    private static final int MAX_GAPLESS_TRIM_SIZE_SAMPLES = 4;
    private static final int SAMPLE_RATE_AMR_NB = 8000;
    private static final int SAMPLE_RATE_AMR_WB = 16000;
    private static final String TAG = "BoxParsers";
    private static final int TYPE_clcp = 1668047728;
    private static final int TYPE_mdta = 1835299937;
    private static final int TYPE_meta = 1835365473;
    private static final int TYPE_nclc = 1852009571;
    private static final int TYPE_nclx = 1852009592;
    private static final int TYPE_sbtl = 1935832172;
    private static final int TYPE_soun = 1936684398;
    private static final int TYPE_subt = 1937072756;
    private static final int TYPE_text = 1952807028;
    private static final int TYPE_vide = 1986618469;
    private static final byte[] opusMagic = Util.getUtf8Bytes("OpusHead");

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    private static final class BtrtData {
        private final long avgBitrate;
        private final long maxBitrate;

        public BtrtData(long j2, long j3) {
            this.avgBitrate = j2;
            this.maxBitrate = j3;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    private static final class ChunkIterator {
        private final ParsableByteArray chunkOffsets;
        private final boolean chunkOffsetsAreLongs;
        public int index;
        public final int length;
        private int nextSamplesPerChunkChangeIndex;
        public int numSamples;
        public long offset;
        private int remainingSamplesPerChunkChanges;
        private final ParsableByteArray stsc;

        public boolean moveNext() {
            int i2 = this.index + 1;
            this.index = i2;
            if (i2 == this.length) {
                return false;
            }
            this.offset = this.chunkOffsetsAreLongs ? this.chunkOffsets.readUnsignedLongToLong() : this.chunkOffsets.readUnsignedInt();
            if (this.index == this.nextSamplesPerChunkChangeIndex) {
                this.numSamples = this.stsc.readUnsignedIntToInt();
                this.stsc.skipBytes(4);
                int i3 = this.remainingSamplesPerChunkChanges - 1;
                this.remainingSamplesPerChunkChanges = i3;
                this.nextSamplesPerChunkChangeIndex = i3 > 0 ? this.stsc.readUnsignedIntToInt() - 1 : -1;
            }
            return true;
        }

        public ChunkIterator(ParsableByteArray parsableByteArray, ParsableByteArray parsableByteArray2, boolean z2) throws ParserException {
            this.stsc = parsableByteArray;
            this.chunkOffsets = parsableByteArray2;
            this.chunkOffsetsAreLongs = z2;
            parsableByteArray2.setPosition(12);
            this.length = parsableByteArray2.readUnsignedIntToInt();
            parsableByteArray.setPosition(12);
            this.remainingSamplesPerChunkChanges = parsableByteArray.readUnsignedIntToInt();
            ExtractorUtil.checkContainerInput(parsableByteArray.readInt() == 1, "first_chunk must be 1");
            this.index = -1;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    private static final class EsdsData {
        private final long bitrate;
        private final byte[] initializationData;
        private final String mimeType;
        private final long peakBitrate;

        public EsdsData(String str, byte[] bArr, long j2, long j3) {
            this.mimeType = str;
            this.initializationData = bArr;
            this.bitrate = j2;
            this.peakBitrate = j3;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    private static final class EyesData {
        private final StriData striData;

        public EyesData(StriData striData) {
            this.striData = striData;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    private static final class MdhdData {

        @Nullable
        private final String language;
        private final long mediaDurationUs;
        private final long timescale;

        public MdhdData(long j2, long j3, @Nullable String str) {
            this.timescale = j2;
            this.mediaDurationUs = j3;
            this.language = str;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    private interface SampleSizeBox {
        int getFixedSampleSize();

        int getSampleCount();

        int readNextSampleSize();
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    private static final class StriData {
        private final boolean eyeViewsReversed;
        private final boolean hasLeftEyeView;
        private final boolean hasRightEyeView;

        public StriData(boolean z2, boolean z3, boolean z4) {
            this.hasLeftEyeView = z2;
            this.hasRightEyeView = z3;
            this.eyeViewsReversed = z4;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    static final class StszSampleSizeBox implements SampleSizeBox {
        private final ParsableByteArray data;
        private final int fixedSampleSize;
        private final int sampleCount;

        @Override // androidx.media3.extractor.mp4.BoxParser.SampleSizeBox
        public int getFixedSampleSize() {
            return this.fixedSampleSize;
        }

        @Override // androidx.media3.extractor.mp4.BoxParser.SampleSizeBox
        public int getSampleCount() {
            return this.sampleCount;
        }

        @Override // androidx.media3.extractor.mp4.BoxParser.SampleSizeBox
        public int readNextSampleSize() {
            int i2 = this.fixedSampleSize;
            return i2 == -1 ? this.data.readUnsignedIntToInt() : i2;
        }

        public StszSampleSizeBox(Mp4Box.LeafBox leafBox, Format format) {
            ParsableByteArray parsableByteArray = leafBox.data;
            this.data = parsableByteArray;
            parsableByteArray.setPosition(12);
            int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
            if ("audio/raw".equals(format.sampleMimeType)) {
                int pcmFrameSize = Util.getPcmFrameSize(format.pcmEncoding, format.channelCount);
                if (unsignedIntToInt == 0 || unsignedIntToInt % pcmFrameSize != 0) {
                    Log.w(BoxParser.TAG, "Audio sample size mismatch. stsd sample size: " + pcmFrameSize + ", stsz sample size: " + unsignedIntToInt);
                    unsignedIntToInt = pcmFrameSize;
                }
            }
            this.fixedSampleSize = unsignedIntToInt == 0 ? -1 : unsignedIntToInt;
            this.sampleCount = parsableByteArray.readUnsignedIntToInt();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    static final class Stz2SampleSizeBox implements SampleSizeBox {
        private int currentByte;
        private final ParsableByteArray data;
        private final int fieldSize;
        private final int sampleCount;
        private int sampleIndex;

        @Override // androidx.media3.extractor.mp4.BoxParser.SampleSizeBox
        public int getFixedSampleSize() {
            return -1;
        }

        @Override // androidx.media3.extractor.mp4.BoxParser.SampleSizeBox
        public int getSampleCount() {
            return this.sampleCount;
        }

        @Override // androidx.media3.extractor.mp4.BoxParser.SampleSizeBox
        public int readNextSampleSize() {
            int i2 = this.fieldSize;
            if (i2 == 8) {
                return this.data.readUnsignedByte();
            }
            if (i2 == 16) {
                return this.data.readUnsignedShort();
            }
            int i3 = this.sampleIndex;
            this.sampleIndex = i3 + 1;
            if (i3 % 2 != 0) {
                return this.currentByte & 15;
            }
            int unsignedByte = this.data.readUnsignedByte();
            this.currentByte = unsignedByte;
            return (unsignedByte & 240) >> 4;
        }

        public Stz2SampleSizeBox(Mp4Box.LeafBox leafBox) {
            ParsableByteArray parsableByteArray = leafBox.data;
            this.data = parsableByteArray;
            parsableByteArray.setPosition(12);
            this.fieldSize = parsableByteArray.readUnsignedIntToInt() & 255;
            this.sampleCount = parsableByteArray.readUnsignedIntToInt();
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    private static final class TkhdData {
        private final int alternateGroup;
        private final long duration;
        private final int id;
        private final int rotationDegrees;

        public TkhdData(int i2, long j2, int i3, int i5) {
            this.id = i2;
            this.duration = j2;
            this.alternateGroup = i3;
            this.rotationDegrees = i5;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    static final class VexuData {

        @Nullable
        private final EyesData eyesData;

        public boolean hasBothEyeViews() {
            EyesData eyesData = this.eyesData;
            return eyesData != null && eyesData.striData.hasLeftEyeView && this.eyesData.striData.hasRightEyeView;
        }

        public VexuData(EyesData eyesData) {
            this.eyesData = eyesData;
        }
    }

    private static boolean canApplyEditWithGaplessInfo(long[] jArr, long j2, long j3, long j4) {
        int length = jArr.length - 1;
        return jArr[0] <= j3 && j3 < jArr[Util.constrainValue(4, 0, length)] && jArr[Util.constrainValue(jArr.length - 4, 0, length)] < j4 && j4 <= j2;
    }

    private static int getTrackTypeForHdlr(int i2) {
        if (i2 == TYPE_soun) {
            return 1;
        }
        if (i2 == TYPE_vide) {
            return 2;
        }
        if (i2 == TYPE_text || i2 == TYPE_sbtl || i2 == TYPE_subt || i2 == TYPE_clcp) {
            return 3;
        }
        return i2 == 1835365473 ? 5 : -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static void parseAudioSampleEntry(ParsableByteArray parsableByteArray, int i2, int i3, int i5, int i7, @Nullable String str, boolean z2, @Nullable DrmInitData drmInitData, StsdData stsdData, int i8) throws ParserException {
        int unsignedShort;
        int i9;
        int i10;
        int unsignedShort2;
        int unsignedFixedPoint1616;
        int i11;
        int i12;
        String str2;
        String str3;
        int i13;
        int iIntValue = i2;
        int i14 = i5;
        DrmInitData drmInitDataCopyWithSchemeType = drmInitData;
        parsableByteArray.setPosition(i3 + 16);
        if (z2) {
            unsignedShort = parsableByteArray.readUnsignedShort();
            parsableByteArray.skipBytes(6);
        } else {
            parsableByteArray.skipBytes(8);
            unsignedShort = 0;
        }
        if (unsignedShort == 0 || unsignedShort == 1) {
            i9 = 2;
            i10 = 4;
            unsignedShort2 = parsableByteArray.readUnsignedShort();
            parsableByteArray.skipBytes(6);
            unsignedFixedPoint1616 = parsableByteArray.readUnsignedFixedPoint1616();
            parsableByteArray.setPosition(parsableByteArray.getPosition() - 4);
            i11 = parsableByteArray.readInt();
            if (unsignedShort == 1) {
                parsableByteArray.skipBytes(16);
            }
            i12 = -1;
        } else {
            if (unsignedShort != 2) {
                return;
            }
            parsableByteArray.skipBytes(16);
            i9 = 2;
            unsignedFixedPoint1616 = (int) Math.round(parsableByteArray.readDouble());
            int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
            parsableByteArray.skipBytes(4);
            int unsignedIntToInt2 = parsableByteArray.readUnsignedIntToInt();
            int unsignedIntToInt3 = parsableByteArray.readUnsignedIntToInt();
            boolean z3 = (unsignedIntToInt3 & 1) != 0;
            boolean z4 = (unsignedIntToInt3 & 2) != 0;
            i10 = 4;
            if (z3) {
                if (unsignedIntToInt2 == 32) {
                    i12 = 4;
                }
                parsableByteArray.skipBytes(8);
                unsignedShort2 = unsignedIntToInt;
                i11 = 0;
            } else {
                i12 = unsignedIntToInt2 == 8 ? 3 : unsignedIntToInt2 == 16 ? z4 ? 268435456 : 2 : unsignedIntToInt2 == 24 ? z4 ? C.ENCODING_PCM_24BIT_BIG_ENDIAN : 21 : unsignedIntToInt2 == 32 ? z4 ? C.ENCODING_PCM_32BIT_BIG_ENDIAN : 22 : -1;
                parsableByteArray.skipBytes(8);
                unsignedShort2 = unsignedIntToInt;
                i11 = 0;
            }
        }
        if (iIntValue == 1767992678) {
            unsignedFixedPoint1616 = -1;
            unsignedShort2 = -1;
        } else {
            if (iIntValue != 1935764850) {
                unsignedFixedPoint1616 = iIntValue == 1935767394 ? 16000 : 8000;
            }
            unsignedShort2 = 1;
        }
        int position = parsableByteArray.getPosition();
        if (iIntValue == 1701733217) {
            Pair<Integer, TrackEncryptionBox> sampleEntryEncryptionData = parseSampleEntryEncryptionData(parsableByteArray, i3, i14);
            if (sampleEntryEncryptionData != null) {
                iIntValue = ((Integer) sampleEntryEncryptionData.first).intValue();
                drmInitDataCopyWithSchemeType = drmInitDataCopyWithSchemeType == null ? null : drmInitDataCopyWithSchemeType.copyWithSchemeType(((TrackEncryptionBox) sampleEntryEncryptionData.second).schemeType);
                stsdData.trackEncryptionBoxes[i8] = (TrackEncryptionBox) sampleEntryEncryptionData.second;
            }
            parsableByteArray.setPosition(position);
        }
        String str4 = "audio/mhm1";
        if (iIntValue == 1633889587) {
            str2 = "audio/ac3";
        } else if (iIntValue == 1700998451) {
            str2 = "audio/eac3";
        } else if (iIntValue == 1633889588) {
            str2 = "audio/ac4";
        } else if (iIntValue == 1685353315) {
            str2 = "audio/vnd.dts";
        } else if (iIntValue == 1685353320 || iIntValue == 1685353324) {
            str2 = qUrazMnwDskFs.LLlpGzzG;
        } else if (iIntValue == 1685353317) {
            str2 = "audio/vnd.dts.hd;profile=lbr";
        } else if (iIntValue == 1685353336) {
            str2 = "audio/vnd.dts.uhd;profile=p2";
        } else if (iIntValue == 1935764850) {
            str2 = "audio/3gpp";
        } else if (iIntValue == 1935767394) {
            str2 = "audio/amr-wb";
        } else if (iIntValue != 1936684916) {
            if (iIntValue == 1953984371) {
                str2 = "audio/raw";
                i12 = 268435456;
            } else if (iIntValue != 1819304813) {
                str2 = (iIntValue == 778924082 || iIntValue == 778924083) ? "audio/mpeg" : iIntValue == 1835557169 ? "audio/mha1" : iIntValue == 1835560241 ? "audio/mhm1" : iIntValue == 1634492771 ? "audio/alac" : iIntValue == 1634492791 ? "audio/g711-alaw" : iIntValue == 1970037111 ? "audio/g711-mlaw" : iIntValue == 1332770163 ? "audio/opus" : iIntValue == 1716281667 ? "audio/flac" : iIntValue == 1835823201 ? "audio/true-hd" : iIntValue == 1767992678 ? MimeTypes.AUDIO_IAMF : null;
            } else if (i12 == -1) {
                str2 = "audio/raw";
                i12 = i9;
            } else {
                str2 = "audio/raw";
            }
        }
        String str5 = null;
        List<byte[]> listO = null;
        EsdsData esdsFromParent = null;
        BtrtData btrtFromParent = null;
        while (position - i3 < i14) {
            parsableByteArray.setPosition(position);
            int i15 = parsableByteArray.readInt();
            int i16 = i12;
            ExtractorUtil.checkContainerInput(i15 > 0, "childAtomSize must be positive");
            int i17 = parsableByteArray.readInt();
            if (i17 == 1835557187) {
                parsableByteArray.setPosition(position + 8);
                parsableByteArray.skipBytes(1);
                int unsignedByte = parsableByteArray.readUnsignedByte();
                parsableByteArray.skipBytes(1);
                String str6 = Objects.equals(str2, str4) ? String.format("mhm1.%02X", Integer.valueOf(unsignedByte)) : String.format("mha1.%02X", Integer.valueOf(unsignedByte));
                int unsignedShort3 = parsableByteArray.readUnsignedShort();
                byte[] bArr = new byte[unsignedShort3];
                parsableByteArray.readBytes(bArr, 0, unsignedShort3);
                listO = listO == null ? nKK.o(bArr) : nKK.XQ(bArr, listO.get(0));
                str5 = str6;
            } else {
                if (i17 == 1835557200) {
                    parsableByteArray.setPosition(position + 8);
                    int unsignedByte2 = parsableByteArray.readUnsignedByte();
                    if (unsignedByte2 > 0) {
                        byte[] bArr2 = new byte[unsignedByte2];
                        str3 = str4;
                        parsableByteArray.readBytes(bArr2, 0, unsignedByte2);
                        listO = listO == null ? nKK.o(bArr2) : nKK.XQ(listO.get(0), bArr2);
                    }
                } else {
                    str3 = str4;
                    if (i17 == 1702061171 || (z2 && i17 == 2002876005)) {
                        i13 = i10;
                        int iFindBoxPosition = i17 == 1702061171 ? position : findBoxPosition(parsableByteArray, Mp4Box.TYPE_esds, position, i15);
                        if (iFindBoxPosition != -1) {
                            esdsFromParent = parseEsdsFromParent(parsableByteArray, iFindBoxPosition);
                            str2 = esdsFromParent.mimeType;
                            byte[] bArr3 = esdsFromParent.initializationData;
                            if (bArr3 != null) {
                                if ("audio/vorbis".equals(str2)) {
                                    listO = VorbisUtil.parseVorbisCsdFromEsdsInitializationData(bArr3);
                                } else {
                                    if ("audio/mp4a-latm".equals(str2)) {
                                        AacUtil.Config audioSpecificConfig = AacUtil.parseAudioSpecificConfig(bArr3);
                                        int i18 = audioSpecificConfig.sampleRateHz;
                                        int i19 = audioSpecificConfig.channelCount;
                                        str5 = audioSpecificConfig.codecs;
                                        unsignedFixedPoint1616 = i18;
                                        unsignedShort2 = i19;
                                    }
                                    listO = nKK.o(bArr3);
                                }
                            }
                        }
                    } else if (i17 == 1651798644) {
                        btrtFromParent = parseBtrtFromParent(parsableByteArray, position);
                    } else {
                        if (i17 == 1684103987) {
                            parsableByteArray.setPosition(position + 8);
                            stsdData.format = Ac3Util.parseAc3AnnexFFormat(parsableByteArray, Integer.toString(i7), str, drmInitDataCopyWithSchemeType);
                        } else if (i17 == 1684366131) {
                            parsableByteArray.setPosition(position + 8);
                            stsdData.format = Ac3Util.parseEAc3AnnexFFormat(parsableByteArray, Integer.toString(i7), str, drmInitDataCopyWithSchemeType);
                        } else if (i17 == 1684103988) {
                            parsableByteArray.setPosition(position + 8);
                            stsdData.format = Ac4Util.parseAc4AnnexEFormat(parsableByteArray, Integer.toString(i7), str, drmInitDataCopyWithSchemeType);
                        } else if (i17 == 1684892784) {
                            if (i11 <= 0) {
                                throw ParserException.createForMalformedContainer("Invalid sample rate for Dolby TrueHD MLP stream: " + i11, null);
                            }
                            unsignedFixedPoint1616 = i11;
                            i13 = i10;
                            unsignedShort2 = i9;
                        } else if (i17 == 1684305011 || i17 == 1969517683) {
                            i13 = i10;
                            stsdData.format = new Format.Builder().setId(i7).setSampleMimeType(str2).setChannelCount(unsignedShort2).setSampleRate(unsignedFixedPoint1616).setDrmInitData(drmInitDataCopyWithSchemeType).setLanguage(str).build();
                        } else if (i17 == 1682927731) {
                            int i20 = i15 - 8;
                            byte[] bArr4 = opusMagic;
                            byte[] bArrCopyOf = Arrays.copyOf(bArr4, bArr4.length + i20);
                            parsableByteArray.setPosition(position + 8);
                            parsableByteArray.readBytes(bArrCopyOf, bArr4.length, i20);
                            listO = OpusUtil.buildInitializationData(bArrCopyOf);
                        } else if (i17 == 1684425825) {
                            byte[] bArr5 = new byte[i15 - 8];
                            bArr5[0] = 102;
                            bArr5[1] = 76;
                            bArr5[i9] = 97;
                            bArr5[3] = 67;
                            parsableByteArray.setPosition(position + 12);
                            i13 = i10;
                            parsableByteArray.readBytes(bArr5, i13, i15 - 12);
                            listO = nKK.o(bArr5);
                        } else {
                            i13 = i10;
                            if (i17 == 1634492771) {
                                int i21 = i15 - 12;
                                byte[] bArr6 = new byte[i21];
                                parsableByteArray.setPosition(position + 12);
                                parsableByteArray.readBytes(bArr6, 0, i21);
                                Pair<Integer, Integer> alacAudioSpecificConfig = CodecSpecificDataUtil.parseAlacAudioSpecificConfig(bArr6);
                                int iIntValue2 = ((Integer) alacAudioSpecificConfig.first).intValue();
                                int iIntValue3 = ((Integer) alacAudioSpecificConfig.second).intValue();
                                listO = nKK.o(bArr6);
                                unsignedFixedPoint1616 = iIntValue2;
                                unsignedShort2 = iIntValue3;
                            } else if (i17 == 1767990114) {
                                parsableByteArray.setPosition(position + 9);
                                int unsignedLeb128ToInt = parsableByteArray.readUnsignedLeb128ToInt();
                                byte[] bArr7 = new byte[unsignedLeb128ToInt];
                                parsableByteArray.readBytes(bArr7, 0, unsignedLeb128ToInt);
                                listO = nKK.o(bArr7);
                            }
                        }
                        i13 = i10;
                    }
                    position += i15;
                    i14 = i5;
                    i10 = i13;
                    i12 = i16;
                    str4 = str3;
                }
                i13 = i10;
                position += i15;
                i14 = i5;
                i10 = i13;
                i12 = i16;
                str4 = str3;
            }
            str3 = str4;
            i13 = i10;
            position += i15;
            i14 = i5;
            i10 = i13;
            i12 = i16;
            str4 = str3;
        }
        int i22 = i12;
        if (stsdData.format != null || str2 == null) {
            return;
        }
        Format.Builder language = new Format.Builder().setId(i7).setSampleMimeType(str2).setCodecs(str5).setChannelCount(unsignedShort2).setSampleRate(unsignedFixedPoint1616).setPcmEncoding(i22).setInitializationData(listO).setDrmInitData(drmInitDataCopyWithSchemeType).setLanguage(str);
        if (esdsFromParent != null) {
            language.setAverageBitrate(com.google.common.primitives.Wre.qie(esdsFromParent.bitrate)).setPeakBitrate(com.google.common.primitives.Wre.qie(esdsFromParent.peakBitrate));
        } else if (btrtFromParent != null) {
            language.setAverageBitrate(com.google.common.primitives.Wre.qie(btrtFromParent.avgBitrate)).setPeakBitrate(com.google.common.primitives.Wre.qie(btrtFromParent.maxBitrate));
        }
        stsdData.format = language.build();
    }

    public static int parseFullBoxFlags(int i2) {
        return i2 & 16777215;
    }

    public static int parseFullBoxVersion(int i2) {
        return (i2 >> 24) & 255;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02b2  */
    /* JADX WARN: Type inference failed for: r0v101 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v44 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r15v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r22v10, types: [int[]] */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r23v2, types: [int] */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v53 */
    /* JADX WARN: Type inference failed for: r8v12, types: [int] */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static TrackSampleTable parseStbl(Track track, Mp4Box.ContainerBox containerBox, GaplessInfoHolder gaplessInfoHolder) throws ParserException {
        SampleSizeBox stz2SampleSizeBox;
        boolean z2;
        int unsignedIntToInt;
        int unsignedIntToInt2;
        int unsignedIntToInt3;
        boolean z3;
        int i2;
        int i3;
        int i5;
        int[] iArr;
        int i7;
        boolean z4;
        long[] jArr;
        int[] iArr2;
        long j2;
        long j3;
        int i8;
        long[] jArr2;
        int[] iArr3;
        int[] iArr4;
        int i9;
        int[] iArr5;
        boolean z5;
        boolean z6;
        int i10;
        Track trackCopyWithFormat = track;
        Mp4Box.LeafBox leafBoxOfType = containerBox.getLeafBoxOfType(Mp4Box.TYPE_stsz);
        if (leafBoxOfType != null) {
            stz2SampleSizeBox = new StszSampleSizeBox(leafBoxOfType, trackCopyWithFormat.format);
        } else {
            Mp4Box.LeafBox leafBoxOfType2 = containerBox.getLeafBoxOfType(Mp4Box.TYPE_stz2);
            if (leafBoxOfType2 == null) {
                throw ParserException.createForMalformedContainer("Track has no sample table size information", null);
            }
            stz2SampleSizeBox = new Stz2SampleSizeBox(leafBoxOfType2);
        }
        int sampleCount = stz2SampleSizeBox.getSampleCount();
        if (sampleCount == 0) {
            return new TrackSampleTable(trackCopyWithFormat, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        if (trackCopyWithFormat.type == 2) {
            long j4 = trackCopyWithFormat.mediaDurationUs;
            if (j4 > 0) {
                trackCopyWithFormat = trackCopyWithFormat.copyWithFormat(trackCopyWithFormat.format.buildUpon().setFrameRate(sampleCount / (j4 / 1000000.0f)).build());
            }
        }
        Mp4Box.LeafBox leafBoxOfType3 = containerBox.getLeafBoxOfType(Mp4Box.TYPE_stco);
        if (leafBoxOfType3 == null) {
            leafBoxOfType3 = (Mp4Box.LeafBox) Assertions.checkNotNull(containerBox.getLeafBoxOfType(Mp4Box.TYPE_co64));
            z2 = true;
        } else {
            z2 = false;
        }
        ParsableByteArray parsableByteArray = leafBoxOfType3.data;
        ParsableByteArray parsableByteArray2 = ((Mp4Box.LeafBox) Assertions.checkNotNull(containerBox.getLeafBoxOfType(Mp4Box.TYPE_stsc))).data;
        ParsableByteArray parsableByteArray3 = ((Mp4Box.LeafBox) Assertions.checkNotNull(containerBox.getLeafBoxOfType(Mp4Box.TYPE_stts))).data;
        Mp4Box.LeafBox leafBoxOfType4 = containerBox.getLeafBoxOfType(Mp4Box.TYPE_stss);
        ParsableByteArray parsableByteArray4 = leafBoxOfType4 != null ? leafBoxOfType4.data : null;
        Mp4Box.LeafBox leafBoxOfType5 = containerBox.getLeafBoxOfType(Mp4Box.TYPE_ctts);
        ParsableByteArray parsableByteArray5 = leafBoxOfType5 != null ? leafBoxOfType5.data : null;
        ChunkIterator chunkIterator = new ChunkIterator(parsableByteArray2, parsableByteArray, z2);
        parsableByteArray3.setPosition(12);
        int unsignedIntToInt4 = parsableByteArray3.readUnsignedIntToInt() - 1;
        int unsignedIntToInt5 = parsableByteArray3.readUnsignedIntToInt();
        int unsignedIntToInt6 = parsableByteArray3.readUnsignedIntToInt();
        if (parsableByteArray5 != null) {
            parsableByteArray5.setPosition(12);
            unsignedIntToInt = parsableByteArray5.readUnsignedIntToInt();
        } else {
            unsignedIntToInt = 0;
        }
        if (parsableByteArray4 != null) {
            parsableByteArray4.setPosition(12);
            unsignedIntToInt3 = parsableByteArray4.readUnsignedIntToInt();
            if (unsignedIntToInt3 > 0) {
                unsignedIntToInt2 = parsableByteArray4.readUnsignedIntToInt() - 1;
                z3 = false;
            } else {
                unsignedIntToInt2 = -1;
                z3 = false;
                parsableByteArray4 = null;
            }
        } else {
            unsignedIntToInt2 = -1;
            unsignedIntToInt3 = 0;
            z3 = false;
        }
        int fixedSampleSize = stz2SampleSizeBox.getFixedSampleSize();
        String str = trackCopyWithFormat.format.sampleMimeType;
        if ((fixedSampleSize == -1 || !(("audio/raw".equals(str) || "audio/g711-mlaw".equals(str) || "audio/g711-alaw".equals(str)) && unsignedIntToInt4 == 0 && unsignedIntToInt == 0 && unsignedIntToInt3 == 0)) ? z3 ? 1 : 0 : true) {
            int i11 = chunkIterator.length;
            long[] jArr3 = new long[i11];
            int[] iArr6 = new int[i11];
            while (chunkIterator.moveNext()) {
                int i12 = chunkIterator.index;
                jArr3[i12] = chunkIterator.offset;
                iArr6[i12] = chunkIterator.numSamples;
            }
            FixedSampleSizeRechunker.Results resultsRechunk = FixedSampleSizeRechunker.rechunk(fixedSampleSize, jArr3, iArr6, unsignedIntToInt6);
            long[] jArr4 = resultsRechunk.offsets;
            int[] iArr7 = resultsRechunk.sizes;
            int i13 = resultsRechunk.maximumSize;
            long[] jArr5 = resultsRechunk.timestamps;
            int[] iArr8 = resultsRechunk.flags;
            long j5 = resultsRechunk.duration;
            j3 = resultsRechunk.totalSize;
            j2 = j5;
            i2 = 1;
            jArr = jArr5;
            iArr2 = iArr8;
            i8 = i13;
            iArr3 = iArr7;
            jArr2 = jArr4;
        } else {
            long[] jArr6 = new long[sampleCount];
            int[] iArr9 = new int[sampleCount];
            long[] jArrCopyOf = new long[sampleCount];
            i2 = 1;
            int[] iArrCopyOf = new int[sampleCount];
            ParsableByteArray parsableByteArray6 = parsableByteArray5;
            SampleSizeBox sampleSizeBox = stz2SampleSizeBox;
            int i14 = unsignedIntToInt6;
            ParsableByteArray parsableByteArray7 = parsableByteArray4;
            long j6 = 0;
            long j7 = 0;
            int i15 = unsignedIntToInt;
            int unsignedIntToInt7 = unsignedIntToInt2;
            int i16 = z3 ? 1 : 0;
            int i17 = i16;
            int i18 = i17 == true ? 1 : 0;
            int i19 = i18;
            int unsignedIntToInt8 = unsignedIntToInt5;
            long j9 = 0;
            int i20 = unsignedIntToInt4;
            int i21 = unsignedIntToInt3;
            int i22 = i19 == true ? 1 : 0;
            while (true) {
                if (i16 >= sampleCount) {
                    boolean z7 = sampleCount == true ? 1 : 0;
                    i3 = i20;
                    i5 = unsignedIntToInt8;
                    iArr = iArr9;
                    i7 = i18;
                    break;
                }
                long j10 = j7;
                int i23 = i18;
                boolean zMoveNext = true;
                while (i23 == 0) {
                    zMoveNext = chunkIterator.moveNext();
                    if (!zMoveNext) {
                        break;
                    }
                    int i24 = i20;
                    long j11 = chunkIterator.offset;
                    i23 = chunkIterator.numSamples;
                    j10 = j11;
                    i20 = i24;
                    unsignedIntToInt8 = unsignedIntToInt8;
                    sampleCount = sampleCount == true ? 1 : 0;
                }
                int i25 = sampleCount;
                i3 = i20;
                i5 = unsignedIntToInt8;
                if (!zMoveNext) {
                    Log.w(TAG, "Unexpected end of chunk data");
                    long[] jArrCopyOf2 = Arrays.copyOf(jArr6, i16);
                    int[] iArrCopyOf2 = Arrays.copyOf(iArr9, i16);
                    jArrCopyOf = Arrays.copyOf(jArrCopyOf, i16);
                    iArrCopyOf = Arrays.copyOf(iArrCopyOf, i16);
                    jArr6 = jArrCopyOf2;
                    iArr = iArrCopyOf2;
                    sampleCount = i16;
                    i7 = i23;
                    break;
                }
                if (parsableByteArray6 != null) {
                    int unsignedIntToInt9 = i19 == true ? 1 : 0;
                    while (unsignedIntToInt9 == 0 && i15 > 0) {
                        unsignedIntToInt9 = parsableByteArray6.readUnsignedIntToInt();
                        i17 = parsableByteArray6.readInt();
                        i15--;
                    }
                    i19 = unsignedIntToInt9 - 1;
                }
                jArr6[i16] = j10;
                int nextSampleSize = sampleSizeBox.readNextSampleSize();
                iArr9[i16] = nextSampleSize;
                j9 += (long) nextSampleSize;
                if (nextSampleSize > i22) {
                    i22 = nextSampleSize;
                }
                jArrCopyOf[i16] = j6 + ((long) i17);
                iArrCopyOf[i16] = parsableByteArray7 == null ? 1 : z3 ? 1 : 0;
                if (i16 == unsignedIntToInt7) {
                    iArrCopyOf[i16] = 1;
                    i21--;
                    if (i21 > 0) {
                        unsignedIntToInt7 = ((ParsableByteArray) Assertions.checkNotNull(parsableByteArray7)).readUnsignedIntToInt() - 1;
                    }
                }
                j6 += (long) i14;
                unsignedIntToInt8 = i5 - 1;
                if (unsignedIntToInt8 != 0 || i3 <= 0) {
                    i20 = i3;
                } else {
                    i20 = i3 - 1;
                    unsignedIntToInt8 = parsableByteArray3.readUnsignedIntToInt();
                    i14 = parsableByteArray3.readInt();
                }
                long j12 = j10 + ((long) iArr9[i16]);
                i18 = i23 - 1;
                i16++;
                j7 = j12;
                sampleCount = i25 == true ? 1 : 0;
            }
            long j13 = j6 + ((long) i17);
            if (parsableByteArray6 != null) {
                while (i15 > 0) {
                    if (parsableByteArray6.readUnsignedIntToInt() != 0) {
                        z4 = z3 ? 1 : 0;
                        break;
                    }
                    parsableByteArray6.readInt();
                    i15--;
                }
                z4 = true;
                if (i21 == 0 || i5 != 0 || i7 != 0 || i3 != 0 || i19 != 0 || !z4) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Inconsistent stbl box for track ");
                    sb.append(trackCopyWithFormat.id);
                    sb.append(": remainingSynchronizationSamples ");
                    sb.append(i21);
                    sb.append(", remainingSamplesAtTimestampDelta ");
                    sb.append(i5);
                    sb.append(", remainingSamplesInChunk ");
                    sb.append(i7);
                    sb.append(", remainingTimestampDeltaChanges ");
                    sb.append(i3);
                    sb.append(", remainingSamplesAtTimestampOffset ");
                    sb.append(i19 == true ? 1 : 0 ? 1 : 0);
                    sb.append(z4 ? ", ctts invalid" : "");
                    Log.w(TAG, sb.toString());
                }
                jArr = jArrCopyOf;
                iArr2 = iArrCopyOf;
                j2 = j13;
                j3 = j9;
                i8 = i22 == true ? 1 : 0;
                jArr2 = jArr6;
                iArr3 = iArr;
            } else {
                z4 = true;
                if (i21 == 0) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Inconsistent stbl box for track ");
                    sb2.append(trackCopyWithFormat.id);
                    sb2.append(": remainingSynchronizationSamples ");
                    sb2.append(i21);
                    sb2.append(", remainingSamplesAtTimestampDelta ");
                    sb2.append(i5);
                    sb2.append(", remainingSamplesInChunk ");
                    sb2.append(i7);
                    sb2.append(", remainingTimestampDeltaChanges ");
                    sb2.append(i3);
                    sb2.append(", remainingSamplesAtTimestampOffset ");
                    sb2.append(i19 == true ? 1 : 0 ? 1 : 0);
                    sb2.append(z4 ? ", ctts invalid" : "");
                    Log.w(TAG, sb2.toString());
                    jArr = jArrCopyOf;
                    iArr2 = iArrCopyOf;
                    j2 = j13;
                    j3 = j9;
                    i8 = i22 == true ? 1 : 0;
                    jArr2 = jArr6;
                    iArr3 = iArr;
                }
            }
        }
        long j14 = trackCopyWithFormat.mediaDurationUs;
        if (j14 > 0) {
            long jScaleLargeValue = Util.scaleLargeValue(j3 * 8, 1000000L, j14, RoundingMode.HALF_DOWN);
            if (jScaleLargeValue > 0 && jScaleLargeValue < 2147483647L) {
                trackCopyWithFormat = trackCopyWithFormat.copyWithFormat(trackCopyWithFormat.format.buildUpon().setAverageBitrate((int) jScaleLargeValue).build());
            }
        }
        Track trackCopyWithFormat2 = trackCopyWithFormat;
        long jScaleLargeTimestamp = Util.scaleLargeTimestamp(j2, 1000000L, trackCopyWithFormat2.timescale);
        long[] jArr7 = trackCopyWithFormat2.editListDurations;
        if (jArr7 == null) {
            Util.scaleLargeTimestampsInPlace(jArr, 1000000L, trackCopyWithFormat2.timescale);
            return new TrackSampleTable(trackCopyWithFormat2, jArr2, iArr3, i8, jArr, iArr2, jScaleLargeTimestamp);
        }
        int i26 = i8;
        int[] iArr10 = iArr2;
        int i27 = i2;
        if (jArr7.length == i27 && trackCopyWithFormat2.type == i27 && jArr.length >= 2) {
            long j15 = ((long[]) Assertions.checkNotNull(trackCopyWithFormat2.editListMediaTimes))[z3 ? 1 : 0];
            long jScaleLargeTimestamp2 = j15 + Util.scaleLargeTimestamp(trackCopyWithFormat2.editListDurations[z3 ? 1 : 0], trackCopyWithFormat2.timescale, trackCopyWithFormat2.movieTimescale);
            if (canApplyEditWithGaplessInfo(jArr, j2, j15, jScaleLargeTimestamp2)) {
                long jScaleLargeTimestamp3 = Util.scaleLargeTimestamp(j15 - jArr[z3 ? 1 : 0], trackCopyWithFormat2.format.sampleRate, trackCopyWithFormat2.timescale);
                long jScaleLargeTimestamp4 = Util.scaleLargeTimestamp(j2 - jScaleLargeTimestamp2, trackCopyWithFormat2.format.sampleRate, trackCopyWithFormat2.timescale);
                if ((jScaleLargeTimestamp3 != 0 || jScaleLargeTimestamp4 != 0) && jScaleLargeTimestamp3 <= 2147483647L && jScaleLargeTimestamp4 <= 2147483647L) {
                    gaplessInfoHolder.encoderDelay = (int) jScaleLargeTimestamp3;
                    gaplessInfoHolder.encoderPadding = (int) jScaleLargeTimestamp4;
                    Util.scaleLargeTimestampsInPlace(jArr, 1000000L, trackCopyWithFormat2.timescale);
                    return new TrackSampleTable(trackCopyWithFormat2, jArr2, iArr3, i26 == true ? 1 : 0, jArr, iArr10, Util.scaleLargeTimestamp(trackCopyWithFormat2.editListDurations[z3 ? 1 : 0], 1000000L, trackCopyWithFormat2.movieTimescale));
                }
            }
        }
        boolean z9 = i26 == true ? 1 : 0;
        long[] jArr8 = trackCopyWithFormat2.editListDurations;
        if (jArr8.length == 1 && jArr8[z3 ? 1 : 0] == 0) {
            long j16 = ((long[]) Assertions.checkNotNull(trackCopyWithFormat2.editListMediaTimes))[z3 ? 1 : 0];
            for (int i28 = z3 ? 1 : 0; i28 < jArr.length; i28++) {
                jArr[i28] = Util.scaleLargeTimestamp(jArr[i28] - j16, 1000000L, trackCopyWithFormat2.timescale);
            }
            return new TrackSampleTable(trackCopyWithFormat2, jArr2, iArr3, z9 ? 1 : 0, jArr, iArr10, Util.scaleLargeTimestamp(j2 - j16, 1000000L, trackCopyWithFormat2.timescale));
        }
        boolean z10 = trackCopyWithFormat2.type == 1 ? true : z3 ? 1 : 0;
        int[] iArr11 = new int[jArr8.length];
        int[] iArr12 = new int[jArr8.length];
        long[] jArr9 = (long[]) Assertions.checkNotNull(trackCopyWithFormat2.editListMediaTimes);
        int i29 = z3 ? 1 : 0;
        int i30 = i29;
        int i31 = i30 == true ? 1 : 0;
        int i32 = i31;
        boolean z11 = z9;
        while (true) {
            long[] jArr10 = trackCopyWithFormat2.editListDurations;
            iArr4 = iArr12;
            if (i29 >= jArr10.length) {
                break;
            }
            int i33 = i29;
            int i34 = i30;
            long j17 = jArr9[i33 == true ? 1 : 0];
            if (j17 != -1) {
                long j18 = jArr10[i33 == true ? 1 : 0];
                iArr5 = iArr3;
                z5 = z11;
                long jScaleLargeTimestamp5 = Util.scaleLargeTimestamp(j18, trackCopyWithFormat2.timescale, trackCopyWithFormat2.movieTimescale);
                i9 = i33 == true ? 1 : 0;
                iArr11[i9 == true ? 1 : 0] = Util.binarySearchFloor(jArr, j17, true, true);
                long j19 = j17 + jScaleLargeTimestamp5;
                z6 = z3;
                iArr4[i9 == true ? 1 : 0] = Util.binarySearchCeil(jArr, j19, z10, z6);
                int i35 = iArr11[i9 == true ? 1 : 0];
                while (true) {
                    i10 = iArr11[i9 == true ? 1 : 0];
                    if (i10 < 0 || (iArr10[i10] & 1) != 0) {
                        break;
                    }
                    iArr11[i9 == true ? 1 : 0] = i10 - 1;
                }
                if (i10 < 0) {
                    iArr11[i9 == true ? 1 : 0] = i35;
                    while (true) {
                        int i36 = iArr11[i9 == true ? 1 : 0];
                        if (i36 >= iArr4[i9 == true ? 1 : 0] || (iArr10[i36] & 1) != 0) {
                            break;
                        }
                        iArr11[i9 == true ? 1 : 0] = i36 + 1;
                    }
                }
                if (trackCopyWithFormat2.type == 2 && iArr11[i9 == true ? 1 : 0] != iArr4[i9 == true ? 1 : 0]) {
                    while (true) {
                        int i37 = iArr4[i9 == true ? 1 : 0];
                        if (i37 >= jArr.length - 1 || jArr[i37 + 1] > j19) {
                            break;
                        }
                        iArr4[i9 == true ? 1 : 0] = i37 + 1;
                    }
                }
                int i38 = iArr4[i9 == true ? 1 : 0];
                int i39 = iArr11[i9 == true ? 1 : 0];
                i31 += i38 - i39;
                i30 = (i34 == true ? 1 : 0) | (i32 != i39 ? 1 : z6 ? 1 : 0);
                i32 = i38;
            } else {
                i9 = i33 == true ? 1 : 0;
                iArr5 = iArr3;
                z5 = z11;
                z6 = z3;
                i30 = i34 == true ? 1 : 0;
            }
            i29 = i9 + 1;
            z3 = z6;
            iArr3 = iArr5;
            iArr12 = iArr4;
            z11 = z5;
        }
        ?? r15 = iArr3;
        boolean z12 = z11;
        boolean z13 = z3;
        boolean z14 = (i30 == true ? 1 : 0) | (i31 != sampleCount ? true : z13);
        long[] jArr11 = z14 != 0 ? new long[i31] : jArr2;
        ?? r7 = z14 != 0 ? new int[i31] : r15;
        boolean z15 = z14 != 0 ? z13 : z12 ? 1 : 0;
        int[] iArr13 = z14 != 0 ? new int[i31] : iArr10;
        long[] jArr12 = new long[i31];
        ?? r23 = z15;
        boolean z16 = z13;
        int i40 = z16 ? 1 : 0;
        long j20 = 0;
        boolean z17 = z14;
        boolean z18 = z16;
        for (?? r8 = z13; r8 < trackCopyWithFormat2.editListDurations.length; r8++) {
            long j21 = trackCopyWithFormat2.editListMediaTimes[r8];
            int i41 = iArr11[r8];
            int i42 = iArr4[r8];
            boolean z19 = z17;
            if (z17 != 0) {
                int i43 = i42 - i41;
                System.arraycopy(jArr2, i41, jArr11, i40, i43);
                System.arraycopy(r15, i41, r7, i40, i43);
                System.arraycopy(iArr10, i41, iArr13, i40, i43);
            }
            ?? r02 = r23;
            boolean z20 = z18;
            while (i41 < i42) {
                long[] jArr13 = jArr11;
                int[] iArr14 = iArr11;
                long jScaleLargeTimestamp6 = Util.scaleLargeTimestamp(j20, 1000000L, trackCopyWithFormat2.movieTimescale);
                long jScaleLargeTimestamp7 = Util.scaleLargeTimestamp(jArr[i41] - j21, 1000000L, trackCopyWithFormat2.timescale);
                boolean z21 = z20;
                if (jScaleLargeTimestamp7 < 0) {
                    z21 = true;
                }
                jArr12[i40] = jScaleLargeTimestamp6 + jScaleLargeTimestamp7;
                if (z19 != 0 && r7[i40] > r02) {
                    r02 = r15[i41];
                }
                i40++;
                i41++;
                iArr11 = iArr14;
                jArr11 = jArr13;
                r02 = r02;
                z20 = z21;
            }
            j20 += trackCopyWithFormat2.editListDurations[r8];
            r23 = r02;
            jArr11 = jArr11;
            z17 = z19;
            z18 = z20;
        }
        long[] jArr14 = jArr11;
        long jScaleLargeTimestamp8 = Util.scaleLargeTimestamp(j20, 1000000L, trackCopyWithFormat2.movieTimescale);
        if (z18) {
            trackCopyWithFormat2 = trackCopyWithFormat2.copyWithFormat(trackCopyWithFormat2.format.buildUpon().setHasPrerollSamples(true).build());
        }
        return new TrackSampleTable(trackCopyWithFormat2, jArr14, r7, r23, jArr12, iArr13, jScaleLargeTimestamp8);
    }

    private static void parseVideoSampleEntry(ParsableByteArray parsableByteArray, int i2, int i3, int i5, int i7, @Nullable String str, int i8, @Nullable DrmInitData drmInitData, StsdData stsdData, int i9) throws ParserException {
        int i10;
        String str2;
        int i11;
        DrmInitData drmInitData2;
        List<byte[]> list;
        int i12;
        int i13;
        int i14;
        int i15;
        int iIsoColorPrimariesToColorSpace;
        int iIsoTransferCharacteristicsToColorTransfer;
        NalUnitUtil.H265VpsData h265VpsData;
        int i16;
        int i17;
        int i18;
        int i19 = i3;
        int i20 = i5;
        DrmInitData drmInitDataCopyWithSchemeType = drmInitData;
        StsdData stsdData2 = stsdData;
        parsableByteArray.setPosition(i19 + 16);
        parsableByteArray.skipBytes(16);
        int unsignedShort = parsableByteArray.readUnsignedShort();
        int unsignedShort2 = parsableByteArray.readUnsignedShort();
        parsableByteArray.skipBytes(50);
        int position = parsableByteArray.getPosition();
        int iIntValue = i2;
        if (iIntValue == 1701733238) {
            Pair<Integer, TrackEncryptionBox> sampleEntryEncryptionData = parseSampleEntryEncryptionData(parsableByteArray, i19, i20);
            if (sampleEntryEncryptionData != null) {
                iIntValue = ((Integer) sampleEntryEncryptionData.first).intValue();
                drmInitDataCopyWithSchemeType = drmInitDataCopyWithSchemeType == null ? null : drmInitDataCopyWithSchemeType.copyWithSchemeType(((TrackEncryptionBox) sampleEntryEncryptionData.second).schemeType);
                stsdData2.trackEncryptionBoxes[i9] = (TrackEncryptionBox) sampleEntryEncryptionData.second;
            }
            parsableByteArray.setPosition(position);
        }
        String str3 = "video/3gpp";
        String str4 = iIntValue == 1831958048 ? "video/mpeg" : iIntValue == 1211250227 ? "video/3gpp" : null;
        float paspFromParent = 1.0f;
        int i21 = 8;
        int i22 = 8;
        List<byte[]> listO = null;
        String str5 = null;
        byte[] projFromParent = null;
        int i23 = -1;
        int i24 = -1;
        int i25 = -1;
        int iIsoColorPrimariesToColorSpace2 = -1;
        int i26 = -1;
        int iIsoTransferCharacteristicsToColorTransfer2 = -1;
        ByteBuffer byteBufferAllocateHdrStaticInfo = null;
        BtrtData btrtFromParent = null;
        EsdsData esdsFromParent = null;
        NalUnitUtil.H265VpsData h265VpsData2 = null;
        boolean z2 = false;
        while (position - i19 < i20) {
            parsableByteArray.setPosition(position);
            int position2 = parsableByteArray.getPosition();
            int i27 = parsableByteArray.readInt();
            if (i27 == 0 && parsableByteArray.getPosition() - i3 == i20) {
                break;
            }
            ExtractorUtil.checkContainerInput(i27 > 0, "childAtomSize must be positive");
            int i28 = parsableByteArray.readInt();
            if (i28 == 1635148611) {
                ExtractorUtil.checkContainerInput(str4 == null, null);
                parsableByteArray.setPosition(position2 + 8);
                AvcConfig avcConfig = AvcConfig.parse(parsableByteArray);
                List<byte[]> list2 = avcConfig.initializationData;
                stsdData2.nalUnitLengthFieldLength = avcConfig.nalUnitLengthFieldLength;
                if (!z2) {
                    paspFromParent = avcConfig.pixelWidthHeightRatio;
                }
                String str6 = avcConfig.codecs;
                int i29 = avcConfig.maxNumReorderFrames;
                int i30 = avcConfig.colorSpace;
                int i31 = avcConfig.colorRange;
                listO = list2;
                int i32 = avcConfig.colorTransfer;
                int i33 = avcConfig.bitdepthLuma;
                i10 = position;
                i12 = iIntValue;
                str2 = str3;
                iIsoColorPrimariesToColorSpace2 = i30;
                i11 = i31;
                iIsoTransferCharacteristicsToColorTransfer2 = i32;
                i22 = avcConfig.bitdepthChroma;
                i21 = i33;
                str5 = str6;
                str4 = "video/avc";
                h265VpsData = h265VpsData2;
                drmInitData2 = drmInitDataCopyWithSchemeType;
                i24 = i29;
            } else {
                i10 = position;
                if (i28 == 1752589123) {
                    ExtractorUtil.checkContainerInput(str4 == null, null);
                    parsableByteArray.setPosition(position2 + 8);
                    HevcConfig hevcConfig = HevcConfig.parse(parsableByteArray);
                    List<byte[]> list3 = hevcConfig.initializationData;
                    stsdData2.nalUnitLengthFieldLength = hevcConfig.nalUnitLengthFieldLength;
                    if (!z2) {
                        paspFromParent = hevcConfig.pixelWidthHeightRatio;
                    }
                    int i34 = hevcConfig.maxNumReorderPics;
                    int i35 = hevcConfig.maxSubLayers;
                    String str7 = hevcConfig.codecs;
                    int i36 = hevcConfig.stereoMode;
                    listO = list3;
                    if (i36 != -1) {
                        i23 = i36;
                    }
                    int i37 = hevcConfig.colorSpace;
                    int i38 = hevcConfig.colorRange;
                    int i39 = hevcConfig.colorTransfer;
                    int i40 = hevcConfig.bitdepthLuma;
                    int i41 = hevcConfig.bitdepthChroma;
                    h265VpsData = hevcConfig.vpsData;
                    drmInitData2 = drmInitDataCopyWithSchemeType;
                    i12 = iIntValue;
                    str2 = str3;
                    i11 = i38;
                    iIsoColorPrimariesToColorSpace2 = i37;
                    iIsoTransferCharacteristicsToColorTransfer2 = i39;
                    i21 = i40;
                    i24 = i34;
                    i25 = i35;
                    str5 = str7;
                    i22 = i41;
                    str4 = "video/hevc";
                } else {
                    str2 = str3;
                    if (i28 == 1818785347) {
                        ExtractorUtil.checkContainerInput("video/hevc".equals(str4), "lhvC must follow hvcC atom");
                        NalUnitUtil.H265VpsData h265VpsData3 = h265VpsData2;
                        ExtractorUtil.checkContainerInput(h265VpsData3 != null && h265VpsData3.layerInfos.size() >= 2, "must have at least two layers");
                        parsableByteArray.setPosition(position2 + 8);
                        HevcConfig layered = HevcConfig.parseLayered(parsableByteArray, (NalUnitUtil.H265VpsData) Assertions.checkNotNull(h265VpsData3));
                        ExtractorUtil.checkContainerInput(stsdData2.nalUnitLengthFieldLength == layered.nalUnitLengthFieldLength, "nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms");
                        int i42 = layered.colorSpace;
                        int i43 = iIsoColorPrimariesToColorSpace2;
                        if (i42 != -1) {
                            ExtractorUtil.checkContainerInput(i43 == i42, "colorSpace must be the same for both views");
                        }
                        int i44 = layered.colorRange;
                        int i45 = i26;
                        if (i44 != -1) {
                            ExtractorUtil.checkContainerInput(i45 == i44, "colorRange must be the same for both views");
                        }
                        int i46 = layered.colorTransfer;
                        if (i46 != -1) {
                            int i47 = iIsoTransferCharacteristicsToColorTransfer2;
                            i17 = i47;
                            ExtractorUtil.checkContainerInput(i47 == i46, "colorTransfer must be the same for both views");
                        } else {
                            i17 = iIsoTransferCharacteristicsToColorTransfer2;
                        }
                        ExtractorUtil.checkContainerInput(i21 == layered.bitdepthLuma, "bitdepthLuma must be the same for both views");
                        ExtractorUtil.checkContainerInput(i22 == layered.bitdepthChroma, "bitdepthChroma must be the same for both views");
                        List<byte[]> listGh = listO;
                        if (listGh != null) {
                            listGh = nKK.gh().mUb(listGh).mUb(layered.initializationData).gh();
                            i18 = i43;
                        } else {
                            i18 = i43;
                            ExtractorUtil.checkContainerInput(false, "initializationData must be already set from hvcC atom");
                        }
                        String str8 = layered.codecs;
                        str4 = MimeTypes.VIDEO_MV_HEVC;
                        drmInitData2 = drmInitDataCopyWithSchemeType;
                        i12 = iIntValue;
                        i11 = i45;
                        iIsoColorPrimariesToColorSpace2 = i18;
                        iIsoTransferCharacteristicsToColorTransfer2 = i17;
                        str5 = str8;
                        h265VpsData = h265VpsData3;
                        listO = listGh;
                    } else {
                        List<byte[]> listBuildVp9CodecPrivateInitializationData = listO;
                        int i48 = iIsoColorPrimariesToColorSpace2;
                        i11 = i26;
                        int i49 = iIsoTransferCharacteristicsToColorTransfer2;
                        NalUnitUtil.H265VpsData h265VpsData4 = h265VpsData2;
                        if (i28 == 1986361461) {
                            VexuData videoExtendedUsageBox = parseVideoExtendedUsageBox(parsableByteArray, position2, i27);
                            if (videoExtendedUsageBox == null || videoExtendedUsageBox.eyesData == null) {
                                i16 = i23;
                                i23 = i16;
                                h265VpsData = h265VpsData4;
                                drmInitData2 = drmInitDataCopyWithSchemeType;
                                listO = listBuildVp9CodecPrivateInitializationData;
                                i12 = iIntValue;
                                iIsoColorPrimariesToColorSpace2 = i48;
                                iIsoTransferCharacteristicsToColorTransfer2 = i49;
                            } else if (h265VpsData4 == null || h265VpsData4.layerInfos.size() < 2) {
                                i16 = i23;
                                if (i16 == -1) {
                                    i23 = videoExtendedUsageBox.eyesData.striData.eyeViewsReversed ? 5 : 4;
                                } else {
                                    i23 = i16;
                                }
                                h265VpsData = h265VpsData4;
                                drmInitData2 = drmInitDataCopyWithSchemeType;
                                listO = listBuildVp9CodecPrivateInitializationData;
                                i12 = iIntValue;
                                iIsoColorPrimariesToColorSpace2 = i48;
                                iIsoTransferCharacteristicsToColorTransfer2 = i49;
                            } else {
                                ExtractorUtil.checkContainerInput(videoExtendedUsageBox.hasBothEyeViews(), "both eye views must be marked as available");
                                ExtractorUtil.checkContainerInput(!videoExtendedUsageBox.eyesData.striData.eyeViewsReversed, "for MV-HEVC, eye_views_reversed must be set to false");
                                i16 = i23;
                                i23 = i16;
                                h265VpsData = h265VpsData4;
                                drmInitData2 = drmInitDataCopyWithSchemeType;
                                listO = listBuildVp9CodecPrivateInitializationData;
                                i12 = iIntValue;
                                iIsoColorPrimariesToColorSpace2 = i48;
                                iIsoTransferCharacteristicsToColorTransfer2 = i49;
                            }
                            i20 = i5;
                            stsdData2 = stsdData;
                            position = i10 + i27;
                            iIntValue = i12;
                            drmInitDataCopyWithSchemeType = drmInitData2;
                            str3 = str2;
                            i26 = i11;
                            h265VpsData2 = h265VpsData;
                            i19 = i3;
                        } else {
                            int i50 = i23;
                            if (i28 == 1685480259 || i28 == 1685485123) {
                                drmInitData2 = drmInitDataCopyWithSchemeType;
                                list = listBuildVp9CodecPrivateInitializationData;
                                i12 = iIntValue;
                                i13 = i50;
                                i14 = i22;
                                i15 = i21;
                                iIsoColorPrimariesToColorSpace = i48;
                                iIsoTransferCharacteristicsToColorTransfer = i49;
                                DolbyVisionConfig dolbyVisionConfig = DolbyVisionConfig.parse(parsableByteArray);
                                if (dolbyVisionConfig != null) {
                                    str4 = "video/dolby-vision";
                                    str5 = dolbyVisionConfig.codecs;
                                }
                            } else if (i28 == 1987076931) {
                                ExtractorUtil.checkContainerInput(str4 == null, null);
                                String str9 = iIntValue == 1987063864 ? "video/x-vnd.on2.vp8" : "video/x-vnd.on2.vp9";
                                parsableByteArray.setPosition(position2 + 12);
                                byte unsignedByte = (byte) parsableByteArray.readUnsignedByte();
                                byte unsignedByte2 = (byte) parsableByteArray.readUnsignedByte();
                                int unsignedByte3 = parsableByteArray.readUnsignedByte();
                                i21 = unsignedByte3 >> 4;
                                i12 = iIntValue;
                                byte b2 = (byte) ((unsignedByte3 >> 1) & 7);
                                if (str9.equals("video/x-vnd.on2.vp9")) {
                                    listBuildVp9CodecPrivateInitializationData = CodecSpecificDataUtil.buildVp9CodecPrivateInitializationData(unsignedByte, unsignedByte2, (byte) i21, b2);
                                }
                                boolean z3 = (unsignedByte3 & 1) != 0;
                                int unsignedByte4 = parsableByteArray.readUnsignedByte();
                                int unsignedByte5 = parsableByteArray.readUnsignedByte();
                                iIsoColorPrimariesToColorSpace2 = ColorInfo.isoColorPrimariesToColorSpace(unsignedByte4);
                                int i51 = z3 ? 1 : 2;
                                iIsoTransferCharacteristicsToColorTransfer2 = ColorInfo.isoTransferCharacteristicsToColorTransfer(unsignedByte5);
                                str4 = str9;
                                drmInitData2 = drmInitDataCopyWithSchemeType;
                                i22 = i21;
                                i11 = i51;
                                h265VpsData = h265VpsData4;
                                listO = listBuildVp9CodecPrivateInitializationData;
                                i23 = i50;
                                i20 = i5;
                                stsdData2 = stsdData;
                                position = i10 + i27;
                                iIntValue = i12;
                                drmInitDataCopyWithSchemeType = drmInitData2;
                                str3 = str2;
                                i26 = i11;
                                h265VpsData2 = h265VpsData;
                                i19 = i3;
                            } else {
                                i12 = iIntValue;
                                if (i28 == 1635135811) {
                                    int i52 = i27 - 8;
                                    byte[] bArr = new byte[i52];
                                    parsableByteArray.readBytes(bArr, 0, i52);
                                    listO = nKK.o(bArr);
                                    parsableByteArray.setPosition(position2 + 8);
                                    ColorInfo av1c = parseAv1c(parsableByteArray);
                                    int i53 = av1c.lumaBitdepth;
                                    int i54 = av1c.chromaBitdepth;
                                    int i55 = av1c.colorSpace;
                                    int i56 = av1c.colorRange;
                                    iIsoTransferCharacteristicsToColorTransfer2 = av1c.colorTransfer;
                                    i21 = i53;
                                    drmInitData2 = drmInitDataCopyWithSchemeType;
                                    i22 = i54;
                                    iIsoColorPrimariesToColorSpace2 = i55;
                                    i11 = i56;
                                    str4 = "video/av01";
                                    h265VpsData = h265VpsData4;
                                } else if (i28 == 1668050025) {
                                    if (byteBufferAllocateHdrStaticInfo == null) {
                                        byteBufferAllocateHdrStaticInfo = allocateHdrStaticInfo();
                                    }
                                    ByteBuffer byteBuffer = byteBufferAllocateHdrStaticInfo;
                                    byteBuffer.position(21);
                                    byteBuffer.putShort(parsableByteArray.readShort());
                                    byteBuffer.putShort(parsableByteArray.readShort());
                                    byteBufferAllocateHdrStaticInfo = byteBuffer;
                                    drmInitData2 = drmInitDataCopyWithSchemeType;
                                    listO = listBuildVp9CodecPrivateInitializationData;
                                    h265VpsData = h265VpsData4;
                                    iIsoColorPrimariesToColorSpace2 = i48;
                                    iIsoTransferCharacteristicsToColorTransfer2 = i49;
                                } else if (i28 == 1835295606) {
                                    if (byteBufferAllocateHdrStaticInfo == null) {
                                        byteBufferAllocateHdrStaticInfo = allocateHdrStaticInfo();
                                    }
                                    ByteBuffer byteBuffer2 = byteBufferAllocateHdrStaticInfo;
                                    short s2 = parsableByteArray.readShort();
                                    short s3 = parsableByteArray.readShort();
                                    short s4 = parsableByteArray.readShort();
                                    short s5 = parsableByteArray.readShort();
                                    int i57 = i22;
                                    short s6 = parsableByteArray.readShort();
                                    int i58 = i21;
                                    short s7 = parsableByteArray.readShort();
                                    drmInitData2 = drmInitDataCopyWithSchemeType;
                                    short s8 = parsableByteArray.readShort();
                                    short s9 = parsableByteArray.readShort();
                                    long unsignedInt = parsableByteArray.readUnsignedInt();
                                    long unsignedInt2 = parsableByteArray.readUnsignedInt();
                                    byteBuffer2.position(1);
                                    byteBuffer2.putShort(s6);
                                    byteBuffer2.putShort(s7);
                                    byteBuffer2.putShort(s2);
                                    byteBuffer2.putShort(s3);
                                    byteBuffer2.putShort(s4);
                                    byteBuffer2.putShort(s5);
                                    byteBuffer2.putShort(s8);
                                    byteBuffer2.putShort(s9);
                                    byteBuffer2.putShort((short) (unsignedInt / 10000));
                                    byteBuffer2.putShort((short) (unsignedInt2 / 10000));
                                    byteBufferAllocateHdrStaticInfo = byteBuffer2;
                                    h265VpsData = h265VpsData4;
                                    i22 = i57;
                                    i21 = i58;
                                    iIsoColorPrimariesToColorSpace2 = i48;
                                    iIsoTransferCharacteristicsToColorTransfer2 = i49;
                                    listO = listBuildVp9CodecPrivateInitializationData;
                                    i23 = i50;
                                } else {
                                    drmInitData2 = drmInitDataCopyWithSchemeType;
                                    list = listBuildVp9CodecPrivateInitializationData;
                                    i13 = i50;
                                    i14 = i22;
                                    i15 = i21;
                                    if (i28 == 1681012275) {
                                        ExtractorUtil.checkContainerInput(str4 == null, null);
                                        h265VpsData = h265VpsData4;
                                        i22 = i14;
                                        i21 = i15;
                                        str4 = str2;
                                    } else if (i28 == 1702061171) {
                                        ExtractorUtil.checkContainerInput(str4 == null, null);
                                        esdsFromParent = parseEsdsFromParent(parsableByteArray, position2);
                                        String str10 = esdsFromParent.mimeType;
                                        byte[] bArr2 = esdsFromParent.initializationData;
                                        listO = bArr2 != null ? nKK.o(bArr2) : list;
                                        str4 = str10;
                                        h265VpsData = h265VpsData4;
                                        i22 = i14;
                                        i21 = i15;
                                        iIsoColorPrimariesToColorSpace2 = i48;
                                        iIsoTransferCharacteristicsToColorTransfer2 = i49;
                                        i23 = i13;
                                    } else {
                                        if (i28 == 1651798644) {
                                            btrtFromParent = parseBtrtFromParent(parsableByteArray, position2);
                                        } else if (i28 == 1885434736) {
                                            paspFromParent = parsePaspFromParent(parsableByteArray, position2);
                                            h265VpsData = h265VpsData4;
                                            i22 = i14;
                                            i21 = i15;
                                            iIsoColorPrimariesToColorSpace2 = i48;
                                            iIsoTransferCharacteristicsToColorTransfer2 = i49;
                                            listO = list;
                                            i23 = i13;
                                            z2 = true;
                                            i20 = i5;
                                            stsdData2 = stsdData;
                                            position = i10 + i27;
                                            iIntValue = i12;
                                            drmInitDataCopyWithSchemeType = drmInitData2;
                                            str3 = str2;
                                            i26 = i11;
                                            h265VpsData2 = h265VpsData;
                                            i19 = i3;
                                        } else if (i28 == 1937126244) {
                                            projFromParent = parseProjFromParent(parsableByteArray, position2, i27);
                                        } else if (i28 == 1936995172) {
                                            int unsignedByte6 = parsableByteArray.readUnsignedByte();
                                            parsableByteArray.skipBytes(3);
                                            if (unsignedByte6 == 0) {
                                                int unsignedByte7 = parsableByteArray.readUnsignedByte();
                                                if (unsignedByte7 == 0) {
                                                    i13 = 0;
                                                } else if (unsignedByte7 == 1) {
                                                    i13 = 1;
                                                } else if (unsignedByte7 == 2) {
                                                    i13 = 2;
                                                } else if (unsignedByte7 == 3) {
                                                    i13 = 3;
                                                }
                                            }
                                        } else {
                                            if (i28 == 1634760259) {
                                                int i59 = i27 - 12;
                                                byte[] bArr3 = new byte[i59];
                                                parsableByteArray.setPosition(position2 + 12);
                                                parsableByteArray.readBytes(bArr3, 0, i59);
                                                listO = nKK.o(bArr3);
                                                ColorInfo apvc = parseApvc(new ParsableByteArray(bArr3));
                                                int i60 = apvc.lumaBitdepth;
                                                int i61 = apvc.chromaBitdepth;
                                                int i62 = apvc.colorSpace;
                                                int i63 = apvc.colorRange;
                                                iIsoTransferCharacteristicsToColorTransfer2 = apvc.colorTransfer;
                                                i21 = i60;
                                                i22 = i61;
                                                iIsoColorPrimariesToColorSpace2 = i62;
                                                i11 = i63;
                                                str4 = MimeTypes.VIDEO_APV;
                                                h265VpsData = h265VpsData4;
                                                i23 = i13;
                                            } else if (i28 == 1668246642) {
                                                iIsoColorPrimariesToColorSpace = i48;
                                                iIsoTransferCharacteristicsToColorTransfer = i49;
                                                if (iIsoColorPrimariesToColorSpace == -1 && iIsoTransferCharacteristicsToColorTransfer == -1) {
                                                    int i64 = parsableByteArray.readInt();
                                                    if (i64 == TYPE_nclx || i64 == TYPE_nclc) {
                                                        int unsignedShort3 = parsableByteArray.readUnsignedShort();
                                                        int unsignedShort4 = parsableByteArray.readUnsignedShort();
                                                        parsableByteArray.skipBytes(2);
                                                        boolean z4 = i27 == 19 && (parsableByteArray.readUnsignedByte() & 128) != 0;
                                                        iIsoColorPrimariesToColorSpace = ColorInfo.isoColorPrimariesToColorSpace(unsignedShort3);
                                                        int i65 = z4 ? 1 : 2;
                                                        iIsoTransferCharacteristicsToColorTransfer = ColorInfo.isoTransferCharacteristicsToColorTransfer(unsignedShort4);
                                                        i11 = i65;
                                                    } else {
                                                        Log.w(TAG, "Unsupported color type: " + Mp4Box.getBoxTypeString(i64));
                                                    }
                                                }
                                            } else {
                                                iIsoColorPrimariesToColorSpace = i48;
                                                iIsoTransferCharacteristicsToColorTransfer = i49;
                                            }
                                        }
                                        h265VpsData = h265VpsData4;
                                        i22 = i14;
                                        i21 = i15;
                                    }
                                    iIsoColorPrimariesToColorSpace2 = i48;
                                    iIsoTransferCharacteristicsToColorTransfer2 = i49;
                                    listO = list;
                                    i23 = i13;
                                }
                                i23 = i50;
                                i20 = i5;
                                stsdData2 = stsdData;
                                position = i10 + i27;
                                iIntValue = i12;
                                drmInitDataCopyWithSchemeType = drmInitData2;
                                str3 = str2;
                                i26 = i11;
                                h265VpsData2 = h265VpsData;
                                i19 = i3;
                            }
                            i22 = i14;
                            i21 = i15;
                            listO = list;
                            iIsoColorPrimariesToColorSpace2 = iIsoColorPrimariesToColorSpace;
                            iIsoTransferCharacteristicsToColorTransfer2 = iIsoTransferCharacteristicsToColorTransfer;
                            h265VpsData = h265VpsData4;
                            i23 = i13;
                            i20 = i5;
                            stsdData2 = stsdData;
                            position = i10 + i27;
                            iIntValue = i12;
                            drmInitDataCopyWithSchemeType = drmInitData2;
                            str3 = str2;
                            i26 = i11;
                            h265VpsData2 = h265VpsData;
                            i19 = i3;
                        }
                    }
                }
                i20 = i5;
                stsdData2 = stsdData;
                position = i10 + i27;
                iIntValue = i12;
                drmInitDataCopyWithSchemeType = drmInitData2;
                str3 = str2;
                i26 = i11;
                h265VpsData2 = h265VpsData;
                i19 = i3;
            }
            i20 = i5;
            stsdData2 = stsdData;
            position = i10 + i27;
            iIntValue = i12;
            drmInitDataCopyWithSchemeType = drmInitData2;
            str3 = str2;
            i26 = i11;
            h265VpsData2 = h265VpsData;
            i19 = i3;
        }
        DrmInitData drmInitData3 = drmInitDataCopyWithSchemeType;
        List<byte[]> list4 = listO;
        int i66 = i23;
        int i67 = iIsoColorPrimariesToColorSpace2;
        int i68 = i26;
        int i69 = iIsoTransferCharacteristicsToColorTransfer2;
        int i70 = i22;
        int i71 = i21;
        if (str4 == null) {
            return;
        }
        Format.Builder colorInfo = new Format.Builder().setId(i7).setSampleMimeType(str4).setCodecs(str5).setWidth(unsignedShort).setHeight(unsignedShort2).setPixelWidthHeightRatio(paspFromParent).setRotationDegrees(i8).setProjectionData(projFromParent).setStereoMode(i66).setInitializationData(list4).setMaxNumReorderSamples(i24).setMaxSubLayers(i25).setDrmInitData(drmInitData3).setLanguage(str).setColorInfo(new ColorInfo.Builder().setColorSpace(i67).setColorRange(i68).setColorTransfer(i69).setHdrStaticInfo(byteBufferAllocateHdrStaticInfo != null ? byteBufferAllocateHdrStaticInfo.array() : null).setLumaBitdepth(i71).setChromaBitdepth(i70).build());
        if (btrtFromParent != null) {
            colorInfo.setAverageBitrate(com.google.common.primitives.Wre.qie(btrtFromParent.avgBitrate)).setPeakBitrate(com.google.common.primitives.Wre.qie(btrtFromParent.maxBitrate));
        } else if (esdsFromParent != null) {
            colorInfo.setAverageBitrate(com.google.common.primitives.Wre.qie(esdsFromParent.bitrate)).setPeakBitrate(com.google.common.primitives.Wre.qie(esdsFromParent.peakBitrate));
        }
        stsdData.format = colorInfo.build();
    }

    @Nullable
    private static Metadata parseXyz(ParsableByteArray parsableByteArray) {
        short s2 = parsableByteArray.readShort();
        parsableByteArray.skipBytes(2);
        String string = parsableByteArray.readString(s2);
        int iMax = Math.max(string.lastIndexOf(43), string.lastIndexOf(45));
        try {
            return new Metadata(new Mp4LocationData(Float.parseFloat(string.substring(0, iMax)), Float.parseFloat(string.substring(iMax, string.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    private static final class StsdData {
        public static final int STSD_HEADER_SIZE = 8;

        @Nullable
        public Format format;
        public int nalUnitLengthFieldLength;
        public int requiredSampleTransformation = 0;
        public final TrackEncryptionBox[] trackEncryptionBoxes;

        public StsdData(int i2) {
            this.trackEncryptionBoxes = new TrackEncryptionBox[i2];
        }
    }

    private static ByteBuffer allocateHdrStaticInfo() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    @Nullable
    private static String getLanguageFromCode(int i2) {
        char[] cArr = {(char) (((i2 >> 10) & 31) + 96), (char) (((i2 >> 5) & 31) + 96), (char) ((i2 & 31) + 96)};
        for (int i3 = 0; i3 < 3; i3++) {
            char c2 = cArr[i3];
            if (c2 < 'a' || c2 > 'z') {
                return null;
            }
        }
        return new String(cArr);
    }

    private static ColorInfo parseApvc(ParsableByteArray parsableByteArray) {
        ColorInfo.Builder builder = new ColorInfo.Builder();
        ParsableBitArray parsableBitArray = new ParsableBitArray(parsableByteArray.getData());
        parsableBitArray.setPosition(parsableByteArray.getPosition() * 8);
        parsableBitArray.skipBytes(1);
        int bits = parsableBitArray.readBits(8);
        for (int i2 = 0; i2 < bits; i2++) {
            parsableBitArray.skipBytes(1);
            int bits2 = parsableBitArray.readBits(8);
            for (int i3 = 0; i3 < bits2; i3++) {
                parsableBitArray.skipBits(6);
                boolean bit = parsableBitArray.readBit();
                parsableBitArray.skipBit();
                parsableBitArray.skipBytes(11);
                parsableBitArray.skipBits(4);
                int bits3 = parsableBitArray.readBits(4) + 8;
                builder.setLumaBitdepth(bits3);
                builder.setChromaBitdepth(bits3);
                parsableBitArray.skipBytes(1);
                if (bit) {
                    int bits4 = parsableBitArray.readBits(8);
                    int bits5 = parsableBitArray.readBits(8);
                    parsableBitArray.skipBytes(1);
                    builder.setColorSpace(ColorInfo.isoColorPrimariesToColorSpace(bits4)).setColorRange(parsableBitArray.readBit() ? 1 : 2).setColorTransfer(ColorInfo.isoTransferCharacteristicsToColorTransfer(bits5));
                }
            }
        }
        return builder.build();
    }

    private static ColorInfo parseAv1c(ParsableByteArray parsableByteArray) {
        ColorInfo.Builder builder = new ColorInfo.Builder();
        ParsableBitArray parsableBitArray = new ParsableBitArray(parsableByteArray.getData());
        parsableBitArray.setPosition(parsableByteArray.getPosition() * 8);
        parsableBitArray.skipBytes(1);
        int bits = parsableBitArray.readBits(3);
        parsableBitArray.skipBits(6);
        boolean bit = parsableBitArray.readBit();
        boolean bit2 = parsableBitArray.readBit();
        if (bits == 2 && bit) {
            builder.setLumaBitdepth(bit2 ? 12 : 10);
            builder.setChromaBitdepth(bit2 ? 12 : 10);
        } else if (bits <= 2) {
            builder.setLumaBitdepth(bit ? 10 : 8);
            builder.setChromaBitdepth(bit ? 10 : 8);
        }
        parsableBitArray.skipBits(13);
        parsableBitArray.skipBit();
        int bits2 = parsableBitArray.readBits(4);
        if (bits2 != 1) {
            Log.i(TAG, "Unsupported obu_type: " + bits2);
            return builder.build();
        }
        if (parsableBitArray.readBit()) {
            Log.i(TAG, "Unsupported obu_extension_flag");
            return builder.build();
        }
        boolean bit3 = parsableBitArray.readBit();
        parsableBitArray.skipBit();
        if (bit3 && parsableBitArray.readBits(8) > 127) {
            Log.i(TAG, "Excessive obu_size");
            return builder.build();
        }
        int bits3 = parsableBitArray.readBits(3);
        parsableBitArray.skipBit();
        if (parsableBitArray.readBit()) {
            Log.i(TAG, "Unsupported reduced_still_picture_header");
            return builder.build();
        }
        if (parsableBitArray.readBit()) {
            Log.i(TAG, "Unsupported timing_info_present_flag");
            return builder.build();
        }
        if (parsableBitArray.readBit()) {
            Log.i(TAG, "Unsupported initial_display_delay_present_flag");
            return builder.build();
        }
        int bits4 = parsableBitArray.readBits(5);
        boolean z2 = false;
        for (int i2 = 0; i2 <= bits4; i2++) {
            parsableBitArray.skipBits(12);
            if (parsableBitArray.readBits(5) > 7) {
                parsableBitArray.skipBit();
            }
        }
        int bits5 = parsableBitArray.readBits(4);
        int bits6 = parsableBitArray.readBits(4);
        parsableBitArray.skipBits(bits5 + 1);
        parsableBitArray.skipBits(bits6 + 1);
        if (parsableBitArray.readBit()) {
            parsableBitArray.skipBits(7);
        }
        parsableBitArray.skipBits(7);
        boolean bit4 = parsableBitArray.readBit();
        if (bit4) {
            parsableBitArray.skipBits(2);
        }
        if ((parsableBitArray.readBit() ? 2 : parsableBitArray.readBits(1)) > 0 && !parsableBitArray.readBit()) {
            parsableBitArray.skipBits(1);
        }
        if (bit4) {
            parsableBitArray.skipBits(3);
        }
        parsableBitArray.skipBits(3);
        boolean bit5 = parsableBitArray.readBit();
        if (bits3 == 2 && bit5) {
            parsableBitArray.skipBit();
        }
        if (bits3 != 1 && parsableBitArray.readBit()) {
            z2 = true;
        }
        if (parsableBitArray.readBit()) {
            int bits7 = parsableBitArray.readBits(8);
            int bits8 = parsableBitArray.readBits(8);
            builder.setColorSpace(ColorInfo.isoColorPrimariesToColorSpace(bits7)).setColorRange(((z2 || bits7 != 1 || bits8 != 13 || parsableBitArray.readBits(8) != 0) ? parsableBitArray.readBits(1) : 1) != 1 ? 2 : 1).setColorTransfer(ColorInfo.isoTransferCharacteristicsToColorTransfer(bits8));
        }
        return builder.build();
    }

    private static BtrtData parseBtrtFromParent(ParsableByteArray parsableByteArray, int i2) {
        parsableByteArray.setPosition(i2 + 8);
        parsableByteArray.skipBytes(4);
        return new BtrtData(parsableByteArray.readUnsignedInt(), parsableByteArray.readUnsignedInt());
    }

    @Nullable
    static Pair<Integer, TrackEncryptionBox> parseCommonEncryptionSinfFromParent(ParsableByteArray parsableByteArray, int i2, int i3) throws ParserException {
        int i5 = i2 + 8;
        int i7 = -1;
        int i8 = 0;
        String string = null;
        Integer numValueOf = null;
        while (i5 - i2 < i3) {
            parsableByteArray.setPosition(i5);
            int i9 = parsableByteArray.readInt();
            int i10 = parsableByteArray.readInt();
            if (i10 == 1718775137) {
                numValueOf = Integer.valueOf(parsableByteArray.readInt());
            } else if (i10 == 1935894637) {
                parsableByteArray.skipBytes(4);
                string = parsableByteArray.readString(4);
            } else if (i10 == 1935894633) {
                i7 = i5;
                i8 = i9;
            }
            i5 += i9;
        }
        if (!"cenc".equals(string) && !"cbc1".equals(string) && !"cens".equals(string) && !"cbcs".equals(string)) {
            return null;
        }
        ExtractorUtil.checkContainerInput(numValueOf != null, "frma atom is mandatory");
        ExtractorUtil.checkContainerInput(i7 != -1, "schi atom is mandatory");
        TrackEncryptionBox schiFromParent = parseSchiFromParent(parsableByteArray, i7, i8, string);
        ExtractorUtil.checkContainerInput(schiFromParent != null, "tenc atom is mandatory");
        return Pair.create(numValueOf, (TrackEncryptionBox) Util.castNonNull(schiFromParent));
    }

    private static EsdsData parseEsdsFromParent(ParsableByteArray parsableByteArray, int i2) {
        parsableByteArray.setPosition(i2 + 12);
        parsableByteArray.skipBytes(1);
        parseExpandableClassSize(parsableByteArray);
        parsableByteArray.skipBytes(2);
        int unsignedByte = parsableByteArray.readUnsignedByte();
        if ((unsignedByte & 128) != 0) {
            parsableByteArray.skipBytes(2);
        }
        if ((unsignedByte & 64) != 0) {
            parsableByteArray.skipBytes(parsableByteArray.readUnsignedByte());
        }
        if ((unsignedByte & 32) != 0) {
            parsableByteArray.skipBytes(2);
        }
        parsableByteArray.skipBytes(1);
        parseExpandableClassSize(parsableByteArray);
        String mimeTypeFromMp4ObjectType = MimeTypes.getMimeTypeFromMp4ObjectType(parsableByteArray.readUnsignedByte());
        if ("audio/mpeg".equals(mimeTypeFromMp4ObjectType) || "audio/vnd.dts".equals(mimeTypeFromMp4ObjectType) || "audio/vnd.dts.hd".equals(mimeTypeFromMp4ObjectType)) {
            return new EsdsData(mimeTypeFromMp4ObjectType, null, -1L, -1L);
        }
        parsableByteArray.skipBytes(4);
        long unsignedInt = parsableByteArray.readUnsignedInt();
        long unsignedInt2 = parsableByteArray.readUnsignedInt();
        parsableByteArray.skipBytes(1);
        int expandableClassSize = parseExpandableClassSize(parsableByteArray);
        long j2 = unsignedInt2;
        byte[] bArr = new byte[expandableClassSize];
        parsableByteArray.readBytes(bArr, 0, expandableClassSize);
        if (j2 <= 0) {
            j2 = -1;
        }
        return new EsdsData(mimeTypeFromMp4ObjectType, bArr, j2, unsignedInt > 0 ? unsignedInt : -1L);
    }

    private static int parseHdlr(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(16);
        return parsableByteArray.readInt();
    }

    @Nullable
    private static Metadata parseIlst(ParsableByteArray parsableByteArray, int i2) {
        parsableByteArray.skipBytes(8);
        ArrayList arrayList = new ArrayList();
        while (parsableByteArray.getPosition() < i2) {
            Metadata.Entry ilstElement = MetadataUtil.parseIlstElement(parsableByteArray);
            if (ilstElement != null) {
                arrayList.add(ilstElement);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    private static MdhdData parseMdhd(ParsableByteArray parsableByteArray) {
        long j2;
        parsableByteArray.setPosition(8);
        int fullBoxVersion = parseFullBoxVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(fullBoxVersion == 0 ? 8 : 16);
        long unsignedInt = parsableByteArray.readUnsignedInt();
        int position = parsableByteArray.getPosition();
        int i2 = fullBoxVersion == 0 ? 4 : 8;
        int i3 = 0;
        while (true) {
            j2 = -9223372036854775807L;
            if (i3 >= i2) {
                parsableByteArray.skipBytes(i2);
                break;
            }
            if (parsableByteArray.getData()[position + i3] != -1) {
                long unsignedInt2 = fullBoxVersion == 0 ? parsableByteArray.readUnsignedInt() : parsableByteArray.readUnsignedLongToLong();
                if (unsignedInt2 != 0) {
                    long jScaleLargeTimestamp = Util.scaleLargeTimestamp(unsignedInt2, 1000000L, unsignedInt);
                    unsignedInt = unsignedInt;
                    j2 = jScaleLargeTimestamp;
                }
            } else {
                i3++;
            }
        }
        return new MdhdData(unsignedInt, j2, getLanguageFromCode(parsableByteArray.readUnsignedShort()));
    }

    private static void parseMetaDataSampleEntry(ParsableByteArray parsableByteArray, int i2, int i3, int i5, StsdData stsdData) {
        parsableByteArray.setPosition(i3 + 16);
        if (i2 == 1835365492) {
            parsableByteArray.readNullTerminatedString();
            String nullTerminatedString = parsableByteArray.readNullTerminatedString();
            if (nullTerminatedString != null) {
                stsdData.format = new Format.Builder().setId(i5).setSampleMimeType(nullTerminatedString).build();
            }
        }
    }

    public static Mp4TimestampData parseMvhd(ParsableByteArray parsableByteArray) {
        long unsignedInt;
        long unsignedInt2;
        parsableByteArray.setPosition(8);
        if (parseFullBoxVersion(parsableByteArray.readInt()) == 0) {
            unsignedInt = parsableByteArray.readUnsignedInt();
            unsignedInt2 = parsableByteArray.readUnsignedInt();
        } else {
            unsignedInt = parsableByteArray.readLong();
            unsignedInt2 = parsableByteArray.readLong();
        }
        return new Mp4TimestampData(unsignedInt, unsignedInt2, parsableByteArray.readUnsignedInt());
    }

    private static float parsePaspFromParent(ParsableByteArray parsableByteArray, int i2) {
        parsableByteArray.setPosition(i2 + 8);
        return parsableByteArray.readUnsignedIntToInt() / parsableByteArray.readUnsignedIntToInt();
    }

    @Nullable
    private static byte[] parseProjFromParent(ParsableByteArray parsableByteArray, int i2, int i3) {
        int i5 = i2 + 8;
        while (i5 - i2 < i3) {
            parsableByteArray.setPosition(i5);
            int i7 = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1886547818) {
                return Arrays.copyOfRange(parsableByteArray.getData(), i5, i7 + i5);
            }
            i5 += i7;
        }
        return null;
    }

    @Nullable
    private static TrackEncryptionBox parseSchiFromParent(ParsableByteArray parsableByteArray, int i2, int i3, String str) {
        int i5;
        int i7;
        int i8 = i2 + 8;
        while (true) {
            byte[] bArr = null;
            if (i8 - i2 >= i3) {
                return null;
            }
            parsableByteArray.setPosition(i8);
            int i9 = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1952804451) {
                int fullBoxVersion = parseFullBoxVersion(parsableByteArray.readInt());
                parsableByteArray.skipBytes(1);
                if (fullBoxVersion == 0) {
                    parsableByteArray.skipBytes(1);
                    i7 = 0;
                    i5 = 0;
                } else {
                    int unsignedByte = parsableByteArray.readUnsignedByte();
                    i5 = unsignedByte & 15;
                    i7 = (unsignedByte & 240) >> 4;
                }
                boolean z2 = parsableByteArray.readUnsignedByte() == 1;
                int unsignedByte2 = parsableByteArray.readUnsignedByte();
                byte[] bArr2 = new byte[16];
                parsableByteArray.readBytes(bArr2, 0, 16);
                if (z2 && unsignedByte2 == 0) {
                    int unsignedByte3 = parsableByteArray.readUnsignedByte();
                    bArr = new byte[unsignedByte3];
                    parsableByteArray.readBytes(bArr, 0, unsignedByte3);
                }
                return new TrackEncryptionBox(z2, str, unsignedByte2, bArr2, i7, i5, bArr);
            }
            i8 += i9;
        }
    }

    @Nullable
    private static EyesData parseStereoViewBox(ParsableByteArray parsableByteArray, int i2, int i3) throws ParserException {
        parsableByteArray.setPosition(i2 + 8);
        int position = parsableByteArray.getPosition();
        while (position - i2 < i3) {
            parsableByteArray.setPosition(position);
            int i5 = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(i5 > 0, "childAtomSize must be positive");
            if (parsableByteArray.readInt() == 1937011305) {
                parsableByteArray.skipBytes(4);
                int unsignedByte = parsableByteArray.readUnsignedByte();
                return new EyesData(new StriData((unsignedByte & 1) == 1, (unsignedByte & 2) == 2, (unsignedByte & 8) == 8));
            }
            position += i5;
        }
        return null;
    }

    private static StsdData parseStsd(ParsableByteArray parsableByteArray, int i2, int i3, @Nullable String str, @Nullable DrmInitData drmInitData, boolean z2) throws ParserException {
        parsableByteArray.setPosition(12);
        int i5 = parsableByteArray.readInt();
        StsdData stsdData = new StsdData(i5);
        for (int i7 = 0; i7 < i5; i7++) {
            int position = parsableByteArray.getPosition();
            int i8 = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(i8 > 0, "childAtomSize must be positive");
            int i9 = parsableByteArray.readInt();
            if (i9 == 1635148593 || i9 == 1635148595 || i9 == 1701733238 || i9 == 1831958048 || i9 == 1836070006 || i9 == 1752589105 || i9 == 1751479857 || i9 == 1932670515 || i9 == 1211250227 || i9 == 1748121139 || i9 == 1987063864 || i9 == 1987063865 || i9 == 1635135537 || i9 == 1685479798 || i9 == 1685479729 || i9 == 1685481573 || i9 == 1685481521 || i9 == 1634760241) {
                parseVideoSampleEntry(parsableByteArray, i9, position, i8, i2, str, i3, drmInitData, stsdData, i7);
            } else if (i9 == 1836069985 || i9 == 1701733217 || i9 == 1633889587 || i9 == 1700998451 || i9 == 1633889588 || i9 == 1835823201 || i9 == 1685353315 || i9 == 1685353317 || i9 == 1685353320 || i9 == 1685353324 || i9 == 1685353336 || i9 == 1935764850 || i9 == 1935767394 || i9 == 1819304813 || i9 == 1936684916 || i9 == 1953984371 || i9 == 778924082 || i9 == 778924083 || i9 == 1835557169 || i9 == 1835560241 || i9 == 1634492771 || i9 == 1634492791 || i9 == 1970037111 || i9 == 1332770163 || i9 == 1716281667 || i9 == 1767992678) {
                parseAudioSampleEntry(parsableByteArray, i9, position, i8, i2, str, z2, drmInitData, stsdData, i7);
            } else if (i9 == 1414810956 || i9 == 1954034535 || i9 == 2004251764 || i9 == 1937010800 || i9 == 1664495672) {
                StsdData stsdData2 = stsdData;
                parseTextSampleEntry(parsableByteArray, i9, position, i8, i2, str, stsdData2);
                stsdData = stsdData2;
            } else if (i9 == 1835365492) {
                parseMetaDataSampleEntry(parsableByteArray, i9, position, i2, stsdData);
            } else if (i9 == 1667329389) {
                stsdData.format = new Format.Builder().setId(i2).setSampleMimeType("application/x-camera-motion").build();
            }
            parsableByteArray.setPosition(position + i8);
        }
        return stsdData;
    }

    private static void parseTextSampleEntry(ParsableByteArray parsableByteArray, int i2, int i3, int i5, int i7, @Nullable String str, StsdData stsdData) {
        parsableByteArray.setPosition(i3 + 16);
        String str2 = "application/ttml+xml";
        nKK nkkO = null;
        long j2 = Long.MAX_VALUE;
        if (i2 != 1414810956) {
            if (i2 == 1954034535) {
                int i8 = i5 - 16;
                byte[] bArr = new byte[i8];
                parsableByteArray.readBytes(bArr, 0, i8);
                nkkO = nKK.o(bArr);
                str2 = "application/x-quicktime-tx3g";
            } else if (i2 == 2004251764) {
                str2 = "application/x-mp4-vtt";
            } else if (i2 == 1937010800) {
                j2 = 0;
            } else {
                if (i2 != 1664495672) {
                    throw new IllegalStateException();
                }
                stsdData.requiredSampleTransformation = 1;
                str2 = "application/x-mp4-cea-608";
            }
        }
        stsdData.format = new Format.Builder().setId(i7).setSampleMimeType(str2).setLanguage(str).setSubsampleOffsetUs(j2).setInitializationData(nkkO).build();
    }

    private static TkhdData parseTkhd(ParsableByteArray parsableByteArray) {
        long j2;
        int i2;
        int i3;
        parsableByteArray.setPosition(8);
        int fullBoxVersion = parseFullBoxVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(fullBoxVersion == 0 ? 8 : 16);
        int i5 = parsableByteArray.readInt();
        parsableByteArray.skipBytes(4);
        int position = parsableByteArray.getPosition();
        int i7 = fullBoxVersion == 0 ? 4 : 8;
        int i8 = 0;
        while (true) {
            j2 = -9223372036854775807L;
            if (i8 >= i7) {
                parsableByteArray.skipBytes(i7);
                break;
            }
            if (parsableByteArray.getData()[position + i8] != -1) {
                long unsignedInt = fullBoxVersion == 0 ? parsableByteArray.readUnsignedInt() : parsableByteArray.readUnsignedLongToLong();
                if (unsignedInt != 0) {
                    j2 = unsignedInt;
                }
            } else {
                i8++;
            }
        }
        parsableByteArray.skipBytes(10);
        long j3 = j2;
        int unsignedShort = parsableByteArray.readUnsignedShort();
        parsableByteArray.skipBytes(4);
        int i9 = parsableByteArray.readInt();
        int i10 = parsableByteArray.readInt();
        parsableByteArray.skipBytes(4);
        int i11 = parsableByteArray.readInt();
        int i12 = parsableByteArray.readInt();
        if (i9 == 0 && i10 == 65536 && i11 == -65536 && i12 == 0) {
            i3 = 90;
        } else if (i9 == 0 && i10 == -65536 && i11 == 65536 && i12 == 0) {
            i3 = 270;
        } else {
            if (i9 != -65536 || i10 != 0 || i11 != 0 || i12 != -65536) {
                i2 = 0;
                return new TkhdData(i5, j3, unsignedShort, i2);
            }
            i3 = 180;
        }
        i2 = i3;
        return new TkhdData(i5, j3, unsignedShort, i2);
    }

    @Nullable
    public static Track parseTrak(Mp4Box.ContainerBox containerBox, Mp4Box.LeafBox leafBox, long j2, @Nullable DrmInitData drmInitData, boolean z2, boolean z3) throws ParserException {
        long[] jArr;
        long[] jArr2;
        Format formatBuild;
        Mp4Box.ContainerBox containerBoxOfType;
        Pair<long[], long[]> edts;
        Mp4Box.ContainerBox containerBox2 = (Mp4Box.ContainerBox) Assertions.checkNotNull(containerBox.getContainerBoxOfType(Mp4Box.TYPE_mdia));
        int trackTypeForHdlr = getTrackTypeForHdlr(parseHdlr(((Mp4Box.LeafBox) Assertions.checkNotNull(containerBox2.getLeafBoxOfType(Mp4Box.TYPE_hdlr))).data));
        if (trackTypeForHdlr == -1) {
            return null;
        }
        TkhdData tkhd = parseTkhd(((Mp4Box.LeafBox) Assertions.checkNotNull(containerBox.getLeafBoxOfType(Mp4Box.TYPE_tkhd))).data);
        long j3 = j2 == -9223372036854775807L ? tkhd.duration : j2;
        long j4 = parseMvhd(leafBox.data).timescale;
        long jScaleLargeTimestamp = j3 != -9223372036854775807L ? Util.scaleLargeTimestamp(j3, 1000000L, j4) : -9223372036854775807L;
        Mp4Box.ContainerBox containerBox3 = (Mp4Box.ContainerBox) Assertions.checkNotNull(((Mp4Box.ContainerBox) Assertions.checkNotNull(containerBox2.getContainerBoxOfType(Mp4Box.TYPE_minf))).getContainerBoxOfType(Mp4Box.TYPE_stbl));
        MdhdData mdhd = parseMdhd(((Mp4Box.LeafBox) Assertions.checkNotNull(containerBox2.getLeafBoxOfType(Mp4Box.TYPE_mdhd))).data);
        Mp4Box.LeafBox leafBoxOfType = containerBox3.getLeafBoxOfType(Mp4Box.TYPE_stsd);
        if (leafBoxOfType == null) {
            throw ParserException.createForMalformedContainer("Malformed sample table (stbl) missing sample description (stsd)", null);
        }
        StsdData stsd = parseStsd(leafBoxOfType.data, tkhd.id, tkhd.rotationDegrees, mdhd.language, drmInitData, z3);
        if (z2 || (containerBoxOfType = containerBox.getContainerBoxOfType(Mp4Box.TYPE_edts)) == null || (edts = parseEdts(containerBoxOfType)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            long[] jArr3 = (long[]) edts.first;
            jArr2 = (long[]) edts.second;
            jArr = jArr3;
        }
        if (stsd.format == null) {
            return null;
        }
        if (tkhd.alternateGroup != 0) {
            Mp4AlternateGroupData mp4AlternateGroupData = new Mp4AlternateGroupData(tkhd.alternateGroup);
            Format.Builder builderBuildUpon = stsd.format.buildUpon();
            Metadata metadata = stsd.format.metadata;
            formatBuild = builderBuildUpon.setMetadata(metadata != null ? metadata.copyWithAppendedEntries(mp4AlternateGroupData) : new Metadata(mp4AlternateGroupData)).build();
        } else {
            formatBuild = stsd.format;
        }
        return new Track(tkhd.id, trackTypeForHdlr, mdhd.timescale, j4, jScaleLargeTimestamp, mdhd.mediaDurationUs, formatBuild, stsd.requiredSampleTransformation, stsd.trackEncryptionBoxes, stsd.nalUnitLengthFieldLength, jArr, jArr2);
    }

    public static List<TrackSampleTable> parseTraks(Mp4Box.ContainerBox containerBox, GaplessInfoHolder gaplessInfoHolder, long j2, @Nullable DrmInitData drmInitData, boolean z2, boolean z3, t1.CN3 cn3) throws ParserException {
        Track track;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < containerBox.containerChildren.size(); i2++) {
            Mp4Box.ContainerBox containerBox2 = containerBox.containerChildren.get(i2);
            if (containerBox2.type == 1953653099 && (track = (Track) cn3.apply(parseTrak(containerBox2, (Mp4Box.LeafBox) Assertions.checkNotNull(containerBox.getLeafBoxOfType(Mp4Box.TYPE_mvhd)), j2, drmInitData, z2, z3))) != null) {
                arrayList.add(parseStbl(track, (Mp4Box.ContainerBox) Assertions.checkNotNull(((Mp4Box.ContainerBox) Assertions.checkNotNull(((Mp4Box.ContainerBox) Assertions.checkNotNull(containerBox2.getContainerBoxOfType(Mp4Box.TYPE_mdia))).getContainerBoxOfType(Mp4Box.TYPE_minf))).getContainerBoxOfType(Mp4Box.TYPE_stbl)), gaplessInfoHolder));
            }
        }
        return arrayList;
    }

    public static Metadata parseUdta(Mp4Box.LeafBox leafBox) {
        ParsableByteArray parsableByteArray = leafBox.data;
        parsableByteArray.setPosition(8);
        Metadata metadata = new Metadata(new Metadata.Entry[0]);
        while (parsableByteArray.bytesLeft() >= 8) {
            int position = parsableByteArray.getPosition();
            int i2 = parsableByteArray.readInt();
            int i3 = parsableByteArray.readInt();
            if (i3 == 1835365473) {
                parsableByteArray.setPosition(position);
                metadata = metadata.copyWithAppendedEntriesFrom(parseUdtaMeta(parsableByteArray, position + i2));
            } else if (i3 == 1936553057) {
                parsableByteArray.setPosition(position);
                metadata = metadata.copyWithAppendedEntriesFrom(SmtaAtomUtil.parseSmta(parsableByteArray, position + i2));
            } else if (i3 == -1451722374) {
                metadata = metadata.copyWithAppendedEntriesFrom(parseXyz(parsableByteArray));
            }
            parsableByteArray.setPosition(position + i2);
        }
        return metadata;
    }

    @Nullable
    private static Metadata parseUdtaMeta(ParsableByteArray parsableByteArray, int i2) {
        parsableByteArray.skipBytes(8);
        maybeSkipRemainingMetaBoxHeaderBytes(parsableByteArray);
        while (parsableByteArray.getPosition() < i2) {
            int position = parsableByteArray.getPosition();
            int i3 = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1768715124) {
                parsableByteArray.setPosition(position);
                return parseIlst(parsableByteArray, position + i3);
            }
            parsableByteArray.setPosition(position + i3);
        }
        return null;
    }

    @Nullable
    static VexuData parseVideoExtendedUsageBox(ParsableByteArray parsableByteArray, int i2, int i3) throws ParserException {
        parsableByteArray.setPosition(i2 + 8);
        int position = parsableByteArray.getPosition();
        EyesData stereoViewBox = null;
        while (position - i2 < i3) {
            parsableByteArray.setPosition(position);
            int i5 = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(i5 > 0, "childAtomSize must be positive");
            if (parsableByteArray.readInt() == 1702454643) {
                stereoViewBox = parseStereoViewBox(parsableByteArray, position, i5);
            }
            position += i5;
        }
        if (stereoViewBox == null) {
            return null;
        }
        return new VexuData(stereoViewBox);
    }

    private BoxParser() {
    }

    private static int findBoxPosition(ParsableByteArray parsableByteArray, int i2, int i3, int i5) throws ParserException {
        boolean z2;
        boolean z3;
        int position = parsableByteArray.getPosition();
        if (position >= i3) {
            z2 = true;
        } else {
            z2 = false;
        }
        ExtractorUtil.checkContainerInput(z2, null);
        while (position - i3 < i5) {
            parsableByteArray.setPosition(position);
            int i7 = parsableByteArray.readInt();
            if (i7 > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            ExtractorUtil.checkContainerInput(z3, "childAtomSize must be positive");
            if (parsableByteArray.readInt() == i2) {
                return position;
            }
            position += i7;
        }
        return -1;
    }

    public static void maybeSkipRemainingMetaBoxHeaderBytes(ParsableByteArray parsableByteArray) {
        int position = parsableByteArray.getPosition();
        parsableByteArray.skipBytes(4);
        if (parsableByteArray.readInt() != 1751411826) {
            position += 4;
        }
        parsableByteArray.setPosition(position);
    }

    @Nullable
    private static Pair<long[], long[]> parseEdts(Mp4Box.ContainerBox containerBox) {
        long unsignedInt;
        long j2;
        Mp4Box.LeafBox leafBoxOfType = containerBox.getLeafBoxOfType(Mp4Box.TYPE_elst);
        if (leafBoxOfType == null) {
            return null;
        }
        ParsableByteArray parsableByteArray = leafBoxOfType.data;
        parsableByteArray.setPosition(8);
        int fullBoxVersion = parseFullBoxVersion(parsableByteArray.readInt());
        int unsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        long[] jArr = new long[unsignedIntToInt];
        long[] jArr2 = new long[unsignedIntToInt];
        for (int i2 = 0; i2 < unsignedIntToInt; i2++) {
            if (fullBoxVersion == 1) {
                unsignedInt = parsableByteArray.readUnsignedLongToLong();
            } else {
                unsignedInt = parsableByteArray.readUnsignedInt();
            }
            jArr[i2] = unsignedInt;
            if (fullBoxVersion == 1) {
                j2 = parsableByteArray.readLong();
            } else {
                j2 = parsableByteArray.readInt();
            }
            jArr2[i2] = j2;
            if (parsableByteArray.readShort() == 1) {
                parsableByteArray.skipBytes(2);
            } else {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
        }
        return Pair.create(jArr, jArr2);
    }

    private static int parseExpandableClassSize(ParsableByteArray parsableByteArray) {
        int unsignedByte = parsableByteArray.readUnsignedByte();
        int i2 = unsignedByte & 127;
        while ((unsignedByte & 128) == 128) {
            unsignedByte = parsableByteArray.readUnsignedByte();
            i2 = (i2 << 7) | (unsignedByte & 127);
        }
        return i2;
    }

    @Nullable
    public static Metadata parseMdtaFromMeta(Mp4Box.ContainerBox containerBox) {
        Mp4Box.LeafBox leafBoxOfType = containerBox.getLeafBoxOfType(Mp4Box.TYPE_hdlr);
        Mp4Box.LeafBox leafBoxOfType2 = containerBox.getLeafBoxOfType(Mp4Box.TYPE_keys);
        Mp4Box.LeafBox leafBoxOfType3 = containerBox.getLeafBoxOfType(Mp4Box.TYPE_ilst);
        if (leafBoxOfType == null || leafBoxOfType2 == null || leafBoxOfType3 == null || parseHdlr(leafBoxOfType.data) != TYPE_mdta) {
            return null;
        }
        ParsableByteArray parsableByteArray = leafBoxOfType2.data;
        parsableByteArray.setPosition(12);
        int i2 = parsableByteArray.readInt();
        String[] strArr = new String[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            int i5 = parsableByteArray.readInt();
            parsableByteArray.skipBytes(4);
            strArr[i3] = parsableByteArray.readString(i5 - 8);
        }
        ParsableByteArray parsableByteArray2 = leafBoxOfType3.data;
        parsableByteArray2.setPosition(8);
        ArrayList arrayList = new ArrayList();
        while (parsableByteArray2.bytesLeft() > 8) {
            int position = parsableByteArray2.getPosition();
            int i7 = parsableByteArray2.readInt();
            int i8 = parsableByteArray2.readInt() - 1;
            if (i8 >= 0 && i8 < i2) {
                MdtaMetadataEntry mdtaMetadataEntryFromIlst = MetadataUtil.parseMdtaMetadataEntryFromIlst(parsableByteArray2, position + i7, strArr[i8]);
                if (mdtaMetadataEntryFromIlst != null) {
                    arrayList.add(mdtaMetadataEntryFromIlst);
                }
            } else {
                Log.w(TAG, "Skipped metadata with unknown key index: " + i8);
            }
            parsableByteArray2.setPosition(position + i7);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    @Nullable
    private static Pair<Integer, TrackEncryptionBox> parseSampleEntryEncryptionData(ParsableByteArray parsableByteArray, int i2, int i3) throws ParserException {
        boolean z2;
        Pair<Integer, TrackEncryptionBox> commonEncryptionSinfFromParent;
        int position = parsableByteArray.getPosition();
        while (position - i2 < i3) {
            parsableByteArray.setPosition(position);
            int i5 = parsableByteArray.readInt();
            if (i5 > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            ExtractorUtil.checkContainerInput(z2, "childAtomSize must be positive");
            if (parsableByteArray.readInt() == 1936289382 && (commonEncryptionSinfFromParent = parseCommonEncryptionSinfFromParent(parsableByteArray, position, i5)) != null) {
                return commonEncryptionSinfFromParent;
            }
            position += i5;
        }
        return null;
    }
}
