package androidx.collection.internal;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0010\u0016\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0017\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a#\u0010\n\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\u0010\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a'\u0010\u0014\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\"\u0014\u0010\u0017\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0016\"\u0014\u0010\u0019\u001a\u00020\u00128\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0018\"\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u001a8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001b¨\u0006\u001d"}, d2 = {"", "need", "O", "(I)I", "J2", "nr", "", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "b", "", "t", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "", "array", "size", "value", c.f62177j, "([III)I", "", "", "rl", "([JIJ)I", "[I", "EMPTY_INTS", "[J", "EMPTY_LONGS", "", "[Ljava/lang/Object;", "EMPTY_OBJECTS", "collection"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class ContainerHelpersKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int[] f14931n = new int[0];
    public static final long[] rl = new long[0];

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Object[] f14932t = new Object[0];

    public static final int nr(int i2) {
        for (int i3 = 4; i3 < 32; i3++) {
            int i5 = (1 << i3) - 12;
            if (i2 <= i5) {
                return i5;
            }
        }
        return i2;
    }

    public static final int J2(int i2) {
        return nr(i2 * 8) / 8;
    }

    public static final int O(int i2) {
        return nr(i2 * 4) / 4;
    }

    public static final int n(int[] array, int i2, int i3) {
        Intrinsics.checkNotNullParameter(array, "array");
        int i5 = i2 - 1;
        int i7 = 0;
        while (i7 <= i5) {
            int i8 = (i7 + i5) >>> 1;
            int i9 = array[i8];
            if (i9 < i3) {
                i7 = i8 + 1;
            } else {
                if (i9 <= i3) {
                    return i8;
                }
                i5 = i8 - 1;
            }
        }
        return ~i7;
    }

    public static final int rl(long[] array, int i2, long j2) {
        Intrinsics.checkNotNullParameter(array, "array");
        int i3 = i2 - 1;
        int i5 = 0;
        while (i5 <= i3) {
            int i7 = (i5 + i3) >>> 1;
            long j3 = array[i7];
            if (j3 < j2) {
                i5 = i7 + 1;
            } else {
                if (j3 <= j2) {
                    return i7;
                }
                i3 = i7 - 1;
            }
        }
        return ~i5;
    }

    public static final boolean t(Object obj, Object obj2) {
        return Intrinsics.areEqual(obj, obj2);
    }
}
