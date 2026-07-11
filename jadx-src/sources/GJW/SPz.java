package GJW;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
final class SPz extends L0y implements r {
    public SPz(xuv xuvVar) {
        super(true);
        Y(xuvVar);
    }

    @Override // GJW.L0y
    public boolean M7() {
        return true;
    }

    @Override // GJW.r
    public boolean n(Throwable th) {
        return m(new Z(th, false, 2, null));
    }

    @Override // GJW.P
    public Object await(Continuation continuation) throws Throwable {
        Object objWPU = WPU(continuation);
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return objWPU;
    }

    @Override // GJW.r
    public boolean eF(Object obj) {
        return m(obj);
    }

    @Override // GJW.P
    public Object getCompleted() {
        return rV9();
    }

    @Override // GJW.P
    public tj.w6 getOnAwait() {
        tj.w6 w6VarP5 = P5();
        Intrinsics.checkNotNull(w6VarP5, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectClause1<T of kotlinx.coroutines.CompletableDeferredImpl>");
        return w6VarP5;
    }
}
