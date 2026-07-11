package uW;

import GJW.vd;
import androidx.view.Lifecycle;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class Wre extends SuspendLambda implements Function2 {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ Lifecycle f74425O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f74426n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ w6 f74427t;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(vd vdVar, Continuation continuation) {
        return ((Wre) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Wre(w6 w6Var, Lifecycle lifecycle, Continuation continuation) {
        super(2, continuation);
        this.f74427t = w6Var;
        this.f74425O = lifecycle;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new Wre(this.f74427t, this.f74425O, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.f74426n == 0) {
            ResultKt.throwOnFailure(obj);
            this.f74427t.KN(this.f74425O);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
