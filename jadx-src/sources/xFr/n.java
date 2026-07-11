package xFr;

import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public abstract class n {
    public static final void n(Continuation continuation, Object obj) {
        Intrinsics.checkNotNullParameter(continuation, "<this>");
        try {
            continuation.resumeWith(Result.m313constructorimpl(obj));
        } catch (IllegalStateException unused) {
        }
    }

    public static final void rl(Continuation continuation, Object obj) {
        Intrinsics.checkNotNullParameter(continuation, "<this>");
        n(continuation, new n.C1266n(obj));
    }

    public static final void t(Continuation continuation, Object obj) {
        Intrinsics.checkNotNullParameter(continuation, "<this>");
        n(continuation, new n.w6(obj));
    }
}
