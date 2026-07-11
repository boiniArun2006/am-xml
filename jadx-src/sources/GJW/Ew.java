package GJW;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class Ew {
    public static final Object n(Object obj, Continuation continuation) {
        if (!(obj instanceof Z)) {
            return Result.m313constructorimpl(obj);
        }
        Result.Companion companion = Result.INSTANCE;
        return Result.m313constructorimpl(ResultKt.createFailure(((Z) obj).f3468n));
    }

    public static final Object rl(Object obj) {
        Throwable thM316exceptionOrNullimpl = Result.m316exceptionOrNullimpl(obj);
        if (thM316exceptionOrNullimpl == null) {
            return obj;
        }
        return new Z(thM316exceptionOrNullimpl, false, 2, null);
    }

    public static final Object t(Object obj, Pl pl) {
        Throwable thM316exceptionOrNullimpl = Result.m316exceptionOrNullimpl(obj);
        if (thM316exceptionOrNullimpl == null) {
            return obj;
        }
        return new Z(thM316exceptionOrNullimpl, false, 2, null);
    }
}
