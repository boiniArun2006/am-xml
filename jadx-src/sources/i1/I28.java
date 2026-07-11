package i1;

import TFv.Lu;
import TFv.SPz;
import androidx.constraintlayout.core.dsl.kYF.obbPUqyhtS;
import com.bendingspoons.spidersense.data.storageManager.entities.CompleteDebugEventEntity;
import com.bendingspoons.spidersense.domain.entities.CompleteDebugEvent;
import hrZ.j;
import ifA.w6;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
import x0X.n;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class I28 implements hrZ.j {
    public static final j KN = new j(null);
    public static final int xMQ = 8;
    private final SPz J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Function0 f68051O;
    private final yB.j Uo;
    private final long nr;
    private final i1.w6 rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final long f68052t;

    static final class C extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f68053n;

        C(Continuation continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return I28.this.new C(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f68053n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                if (((Number) I28.this.az().getValue()).longValue() >= I28.this.f68052t) {
                    i1.w6 w6Var = I28.this.rl;
                    long j2 = I28.this.nr;
                    this.f68053n = 1;
                    obj = w6Var.nr(j2, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return Unit.INSTANCE;
            }
            I28 i28 = I28.this;
            int iIntValue = ((Number) obj).intValue();
            SPz sPzAz = i28.az();
            sPzAz.setValue(Boxing.boxLong(((Number) sPzAz.getValue()).longValue() - ((long) iIntValue)));
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((C) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class CN3 extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ long f68055O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f68056n;

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
        static final class j extends SuspendLambda implements Function1 {

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ long f68058O;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f68059n;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ I28 f68060t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            j(I28 i28, long j2, Continuation continuation) {
                super(1, continuation);
                this.f68060t = i28;
                this.f68058O = j2;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Continuation continuation) {
                return new j(this.f68060t, this.f68058O, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i2 = this.f68059n;
                if (i2 != 0) {
                    if (i2 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException(obbPUqyhtS.TTuuymz);
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    i1.w6 w6Var = this.f68060t.rl;
                    long j2 = this.f68058O;
                    this.f68059n = 1;
                    obj = w6Var.rl(j2, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((CompleteDebugEventEntity) it.next()).getCompleteDebugEventData());
                }
                return arrayList;
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Continuation continuation) {
                return ((j) create(continuation)).invokeSuspend(Unit.INSTANCE);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        CN3(long j2, Continuation continuation) {
            super(1, continuation);
            this.f68055O = j2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return I28.this.new CN3(this.f68055O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f68056n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                j jVar = new j(I28.this, this.f68055O, null);
                this.f68056n = 1;
                obj = x0X.w6.Uo(jVar, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            x0X.n nVar = (x0X.n) obj;
            if (nVar instanceof n.C1266n) {
                return new n.C1266n(new ifA.w6("DebugEventStorageManager", w6.n.f68149n, w6.j.f68145n, "Failed to store a debug event.", (Throwable) ((n.C1266n) nVar).n(), null, 32, null));
            }
            if (nVar instanceof n.w6) {
                return nVar;
            }
            throw new NoWhenBranchMatchedException();
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((CN3) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class Dsr extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f68061n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ long f68062t;

        Dsr(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            Dsr dsr = new Dsr(continuation);
            dsr.f68062t = ((Number) obj).longValue();
            return dsr;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return n(((Number) obj).longValue(), (Continuation) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f68061n == 0) {
                ResultKt.throwOnFailure(obj);
                if (this.f68062t > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                return Boxing.boxBoolean(z2);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        public final Object n(long j2, Continuation continuation) {
            return ((Dsr) create(Long.valueOf(j2), continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: i1.I28$I28, reason: collision with other inner class name */
    static final class C0963I28 extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f68064n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f68065t;

        C0963I28(Continuation continuation) {
            super(1, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return I28.this.new C0963I28(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SPz sPz;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f68065t;
            if (i2 != 0) {
                if (i2 == 1) {
                    sPz = (SPz) this.f68064n;
                    ResultKt.throwOnFailure(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                if (((Number) I28.this.az().getValue()).longValue() == -1) {
                    SPz sPzAz = I28.this.az();
                    i1.w6 w6Var = I28.this.rl;
                    this.f68064n = sPzAz;
                    this.f68065t = 1;
                    Object objO = w6Var.O(this);
                    if (objO == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    sPz = sPzAz;
                    obj = objO;
                }
                return Unit.INSTANCE;
            }
            sPz.setValue(obj);
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((C0963I28) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class Ml extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f68066O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f68067n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f68068r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f68069t;

        Ml(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f68066O = obj;
            this.f68068r |= Integer.MIN_VALUE;
            return I28.this.ty(this);
        }
    }

    static final class Wre extends ContinuationImpl {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f68070O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f68071n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f68072r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        long f68073t;

        Wre(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f68070O = obj;
            this.f68072r |= Integer.MIN_VALUE;
            return I28.this.O(0L, this);
        }
    }

    static final class aC extends ContinuationImpl {
        /* synthetic */ Object J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f68074O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f68075n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        int f68076o;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f68078t;

        aC(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.J2 = obj;
            this.f68076o |= Integer.MIN_VALUE;
            return I28.this.n(null, this);
        }
    }

    static final class fuX extends ContinuationImpl {
        int J2;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f68080n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f68081t;

        fuX(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f68081t = obj;
            this.J2 |= Integer.MIN_VALUE;
            return I28.this.HI(null, this);
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

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        /* synthetic */ Object f68082O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f68083n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f68084r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f68085t;

        n(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f68082O = obj;
            this.f68084r |= Integer.MIN_VALUE;
            return I28.this.t(null, this);
        }
    }

    static final class o extends SuspendLambda implements Function1 {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ CompleteDebugEvent f68086O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f68087n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(CompleteDebugEvent completeDebugEvent, Continuation continuation) {
            super(1, continuation);
            this.f68086O = completeDebugEvent;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return I28.this.new o(this.f68086O, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f68087n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            i1.w6 w6Var = I28.this.rl;
            CompleteDebugEventEntity completeDebugEventEntity = new CompleteDebugEventEntity(this.f68086O.getId(), ((Number) I28.this.f68051O.invoke()).doubleValue(), this.f68086O);
            this.f68087n = 1;
            Object objT = w6Var.t(completeDebugEventEntity, this);
            if (objT == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objT;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((o) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    static final class w6 extends SuspendLambda implements Function1 {
        int J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        Object f68089O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f68090n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        final /* synthetic */ Collection f68091o;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f68093t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        w6(Collection collection, Continuation continuation) {
            super(1, continuation);
            this.f68091o = collection;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Continuation continuation) {
            return I28.this.new w6(this.f68091o, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            yB.j jVar;
            I28 i28;
            Collection collection;
            yB.j jVar2;
            Throwable th;
            I28 i282;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.J2;
            try {
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            i282 = (I28) this.f68093t;
                            jVar2 = (yB.j) this.f68090n;
                            try {
                                ResultKt.throwOnFailure(obj);
                                int iIntValue = ((Number) obj).intValue();
                                SPz sPzAz = i282.az();
                                sPzAz.setValue(Boxing.boxLong(((Number) sPzAz.getValue()).longValue() - ((long) iIntValue)));
                                Unit unit = Unit.INSTANCE;
                                jVar2.T(null);
                                return Unit.INSTANCE;
                            } catch (Throwable th2) {
                                th = th2;
                                jVar2.T(null);
                                throw th;
                            }
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Collection collection2 = (Collection) this.f68089O;
                    I28 i283 = (I28) this.f68093t;
                    yB.j jVar3 = (yB.j) this.f68090n;
                    ResultKt.throwOnFailure(obj);
                    jVar = jVar3;
                    collection = collection2;
                    i28 = i283;
                } else {
                    ResultKt.throwOnFailure(obj);
                    jVar = I28.this.Uo;
                    i28 = I28.this;
                    collection = this.f68091o;
                    this.f68090n = jVar;
                    this.f68093t = i28;
                    this.f68089O = collection;
                    this.J2 = 1;
                    if (jVar.Z(null, this) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                }
                i1.w6 w6Var = i28.rl;
                Collection collection3 = collection;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection3, 10));
                Iterator it = collection3.iterator();
                while (it.hasNext()) {
                    arrayList.add(((CompleteDebugEvent) it.next()).getId());
                }
                this.f68090n = jVar;
                this.f68093t = i28;
                this.f68089O = null;
                this.J2 = 2;
                Object objN = w6Var.n(arrayList, this);
                if (objN != coroutine_suspended) {
                    i282 = i28;
                    jVar2 = jVar;
                    obj = objN;
                    int iIntValue2 = ((Number) obj).intValue();
                    SPz sPzAz2 = i282.az();
                    sPzAz2.setValue(Boxing.boxLong(((Number) sPzAz2.getValue()).longValue() - ((long) iIntValue2)));
                    Unit unit2 = Unit.INSTANCE;
                    jVar2.T(null);
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            } catch (Throwable th3) {
                jVar2 = jVar;
                th = th3;
                jVar2.T(null);
                throw th;
            }
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((w6) create(continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public I28(i1.w6 completeDebugEventDao, long j2, long j3, Function0 timestampProvider) {
        Intrinsics.checkNotNullParameter(completeDebugEventDao, "completeDebugEventDao");
        Intrinsics.checkNotNullParameter(timestampProvider, "timestampProvider");
        this.rl = completeDebugEventDao;
        this.f68052t = j2;
        this.nr = j3;
        this.f68051O = timestampProvider;
        this.J2 = Lu.n(-1L);
        this.Uo = yB.CN3.rl(false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object HI(Function1 function1, Continuation continuation) {
        fuX fux;
        if (continuation instanceof fuX) {
            fux = (fuX) continuation;
            int i2 = fux.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fux.J2 = i2 - Integer.MIN_VALUE;
            } else {
                fux = new fuX(continuation);
            }
        }
        Object objNY = fux.f68081t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = fux.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objNY);
            SPz sPz = this.J2;
            Dsr dsr = new Dsr(null);
            fux.f68080n = function1;
            fux.J2 = 1;
            objNY = TFv.fuX.nY(sPz, dsr, fux);
            if (objNY != coroutine_suspended) {
            }
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objNY);
            return objNY;
        }
        function1 = (Function1) fux.f68080n;
        ResultKt.throwOnFailure(objNY);
        ((Number) objNY).longValue();
        fux.f68080n = null;
        fux.J2 = 2;
        Object objInvoke = function1.invoke(fux);
        return objInvoke == coroutine_suspended ? coroutine_suspended : objInvoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0079 A[Catch: all -> 0x0035, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x0031, B:28:0x0073, B:30:0x0079, B:31:0x009a, B:35:0x00a2, B:36:0x00a7), top: B:41:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009a A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:13:0x0031, B:28:0x0073, B:30:0x0079, B:31:0x009a, B:35:0x00a2, B:36:0x00a7), top: B:41:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object ty(Continuation continuation) throws Throwable {
        Ml ml;
        yB.j jVar;
        I28 i28;
        yB.j jVar2;
        Object c1266n;
        if (continuation instanceof Ml) {
            ml = (Ml) continuation;
            int i2 = ml.f68068r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ml.f68068r = i2 - Integer.MIN_VALUE;
            } else {
                ml = new Ml(continuation);
            }
        }
        Object objUo = ml.f68066O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = ml.f68068r;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objUo);
                yB.j jVar3 = this.Uo;
                ml.f68067n = this;
                ml.f68069t = jVar3;
                ml.f68068r = 1;
                if (jVar3.Z(null, ml) != coroutine_suspended) {
                    jVar = jVar3;
                    i28 = this;
                }
                return coroutine_suspended;
            }
            if (i3 != 1) {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jVar2 = (yB.j) ml.f68067n;
                try {
                    ResultKt.throwOnFailure(objUo);
                    c1266n = (x0X.n) objUo;
                    if (!(c1266n instanceof n.C1266n)) {
                        c1266n = new n.C1266n(new ifA.w6("DebugEventStorageManager", w6.n.f68149n, w6.j.f68145n, "Failed to count the debug event in the storage.", (Throwable) ((n.C1266n) c1266n).n(), null, 32, null));
                    } else if (!(c1266n instanceof n.w6)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    jVar2.T(null);
                    return c1266n;
                } catch (Throwable th) {
                    th = th;
                    jVar2.T(null);
                    throw th;
                }
            }
            jVar = (yB.j) ml.f68069t;
            i28 = (I28) ml.f68067n;
            ResultKt.throwOnFailure(objUo);
            C0963I28 c0963i28 = i28.new C0963I28(null);
            ml.f68067n = jVar;
            ml.f68069t = null;
            ml.f68068r = 2;
            objUo = x0X.w6.Uo(c0963i28, ml);
            if (objUo != coroutine_suspended) {
                jVar2 = jVar;
                c1266n = (x0X.n) objUo;
                if (!(c1266n instanceof n.C1266n)) {
                }
                jVar2.T(null);
                return c1266n;
            }
            return coroutine_suspended;
        } catch (Throwable th2) {
            th = th2;
            jVar2 = jVar;
            jVar2.T(null);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0070, code lost:
    
        if (r8 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // AE.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object O(long j2, Continuation continuation) throws Throwable {
        Wre wre;
        I28 i28;
        if (continuation instanceof Wre) {
            wre = (Wre) continuation;
            int i2 = wre.f68072r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wre.f68072r = i2 - Integer.MIN_VALUE;
            } else {
                wre = new Wre(continuation);
            }
        }
        Object objTy = wre.f68070O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = wre.f68072r;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objTy);
            wre.f68071n = this;
            wre.f68073t = j2;
            wre.f68072r = 1;
            objTy = ty(wre);
            if (objTy != coroutine_suspended) {
                i28 = this;
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objTy);
            return (x0X.n) objTy;
        }
        j2 = wre.f68073t;
        i28 = (I28) wre.f68071n;
        ResultKt.throwOnFailure(objTy);
        x0X.n nVar = (x0X.n) objTy;
        if (nVar instanceof n.C1266n) {
            return nVar;
        }
        if (!(nVar instanceof n.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        CN3 cn3 = i28.new CN3(j2, null);
        wre.f68071n = null;
        wre.f68072r = 2;
        objTy = i28.HI(cn3, wre);
    }

    public final SPz az() {
        return this.J2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00da A[Catch: all -> 0x005c, TryCatch #1 {all -> 0x005c, blocks: (B:22:0x0057, B:44:0x00d4, B:46:0x00da, B:49:0x0100, B:51:0x0104, B:54:0x0115, B:57:0x011b, B:59:0x011f, B:98:0x0208, B:99:0x020d, B:52:0x0111, B:100:0x020e, B:101:0x0213, B:47:0x00fc, B:102:0x0214, B:103:0x0219, B:40:0x00bb), top: B:109:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fc A[Catch: all -> 0x005c, TryCatch #1 {all -> 0x005c, blocks: (B:22:0x0057, B:44:0x00d4, B:46:0x00da, B:49:0x0100, B:51:0x0104, B:54:0x0115, B:57:0x011b, B:59:0x011f, B:98:0x0208, B:99:0x020d, B:52:0x0111, B:100:0x020e, B:101:0x0213, B:47:0x00fc, B:102:0x0214, B:103:0x0219, B:40:0x00bb), top: B:109:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0104 A[Catch: all -> 0x005c, TryCatch #1 {all -> 0x005c, blocks: (B:22:0x0057, B:44:0x00d4, B:46:0x00da, B:49:0x0100, B:51:0x0104, B:54:0x0115, B:57:0x011b, B:59:0x011f, B:98:0x0208, B:99:0x020d, B:52:0x0111, B:100:0x020e, B:101:0x0213, B:47:0x00fc, B:102:0x0214, B:103:0x0219, B:40:0x00bb), top: B:109:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0111 A[Catch: all -> 0x005c, TryCatch #1 {all -> 0x005c, blocks: (B:22:0x0057, B:44:0x00d4, B:46:0x00da, B:49:0x0100, B:51:0x0104, B:54:0x0115, B:57:0x011b, B:59:0x011f, B:98:0x0208, B:99:0x020d, B:52:0x0111, B:100:0x020e, B:101:0x0213, B:47:0x00fc, B:102:0x0214, B:103:0x0219, B:40:0x00bb), top: B:109:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x011b A[Catch: all -> 0x005c, TryCatch #1 {all -> 0x005c, blocks: (B:22:0x0057, B:44:0x00d4, B:46:0x00da, B:49:0x0100, B:51:0x0104, B:54:0x0115, B:57:0x011b, B:59:0x011f, B:98:0x0208, B:99:0x020d, B:52:0x0111, B:100:0x020e, B:101:0x0213, B:47:0x00fc, B:102:0x0214, B:103:0x0219, B:40:0x00bb), top: B:109:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0143 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:15:0x003b, B:63:0x013d, B:65:0x0143, B:69:0x016a, B:71:0x016e, B:74:0x017f, B:83:0x01d7, B:85:0x01db, B:86:0x01e8, B:90:0x01f0, B:91:0x01f5, B:77:0x0184, B:79:0x0188, B:81:0x019a, B:82:0x01b8, B:92:0x01f6, B:93:0x01fb, B:72:0x017b, B:94:0x01fc, B:95:0x0201, B:66:0x0165, B:96:0x0202, B:97:0x0207), top: B:108:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0165 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:15:0x003b, B:63:0x013d, B:65:0x0143, B:69:0x016a, B:71:0x016e, B:74:0x017f, B:83:0x01d7, B:85:0x01db, B:86:0x01e8, B:90:0x01f0, B:91:0x01f5, B:77:0x0184, B:79:0x0188, B:81:0x019a, B:82:0x01b8, B:92:0x01f6, B:93:0x01fb, B:72:0x017b, B:94:0x01fc, B:95:0x0201, B:66:0x0165, B:96:0x0202, B:97:0x0207), top: B:108:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x016e A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:15:0x003b, B:63:0x013d, B:65:0x0143, B:69:0x016a, B:71:0x016e, B:74:0x017f, B:83:0x01d7, B:85:0x01db, B:86:0x01e8, B:90:0x01f0, B:91:0x01f5, B:77:0x0184, B:79:0x0188, B:81:0x019a, B:82:0x01b8, B:92:0x01f6, B:93:0x01fb, B:72:0x017b, B:94:0x01fc, B:95:0x0201, B:66:0x0165, B:96:0x0202, B:97:0x0207), top: B:108:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x017b A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:15:0x003b, B:63:0x013d, B:65:0x0143, B:69:0x016a, B:71:0x016e, B:74:0x017f, B:83:0x01d7, B:85:0x01db, B:86:0x01e8, B:90:0x01f0, B:91:0x01f5, B:77:0x0184, B:79:0x0188, B:81:0x019a, B:82:0x01b8, B:92:0x01f6, B:93:0x01fb, B:72:0x017b, B:94:0x01fc, B:95:0x0201, B:66:0x0165, B:96:0x0202, B:97:0x0207), top: B:108:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0184 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:15:0x003b, B:63:0x013d, B:65:0x0143, B:69:0x016a, B:71:0x016e, B:74:0x017f, B:83:0x01d7, B:85:0x01db, B:86:0x01e8, B:90:0x01f0, B:91:0x01f5, B:77:0x0184, B:79:0x0188, B:81:0x019a, B:82:0x01b8, B:92:0x01f6, B:93:0x01fb, B:72:0x017b, B:94:0x01fc, B:95:0x0201, B:66:0x0165, B:96:0x0202, B:97:0x0207), top: B:108:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01db A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:15:0x003b, B:63:0x013d, B:65:0x0143, B:69:0x016a, B:71:0x016e, B:74:0x017f, B:83:0x01d7, B:85:0x01db, B:86:0x01e8, B:90:0x01f0, B:91:0x01f5, B:77:0x0184, B:79:0x0188, B:81:0x019a, B:82:0x01b8, B:92:0x01f6, B:93:0x01fb, B:72:0x017b, B:94:0x01fc, B:95:0x0201, B:66:0x0165, B:96:0x0202, B:97:0x0207), top: B:108:0x003b }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01e8 A[Catch: all -> 0x0040, TRY_LEAVE, TryCatch #0 {all -> 0x0040, blocks: (B:15:0x003b, B:63:0x013d, B:65:0x0143, B:69:0x016a, B:71:0x016e, B:74:0x017f, B:83:0x01d7, B:85:0x01db, B:86:0x01e8, B:90:0x01f0, B:91:0x01f5, B:77:0x0184, B:79:0x0188, B:81:0x019a, B:82:0x01b8, B:92:0x01f6, B:93:0x01fb, B:72:0x017b, B:94:0x01fc, B:95:0x0201, B:66:0x0165, B:96:0x0202, B:97:0x0207), top: B:108:0x003b }] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v2, types: [yB.j] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [yB.j] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8, types: [yB.j] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    @Override // cA.I28
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object n(CompleteDebugEvent completeDebugEvent, Continuation continuation) throws Throwable {
        aC aCVar;
        ?? r3;
        CompleteDebugEvent completeDebugEvent2;
        Object objTy;
        I28 i28;
        yB.j jVar;
        Object objUo;
        CompleteDebugEvent completeDebugEvent3;
        I28 i282;
        Object c1266n;
        ?? r32;
        I28 i283;
        ?? r33;
        if (continuation instanceof aC) {
            aCVar = (aC) continuation;
            int i2 = aCVar.f68076o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aCVar.f68076o = i2 - Integer.MIN_VALUE;
            } else {
                aCVar = new aC(continuation);
            }
        }
        Object objUo2 = aCVar.J2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ?? r42 = aCVar.f68076o;
        try {
            if (r42 == 0) {
                ResultKt.throwOnFailure(objUo2);
                aCVar.f68075n = this;
                completeDebugEvent2 = completeDebugEvent;
                aCVar.f68078t = completeDebugEvent2;
                aCVar.f68076o = 1;
                objTy = ty(aCVar);
                if (objTy != coroutine_suspended) {
                    i28 = this;
                }
                return coroutine_suspended;
            }
            if (r42 == 1) {
                CompleteDebugEvent completeDebugEvent4 = (CompleteDebugEvent) aCVar.f68078t;
                i28 = (I28) aCVar.f68075n;
                ResultKt.throwOnFailure(objUo2);
                objTy = objUo2;
                completeDebugEvent2 = completeDebugEvent4;
            } else {
                if (r42 != 2) {
                    if (r42 != 3) {
                        if (r42 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r3 = (yB.j) aCVar.f68078t;
                        i283 = (I28) aCVar.f68075n;
                        try {
                            ResultKt.throwOnFailure(objUo2);
                            r32 = r3;
                            c1266n = (x0X.n) objUo2;
                            if (!(c1266n instanceof n.C1266n)) {
                                c1266n = new n.C1266n(new ifA.w6("DebugEventStorageManager", w6.n.f68149n, w6.j.f68145n, "Failed to store a debug event.", (Throwable) ((n.C1266n) c1266n).n(), null, 32, null));
                            } else if (!(c1266n instanceof n.w6)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            i282 = i283;
                            r33 = r32;
                            if (c1266n instanceof n.C1266n) {
                                ifA.Ml.n((ifA.w6) ((n.C1266n) c1266n).n());
                            } else if (!(c1266n instanceof n.w6)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            if (!(c1266n instanceof n.C1266n)) {
                                if (!(c1266n instanceof n.w6)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                if (((Number) ((n.w6) c1266n).n()).longValue() != -1) {
                                    SPz sPz = i282.J2;
                                    sPz.setValue(Boxing.boxLong(((Number) sPz.getValue()).longValue() + 1));
                                    c1266n = new n.w6(Unit.INSTANCE);
                                } else {
                                    c1266n = new n.C1266n(new ifA.w6("DebugEventStorageManager", w6.n.f68149n, w6.j.f68145n, "Received an event with an id already present in the storage.", new IllegalStateException("Id already present in storage."), null, 32, null));
                                }
                            }
                            if (c1266n instanceof n.C1266n) {
                                ifA.Ml.n((ifA.w6) ((n.C1266n) c1266n).n());
                            } else if (!(c1266n instanceof n.w6)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            r33.T(null);
                            return c1266n;
                        } catch (Throwable th) {
                            th = th;
                            r3.T(null);
                            throw th;
                        }
                    }
                    jVar = (yB.j) aCVar.f68074O;
                    completeDebugEvent3 = (CompleteDebugEvent) aCVar.f68078t;
                    i282 = (I28) aCVar.f68075n;
                    ResultKt.throwOnFailure(objUo2);
                    c1266n = (x0X.n) objUo2;
                    if (!(c1266n instanceof n.C1266n)) {
                        c1266n = new n.C1266n(new ifA.w6("DebugEventStorageManager", w6.n.f68149n, w6.j.f68145n, "Failed to clear old events from full database.", (Throwable) ((n.C1266n) c1266n).n(), null, 32, null));
                    } else if (!(c1266n instanceof n.w6)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (!(c1266n instanceof n.C1266n)) {
                        ifA.Ml.n((ifA.w6) ((n.C1266n) c1266n).n());
                    } else if (!(c1266n instanceof n.w6)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (!(c1266n instanceof n.C1266n)) {
                        r33 = jVar;
                        if (c1266n instanceof n.C1266n) {
                        }
                        if (!(c1266n instanceof n.C1266n)) {
                        }
                        if (c1266n instanceof n.C1266n) {
                        }
                        r33.T(null);
                        return c1266n;
                    }
                    if (!(c1266n instanceof n.w6)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    o oVar = i282.new o(completeDebugEvent3, null);
                    aCVar.f68075n = i282;
                    aCVar.f68078t = jVar;
                    aCVar.f68074O = null;
                    aCVar.f68076o = 4;
                    objUo2 = x0X.w6.Uo(oVar, aCVar);
                    if (objUo2 != coroutine_suspended) {
                        r32 = jVar;
                        i283 = i282;
                        c1266n = (x0X.n) objUo2;
                        if (!(c1266n instanceof n.C1266n)) {
                        }
                        i282 = i283;
                        r33 = r32;
                        if (c1266n instanceof n.C1266n) {
                        }
                        if (!(c1266n instanceof n.C1266n)) {
                        }
                        if (c1266n instanceof n.C1266n) {
                        }
                        r33.T(null);
                        return c1266n;
                    }
                    return coroutine_suspended;
                }
                jVar = (yB.j) aCVar.f68074O;
                CompleteDebugEvent completeDebugEvent5 = (CompleteDebugEvent) aCVar.f68078t;
                i28 = (I28) aCVar.f68075n;
                ResultKt.throwOnFailure(objUo2);
                completeDebugEvent2 = completeDebugEvent5;
                C c2 = i28.new C(null);
                aCVar.f68075n = i28;
                aCVar.f68078t = completeDebugEvent2;
                aCVar.f68074O = jVar;
                aCVar.f68076o = 3;
                objUo = x0X.w6.Uo(c2, aCVar);
                if (objUo != coroutine_suspended) {
                    return coroutine_suspended;
                }
                completeDebugEvent3 = completeDebugEvent2;
                objUo2 = objUo;
                i282 = i28;
                c1266n = (x0X.n) objUo2;
                if (!(c1266n instanceof n.C1266n)) {
                }
                if (!(c1266n instanceof n.C1266n)) {
                }
                if (!(c1266n instanceof n.C1266n)) {
                }
            }
            x0X.n nVar = (x0X.n) objTy;
            if (nVar instanceof n.C1266n) {
                return nVar;
            }
            if (!(nVar instanceof n.w6)) {
                throw new NoWhenBranchMatchedException();
            }
            jVar = i28.Uo;
            aCVar.f68075n = i28;
            aCVar.f68078t = completeDebugEvent2;
            aCVar.f68074O = jVar;
            aCVar.f68076o = 2;
            if (jVar.Z(null, aCVar) != coroutine_suspended) {
                C c22 = i28.new C(null);
                aCVar.f68075n = i28;
                aCVar.f68078t = completeDebugEvent2;
                aCVar.f68074O = jVar;
                aCVar.f68076o = 3;
                objUo = x0X.w6.Uo(c22, aCVar);
                if (objUo != coroutine_suspended) {
                }
            }
            return coroutine_suspended;
        } catch (Throwable th2) {
            th = th2;
            r3 = r42;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0074, code lost:
    
        if (r11 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // AE.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object t(Collection collection, Continuation continuation) throws Throwable {
        n nVar;
        I28 i28;
        if (continuation instanceof n) {
            nVar = (n) continuation;
            int i2 = nVar.f68084r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nVar.f68084r = i2 - Integer.MIN_VALUE;
            } else {
                nVar = new n(continuation);
            }
        }
        Object objTy = nVar.f68082O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = nVar.f68084r;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objTy);
            nVar.f68083n = this;
            nVar.f68085t = collection;
            nVar.f68084r = 1;
            objTy = ty(nVar);
            if (objTy != coroutine_suspended) {
                i28 = this;
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objTy);
            x0X.n nVar2 = (x0X.n) objTy;
            if (nVar2 instanceof n.C1266n) {
                return new n.C1266n(new ifA.w6("DebugEventStorageManager", w6.n.f68149n, w6.j.f68145n, "Failed to delete debug events.", (Throwable) ((n.C1266n) nVar2).n(), null, 32, null));
            }
            if (nVar2 instanceof n.w6) {
                return nVar2;
            }
            throw new NoWhenBranchMatchedException();
        }
        collection = (Collection) nVar.f68085t;
        i28 = (I28) nVar.f68083n;
        ResultKt.throwOnFailure(objTy);
        x0X.n nVar3 = (x0X.n) objTy;
        if (nVar3 instanceof n.C1266n) {
            return nVar3;
        }
        if (!(nVar3 instanceof n.w6)) {
            throw new NoWhenBranchMatchedException();
        }
        w6 w6Var = i28.new w6(collection, null);
        nVar.f68083n = null;
        nVar.f68085t = null;
        nVar.f68084r = 2;
        objTy = x0X.w6.Uo(w6Var, nVar);
    }

    @Override // hrZ.j
    public cA.I28 nr() {
        return j.n.n(this);
    }

    @Override // hrZ.j
    public AE.j rl() {
        return j.n.rl(this);
    }
}
