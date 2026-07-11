package QV;

import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import x0X.n;
import zD.j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public abstract class j {

    static final class Ml extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f8158n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Function1 f8159t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Ml(Function1 function1, Continuation continuation) {
            super(1, continuation);
            this.f8159t = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new Ml(this.f8159t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f8158n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                Function1 function1 = this.f8159t;
                this.f8158n = 1;
                if (function1.invoke(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((Ml) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: QV.j$j, reason: collision with other inner class name */
    static final class C0284j extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f8160O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f8161n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f8162t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f8160O = obj;
            this.J2 |= Integer.MIN_VALUE;
            return j.n(null, null, null, this);
        }

        C0284j(Continuation continuation) {
            super(continuation);
        }
    }

    static final class n extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f8163n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Function1 f8164t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(Function1 function1, Continuation continuation) {
            super(1, continuation);
            this.f8164t = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new n(this.f8164t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f8163n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Function1 function1 = this.f8164t;
            this.f8163n = 1;
            Object objInvoke = function1.invoke(this);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objInvoke;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((n) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class w6 extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f8165O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f8166n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f8167t;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f8165O = obj;
            this.J2 |= Integer.MIN_VALUE;
            return j.rl(null, null, null, this);
        }

        w6(Continuation continuation) {
            super(continuation);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object n(j.w6 w6Var, j.EnumC1290j enumC1290j, Function1 function1, Continuation continuation) {
        C0284j c0284j;
        if (continuation instanceof C0284j) {
            c0284j = (C0284j) continuation;
            int i2 = c0284j.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0284j.J2 = i2 - Integer.MIN_VALUE;
            } else {
                c0284j = new C0284j(continuation);
            }
        }
        Object objUo = c0284j.f8160O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c0284j.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objUo);
            n nVar = new n(function1, null);
            c0284j.f8161n = w6Var;
            c0284j.f8162t = enumC1290j;
            c0284j.J2 = 1;
            objUo = x0X.w6.Uo(nVar, c0284j);
            if (objUo == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            enumC1290j = (j.EnumC1290j) c0284j.f8162t;
            w6Var = (j.w6) c0284j.f8161n;
            ResultKt.throwOnFailure(objUo);
        }
        j.w6 w6Var2 = w6Var;
        j.EnumC1290j enumC1290j2 = enumC1290j;
        x0X.n nVar2 = (x0X.n) objUo;
        if (nVar2 instanceof n.C1266n) {
            Throwable th = (Throwable) ((n.C1266n) nVar2).n();
            return new n.C1266n(new zD.j(w6Var2, enumC1290j2, j.n.f76388O, th.getMessage(), th));
        }
        if (nVar2 instanceof n.w6) {
            return nVar2;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object rl(j.w6 w6Var, j.EnumC1290j enumC1290j, Function1 function1, Continuation continuation) {
        w6 w6Var2;
        if (continuation instanceof w6) {
            w6Var2 = (w6) continuation;
            int i2 = w6Var2.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w6Var2.J2 = i2 - Integer.MIN_VALUE;
            } else {
                w6Var2 = new w6(continuation);
            }
        }
        Object objUo = w6Var2.f8165O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = w6Var2.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objUo);
            Ml ml = new Ml(function1, null);
            w6Var2.f8166n = w6Var;
            w6Var2.f8167t = enumC1290j;
            w6Var2.J2 = 1;
            objUo = x0X.w6.Uo(ml, w6Var2);
            if (objUo == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            enumC1290j = (j.EnumC1290j) w6Var2.f8167t;
            w6Var = (j.w6) w6Var2.f8166n;
            ResultKt.throwOnFailure(objUo);
        }
        j.w6 w6Var3 = w6Var;
        j.EnumC1290j enumC1290j2 = enumC1290j;
        x0X.n nVar = (x0X.n) objUo;
        if (nVar instanceof n.C1266n) {
            Throwable th = (Throwable) ((n.C1266n) nVar).n();
            return new n.C1266n(new zD.j(w6Var3, enumC1290j2, j.n.f76388O, th.getMessage(), th));
        }
        if (nVar instanceof n.w6) {
            return nVar;
        }
        throw new NoWhenBranchMatchedException();
    }
}
