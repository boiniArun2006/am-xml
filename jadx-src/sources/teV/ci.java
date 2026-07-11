package teV;

import dzu.M;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
final class ci implements TFv.CN3 {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Function2 f73626O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final CoroutineContext f73627n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Object f73628t;

    static final class j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ TFv.CN3 f73629O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f73630n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f73631t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(TFv.CN3 cn3, Continuation continuation) {
            super(2, continuation);
            this.f73629O = cn3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            j jVar = new j(this.f73629O, continuation);
            jVar.f73631t = obj;
            return jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f73630n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                Object obj2 = this.f73631t;
                TFv.CN3 cn3 = this.f73629O;
                this.f73630n = 1;
                if (cn3.rl(obj2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, Continuation continuation) {
            return ((j) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // TFv.CN3
    public Object rl(Object obj, Continuation continuation) {
        Object objRl = I28.rl(this.f73627n, obj, this.f73628t, this.f73626O, continuation);
        return objRl == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objRl : Unit.INSTANCE;
    }

    public ci(TFv.CN3 cn3, CoroutineContext coroutineContext) {
        this.f73627n = coroutineContext;
        this.f73628t = M.Uo(coroutineContext);
        this.f73626O = new j(cn3, null);
    }
}
