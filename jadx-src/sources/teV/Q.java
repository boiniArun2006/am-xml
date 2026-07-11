package teV;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class Q implements TFv.CN3 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ILs.r f73616n;

    @Override // TFv.CN3
    public Object rl(Object obj, Continuation continuation) {
        Object objMUb = this.f73616n.mUb(obj, continuation);
        return objMUb == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMUb : Unit.INSTANCE;
    }

    public Q(ILs.r rVar) {
        this.f73616n = rVar;
    }
}
