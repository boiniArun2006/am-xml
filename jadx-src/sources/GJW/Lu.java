package GJW;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class Lu {
    public static final Object J2(Function2 function2, Continuation continuation) {
        dzu.g9s g9sVar = new dzu.g9s(continuation.get$context(), continuation);
        Object objNr = hND.n.nr(g9sVar, g9sVar, function2);
        if (objNr == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objNr;
    }

    public static /* synthetic */ void O(vd vdVar, CancellationException cancellationException, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            cancellationException = null;
        }
        nr(vdVar, cancellationException);
    }

    public static final vd n(CoroutineContext coroutineContext) {
        if (coroutineContext.get(xuv.nr) == null) {
            coroutineContext = coroutineContext.plus(cA.rl(null, 1, null));
        }
        return new dzu.I28(coroutineContext);
    }

    public static final vd rl() {
        return new dzu.I28(N.rl(null, 1, null).plus(OU.t()));
    }

    public static final vd xMQ(vd vdVar, CoroutineContext coroutineContext) {
        return new dzu.I28(vdVar.getCoroutineContext().plus(coroutineContext));
    }

    public static final boolean KN(vd vdVar) {
        xuv xuvVar = (xuv) vdVar.getCoroutineContext().get(xuv.nr);
        if (xuvVar != null) {
            return xuvVar.isActive();
        }
        return true;
    }

    public static final void Uo(vd vdVar) {
        AbstractC1363t.qie(vdVar.getCoroutineContext());
    }

    public static final void nr(vd vdVar, CancellationException cancellationException) {
        xuv xuvVar = (xuv) vdVar.getCoroutineContext().get(xuv.nr);
        if (xuvVar != null) {
            xuvVar.cancel(cancellationException);
            return;
        }
        throw new IllegalStateException(("Scope cannot be cancelled because it does not have a job: " + vdVar).toString());
    }

    public static final void t(vd vdVar, String str, Throwable th) {
        nr(vdVar, YzO.n(str, th));
    }
}
