package GJW;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public abstract class l4Z {
    public static final boolean rl(int i2) {
        return i2 == 1 || i2 == 2;
    }

    public static final boolean t(int i2) {
        return i2 == 2;
    }

    private static final void O(Sis sis) {
        KH khRl = Y5.f3467n.rl();
        if (khRl.HBN()) {
            khRl.Uf(sis);
            return;
        }
        khRl.ub(true);
        try {
            nr(sis, sis.t(), true);
            do {
            } while (khRl.Zmq());
        } finally {
            try {
            } finally {
            }
        }
    }

    public static final void n(Sis sis, int i2) {
        boolean z2;
        Continuation continuationT = sis.t();
        if (i2 == 4) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 && (continuationT instanceof dzu.fuX) && rl(i2) == rl(sis.f3453O)) {
            dzu.fuX fux = (dzu.fuX) continuationT;
            lej lejVar = fux.J2;
            CoroutineContext context = fux.getContext();
            if (dzu.Dsr.nr(lejVar, context)) {
                dzu.Dsr.t(lejVar, context, sis);
                return;
            } else {
                O(sis);
                return;
            }
        }
        nr(sis, continuationT, z2);
    }

    public static final void nr(Sis sis, Continuation continuation, boolean z2) {
        Object objO;
        OA oaAz;
        Object objKN = sis.KN();
        Throwable thNr = sis.nr(objKN);
        if (thNr != null) {
            Result.Companion companion = Result.INSTANCE;
            objO = ResultKt.createFailure(thNr);
        } else {
            Result.Companion companion2 = Result.INSTANCE;
            objO = sis.O(objKN);
        }
        Object objM313constructorimpl = Result.m313constructorimpl(objO);
        if (z2) {
            Intrinsics.checkNotNull(continuation, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTaskKt.resume>");
            dzu.fuX fux = (dzu.fuX) continuation;
            Continuation continuation2 = fux.f63567r;
            Object obj = fux.f63565Z;
            CoroutineContext context = continuation2.getContext();
            Object objXMQ = dzu.M.xMQ(context, obj);
            if (objXMQ != dzu.M.f63552n) {
                oaAz = qf.az(continuation2, context, objXMQ);
            } else {
                oaAz = null;
            }
            try {
                fux.f63567r.resumeWith(objM313constructorimpl);
                Unit unit = Unit.INSTANCE;
                if (oaAz != null && !oaAz.F()) {
                    return;
                }
                dzu.M.J2(context, objXMQ);
                return;
            } catch (Throwable th) {
                if (oaAz == null || oaAz.F()) {
                    dzu.M.J2(context, objXMQ);
                }
                throw th;
            }
        }
        continuation.resumeWith(objM313constructorimpl);
    }
}
