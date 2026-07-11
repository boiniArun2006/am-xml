package wgK;

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
import x0X.w6;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class j implements tVM.j {
    private final dVI.n rl;

    /* JADX INFO: renamed from: wgK.j$j, reason: collision with other inner class name */
    static final class C1264j extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f75075O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f75076n;

        C1264j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f75076n = obj;
            this.f75075O |= Integer.MIN_VALUE;
            return j.this.n(this);
        }
    }

    static final class n extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f75078n;

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
            int i2 = this.f75078n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            dVI.n nVar = j.this.rl;
            this.f75078n = 1;
            Object objN = nVar.n(this);
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

    public j(dVI.n crashStorage) {
        Intrinsics.checkNotNullParameter(crashStorage, "crashStorage");
        this.rl = crashStorage;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // tVM.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(Continuation continuation) {
        C1264j c1264j;
        if (continuation instanceof C1264j) {
            c1264j = (C1264j) continuation;
            int i2 = c1264j.f75075O;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c1264j.f75075O = i2 - Integer.MIN_VALUE;
            } else {
                c1264j = new C1264j(continuation);
            }
        }
        Object objUo = c1264j.f75076n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c1264j.f75075O;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objUo);
            n nVar = new n(null);
            c1264j.f75075O = 1;
            objUo = w6.Uo(nVar, c1264j);
            if (objUo == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objUo);
        }
        x0X.n nVar2 = (x0X.n) objUo;
        if (nVar2 instanceof n.C1266n) {
            Throwable th = (Throwable) ((n.C1266n) nVar2).n();
            return new n.C1266n(new WN.j(j.w6.f11485t, j.EnumC0415j.f11468S, j.n.f11476O, th.getMessage(), th));
        }
        if (nVar2 instanceof n.w6) {
            return nVar2;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // tVM.j
    public Object rl(Continuation continuation) {
        Object objRl = this.rl.rl(continuation);
        return objRl == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objRl : Unit.INSTANCE;
    }
}
