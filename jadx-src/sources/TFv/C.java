package TFv;

import GJW.xuv;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
abstract /* synthetic */ class C {

    static final class j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f10249n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Wre f10250t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GJW.vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Wre wre, Continuation continuation) {
            super(2, continuation);
            this.f10250t = wre;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new j(this.f10250t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f10249n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                Wre wre = this.f10250t;
                this.f10249n = 1;
                if (fuX.mUb(wre, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public static final Object n(Wre wre, Continuation continuation) {
        Object objN = wre.n(teV.eO.f73632n, continuation);
        return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
    }

    public static final xuv nr(Wre wre, GJW.vd vdVar) {
        return GJW.C.nr(vdVar, null, null, new j(wre, null), 3, null);
    }

    public static final Object rl(Wre wre, Function2 function2, Continuation continuation) {
        Object objMUb = fuX.mUb(o.rl(fuX.N(wre, function2), 0, null, 2, null), continuation);
        if (objMUb == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objMUb;
        }
        return Unit.INSTANCE;
    }

    public static final Object t(CN3 cn3, Wre wre, Continuation continuation) {
        fuX.WPU(cn3);
        Object objN = wre.n(cn3, continuation);
        if (objN == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objN;
        }
        return Unit.INSTANCE;
    }
}
