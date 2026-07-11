package Z4;

import d2n.Wre;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class w6 {
    public static final j n(n toRange, long j2) {
        Intrinsics.checkNotNullParameter(toRange, "$this$toRange");
        return new j(toRange.nr(), new Wre(toRange.O(), ((d2n.Ml) RangesKt.coerceAtMost(d2n.Ml.rl(d2n.Ml.HI(toRange.O(), j2)), d2n.Ml.rl(toRange.nr().Uo().nr()))).Ik(), null));
    }
}
