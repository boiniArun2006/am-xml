package B7;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class eO {
    public static final long n(Xo compositionTimeFor, long j2) {
        Intrinsics.checkNotNullParameter(compositionTimeFor, "$this$compositionTimeFor");
        return ((d2n.Ml) RangesKt.coerceAtMost((d2n.Ml) RangesKt.coerceAtLeast(d2n.Ml.rl(d2n.Ml.HI(compositionTimeFor.t(), ((d2n.j) RangesKt.coerceAtLeast(d2n.j.rl(bK.j.O(d2n.Ml.az(j2, compositionTimeFor.J2()))), d2n.j.rl(d2n.j.f63374t.J2()))).WPU())), d2n.Ml.rl(compositionTimeFor.O())), d2n.Ml.rl(compositionTimeFor.nr()))).Ik();
    }

    public static final boolean rl(Xo hasReachedTheMax, long j2) {
        Intrinsics.checkNotNullParameter(hasReachedTheMax, "$this$hasReachedTheMax");
        return d2n.Ml.KN(n(hasReachedTheMax, j2), hasReachedTheMax.nr());
    }

    public static final Xo t(Xo withCoercedMaxCompositionTime, long j2) {
        Intrinsics.checkNotNullParameter(withCoercedMaxCompositionTime, "$this$withCoercedMaxCompositionTime");
        return Xo.rl(withCoercedMaxCompositionTime, 0L, 0L, ((d2n.Ml) RangesKt.coerceAtMost(d2n.Ml.rl(withCoercedMaxCompositionTime.O()), d2n.Ml.rl(j2))).Ik(), ((d2n.Ml) RangesKt.coerceAtMost(d2n.Ml.rl(withCoercedMaxCompositionTime.nr()), d2n.Ml.rl(j2))).Ik(), 3, null);
    }
}
