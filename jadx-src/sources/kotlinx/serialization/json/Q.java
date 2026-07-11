package kotlinx.serialization.json;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class Q {
    public static final n n(n from, Function1 builderAction) {
        Intrinsics.checkNotNullParameter(from, "from");
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        I28 i28 = new I28(from);
        builderAction.invoke(i28);
        return new UGc(i28.n(), i28.rl());
    }

    public static /* synthetic */ n rl(n nVar, Function1 function1, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            nVar = n.nr;
        }
        return n(nVar, function1);
    }
}
