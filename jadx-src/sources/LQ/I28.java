package LQ;

import LQ.j;
import com.bendingspoons.fellini.utils.either.UnhandledFailureException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public abstract class I28 {

    public static final class j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ n f6073O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f6074n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f6075t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(n nVar, Continuation continuation) {
            super(2, continuation);
            this.f6073O = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            j jVar = new j(this.f6073O, continuation);
            jVar.f6075t = obj;
            return jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws UnhandledFailureException {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f6074n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                TFv.CN3 cn3 = (TFv.CN3) this.f6075t;
                n nVar = this.f6073O;
                this.f6075t = cn3;
                this.f6074n = 1;
                obj = nVar.n(cn3, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            LQ.j jVar = (LQ.j) obj;
            if (!(jVar instanceof j.n)) {
                boolean z2 = jVar instanceof j.w6;
                return Unit.INSTANCE;
            }
            throw new UnhandledFailureException(((j.n) jVar).n());
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TFv.CN3 cn3, Continuation continuation) {
            return ((j) create(cn3, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final TFv.Wre n(n nVar) {
        Intrinsics.checkNotNullParameter(nVar, "<this>");
        return TFv.fuX.iF(new j(nVar, null));
    }
}
