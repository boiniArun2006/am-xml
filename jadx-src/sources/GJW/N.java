package GJW;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class N {
    public static final g9s n(xuv xuvVar) {
        return new Pp(xuvVar);
    }

    public static /* synthetic */ g9s rl(xuv xuvVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            xuvVar = null;
        }
        return n(xuvVar);
    }

    public static final Object t(Function2 function2, Continuation continuation) {
        i iVar = new i(continuation.get$context(), continuation);
        Object objNr = hND.n.nr(iVar, iVar, function2);
        if (objNr == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objNr;
    }
}
