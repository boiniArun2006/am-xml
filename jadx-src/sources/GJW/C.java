package GJW;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract /* synthetic */ class C {
    public static /* synthetic */ xuv nr(vd vdVar, CoroutineContext coroutineContext, h hVar, Function2 function2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            hVar = h.f3486n;
        }
        return Dsr.t(vdVar, coroutineContext, hVar, function2);
    }

    public static /* synthetic */ P rl(vd vdVar, CoroutineContext coroutineContext, h hVar, Function2 function2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i2 & 2) != 0) {
            hVar = h.f3486n;
        }
        return Dsr.n(vdVar, coroutineContext, hVar, function2);
    }

    public static final Object O(CoroutineContext coroutineContext, Function2 function2, Continuation continuation) {
        Object objF;
        CoroutineContext context = continuation.get$context();
        CoroutineContext coroutineContextGh = qf.gh(context, coroutineContext);
        AbstractC1363t.qie(coroutineContextGh);
        if (coroutineContextGh == context) {
            dzu.g9s g9sVar = new dzu.g9s(coroutineContextGh, continuation);
            objF = hND.n.nr(g9sVar, g9sVar, function2);
        } else {
            ContinuationInterceptor.Companion key = ContinuationInterceptor.INSTANCE;
            if (Intrinsics.areEqual(coroutineContextGh.get(key), context.get(key))) {
                OA oa = new OA(coroutineContextGh, continuation);
                CoroutineContext context2 = oa.get$context();
                Object objXMQ = dzu.M.xMQ(context2, null);
                try {
                    Object objNr = hND.n.nr(oa, oa, function2);
                    dzu.M.J2(context2, objXMQ);
                    objF = objNr;
                } catch (Throwable th) {
                    dzu.M.J2(context2, objXMQ);
                    throw th;
                }
            } else {
                pO pOVar = new pO(coroutineContextGh, continuation);
                hND.j.t(function2, pOVar, pOVar);
                objF = pOVar.F();
            }
        }
        if (objF == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objF;
    }

    public static final P n(vd vdVar, CoroutineContext coroutineContext, h hVar, Function2 function2) {
        C1359m c1359m;
        CoroutineContext coroutineContextMUb = qf.mUb(vdVar, coroutineContext);
        if (hVar.t()) {
            c1359m = new crp(coroutineContextMUb, function2);
        } else {
            c1359m = new C1359m(coroutineContextMUb, true);
        }
        c1359m.RQ(hVar, c1359m, function2);
        return c1359m;
    }

    public static final xuv t(vd vdVar, CoroutineContext coroutineContext, h hVar, Function2 function2) {
        mrQ mrq;
        CoroutineContext coroutineContextMUb = qf.mUb(vdVar, coroutineContext);
        if (hVar.t()) {
            mrq = new Ogx(coroutineContextMUb, function2);
        } else {
            mrq = new mrQ(coroutineContextMUb, true);
        }
        mrq.RQ(hVar, mrq, function2);
        return mrq;
    }
}
