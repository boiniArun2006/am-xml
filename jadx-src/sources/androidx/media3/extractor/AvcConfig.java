package androidx.media3.extractor;

import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.container.NalUnitUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@UnstableApi
public final class AvcConfig {
    public final int bitdepthChroma;
    public final int bitdepthLuma;

    @Nullable
    public final String codecs;
    public final int colorRange;
    public final int colorSpace;
    public final int colorTransfer;
    public final int height;
    public final List<byte[]> initializationData;
    public final int maxNumReorderFrames;
    public final int nalUnitLengthFieldLength;
    public final float pixelWidthHeightRatio;
    public final int width;

    public static AvcConfig parse(ParsableByteArray parsableByteArray) throws ParserException {
        String strBuildAvcCodecString;
        int i2;
        int i3;
        int i5;
        int i7;
        int i8;
        int i9;
        float f3;
        int i10;
        int i11;
        try {
            parsableByteArray.skipBytes(4);
            int unsignedByte = (parsableByteArray.readUnsignedByte() & 3) + 1;
            if (unsignedByte == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int unsignedByte2 = parsableByteArray.readUnsignedByte() & 31;
            for (int i12 = 0; i12 < unsignedByte2; i12++) {
                arrayList.add(buildNalUnitForChild(parsableByteArray));
            }
            int unsignedByte3 = parsableByteArray.readUnsignedByte();
            for (int i13 = 0; i13 < unsignedByte3; i13++) {
                arrayList.add(buildNalUnitForChild(parsableByteArray));
            }
            if (unsignedByte2 > 0) {
                NalUnitUtil.SpsData spsNalUnit = NalUnitUtil.parseSpsNalUnit((byte[]) arrayList.get(0), NalUnitUtil.NAL_START_CODE.length, ((byte[]) arrayList.get(0)).length);
                int i14 = spsNalUnit.width;
                int i15 = spsNalUnit.height;
                int i16 = spsNalUnit.bitDepthLumaMinus8 + 8;
                int i17 = spsNalUnit.bitDepthChromaMinus8 + 8;
                int i18 = spsNalUnit.colorSpace;
                int i19 = spsNalUnit.colorRange;
                int i20 = spsNalUnit.colorTransfer;
                int i21 = spsNalUnit.maxNumReorderFrames;
                float f4 = spsNalUnit.pixelWidthHeightRatio;
                strBuildAvcCodecString = CodecSpecificDataUtil.buildAvcCodecString(spsNalUnit.profileIdc, spsNalUnit.constraintsFlagsAndReservedZero2Bits, spsNalUnit.levelIdc);
                i8 = i20;
                i9 = i21;
                f3 = f4;
                i7 = i17;
                i10 = i18;
                i11 = i19;
                i2 = i14;
                i3 = i15;
                i5 = i16;
            } else {
                strBuildAvcCodecString = null;
                i2 = -1;
                i3 = -1;
                i5 = -1;
                i7 = -1;
                i8 = -1;
                i9 = 16;
                f3 = 1.0f;
                i10 = -1;
                i11 = -1;
            }
            return new AvcConfig(arrayList, unsignedByte, i2, i3, i5, i7, i10, i11, i8, i9, f3, strBuildAvcCodecString);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw ParserException.createForMalformedContainer("Error parsing AVC config", e2);
        }
    }

    private AvcConfig(List<byte[]> list, int i2, int i3, int i5, int i7, int i8, int i9, int i10, int i11, int i12, float f3, @Nullable String str) {
        this.initializationData = list;
        this.nalUnitLengthFieldLength = i2;
        this.width = i3;
        this.height = i5;
        this.bitdepthLuma = i7;
        this.bitdepthChroma = i8;
        this.colorSpace = i9;
        this.colorRange = i10;
        this.colorTransfer = i11;
        this.maxNumReorderFrames = i12;
        this.pixelWidthHeightRatio = f3;
        this.codecs = str;
    }

    private static byte[] buildNalUnitForChild(ParsableByteArray parsableByteArray) {
        int unsignedShort = parsableByteArray.readUnsignedShort();
        int position = parsableByteArray.getPosition();
        parsableByteArray.skipBytes(unsignedShort);
        return CodecSpecificDataUtil.buildNalUnit(parsableByteArray.getData(), position, unsignedShort);
    }
}
