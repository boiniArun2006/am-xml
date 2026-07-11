package cA;

import GJW.C;
import GJW.Lu;
import GJW.vd;
import ajd.j;
import android.content.Context;
import android.widget.Toast;
import cA.fuX;
import ifA.I28;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import qcD.nehv.Apsps;
import rB.Ml;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class fuX implements rB.Ml {
    private final K6D.Ml HI;
    private final Function1 J2;
    private final CU.j KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final B8O.n f43550O;
    private final AE.I28 Uo;
    private List az;
    private boolean gh;
    private B8O.j mUb;
    private final gp2.j nr;
    private boolean qie;
    private final v8.j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final hrZ.j f43551t;
    private final sJa.j ty;
    private final vd xMQ;

    static final class I28 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f43552n;

        static final class j implements TFv.CN3 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ fuX f43554n;

            /* JADX INFO: renamed from: cA.fuX$I28$j$j, reason: collision with other inner class name */
            static final class C0587j extends ContinuationImpl {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                /* synthetic */ Object f43555O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                Object f43556n;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f43557r;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                Object f43558t;

                C0587j(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) {
                    this.f43555O = obj;
                    this.f43557r |= Integer.MIN_VALUE;
                    return j.this.rl(null, this);
                }
            }

            j(fuX fux) {
                this.f43554n = fux;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // TFv.CN3
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object rl(ifA.I28 i28, Continuation continuation) {
                C0587j c0587j;
                j jVar;
                if (continuation instanceof C0587j) {
                    c0587j = (C0587j) continuation;
                    int i2 = c0587j.f43557r;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        c0587j.f43557r = i2 - Integer.MIN_VALUE;
                    } else {
                        c0587j = new C0587j(continuation);
                    }
                }
                Object obj = c0587j.f43555O;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = c0587j.f43557r;
                if (i3 == 0) {
                    ResultKt.throwOnFailure(obj);
                    B8O.j jVar2 = this.f43554n.mUb;
                    if (jVar2 != null) {
                        c0587j.f43556n = this;
                        c0587j.f43558t = i28;
                        c0587j.f43557r = 1;
                        if (jVar2.n(c0587j) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    jVar = this;
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i28 = (ifA.I28) c0587j.f43558t;
                    jVar = (j) c0587j.f43556n;
                    ResultKt.throwOnFailure(obj);
                }
                if (i28 instanceof I28.n) {
                    I28.n nVar = (I28.n) i28;
                    raJ.j jVar3 = (raJ.j) jVar.f43554n.J2.invoke(nVar.n());
                    fuX fux = jVar.f43554n;
                    B8O.j jVarN = fux.f43550O.n(jVar.f43554n.f43551t.rl(), nVar.nr(), nVar.t(), jVar3, nVar.rl());
                    jVarN.start();
                    fux.mUb = jVarN;
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((I28) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        I28(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return fuX.this.new I28(continuation);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit O(ifA.w6 w6Var) {
            ifA.Ml.n(w6Var);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f43552n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                TFv.Wre wreIk = TFv.fuX.Ik(fuX.this.nr.n(new Function1() { // from class: cA.Dsr
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return fuX.I28.O((ifA.w6) obj2);
                    }
                }));
                j jVar = new j(fuX.this);
                this.f43552n = 1;
                if (wreIk.n(jVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class Ml extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f43560n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f43561t;

        Ml(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f43561t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return fuX.this.rl(null, this);
        }
    }

    public static abstract class j {

        /* JADX INFO: renamed from: cA.fuX$j$j, reason: collision with other inner class name */
        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
        public static final class C0588j extends j {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final Function1 f43562n;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0588j) && Intrinsics.areEqual(this.f43562n, ((C0588j) obj).f43562n);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0588j(Function1 infoProvider) {
                super(null);
                Intrinsics.checkNotNullParameter(infoProvider, "infoProvider");
                this.f43562n = infoProvider;
            }

            public int hashCode() {
                return this.f43562n.hashCode();
            }

            public final Function1 n() {
                return this.f43562n;
            }

            public String toString() {
                return Apsps.XRIDdOv + this.f43562n + ")";
            }
        }

        public static final class n extends j {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private final ajd.j f43563n;
            private final List nr;
            private final boolean rl;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private final boolean f43564t;

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof n)) {
                    return false;
                }
                n nVar = (n) obj;
                return Intrinsics.areEqual(this.f43563n, nVar.f43563n) && this.rl == nVar.rl && this.f43564t == nVar.f43564t && Intrinsics.areEqual(this.nr, nVar.nr);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public n(ajd.j debugEvent, boolean z2, boolean z3, List userExperiments) {
                super(null);
                Intrinsics.checkNotNullParameter(debugEvent, "debugEvent");
                Intrinsics.checkNotNullParameter(userExperiments, "userExperiments");
                this.f43563n = debugEvent;
                this.rl = z2;
                this.f43564t = z3;
                this.nr = userExperiments;
            }

            public int hashCode() {
                return (((((this.f43563n.hashCode() * 31) + Boolean.hashCode(this.rl)) * 31) + Boolean.hashCode(this.f43564t)) * 31) + this.nr.hashCode();
            }

            public final ajd.j n() {
                return this.f43563n;
            }

            public final boolean nr() {
                return this.rl;
            }

            public final List rl() {
                return this.nr;
            }

            public final boolean t() {
                return this.f43564t;
            }

            public String toString() {
                return "TrackDebugEvent(debugEvent=" + this.f43563n + ", isSpoonerEvent=" + this.rl + ", isPremiumUserEvent=" + this.f43564t + ", userExperiments=" + this.nr + ")";
            }
        }

        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    static final class n extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f43566n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f43567t;

        n(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            n nVar = fuX.this.new n(continuation);
            nVar.f43567t = obj;
            return nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f43566n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                j jVar = (j) this.f43567t;
                if (jVar instanceof j.n) {
                    CU.j jVar2 = fuX.this.KN;
                    j.n nVar = (j.n) jVar;
                    ajd.j jVarN = nVar.n();
                    boolean zNr = nVar.nr();
                    boolean zT2 = nVar.t();
                    List listRl = nVar.rl();
                    this.f43566n = 1;
                    if (jVar2.rl(jVarN, zNr, zT2, listRl, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (jVar instanceof j.C0588j) {
                    fuX.this.KN.n(((j.C0588j) jVar).n());
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(j jVar, Continuation continuation) {
            return ((n) create(jVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* synthetic */ class w6 extends FunctionReferenceImpl implements Function1 {
        w6(Object obj) {
            super(1, obj, fuX.class, "track", "track(Lcom/bendingspoons/spidersense/logger/DebugEvent;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            n((ajd.j) obj);
            return Unit.INSTANCE;
        }

        public final void n(ajd.j p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((fuX) this.receiver).t(p0);
        }
    }

    public fuX(Function0 timestampProvider, v8.j localLogger, hrZ.j eventStorageManager, gp2.j configurationProvider, CU.n eventProcessorFactory, B8O.n eventPollerFactory, Function1 samplerFactory, sJa.n actorFactory, sJa.Ml dispatcherProvider, AE.I28 userInfoManager) {
        Intrinsics.checkNotNullParameter(timestampProvider, "timestampProvider");
        Intrinsics.checkNotNullParameter(localLogger, "localLogger");
        Intrinsics.checkNotNullParameter(eventStorageManager, "eventStorageManager");
        Intrinsics.checkNotNullParameter(configurationProvider, "configurationProvider");
        Intrinsics.checkNotNullParameter(eventProcessorFactory, "eventProcessorFactory");
        Intrinsics.checkNotNullParameter(eventPollerFactory, "eventPollerFactory");
        Intrinsics.checkNotNullParameter(samplerFactory, "samplerFactory");
        Intrinsics.checkNotNullParameter(actorFactory, "actorFactory");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        Intrinsics.checkNotNullParameter(userInfoManager, "userInfoManager");
        this.rl = localLogger;
        this.f43551t = eventStorageManager;
        this.nr = configurationProvider;
        this.f43550O = eventPollerFactory;
        this.J2 = samplerFactory;
        this.Uo = userInfoManager;
        this.KN = eventProcessorFactory.n(eventStorageManager.nr());
        this.xMQ = Lu.n(dispatcherProvider.nr());
        this.az = CollectionsKt.emptyList();
        sJa.j jVarN = actorFactory.n(new n(null));
        jVarN.start();
        this.ty = jVarN;
        Z();
        this.HI = K6D.Ml.f4830n.O(new w6(this), WD.Ml.f11440n.nr(timestampProvider));
    }

    private final void Z() {
        C.nr(this.xMQ, null, null, new I28(null), 3, null);
    }

    @Override // rB.Ml
    public void J2(boolean z2) {
        this.qie = z2;
    }

    @Override // rB.Ml
    public void KN(List experiments) {
        Intrinsics.checkNotNullParameter(experiments, "experiments");
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(experiments, 10));
        Iterator it = experiments.iterator();
        while (it.hasNext()) {
            Ml.w6 w6Var = (Ml.w6) it.next();
            arrayList.add(w6Var.n() + "/" + w6Var.rl());
        }
        this.az = arrayList;
    }

    @Override // rB.Ml
    public K6D.Ml O() {
        return this.HI;
    }

    @Override // rB.Ml
    public boolean Uo() {
        return this.qie;
    }

    @Override // rB.Ml
    public boolean mUb() {
        return this.gh;
    }

    @Override // rB.Ml
    public void n(Function1 infoProvider) {
        Intrinsics.checkNotNullParameter(infoProvider, "infoProvider");
        this.ty.n(new j.C0588j(infoProvider));
    }

    @Override // rB.Ml
    public List nr() {
        return this.az;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // rB.Ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object rl(Context context, Continuation continuation) {
        Ml ml;
        if (continuation instanceof Ml) {
            ml = (Ml) continuation;
            int i2 = ml.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ml.J2 = i2 - Integer.MIN_VALUE;
            } else {
                ml = new Ml(continuation);
            }
        }
        Object objN = ml.f43561t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = ml.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objN);
            AE.I28 i28 = this.Uo;
            ml.f43560n = context;
            ml.J2 = 1;
            objN = i28.n(ml);
            if (objN == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            context = (Context) ml.f43560n;
            ResultKt.throwOnFailure(objN);
        }
        Context context2 = context;
        String str = (String) x0X.w6.nr((x0X.n) objN);
        YgZ.w6.O(YgZ.w6.f12217n, context2, null, str == null ? "" : str, 2, null);
        Toast.makeText(context2, "Spider Sense User ID: " + str, 0).show();
        return Unit.INSTANCE;
    }

    @Override // rB.Ml
    public void t(final ajd.j debugEvent) {
        Intrinsics.checkNotNullParameter(debugEvent, "debugEvent");
        this.ty.n(new j.n(debugEvent, this.gh, this.qie, this.az));
        Unit unit = Unit.INSTANCE;
        v8.n.nr(this.rl, new Function0() { // from class: cA.Wre
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return fuX.XQ(debugEvent);
            }
        });
        v8.n.n(this.rl, new Function0() { // from class: cA.CN3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return fuX.S(debugEvent);
            }
        });
    }

    @Override // rB.Ml
    public void xMQ(boolean z2) {
        this.gh = z2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String S(ajd.j jVar) {
        return "       " + jVar.J2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String XQ(ajd.j jVar) {
        boolean z2;
        String str;
        String strJoinToString$default = CollectionsKt.joinToString$default(jVar.t(), "/", null, null, 0, null, null, 62, null);
        String lowerCase = jVar.Uo().name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String str2 = " (" + lowerCase + ")";
        if (jVar.Uo().rl() >= j.EnumC0481j.f13101O.rl()) {
            z2 = true;
        } else {
            z2 = false;
        }
        String str3 = null;
        if (!z2) {
            str2 = null;
        }
        String str4 = "";
        if (str2 == null) {
            str2 = "";
        }
        String strNr = jVar.nr();
        if (strNr != null) {
            str = ": " + strNr;
        } else {
            str = null;
        }
        if (jVar.Uo().rl() >= j.EnumC0481j.J2.rl()) {
            str3 = str;
        }
        if (str3 != null) {
            str4 = str3;
        }
        return "Event: " + strJoinToString$default + str2 + str4;
    }
}
