package okio.internal;

import com.caoccao.javet.values.reference.V8ValueTypedArray;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.Buffer;
import okio.ByteString;
import okio.C2322SegmentedByteString;
import okio.Segment;

/* JADX INFO: renamed from: okio.internal.-SegmentedByteString, reason: invalid class name */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a$\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0000\u001a-\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0080\b\u001a\u0017\u0010\u000e\u001a\u00020\u000f*\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0080\b\u001a\r\u0010\u0012\u001a\u00020\u0001*\u00020\bH\u0080\b\u001a\r\u0010\u0013\u001a\u00020\u0001*\u00020\bH\u0080\b\u001a\u0015\u0010\u0014\u001a\u00020\u0015*\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0001H\u0080\b\u001a-\u0010\u0017\u001a\u00020\u000f*\u00020\b2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0080\b\u001a-\u0010\u0017\u001a\u00020\u000f*\u00020\b2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0080\b\u001a\u001d\u0010\u001a\u001a\u00020\u0019*\u00020\b2\u0006\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u0001H\u0080\b\u001a\r\u0010\u001d\u001a\u00020\u000b*\u00020\bH\u0080\b\u001a%\u0010\u001e\u001a\u00020\u0007*\u00020\b2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\r\u001a\u00020\u0001H\u0080\b\u001a]\u0010!\u001a\u00020\u0007*\u00020\b2K\u0010\"\u001aG\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00070#H\u0080\bø\u0001\u0000\u001aj\u0010!\u001a\u00020\u0007*\u00020\b2\u0006\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u00012K\u0010\"\u001aG\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(&\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\t\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00070#H\u0082\b\u001a\u0014\u0010'\u001a\u00020\u0001*\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0001H\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006("}, d2 = {"binarySearch", "", "", "value", "fromIndex", "toIndex", "commonCopyInto", "", "Lokio/SegmentedByteString;", "offset", "target", "", "targetOffset", "byteCount", "commonEquals", "", InneractiveMediationNameConsts.OTHER, "", "commonGetSize", "commonHashCode", "commonInternalGet", "", "pos", "commonRangeEquals", "otherOffset", "Lokio/ByteString;", "commonSubstring", "beginIndex", "endIndex", "commonToByteArray", "commonWrite", V8ValueTypedArray.PROPERTY_BUFFER, "Lokio/Buffer;", "forEachSegment", FileUploadManager.f61572j, "Lkotlin/Function3;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "data", "segment", "okio"}, k = 2, mv = {1, 9, 0}, xi = 48)
@JvmName(name = "-SegmentedByteString")
@SourceDebugExtension({"SMAP\nSegmentedByteString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentedByteString.kt\nokio/internal/-SegmentedByteString\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,250:1\n63#1,12:252\n85#1,14:264\n85#1,14:278\n85#1,14:292\n85#1,14:306\n63#1,12:320\n1#2:251\n*S KotlinDebug\n*F\n+ 1 SegmentedByteString.kt\nokio/internal/-SegmentedByteString\n*L\n147#1:252,12\n160#1:264,14\n182#1:278,14\n202#1:292,14\n219#1:306,14\n239#1:320,12\n*E\n"})
public final class SegmentedByteString {
    public static final boolean commonRangeEquals(C2322SegmentedByteString c2322SegmentedByteString, int i2, ByteString other, int i3, int i5) {
        Intrinsics.checkNotNullParameter(c2322SegmentedByteString, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (i2 < 0 || i2 > c2322SegmentedByteString.size() - i5) {
            return false;
        }
        int i7 = i5 + i2;
        int iSegment = segment(c2322SegmentedByteString, i2);
        while (i2 < i7) {
            int i8 = iSegment == 0 ? 0 : c2322SegmentedByteString.getDirectory()[iSegment - 1];
            int i9 = c2322SegmentedByteString.getDirectory()[iSegment] - i8;
            int i10 = c2322SegmentedByteString.getDirectory()[c2322SegmentedByteString.getSegments().length + iSegment];
            int iMin = Math.min(i7, i9 + i8) - i2;
            if (!other.rangeEquals(i3, c2322SegmentedByteString.getSegments()[iSegment], i10 + (i2 - i8), iMin)) {
                return false;
            }
            i3 += iMin;
            i2 += iMin;
            iSegment++;
        }
        return true;
    }

    public static final void forEachSegment(C2322SegmentedByteString c2322SegmentedByteString, Function3<? super byte[], ? super Integer, ? super Integer, Unit> action) {
        Intrinsics.checkNotNullParameter(c2322SegmentedByteString, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int length = c2322SegmentedByteString.getSegments().length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i5 = c2322SegmentedByteString.getDirectory()[length + i2];
            int i7 = c2322SegmentedByteString.getDirectory()[i2];
            action.invoke(c2322SegmentedByteString.getSegments()[i2], Integer.valueOf(i5), Integer.valueOf(i7 - i3));
            i2++;
            i3 = i7;
        }
    }

    public static final int binarySearch(int[] iArr, int i2, int i3, int i5) {
        Intrinsics.checkNotNullParameter(iArr, "<this>");
        int i7 = i5 - 1;
        while (i3 <= i7) {
            int i8 = (i3 + i7) >>> 1;
            int i9 = iArr[i8];
            if (i9 < i2) {
                i3 = i8 + 1;
            } else {
                if (i9 <= i2) {
                    return i8;
                }
                i7 = i8 - 1;
            }
        }
        return (-i3) - 1;
    }

    public static final void commonCopyInto(C2322SegmentedByteString c2322SegmentedByteString, int i2, byte[] target, int i3, int i5) {
        Intrinsics.checkNotNullParameter(c2322SegmentedByteString, "<this>");
        Intrinsics.checkNotNullParameter(target, "target");
        long j2 = i5;
        okio.SegmentedByteString.checkOffsetAndCount(c2322SegmentedByteString.size(), i2, j2);
        okio.SegmentedByteString.checkOffsetAndCount(target.length, i3, j2);
        int i7 = i5 + i2;
        int iSegment = segment(c2322SegmentedByteString, i2);
        while (i2 < i7) {
            int i8 = iSegment == 0 ? 0 : c2322SegmentedByteString.getDirectory()[iSegment - 1];
            int i9 = c2322SegmentedByteString.getDirectory()[iSegment] - i8;
            int i10 = c2322SegmentedByteString.getDirectory()[c2322SegmentedByteString.getSegments().length + iSegment];
            int iMin = Math.min(i7, i9 + i8) - i2;
            int i11 = i10 + (i2 - i8);
            ArraysKt.copyInto(c2322SegmentedByteString.getSegments()[iSegment], target, i3, i11, i11 + iMin);
            i3 += iMin;
            i2 += iMin;
            iSegment++;
        }
    }

    public static final boolean commonEquals(C2322SegmentedByteString c2322SegmentedByteString, Object obj) {
        Intrinsics.checkNotNullParameter(c2322SegmentedByteString, "<this>");
        if (obj == c2322SegmentedByteString) {
            return true;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            if (byteString.size() == c2322SegmentedByteString.size() && c2322SegmentedByteString.rangeEquals(0, byteString, 0, c2322SegmentedByteString.size())) {
                return true;
            }
        }
        return false;
    }

    public static final int commonGetSize(C2322SegmentedByteString c2322SegmentedByteString) {
        Intrinsics.checkNotNullParameter(c2322SegmentedByteString, "<this>");
        return c2322SegmentedByteString.getDirectory()[c2322SegmentedByteString.getSegments().length - 1];
    }

    public static final int commonHashCode(C2322SegmentedByteString c2322SegmentedByteString) {
        Intrinsics.checkNotNullParameter(c2322SegmentedByteString, "<this>");
        int hashCode = c2322SegmentedByteString.getHashCode();
        if (hashCode != 0) {
            return hashCode;
        }
        int length = c2322SegmentedByteString.getSegments().length;
        int i2 = 0;
        int i3 = 1;
        int i5 = 0;
        while (i2 < length) {
            int i7 = c2322SegmentedByteString.getDirectory()[length + i2];
            int i8 = c2322SegmentedByteString.getDirectory()[i2];
            byte[] bArr = c2322SegmentedByteString.getSegments()[i2];
            int i9 = (i8 - i5) + i7;
            while (i7 < i9) {
                i3 = (i3 * 31) + bArr[i7];
                i7++;
            }
            i2++;
            i5 = i8;
        }
        c2322SegmentedByteString.setHashCode$okio(i3);
        return i3;
    }

    public static final byte commonInternalGet(C2322SegmentedByteString c2322SegmentedByteString, int i2) {
        Intrinsics.checkNotNullParameter(c2322SegmentedByteString, "<this>");
        okio.SegmentedByteString.checkOffsetAndCount(c2322SegmentedByteString.getDirectory()[c2322SegmentedByteString.getSegments().length - 1], i2, 1L);
        int iSegment = segment(c2322SegmentedByteString, i2);
        return c2322SegmentedByteString.getSegments()[iSegment][(i2 - (iSegment == 0 ? 0 : c2322SegmentedByteString.getDirectory()[iSegment - 1])) + c2322SegmentedByteString.getDirectory()[c2322SegmentedByteString.getSegments().length + iSegment]];
    }

    public static final ByteString commonSubstring(C2322SegmentedByteString c2322SegmentedByteString, int i2, int i3) {
        Intrinsics.checkNotNullParameter(c2322SegmentedByteString, "<this>");
        int iResolveDefaultParameter = okio.SegmentedByteString.resolveDefaultParameter(c2322SegmentedByteString, i3);
        if (i2 < 0) {
            throw new IllegalArgumentException(("beginIndex=" + i2 + " < 0").toString());
        }
        if (iResolveDefaultParameter > c2322SegmentedByteString.size()) {
            throw new IllegalArgumentException(("endIndex=" + iResolveDefaultParameter + " > length(" + c2322SegmentedByteString.size() + ')').toString());
        }
        int i5 = iResolveDefaultParameter - i2;
        if (i5 < 0) {
            throw new IllegalArgumentException(("endIndex=" + iResolveDefaultParameter + " < beginIndex=" + i2).toString());
        }
        if (i2 == 0 && iResolveDefaultParameter == c2322SegmentedByteString.size()) {
            return c2322SegmentedByteString;
        }
        if (i2 == iResolveDefaultParameter) {
            return ByteString.EMPTY;
        }
        int iSegment = segment(c2322SegmentedByteString, i2);
        int iSegment2 = segment(c2322SegmentedByteString, iResolveDefaultParameter - 1);
        byte[][] bArr = (byte[][]) ArraysKt.copyOfRange(c2322SegmentedByteString.getSegments(), iSegment, iSegment2 + 1);
        int[] iArr = new int[bArr.length * 2];
        if (iSegment <= iSegment2) {
            int i7 = iSegment;
            int i8 = 0;
            while (true) {
                iArr[i8] = Math.min(c2322SegmentedByteString.getDirectory()[i7] - i2, i5);
                int i9 = i8 + 1;
                iArr[i8 + bArr.length] = c2322SegmentedByteString.getDirectory()[c2322SegmentedByteString.getSegments().length + i7];
                if (i7 == iSegment2) {
                    break;
                }
                i7++;
                i8 = i9;
            }
        }
        int i10 = iSegment != 0 ? c2322SegmentedByteString.getDirectory()[iSegment - 1] : 0;
        int length = bArr.length;
        iArr[length] = iArr[length] + (i2 - i10);
        return new C2322SegmentedByteString(bArr, iArr);
    }

    public static final byte[] commonToByteArray(C2322SegmentedByteString c2322SegmentedByteString) {
        Intrinsics.checkNotNullParameter(c2322SegmentedByteString, "<this>");
        byte[] bArr = new byte[c2322SegmentedByteString.size()];
        int length = c2322SegmentedByteString.getSegments().length;
        int i2 = 0;
        int i3 = 0;
        int i5 = 0;
        while (i2 < length) {
            int i7 = c2322SegmentedByteString.getDirectory()[length + i2];
            int i8 = c2322SegmentedByteString.getDirectory()[i2];
            int i9 = i8 - i3;
            ArraysKt.copyInto(c2322SegmentedByteString.getSegments()[i2], bArr, i5, i7, i7 + i9);
            i5 += i9;
            i2++;
            i3 = i8;
        }
        return bArr;
    }

    public static final void commonWrite(C2322SegmentedByteString c2322SegmentedByteString, Buffer buffer, int i2, int i3) {
        Intrinsics.checkNotNullParameter(c2322SegmentedByteString, "<this>");
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        int i5 = i2 + i3;
        int iSegment = segment(c2322SegmentedByteString, i2);
        while (i2 < i5) {
            int i7 = iSegment == 0 ? 0 : c2322SegmentedByteString.getDirectory()[iSegment - 1];
            int i8 = c2322SegmentedByteString.getDirectory()[iSegment] - i7;
            int i9 = c2322SegmentedByteString.getDirectory()[c2322SegmentedByteString.getSegments().length + iSegment];
            int iMin = Math.min(i5, i8 + i7) - i2;
            int i10 = i9 + (i2 - i7);
            Segment segment = new Segment(c2322SegmentedByteString.getSegments()[iSegment], i10, i10 + iMin, true, false);
            Segment segment2 = buffer.head;
            if (segment2 == null) {
                segment.prev = segment;
                segment.next = segment;
                buffer.head = segment;
            } else {
                Intrinsics.checkNotNull(segment2);
                Segment segment3 = segment2.prev;
                Intrinsics.checkNotNull(segment3);
                segment3.push(segment);
            }
            i2 += iMin;
            iSegment++;
        }
        buffer.setSize$okio(buffer.size() + ((long) i3));
    }

    public static final int segment(C2322SegmentedByteString c2322SegmentedByteString, int i2) {
        Intrinsics.checkNotNullParameter(c2322SegmentedByteString, "<this>");
        int iBinarySearch = binarySearch(c2322SegmentedByteString.getDirectory(), i2 + 1, 0, c2322SegmentedByteString.getSegments().length);
        return iBinarySearch >= 0 ? iBinarySearch : ~iBinarySearch;
    }

    private static final void forEachSegment(C2322SegmentedByteString c2322SegmentedByteString, int i2, int i3, Function3<? super byte[], ? super Integer, ? super Integer, Unit> function3) {
        int iSegment = segment(c2322SegmentedByteString, i2);
        while (i2 < i3) {
            int i5 = iSegment == 0 ? 0 : c2322SegmentedByteString.getDirectory()[iSegment - 1];
            int i7 = c2322SegmentedByteString.getDirectory()[iSegment] - i5;
            int i8 = c2322SegmentedByteString.getDirectory()[c2322SegmentedByteString.getSegments().length + iSegment];
            int iMin = Math.min(i3, i7 + i5) - i2;
            function3.invoke(c2322SegmentedByteString.getSegments()[iSegment], Integer.valueOf(i8 + (i2 - i5)), Integer.valueOf(iMin));
            i2 += iMin;
            iSegment++;
        }
    }

    public static final boolean commonRangeEquals(C2322SegmentedByteString c2322SegmentedByteString, int i2, byte[] other, int i3, int i5) {
        Intrinsics.checkNotNullParameter(c2322SegmentedByteString, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        if (i2 < 0 || i2 > c2322SegmentedByteString.size() - i5 || i3 < 0 || i3 > other.length - i5) {
            return false;
        }
        int i7 = i5 + i2;
        int iSegment = segment(c2322SegmentedByteString, i2);
        while (i2 < i7) {
            int i8 = iSegment == 0 ? 0 : c2322SegmentedByteString.getDirectory()[iSegment - 1];
            int i9 = c2322SegmentedByteString.getDirectory()[iSegment] - i8;
            int i10 = c2322SegmentedByteString.getDirectory()[c2322SegmentedByteString.getSegments().length + iSegment];
            int iMin = Math.min(i7, i9 + i8) - i2;
            if (!okio.SegmentedByteString.arrayRangeEquals(c2322SegmentedByteString.getSegments()[iSegment], i10 + (i2 - i8), other, i3, iMin)) {
                return false;
            }
            i3 += iMin;
            i2 += iMin;
            iSegment++;
        }
        return true;
    }
}
