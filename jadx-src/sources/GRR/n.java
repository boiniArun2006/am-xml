package GRR;

import GJW.C;
import GJW.Lu;
import GJW.OU;
import GJW.vd;
import GJW.xuv;
import GJW.yg;
import LJY.n;
import TFv.rv6;
import android.view.MotionEvent;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import sJa.Ml;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class n implements GRR.j {
    private final vd J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private xuv f3544O;
    private final w6 nr;
    private final rv6 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final n.C0204n f3545t;

    static final class j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ n f3546O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f3547n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ long f3548t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(long j2, n nVar, Continuation continuation) {
            super(2, continuation);
            this.f3548t = j2;
            this.f3546O = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new j(this.f3548t, this.f3546O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f3547n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                long j2 = this.f3548t;
                this.f3547n = 1;
                if (yg.rl(j2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            this.f3546O.nr();
            return Unit.INSTANCE;
        }
    }

    public n(rv6 developmentDeviceFlow, n.C0204n installerConfig, w6 listener, Ml dispatcherProvider) {
        Intrinsics.checkNotNullParameter(developmentDeviceFlow, "developmentDeviceFlow");
        Intrinsics.checkNotNullParameter(installerConfig, "installerConfig");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        this.rl = developmentDeviceFlow;
        this.f3545t = installerConfig;
        this.nr = listener;
        this.J2 = Lu.n(dispatcherProvider.nr());
    }

    private final void O() {
        long jN = ((Boolean) this.rl.getValue()).booleanValue() ? this.f3545t.n().n() : this.f3545t.rl().n();
        xuv xuvVar = this.f3544O;
        if (xuvVar != null) {
            xuv.j.rl(xuvVar, null, 1, null);
        }
        this.f3544O = C.nr(this.J2, OU.t(), null, new j(jN, this, null), 2, null);
    }

    private final void t() {
        xuv xuvVar = this.f3544O;
        if (xuvVar != null) {
            xuv.j.rl(xuvVar, null, 1, null);
        }
    }

    @Override // GRR.j
    public void onTouchEvent(MotionEvent ev) {
        Intrinsics.checkNotNullParameter(ev, "ev");
        int iRl = ((Boolean) this.rl.getValue()).booleanValue() ? this.f3545t.n().rl() : this.f3545t.rl().rl();
        if ((ev.getAction() & 255) == 5 && ev.getPointerCount() == iRl) {
            O();
        } else if ((ev.getAction() & 255) == 6 || (ev.getAction() & 255) == 1) {
            t();
        }
    }

    public void rl() {
        this.nr.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void nr() {
        rl();
    }
}
