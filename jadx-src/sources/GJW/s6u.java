package GJW;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public abstract class s6u {
    public static final Object n(Continuation continuation) {
        dzu.fuX fux;
        Object coroutine_suspended;
        CoroutineContext context = continuation.getContext();
        AbstractC1363t.qie(context);
        Continuation continuationIntercepted = IntrinsicsKt.intercepted(continuation);
        if (continuationIntercepted instanceof dzu.fuX) {
            fux = (dzu.fuX) continuationIntercepted;
        } else {
            fux = null;
        }
        if (fux == null) {
            coroutine_suspended = Unit.INSTANCE;
        } else {
            if (dzu.Dsr.nr(fux.J2, context)) {
                fux.gh(context, Unit.INSTANCE);
            } else {
                VoU voU = new VoU();
                CoroutineContext coroutineContextPlus = context.plus(voU);
                Unit unit = Unit.INSTANCE;
                fux.gh(coroutineContextPlus, unit);
                if (!voU.f3458n || dzu.Dsr.O(fux)) {
                    coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                } else {
                    coroutine_suspended = unit;
                }
            }
            coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        }
        if (coroutine_suspended == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        if (coroutine_suspended == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return coroutine_suspended;
        }
        return Unit.INSTANCE;
    }
}
