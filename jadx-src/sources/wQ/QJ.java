package wQ;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class QJ {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f74929n;
    private final Function2 rl;

    static final class j implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Continuation f74930n;

        j(Continuation continuation) {
            this.f74930n = continuation;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n(((Result) obj).getValue());
            return Unit.INSTANCE;
        }

        public final void n(Object obj) {
            Object obj2;
            if (Result.m319isFailureimpl(obj)) {
                obj2 = null;
            } else {
                obj2 = obj;
            }
            if (obj2 != null) {
                this.f74930n.resumeWith(Result.m313constructorimpl(new n.w6(obj2)));
                return;
            }
            Continuation continuation = this.f74930n;
            Object objM316exceptionOrNullimpl = Result.m316exceptionOrNullimpl(obj);
            if (objM316exceptionOrNullimpl == null) {
                objM316exceptionOrNullimpl = new Exception("unknown");
            }
            continuation.resumeWith(Result.m313constructorimpl(new n.C1266n(objM316exceptionOrNullimpl)));
        }
    }

    public QJ(String name, Function2 typedCall) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(typedCall, "typedCall");
        this.f74929n = name;
        this.rl = typedCall;
    }

    public final Object n(Object obj, Continuation continuation) {
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        try {
            this.rl.invoke(obj, new j(safeContinuation));
        } catch (Throwable th) {
            Result.Companion companion = Result.INSTANCE;
            safeContinuation.resumeWith(Result.m313constructorimpl(new n.C1266n(th)));
        }
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    public final void rl(Object obj, Function1 cb2) {
        Intrinsics.checkNotNullParameter(cb2, "cb");
        this.rl.invoke(obj, cb2);
    }
}
