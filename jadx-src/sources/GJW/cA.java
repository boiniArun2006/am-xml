package GJW;

import GJW.xuv;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.sequences.Sequence;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract /* synthetic */ class cA {

    /* synthetic */ class j extends FunctionReferenceImpl implements Function1 {
        j(Object obj) {
            super(1, obj, g9.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n((Throwable) obj);
            return Unit.INSTANCE;
        }

        public final void n(Throwable th) {
            ((g9) this.receiver).WPU(th);
        }
    }

    public static /* synthetic */ O HI(xuv xuvVar, boolean z2, g9 g9Var, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z2 = true;
        }
        return AbstractC1363t.ty(xuvVar, z2, g9Var);
    }

    public static final Object Uo(xuv xuvVar, Continuation continuation) {
        xuv.j.rl(xuvVar, null, 1, null);
        Object objJoin = xuvVar.join(continuation);
        return objJoin == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objJoin : Unit.INSTANCE;
    }

    public static /* synthetic */ void J2(CoroutineContext coroutineContext, CancellationException cancellationException, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            cancellationException = null;
        }
        AbstractC1363t.nr(coroutineContext, cancellationException);
    }

    public static final void KN(CoroutineContext coroutineContext, CancellationException cancellationException) {
        Sequence children;
        xuv xuvVar = (xuv) coroutineContext.get(xuv.nr);
        if (xuvVar == null || (children = xuvVar.getChildren()) == null) {
            return;
        }
        Iterator it = children.iterator();
        while (it.hasNext()) {
            ((xuv) it.next()).cancel(cancellationException);
        }
    }

    public static /* synthetic */ void O(xuv xuvVar, String str, Throwable th, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            th = null;
        }
        AbstractC1363t.t(xuvVar, str, th);
    }

    public static final xuv az(CoroutineContext coroutineContext) {
        xuv xuvVar = (xuv) coroutineContext.get(xuv.nr);
        if (xuvVar != null) {
            return xuvVar;
        }
        throw new IllegalStateException(("Current context doesn't contain Job in it: " + coroutineContext).toString());
    }

    public static final boolean ck(CoroutineContext coroutineContext) {
        xuv xuvVar = (xuv) coroutineContext.get(xuv.nr);
        if (xuvVar != null) {
            return xuvVar.isActive();
        }
        return true;
    }

    public static final O mUb(xuv xuvVar, O o2) {
        return HI(xuvVar, false, new gnv(o2), 1, null);
    }

    public static final g9s n(xuv xuvVar) {
        return new c7r(xuvVar);
    }

    public static final void nr(CoroutineContext coroutineContext, CancellationException cancellationException) {
        xuv xuvVar = (xuv) coroutineContext.get(xuv.nr);
        if (xuvVar != null) {
            xuvVar.cancel(cancellationException);
        }
    }

    public static final void qie(CoroutineContext coroutineContext) {
        xuv xuvVar = (xuv) coroutineContext.get(xuv.nr);
        if (xuvVar != null) {
            AbstractC1363t.gh(xuvVar);
        }
    }

    public static /* synthetic */ g9s rl(xuv xuvVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            xuvVar = null;
        }
        return AbstractC1363t.n(xuvVar);
    }

    public static final O ty(xuv xuvVar, boolean z2, g9 g9Var) {
        return xuvVar instanceof L0y ? ((L0y) xuvVar).k(z2, g9Var) : xuvVar.invokeOnCompletion(g9Var.S(), z2, new j(g9Var));
    }

    public static /* synthetic */ void xMQ(CoroutineContext coroutineContext, CancellationException cancellationException, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            cancellationException = null;
        }
        AbstractC1363t.KN(coroutineContext, cancellationException);
    }

    public static final void gh(xuv xuvVar) {
        if (xuvVar.isActive()) {
        } else {
            throw xuvVar.getCancellationException();
        }
    }

    public static final void t(xuv xuvVar, String str, Throwable th) {
        xuvVar.cancel(YzO.n(str, th));
    }
}
