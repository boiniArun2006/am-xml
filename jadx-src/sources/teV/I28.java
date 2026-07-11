package teV;

import dzu.M;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.TypeIntrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class I28 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final TFv.CN3 nr(TFv.CN3 cn3, CoroutineContext coroutineContext) {
        return ((cn3 instanceof Q) || (cn3 instanceof eO)) ? cn3 : new ci(cn3, coroutineContext);
    }

    public static /* synthetic */ Object t(CoroutineContext coroutineContext, Object obj, Object obj2, Function2 function2, Continuation continuation, int i2, Object obj3) {
        if ((i2 & 4) != 0) {
            obj2 = M.Uo(coroutineContext);
        }
        return rl(coroutineContext, obj, obj2, function2, continuation);
    }

    public static final Object rl(CoroutineContext coroutineContext, Object obj, Object obj2, Function2 function2, Continuation continuation) {
        Object objInvoke;
        Object objXMQ = M.xMQ(coroutineContext, obj2);
        try {
            r rVar = new r(continuation, coroutineContext);
            if (!(function2 instanceof BaseContinuationImpl)) {
                objInvoke = IntrinsicsKt.wrapWithContinuationImpl(function2, obj, rVar);
            } else {
                objInvoke = ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(obj, rVar);
            }
            M.J2(coroutineContext, objXMQ);
            if (objInvoke == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(continuation);
            }
            return objInvoke;
        } catch (Throwable th) {
            M.J2(coroutineContext, objXMQ);
            throw th;
        }
    }
}
