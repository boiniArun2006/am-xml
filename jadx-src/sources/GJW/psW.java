package GJW;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class psW {
    public static final String t(Continuation continuation) {
        Object objM313constructorimpl;
        if (continuation instanceof dzu.fuX) {
            return ((dzu.fuX) continuation).toString();
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            objM313constructorimpl = Result.m313constructorimpl(continuation + '@' + rl(continuation));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM313constructorimpl = Result.m313constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m316exceptionOrNullimpl(objM313constructorimpl) != null) {
            objM313constructorimpl = continuation.getClass().getName() + '@' + rl(continuation);
        }
        return (String) objM313constructorimpl;
    }

    public static final String n(Object obj) {
        return obj.getClass().getSimpleName();
    }

    public static final String rl(Object obj) {
        return Integer.toHexString(System.identityHashCode(obj));
    }
}
