package androidx.room.util;

import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.TransactionScope;
import androidx.room.Transactor;
import androidx.room.coroutines.RawConnectionAccessor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¨\u0006\u0004"}, d2 = {"<anonymous>", "R", "transactor", "Landroidx/room/Transactor;", "androidx/room/util/DBUtil__DBUtilKt$internalPerform$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1$invokeSuspend$$inlined$internalPerform$1", f = "DBUtil.android.kt", i = {0, 0, 1, 1, 2, 3}, l = {56, 57, 59, 60}, m = "invokeSuspend", n = {"transactor", "type", "transactor", "type", "transactor", "result"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$0"})
@SourceDebugExtension({"SMAP\nDBUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DBUtil.kt\nandroidx/room/util/DBUtil__DBUtilKt$internalPerform$2\n+ 2 DBUtil.android.kt\nandroidx/room/util/DBUtil__DBUtil_androidKt$performBlocking$1\n*L\n1#1,66:1\n75#2,2:67\n*E\n"})
public final class DBUtil__DBUtil_androidKt$performBlocking$1$invokeSuspend$$inlined$internalPerform$1 extends SuspendLambda implements Function2<Transactor, Continuation<Object>, Object> {
    final /* synthetic */ boolean J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    /* synthetic */ Object f41795O;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    final /* synthetic */ Function1 f41796Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f41797n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ RoomDatabase f41798o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ boolean f41799r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f41800t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DBUtil__DBUtil_androidKt$performBlocking$1$invokeSuspend$$inlined$internalPerform$1(boolean z2, boolean z3, RoomDatabase roomDatabase, Continuation continuation, Function1 function1) {
        super(2, continuation);
        this.J2 = z2;
        this.f41799r = z3;
        this.f41798o = roomDatabase;
        this.f41796Z = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DBUtil__DBUtil_androidKt$performBlocking$1$invokeSuspend$$inlined$internalPerform$1 dBUtil__DBUtil_androidKt$performBlocking$1$invokeSuspend$$inlined$internalPerform$1 = new DBUtil__DBUtil_androidKt$performBlocking$1$invokeSuspend$$inlined$internalPerform$1(this.J2, this.f41799r, this.f41798o, continuation, this.f41796Z);
        dBUtil__DBUtil_androidKt$performBlocking$1$invokeSuspend$$inlined$internalPerform$1.f41795O = obj;
        return dBUtil__DBUtil_androidKt$performBlocking$1$invokeSuspend$$inlined$internalPerform$1;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Object invoke(Transactor transactor, Continuation continuation) {
        return ((DBUtil__DBUtil_androidKt$performBlocking$1$invokeSuspend$$inlined$internalPerform$1) create(transactor, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1$invokeSuspend$$inlined$internalPerform$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "R", "Landroidx/room/TransactionScope;", "androidx/room/util/DBUtil__DBUtilKt$internalPerform$2$result$1"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1$invokeSuspend$$inlined$internalPerform$1$1", f = "DBUtil.android.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nDBUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DBUtil.kt\nandroidx/room/util/DBUtil__DBUtilKt$internalPerform$2$result$1\n+ 2 DBUtil.android.kt\nandroidx/room/util/DBUtil__DBUtil_androidKt$performBlocking$1\n*L\n1#1,59:1\n75#2,2:60\n*E\n"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<TransactionScope<Object>, Continuation<Object>, Object> {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function1 f41801O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f41802n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f41803t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Continuation continuation, Function1 function1) {
            super(2, continuation);
            this.f41801O = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation, this.f41801O);
            anonymousClass1.f41803t = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TransactionScope transactionScope, Continuation continuation) {
            return ((AnonymousClass1) create(transactionScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f41802n == 0) {
                ResultKt.throwOnFailure(obj);
                TransactionScope transactionScope = (TransactionScope) this.f41803t;
                Intrinsics.checkNotNull(transactionScope, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
                return this.f41801O.invoke(((RawConnectionAccessor) transactionScope).t());
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a2 A[PHI: r1 r8
      0x00a2: PHI (r1v11 androidx.room.Transactor) = (r1v8 androidx.room.Transactor), (r1v18 androidx.room.Transactor) binds: [B:35:0x009f, B:11:0x0023] A[DONT_GENERATE, DONT_INLINE]
      0x00a2: PHI (r8v15 java.lang.Object) = (r8v14 java.lang.Object), (r8v0 java.lang.Object) binds: [B:35:0x009f, B:11:0x0023] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c5 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Transactor.SQLiteTransactionType sQLiteTransactionType;
        Transactor transactor;
        Transactor transactor2;
        Transactor.SQLiteTransactionType sQLiteTransactionType2;
        Transactor transactor3;
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f41800t;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 == 4) {
                            obj2 = this.f41795O;
                            ResultKt.throwOnFailure(obj);
                            if (!((Boolean) obj).booleanValue()) {
                                this.f41798o.WPU().aYN();
                            }
                            return obj2;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    transactor = (Transactor) this.f41795O;
                    ResultKt.throwOnFailure(obj);
                    if (this.f41799r) {
                        this.f41795O = obj;
                        this.f41800t = 4;
                        Object objRl = transactor.rl(this);
                        if (objRl != coroutine_suspended) {
                            obj2 = obj;
                            obj = objRl;
                            if (!((Boolean) obj).booleanValue()) {
                            }
                            return obj2;
                        }
                        return coroutine_suspended;
                    }
                    return obj;
                }
                sQLiteTransactionType2 = (Transactor.SQLiteTransactionType) this.f41797n;
                transactor3 = (Transactor) this.f41795O;
                ResultKt.throwOnFailure(obj);
                sQLiteTransactionType = sQLiteTransactionType2;
                transactor = transactor3;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, this.f41796Z);
                this.f41795O = transactor;
                this.f41797n = null;
                this.f41800t = 3;
                obj = transactor.n(sQLiteTransactionType, anonymousClass1, this);
                if (obj != coroutine_suspended) {
                    if (this.f41799r) {
                    }
                }
                return coroutine_suspended;
            }
            sQLiteTransactionType2 = (Transactor.SQLiteTransactionType) this.f41797n;
            transactor2 = (Transactor) this.f41795O;
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            Transactor transactor4 = (Transactor) this.f41795O;
            if (this.J2) {
                boolean z2 = this.f41799r;
                if (z2) {
                    sQLiteTransactionType = Transactor.SQLiteTransactionType.f41454n;
                } else {
                    sQLiteTransactionType = Transactor.SQLiteTransactionType.f41456t;
                }
                if (!z2) {
                    this.f41795O = transactor4;
                    this.f41797n = sQLiteTransactionType;
                    this.f41800t = 1;
                    Object objRl2 = transactor4.rl(this);
                    if (objRl2 != coroutine_suspended) {
                        transactor2 = transactor4;
                        obj = objRl2;
                        sQLiteTransactionType2 = sQLiteTransactionType;
                    }
                    return coroutine_suspended;
                }
                transactor = transactor4;
                AnonymousClass1 anonymousClass12 = new AnonymousClass1(null, this.f41796Z);
                this.f41795O = transactor;
                this.f41797n = null;
                this.f41800t = 3;
                obj = transactor.n(sQLiteTransactionType, anonymousClass12, this);
                if (obj != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            Intrinsics.checkNotNull(transactor4, "null cannot be cast to non-null type androidx.room.coroutines.RawConnectionAccessor");
            return this.f41796Z.invoke(((RawConnectionAccessor) transactor4).t());
        }
        if (!((Boolean) obj).booleanValue()) {
            InvalidationTracker invalidationTrackerWPU = this.f41798o.WPU();
            this.f41795O = transactor2;
            this.f41797n = sQLiteTransactionType2;
            this.f41800t = 2;
            if (invalidationTrackerWPU.fD(this) != coroutine_suspended) {
                transactor3 = transactor2;
                sQLiteTransactionType = sQLiteTransactionType2;
                transactor = transactor3;
                AnonymousClass1 anonymousClass122 = new AnonymousClass1(null, this.f41796Z);
                this.f41795O = transactor;
                this.f41797n = null;
                this.f41800t = 3;
                obj = transactor.n(sQLiteTransactionType, anonymousClass122, this);
                if (obj != coroutine_suspended) {
                }
            }
            return coroutine_suspended;
        }
        sQLiteTransactionType = sQLiteTransactionType2;
        transactor = transactor2;
        AnonymousClass1 anonymousClass1222 = new AnonymousClass1(null, this.f41796Z);
        this.f41795O = transactor;
        this.f41797n = null;
        this.f41800t = 3;
        obj = transactor.n(sQLiteTransactionType, anonymousClass1222, this);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
    }
}
