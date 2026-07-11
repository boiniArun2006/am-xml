package td9;

import GJW.OU;
import GJW.RzR;
import QmE.iF;
import android.content.Context;
import ga6.j;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class Ml implements lej {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f73528n;
    private final iF rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final GJW.vd f73529t;

    static final class j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f73530n;

        /* JADX INFO: renamed from: td9.Ml$j$j, reason: collision with other inner class name */
        static final class C1187j extends SuspendLambda implements Function1 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f73532n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ Ml f73533t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1187j(Ml ml, Continuation continuation) {
                super(1, continuation);
                this.f73533t = ml;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Continuation continuation) {
                return new C1187j(this.f73533t, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f73532n == 0) {
                    ResultKt.throwOnFailure(obj);
                    Qk.r.gh(this.f73533t.f73528n);
                    Qk.r.r(this.f73533t.f73528n);
                    LM.psW.gh(this.f73533t.f73528n);
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Continuation continuation) {
                return ((C1187j) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GJW.vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        j(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return Ml.this.new j(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f73530n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                C1187j c1187j = new C1187j(Ml.this, null);
                this.f73530n = 1;
                obj = x0X.w6.Uo(c1187j, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            M3.j.rl(M3.n.rl((x0X.n) obj, j.w6.J2, j.EnumC0949j.f67611O, null, null, 12, null), Ml.this.rl);
            return Unit.INSTANCE;
        }
    }

    public Ml(Context context, iF eventLogger) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.f73528n = context;
        this.rl = eventLogger;
        this.f73529t = RzR.f3449n;
    }

    @Override // td9.lej
    public Object n(Continuation continuation) {
        GJW.C.nr(this.f73529t, OU.rl(), null, new j(null), 2, null);
        return new n.w6(Unit.INSTANCE);
    }
}
