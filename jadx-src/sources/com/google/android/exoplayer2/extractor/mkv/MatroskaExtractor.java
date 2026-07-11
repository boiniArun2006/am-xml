package com.google.android.exoplayer2.extractor.mkv;

import YgZ.uQga.IYJfqUyym;
import android.util.Pair;
import android.util.SparseArray;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import androidx.constraintlayout.core.dsl.kYF.obbPUqyhtS;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.extractor.ChunkIndex;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.TrueHdSampleRechunker;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.LongArray;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.AvcConfig;
import com.google.android.exoplayer2.video.ColorInfo;
import com.google.android.exoplayer2.video.DolbyVisionConfig;
import com.google.android.exoplayer2.video.HevcConfig;
import com.google.common.collect.nKK;
import java.io.IOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public class MatroskaExtractor implements Extractor {
    private static final int BLOCK_ADDITIONAL_ID_VP9_ITU_T_35 = 4;
    private static final int BLOCK_ADD_ID_TYPE_DVCC = 1685480259;
    private static final int BLOCK_ADD_ID_TYPE_DVVC = 1685485123;
    private static final int BLOCK_STATE_DATA = 2;
    private static final int BLOCK_STATE_HEADER = 1;
    private static final int BLOCK_STATE_START = 0;
    private static final String CODEC_ID_AAC = "A_AAC";
    private static final String CODEC_ID_AC3 = "A_AC3";
    private static final String CODEC_ID_ACM = "A_MS/ACM";
    private static final String CODEC_ID_ASS = "S_TEXT/ASS";
    private static final String CODEC_ID_AV1 = "V_AV1";
    private static final String CODEC_ID_DTS = "A_DTS";
    private static final String CODEC_ID_DTS_EXPRESS = "A_DTS/EXPRESS";
    private static final String CODEC_ID_DTS_LOSSLESS = "A_DTS/LOSSLESS";
    private static final String CODEC_ID_DVBSUB = "S_DVBSUB";
    private static final String CODEC_ID_E_AC3 = "A_EAC3";
    private static final String CODEC_ID_FLAC = "A_FLAC";
    private static final String CODEC_ID_FOURCC = "V_MS/VFW/FOURCC";
    private static final String CODEC_ID_H264 = "V_MPEG4/ISO/AVC";
    private static final String CODEC_ID_H265 = "V_MPEGH/ISO/HEVC";
    private static final String CODEC_ID_MP2 = "A_MPEG/L2";
    private static final String CODEC_ID_MP3 = "A_MPEG/L3";
    private static final String CODEC_ID_MPEG2 = "V_MPEG2";
    private static final String CODEC_ID_MPEG4_AP = "V_MPEG4/ISO/AP";
    private static final String CODEC_ID_MPEG4_ASP = "V_MPEG4/ISO/ASP";
    private static final String CODEC_ID_MPEG4_SP = "V_MPEG4/ISO/SP";
    private static final String CODEC_ID_OPUS = "A_OPUS";
    private static final String CODEC_ID_PCM_FLOAT = "A_PCM/FLOAT/IEEE";
    private static final String CODEC_ID_PCM_INT_BIG = "A_PCM/INT/BIG";
    private static final String CODEC_ID_PCM_INT_LIT = "A_PCM/INT/LIT";
    private static final String CODEC_ID_PGS = "S_HDMV/PGS";
    private static final String CODEC_ID_SUBRIP = "S_TEXT/UTF8";
    private static final String CODEC_ID_THEORA = "V_THEORA";
    private static final String CODEC_ID_TRUEHD = "A_TRUEHD";
    private static final String CODEC_ID_VOBSUB = "S_VOBSUB";
    private static final String CODEC_ID_VORBIS = "A_VORBIS";
    private static final String CODEC_ID_VP8 = "V_VP8";
    private static final String CODEC_ID_VP9 = "V_VP9";
    private static final String CODEC_ID_VTT = "S_TEXT/WEBVTT";
    private static final String DOC_TYPE_MATROSKA = "matroska";
    private static final String DOC_TYPE_WEBM = "webm";
    private static final int ENCRYPTION_IV_SIZE = 8;
    public static final int FLAG_DISABLE_SEEK_FOR_CUES = 1;
    private static final int FOURCC_COMPRESSION_DIVX = 1482049860;
    private static final int FOURCC_COMPRESSION_H263 = 859189832;
    private static final int FOURCC_COMPRESSION_VC1 = 826496599;
    private static final int ID_AUDIO = 225;
    private static final int ID_AUDIO_BIT_DEPTH = 25188;
    private static final int ID_BLOCK = 161;
    private static final int ID_BLOCK_ADDITIONAL = 165;
    private static final int ID_BLOCK_ADDITIONS = 30113;
    private static final int ID_BLOCK_ADDITION_MAPPING = 16868;
    private static final int ID_BLOCK_ADD_ID = 238;
    private static final int ID_BLOCK_ADD_ID_EXTRA_DATA = 16877;
    private static final int ID_BLOCK_ADD_ID_TYPE = 16871;
    private static final int ID_BLOCK_DURATION = 155;
    private static final int ID_BLOCK_GROUP = 160;
    private static final int ID_BLOCK_MORE = 166;
    private static final int ID_CHANNELS = 159;
    private static final int ID_CLUSTER = 524531317;
    private static final int ID_CODEC_DELAY = 22186;
    private static final int ID_CODEC_ID = 134;
    private static final int ID_CODEC_PRIVATE = 25506;
    private static final int ID_COLOUR = 21936;
    private static final int ID_COLOUR_PRIMARIES = 21947;
    private static final int ID_COLOUR_RANGE = 21945;
    private static final int ID_COLOUR_TRANSFER = 21946;
    private static final int ID_CONTENT_COMPRESSION = 20532;
    private static final int ID_CONTENT_COMPRESSION_ALGORITHM = 16980;
    private static final int ID_CONTENT_COMPRESSION_SETTINGS = 16981;
    private static final int ID_CONTENT_ENCODING = 25152;
    private static final int ID_CONTENT_ENCODINGS = 28032;
    private static final int ID_CONTENT_ENCODING_ORDER = 20529;
    private static final int ID_CONTENT_ENCODING_SCOPE = 20530;
    private static final int ID_CONTENT_ENCRYPTION = 20533;
    private static final int ID_CONTENT_ENCRYPTION_AES_SETTINGS = 18407;
    private static final int ID_CONTENT_ENCRYPTION_AES_SETTINGS_CIPHER_MODE = 18408;
    private static final int ID_CONTENT_ENCRYPTION_ALGORITHM = 18401;
    private static final int ID_CONTENT_ENCRYPTION_KEY_ID = 18402;
    private static final int ID_CUES = 475249515;
    private static final int ID_CUE_CLUSTER_POSITION = 241;
    private static final int ID_CUE_POINT = 187;
    private static final int ID_CUE_TIME = 179;
    private static final int ID_CUE_TRACK_POSITIONS = 183;
    private static final int ID_DEFAULT_DURATION = 2352003;
    private static final int ID_DISCARD_PADDING = 30114;
    private static final int ID_DISPLAY_HEIGHT = 21690;
    private static final int ID_DISPLAY_UNIT = 21682;
    private static final int ID_DISPLAY_WIDTH = 21680;
    private static final int ID_DOC_TYPE = 17026;
    private static final int ID_DOC_TYPE_READ_VERSION = 17029;
    private static final int ID_DURATION = 17545;
    private static final int ID_EBML = 440786851;
    private static final int ID_EBML_READ_VERSION = 17143;
    private static final int ID_FLAG_DEFAULT = 136;
    private static final int ID_FLAG_FORCED = 21930;
    private static final int ID_INFO = 357149030;
    private static final int ID_LANGUAGE = 2274716;
    private static final int ID_LUMNINANCE_MAX = 21977;
    private static final int ID_LUMNINANCE_MIN = 21978;
    private static final int ID_MASTERING_METADATA = 21968;
    private static final int ID_MAX_BLOCK_ADDITION_ID = 21998;
    private static final int ID_MAX_CLL = 21948;
    private static final int ID_MAX_FALL = 21949;
    private static final int ID_NAME = 21358;
    private static final int ID_PIXEL_HEIGHT = 186;
    private static final int ID_PIXEL_WIDTH = 176;
    private static final int ID_PRIMARY_B_CHROMATICITY_X = 21973;
    private static final int ID_PRIMARY_B_CHROMATICITY_Y = 21974;
    private static final int ID_PRIMARY_G_CHROMATICITY_X = 21971;
    private static final int ID_PRIMARY_G_CHROMATICITY_Y = 21972;
    private static final int ID_PRIMARY_R_CHROMATICITY_X = 21969;
    private static final int ID_PRIMARY_R_CHROMATICITY_Y = 21970;
    private static final int ID_PROJECTION = 30320;
    private static final int ID_PROJECTION_POSE_PITCH = 30324;
    private static final int ID_PROJECTION_POSE_ROLL = 30325;
    private static final int ID_PROJECTION_POSE_YAW = 30323;
    private static final int ID_PROJECTION_PRIVATE = 30322;
    private static final int ID_PROJECTION_TYPE = 30321;
    private static final int ID_REFERENCE_BLOCK = 251;
    private static final int ID_SAMPLING_FREQUENCY = 181;
    private static final int ID_SEEK = 19899;
    private static final int ID_SEEK_HEAD = 290298740;
    private static final int ID_SEEK_ID = 21419;
    private static final int ID_SEEK_POSITION = 21420;
    private static final int ID_SEEK_PRE_ROLL = 22203;
    private static final int ID_SEGMENT = 408125543;
    private static final int ID_SEGMENT_INFO = 357149030;
    private static final int ID_SIMPLE_BLOCK = 163;
    private static final int ID_STEREO_MODE = 21432;
    private static final int ID_TIMECODE_SCALE = 2807729;
    private static final int ID_TIME_CODE = 231;
    private static final int ID_TRACKS = 374648427;
    private static final int ID_TRACK_ENTRY = 174;
    private static final int ID_TRACK_NUMBER = 215;
    private static final int ID_TRACK_TYPE = 131;
    private static final int ID_VIDEO = 224;
    private static final int ID_WHITE_POINT_CHROMATICITY_X = 21975;
    private static final int ID_WHITE_POINT_CHROMATICITY_Y = 21976;
    private static final int LACING_EBML = 3;
    private static final int LACING_FIXED_SIZE = 2;
    private static final int LACING_NONE = 0;
    private static final int LACING_XIPH = 1;
    private static final int OPUS_MAX_INPUT_SIZE = 5760;
    private static final int SSA_PREFIX_END_TIMECODE_OFFSET = 21;
    private static final String SSA_TIMECODE_FORMAT = "%01d:%02d:%02d:%02d";
    private static final long SSA_TIMECODE_LAST_VALUE_SCALING_FACTOR = 10000;
    private static final int SUBRIP_PREFIX_END_TIMECODE_OFFSET = 19;
    private static final String SUBRIP_TIMECODE_FORMAT = "%02d:%02d:%02d,%03d";
    private static final long SUBRIP_TIMECODE_LAST_VALUE_SCALING_FACTOR = 1000;
    private static final String TAG = "MatroskaExtractor";
    private static final Map<String, Integer> TRACK_NAME_TO_ROTATION_DEGREES;
    private static final int TRACK_TYPE_AUDIO = 2;
    private static final int UNSET_ENTRY_ID = -1;
    private static final int VORBIS_MAX_INPUT_SIZE = 8192;
    private static final int VTT_PREFIX_END_TIMECODE_OFFSET = 25;
    private static final String VTT_TIMECODE_FORMAT = "%02d:%02d:%02d.%03d";
    private static final long VTT_TIMECODE_LAST_VALUE_SCALING_FACTOR = 1000;
    private static final int WAVE_FORMAT_EXTENSIBLE = 65534;
    private static final int WAVE_FORMAT_PCM = 1;
    private static final int WAVE_FORMAT_SIZE = 18;
    private int blockAdditionalId;
    private long blockDurationUs;
    private int blockFlags;
    private long blockGroupDiscardPaddingNs;
    private boolean blockHasReferenceBlock;
    private int blockSampleCount;
    private int blockSampleIndex;
    private int[] blockSampleSizes;
    private int blockState;
    private long blockTimeUs;
    private int blockTrackNumber;
    private int blockTrackNumberLength;
    private long clusterTimecodeUs;

    @Nullable
    private LongArray cueClusterPositions;

    @Nullable
    private LongArray cueTimesUs;
    private long cuesContentPosition;

    @Nullable
    private Track currentTrack;
    private long durationTimecode;
    private long durationUs;
    private final ParsableByteArray encryptionInitializationVector;
    private final ParsableByteArray encryptionSubsampleData;
    private ByteBuffer encryptionSubsampleDataBuffer;
    private ExtractorOutput extractorOutput;
    private boolean haveOutputSample;
    private final ParsableByteArray nalLength;
    private final ParsableByteArray nalStartCode;
    private final com.google.android.exoplayer2.extractor.mkv.n reader;
    private int sampleBytesRead;
    private int sampleBytesWritten;
    private int sampleCurrentNalBytesRemaining;
    private boolean sampleEncodingHandled;
    private boolean sampleInitializationVectorRead;
    private int samplePartitionCount;
    private boolean samplePartitionCountRead;
    private byte sampleSignalByte;
    private boolean sampleSignalByteRead;
    private final ParsableByteArray sampleStrippedBytes;
    private final ParsableByteArray scratch;
    private int seekEntryId;
    private final ParsableByteArray seekEntryIdBytes;
    private long seekEntryPosition;
    private boolean seekForCues;
    private final boolean seekForCuesEnabled;
    private long seekPositionAfterBuildingCues;
    private boolean seenClusterPositionForCurrentCuePoint;
    private long segmentContentPosition;
    private long segmentContentSize;
    private boolean sentSeekMap;
    private final ParsableByteArray subtitleSample;
    private final ParsableByteArray supplementalData;
    private long timecodeScale;
    private final SparseArray<Track> tracks;
    private final I28 varintReader;
    private final ParsableByteArray vorbisNumPageSamples;
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: com.google.android.exoplayer2.extractor.mkv.w6
        @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
        public final Extractor[] createExtractors() {
            return MatroskaExtractor.n();
        }
    };
    private static final byte[] SUBRIP_PREFIX = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] SSA_DIALOGUE_FORMAT = Util.getUtf8Bytes("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
    private static final byte[] SSA_PREFIX = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    private static final byte[] VTT_PREFIX = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
    private static final UUID WAVE_SUBFORMAT_PCM = new UUID(72057594037932032L, -9223371306706625679L);

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    protected static final class Track {
        private static final int DEFAULT_MAX_CLL = 1000;
        private static final int DEFAULT_MAX_FALL = 200;
        private static final int DISPLAY_UNIT_PIXELS = 0;
        private static final int MAX_CHROMATICITY = 50000;
        private int blockAddIdType;
        public String codecId;
        public byte[] codecPrivate;
        public TrackOutput.CryptoData cryptoData;
        public int defaultSampleDurationNs;
        public byte[] dolbyVisionConfigBytes;
        public DrmInitData drmInitData;
        public boolean flagForced;
        public boolean hasContentEncryption;
        public int maxBlockAdditionId;
        public int nalUnitLengthFieldLength;
        public String name;
        public int number;
        public TrackOutput output;
        public byte[] sampleStrippedBytes;
        public TrueHdSampleRechunker trueHdSampleRechunker;
        public int type;
        public int width = -1;
        public int height = -1;
        public int displayWidth = -1;
        public int displayHeight = -1;
        public int displayUnit = 0;
        public int projectionType = -1;
        public float projectionPoseYaw = 0.0f;
        public float projectionPosePitch = 0.0f;
        public float projectionPoseRoll = 0.0f;
        public byte[] projectionData = null;
        public int stereoMode = -1;
        public boolean hasColorInfo = false;
        public int colorSpace = -1;
        public int colorTransfer = -1;
        public int colorRange = -1;
        public int maxContentLuminance = 1000;
        public int maxFrameAverageLuminance = 200;
        public float primaryRChromaticityX = -1.0f;
        public float primaryRChromaticityY = -1.0f;
        public float primaryGChromaticityX = -1.0f;
        public float primaryGChromaticityY = -1.0f;
        public float primaryBChromaticityX = -1.0f;
        public float primaryBChromaticityY = -1.0f;
        public float whitePointChromaticityX = -1.0f;
        public float whitePointChromaticityY = -1.0f;
        public float maxMasteringLuminance = -1.0f;
        public float minMasteringLuminance = -1.0f;
        public int channelCount = 1;
        public int audioBitDepth = -1;
        public int sampleRate = 8000;
        public long codecDelayNs = 0;
        public long seekPreRollNs = 0;
        public boolean flagDefault = true;
        private String language = "eng";

        /* JADX INFO: Access modifiers changed from: private */
        public void assertOutputInitialized() {
            Assertions.checkNotNull(this.output);
        }

        private byte[] getCodecPrivate(String str) throws ParserException {
            byte[] bArr = this.codecPrivate;
            if (bArr != null) {
                return bArr;
            }
            throw ParserException.createForMalformedContainer("Missing CodecPrivate for codec " + str, null);
        }

        @Nullable
        private byte[] getHdrStaticInfo() {
            if (this.primaryRChromaticityX == -1.0f || this.primaryRChromaticityY == -1.0f || this.primaryGChromaticityX == -1.0f || this.primaryGChromaticityY == -1.0f || this.primaryBChromaticityX == -1.0f || this.primaryBChromaticityY == -1.0f || this.whitePointChromaticityX == -1.0f || this.whitePointChromaticityY == -1.0f || this.maxMasteringLuminance == -1.0f || this.minMasteringLuminance == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.put((byte) 0);
            byteBufferOrder.putShort((short) ((this.primaryRChromaticityX * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.primaryRChromaticityY * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.primaryGChromaticityX * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.primaryGChromaticityY * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.primaryBChromaticityX * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.primaryBChromaticityY * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.whitePointChromaticityX * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.whitePointChromaticityY * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) (this.maxMasteringLuminance + 0.5f));
            byteBufferOrder.putShort((short) (this.minMasteringLuminance + 0.5f));
            byteBufferOrder.putShort((short) this.maxContentLuminance);
            byteBufferOrder.putShort((short) this.maxFrameAverageLuminance);
            return bArr;
        }

        private static Pair<String, List<byte[]>> parseFourCcPrivate(ParsableByteArray parsableByteArray) throws ParserException {
            try {
                parsableByteArray.skipBytes(16);
                long littleEndianUnsignedInt = parsableByteArray.readLittleEndianUnsignedInt();
                if (littleEndianUnsignedInt == 1482049860) {
                    return new Pair<>("video/divx", null);
                }
                if (littleEndianUnsignedInt == 859189832) {
                    return new Pair<>("video/3gpp", null);
                }
                if (littleEndianUnsignedInt != 826496599) {
                    Log.w(MatroskaExtractor.TAG, "Unknown FourCC. Setting mimeType to video/x-unknown");
                    return new Pair<>("video/x-unknown", null);
                }
                byte[] data = parsableByteArray.getData();
                for (int position = parsableByteArray.getPosition() + 20; position < data.length - 4; position++) {
                    if (data[position] == 0 && data[position + 1] == 0 && data[position + 2] == 1 && data[position + 3] == 15) {
                        return new Pair<>("video/wvc1", Collections.singletonList(Arrays.copyOfRange(data, position, data.length)));
                    }
                }
                throw ParserException.createForMalformedContainer("Failed to find FourCC VC1 initialization data", null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.createForMalformedContainer("Error parsing FourCC private data", null);
            }
        }

        private static List<byte[]> parseVorbisCodecPrivate(byte[] bArr) throws ParserException {
            int i2;
            int i3;
            try {
                if (bArr[0] != 2) {
                    throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                int i5 = 0;
                int i7 = 1;
                while (true) {
                    i2 = bArr[i7];
                    if ((i2 & 255) != 255) {
                        break;
                    }
                    i5 += 255;
                    i7++;
                }
                int i8 = i7 + 1;
                int i9 = i5 + (i2 & 255);
                int i10 = 0;
                while (true) {
                    i3 = bArr[i8];
                    if ((i3 & 255) != 255) {
                        break;
                    }
                    i10 += 255;
                    i8++;
                }
                int i11 = i8 + 1;
                int i12 = i10 + (i3 & 255);
                if (bArr[i11] != 1) {
                    throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                byte[] bArr2 = new byte[i9];
                System.arraycopy(bArr, i11, bArr2, 0, i9);
                int i13 = i11 + i9;
                if (bArr[i13] != 3) {
                    throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                int i14 = i13 + i12;
                if (bArr[i14] != 5) {
                    throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
                }
                byte[] bArr3 = new byte[bArr.length - i14];
                System.arraycopy(bArr, i14, bArr3, 0, bArr.length - i14);
                ArrayList arrayList = new ArrayList(2);
                arrayList.add(bArr2);
                arrayList.add(bArr3);
                return arrayList;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.createForMalformedContainer("Error parsing vorbis codec private", null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean samplesHaveSupplementalData(boolean z2) {
            return MatroskaExtractor.CODEC_ID_OPUS.equals(this.codecId) ? z2 : this.maxBlockAdditionId > 0;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:205:0x0423  */
        /* JADX WARN: Removed duplicated region for block: B:210:0x043a  */
        /* JADX WARN: Removed duplicated region for block: B:211:0x043c  */
        /* JADX WARN: Removed duplicated region for block: B:214:0x0449  */
        /* JADX WARN: Removed duplicated region for block: B:215:0x045b  */
        /* JADX WARN: Removed duplicated region for block: B:281:0x0565  */
        /* JADX WARN: Removed duplicated region for block: B:4:0x0028  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void initializeOutput(ExtractorOutput extractorOutput, int i2) throws ParserException {
            byte b2;
            List<byte[]> listSingletonList;
            int i3;
            String str;
            int i5;
            List<byte[]> list;
            String str2;
            int pcmEncoding;
            byte[] bArr;
            String str3;
            Format.Builder builder;
            int i7;
            int iIntValue;
            int i8;
            DolbyVisionConfig dolbyVisionConfig;
            String str4 = this.codecId;
            str4.getClass();
            String str5 = "audio/raw";
            switch (str4.hashCode()) {
                case -2095576542:
                    b2 = !str4.equals(MatroskaExtractor.CODEC_ID_MPEG4_AP) ? (byte) -1 : (byte) 0;
                    break;
                case -2095575984:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_MPEG4_SP)) {
                        b2 = 1;
                        break;
                    }
                    break;
                case -1985379776:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_ACM)) {
                        b2 = 2;
                        break;
                    }
                    break;
                case -1784763192:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_TRUEHD)) {
                        b2 = 3;
                        break;
                    }
                    break;
                case -1730367663:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_VORBIS)) {
                        b2 = 4;
                        break;
                    }
                    break;
                case -1482641358:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_MP2)) {
                        b2 = 5;
                        break;
                    }
                    break;
                case -1482641357:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_MP3)) {
                        b2 = 6;
                        break;
                    }
                    break;
                case -1373388978:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_FOURCC)) {
                        b2 = 7;
                        break;
                    }
                    break;
                case -933872740:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_DVBSUB)) {
                        b2 = 8;
                        break;
                    }
                    break;
                case -538363189:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_MPEG4_ASP)) {
                        b2 = 9;
                        break;
                    }
                    break;
                case -538363109:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_H264)) {
                        b2 = 10;
                        break;
                    }
                    break;
                case -425012669:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_VOBSUB)) {
                        b2 = 11;
                        break;
                    }
                    break;
                case -356037306:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_DTS_LOSSLESS)) {
                        b2 = 12;
                        break;
                    }
                    break;
                case 62923557:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_AAC)) {
                        b2 = 13;
                        break;
                    }
                    break;
                case 62923603:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_AC3)) {
                        b2 = 14;
                        break;
                    }
                    break;
                case 62927045:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_DTS)) {
                        b2 = 15;
                        break;
                    }
                    break;
                case 82318131:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_AV1)) {
                        b2 = 16;
                        break;
                    }
                    break;
                case 82338133:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_VP8)) {
                        b2 = 17;
                        break;
                    }
                    break;
                case 82338134:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_VP9)) {
                        b2 = 18;
                        break;
                    }
                    break;
                case 99146302:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_PGS)) {
                        b2 = 19;
                        break;
                    }
                    break;
                case 444813526:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_THEORA)) {
                        b2 = 20;
                        break;
                    }
                    break;
                case 542569478:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_DTS_EXPRESS)) {
                        b2 = 21;
                        break;
                    }
                    break;
                case 635596514:
                    if (str4.equals(IYJfqUyym.MXFyPocIt)) {
                        b2 = 22;
                        break;
                    }
                    break;
                case 725948237:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_PCM_INT_BIG)) {
                        b2 = 23;
                        break;
                    }
                    break;
                case 725957860:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_PCM_INT_LIT)) {
                        b2 = 24;
                        break;
                    }
                    break;
                case 738597099:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_ASS)) {
                        b2 = 25;
                        break;
                    }
                    break;
                case 855502857:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_H265)) {
                        b2 = 26;
                        break;
                    }
                    break;
                case 1045209816:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_VTT)) {
                        b2 = 27;
                        break;
                    }
                    break;
                case 1422270023:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_SUBRIP)) {
                        b2 = 28;
                        break;
                    }
                    break;
                case 1809237540:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_MPEG2)) {
                        b2 = 29;
                        break;
                    }
                    break;
                case 1950749482:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_E_AC3)) {
                        b2 = 30;
                        break;
                    }
                    break;
                case 1950789798:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_FLAC)) {
                        b2 = 31;
                        break;
                    }
                    break;
                case 1951062397:
                    if (str4.equals(MatroskaExtractor.CODEC_ID_OPUS)) {
                        b2 = 32;
                        break;
                    }
                    break;
            }
            switch (b2) {
                case 0:
                case 1:
                case 9:
                    byte[] bArr2 = this.codecPrivate;
                    listSingletonList = bArr2 == null ? null : Collections.singletonList(bArr2);
                    str5 = "video/mp4v-es";
                    str = null;
                    i3 = -1;
                    i5 = -1;
                    bArr = this.dolbyVisionConfigBytes;
                    if (bArr != null && (dolbyVisionConfig = DolbyVisionConfig.parse(new ParsableByteArray(bArr))) != null) {
                        str = dolbyVisionConfig.codecs;
                        str5 = "video/dolby-vision";
                    }
                    str3 = str5;
                    int i9 = (this.flagForced ? 2 : 0) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                        builder.setChannelCount(this.channelCount).setSampleRate(this.sampleRate).setPcmEncoding(i3);
                        i7 = 1;
                    } else if (MimeTypes.isVideo(str3)) {
                        if (this.displayUnit == 0) {
                            int i10 = this.displayWidth;
                            iIntValue = -1;
                            if (i10 == -1) {
                                i10 = this.width;
                            }
                            this.displayWidth = i10;
                            int i11 = this.displayHeight;
                            if (i11 == -1) {
                                i11 = this.height;
                            }
                            this.displayHeight = i11;
                        } else {
                            iIntValue = -1;
                        }
                        float f3 = (this.displayWidth == iIntValue || (i8 = this.displayHeight) == iIntValue) ? -1.0f : (this.height * r3) / (this.width * i8);
                        ColorInfo colorInfo = this.hasColorInfo ? new ColorInfo(this.colorSpace, this.colorRange, this.colorTransfer, getHdrStaticInfo()) : null;
                        if (this.name != null && MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.containsKey(this.name)) {
                            iIntValue = ((Integer) MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.get(this.name)).intValue();
                        }
                        if (this.projectionType == 0 && Float.compare(this.projectionPoseYaw, 0.0f) == 0 && Float.compare(this.projectionPosePitch, 0.0f) == 0) {
                            if (Float.compare(this.projectionPoseRoll, 0.0f) == 0) {
                                iIntValue = 0;
                            } else if (Float.compare(this.projectionPosePitch, 90.0f) == 0) {
                                iIntValue = 90;
                            } else if (Float.compare(this.projectionPosePitch, -180.0f) == 0 || Float.compare(this.projectionPosePitch, 180.0f) == 0) {
                                iIntValue = 180;
                            } else if (Float.compare(this.projectionPosePitch, -90.0f) == 0) {
                                iIntValue = 270;
                            }
                        }
                        builder.setWidth(this.width).setHeight(this.height).setPixelWidthHeightRatio(f3).setRotationDegrees(iIntValue).setProjectionData(this.projectionData).setStereoMode(this.stereoMode).setColorInfo(colorInfo);
                        i7 = 2;
                    } else {
                        if (!"application/x-subrip".equals(str3) && !"text/x-ssa".equals(str3) && !"text/vtt".equals(str3) && !"application/vobsub".equals(str3) && !"application/pgs".equals(str3) && !"application/dvbsubs".equals(str3)) {
                            throw ParserException.createForMalformedContainer("Unexpected MIME type.", null);
                        }
                        i7 = 3;
                    }
                    if (this.name != null && !MatroskaExtractor.TRACK_NAME_TO_ROTATION_DEGREES.containsKey(this.name)) {
                        builder.setLabel(this.name);
                    }
                    Format formatBuild = builder.setId(i2).setSampleMimeType(str3).setMaxInputSize(i5).setLanguage(this.language).setSelectionFlags(i9).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack = extractorOutput.track(this.number, i7);
                    this.output = trackOutputTrack;
                    trackOutputTrack.format(formatBuild);
                    return;
                case 2:
                    if (parseMsAcmCodecPrivate(new ParsableByteArray(getCodecPrivate(this.codecId)))) {
                        int pcmEncoding2 = Util.getPcmEncoding(this.audioBitDepth);
                        if (pcmEncoding2 != 0) {
                            i3 = pcmEncoding2;
                            listSingletonList = null;
                            str = null;
                            i5 = -1;
                            bArr = this.dolbyVisionConfigBytes;
                            if (bArr != null) {
                                str = dolbyVisionConfig.codecs;
                                str5 = "video/dolby-vision";
                            }
                            str3 = str5;
                            int i92 = (this.flagForced ? 2 : 0) | (this.flagDefault ? 1 : 0);
                            builder = new Format.Builder();
                            if (MimeTypes.isAudio(str3)) {
                            }
                            if (this.name != null) {
                                builder.setLabel(this.name);
                            }
                            Format formatBuild2 = builder.setId(i2).setSampleMimeType(str3).setMaxInputSize(i5).setLanguage(this.language).setSelectionFlags(i92).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                            TrackOutput trackOutputTrack2 = extractorOutput.track(this.number, i7);
                            this.output = trackOutputTrack2;
                            trackOutputTrack2.format(formatBuild2);
                            return;
                        }
                        Log.w(MatroskaExtractor.TAG, "Unsupported PCM bit depth: " + this.audioBitDepth + ". Setting mimeType to audio/x-unknown");
                    } else {
                        Log.w(MatroskaExtractor.TAG, "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                    }
                    str5 = "audio/x-unknown";
                    listSingletonList = null;
                    str = null;
                    i3 = -1;
                    i5 = -1;
                    bArr = this.dolbyVisionConfigBytes;
                    if (bArr != null) {
                    }
                    str3 = str5;
                    int i922 = (this.flagForced ? 2 : 0) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format formatBuild22 = builder.setId(i2).setSampleMimeType(str3).setMaxInputSize(i5).setLanguage(this.language).setSelectionFlags(i922).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack22 = extractorOutput.track(this.number, i7);
                    this.output = trackOutputTrack22;
                    trackOutputTrack22.format(formatBuild22);
                    return;
                case 3:
                    this.trueHdSampleRechunker = new TrueHdSampleRechunker();
                    str5 = "audio/true-hd";
                    listSingletonList = null;
                    str = null;
                    i3 = -1;
                    i5 = -1;
                    bArr = this.dolbyVisionConfigBytes;
                    if (bArr != null) {
                    }
                    str3 = str5;
                    int i9222 = (this.flagForced ? 2 : 0) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format formatBuild222 = builder.setId(i2).setSampleMimeType(str3).setMaxInputSize(i5).setLanguage(this.language).setSelectionFlags(i9222).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack222 = extractorOutput.track(this.number, i7);
                    this.output = trackOutputTrack222;
                    trackOutputTrack222.format(formatBuild222);
                    return;
                case 4:
                    listSingletonList = parseVorbisCodecPrivate(getCodecPrivate(this.codecId));
                    str5 = "audio/vorbis";
                    i5 = 8192;
                    str = null;
                    i3 = -1;
                    bArr = this.dolbyVisionConfigBytes;
                    if (bArr != null) {
                    }
                    str3 = str5;
                    int i92222 = (this.flagForced ? 2 : 0) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format formatBuild2222 = builder.setId(i2).setSampleMimeType(str3).setMaxInputSize(i5).setLanguage(this.language).setSelectionFlags(i92222).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack2222 = extractorOutput.track(this.number, i7);
                    this.output = trackOutputTrack2222;
                    trackOutputTrack2222.format(formatBuild2222);
                    return;
                case 5:
                    str5 = "audio/mpeg-L2";
                    listSingletonList = null;
                    str = null;
                    i3 = -1;
                    i5 = 4096;
                    bArr = this.dolbyVisionConfigBytes;
                    if (bArr != null) {
                    }
                    str3 = str5;
                    int i922222 = (this.flagForced ? 2 : 0) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format formatBuild22222 = builder.setId(i2).setSampleMimeType(str3).setMaxInputSize(i5).setLanguage(this.language).setSelectionFlags(i922222).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack22222 = extractorOutput.track(this.number, i7);
                    this.output = trackOutputTrack22222;
                    trackOutputTrack22222.format(formatBuild22222);
                    return;
                case 6:
                    str5 = "audio/mpeg";
                    listSingletonList = null;
                    str = null;
                    i3 = -1;
                    i5 = 4096;
                    bArr = this.dolbyVisionConfigBytes;
                    if (bArr != null) {
                    }
                    str3 = str5;
                    int i9222222 = (this.flagForced ? 2 : 0) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format formatBuild222222 = builder.setId(i2).setSampleMimeType(str3).setMaxInputSize(i5).setLanguage(this.language).setSelectionFlags(i9222222).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack222222 = extractorOutput.track(this.number, i7);
                    this.output = trackOutputTrack222222;
                    trackOutputTrack222222.format(formatBuild222222);
                    return;
                case 7:
                    Pair<String, List<byte[]>> fourCcPrivate = parseFourCcPrivate(new ParsableByteArray(getCodecPrivate(this.codecId)));
                    str5 = (String) fourCcPrivate.first;
                    listSingletonList = (List) fourCcPrivate.second;
                    str = null;
                    i3 = -1;
                    i5 = -1;
                    bArr = this.dolbyVisionConfigBytes;
                    if (bArr != null) {
                    }
                    str3 = str5;
                    int i92222222 = (this.flagForced ? 2 : 0) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format formatBuild2222222 = builder.setId(i2).setSampleMimeType(str3).setMaxInputSize(i5).setLanguage(this.language).setSelectionFlags(i92222222).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack2222222 = extractorOutput.track(this.number, i7);
                    this.output = trackOutputTrack2222222;
                    trackOutputTrack2222222.format(formatBuild2222222);
                    return;
                case 8:
                    byte[] bArr3 = new byte[4];
                    System.arraycopy(getCodecPrivate(this.codecId), 0, bArr3, 0, 4);
                    listSingletonList = nKK.o(bArr3);
                    str5 = "application/dvbsubs";
                    str = null;
                    i3 = -1;
                    i5 = -1;
                    bArr = this.dolbyVisionConfigBytes;
                    if (bArr != null) {
                    }
                    str3 = str5;
                    int i922222222 = (this.flagForced ? 2 : 0) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format formatBuild22222222 = builder.setId(i2).setSampleMimeType(str3).setMaxInputSize(i5).setLanguage(this.language).setSelectionFlags(i922222222).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack22222222 = extractorOutput.track(this.number, i7);
                    this.output = trackOutputTrack22222222;
                    trackOutputTrack22222222.format(formatBuild22222222);
                    return;
                case 10:
                    AvcConfig avcConfig = AvcConfig.parse(new ParsableByteArray(getCodecPrivate(this.codecId)));
                    list = avcConfig.initializationData;
                    this.nalUnitLengthFieldLength = avcConfig.nalUnitLengthFieldLength;
                    str2 = avcConfig.codecs;
                    str5 = "video/avc";
                    List<byte[]> list2 = list;
                    str = str2;
                    listSingletonList = list2;
                    i3 = -1;
                    i5 = -1;
                    bArr = this.dolbyVisionConfigBytes;
                    if (bArr != null) {
                    }
                    str3 = str5;
                    int i9222222222 = (this.flagForced ? 2 : 0) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format formatBuild222222222 = builder.setId(i2).setSampleMimeType(str3).setMaxInputSize(i5).setLanguage(this.language).setSelectionFlags(i9222222222).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack222222222 = extractorOutput.track(this.number, i7);
                    this.output = trackOutputTrack222222222;
                    trackOutputTrack222222222.format(formatBuild222222222);
                    return;
                case 11:
                    listSingletonList = nKK.o(getCodecPrivate(this.codecId));
                    str5 = "application/vobsub";
                    str = null;
                    i3 = -1;
                    i5 = -1;
                    bArr = this.dolbyVisionConfigBytes;
                    if (bArr != null) {
                    }
                    str3 = str5;
                    int i92222222222 = (this.flagForced ? 2 : 0) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format formatBuild2222222222 = builder.setId(i2).setSampleMimeType(str3).setMaxInputSize(i5).setLanguage(this.language).setSelectionFlags(i92222222222).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack2222222222 = extractorOutput.track(this.number, i7);
                    this.output = trackOutputTrack2222222222;
                    trackOutputTrack2222222222.format(formatBuild2222222222);
                    return;
                case 12:
                    str5 = "audio/vnd.dts.hd";
                    listSingletonList = null;
                    str = null;
                    i3 = -1;
                    i5 = -1;
                    bArr = this.dolbyVisionConfigBytes;
                    if (bArr != null) {
                    }
                    str3 = str5;
                    int i922222222222 = (this.flagForced ? 2 : 0) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format formatBuild22222222222 = builder.setId(i2).setSampleMimeType(str3).setMaxInputSize(i5).setLanguage(this.language).setSelectionFlags(i922222222222).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack22222222222 = extractorOutput.track(this.number, i7);
                    this.output = trackOutputTrack22222222222;
                    trackOutputTrack22222222222.format(formatBuild22222222222);
                    return;
                case 13:
                    listSingletonList = Collections.singletonList(getCodecPrivate(this.codecId));
                    AacUtil.Config audioSpecificConfig = AacUtil.parseAudioSpecificConfig(this.codecPrivate);
                    this.sampleRate = audioSpecificConfig.sampleRateHz;
                    this.channelCount = audioSpecificConfig.channelCount;
                    str = audioSpecificConfig.codecs;
                    str5 = "audio/mp4a-latm";
                    i3 = -1;
                    i5 = -1;
                    bArr = this.dolbyVisionConfigBytes;
                    if (bArr != null) {
                    }
                    str3 = str5;
                    int i9222222222222 = (this.flagForced ? 2 : 0) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format formatBuild222222222222 = builder.setId(i2).setSampleMimeType(str3).setMaxInputSize(i5).setLanguage(this.language).setSelectionFlags(i9222222222222).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack222222222222 = extractorOutput.track(this.number, i7);
                    this.output = trackOutputTrack222222222222;
                    trackOutputTrack222222222222.format(formatBuild222222222222);
                    return;
                case 14:
                    str5 = "audio/ac3";
                    listSingletonList = null;
                    str = null;
                    i3 = -1;
                    i5 = -1;
                    bArr = this.dolbyVisionConfigBytes;
                    if (bArr != null) {
                    }
                    str3 = str5;
                    int i92222222222222 = (this.flagForced ? 2 : 0) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format formatBuild2222222222222 = builder.setId(i2).setSampleMimeType(str3).setMaxInputSize(i5).setLanguage(this.language).setSelectionFlags(i92222222222222).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack2222222222222 = extractorOutput.track(this.number, i7);
                    this.output = trackOutputTrack2222222222222;
                    trackOutputTrack2222222222222.format(formatBuild2222222222222);
                    return;
                case 15:
                case 21:
                    str5 = "audio/vnd.dts";
                    listSingletonList = null;
                    str = null;
                    i3 = -1;
                    i5 = -1;
                    bArr = this.dolbyVisionConfigBytes;
                    if (bArr != null) {
                    }
                    str3 = str5;
                    int i922222222222222 = (this.flagForced ? 2 : 0) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format formatBuild22222222222222 = builder.setId(i2).setSampleMimeType(str3).setMaxInputSize(i5).setLanguage(this.language).setSelectionFlags(i922222222222222).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack22222222222222 = extractorOutput.track(this.number, i7);
                    this.output = trackOutputTrack22222222222222;
                    trackOutputTrack22222222222222.format(formatBuild22222222222222);
                    return;
                case 16:
                    str5 = "video/av01";
                    listSingletonList = null;
                    str = null;
                    i3 = -1;
                    i5 = -1;
                    bArr = this.dolbyVisionConfigBytes;
                    if (bArr != null) {
                    }
                    str3 = str5;
                    int i9222222222222222 = (this.flagForced ? 2 : 0) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format formatBuild222222222222222 = builder.setId(i2).setSampleMimeType(str3).setMaxInputSize(i5).setLanguage(this.language).setSelectionFlags(i9222222222222222).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack222222222222222 = extractorOutput.track(this.number, i7);
                    this.output = trackOutputTrack222222222222222;
                    trackOutputTrack222222222222222.format(formatBuild222222222222222);
                    return;
                case 17:
                    str5 = "video/x-vnd.on2.vp8";
                    listSingletonList = null;
                    str = null;
                    i3 = -1;
                    i5 = -1;
                    bArr = this.dolbyVisionConfigBytes;
                    if (bArr != null) {
                    }
                    str3 = str5;
                    int i92222222222222222 = (this.flagForced ? 2 : 0) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format formatBuild2222222222222222 = builder.setId(i2).setSampleMimeType(str3).setMaxInputSize(i5).setLanguage(this.language).setSelectionFlags(i92222222222222222).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack2222222222222222 = extractorOutput.track(this.number, i7);
                    this.output = trackOutputTrack2222222222222222;
                    trackOutputTrack2222222222222222.format(formatBuild2222222222222222);
                    return;
                case 18:
                    str5 = "video/x-vnd.on2.vp9";
                    listSingletonList = null;
                    str = null;
                    i3 = -1;
                    i5 = -1;
                    bArr = this.dolbyVisionConfigBytes;
                    if (bArr != null) {
                    }
                    str3 = str5;
                    int i922222222222222222 = (this.flagForced ? 2 : 0) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format formatBuild22222222222222222 = builder.setId(i2).setSampleMimeType(str3).setMaxInputSize(i5).setLanguage(this.language).setSelectionFlags(i922222222222222222).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack22222222222222222 = extractorOutput.track(this.number, i7);
                    this.output = trackOutputTrack22222222222222222;
                    trackOutputTrack22222222222222222.format(formatBuild22222222222222222);
                    return;
                case 19:
                    str5 = "application/pgs";
                    listSingletonList = null;
                    str = null;
                    i3 = -1;
                    i5 = -1;
                    bArr = this.dolbyVisionConfigBytes;
                    if (bArr != null) {
                    }
                    str3 = str5;
                    int i9222222222222222222 = (this.flagForced ? 2 : 0) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format formatBuild222222222222222222 = builder.setId(i2).setSampleMimeType(str3).setMaxInputSize(i5).setLanguage(this.language).setSelectionFlags(i9222222222222222222).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack222222222222222222 = extractorOutput.track(this.number, i7);
                    this.output = trackOutputTrack222222222222222222;
                    trackOutputTrack222222222222222222.format(formatBuild222222222222222222);
                    return;
                case 20:
                    str5 = "video/x-unknown";
                    listSingletonList = null;
                    str = null;
                    i3 = -1;
                    i5 = -1;
                    bArr = this.dolbyVisionConfigBytes;
                    if (bArr != null) {
                    }
                    str3 = str5;
                    int i92222222222222222222 = (this.flagForced ? 2 : 0) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format formatBuild2222222222222222222 = builder.setId(i2).setSampleMimeType(str3).setMaxInputSize(i5).setLanguage(this.language).setSelectionFlags(i92222222222222222222).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack2222222222222222222 = extractorOutput.track(this.number, i7);
                    this.output = trackOutputTrack2222222222222222222;
                    trackOutputTrack2222222222222222222.format(formatBuild2222222222222222222);
                    return;
                case 22:
                    if (this.audioBitDepth == 32) {
                        listSingletonList = null;
                        str = null;
                        i3 = 4;
                        i5 = -1;
                        bArr = this.dolbyVisionConfigBytes;
                        if (bArr != null) {
                        }
                        str3 = str5;
                        int i922222222222222222222 = (this.flagForced ? 2 : 0) | (this.flagDefault ? 1 : 0);
                        builder = new Format.Builder();
                        if (MimeTypes.isAudio(str3)) {
                        }
                        if (this.name != null) {
                        }
                        Format formatBuild22222222222222222222 = builder.setId(i2).setSampleMimeType(str3).setMaxInputSize(i5).setLanguage(this.language).setSelectionFlags(i922222222222222222222).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                        TrackOutput trackOutputTrack22222222222222222222 = extractorOutput.track(this.number, i7);
                        this.output = trackOutputTrack22222222222222222222;
                        trackOutputTrack22222222222222222222.format(formatBuild22222222222222222222);
                        return;
                    }
                    Log.w(MatroskaExtractor.TAG, "Unsupported floating point PCM bit depth: " + this.audioBitDepth + ". Setting mimeType to audio/x-unknown");
                    str5 = "audio/x-unknown";
                    listSingletonList = null;
                    str = null;
                    i3 = -1;
                    i5 = -1;
                    bArr = this.dolbyVisionConfigBytes;
                    if (bArr != null) {
                    }
                    str3 = str5;
                    int i9222222222222222222222 = (this.flagForced ? 2 : 0) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format formatBuild222222222222222222222 = builder.setId(i2).setSampleMimeType(str3).setMaxInputSize(i5).setLanguage(this.language).setSelectionFlags(i9222222222222222222222).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack222222222222222222222 = extractorOutput.track(this.number, i7);
                    this.output = trackOutputTrack222222222222222222222;
                    trackOutputTrack222222222222222222222.format(formatBuild222222222222222222222);
                    return;
                case 23:
                    int i12 = this.audioBitDepth;
                    if (i12 == 8) {
                        listSingletonList = null;
                        str = null;
                        i3 = 3;
                        i5 = -1;
                        bArr = this.dolbyVisionConfigBytes;
                        if (bArr != null) {
                        }
                        str3 = str5;
                        int i92222222222222222222222 = (this.flagForced ? 2 : 0) | (this.flagDefault ? 1 : 0);
                        builder = new Format.Builder();
                        if (MimeTypes.isAudio(str3)) {
                        }
                        if (this.name != null) {
                        }
                        Format formatBuild2222222222222222222222 = builder.setId(i2).setSampleMimeType(str3).setMaxInputSize(i5).setLanguage(this.language).setSelectionFlags(i92222222222222222222222).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                        TrackOutput trackOutputTrack2222222222222222222222 = extractorOutput.track(this.number, i7);
                        this.output = trackOutputTrack2222222222222222222222;
                        trackOutputTrack2222222222222222222222.format(formatBuild2222222222222222222222);
                        return;
                    }
                    if (i12 == 16) {
                        pcmEncoding = 268435456;
                        i3 = pcmEncoding;
                        listSingletonList = null;
                        str = null;
                        i5 = -1;
                        bArr = this.dolbyVisionConfigBytes;
                        if (bArr != null) {
                        }
                        str3 = str5;
                        int i922222222222222222222222 = (this.flagForced ? 2 : 0) | (this.flagDefault ? 1 : 0);
                        builder = new Format.Builder();
                        if (MimeTypes.isAudio(str3)) {
                        }
                        if (this.name != null) {
                        }
                        Format formatBuild22222222222222222222222 = builder.setId(i2).setSampleMimeType(str3).setMaxInputSize(i5).setLanguage(this.language).setSelectionFlags(i922222222222222222222222).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                        TrackOutput trackOutputTrack22222222222222222222222 = extractorOutput.track(this.number, i7);
                        this.output = trackOutputTrack22222222222222222222222;
                        trackOutputTrack22222222222222222222222.format(formatBuild22222222222222222222222);
                        return;
                    }
                    Log.w(MatroskaExtractor.TAG, "Unsupported big endian PCM bit depth: " + this.audioBitDepth + ". Setting mimeType to audio/x-unknown");
                    str5 = "audio/x-unknown";
                    listSingletonList = null;
                    str = null;
                    i3 = -1;
                    i5 = -1;
                    bArr = this.dolbyVisionConfigBytes;
                    if (bArr != null) {
                    }
                    str3 = str5;
                    int i9222222222222222222222222 = (this.flagForced ? 2 : 0) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format formatBuild222222222222222222222222 = builder.setId(i2).setSampleMimeType(str3).setMaxInputSize(i5).setLanguage(this.language).setSelectionFlags(i9222222222222222222222222).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack222222222222222222222222 = extractorOutput.track(this.number, i7);
                    this.output = trackOutputTrack222222222222222222222222;
                    trackOutputTrack222222222222222222222222.format(formatBuild222222222222222222222222);
                    return;
                case 24:
                    pcmEncoding = Util.getPcmEncoding(this.audioBitDepth);
                    if (pcmEncoding == 0) {
                        Log.w(MatroskaExtractor.TAG, "Unsupported little endian PCM bit depth: " + this.audioBitDepth + ". Setting mimeType to audio/x-unknown");
                        str5 = "audio/x-unknown";
                        listSingletonList = null;
                        str = null;
                        i3 = -1;
                        i5 = -1;
                        bArr = this.dolbyVisionConfigBytes;
                        if (bArr != null) {
                        }
                        str3 = str5;
                        int i92222222222222222222222222 = (this.flagForced ? 2 : 0) | (this.flagDefault ? 1 : 0);
                        builder = new Format.Builder();
                        if (MimeTypes.isAudio(str3)) {
                        }
                        if (this.name != null) {
                        }
                        Format formatBuild2222222222222222222222222 = builder.setId(i2).setSampleMimeType(str3).setMaxInputSize(i5).setLanguage(this.language).setSelectionFlags(i92222222222222222222222222).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                        TrackOutput trackOutputTrack2222222222222222222222222 = extractorOutput.track(this.number, i7);
                        this.output = trackOutputTrack2222222222222222222222222;
                        trackOutputTrack2222222222222222222222222.format(formatBuild2222222222222222222222222);
                        return;
                    }
                    i3 = pcmEncoding;
                    listSingletonList = null;
                    str = null;
                    i5 = -1;
                    bArr = this.dolbyVisionConfigBytes;
                    if (bArr != null) {
                    }
                    str3 = str5;
                    int i922222222222222222222222222 = (this.flagForced ? 2 : 0) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format formatBuild22222222222222222222222222 = builder.setId(i2).setSampleMimeType(str3).setMaxInputSize(i5).setLanguage(this.language).setSelectionFlags(i922222222222222222222222222).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack22222222222222222222222222 = extractorOutput.track(this.number, i7);
                    this.output = trackOutputTrack22222222222222222222222222;
                    trackOutputTrack22222222222222222222222222.format(formatBuild22222222222222222222222222);
                    return;
                case 25:
                    listSingletonList = nKK.XQ(MatroskaExtractor.SSA_DIALOGUE_FORMAT, getCodecPrivate(this.codecId));
                    str5 = "text/x-ssa";
                    str = null;
                    i3 = -1;
                    i5 = -1;
                    bArr = this.dolbyVisionConfigBytes;
                    if (bArr != null) {
                    }
                    str3 = str5;
                    int i9222222222222222222222222222 = (this.flagForced ? 2 : 0) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format formatBuild222222222222222222222222222 = builder.setId(i2).setSampleMimeType(str3).setMaxInputSize(i5).setLanguage(this.language).setSelectionFlags(i9222222222222222222222222222).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack222222222222222222222222222 = extractorOutput.track(this.number, i7);
                    this.output = trackOutputTrack222222222222222222222222222;
                    trackOutputTrack222222222222222222222222222.format(formatBuild222222222222222222222222222);
                    return;
                case 26:
                    HevcConfig hevcConfig = HevcConfig.parse(new ParsableByteArray(getCodecPrivate(this.codecId)));
                    list = hevcConfig.initializationData;
                    this.nalUnitLengthFieldLength = hevcConfig.nalUnitLengthFieldLength;
                    str2 = hevcConfig.codecs;
                    str5 = "video/hevc";
                    List<byte[]> list22 = list;
                    str = str2;
                    listSingletonList = list22;
                    i3 = -1;
                    i5 = -1;
                    bArr = this.dolbyVisionConfigBytes;
                    if (bArr != null) {
                    }
                    str3 = str5;
                    int i92222222222222222222222222222 = (this.flagForced ? 2 : 0) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format formatBuild2222222222222222222222222222 = builder.setId(i2).setSampleMimeType(str3).setMaxInputSize(i5).setLanguage(this.language).setSelectionFlags(i92222222222222222222222222222).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack2222222222222222222222222222 = extractorOutput.track(this.number, i7);
                    this.output = trackOutputTrack2222222222222222222222222222;
                    trackOutputTrack2222222222222222222222222222.format(formatBuild2222222222222222222222222222);
                    return;
                case 27:
                    str5 = "text/vtt";
                    listSingletonList = null;
                    str = null;
                    i3 = -1;
                    i5 = -1;
                    bArr = this.dolbyVisionConfigBytes;
                    if (bArr != null) {
                    }
                    str3 = str5;
                    int i922222222222222222222222222222 = (this.flagForced ? 2 : 0) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format formatBuild22222222222222222222222222222 = builder.setId(i2).setSampleMimeType(str3).setMaxInputSize(i5).setLanguage(this.language).setSelectionFlags(i922222222222222222222222222222).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack22222222222222222222222222222 = extractorOutput.track(this.number, i7);
                    this.output = trackOutputTrack22222222222222222222222222222;
                    trackOutputTrack22222222222222222222222222222.format(formatBuild22222222222222222222222222222);
                    return;
                case 28:
                    str5 = "application/x-subrip";
                    listSingletonList = null;
                    str = null;
                    i3 = -1;
                    i5 = -1;
                    bArr = this.dolbyVisionConfigBytes;
                    if (bArr != null) {
                    }
                    str3 = str5;
                    int i9222222222222222222222222222222 = (this.flagForced ? 2 : 0) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format formatBuild222222222222222222222222222222 = builder.setId(i2).setSampleMimeType(str3).setMaxInputSize(i5).setLanguage(this.language).setSelectionFlags(i9222222222222222222222222222222).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack222222222222222222222222222222 = extractorOutput.track(this.number, i7);
                    this.output = trackOutputTrack222222222222222222222222222222;
                    trackOutputTrack222222222222222222222222222222.format(formatBuild222222222222222222222222222222);
                    return;
                case 29:
                    str5 = "video/mpeg2";
                    listSingletonList = null;
                    str = null;
                    i3 = -1;
                    i5 = -1;
                    bArr = this.dolbyVisionConfigBytes;
                    if (bArr != null) {
                    }
                    str3 = str5;
                    int i92222222222222222222222222222222 = (this.flagForced ? 2 : 0) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format formatBuild2222222222222222222222222222222 = builder.setId(i2).setSampleMimeType(str3).setMaxInputSize(i5).setLanguage(this.language).setSelectionFlags(i92222222222222222222222222222222).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack2222222222222222222222222222222 = extractorOutput.track(this.number, i7);
                    this.output = trackOutputTrack2222222222222222222222222222222;
                    trackOutputTrack2222222222222222222222222222222.format(formatBuild2222222222222222222222222222222);
                    return;
                case 30:
                    str5 = "audio/eac3";
                    listSingletonList = null;
                    str = null;
                    i3 = -1;
                    i5 = -1;
                    bArr = this.dolbyVisionConfigBytes;
                    if (bArr != null) {
                    }
                    str3 = str5;
                    int i922222222222222222222222222222222 = (this.flagForced ? 2 : 0) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format formatBuild22222222222222222222222222222222 = builder.setId(i2).setSampleMimeType(str3).setMaxInputSize(i5).setLanguage(this.language).setSelectionFlags(i922222222222222222222222222222222).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack22222222222222222222222222222222 = extractorOutput.track(this.number, i7);
                    this.output = trackOutputTrack22222222222222222222222222222222;
                    trackOutputTrack22222222222222222222222222222222.format(formatBuild22222222222222222222222222222222);
                    return;
                case 31:
                    listSingletonList = Collections.singletonList(getCodecPrivate(this.codecId));
                    str5 = "audio/flac";
                    str = null;
                    i3 = -1;
                    i5 = -1;
                    bArr = this.dolbyVisionConfigBytes;
                    if (bArr != null) {
                    }
                    str3 = str5;
                    int i9222222222222222222222222222222222 = (this.flagForced ? 2 : 0) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format formatBuild222222222222222222222222222222222 = builder.setId(i2).setSampleMimeType(str3).setMaxInputSize(i5).setLanguage(this.language).setSelectionFlags(i9222222222222222222222222222222222).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack222222222222222222222222222222222 = extractorOutput.track(this.number, i7);
                    this.output = trackOutputTrack222222222222222222222222222222222;
                    trackOutputTrack222222222222222222222222222222222.format(formatBuild222222222222222222222222222222222);
                    return;
                case 32:
                    listSingletonList = new ArrayList<>(3);
                    listSingletonList.add(getCodecPrivate(this.codecId));
                    ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
                    ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                    listSingletonList.add(byteBufferAllocate.order(byteOrder).putLong(this.codecDelayNs).array());
                    listSingletonList.add(ByteBuffer.allocate(8).order(byteOrder).putLong(this.seekPreRollNs).array());
                    str5 = "audio/opus";
                    i5 = MatroskaExtractor.OPUS_MAX_INPUT_SIZE;
                    str = null;
                    i3 = -1;
                    bArr = this.dolbyVisionConfigBytes;
                    if (bArr != null) {
                    }
                    str3 = str5;
                    int i92222222222222222222222222222222222 = (this.flagForced ? 2 : 0) | (this.flagDefault ? 1 : 0);
                    builder = new Format.Builder();
                    if (MimeTypes.isAudio(str3)) {
                    }
                    if (this.name != null) {
                    }
                    Format formatBuild2222222222222222222222222222222222 = builder.setId(i2).setSampleMimeType(str3).setMaxInputSize(i5).setLanguage(this.language).setSelectionFlags(i92222222222222222222222222222222222).setInitializationData(listSingletonList).setCodecs(str).setDrmInitData(this.drmInitData).build();
                    TrackOutput trackOutputTrack2222222222222222222222222222222222 = extractorOutput.track(this.number, i7);
                    this.output = trackOutputTrack2222222222222222222222222222222222;
                    trackOutputTrack2222222222222222222222222222222222.format(formatBuild2222222222222222222222222222222222);
                    return;
                default:
                    throw ParserException.createForMalformedContainer("Unrecognized codec identifier.", null);
            }
        }

        public void outputPendingSampleMetadata() {
            TrueHdSampleRechunker trueHdSampleRechunker = this.trueHdSampleRechunker;
            if (trueHdSampleRechunker != null) {
                trueHdSampleRechunker.outputPendingSampleMetadata(this.output, this.cryptoData);
            }
        }

        public void reset() {
            TrueHdSampleRechunker trueHdSampleRechunker = this.trueHdSampleRechunker;
            if (trueHdSampleRechunker != null) {
                trueHdSampleRechunker.reset();
            }
        }

        protected Track() {
        }

        private static boolean parseMsAcmCodecPrivate(ParsableByteArray parsableByteArray) throws ParserException {
            try {
                int littleEndianUnsignedShort = parsableByteArray.readLittleEndianUnsignedShort();
                if (littleEndianUnsignedShort == 1) {
                    return true;
                }
                if (littleEndianUnsignedShort == 65534) {
                    parsableByteArray.setPosition(24);
                    if (parsableByteArray.readLong() == MatroskaExtractor.WAVE_SUBFORMAT_PCM.getMostSignificantBits()) {
                        if (parsableByteArray.readLong() == MatroskaExtractor.WAVE_SUBFORMAT_PCM.getLeastSignificantBits()) {
                            return true;
                        }
                    }
                }
                return false;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw ParserException.createForMalformedContainer("Error parsing MS/ACM codec private", null);
            }
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
    private final class n implements EbmlProcessor {
        private n() {
        }

        @Override // com.google.android.exoplayer2.extractor.mkv.EbmlProcessor
        public void binaryElement(int i2, int i3, ExtractorInput extractorInput) throws IOException {
            MatroskaExtractor.this.binaryElement(i2, i3, extractorInput);
        }

        @Override // com.google.android.exoplayer2.extractor.mkv.EbmlProcessor
        public void endMasterElement(int i2) throws ParserException {
            MatroskaExtractor.this.endMasterElement(i2);
        }

        @Override // com.google.android.exoplayer2.extractor.mkv.EbmlProcessor
        public void floatElement(int i2, double d2) throws ParserException {
            MatroskaExtractor.this.floatElement(i2, d2);
        }

        @Override // com.google.android.exoplayer2.extractor.mkv.EbmlProcessor
        public int getElementType(int i2) {
            return MatroskaExtractor.this.getElementType(i2);
        }

        @Override // com.google.android.exoplayer2.extractor.mkv.EbmlProcessor
        public void integerElement(int i2, long j2) throws ParserException {
            MatroskaExtractor.this.integerElement(i2, j2);
        }

        @Override // com.google.android.exoplayer2.extractor.mkv.EbmlProcessor
        public boolean isLevel1Element(int i2) {
            return MatroskaExtractor.this.isLevel1Element(i2);
        }

        @Override // com.google.android.exoplayer2.extractor.mkv.EbmlProcessor
        public void startMasterElement(int i2, long j2, long j3) throws ParserException {
            MatroskaExtractor.this.startMasterElement(i2, j2, j3);
        }

        @Override // com.google.android.exoplayer2.extractor.mkv.EbmlProcessor
        public void stringElement(int i2, String str) throws ParserException {
            MatroskaExtractor.this.stringElement(i2, str);
        }
    }

    public MatroskaExtractor() {
        this(0);
    }

    private static boolean isCodecSupported(String str) {
        str.getClass();
        switch (str) {
            case "V_MPEG4/ISO/AP":
            case "V_MPEG4/ISO/SP":
            case "A_MS/ACM":
            case "A_TRUEHD":
            case "A_VORBIS":
            case "A_MPEG/L2":
            case "A_MPEG/L3":
            case "V_MS/VFW/FOURCC":
            case "S_DVBSUB":
            case "V_MPEG4/ISO/ASP":
            case "V_MPEG4/ISO/AVC":
            case "S_VOBSUB":
            case "A_DTS/LOSSLESS":
            case "A_AAC":
            case "A_AC3":
            case "A_DTS":
            case "V_AV1":
            case "V_VP8":
            case "V_VP9":
            case "S_HDMV/PGS":
            case "V_THEORA":
            case "A_DTS/EXPRESS":
            case "A_PCM/FLOAT/IEEE":
            case "A_PCM/INT/BIG":
            case "A_PCM/INT/LIT":
            case "S_TEXT/ASS":
            case "V_MPEGH/ISO/HEVC":
            case "S_TEXT/WEBVTT":
            case "S_TEXT/UTF8":
            case "V_MPEG2":
            case "A_EAC3":
            case "A_FLAC":
            case "A_OPUS":
                return true;
            default:
                return false;
        }
    }

    private void resetWriteSampleData() {
        this.sampleBytesRead = 0;
        this.sampleBytesWritten = 0;
        this.sampleCurrentNalBytesRemaining = 0;
        this.sampleEncodingHandled = false;
        this.sampleSignalByteRead = false;
        this.samplePartitionCountRead = false;
        this.samplePartitionCount = 0;
        this.sampleSignalByte = (byte) 0;
        this.sampleInitializationVectorRead = false;
        this.sampleStrippedBytes.reset(0);
    }

    private static void setSubtitleEndTime(String str, long j2, byte[] bArr) {
        byte[] subtitleTimecode;
        int i2;
        str.getClass();
        switch (str) {
            case "S_TEXT/ASS":
                subtitleTimecode = formatSubtitleTimecode(j2, SSA_TIMECODE_FORMAT, 10000L);
                i2 = 21;
                break;
            case "S_TEXT/WEBVTT":
                subtitleTimecode = formatSubtitleTimecode(j2, VTT_TIMECODE_FORMAT, 1000L);
                i2 = 25;
                break;
            case "S_TEXT/UTF8":
                subtitleTimecode = formatSubtitleTimecode(j2, SUBRIP_TIMECODE_FORMAT, 1000L);
                i2 = 19;
                break;
            default:
                throw new IllegalArgumentException();
        }
        System.arraycopy(subtitleTimecode, 0, bArr, i2, subtitleTimecode.length);
    }

    private void writeSubtitleSampleData(ExtractorInput extractorInput, byte[] bArr, int i2) throws IOException {
        int length = bArr.length + i2;
        if (this.subtitleSample.capacity() < length) {
            this.subtitleSample.reset(Arrays.copyOf(bArr, length + i2));
        } else {
            System.arraycopy(bArr, 0, this.subtitleSample.getData(), 0, bArr.length);
        }
        extractorInput.readFully(this.subtitleSample.getData(), bArr.length, i2);
        this.subtitleSample.setPosition(0);
        this.subtitleSample.setLimit(length);
    }

    @CallSuper
    protected int getElementType(int i2) {
        switch (i2) {
            case 131:
            case 136:
            case ID_BLOCK_DURATION /* 155 */:
            case ID_CHANNELS /* 159 */:
            case ID_PIXEL_WIDTH /* 176 */:
            case ID_CUE_TIME /* 179 */:
            case ID_PIXEL_HEIGHT /* 186 */:
            case 215:
            case ID_TIME_CODE /* 231 */:
            case ID_BLOCK_ADD_ID /* 238 */:
            case ID_CUE_CLUSTER_POSITION /* 241 */:
            case ID_REFERENCE_BLOCK /* 251 */:
            case ID_BLOCK_ADD_ID_TYPE /* 16871 */:
            case ID_CONTENT_COMPRESSION_ALGORITHM /* 16980 */:
            case ID_DOC_TYPE_READ_VERSION /* 17029 */:
            case ID_EBML_READ_VERSION /* 17143 */:
            case ID_CONTENT_ENCRYPTION_ALGORITHM /* 18401 */:
            case ID_CONTENT_ENCRYPTION_AES_SETTINGS_CIPHER_MODE /* 18408 */:
            case ID_CONTENT_ENCODING_ORDER /* 20529 */:
            case ID_CONTENT_ENCODING_SCOPE /* 20530 */:
            case ID_SEEK_POSITION /* 21420 */:
            case ID_STEREO_MODE /* 21432 */:
            case ID_DISPLAY_WIDTH /* 21680 */:
            case ID_DISPLAY_UNIT /* 21682 */:
            case ID_DISPLAY_HEIGHT /* 21690 */:
            case ID_FLAG_FORCED /* 21930 */:
            case ID_COLOUR_RANGE /* 21945 */:
            case ID_COLOUR_TRANSFER /* 21946 */:
            case ID_COLOUR_PRIMARIES /* 21947 */:
            case ID_MAX_CLL /* 21948 */:
            case ID_MAX_FALL /* 21949 */:
            case ID_MAX_BLOCK_ADDITION_ID /* 21998 */:
            case ID_CODEC_DELAY /* 22186 */:
            case ID_SEEK_PRE_ROLL /* 22203 */:
            case ID_AUDIO_BIT_DEPTH /* 25188 */:
            case ID_DISCARD_PADDING /* 30114 */:
            case ID_PROJECTION_TYPE /* 30321 */:
            case ID_DEFAULT_DURATION /* 2352003 */:
            case ID_TIMECODE_SCALE /* 2807729 */:
                return 2;
            case 134:
            case ID_DOC_TYPE /* 17026 */:
            case ID_NAME /* 21358 */:
            case ID_LANGUAGE /* 2274716 */:
                return 3;
            case ID_BLOCK_GROUP /* 160 */:
            case ID_BLOCK_MORE /* 166 */:
            case ID_TRACK_ENTRY /* 174 */:
            case ID_CUE_TRACK_POSITIONS /* 183 */:
            case ID_CUE_POINT /* 187 */:
            case 224:
            case 225:
            case ID_BLOCK_ADDITION_MAPPING /* 16868 */:
            case ID_CONTENT_ENCRYPTION_AES_SETTINGS /* 18407 */:
            case ID_SEEK /* 19899 */:
            case ID_CONTENT_COMPRESSION /* 20532 */:
            case ID_CONTENT_ENCRYPTION /* 20533 */:
            case ID_COLOUR /* 21936 */:
            case ID_MASTERING_METADATA /* 21968 */:
            case ID_CONTENT_ENCODING /* 25152 */:
            case ID_CONTENT_ENCODINGS /* 28032 */:
            case ID_BLOCK_ADDITIONS /* 30113 */:
            case ID_PROJECTION /* 30320 */:
            case ID_SEEK_HEAD /* 290298740 */:
            case 357149030:
            case ID_TRACKS /* 374648427 */:
            case ID_SEGMENT /* 408125543 */:
            case ID_EBML /* 440786851 */:
            case ID_CUES /* 475249515 */:
            case ID_CLUSTER /* 524531317 */:
                return 1;
            case ID_BLOCK /* 161 */:
            case ID_SIMPLE_BLOCK /* 163 */:
            case ID_BLOCK_ADDITIONAL /* 165 */:
            case ID_BLOCK_ADD_ID_EXTRA_DATA /* 16877 */:
            case ID_CONTENT_COMPRESSION_SETTINGS /* 16981 */:
            case ID_CONTENT_ENCRYPTION_KEY_ID /* 18402 */:
            case ID_SEEK_ID /* 21419 */:
            case ID_CODEC_PRIVATE /* 25506 */:
            case ID_PROJECTION_PRIVATE /* 30322 */:
                return 4;
            case ID_SAMPLING_FREQUENCY /* 181 */:
            case ID_DURATION /* 17545 */:
            case ID_PRIMARY_R_CHROMATICITY_X /* 21969 */:
            case ID_PRIMARY_R_CHROMATICITY_Y /* 21970 */:
            case ID_PRIMARY_G_CHROMATICITY_X /* 21971 */:
            case ID_PRIMARY_G_CHROMATICITY_Y /* 21972 */:
            case ID_PRIMARY_B_CHROMATICITY_X /* 21973 */:
            case ID_PRIMARY_B_CHROMATICITY_Y /* 21974 */:
            case ID_WHITE_POINT_CHROMATICITY_X /* 21975 */:
            case ID_WHITE_POINT_CHROMATICITY_Y /* 21976 */:
            case ID_LUMNINANCE_MAX /* 21977 */:
            case ID_LUMNINANCE_MIN /* 21978 */:
            case ID_PROJECTION_POSE_YAW /* 30323 */:
            case ID_PROJECTION_POSE_PITCH /* 30324 */:
            case ID_PROJECTION_POSE_ROLL /* 30325 */:
                return 5;
            default:
                return 0;
        }
    }

    protected void handleBlockAdditionalData(Track track, int i2, ExtractorInput extractorInput, int i3) throws IOException {
        if (i2 != 4 || !CODEC_ID_VP9.equals(track.codecId)) {
            extractorInput.skipFully(i3);
        } else {
            this.supplementalData.reset(i3);
            extractorInput.readFully(this.supplementalData.getData(), 0, i3);
        }
    }

    @CallSuper
    protected boolean isLevel1Element(int i2) {
        return i2 == 357149030 || i2 == ID_CLUSTER || i2 == ID_CUES || i2 == ID_TRACKS;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        this.haveOutputSample = false;
        boolean z2 = true;
        while (z2 && !this.haveOutputSample) {
            z2 = this.reader.read(extractorInput);
            if (z2 && maybeSeekForCues(positionHolder, extractorInput.getPosition())) {
                return 1;
            }
        }
        if (z2) {
            return 0;
        }
        for (int i2 = 0; i2 < this.tracks.size(); i2++) {
            Track trackValueAt = this.tracks.valueAt(i2);
            trackValueAt.assertOutputInitialized();
            trackValueAt.outputPendingSampleMetadata();
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void release() {
    }

    static {
        HashMap map = new HashMap();
        map.put("htc_video_rotA-000", 0);
        map.put("htc_video_rotA-090", 90);
        map.put("htc_video_rotA-180", 180);
        map.put("htc_video_rotA-270", 270);
        TRACK_NAME_TO_ROTATION_DEGREES = Collections.unmodifiableMap(map);
    }

    public MatroskaExtractor(int i2) {
        this(new com.google.android.exoplayer2.extractor.mkv.j(), i2);
    }

    private void assertInCues(int i2) throws ParserException {
        if (this.cueTimesUs == null || this.cueClusterPositions == null) {
            throw ParserException.createForMalformedContainer("Element " + i2 + " must be in a Cues", null);
        }
    }

    private void assertInTrackEntry(int i2) throws ParserException {
        if (this.currentTrack != null) {
            return;
        }
        throw ParserException.createForMalformedContainer("Element " + i2 + " must be in a TrackEntry", null);
    }

    private void assertInitialized() {
        Assertions.checkStateNotNull(this.extractorOutput);
    }

    private SeekMap buildSeekMap(@Nullable LongArray longArray, @Nullable LongArray longArray2) {
        int i2;
        if (this.segmentContentPosition == -1 || this.durationUs == -9223372036854775807L || longArray == null || longArray.size() == 0 || longArray2 == null || longArray2.size() != longArray.size()) {
            return new SeekMap.Unseekable(this.durationUs);
        }
        int size = longArray.size();
        int[] iArrCopyOf = new int[size];
        long[] jArrCopyOf = new long[size];
        long[] jArrCopyOf2 = new long[size];
        long[] jArrCopyOf3 = new long[size];
        int i3 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            jArrCopyOf3[i5] = longArray.get(i5);
            jArrCopyOf[i5] = this.segmentContentPosition + longArray2.get(i5);
        }
        while (true) {
            i2 = size - 1;
            if (i3 >= i2) {
                break;
            }
            int i7 = i3 + 1;
            iArrCopyOf[i3] = (int) (jArrCopyOf[i7] - jArrCopyOf[i3]);
            jArrCopyOf2[i3] = jArrCopyOf3[i7] - jArrCopyOf3[i3];
            i3 = i7;
        }
        iArrCopyOf[i2] = (int) ((this.segmentContentPosition + this.segmentContentSize) - jArrCopyOf[i2]);
        long j2 = this.durationUs - jArrCopyOf3[i2];
        jArrCopyOf2[i2] = j2;
        if (j2 <= 0) {
            Log.w(TAG, "Discarding last cue point with unexpected duration: " + j2);
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i2);
            jArrCopyOf = Arrays.copyOf(jArrCopyOf, i2);
            jArrCopyOf2 = Arrays.copyOf(jArrCopyOf2, i2);
            jArrCopyOf3 = Arrays.copyOf(jArrCopyOf3, i2);
        }
        return new ChunkIndex(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void commitSampleToOutput(Track track, long j2, int i2, int i3, int i5) {
        int iLimit;
        TrueHdSampleRechunker trueHdSampleRechunker = track.trueHdSampleRechunker;
        if (trueHdSampleRechunker != null) {
            trueHdSampleRechunker.sampleMetadata(track.output, j2, i2, i3, i5, track.cryptoData);
        } else if (CODEC_ID_SUBRIP.equals(track.codecId) || CODEC_ID_ASS.equals(track.codecId) || CODEC_ID_VTT.equals(track.codecId)) {
            if (this.blockSampleCount > 1) {
                Log.w(TAG, "Skipping subtitle sample in laced block.");
            } else {
                long j3 = this.blockDurationUs;
                if (j3 == -9223372036854775807L) {
                    Log.w(TAG, "Skipping subtitle sample with no duration.");
                } else {
                    setSubtitleEndTime(track.codecId, j3, this.subtitleSample.getData());
                    int position = this.subtitleSample.getPosition();
                    while (true) {
                        if (position >= this.subtitleSample.limit()) {
                            break;
                        }
                        if (this.subtitleSample.getData()[position] == 0) {
                            this.subtitleSample.setLimit(position);
                            break;
                        }
                        position++;
                    }
                    TrackOutput trackOutput = track.output;
                    ParsableByteArray parsableByteArray = this.subtitleSample;
                    trackOutput.sampleData(parsableByteArray, parsableByteArray.limit());
                    iLimit = i3 + this.subtitleSample.limit();
                    if ((i2 & 268435456) != 0) {
                        if (this.blockSampleCount > 1) {
                            this.supplementalData.reset(0);
                        } else {
                            int iLimit2 = this.supplementalData.limit();
                            track.output.sampleData(this.supplementalData, iLimit2, 2);
                            iLimit += iLimit2;
                        }
                    }
                    track.output.sampleMetadata(j2, i2, iLimit, i5, track.cryptoData);
                }
            }
            iLimit = i3;
            if ((i2 & 268435456) != 0) {
            }
            track.output.sampleMetadata(j2, i2, iLimit, i5, track.cryptoData);
        } else {
            iLimit = i3;
            if ((i2 & 268435456) != 0) {
            }
            track.output.sampleMetadata(j2, i2, iLimit, i5, track.cryptoData);
        }
        this.haveOutputSample = true;
    }

    private static int[] ensureArrayCapacity(@Nullable int[] iArr, int i2) {
        return iArr == null ? new int[i2] : iArr.length >= i2 ? iArr : new int[Math.max(iArr.length * 2, i2)];
    }

    private int finishWriteSampleData() {
        int i2 = this.sampleBytesWritten;
        resetWriteSampleData();
        return i2;
    }

    private boolean maybeSeekForCues(PositionHolder positionHolder, long j2) {
        if (this.seekForCues) {
            this.seekPositionAfterBuildingCues = j2;
            positionHolder.position = this.cuesContentPosition;
            this.seekForCues = false;
            return true;
        }
        if (this.sentSeekMap) {
            long j3 = this.seekPositionAfterBuildingCues;
            if (j3 != -1) {
                positionHolder.position = j3;
                this.seekPositionAfterBuildingCues = -1L;
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ Extractor[] n() {
        return new Extractor[]{new MatroskaExtractor()};
    }

    private void readScratch(ExtractorInput extractorInput, int i2) throws IOException {
        if (this.scratch.limit() >= i2) {
            return;
        }
        if (this.scratch.capacity() < i2) {
            ParsableByteArray parsableByteArray = this.scratch;
            parsableByteArray.ensureCapacity(Math.max(parsableByteArray.capacity() * 2, i2));
        }
        extractorInput.readFully(this.scratch.getData(), this.scratch.limit(), i2 - this.scratch.limit());
        this.scratch.setLimit(i2);
    }

    private long scaleTimecodeToUs(long j2) throws ParserException {
        long j3 = this.timecodeScale;
        if (j3 != -9223372036854775807L) {
            return Util.scaleLargeTimestamp(j2, j3, 1000L);
        }
        throw ParserException.createForMalformedContainer("Can't scale timecode prior to timecodeScale being set.", null);
    }

    private int writeSampleData(ExtractorInput extractorInput, Track track, int i2, boolean z2) throws IOException {
        int i3;
        if (CODEC_ID_SUBRIP.equals(track.codecId)) {
            writeSubtitleSampleData(extractorInput, SUBRIP_PREFIX, i2);
            return finishWriteSampleData();
        }
        if (CODEC_ID_ASS.equals(track.codecId)) {
            writeSubtitleSampleData(extractorInput, SSA_PREFIX, i2);
            return finishWriteSampleData();
        }
        if (CODEC_ID_VTT.equals(track.codecId)) {
            writeSubtitleSampleData(extractorInput, VTT_PREFIX, i2);
            return finishWriteSampleData();
        }
        TrackOutput trackOutput = track.output;
        if (!this.sampleEncodingHandled) {
            if (track.hasContentEncryption) {
                this.blockFlags &= -1073741825;
                if (!this.sampleSignalByteRead) {
                    extractorInput.readFully(this.scratch.getData(), 0, 1);
                    this.sampleBytesRead++;
                    if ((this.scratch.getData()[0] & ByteCompanionObject.MIN_VALUE) == 128) {
                        throw ParserException.createForMalformedContainer("Extension bit is set in signal byte", null);
                    }
                    this.sampleSignalByte = this.scratch.getData()[0];
                    this.sampleSignalByteRead = true;
                }
                byte b2 = this.sampleSignalByte;
                if ((b2 & 1) == 1) {
                    boolean z3 = (b2 & 2) == 2;
                    this.blockFlags |= 1073741824;
                    if (!this.sampleInitializationVectorRead) {
                        extractorInput.readFully(this.encryptionInitializationVector.getData(), 0, 8);
                        this.sampleBytesRead += 8;
                        this.sampleInitializationVectorRead = true;
                        this.scratch.getData()[0] = (byte) ((z3 ? 128 : 0) | 8);
                        this.scratch.setPosition(0);
                        trackOutput.sampleData(this.scratch, 1, 1);
                        this.sampleBytesWritten++;
                        this.encryptionInitializationVector.setPosition(0);
                        trackOutput.sampleData(this.encryptionInitializationVector, 8, 1);
                        this.sampleBytesWritten += 8;
                    }
                    if (z3) {
                        if (!this.samplePartitionCountRead) {
                            extractorInput.readFully(this.scratch.getData(), 0, 1);
                            this.sampleBytesRead++;
                            this.scratch.setPosition(0);
                            this.samplePartitionCount = this.scratch.readUnsignedByte();
                            this.samplePartitionCountRead = true;
                        }
                        int i5 = this.samplePartitionCount * 4;
                        this.scratch.reset(i5);
                        extractorInput.readFully(this.scratch.getData(), 0, i5);
                        this.sampleBytesRead += i5;
                        short s2 = (short) ((this.samplePartitionCount / 2) + 1);
                        int i7 = (s2 * 6) + 2;
                        ByteBuffer byteBuffer = this.encryptionSubsampleDataBuffer;
                        if (byteBuffer == null || byteBuffer.capacity() < i7) {
                            this.encryptionSubsampleDataBuffer = ByteBuffer.allocate(i7);
                        }
                        this.encryptionSubsampleDataBuffer.position(0);
                        this.encryptionSubsampleDataBuffer.putShort(s2);
                        int i8 = 0;
                        int i9 = 0;
                        while (true) {
                            i3 = this.samplePartitionCount;
                            if (i8 >= i3) {
                                break;
                            }
                            int unsignedIntToInt = this.scratch.readUnsignedIntToInt();
                            if (i8 % 2 == 0) {
                                this.encryptionSubsampleDataBuffer.putShort((short) (unsignedIntToInt - i9));
                            } else {
                                this.encryptionSubsampleDataBuffer.putInt(unsignedIntToInt - i9);
                            }
                            i8++;
                            i9 = unsignedIntToInt;
                        }
                        int i10 = (i2 - this.sampleBytesRead) - i9;
                        if (i3 % 2 == 1) {
                            this.encryptionSubsampleDataBuffer.putInt(i10);
                        } else {
                            this.encryptionSubsampleDataBuffer.putShort((short) i10);
                            this.encryptionSubsampleDataBuffer.putInt(0);
                        }
                        this.encryptionSubsampleData.reset(this.encryptionSubsampleDataBuffer.array(), i7);
                        trackOutput.sampleData(this.encryptionSubsampleData, i7, 1);
                        this.sampleBytesWritten += i7;
                    }
                }
            } else {
                byte[] bArr = track.sampleStrippedBytes;
                if (bArr != null) {
                    this.sampleStrippedBytes.reset(bArr, bArr.length);
                }
            }
            if (track.samplesHaveSupplementalData(z2)) {
                this.blockFlags |= 268435456;
                this.supplementalData.reset(0);
                int iLimit = (this.sampleStrippedBytes.limit() + i2) - this.sampleBytesRead;
                this.scratch.reset(4);
                this.scratch.getData()[0] = (byte) ((iLimit >> 24) & 255);
                this.scratch.getData()[1] = (byte) ((iLimit >> 16) & 255);
                this.scratch.getData()[2] = (byte) ((iLimit >> 8) & 255);
                this.scratch.getData()[3] = (byte) (iLimit & 255);
                trackOutput.sampleData(this.scratch, 4, 2);
                this.sampleBytesWritten += 4;
            }
            this.sampleEncodingHandled = true;
        }
        int iLimit2 = i2 + this.sampleStrippedBytes.limit();
        if (!CODEC_ID_H264.equals(track.codecId) && !CODEC_ID_H265.equals(track.codecId)) {
            if (track.trueHdSampleRechunker != null) {
                Assertions.checkState(this.sampleStrippedBytes.limit() == 0);
                track.trueHdSampleRechunker.startSample(extractorInput);
            }
            while (true) {
                int i11 = this.sampleBytesRead;
                if (i11 >= iLimit2) {
                    break;
                }
                int iWriteToOutput = writeToOutput(extractorInput, trackOutput, iLimit2 - i11);
                this.sampleBytesRead += iWriteToOutput;
                this.sampleBytesWritten += iWriteToOutput;
            }
        } else {
            byte[] data = this.nalLength.getData();
            data[0] = 0;
            data[1] = 0;
            data[2] = 0;
            int i12 = track.nalUnitLengthFieldLength;
            int i13 = 4 - i12;
            while (this.sampleBytesRead < iLimit2) {
                int i14 = this.sampleCurrentNalBytesRemaining;
                if (i14 == 0) {
                    writeToTarget(extractorInput, data, i13, i12);
                    this.sampleBytesRead += i12;
                    this.nalLength.setPosition(0);
                    this.sampleCurrentNalBytesRemaining = this.nalLength.readUnsignedIntToInt();
                    this.nalStartCode.setPosition(0);
                    trackOutput.sampleData(this.nalStartCode, 4);
                    this.sampleBytesWritten += 4;
                } else {
                    int iWriteToOutput2 = writeToOutput(extractorInput, trackOutput, i14);
                    this.sampleBytesRead += iWriteToOutput2;
                    this.sampleBytesWritten += iWriteToOutput2;
                    this.sampleCurrentNalBytesRemaining -= iWriteToOutput2;
                }
            }
        }
        if (CODEC_ID_VORBIS.equals(track.codecId)) {
            this.vorbisNumPageSamples.setPosition(0);
            trackOutput.sampleData(this.vorbisNumPageSamples, 4);
            this.sampleBytesWritten += 4;
        }
        return finishWriteSampleData();
    }

    private int writeToOutput(ExtractorInput extractorInput, TrackOutput trackOutput, int i2) throws IOException {
        int iBytesLeft = this.sampleStrippedBytes.bytesLeft();
        if (iBytesLeft <= 0) {
            return trackOutput.sampleData((DataReader) extractorInput, i2, false);
        }
        int iMin = Math.min(i2, iBytesLeft);
        trackOutput.sampleData(this.sampleStrippedBytes, iMin);
        return iMin;
    }

    private void writeToTarget(ExtractorInput extractorInput, byte[] bArr, int i2, int i3) throws IOException {
        int iMin = Math.min(i3, this.sampleStrippedBytes.bytesLeft());
        extractorInput.readFully(bArr, i2 + iMin, i3 - iMin);
        if (iMin > 0) {
            this.sampleStrippedBytes.readBytes(bArr, i2, iMin);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @CallSuper
    protected void binaryElement(int i2, int i3, ExtractorInput extractorInput) throws IOException {
        int i5;
        int i7;
        int i8;
        int i9;
        int i10;
        long j2;
        int i11;
        int i12;
        int i13;
        ExtractorInput extractorInput2 = extractorInput;
        int i14 = 0;
        int i15 = 1;
        if (i2 != ID_BLOCK && i2 != ID_SIMPLE_BLOCK) {
            if (i2 == ID_BLOCK_ADDITIONAL) {
                if (this.blockState != 2) {
                    return;
                }
                handleBlockAdditionalData(this.tracks.get(this.blockTrackNumber), this.blockAdditionalId, extractorInput2, i3);
                return;
            }
            if (i2 == ID_BLOCK_ADD_ID_EXTRA_DATA) {
                handleBlockAddIDExtraData(getCurrentTrack(i2), extractorInput2, i3);
                return;
            }
            if (i2 == ID_CONTENT_COMPRESSION_SETTINGS) {
                assertInTrackEntry(i2);
                byte[] bArr = new byte[i3];
                this.currentTrack.sampleStrippedBytes = bArr;
                extractorInput2.readFully(bArr, 0, i3);
                return;
            }
            if (i2 == ID_CONTENT_ENCRYPTION_KEY_ID) {
                byte[] bArr2 = new byte[i3];
                extractorInput2.readFully(bArr2, 0, i3);
                getCurrentTrack(i2).cryptoData = new TrackOutput.CryptoData(1, bArr2, 0, 0);
                return;
            }
            if (i2 == ID_SEEK_ID) {
                Arrays.fill(this.seekEntryIdBytes.getData(), (byte) 0);
                extractorInput2.readFully(this.seekEntryIdBytes.getData(), 4 - i3, i3);
                this.seekEntryIdBytes.setPosition(0);
                this.seekEntryId = (int) this.seekEntryIdBytes.readUnsignedInt();
                return;
            }
            if (i2 == ID_CODEC_PRIVATE) {
                assertInTrackEntry(i2);
                byte[] bArr3 = new byte[i3];
                this.currentTrack.codecPrivate = bArr3;
                extractorInput2.readFully(bArr3, 0, i3);
                return;
            }
            if (i2 != ID_PROJECTION_PRIVATE) {
                throw ParserException.createForMalformedContainer("Unexpected id: " + i2, null);
            }
            assertInTrackEntry(i2);
            byte[] bArr4 = new byte[i3];
            this.currentTrack.projectionData = bArr4;
            extractorInput2.readFully(bArr4, 0, i3);
            return;
        }
        int i16 = 8;
        if (this.blockState == 0) {
            this.blockTrackNumber = (int) this.varintReader.nr(extractorInput2, false, true, 8);
            this.blockTrackNumberLength = this.varintReader.rl();
            this.blockDurationUs = -9223372036854775807L;
            this.blockState = 1;
            this.scratch.reset(0);
        }
        Track track = this.tracks.get(this.blockTrackNumber);
        if (track == null) {
            extractorInput2.skipFully(i3 - this.blockTrackNumberLength);
            this.blockState = 0;
            return;
        }
        track.assertOutputInitialized();
        if (this.blockState == 1) {
            readScratch(extractorInput2, 3);
            int i17 = (this.scratch.getData()[2] & 6) >> 1;
            if (i17 == 0) {
                this.blockSampleCount = 1;
                int[] iArrEnsureArrayCapacity = ensureArrayCapacity(this.blockSampleSizes, 1);
                this.blockSampleSizes = iArrEnsureArrayCapacity;
                iArrEnsureArrayCapacity[0] = (i3 - this.blockTrackNumberLength) - 3;
            } else {
                readScratch(extractorInput2, 4);
                int i18 = (this.scratch.getData()[3] & UByte.MAX_VALUE) + 1;
                this.blockSampleCount = i18;
                int[] iArrEnsureArrayCapacity2 = ensureArrayCapacity(this.blockSampleSizes, i18);
                this.blockSampleSizes = iArrEnsureArrayCapacity2;
                if (i17 == 2) {
                    int i19 = (i3 - this.blockTrackNumberLength) - 4;
                    int i20 = this.blockSampleCount;
                    Arrays.fill(iArrEnsureArrayCapacity2, 0, i20, i19 / i20);
                } else {
                    if (i17 != 1) {
                        if (i17 != 3) {
                            throw ParserException.createForMalformedContainer("Unexpected lacing value: " + i17, null);
                        }
                        int i21 = 0;
                        int i22 = 0;
                        int i23 = 4;
                        while (true) {
                            int i24 = this.blockSampleCount;
                            i5 = i15;
                            if (i21 >= i24 - 1) {
                                i7 = i14;
                                this.blockSampleSizes[i24 - 1] = ((i3 - this.blockTrackNumberLength) - i23) - i22;
                                break;
                            }
                            this.blockSampleSizes[i21] = i14;
                            int i25 = i23 + 1;
                            readScratch(extractorInput2, i25);
                            if (this.scratch.getData()[i23] == 0) {
                                throw ParserException.createForMalformedContainer("No valid varint length mask found", null);
                            }
                            int i26 = i14;
                            while (true) {
                                if (i26 >= i16) {
                                    i8 = i14;
                                    i9 = i16;
                                    i10 = i21;
                                    j2 = 0;
                                    break;
                                }
                                i9 = i16;
                                int i27 = i5 << (7 - i26);
                                i8 = i14;
                                if ((this.scratch.getData()[i23] & i27) != 0) {
                                    i25 += i26;
                                    readScratch(extractorInput2, i25);
                                    int i28 = i23 + 1;
                                    j2 = this.scratch.getData()[i23] & 255 & (~i27);
                                    while (true) {
                                        int i29 = i28;
                                        if (i29 >= i25) {
                                            break;
                                        }
                                        i28 = i29 + 1;
                                        j2 = (j2 << i9) | ((long) (this.scratch.getData()[i29] & UByte.MAX_VALUE));
                                        i21 = i21;
                                    }
                                    i10 = i21;
                                    if (i10 > 0) {
                                        j2 -= (1 << ((i26 * 7) + 6)) - 1;
                                    }
                                } else {
                                    i26++;
                                    extractorInput2 = extractorInput;
                                    i14 = i8;
                                    i16 = i9;
                                }
                            }
                            i23 = i25;
                            if (j2 < -2147483648L || j2 > 2147483647L) {
                                break;
                            }
                            int i30 = (int) j2;
                            int[] iArr = this.blockSampleSizes;
                            if (i10 != 0) {
                                i30 += iArr[i10 - 1];
                            }
                            iArr[i10] = i30;
                            i22 += i30;
                            i21 = i10 + 1;
                            extractorInput2 = extractorInput;
                            i15 = i5;
                            i14 = i8;
                            i16 = i9;
                        }
                        throw ParserException.createForMalformedContainer("EBML lacing sample size out of range.", null);
                    }
                    int i31 = 0;
                    int i32 = 0;
                    int i33 = 4;
                    while (true) {
                        i11 = this.blockSampleCount;
                        if (i31 >= i11 - 1) {
                            break;
                        }
                        this.blockSampleSizes[i31] = 0;
                        while (true) {
                            i12 = i33 + 1;
                            readScratch(extractorInput2, i12);
                            int i34 = this.scratch.getData()[i33] & 255;
                            int[] iArr2 = this.blockSampleSizes;
                            i13 = iArr2[i31] + i34;
                            iArr2[i31] = i13;
                            if (i34 != 255) {
                                break;
                            } else {
                                i33 = i12;
                            }
                        }
                        i32 += i13;
                        i31++;
                        i33 = i12;
                    }
                    this.blockSampleSizes[i11 - 1] = ((i3 - this.blockTrackNumberLength) - i33) - i32;
                }
            }
            i7 = 0;
            i5 = 1;
            this.blockTimeUs = this.clusterTimecodeUs + scaleTimecodeToUs((this.scratch.getData()[i7] << 8) | (this.scratch.getData()[i5] & UByte.MAX_VALUE));
            this.blockFlags = (track.type == 2 || (i2 == ID_SIMPLE_BLOCK && (this.scratch.getData()[2] & ByteCompanionObject.MIN_VALUE) == 128)) ? i5 : i7;
            this.blockState = 2;
            this.blockSampleIndex = i7;
        } else {
            i5 = 1;
        }
        if (i2 == ID_SIMPLE_BLOCK) {
            while (true) {
                int i35 = this.blockSampleIndex;
                if (i35 >= this.blockSampleCount) {
                    this.blockState = 0;
                    return;
                }
                int iWriteSampleData = writeSampleData(extractorInput, track, this.blockSampleSizes[i35], false);
                Track track2 = track;
                commitSampleToOutput(track2, this.blockTimeUs + ((long) ((this.blockSampleIndex * track.defaultSampleDurationNs) / 1000)), this.blockFlags, iWriteSampleData, 0);
                this.blockSampleIndex++;
                track = track2;
            }
        } else {
            while (true) {
                int i36 = this.blockSampleIndex;
                if (i36 >= this.blockSampleCount) {
                    return;
                }
                int[] iArr3 = this.blockSampleSizes;
                boolean z2 = i5;
                iArr3[i36] = writeSampleData(extractorInput, track, iArr3[i36], z2);
                this.blockSampleIndex += z2 ? 1 : 0;
            }
        }
    }

    @CallSuper
    protected void floatElement(int i2, double d2) throws ParserException {
        if (i2 == ID_SAMPLING_FREQUENCY) {
            getCurrentTrack(i2).sampleRate = (int) d2;
            return;
        }
        if (i2 == ID_DURATION) {
            this.durationTimecode = (long) d2;
            return;
        }
        switch (i2) {
            case ID_PRIMARY_R_CHROMATICITY_X /* 21969 */:
                getCurrentTrack(i2).primaryRChromaticityX = (float) d2;
                break;
            case ID_PRIMARY_R_CHROMATICITY_Y /* 21970 */:
                getCurrentTrack(i2).primaryRChromaticityY = (float) d2;
                break;
            case ID_PRIMARY_G_CHROMATICITY_X /* 21971 */:
                getCurrentTrack(i2).primaryGChromaticityX = (float) d2;
                break;
            case ID_PRIMARY_G_CHROMATICITY_Y /* 21972 */:
                getCurrentTrack(i2).primaryGChromaticityY = (float) d2;
                break;
            case ID_PRIMARY_B_CHROMATICITY_X /* 21973 */:
                getCurrentTrack(i2).primaryBChromaticityX = (float) d2;
                break;
            case ID_PRIMARY_B_CHROMATICITY_Y /* 21974 */:
                getCurrentTrack(i2).primaryBChromaticityY = (float) d2;
                break;
            case ID_WHITE_POINT_CHROMATICITY_X /* 21975 */:
                getCurrentTrack(i2).whitePointChromaticityX = (float) d2;
                break;
            case ID_WHITE_POINT_CHROMATICITY_Y /* 21976 */:
                getCurrentTrack(i2).whitePointChromaticityY = (float) d2;
                break;
            case ID_LUMNINANCE_MAX /* 21977 */:
                getCurrentTrack(i2).maxMasteringLuminance = (float) d2;
                break;
            case ID_LUMNINANCE_MIN /* 21978 */:
                getCurrentTrack(i2).minMasteringLuminance = (float) d2;
                break;
            default:
                switch (i2) {
                    case ID_PROJECTION_POSE_YAW /* 30323 */:
                        getCurrentTrack(i2).projectionPoseYaw = (float) d2;
                        break;
                    case ID_PROJECTION_POSE_PITCH /* 30324 */:
                        getCurrentTrack(i2).projectionPosePitch = (float) d2;
                        break;
                    case ID_PROJECTION_POSE_ROLL /* 30325 */:
                        getCurrentTrack(i2).projectionPoseRoll = (float) d2;
                        break;
                }
                break;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final void init(ExtractorOutput extractorOutput) {
        this.extractorOutput = extractorOutput;
    }

    @CallSuper
    protected void integerElement(int i2, long j2) throws ParserException {
        if (i2 == ID_CONTENT_ENCODING_ORDER) {
            if (j2 == 0) {
                return;
            }
            throw ParserException.createForMalformedContainer("ContentEncodingOrder " + j2 + " not supported", null);
        }
        if (i2 == ID_CONTENT_ENCODING_SCOPE) {
            if (j2 == 1) {
                return;
            }
            throw ParserException.createForMalformedContainer("ContentEncodingScope " + j2 + " not supported", null);
        }
        switch (i2) {
            case 131:
                getCurrentTrack(i2).type = (int) j2;
                return;
            case 136:
                getCurrentTrack(i2).flagDefault = j2 == 1;
                return;
            case ID_BLOCK_DURATION /* 155 */:
                this.blockDurationUs = scaleTimecodeToUs(j2);
                return;
            case ID_CHANNELS /* 159 */:
                getCurrentTrack(i2).channelCount = (int) j2;
                return;
            case ID_PIXEL_WIDTH /* 176 */:
                getCurrentTrack(i2).width = (int) j2;
                return;
            case ID_CUE_TIME /* 179 */:
                assertInCues(i2);
                this.cueTimesUs.add(scaleTimecodeToUs(j2));
                return;
            case ID_PIXEL_HEIGHT /* 186 */:
                getCurrentTrack(i2).height = (int) j2;
                return;
            case 215:
                getCurrentTrack(i2).number = (int) j2;
                return;
            case ID_TIME_CODE /* 231 */:
                this.clusterTimecodeUs = scaleTimecodeToUs(j2);
                return;
            case ID_BLOCK_ADD_ID /* 238 */:
                this.blockAdditionalId = (int) j2;
                return;
            case ID_CUE_CLUSTER_POSITION /* 241 */:
                if (this.seenClusterPositionForCurrentCuePoint) {
                    return;
                }
                assertInCues(i2);
                this.cueClusterPositions.add(j2);
                this.seenClusterPositionForCurrentCuePoint = true;
                return;
            case ID_REFERENCE_BLOCK /* 251 */:
                this.blockHasReferenceBlock = true;
                return;
            case ID_BLOCK_ADD_ID_TYPE /* 16871 */:
                getCurrentTrack(i2).blockAddIdType = (int) j2;
                return;
            case ID_CONTENT_COMPRESSION_ALGORITHM /* 16980 */:
                if (j2 == 3) {
                    return;
                }
                throw ParserException.createForMalformedContainer(obbPUqyhtS.EFoMzb + j2 + " not supported", null);
            case ID_DOC_TYPE_READ_VERSION /* 17029 */:
                if (j2 < 1 || j2 > 2) {
                    throw ParserException.createForMalformedContainer("DocTypeReadVersion " + j2 + " not supported", null);
                }
                return;
            case ID_EBML_READ_VERSION /* 17143 */:
                if (j2 == 1) {
                    return;
                }
                throw ParserException.createForMalformedContainer("EBMLReadVersion " + j2 + " not supported", null);
            case ID_CONTENT_ENCRYPTION_ALGORITHM /* 18401 */:
                if (j2 == 5) {
                    return;
                }
                throw ParserException.createForMalformedContainer("ContentEncAlgo " + j2 + " not supported", null);
            case ID_CONTENT_ENCRYPTION_AES_SETTINGS_CIPHER_MODE /* 18408 */:
                if (j2 == 1) {
                    return;
                }
                throw ParserException.createForMalformedContainer("AESSettingsCipherMode " + j2 + " not supported", null);
            case ID_SEEK_POSITION /* 21420 */:
                this.seekEntryPosition = j2 + this.segmentContentPosition;
                return;
            case ID_STEREO_MODE /* 21432 */:
                int i3 = (int) j2;
                assertInTrackEntry(i2);
                if (i3 == 0) {
                    this.currentTrack.stereoMode = 0;
                    return;
                }
                if (i3 == 1) {
                    this.currentTrack.stereoMode = 2;
                    return;
                } else if (i3 == 3) {
                    this.currentTrack.stereoMode = 1;
                    return;
                } else {
                    if (i3 != 15) {
                        return;
                    }
                    this.currentTrack.stereoMode = 3;
                    return;
                }
            case ID_DISPLAY_WIDTH /* 21680 */:
                getCurrentTrack(i2).displayWidth = (int) j2;
                return;
            case ID_DISPLAY_UNIT /* 21682 */:
                getCurrentTrack(i2).displayUnit = (int) j2;
                return;
            case ID_DISPLAY_HEIGHT /* 21690 */:
                getCurrentTrack(i2).displayHeight = (int) j2;
                return;
            case ID_FLAG_FORCED /* 21930 */:
                getCurrentTrack(i2).flagForced = j2 == 1;
                return;
            case ID_MAX_BLOCK_ADDITION_ID /* 21998 */:
                getCurrentTrack(i2).maxBlockAdditionId = (int) j2;
                return;
            case ID_CODEC_DELAY /* 22186 */:
                getCurrentTrack(i2).codecDelayNs = j2;
                return;
            case ID_SEEK_PRE_ROLL /* 22203 */:
                getCurrentTrack(i2).seekPreRollNs = j2;
                return;
            case ID_AUDIO_BIT_DEPTH /* 25188 */:
                getCurrentTrack(i2).audioBitDepth = (int) j2;
                return;
            case ID_DISCARD_PADDING /* 30114 */:
                this.blockGroupDiscardPaddingNs = j2;
                return;
            case ID_PROJECTION_TYPE /* 30321 */:
                assertInTrackEntry(i2);
                int i5 = (int) j2;
                if (i5 == 0) {
                    this.currentTrack.projectionType = 0;
                    return;
                }
                if (i5 == 1) {
                    this.currentTrack.projectionType = 1;
                    return;
                } else if (i5 == 2) {
                    this.currentTrack.projectionType = 2;
                    return;
                } else {
                    if (i5 != 3) {
                        return;
                    }
                    this.currentTrack.projectionType = 3;
                    return;
                }
            case ID_DEFAULT_DURATION /* 2352003 */:
                getCurrentTrack(i2).defaultSampleDurationNs = (int) j2;
                return;
            case ID_TIMECODE_SCALE /* 2807729 */:
                this.timecodeScale = j2;
                return;
            default:
                switch (i2) {
                    case ID_COLOUR_RANGE /* 21945 */:
                        assertInTrackEntry(i2);
                        int i7 = (int) j2;
                        if (i7 == 1) {
                            this.currentTrack.colorRange = 2;
                            return;
                        } else {
                            if (i7 != 2) {
                                return;
                            }
                            this.currentTrack.colorRange = 1;
                            return;
                        }
                    case ID_COLOUR_TRANSFER /* 21946 */:
                        assertInTrackEntry(i2);
                        int iIsoTransferCharacteristicsToColorTransfer = ColorInfo.isoTransferCharacteristicsToColorTransfer((int) j2);
                        if (iIsoTransferCharacteristicsToColorTransfer != -1) {
                            this.currentTrack.colorTransfer = iIsoTransferCharacteristicsToColorTransfer;
                            return;
                        }
                        return;
                    case ID_COLOUR_PRIMARIES /* 21947 */:
                        assertInTrackEntry(i2);
                        this.currentTrack.hasColorInfo = true;
                        int iIsoColorPrimariesToColorSpace = ColorInfo.isoColorPrimariesToColorSpace((int) j2);
                        if (iIsoColorPrimariesToColorSpace != -1) {
                            this.currentTrack.colorSpace = iIsoColorPrimariesToColorSpace;
                            return;
                        }
                        return;
                    case ID_MAX_CLL /* 21948 */:
                        getCurrentTrack(i2).maxContentLuminance = (int) j2;
                        return;
                    case ID_MAX_FALL /* 21949 */:
                        getCurrentTrack(i2).maxFrameAverageLuminance = (int) j2;
                        return;
                    default:
                        return;
                }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public final boolean sniff(ExtractorInput extractorInput) throws IOException {
        return new Ml().rl(extractorInput);
    }

    @CallSuper
    protected void stringElement(int i2, String str) throws ParserException {
        if (i2 == 134) {
            getCurrentTrack(i2).codecId = str;
            return;
        }
        if (i2 != ID_DOC_TYPE) {
            if (i2 == ID_NAME) {
                getCurrentTrack(i2).name = str;
                return;
            } else {
                if (i2 != ID_LANGUAGE) {
                    return;
                }
                getCurrentTrack(i2).language = str;
                return;
            }
        }
        if (DOC_TYPE_WEBM.equals(str) || DOC_TYPE_MATROSKA.equals(str)) {
            return;
        }
        throw ParserException.createForMalformedContainer("DocType " + str + " not supported", null);
    }

    MatroskaExtractor(com.google.android.exoplayer2.extractor.mkv.n nVar, int i2) {
        this.segmentContentPosition = -1L;
        this.timecodeScale = -9223372036854775807L;
        this.durationTimecode = -9223372036854775807L;
        this.durationUs = -9223372036854775807L;
        this.cuesContentPosition = -1L;
        this.seekPositionAfterBuildingCues = -1L;
        this.clusterTimecodeUs = -9223372036854775807L;
        this.reader = nVar;
        nVar.n(new n());
        this.seekForCuesEnabled = (i2 & 1) == 0;
        this.varintReader = new I28();
        this.tracks = new SparseArray<>();
        this.scratch = new ParsableByteArray(4);
        this.vorbisNumPageSamples = new ParsableByteArray(ByteBuffer.allocate(4).putInt(-1).array());
        this.seekEntryIdBytes = new ParsableByteArray(4);
        this.nalStartCode = new ParsableByteArray(NalUnitUtil.NAL_START_CODE);
        this.nalLength = new ParsableByteArray(4);
        this.sampleStrippedBytes = new ParsableByteArray();
        this.subtitleSample = new ParsableByteArray();
        this.encryptionInitializationVector = new ParsableByteArray(8);
        this.encryptionSubsampleData = new ParsableByteArray();
        this.supplementalData = new ParsableByteArray();
        this.blockSampleSizes = new int[1];
    }

    @CallSuper
    protected void endMasterElement(int i2) throws ParserException {
        assertInitialized();
        if (i2 != ID_BLOCK_GROUP) {
            if (i2 != ID_TRACK_ENTRY) {
                if (i2 != ID_SEEK) {
                    if (i2 != ID_CONTENT_ENCODING) {
                        if (i2 != ID_CONTENT_ENCODINGS) {
                            if (i2 != 357149030) {
                                if (i2 != ID_TRACKS) {
                                    if (i2 == ID_CUES) {
                                        if (!this.sentSeekMap) {
                                            this.extractorOutput.seekMap(buildSeekMap(this.cueTimesUs, this.cueClusterPositions));
                                            this.sentSeekMap = true;
                                        }
                                        this.cueTimesUs = null;
                                        this.cueClusterPositions = null;
                                        return;
                                    }
                                    return;
                                }
                                if (this.tracks.size() != 0) {
                                    this.extractorOutput.endTracks();
                                    return;
                                }
                                throw ParserException.createForMalformedContainer("No valid tracks were found", null);
                            }
                            if (this.timecodeScale == -9223372036854775807L) {
                                this.timecodeScale = 1000000L;
                            }
                            long j2 = this.durationTimecode;
                            if (j2 != -9223372036854775807L) {
                                this.durationUs = scaleTimecodeToUs(j2);
                                return;
                            }
                            return;
                        }
                        assertInTrackEntry(i2);
                        Track track = this.currentTrack;
                        if (track.hasContentEncryption && track.sampleStrippedBytes != null) {
                            throw ParserException.createForMalformedContainer("Combining encryption and compression is not supported", null);
                        }
                        return;
                    }
                    assertInTrackEntry(i2);
                    Track track2 = this.currentTrack;
                    if (track2.hasContentEncryption) {
                        if (track2.cryptoData != null) {
                            track2.drmInitData = new DrmInitData(new DrmInitData.SchemeData(C.UUID_NIL, "video/webm", this.currentTrack.cryptoData.encryptionKey));
                            return;
                        }
                        throw ParserException.createForMalformedContainer("Encrypted Track found but ContentEncKeyID was not found", null);
                    }
                    return;
                }
                int i3 = this.seekEntryId;
                if (i3 != -1) {
                    long j3 = this.seekEntryPosition;
                    if (j3 != -1) {
                        if (i3 == ID_CUES) {
                            this.cuesContentPosition = j3;
                            return;
                        }
                        return;
                    }
                }
                throw ParserException.createForMalformedContainer("Mandatory element SeekID or SeekPosition not found", null);
            }
            Track track3 = (Track) Assertions.checkStateNotNull(this.currentTrack);
            String str = track3.codecId;
            if (str != null) {
                if (isCodecSupported(str)) {
                    track3.initializeOutput(this.extractorOutput, track3.number);
                    this.tracks.put(track3.number, track3);
                }
                this.currentTrack = null;
                return;
            }
            throw ParserException.createForMalformedContainer("CodecId is missing in TrackEntry element", null);
        }
        if (this.blockState != 2) {
            return;
        }
        Track track4 = this.tracks.get(this.blockTrackNumber);
        track4.assertOutputInitialized();
        if (this.blockGroupDiscardPaddingNs > 0 && CODEC_ID_OPUS.equals(track4.codecId)) {
            this.supplementalData.reset(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putLong(this.blockGroupDiscardPaddingNs).array());
        }
        int i5 = 0;
        for (int i7 = 0; i7 < this.blockSampleCount; i7++) {
            i5 += this.blockSampleSizes[i7];
        }
        int i8 = 0;
        while (i8 < this.blockSampleCount) {
            long j4 = this.blockTimeUs + ((long) ((track4.defaultSampleDurationNs * i8) / 1000));
            int i9 = this.blockFlags;
            if (i8 == 0 && !this.blockHasReferenceBlock) {
                i9 |= 1;
            }
            int i10 = this.blockSampleSizes[i8];
            int i11 = i5 - i10;
            commitSampleToOutput(track4, j4, i9, i10, i11);
            i8++;
            i5 = i11;
        }
        this.blockState = 0;
    }

    protected Track getCurrentTrack(int i2) throws ParserException {
        assertInTrackEntry(i2);
        return this.currentTrack;
    }

    protected void handleBlockAddIDExtraData(Track track, ExtractorInput extractorInput, int i2) throws IOException {
        if (track.blockAddIdType != 1685485123 && track.blockAddIdType != 1685480259) {
            extractorInput.skipFully(i2);
            return;
        }
        byte[] bArr = new byte[i2];
        track.dolbyVisionConfigBytes = bArr;
        extractorInput.readFully(bArr, 0, i2);
    }

    @CallSuper
    protected void startMasterElement(int i2, long j2, long j3) throws ParserException {
        assertInitialized();
        if (i2 != ID_BLOCK_GROUP) {
            if (i2 != ID_TRACK_ENTRY) {
                if (i2 != ID_CUE_POINT) {
                    if (i2 != ID_SEEK) {
                        if (i2 != ID_CONTENT_ENCRYPTION) {
                            if (i2 != ID_MASTERING_METADATA) {
                                if (i2 != ID_SEGMENT) {
                                    if (i2 != ID_CUES) {
                                        if (i2 == ID_CLUSTER && !this.sentSeekMap) {
                                            if (this.seekForCuesEnabled && this.cuesContentPosition != -1) {
                                                this.seekForCues = true;
                                                return;
                                            } else {
                                                this.extractorOutput.seekMap(new SeekMap.Unseekable(this.durationUs));
                                                this.sentSeekMap = true;
                                                return;
                                            }
                                        }
                                        return;
                                    }
                                    this.cueTimesUs = new LongArray();
                                    this.cueClusterPositions = new LongArray();
                                    return;
                                }
                                long j4 = this.segmentContentPosition;
                                if (j4 != -1 && j4 != j2) {
                                    throw ParserException.createForMalformedContainer("Multiple Segment elements not supported", null);
                                }
                                this.segmentContentPosition = j2;
                                this.segmentContentSize = j3;
                                return;
                            }
                            getCurrentTrack(i2).hasColorInfo = true;
                            return;
                        }
                        getCurrentTrack(i2).hasContentEncryption = true;
                        return;
                    }
                    this.seekEntryId = -1;
                    this.seekEntryPosition = -1L;
                    return;
                }
                this.seenClusterPositionForCurrentCuePoint = false;
                return;
            }
            this.currentTrack = new Track();
            return;
        }
        this.blockHasReferenceBlock = false;
        this.blockGroupDiscardPaddingNs = 0L;
    }

    private static byte[] formatSubtitleTimecode(long j2, String str, long j3) {
        boolean z2;
        if (j2 != -9223372036854775807L) {
            z2 = true;
        } else {
            z2 = false;
        }
        Assertions.checkArgument(z2);
        int i2 = (int) (j2 / 3600000000L);
        long j4 = j2 - (((long) i2) * 3600000000L);
        int i3 = (int) (j4 / 60000000);
        long j5 = j4 - (((long) i3) * 60000000);
        int i5 = (int) (j5 / 1000000);
        return Util.getUtf8Bytes(String.format(Locale.US, str, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i5), Integer.valueOf((int) ((j5 - (((long) i5) * 1000000)) / j3))));
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    @CallSuper
    public void seek(long j2, long j3) {
        this.clusterTimecodeUs = -9223372036854775807L;
        this.blockState = 0;
        this.reader.reset();
        this.varintReader.O();
        resetWriteSampleData();
        for (int i2 = 0; i2 < this.tracks.size(); i2++) {
            this.tracks.valueAt(i2).reset();
        }
    }
}
