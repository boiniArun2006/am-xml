package TFv;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
class Ml extends teV.Ml {
    private final Function2 J2;

    public /* synthetic */ Ml(Function2 function2, CoroutineContext coroutineContext, int i2, ILs.j jVar, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(function2, (i3 & 2) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext, (i3 & 4) != 0 ? -2 : i2, (i3 & 8) != 0 ? ILs.j.f4185n : jVar);
    }

    static /* synthetic */ Object ck(Ml ml, ILs.s4 s4Var, Continuation continuation) {
        Object objInvoke = ml.J2.invoke(s4Var, continuation);
        return objInvoke == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvoke : Unit.INSTANCE;
    }

    @Override // teV.Ml
    protected teV.Ml gh(CoroutineContext coroutineContext, int i2, ILs.j jVar) {
        return new Ml(this.J2, coroutineContext, i2, jVar);
    }

    @Override // teV.Ml
    public String toString() {
        return "block[" + this.J2 + "] -> " + super.toString();
    }

    @Override // teV.Ml
    protected Object mUb(ILs.s4 s4Var, Continuation continuation) {
        return ck(this, s4Var, continuation);
    }

    public Ml(Function2 function2, CoroutineContext coroutineContext, int i2, ILs.j jVar) {
        super(coroutineContext, i2, jVar);
        this.J2 = function2;
    }
}
