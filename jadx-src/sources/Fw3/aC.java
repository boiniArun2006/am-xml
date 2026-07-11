package Fw3;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class aC {
    public static final boolean n(Dsr dsr, Dsr value) {
        Intrinsics.checkNotNullParameter(dsr, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        return dsr.rl() >= value.rl() && dsr.t() >= value.t();
    }

    public static final Dsr rl(Dsr dsr, Dsr other) {
        Intrinsics.checkNotNullParameter(dsr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return new Dsr(RangesKt.coerceAtLeast(dsr.rl() - other.rl(), 0L), RangesKt.coerceAtLeast(dsr.t() - other.t(), 0));
    }

    public static final Dsr t(Dsr dsr, Dsr other) {
        Intrinsics.checkNotNullParameter(dsr, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        return new Dsr(dsr.rl() + other.rl(), dsr.t() + other.t());
    }
}
