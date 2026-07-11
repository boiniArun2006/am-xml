package p5A;

import GJW.C;
import GJW.Lu;
import GJW.P;
import GJW.vd;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import sJa.CN3;
import sJa.Ml;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class w6 implements CN3 {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final yB.j f71611O;
    private P nr;
    private final Function1 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final vd f71612t;

    static final class j extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f71613O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f71614n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f71615r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f71616t;

        j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f71613O = obj;
            this.f71615r |= Integer.MIN_VALUE;
            return w6.this.n(this);
        }
    }

    static final class n extends SuspendLambda implements Function2 {
        int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f71617O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f71618n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f71620t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        n(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return w6.this.new n(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            w6 w6Var;
            Object obj2;
            yB.j jVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.J2;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        jVar = (yB.j) this.f71617O;
                        w6Var = (w6) this.f71620t;
                        obj2 = this.f71618n;
                        ResultKt.throwOnFailure(obj);
                        try {
                            w6Var.nr = null;
                            Unit unit = Unit.INSTANCE;
                            return obj2;
                        } finally {
                            jVar.T(null);
                        }
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                Function1 function1 = w6.this.rl;
                this.J2 = 1;
                obj = function1.invoke(this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            w6Var = w6.this;
            yB.j jVar2 = w6Var.f71611O;
            this.f71618n = obj;
            this.f71620t = w6Var;
            this.f71617O = jVar2;
            this.J2 = 2;
            if (jVar2.Z(null, this) != coroutine_suspended) {
                obj2 = obj;
                jVar = jVar2;
                w6Var.nr = null;
                Unit unit2 = Unit.INSTANCE;
                return obj2;
            }
            return coroutine_suspended;
        }
    }

    public w6(Ml dispatcherProvider, Function1 runnable) {
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        this.rl = runnable;
        this.f71612t = Lu.n(dispatcherProvider.t());
        this.f71611O = yB.CN3.rl(false, 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // sJa.CN3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(Continuation continuation) {
        j jVar;
        yB.j jVar2;
        w6 w6Var;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i2 = jVar.f71615r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.f71615r = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        }
        Object obj = jVar.f71613O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = jVar.f71615r;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                jVar2 = this.f71611O;
                jVar.f71614n = this;
                jVar.f71616t = jVar2;
                jVar.f71615r = 1;
                if (jVar2.Z(null, jVar) != coroutine_suspended) {
                    w6Var = this;
                }
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            jVar2 = (yB.j) jVar.f71616t;
            w6Var = (w6) jVar.f71614n;
            ResultKt.throwOnFailure(obj);
            P pRl = w6Var.nr;
            if (pRl == null) {
                pRl = C.rl(w6Var.f71612t, null, null, w6Var.new n(null), 3, null);
                w6Var.nr = pRl;
            }
            jVar2.T(null);
            jVar.f71614n = null;
            jVar.f71616t = null;
            jVar.f71615r = 2;
            Object objAwait = pRl.await(jVar);
            return objAwait == coroutine_suspended ? coroutine_suspended : objAwait;
        } catch (Throwable th) {
            jVar2.T(null);
            throw th;
        }
    }
}
