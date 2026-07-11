package td9;

import QmE.iF;
import android.content.Context;
import com.bendingspoons.legal.privacy.Tracker;
import ga6.j;
import k.InterfaceC2201j;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import td9.Lu;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class Lu implements lej {
    private final CZF.I28 J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final K0.n f73519O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f73520n;
    private final NuI.j nr;
    private final iF rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final nYs.Ml f73521t;

    static final class j extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f73523n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f73524t;

        j(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f73524t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return Lu.this.n(this);
        }
    }

    static final class n extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f73525n;

        /* JADX WARN: Code restructure failed: missing block: B:22:0x00a7, code lost:
        
            if (((k.InterfaceC2202n) r13).rl(r4, r12) != r3) goto L24;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f73525n;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                nYs.j jVarInvoke = Lu.this.f73521t.invoke();
                if (jVarInvoke != null) {
                    Lu lu = Lu.this;
                    lu.J2.nr(jVarInvoke.nHg());
                    lu.J2.Uo(jVarInvoke.iF());
                }
                Pr.w6 w6VarUo = Lu.this.f73519O.Uo();
                Context context = Lu.this.f73520n;
                boolean zT2 = Lu.this.J2.t();
                final Lu lu2 = Lu.this;
                Tracker.PicoProfiling picoProfiling = new Tracker.PicoProfiling(context, "Alight Motion", null, zT2, new Function1() { // from class: td9.h
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return Lu.n.xMQ(lu2, ((Boolean) obj2).booleanValue());
                    }
                }, 4, null);
                this.f73525n = 1;
                if (w6VarUo.nr(picoProfiling, this) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i2 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
                InterfaceC2201j[] interfaceC2201jArr = {efc.n.f63841n, jQ.n.f69439n, jQ.Ml.f69438n};
                this.f73525n = 3;
            }
            NuI.j jVar = Lu.this.nr;
            this.f73525n = 2;
            obj = jVar.n(this);
            if (obj != coroutine_suspended) {
                InterfaceC2201j[] interfaceC2201jArr2 = {efc.n.f63841n, jQ.n.f69439n, jQ.Ml.f69438n};
                this.f73525n = 3;
            }
            return coroutine_suspended;
        }

        n(Continuation continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return Lu.this.new n(continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit xMQ(Lu lu, boolean z2) {
            lu.J2.O(z2);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((n) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public Lu(Context context, iF eventLogger, nYs.Ml getAlightSettingsUseCase, NuI.j getAdOrableUseCase, K0.n legal, CZF.I28 pico) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(getAlightSettingsUseCase, "getAlightSettingsUseCase");
        Intrinsics.checkNotNullParameter(getAdOrableUseCase, "getAdOrableUseCase");
        Intrinsics.checkNotNullParameter(legal, "legal");
        Intrinsics.checkNotNullParameter(pico, "pico");
        this.f73520n = context;
        this.rl = eventLogger;
        this.f73521t = getAlightSettingsUseCase;
        this.nr = getAdOrableUseCase;
        this.f73519O = legal;
        this.J2 = pico;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // td9.lej
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(Continuation continuation) {
        j jVar;
        Lu lu;
        if (continuation instanceof j) {
            jVar = (j) continuation;
            int i2 = jVar.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jVar.J2 = i2 - Integer.MIN_VALUE;
            } else {
                jVar = new j(continuation);
            }
        }
        Object objUo = jVar.f73524t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = jVar.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objUo);
            n nVar = new n(null);
            jVar.f73523n = this;
            jVar.J2 = 1;
            objUo = x0X.w6.Uo(nVar, jVar);
            if (objUo == coroutine_suspended) {
                return coroutine_suspended;
            }
            lu = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lu = (Lu) jVar.f73523n;
            ResultKt.throwOnFailure(objUo);
        }
        return M3.j.rl(M3.n.rl((x0X.n) objUo, j.w6.J2, j.EnumC0949j.f67611O, null, null, 12, null), lu.rl);
    }
}
