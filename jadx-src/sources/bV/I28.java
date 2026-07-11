package bV;

import GJW.C;
import GJW.Lu;
import GJW.Wre;
import GJW.vd;
import HX.Dsr;
import cb.InterfaceC1679Ml;
import com.bendingspoons.concierge.domain.entities.CreationType;
import com.bendingspoons.concierge.domain.entities.Id;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.ranges.RangesKt;
import sJa.CN3;
import x0X.n;
import zD.j;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
public final class I28 implements InterfaceC1679Ml {
    private final CN3 J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Map f43266O;
    private final Map nr;
    private final Dsr rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Fqb.n f43267t;
    public static final j Uo = new j(null);
    private static final String KN = "Unable to read id from the storage just after having wrote it.";
    private static final n.C1266n xMQ = new n.C1266n(new zD.j(j.w6.J2, j.EnumC1290j.f76381O, j.n.f76391o, "Unable to read id from the storage just after having wrote it.", new IllegalStateException("Unable to read id from the storage just after having wrote it.")));

    /* JADX INFO: renamed from: bV.I28$I28, reason: collision with other inner class name */
    static final class C0574I28 extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f43268n;

        /* JADX INFO: renamed from: bV.I28$I28$j */
        static final class j extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ I28 f43270O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f43271n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private /* synthetic */ Object f43272t;

            /* JADX INFO: renamed from: bV.I28$I28$j$j, reason: collision with other inner class name */
            static final class C0575j extends SuspendLambda implements Function2 {

