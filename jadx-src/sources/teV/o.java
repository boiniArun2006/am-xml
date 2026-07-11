package teV;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class o {
    public static final Object n(Function2 function2, Continuation continuation) {
        C c2 = new C(continuation.get$context(), continuation);
        Object objNr = hND.n.nr(c2, c2, function2);
        if (objNr == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objNr;
    }
}
