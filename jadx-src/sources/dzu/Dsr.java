package dzu;

import GJW.KH;
import GJW.OA;
import GJW.Y5;
import GJW.xuv;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.DispatchException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class Dsr {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final nKK f63548n = new nKK("UNDEFINED");
    public static final nKK rl = new nKK("REUSABLE_CLAIMED");

    public static final boolean O(fuX fux) {
        Unit unit = Unit.INSTANCE;
        KH khRl = Y5.f3467n.rl();
        if (khRl.UF()) {
            return false;
        }
        if (khRl.HBN()) {
            fux.f63566o = unit;
            fux.f3453O = 1;
            khRl.Uf(fux);
            return true;
        }
        khRl.ub(true);
        try {
            fux.run();
            do {
            } while (khRl.Zmq());
        } finally {
            try {
            } finally {
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008e A[Catch: all -> 0x0067, DONT_GENERATE, TryCatch #0 {all -> 0x0067, blocks: (B:11:0x003e, B:13:0x004c, B:15:0x0052, B:28:0x0091, B:18:0x0069, B:20:0x0079, B:25:0x0088, B:27:0x008e, B:33:0x009e, B:36:0x00a7, B:35:0x00a4, B:23:0x007f), top: B:45:0x003e, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void rl(Continuation continuation, Object obj) {
        xuv xuvVar;
        if (!(continuation instanceof fuX)) {
            continuation.resumeWith(obj);
            return;
        }
        fuX fux = (fuX) continuation;
        Object objRl = GJW.Ew.rl(obj);
        if (nr(fux.J2, fux.getContext())) {
            fux.f63566o = objRl;
            fux.f3453O = 1;
            t(fux.J2, fux.getContext(), fux);
            return;
        }
        KH khRl = Y5.f3467n.rl();
        if (khRl.HBN()) {
            fux.f63566o = objRl;
            fux.f3453O = 1;
            khRl.Uf(fux);
            return;
        }
        khRl.ub(true);
        try {
            xuvVar = (xuv) fux.getContext().get(xuv.nr);
        } finally {
            try {
            } finally {
            }
        }
        if (xuvVar == null || xuvVar.isActive()) {
            Continuation continuation2 = fux.f63567r;
            Object obj2 = fux.f63565Z;
            CoroutineContext context = continuation2.getContext();
            Object objXMQ = M.xMQ(context, obj2);
            OA oaAz = objXMQ != M.f63552n ? GJW.qf.az(continuation2, context, objXMQ) : null;
            try {
                fux.f63567r.resumeWith(obj);
                Unit unit = Unit.INSTANCE;
            } finally {
                if (oaAz == null || oaAz.F()) {
                    M.J2(context, objXMQ);
                }
            }
        }
        CancellationException cancellationException = xuvVar.getCancellationException();
        fux.rl(objRl, cancellationException);
        Result.Companion companion = Result.INSTANCE;
        fux.resumeWith(Result.m313constructorimpl(ResultKt.createFailure(cancellationException)));
        while (khRl.Zmq()) {
        }
    }

    public static final boolean nr(GJW.lej lejVar, CoroutineContext coroutineContext) throws DispatchException {
        try {
            return lejVar.Org(coroutineContext);
        } catch (Throwable th) {
            throw new DispatchException(th, lejVar, coroutineContext);
        }
    }

    public static final void t(GJW.lej lejVar, CoroutineContext coroutineContext, Runnable runnable) {
        try {
            lejVar.n1(coroutineContext, runnable);
        } catch (Throwable th) {
            throw new DispatchException(th, lejVar, coroutineContext);
        }
    }
}
