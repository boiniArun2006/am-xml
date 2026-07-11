package d2n;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class I28 {
    public static final long n(long j2, Wre range) {
        Intrinsics.checkNotNullParameter(range, "range");
        return Ml.f63370t.t(RangesKt.coerceIn(j2, range.O(), t(range.nr())));
    }

    public static final long t(long j2) {
        if (j2 > Long.MIN_VALUE) {
            return Ml.f63370t.t(j2 - 1);
        }
        throw new IllegalStateException(("Current time is minimum representable one: " + j2).toString());
    }

    public static final long rl(long j2) {
        if (j2 < Long.MAX_VALUE) {
            return Ml.f63370t.t(j2 + 1);
        }
        throw new IllegalStateException(("Current time is maximum representable one: " + j2).toString());
    }
}
