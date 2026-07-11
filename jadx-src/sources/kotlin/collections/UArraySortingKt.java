package kotlin.collections;

import androidx.media3.extractor.text.ttml.TtmlNode;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001a'\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a'\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0012\u0010\u0013\u001a'\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a'\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0003¢\u0006\u0004\b\u0019\u0010\u001a\u001a'\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u001e\u0010\u000b\u001a'\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u001f\u0010\u0010\u001a'\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00112\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b \u0010\u0015\u001a'\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00012\u0006\u0010\u001d\u001a\u00020\u0001H\u0001¢\u0006\u0004\b!\u0010\u001a¨\u0006\""}, d2 = {"partition", "", "array", "Lkotlin/UByteArray;", TtmlNode.LEFT, TtmlNode.RIGHT, "partition-4UcCI2c", "([BII)I", "quickSort", "", "quickSort-4UcCI2c", "([BII)V", "Lkotlin/UShortArray;", "partition-Aa5vz7o", "([SII)I", "quickSort-Aa5vz7o", "([SII)V", "Lkotlin/UIntArray;", "partition-oBK06Vg", "([III)I", "quickSort-oBK06Vg", "([III)V", "Lkotlin/ULongArray;", "partition--nroSd4", "([JII)I", "quickSort--nroSd4", "([JII)V", "sortArray", "fromIndex", "toIndex", "sortArray-4UcCI2c", "sortArray-Aa5vz7o", "sortArray-oBK06Vg", "sortArray--nroSd4", "kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class UArraySortingKt {
    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: partition--nroSd4, reason: not valid java name */
    private static final int m768partitionnroSd4(long[] jArr, int i2, int i3) {
        long jM547getsVKNKU = ULongArray.m547getsVKNKU(jArr, (i2 + i3) / 2);
        while (i2 <= i3) {
            while (Long.compare(ULongArray.m547getsVKNKU(jArr, i2) ^ Long.MIN_VALUE, jM547getsVKNKU ^ Long.MIN_VALUE) < 0) {
                i2++;
            }
            while (Long.compare(ULongArray.m547getsVKNKU(jArr, i3) ^ Long.MIN_VALUE, jM547getsVKNKU ^ Long.MIN_VALUE) > 0) {
                i3--;
            }
            if (i2 <= i3) {
                long jM547getsVKNKU2 = ULongArray.m547getsVKNKU(jArr, i2);
                ULongArray.m552setk8EXiF4(jArr, i2, ULongArray.m547getsVKNKU(jArr, i3));
                ULongArray.m552setk8EXiF4(jArr, i3, jM547getsVKNKU2);
                i2++;
                i3--;
            }
        }
        return i2;
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: partition-4UcCI2c, reason: not valid java name */
    private static final int m769partition4UcCI2c(byte[] bArr, int i2, int i3) {
        int i5;
        byte bM389getw2LRezQ = UByteArray.m389getw2LRezQ(bArr, (i2 + i3) / 2);
        while (i2 <= i3) {
            while (true) {
                int iM389getw2LRezQ = UByteArray.m389getw2LRezQ(bArr, i2) & UByte.MAX_VALUE;
                i5 = bM389getw2LRezQ & UByte.MAX_VALUE;
                if (Intrinsics.compare(iM389getw2LRezQ, i5) >= 0) {
                    break;
                }
                i2++;
            }
            while (Intrinsics.compare(UByteArray.m389getw2LRezQ(bArr, i3) & UByte.MAX_VALUE, i5) > 0) {
                i3--;
            }
            if (i2 <= i3) {
                byte bM389getw2LRezQ2 = UByteArray.m389getw2LRezQ(bArr, i2);
                UByteArray.m394setVurrAj0(bArr, i2, UByteArray.m389getw2LRezQ(bArr, i3));
                UByteArray.m394setVurrAj0(bArr, i3, bM389getw2LRezQ2);
                i2++;
                i3--;
            }
        }
        return i2;
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: partition-Aa5vz7o, reason: not valid java name */
    private static final int m770partitionAa5vz7o(short[] sArr, int i2, int i3) {
        int i5;
        short sM652getMh2AYeg = UShortArray.m652getMh2AYeg(sArr, (i2 + i3) / 2);
        while (i2 <= i3) {
            while (true) {
                int iM652getMh2AYeg = UShortArray.m652getMh2AYeg(sArr, i2) & UShort.MAX_VALUE;
                i5 = sM652getMh2AYeg & UShort.MAX_VALUE;
                if (Intrinsics.compare(iM652getMh2AYeg, i5) >= 0) {
                    break;
                }
                i2++;
            }
            while (Intrinsics.compare(UShortArray.m652getMh2AYeg(sArr, i3) & UShort.MAX_VALUE, i5) > 0) {
                i3--;
            }
            if (i2 <= i3) {
                short sM652getMh2AYeg2 = UShortArray.m652getMh2AYeg(sArr, i2);
                UShortArray.m657set01HTLdE(sArr, i2, UShortArray.m652getMh2AYeg(sArr, i3));
                UShortArray.m657set01HTLdE(sArr, i3, sM652getMh2AYeg2);
                i2++;
                i3--;
            }
        }
        return i2;
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: partition-oBK06Vg, reason: not valid java name */
    private static final int m771partitionoBK06Vg(int[] iArr, int i2, int i3) {
        int iM468getpVg5ArA = UIntArray.m468getpVg5ArA(iArr, (i2 + i3) / 2);
        while (i2 <= i3) {
            while (Integer.compare(UIntArray.m468getpVg5ArA(iArr, i2) ^ Integer.MIN_VALUE, iM468getpVg5ArA ^ Integer.MIN_VALUE) < 0) {
                i2++;
            }
            while (Integer.compare(UIntArray.m468getpVg5ArA(iArr, i3) ^ Integer.MIN_VALUE, iM468getpVg5ArA ^ Integer.MIN_VALUE) > 0) {
                i3--;
            }
            if (i2 <= i3) {
                int iM468getpVg5ArA2 = UIntArray.m468getpVg5ArA(iArr, i2);
                UIntArray.m473setVXSXFK8(iArr, i2, UIntArray.m468getpVg5ArA(iArr, i3));
                UIntArray.m473setVXSXFK8(iArr, i3, iM468getpVg5ArA2);
                i2++;
                i3--;
            }
        }
        return i2;
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortArray--nroSd4, reason: not valid java name */
    public static final void m776sortArraynroSd4(long[] array, int i2, int i3) {
        Intrinsics.checkNotNullParameter(array, "array");
        m772quickSortnroSd4(array, i2, i3 - 1);
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortArray-4UcCI2c, reason: not valid java name */
    public static final void m777sortArray4UcCI2c(byte[] array, int i2, int i3) {
        Intrinsics.checkNotNullParameter(array, "array");
        m773quickSort4UcCI2c(array, i2, i3 - 1);
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortArray-Aa5vz7o, reason: not valid java name */
    public static final void m778sortArrayAa5vz7o(short[] array, int i2, int i3) {
        Intrinsics.checkNotNullParameter(array, "array");
        m774quickSortAa5vz7o(array, i2, i3 - 1);
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: sortArray-oBK06Vg, reason: not valid java name */
    public static final void m779sortArrayoBK06Vg(int[] array, int i2, int i3) {
        Intrinsics.checkNotNullParameter(array, "array");
        m775quickSortoBK06Vg(array, i2, i3 - 1);
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: quickSort--nroSd4, reason: not valid java name */
    private static final void m772quickSortnroSd4(long[] jArr, int i2, int i3) {
        int iM768partitionnroSd4 = m768partitionnroSd4(jArr, i2, i3);
        int i5 = iM768partitionnroSd4 - 1;
        if (i2 < i5) {
            m772quickSortnroSd4(jArr, i2, i5);
        }
        if (iM768partitionnroSd4 < i3) {
            m772quickSortnroSd4(jArr, iM768partitionnroSd4, i3);
        }
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: quickSort-4UcCI2c, reason: not valid java name */
    private static final void m773quickSort4UcCI2c(byte[] bArr, int i2, int i3) {
        int iM769partition4UcCI2c = m769partition4UcCI2c(bArr, i2, i3);
        int i5 = iM769partition4UcCI2c - 1;
        if (i2 < i5) {
            m773quickSort4UcCI2c(bArr, i2, i5);
        }
        if (iM769partition4UcCI2c < i3) {
            m773quickSort4UcCI2c(bArr, iM769partition4UcCI2c, i3);
        }
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: quickSort-Aa5vz7o, reason: not valid java name */
    private static final void m774quickSortAa5vz7o(short[] sArr, int i2, int i3) {
        int iM770partitionAa5vz7o = m770partitionAa5vz7o(sArr, i2, i3);
        int i5 = iM770partitionAa5vz7o - 1;
        if (i2 < i5) {
            m774quickSortAa5vz7o(sArr, i2, i5);
        }
        if (iM770partitionAa5vz7o < i3) {
            m774quickSortAa5vz7o(sArr, iM770partitionAa5vz7o, i3);
        }
    }

    @ExperimentalUnsignedTypes
    /* JADX INFO: renamed from: quickSort-oBK06Vg, reason: not valid java name */
    private static final void m775quickSortoBK06Vg(int[] iArr, int i2, int i3) {
        int iM771partitionoBK06Vg = m771partitionoBK06Vg(iArr, i2, i3);
        int i5 = iM771partitionoBK06Vg - 1;
        if (i2 < i5) {
            m775quickSortoBK06Vg(iArr, i2, i5);
        }
        if (iM771partitionoBK06Vg < i3) {
            m775quickSortoBK06Vg(iArr, iM771partitionoBK06Vg, i3);
        }
    }
}
