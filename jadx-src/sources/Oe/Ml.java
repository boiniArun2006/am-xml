package Oe;

import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class Ml {
    public static /* synthetic */ long O(w6 w6Var, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = 4;
        }
        return nr(w6Var, i2);
    }

    public static final boolean n(w6 w6Var, w6 value) {
        Intrinsics.checkNotNullParameter(w6Var, "<this>");
        Intrinsics.checkNotNullParameter(value, "value");
        return w6Var.t() >= value.t() && w6Var.rl() >= value.rl();
    }

    public static final long nr(w6 w6Var, int i2) {
        Intrinsics.checkNotNullParameter(w6Var, "<this>");
        return ((long) w6Var.t()) * ((long) w6Var.rl()) * ((long) i2);
    }

    public static final w6 rl(w6 w6Var, int i2) {
        Intrinsics.checkNotNullParameter(w6Var, "<this>");
        return new w6(RangesKt.coerceAtLeast(w6Var.t() / i2, 1), RangesKt.coerceAtLeast(w6Var.rl() / i2, 1));
    }

    public static final w6 t(w6 w6Var) {
        Intrinsics.checkNotNullParameter(w6Var, "<this>");
        return new w6(w6Var.rl(), w6Var.t());
    }
}
