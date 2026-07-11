package com.google.android.exoplayer2.video;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.util.CodecSpecificDataUtil;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class HevcConfig {
    private static final int SPS_NAL_UNIT_TYPE = 33;

    @Nullable
    public final String codecs;
    public final int height;
    public final List<byte[]> initializationData;
    public final int nalUnitLengthFieldLength;
    public final float pixelWidthHeightRatio;
    public final int width;

    public static HevcConfig parse(ParsableByteArray parsableByteArray) throws ParserException {
        boolean z2;
        int i2;
        try {
            parsableByteArray.skipBytes(21);
            int unsignedByte = parsableByteArray.readUnsignedByte() & 3;
            int unsignedByte2 = parsableByteArray.readUnsignedByte();
            int position = parsableByteArray.getPosition();
            int i3 = 0;
            int i5 = 0;
            int i7 = 0;
            while (true) {
                z2 = true;
                if (i5 >= unsignedByte2) {
                    break;
                }
                parsableByteArray.skipBytes(1);
                int unsignedShort = parsableByteArray.readUnsignedShort();
                for (int i8 = 0; i8 < unsignedShort; i8++) {
                    int unsignedShort2 = parsableByteArray.readUnsignedShort();
                    i7 += unsignedShort2 + 4;
                    parsableByteArray.skipBytes(unsignedShort2);
                }
                i5++;
            }
            parsableByteArray.setPosition(position);
            byte[] bArr = new byte[i7];
            int i9 = -1;
            int i10 = -1;
            float f3 = 1.0f;
            String strBuildHevcCodecString = null;
            int i11 = 0;
            int i12 = 0;
            while (i11 < unsignedByte2) {
                int unsignedByte3 = parsableByteArray.readUnsignedByte() & 127;
                int unsignedShort3 = parsableByteArray.readUnsignedShort();
                int i13 = i3;
                while (i13 < unsignedShort3) {
                    int unsignedShort4 = parsableByteArray.readUnsignedShort();
                    boolean z3 = z2;
                    byte[] bArr2 = NalUnitUtil.NAL_START_CODE;
                    int i14 = unsignedByte;
                    System.arraycopy(bArr2, i3, bArr, i12, bArr2.length);
                    int length = i12 + bArr2.length;
                    System.arraycopy(parsableByteArray.getData(), parsableByteArray.getPosition(), bArr, length, unsignedShort4);
                    if (unsignedByte3 == 33 && i13 == 0) {
                        NalUnitUtil.H265SpsData h265SpsNalUnit = NalUnitUtil.parseH265SpsNalUnit(bArr, length, length + unsignedShort4);
                        i9 = h265SpsNalUnit.width;
                        i10 = h265SpsNalUnit.height;
                        f3 = h265SpsNalUnit.pixelWidthHeightRatio;
                        i2 = unsignedByte2;
                        strBuildHevcCodecString = CodecSpecificDataUtil.buildHevcCodecString(h265SpsNalUnit.generalProfileSpace, h265SpsNalUnit.generalTierFlag, h265SpsNalUnit.generalProfileIdc, h265SpsNalUnit.generalProfileCompatibilityFlags, h265SpsNalUnit.constraintBytes, h265SpsNalUnit.generalLevelIdc);
                    } else {
                        i2 = unsignedByte2;
                    }
                    i12 = length + unsignedShort4;
                    parsableByteArray.skipBytes(unsignedShort4);
                    i13++;
                    z2 = z3;
                    unsignedByte = i14;
                    unsignedByte2 = i2;
                    i3 = 0;
                }
                i11++;
                i3 = 0;
            }
            return new HevcConfig(i7 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), unsignedByte + 1, i9, i10, f3, strBuildHevcCodecString);
        } catch (ArrayIndexOutOfBoundsException e2) {
            throw ParserException.createForMalformedContainer("Error parsing HEVC config", e2);
        }
    }

    private HevcConfig(List<byte[]> list, int i2, int i3, int i5, float f3, @Nullable String str) {
        this.initializationData = list;
        this.nalUnitLengthFieldLength = i2;
        this.width = i3;
        this.height = i5;
        this.pixelWidthHeightRatio = f3;
        this.codecs = str;
    }
}
