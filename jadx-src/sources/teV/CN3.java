package teV;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class CN3 extends Wre {
    public /* synthetic */ CN3(TFv.Wre wre, CoroutineContext coroutineContext, int i2, ILs.j jVar, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(wre, (i3 & 2) != 0 ? EmptyCoroutineContext.INSTANCE : coroutineContext, (i3 & 4) != 0 ? -3 : i2, (i3 & 8) != 0 ? ILs.j.f4185n : jVar);
    }

    @Override // teV.Ml
    protected Ml gh(CoroutineContext coroutineContext, int i2, ILs.j jVar) {
        return new CN3(this.J2, coroutineContext, i2, jVar);
    }

    @Override // teV.Wre
    protected Object o(TFv.CN3 cn3, Continuation continuation) {
        Object objN = this.J2.n(cn3, continuation);
        return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
    }

    @Override // teV.Ml
    public TFv.Wre qie() {
        return this.J2;
    }

    public CN3(TFv.Wre wre, CoroutineContext coroutineContext, int i2, ILs.j jVar) {
        super(wre, coroutineContext, i2, jVar);
    }
}