                /* JADX INFO: renamed from: O, reason: collision with root package name */
                final /* synthetic */ Id.Predefined.Internal.j f43273O;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                int f43274n;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                final /* synthetic */ I28 f43275t;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(vd vdVar, Continuation continuation) {
                    return ((C0575j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0575j(I28 i28, Id.Predefined.Internal.j jVar, Continuation continuation) {
                    super(2, continuation);
                    this.f43275t = i28;
                    this.f43273O = jVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Continuation create(Object obj, Continuation continuation) {
                    return new C0575j(this.f43275t, this.f43273O, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                public final Object invokeSuspend(Object obj) throws Throwable {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i2 = this.f43274n;
                    if (i2 != 0) {
                        if (i2 == 1) {
                            ResultKt.throwOnFailure(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    I28 i28 = this.f43275t;
                    Id.Predefined.Internal.j jVar = this.f43273O;
                    this.f43274n = 1;
                    Object objO = i28.O(jVar, this);
                    if (objO == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return objO;
                }
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(I28 i28, Continuation continuation) {
                super(2, continuation);
                this.f43270O = i28;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                j jVar = new j(this.f43270O, continuation);
                jVar.f43272t = obj;
                return jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f43271n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    vd vdVar = (vd) this.f43272t;
                    Set setRl = ujA.w6.rl();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : setRl) {
                        if (ujA.w6.nr((Id.Predefined.Internal.j) obj2)) {
                            arrayList.add(obj2);
                        }
                    }
                    I28 i28 = this.f43270O;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(C.rl(vdVar, null, null, new C0575j(i28, (Id.Predefined.Internal.j) it.next(), null), 3, null));
                    }
                    this.f43271n = 1;
                    obj = Wre.n(arrayList2, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return x0X.w6.t((Collection) obj);
            }
        }

        C0574I28(Continuation continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return I28.this.new C0574I28(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f43268n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            j jVar = new j(I28.this, null);
            this.f43268n = 1;
            Object objJ2 = Lu.J2(jVar, this);
            if (objJ2 == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objJ2;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((C0574I28) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class Ml extends ContinuationImpl {
        Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f43276O;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        int f43277Z;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f43278n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f43280r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f43281t;

        Ml(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f43280r = obj;
            this.f43277Z |= Integer.MIN_VALUE;
            return I28.this.O(null, this);
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
        final /* synthetic */ I28 J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Iterable f43282O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f43283n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f43284t;

        public static final class j extends SuspendLambda implements Function2 {
            final /* synthetic */ I28 J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ Object f43285O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f43286n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private /* synthetic */ Object f43287t;

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(vd vdVar, Continuation continuation) {
                return ((j) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public j(Object obj, Continuation continuation, I28 i28) {
                super(2, continuation);
                this.f43285O = obj;
                this.J2 = i28;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                j jVar = new j(this.f43285O, continuation, this.J2);
                jVar.f43287t = obj;
                return jVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f43286n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                Id.Predefined.Internal.j jVar = (Id.Predefined.Internal.j) this.f43285O;
                I28 i28 = this.J2;
                this.f43286n = 1;
                Object objO = i28.O(jVar, this);
                if (objO == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return objO;
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(vd vdVar, Continuation continuation) {
            return ((n) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Iterable iterable, Continuation continuation, I28 i28) {
            super(2, continuation);
            this.f43282O = iterable;
            this.J2 = i28;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            n nVar = new n(this.f43282O, continuation, this.J2);
            nVar.f43284t = obj;
            return nVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f43283n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            vd vdVar = (vd) this.f43284t;
            Iterable iterable = this.f43282O;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(C.rl(vdVar, null, null, new j(it.next(), null, this.J2), 3, null));
            }
            this.f43283n = 1;
            Object objN = Wre.n(arrayList, this);
            if (objN == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objN;
        }
    }

    static final class w6 extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        int f43288O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f43289n;

        w6(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f43289n = obj;
            this.f43288O |= Integer.MIN_VALUE;
            return I28.this.n(this);
        }
    }

    public I28(Dsr internalIdProvider, Fqb.n internalIdRepository, sJa.Ml dispatcherProvider) {
        Intrinsics.checkNotNullParameter(internalIdProvider, "internalIdProvider");
        Intrinsics.checkNotNullParameter(internalIdRepository, "internalIdRepository");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        this.rl = internalIdProvider;
        this.f43267t = internalIdRepository;
        this.nr = new ConcurrentHashMap();
        Set setRl = ujA.w6.rl();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setRl, 10)), 16));
        for (Object obj : setRl) {
            linkedHashMap.put(obj, yB.CN3.rl(false, 1, null));
        }
        this.f43266O = MapsKt.toMap(linkedHashMap);
        this.J2 = CN3.f73193n.n(dispatcherProvider, new C0574I28(null));
    }

    private final x0X.n J2(Id.Predefined.Internal internal, CreationType creationType) {
        if (internal instanceof Id.Predefined.Internal.BackupPersistentId) {
            Id.Predefined.Internal.BackupPersistentId backupPersistentIdCopy$default = Id.Predefined.Internal.BackupPersistentId.copy$default((Id.Predefined.Internal.BackupPersistentId) internal, null, creationType, 1, null);
            Intrinsics.checkNotNull(backupPersistentIdCopy$default, "null cannot be cast to non-null type T of com.bendingspoons.concierge.domain.managers.internal.InternalIdManagerImpl.idWithUpdatedCreationType");
            return new n.w6(backupPersistentIdCopy$default);
        }
        if (internal instanceof Id.Predefined.Internal.NonBackupPersistentId) {
            Id.Predefined.Internal.NonBackupPersistentId nonBackupPersistentIdCopy$default = Id.Predefined.Internal.NonBackupPersistentId.copy$default((Id.Predefined.Internal.NonBackupPersistentId) internal, null, creationType, 1, null);
            Intrinsics.checkNotNull(nonBackupPersistentIdCopy$default, "null cannot be cast to non-null type T of com.bendingspoons.concierge.domain.managers.internal.InternalIdManagerImpl.idWithUpdatedCreationType");
            return new n.w6(nonBackupPersistentIdCopy$default);
        }
        return new n.C1266n(new zD.j(j.w6.J2, j.EnumC1290j.f76381O, j.n.f76391o, "Unknown internal id " + Reflection.getOrCreateKotlinClass(internal.getClass()).getSimpleName(), new IllegalArgumentException("Unknown internal id " + Reflection.getOrCreateKotlinClass(internal.getClass()).getSimpleName())));
    }

    private final Unit t(Map map, Object obj) {
        return (Unit) map.put(obj, Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x0144, code lost:
    
        if (r10 == null) goto L61;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0224 A[PHI: r2 r9 r10
      0x0224: PHI (r2v30 bV.I28) = (r2v27 bV.I28), (r2v32 bV.I28) binds: [B:114:0x0221, B:14:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x0224: PHI (r9v32 com.bendingspoons.concierge.domain.entities.Id$Predefined$Internal$j) = 
      (r9v29 com.bendingspoons.concierge.domain.entities.Id$Predefined$Internal$j)
      (r9v36 com.bendingspoons.concierge.domain.entities.Id$Predefined$Internal$j)
     binds: [B:114:0x0221, B:14:0x0051] A[DONT_GENERATE, DONT_INLINE]
      0x0224: PHI (r10v52 java.lang.Object) = (r10v50 java.lang.Object), (r10v1 java.lang.Object) binds: [B:114:0x0221, B:14:0x0051] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x022a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0254 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0133 A[Catch: all -> 0x00b0, TryCatch #0 {all -> 0x00b0, blocks: (B:27:0x00ab, B:64:0x0159, B:67:0x0161, B:69:0x0165, B:93:0x01d6, B:94:0x01db, B:32:0x00c1, B:53:0x0129, B:55:0x0133, B:57:0x013b, B:59:0x0140, B:58:0x013e, B:61:0x0146), top: B:144:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0159 A[Catch: all -> 0x00b0, PHI: r2 r4 r9 r10
      0x0159: PHI (r2v14 com.bendingspoons.concierge.domain.entities.Id$Predefined$Internal$j) = 
      (r2v11 com.bendingspoons.concierge.domain.entities.Id$Predefined$Internal$j)
      (r2v17 com.bendingspoons.concierge.domain.entities.Id$Predefined$Internal$j)
     binds: [B:62:0x0155, B:27:0x00ab] A[DONT_GENERATE, DONT_INLINE]
      0x0159: PHI (r4v7 bV.I28) = (r4v4 bV.I28), (r4v9 bV.I28) binds: [B:62:0x0155, B:27:0x00ab] A[DONT_GENERATE, DONT_INLINE]
      0x0159: PHI (r9v13 yB.j) = (r9v48 yB.j), (r9v49 yB.j) binds: [B:62:0x0155, B:27:0x00ab] A[DONT_GENERATE, DONT_INLINE]
      0x0159: PHI (r10v21 java.lang.Object) = (r10v19 java.lang.Object), (r10v1 java.lang.Object) binds: [B:62:0x0155, B:27:0x00ab] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x00b0, blocks: (B:27:0x00ab, B:64:0x0159, B:67:0x0161, B:69:0x0165, B:93:0x01d6, B:94:0x01db, B:32:0x00c1, B:53:0x0129, B:55:0x0133, B:57:0x013b, B:59:0x0140, B:58:0x013e, B:61:0x0146), top: B:144:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0161 A[Catch: all -> 0x00b0, TryCatch #0 {all -> 0x00b0, blocks: (B:27:0x00ab, B:64:0x0159, B:67:0x0161, B:69:0x0165, B:93:0x01d6, B:94:0x01db, B:32:0x00c1, B:53:0x0129, B:55:0x0133, B:57:0x013b, B:59:0x0140, B:58:0x013e, B:61:0x0146), top: B:144:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x018e A[Catch: all -> 0x009b, TryCatch #2 {all -> 0x009b, blocks: (B:22:0x0093, B:73:0x0187, B:76:0x018e, B:78:0x0192, B:91:0x01d0, B:92:0x01d5), top: B:146:0x0093 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01bc A[Catch: all -> 0x0080, TryCatch #1 {all -> 0x0080, blocks: (B:17:0x007b, B:82:0x01b2, B:84:0x01bc, B:85:0x01c7), top: B:145:0x007b }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c7 A[Catch: all -> 0x0080, TRY_LEAVE, TryCatch #1 {all -> 0x0080, blocks: (B:17:0x007b, B:82:0x01b2, B:84:0x01bc, B:85:0x01c7), top: B:145:0x007b }] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v2, types: [yB.j] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v8, types: [yB.j] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v37 */
    /* JADX WARN: Type inference failed for: r9v22, types: [yB.j] */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v46 */
    /* JADX WARN: Type inference failed for: r9v47 */
    @Override // cb.InterfaceC1679Ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object O(Id.Predefined.Internal.j jVar, Continuation continuation) throws Throwable {
        Ml ml;
        ?? r12;
        Throwable th;
        I28 i28;
        yB.j jVar2;
        I28 i282;
        Object objN;
        Id.Predefined.Internal.j jVar3;
        yB.j jVar4;
        Id.Predefined.Internal internal;
        x0X.n nVarJ2;
        yB.j jVar5;
        yB.j jVar6;
        Id.Predefined.Internal internal2;
        Id.Predefined.Internal.j jVar7;
        ?? r13;
        I28 i283;
        Id.Predefined.Internal.j jVar8;
        ?? r9;
        ?? r2;
        Id.Predefined.Internal internal3;
        x0X.n nVar;
        Id.Predefined.Internal.j jVar9;
        Id.Predefined.Internal internal4;
        x0X.n nVar2;
        I28 i284;
        Id.Predefined.Internal.j jVar10;
        if (continuation instanceof Ml) {
            ml = (Ml) continuation;
            int i2 = ml.f43277Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ml.f43277Z = i2 - Integer.MIN_VALUE;
            } else {
                ml = new Ml(continuation);
            }
        }
        Object objN2 = ml.f43280r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        try {
            switch (ml.f43277Z) {
                case 0:
                    ResultKt.throwOnFailure(objN2);
                    if (ujA.w6.nr(jVar)) {
                        if (ujA.w6.nr(jVar)) {
                            jVar2 = (yB.j) MapsKt.getValue(this.f43266O, jVar);
                            ml.f43278n = this;
                            ml.f43281t = jVar;
                            ml.f43276O = jVar2;
                            ml.f43277Z = 2;
                            if (jVar2.Z(null, ml) != coroutine_suspended) {
                                i282 = this;
                                try {
                                    Fqb.n nVar3 = i282.f43267t;
                                    ml.f43278n = i282;
                                    ml.f43281t = jVar;
                                    ml.f43276O = jVar2;
                                    ml.f43277Z = 3;
                                    objN = nVar3.n(jVar, ml);
                                    if (objN != coroutine_suspended) {
                                        jVar3 = jVar;
                                        jVar4 = jVar2;
                                        objN2 = objN;
                                        internal = (Id.Predefined.Internal) x0X.w6.nr((x0X.n) objN2);
                                        if (internal != null) {
                                            nVarJ2 = i282.J2(internal, i282.nr.containsKey(jVar3) ? CreationType.JUST_GENERATED : CreationType.READ_FROM_FILE);
                                            r9 = jVar4;
                                        }
                                        Dsr dsr = i282.rl;
                                        ml.f43278n = i282;
                                        ml.f43281t = jVar3;
                                        ml.f43276O = jVar4;
                                        ml.f43277Z = 4;
                                        objN2 = dsr.n(jVar3, ml);
                                        jVar5 = jVar4;
                                        if (objN2 == coroutine_suspended) {
                                            nVarJ2 = (x0X.n) objN2;
                                            if (!(nVarJ2 instanceof n.C1266n)) {
                                                r9 = jVar5;
                                                r9.T(null);
                                                return nVarJ2;
                                            }
                                            if (!(nVarJ2 instanceof n.w6)) {
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            Id.Predefined.Internal internal5 = (Id.Predefined.Internal) ((n.w6) nVarJ2).n();
                                            Fqb.n nVar4 = i282.f43267t;
                                            ml.f43278n = i282;
                                            ml.f43281t = jVar3;
                                            ml.f43276O = jVar5;
                                            ml.J2 = internal5;
                                            ml.f43277Z = 5;
                                            Object objRl = nVar4.rl(internal5, ml);
                                            if (objRl != coroutine_suspended) {
                                                Id.Predefined.Internal.j jVar11 = jVar3;
                                                jVar6 = jVar5;
                                                internal2 = internal5;
                                                objN2 = objRl;
                                                jVar7 = jVar11;
                                                nVarJ2 = (x0X.n) objN2;
                                                if (!(nVarJ2 instanceof n.C1266n)) {
                                                    r2 = jVar6;
                                                    r9 = r2;
                                                    r9.T(null);
                                                    return nVarJ2;
                                                }
                                                if (!(nVarJ2 instanceof n.w6)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                Fqb.n nVar5 = i282.f43267t;
                                                ml.f43278n = i282;
                                                ml.f43281t = jVar7;
                                                ml.f43276O = jVar6;
                                                ml.J2 = internal2;
                                                ml.f43277Z = 6;
                                                objN2 = nVar5.n(jVar7, ml);
                                                if (objN2 != coroutine_suspended) {
                                                    r13 = jVar6;
                                                    i283 = i282;
                                                    jVar8 = jVar7;
                                                    if (((Id.Predefined.Internal) x0X.w6.nr((x0X.n) objN2)) == null) {
                                                        i283.t(i283.nr, jVar8);
                                                        nVarJ2 = new n.w6(internal2);
                                                    } else {
                                                        nVarJ2 = xMQ;
                                                    }
                                                    r2 = r13;
                                                    r9 = r2;
                                                    r9.T(null);
                                                    return nVarJ2;
                                                }
                                            }
                                        }
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    r12 = jVar2;
                                    r12.T(null);
                                    throw th;
                                }
                            }
                        } else {
                            Fqb.n nVar6 = this.f43267t;
                            ml.f43278n = this;
                            ml.f43281t = jVar;
                            ml.f43277Z = 7;
                            objN2 = nVar6.n(jVar, ml);
                            if (objN2 != coroutine_suspended) {
                                i28 = this;
                                internal3 = (Id.Predefined.Internal) x0X.w6.nr((x0X.n) objN2);
                                if (internal3 != null) {
                                    x0X.n nVarJ22 = i28.J2(internal3, i28.nr.containsKey(jVar) ? CreationType.JUST_GENERATED : CreationType.READ_FROM_FILE);
                                    if (nVarJ22 != null) {
                                        return nVarJ22;
                                    }
                                }
                                Dsr dsr2 = i28.rl;
                                ml.f43278n = i28;
                                ml.f43281t = jVar;
                                ml.f43277Z = 8;
                                objN2 = dsr2.n(jVar, ml);
                                if (objN2 != coroutine_suspended) {
                                    nVar = (x0X.n) objN2;
                                    if (!(nVar instanceof n.C1266n)) {
                                        return nVar;
                                    }
                                    if (!(nVar instanceof n.w6)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    Id.Predefined.Internal internal6 = (Id.Predefined.Internal) ((n.w6) nVar).n();
                                    Fqb.n nVar7 = i28.f43267t;
                                    ml.f43278n = i28;
                                    ml.f43281t = jVar;
                                    ml.f43276O = internal6;
                                    ml.f43277Z = 9;
                                    Object objRl2 = nVar7.rl(internal6, ml);
                                    if (objRl2 != coroutine_suspended) {
                                        jVar9 = jVar;
                                        internal4 = internal6;
                                        objN2 = objRl2;
                                        nVar2 = (x0X.n) objN2;
                                        if (!(nVar2 instanceof n.C1266n)) {
                                            return nVar2;
                                        }
                                        if (!(nVar2 instanceof n.w6)) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                        Fqb.n nVar8 = i28.f43267t;
                                        ml.f43278n = i28;
                                        ml.f43281t = jVar9;
                                        ml.f43276O = internal4;
                                        ml.f43277Z = 10;
                                        objN2 = nVar8.n(jVar9, ml);
                                        if (objN2 != coroutine_suspended) {
                                            i284 = i28;
                                            jVar10 = jVar9;
                                            if (((Id.Predefined.Internal) x0X.w6.nr((x0X.n) objN2)) != null) {
                                                return xMQ;
                                            }
                                            i284.t(i284.nr, jVar10);
                                            return new n.w6(internal4);
                                        }
                                    }
                                }
                            }
                        }
                        break;
                    } else {
                        Dsr dsr3 = this.rl;
                        ml.f43277Z = 1;
                        Object objN3 = dsr3.n(jVar, ml);
                        if (objN3 != coroutine_suspended) {
                            return objN3;
                        }
                    }
                    return coroutine_suspended;
                case 1:
                    ResultKt.throwOnFailure(objN2);
                    return objN2;
                case 2:
                    yB.j jVar12 = (yB.j) ml.f43276O;
                    Id.Predefined.Internal.j jVar13 = (Id.Predefined.Internal.j) ml.f43281t;
                    i282 = (I28) ml.f43278n;
                    ResultKt.throwOnFailure(objN2);
                    jVar2 = jVar12;
                    jVar = jVar13;
                    Fqb.n nVar32 = i282.f43267t;
                    ml.f43278n = i282;
                    ml.f43281t = jVar;
                    ml.f43276O = jVar2;
                    ml.f43277Z = 3;
                    objN = nVar32.n(jVar, ml);
                    if (objN != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 3:
                    yB.j jVar14 = (yB.j) ml.f43276O;
                    jVar3 = (Id.Predefined.Internal.j) ml.f43281t;
                    i282 = (I28) ml.f43278n;
                    ResultKt.throwOnFailure(objN2);
                    jVar4 = jVar14;
                    internal = (Id.Predefined.Internal) x0X.w6.nr((x0X.n) objN2);
                    if (internal != null) {
                    }
                    Dsr dsr4 = i282.rl;
                    ml.f43278n = i282;
                    ml.f43281t = jVar3;
                    ml.f43276O = jVar4;
                    ml.f43277Z = 4;
                    objN2 = dsr4.n(jVar3, ml);
                    jVar5 = jVar4;
                    if (objN2 == coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 4:
                    yB.j jVar15 = (yB.j) ml.f43276O;
                    jVar3 = (Id.Predefined.Internal.j) ml.f43281t;
                    i282 = (I28) ml.f43278n;
                    ResultKt.throwOnFailure(objN2);
                    jVar5 = jVar15;
                    nVarJ2 = (x0X.n) objN2;
                    if (!(nVarJ2 instanceof n.C1266n)) {
                    }
                    break;
                case 5:
                    internal2 = (Id.Predefined.Internal) ml.J2;
                    yB.j jVar16 = (yB.j) ml.f43276O;
                    Id.Predefined.Internal.j jVar17 = (Id.Predefined.Internal.j) ml.f43281t;
                    I28 i285 = (I28) ml.f43278n;
                    try {
                        ResultKt.throwOnFailure(objN2);
                        jVar7 = jVar17;
                        i282 = i285;
                        jVar6 = jVar16;
                        nVarJ2 = (x0X.n) objN2;
                        if (!(nVarJ2 instanceof n.C1266n)) {
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        r12 = jVar16;
                        r12.T(null);
                        throw th;
                    }
                    break;
                case 6:
                    internal2 = (Id.Predefined.Internal) ml.J2;
                    r12 = (yB.j) ml.f43276O;
                    jVar8 = (Id.Predefined.Internal.j) ml.f43281t;
                    i283 = (I28) ml.f43278n;
                    try {
                        ResultKt.throwOnFailure(objN2);
                        r13 = r12;
                        if (((Id.Predefined.Internal) x0X.w6.nr((x0X.n) objN2)) == null) {
                        }
                        r2 = r13;
                        r9 = r2;
                        r9.T(null);
                        return nVarJ2;
                    } catch (Throwable th4) {
                        th = th4;
                        r12.T(null);
                        throw th;
                    }
                case 7:
                    jVar = (Id.Predefined.Internal.j) ml.f43281t;
                    i28 = (I28) ml.f43278n;
                    ResultKt.throwOnFailure(objN2);
                    internal3 = (Id.Predefined.Internal) x0X.w6.nr((x0X.n) objN2);
                    if (internal3 != null) {
                    }
                    Dsr dsr22 = i28.rl;
                    ml.f43278n = i28;
                    ml.f43281t = jVar;
                    ml.f43277Z = 8;
                    objN2 = dsr22.n(jVar, ml);
                    if (objN2 != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 8:
                    jVar = (Id.Predefined.Internal.j) ml.f43281t;
                    i28 = (I28) ml.f43278n;
                    ResultKt.throwOnFailure(objN2);
                    nVar = (x0X.n) objN2;
                    if (!(nVar instanceof n.C1266n)) {
                    }
                    break;
                case 9:
                    internal4 = (Id.Predefined.Internal) ml.f43276O;
                    Id.Predefined.Internal.j jVar18 = (Id.Predefined.Internal.j) ml.f43281t;
                    I28 i286 = (I28) ml.f43278n;
                    ResultKt.throwOnFailure(objN2);
                    jVar9 = jVar18;
                    i28 = i286;
                    nVar2 = (x0X.n) objN2;
                    if (!(nVar2 instanceof n.C1266n)) {
                    }
                    break;
                case 10:
                    internal4 = (Id.Predefined.Internal) ml.f43276O;
                    jVar10 = (Id.Predefined.Internal.j) ml.f43281t;
                    i284 = (I28) ml.f43278n;
                    ResultKt.throwOnFailure(objN2);
                    if (((Id.Predefined.Internal) x0X.w6.nr((x0X.n) objN2)) != null) {
                    }
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (Throwable th5) {
            r12 = jVar;
            th = th5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // cb.InterfaceC1679Ml
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(Continuation continuation) {
        w6 w6Var;
        if (continuation instanceof w6) {
            w6Var = (w6) continuation;
            int i2 = w6Var.f43288O;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w6Var.f43288O = i2 - Integer.MIN_VALUE;
            } else {
                w6Var = new w6(continuation);
            }
        }
        Object objJ2 = w6Var.f43289n;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = w6Var.f43288O;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objJ2);
            n nVar = new n(ujA.w6.rl(), null, this);
            w6Var.f43288O = 1;
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
            Id.Predefined.Internal internal = (Id.Predefined.Internal) x0X.w6.nr((x0X.n) it.next());
            if (internal != null) {
                arrayList.add(internal);
            }
        }
        return CollectionsKt.toSet(arrayList);
    }

    @Override // cb.InterfaceC1679Ml
    public Object nr(Continuation continuation) {
        return this.f43267t.t(continuation);
    }

    @Override // cb.InterfaceC1679Ml
    public Object rl(Continuation continuation) {
        return this.J2.n(continuation);
    }
}
