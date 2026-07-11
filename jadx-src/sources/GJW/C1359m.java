package GJW;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: renamed from: GJW.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
class C1359m extends j implements P {
    public C1359m(CoroutineContext coroutineContext, boolean z2) {
        super(coroutineContext, true, z2);
    }

    static /* synthetic */ Object a63(C1359m c1359m, Continuation continuation) throws Throwable {
        Object objWPU = c1359m.WPU(continuation);
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        return objWPU;
    }

    @Override // GJW.P
    public Object await(Continuation continuation) {
        return a63(this, continuation);
    }

    @Override // GJW.P
    public Object getCompleted() {
        return rV9();
    }
}
