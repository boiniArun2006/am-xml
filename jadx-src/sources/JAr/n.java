package JAr;

import com.bendingspoons.networking.NetworkError;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import qu.Dsr;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class n implements JAr.j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Dsr f4436n;

    static final class j extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f4437O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f4438n;

        j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f4438n = obj;
            this.f4437O |= Integer.MIN_VALUE;
            return n.this.rl(null, null, this);
        }
    }

    /* JADX INFO: renamed from: JAr.n$n, reason: collision with other inner class name */
    static final class C0151n extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f4440O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f4441n;

        C0151n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f4441n = obj;
            this.f4440O |= Integer.MIN_VALUE;
            return n.this.t(this);
        }
    }

    static final class w6 extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f4443O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f4444n;

        w6(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f4444n = obj;
            this.f4443O |= Integer.MIN_VALUE;
            return n.this.n(this);
        }
    }

    public n(Dsr oracleService) {
        Intrinsics.checkNotNullParameter(oracleService, "oracleService");
        this.f4436n = oracleService;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // JAr.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(Continuation continuation) {
        w6 w6Var;
        if (continuation instanceof w6) {
            w6Var = (w6) continuation;
            int i2 = w6Var.f4443O;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w6Var.f4443O = i2 - Integer.MIN_VALUE;
            } else {
                w6Var = new w6(continuation);
            }
        }
        Object objN = w6Var.f4444n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = w6Var.f4443O;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objN);
            Dsr dsr = this.f4436n;
            w6Var.f4443O = 1;
            objN = U2.n.n(dsr, w6Var);
            if (objN == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objN);
        }
        x0X.n c1266n = (x0X.n) objN;
        if (c1266n instanceof n.C1266n) {
            c1266n = new n.C1266n(JAr.w6.rl((NetworkError) ((n.C1266n) c1266n).n()));
        } else if (!(c1266n instanceof n.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        if (c1266n instanceof n.C1266n) {
            return c1266n;
        }
        if (!(c1266n instanceof n.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        return new n.w6(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // JAr.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object rl(String str, String str2, Continuation continuation) {
        j jVar;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i2 = jVar.f4437O;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.f4437O = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        }
        Object objN = jVar.f4438n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = jVar.f4437O;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objN);
            Dsr dsr = this.f4436n;
            jVar.f4437O = 1;
            objN = com.bendingspoons.legal.network.j.n(dsr, str2, str, jVar);
            if (objN == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objN);
        }
        Object c1266n = (x0X.n) objN;
        if (c1266n instanceof n.C1266n) {
            c1266n = new n.C1266n(JAr.w6.rl((NetworkError) ((n.C1266n) c1266n).n()));
        } else if (!(c1266n instanceof n.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        if (c1266n instanceof n.C1266n) {
            return c1266n;
        }
        if (!(c1266n instanceof n.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        return new n.w6(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // JAr.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object t(Continuation continuation) {
        C0151n c0151n;
        if (continuation instanceof C0151n) {
            c0151n = (C0151n) continuation;
            int i2 = c0151n.f4440O;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0151n.f4440O = i2 - Integer.MIN_VALUE;
            } else {
                c0151n = new C0151n(continuation);
            }
        }
        Object objN = c0151n.f4441n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c0151n.f4440O;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objN);
            Dsr dsr = this.f4436n;
            c0151n.f4440O = 1;
            objN = U2.j.n(dsr, c0151n);
            if (objN == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objN);
        }
        x0X.n c1266n = (x0X.n) objN;
        if (c1266n instanceof n.C1266n) {
            c1266n = new n.C1266n(JAr.w6.rl((NetworkError) ((n.C1266n) c1266n).n()));
        } else if (!(c1266n instanceof n.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        if (c1266n instanceof n.C1266n) {
            return c1266n;
        }
        if (!(c1266n instanceof n.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        return new n.w6(Unit.INSTANCE);
    }
}
