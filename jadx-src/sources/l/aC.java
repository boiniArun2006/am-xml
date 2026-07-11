package l;

import kotlin.jvm.internal.Intrinsics;
import l.Xo;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public abstract class aC {
    public static final Xo n(C c2) {
        Intrinsics.checkNotNullParameter(c2, "<this>");
        return (c2.nr() == null || c2.O() == null) ? Xo.j.f70376n : new Xo.n(c2.O(), c2.nr().floatValue());
    }
}
