package fE;

import fE.Pl;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class Xo {
    public static final YV.fuX n(Pl pl) {
        Intrinsics.checkNotNullParameter(pl, "<this>");
        if (pl instanceof Pl.n) {
            return YV.fuX.f12140n;
        }
        if (pl instanceof Pl.j) {
            return YV.fuX.f12139O;
        }
        if (Intrinsics.areEqual(pl, Pl.w6.f66644n)) {
            return YV.fuX.f12142t;
        }
        throw new NoWhenBranchMatchedException();
    }
}
