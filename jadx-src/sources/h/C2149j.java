package h;

import GJW.C;
import GJW.Dsr;
import GJW.Lu;
import GJW.V1;
import GJW.lej;
import GJW.vd;
import YF.Wre;
import android.os.Handler;
import android.os.Looper;
import fX.InterfaceC2106j;
import fX.InterfaceC2107n;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import z.KH;
import z.fg;
import z.mz;

/* JADX INFO: renamed from: h.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class C2149j implements InterfaceC2107n {

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final n f67924O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final mz f67925n;
    private final vd nr;
    private final Looper rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private lej f67926t;

    /* JADX INFO: renamed from: h.j$Ml */
    static final class Ml extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f67927n;

        /* JADX INFO: renamed from: h.j$Ml$j, reason: collision with other inner class name */
        static final class C0953j extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f67929n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ C2149j f67930t;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((C0953j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0953j(C2149j c2149j, Continuation continuation) {
                super(2, continuation);
                this.f67930t = c2149j;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C0953j(this.f67930t, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f67929n == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.f67930t.t().release();
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((Ml) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        Ml(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C2149j.this.new Ml(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f67927n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                if (C2149j.this.f67926t != null) {
                    lej lejVarMUb = C2149j.this.mUb();
                    C0953j c0953j = new C0953j(C2149j.this, null);
                    this.f67927n = 1;
                    if (Dsr.Uo(lejVarMUb, c0953j, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    throw new IllegalStateException("The dispatcher has been released");
                }
            }
            Lu.O(C2149j.this.nr, null, 1, null);
            C2149j.this.rl.quit();
            C2149j.this.f67926t = null;
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: h.j$j, reason: collision with other inner class name */
    static final class C0954j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f67931n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((C0954j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        C0954j(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return C2149j.this.new C0954j(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f67931n == 0) {
                ResultKt.throwOnFailure(obj);
                C2149j.this.t().N();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: h.j$n */
    private final class n implements InterfaceC2106j {
        public n() {
        }

        @Override // fX.InterfaceC2106j
        public void J2(long j2) {
            C2149j.this.t().E2(j2);
            C2149j.this.t().qie();
        }

        @Override // fX.InterfaceC2106j
        public int O() {
            return C2149j.this.t().O();
        }

        @Override // fX.InterfaceC2106j
        public void Uo(fg target) {
            Intrinsics.checkNotNullParameter(target, "target");
            C2149j.this.t().ViF(target);
        }

        @Override // fX.InterfaceC2106j
        public int nr() {
            return C2149j.this.t().nr();
        }

        @Override // fX.InterfaceC2106j
        public KH rl() {
            return C2149j.this.t().rl();
        }
    }

    /* JADX INFO: renamed from: h.j$w6 */
    static final class w6 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ C2149j f67934O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f67935n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Function1 f67936t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((w6) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w6(Function1 function1, C2149j c2149j, Continuation continuation) {
            super(2, continuation);
            this.f67936t = function1;
            this.f67934O = c2149j;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new w6(this.f67936t, this.f67934O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f67935n == 0) {
                ResultKt.throwOnFailure(obj);
                return this.f67936t.invoke(this.f67934O.f67924O);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public C2149j(mz openGLContext, Looper looper) {
        Intrinsics.checkNotNullParameter(openGLContext, "openGLContext");
        Intrinsics.checkNotNullParameter(looper, "looper");
        this.f67925n = openGLContext;
        this.rl = looper;
        this.f67926t = Wre.t(new Handler(looper), null, 1, null);
        vd vdVarN = Lu.n(mUb());
        this.nr = vdVarN;
        this.f67924O = new n();
        C.nr(vdVarN, null, null, new C0954j(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final lej mUb() {
        lej lejVar = this.f67926t;
        if (lejVar != null) {
            return lejVar;
        }
        throw new IllegalStateException("The dispatcher has been released");
    }

    @Override // fX.InterfaceC2107n, Cp.w6
    public Object rl(Continuation continuation) {
        Object objUo = Dsr.Uo(V1.f3456n, new Ml(null), continuation);
        return objUo == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUo : Unit.INSTANCE;
    }

    @Override // fX.InterfaceC2107n
    public mz t() {
        return this.f67925n;
    }

    @Override // fX.InterfaceC2107n
    public Object n(Function1 function1, Continuation continuation) {
        return Dsr.Uo(mUb(), new w6(function1, this, null), continuation);
    }
}
