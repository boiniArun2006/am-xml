package nKt;

import Dk.InterfaceC1335n;
import GJW.Lu;
import GJW.N;
import GJW.OU;
import GJW.lej;
import GJW.vd;
import JR.j;
import SpD.PicoXEvent;
import android.content.Context;
import com.bendingspoons.picox.persistence.internal.PicoXEventDatabase;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ExceptionsKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import mfo.CLVG.aNrWBQYwFf;
import nKt.Dsr;
import nKt.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class Dsr implements nKt.n {
    public static final j qie = new j(null);
    private final JoA.j J2;
    private final v8.j KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Hih.j f71024O;
    private final n.InterfaceC1063n Uo;
    private final vd gh;
    private final AtomicBoolean mUb;
    private final JWs.j nr;
    private final j0a.j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final st.j f71025t;
    private final Kz.Ml xMQ;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final Unit O(Ref.ObjectRef objectRef, String eventName, pq.Ml payload) {
            Dsr dsr;
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            Intrinsics.checkNotNullParameter(payload, "payload");
            T t3 = objectRef.element;
            if (t3 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("picoXImpl");
                dsr = null;
            } else {
                dsr = (Dsr) t3;
            }
            dsr.n(eventName, payload);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final Unit nr(Ref.ObjectRef objectRef, String eventName, pq.Ml payload) {
            Dsr dsr;
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            Intrinsics.checkNotNullParameter(payload, "payload");
            T t3 = objectRef.element;
            if (t3 == 0) {
                Intrinsics.throwUninitializedPropertyAccessException("picoXImpl");
                dsr = null;
            } else {
                dsr = (Dsr) t3;
            }
            dsr.n(eventName, payload);
            return Unit.INSTANCE;
        }

        /* JADX WARN: Type inference failed for: r0v7, types: [T, nKt.Dsr, nKt.n] */
        public final nKt.n t(Context context, n.InterfaceC1063n config, InterfaceC1335n concierge) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(concierge, "concierge");
            v8.Ml ml = new v8.Ml(config.J2(), "PicoX");
            PI.j jVarN = PI.j.qie.n();
            vd vdVarN = Lu.n(N.rl(null, 1, null).plus(OU.rl()));
            j0a.j jVar = new j0a.j(PicoXEventDatabase.INSTANCE.n(context).p5(), config.nr());
            Hih.j jVarN2 = Hih.j.f3939n.n(concierge);
            JWs.j jVarN3 = JWs.j.f4601n.n(context, config, jVarN, vdVarN);
            st.Wre wre = new st.Wre(j.C0158j.rl(JR.j.f4570n, config, ml, null, 4, null), jVar, config.Uo(), config.xMQ(), config.O(), ml, vdVarN, null);
            final Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ?? dsr = new Dsr(jVar, wre, jVarN3, jVarN2, JoA.j.f4683n.n(new Function2() { // from class: nKt.fuX
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Dsr.j.O(objectRef, (String) obj, (pq.Ml) obj2);
                }
            }, concierge, context, Lu.n(sJa.w6.rl.t()), jVarN), config, ml, Kz.Ml.J2.n(context, new Function2() { // from class: nKt.CN3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Dsr.j.nr(objectRef, (String) obj, (pq.Ml) obj2);
                }
            }, vdVarN), null, 256, null);
            objectRef.element = dsr;
            return dsr;
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
    static final class n extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f71026O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f71027n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ String f71028o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ pq.Ml f71029r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f71030t;

        static final class j extends SuspendLambda implements Function1 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f71031n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ PicoXEvent f71032t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(PicoXEvent picoXEvent, Continuation continuation) {
                super(1, continuation);
                this.f71032t = picoXEvent;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Continuation continuation) {
                return new j(this.f71032t, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.f71031n == 0) {
                    ResultKt.throwOnFailure(obj);
                    return this.f71032t.toString();
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Continuation continuation) {
                return ((j) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(pq.Ml ml, String str, Continuation continuation) {
            super(2, continuation);
            this.f71029r = ml;
            this.f71028o = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String xMQ(String str) {
            return "Error while tracking event: " + str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return Dsr.this.new n(this.f71029r, this.f71028o, continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String mUb(Exception exc) {
            return ExceptionsKt.stackTraceToString(exc);
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0091  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x00ac  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00ad  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x00f5  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Map mapN;
            Object objN;
            Map map;
            Object objKN;
            Map map2;
            pq.Ml ml;
            PicoXEvent picoXEvent;
            j0a.j jVar;
            PicoXEvent picoXEvent2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f71026O;
            try {
            } catch (Exception e2) {
                v8.j jVar2 = Dsr.this.KN;
                final String str = this.f71028o;
                v8.n.t(jVar2, new Function0() { // from class: nKt.aC
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Dsr.n.xMQ(str);
                    }
                });
                v8.n.t(Dsr.this.KN, new Function0() { // from class: nKt.C
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Dsr.n.mUb(e2);
                    }
                });
            }
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 != 4) {
                                if (i2 == 5) {
                                    picoXEvent2 = (PicoXEvent) this.f71027n;
                                    ResultKt.throwOnFailure(obj);
                                    v8.n.rl(Dsr.this.KN, new j(picoXEvent2, null));
                                    return Unit.INSTANCE;
                                }
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            ml = (pq.Ml) this.f71030t;
                            Map map3 = (Map) this.f71027n;
                            ResultKt.throwOnFailure(obj);
                            map2 = map3;
                            pq.Ml mlRl = ml.rl((pq.Ml) obj);
                            String string = UUID.randomUUID().toString();
                            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
                            kotlinx.serialization.json.Dsr dsrRl = OB.j.rl(this.f71029r.n());
                            kotlinx.serialization.json.Dsr dsrRl2 = OB.j.rl(mlRl.n());
                            picoXEvent = new PicoXEvent(string, this.f71028o, Ba.j.f504n.n(), dsrRl, dsrRl2, map2);
                            jVar = Dsr.this.rl;
                            this.f71027n = picoXEvent;
                            this.f71030t = null;
                            this.f71026O = 5;
                            if (jVar.t(picoXEvent, this) != coroutine_suspended) {
                                picoXEvent2 = picoXEvent;
                                v8.n.rl(Dsr.this.KN, new j(picoXEvent2, null));
                                return Unit.INSTANCE;
                            }
                            return coroutine_suspended;
                        }
                        map = (Map) this.f71027n;
                        ResultKt.throwOnFailure(obj);
                        pq.Ml mlN = SpD.Ml.n((SpD.w6) obj);
                        n.InterfaceC1063n interfaceC1063n = Dsr.this.Uo;
                        this.f71027n = map;
                        this.f71030t = mlN;
                        this.f71026O = 4;
                        objKN = interfaceC1063n.KN(this);
                        if (objKN == coroutine_suspended) {
                            map2 = map;
                            ml = mlN;
                            obj = objKN;
                            pq.Ml mlRl2 = ml.rl((pq.Ml) obj);
                            String string2 = UUID.randomUUID().toString();
                            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                            kotlinx.serialization.json.Dsr dsrRl3 = OB.j.rl(this.f71029r.n());
                            kotlinx.serialization.json.Dsr dsrRl22 = OB.j.rl(mlRl2.n());
                            picoXEvent = new PicoXEvent(string2, this.f71028o, Ba.j.f504n.n(), dsrRl3, dsrRl22, map2);
                            jVar = Dsr.this.rl;
                            this.f71027n = picoXEvent;
                            this.f71030t = null;
                            this.f71026O = 5;
                            if (jVar.t(picoXEvent, this) != coroutine_suspended) {
                            }
                            return coroutine_suspended;
                        }
                        return coroutine_suspended;
                    }
                    mapN = (Map) this.f71027n;
                    ResultKt.throwOnFailure(obj);
                    Map mapPlus = MapsKt.plus(mapN, (Map) obj);
                    JWs.j jVar3 = Dsr.this.nr;
                    this.f71027n = mapPlus;
                    this.f71026O = 3;
                    objN = jVar3.n(this);
                    if (objN == coroutine_suspended) {
                        map = mapPlus;
                        obj = objN;
                        pq.Ml mlN2 = SpD.Ml.n((SpD.w6) obj);
                        n.InterfaceC1063n interfaceC1063n2 = Dsr.this.Uo;
                        this.f71027n = map;
                        this.f71030t = mlN2;
                        this.f71026O = 4;
                        objKN = interfaceC1063n2.KN(this);
                        if (objKN == coroutine_suspended) {
                        }
                    } else {
                        return coroutine_suspended;
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                }
            } else {
                ResultKt.throwOnFailure(obj);
                Hih.j jVar4 = Dsr.this.f71024O;
                this.f71026O = 1;
                obj = jVar4.n(this);
                if (obj == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            mapN = SpD.n.n((SpD.j) obj);
            n.InterfaceC1063n interfaceC1063n3 = Dsr.this.Uo;
            this.f71027n = mapN;
            this.f71026O = 2;
            obj = interfaceC1063n3.n(this);
            if (obj != coroutine_suspended) {
                Map mapPlus2 = MapsKt.plus(mapN, (Map) obj);
                JWs.j jVar32 = Dsr.this.nr;
                this.f71027n = mapPlus2;
                this.f71026O = 3;
                objN = jVar32.n(this);
                if (objN == coroutine_suspended) {
                }
            }
            return coroutine_suspended;
        }
    }

    public Dsr(j0a.j jVar, st.j scheduler, JWs.j contextProvider, Hih.j identifiersProvider, JoA.j coreEventsProvider, n.InterfaceC1063n configuration, v8.j localLogger, Kz.Ml trackingConsent, lej dispatcher) {
        Intrinsics.checkNotNullParameter(jVar, aNrWBQYwFf.LuTVLkN);
        Intrinsics.checkNotNullParameter(scheduler, "scheduler");
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(identifiersProvider, "identifiersProvider");
        Intrinsics.checkNotNullParameter(coreEventsProvider, "coreEventsProvider");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(localLogger, "localLogger");
        Intrinsics.checkNotNullParameter(trackingConsent, "trackingConsent");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.rl = jVar;
        this.f71025t = scheduler;
        this.nr = contextProvider;
        this.f71024O = identifiersProvider;
        this.J2 = coreEventsProvider;
        this.Uo = configuration;
        this.KN = localLogger;
        this.xMQ = trackingConsent;
        this.mUb = new AtomicBoolean(false);
        this.gh = Lu.n(dispatcher);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String HI(String str) {
        return "PicoX not started. Ignoring event '" + str + "'";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String az() {
        return "PicoX already started. Trying to start it again will have no effect.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ck(String str) {
        return "Event '" + str + "' not tracked due to tracking consent";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String ty() {
        return "PicoX started";
    }

    @Override // nKt.n
    public void n(final String eventName, pq.Ml payload) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (!this.mUb.get()) {
            v8.n.Uo(this.KN, new Function0() { // from class: nKt.I28
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Dsr.HI(eventName);
                }
            });
        } else if (rl().Uo(eventName)) {
            GJW.C.nr(this.gh, null, null, new n(payload, eventName, null), 3, null);
        } else {
            v8.n.n(this.KN, new Function0() { // from class: nKt.Wre
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Dsr.ck(eventName);
                }
            });
        }
    }

    @Override // nKt.n
    /* JADX INFO: renamed from: qie, reason: merged with bridge method [inline-methods] */
    public Kz.Ml rl() {
        return this.xMQ;
    }

    @Override // nKt.n
    public void start() {
        if (this.mUb.getAndSet(true)) {
            v8.n.Uo(this.KN, new Function0() { // from class: nKt.w6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Dsr.az();
                }
            });
            return;
        }
        this.f71025t.start();
        this.J2.n();
        v8.n.n(this.KN, new Function0() { // from class: nKt.Ml
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Dsr.ty();
            }
        });
    }

    public /* synthetic */ Dsr(j0a.j jVar, st.j jVar2, JWs.j jVar3, Hih.j jVar4, JoA.j jVar5, n.InterfaceC1063n interfaceC1063n, v8.j jVar6, Kz.Ml ml, lej lejVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(jVar, jVar2, jVar3, jVar4, jVar5, interfaceC1063n, jVar6, ml, (i2 & 256) != 0 ? sJa.w6.rl.t() : lejVar);
    }
}
