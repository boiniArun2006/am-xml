package KfI;

import GJW.Lu;
import KfI.C1396z;
import android.util.Log;
import java.util.Map;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class g9s implements com.google.firebase.sessions.Dsr {
    private final CoroutineContext J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final fuX f5698O;
    private final pu.Dsr nr;
    private final com.google.firebase.Wre rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final s9b.I28 f5699t;
    public static final j Uo = new j(null);
    private static final double KN = Math.random();

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    static final class n extends SuspendLambda implements Function2 {
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f5700O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        int f5702Z;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ r f5703g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f5704n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Object f5705o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f5706r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f5707t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(GJW.vd vdVar, Continuation continuation) {
            return ((n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(r rVar, Continuation continuation) {
            super(2, continuation);
            this.f5703g = rVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return g9s.this.new n(this.f5703g, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x0096  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            C1396z c1396z;
            g9s g9sVar;
            Object objT;
            com.google.firebase.Wre wre;
            r rVar;
            ci ciVar;
            pu.Dsr dsr;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f5702Z;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            pu.Dsr dsr2 = (pu.Dsr) this.f5705o;
                            r rVar2 = (r) this.f5706r;
                            com.google.firebase.Wre wre2 = (com.google.firebase.Wre) this.J2;
                            ci ciVar2 = (ci) this.f5700O;
                            g9sVar = (g9s) this.f5707t;
                            c1396z = (C1396z) this.f5704n;
                            ResultKt.throwOnFailure(obj);
                            dsr = dsr2;
                            ciVar = ciVar2;
                            rVar = rVar2;
                            wre = wre2;
                            g9s g9sVar2 = g9sVar;
                            Map map = (Map) obj;
                            C1396z c1396z2 = c1396z;
                            g9sVar2.Uo(ciVar.n(wre, rVar, dsr, map, c1396z2.rl(), c1396z2.n()));
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    c1396z = (C1396z) obj;
                    g9sVar = g9s.this;
                    ci ciVar3 = ci.f5695n;
                    com.google.firebase.Wre wre3 = g9sVar.rl;
                    r rVar3 = this.f5703g;
                    pu.Dsr dsr3 = g9s.this.nr;
                    XE.j jVar = XE.j.f11798n;
                    this.f5704n = c1396z;
                    this.f5707t = g9sVar;
                    this.f5700O = ciVar3;
                    this.J2 = wre3;
                    this.f5706r = rVar3;
                    this.f5705o = dsr3;
                    this.f5702Z = 3;
                    objT = jVar.t(this);
                    if (objT != coroutine_suspended) {
                        wre = wre3;
                        obj = objT;
                        rVar = rVar3;
                        ciVar = ciVar3;
                        dsr = dsr3;
                        g9s g9sVar22 = g9sVar;
                        Map map2 = (Map) obj;
                        C1396z c1396z22 = c1396z;
                        g9sVar22.Uo(ciVar.n(wre, rVar, dsr, map2, c1396z22.rl(), c1396z22.n()));
                        return Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                g9s g9sVar3 = g9s.this;
                this.f5702Z = 1;
                obj = g9sVar3.xMQ(this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (((Boolean) obj).booleanValue()) {
                C1396z.j jVar2 = C1396z.f5761t;
                s9b.I28 i28 = g9s.this.f5699t;
                this.f5702Z = 2;
                obj = jVar2.n(i28, this);
                if (obj != coroutine_suspended) {
                    c1396z = (C1396z) obj;
                    g9sVar = g9s.this;
                    ci ciVar32 = ci.f5695n;
                    com.google.firebase.Wre wre32 = g9sVar.rl;
                    r rVar32 = this.f5703g;
                    pu.Dsr dsr32 = g9s.this.nr;
                    XE.j jVar3 = XE.j.f11798n;
                    this.f5704n = c1396z;
                    this.f5707t = g9sVar;
                    this.f5700O = ciVar32;
                    this.J2 = wre32;
                    this.f5706r = rVar32;
                    this.f5705o = dsr32;
                    this.f5702Z = 3;
                    objT = jVar3.t(this);
                    if (objT != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
            return Unit.INSTANCE;
        }
    }

    static final class w6 extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f5709n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f5710t;

        w6(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f5710t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return g9s.this.xMQ(this);
        }
    }

    public g9s(com.google.firebase.Wre firebaseApp, s9b.I28 firebaseInstallations, pu.Dsr sessionSettings, fuX eventGDTLogger, CoroutineContext backgroundDispatcher) {
        Intrinsics.checkNotNullParameter(firebaseApp, "firebaseApp");
        Intrinsics.checkNotNullParameter(firebaseInstallations, "firebaseInstallations");
        Intrinsics.checkNotNullParameter(sessionSettings, "sessionSettings");
        Intrinsics.checkNotNullParameter(eventGDTLogger, "eventGDTLogger");
        Intrinsics.checkNotNullParameter(backgroundDispatcher, "backgroundDispatcher");
        this.rl = firebaseApp;
        this.f5699t = firebaseInstallations;
        this.nr = sessionSettings;
        this.f5698O = eventGDTLogger;
        this.J2 = backgroundDispatcher;
    }

    private final boolean KN() {
        return KN <= this.nr.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Uo(SPz sPz) {
        try {
            this.f5698O.n(sPz);
            Log.d("SessionFirelogPublisher", "Successfully logged Session Start event.");
        } catch (RuntimeException e2) {
            Log.e("SessionFirelogPublisher", "Error logging Session Start event to DataTransport: ", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object xMQ(Continuation continuation) {
        w6 w6Var;
        g9s g9sVar;
        if (continuation instanceof w6) {
            w6Var = (w6) continuation;
            int i2 = w6Var.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w6Var.J2 = i2 - Integer.MIN_VALUE;
            } else {
                w6Var = new w6(continuation);
            }
        }
        Object obj = w6Var.f5710t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = w6Var.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            Log.d("SessionFirelogPublisher", "Data Collection is enabled for at least one Subscriber");
            pu.Dsr dsr = this.nr;
            w6Var.f5709n = this;
            w6Var.J2 = 1;
            if (dsr.J2(w6Var) == coroutine_suspended) {
                return coroutine_suspended;
            }
            g9sVar = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g9sVar = (g9s) w6Var.f5709n;
            ResultKt.throwOnFailure(obj);
        }
        if (!g9sVar.nr.t()) {
            Log.d("SessionFirelogPublisher", "Sessions SDK disabled. Events will not be sent.");
            return Boxing.boxBoolean(false);
        }
        if (g9sVar.KN()) {
            return Boxing.boxBoolean(true);
        }
        Log.d("SessionFirelogPublisher", "Sessions SDK has dropped this session due to sampling.");
        return Boxing.boxBoolean(false);
    }

    @Override // com.google.firebase.sessions.Dsr
    public void n(r sessionDetails) {
        Intrinsics.checkNotNullParameter(sessionDetails, "sessionDetails");
        GJW.C.nr(Lu.n(this.J2), null, null, new n(sessionDetails, null), 3, null);
    }
}
