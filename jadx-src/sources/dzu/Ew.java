package dzu;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import t.C2366j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class Ew {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final StackTraceElement f63549n = new C2366j().n();
    private static final String rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final String f63550t;

    public static final Throwable n(Throwable th) {
        return th;
    }

    static {
        Object objM313constructorimpl;
        Object objM313constructorimpl2;
        try {
            Result.Companion companion = Result.INSTANCE;
            objM313constructorimpl = Result.m313constructorimpl(BaseContinuationImpl.class.getCanonicalName());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM313constructorimpl = Result.m313constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m316exceptionOrNullimpl(objM313constructorimpl) != null) {
            objM313constructorimpl = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        rl = (String) objM313constructorimpl;
        try {
            objM313constructorimpl2 = Result.m313constructorimpl(Ew.class.getCanonicalName());
        } catch (Throwable th2) {
            Result.Companion companion3 = Result.INSTANCE;
            objM313constructorimpl2 = Result.m313constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m316exceptionOrNullimpl(objM313constructorimpl2) != null) {
            objM313constructorimpl2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f63550t = (String) objM313constructorimpl2;
    }
}
