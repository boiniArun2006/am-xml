package KjG;

import WN.j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class j implements He.j {
    private final hOy.n rl;

    static final class CN3 extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f5767n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f5768t;

        CN3(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f5768t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return j.this.t(0.0d, this);
        }
    }

    static final class I28 extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f5770n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f5771t;

        I28(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f5771t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return j.this.n(null, this);
        }
    }

    static final class Ml extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f5772n;

        Ml(Continuation continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return j.this.new Ml(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f5772n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                hOy.n nVar = j.this.rl;
                this.f5772n = 1;
                if (nVar.nr(this) == coroutine_suspended) {
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

    static final class Wre extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ String f5774O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f5775n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Wre(String str, Continuation continuation) {
            super(1, continuation);
            this.f5774O = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return j.this.new Wre(this.f5774O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f5775n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                hOy.n nVar = j.this.rl;
                String str = this.f5774O;
                this.f5775n = 1;
                if (nVar.n(str, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((Wre) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class fuX extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ double f5777O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f5778n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        fuX(double d2, Continuation continuation) {
            super(1, continuation);
            this.f5777O = d2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return j.this.new fuX(this.f5777O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f5778n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                hOy.n nVar = j.this.rl;
                double d2 = this.f5777O;
                this.f5778n = 1;
                if (nVar.t(d2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((fuX) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: KjG.j$j, reason: collision with other inner class name */
    static final class C0197j extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f5781n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f5782t;

        C0197j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f5782t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return j.this.rl(this);
        }
    }

    static final class n extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f5783n;

        n(Continuation continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return j.this.new n(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f5783n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            hOy.n nVar = j.this.rl;
            this.f5783n = 1;
            Object objRl = nVar.rl(this);
            if (objRl == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objRl;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((n) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class w6 extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f5786n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f5787t;

        w6(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f5787t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return j.this.nr(this);
        }
    }

    public j(hOy.n sessionStorage) {
        Intrinsics.checkNotNullParameter(sessionStorage, "sessionStorage");
        this.rl = sessionStorage;
    }

    private final x0X.n J2(x0X.n nVar) {
        if (nVar instanceof n.w6) {
            return nVar;
        }
        if (!(nVar instanceof n.C1266n)) {
            throw new NoWhenBranchMatchedException();
        }
        n.C1266n c1266n = (n.C1266n) nVar;
        return new n.C1266n(new WN.j(j.w6.J2, j.EnumC0415j.J2, j.n.f11476O, ((Throwable) c1266n.n()).getMessage(), (Throwable) c1266n.n()));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // He.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(String str, Continuation continuation) {
        I28 i28;
        j jVar;
        if (continuation instanceof I28) {
            i28 = (I28) continuation;
            int i2 = i28.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i28.J2 = i2 - Integer.MIN_VALUE;
            } else {
                i28 = new I28(continuation);
            }
        }
        Object objUo = i28.f5771t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = i28.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objUo);
            Wre wre = new Wre(str, null);
            i28.f5770n = this;
            i28.J2 = 1;
            objUo = x0X.w6.Uo(wre, i28);
            if (objUo == coroutine_suspended) {
                return coroutine_suspended;
            }
            jVar = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jVar = (j) i28.f5770n;
            ResultKt.throwOnFailure(objUo);
        }
        return jVar.J2((x0X.n) objUo);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // He.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object nr(Continuation continuation) {
        w6 w6Var;
        j jVar;
        if (continuation instanceof w6) {
            w6Var = (w6) continuation;
            int i2 = w6Var.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w6Var.J2 = i2 - Integer.MIN_VALUE;
            } else {
                w6Var = new w6(continuation);
            }
        }
        Object objUo = w6Var.f5787t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = w6Var.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objUo);
            Ml ml = new Ml(null);
            w6Var.f5786n = this;
            w6Var.J2 = 1;
            objUo = x0X.w6.Uo(ml, w6Var);
            if (objUo == coroutine_suspended) {
                return coroutine_suspended;
            }
            jVar = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jVar = (j) w6Var.f5786n;
            ResultKt.throwOnFailure(objUo);
        }
        return jVar.J2((x0X.n) objUo);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // He.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object rl(Continuation continuation) {
        C0197j c0197j;
        j jVar;
        if (continuation instanceof C0197j) {
            c0197j = (C0197j) continuation;
            int i2 = c0197j.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0197j.J2 = i2 - Integer.MIN_VALUE;
            } else {
                c0197j = new C0197j(continuation);
            }
        }
        Object objUo = c0197j.f5782t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c0197j.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objUo);
            n nVar = new n(null);
            c0197j.f5781n = this;
            c0197j.J2 = 1;
            objUo = x0X.w6.Uo(nVar, c0197j);
            if (objUo == coroutine_suspended) {
                return coroutine_suspended;
            }
            jVar = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jVar = (j) c0197j.f5781n;
            ResultKt.throwOnFailure(objUo);
        }
        return jVar.J2((x0X.n) objUo);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // He.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object t(double d2, Continuation continuation) {
        CN3 cn3;
        j jVar;
        if (continuation instanceof CN3) {
            cn3 = (CN3) continuation;
            int i2 = cn3.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cn3.J2 = i2 - Integer.MIN_VALUE;
            } else {
                cn3 = new CN3(continuation);
            }
        }
        Object objUo = cn3.f5768t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = cn3.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objUo);
            fuX fux = new fuX(d2, null);
            cn3.f5767n = this;
            cn3.J2 = 1;
            objUo = x0X.w6.Uo(fux, cn3);
            if (objUo == coroutine_suspended) {
                return coroutine_suspended;
            }
            jVar = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jVar = (j) cn3.f5767n;
            ResultKt.throwOnFailure(objUo);
        }
        return jVar.J2((x0X.n) objUo);
    }
}
