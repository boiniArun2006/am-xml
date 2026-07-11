package com.google.android.exoplayer2.extractor.mp4;

import androidx.media3.container.Mp4Box;
import androidx.media3.extractor.mp4.Sniffer;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
abstract class aC {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int[] f57830n = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, Mp4Box.TYPE_avc1, Mp4Box.TYPE_hvc1, Mp4Box.TYPE_hev1, Mp4Box.TYPE_av01, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, Sniffer.BRAND_QUICKTIME, 1297305174, 1684175153, 1769172332, 1885955686};

    public static boolean nr(ExtractorInput extractorInput, boolean z2) {
        return t(extractorInput, false, z2);
    }

    public static boolean rl(ExtractorInput extractorInput) {
        return t(extractorInput, true, false);
    }

    private static boolean n(int i2, boolean z2) {
        if ((i2 >>> 8) == 3368816) {
            return true;
        }
        if (i2 == 1751476579 && z2) {
            return true;
        }
        for (int i3 : f57830n) {
            if (i3 == i2) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean t(ExtractorInput extractorInput, boolean z2, boolean z3) throws IOException {
        boolean z4;
        boolean z5;
        int i2;
        int i3;
        long length = extractorInput.getLength();
        long j2 = -1;
        int i5 = (length > (-1L) ? 1 : (length == (-1L) ? 0 : -1));
        long j3 = 4096;
        if (i5 != 0 && length <= 4096) {
            j3 = length;
        }
        int i7 = (int) j3;
        ParsableByteArray parsableByteArray = new ParsableByteArray(64);
        int i8 = 0;
        int i9 = 0;
        boolean z6 = false;
        while (i9 < i7) {
            parsableByteArray.reset(8);
            if (!extractorInput.peekFully(parsableByteArray.getData(), i8, 8, true)) {
                break;
            }
            long unsignedInt = parsableByteArray.readUnsignedInt();
            int i10 = parsableByteArray.readInt();
            if (unsignedInt == 1) {
                extractorInput.peekFully(parsableByteArray.getData(), 8, 8);
                parsableByteArray.setLimit(16);
                z5 = i8;
                i2 = i9;
                i3 = 16;
                unsignedInt = parsableByteArray.readLong();
            } else {
                if (unsignedInt == 0) {
                    long length2 = extractorInput.getLength();
                    if (length2 != j2) {
                        unsignedInt = (length2 - extractorInput.getPeekPosition()) + ((long) 8);
                    }
                }
                z5 = i8;
                i2 = i9;
                i3 = 8;
            }
            long j4 = i3;
            if (unsignedInt < j4) {
                return z5;
            }
            int i11 = i2 + i3;
            boolean z7 = z5;
            if (i10 == 1836019574) {
                i7 += (int) unsignedInt;
                if (i5 != 0 && i7 > length) {
                    i7 = (int) length;
                }
                i9 = i11;
                i8 = z7 ? 1 : 0;
                j2 = -1;
            } else {
                if (i10 == 1836019558 || i10 == 1836475768) {
                    z4 = true;
                    break;
                }
                int i12 = i5;
                if ((((long) i11) + unsignedInt) - j4 >= i7) {
                    break;
                }
                int i13 = (int) (unsignedInt - j4);
                i9 = i11 + i13;
                if (i10 == 1718909296) {
                    if (i13 < 8) {
                        return z7;
                    }
                    parsableByteArray.reset(i13);
                    extractorInput.peekFully(parsableByteArray.getData(), z7 ? 1 : 0, i13);
                    int i14 = i13 / 4;
                    int i15 = 0;
                    while (true) {
                        if (i15 >= i14) {
                            break;
                        }
                        if (i15 == 1) {
                            parsableByteArray.skipBytes(4);
                        } else if (n(parsableByteArray.readInt(), z3)) {
                            z6 = true;
                            break;
                        }
                        i15++;
                    }
                    if (!z6) {
                        return false;
                    }
                } else if (i13 != 0) {
                    extractorInput.advancePeekPosition(i13);
                }
                i5 = i12;
                j2 = -1;
                i8 = 0;
            }
        }
        z4 = false;
        return z6 && z2 == z4;
    }
}
