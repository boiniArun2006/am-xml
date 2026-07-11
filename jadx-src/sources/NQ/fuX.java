package NQ;

import GJW.C;
import GJW.Lu;
import GJW.OU;
import GJW.vd;
import NQ.Dsr;
import NQ.Dsr.j;
import ScC.w6;
import TFv.Z;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.rewarded.RewardedAd;
import dI8.I28;
import dI8.Ml;
import dI8.n;
import java.util.concurrent.atomic.AtomicBoolean;
import k.InterfaceC2202n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class fuX extends NQ.j implements ScC.w6 {
    private final Context J2;
    private final Function1 KN;
    private final InterfaceC2202n Uo;
    private final InterfaceC2202n.InterfaceC1003n gh;
    private final vd mUb;
    private AtomicBoolean qie;
    private final Function1 xMQ;
    private static final j az = new j(null);
    public static final int ty = 8;
    private static final k.I28 HI = k.I28.f69641Z;

    static final class I28 extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ String f7036O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f7037n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        I28(String str, Continuation continuation) {
            super(1, continuation);
            this.f7036O = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return fuX.this.new I28(this.f7036O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            I28 i28;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f7037n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    i28 = this;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                Context contextTy = fuX.this.ty();
                String str = this.f7036O;
                this.f7037n = 1;
                i28 = this;
                obj = ee.n.rl(contextTy, str, null, i28, 4, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            x0X.n nVar = (x0X.n) obj;
            fuX fux = fuX.this;
            if (nVar instanceof n.C1266n) {
                return new n.C1266n(Tv6.Ml.n((LoadAdError) ((n.C1266n) nVar).n()));
            }
            if (nVar instanceof n.w6) {
                RewardedAd rewardedAd = (RewardedAd) ((n.w6) nVar).n();
                return new n.w6(fux.J2().new j(rewardedAd, rewardedAd.getResponseInfo(), System.currentTimeMillis()));
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((I28) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class Ml extends ContinuationImpl {
        /* synthetic */ Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f7039O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f7040n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f7041o;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f7043t;

        Ml(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.J2 = obj;
            this.f7041o |= Integer.MIN_VALUE;
            return fuX.this.nr(null, null, this);
        }
    }

    private static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    static final class n extends ContinuationImpl {
        int E2;
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f7044O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        /* synthetic */ Object f7045S;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        long f7046Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f7048n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        boolean f7049o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f7050r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f7051t;

        n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f7045S = obj;
            this.E2 |= Integer.MIN_VALUE;
            return fuX.this.rl(null, null, false, null, this);
        }
    }

    static final class w6 extends SuspendLambda implements Function2 {
        final /* synthetic */ w6.n J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ RewardedAd f7052O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f7053n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((w6) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w6(RewardedAd rewardedAd, w6.n nVar, Continuation continuation) {
            super(2, continuation);
            this.f7052O = rewardedAd;
            this.J2 = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return fuX.this.new w6(this.f7052O, this.J2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f7053n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                fuX fux = fuX.this;
                String adUnitId = this.f7052O.getAdUnitId();
                Intrinsics.checkNotNullExpressionValue(adUnitId, "getAdUnitId(...)");
                w6.n nVar = this.J2;
                this.f7053n = 1;
                if (fux.nr(adUnitId, nVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ fuX(Context context, InterfaceC2202n interfaceC2202n, Function1 function1, Function1 function12, rB.Ml ml, vd vdVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, interfaceC2202n, function1, function12, ml, (i2 & 32) != 0 ? Lu.n(OU.t()) : vdVar);
    }

    static /* synthetic */ Object Z(fuX fux, String str, w6.n nVar, long j2, Continuation continuation, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            j2 = fux.gh.n().O();
        }
        return fux.o(str, nVar, j2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(fuX fux, RewardedAd rewardedAd, ResponseInfo responseInfo, w6.n nVar, AdValue adValue) {
        Intrinsics.checkNotNullParameter(adValue, "adValue");
        Function1 function1HI = fux.HI();
        Ak.Ml mlUo = fux.Uo();
        String adUnitId = rewardedAd.getAdUnitId();
        Intrinsics.checkNotNullExpressionValue(adUnitId, "getAdUnitId(...)");
        String responseId = responseInfo != null ? responseInfo.getResponseId() : null;
        String mediationAdapterClassName = responseInfo != null ? responseInfo.getMediationAdapterClassName() : null;
        Long lValueOf = Long.valueOf(adValue.getValueMicros());
        String currencyCode = adValue.getCurrencyCode();
        Intrinsics.checkNotNullExpressionValue(currencyCode, "getCurrencyCode(...)");
        function1HI.invoke(mlUo.HI(adUnitId, responseId, mediationAdapterClassName, lValueOf, currencyCode, nVar.t(), nVar.n()));
        return Unit.INSTANCE;
    }

    public Function1 HI() {
        return this.xMQ;
    }

    @Override // NQ.j
    public InterfaceC2202n O() {
        return this.Uo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0096, code lost:
    
        if (r12 == r0) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // ScC.w6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object nr(String str, w6.n nVar, Continuation continuation) {
        Ml ml;
        fuX fux;
        if (continuation instanceof Ml) {
            ml = (Ml) continuation;
            int i2 = ml.f7041o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ml.f7041o = i2 - Integer.MIN_VALUE;
            } else {
                ml = new Ml(continuation);
            }
        }
        Ml ml2 = ml;
        Object objViF = ml2.J2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = ml2.f7041o;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objViF);
            if (!this.gh.isEnabled()) {
                return new n.C1266n(n.j.f63485n);
            }
            Z zNr = O().nr();
            ml2.f7040n = this;
            ml2.f7043t = str;
            ml2.f7039O = nVar;
            ml2.f7041o = 1;
            objViF = TFv.fuX.ViF(zNr, ml2);
            if (objViF != coroutine_suspended) {
                fux = this;
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objViF);
            x0X.n nVar2 = (x0X.n) objViF;
            if (nVar2 instanceof n.C1266n) {
                return nVar2;
            }
            if (!(nVar2 instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            return new n.w6(Unit.INSTANCE);
        }
        nVar = (w6.n) ml2.f7039O;
        str = (String) ml2.f7043t;
        fux = (fuX) ml2.f7040n;
        ResultKt.throwOnFailure(objViF);
        w6.n nVar3 = nVar;
        if (!((Boolean) objViF).booleanValue()) {
            return new n.C1266n(n.Ml.f63483n);
        }
        ml2.f7040n = null;
        ml2.f7043t = null;
        ml2.f7039O = null;
        ml2.f7041o = 2;
        objViF = Z(fux, str, nVar3, 0L, ml2, 4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02a4  */
    @Override // ScC.w6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object rl(Activity activity, String str, boolean z2, w6.n nVar, Continuation continuation) {
        n nVar2;
        String str2;
        w6.n nVar3;
        boolean z3;
        Activity activity2;
        fuX fux;
        String str3;
        w6.n nVar4;
        long j2;
        x0X.n nVar5;
        Dsr.j jVar;
        final fuX fux2;
        final w6.n nVar6;
        fuX fux3;
        w6.n nVar7;
        Activity activity3;
        Object objT;
        ResponseInfo responseInfo;
        RewardedAd rewardedAd;
        w6.n nVar8;
        fuX fux4;
        K6D.j jVar2;
        K6D.Ml mlO;
        x0X.n nVar9;
        x0X.n nVar10;
        String str4;
        if (continuation instanceof n) {
            nVar2 = (n) continuation;
            int i2 = nVar2.E2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar2.E2 = i2 - Integer.MIN_VALUE;
            } else {
                nVar2 = new n(continuation);
            }
        }
        n nVar11 = nVar2;
        Object objViF = nVar11.f7045S;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = nVar11.E2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objViF);
            if (!this.gh.isEnabled()) {
                return new n.C1266n(Ml.j.f63478n);
            }
            Z zNr = O().nr();
            nVar11.f7048n = this;
            nVar11.f7051t = activity;
            str2 = str;
            nVar11.f7044O = str2;
            nVar3 = nVar;
            nVar11.J2 = nVar3;
            z3 = z2;
            nVar11.f7049o = z3;
            nVar11.E2 = 1;
            objViF = TFv.fuX.ViF(zNr, nVar11);
            if (objViF != coroutine_suspended) {
                activity2 = activity;
                fux = this;
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 == 2) {
                long j3 = nVar11.f7046Z;
                nVar4 = (w6.n) nVar11.J2;
                String str5 = (String) nVar11.f7044O;
                Activity activity4 = (Activity) nVar11.f7051t;
                fuX fux5 = (fuX) nVar11.f7048n;
                ResultKt.throwOnFailure(objViF);
                str3 = str5;
                fux = fux5;
                activity2 = activity4;
                j2 = j3;
                nVar5 = (x0X.n) objViF;
                if (!(nVar5 instanceof n.C1266n)) {
                    fux.qie.set(false);
                    return new n.C1266n(new Ml.C0836Ml(((dI8.n) ((n.C1266n) nVar5).n()).getMessage()));
                }
                if (!(nVar5 instanceof n.w6)) {
                    throw new NoWhenBranchMatchedException();
                }
                jVar = (Dsr.j) ((n.w6) nVar5).n();
                if (aC.n(jVar)) {
                    rB.Ml mlKN = fux.KN();
                    if (mlKN != null) {
                        tCX.j.KN(mlKN, HI, "admob");
                    }
                    fux.J2().nr(str3);
                    nVar11.f7048n = fux;
                    nVar11.f7051t = activity2;
                    nVar11.f7044O = str3;
                    nVar11.J2 = nVar4;
                    nVar11.E2 = 3;
                    objViF = fux.o(str3, nVar4, j2, nVar11);
                    if (objViF != coroutine_suspended) {
                        fux3 = fux;
                        nVar7 = nVar4;
                        activity3 = activity2;
                        nVar9 = (x0X.n) objViF;
                        if (!(nVar9 instanceof n.C1266n)) {
                        }
                    }
                    return coroutine_suspended;
                }
                fux2 = fux;
                nVar6 = nVar4;
                final RewardedAd rewardedAd2 = (RewardedAd) jVar.n();
                final ResponseInfo responseInfoRl = jVar.rl();
                Ak.Ml mlUo = fux2.Uo();
                String adUnitId = rewardedAd2.getAdUnitId();
                Intrinsics.checkNotNullExpressionValue(adUnitId, "getAdUnitId(...)");
                k.Ml mlUo2 = mlUo.Uo(adUnitId, responseInfoRl == null ? responseInfoRl.getResponseId() : null, responseInfoRl == null ? responseInfoRl.getMediationAdapterClassName() : null, nVar6.t(), nVar6.n(), nVar6.rl());
                fux2.xMQ().invoke(mlUo2);
                rB.Ml mlKN2 = fux2.KN();
                if (mlKN2 != null) {
                }
                Function0 function0 = new Function0() { // from class: NQ.I28
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return fuX.ck(this.f7006n, rewardedAd2, responseInfoRl, nVar6);
                    }
                };
                Function0 function02 = new Function0() { // from class: NQ.Wre
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return fuX.Ik(this.f7028n, rewardedAd2, responseInfoRl, nVar6);
                    }
                };
                Function1 function1 = new Function1() { // from class: NQ.CN3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return fuX.r(this.f7000n, rewardedAd2, responseInfoRl, nVar6, (AdValue) obj);
                    }
                };
                nVar11.f7048n = fux2;
                nVar11.f7051t = nVar6;
                nVar11.f7044O = rewardedAd2;
                nVar11.J2 = responseInfoRl;
                nVar11.f7050r = jVarRl;
                nVar11.E2 = 4;
                objT = ee.n.t(rewardedAd2, activity2, function0, function02, function1, nVar11);
                if (objT != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i3 != 3) {
                if (i3 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jVar2 = (K6D.j) nVar11.f7050r;
                responseInfo = (ResponseInfo) nVar11.J2;
                rewardedAd = (RewardedAd) nVar11.f7044O;
                nVar8 = (w6.n) nVar11.f7051t;
                fux4 = (fuX) nVar11.f7048n;
                ResultKt.throwOnFailure(objViF);
                nVar10 = (x0X.n) objViF;
                Dsr dsrJ2 = fux4.J2();
                String adUnitId2 = rewardedAd.getAdUnitId();
                Intrinsics.checkNotNullExpressionValue(adUnitId2, "getAdUnitId(...)");
                dsrJ2.nr(adUnitId2);
                if (fux4.gh.n().rl()) {
                    str4 = null;
                } else {
                    str4 = null;
                    C.nr(fux4.mUb, null, null, fux4.new w6(rewardedAd, nVar8, null), 3, null);
                }
                fux4.qie.set(false);
                if (!(nVar10 instanceof n.C1266n)) {
                    Tv6.j jVar3 = (Tv6.j) ((n.C1266n) nVar10).n();
                    Ak.Ml mlUo3 = fux4.Uo();
                    String adUnitId3 = rewardedAd.getAdUnitId();
                    Intrinsics.checkNotNullExpressionValue(adUnitId3, "getAdUnitId(...)");
                    k.Ml mlO2 = mlUo3.O(adUnitId3, responseInfo != null ? responseInfo.getResponseId() : str4, responseInfo != null ? responseInfo.getMediationAdapterClassName() : str4, jVar3, nVar8.t(), nVar8.n(), nVar8.rl());
                    fux4.xMQ().invoke(mlO2);
                    if (jVar2 != null) {
                        tCX.j.J2(jVar2, jVar3, "admob", mlO2.rl());
                    }
                    return new n.C1266n(Tv6.n.t(jVar3));
                }
                if (!(nVar10 instanceof n.w6)) {
                    throw new NoWhenBranchMatchedException();
                }
                boolean zBooleanValue = ((Boolean) ((n.w6) nVar10).n()).booleanValue();
                Ak.Ml mlUo4 = fux4.Uo();
                String adUnitId4 = rewardedAd.getAdUnitId();
                Intrinsics.checkNotNullExpressionValue(adUnitId4, "getAdUnitId(...)");
                k.Ml mlN = mlUo4.n(adUnitId4, responseInfo != null ? responseInfo.getResponseId() : str4, responseInfo != null ? responseInfo.getMediationAdapterClassName() : str4, nVar8.t(), nVar8.n(), nVar8.rl());
                fux4.xMQ().invoke(mlN);
                if (jVar2 != null) {
                    jVar2.n(tCX.j.n(mlN).J2());
                }
                return zBooleanValue ? new n.w6(I28.n.f63474n) : new n.w6(I28.j.f63473n);
            }
            nVar7 = (w6.n) nVar11.J2;
            str3 = (String) nVar11.f7044O;
            activity3 = (Activity) nVar11.f7051t;
            fux3 = (fuX) nVar11.f7048n;
            ResultKt.throwOnFailure(objViF);
            nVar9 = (x0X.n) objViF;
            if (!(nVar9 instanceof n.C1266n)) {
                fux3.qie.set(false);
                return new n.C1266n(new Ml.C0836Ml(((dI8.n) ((n.C1266n) nVar9).n()).getMessage()));
            }
            if (!(nVar9 instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            jVar = (Dsr.j) ((n.w6) nVar9).n();
            nVar6 = nVar7;
            activity2 = activity3;
            fux2 = fux3;
            final RewardedAd rewardedAd22 = (RewardedAd) jVar.n();
            final ResponseInfo responseInfoRl2 = jVar.rl();
            Ak.Ml mlUo5 = fux2.Uo();
            String adUnitId5 = rewardedAd22.getAdUnitId();
            Intrinsics.checkNotNullExpressionValue(adUnitId5, "getAdUnitId(...)");
            k.Ml mlUo22 = mlUo5.Uo(adUnitId5, responseInfoRl2 == null ? responseInfoRl2.getResponseId() : null, responseInfoRl2 == null ? responseInfoRl2.getMediationAdapterClassName() : null, nVar6.t(), nVar6.n(), nVar6.rl());
            fux2.xMQ().invoke(mlUo22);
            rB.Ml mlKN22 = fux2.KN();
            K6D.j jVarRl = (mlKN22 != null || (mlO = mlKN22.O()) == null) ? null : mlO.rl(tCX.j.n(mlUo22), str3);
            Function0 function03 = new Function0() { // from class: NQ.I28
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return fuX.ck(this.f7006n, rewardedAd22, responseInfoRl2, nVar6);
                }
            };
            Function0 function022 = new Function0() { // from class: NQ.Wre
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return fuX.Ik(this.f7028n, rewardedAd22, responseInfoRl2, nVar6);
                }
            };
            Function1 function12 = new Function1() { // from class: NQ.CN3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return fuX.r(this.f7000n, rewardedAd22, responseInfoRl2, nVar6, (AdValue) obj);
                }
            };
            nVar11.f7048n = fux2;
            nVar11.f7051t = nVar6;
            nVar11.f7044O = rewardedAd22;
            nVar11.J2 = responseInfoRl2;
            nVar11.f7050r = jVarRl;
            nVar11.E2 = 4;
            objT = ee.n.t(rewardedAd22, activity2, function03, function022, function12, nVar11);
            if (objT != coroutine_suspended) {
                responseInfo = responseInfoRl2;
                objViF = objT;
                rewardedAd = rewardedAd22;
                nVar8 = nVar6;
                fux4 = fux2;
                jVar2 = jVarRl;
                nVar10 = (x0X.n) objViF;
                Dsr dsrJ22 = fux4.J2();
                String adUnitId22 = rewardedAd.getAdUnitId();
                Intrinsics.checkNotNullExpressionValue(adUnitId22, "getAdUnitId(...)");
                dsrJ22.nr(adUnitId22);
                if (fux4.gh.n().rl()) {
                }
                fux4.qie.set(false);
                if (!(nVar10 instanceof n.C1266n)) {
                }
            }
            return coroutine_suspended;
        }
        boolean z4 = nVar11.f7049o;
        w6.n nVar12 = (w6.n) nVar11.J2;
        String str6 = (String) nVar11.f7044O;
        activity2 = (Activity) nVar11.f7051t;
        fuX fux6 = (fuX) nVar11.f7048n;
        ResultKt.throwOnFailure(objViF);
        z3 = z4;
        fux = fux6;
        nVar3 = nVar12;
        str2 = str6;
        if (!((Boolean) objViF).booleanValue()) {
            return new n.C1266n(Ml.I28.f63475n);
        }
        if (fux.qie.getAndSet(true)) {
            n.C1266n c1266n = new n.C1266n(Ml.n.f63480n);
            rB.Ml mlKN3 = fux.KN();
            if (mlKN3 != null) {
                tCX.j.O(mlKN3, HI, "admob");
            }
            return c1266n;
        }
        if (z3) {
            fux.xMQ().invoke(fux.Uo().ty(str2, nVar3.t(), nVar3.n()));
        }
        long jT2 = fux.gh.n().t();
        nVar11.f7048n = fux;
        nVar11.f7051t = activity2;
        nVar11.f7044O = str2;
        nVar11.J2 = nVar3;
        nVar11.f7046Z = jT2;
        nVar11.E2 = 2;
        str3 = str2;
        nVar4 = nVar3;
        j2 = jT2;
        objViF = fux.o(str3, nVar4, j2, nVar11);
        if (objViF != coroutine_suspended) {
            nVar5 = (x0X.n) objViF;
            if (!(nVar5 instanceof n.C1266n)) {
            }
        }
        return coroutine_suspended;
    }

    public Context ty() {
        return this.J2;
    }

    @Override // NQ.j
    public Function1 xMQ() {
        return this.KN;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fuX(Context context, InterfaceC2202n adOrable, Function1 trackEvent, Function1 trackAdRevenueEvent, rB.Ml ml, vd loadScope) {
        super(HI, loadScope, ml);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adOrable, "adOrable");
        Intrinsics.checkNotNullParameter(trackEvent, "trackEvent");
        Intrinsics.checkNotNullParameter(trackAdRevenueEvent, "trackAdRevenueEvent");
        Intrinsics.checkNotNullParameter(loadScope, "loadScope");
        this.J2 = context;
        this.Uo = adOrable;
        this.KN = trackEvent;
        this.xMQ = trackAdRevenueEvent;
        this.mUb = loadScope;
        this.gh = O().getConfig();
        this.qie = new AtomicBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Ik(fuX fux, RewardedAd rewardedAd, ResponseInfo responseInfo, w6.n nVar) {
        String responseId;
        Function1 function1XMQ = fux.xMQ();
        Ak.Ml mlUo = fux.Uo();
        String adUnitId = rewardedAd.getAdUnitId();
        Intrinsics.checkNotNullExpressionValue(adUnitId, "getAdUnitId(...)");
        String mediationAdapterClassName = null;
        if (responseInfo != null) {
            responseId = responseInfo.getResponseId();
        } else {
            responseId = null;
        }
        if (responseInfo != null) {
            mediationAdapterClassName = responseInfo.getMediationAdapterClassName();
        }
        function1XMQ.invoke(mlUo.t(adUnitId, responseId, mediationAdapterClassName, nVar.t(), nVar.n(), nVar.rl()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ck(fuX fux, RewardedAd rewardedAd, ResponseInfo responseInfo, w6.n nVar) {
        String responseId;
        Function1 function1XMQ = fux.xMQ();
        Ak.Ml mlUo = fux.Uo();
        String adUnitId = rewardedAd.getAdUnitId();
        Intrinsics.checkNotNullExpressionValue(adUnitId, "getAdUnitId(...)");
        String mediationAdapterClassName = null;
        if (responseInfo != null) {
            responseId = responseInfo.getResponseId();
        } else {
            responseId = null;
        }
        if (responseInfo != null) {
            mediationAdapterClassName = responseInfo.getMediationAdapterClassName();
        }
        function1XMQ.invoke(mlUo.xMQ(adUnitId, responseId, mediationAdapterClassName, nVar.t(), nVar.n(), nVar.rl()));
        return Unit.INSTANCE;
    }

    private final Object o(String str, w6.n nVar, long j2, Continuation continuation) {
        return mUb(str, nVar.t(), nVar.n(), j2, new I28(str, null), continuation);
    }
}
