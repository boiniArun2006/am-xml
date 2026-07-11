package androidx.media3.container;

import OW.n;
import androidx.annotation.Nullable;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import com.google.common.collect.nKK;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import kotlin.UByte;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@UnstableApi
public final class NalUnitUtil {
    public static final int EXTENDED_SAR = 255;
    public static final int H264_NAL_UNIT_TYPE_AUD = 9;
    public static final int H264_NAL_UNIT_TYPE_IDR = 5;
    public static final int H264_NAL_UNIT_TYPE_NON_IDR = 1;
    public static final int H264_NAL_UNIT_TYPE_PARTITION_A = 2;
    public static final int H264_NAL_UNIT_TYPE_PPS = 8;
    public static final int H264_NAL_UNIT_TYPE_PREFIX = 14;
    public static final int H264_NAL_UNIT_TYPE_SEI = 6;
    public static final int H264_NAL_UNIT_TYPE_SPS = 7;
    public static final int H264_NAL_UNIT_TYPE_UNSPECIFIED = 24;
    public static final int H265_NAL_UNIT_TYPE_AUD = 35;
    public static final int H265_NAL_UNIT_TYPE_BLA_W_LP = 16;
    public static final int H265_NAL_UNIT_TYPE_CRA = 21;
    public static final int H265_NAL_UNIT_TYPE_PPS = 34;
    public static final int H265_NAL_UNIT_TYPE_PREFIX_SEI = 39;
    public static final int H265_NAL_UNIT_TYPE_RASL_R = 9;
    public static final int H265_NAL_UNIT_TYPE_SPS = 33;
    public static final int H265_NAL_UNIT_TYPE_SUFFIX_SEI = 40;
    public static final int H265_NAL_UNIT_TYPE_UNSPECIFIED = 48;
    public static final int H265_NAL_UNIT_TYPE_VPS = 32;
    private static final int INVALID_ID = -1;

    @Deprecated
    public static final int NAL_UNIT_TYPE_AUD = 9;

    @Deprecated
    public static final int NAL_UNIT_TYPE_IDR = 5;

    @Deprecated
    public static final int NAL_UNIT_TYPE_NON_IDR = 1;

    @Deprecated
    public static final int NAL_UNIT_TYPE_PARTITION_A = 2;

    @Deprecated
    public static final int NAL_UNIT_TYPE_PPS = 8;

    @Deprecated
    public static final int NAL_UNIT_TYPE_PREFIX = 14;

    @Deprecated
    public static final int NAL_UNIT_TYPE_SEI = 6;

    @Deprecated
    public static final int NAL_UNIT_TYPE_SPS = 7;
    private static final String TAG = "NalUnitUtil";
    public static final byte[] NAL_START_CODE = {0, 0, 0, 1};
    public static final float[] ASPECT_RATIO_IDC_VALUES = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object scratchEscapePositionsLock = new Object();
    private static int[] scratchEscapePositions = new int[10];

    private static int applyConformanceWindowToHeight(int i2, int i3, int i5, int i7) {
        return i2 - ((i3 == 1 ? 2 : 1) * (i5 + i7));
    }

    private static int applyConformanceWindowToWidth(int i2, int i3, int i5, int i7) {
        int i8 = 2;
        if (i3 != 1 && i3 != 2) {
            i8 = 1;
        }
        return i2 - (i8 * (i5 + i7));
    }

