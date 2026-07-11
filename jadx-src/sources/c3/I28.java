package c3;

import GJW.Dsr;
import GJW.OU;
import GJW.lej;
import GJW.vd;
import TFv.Z;
import TFv.nKK;
import TFv.r;
import android.content.Context;
import androidx.browser.trusted.sharing.KcI.qUrazMnwDskFs;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkInitializationConfiguration;
import com.bendingspoons.legal.privacy.Tracker;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.util.Iterator;
import java.util.List;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class I28 implements InterfaceC2202n {
    private final rB.Ml J2;
    private final Function1 KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final K0.n f43527O;
    private final lej Uo;
    private final r gh;
    private final Function0 mUb;
    private final Context nr;
    private final InterfaceC2202n.InterfaceC1003n rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f43528t;
    private final Function0 xMQ;
    public static final j qie = new j(null);
    public static final int az = 8;

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
    static final class Ml extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f43529O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f43530n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f43531r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f43532t;

        Ml(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f43529O = obj;
            this.f43531r |= Integer.MIN_VALUE;
            return I28.this.n(null, this);
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
    static final class n extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f43533n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        n(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return I28.this.new n(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f43533n == 0) {
                ResultKt.throwOnFailure(obj);
                return CollectionsKt.listOf(I28.this.mUb.invoke());
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
    static final class w6 extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f43535O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        int f43536Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f43537n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f43539r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f43540t;

        w6(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f43539r = obj;
            this.f43536Z |= Integer.MIN_VALUE;
            return I28.this.t(false, false, this);
        }
    }

    public I28(InterfaceC2202n.InterfaceC1003n config, String sdkKey, Context context, K0.n legal, rB.Ml ml, lej dispatcher, Function1 appLovinSdkProvider, Function0 appLovinNetworkProvider, Function0 aaidProvider) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(sdkKey, "sdkKey");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(legal, "legal");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(appLovinSdkProvider, "appLovinSdkProvider");
        Intrinsics.checkNotNullParameter(appLovinNetworkProvider, "appLovinNetworkProvider");
        Intrinsics.checkNotNullParameter(aaidProvider, "aaidProvider");
        this.rl = config;
        this.f43528t = sdkKey;
        this.nr = context;
        this.f43527O = legal;
        this.J2 = ml;
        this.Uo = dispatcher;
        this.KN = appLovinSdkProvider;
        this.xMQ = appLovinNetworkProvider;
        this.mUb = aaidProvider;
        this.gh = nKK.rl(1, 0, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppLovinSdk KN(Context it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return AppLovinSdk.getInstance(it);
    }

    private final Object qie(AppLovinSdk appLovinSdk, Continuation continuation) {
        return Dsr.Uo(this.Uo, new n(null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gBz.n xMQ() {
        return gBz.n.f67193n;
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
        Ml ml;
        Iterator it;
        I28 i28;
        if (continuation instanceof Ml) {
            ml = (Ml) continuation;
            int i2 = ml.f43531r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ml.f43531r = i2 - Integer.MIN_VALUE;
            } else {
                ml = new Ml(continuation);
            }
        }
        Object obj = ml.f43529O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = ml.f43531r;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            it = set.iterator();
            i28 = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) ml.f43532t;
            i28 = (I28) ml.f43530n;
            ResultKt.throwOnFailure(obj);
        }
        while (it.hasNext()) {
            InterfaceC2201j interfaceC2201j = (InterfaceC2201j) it.next();
            Pr.w6 w6VarUo = i28.f43527O.Uo();
            Tracker trackerN = interfaceC2201j.n(i28.nr);
            ml.f43530n = i28;
            ml.f43532t = it;
            ml.f43531r = 1;
            if (w6VarUo.nr(trackerN, ml) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }

    @Override // k.InterfaceC2202n
    public Z nr() {
        return this.gh;
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00fc, code lost:
    
        if (r13.rl(r12, r0) == r1) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00df A[PHI: r12 r13
      0x00df: PHI (r12v7 int) = (r12v2 int), (r12v6 int), (r12v13 int) binds: [B:41:0x00de, B:39:0x00db, B:17:0x0040] A[DONT_GENERATE, DONT_INLINE]
      0x00df: PHI (r13v13 c3.I28) = (r13v1 c3.I28), (r13v12 c3.I28), (r13v20 c3.I28) binds: [B:41:0x00de, B:39:0x00db, B:17:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // k.InterfaceC2202n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object t(boolean z2, boolean z3, Continuation continuation) {
        w6 w6Var;
        int i2;
        I28 i28;
        AppLovinSdk appLovinSdk;
        AppLovinSdkInitializationConfiguration.Builder mediationProvider;
        I28 i282;
        AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfigurationBuild;
        Set of;
        rB.Ml ml;
        if (continuation instanceof w6) {
            w6Var = (w6) continuation;
            int i3 = w6Var.f43536Z;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                w6Var.f43536Z = i3 - Integer.MIN_VALUE;
            } else {
                w6Var = new w6(continuation);
            }
        }
        Object objQie = w6Var.f43539r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = w6Var.f43536Z;
        if (i5 == 0) {
            ResultKt.throwOnFailure(objQie);
            i2 = (!z2 || z3) ? 0 : 1;
            if (i2 != 0) {
                appLovinSdk = (AppLovinSdk) this.KN.invoke(this.nr);
                mediationProvider = AppLovinSdkInitializationConfiguration.builder(this.f43528t).setMediationProvider("max");
                if (!getConfig().rl()) {
                    i282 = this;
                    appLovinSdkInitializationConfigurationBuild = mediationProvider.build();
                    Intrinsics.checkNotNullExpressionValue(appLovinSdkInitializationConfigurationBuild, "build(...)");
                    w6Var.f43537n = i282;
                    w6Var.f43540t = null;
                    w6Var.f43535O = null;
                    w6Var.J2 = i2;
                    w6Var.f43536Z = 2;
                    if (Ha.j.n(appLovinSdk, appLovinSdkInitializationConfigurationBuild, w6Var) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                w6Var.f43537n = this;
                w6Var.f43540t = appLovinSdk;
                w6Var.f43535O = mediationProvider;
                w6Var.J2 = i2;
                w6Var.f43536Z = 1;
                objQie = qie(appLovinSdk, w6Var);
                if (objQie != coroutine_suspended) {
                    i282 = this;
                    mediationProvider.setTestDeviceAdvertisingIds((List) objQie);
                    appLovinSdkInitializationConfigurationBuild = mediationProvider.build();
                    Intrinsics.checkNotNullExpressionValue(appLovinSdkInitializationConfigurationBuild, "build(...)");
                    w6Var.f43537n = i282;
                    w6Var.f43540t = null;
                    w6Var.f43535O = null;
                    w6Var.J2 = i2;
                    w6Var.f43536Z = 2;
                    if (Ha.j.n(appLovinSdk, appLovinSdkInitializationConfigurationBuild, w6Var) != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
            i28 = this;
            ml = i28.J2;
            if (ml != null) {
            }
            r rVar = i28.gh;
            Boolean boolBoxBoolean = Boxing.boxBoolean(i2 != 0);
            w6Var.f43537n = null;
            w6Var.f43536Z = 4;
        } else {
            if (i5 == 1) {
                i2 = w6Var.J2;
                mediationProvider = (AppLovinSdkInitializationConfiguration.Builder) w6Var.f43535O;
                appLovinSdk = (AppLovinSdk) w6Var.f43540t;
                i282 = (I28) w6Var.f43537n;
                ResultKt.throwOnFailure(objQie);
                mediationProvider.setTestDeviceAdvertisingIds((List) objQie);
                appLovinSdkInitializationConfigurationBuild = mediationProvider.build();
                Intrinsics.checkNotNullExpressionValue(appLovinSdkInitializationConfigurationBuild, "build(...)");
                w6Var.f43537n = i282;
                w6Var.f43540t = null;
                w6Var.f43535O = null;
                w6Var.J2 = i2;
                w6Var.f43536Z = 2;
                if (Ha.j.n(appLovinSdk, appLovinSdkInitializationConfigurationBuild, w6Var) != coroutine_suspended) {
                    i28 = i282;
                    of = SetsKt.setOf(i28.xMQ.invoke());
                    w6Var.f43537n = i28;
                    w6Var.J2 = i2;
                    w6Var.f43536Z = 3;
                    if (i28.n(of, w6Var) != coroutine_suspended) {
                    }
                }
                return coroutine_suspended;
            }
            if (i5 == 2) {
                i2 = w6Var.J2;
                i28 = (I28) w6Var.f43537n;
                ResultKt.throwOnFailure(objQie);
                of = SetsKt.setOf(i28.xMQ.invoke());
                w6Var.f43537n = i28;
                w6Var.J2 = i2;
                w6Var.f43536Z = 3;
                if (i28.n(of, w6Var) != coroutine_suspended) {
                    ml = i28.J2;
                    if (ml != null) {
                    }
                    r rVar2 = i28.gh;
                    Boolean boolBoxBoolean2 = Boxing.boxBoolean(i2 != 0);
                    w6Var.f43537n = null;
                    w6Var.f43536Z = 4;
                }
                return coroutine_suspended;
            }
            if (i5 != 3) {
                if (i5 != 4) {
                    throw new IllegalStateException(qUrazMnwDskFs.COKfqZiEtgqgVpZ);
                }
                ResultKt.throwOnFailure(objQie);
                return Unit.INSTANCE;
            }
            i2 = w6Var.J2;
            i28 = (I28) w6Var.f43537n;
            ResultKt.throwOnFailure(objQie);
            ml = i28.J2;
            if (ml != null) {
                tCX.j.nr(ml, i2 != 0, "max");
            }
            r rVar22 = i28.gh;
            Boolean boolBoxBoolean22 = Boxing.boxBoolean(i2 != 0);
            w6Var.f43537n = null;
            w6Var.f43536Z = 4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String mUb(Context context) {
        String id = AdvertisingIdClient.getAdvertisingIdInfo(context).getId();
        Intrinsics.checkNotNull(id);
        return id;
    }

    @Override // k.InterfaceC2202n
    public Object rl(InterfaceC2201j[] interfaceC2201jArr, Continuation continuation) {
        return InterfaceC2202n.w6.n(this, interfaceC2201jArr, continuation);
    }

    public /* synthetic */ I28(InterfaceC2202n.InterfaceC1003n interfaceC1003n, String str, final Context context, K0.n nVar, rB.Ml ml, lej lejVar, Function1 function1, Function0 function0, Function0 function02, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC1003n, str, context, nVar, ml, (i2 & 32) != 0 ? OU.rl() : lejVar, (i2 & 64) != 0 ? new Function1() { // from class: c3.n
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return I28.KN((Context) obj);
            }
        } : function1, (i2 & 128) != 0 ? new Function0() { // from class: c3.w6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return I28.xMQ();
            }
        } : function0, (i2 & 256) != 0 ? new Function0() { // from class: c3.Ml
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return I28.mUb(context);
            }
        } : function02);
    }
}
