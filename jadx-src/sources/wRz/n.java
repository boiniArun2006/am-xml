package wRz;

import GJW.C;
import GJW.Lu;
import GJW.P;
import GJW.aC;
import GJW.h;
import GJW.vd;
import java.lang.Thread;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import lt.InterfaceC2271j;
import sJa.Ml;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class n implements InterfaceC2271j {
    private final P nr;
    private final Thread.UncaughtExceptionHandler rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f74984t;

    static final class j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f74985n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ tVM.j f74986t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(tVM.j jVar, Continuation continuation) {
            super(2, continuation);
            this.f74986t = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new j(this.f74986t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f74985n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            tVM.j jVar = this.f74986t;
            this.f74985n = 1;
            Object objN = jVar.n(this);
            if (objN == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objN;
        }
    }

    /* JADX INFO: renamed from: wRz.n$n, reason: collision with other inner class name */
    static final class C1255n extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f74987n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ tVM.j f74988t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((C1255n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1255n(tVM.j jVar, Continuation continuation) {
            super(2, continuation);
            this.f74988t = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C1255n(this.f74988t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f74987n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                tVM.j jVar = this.f74988t;
                this.f74987n = 1;
                if (jVar.rl(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public n(final tVM.j crashRepository, Ml dispatcherProvider) {
        Intrinsics.checkNotNullParameter(crashRepository, "crashRepository");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        this.rl = Thread.getDefaultUncaughtExceptionHandler();
        this.f74984t = new Thread.UncaughtExceptionHandler() { // from class: wRz.j
            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th) {
                n.nr(this.f74983n, crashRepository, thread, th);
            }
        };
        this.nr = C.rl(Lu.n(dispatcherProvider.nr()), null, h.f3489t, new j(crashRepository, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nr(n nVar, tVM.j jVar, Thread thread, Throwable th) {
        aC.rl(null, new C1255n(jVar, null), 1, null);
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = nVar.rl;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }

    @Override // lt.InterfaceC2271j
    public void n() {
        Thread.setDefaultUncaughtExceptionHandler(this.f74984t);
    }

    @Override // lt.InterfaceC2271j
    public Object rl(Continuation continuation) {
        return this.nr.await(continuation);
    }
}
