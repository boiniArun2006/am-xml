package Ak;

import GJW.Dsr;
import GJW.OU;
import GJW.lej;
import GJW.vd;
import TFv.Z;
import TFv.nKK;
import TFv.r;
import android.content.Context;
import com.bendingspoons.legal.privacy.Tracker;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.Iterator;
import java.util.Set;
import k.InterfaceC2201j;
import k.InterfaceC2202n;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class w6 implements InterfaceC2202n {
    private final lej J2;
    private final Function0 KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final rB.Ml f96O;
    private final Function0 Uo;
    private final K0.n nr;
    private final InterfaceC2202n.InterfaceC1003n rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Context f97t;
    private final r xMQ;
    public static final j mUb = new j(null);
    public static final int gh = 8;

    static final class Ml extends SuspendLambda implements Function2 {
        final /* synthetic */ w6 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ boolean f98O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f99n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ boolean f100t;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((Ml) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Ml(boolean z2, boolean z3, w6 w6Var, Continuation continuation) {
            super(2, continuation);
            this.f100t = z2;
            this.f98O = z3;
            this.J2 = w6Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new Ml(this.f100t, this.f98O, this.J2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f99n == 0) {
                ResultKt.throwOnFailure(obj);
                RequestConfiguration.Builder tagForUnderAgeOfConsent = new RequestConfiguration.Builder().setTagForChildDirectedTreatment(this.f100t ? 1 : 0).setTagForUnderAgeOfConsent(this.f100t ? 1 : 0);
                Intrinsics.checkNotNullExpressionValue(tagForUnderAgeOfConsent, "setTagForUnderAgeOfConsent(...)");
                if (this.f98O) {
                    tagForUnderAgeOfConsent.setTestDeviceIds(CollectionsKt.listOf(this.J2.KN.invoke()));
                }
                MobileAds.setRequestConfiguration(tagForUnderAgeOfConsent.build());
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    static final class n extends ContinuationImpl {
        /* synthetic */ Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        boolean f101O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f102n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f103o;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        boolean f105t;

        n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.J2 = obj;
            this.f103o |= Integer.MIN_VALUE;
            return w6.this.t(false, false, this);
        }
    }

    /* JADX INFO: renamed from: Ak.w6$w6, reason: collision with other inner class name */
    static final class C0000w6 extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f106O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f107n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f108r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f109t;

        C0000w6(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f106O = obj;
            this.f108r |= Integer.MIN_VALUE;
            return w6.this.n(null, this);
        }
    }

    public w6(InterfaceC2202n.InterfaceC1003n config, Context context, K0.n legal, rB.Ml ml, lej dispatcher, Function0 admobNetworkProvider, Function0 aaidProvider) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(legal, "legal");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(admobNetworkProvider, "admobNetworkProvider");
        Intrinsics.checkNotNullParameter(aaidProvider, "aaidProvider");
        this.rl = config;
        this.f97t = context;
        this.nr = legal;
        this.f96O = ml;
        this.J2 = dispatcher;
        this.Uo = admobNetworkProvider;
        this.KN = aaidProvider;
        this.xMQ = nKK.rl(1, 0, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rE8.n Uo() {
        return rE8.n.f72883n;
    }

    private final Object mUb(boolean z2, boolean z3, Continuation continuation) {
        Object objUo = Dsr.Uo(this.J2, new Ml(z2, z3, this, null), continuation);
        return objUo == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objUo : Unit.INSTANCE;
    }

    @Override // k.InterfaceC2202n
    public InterfaceC2202n.InterfaceC1003n getConfig() {
        return this.rl;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // k.InterfaceC2202n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(Set set, Continuation continuation) {
        C0000w6 c0000w6;
        Iterator it;
        w6 w6Var;
        if (continuation instanceof C0000w6) {
            c0000w6 = (C0000w6) continuation;
            int i2 = c0000w6.f108r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0000w6.f108r = i2 - Integer.MIN_VALUE;
            } else {
                c0000w6 = new C0000w6(continuation);
            }
        }
        Object obj = c0000w6.f106O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c0000w6.f108r;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            it = set.iterator();
            w6Var = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) c0000w6.f109t;
            w6Var = (w6) c0000w6.f107n;
            ResultKt.throwOnFailure(obj);
        }
        while (it.hasNext()) {
            InterfaceC2201j interfaceC2201j = (InterfaceC2201j) it.next();
            Pr.w6 w6VarUo = w6Var.nr.Uo();
            Tracker trackerN = interfaceC2201j.n(w6Var.f97t);
            c0000w6.f107n = w6Var;
            c0000w6.f109t = it;
            c0000w6.f108r = 1;
            if (w6VarUo.nr(trackerN, c0000w6) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // k.InterfaceC2202n
    public Z nr() {
        return this.xMQ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b8, code lost:
    
        if (r9.rl(r8, r0) == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a0 A[PHI: r8 r9
      0x00a0: PHI (r8v3 boolean) = (r8v0 boolean), (r8v2 boolean), (r8v9 boolean) binds: [B:33:0x009f, B:31:0x009c, B:17:0x003b] A[DONT_GENERATE, DONT_INLINE]
      0x00a0: PHI (r9v6 Ak.w6) = (r9v1 Ak.w6), (r9v5 Ak.w6), (r9v12 Ak.w6) binds: [B:33:0x009f, B:31:0x009c, B:17:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // k.InterfaceC2202n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object t(boolean z2, boolean z3, Continuation continuation) {
        n nVar;
        w6 w6Var;
        w6 w6Var2;
        boolean zRl;
        Set of;
        rB.Ml ml;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i2 = nVar.f103o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.f103o = i2 - Integer.MIN_VALUE;
            } else {
                nVar = new n(continuation);
            }
        }
        Object obj = nVar.J2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = nVar.f103o;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            if (z2) {
                Context context = this.f97t;
                nVar.f102n = this;
                nVar.f105t = z2;
                nVar.f101O = z3;
                nVar.f103o = 1;
                if (ee.w6.n(context, nVar) != coroutine_suspended) {
                    w6Var2 = this;
                    zRl = w6Var2.getConfig().rl();
                    nVar.f102n = w6Var2;
                    nVar.f105t = z2;
                    nVar.f103o = 2;
                    if (w6Var2.mUb(z3, zRl, nVar) != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
            w6Var = this;
            ml = w6Var.f96O;
            if (ml != null) {
            }
            r rVar = w6Var.xMQ;
            Boolean boolBoxBoolean = Boxing.boxBoolean(z2);
            nVar.f102n = null;
            nVar.f103o = 4;
        } else {
            if (i3 == 1) {
                z3 = nVar.f101O;
                z2 = nVar.f105t;
                w6Var2 = (w6) nVar.f102n;
                ResultKt.throwOnFailure(obj);
                zRl = w6Var2.getConfig().rl();
                nVar.f102n = w6Var2;
                nVar.f105t = z2;
                nVar.f103o = 2;
                if (w6Var2.mUb(z3, zRl, nVar) != coroutine_suspended) {
                    w6Var = w6Var2;
                    of = SetsKt.setOf(w6Var.Uo.invoke());
                    nVar.f102n = w6Var;
                    nVar.f105t = z2;
                    nVar.f103o = 3;
                    if (w6Var.n(of, nVar) != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
            if (i3 == 2) {
                z2 = nVar.f105t;
                w6Var = (w6) nVar.f102n;
                ResultKt.throwOnFailure(obj);
                of = SetsKt.setOf(w6Var.Uo.invoke());
                nVar.f102n = w6Var;
                nVar.f105t = z2;
                nVar.f103o = 3;
                if (w6Var.n(of, nVar) != coroutine_suspended) {
                    ml = w6Var.f96O;
                    if (ml != null) {
                    }
                    r rVar2 = w6Var.xMQ;
                    Boolean boolBoxBoolean2 = Boxing.boxBoolean(z2);
                    nVar.f102n = null;
                    nVar.f103o = 4;
                }
                return coroutine_suspended;
            }
            if (i3 != 3) {
                if (i3 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            z2 = nVar.f105t;
            w6Var = (w6) nVar.f102n;
            ResultKt.throwOnFailure(obj);
            ml = w6Var.f96O;
            if (ml != null) {
                tCX.j.nr(ml, z2, "admob");
            }
            r rVar22 = w6Var.xMQ;
            Boolean boolBoxBoolean22 = Boxing.boxBoolean(z2);
            nVar.f102n = null;
            nVar.f103o = 4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String KN(Context context) {
        String id = AdvertisingIdClient.getAdvertisingIdInfo(context).getId();
        Intrinsics.checkNotNull(id);
        return id;
    }

    @Override // k.InterfaceC2202n
    public Object rl(InterfaceC2201j[] interfaceC2201jArr, Continuation continuation) {
        return InterfaceC2202n.w6.n(this, interfaceC2201jArr, continuation);
    }

    public /* synthetic */ w6(InterfaceC2202n.InterfaceC1003n interfaceC1003n, final Context context, K0.n nVar, rB.Ml ml, lej lejVar, Function0 function0, Function0 function02, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC1003n, context, nVar, ml, (i2 & 16) != 0 ? OU.rl() : lejVar, (i2 & 32) != 0 ? new Function0() { // from class: Ak.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return w6.Uo();
            }
        } : function0, (i2 & 64) != 0 ? new Function0() { // from class: Ak.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return w6.KN(context);
            }
        } : function02);
    }
}
