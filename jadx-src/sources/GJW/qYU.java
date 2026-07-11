package GJW;

import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class qYU {

    static final class j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function0 f3502O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f3503n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f3504t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Function0 function0, Continuation continuation) {
            super(2, continuation);
            this.f3502O = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            j jVar = new j(this.f3502O, continuation);
            jVar.f3504t = obj;
            return jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f3503n == 0) {
                ResultKt.throwOnFailure(obj);
                return qYU.nr(((vd) this.f3504t).getCoroutineContext(), this.f3502O);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object nr(CoroutineContext coroutineContext, Function0 function0) throws Throwable {
        try {
            S s2 = new S();
            s2.te(AbstractC1363t.az(coroutineContext));
            try {
                return function0.invoke();
            } finally {
                s2.ViF();
            }
        } catch (InterruptedException e2) {
            throw new CancellationException("Blocking call was interrupted due to parent cancellation").initCause(e2);
        }
    }

    public static final Object rl(CoroutineContext coroutineContext, Function0 function0, Continuation continuation) {
        return Dsr.Uo(coroutineContext, new j(function0, null), continuation);
    }

    public static /* synthetic */ Object t(CoroutineContext coroutineContext, Function0 function0, Continuation continuation, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        return rl(coroutineContext, function0, continuation);
    }
}
