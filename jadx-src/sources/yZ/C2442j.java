package yZ;

import AE.I28;
import GJW.yg;
import TFv.CN3;
import TFv.Wre;
import TFv.fuX;
import com.bendingspoons.networking.NetworkError;
import com.bendingspoons.spidersense.domain.entities.j;
import com.bendingspoons.spidersense.domain.network.entities.sampling.SpiderSenseServerSettings;
import ifA.I28;
import ifA.j;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.time.Duration;
import x0X.n;
import yZ.C2442j;

/* JADX INFO: renamed from: yZ.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class C2442j implements gp2.j {
    private final long J2;
    private final long KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Function1 f75685O;
    private final long Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final I28 f75686n;
    private final Kre.I28 nr;
    private final cA.Ml rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final lA5.j f75687t;
    private final int xMQ;
    public static final C1282j mUb = new C1282j(null);
    public static final int gh = 8;

    /* JADX INFO: renamed from: yZ.j$Ml */
    static final class Ml extends ContinuationImpl {
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f75688O;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        int f75689S;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f75691n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        /* synthetic */ Object f75692o;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f75693r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f75694t;

        Ml(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f75692o = obj;
            this.f75689S |= Integer.MIN_VALUE;
            return C2442j.this.J2(null, this);
        }
    }

    /* JADX INFO: renamed from: yZ.j$j, reason: collision with other inner class name */
    public static final class C1282j {
        public /* synthetic */ C1282j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C1282j() {
        }
    }

    /* JADX INFO: renamed from: yZ.j$n */
    private static final class n {

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final C1283j f75695t = new C1283j(null);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final I28.n f75696n;
        private final boolean rl;

        /* JADX INFO: renamed from: yZ.j$n$j, reason: collision with other inner class name */
        public static final class C1283j {
            public /* synthetic */ C1283j(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private C1283j() {
            }

            public final n n(String userId) {
                Intrinsics.checkNotNullParameter(userId, "userId");
                return new n(new I28.n(userId, CollectionsKt.listOf(new j.fuX(false)), false, null, 8, null), true);
            }

            public final n rl(String userId) {
                Intrinsics.checkNotNullParameter(userId, "userId");
                return new n(new I28.n(userId, CollectionsKt.emptyList(), true, null, 8, null), true);
            }
        }

        public n(I28.n configuration, boolean z2) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.f75696n = configuration;
            this.rl = z2;
        }

        public final I28.n n() {
            return this.f75696n;
        }

        public final boolean rl() {
            return this.rl;
        }
    }

    /* JADX INFO: renamed from: yZ.j$w6 */
    static final class w6 extends SuspendLambda implements Function2 {
        private /* synthetic */ Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f75697O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f75698n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ Function1 f75699o;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        long f75701t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w6(Function1 function1, Continuation continuation) {
            super(2, continuation);
            this.f75699o = function1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit xMQ(ifA.w6 w6Var) {
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            w6 w6Var = C2442j.this.new w6(this.f75699o, continuation);
            w6Var.J2 = obj;
            return w6Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CN3 cn3, Continuation continuation) {
            return ((w6) create(cn3, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0093, code lost:
        
            if (r2.rl(r10, r9) == r0) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00a6, code lost:
        
            if (r2.rl(r10, r9) == r0) goto L47;
         */
        /* JADX WARN: Path cross not found for [B:30:0x00b9, B:45:0x0106], limit reached: 43 */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0097  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00bb  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00d4  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0106  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0031 A[PHI: r1 r3 r4 r10
          0x0031: PHI (r1v15 long) = (r1v14 long), (r1v22 long) binds: [B:7:0x0024, B:40:0x00fe] A[DONT_GENERATE, DONT_INLINE]
          0x0031: PHI (r3v8 yZ.j$n) = (r3v7 yZ.j$n), (r3v10 yZ.j$n) binds: [B:7:0x0024, B:40:0x00fe] A[DONT_GENERATE, DONT_INLINE]
          0x0031: PHI (r4v4 TFv.CN3) = (r4v3 TFv.CN3), (r4v5 TFv.CN3) binds: [B:7:0x0024, B:40:0x00fe] A[DONT_GENERATE, DONT_INLINE]
          0x0031: PHI (r10v12 java.lang.Object) = (r10v0 java.lang.Object), (r10v18 java.lang.Object) binds: [B:7:0x0024, B:40:0x00fe] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0103 -> B:30:0x00b9). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x011a -> B:30:0x00b9). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            CN3 cn3;
            n nVar;
            long j2;
            long j3;
            n nVar2;
            CN3 cn32;
            long jCoerceAtMost;
            n nVar3;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.f75697O) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    CN3 cn33 = (CN3) this.J2;
                    C2442j c2442j = C2442j.this;
                    Function1 function1 = this.f75699o;
                    this.J2 = cn33;
                    this.f75697O = 1;
                    Object objJ2 = c2442j.J2(function1, this);
                    if (objJ2 != coroutine_suspended) {
                        cn3 = cn33;
                        obj = objJ2;
                        nVar = (n) obj;
                        if (nVar != null) {
                            I28.j jVar = I28.j.f68130n;
                            this.J2 = cn3;
                            this.f75698n = nVar;
                            this.f75697O = 2;
                        } else {
                            I28.n nVarN = nVar.n();
                            this.J2 = cn3;
                            this.f75698n = nVar;
                            this.f75697O = 3;
                        }
                        break;
                    }
                    return coroutine_suspended;
                case 1:
                    CN3 cn34 = (CN3) this.J2;
                    ResultKt.throwOnFailure(obj);
                    cn3 = cn34;
                    nVar = (n) obj;
                    if (nVar != null) {
                    }
                    return coroutine_suspended;
                case 2:
                    nVar = (n) this.f75698n;
                    cn3 = (CN3) this.J2;
                    ResultKt.throwOnFailure(obj);
                    j2 = C2442j.this.Uo;
                    if (nVar == null && !nVar.rl()) {
                        return Unit.INSTANCE;
                    }
                    this.J2 = cn3;
                    this.f75698n = nVar;
                    this.f75701t = j2;
                    this.f75697O = 4;
                    if (yg.rl(j2, this) != coroutine_suspended) {
                        long j4 = j2;
                        nVar2 = nVar;
                        cn32 = cn3;
                        j3 = j4;
                        jCoerceAtMost = RangesKt.coerceAtMost(j3 * ((long) C2442j.this.xMQ), C2442j.this.KN);
                        C2442j c2442j2 = C2442j.this;
                        Function1 function12 = new Function1() { // from class: yZ.n
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return C2442j.w6.xMQ((ifA.w6) obj2);
                            }
                        };
                        this.J2 = cn32;
                        this.f75698n = nVar2;
                        this.f75701t = jCoerceAtMost;
                        this.f75697O = 5;
                        obj = c2442j2.J2(function12, this);
                        if (obj != coroutine_suspended) {
                            long j5 = jCoerceAtMost;
                            nVar = nVar2;
                            cn3 = cn32;
                            j2 = j5;
                            nVar3 = (n) obj;
                            if (nVar3 != null) {
                                I28.n nVarN2 = nVar3.n();
                                this.J2 = cn3;
                                this.f75698n = nVar3;
                                this.f75701t = j2;
                                this.f75697O = 6;
                                if (cn3.rl(nVarN2, this) != coroutine_suspended) {
                                    nVar = nVar3;
                                }
                            }
                            if (nVar == null) {
                            }
                            this.J2 = cn3;
                            this.f75698n = nVar;
                            this.f75701t = j2;
                            this.f75697O = 4;
                            if (yg.rl(j2, this) != coroutine_suspended) {
                            }
                        }
                    }
                    return coroutine_suspended;
                case 3:
                    nVar = (n) this.f75698n;
                    cn3 = (CN3) this.J2;
                    ResultKt.throwOnFailure(obj);
                    if (!nVar.rl()) {
                        return Unit.INSTANCE;
                    }
                    j2 = C2442j.this.Uo;
                    if (nVar == null) {
                    }
                    this.J2 = cn3;
                    this.f75698n = nVar;
                    this.f75701t = j2;
                    this.f75697O = 4;
                    if (yg.rl(j2, this) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 4:
                    j3 = this.f75701t;
                    nVar2 = (n) this.f75698n;
                    cn32 = (CN3) this.J2;
                    ResultKt.throwOnFailure(obj);
                    jCoerceAtMost = RangesKt.coerceAtMost(j3 * ((long) C2442j.this.xMQ), C2442j.this.KN);
                    C2442j c2442j22 = C2442j.this;
                    Function1 function122 = new Function1() { // from class: yZ.n
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return C2442j.w6.xMQ((ifA.w6) obj2);
                        }
                    };
                    this.J2 = cn32;
                    this.f75698n = nVar2;
                    this.f75701t = jCoerceAtMost;
                    this.f75697O = 5;
                    obj = c2442j22.J2(function122, this);
                    if (obj != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 5:
                    jCoerceAtMost = this.f75701t;
                    nVar2 = (n) this.f75698n;
                    cn32 = (CN3) this.J2;
                    ResultKt.throwOnFailure(obj);
                    long j52 = jCoerceAtMost;
                    nVar = nVar2;
                    cn3 = cn32;
                    j2 = j52;
                    nVar3 = (n) obj;
                    if (nVar3 != null) {
                    }
                    if (nVar == null) {
                    }
                    this.J2 = cn3;
                    this.f75698n = nVar;
                    this.f75701t = j2;
                    this.f75697O = 4;
                    if (yg.rl(j2, this) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 6:
                    long j6 = this.f75701t;
                    n nVar4 = (n) this.f75698n;
                    CN3 cn35 = (CN3) this.J2;
                    ResultKt.throwOnFailure(obj);
                    nVar = nVar4;
                    cn3 = cn35;
                    j2 = j6;
                    if (nVar == null) {
                    }
                    this.J2 = cn3;
                    this.f75698n = nVar;
                    this.f75701t = j2;
                    this.f75697O = 4;
                    if (yg.rl(j2, this) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public /* synthetic */ C2442j(AE.I28 i28, cA.Ml ml, lA5.j jVar, Kre.I28 i282, Function1 function1, long j2, long j3, long j4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i28, ml, jVar, i282, function1, j2, j3, j4, i2);
    }

    private C2442j(AE.I28 userInfoManager, cA.Ml deviceInfoProvider, lA5.j networkInterface, Kre.I28 dataStore, Function1 shouldSendEventsWhenSetupResponseNotPresent, long j2, long j3, long j4, int i2) {
        Intrinsics.checkNotNullParameter(userInfoManager, "userInfoManager");
        Intrinsics.checkNotNullParameter(deviceInfoProvider, "deviceInfoProvider");
        Intrinsics.checkNotNullParameter(networkInterface, "networkInterface");
        Intrinsics.checkNotNullParameter(dataStore, "dataStore");
        Intrinsics.checkNotNullParameter(shouldSendEventsWhenSetupResponseNotPresent, "shouldSendEventsWhenSetupResponseNotPresent");
        this.f75686n = userInfoManager;
        this.rl = deviceInfoProvider;
        this.f75687t = networkInterface;
        this.nr = dataStore;
        this.f75685O = shouldSendEventsWhenSetupResponseNotPresent;
        this.J2 = j2;
        this.Uo = j3;
        this.KN = j4;
        this.xMQ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x019d A[PHI: r1 r4 r8 r9 r10
      0x019d: PHI (r1v33 x0X.n) = (r1v25 x0X.n), (r1v49 x0X.n) binds: [B:58:0x0150, B:71:0x019a] A[DONT_GENERATE, DONT_INLINE]
      0x019d: PHI (r4v13 com.bendingspoons.spidersense.domain.network.entities.sampling.SpiderSenseServerSettings) = 
      (r4v11 com.bendingspoons.spidersense.domain.network.entities.sampling.SpiderSenseServerSettings)
      (r4v18 com.bendingspoons.spidersense.domain.network.entities.sampling.SpiderSenseServerSettings)
     binds: [B:58:0x0150, B:71:0x019a] A[DONT_GENERATE, DONT_INLINE]
      0x019d: PHI (r8v14 yZ.j) = (r8v9 yZ.j), (r8v16 yZ.j) binds: [B:58:0x0150, B:71:0x019a] A[DONT_GENERATE, DONT_INLINE]
      0x019d: PHI (r9v13 kotlin.jvm.functions.Function1) = (r9v9 kotlin.jvm.functions.Function1), (r9v14 kotlin.jvm.functions.Function1) binds: [B:58:0x0150, B:71:0x019a] A[DONT_GENERATE, DONT_INLINE]
      0x019d: PHI (r10v14 java.lang.String) = (r10v9 java.lang.String), (r10v16 java.lang.String) binds: [B:58:0x0150, B:71:0x019a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0210  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object J2(Function1 function1, Continuation continuation) {
        Ml ml;
        Function1 function12;
        C2442j c2442j;
        boolean z2;
        C2442j c2442j2;
        Function1 function13;
        String str;
        Object objN;
        int i2;
        Function1 function14;
        C2442j c2442j3;
        String str2;
        x0X.n nVar;
        SpiderSenseServerSettings spiderSenseServerSettings;
        SpiderSenseServerSettings spiderSenseServerSettings2;
        x0X.n nVarN;
        C2442j c2442j4;
        String str3;
        SpiderSenseServerSettings spiderSenseServerSettings3;
        C2442j c2442j5;
        Function1 function15;
        String str4;
        String str5;
        x0X.n nVar2;
        if (continuation instanceof Ml) {
            ml = (Ml) continuation;
            int i3 = ml.f75689S;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ml.f75689S = i3 - Integer.MIN_VALUE;
            } else {
                ml = new Ml(continuation);
            }
        }
        Object objN2 = ml.f75692o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (ml.f75689S) {
            case 0:
                ResultKt.throwOnFailure(objN2);
                AE.I28 i28 = this.f75686n;
                ml.f75691n = this;
                function12 = function1;
                ml.f75694t = function12;
                ml.f75689S = 1;
                objN2 = i28.n(ml);
                if (objN2 != coroutine_suspended) {
                    c2442j = this;
                    x0X.n nVar3 = (x0X.n) objN2;
                    z2 = nVar3 instanceof n.C1266n;
                    if (!z2) {
                        function12.invoke(((n.C1266n) nVar3).n());
                    } else if (!(nVar3 instanceof n.w6)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (!z2) {
                        return null;
                    }
                    if (!(nVar3 instanceof n.w6)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String str6 = (String) ((n.w6) nVar3).n();
                    Kre.I28 i282 = c2442j.nr;
                    ml.f75691n = c2442j;
                    ml.f75694t = function12;
                    ml.f75688O = str6;
                    ml.f75689S = 2;
                    Object objT = i282.t(ml);
                    if (objT != coroutine_suspended) {
                        c2442j2 = c2442j;
                        function13 = function12;
                        str = str6;
                        objN2 = objT;
                        Duration duration = (Duration) objN2;
                        int i5 = (duration != null || Duration.m1651compareToLRDsOJo(duration.getRawValue(), c2442j2.J2) > 0) ? 1 : 0;
                        Kre.I28 i283 = c2442j2.nr;
                        ml.f75691n = c2442j2;
                        ml.f75694t = function13;
                        ml.f75688O = str;
                        ml.f75693r = i5;
                        ml.f75689S = 3;
                        objN = i283.n(ml);
                        if (objN != coroutine_suspended) {
                            String str7 = str;
                            i2 = i5;
                            objN2 = objN;
                            function14 = function13;
                            c2442j3 = c2442j2;
                            str2 = str7;
                            nVar = (x0X.n) objN2;
                            if (!(nVar instanceof n.C1266n)) {
                                function14.invoke(AbstractC2444w6.KN((Throwable) ((n.C1266n) nVar).n()));
                            } else if (!(nVar instanceof n.w6)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            spiderSenseServerSettings = (SpiderSenseServerSettings) x0X.w6.nr(nVar);
                            if (i2 != 0 && spiderSenseServerSettings != null) {
                                return KN(c2442j3, spiderSenseServerSettings, str2, false, 2, null);
                            }
                            spiderSenseServerSettings2 = spiderSenseServerSettings;
                            nVarN = c2442j3.rl.n();
                            if (nVarN instanceof n.C1266n) {
                                if (nVarN instanceof n.C1266n) {
                                }
                            } else {
                                if (!(nVarN instanceof n.w6)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                j.C0739j c0739j = (j.C0739j) ((n.w6) nVarN).n();
                                lA5.j jVar = c2442j3.f75687t;
                                String strRl = c0739j.rl();
                                ml.f75691n = c2442j3;
                                ml.f75694t = function14;
                                ml.f75688O = str2;
                                ml.J2 = spiderSenseServerSettings2;
                                ml.f75689S = 4;
                                objN2 = jVar.rl(str2, strRl, ml);
                                if (objN2 != coroutine_suspended) {
                                    String str8 = str2;
                                    c2442j4 = c2442j3;
                                    str3 = str8;
                                    nVarN = (x0X.n) objN2;
                                    if (!(nVarN instanceof n.C1266n)) {
                                        nVarN = new n.C1266n(aw.j.n((NetworkError) ((n.C1266n) nVarN).n(), "SpiderSenseSetupperImpl"));
                                    } else if (!(nVarN instanceof n.w6)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    C2442j c2442j6 = c2442j4;
                                    str2 = str3;
                                    c2442j3 = c2442j6;
                                    if (nVarN instanceof n.C1266n) {
                                        function14.invoke(AbstractC2444w6.O((ifA.w6) ((n.C1266n) nVarN).n(), spiderSenseServerSettings2 != null));
                                        if (spiderSenseServerSettings2 != null) {
                                            return c2442j3.Uo(spiderSenseServerSettings2, str2, true);
                                        }
                                        Function1 function16 = c2442j3.f75685O;
                                        ml.f75691n = str2;
                                        ml.f75694t = null;
                                        ml.f75688O = null;
                                        ml.J2 = null;
                                        ml.f75689S = 5;
                                        objN2 = function16.invoke(ml);
                                        if (objN2 != coroutine_suspended) {
                                            str5 = str2;
                                            return !((Boolean) objN2).booleanValue() ? n.f75695t.rl(str5) : n.f75695t.n(str5);
                                        }
                                    } else {
                                        if (!(nVarN instanceof n.w6)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        SpiderSenseServerSettings spiderSenseServerSettings4 = (SpiderSenseServerSettings) ((n.w6) nVarN).n();
                                        Kre.I28 i284 = c2442j3.nr;
                                        ml.f75691n = c2442j3;
                                        ml.f75694t = function14;
                                        ml.f75688O = str2;
                                        ml.J2 = spiderSenseServerSettings4;
                                        ml.f75689S = 6;
                                        Object objRl = i284.rl(spiderSenseServerSettings4, ml);
                                        if (objRl != coroutine_suspended) {
                                            spiderSenseServerSettings3 = spiderSenseServerSettings4;
                                            objN2 = objRl;
                                            c2442j5 = c2442j3;
                                            function15 = function14;
                                            str4 = str2;
                                            nVar2 = (x0X.n) objN2;
                                            if (!(nVar2 instanceof n.C1266n)) {
                                                function15.invoke(AbstractC2444w6.xMQ((Throwable) ((n.C1266n) nVar2).n()));
                                            } else if (!(nVar2 instanceof n.w6)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            return KN(c2442j5, spiderSenseServerSettings3, str4, false, 2, null);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return coroutine_suspended;
            case 1:
                function12 = (Function1) ml.f75694t;
                c2442j = (C2442j) ml.f75691n;
                ResultKt.throwOnFailure(objN2);
                x0X.n nVar32 = (x0X.n) objN2;
                z2 = nVar32 instanceof n.C1266n;
                if (!z2) {
                }
                if (!z2) {
                }
                break;
            case 2:
                str = (String) ml.f75688O;
                function13 = (Function1) ml.f75694t;
                C2442j c2442j7 = (C2442j) ml.f75691n;
                ResultKt.throwOnFailure(objN2);
                c2442j2 = c2442j7;
                Duration duration2 = (Duration) objN2;
                if (duration2 != null) {
                    break;
                }
                Kre.I28 i2832 = c2442j2.nr;
                ml.f75691n = c2442j2;
                ml.f75694t = function13;
                ml.f75688O = str;
                ml.f75693r = i5;
                ml.f75689S = 3;
                objN = i2832.n(ml);
                if (objN != coroutine_suspended) {
                }
                return coroutine_suspended;
            case 3:
                i2 = ml.f75693r;
                String str9 = (String) ml.f75688O;
                function14 = (Function1) ml.f75694t;
                C2442j c2442j8 = (C2442j) ml.f75691n;
                ResultKt.throwOnFailure(objN2);
                str2 = str9;
                c2442j3 = c2442j8;
                nVar = (x0X.n) objN2;
                if (!(nVar instanceof n.C1266n)) {
                }
                spiderSenseServerSettings = (SpiderSenseServerSettings) x0X.w6.nr(nVar);
                if (i2 != 0) {
                }
                spiderSenseServerSettings2 = spiderSenseServerSettings;
                nVarN = c2442j3.rl.n();
                if (nVarN instanceof n.C1266n) {
                }
                return coroutine_suspended;
            case 4:
                spiderSenseServerSettings2 = (SpiderSenseServerSettings) ml.J2;
                str3 = (String) ml.f75688O;
                function14 = (Function1) ml.f75694t;
                c2442j4 = (C2442j) ml.f75691n;
                ResultKt.throwOnFailure(objN2);
                nVarN = (x0X.n) objN2;
                if (!(nVarN instanceof n.C1266n)) {
                }
                C2442j c2442j62 = c2442j4;
                str2 = str3;
                c2442j3 = c2442j62;
                if (nVarN instanceof n.C1266n) {
                }
                return coroutine_suspended;
            case 5:
                str5 = (String) ml.f75691n;
                ResultKt.throwOnFailure(objN2);
                if (!((Boolean) objN2).booleanValue()) {
                }
                break;
            case 6:
                spiderSenseServerSettings3 = (SpiderSenseServerSettings) ml.J2;
                str4 = (String) ml.f75688O;
                function15 = (Function1) ml.f75694t;
                c2442j5 = (C2442j) ml.f75691n;
                ResultKt.throwOnFailure(objN2);
                nVar2 = (x0X.n) objN2;
                if (!(nVar2 instanceof n.C1266n)) {
                }
                return KN(c2442j5, spiderSenseServerSettings3, str4, false, 2, null);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    static /* synthetic */ n KN(C2442j c2442j, SpiderSenseServerSettings spiderSenseServerSettings, String str, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z2 = false;
        }
        return c2442j.Uo(spiderSenseServerSettings, str, z2);
    }

    private final n Uo(SpiderSenseServerSettings spiderSenseServerSettings, String str, boolean z2) {
        return new n(AbstractC2444w6.Uo(spiderSenseServerSettings, str), z2);
    }

    @Override // gp2.j
    public Wre n(Function1 errorLogger) {
        Intrinsics.checkNotNullParameter(errorLogger, "errorLogger");
        return fuX.iF(new w6(errorLogger, null));
    }

    public /* synthetic */ C2442j(AE.I28 i28, cA.Ml ml, lA5.j jVar, Kre.I28 i282, Function1 function1, long j2, long j3, long j4, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i28, ml, jVar, i282, function1, j2, (i3 & 64) != 0 ? 5000L : j3, (i3 & 128) != 0 ? 86400000L : j4, (i3 & 256) != 0 ? 4 : i2, null);
    }
}
