package JK;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class I28 {
    public static final Ml n(w6 w6Var, long j2) {
        Intrinsics.checkNotNullParameter(w6Var, "<this>");
        return new Ml(w6Var.rl(), w6Var.n(), j2);
    }

    public static final String rl(Ml ml) {
        Intrinsics.checkNotNullParameter(ml, "<this>");
        return ml.t() + " : " + ml.rl();
    }
}
