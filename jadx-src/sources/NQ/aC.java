package NQ;

import GJW.C;
import GJW.P;
import GJW.vd;
import NQ.Dsr;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class aC {

    public static final class j extends SuspendLambda implements Function2 {
        final /* synthetic */ Function1 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ long f7030O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f7031n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ int f7032t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Continuation continuation, int i2, long j2, Function1 function1) {
            super(2, continuation);
            this.f7032t = i2;
            this.f7030O = j2;
            this.J2 = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new j(continuation, this.f7032t, this.f7030O, this.J2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f7031n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            int i3 = this.f7032t;
            long j2 = this.f7030O;
            n nVar = new n(this.J2, null);
            w6 w6Var = w6.f7035n;
            this.f7031n = 1;
            Object objT = q3M.Ml.t(i3, j2, 0L, 0.0d, nVar, w6Var, null, this, 76, null);
            if (objT == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objT;
        }
    }

    static final class n extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f7033n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Function1 f7034t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(Function1 function1, Continuation continuation) {
            super(2, continuation);
            this.f7034t = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new n(this.f7034t, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return n(((Number) obj).intValue(), (Continuation) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f7033n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Function1 function1 = this.f7034t;
            this.f7033n = 1;
            Object objInvoke = function1.invoke(this);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objInvoke;
        }

        public final Object n(int i2, Continuation continuation) {
            return ((n) create(Integer.valueOf(i2), continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class w6 implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final w6 f7035n = new w6();

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return n(((Number) obj).intValue(), (x0X.n) obj2);
        }

        public final Boolean n(int i2, x0X.n result) {
            Intrinsics.checkNotNullParameter(result, "result");
            return Boolean.valueOf(x0X.w6.J2(result));
        }

        w6() {
        }
    }

    public static final boolean n(Dsr.j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        return System.currentTimeMillis() - jVar.t() > 3600000;
    }

    public static final Object rl(Dsr dsr, String str, int i2, long j2, Function1 function1, Continuation continuation) {
        P pRl = C.rl(dsr.f7002n, null, null, new j(null, i2, j2, function1), 3, null);
        dsr.rl.put(str, pRl);
        Object objAwait = pRl.await(continuation);
        if (objAwait == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objAwait;
        }
        return (x0X.n) objAwait;
    }
}
