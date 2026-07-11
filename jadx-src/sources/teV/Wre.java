package teV;

import GJW.qf;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class Wre extends Ml {
    protected final TFv.Wre J2;

    static final class j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f73618n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f73619t;

        j(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            j jVar = Wre.this.new j(continuation);
            jVar.f73619t = obj;
            return jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f73618n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                TFv.CN3 cn3 = (TFv.CN3) this.f73619t;
                Wre wre = Wre.this;
                this.f73618n = 1;
                if (wre.o(cn3, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TFv.CN3 cn3, Continuation continuation) {
            return ((j) create(cn3, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    protected abstract Object o(TFv.CN3 cn3, Continuation continuation);

    static /* synthetic */ Object Ik(Wre wre, ILs.s4 s4Var, Continuation continuation) {
        Object objO = wre.o(new Q(s4Var), continuation);
        return objO == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objO : Unit.INSTANCE;
    }

    static /* synthetic */ Object ck(Wre wre, TFv.CN3 cn3, Continuation continuation) {
        if (wre.f73609t == -3) {
            CoroutineContext context = continuation.getContext();
            CoroutineContext coroutineContextGh = qf.gh(context, wre.f73608n);
            if (Intrinsics.areEqual(coroutineContextGh, context)) {
                Object objO = wre.o(cn3, continuation);
                return objO == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objO : Unit.INSTANCE;
            }
            ContinuationInterceptor.Companion companion = ContinuationInterceptor.INSTANCE;
            if (Intrinsics.areEqual(coroutineContextGh.get(companion), context.get(companion))) {
                Object objR = wre.r(cn3, coroutineContextGh, continuation);
                return objR == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objR : Unit.INSTANCE;
            }
        }
        Object objN = super.n(cn3, continuation);
        return objN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objN : Unit.INSTANCE;
    }

    @Override // teV.Ml
    public String toString() {
        return this.J2 + " -> " + super.toString();
    }

    public Wre(TFv.Wre wre, CoroutineContext coroutineContext, int i2, ILs.j jVar) {
        super(coroutineContext, i2, jVar);
        this.J2 = wre;
    }

    private final Object r(TFv.CN3 cn3, CoroutineContext coroutineContext, Continuation continuation) {
        return I28.t(coroutineContext, I28.nr(cn3, continuation.getContext()), null, new j(null), continuation, 4, null);
    }

    @Override // teV.Ml
    protected Object mUb(ILs.s4 s4Var, Continuation continuation) {
        return Ik(this, s4Var, continuation);
    }

    @Override // teV.Ml, TFv.Wre
    public Object n(TFv.CN3 cn3, Continuation continuation) {
        return ck(this, cn3, continuation);
    }
}
