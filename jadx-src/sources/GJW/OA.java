package GJW;

import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class OA extends dzu.g9s {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final ThreadLocal f3438r;
    private volatile boolean threadLocalIsSet;

    public final void tFV(CoroutineContext coroutineContext, Object obj) {
        this.threadLocalIsSet = true;
        this.f3438r.set(TuplesKt.to(coroutineContext, obj));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public OA(CoroutineContext coroutineContext, Continuation continuation) {
        Mo mo = Mo.f3437n;
        super(coroutineContext.get(mo) == null ? coroutineContext.plus(mo) : coroutineContext, continuation);
        this.f3438r = new ThreadLocal();
        if (continuation.getContext().get(ContinuationInterceptor.INSTANCE) instanceof lej) {
            return;
        }
        Object objXMQ = dzu.M.xMQ(coroutineContext, null);
        dzu.M.J2(coroutineContext, objXMQ);
        tFV(coroutineContext, objXMQ);
    }

    private final void QZ6() {
        if (this.threadLocalIsSet) {
            Pair pair = (Pair) this.f3438r.get();
            if (pair != null) {
                dzu.M.J2((CoroutineContext) pair.component1(), pair.component2());
            }
            this.f3438r.remove();
        }
    }

    public final boolean F() {
        boolean z2 = this.threadLocalIsSet && this.f3438r.get() == null;
        this.f3438r.remove();
        return !z2;
    }

    @Override // dzu.g9s
    public void a63() {
        QZ6();
    }

    @Override // dzu.g9s, GJW.j
    protected void lLA(Object obj) {
        QZ6();
        Object objN = Ew.n(obj, this.J2);
        Continuation continuation = this.J2;
        CoroutineContext context = continuation.getContext();
        OA oaAz = null;
        Object objXMQ = dzu.M.xMQ(context, null);
        if (objXMQ != dzu.M.f63552n) {
            oaAz = qf.az(continuation, context, objXMQ);
        }
        try {
            this.J2.resumeWith(objN);
            Unit unit = Unit.INSTANCE;
            if (oaAz != null && !oaAz.F()) {
                return;
            }
            dzu.M.J2(context, objXMQ);
        } catch (Throwable th) {
            if (oaAz == null || oaAz.F()) {
                dzu.M.J2(context, objXMQ);
            }
            throw th;
        }
    }
}
