package hND;

import GJW.CM;
import GJW.Z;
import dzu.M;
import dzu.g9s;
import kotlin.KotlinNothingValueException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class n {
    private static final Object J2(g9s g9sVar, boolean z2, Object obj, Function2 function2) throws Throwable {
        Object z3;
        try {
            z3 = !(function2 instanceof BaseContinuationImpl) ? IntrinsicsKt.wrapWithContinuationImpl(function2, obj, g9sVar) : ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(obj, g9sVar);
        } catch (DispatchException e2) {
            n(g9sVar, e2);
            throw new KotlinNothingValueException();
        } catch (Throwable th) {
            z3 = new Z(th, false, 2, null);
        }
        if (z3 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return IntrinsicsKt.getCOROUTINE_SUSPENDED();
        }
        Object objETf = g9sVar.eTf(z3);
        if (objETf == CM.rl) {
            return IntrinsicsKt.getCOROUTINE_SUSPENDED();
        }
        g9sVar.a63();
        if (!(objETf instanceof Z)) {
            return CM.KN(objETf);
        }
        if (z2 || rl(g9sVar, ((Z) objETf).f3468n)) {
            throw ((Z) objETf).f3468n;
        }
        if (z3 instanceof Z) {
            throw ((Z) z3).f3468n;
        }
        return z3;
    }

    public static final Object O(g9s g9sVar, Object obj, Function2 function2) {
        return J2(g9sVar, false, obj, function2);
    }

    public static final Object nr(g9s g9sVar, Object obj, Function2 function2) {
        return J2(g9sVar, true, obj, function2);
    }

    private static final Void n(g9s g9sVar, DispatchException dispatchException) throws Throwable {
        g9sVar.m(new Z(dispatchException.getCause(), false, 2, null));
        throw dispatchException.getCause();
    }

    private static final boolean rl(g9s g9sVar, Throwable th) {
        return ((th instanceof TimeoutCancellationException) && ((TimeoutCancellationException) th).coroutine == g9sVar) ? false : true;
    }

    public static final void t(Function2 function2, Object obj, Continuation continuation) {
        Object objInvoke;
        Continuation continuationProbeCoroutineCreated = DebugProbesKt.probeCoroutineCreated(continuation);
        try {
            CoroutineContext context = continuationProbeCoroutineCreated.get$context();
            Object objXMQ = M.xMQ(context, null);
            try {
                DebugProbesKt.probeCoroutineResumed(continuationProbeCoroutineCreated);
                if (!(function2 instanceof BaseContinuationImpl)) {
                    objInvoke = IntrinsicsKt.wrapWithContinuationImpl(function2, obj, continuationProbeCoroutineCreated);
                } else {
                    objInvoke = ((Function2) TypeIntrinsics.beforeCheckcastToFunctionOfArity(function2, 2)).invoke(obj, continuationProbeCoroutineCreated);
                }
                M.J2(context, objXMQ);
                if (objInvoke != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    continuationProbeCoroutineCreated.resumeWith(Result.m313constructorimpl(objInvoke));
                }
            } catch (Throwable th) {
                M.J2(context, objXMQ);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            if (th instanceof DispatchException) {
                th = ((DispatchException) th).getCause();
            }
            Result.Companion companion = Result.INSTANCE;
            continuationProbeCoroutineCreated.resumeWith(Result.m313constructorimpl(ResultKt.createFailure(th)));
        }
    }
}
