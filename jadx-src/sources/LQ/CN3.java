package LQ;

import LQ.j;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public interface CN3 {

    public static final class j {

        /* JADX INFO: renamed from: LQ.CN3$j$j, reason: collision with other inner class name */
        public static final class C0206j extends SuspendLambda implements Function2 {
            final /* synthetic */ CN3 J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ n f6070O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f6071n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private /* synthetic */ Object f6072t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0206j(n nVar, Continuation continuation, CN3 cn3) {
                super(2, continuation);
                this.f6070O = nVar;
                this.J2 = cn3;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                C0206j c0206j = new C0206j(this.f6070O, continuation, this.J2);
                c0206j.f6072t = obj;
                return c0206j;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f6071n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    TFv.CN3 cn3 = (TFv.CN3) this.f6072t;
                    n nVar = this.f6070O;
                    this.f6072t = cn3;
                    this.f6071n = 1;
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
                this.J2.n(((j.n) jVar).n());
                throw new KotlinNothingValueException();
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(TFv.CN3 cn3, Continuation continuation) {
                return ((C0206j) create(cn3, continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        public static TFv.Wre n(CN3 cn3, n receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            return TFv.fuX.iF(new C0206j(receiver, null, cn3));
        }

        public static Object rl(CN3 cn3, LQ.j receiver) {
            Intrinsics.checkNotNullParameter(receiver, "$receiver");
            if (receiver instanceof j.n) {
                cn3.n(((j.n) receiver).n());
                throw new KotlinNothingValueException();
            }
            if (receiver instanceof j.w6) {
                return ((j.w6) receiver).n();
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    TFv.Wre J2(n nVar);

    Object O(LQ.j jVar);

    Void n(Object obj);
}