    public static void clearPrefixFlags(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    @Nullable
    private static String createCodecStringFromH265SpsPalyoad(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        parsableNalUnitBitArray.skipBits(4);
        int bits = parsableNalUnitBitArray.readBits(3);
        parsableNalUnitBitArray.skipBit();
        H265ProfileTierLevel h265ProfileTierLevel = parseH265ProfileTierLevel(parsableNalUnitBitArray, true, bits, null);
        return CodecSpecificDataUtil.buildHevcCodecString(h265ProfileTierLevel.generalProfileSpace, h265ProfileTierLevel.generalTierFlag, h265ProfileTierLevel.generalProfileIdc, h265ProfileTierLevel.generalProfileCompatibilityFlags, h265ProfileTierLevel.constraintBytes, h265ProfileTierLevel.generalLevelIdc);
    }

    private static nKK findNalUnitPositions(byte[] bArr) {
        boolean[] zArr = new boolean[3];
        nKK.j jVarGh = nKK.gh();
        int i2 = 0;
        while (i2 < bArr.length) {
            int iFindNalUnit = findNalUnit(bArr, i2, bArr.length, zArr);
            if (iFindNalUnit != bArr.length) {
                jVarGh.n(Integer.valueOf(iFindNalUnit));
            }
            i2 = iFindNalUnit + 3;
        }
        return jVarGh.gh();
    }

    @Nullable
    public static String getH265BaseLayerCodecsString(List<byte[]> list) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            byte[] bArr = list.get(i2);
            int length = bArr.length;
            if (length > 3) {
                nKK nkkFindNalUnitPositions = findNalUnitPositions(bArr);
                for (int i3 = 0; i3 < nkkFindNalUnitPositions.size(); i3++) {
                    if (((Integer) nkkFindNalUnitPositions.get(i3)).intValue() + 3 < length) {
                        ParsableNalUnitBitArray parsableNalUnitBitArray = new ParsableNalUnitBitArray(bArr, ((Integer) nkkFindNalUnitPositions.get(i3)).intValue() + 3, length);
                        H265NalHeader h265NalHeader = parseH265NalHeader(parsableNalUnitBitArray);
                        if (h265NalHeader.nalUnitType == 33 && h265NalHeader.layerId == 0) {
                            return createCodecStringFromH265SpsPalyoad(parsableNalUnitBitArray);
                        }
                    }
                }
            }
        }
        return null;
    }

    public static boolean isH264NalUnitDependedOn(byte b2) {
        if (((b2 & 96) >> 5) != 0) {
            return true;
        }
        int i2 = b2 & 31;
        return (i2 == 1 || i2 == 9 || i2 == 14) ? false : true;
    }

    @Deprecated
    public static boolean isNalUnitSei(@Nullable String str, byte b2) {
        return ("video/avc".equals(str) && (b2 & 31) == 6) || ("video/hevc".equals(str) && ((b2 & 126) >> 1) == 39);
    }

    private static H265VideoSignalInfo parseH265VideoSignalInfo(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        parsableNalUnitBitArray.skipBits(3);
        int i2 = parsableNalUnitBitArray.readBit() ? 1 : 2;
        int iIsoColorPrimariesToColorSpace = ColorInfo.isoColorPrimariesToColorSpace(parsableNalUnitBitArray.readBits(8));
        int iIsoTransferCharacteristicsToColorTransfer = ColorInfo.isoTransferCharacteristicsToColorTransfer(parsableNalUnitBitArray.readBits(8));
        parsableNalUnitBitArray.skipBits(8);
        return new H265VideoSignalInfo(iIsoColorPrimariesToColorSpace, i2, iIsoTransferCharacteristicsToColorTransfer);
    }

    /* JADX WARN: Removed duplicated region for block: B:113:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x021f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static SpsData parseSpsNalUnitPayload(byte[] bArr, int i2, int i3) {
        int unsignedExpGolombCodedInt;
        boolean bit;
        int unsignedExpGolombCodedInt2;
        int i5;
        int i7;
        int i8;
        int i9;
        boolean z2;
        int unsignedExpGolombCodedInt3;
        int i10;
        int i11;
        int i12;
        float f3;
        int i13;
        int i14;
        int i15;
        boolean z3;
        int i16;
        int i17;
        int i18;
        boolean bit2;
        boolean bit3;
        int i19;
        int i20;
        ParsableNalUnitBitArray parsableNalUnitBitArray = new ParsableNalUnitBitArray(bArr, i2, i3);
        int bits = parsableNalUnitBitArray.readBits(8);
        int bits2 = parsableNalUnitBitArray.readBits(8);
        int bits3 = parsableNalUnitBitArray.readBits(8);
        int unsignedExpGolombCodedInt4 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        if (bits == 100 || bits == 110 || bits == 122 || bits == 244 || bits == 44 || bits == 83 || bits == 86 || bits == 118 || bits == 128 || bits == 138) {
            unsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            bit = unsignedExpGolombCodedInt == 3 ? parsableNalUnitBitArray.readBit() : false;
            unsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt5 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.skipBit();
            if (parsableNalUnitBitArray.readBit()) {
                int i21 = unsignedExpGolombCodedInt != 3 ? 8 : 12;
                i5 = 16;
                int i22 = 0;
                while (i22 < i21) {
                    if (parsableNalUnitBitArray.readBit()) {
                        skipScalingList(parsableNalUnitBitArray, i22 < 6 ? 16 : 64);
                    }
                    i22++;
                }
            } else {
                i5 = 16;
            }
            i7 = unsignedExpGolombCodedInt5;
        } else {
            unsignedExpGolombCodedInt = 1;
            i5 = 16;
            i7 = 0;
            bit = false;
            unsignedExpGolombCodedInt2 = 0;
        }
        int unsignedExpGolombCodedInt6 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 4;
        int unsignedExpGolombCodedInt7 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        if (unsignedExpGolombCodedInt7 == 0) {
            unsignedExpGolombCodedInt3 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 4;
            i8 = bits;
            i9 = unsignedExpGolombCodedInt7;
            z2 = false;
        } else {
            if (unsignedExpGolombCodedInt7 == 1) {
                boolean bit4 = parsableNalUnitBitArray.readBit();
                parsableNalUnitBitArray.readSignedExpGolombCodedInt();
                parsableNalUnitBitArray.readSignedExpGolombCodedInt();
                i8 = bits;
                long unsignedExpGolombCodedInt8 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                i9 = unsignedExpGolombCodedInt7;
                for (int i23 = 0; i23 < unsignedExpGolombCodedInt8; i23++) {
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                }
                z2 = bit4;
            } else {
                i8 = bits;
                i9 = unsignedExpGolombCodedInt7;
                z2 = false;
            }
            unsignedExpGolombCodedInt3 = 0;
        }
        int unsignedExpGolombCodedInt9 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.skipBit();
        int unsignedExpGolombCodedInt10 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1;
        int unsignedExpGolombCodedInt11 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1;
        boolean bit5 = parsableNalUnitBitArray.readBit();
        int i24 = (2 - (bit5 ? 1 : 0)) * unsignedExpGolombCodedInt11;
        if (!bit5) {
            parsableNalUnitBitArray.skipBit();
        }
        parsableNalUnitBitArray.skipBit();
        int i25 = unsignedExpGolombCodedInt10 * 16;
        int i26 = i24 * 16;
        if (parsableNalUnitBitArray.readBit()) {
            int unsignedExpGolombCodedInt12 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt13 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt14 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt15 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            if (unsignedExpGolombCodedInt == 0) {
                i20 = 2 - (bit5 ? 1 : 0);
                i19 = 1;
            } else {
                i19 = unsignedExpGolombCodedInt == 3 ? 1 : 2;
                i20 = (unsignedExpGolombCodedInt == 1 ? 2 : 1) * (2 - (bit5 ? 1 : 0));
            }
            i25 -= (unsignedExpGolombCodedInt12 + unsignedExpGolombCodedInt13) * i19;
            i26 -= (unsignedExpGolombCodedInt14 + unsignedExpGolombCodedInt15) * i20;
        }
        int i27 = i25;
        int i28 = i8;
        int unsignedExpGolombCodedInt16 = ((i28 == 44 || i28 == 86 || i28 == 100 || i28 == 110 || i28 == 122 || i28 == 244) && (bits2 & 16) != 0) ? 0 : i5;
        float f4 = 1.0f;
        if (parsableNalUnitBitArray.readBit()) {
            if (parsableNalUnitBitArray.readBit()) {
                int bits4 = parsableNalUnitBitArray.readBits(8);
                if (bits4 == 255) {
                    int i29 = i5;
                    int bits5 = parsableNalUnitBitArray.readBits(i29);
                    int bits6 = parsableNalUnitBitArray.readBits(i29);
                    if (bits5 != 0 && bits6 != 0) {
                        f4 = bits5 / bits6;
                    }
                } else {
                    float[] fArr = ASPECT_RATIO_IDC_VALUES;
                    if (bits4 < fArr.length) {
                        f4 = fArr[bits4];
                    } else {
                        Log.w(TAG, "Unexpected aspect_ratio_idc value: " + bits4);
                    }
                }
            }
            if (parsableNalUnitBitArray.readBit()) {
                parsableNalUnitBitArray.skipBit();
            }
            if (parsableNalUnitBitArray.readBit()) {
                parsableNalUnitBitArray.skipBits(3);
                i17 = parsableNalUnitBitArray.readBit() ? 1 : 2;
                if (parsableNalUnitBitArray.readBit()) {
                    int bits7 = parsableNalUnitBitArray.readBits(8);
                    int bits8 = parsableNalUnitBitArray.readBits(8);
                    parsableNalUnitBitArray.skipBits(8);
                    int iIsoColorPrimariesToColorSpace = ColorInfo.isoColorPrimariesToColorSpace(bits7);
                    int iIsoTransferCharacteristicsToColorTransfer = ColorInfo.isoTransferCharacteristicsToColorTransfer(bits8);
                    i18 = iIsoColorPrimariesToColorSpace;
                    i16 = iIsoTransferCharacteristicsToColorTransfer;
                    if (parsableNalUnitBitArray.readBit()) {
                        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    }
                    if (parsableNalUnitBitArray.readBit()) {
                        parsableNalUnitBitArray.skipBits(65);
                    }
                    bit2 = parsableNalUnitBitArray.readBit();
                    if (bit2) {
                        skipHrdParameters(parsableNalUnitBitArray);
                    }
                    bit3 = parsableNalUnitBitArray.readBit();
                    if (bit3) {
                        skipHrdParameters(parsableNalUnitBitArray);
                    }
                    if (!bit2 || bit3) {
                        parsableNalUnitBitArray.skipBit();
                    }
                    parsableNalUnitBitArray.skipBit();
                    if (parsableNalUnitBitArray.readBit()) {
                        parsableNalUnitBitArray.skipBit();
                        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                        unsignedExpGolombCodedInt16 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    }
                    i15 = i16;
                    i14 = i17;
                    i10 = unsignedExpGolombCodedInt16;
                    i11 = unsignedExpGolombCodedInt2;
                    i12 = unsignedExpGolombCodedInt3;
                    f3 = f4;
                    z3 = z2;
                    i13 = i18;
                } else {
                    i16 = -1;
                }
            } else {
                i16 = -1;
                i17 = -1;
            }
            i18 = -1;
            if (parsableNalUnitBitArray.readBit()) {
            }
            if (parsableNalUnitBitArray.readBit()) {
            }
            bit2 = parsableNalUnitBitArray.readBit();
            if (bit2) {
            }
            bit3 = parsableNalUnitBitArray.readBit();
            if (bit3) {
            }
            if (!bit2) {
                parsableNalUnitBitArray.skipBit();
                parsableNalUnitBitArray.skipBit();
                if (parsableNalUnitBitArray.readBit()) {
                }
                i15 = i16;
                i14 = i17;
                i10 = unsignedExpGolombCodedInt16;
                i11 = unsignedExpGolombCodedInt2;
                i12 = unsignedExpGolombCodedInt3;
                f3 = f4;
                z3 = z2;
                i13 = i18;
            }
        } else {
            i10 = unsignedExpGolombCodedInt16;
            i11 = unsignedExpGolombCodedInt2;
            i12 = unsignedExpGolombCodedInt3;
            f3 = 1.0f;
            i13 = -1;
            i14 = -1;
            i15 = -1;
            z3 = z2;
        }
        return new SpsData(i28, bits2, bits3, unsignedExpGolombCodedInt4, unsignedExpGolombCodedInt9, i27, i26, f3, i11, i7, bit, bit5, unsignedExpGolombCodedInt6, i9, i12, z3, i13, i14, i15, i10);
    }

    private static void skipH265DpbSize(ParsableNalUnitBitArray parsableNalUnitBitArray, int i2, int[] iArr, int[] iArr2, boolean[][] zArr) {
        for (int i3 = 1; i3 < i2; i3++) {
            boolean bit = parsableNalUnitBitArray.readBit();
            int i5 = 0;
            while (i5 < iArr[i3]) {
                if ((i5 <= 0 || !bit) ? i5 == 0 : parsableNalUnitBitArray.readBit()) {
                    for (int i7 = 0; i7 < iArr2[i3]; i7++) {
                        if (zArr[i3][i7]) {
                            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                        }
                    }
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                }
                i5++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [int] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    private static void skipH265HrdParameters(ParsableNalUnitBitArray parsableNalUnitBitArray, boolean z2, int i2) {
        ?? r9;
        ?? r12;
        boolean bit;
        boolean bit2;
        if (z2) {
            boolean bit3 = parsableNalUnitBitArray.readBit();
            boolean bit4 = parsableNalUnitBitArray.readBit();
            if (bit3 || bit4) {
                bit = parsableNalUnitBitArray.readBit();
                if (bit) {
                    parsableNalUnitBitArray.skipBits(19);
                }
                parsableNalUnitBitArray.skipBits(8);
                if (bit) {
                    parsableNalUnitBitArray.skipBits(4);
                }
                parsableNalUnitBitArray.skipBits(15);
                r12 = bit4;
                r9 = bit3;
            } else {
                bit = false;
                r12 = bit4;
                r9 = bit3;
            }
        } else {
            r9 = 0;
            r12 = 0;
            bit = false;
        }
        for (int i3 = 0; i3 <= i2; i3++) {
            boolean bit5 = parsableNalUnitBitArray.readBit();
            if (!bit5) {
                bit5 = parsableNalUnitBitArray.readBit();
            }
            if (bit5) {
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                bit2 = false;
            } else {
                bit2 = parsableNalUnitBitArray.readBit();
            }
            int unsignedExpGolombCodedInt = !bit2 ? parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() : 0;
            int i5 = r9 + r12;
            for (int i7 = 0; i7 < i5; i7++) {
                for (int i8 = 0; i8 <= unsignedExpGolombCodedInt; i8++) {
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    if (bit) {
                        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    }
                    parsableNalUnitBitArray.skipBit();
                }
            }
        }
    }

    private static void skipH265ScalingList(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = 0;
            while (i3 < 6) {
                int i5 = 1;
                if (parsableNalUnitBitArray.readBit()) {
                    int iMin = Math.min(64, 1 << ((i2 << 1) + 4));
                    if (i2 > 1) {
                        parsableNalUnitBitArray.readSignedExpGolombCodedInt();
                    }
                    for (int i7 = 0; i7 < iMin; i7++) {
                        parsableNalUnitBitArray.readSignedExpGolombCodedInt();
                    }
                } else {
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                }
                if (i2 == 3) {
                    i5 = 3;
                }
                i3 += i5;
            }
        }
    }

    public static final class H265LayerInfo {
        public final int layerIdInVps;
        public final int viewId;

        public H265LayerInfo(int i2, int i3) {
            this.layerIdInVps = i2;
            this.viewId = i3;
        }
    }

    public static final class H265NalHeader {
        public final int layerId;
        public final int nalUnitType;
        public final int temporalId;

        public H265NalHeader(int i2, int i3, int i5) {
            this.nalUnitType = i2;
            this.layerId = i3;
            this.temporalId = i5;
        }
    }

    public static final class H265ProfileTierLevel {
        public final int[] constraintBytes;
        public final int generalLevelIdc;
        public final int generalProfileCompatibilityFlags;
        public final int generalProfileIdc;
        public final int generalProfileSpace;
        public final boolean generalTierFlag;

        public H265ProfileTierLevel(int i2, boolean z2, int i3, int i5, int[] iArr, int i7) {
            this.generalProfileSpace = i2;
            this.generalTierFlag = z2;
            this.generalProfileIdc = i3;
            this.generalProfileCompatibilityFlags = i5;
            this.constraintBytes = iArr;
            this.generalLevelIdc = i7;
        }
    }

    public static final class H265ProfileTierLevelsAndIndices {
        public final int[] indices;
        public final nKK profileTierLevels;

        public H265ProfileTierLevelsAndIndices(List<H265ProfileTierLevel> list, int[] iArr) {
            this.profileTierLevels = nKK.ty(list);
            this.indices = iArr;
        }
    }

    public static final class H265RepFormat {
        public final int bitDepthChromaMinus8;
        public final int bitDepthLumaMinus8;
        public final int chromaFormatIdc;
        public final int height;
        public final int width;

        public H265RepFormat(int i2, int i3, int i5, int i7, int i8) {
            this.chromaFormatIdc = i2;
            this.bitDepthLumaMinus8 = i3;
            this.bitDepthChromaMinus8 = i5;
            this.width = i7;
            this.height = i8;
        }
    }

    public static final class H265RepFormatsAndIndices {
        public final int[] indices;
        public final nKK repFormats;

        public H265RepFormatsAndIndices(List<H265RepFormat> list, int[] iArr) {
            this.repFormats = nKK.ty(list);
            this.indices = iArr;
        }
    }

    public static final class H265Sei3dRefDisplayInfoData {
        public final int exponentRefDisplayWidth;
        public final int exponentRefViewingDist;
        public final int leftViewId;
        public final int mantissaRefDisplayWidth;
        public final int mantissaRefViewingDist;
        public final int numRefDisplays;
        public final int precRefDisplayWidth;
        public final int precRefViewingDist;
        public final int rightViewId;

        public H265Sei3dRefDisplayInfoData(int i2, int i3, int i5, int i7, int i8, int i9, int i10, int i11, int i12) {
            this.precRefDisplayWidth = i2;
            this.precRefViewingDist = i3;
            this.numRefDisplays = i5;
            this.leftViewId = i7;
            this.rightViewId = i8;
            this.exponentRefDisplayWidth = i9;
            this.mantissaRefDisplayWidth = i10;
            this.exponentRefViewingDist = i11;
            this.mantissaRefViewingDist = i12;
        }
    }

    public static final class H265SpsData {
        public final int bitDepthChromaMinus8;
        public final int bitDepthLumaMinus8;
        public final int chromaFormatIdc;
        public final int colorRange;
        public final int colorSpace;
        public final int colorTransfer;
        public final int height;
        public final int maxNumReorderPics;
        public final int maxSubLayersMinus1;
        public final H265NalHeader nalHeader;
        public final float pixelWidthHeightRatio;

        @Nullable
        public final H265ProfileTierLevel profileTierLevel;
        public final int seqParameterSetId;
        public final int width;

        public H265SpsData(H265NalHeader h265NalHeader, int i2, @Nullable H265ProfileTierLevel h265ProfileTierLevel, int i3, int i5, int i7, int i8, int i9, int i10, float f3, int i11, int i12, int i13, int i14) {
            this.nalHeader = h265NalHeader;
            this.maxSubLayersMinus1 = i2;
            this.profileTierLevel = h265ProfileTierLevel;
            this.chromaFormatIdc = i3;
            this.bitDepthLumaMinus8 = i5;
            this.bitDepthChromaMinus8 = i7;
            this.seqParameterSetId = i8;
            this.width = i9;
            this.height = i10;
            this.pixelWidthHeightRatio = f3;
            this.maxNumReorderPics = i11;
            this.colorSpace = i12;
            this.colorRange = i13;
            this.colorTransfer = i14;
        }
    }

    public static final class H265VideoSignalInfo {
        public final int colorRange;
        public final int colorSpace;
        public final int colorTransfer;

        public H265VideoSignalInfo(int i2, int i3, int i5) {
            this.colorSpace = i2;
            this.colorRange = i3;
            this.colorTransfer = i5;
        }
    }

    public static final class H265VideoSignalInfosAndIndices {
        public final int[] indices;
        public final nKK videoSignalInfos;

        public H265VideoSignalInfosAndIndices(List<H265VideoSignalInfo> list, int[] iArr) {
            this.videoSignalInfos = nKK.ty(list);
            this.indices = iArr;
        }
    }

    public static final class H265VpsData {
        public final nKK layerInfos;
        public final H265NalHeader nalHeader;
        public final H265ProfileTierLevelsAndIndices profileTierLevelsAndIndices;

        @Nullable
        public final H265RepFormatsAndIndices repFormatsAndIndices;

        @Nullable
        public final H265VideoSignalInfosAndIndices videoSignalInfosAndIndices;

        public H265VpsData(H265NalHeader h265NalHeader, @Nullable List<H265LayerInfo> list, H265ProfileTierLevelsAndIndices h265ProfileTierLevelsAndIndices, @Nullable H265RepFormatsAndIndices h265RepFormatsAndIndices, @Nullable H265VideoSignalInfosAndIndices h265VideoSignalInfosAndIndices) {
            nKK nkkR;
            this.nalHeader = h265NalHeader;
            if (list != null) {
                nkkR = nKK.ty(list);
            } else {
                nkkR = nKK.r();
            }
            this.layerInfos = nkkR;
            this.profileTierLevelsAndIndices = h265ProfileTierLevelsAndIndices;
            this.repFormatsAndIndices = h265RepFormatsAndIndices;
            this.videoSignalInfosAndIndices = h265VideoSignalInfosAndIndices;
        }
    }

    public static final class PpsData {
        public final boolean bottomFieldPicOrderInFramePresentFlag;
        public final int picParameterSetId;
        public final int seqParameterSetId;

        public PpsData(int i2, int i3, boolean z2) {
            this.picParameterSetId = i2;
            this.seqParameterSetId = i3;
            this.bottomFieldPicOrderInFramePresentFlag = z2;
        }
    }

    public static final class SpsData {
        public final int bitDepthChromaMinus8;
        public final int bitDepthLumaMinus8;
        public final int colorRange;
        public final int colorSpace;
        public final int colorTransfer;
        public final int constraintsFlagsAndReservedZero2Bits;
        public final boolean deltaPicOrderAlwaysZeroFlag;
        public final boolean frameMbsOnlyFlag;
        public final int frameNumLength;
        public final int height;
        public final int levelIdc;
        public final int maxNumRefFrames;
        public final int maxNumReorderFrames;
        public final int picOrderCntLsbLength;
        public final int picOrderCountType;
        public final float pixelWidthHeightRatio;
        public final int profileIdc;
        public final boolean separateColorPlaneFlag;
        public final int seqParameterSetId;
        public final int width;

        public SpsData(int i2, int i3, int i5, int i7, int i8, int i9, int i10, float f3, int i11, int i12, boolean z2, boolean z3, int i13, int i14, int i15, boolean z4, int i16, int i17, int i18, int i19) {
            this.profileIdc = i2;
            this.constraintsFlagsAndReservedZero2Bits = i3;
            this.levelIdc = i5;
            this.seqParameterSetId = i7;
            this.maxNumRefFrames = i8;
            this.width = i9;
            this.height = i10;
            this.pixelWidthHeightRatio = f3;
            this.bitDepthLumaMinus8 = i11;
            this.bitDepthChromaMinus8 = i12;
            this.separateColorPlaneFlag = z2;
            this.frameMbsOnlyFlag = z3;
            this.frameNumLength = i13;
            this.picOrderCountType = i14;
            this.picOrderCntLsbLength = i15;
            this.deltaPicOrderAlwaysZeroFlag = z4;
            this.colorSpace = i16;
            this.colorRange = i17;
            this.colorTransfer = i18;
            this.maxNumReorderFrames = i19;
        }
    }

    public static int findNalUnit(byte[] bArr, int i2, int i3, boolean[] zArr) {
        int i5 = i3 - i2;
        Assertions.checkState(i5 >= 0);
        if (i5 == 0) {
            return i3;
        }
        if (zArr[0]) {
            clearPrefixFlags(zArr);
            return i2 - 3;
        }
        if (i5 > 1 && zArr[1] && bArr[i2] == 1) {
            clearPrefixFlags(zArr);
            return i2 - 2;
        }
        if (i5 > 2 && zArr[2] && bArr[i2] == 0 && bArr[i2 + 1] == 1) {
            clearPrefixFlags(zArr);
            return i2 - 1;
        }
        int i7 = i3 - 1;
        int i8 = i2 + 2;
        while (i8 < i7) {
            byte b2 = bArr[i8];
            if ((b2 & 254) == 0) {
                int i9 = i8 - 2;
                if (bArr[i9] == 0 && bArr[i8 - 1] == 0 && b2 == 1) {
                    clearPrefixFlags(zArr);
                    return i9;
                }
                i8 -= 2;
            }
            i8 += 3;
        }
        zArr[0] = i5 <= 2 ? !(i5 != 2 ? !(zArr[1] && bArr[i7] == 1) : !(zArr[2] && bArr[i3 + (-2)] == 0 && bArr[i7] == 1)) : bArr[i3 + (-3)] == 0 && bArr[i3 + (-2)] == 0 && bArr[i7] == 1;
        zArr[1] = i5 <= 1 ? zArr[2] && bArr[i7] == 0 : bArr[i3 + (-2)] == 0 && bArr[i7] == 0;
        zArr[2] = bArr[i7] == 0;
        return i3;
    }

    private static int findNextUnescapeIndex(byte[] bArr, int i2, int i3) {
        while (i2 < i3 - 2) {
            if (bArr[i2] == 0 && bArr[i2 + 1] == 0 && bArr[i2 + 2] == 3) {
                return i2;
            }
            i2++;
        }
        return i3;
    }

    public static int getH265NalUnitType(byte[] bArr, int i2) {
        return (bArr[i2 + 3] & 126) >> 1;
    }

    public static int getNalUnitType(byte[] bArr, int i2) {
        return bArr[i2 + 3] & 31;
    }

    public static boolean isDependedOn(byte[] bArr, int i2, int i3, Format format) {
        if (Objects.equals(format.sampleMimeType, "video/avc")) {
            return isH264NalUnitDependedOn(bArr[i2]);
        }
        if (Objects.equals(format.sampleMimeType, "video/hevc")) {
            return isH265NalUnitDependedOn(bArr, i2, i3, format);
        }
        return true;
    }

    private static boolean isH265NalUnitDependedOn(byte[] bArr, int i2, int i3, Format format) {
        H265NalHeader h265NalHeader = parseH265NalHeader(new ParsableNalUnitBitArray(bArr, i2, i3 + i2));
        int i5 = h265NalHeader.nalUnitType;
        if (i5 == 35) {
            return false;
        }
        return (i5 <= 14 && i5 % 2 == 0 && h265NalHeader.temporalId == format.maxSubLayers - 1) ? false : true;
    }

    public static int numberOfBytesInNalUnitHeader(Format format) {
        if (Objects.equals(format.sampleMimeType, "video/avc")) {
            return 1;
        }
        return (Objects.equals(format.sampleMimeType, "video/hevc") || MimeTypes.containsCodecsCorrespondingToMimeType(format.codecs, "video/hevc")) ? 2 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static H265ProfileTierLevel parseH265ProfileTierLevel(ParsableNalUnitBitArray parsableNalUnitBitArray, boolean z2, int i2, @Nullable H265ProfileTierLevel h265ProfileTierLevel) {
        int[] iArr;
        int i3;
        boolean z3;
        int i5;
        int i7;
        boolean bit;
        int bits;
        int i8;
        int[] iArr2 = new int[6];
        if (z2) {
            int bits2 = parsableNalUnitBitArray.readBits(2);
            bit = parsableNalUnitBitArray.readBit();
            bits = parsableNalUnitBitArray.readBits(5);
            i8 = 0;
            for (int i9 = 0; i9 < 32; i9++) {
                if (parsableNalUnitBitArray.readBit()) {
                    i8 |= 1 << i9;
                }
            }
            for (int i10 = 0; i10 < 6; i10++) {
                iArr2[i10] = parsableNalUnitBitArray.readBits(8);
            }
            i3 = bits2;
        } else {
            if (h265ProfileTierLevel == null) {
                iArr = iArr2;
                i3 = 0;
                z3 = false;
                i5 = 0;
                i7 = 0;
                int bits3 = parsableNalUnitBitArray.readBits(8);
                int i11 = 0;
                for (int i12 = 0; i12 < i2; i12++) {
                    if (parsableNalUnitBitArray.readBit()) {
                        i11 += 88;
                    }
                    if (parsableNalUnitBitArray.readBit()) {
                        i11 += 8;
                    }
                }
                parsableNalUnitBitArray.skipBits(i11);
                if (i2 > 0) {
                    parsableNalUnitBitArray.skipBits((8 - i2) * 2);
                }
                return new H265ProfileTierLevel(i3, z3, i5, i7, iArr, bits3);
            }
            int i13 = h265ProfileTierLevel.generalProfileSpace;
            bit = h265ProfileTierLevel.generalTierFlag;
            bits = h265ProfileTierLevel.generalProfileIdc;
            i8 = h265ProfileTierLevel.generalProfileCompatibilityFlags;
            iArr2 = h265ProfileTierLevel.constraintBytes;
            i3 = i13;
        }
        iArr = iArr2;
        z3 = bit;
        i5 = bits;
        i7 = i8;
        int bits32 = parsableNalUnitBitArray.readBits(8);
        int i112 = 0;
        while (i12 < i2) {
        }
        parsableNalUnitBitArray.skipBits(i112);
        if (i2 > 0) {
        }
        return new H265ProfileTierLevel(i3, z3, i5, i7, iArr, bits32);
    }

    private static H265RepFormat parseH265RepFormat(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        int i2;
        int i3;
        int bits;
        int bits2 = parsableNalUnitBitArray.readBits(16);
        int bits3 = parsableNalUnitBitArray.readBits(16);
        if (parsableNalUnitBitArray.readBit()) {
            int bits4 = parsableNalUnitBitArray.readBits(2);
            if (bits4 == 3) {
                parsableNalUnitBitArray.skipBit();
            }
            int bits5 = parsableNalUnitBitArray.readBits(4);
            bits = parsableNalUnitBitArray.readBits(4);
            i3 = bits5;
            i2 = bits4;
        } else {
            i2 = 0;
            i3 = 0;
            bits = 0;
        }
        if (parsableNalUnitBitArray.readBit()) {
            int unsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt3 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt4 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            bits2 = applyConformanceWindowToWidth(bits2, i2, unsignedExpGolombCodedInt, unsignedExpGolombCodedInt2);
            bits3 = applyConformanceWindowToHeight(bits3, i2, unsignedExpGolombCodedInt3, unsignedExpGolombCodedInt4);
        }
        return new H265RepFormat(i2, i3, bits, bits2, bits3);
    }

    @Nullable
    public static H265Sei3dRefDisplayInfoData parseH265Sei3dRefDisplayInfo(byte[] bArr, int i2, int i3) {
        byte b2;
        int i5 = i2 + 2;
        do {
            i3--;
            b2 = bArr[i3];
            if (b2 != 0) {
                break;
            }
        } while (i3 > i5);
        if (b2 != 0 && i3 > i5) {
            ParsableNalUnitBitArray parsableNalUnitBitArray = new ParsableNalUnitBitArray(bArr, i5, i3 + 1);
            while (parsableNalUnitBitArray.canReadBits(16)) {
                int bits = parsableNalUnitBitArray.readBits(8);
                int i7 = 0;
                while (bits == 255) {
                    i7 += 255;
                    bits = parsableNalUnitBitArray.readBits(8);
                }
                int i8 = i7 + bits;
                int bits2 = parsableNalUnitBitArray.readBits(8);
                int i9 = 0;
                while (bits2 == 255) {
                    i9 += 255;
                    bits2 = parsableNalUnitBitArray.readBits(8);
                }
                int i10 = i9 + bits2;
                if (i10 == 0 || !parsableNalUnitBitArray.canReadBits(i10)) {
                    break;
                }
                if (i8 == 176) {
                    int unsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    boolean bit = parsableNalUnitBitArray.readBit();
                    int unsignedExpGolombCodedInt2 = bit ? parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() : 0;
                    int unsignedExpGolombCodedInt3 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    int unsignedExpGolombCodedInt4 = -1;
                    int unsignedExpGolombCodedInt5 = -1;
                    int bits3 = -1;
                    int bits4 = -1;
                    int i11 = -1;
                    int bits5 = -1;
                    for (int i12 = 0; i12 <= unsignedExpGolombCodedInt3; i12++) {
                        unsignedExpGolombCodedInt4 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                        unsignedExpGolombCodedInt5 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                        bits3 = parsableNalUnitBitArray.readBits(6);
                        if (bits3 == 63) {
                            return null;
                        }
                        bits4 = parsableNalUnitBitArray.readBits(bits3 == 0 ? Math.max(0, unsignedExpGolombCodedInt - 30) : Math.max(0, (bits3 + unsignedExpGolombCodedInt) - 31));
                        if (bit) {
                            int bits6 = parsableNalUnitBitArray.readBits(6);
                            if (bits6 == 63) {
                                return null;
                            }
                            i11 = bits6;
                            bits5 = parsableNalUnitBitArray.readBits(bits6 == 0 ? Math.max(0, unsignedExpGolombCodedInt2 - 30) : Math.max(0, (bits6 + unsignedExpGolombCodedInt2) - 31));
                        }
                        if (parsableNalUnitBitArray.readBit()) {
                            parsableNalUnitBitArray.skipBits(10);
                        }
                    }
                    return new H265Sei3dRefDisplayInfoData(unsignedExpGolombCodedInt, unsignedExpGolombCodedInt2, unsignedExpGolombCodedInt3 + 1, unsignedExpGolombCodedInt4, unsignedExpGolombCodedInt5, bits3, bits4, i11, bits5);
                }
            }
        }
        return null;
    }

    public static H265SpsData parseH265SpsNalUnit(byte[] bArr, int i2, int i3, @Nullable H265VpsData h265VpsData) {
        return parseH265SpsNalUnitPayload(bArr, i2 + 2, i3, parseH265NalHeader(new ParsableNalUnitBitArray(bArr, i2, i3)), h265VpsData);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ae  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static H265SpsData parseH265SpsNalUnitPayload(byte[] bArr, int i2, int i3, H265NalHeader h265NalHeader, @Nullable H265VpsData h265VpsData) {
        int unsignedExpGolombCodedInt;
        int iApplyConformanceWindowToWidth;
        int iApplyConformanceWindowToHeight;
        int unsignedExpGolombCodedInt2;
        int unsignedExpGolombCodedInt3;
        int iMax;
        int i5;
        int i7;
        int i8;
        int iIsoColorPrimariesToColorSpace;
        int i9;
        int i10;
        int i11;
        H265VideoSignalInfosAndIndices h265VideoSignalInfosAndIndices;
        int i12;
        int iIsoTransferCharacteristicsToColorTransfer;
        H265RepFormatsAndIndices h265RepFormatsAndIndices;
        ParsableNalUnitBitArray parsableNalUnitBitArray = new ParsableNalUnitBitArray(bArr, i2, i3);
        parsableNalUnitBitArray.skipBits(4);
        int bits = parsableNalUnitBitArray.readBits(3);
        boolean z2 = h265NalHeader.layerId != 0 && bits == 7;
        int i13 = (h265VpsData == null || h265VpsData.layerInfos.isEmpty()) ? 0 : ((H265LayerInfo) h265VpsData.layerInfos.get(Math.min(h265NalHeader.layerId, h265VpsData.layerInfos.size() - 1))).layerIdInVps;
        H265ProfileTierLevel h265ProfileTierLevel = null;
        if (!z2) {
            parsableNalUnitBitArray.skipBit();
            h265ProfileTierLevel = parseH265ProfileTierLevel(parsableNalUnitBitArray, true, bits, null);
        } else if (h265VpsData != null) {
            H265ProfileTierLevelsAndIndices h265ProfileTierLevelsAndIndices = h265VpsData.profileTierLevelsAndIndices;
            int i14 = h265ProfileTierLevelsAndIndices.indices[i13];
            if (h265ProfileTierLevelsAndIndices.profileTierLevels.size() > i14) {
                h265ProfileTierLevel = (H265ProfileTierLevel) h265VpsData.profileTierLevelsAndIndices.profileTierLevels.get(i14);
            }
        }
        int unsignedExpGolombCodedInt4 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        if (z2) {
            int bits2 = parsableNalUnitBitArray.readBit() ? parsableNalUnitBitArray.readBits(8) : -1;
            if (h265VpsData == null || (h265RepFormatsAndIndices = h265VpsData.repFormatsAndIndices) == null) {
                iApplyConformanceWindowToHeight = 0;
                unsignedExpGolombCodedInt2 = 0;
                unsignedExpGolombCodedInt3 = 0;
                unsignedExpGolombCodedInt = 0;
                iApplyConformanceWindowToWidth = 0;
            } else {
                if (bits2 == -1) {
                    bits2 = h265RepFormatsAndIndices.indices[i13];
                }
                if (bits2 != -1 && h265RepFormatsAndIndices.repFormats.size() > bits2) {
                    H265RepFormat h265RepFormat = (H265RepFormat) h265VpsData.repFormatsAndIndices.repFormats.get(bits2);
                    unsignedExpGolombCodedInt = h265RepFormat.chromaFormatIdc;
                    iApplyConformanceWindowToWidth = h265RepFormat.width;
                    iApplyConformanceWindowToHeight = h265RepFormat.height;
                    unsignedExpGolombCodedInt2 = h265RepFormat.bitDepthLumaMinus8;
                    unsignedExpGolombCodedInt3 = h265RepFormat.bitDepthChromaMinus8;
                }
            }
        } else {
            unsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            if (unsignedExpGolombCodedInt == 3) {
                parsableNalUnitBitArray.skipBit();
            }
            int unsignedExpGolombCodedInt5 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int unsignedExpGolombCodedInt6 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            if (parsableNalUnitBitArray.readBit()) {
                int unsignedExpGolombCodedInt7 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                int unsignedExpGolombCodedInt8 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                int unsignedExpGolombCodedInt9 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                int unsignedExpGolombCodedInt10 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                iApplyConformanceWindowToWidth = applyConformanceWindowToWidth(unsignedExpGolombCodedInt5, unsignedExpGolombCodedInt, unsignedExpGolombCodedInt7, unsignedExpGolombCodedInt8);
                iApplyConformanceWindowToHeight = applyConformanceWindowToHeight(unsignedExpGolombCodedInt6, unsignedExpGolombCodedInt, unsignedExpGolombCodedInt9, unsignedExpGolombCodedInt10);
            } else {
                iApplyConformanceWindowToWidth = unsignedExpGolombCodedInt5;
                iApplyConformanceWindowToHeight = unsignedExpGolombCodedInt6;
            }
            unsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            unsignedExpGolombCodedInt3 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        }
        int unsignedExpGolombCodedInt11 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        if (z2) {
            iMax = -1;
        } else {
            iMax = -1;
            for (int i15 = parsableNalUnitBitArray.readBit() ? 0 : bits; i15 <= bits; i15++) {
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                iMax = Math.max(parsableNalUnitBitArray.readUnsignedExpGolombCodedInt(), iMax);
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            }
        }
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        if (parsableNalUnitBitArray.readBit()) {
            if (z2 ? parsableNalUnitBitArray.readBit() : false) {
                parsableNalUnitBitArray.skipBits(6);
            } else if (parsableNalUnitBitArray.readBit()) {
                skipH265ScalingList(parsableNalUnitBitArray);
            }
        }
        int i16 = 2;
        parsableNalUnitBitArray.skipBits(2);
        if (parsableNalUnitBitArray.readBit()) {
            parsableNalUnitBitArray.skipBits(8);
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.skipBit();
        }
        skipH265ShortTermReferencePictureSets(parsableNalUnitBitArray);
        if (parsableNalUnitBitArray.readBit()) {
            int unsignedExpGolombCodedInt12 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int i17 = 0;
            while (i17 < unsignedExpGolombCodedInt12) {
                parsableNalUnitBitArray.skipBits(unsignedExpGolombCodedInt11 + 5);
                i17++;
                i16 = 2;
            }
        }
        parsableNalUnitBitArray.skipBits(i16);
        float f3 = 1.0f;
        if (parsableNalUnitBitArray.readBit()) {
            if (parsableNalUnitBitArray.readBit()) {
                int bits3 = parsableNalUnitBitArray.readBits(8);
                if (bits3 == 255) {
                    int bits4 = parsableNalUnitBitArray.readBits(16);
                    int bits5 = parsableNalUnitBitArray.readBits(16);
                    if (bits4 != 0 && bits5 != 0) {
                        f3 = bits4 / bits5;
                    }
                } else {
                    float[] fArr = ASPECT_RATIO_IDC_VALUES;
                    if (bits3 < fArr.length) {
                        f3 = fArr[bits3];
                    } else {
                        Log.w(TAG, "Unexpected aspect_ratio_idc value: " + bits3);
                    }
                }
            }
            if (parsableNalUnitBitArray.readBit()) {
                parsableNalUnitBitArray.skipBit();
            }
            if (parsableNalUnitBitArray.readBit()) {
                parsableNalUnitBitArray.skipBits(3);
                i11 = parsableNalUnitBitArray.readBit() ? 1 : 2;
                if (parsableNalUnitBitArray.readBit()) {
                    int bits6 = parsableNalUnitBitArray.readBits(8);
                    int bits7 = parsableNalUnitBitArray.readBits(8);
                    parsableNalUnitBitArray.skipBits(8);
                    iIsoColorPrimariesToColorSpace = ColorInfo.isoColorPrimariesToColorSpace(bits6);
                    iIsoTransferCharacteristicsToColorTransfer = ColorInfo.isoTransferCharacteristicsToColorTransfer(bits7);
                } else {
                    iIsoTransferCharacteristicsToColorTransfer = -1;
                    iIsoColorPrimariesToColorSpace = -1;
                }
                if (parsableNalUnitBitArray.readBit()) {
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                }
                parsableNalUnitBitArray.skipBit();
                if (parsableNalUnitBitArray.readBit()) {
                    iApplyConformanceWindowToHeight *= 2;
                }
                int i18 = unsignedExpGolombCodedInt3;
                i9 = i11;
                i7 = i18;
                i5 = bits;
                i8 = unsignedExpGolombCodedInt;
                i10 = iIsoTransferCharacteristicsToColorTransfer;
            } else if (h265VpsData == null || (h265VideoSignalInfosAndIndices = h265VpsData.videoSignalInfosAndIndices) == null || h265VideoSignalInfosAndIndices.videoSignalInfos.size() <= (i12 = h265VideoSignalInfosAndIndices.indices[i13])) {
                i11 = -1;
                iIsoTransferCharacteristicsToColorTransfer = -1;
                iIsoColorPrimariesToColorSpace = -1;
                if (parsableNalUnitBitArray.readBit()) {
                }
                parsableNalUnitBitArray.skipBit();
                if (parsableNalUnitBitArray.readBit()) {
                }
                int i182 = unsignedExpGolombCodedInt3;
                i9 = i11;
                i7 = i182;
                i5 = bits;
                i8 = unsignedExpGolombCodedInt;
                i10 = iIsoTransferCharacteristicsToColorTransfer;
            } else {
                H265VideoSignalInfo h265VideoSignalInfo = (H265VideoSignalInfo) h265VpsData.videoSignalInfosAndIndices.videoSignalInfos.get(i12);
                iIsoColorPrimariesToColorSpace = h265VideoSignalInfo.colorSpace;
                int i19 = h265VideoSignalInfo.colorRange;
                iIsoTransferCharacteristicsToColorTransfer = h265VideoSignalInfo.colorTransfer;
                i11 = i19;
                if (parsableNalUnitBitArray.readBit()) {
                }
                parsableNalUnitBitArray.skipBit();
                if (parsableNalUnitBitArray.readBit()) {
                }
                int i1822 = unsignedExpGolombCodedInt3;
                i9 = i11;
                i7 = i1822;
                i5 = bits;
                i8 = unsignedExpGolombCodedInt;
                i10 = iIsoTransferCharacteristicsToColorTransfer;
            }
        } else {
            i5 = bits;
            i7 = unsignedExpGolombCodedInt3;
            i8 = unsignedExpGolombCodedInt;
            iIsoColorPrimariesToColorSpace = -1;
            i9 = -1;
            i10 = -1;
        }
        return new H265SpsData(h265NalHeader, i5, h265ProfileTierLevel, i8, unsignedExpGolombCodedInt2, i7, unsignedExpGolombCodedInt4, iApplyConformanceWindowToWidth, iApplyConformanceWindowToHeight, f3, iMax, iIsoColorPrimariesToColorSpace, i9, i10);
    }

    public static H265VpsData parseH265VpsNalUnit(byte[] bArr, int i2, int i3) {
        ParsableNalUnitBitArray parsableNalUnitBitArray = new ParsableNalUnitBitArray(bArr, i2, i3);
        return parseH265VpsNalUnitPayload(parsableNalUnitBitArray, parseH265NalHeader(parsableNalUnitBitArray));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static H265VpsData parseH265VpsNalUnitPayload(ParsableNalUnitBitArray parsableNalUnitBitArray, H265NalHeader h265NalHeader) {
        int[] iArr;
        int i2;
        int i3;
        int[] iArr2;
        H265VideoSignalInfosAndIndices h265VideoSignalInfosAndIndices;
        int i5;
        int i7;
        int i8;
        int[] iArr3;
        nKK nkk;
        int i9;
        boolean[][] zArr;
        int[] iArr4;
        int i10;
        int i11;
        parsableNalUnitBitArray.skipBits(4);
        boolean bit = parsableNalUnitBitArray.readBit();
        boolean bit2 = parsableNalUnitBitArray.readBit();
        int bits = parsableNalUnitBitArray.readBits(6);
        int i12 = bits + 1;
        int bits2 = parsableNalUnitBitArray.readBits(3);
        parsableNalUnitBitArray.skipBits(17);
        H265ProfileTierLevel h265ProfileTierLevel = parseH265ProfileTierLevel(parsableNalUnitBitArray, true, bits2, null);
        boolean z2 = false;
        for (int i13 = parsableNalUnitBitArray.readBit() ? 0 : bits2; i13 <= bits2; i13++) {
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        }
        int bits3 = parsableNalUnitBitArray.readBits(6);
        int unsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1;
        H265ProfileTierLevelsAndIndices h265ProfileTierLevelsAndIndices = new H265ProfileTierLevelsAndIndices(nKK.o(h265ProfileTierLevel), new int[1]);
        Object[] objArr = i12 >= 2 && unsignedExpGolombCodedInt >= 2;
        Object[] objArr2 = bit && bit2;
        int i14 = bits3 + 1;
        Object[] objArr3 = i14 >= i12;
        if (objArr != true || objArr2 != true || objArr3 != true) {
            return new H265VpsData(h265NalHeader, null, h265ProfileTierLevelsAndIndices, null, null);
        }
        Class cls = Integer.TYPE;
        int[][] iArr5 = (int[][]) Array.newInstance((Class<?>) cls, unsignedExpGolombCodedInt, i14);
        int i15 = 1;
        int[] iArr6 = new int[unsignedExpGolombCodedInt];
        int[] iArr7 = new int[unsignedExpGolombCodedInt];
        iArr5[0][0] = 0;
        iArr6[0] = 1;
        iArr7[0] = 0;
        for (int i16 = 1; i16 < unsignedExpGolombCodedInt; i16++) {
            int i17 = 0;
            for (int i18 = 0; i18 <= bits3; i18++) {
                if (parsableNalUnitBitArray.readBit()) {
                    iArr5[i16][i17] = i18;
                    iArr7[i16] = i18;
                    i17++;
                }
                iArr6[i16] = i17;
            }
        }
        if (parsableNalUnitBitArray.readBit()) {
            parsableNalUnitBitArray.skipBits(64);
            if (parsableNalUnitBitArray.readBit()) {
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            }
            int unsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int i19 = 0;
            while (i19 < unsignedExpGolombCodedInt2) {
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                if (i19 == 0 || parsableNalUnitBitArray.readBit()) {
                    z2 = true;
                }
                skipH265HrdParameters(parsableNalUnitBitArray, z2, bits2);
                i19++;
                z2 = false;
            }
        }
        if (!parsableNalUnitBitArray.readBit()) {
            return new H265VpsData(h265NalHeader, null, h265ProfileTierLevelsAndIndices, null, null);
        }
        parsableNalUnitBitArray.byteAlign();
        H265ProfileTierLevel h265ProfileTierLevel2 = parseH265ProfileTierLevel(parsableNalUnitBitArray, false, bits2, h265ProfileTierLevel);
        boolean bit3 = parsableNalUnitBitArray.readBit();
        int i20 = 6;
        boolean[] zArr2 = new boolean[16];
        int i21 = 0;
        for (int i22 = 0; i22 < 16; i22++) {
            boolean bit4 = parsableNalUnitBitArray.readBit();
            zArr2[i22] = bit4;
            if (bit4) {
                i21++;
            }
        }
        if (i21 == 0 || !zArr2[1]) {
            return new H265VpsData(h265NalHeader, null, h265ProfileTierLevelsAndIndices, null, null);
        }
        int[] iArr8 = new int[i21];
        for (int i23 = 0; i23 < i21 - (bit3 ? 1 : 0); i23++) {
            iArr8[i23] = parsableNalUnitBitArray.readBits(3);
        }
        int[] iArr9 = new int[i21 + 1];
        if (bit3) {
            int i24 = 1;
            while (i24 < i21) {
                int[] iArr10 = iArr9;
                for (int i25 = 0; i25 < i24; i25++) {
                    iArr10[i24] = iArr10[i24] + iArr8[i25] + 1;
                }
                i24++;
                iArr9 = iArr10;
            }
            iArr = iArr9;
            iArr[i21] = 6;
        } else {
            iArr = iArr9;
        }
        int[][] iArr11 = (int[][]) Array.newInstance((Class<?>) cls, i12, i21);
        int[] iArr12 = new int[i12];
        iArr12[0] = 0;
        boolean bit5 = parsableNalUnitBitArray.readBit();
        int i26 = 1;
        while (i26 < i12) {
            if (bit5) {
                i11 = i26;
                iArr12[i11] = parsableNalUnitBitArray.readBits(i20);
            } else {
                i11 = i26;
                iArr12[i11] = i11;
            }
            if (bit3) {
                for (int i27 = 0; i27 < i21; i27++) {
                    iArr11[i11][i27] = (iArr12[i11] & ((1 << iArr[r33]) - 1)) >> iArr[i27];
                }
            } else {
                int i28 = 0;
                while (i28 < i21) {
                    int i29 = i28;
                    iArr11[i11][i29] = parsableNalUnitBitArray.readBits(iArr8[i28] + 1);
                    i28 = i29 + 1;
                }
            }
            i26 = i11 + 1;
            i20 = 6;
        }
        int[] iArr13 = new int[i14];
        int i30 = 1;
        int i31 = 0;
        while (i31 < i12) {
            iArr13[iArr12[i31]] = -1;
            int[] iArr14 = iArr13;
            int i32 = 0;
            int i33 = 0;
            while (i32 < 16) {
                if (zArr2[i32]) {
                    if (i32 == i15) {
                        iArr14[iArr12[i31]] = iArr11[i31][i33];
                    }
                    i33++;
                }
                i32++;
                i15 = 1;
            }
            if (i31 > 0) {
                int i34 = 0;
                while (true) {
                    if (i34 >= i31) {
                        i30++;
                        break;
                    }
                    int i35 = i34;
                    if (iArr14[iArr12[i31]] == iArr14[iArr12[i34]]) {
                        break;
                    }
                    i34 = i35 + 1;
                }
            }
            i31++;
            iArr13 = iArr14;
            i15 = 1;
        }
        int[] iArr15 = iArr13;
        int bits4 = parsableNalUnitBitArray.readBits(4);
        if (i30 < 2 || bits4 == 0) {
            return new H265VpsData(h265NalHeader, null, h265ProfileTierLevelsAndIndices, null, null);
        }
        int[] iArr16 = new int[i30];
        for (int i36 = 0; i36 < i30; i36++) {
            iArr16[i36] = parsableNalUnitBitArray.readBits(bits4);
        }
        int[] iArr17 = new int[i14];
        int i37 = 0;
        while (i37 < i12) {
            int[] iArr18 = iArr17;
            iArr18[Math.min(iArr12[i37], bits3)] = i37;
            i37++;
            iArr17 = iArr18;
        }
        int[] iArr19 = iArr17;
        nKK.j jVarGh = nKK.gh();
        int i38 = 0;
        while (i38 <= bits3) {
            int i39 = i30;
            int[] iArr20 = iArr7;
            int iMin = Math.min(iArr15[i38], i39 - 1);
            jVarGh.n(new H265LayerInfo(iArr19[i38], iMin >= 0 ? iArr16[iMin] : -1));
            i38++;
            i30 = i39;
            iArr7 = iArr20;
            iArr16 = iArr16;
        }
        int[] iArr21 = iArr7;
        nKK nkkGh = jVarGh.gh();
        if (((H265LayerInfo) nkkGh.get(0)).viewId == -1) {
            return new H265VpsData(h265NalHeader, null, h265ProfileTierLevelsAndIndices, null, null);
        }
        int i40 = 1;
        while (true) {
            if (i40 > bits3) {
                i2 = -1;
                i3 = -1;
                break;
            }
            i2 = -1;
            if (((H265LayerInfo) nkkGh.get(i40)).viewId != -1) {
                i3 = i40;
                break;
            }
            i40++;
        }
        if (i3 == i2) {
            return new H265VpsData(h265NalHeader, null, h265ProfileTierLevelsAndIndices, null, null);
        }
        Class cls2 = Boolean.TYPE;
        boolean[][] zArr3 = (boolean[][]) Array.newInstance((Class<?>) cls2, i12, i12);
        boolean[][] zArr4 = (boolean[][]) Array.newInstance((Class<?>) cls2, i12, i12);
        int i41 = 1;
        while (i41 < i12) {
            boolean[][] zArr5 = zArr4;
            for (int i42 = 0; i42 < i41; i42++) {
                boolean[] zArr6 = zArr3[i41];
                boolean[] zArr7 = zArr5[i41];
                boolean bit6 = parsableNalUnitBitArray.readBit();
                zArr7[i42] = bit6;
                zArr6[i42] = bit6;
            }
            i41++;
            zArr4 = zArr5;
        }
        boolean[][] zArr8 = zArr4;
        for (int i43 = 1; i43 < i12; i43++) {
            int i44 = 0;
            while (i44 < bits) {
                int[] iArr22 = iArr12;
                int i45 = 0;
                while (true) {
                    if (i45 < i43) {
                        boolean[] zArr9 = zArr8[i43];
                        if (zArr9[i45] && zArr8[i45][i44]) {
                            zArr9[i44] = true;
                            break;
                        }
                        i45++;
                    }
                }
                i44++;
                iArr12 = iArr22;
            }
        }
        int[] iArr23 = iArr12;
        int[] iArr24 = new int[i14];
        for (int i46 = 0; i46 < i12; i46++) {
            int i47 = 0;
            for (int i48 = 0; i48 < i46; i48++) {
                i47 += zArr3[i46][i48] ? 1 : 0;
            }
            iArr24[iArr23[i46]] = i47;
        }
        int i49 = 0;
        for (int i50 = 0; i50 < i12; i50++) {
            if (iArr24[iArr23[i50]] == 0) {
                i49++;
            }
        }
        if (i49 > 1) {
            return new H265VpsData(h265NalHeader, null, h265ProfileTierLevelsAndIndices, null, null);
        }
        int[] iArr25 = new int[i12];
        int[] iArr26 = new int[unsignedExpGolombCodedInt];
        if (parsableNalUnitBitArray.readBit()) {
            iArr2 = iArr24;
            int i51 = 0;
            while (i51 < i12) {
                int i52 = i51;
                iArr25[i52] = parsableNalUnitBitArray.readBits(3);
                i51 = i52 + 1;
            }
        } else {
            iArr2 = iArr24;
            Arrays.fill(iArr25, 0, i12, bits2);
        }
        int i53 = 0;
        while (i53 < unsignedExpGolombCodedInt) {
            int i54 = i53;
            boolean[][] zArr10 = zArr3;
            int[] iArr27 = iArr25;
            int iMax = 0;
            for (int i55 = 0; i55 < iArr6[i54]; i55++) {
                iMax = Math.max(iMax, iArr27[((H265LayerInfo) nkkGh.get(iArr5[i54][i55])).layerIdInVps]);
            }
            iArr26[i54] = iMax + 1;
            i53 = i54 + 1;
            iArr25 = iArr27;
            zArr3 = zArr10;
        }
        boolean[][] zArr11 = zArr3;
        if (parsableNalUnitBitArray.readBit()) {
            int i56 = 0;
            while (i56 < bits) {
                int i57 = i56 + 1;
                int i58 = i57;
                while (i58 < i12) {
                    if (zArr11[i58][i56]) {
                        i10 = i56;
                        parsableNalUnitBitArray.skipBits(3);
                    } else {
                        i10 = i56;
                    }
                    i58++;
                    i56 = i10;
                }
                i56 = i57;
            }
        }
        parsableNalUnitBitArray.skipBit();
        int unsignedExpGolombCodedInt3 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1;
        nKK.j jVarGh2 = nKK.gh();
        jVarGh2.n(h265ProfileTierLevel);
        if (unsignedExpGolombCodedInt3 > 1) {
            jVarGh2.n(h265ProfileTierLevel2);
            for (int i59 = 2; i59 < unsignedExpGolombCodedInt3; i59++) {
                h265ProfileTierLevel2 = parseH265ProfileTierLevel(parsableNalUnitBitArray, parsableNalUnitBitArray.readBit(), bits2, h265ProfileTierLevel2);
                jVarGh2.n(h265ProfileTierLevel2);
            }
        }
        nKK nkkGh2 = jVarGh2.gh();
        int unsignedExpGolombCodedInt4 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + unsignedExpGolombCodedInt;
        if (unsignedExpGolombCodedInt4 > unsignedExpGolombCodedInt) {
            return new H265VpsData(h265NalHeader, null, h265ProfileTierLevelsAndIndices, null, null);
        }
        int bits5 = parsableNalUnitBitArray.readBits(2);
        boolean[][] zArr12 = (boolean[][]) Array.newInstance((Class<?>) cls2, unsignedExpGolombCodedInt4, i14);
        int[] iArr28 = new int[unsignedExpGolombCodedInt4];
        int i60 = 0;
        int[] iArr29 = new int[unsignedExpGolombCodedInt4];
        int i61 = 0;
        while (i61 < unsignedExpGolombCodedInt) {
            iArr28[i61] = i60;
            iArr29[i61] = iArr21[i61];
            if (bits5 == 0) {
                i9 = i61;
                zArr = zArr12;
                nkk = nkkGh2;
                iArr4 = iArr28;
                Arrays.fill(zArr12[i9], i60, iArr6[i9], true);
                iArr4[i9] = iArr6[i9];
            } else {
                nkk = nkkGh2;
                i9 = i61;
                zArr = zArr12;
                iArr4 = iArr28;
                if (bits5 == 1) {
                    int i62 = iArr21[i9];
                    for (int i63 = 0; i63 < iArr6[i9]; i63++) {
                        zArr[i9][i63] = iArr5[i9][i63] == i62;
                    }
                    iArr4[i9] = 1;
                } else {
                    i60 = 0;
                    zArr[0][0] = true;
                    iArr4[0] = 1;
                    i61 = i9 + 1;
                    zArr12 = zArr;
                    iArr28 = iArr4;
                    nkkGh2 = nkk;
                }
            }
            i60 = 0;
            i61 = i9 + 1;
            zArr12 = zArr;
            iArr28 = iArr4;
            nkkGh2 = nkk;
        }
        nKK nkk2 = nkkGh2;
        boolean[][] zArr13 = zArr12;
        int[] iArr30 = iArr28;
        int[] iArr31 = new int[i14];
        int i64 = 2;
        int[] iArr32 = new int[2];
        iArr32[1] = i14;
        iArr32[i60] = unsignedExpGolombCodedInt4;
        boolean[][] zArr14 = (boolean[][]) Array.newInstance((Class<?>) cls2, iArr32);
        int i65 = 1;
        int i66 = 0;
        while (i65 < unsignedExpGolombCodedInt4) {
            if (bits5 == i64) {
                for (int i67 = 0; i67 < iArr6[i65]; i67++) {
                    zArr13[i65][i67] = parsableNalUnitBitArray.readBit();
                    int i68 = iArr30[i65];
                    boolean z3 = zArr13[i65][i67];
                    iArr30[i65] = i68 + (z3 ? 1 : 0);
                    if (z3) {
                        iArr29[i65] = iArr5[i65][i67];
                    }
                }
            }
            if (i66 == 0) {
                i5 = 0;
                if (iArr5[i65][0] == 0 && zArr13[i65][0]) {
                    for (int i69 = 1; i69 < iArr6[i65]; i69++) {
                        if (iArr5[i65][i69] == i3 && zArr13[i65][i3]) {
                            i66 = i65;
                        }
                    }
                }
            } else {
                i5 = 0;
            }
            int i70 = i5;
            while (i70 < iArr6[i65]) {
                if (unsignedExpGolombCodedInt3 > 1) {
                    zArr14[i65][i70] = zArr13[i65][i70];
                    i8 = i3;
                    iArr3 = iArr31;
                    i7 = unsignedExpGolombCodedInt3;
                    int iNr = n.nr(unsignedExpGolombCodedInt3, RoundingMode.CEILING);
                    if (!zArr14[i65][i70]) {
                        int i71 = ((H265LayerInfo) nkkGh.get(iArr5[i65][i70])).layerIdInVps;
                        int i72 = i5;
                        while (true) {
                            if (i72 >= i70) {
                                break;
                            }
                            int i73 = i71;
                            if (zArr8[i73][((H265LayerInfo) nkkGh.get(iArr5[i65][i72])).layerIdInVps]) {
                                zArr14[i65][i70] = true;
                                break;
                            }
                            i72++;
                            i71 = i73;
                        }
                    }
                    if (zArr14[i65][i70]) {
                        if (i66 <= 0 || i65 != i66) {
                            parsableNalUnitBitArray.skipBits(iNr);
                        } else {
                            iArr3[i70] = parsableNalUnitBitArray.readBits(iNr);
                        }
                    }
                } else {
                    i7 = unsignedExpGolombCodedInt3;
                    i8 = i3;
                    iArr3 = iArr31;
                }
                i70++;
                i3 = i8;
                iArr31 = iArr3;
                unsignedExpGolombCodedInt3 = i7;
            }
            int i74 = unsignedExpGolombCodedInt3;
            int i75 = i3;
            int[] iArr33 = iArr31;
            if (iArr30[i65] == 1 && iArr2[iArr29[i65]] > 0) {
                parsableNalUnitBitArray.skipBit();
            }
            i65++;
            i3 = i75;
            iArr31 = iArr33;
            unsignedExpGolombCodedInt3 = i74;
            i64 = 2;
        }
        int[] iArr34 = iArr31;
        if (i66 == 0) {
            return new H265VpsData(h265NalHeader, null, h265ProfileTierLevelsAndIndices, null, null);
        }
        H265RepFormatsAndIndices h265RepFormatsAndIndices = parseH265RepFormatsAndIndices(parsableNalUnitBitArray, i12);
        parsableNalUnitBitArray.skipBits(2);
        for (int i76 = 1; i76 < i12; i76++) {
            if (iArr2[iArr23[i76]] == 0) {
                parsableNalUnitBitArray.skipBit();
            }
        }
        skipH265DpbSize(parsableNalUnitBitArray, unsignedExpGolombCodedInt4, iArr26, iArr6, zArr14);
        skipToH265VuiPresentFlagAfterDpbSize(parsableNalUnitBitArray, i12, zArr11);
        if (parsableNalUnitBitArray.readBit()) {
            parsableNalUnitBitArray.byteAlign();
            h265VideoSignalInfosAndIndices = parseH265VideoSignalInfosAndIndices(parsableNalUnitBitArray, i12, unsignedExpGolombCodedInt, iArr26);
        } else {
            h265VideoSignalInfosAndIndices = null;
        }
        return new H265VpsData(h265NalHeader, nkkGh, new H265ProfileTierLevelsAndIndices(nkk2, iArr34), h265RepFormatsAndIndices, h265VideoSignalInfosAndIndices);
    }

    public static PpsData parsePpsNalUnit(byte[] bArr, int i2, int i3) {
        return parsePpsNalUnitPayload(bArr, i2 + 1, i3);
    }

    public static PpsData parsePpsNalUnitPayload(byte[] bArr, int i2, int i3) {
        ParsableNalUnitBitArray parsableNalUnitBitArray = new ParsableNalUnitBitArray(bArr, i2, i3);
        int unsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int unsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.skipBit();
        return new PpsData(unsignedExpGolombCodedInt, unsignedExpGolombCodedInt2, parsableNalUnitBitArray.readBit());
    }

    public static SpsData parseSpsNalUnit(byte[] bArr, int i2, int i3) {
        return parseSpsNalUnitPayload(bArr, i2 + 1, i3);
    }

    private static void skipScalingList(ParsableNalUnitBitArray parsableNalUnitBitArray, int i2) {
        int signedExpGolombCodedInt = 8;
        int i3 = 8;
        for (int i5 = 0; i5 < i2; i5++) {
            if (signedExpGolombCodedInt != 0) {
                signedExpGolombCodedInt = ((parsableNalUnitBitArray.readSignedExpGolombCodedInt() + i3) + 256) % 256;
            }
            if (signedExpGolombCodedInt != 0) {
                i3 = signedExpGolombCodedInt;
            }
        }
    }

    public static int unescapeStream(byte[] bArr, int i2) {
        int i3;
        synchronized (scratchEscapePositionsLock) {
            int iFindNextUnescapeIndex = 0;
            int i5 = 0;
            while (iFindNextUnescapeIndex < i2) {
                try {
                    iFindNextUnescapeIndex = findNextUnescapeIndex(bArr, iFindNextUnescapeIndex, i2);
                    if (iFindNextUnescapeIndex < i2) {
                        int[] iArr = scratchEscapePositions;
                        if (iArr.length <= i5) {
                            scratchEscapePositions = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        scratchEscapePositions[i5] = iFindNextUnescapeIndex;
                        iFindNextUnescapeIndex += 3;
                        i5++;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            i3 = i2 - i5;
            int i7 = 0;
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                int i10 = scratchEscapePositions[i9] - i8;
                System.arraycopy(bArr, i8, bArr, i7, i10);
                int i11 = i7 + i10;
                int i12 = i11 + 1;
                bArr[i11] = 0;
                i7 = i11 + 2;
                bArr[i12] = 0;
                i8 += i10 + 3;
            }
            System.arraycopy(bArr, i8, bArr, i7, i3 - i7);
        }
        return i3;
    }

    private NalUnitUtil() {
    }

    public static void discardToSps(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i5 = i2 + 1;
            if (i5 < iPosition) {
                int i7 = byteBuffer.get(i2) & UByte.MAX_VALUE;
                if (i3 == 3) {
                    if (i7 == 1 && (byteBuffer.get(i5) & 31) == 7) {
                        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
                        byteBufferDuplicate.position(i2 - 3);
                        byteBufferDuplicate.limit(iPosition);
                        byteBuffer.position(0);
                        byteBuffer.put(byteBufferDuplicate);
                        return;
                    }
                } else if (i7 == 0) {
                    i3++;
                }
                if (i7 != 0) {
                    i3 = 0;
                }
                i2 = i5;
            } else {
                byteBuffer.clear();
                return;
            }
        }
    }

    public static boolean isNalUnitSei(Format format, byte b2) {
        return ((Objects.equals(format.sampleMimeType, "video/avc") || MimeTypes.containsCodecsCorrespondingToMimeType(format.codecs, "video/avc")) && (b2 & 31) == 6) || ((Objects.equals(format.sampleMimeType, "video/hevc") || MimeTypes.containsCodecsCorrespondingToMimeType(format.codecs, "video/hevc")) && ((b2 & 126) >> 1) == 39);
    }

    private static H265NalHeader parseH265NalHeader(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        parsableNalUnitBitArray.skipBit();
        return new H265NalHeader(parsableNalUnitBitArray.readBits(6), parsableNalUnitBitArray.readBits(6), parsableNalUnitBitArray.readBits(3) - 1);
    }

    private static H265RepFormatsAndIndices parseH265RepFormatsAndIndices(ParsableNalUnitBitArray parsableNalUnitBitArray, int i2) {
        int unsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int i3 = unsignedExpGolombCodedInt + 1;
        nKK.j jVarQie = nKK.qie(i3);
        int[] iArr = new int[i2];
        for (int i5 = 0; i5 < i3; i5++) {
            jVarQie.n(parseH265RepFormat(parsableNalUnitBitArray));
        }
        int i7 = 1;
        if (i3 > 1 && parsableNalUnitBitArray.readBit()) {
            int iNr = n.nr(i3, RoundingMode.CEILING);
            while (i7 < i2) {
                iArr[i7] = parsableNalUnitBitArray.readBits(iNr);
                i7++;
            }
        } else {
            while (i7 < i2) {
                iArr[i7] = Math.min(i7, unsignedExpGolombCodedInt);
                i7++;
            }
        }
        return new H265RepFormatsAndIndices(jVarQie.gh(), iArr);
    }

    private static H265VideoSignalInfosAndIndices parseH265VideoSignalInfosAndIndices(ParsableNalUnitBitArray parsableNalUnitBitArray, int i2, int i3, int[] iArr) {
        boolean bit;
        boolean bit2;
        boolean bit3;
        int bits;
        if (!parsableNalUnitBitArray.readBit()) {
            bit = parsableNalUnitBitArray.readBit();
        } else {
            bit = true;
        }
        if (bit) {
            parsableNalUnitBitArray.skipBit();
        }
        boolean bit4 = parsableNalUnitBitArray.readBit();
        boolean bit5 = parsableNalUnitBitArray.readBit();
        if (bit4 || bit5) {
            for (int i5 = 0; i5 < i3; i5++) {
                for (int i7 = 0; i7 < iArr[i5]; i7++) {
                    if (bit4) {
                        bit2 = parsableNalUnitBitArray.readBit();
                    } else {
                        bit2 = false;
                    }
                    if (bit5) {
                        bit3 = parsableNalUnitBitArray.readBit();
                    } else {
                        bit3 = false;
                    }
                    if (bit2) {
                        parsableNalUnitBitArray.skipBits(32);
                    }
                    if (bit3) {
                        parsableNalUnitBitArray.skipBits(18);
                    }
                }
            }
        }
        boolean bit6 = parsableNalUnitBitArray.readBit();
        if (bit6) {
            bits = parsableNalUnitBitArray.readBits(4) + 1;
        } else {
            bits = i2;
        }
        nKK.j jVarQie = nKK.qie(bits);
        int[] iArr2 = new int[i2];
        for (int i8 = 0; i8 < bits; i8++) {
            jVarQie.n(parseH265VideoSignalInfo(parsableNalUnitBitArray));
        }
        if (bit6 && bits > 1) {
            for (int i9 = 0; i9 < i2; i9++) {
                iArr2[i9] = parsableNalUnitBitArray.readBits(4);
            }
        }
        return new H265VideoSignalInfosAndIndices(jVarQie.gh(), iArr2);
    }

    private static void skipH265ShortTermReferencePictureSets(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        int i2;
        int i3;
        int unsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int[] iArr = new int[0];
        int[] iArrCopyOf = new int[0];
        int i5 = -1;
        int i7 = -1;
        for (int i8 = 0; i8 < unsignedExpGolombCodedInt; i8++) {
            if (i8 != 0 && parsableNalUnitBitArray.readBit()) {
                int i9 = i5 + i7;
                int unsignedExpGolombCodedInt2 = (1 - ((parsableNalUnitBitArray.readBit() ? 1 : 0) * 2)) * (parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1);
                int i10 = i9 + 1;
                boolean[] zArr = new boolean[i10];
                for (int i11 = 0; i11 <= i9; i11++) {
                    if (!parsableNalUnitBitArray.readBit()) {
                        zArr[i11] = parsableNalUnitBitArray.readBit();
                    } else {
                        zArr[i11] = true;
                    }
                }
                int[] iArr2 = new int[i10];
                int[] iArr3 = new int[i10];
                int i12 = 0;
                for (int i13 = i7 - 1; i13 >= 0; i13--) {
                    int i14 = iArrCopyOf[i13] + unsignedExpGolombCodedInt2;
                    if (i14 < 0 && zArr[i5 + i13]) {
                        iArr2[i12] = i14;
                        i12++;
                    }
                }
                if (unsignedExpGolombCodedInt2 < 0 && zArr[i9]) {
                    iArr2[i12] = unsignedExpGolombCodedInt2;
                    i12++;
                }
                for (int i15 = 0; i15 < i5; i15++) {
                    int i16 = iArr[i15] + unsignedExpGolombCodedInt2;
                    if (i16 < 0 && zArr[i15]) {
                        iArr2[i12] = i16;
                        i12++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr2, i12);
                int i17 = 0;
                for (int i18 = i5 - 1; i18 >= 0; i18--) {
                    int i19 = iArr[i18] + unsignedExpGolombCodedInt2;
                    if (i19 > 0 && zArr[i18]) {
                        iArr3[i17] = i19;
                        i17++;
                    }
                }
                if (unsignedExpGolombCodedInt2 > 0 && zArr[i9]) {
                    iArr3[i17] = unsignedExpGolombCodedInt2;
                    i17++;
                }
                for (int i20 = 0; i20 < i7; i20++) {
                    int i21 = iArrCopyOf[i20] + unsignedExpGolombCodedInt2;
                    if (i21 > 0 && zArr[i5 + i20]) {
                        iArr3[i17] = i21;
                        i17++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr3, i17);
                iArr = iArrCopyOf2;
                i5 = i12;
                i7 = i17;
            } else {
                int unsignedExpGolombCodedInt3 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                int unsignedExpGolombCodedInt4 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                int[] iArr4 = new int[unsignedExpGolombCodedInt3];
                for (int i22 = 0; i22 < unsignedExpGolombCodedInt3; i22++) {
                    if (i22 > 0) {
                        i3 = iArr4[i22 - 1];
                    } else {
                        i3 = 0;
                    }
                    iArr4[i22] = i3 - (parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1);
                    parsableNalUnitBitArray.skipBit();
                }
                int[] iArr5 = new int[unsignedExpGolombCodedInt4];
                for (int i23 = 0; i23 < unsignedExpGolombCodedInt4; i23++) {
                    if (i23 > 0) {
                        i2 = iArr5[i23 - 1];
                    } else {
                        i2 = 0;
                    }
                    iArr5[i23] = i2 + parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1;
                    parsableNalUnitBitArray.skipBit();
                }
                i5 = unsignedExpGolombCodedInt3;
                iArr = iArr4;
                i7 = unsignedExpGolombCodedInt4;
                iArrCopyOf = iArr5;
            }
        }
    }

    private static void skipHrdParameters(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        int unsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1;
        parsableNalUnitBitArray.skipBits(8);
        for (int i2 = 0; i2 < unsignedExpGolombCodedInt; i2++) {
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.skipBit();
        }
        parsableNalUnitBitArray.skipBits(20);
    }

    private static void skipToH265VuiPresentFlagAfterDpbSize(ParsableNalUnitBitArray parsableNalUnitBitArray, int i2, boolean[][] zArr) {
        int unsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 2;
        if (parsableNalUnitBitArray.readBit()) {
            parsableNalUnitBitArray.skipBits(unsignedExpGolombCodedInt);
        } else {
            for (int i3 = 1; i3 < i2; i3++) {
                for (int i5 = 0; i5 < i3; i5++) {
                    if (zArr[i3][i5]) {
                        parsableNalUnitBitArray.skipBits(unsignedExpGolombCodedInt);
                    }
                }
            }
        }
        int unsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        for (int i7 = 1; i7 <= unsignedExpGolombCodedInt2; i7++) {
            parsableNalUnitBitArray.skipBits(8);
        }
    }
}
