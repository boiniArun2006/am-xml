package Foy;

import Foy.j;
import GJW.C;
import GJW.Lu;
import GJW.OU;
import GJW.vd;
import K6D.Ml;
import ScC.n;
import TFv.Z;
import android.app.Activity;
import android.content.Context;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.ads.MaxInterstitialAd;
import dI8.n;
import dI8.w6;
import java.util.concurrent.atomic.AtomicBoolean;
import k.InterfaceC2202n;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Wre extends Foy.w6 implements ScC.n {
    private final Context J2;
    private final Function1 KN;
    private final InterfaceC2202n Uo;
    private AtomicBoolean gh;
    private final vd mUb;
    private final Function1 xMQ;
    private static final j qie = new j(null);
    public static final int az = 8;
    private static final k.I28 ty = k.I28.f69644r;

    static final class I28 extends SuspendLambda implements Function1 {
        final /* synthetic */ Wre J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ String f3152O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f3153n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f3154t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        I28(String str, Wre wre, Continuation continuation) {
            super(1, continuation);
            this.f3152O = str;
            this.J2 = wre;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new I28(this.f3152O, this.J2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MaxInterstitialAd maxInterstitialAd;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f3154t;
            if (i2 != 0) {
                if (i2 == 1) {
                    maxInterstitialAd = (MaxInterstitialAd) this.f3153n;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                MaxInterstitialAd maxInterstitialAd2 = new MaxInterstitialAd(this.f3152O, this.J2.az());
                this.f3153n = maxInterstitialAd2;
                this.f3154t = 1;
                Object objRl = Ha.I28.rl(maxInterstitialAd2, this);
                if (objRl == coroutine_suspended) {
                    return coroutine_suspended;
                }
                maxInterstitialAd = maxInterstitialAd2;
                obj = objRl;
            }
            x0X.n nVar = (x0X.n) obj;
            Wre wre = this.J2;
            if (nVar instanceof n.C1266n) {
                return new n.C1266n(SL.I28.n((SL.Ml) ((n.C1266n) nVar).n()));
            }
            if (nVar instanceof n.w6) {
                return new n.w6(new j.C0109j(wre.J2(), (MaxAd) ((n.w6) nVar).n(), maxInterstitialAd));
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
        Object f3155O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f3156n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f3157o;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f3159t;

        Ml(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.J2 = obj;
            this.f3157o |= Integer.MIN_VALUE;
            return Wre.this.t(null, null, this);
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
        Object f3160O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        int f3161S;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f3163n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f3164o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        long f3165r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f3166t;

        n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f3164o = obj;
            this.f3161S |= Integer.MIN_VALUE;
            return Wre.this.n(null, null, null, this);
        }
    }

    static final class w6 extends SuspendLambda implements Function2 {
        final /* synthetic */ n.C0320n J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ String f3167O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f3168n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((w6) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w6(String str, n.C0320n c0320n, Continuation continuation) {
            super(2, continuation);
            this.f3167O = str;
            this.J2 = c0320n;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return Wre.this.new w6(this.f3167O, this.J2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f3168n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                Wre wre = Wre.this;
                String str = this.f3167O;
                n.C0320n c0320n = this.J2;
                this.f3168n = 1;
                if (wre.t(str, c0320n, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ Wre(Context context, InterfaceC2202n interfaceC2202n, Function1 function1, Function1 function12, rB.Ml ml, vd vdVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, interfaceC2202n, function1, function12, ml, (i2 & 32) != 0 ? Lu.n(OU.t()) : vdVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HI(Ref.BooleanRef booleanRef, Wre wre, n.C0320n c0320n, String str, MaxAd maxAd) {
        Intrinsics.checkNotNullParameter(maxAd, "maxAd");
        if (!booleanRef.element) {
            booleanRef.element = true;
            wre.xMQ().invoke(c3.j.mUb(wre.Uo(), maxAd, c0320n.rl(), c0320n.n(), null, 8, null));
            wre.J2().nr(str);
            if (wre.O().getConfig().n().rl()) {
                C.nr(wre.mUb, null, null, wre.new w6(str, c0320n, null), 3, null);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ck(Ref.BooleanRef booleanRef, Wre wre, n.C0320n c0320n, MaxAd maxAd) {
        Intrinsics.checkNotNullParameter(maxAd, "maxAd");
        if (!booleanRef.element) {
            booleanRef.element = true;
            wre.ty().invoke(wre.Uo().HI(maxAd, c0320n.rl(), c0320n.n()));
        }
        return Unit.INSTANCE;
    }

    static /* synthetic */ Object r(Wre wre, String str, n.C0320n c0320n, long j2, Continuation continuation, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            j2 = wre.O().getConfig().n().O();
        }
        return wre.Ik(str, c0320n, j2, continuation);
    }

    @Override // Foy.w6
    public InterfaceC2202n O() {
        return this.Uo;
    }

    public Context az() {
        return this.J2;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0233 A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:16:0x0043, B:87:0x022d, B:89:0x0233, B:91:0x0264, B:92:0x026b, B:93:0x0275, B:95:0x0279, B:97:0x02ba, B:98:0x02c5, B:101:0x02d2, B:102:0x02d7, B:83:0x0210), top: B:107:0x002d }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0275 A[Catch: all -> 0x0048, TryCatch #0 {all -> 0x0048, blocks: (B:16:0x0043, B:87:0x022d, B:89:0x0233, B:91:0x0264, B:92:0x026b, B:93:0x0275, B:95:0x0279, B:97:0x02ba, B:98:0x02c5, B:101:0x02d2, B:102:0x02d7, B:83:0x0210), top: B:107:0x002d }] */
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
        Wre wre;
        String str3;
        n.C0320n c0320n3;
        Wre wre2;
        long j2;
        Activity activity3;
        x0X.n nVar2;
        MaxInterstitialAd maxInterstitialAd;
        final String str4;
        final Wre wre3;
        final n.C0320n c0320n4;
        Activity activity4;
        Wre wre4;
        K6D.j jVar;
        K6D.Ml mlO;
        x0X.n nVar3;
        x0X.n nVar4;
        Object w6Var;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i2 = nVar.f3161S;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.f3161S = i2 - Integer.MIN_VALUE;
            } else {
                nVar = new n(continuation);
            }
        }
        n nVar5 = nVar;
        Object objIk = nVar5.f3164o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = nVar5.f3161S;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objIk);
                if (!O().getConfig().isEnabled()) {
                    return new n.C1266n(w6.j.f63493n);
                }
                Z zNr = O().nr();
                nVar5.f3163n = this;
                nVar5.f3166t = activity;
                str2 = str;
                nVar5.f3160O = str2;
                nVar5.J2 = c0320n;
                nVar5.f3161S = 1;
                Object objViF = TFv.fuX.ViF(zNr, nVar5);
                if (objViF != coroutine_suspended) {
                    obj = objViF;
                    activity2 = activity;
                    c0320n2 = c0320n;
                    wre = this;
                }
                return coroutine_suspended;
            }
            if (i3 != 1) {
                if (i3 == 2) {
                    long j3 = nVar5.f3165r;
                    c0320n3 = (n.C0320n) nVar5.J2;
                    String str5 = (String) nVar5.f3160O;
                    Activity activity5 = (Activity) nVar5.f3166t;
                    Wre wre5 = (Wre) nVar5.f3163n;
                    ResultKt.throwOnFailure(objIk);
                    activity3 = activity5;
                    str3 = str5;
                    j2 = j3;
                    wre2 = wre5;
                    nVar2 = (x0X.n) objIk;
                    if (!(nVar2 instanceof n.C1266n)) {
                        wre2.gh.set(false);
                        return new n.C1266n(new w6.Ml(((dI8.n) ((n.C1266n) nVar2).n()).getMessage()));
                    }
                    if (!(nVar2 instanceof n.w6)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Object objN = ((n.w6) nVar2).n();
                    if (!((MaxInterstitialAd) objN).isReady()) {
                        objN = null;
                    }
                    maxInterstitialAd = (MaxInterstitialAd) objN;
                    if (maxInterstitialAd == null) {
                        rB.Ml mlKN = wre2.KN();
                        if (mlKN != null) {
                            tCX.j.KN(mlKN, ty, "max");
                        }
                        wre2.J2().nr(str3);
                        nVar5.f3163n = wre2;
                        nVar5.f3166t = activity3;
                        nVar5.f3160O = str3;
                        nVar5.J2 = c0320n3;
                        nVar5.f3161S = 3;
                        objIk = wre2.Ik(str3, c0320n3, j2, nVar5);
                        if (objIk != coroutine_suspended) {
                            wre4 = wre2;
                            c0320n4 = c0320n3;
                            activity4 = activity3;
                            nVar3 = (x0X.n) objIk;
                            if (!(nVar3 instanceof n.C1266n)) {
                            }
                        }
                        return coroutine_suspended;
                    }
                    str4 = str3;
                    wre3 = wre2;
                    c0320n4 = c0320n3;
                    activity4 = activity3;
                    k.Ml mlKN2 = c3.j.KN(wre3.Uo(), str4, c0320n4.rl(), c0320n4.n(), null, 8, null);
                    wre3.xMQ().invoke(mlKN2);
                    rB.Ml mlKN3 = wre3.KN();
                    if (mlKN3 != null) {
                    }
                    final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                    final Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                    Function1 function1 = new Function1() { // from class: Foy.Ml
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return Wre.HI(booleanRef, wre3, c0320n4, str4, (MaxAd) obj2);
                        }
                    };
                    Function1 function12 = new Function1() { // from class: Foy.I28
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return Wre.ck(booleanRef2, wre3, c0320n4, (MaxAd) obj2);
                        }
                    };
                    nVar5.f3163n = wre3;
                    nVar5.f3166t = c0320n4;
                    nVar5.f3160O = jVarNr;
                    nVar5.J2 = null;
                    nVar5.f3161S = 4;
                    objIk = Ha.I28.n(maxInterstitialAd, activity4, function1, function12, nVar5);
                    if (objIk != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                if (i3 != 3) {
                    if (i3 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jVar = (K6D.j) nVar5.f3160O;
                    c0320n4 = (n.C0320n) nVar5.f3166t;
                    wre3 = (Wre) nVar5.f3163n;
                    ResultKt.throwOnFailure(objIk);
                    nVar4 = (x0X.n) objIk;
                    if (!(nVar4 instanceof n.C1266n)) {
                        SL.w6 w6Var2 = (SL.w6) ((n.C1266n) nVar4).n();
                        MaxAd maxAdN = w6Var2.n();
                        SL.j jVarRl = w6Var2.rl();
                        k.Ml mlJ2 = c3.j.J2(wre3.Uo(), maxAdN, jVarRl, c0320n4.rl(), c0320n4.n(), null, 16, null);
                        wre3.xMQ().invoke(mlJ2);
                        if (jVar != null) {
                            tCX.j.J2(jVar, jVarRl, "max", mlJ2.rl());
                        }
                        w6Var = new n.C1266n(SL.n.n(jVarRl));
                    } else {
                        if (!(nVar4 instanceof n.w6)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        MaxAd maxAd = (MaxAd) ((n.w6) nVar4).n();
                        wre3.xMQ().invoke(c3.j.rl(wre3.Uo(), maxAd, c0320n4.rl(), c0320n4.n(), null, 8, null));
                        k.Ml mlNr = c3.j.nr(wre3.Uo(), maxAd, c0320n4.rl(), c0320n4.n(), null, 8, null);
                        wre3.xMQ().invoke(mlNr);
                        if (jVar != null) {
                            jVar.n(tCX.j.n(mlNr).J2());
                        }
                        w6Var = new n.w6(Unit.INSTANCE);
                    }
                    wre3.gh.set(false);
                    return w6Var;
                }
                c0320n4 = (n.C0320n) nVar5.J2;
                str3 = (String) nVar5.f3160O;
                activity4 = (Activity) nVar5.f3166t;
                wre4 = (Wre) nVar5.f3163n;
                ResultKt.throwOnFailure(objIk);
                nVar3 = (x0X.n) objIk;
                if (!(nVar3 instanceof n.C1266n)) {
                    wre4.gh.set(false);
                    return new n.C1266n(new w6.Ml(((dI8.n) ((n.C1266n) nVar3).n()).getMessage()));
                }
                if (!(nVar3 instanceof n.w6)) {
                    throw new NoWhenBranchMatchedException();
                }
                maxInterstitialAd = (MaxInterstitialAd) ((n.w6) nVar3).n();
                str4 = str3;
                wre3 = wre4;
                k.Ml mlKN22 = c3.j.KN(wre3.Uo(), str4, c0320n4.rl(), c0320n4.n(), null, 8, null);
                wre3.xMQ().invoke(mlKN22);
                rB.Ml mlKN32 = wre3.KN();
                K6D.j jVarNr = (mlKN32 != null || (mlO = mlKN32.O()) == null) ? null : Ml.n.nr(mlO, tCX.j.n(mlKN22), null, 2, null);
                final Ref.BooleanRef booleanRef3 = new Ref.BooleanRef();
                final Ref.BooleanRef booleanRef22 = new Ref.BooleanRef();
                Function1 function13 = new Function1() { // from class: Foy.Ml
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return Wre.HI(booleanRef3, wre3, c0320n4, str4, (MaxAd) obj2);
                    }
                };
                Function1 function122 = new Function1() { // from class: Foy.I28
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return Wre.ck(booleanRef22, wre3, c0320n4, (MaxAd) obj2);
                    }
                };
                nVar5.f3163n = wre3;
                nVar5.f3166t = c0320n4;
                nVar5.f3160O = jVarNr;
                nVar5.J2 = null;
                nVar5.f3161S = 4;
                objIk = Ha.I28.n(maxInterstitialAd, activity4, function13, function122, nVar5);
                if (objIk != coroutine_suspended) {
                    jVar = jVarNr;
                    nVar4 = (x0X.n) objIk;
                    if (!(nVar4 instanceof n.C1266n)) {
                    }
                    wre3.gh.set(false);
                    return w6Var;
                }
                return coroutine_suspended;
            }
            c0320n2 = (n.C0320n) nVar5.J2;
            str2 = (String) nVar5.f3160O;
            Activity activity6 = (Activity) nVar5.f3166t;
            wre = (Wre) nVar5.f3163n;
            ResultKt.throwOnFailure(objIk);
            obj = objIk;
            activity2 = activity6;
            if (!((Boolean) obj).booleanValue()) {
                return new n.C1266n(w6.I28.f63490n);
            }
            if (wre.gh.getAndSet(true)) {
                n.C1266n c1266n = new n.C1266n(w6.n.f63495n);
                rB.Ml mlKN4 = wre.KN();
                if (mlKN4 != null) {
                    tCX.j.O(mlKN4, ty, "max");
                }
                return c1266n;
            }
            long jT2 = wre.O().getConfig().n().t();
            nVar5.f3163n = wre;
            nVar5.f3166t = activity2;
            nVar5.f3160O = str2;
            nVar5.J2 = c0320n2;
            nVar5.f3165r = jT2;
            nVar5.f3161S = 2;
            str3 = str2;
            c0320n3 = c0320n2;
            wre2 = wre;
            j2 = jT2;
            Object objIk2 = wre2.Ik(str3, c0320n3, j2, nVar5);
            if (objIk2 != coroutine_suspended) {
                activity3 = activity2;
                objIk = objIk2;
                nVar2 = (x0X.n) objIk;
                if (!(nVar2 instanceof n.C1266n)) {
                }
            }
            return coroutine_suspended;
        } catch (Throwable th) {
            1.gh.set(false);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x009d, code lost:
    
        if (r12 == r0) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    @Override // ScC.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object t(String str, n.C0320n c0320n, Continuation continuation) {
        Ml ml;
        Wre wre;
        if (continuation instanceof Ml) {
            ml = (Ml) continuation;
            int i2 = ml.f3157o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ml.f3157o = i2 - Integer.MIN_VALUE;
            } else {
                ml = new Ml(continuation);
            }
        }
        Ml ml2 = ml;
        Object objViF = ml2.J2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = ml2.f3157o;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objViF);
            if (!O().getConfig().isEnabled()) {
                return new n.C1266n(n.j.f63485n);
            }
            Z zNr = O().nr();
            ml2.f3156n = this;
            ml2.f3159t = str;
            ml2.f3155O = c0320n;
            ml2.f3157o = 1;
            objViF = TFv.fuX.ViF(zNr, ml2);
            if (objViF != coroutine_suspended) {
                wre = this;
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
        c0320n = (n.C0320n) ml2.f3155O;
        str = (String) ml2.f3159t;
        wre = (Wre) ml2.f3156n;
        ResultKt.throwOnFailure(objViF);
        n.C0320n c0320n2 = c0320n;
        if (!((Boolean) objViF).booleanValue()) {
            return new n.C1266n(n.Ml.f63483n);
        }
        ml2.f3156n = null;
        ml2.f3159t = null;
        ml2.f3155O = null;
        ml2.f3157o = 2;
        objViF = r(wre, str, c0320n2, 0L, ml2, 4, null);
    }

    public Function1 ty() {
        return this.xMQ;
    }

    @Override // Foy.w6
    public Function1 xMQ() {
        return this.KN;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Wre(Context context, InterfaceC2202n adOrable, Function1 trackEvent, Function1 trackAdRevenueEvent, rB.Ml ml, vd loadScope) {
        super(ty, loadScope, ml);
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
    }

    private final Object Ik(String str, n.C0320n c0320n, long j2, Continuation continuation) {
        return mUb(str, c0320n.rl(), c0320n.n(), j2, new I28(str, this, null), continuation);
    }
}
