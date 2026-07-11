package GJW;

import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DispatchException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class Sis extends TiW.fuX {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public int f3453O;

    public abstract Object KN();

    public Object O(Object obj) {
        return obj;
    }

    public void rl(Object obj, Throwable th) {
    }

    public abstract Continuation t();

    public final void Uo(Throwable th) {
        M.n(t().getContext(), new K("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public Throwable nr(Object obj) {
        Z z2 = obj instanceof Z ? (Z) obj : null;
        if (z2 != null) {
            return z2.f3468n;
        }
        return null;
    }

    public Sis(int i2) {
        this.f3453O = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OA oaAz;
        try {
            Continuation continuationT = t();
            Intrinsics.checkNotNull(continuationT, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            dzu.fuX fux = (dzu.fuX) continuationT;
            Continuation continuation = fux.f63567r;
            Object obj = fux.f63565Z;
            CoroutineContext context = continuation.getContext();
            Object objXMQ = dzu.M.xMQ(context, obj);
            xuv xuvVar = null;
            if (objXMQ != dzu.M.f63552n) {
                oaAz = qf.az(continuation, context, objXMQ);
            } else {
                oaAz = null;
            }
            try {
                CoroutineContext context2 = continuation.getContext();
                Object objKN = KN();
                Throwable thNr = nr(objKN);
                if (thNr == null && l4Z.rl(this.f3453O)) {
                    xuvVar = (xuv) context2.get(xuv.nr);
                }
                if (xuvVar != null && !xuvVar.isActive()) {
                    CancellationException cancellationException = xuvVar.getCancellationException();
                    rl(objKN, cancellationException);
                    Result.Companion companion = Result.INSTANCE;
                    continuation.resumeWith(Result.m313constructorimpl(ResultKt.createFailure(cancellationException)));
                } else if (thNr != null) {
                    Result.Companion companion2 = Result.INSTANCE;
                    continuation.resumeWith(Result.m313constructorimpl(ResultKt.createFailure(thNr)));
                } else {
                    Result.Companion companion3 = Result.INSTANCE;
                    continuation.resumeWith(Result.m313constructorimpl(O(objKN)));
                }
                Unit unit = Unit.INSTANCE;
                if (oaAz == null || oaAz.F()) {
                    dzu.M.J2(context, objXMQ);
                }
            } catch (Throwable th) {
                if (oaAz == null || oaAz.F()) {
                    dzu.M.J2(context, objXMQ);
                }
                throw th;
            }
        } catch (DispatchException e2) {
            M.n(t().getContext(), e2.getCause());
        } catch (Throwable th2) {
            Uo(th2);
        }
    }
}
