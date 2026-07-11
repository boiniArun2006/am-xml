package AR;

import ScC.FuwU.pTYaLzzmJSGAPQ;
import WN.j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public abstract class Ml {

    static final class j extends ContinuationImpl {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f69n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f70t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f69n = obj;
            this.f70t |= Integer.MIN_VALUE;
            return Ml.n(null, this);
        }

        j(Continuation continuation) {
            super(continuation);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
    static final class n extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f71n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ w6 f72t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(w6 w6Var, Continuation continuation) {
            super(1, continuation);
            this.f72t = w6Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new n(this.f72t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f71n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException(pTYaLzzmJSGAPQ.zXXUqmsvUCz);
            }
            ResultKt.throwOnFailure(obj);
            w6 w6Var = this.f72t;
            this.f71n = 1;
            Object objN = w6Var.n(this);
            if (objN == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objN;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((n) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object n(w6 w6Var, Continuation continuation) {
        j jVar;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i2 = jVar.f70t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.f70t = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        }
        Object objUo = jVar.f69n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = jVar.f70t;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objUo);
            n nVar = new n(w6Var, null);
            jVar.f70t = 1;
            objUo = x0X.w6.Uo(nVar, jVar);
            if (objUo == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objUo);
        }
        return rl((x0X.n) objUo);
    }

    private static final x0X.n rl(x0X.n nVar) {
        if (nVar instanceof n.C1266n) {
            Throwable th = (Throwable) ((n.C1266n) nVar).n();
            return new n.C1266n(new WN.j(j.w6.J2, j.EnumC0415j.f11469Z, j.n.f11480t, th.getMessage(), th));
        }
        if (nVar instanceof n.w6) {
            return nVar;
        }
        throw new NoWhenBranchMatchedException();
    }
}
