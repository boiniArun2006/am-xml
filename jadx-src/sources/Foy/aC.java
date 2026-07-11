package Foy;

import Foy.j;
import GJW.C;
import GJW.Lu;
import GJW.OU;
import GJW.vd;
import K6D.Ml;
import SL.Wre;
import ScC.w6;
import TFv.Z;
import android.app.Activity;
import android.content.Context;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.ads.MaxRewardedAd;
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
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class aC extends Foy.w6 implements ScC.w6 {
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
        final /* synthetic */ aC J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ String f3170O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f3171n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f3172t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        I28(String str, aC aCVar, Continuation continuation) {
            super(1, continuation);
            this.f3170O = str;
            this.J2 = aCVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return new I28(this.f3170O, this.J2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            MaxRewardedAd maxRewardedAd;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f3172t;
            if (i2 != 0) {
                if (i2 == 1) {
                    maxRewardedAd = (MaxRewardedAd) this.f3171n;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                MaxRewardedAd maxRewardedAd2 = MaxRewardedAd.getInstance(this.f3170O, this.J2.ty());
                Intrinsics.checkNotNull(maxRewardedAd2);
                this.f3171n = maxRewardedAd2;
                this.f3172t = 1;
                Object objRl = Ha.Wre.rl(maxRewardedAd2, this);
                if (objRl == coroutine_suspended) {
                    return coroutine_suspended;
                }
                maxRewardedAd = maxRewardedAd2;
                obj = objRl;
            }
            x0X.n nVar = (x0X.n) obj;
            aC aCVar = this.J2;
            if (nVar instanceof n.C1266n) {
                return new n.C1266n(SL.I28.n((SL.Ml) ((n.C1266n) nVar).n()));
            }
            if (nVar instanceof n.w6) {
                MaxAd maxAd = (MaxAd) ((n.w6) nVar).n();
                Foy.j jVarJ2 = aCVar.J2();
                Intrinsics.checkNotNull(maxRewardedAd);
                return new n.w6(new j.C0109j(jVarJ2, maxAd, maxRewardedAd));
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
        Object f3173O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f3174n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f3175o;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f3177t;

        Ml(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.J2 = obj;
            this.f3175o |= Integer.MIN_VALUE;
            return aC.this.nr(null, null, this);
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
        Object f3178O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        /* synthetic */ Object f3180Z;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f3181g;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f3182n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        long f3183o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        boolean f3184r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f3185t;

        n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f3180Z = obj;
            this.f3181g |= Integer.MIN_VALUE;
            return aC.this.rl(null, null, false, null, this);
        }
    }

    static final class w6 extends SuspendLambda implements Function2 {
        final /* synthetic */ w6.n J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ String f3186O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f3187n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((w6) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w6(String str, w6.n nVar, Continuation continuation) {
            super(2, continuation);
            this.f3186O = str;
            this.J2 = nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return aC.this.new w6(this.f3186O, this.J2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f3187n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                aC aCVar = aC.this;
                String str = this.f3186O;
                w6.n nVar = this.J2;
                this.f3187n = 1;
                if (aCVar.nr(str, nVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ aC(Context context, InterfaceC2202n interfaceC2202n, Function1 function1, Function1 function12, rB.Ml ml, vd vdVar, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, interfaceC2202n, function1, function12, ml, (i2 & 32) != 0 ? Lu.n(OU.t()) : vdVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Ik(Ref.BooleanRef booleanRef, aC aCVar, w6.n nVar, MaxAd maxAd) {
        Intrinsics.checkNotNullParameter(maxAd, "maxAd");
        if (!booleanRef.element) {
            booleanRef.element = true;
            aCVar.xMQ().invoke(aCVar.Uo().t(maxAd, nVar.t(), nVar.n(), nVar.rl()));
        }
        return Unit.INSTANCE;
    }

    static /* synthetic */ Object Z(aC aCVar, String str, w6.n nVar, long j2, Continuation continuation, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            j2 = aCVar.gh.n().O();
        }
        return aCVar.o(str, nVar, j2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ck(Ref.BooleanRef booleanRef, aC aCVar, w6.n nVar, MaxAd maxAd) {
        Intrinsics.checkNotNullParameter(maxAd, "maxAd");
        if (!booleanRef.element) {
            booleanRef.element = true;
            aCVar.xMQ().invoke(aCVar.Uo().xMQ(maxAd, nVar.t(), nVar.n(), nVar.rl()));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(Ref.BooleanRef booleanRef, aC aCVar, w6.n nVar, MaxAd maxAd) {
        Intrinsics.checkNotNullParameter(maxAd, "maxAd");
        if (!booleanRef.element) {
            booleanRef.element = true;
            aCVar.HI().invoke(aCVar.Uo().HI(maxAd, nVar.t(), nVar.n()));
        }
        return Unit.INSTANCE;
    }

    public Function1 HI() {
        return this.xMQ;
    }

    @Override // Foy.w6
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
        aC aCVar;
        if (continuation instanceof Ml) {
            ml = (Ml) continuation;
            int i2 = ml.f3175o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ml.f3175o = i2 - Integer.MIN_VALUE;
            } else {
                ml = new Ml(continuation);
            }
        }
        Ml ml2 = ml;
        Object objViF = ml2.J2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = ml2.f3175o;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objViF);
            if (!this.gh.isEnabled()) {
                return new n.C1266n(n.j.f63485n);
            }
            Z zNr = O().nr();
            ml2.f3174n = this;
            ml2.f3177t = str;
            ml2.f3173O = nVar;
            ml2.f3175o = 1;
            objViF = TFv.fuX.ViF(zNr, ml2);
            if (objViF != coroutine_suspended) {
                aCVar = this;
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
        nVar = (w6.n) ml2.f3173O;
        str = (String) ml2.f3177t;
        aCVar = (aC) ml2.f3174n;
        ResultKt.throwOnFailure(objViF);
        w6.n nVar3 = nVar;
        if (!((Boolean) objViF).booleanValue()) {
            return new n.C1266n(n.Ml.f63483n);
        }
        ml2.f3174n = null;
        ml2.f3177t = null;
        ml2.f3173O = null;
        ml2.f3175o = 2;
        objViF = Z(aCVar, str, nVar3, 0L, ml2, 4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0278 A[Catch: all -> 0x004d, TryCatch #1 {all -> 0x004d, blocks: (B:16:0x0048, B:89:0x0263, B:91:0x0278, B:92:0x028c, B:94:0x0290, B:96:0x02bf, B:97:0x02c6, B:98:0x02d0, B:100:0x02d4, B:102:0x02fd, B:103:0x0308, B:105:0x030c, B:106:0x0314, B:108:0x0318, B:111:0x0325, B:112:0x032a, B:113:0x032b, B:114:0x0330), top: B:123:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0290 A[Catch: all -> 0x004d, TryCatch #1 {all -> 0x004d, blocks: (B:16:0x0048, B:89:0x0263, B:91:0x0278, B:92:0x028c, B:94:0x0290, B:96:0x02bf, B:97:0x02c6, B:98:0x02d0, B:100:0x02d4, B:102:0x02fd, B:103:0x0308, B:105:0x030c, B:106:0x0314, B:108:0x0318, B:111:0x0325, B:112:0x032a, B:113:0x032b, B:114:0x0330), top: B:123:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02d0 A[Catch: all -> 0x004d, TryCatch #1 {all -> 0x004d, blocks: (B:16:0x0048, B:89:0x0263, B:91:0x0278, B:92:0x028c, B:94:0x0290, B:96:0x02bf, B:97:0x02c6, B:98:0x02d0, B:100:0x02d4, B:102:0x02fd, B:103:0x0308, B:105:0x030c, B:106:0x0314, B:108:0x0318, B:111:0x0325, B:112:0x032a, B:113:0x032b, B:114:0x0330), top: B:123:0x0048 }] */
    @Override // ScC.w6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object rl(Activity activity, String str, boolean z2, w6.n nVar, Continuation continuation) throws Throwable {
        n nVar2;
        String str2;
        w6.n nVar3;
        Object obj;
        Activity activity2;
        boolean z3;
        aC aCVar;
        String str3;
        w6.n nVar4;
        long j2;
        aC aCVar2;
        Activity activity3;
        x0X.n nVar5;
        String str4;
        Activity activity4;
        final aC aCVar3;
        MaxRewardedAd maxRewardedAd;
        final w6.n nVar6;
        aC aCVar4;
        w6.n nVar7;
        Activity activity5;
        K6D.j jVarNr;
        aC aCVar5;
        Object objN;
        w6.n nVar8;
        String str5;
        K6D.j jVar;
        K6D.Ml mlO;
        x0X.n nVar9;
        x0X.n nVar10;
        Object w6Var;
        if (continuation instanceof n) {
            nVar2 = (n) continuation;
            int i2 = nVar2.f3181g;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar2.f3181g = i2 - Integer.MIN_VALUE;
            } else {
                nVar2 = new n(continuation);
            }
        }
        n nVar11 = nVar2;
        Object objO = nVar11.f3180Z;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = nVar11.f3181g;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objO);
            if (!this.gh.isEnabled()) {
                return new n.C1266n(Ml.j.f63478n);
            }
            Z zNr = O().nr();
            nVar11.f3182n = this;
            nVar11.f3185t = activity;
            str2 = str;
            nVar11.f3178O = str2;
            nVar3 = nVar;
            nVar11.J2 = nVar3;
            nVar11.f3184r = z2;
            nVar11.f3181g = 1;
            Object objViF = TFv.fuX.ViF(zNr, nVar11);
            if (objViF != coroutine_suspended) {
                obj = objViF;
                activity2 = activity;
                z3 = z2;
                aCVar = this;
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 == 2) {
                long j3 = nVar11.f3183o;
                nVar4 = (w6.n) nVar11.J2;
                String str6 = (String) nVar11.f3178O;
                Activity activity6 = (Activity) nVar11.f3185t;
                aC aCVar6 = (aC) nVar11.f3182n;
                ResultKt.throwOnFailure(objO);
                activity3 = activity6;
                str3 = str6;
                j2 = j3;
                aCVar2 = aCVar6;
                nVar5 = (x0X.n) objO;
                if (!(nVar5 instanceof n.C1266n)) {
                    aCVar2.qie.set(false);
                    return new n.C1266n(new Ml.C0836Ml(((dI8.n) ((n.C1266n) nVar5).n()).getMessage()));
                }
                if (!(nVar5 instanceof n.w6)) {
                    throw new NoWhenBranchMatchedException();
                }
                Object objN2 = ((n.w6) nVar5).n();
                if (!((MaxRewardedAd) objN2).isReady()) {
                    objN2 = null;
                }
                MaxRewardedAd maxRewardedAd2 = (MaxRewardedAd) objN2;
                if (maxRewardedAd2 == null) {
                    rB.Ml mlKN = aCVar2.KN();
                    if (mlKN != null) {
                        tCX.j.KN(mlKN, HI, "max");
                    }
                    aCVar2.J2().nr(str3);
                    nVar11.f3182n = aCVar2;
                    nVar11.f3185t = activity3;
                    nVar11.f3178O = str3;
                    nVar11.J2 = nVar4;
                    nVar11.f3181g = 3;
                    objO = aCVar2.o(str3, nVar4, j2, nVar11);
                    if (objO != coroutine_suspended) {
                        aCVar4 = aCVar2;
                        nVar7 = nVar4;
                        activity5 = activity3;
                        nVar9 = (x0X.n) objO;
                        if (!(nVar9 instanceof n.C1266n)) {
                        }
                    }
                    return coroutine_suspended;
                }
                Activity activity7 = activity3;
                str4 = str3;
                activity4 = activity7;
                aCVar3 = aCVar2;
                maxRewardedAd = maxRewardedAd2;
                nVar6 = nVar4;
                k.Ml mlUo = aCVar3.Uo().Uo(str4, nVar6.t(), nVar6.n(), nVar6.rl());
                aCVar3.xMQ().invoke(mlUo);
                rB.Ml mlKN2 = aCVar3.KN();
                if (mlKN2 != null) {
                }
                final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
                final Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
                final Ref.BooleanRef booleanRef3 = new Ref.BooleanRef();
                Function1 function1 = new Function1() { // from class: Foy.CN3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return aC.ck(booleanRef, aCVar3, nVar6, (MaxAd) obj2);
                    }
                };
                Function1 function12 = new Function1() { // from class: Foy.fuX
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return aC.Ik(booleanRef2, aCVar3, nVar6, (MaxAd) obj2);
                    }
                };
                Function1 function13 = new Function1() { // from class: Foy.Dsr
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return aC.r(booleanRef3, aCVar3, nVar6, (MaxAd) obj2);
                    }
                };
                nVar11.f3182n = aCVar3;
                nVar11.f3185t = str4;
                nVar11.f3178O = nVar6;
                nVar11.J2 = jVarNr;
                nVar11.f3181g = 4;
                objN = Ha.Wre.n(maxRewardedAd, activity4, function1, function12, function13, nVar11);
                if (objN != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i3 != 3) {
                if (i3 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jVar = (K6D.j) nVar11.J2;
                nVar8 = (w6.n) nVar11.f3178O;
                str5 = (String) nVar11.f3185t;
                aCVar5 = (aC) nVar11.f3182n;
                try {
                    ResultKt.throwOnFailure(objO);
                    nVar10 = (x0X.n) objO;
                    aCVar5.J2().nr(str5);
                    if (aCVar5.gh.n().rl()) {
                        C.nr(aCVar5.mUb, null, null, aCVar5.new w6(str5, nVar8, null), 3, null);
                    }
                    if (!(nVar10 instanceof n.C1266n)) {
                        SL.w6 w6Var2 = (SL.w6) ((n.C1266n) nVar10).n();
                        MaxAd maxAdN = w6Var2.n();
                        SL.j jVarRl = w6Var2.rl();
                        k.Ml mlO2 = aCVar5.Uo().O(maxAdN, jVarRl, nVar8.t(), nVar8.n(), nVar8.rl());
                        aCVar5.xMQ().invoke(mlO2);
                        if (jVar != null) {
                            tCX.j.J2(jVar, jVarRl, "max", mlO2.rl());
                        }
                        w6Var = new n.C1266n(SL.n.rl(jVarRl));
                    } else {
                        if (!(nVar10 instanceof n.w6)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        SL.Wre wre = (SL.Wre) ((n.w6) nVar10).n();
                        k.Ml mlN = aCVar5.Uo().n(wre.n(), nVar8.t(), nVar8.n(), nVar8.rl());
                        aCVar5.xMQ().invoke(mlN);
                        if (jVar != null) {
                            jVar.n(tCX.j.n(mlN).J2());
                        }
                        if (wre instanceof Wre.j) {
                            w6Var = new n.w6(I28.j.f63473n);
                        } else {
                            if (!(wre instanceof Wre.n)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            w6Var = new n.w6(I28.n.f63474n);
                        }
                    }
                    aCVar5.qie.set(false);
                    return w6Var;
                } catch (Throwable th) {
                    th = th;
                    aCVar5.qie.set(false);
                    throw th;
                }
            }
            nVar7 = (w6.n) nVar11.J2;
            str3 = (String) nVar11.f3178O;
            activity5 = (Activity) nVar11.f3185t;
            aCVar4 = (aC) nVar11.f3182n;
            ResultKt.throwOnFailure(objO);
            nVar9 = (x0X.n) objO;
            if (!(nVar9 instanceof n.C1266n)) {
                aCVar4.qie.set(false);
                return new n.C1266n(new Ml.C0836Ml(((dI8.n) ((n.C1266n) nVar9).n()).getMessage()));
            }
            if (!(nVar9 instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            w6.n nVar12 = nVar7;
            maxRewardedAd = (MaxRewardedAd) ((n.w6) nVar9).n();
            nVar6 = nVar12;
            str4 = str3;
            activity4 = activity5;
            aCVar3 = aCVar4;
            k.Ml mlUo2 = aCVar3.Uo().Uo(str4, nVar6.t(), nVar6.n(), nVar6.rl());
            aCVar3.xMQ().invoke(mlUo2);
            rB.Ml mlKN22 = aCVar3.KN();
            jVarNr = (mlKN22 != null || (mlO = mlKN22.O()) == null) ? null : Ml.n.nr(mlO, tCX.j.n(mlUo2), null, 2, null);
            final Ref.BooleanRef booleanRef4 = new Ref.BooleanRef();
            final Ref.BooleanRef booleanRef22 = new Ref.BooleanRef();
            final Ref.BooleanRef booleanRef32 = new Ref.BooleanRef();
            try {
                Function1 function14 = new Function1() { // from class: Foy.CN3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return aC.ck(booleanRef4, aCVar3, nVar6, (MaxAd) obj2);
                    }
                };
                Function1 function122 = new Function1() { // from class: Foy.fuX
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return aC.Ik(booleanRef22, aCVar3, nVar6, (MaxAd) obj2);
                    }
                };
                Function1 function132 = new Function1() { // from class: Foy.Dsr
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return aC.r(booleanRef32, aCVar3, nVar6, (MaxAd) obj2);
                    }
                };
                nVar11.f3182n = aCVar3;
                nVar11.f3185t = str4;
                nVar11.f3178O = nVar6;
                nVar11.J2 = jVarNr;
                nVar11.f3181g = 4;
                objN = Ha.Wre.n(maxRewardedAd, activity4, function14, function122, function132, nVar11);
                if (objN != coroutine_suspended) {
                    nVar8 = nVar6;
                    objO = objN;
                    str5 = str4;
                    aCVar5 = aCVar3;
                    jVar = jVarNr;
                    nVar10 = (x0X.n) objO;
                    aCVar5.J2().nr(str5);
                    if (aCVar5.gh.n().rl()) {
                    }
                    if (!(nVar10 instanceof n.C1266n)) {
                    }
                    aCVar5.qie.set(false);
                    return w6Var;
                }
                return coroutine_suspended;
            } catch (Throwable th2) {
                th = th2;
                aCVar5 = aCVar3;
                aCVar5.qie.set(false);
                throw th;
            }
        }
        z3 = nVar11.f3184r;
        w6.n nVar13 = (w6.n) nVar11.J2;
        String str7 = (String) nVar11.f3178O;
        Activity activity8 = (Activity) nVar11.f3185t;
        aCVar = (aC) nVar11.f3182n;
        ResultKt.throwOnFailure(objO);
        obj = objO;
        activity2 = activity8;
        nVar3 = nVar13;
        str2 = str7;
        if (!((Boolean) obj).booleanValue()) {
            return new n.C1266n(Ml.I28.f63475n);
        }
        if (aCVar.qie.getAndSet(true)) {
            n.C1266n c1266n = new n.C1266n(Ml.n.f63480n);
            rB.Ml mlKN3 = aCVar.KN();
            if (mlKN3 != null) {
                tCX.j.O(mlKN3, HI, "max");
            }
            return c1266n;
        }
        if (z3) {
            aCVar.xMQ().invoke(aCVar.Uo().ty(str2, nVar3.t(), nVar3.n()));
        }
        long jT2 = aCVar.gh.n().t();
        nVar11.f3182n = aCVar;
        nVar11.f3185t = activity2;
        nVar11.f3178O = str2;
        nVar11.J2 = nVar3;
        nVar11.f3183o = jT2;
        nVar11.f3181g = 2;
        str3 = str2;
        nVar4 = nVar3;
        j2 = jT2;
        aCVar2 = aCVar;
        Object objO2 = aCVar2.o(str3, nVar4, j2, nVar11);
        if (objO2 != coroutine_suspended) {
            activity3 = activity2;
            objO = objO2;
            nVar5 = (x0X.n) objO;
            if (!(nVar5 instanceof n.C1266n)) {
            }
        }
        return coroutine_suspended;
    }

    public Context ty() {
        return this.J2;
    }

    @Override // Foy.w6
    public Function1 xMQ() {
        return this.KN;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aC(Context context, InterfaceC2202n adOrable, Function1 trackEvent, Function1 trackAdRevenueEvent, rB.Ml ml, vd loadScope) {
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

    private final Object o(String str, w6.n nVar, long j2, Continuation continuation) {
        return mUb(str, nVar.t(), nVar.n(), j2, new I28(str, this, null), continuation);
    }
}
