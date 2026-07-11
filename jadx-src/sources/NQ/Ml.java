package NQ;

import GJW.C;
import GJW.Lu;
import GJW.OU;
import GJW.vd;
import NQ.Dsr;
import NQ.Dsr.j;
import ScC.n;
import TFv.Z;
import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import dI8.n;
import dI8.w6;
import ee.AbstractC1964j;
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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class Ml extends NQ.j implements ScC.n {
    private final Context J2;
    private final Function1 KN;
    private final InterfaceC2202n Uo;
    private AtomicBoolean gh;
    private final vd mUb;
    private final InterfaceC2202n.InterfaceC1003n qie;
    private final Function1 xMQ;
    private static final j az = new j(null);
    public static final int ty = 8;
    private static final k.I28 HI = k.I28.f69644r;

    static final class I28 extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ String f7008O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f7009n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        I28(String str, Continuation continuation) {
            super(1, continuation);
            this.f7008O = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return Ml.this.new I28(this.f7008O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            I28 i28;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f7009n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    i28 = this;
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                Context contextAz = Ml.this.az();
                String str = this.f7008O;
                this.f7009n = 1;
                i28 = this;
                obj = AbstractC1964j.t(contextAz, str, null, i28, 4, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            x0X.n nVar = (x0X.n) obj;
            Ml ml = Ml.this;
            if (nVar instanceof n.C1266n) {
                return new n.C1266n(Tv6.Ml.n((LoadAdError) ((n.C1266n) nVar).n()));
            }
            if (nVar instanceof n.w6) {
                InterstitialAd interstitialAd = (InterstitialAd) ((n.w6) nVar).n();
                return new n.w6(ml.J2().new j(interstitialAd, interstitialAd.getResponseInfo(), System.currentTimeMillis()));
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((I28) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: NQ.Ml$Ml, reason: collision with other inner class name */
    static final class C0237Ml extends ContinuationImpl {
        /* synthetic */ Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f7011O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f7012n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f7013o;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f7015t;

        C0237Ml(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.J2 = obj;
            this.f7013o |= Integer.MIN_VALUE;
            return Ml.this.t(null, null, this);
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
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f7016O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        /* synthetic */ Object f7018Z;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f7019g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f7020n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        long f7021o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f7022r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f7023t;

        n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f7018Z = obj;
            this.f7019g |= Integer.MIN_VALUE;
            return Ml.this.n(null, null, null, this);
        }
    }

    static final class w6 extends SuspendLambda implements Function2 {
        final /* synthetic */ n.C0320n J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ InterstitialAd f7024O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f7025n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((w6) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w6(InterstitialAd interstitialAd, n.C0320n c0320n, Continuation continuation) {
            super(2, continuation);
            this.f7024O = interstitialAd;
            this.J2 = c0320n;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return Ml.this.new w6(this.f7024O, this.J2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f7025n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                Ml ml = Ml.this;
                String adUnitId = this.f7024O.getAdUnitId();
                Intrinsics.checkNotNullExpressionValue(adUnitId, "getAdUnitId(...)");
                n.C0320n c0320n = this.J2;
                this.f7025n = 1;
                if (ml.t(adUnitId, c0320n, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ Ml(Context context, InterfaceC2202n interfaceC2202n, Function1 function1, Function1 function12, rB.Ml ml, vd vdVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, interfaceC2202n, function1, function12, ml, (i2 & 32) != 0 ? Lu.n(OU.t()) : vdVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ck(Ml ml, InterstitialAd interstitialAd, ResponseInfo responseInfo, n.C0320n c0320n, AdValue adValue) {
        Intrinsics.checkNotNullParameter(adValue, "adValue");
        Function1 function1Ty = ml.ty();
        Ak.Ml mlUo = ml.Uo();
        String adUnitId = interstitialAd.getAdUnitId();
        Intrinsics.checkNotNullExpressionValue(adUnitId, "getAdUnitId(...)");
        String responseId = responseInfo != null ? responseInfo.getResponseId() : null;
        String mediationAdapterClassName = responseInfo != null ? responseInfo.getMediationAdapterClassName() : null;
        Long lValueOf = Long.valueOf(adValue.getValueMicros());
        String currencyCode = adValue.getCurrencyCode();
        Intrinsics.checkNotNullExpressionValue(currencyCode, "getCurrencyCode(...)");
        function1Ty.invoke(mlUo.HI(adUnitId, responseId, mediationAdapterClassName, lValueOf, currencyCode, c0320n.rl(), c0320n.n()));
        return Unit.INSTANCE;
    }

    static /* synthetic */ Object r(Ml ml, String str, n.C0320n c0320n, long j2, Continuation continuation, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            j2 = ml.qie.n().O();
        }
        return ml.Ik(str, c0320n, j2, continuation);
    }

    @Override // NQ.j
    public InterfaceC2202n O() {
        return this.Uo;
    }

    public Context az() {
        return this.J2;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02a6  */
    @Override // ScC.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(Activity activity, String str, n.C0320n c0320n, Continuation continuation) {
        n nVar;
        String str2;
        Object obj;
        Activity activity2;
        n.C0320n c0320n2;
        Ml ml;
        final n.C0320n c0320n3;
        String str3;
        long j2;
        Ml ml2;
        Activity activity3;
        x0X.n nVar2;
        Dsr.j jVar;
        final Ml ml3;
        n.C0320n c0320n4;
        Activity activity4;
        Object objN;
        K6D.j jVar2;
        InterstitialAd interstitialAd;
        ResponseInfo responseInfo;
        K6D.Ml mlO;
        x0X.n nVar3;
        x0X.n nVar4;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i2 = nVar.f7019g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.f7019g = i2 - Integer.MIN_VALUE;
            } else {
                nVar = new n(continuation);
            }
        }
        n nVar5 = nVar;
        Object objIk = nVar5.f7018Z;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = nVar5.f7019g;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objIk);
            if (!this.qie.isEnabled()) {
                return new n.C1266n(w6.j.f63493n);
            }
            Z zNr = O().nr();
            nVar5.f7020n = this;
            nVar5.f7023t = activity;
            str2 = str;
            nVar5.f7016O = str2;
            nVar5.J2 = c0320n;
            nVar5.f7019g = 1;
            Object objViF = TFv.fuX.ViF(zNr, nVar5);
            if (objViF != coroutine_suspended) {
                obj = objViF;
                activity2 = activity;
                c0320n2 = c0320n;
                ml = this;
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 == 2) {
                long j3 = nVar5.f7021o;
                c0320n3 = (n.C0320n) nVar5.J2;
                String str4 = (String) nVar5.f7016O;
                Activity activity5 = (Activity) nVar5.f7023t;
                Ml ml4 = (Ml) nVar5.f7020n;
                ResultKt.throwOnFailure(objIk);
                activity3 = activity5;
                str3 = str4;
                j2 = j3;
                ml2 = ml4;
                nVar2 = (x0X.n) objIk;
                if (!(nVar2 instanceof n.C1266n)) {
                    ml2.gh.set(false);
                    return new n.C1266n(new w6.Ml(((dI8.n) ((n.C1266n) nVar2).n()).getMessage()));
                }
                if (!(nVar2 instanceof n.w6)) {
                    throw new NoWhenBranchMatchedException();
                }
                jVar = (Dsr.j) ((n.w6) nVar2).n();
                if (aC.n(jVar)) {
                    rB.Ml mlKN = ml2.KN();
                    if (mlKN != null) {
                        tCX.j.KN(mlKN, HI, "admob");
                    }
                    ml2.J2().nr(str3);
                    nVar5.f7020n = ml2;
                    nVar5.f7023t = activity3;
                    nVar5.f7016O = str3;
                    nVar5.J2 = c0320n3;
                    nVar5.f7019g = 3;
                    objIk = ml2.Ik(str3, c0320n3, j2, nVar5);
                    if (objIk != coroutine_suspended) {
                        ml3 = ml2;
                        c0320n4 = c0320n3;
                        activity4 = activity3;
                        nVar3 = (x0X.n) objIk;
                        if (!(nVar3 instanceof n.C1266n)) {
                        }
                    }
                    return coroutine_suspended;
                }
                ml3 = ml2;
                final InterstitialAd interstitialAd2 = (InterstitialAd) jVar.n();
                final ResponseInfo responseInfoRl = jVar.rl();
                Ak.Ml mlUo = ml3.Uo();
                String adUnitId = interstitialAd2.getAdUnitId();
                Intrinsics.checkNotNullExpressionValue(adUnitId, "getAdUnitId(...)");
                k.Ml mlKN2 = Ak.Ml.KN(mlUo, adUnitId, responseInfoRl == null ? responseInfoRl.getResponseId() : null, responseInfoRl == null ? responseInfoRl.getMediationAdapterClassName() : null, c0320n3.rl(), c0320n3.n(), null, 32, null);
                ml3.xMQ().invoke(mlKN2);
                rB.Ml mlKN3 = ml3.KN();
                if (mlKN3 != null) {
                }
                Function0 function0 = new Function0() { // from class: NQ.n
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Ml.HI(this.f7074n, interstitialAd2, responseInfoRl, c0320n3);
                    }
                };
                Function1 function1 = new Function1() { // from class: NQ.w6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return Ml.ck(this.f7077n, interstitialAd2, responseInfoRl, c0320n3, (AdValue) obj2);
                    }
                };
                nVar5.f7020n = ml3;
                nVar5.f7023t = c0320n3;
                nVar5.f7016O = interstitialAd2;
                nVar5.J2 = responseInfoRl;
                nVar5.f7022r = jVarRl;
                nVar5.f7019g = 4;
                objN = AbstractC1964j.n(interstitialAd2, activity3, function0, function1, nVar5);
                if (objN != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i3 != 3) {
                if (i3 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jVar2 = (K6D.j) nVar5.f7022r;
                responseInfo = (ResponseInfo) nVar5.J2;
                interstitialAd = (InterstitialAd) nVar5.f7016O;
                c0320n3 = (n.C0320n) nVar5.f7023t;
                ml3 = (Ml) nVar5.f7020n;
                ResultKt.throwOnFailure(objIk);
                nVar4 = (x0X.n) objIk;
                ml3.gh.set(false);
                if (!(nVar4 instanceof n.C1266n)) {
                    Tv6.j jVar3 = (Tv6.j) ((n.C1266n) nVar4).n();
                    Ak.Ml mlUo2 = ml3.Uo();
                    String adUnitId2 = interstitialAd.getAdUnitId();
                    Intrinsics.checkNotNullExpressionValue(adUnitId2, "getAdUnitId(...)");
                    k.Ml mlJ2 = Ak.Ml.J2(mlUo2, adUnitId2, responseInfo != null ? responseInfo.getResponseId() : null, responseInfo != null ? responseInfo.getMediationAdapterClassName() : null, jVar3, c0320n3.rl(), c0320n3.n(), null, 64, null);
                    ml3.xMQ().invoke(mlJ2);
                    if (jVar2 != null) {
                        tCX.j.J2(jVar2, jVar3, "admob", mlJ2.rl());
                    }
                    return new n.C1266n(Tv6.n.rl(jVar3));
                }
                if (!(nVar4 instanceof n.w6)) {
                    throw new NoWhenBranchMatchedException();
                }
                Ak.Ml mlUo3 = ml3.Uo();
                String adUnitId3 = interstitialAd.getAdUnitId();
                Intrinsics.checkNotNullExpressionValue(adUnitId3, "getAdUnitId(...)");
                ml3.xMQ().invoke(Ak.Ml.rl(mlUo3, adUnitId3, responseInfo != null ? responseInfo.getResponseId() : null, responseInfo != null ? responseInfo.getMediationAdapterClassName() : null, c0320n3.rl(), c0320n3.n(), null, 32, null));
                Ak.Ml mlUo4 = ml3.Uo();
                String adUnitId4 = interstitialAd.getAdUnitId();
                Intrinsics.checkNotNullExpressionValue(adUnitId4, "getAdUnitId(...)");
                k.Ml mlNr = Ak.Ml.nr(mlUo4, adUnitId4, responseInfo != null ? responseInfo.getResponseId() : null, responseInfo != null ? responseInfo.getMediationAdapterClassName() : null, c0320n3.rl(), c0320n3.n(), null, 32, null);
                ml3.xMQ().invoke(mlNr);
                if (jVar2 != null) {
                    jVar2.n(tCX.j.n(mlNr).J2());
                }
                return new n.w6(Unit.INSTANCE);
            }
            c0320n4 = (n.C0320n) nVar5.J2;
            str3 = (String) nVar5.f7016O;
            activity4 = (Activity) nVar5.f7023t;
            ml3 = (Ml) nVar5.f7020n;
            ResultKt.throwOnFailure(objIk);
            nVar3 = (x0X.n) objIk;
            if (!(nVar3 instanceof n.C1266n)) {
                ml3.gh.set(false);
                return new n.C1266n(new w6.Ml(((dI8.n) ((n.C1266n) nVar3).n()).getMessage()));
            }
            if (!(nVar3 instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            jVar = (Dsr.j) ((n.w6) nVar3).n();
            activity3 = activity4;
            c0320n3 = c0320n4;
            final InterstitialAd interstitialAd22 = (InterstitialAd) jVar.n();
            final ResponseInfo responseInfoRl2 = jVar.rl();
            Ak.Ml mlUo5 = ml3.Uo();
            String adUnitId5 = interstitialAd22.getAdUnitId();
            Intrinsics.checkNotNullExpressionValue(adUnitId5, "getAdUnitId(...)");
            k.Ml mlKN22 = Ak.Ml.KN(mlUo5, adUnitId5, responseInfoRl2 == null ? responseInfoRl2.getResponseId() : null, responseInfoRl2 == null ? responseInfoRl2.getMediationAdapterClassName() : null, c0320n3.rl(), c0320n3.n(), null, 32, null);
            ml3.xMQ().invoke(mlKN22);
            rB.Ml mlKN32 = ml3.KN();
            K6D.j jVarRl = (mlKN32 != null || (mlO = mlKN32.O()) == null) ? null : mlO.rl(tCX.j.n(mlKN22), str3);
            Function0 function02 = new Function0() { // from class: NQ.n
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Ml.HI(this.f7074n, interstitialAd22, responseInfoRl2, c0320n3);
                }
            };
            Function1 function12 = new Function1() { // from class: NQ.w6
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return Ml.ck(this.f7077n, interstitialAd22, responseInfoRl2, c0320n3, (AdValue) obj2);
                }
            };
            nVar5.f7020n = ml3;
            nVar5.f7023t = c0320n3;
            nVar5.f7016O = interstitialAd22;
            nVar5.J2 = responseInfoRl2;
            nVar5.f7022r = jVarRl;
            nVar5.f7019g = 4;
            objN = AbstractC1964j.n(interstitialAd22, activity3, function02, function12, nVar5);
            if (objN != coroutine_suspended) {
                jVar2 = jVarRl;
                interstitialAd = interstitialAd22;
                responseInfo = responseInfoRl2;
                objIk = objN;
                nVar4 = (x0X.n) objIk;
                ml3.gh.set(false);
                if (!(nVar4 instanceof n.C1266n)) {
                }
            }
            return coroutine_suspended;
        }
        c0320n2 = (n.C0320n) nVar5.J2;
        str2 = (String) nVar5.f7016O;
        Activity activity6 = (Activity) nVar5.f7023t;
        ml = (Ml) nVar5.f7020n;
        ResultKt.throwOnFailure(objIk);
        obj = objIk;
        activity2 = activity6;
        if (!((Boolean) obj).booleanValue()) {
            return new n.C1266n(w6.I28.f63490n);
        }
        if (ml.gh.getAndSet(true)) {
            n.C1266n c1266n = new n.C1266n(w6.n.f63495n);
            rB.Ml mlKN4 = ml.KN();
            if (mlKN4 != null) {
                tCX.j.O(mlKN4, HI, "admob");
            }
            return c1266n;
        }
        long jT2 = ml.qie.n().t();
        nVar5.f7020n = ml;
        nVar5.f7023t = activity2;
        nVar5.f7016O = str2;
        nVar5.J2 = c0320n2;
        nVar5.f7021o = jT2;
        nVar5.f7019g = 2;
        c0320n3 = c0320n2;
        str3 = str2;
        j2 = jT2;
        ml2 = ml;
        Object objIk2 = ml2.Ik(str3, c0320n3, j2, nVar5);
        if (objIk2 != coroutine_suspended) {
            activity3 = activity2;
            objIk = objIk2;
            nVar2 = (x0X.n) objIk;
            if (!(nVar2 instanceof n.C1266n)) {
            }
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0096, code lost:
    
        if (r12 == r0) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // ScC.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object t(String str, n.C0320n c0320n, Continuation continuation) {
        C0237Ml c0237Ml;
        Ml ml;
        if (continuation instanceof C0237Ml) {
            c0237Ml = (C0237Ml) continuation;
            int i2 = c0237Ml.f7013o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c0237Ml.f7013o = i2 - Integer.MIN_VALUE;
            } else {
                c0237Ml = new C0237Ml(continuation);
            }
        }
        C0237Ml c0237Ml2 = c0237Ml;
        Object objViF = c0237Ml2.J2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c0237Ml2.f7013o;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objViF);
            if (!this.qie.isEnabled()) {
                return new n.C1266n(n.j.f63485n);
            }
            Z zNr = O().nr();
            c0237Ml2.f7012n = this;
            c0237Ml2.f7015t = str;
            c0237Ml2.f7011O = c0320n;
            c0237Ml2.f7013o = 1;
            objViF = TFv.fuX.ViF(zNr, c0237Ml2);
            if (objViF != coroutine_suspended) {
                ml = this;
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objViF);
            x0X.n nVar = (x0X.n) objViF;
            if (nVar instanceof n.C1266n) {
                return nVar;
            }
            if (!(nVar instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            return new n.w6(Unit.INSTANCE);
        }
        c0320n = (n.C0320n) c0237Ml2.f7011O;
        str = (String) c0237Ml2.f7015t;
        ml = (Ml) c0237Ml2.f7012n;
        ResultKt.throwOnFailure(objViF);
        n.C0320n c0320n2 = c0320n;
        if (!((Boolean) objViF).booleanValue()) {
            return new n.C1266n(n.Ml.f63483n);
        }
        c0237Ml2.f7012n = null;
        c0237Ml2.f7015t = null;
        c0237Ml2.f7011O = null;
        c0237Ml2.f7013o = 2;
        objViF = r(ml, str, c0320n2, 0L, c0237Ml2, 4, null);
    }

    public Function1 ty() {
        return this.xMQ;
    }

    @Override // NQ.j
    public Function1 xMQ() {
        return this.KN;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ml(Context context, InterfaceC2202n adOrable, Function1 trackEvent, Function1 trackAdRevenueEvent, rB.Ml ml, vd loadScope) {
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
        this.gh = new AtomicBoolean(false);
        this.qie = O().getConfig();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HI(Ml ml, InterstitialAd interstitialAd, ResponseInfo responseInfo, n.C0320n c0320n) {
        String responseId;
        String mediationAdapterClassName;
        Function1 function1XMQ = ml.xMQ();
        Ak.Ml mlUo = ml.Uo();
        String adUnitId = interstitialAd.getAdUnitId();
        Intrinsics.checkNotNullExpressionValue(adUnitId, "getAdUnitId(...)");
        if (responseInfo != null) {
            responseId = responseInfo.getResponseId();
        } else {
            responseId = null;
        }
        if (responseInfo != null) {
            mediationAdapterClassName = responseInfo.getMediationAdapterClassName();
        } else {
            mediationAdapterClassName = null;
        }
        function1XMQ.invoke(Ak.Ml.mUb(mlUo, adUnitId, responseId, mediationAdapterClassName, c0320n.rl(), c0320n.n(), null, 32, null));
        Dsr dsrJ2 = ml.J2();
        String adUnitId2 = interstitialAd.getAdUnitId();
        Intrinsics.checkNotNullExpressionValue(adUnitId2, "getAdUnitId(...)");
        dsrJ2.nr(adUnitId2);
        if (ml.O().getConfig().n().rl()) {
            C.nr(ml.mUb, null, null, ml.new w6(interstitialAd, c0320n, null), 3, null);
        }
        return Unit.INSTANCE;
    }

    private final Object Ik(String str, n.C0320n c0320n, long j2, Continuation continuation) {
        return mUb(str, c0320n.rl(), c0320n.n(), j2, new I28(str, null), continuation);
    }
}
