package cd;

import GJW.Lu;
import GJW.vd;
import GJW.xuv;
import GJW.yg;
import QmE.iF;
import QmE.j;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.view.ViewModelKt;
import cd.DAz;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@StabilityInferred
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0003H\u0010¢\u0006\u0004\b\u0010\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\r\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u0012\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0013R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcd/u;", "LuW/n;", "Lcd/DAz;", "", "LxAo/I28;", "crisperManager", "LfVJ/n;", "countdownPaywallSecondsLeftUseCase", "LfVJ/j;", "countdownPaywallCardDiscountUseCase", "LQmE/iF;", "eventLogger", "<init>", "(LxAo/I28;LfVJ/n;LfVJ/j;LQmE/iF;)V", "ck", "()V", "Uo", "HI", "ty", "LxAo/I28;", "KN", "LQmE/iF;", "LGJW/xuv;", "xMQ", "LGJW/xuv;", "countdownJob", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class u extends uW.n {

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final iF eventLogger;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final xAo.I28 crisperManager;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private xuv countdownJob;

    static final class j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f43754n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f43755t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        j(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            j jVar = u.this.new j(continuation);
            jVar.f43755t = obj;
            return jVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0041  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0047  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0066  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0033 -> B:14:0x0036). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            vd vdVar;
            DAz.n nVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f43754n;
            if (i2 != 0) {
                if (i2 == 1) {
                    vdVar = (vd) this.f43755t;
                    ResultKt.throwOnFailure(obj);
                    Object objNr = u.this.nr();
                    if (!(objNr instanceof DAz.n)) {
                        nVar = (DAz.n) objNr;
                    } else {
                        nVar = null;
                    }
                    if (nVar != null) {
                        u uVar = u.this;
                        if (nVar.nr() <= 0) {
                            uVar.mUb(DAz.j.f43698n);
                            return Unit.INSTANCE;
                        }
                        uVar.mUb(DAz.n.rl(nVar, nVar.nr() - 1, 0, 2, null));
                    }
                    if (Lu.KN(vdVar)) {
                        this.f43755t = vdVar;
                        this.f43754n = 1;
                        if (yg.rl(1000L, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        Object objNr2 = u.this.nr();
                        if (!(objNr2 instanceof DAz.n)) {
                        }
                        if (nVar != null) {
                        }
                        if (Lu.KN(vdVar)) {
                            return Unit.INSTANCE;
                        }
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                vdVar = (vd) this.f43755t;
                if (Lu.KN(vdVar)) {
                }
            }
        }
    }

    @Override // uW.w6
    public void Uo() {
    }

    public u(xAo.I28 crisperManager, fVJ.n countdownPaywallSecondsLeftUseCase, fVJ.j countdownPaywallCardDiscountUseCase, iF eventLogger) {
        Object nVar;
        Intrinsics.checkNotNullParameter(crisperManager, "crisperManager");
        Intrinsics.checkNotNullParameter(countdownPaywallSecondsLeftUseCase, "countdownPaywallSecondsLeftUseCase");
        Intrinsics.checkNotNullParameter(countdownPaywallCardDiscountUseCase, "countdownPaywallCardDiscountUseCase");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.crisperManager = crisperManager;
        this.eventLogger = eventLogger;
        if (countdownPaywallSecondsLeftUseCase.n()) {
            int iInvoke = countdownPaywallSecondsLeftUseCase.invoke();
            Integer num = countdownPaywallCardDiscountUseCase.get();
            nVar = (iInvoke <= 0 || num == null) ? DAz.j.f43698n : new DAz.n(iInvoke, num.intValue());
        } else {
            nVar = DAz.j.f43698n;
        }
        mUb(nVar);
        ck();
    }

    private final void ck() {
        xuv xuvVar = this.countdownJob;
        if (xuvVar != null) {
            xuv.j.rl(xuvVar, null, 1, null);
        }
        this.countdownJob = GJW.C.nr(ViewModelKt.n(this), null, null, new j(null), 3, null);
    }

    public final void ty() {
        this.eventLogger.n(j.SPz.f8450n);
        xAo.I28.o(this.crisperManager, xAo.CN3.f75217n, null, 2, null);
    }

    public final void HI() {
        ck();
    }
}
