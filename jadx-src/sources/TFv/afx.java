package TFv;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
final class afx extends j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Function2 f10378n;

    @Override // TFv.j
    public Object J2(CN3 cn3, Continuation continuation) {
        Object objInvoke = this.f10378n.invoke(cn3, continuation);
        return objInvoke == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvoke : Unit.INSTANCE;
    }

    public afx(Function2 function2) {
        this.f10378n = function2;
    }
}
