package androidx.media3.extractor.mp4;

import androidx.annotation.Nullable;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.container.Mp4Box;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.SniffFailure;
import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@UnstableApi
public final class Sniffer {
    public static final int BRAND_HEIC = 1751476579;
    public static final int BRAND_QUICKTIME = 1903435808;
    private static final int[] COMPATIBLE_BRANDS = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, Mp4Box.TYPE_avc1, Mp4Box.TYPE_hvc1, Mp4Box.TYPE_hev1, Mp4Box.TYPE_av01, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, BRAND_QUICKTIME, 1297305174, 1684175153, 1769172332, 1885955686};
    private static final int SEARCH_LENGTH = 4096;

    @Nullable
    public static SniffFailure sniffFragmented(ExtractorInput extractorInput) throws IOException {
        return sniffInternal(extractorInput, true, false);
    }

    @Nullable
    public static SniffFailure sniffUnfragmented(ExtractorInput extractorInput, boolean z2) throws IOException {
        return sniffInternal(extractorInput, false, z2);
    }

    private static boolean isCompatibleBrand(int i2, boolean z2) {
        if ((i2 >>> 8) == 3368816) {
            return true;
        }
        if (i2 == 1751476579 && z2) {
            return true;
        }
        for (int i3 : COMPATIBLE_BRANDS) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static SniffFailure sniffInternal(ExtractorInput extractorInput, boolean z2, boolean z3) throws IOException {
        SniffFailure sniffFailure;
        int i2;
        long j2;
        int i3;
        int i5;
        int i7;
        int[] iArr;
        long length = extractorInput.getLength();
        long j3 = -1;
        long j4 = 4096;
        if (length != -1 && length <= 4096) {
            j4 = length;
        }
        int i8 = (int) j4;
        ParsableByteArray parsableByteArray = new ParsableByteArray(64);
        int i9 = 0;
        int i10 = 0;
        boolean z4 = false;
        while (i10 < i8) {
            parsableByteArray.reset(8);
            boolean z5 = true;
            if (!extractorInput.peekFully(parsableByteArray.getData(), i9, 8, true)) {
                break;
            }
            long unsignedInt = parsableByteArray.readUnsignedInt();
            int i11 = parsableByteArray.readInt();
            if (unsignedInt == 1) {
                j2 = j3;
                extractorInput.peekFully(parsableByteArray.getData(), 8, 8);
                i5 = 16;
                parsableByteArray.setLimit(16);
                unsignedInt = parsableByteArray.readLong();
                i3 = i10;
            } else {
                j2 = j3;
                if (unsignedInt == 0) {
                    long length2 = extractorInput.getLength();
                    if (length2 != j2) {
                        i3 = i10;
                        unsignedInt = (length2 - extractorInput.getPeekPosition()) + ((long) 8);
                    } else {
                        i3 = i10;
                    }
                    i5 = 8;
                }
            }
            long j5 = unsignedInt;
            long j6 = i5;
            if (j5 < j6) {
                return new AtomSizeTooSmallSniffFailure(i11, j5, i5);
            }
            int i12 = i3 + i5;
            sniffFailure = null;
            if (i11 == 1836019574) {
                i8 += (int) j5;
                if (length != -1 && i8 > length) {
                    i8 = (int) length;
                }
                i10 = i12;
                j3 = j2;
                i9 = 0;
            } else {
                if (i11 == 1836019558 || i11 == 1836475768) {
                    i2 = 1;
                    break;
                }
                if (i11 == 1835295092) {
                    z4 = true;
                }
                long j7 = length;
                if ((((long) i12) + j5) - j6 >= i8) {
                    i2 = 0;
                    break;
                }
                int i13 = (int) (j5 - j6);
                i10 = i12 + i13;
                if (i11 != 1718909296) {
                    i7 = 0;
                    if (i13 != 0) {
                        extractorInput.advancePeekPosition(i13);
                    }
                } else {
                    if (i13 < 8) {
                        return new AtomSizeTooSmallSniffFailure(i11, i13, 8);
                    }
                    parsableByteArray.reset(i13);
                    i7 = 0;
                    extractorInput.peekFully(parsableByteArray.getData(), 0, i13);
                    int i14 = parsableByteArray.readInt();
                    if (isCompatibleBrand(i14, z3)) {
                        z4 = true;
                    }
                    parsableByteArray.skipBytes(4);
                    int iBytesLeft = parsableByteArray.bytesLeft() / 4;
                    if (!z4 && iBytesLeft > 0) {
                        iArr = new int[iBytesLeft];
                        int i15 = 0;
                        while (true) {
                            if (i15 >= iBytesLeft) {
                                z5 = z4;
                                break;
                            }
                            int i16 = parsableByteArray.readInt();
                            iArr[i15] = i16;
                            if (isCompatibleBrand(i16, z3)) {
                                break;
                            }
                            i15++;
                        }
                    } else {
                        z5 = z4;
                        iArr = null;
                    }
                    if (!z5) {
                        return new UnsupportedBrandsSniffFailure(i14, iArr);
                    }
                    z4 = z5;
                }
                i9 = i7;
                j3 = j2;
                length = j7;
            }
        }
        sniffFailure = null;
        i2 = i9;
        return !z4 ? NoDeclaredBrandSniffFailure.INSTANCE : z2 != i2 ? i2 != 0 ? IncorrectFragmentationSniffFailure.FILE_FRAGMENTED : IncorrectFragmentationSniffFailure.FILE_NOT_FRAGMENTED : sniffFailure;
    }

    private Sniffer() {
    }
}
