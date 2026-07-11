package bV;

import GJW.C;
import GJW.Lu;
import GJW.vd;
import cb.InterfaceC1682w6;
import com.bendingspoons.concierge.domain.entities.Id;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import sJa.CN3;
import x0X.n;
import zD.j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class Ml implements InterfaceC1682w6 {
    private final vd J2;
    private final CN3 KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Function0 f43291O;
    private final Map Uo;
    private final Fqb.j nr;
    private final Function0 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final HX.Wre f43292t;
    public static final j xMQ = new j(null);
    private static final String mUb = "Unable to read id from the storage just after having wrote it.";
    private static final n.C1266n gh = new n.C1266n(new zD.j(j.w6.J2, j.EnumC1290j.J2, j.n.f76391o, "Unable to read id from the storage just after having wrote it.", new IllegalStateException("Unable to read id from the storage just after having wrote it.")));

    static final class I28 extends ContinuationImpl {
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f43293O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        int f43294Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f43295n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f43297r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f43298t;

        I28(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f43297r = obj;
            this.f43294Z |= Integer.MIN_VALUE;
            return Ml.this.KN(null, this);
        }
    }

    /* JADX INFO: renamed from: bV.Ml$Ml, reason: collision with other inner class name */
    static final class C0576Ml extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Id.Predefined.External.j f43299O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f43300n;

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((C0576Ml) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0576Ml(Id.Predefined.External.j jVar, Continuation continuation) {
            super(2, continuation);
            this.f43299O = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return Ml.this.new C0576Ml(this.f43299O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f43300n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                Ml ml = Ml.this;
                Id.Predefined.External.j jVar = this.f43299O;
                this.f43300n = 1;
                if (ml.KN(jVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
    }

    static final class Wre extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f43302n;

        static final class j extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ Ml f43304O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f43305n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private /* synthetic */ Object f43306t;

            /* JADX INFO: renamed from: bV.Ml$Wre$j$j, reason: collision with other inner class name */
            static final class C0577j extends SuspendLambda implements Function2 {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ Id.Predefined.External.j f43307O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f43308n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ Ml f43309t;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(vd vdVar, Continuation continuation) {
                    return ((C0577j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0577j(Ml ml, Id.Predefined.External.j jVar, Continuation continuation) {
                    super(2, continuation);
                    this.f43309t = ml;
                    this.f43307O = jVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new C0577j(this.f43309t, this.f43307O, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.f43308n;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            ResultKt.throwOnFailure(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.throwOnFailure(obj);
                        if (this.f43309t.Uo(this.f43307O)) {
                            Ml ml = this.f43309t;
                            Id.Predefined.External.j jVar = this.f43307O;
                            this.f43308n = 1;
                            obj = ml.KN(jVar, this);
                            if (obj == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } else {
                            return new n.w6(Unit.INSTANCE);
                        }
                    }
                    return (x0X.n) obj;
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(Ml ml, Continuation continuation) {
                super(2, continuation);
                this.f43304O = ml;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                j jVar = new j(this.f43304O, continuation);
                jVar.f43306t = obj;
                return jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f43305n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    vd vdVar = (vd) this.f43306t;
                    Set setN = ujA.w6.n();
                    Ml ml = this.f43304O;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(setN, 10));
                    Iterator it = setN.iterator();
                    while (it.hasNext()) {
                        arrayList.add(C.rl(vdVar, null, null, new C0577j(ml, (Id.Predefined.External.j) it.next(), null), 3, null));
                    }
                    this.f43305n = 1;
                    obj = GJW.Wre.n(arrayList, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return x0X.w6.t((Collection) obj);
            }
        }

        Wre(Continuation continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return Ml.this.new Wre(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f43302n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            j jVar = new j(Ml.this, null);
            this.f43302n = 1;
            Object objJ2 = Lu.J2(jVar, this);
            if (objJ2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objJ2;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((Wre) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    public static final class n extends SuspendLambda implements Function2 {
        final /* synthetic */ Ml J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Iterable f43310O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f43311n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f43312t;

        public static final class j extends SuspendLambda implements Function2 {
            final /* synthetic */ Ml J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ Object f43313O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f43314n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private /* synthetic */ Object f43315t;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public j(Object obj, Continuation continuation, Ml ml) {
                super(2, continuation);
                this.f43313O = obj;
                this.J2 = ml;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                j jVar = new j(this.f43313O, continuation, this.J2);
                jVar.f43315t = obj;
                return jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f43314n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Id.Predefined.External.j jVar = (Id.Predefined.External.j) this.f43313O;
                Ml ml = this.J2;
                this.f43314n = 1;
                Object objT = ml.t(jVar, this);
                if (objT == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return objT;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Iterable iterable, Continuation continuation, Ml ml) {
            super(2, continuation);
            this.f43310O = iterable;
            this.J2 = ml;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            n nVar = new n(this.f43310O, continuation, this.J2);
            nVar.f43312t = obj;
            return nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f43311n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            vd vdVar = (vd) this.f43312t;
            Iterable iterable = this.f43310O;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(C.rl(vdVar, null, null, new j(it.next(), null, this.J2), 3, null));
            }
            this.f43311n = 1;
            Object objN = GJW.Wre.n(arrayList, this);
            if (objN == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objN;
        }
    }

    static final class w6 extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f43316O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f43317n;

        w6(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f43317n = obj;
            this.f43316O |= Integer.MIN_VALUE;
            return Ml.this.n(this);
        }
    }

    public Ml(Function0 isUserAtLeast13, HX.Wre externalIdProvider, Fqb.j externalIdRepository, Function0 currentTimeProvider, sJa.Ml dispatcherProvider) {
        Intrinsics.checkNotNullParameter(isUserAtLeast13, "isUserAtLeast13");
        Intrinsics.checkNotNullParameter(externalIdProvider, "externalIdProvider");
        Intrinsics.checkNotNullParameter(externalIdRepository, "externalIdRepository");
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        this.rl = isUserAtLeast13;
        this.f43292t = externalIdProvider;
        this.nr = externalIdRepository;
        this.f43291O = currentTimeProvider;
        this.J2 = Lu.n(dispatcherProvider.nr());
        Set setN = ujA.w6.n();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setN, 10)), 16));
        for (Object obj : setN) {
            linkedHashMap.put(obj, yB.CN3.rl(false, 1, null));
        }
        this.Uo = MapsKt.toMap(linkedHashMap);
        this.KN = CN3.f73193n.n(dispatcherProvider, new Wre(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0113 A[Catch: all -> 0x0065, TryCatch #0 {all -> 0x0065, blocks: (B:23:0x0060, B:61:0x0138, B:64:0x013f, B:66:0x0143, B:85:0x018f, B:86:0x0194, B:28:0x0076, B:52:0x010a, B:55:0x0113, B:57:0x0117, B:87:0x0195, B:88:0x019a, B:31:0x0088, B:42:0x00d0, B:44:0x00da, B:47:0x00ef, B:48:0x00f8), top: B:93:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x013f A[Catch: all -> 0x0065, TryCatch #0 {all -> 0x0065, blocks: (B:23:0x0060, B:61:0x0138, B:64:0x013f, B:66:0x0143, B:85:0x018f, B:86:0x0194, B:28:0x0076, B:52:0x010a, B:55:0x0113, B:57:0x0117, B:87:0x0195, B:88:0x019a, B:31:0x0088, B:42:0x00d0, B:44:0x00da, B:47:0x00ef, B:48:0x00f8), top: B:93:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0166 A[Catch: all -> 0x0045, TryCatch #1 {all -> 0x0045, blocks: (B:16:0x0040, B:70:0x015f, B:73:0x0166, B:75:0x016a, B:77:0x0178, B:78:0x0180, B:83:0x0189, B:84:0x018e), top: B:94:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [yB.j] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v9, types: [yB.j] */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v8, types: [yB.j] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object KN(Id.Predefined.External.j jVar, Continuation continuation) throws Throwable {
        I28 i28;
        ?? r3;
        yB.j jVar2;
        Ml ml;
        yB.j jVar3;
        Ml ml2;
        Id.Predefined.External external;
        Ml ml3;
        x0X.n w6Var;
        yB.j jVar4;
        x0X.n w6Var2;
        Id.Predefined.External.j jVar5;
        Id.Predefined.External external2;
        yB.j jVar6;
        ?? r32;
        ?? r52;
        ?? r54;
        Id.Predefined.External.j jVar7 = jVar;
        if (continuation instanceof I28) {
            i28 = (I28) continuation;
            int i2 = i28.f43294Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i28.f43294Z = i2 - Integer.MIN_VALUE;
            } else {
                i28 = new I28(continuation);
            }
        }
        Object objN = i28.f43297r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r55 = i28.f43294Z;
        try {
        } catch (Throwable th) {
            th = th;
            r3 = r55;
        }
        try {
            if (r55 == 0) {
                ResultKt.throwOnFailure(objN);
                jVar2 = (yB.j) MapsKt.getValue(this.Uo, jVar7);
                i28.f43295n = this;
                i28.f43298t = jVar7;
                i28.f43293O = jVar2;
                i28.f43294Z = 1;
                if (jVar2.Z(null, i28) != coroutine_suspended) {
                    ml = this;
                }
                return coroutine_suspended;
            }
            if (r55 != 1) {
                if (r55 == 2) {
                    yB.j jVar8 = (yB.j) i28.f43293O;
                    jVar7 = (Id.Predefined.External.j) i28.f43298t;
                    ml2 = (Ml) i28.f43295n;
                    ResultKt.throwOnFailure(objN);
                    jVar3 = jVar8;
                    external = (Id.Predefined.External) x0X.w6.nr((x0X.n) objN);
                    if (external != null && ((Number) ml2.f43291O.invoke()).longValue() <= external.getExpirationTimestamp()) {
                        w6Var = new n.w6(Unit.INSTANCE);
                        r52 = jVar3;
                        r52.T(null);
                        return w6Var;
                    }
                    HX.Wre wre = ml2.f43292t;
                    i28.f43295n = ml2;
                    i28.f43298t = jVar7;
                    i28.f43293O = jVar3;
                    i28.f43294Z = 3;
                    objN = wre.n(jVar7, i28);
                    if (objN != coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    ml3 = ml2;
                    jVar4 = jVar3;
                    w6Var2 = (x0X.n) objN;
                    r54 = jVar4;
                    if (!(w6Var2 instanceof n.C1266n)) {
                    }
                    w6Var = w6Var2;
                    r52 = r54;
                    r52.T(null);
                    return w6Var;
                }
                if (r55 == 3) {
                    yB.j jVar9 = (yB.j) i28.f43293O;
                    jVar7 = (Id.Predefined.External.j) i28.f43298t;
                    ml3 = (Ml) i28.f43295n;
                    ResultKt.throwOnFailure(objN);
                    jVar4 = jVar9;
                    w6Var2 = (x0X.n) objN;
                    r54 = jVar4;
                    if (!(w6Var2 instanceof n.C1266n)) {
                        if (!(w6Var2 instanceof n.w6)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Id.Predefined.External external3 = (Id.Predefined.External) ((n.w6) w6Var2).n();
                        Fqb.j jVar10 = ml3.nr;
                        i28.f43295n = ml3;
                        i28.f43298t = jVar7;
                        i28.f43293O = jVar4;
                        i28.J2 = external3;
                        i28.f43294Z = 4;
                        Object objRl = jVar10.rl(external3, i28);
                        if (objRl == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        jVar5 = jVar7;
                        external2 = external3;
                        objN = objRl;
                        jVar6 = jVar4;
                        w6Var2 = (x0X.n) objN;
                        if (!(w6Var2 instanceof n.C1266n)) {
                        }
                    }
                    w6Var = w6Var2;
                    r52 = r54;
                    r52.T(null);
                    return w6Var;
                }
                if (r55 != 4) {
                    if (r55 != 5) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    external2 = (Id.Predefined.External) i28.f43298t;
                    r3 = (yB.j) i28.f43295n;
                    try {
                        ResultKt.throwOnFailure(objN);
                        r32 = r3;
                        w6Var2 = (x0X.n) objN;
                        if (!(w6Var2 instanceof n.C1266n)) {
                            if (!(w6Var2 instanceof n.w6)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            w6Var2 = Intrinsics.areEqual((Id.Predefined.External) ((n.w6) w6Var2).n(), external2) ? new n.w6(Unit.INSTANCE) : gh;
                        }
                        r54 = r32;
                        w6Var = w6Var2;
                        r52 = r54;
                        r52.T(null);
                        return w6Var;
                    } catch (Throwable th2) {
                        th = th2;
                        r3.T(null);
                        throw th;
                    }
                }
                external2 = (Id.Predefined.External) i28.J2;
                yB.j jVar11 = (yB.j) i28.f43293O;
                jVar5 = (Id.Predefined.External.j) i28.f43298t;
                ml3 = (Ml) i28.f43295n;
                ResultKt.throwOnFailure(objN);
                jVar6 = jVar11;
                w6Var2 = (x0X.n) objN;
                if (!(w6Var2 instanceof n.C1266n)) {
                    r54 = jVar6;
                    w6Var = w6Var2;
                    r52 = r54;
                    r52.T(null);
                    return w6Var;
                }
                if (!(w6Var2 instanceof n.w6)) {
                    throw new NoWhenBranchMatchedException();
                }
                Fqb.j jVar12 = ml3.nr;
                i28.f43295n = jVar6;
                i28.f43298t = external2;
                i28.f43293O = null;
                i28.J2 = null;
                i28.f43294Z = 5;
                objN = jVar12.n(jVar5, i28);
                if (objN != coroutine_suspended) {
                    r32 = jVar6;
                    w6Var2 = (x0X.n) objN;
                    if (!(w6Var2 instanceof n.C1266n)) {
                    }
                    r54 = r32;
                    w6Var = w6Var2;
                    r52 = r54;
                    r52.T(null);
                    return w6Var;
                }
                return coroutine_suspended;
            }
            yB.j jVar13 = (yB.j) i28.f43293O;
            Id.Predefined.External.j jVar14 = (Id.Predefined.External.j) i28.f43298t;
            ml = (Ml) i28.f43295n;
            ResultKt.throwOnFailure(objN);
            jVar2 = jVar13;
            jVar7 = jVar14;
            Fqb.j jVar15 = ml.nr;
            i28.f43295n = ml;
            i28.f43298t = jVar7;
            i28.f43293O = jVar2;
            i28.f43294Z = 2;
            Object objN2 = jVar15.n(jVar7, i28);
            if (objN2 != coroutine_suspended) {
                jVar3 = jVar2;
                objN = objN2;
                ml2 = ml;
                external = (Id.Predefined.External) x0X.w6.nr((x0X.n) objN);
                if (external != null) {
                    w6Var = new n.w6(Unit.INSTANCE);
                    r52 = jVar3;
                    r52.T(null);
                    return w6Var;
                }
                HX.Wre wre2 = ml2.f43292t;
                i28.f43295n = ml2;
                i28.f43298t = jVar7;
                i28.f43293O = jVar3;
                i28.f43294Z = 3;
                objN = wre2.n(jVar7, i28);
                if (objN != coroutine_suspended) {
                }
            }
            return coroutine_suspended;
        } catch (Throwable th3) {
            th = th3;
            r3 = jVar2;
            r3.T(null);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // cb.InterfaceC1682w6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(Continuation continuation) {
        w6 w6Var;
        if (continuation instanceof w6) {
            w6Var = (w6) continuation;
            int i2 = w6Var.f43316O;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w6Var.f43316O = i2 - Integer.MIN_VALUE;
            } else {
                w6Var = new w6(continuation);
            }
        }
        Object objJ2 = w6Var.f43317n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = w6Var.f43316O;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objJ2);
            n nVar = new n(ujA.w6.n(), null, this);
            w6Var.f43316O = 1;
            objJ2 = Lu.J2(nVar, w6Var);
            if (objJ2 == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objJ2);
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((Iterable) objJ2).iterator();
        while (it.hasNext()) {
            Id.Predefined.External external = (Id.Predefined.External) x0X.w6.nr((x0X.n) it.next());
            if (external != null) {
                arrayList.add(external);
            }
        }
        return CollectionsKt.toSet(arrayList);
    }

    @Override // cb.InterfaceC1682w6
    public Object nr(Continuation continuation) {
        return this.nr.t(continuation);
    }

    @Override // cb.InterfaceC1682w6
    public Object rl(Continuation continuation) {
        return this.KN.n(continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean Uo(Id.Predefined.External.j jVar) {
        if (!jVar.t() && !((Boolean) this.rl.invoke()).booleanValue()) {
            return false;
        }
        return true;
    }

    @Override // cb.InterfaceC1682w6
    public Object t(Id.Predefined.External.j jVar, Continuation continuation) {
        if (Uo(jVar)) {
            C.nr(this.J2, null, null, new C0576Ml(jVar, null), 3, null);
            return this.nr.n(jVar, continuation);
        }
        return new n.w6(null);
    }
}
