package cKn;

import Dk.InterfaceC1335n;
import GJW.C;
import GJW.Lu;
import GJW.OU;
import GJW.ci;
import GJW.lej;
import GJW.r;
import GJW.vd;
import android.content.Context;
import cKn.CN3;
import cKn.Wre;
import com.bendingspoons.concierge.domain.entities.Id;
import com.bendingspoons.legal.privacy.Tracker;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class CN3 implements Wre {
    private final r J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final vd f43609O;
    private jXF.j nr;
    private final InterfaceC1335n rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final DTN.CN3 f43610t;

    static final class Ml extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f43611n;

        static final class j implements HX.j {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ String f43613n;

            j(String str) {
                this.f43613n = str;
            }

            @Override // HX.j
            public final Object n(Continuation continuation) {
                return SetsKt.setOf(new Id.CustomId("firebase_app_instance_id", this.f43613n));
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
            return CN3.this.new Ml(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f43611n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                FirebaseAnalytics firebaseAnalyticsN = DK.j.n(com.google.firebase.w6.f60907n);
                this.f43611n = 1;
                obj = Dsr.rl(firebaseAnalyticsN, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            String str = (String) x0X.w6.nr((x0X.n) obj);
            if (str != null) {
                CN3.this.rl.Uo(new j(str));
            }
            return Unit.INSTANCE;
        }
    }

    static final class j extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Context f43614O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f43615n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Context context, Continuation continuation) {
            super(2, continuation);
            this.f43614O = context;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return CN3.this.new j(this.f43614O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f43615n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                DTN.CN3 cn3J2 = CN3.this.J2();
                Context context = this.f43614O;
                this.f43615n = 1;
                if (cn3J2.n(context, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class n extends SuspendLambda implements Function2 {
        final /* synthetic */ Function0 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ S2.Ml f43617O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f43618n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ CN3 f43619r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f43620t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(S2.Ml ml, Function0 function0, CN3 cn3, Continuation continuation) {
            super(2, continuation);
            this.f43617O = ml;
            this.J2 = function0;
            this.f43619r = cn3;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new n(this.f43617O, this.J2, this.f43619r, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0060  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            S2.j jVar;
            S2.j jVar2;
            S2.j jVar3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f43620t;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            jVar3 = (S2.j) this.f43618n;
                            ResultKt.throwOnFailure(obj);
                            jVar = jVar3;
                            this.f43619r.J2.eF(jVar);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    jVar2 = (S2.j) obj;
                    if (jVar2 == null) {
                        S2.Ml ml = this.f43617O;
                        this.f43618n = jVar2;
                        this.f43620t = 3;
                        if (ml.rl(jVar2, this) != coroutine_suspended) {
                            jVar3 = jVar2;
                            jVar = jVar3;
                            this.f43619r.J2.eF(jVar);
                            return Unit.INSTANCE;
                        }
                        return coroutine_suspended;
                    }
                    jVar = null;
                    this.f43619r.J2.eF(jVar);
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                S2.Ml ml2 = this.f43617O;
                this.f43620t = 1;
                obj = ml2.n(this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            jVar = (S2.j) obj;
            if (jVar == null) {
                S2.CN3 cn3 = (S2.CN3) this.J2.invoke();
                this.f43620t = 2;
                obj = cn3.KN(this);
                if (obj != coroutine_suspended) {
                    jVar2 = (S2.j) obj;
                    if (jVar2 == null) {
                    }
                }
                return coroutine_suspended;
            }
            this.f43619r.J2.eF(jVar);
            return Unit.INSTANCE;
        }
    }

    static final class w6 extends SuspendLambda implements Function2 {
        final /* synthetic */ jXF.j J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f43621O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        final /* synthetic */ Pr.w6 f43622Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f43623n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ CN3 f43624o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Context f43625r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f43626t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((w6) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w6(jXF.j jVar, Context context, CN3 cn3, Pr.w6 w6Var, Continuation continuation) {
            super(2, continuation);
            this.J2 = jVar;
            this.f43625r = context;
            this.f43624o = cn3;
            this.f43622Z = w6Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit O(CN3 cn3, boolean z2) {
            if (z2) {
                cn3.O();
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new w6(this.J2, this.f43625r, this.f43624o, this.f43622Z, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Pr.w6 w6Var;
            Iterator it;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f43621O;
            if (i2 != 0) {
                if (i2 == 1) {
                    it = (Iterator) this.f43626t;
                    w6Var = (Pr.w6) this.f43623n;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                jXF.j jVar = this.J2;
                Context context = this.f43625r;
                final CN3 cn3 = this.f43624o;
                List listRl = jVar.rl(context, new Function1() { // from class: cKn.fuX
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return CN3.w6.O(cn3, ((Boolean) obj2).booleanValue());
                    }
                });
                w6Var = this.f43622Z;
                it = listRl.iterator();
            }
            while (it.hasNext()) {
                Tracker tracker = (Tracker) it.next();
                this.f43623n = w6Var;
                this.f43626t = it;
                this.f43621O = 1;
                if (w6Var.nr(tracker, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public CN3(Wre.n config, Context context, InterfaceC1335n concierge, K0.n nVar, Function0 installReferrerProvider, S2.Ml installReferrerRepository, Function0 analyticsProvider, DTN.CN3 securityProviderInstaller, lej dispatcher) {
        Pr.w6 w6VarUo;
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(concierge, "concierge");
        Intrinsics.checkNotNullParameter(installReferrerProvider, "installReferrerProvider");
        Intrinsics.checkNotNullParameter(installReferrerRepository, "installReferrerRepository");
        Intrinsics.checkNotNullParameter(analyticsProvider, "analyticsProvider");
        Intrinsics.checkNotNullParameter(securityProviderInstaller, "securityProviderInstaller");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.rl = concierge;
        this.f43610t = securityProviderInstaller;
        vd vdVarN = Lu.n(dispatcher);
        this.f43609O = vdVarN;
        this.J2 = ci.t(null, 1, null);
        C.nr(vdVarN, null, null, new j(context, null), 3, null);
        if (config.n()) {
            C.nr(vdVarN, null, null, new n(installReferrerRepository, installReferrerProvider, this, null), 3, null);
        }
        if (config.rl()) {
            if (com.google.firebase.Wre.o(context) != null) {
                DK.j.n(com.google.firebase.w6.f60907n).t(true);
                O();
            }
            jXF.j jVar = (jXF.j) analyticsProvider.invoke();
            Uo(jVar);
            if (nVar == null || (w6VarUo = nVar.Uo()) == null) {
                return;
            }
            C.nr(vdVarN, null, null, new w6(jVar, context, this, w6VarUo, null), 3, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O() {
        C.nr(this.f43609O, null, null, new Ml(null), 3, null);
    }

    public DTN.CN3 J2() {
        return this.f43610t;
    }

    public void Uo(jXF.j jVar) {
        this.nr = jVar;
    }

    @Override // cKn.Wre
    public jXF.j n() {
        return this.nr;
    }

    public /* synthetic */ CN3(Wre.n nVar, Context context, InterfaceC1335n interfaceC1335n, K0.n nVar2, Function0 function0, S2.Ml ml, Function0 function02, DTN.CN3 cn3, lej lejVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(nVar, context, interfaceC1335n, nVar2, function0, ml, function02, cn3, (i2 & 256) != 0 ? OU.n() : lejVar);
    }
}
