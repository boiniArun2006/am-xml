package qu;

import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class Wre {
    public static final TFv.Wre t(I28 i28) {
        Intrinsics.checkNotNullParameter(i28, "<this>");
        return TFv.fuX.aYN(i28.rl());
    }

    public static final Object n(I28 i28, Continuation continuation) {
        return TFv.fuX.ViF(i28.rl(), continuation);
    }

    public static final Object rl(I28 i28, Continuation continuation) {
        return TFv.fuX.ViF(t(i28), continuation);
    }
}
