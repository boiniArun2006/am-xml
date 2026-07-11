package androidx.compose.runtime.snapshots;

import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\r\u001a\u001b\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a#\u0010\t\u001a\u00020\u0000*\u00060\u0002j\u0002`\u00032\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a/\u0010\f\u001a\u00060\u0002j\u0002`\u0003*\u00060\u0002j\u0002`\u00032\u0006\u0010\u000b\u001a\u00020\u00002\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0000¢\u0006\u0004\b\f\u0010\r\u001a'\u0010\u000e\u001a\n\u0018\u00010\u0002j\u0004\u0018\u0001`\u0003*\u00060\u0002j\u0002`\u00032\u0006\u0010\u000b\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0017\u0010\u0010\u001a\u00060\u0006j\u0002`\u0007*\u00020\u0000H\u0000¢\u0006\u0004\b\u0010\u0010\u0011*\n\u0010\u0012\"\u00020\u00062\u00020\u0006*\n\u0010\u0013\"\u00020\u00022\u00020\u0002¨\u0006\u0014"}, d2 = {"", "capacity", "", "Landroidx/compose/runtime/snapshots/SnapshotIdArray;", "rl", "(I)[J", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "id", c.f62177j, "([JJ)I", "index", "nr", "([JIJ)[J", "O", "([JI)[J", "t", "(I)J", "SnapshotId", "SnapshotIdArray", "runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class SnapshotId_jvmKt {
    public static final long[] O(long[] jArr, int i2) {
        int length = jArr.length;
        int i3 = length - 1;
        if (i3 == 0) {
            return null;
        }
        long[] jArr2 = new long[i3];
        if (i2 > 0) {
            ArraysKt.copyInto(jArr, jArr2, 0, 0, i2);
        }
        if (i2 < i3) {
            ArraysKt.copyInto(jArr, jArr2, i2, i2 + 1, length);
        }
        return jArr2;
    }

    public static final int n(long[] jArr, long j2) {
        int length = jArr.length - 1;
        int i2 = 0;
        while (i2 <= length) {
            int i3 = (i2 + length) >>> 1;
            long j3 = jArr[i3];
            if (j2 > j3) {
                i2 = i3 + 1;
            } else {
                if (j2 >= j3) {
                    return i3;
                }
                length = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final long[] nr(long[] jArr, int i2, long j2) {
        int length = jArr.length;
        long[] jArr2 = new long[length + 1];
        ArraysKt.copyInto(jArr, jArr2, 0, 0, i2);
        ArraysKt.copyInto(jArr, jArr2, i2 + 1, i2, length);
        jArr2[i2] = j2;
        return jArr2;
    }

    public static final long t(int i2) {
        return i2;
    }

    public static final long[] rl(int i2) {
        return new long[i2];
    }
}
