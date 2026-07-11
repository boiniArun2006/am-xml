package androidx.media3.extractor;

import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.container.NalUnitUtil;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@UnstableApi
public final class HevcConfig {
    public final int bitdepthChroma;
    public final int bitdepthLuma;

    @Nullable
    public final String codecs;
    public final int colorRange;
    public final int colorSpace;
    public final int colorTransfer;
    public final int height;
    public final List<byte[]> initializationData;
    public final int maxNumReorderPics;
    public final int maxSubLayers;
    public final int nalUnitLengthFieldLength;
    public final float pixelWidthHeightRatio;
    public final int stereoMode;

    @Nullable
    public final NalUnitUtil.H265VpsData vpsData;
    public final int width;

    public static HevcConfig parse(ParsableByteArray parsableByteArray) throws ParserException {
        return parseImpl(parsableByteArray, false, null);
    }

    public static HevcConfig parseLayered(ParsableByteArray parsableByteArray, NalUnitUtil.H265VpsData h265VpsData) throws ParserException {
        return parseImpl(parsableByteArray, true, h265VpsData);
    }

    private static HevcConfig parseImpl(ParsableByteArray parsableByteArray, boolean z2, @Nullable NalUnitUtil.H265VpsData h265VpsData) throws ParserException {
        boolean z3;
        int i2;
        NalUnitUtil.H265Sei3dRefDisplayInfoData h265Sei3dRefDisplayInfo;
        int i3;
        try {
            if (z2) {
                parsableByteArray.skipBytes(4);
            } else {
                parsableByteArray.skipBytes(21);
            }
            int unsignedByte = parsableByteArray.readUnsignedByte() & 3;
            int unsignedByte2 = parsableByteArray.readUnsignedByte();
            int position = parsableByteArray.getPosition();
            int i5 = 0;
            int i7 = 0;
            int i8 = 0;
            while (true) {
                z3 = true;
                if (i7 >= unsignedByte2) {
                    break;
                }
                parsableByteArray.skipBytes(1);
                int unsignedShort = parsableByteArray.readUnsignedShort();
                for (int i9 = 0; i9 < unsignedShort; i9++) {
                    int unsignedShort2 = parsableByteArray.readUnsignedShort();
                    i8 += unsignedShort2 + 4;
                    parsableByteArray.skipBytes(unsignedShort2);
                }
                i7++;
            }
            parsableByteArray.setPosition(position);
            byte[] bArr = new byte[i8];
            NalUnitUtil.H265VpsData h265VpsData2 = h265VpsData;
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            float f3 = 1.0f;
            String strBuildHevcCodecString = null;
            int i20 = 0;
            int i21 = 0;
            while (i20 < unsignedByte2) {
                int unsignedByte3 = parsableByteArray.readUnsignedByte() & 63;
                int unsignedShort3 = parsableByteArray.readUnsignedShort();
                int i22 = i5;
                NalUnitUtil.H265VpsData h265VpsNalUnit = h265VpsData2;
                while (i22 < unsignedShort3) {
                    int unsignedShort4 = parsableByteArray.readUnsignedShort();
                    boolean z4 = z3;
                    byte[] bArr2 = NalUnitUtil.NAL_START_CODE;
                    int i23 = unsignedByte;
                    System.arraycopy(bArr2, i5, bArr, i21, bArr2.length);
                    int length = i21 + bArr2.length;
                    System.arraycopy(parsableByteArray.getData(), parsableByteArray.getPosition(), bArr, length, unsignedShort4);
                    if (unsignedByte3 == 32 && i22 == 0) {
                        h265VpsNalUnit = NalUnitUtil.parseH265VpsNalUnit(bArr, length, length + unsignedShort4);
                        i2 = unsignedByte2;
                    } else {
                        if (unsignedByte3 == 33 && i22 == 0) {
                            NalUnitUtil.H265SpsData h265SpsNalUnit = NalUnitUtil.parseH265SpsNalUnit(bArr, length, length + unsignedShort4, h265VpsNalUnit);
                            i10 = h265SpsNalUnit.maxSubLayersMinus1 + 1;
                            i11 = h265SpsNalUnit.width;
                            int i24 = h265SpsNalUnit.height;
                            i13 = h265SpsNalUnit.bitDepthLumaMinus8 + 8;
                            i14 = h265SpsNalUnit.bitDepthChromaMinus8 + 8;
                            int i25 = h265SpsNalUnit.colorSpace;
                            i2 = unsignedByte2;
                            int i26 = h265SpsNalUnit.colorRange;
                            int i27 = h265SpsNalUnit.colorTransfer;
                            float f4 = h265SpsNalUnit.pixelWidthHeightRatio;
                            int i28 = h265SpsNalUnit.maxNumReorderPics;
                            NalUnitUtil.H265ProfileTierLevel h265ProfileTierLevel = h265SpsNalUnit.profileTierLevel;
                            if (h265ProfileTierLevel != null) {
                                i3 = i28;
                                strBuildHevcCodecString = CodecSpecificDataUtil.buildHevcCodecString(h265ProfileTierLevel.generalProfileSpace, h265ProfileTierLevel.generalTierFlag, h265ProfileTierLevel.generalProfileIdc, h265ProfileTierLevel.generalProfileCompatibilityFlags, h265ProfileTierLevel.constraintBytes, h265ProfileTierLevel.generalLevelIdc);
                            } else {
                                i3 = i28;
                            }
                            f3 = f4;
                            i19 = i3;
                            i16 = i26;
                            i17 = i27;
                            i15 = i25;
                            i12 = i24;
                        } else {
                            i2 = unsignedByte2;
                            if (unsignedByte3 == 39 && i22 == 0 && (h265Sei3dRefDisplayInfo = NalUnitUtil.parseH265Sei3dRefDisplayInfo(bArr, length, length + unsignedShort4)) != null && h265VpsNalUnit != null) {
                                i5 = 0;
                                i18 = h265Sei3dRefDisplayInfo.leftViewId == ((NalUnitUtil.H265LayerInfo) h265VpsNalUnit.layerInfos.get(0)).viewId ? 4 : 5;
                            }
                        }
                        i5 = 0;
                    }
                    i21 = length + unsignedShort4;
                    parsableByteArray.skipBytes(unsignedShort4);
                    i22++;
                    z3 = z4;
                    unsignedByte = i23;
                    unsignedByte2 = i2;
                }
                i20++;
                h265VpsData2 = h265VpsNalUnit;
            }
            return new HevcConfig(i8 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), unsignedByte + 1, i10, i11, i12, i13, i14, i15, i16, i17, i18, f3, i19, strBuildHevcCodecString, h265VpsData2);
        } catch (ArrayIndexOutOfBoundsException e2) {
            StringBuilder sb = new StringBuilder();
            sb.append("Error parsing");
            sb.append(z2 ? "L-HEVC config" : "HEVC config");
            throw ParserException.createForMalformedContainer(sb.toString(), e2);
        }
    }

    private HevcConfig(List<byte[]> list, int i2, int i3, int i5, int i7, int i8, int i9, int i10, int i11, int i12, int i13, float f3, int i14, @Nullable String str, @Nullable NalUnitUtil.H265VpsData h265VpsData) {
        this.initializationData = list;
        this.nalUnitLengthFieldLength = i2;
        this.maxSubLayers = i3;
        this.width = i5;
        this.height = i7;
        this.bitdepthLuma = i8;
        this.bitdepthChroma = i9;
        this.colorSpace = i10;
        this.colorRange = i11;
        this.colorTransfer = i12;
        this.stereoMode = i13;
        this.pixelWidthHeightRatio = f3;
        this.maxNumReorderPics = i14;
        this.codecs = str;
        this.vpsData = h265VpsData;
    }
}
