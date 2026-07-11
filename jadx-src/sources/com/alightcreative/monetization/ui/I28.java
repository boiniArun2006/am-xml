package com.alightcreative.monetization.ui;

import GJW.Lu;
import GJW.vd;
import GJW.xuv;
import GJW.yg;
import QmE.C1450z;
import QmE.Xo;
import QmE.eO;
import QmE.iF;
import QmE.j;
import R5.I28;
import R5.n;
import TFv.CN3;
import android.app.Activity;
import androidx.view.Lifecycle;
import androidx.view.ViewModel;
import androidx.view.ViewModelKt;
import androidx.view.ViewModelProvider;
import cd.g9s;
import com.alightcreative.account.C;
import com.alightcreative.account.CloudBenefitValues;
import com.alightcreative.monorepo.settings.PlayfulUnlockStyle;
import f.EnumC1982eO;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kgE.Zs;
import kgE.fuX;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import x0X.n;
import xAo.M;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class I28 extends uW.w6 {
    private final fVJ.n E2;
    private final String HI;
    private final String Ik;
    private final String KN;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private Set f46813N;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private final Boolean f46814S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private xuv f46815T;
    private final String Uo;
    private final YV.Wre ViF;
    private final EnumC1982eO WPU;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private final iF f46816X;
    private final Boolean XQ;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private final List f46817Z;
    private final String aYN;
    private final String az;
    private final String ck;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final fVJ.j f46818e;
    private final Nf7.j fD;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final fVJ.I28 f46819g;
    private final String gh;
    private final nYs.Ml iF;
    private final String mUb;
    private boolean nHg;
    private final fuX nY;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Integer f46820o;
    private final String qie;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final String f46821r;
    private xuv s7N;
    private final g9s te;
    private final String ty;
    private final String xMQ;
    public static final j wTp = new j(null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f46812v = 8;

    /* JADX INFO: renamed from: com.alightcreative.monetization.ui.I28$I28, reason: collision with other inner class name */
    static final class C0673I28 extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f46823n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f46824t;

        C0673I28(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            C0673I28 c0673i28 = I28.this.new C0673I28(continuation);
            c0673i28.f46824t = obj;
            return c0673i28;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((C0673I28) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x007a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0034 -> B:14:0x0037). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            vd vdVar;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f46823n;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                vdVar = (vd) this.f46824t;
                if (Lu.KN(vdVar)) {
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                vdVar = (vd) this.f46824t;
                ResultKt.throwOnFailure(obj);
                R5.w6 w6Var = (R5.w6) I28.this.nr();
                if (w6Var != null) {
                    I28 i28 = I28.this;
                    if (w6Var.nr() <= 0) {
                        i28.M7(false);
                        return Unit.INSTANCE;
                    }
                    i28.mUb(R5.w6.rl(w6Var, null, null, false, 0, 0, false, false, null, null, false, w6Var.nr() - 1, false, null, null, false, false, false, 130047, null));
                }
                if (Lu.KN(vdVar)) {
                    this.f46824t = vdVar;
                    this.f46823n = 1;
                    if (yg.rl(1000L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    R5.w6 w6Var2 = (R5.w6) I28.this.nr();
                    if (w6Var2 != null) {
                    }
                    if (Lu.KN(vdVar)) {
                        return Unit.INSTANCE;
                    }
                }
            }
        }
    }

    static final class Ml extends SuspendLambda implements Function2 {
        final /* synthetic */ I28 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ R5.w6 f46825O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f46826n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ Activity f46827r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f46828t;

        public /* synthetic */ class j {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[YV.fuX.values().length];
                try {
                    iArr[YV.fuX.f12139O.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new Ml(this.f46825O, this.J2, this.f46827r, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((Ml) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        Ml(R5.w6 w6Var, I28 i28, Activity activity, Continuation continuation) {
            super(2, continuation);
            this.f46825O = w6Var;
            this.J2 = i28;
            this.f46827r = activity;
        }

        /* JADX WARN: Removed duplicated region for block: B:31:0x0088  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            mg4.Ml mlRl;
            List list;
            mg4.j jVar;
            kgE.j jVar2;
            kgE.j jVarRl;
            I28 i28;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f46828t;
            if (i2 != 0) {
                if (i2 == 1) {
                    i28 = (I28) this.f46826n;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                mg4.w6 w6Var = (mg4.w6) this.f46825O.Ik().get(this.f46825O.az());
                mg4.n nVarCk = this.f46825O.ck();
                if (nVarCk != null && (mlRl = nVarCk.rl()) != null && (list = (List) mlRl.get(w6Var)) != null && (jVar = (mg4.j) CollectionsKt.getOrNull(list, this.f46825O.qie())) != null) {
                    R5.w6 w6Var2 = this.f46825O;
                    if (w6Var2.KN() != EnumC1982eO.f64017S && w6Var2.KN() != EnumC1982eO.f64021g) {
                        if (w6Var2.O()) {
                            jVarRl = jVar.n();
                        } else {
                            jVarRl = jVar.rl();
                        }
                    } else {
                        kgE.j jVarN = jVar.n();
                        if (jVarN == null) {
                            jVarRl = jVar.rl();
                        } else {
                            jVar2 = jVarN;
                            if (jVar2 != null) {
                                I28 i282 = this.J2;
                                Activity activity = this.f46827r;
                                i282.nY.t();
                                g9s g9sVar = i282.te;
                                String str = i282.aYN;
                                List listEF = i282.eF();
                                EnumC1982eO enumC1982eO = i282.WPU;
                                this.f46826n = i282;
                                this.f46828t = 1;
                                Object objT = g9sVar.t(activity, jVar2, str, w6Var, listEF, enumC1982eO, this);
                                if (objT == coroutine_suspended) {
                                    return coroutine_suspended;
                                }
                                i28 = i282;
                                obj = objT;
                            }
                        }
                    }
                    jVar2 = jVarRl;
                    if (jVar2 != null) {
                    }
                }
                return Unit.INSTANCE;
            }
            x0X.n nVar = (x0X.n) obj;
            if (!(nVar instanceof n.C1266n)) {
                if (nVar instanceof n.w6) {
                    if (j.$EnumSwitchMapping$0[((YV.fuX) ((n.w6) nVar).n()).ordinal()] == 1) {
                        i28.xMQ(n.Ml.f8674n);
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class Wre extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f46829n;

        static final class j implements CN3 {

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ I28 f46831n;

            /* JADX INFO: renamed from: com.alightcreative.monetization.ui.I28$Wre$j$j, reason: collision with other inner class name */
            public /* synthetic */ class C0674j {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[Zs.values().length];
                    try {
                        iArr[Zs.f70101O.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[Zs.J2.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            j(I28 i28) {
                this.f46831n = i28;
            }

            @Override // TFv.CN3
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object rl(mg4.n nVar, Continuation continuation) {
                List list;
                mg4.j jVar;
                if (this.f46831n.f46813N == null) {
                    this.f46831n.f46813N = nVar.n();
                    if (this.f46831n.WPU == EnumC1982eO.f64017S && this.f46831n.f46818e.get() == null && (list = (List) nVar.rl().get(mg4.w6.f70998t)) != null && (jVar = (mg4.j) CollectionsKt.firstOrNull(list)) != null) {
                        kgE.j jVarNr = jVar.nr();
                        Integer numN = jVarNr == null ? null : R5.j.n(jVar.O(), jVarNr);
                        if (numN != null) {
                            this.f46831n.f46818e.n(numN.intValue());
                        }
                    }
                }
                if (this.f46831n.nHg) {
                    int i2 = C0674j.$EnumSwitchMapping$0[nVar.O().ordinal()];
                    if (i2 == 1) {
                        this.f46831n.f46816X.n(new eO("PurchaseQueryState is Failed"));
                        this.f46831n.nHg = false;
                    } else if (i2 == 2) {
                        this.f46831n.f46816X.n(Xo.f8360n);
                        this.f46831n.nHg = false;
                    }
                }
                Set setN = nVar.n();
                Set set = this.f46831n.f46813N;
                if (set == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("previouslyHeldBenefits");
                    set = null;
                }
                if (SetsKt.minus(setN, (Iterable) set).isEmpty()) {
                    I28 i28 = this.f46831n;
                    R5.w6 w6Var = (R5.w6) i28.nr();
                    i28.mUb(w6Var != null ? R5.w6.rl(w6Var, nVar, null, false, 0, 0, false, false, null, null, false, 0, false, null, null, false, false, false, 131070, null) : null);
                } else {
                    this.f46831n.nY.ty();
                    this.f46831n.xMQ(new n.w6(C.O(nVar.n())));
                }
                return Unit.INSTANCE;
            }
        }

        Wre(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return I28.this.new Wre(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((Wre) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f46829n;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                TFv.Wre wreN = I28.this.f46819g.n(I28.this.Uo, I28.this.KN, I28.this.xMQ, I28.this.mUb, I28.this.gh, I28.this.qie, I28.this.az, I28.this.ty, I28.this.HI, I28.this.ck, I28.this.Ik, I28.this.f46821r);
                j jVar = new j(I28.this);
                this.f46829n = 1;
                if (wreN.n(jVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    public static final class j {

        /* JADX INFO: renamed from: com.alightcreative.monetization.ui.I28$j$j, reason: collision with other inner class name */
        public static final class C0675j implements ViewModelProvider.Factory {
            final /* synthetic */ Integer HI;
            final /* synthetic */ Boolean Ik;
            final /* synthetic */ String J2;
            final /* synthetic */ String KN;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ String f46832O;
            final /* synthetic */ String Uo;

            /* JADX INFO: renamed from: Z, reason: collision with root package name */
            final /* synthetic */ String f46833Z;
            final /* synthetic */ String az;
            final /* synthetic */ List ck;
            final /* synthetic */ String gh;
            final /* synthetic */ String mUb;
            final /* synthetic */ String nr;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ EnumC1982eO f46834o;
            final /* synthetic */ String qie;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ Boolean f46835r;
            final /* synthetic */ n rl;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ String f46836t;
            final /* synthetic */ String ty;
            final /* synthetic */ String xMQ;

            C0675j(n nVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Integer num, List list, Boolean bool, Boolean bool2, EnumC1982eO enumC1982eO, String str13) {
                this.rl = nVar;
                this.f46836t = str;
                this.nr = str2;
                this.f46832O = str3;
                this.J2 = str4;
                this.Uo = str5;
                this.KN = str6;
                this.xMQ = str7;
                this.mUb = str8;
                this.gh = str9;
                this.qie = str10;
                this.az = str11;
                this.ty = str12;
                this.HI = num;
                this.ck = list;
                this.Ik = bool;
                this.f46835r = bool2;
                this.f46834o = enumC1982eO;
                this.f46833Z = str13;
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public ViewModel t(Class modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                I28 i28N = this.rl.n(this.f46836t, this.nr, this.f46832O, this.J2, this.Uo, this.KN, this.xMQ, this.mUb, this.gh, this.qie, this.az, this.ty, this.HI, this.ck, this.Ik, this.f46835r, this.f46834o, this.f46833Z);
                Intrinsics.checkNotNull(i28N, "null cannot be cast to non-null type T of com.alightcreative.monetization.ui.PaywallViewModel.Companion.provideFactory.<no name provided>.create");
                return i28N;
            }
        }

        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }

        public final ViewModelProvider.Factory n(n assistedFactory, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Integer num, List list, Boolean bool, Boolean bool2, EnumC1982eO enumC1982eO, String str13) {
            Intrinsics.checkNotNullParameter(assistedFactory, "assistedFactory");
            return new C0675j(assistedFactory, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, num, list, bool, bool2, enumC1982eO, str13);
        }
    }

    public interface n {
        I28 n(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Integer num, List list, Boolean bool, Boolean bool2, EnumC1982eO enumC1982eO, String str13);
    }

    public /* synthetic */ class w6 {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EnumC1982eO.values().length];
            try {
                iArr[EnumC1982eO.f64019Z.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC1982eO.J2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC1982eO.f64024r.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC1982eO.f64017S.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC1982eO.f64021g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I28(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, Integer num, List list, Boolean bool, Boolean bool2, EnumC1982eO enumC1982eO, String str13, YV.Wre monopoly, fuX iapManager, fVJ.I28 queryPurchaseStateUsecase, g9s purchaseBillingManager, nYs.Ml getAlightSettingsUseCase, Nf7.j firebasePaywallTracker, fVJ.n countdownPaywallSecondsLeftUseCase, fVJ.j countdownPaywallCardDiscountUseCase, iF eventLogger) {
        super(new Function1() { // from class: cd.l3D
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.alightcreative.monetization.ui.I28.Z((R5.w6) obj);
            }
        });
        Intrinsics.checkNotNullParameter(monopoly, "monopoly");
        Intrinsics.checkNotNullParameter(iapManager, "iapManager");
        Intrinsics.checkNotNullParameter(queryPurchaseStateUsecase, "queryPurchaseStateUsecase");
        Intrinsics.checkNotNullParameter(purchaseBillingManager, "purchaseBillingManager");
        Intrinsics.checkNotNullParameter(getAlightSettingsUseCase, "getAlightSettingsUseCase");
        Intrinsics.checkNotNullParameter(firebasePaywallTracker, "firebasePaywallTracker");
        Intrinsics.checkNotNullParameter(countdownPaywallSecondsLeftUseCase, "countdownPaywallSecondsLeftUseCase");
        Intrinsics.checkNotNullParameter(countdownPaywallCardDiscountUseCase, "countdownPaywallCardDiscountUseCase");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.Uo = str;
        this.KN = str2;
        this.xMQ = str3;
        this.mUb = str4;
        this.gh = str5;
        this.qie = str6;
        this.az = str7;
        this.ty = str8;
        this.HI = str9;
        this.ck = str10;
        this.Ik = str11;
        this.f46821r = str12;
        this.f46820o = num;
        this.f46817Z = list;
        this.XQ = bool;
        this.f46814S = bool2;
        this.WPU = enumC1982eO;
        this.aYN = str13;
        this.ViF = monopoly;
        this.nY = iapManager;
        this.f46819g = queryPurchaseStateUsecase;
        this.te = purchaseBillingManager;
        this.iF = getAlightSettingsUseCase;
        this.fD = firebasePaywallTracker;
        this.E2 = countdownPaywallSecondsLeftUseCase;
        this.f46818e = countdownPaywallCardDiscountUseCase;
        this.f46816X = eventLogger;
    }

    public final void I() {
        M7(false);
    }

    public final void Nxk() {
        M7(false);
    }

    public final void Y() {
        p5(false);
    }

    private final boolean E() {
        return Intrinsics.areEqual(this.aYN, M.f75263n.getValue()) && com.alightcreative.app.motion.persist.j.INSTANCE.isFirstPaywall();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G7(I28 i28, int i2, R5.w6 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        boolean z2 = true;
        if (!state.ty() && i2 != 1) {
            z2 = false;
        }
        i28.mUb(R5.w6.rl(state, null, null, false, i2, 0, false, z2, null, null, false, 0, false, null, null, false, false, false, 130999, null));
        return Unit.INSTANCE;
    }

    private final void Jk() {
        xuv xuvVar = this.s7N;
        if (xuvVar != null) {
            xuv.j.rl(xuvVar, null, 1, null);
        }
        this.s7N = GJW.C.nr(ViewModelKt.n(this), null, null, new C0673I28(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M7(boolean z2) {
        xMQ(n.j.f8675n);
        this.f46816X.n(new j.t6(this.aYN, eF(), z2, this.WPU));
        if (this.nHg) {
            this.f46816X.n(new eO("User closed the paywall before setup completed"));
        }
    }

    private final void Rl() {
        xuv xuvVar = this.f46815T;
        if (xuvVar != null) {
            xuv.j.rl(xuvVar, null, 1, null);
        }
        this.f46815T = GJW.C.nr(ViewModelKt.n(this), null, null, new Wre(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final R5.Ml Z(R5.w6 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return R5.j.nr(it);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a(I28 i28, I28.n.j.EnumC0293j enumC0293j, R5.w6 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        i28.mUb(R5.w6.rl(it, null, null, false, 0, 0, false, false, null, null, false, 0, false, new I28.n.j(enumC0293j), null, false, false, false, 126975, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit dR0(I28 i28, Activity activity, R5.w6 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        GJW.C.nr(ViewModelKt.n(i28), null, null, new Ml(state, i28, activity, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List eF() {
        return CollectionsKt.listOfNotNull((Object[]) new String[]{this.Uo, this.KN, this.xMQ, this.mUb, this.gh, this.qie, this.az, this.ty, this.HI, this.ck, this.Ik, this.f46821r});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit eWT(I28 i28, int i2, R5.w6 state) {
        int i3;
        Intrinsics.checkNotNullParameter(state, "state");
        boolean z2 = true;
        if (state.ty()) {
            i3 = i2;
        } else {
            List list = i28.f46817Z;
            i3 = i2;
            if (i3 != (list != null ? list.size() : mg4.w6.values().length) - 1) {
                z2 = false;
            }
        }
        i28.mUb(R5.w6.rl(state, null, null, false, 0, i3, false, z2, null, null, false, 0, false, null, null, false, false, false, 130991, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ofS(I28 i28, R5.w6 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        int iInvoke = i28.E2.invoke();
        if (iInvoke <= 0) {
            i28.M7(false);
        } else {
            i28.mUb(R5.w6.rl(it, null, null, false, 0, 0, false, false, null, null, false, iInvoke, false, null, null, false, false, false, 130047, null));
            i28.Jk();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r1 != null ? r1.xMQ() : null, R5.I28.j.f8646n) != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void p5(boolean z2) {
        EnumC1982eO enumC1982eO = this.WPU;
        if (enumC1982eO != EnumC1982eO.f64017S) {
            if (enumC1982eO == EnumC1982eO.E2) {
                R5.w6 w6Var = (R5.w6) nr();
            }
            M7(z2);
            return;
        }
        R5.w6 w6Var2 = (R5.w6) nr();
        if (w6Var2 != null && !w6Var2.o()) {
            FX();
        }
        R5.w6 w6Var3 = (R5.w6) nr();
        mUb(w6Var3 != null ? R5.w6.rl(w6Var3, null, null, false, 0, 0, false, false, null, null, false, 0, true, null, null, false, false, false, 129023, null) : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit piY(I28 i28, R5.w6 state) {
        Intrinsics.checkNotNullParameter(state, "state");
        i28.mUb(R5.w6.rl(state, null, null, !state.O(), 0, 0, false, false, null, null, false, 0, false, null, null, false, false, false, 131067, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit xg(I28 i28, R5.w6 it) {
        R5.I28 i282;
        Intrinsics.checkNotNullParameter(it, "it");
        R5.I28 i28XMQ = it.xMQ();
        if (Intrinsics.areEqual(i28XMQ, I28.w6.f8652n)) {
            i282 = I28.n.C0295n.rl;
        } else if (Intrinsics.areEqual(i28XMQ, I28.n.C0295n.rl)) {
            i282 = I28.n.w6.rl;
        } else {
            if (!(i28XMQ instanceof I28.n.j)) {
                return Unit.INSTANCE;
            }
            i282 = I28.j.f8646n;
        }
        R5.I28 i283 = i282;
        if (i283 instanceof I28.n.w6) {
            i28.f46816X.n(j.zpl.f8606n);
        }
        if (i283 instanceof I28.j) {
            i28.f46816X.n(new j.IE(i28.aYN, i28.eF(), i28.WPU));
        }
        i28.mUb(R5.w6.rl(it, null, null, false, 0, 0, false, false, null, null, false, 0, false, i283, null, false, false, false, 126975, null));
        return Unit.INSTANCE;
    }

    public final void C() {
        this.f46816X.n(new j.fuX("iap_click_retry", null, 2, null));
        if (E()) {
            this.f46816X.n(C1450z.f8623n);
            this.nHg = true;
        }
        Rl();
    }

    public final void D(final I28.n.j.EnumC0293j chosenBox) {
        Intrinsics.checkNotNullParameter(chosenBox, "chosenBox");
        gh(new Function1() { // from class: cd.UGc
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.alightcreative.monetization.ui.I28.a(this.f43713n, chosenBox, (R5.w6) obj);
            }
        });
    }

    public final void FX() {
        this.f46816X.n(new j.W(this.WPU));
    }

    public final void J() {
        EnumC1982eO enumC1982eO = this.WPU;
        int i2 = enumC1982eO == null ? -1 : w6.$EnumSwitchMapping$0[enumC1982eO.ordinal()];
        if (i2 == 4 || i2 == 5) {
            GR();
        }
    }

    public final void M() {
        this.f46816X.n(new j.D(this.WPU));
    }

    public final void Mx(final int i2) {
        gh(new Function1() { // from class: cd.s4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.alightcreative.monetization.ui.I28.G7(this.f43751n, i2, (R5.w6) obj);
            }
        });
    }

    @Override // uW.w6
    public void O(Lifecycle lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        lifecycle.n(this.fD);
    }

    @Override // uW.w6
    public void Uo() {
        List listListOf;
        PlayfulUnlockStyle playfulUnlockStyleG;
        if (E()) {
            this.f46816X.n(C1450z.f8623n);
            this.nHg = true;
        }
        if (this.WPU == EnumC1982eO.f64017S && !this.E2.n()) {
            this.E2.rl();
        }
        EnumC1982eO enumC1982eO = this.WPU;
        boolean z2 = enumC1982eO == EnumC1982eO.E2;
        Integer num = this.f46820o;
        int iIntValue = num != null ? num.intValue() : 0;
        Boolean bool = this.XQ;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        EnumC1982eO enumC1982eO2 = this.WPU;
        int i2 = enumC1982eO2 == null ? -1 : w6.$EnumSwitchMapping$0[enumC1982eO2.ordinal()];
        boolean z3 = ((i2 == 1 || i2 == 2 || i2 == 3) && Intrinsics.areEqual(this.f46814S, Boolean.TRUE)) ? false : true;
        List list = this.f46817Z;
        if (list != null) {
            listListOf = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                listListOf.add(mg4.w6.values()[((Number) it.next()).intValue()]);
            }
        } else {
            listListOf = CollectionsKt.listOf(mg4.w6.f70997n);
        }
        List list2 = listListOf;
        mg4.w6 w6Var = mg4.w6.f70997n;
        CloudBenefitValues cloudBenefitValues = (CloudBenefitValues) this.nY.Z().getValue();
        Pair pair = TuplesKt.to(w6Var, cloudBenefitValues != null ? XFr.j.n(XFr.j.J2(cloudBenefitValues.getLowTier())) : null);
        mg4.w6 w6Var2 = mg4.w6.f70998t;
        CloudBenefitValues cloudBenefitValues2 = (CloudBenefitValues) this.nY.Z().getValue();
        Map mapMapOf = MapsKt.mapOf(pair, TuplesKt.to(w6Var2, cloudBenefitValues2 != null ? XFr.j.n(XFr.j.J2(cloudBenefitValues2.getHighTier())) : null));
        nYs.j jVarInvoke = this.iF.invoke();
        boolean zV2 = jVarInvoke != null ? jVarInvoke.v() : false;
        int iInvoke = this.E2.invoke();
        I28.w6 w6Var3 = I28.w6.f8652n;
        EnumC1982eO enumC1982eO3 = this.WPU;
        EnumC1982eO enumC1982eO4 = EnumC1982eO.E2;
        I28.w6 w6Var4 = enumC1982eO3 == enumC1982eO4 ? w6Var3 : null;
        nYs.j jVarInvoke2 = this.iF.invoke();
        if (jVarInvoke2 == null || (playfulUnlockStyleG = jVarInvoke2.g()) == null) {
            playfulUnlockStyleG = PlayfulUnlockStyle.CALM;
        }
        PlayfulUnlockStyle playfulUnlockStyle = playfulUnlockStyleG;
        nYs.j jVarInvoke3 = this.iF.invoke();
        boolean zViF = jVarInvoke3 != null ? jVarInvoke3.ViF() : false;
        nYs.j jVarInvoke4 = this.iF.invoke();
        mUb(new R5.w6(null, enumC1982eO, z2, iIntValue, 0, zBooleanValue, z3, list2, mapMapOf, zV2, iInvoke, false, w6Var4, playfulUnlockStyle, zViF, false, jVarInvoke4 != null ? jVarInvoke4.aYN() : false));
        Rl();
        if (this.WPU == enumC1982eO4) {
            this.f46816X.n(j.ibE.f8517n);
        } else {
            this.f46816X.n(new j.IE(this.aYN, eF(), this.WPU));
        }
        if (this.WPU == EnumC1982eO.f64017S) {
            Jk();
        }
    }

    public final void eTf() {
        gh(new Function1() { // from class: cd.c
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.alightcreative.monetization.ui.I28.xg(this.f43724n, (R5.w6) obj);
            }
        });
    }

    public final void fcU(final int i2) {
        gh(new Function1() { // from class: cd.r
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.alightcreative.monetization.ui.I28.eWT(this.f43749n, i2, (R5.w6) obj);
            }
        });
    }

    public final void k(final Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        gh(new Function1() { // from class: cd.Q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.alightcreative.monetization.ui.I28.dR0(this.f43710n, activity, (R5.w6) obj);
            }
        });
    }

    public final void m() {
        this.f46816X.n(j.OB3.f8433n);
    }

    public final void pJg() {
        if (this.WPU == EnumC1982eO.f64017S) {
            gh(new Function1() { // from class: cd.ci
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return com.alightcreative.monetization.ui.I28.ofS(this.f43725n, (R5.w6) obj);
                }
            });
        }
    }

    public final void ul() {
        xMQ(n.I28.f8673n);
        this.f46816X.n(new j.U(this.aYN, eF(), this.WPU));
    }

    public final void z() {
        gh(new Function1() { // from class: cd.SPz
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return com.alightcreative.monetization.ui.I28.piY(this.f43712n, (R5.w6) obj);
            }
        });
    }

    private final boolean n1() {
        R5.I28 i28XMQ;
        R5.w6 w6Var = (R5.w6) nr();
        if (w6Var != null && !w6Var.ty()) {
            return false;
        }
        if (this.WPU != EnumC1982eO.E2) {
            return true;
        }
        R5.w6 w6Var2 = (R5.w6) nr();
        R5.I28 i28XMQ2 = null;
        if (w6Var2 != null) {
            i28XMQ = w6Var2.xMQ();
        } else {
            i28XMQ = null;
        }
        if (Intrinsics.areEqual(i28XMQ, I28.w6.f8652n)) {
            return false;
        }
        R5.w6 w6Var3 = (R5.w6) nr();
        if (w6Var3 != null) {
            i28XMQ2 = w6Var3.xMQ();
        }
        if (Intrinsics.areEqual(i28XMQ2, I28.j.f8646n)) {
            return true;
        }
        nYs.j jVarInvoke = this.iF.invoke();
        if (jVarInvoke == null || !jVarInvoke.nY()) {
            return false;
        }
        return true;
    }

    public final void B() {
        if (n1()) {
            p5(true);
        }
    }

    public final void GR() {
        R5.w6 w6VarRl;
        R5.w6 w6Var = (R5.w6) nr();
        if (w6Var != null && w6Var.o()) {
            M();
        }
        R5.w6 w6Var2 = (R5.w6) nr();
        if (w6Var2 != null) {
            w6VarRl = R5.w6.rl(w6Var2, null, null, false, 0, 0, false, false, null, null, false, 0, false, null, null, false, false, false, 129023, null);
        } else {
            w6VarRl = null;
        }
        mUb(w6VarRl);
    }

    public final void ijL() {
        mg4.n nVarCk;
        String strNr;
        R5.w6 w6Var = (R5.w6) nr();
        if (w6Var != null && (nVarCk = w6Var.ck()) != null && (strNr = nVarCk.nr()) != null) {
            xMQ(new n.C0299n(strNr));
        }
    }
}
