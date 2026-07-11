package hND;

import dzu.Dsr;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.DispatchException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class j {
    private static final void n(Continuation continuation, Throwable th) throws Throwable {
        if (th instanceof DispatchException) {
            th = ((DispatchException) th).getCause();
        }
        Result.Companion companion = Result.INSTANCE;
        continuation.resumeWith(Result.m313constructorimpl(ResultKt.createFailure(th)));
        throw th;
    }

    public static final void rl(Continuation continuation, Continuation continuation2) throws Throwable {
        try {
            Continuation continuationIntercepted = IntrinsicsKt.intercepted(continuation);
            Result.Companion companion = Result.INSTANCE;
            Dsr.rl(continuationIntercepted, Result.m313constructorimpl(Unit.INSTANCE));
        } catch (Throwable th) {
            n(continuation2, th);
        }
    }

    public static final void t(Function2 function2, Object obj, Continuation continuation) {
        try {
            Continuation continuationIntercepted = IntrinsicsKt.intercepted(IntrinsicsKt.createCoroutineUnintercepted(function2, obj, continuation));
            Result.Companion companion = Result.INSTANCE;
            Dsr.rl(continuationIntercepted, Result.m313constructorimpl(Unit.INSTANCE));
        } catch (Throwable th) {
            n(continuation, th);
        }
    }
}
