package androidx.room.util;

import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.TransactionScope;
import androidx.room.Transactor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¨\u0006\u0004"}, d2 = {"<anonymous>", "R", "transactor", "Landroidx/room/Transactor;", "androidx/room/util/DBUtil__DBUtilKt$internalPerform$2"}, k = 3, mv = {2, 0, 0}, xi = 48)
@DebugMetadata(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2$invokeSuspend$$inlined$internalPerform$1", f = "DBUtil.android.kt", i = {0, 0, 1, 1, 2, 3}, l = {56, 57, 59, 60, 67}, m = "invokeSuspend", n = {"transactor", "type", "transactor", "type", "transactor", "result"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$0"})
@SourceDebugExtension({"SMAP\nDBUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DBUtil.kt\nandroidx/room/util/DBUtil__DBUtilKt$internalPerform$2\n+ 2 DBUtil.android.kt\nandroidx/room/util/DBUtil__DBUtil_androidKt$performInTransactionSuspending$2\n*L\n1#1,66:1\n91#2:67\n*E\n"})
public final class DBUtil__DBUtil_androidKt$performInTransactionSuspending$2$invokeSuspend$$inlined$internalPerform$1 extends SuspendLambda implements Function2<Transactor, Continuation<Object>, Object> {
    final /* synthetic */ boolean J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    /* synthetic */ Object f41807O;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    final /* synthetic */ Function1 f41808Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f41809n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ RoomDatabase f41810o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ boolean f41811r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f41812t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DBUtil__DBUtil_androidKt$performInTransactionSuspending$2$invokeSuspend$$inlined$internalPerform$1(boolean z2, boolean z3, RoomDatabase roomDatabase, Continuation continuation, Function1 function1) {
        super(2, continuation);
        this.J2 = z2;
        this.f41811r = z3;
        this.f41810o = roomDatabase;
        this.f41808Z = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DBUtil__DBUtil_androidKt$performInTransactionSuspending$2$invokeSuspend$$inlined$internalPerform$1 dBUtil__DBUtil_androidKt$performInTransactionSuspending$2$invokeSuspend$$inlined$internalPerform$1 = new DBUtil__DBUtil_androidKt$performInTransactionSuspending$2$invokeSuspend$$inlined$internalPerform$1(this.J2, this.f41811r, this.f41810o, continuation, this.f41808Z);
        dBUtil__DBUtil_androidKt$performInTransactionSuspending$2$invokeSuspend$$inlined$internalPerform$1.f41807O = obj;
        return dBUtil__DBUtil_androidKt$performInTransactionSuspending$2$invokeSuspend$$inlined$internalPerform$1;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Object invoke(Transactor transactor, Continuation continuation) {
        return ((DBUtil__DBUtil_androidKt$performInTransactionSuspending$2$invokeSuspend$$inlined$internalPerform$1) create(transactor, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2$invokeSuspend$$inlined$internalPerform$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "R", "Landroidx/room/TransactionScope;", "androidx/room/util/DBUtil__DBUtilKt$internalPerform$2$result$1"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$2$invokeSuspend$$inlined$internalPerform$1$1", f = "DBUtil.android.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
    @SourceDebugExtension({"SMAP\nDBUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DBUtil.kt\nandroidx/room/util/DBUtil__DBUtilKt$internalPerform$2$result$1\n+ 2 DBUtil.android.kt\nandroidx/room/util/DBUtil__DBUtil_androidKt$performInTransactionSuspending$2\n*L\n1#1,59:1\n91#2:60\n*E\n"})
    public static final class AnonymousClass1 extends SuspendLambda implements Function2<TransactionScope<Object>, Continuation<Object>, Object> {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ Function1 f41813O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f41814n;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private /* synthetic */ Object f41815t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(Continuation continuation, Function1 function1) {
            super(2, continuation);
            this.f41813O = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation, this.f41813O);
            anonymousClass1.f41815t = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TransactionScope transactionScope, Continuation continuation) {
            return ((AnonymousClass1) create(transactionScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = this.f41814n;
            if (i2 != 0) {
                if (i2 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Function1 function1 = this.f41813O;
            this.f41814n = 1;
            InlineMarker.mark(6);
            Object objInvoke = function1.invoke(this);
            InlineMarker.mark(7);
            if (objInvoke == coroutine_suspended) {
                return coroutine_suspended;
            }
            return objInvoke;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x008b, code lost:
    
        if (r9.fD(r8) == r0) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a8 A[PHI: r1 r9
      0x00a8: PHI (r1v12 androidx.room.Transactor) = (r1v9 androidx.room.Transactor), (r1v19 androidx.room.Transactor) binds: [B:36:0x00a5, B:14:0x002a] A[DONT_GENERATE, DONT_INLINE]
      0x00a8: PHI (r9v14 java.lang.Object) = (r9v13 java.lang.Object), (r9v0 java.lang.Object) binds: [B:36:0x00a5, B:14:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cb A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Transactor.SQLiteTransactionType sQLiteTransactionType;
        Transactor transactor;
        Transactor transactor2;
        Transactor.SQLiteTransactionType sQLiteTransactionType2;
        Object obj2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f41812t;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            if (i2 == 5) {
                                ResultKt.throwOnFailure(obj);
                                return obj;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj2 = this.f41807O;
                        ResultKt.throwOnFailure(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            this.f41810o.WPU().aYN();
                        }
                        return obj2;
                    }
                    transactor = (Transactor) this.f41807O;
                    ResultKt.throwOnFailure(obj);
                    if (this.f41811r) {
                        this.f41807O = obj;
                        this.f41812t = 4;
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
                sQLiteTransactionType2 = (Transactor.SQLiteTransactionType) this.f41809n;
                transactor2 = (Transactor) this.f41807O;
                ResultKt.throwOnFailure(obj);
                Transactor transactor3 = transactor2;
                sQLiteTransactionType = sQLiteTransactionType2;
                transactor = transactor3;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(null, this.f41808Z);
                this.f41807O = transactor;
                this.f41809n = null;
                this.f41812t = 3;
                obj = transactor.n(sQLiteTransactionType, anonymousClass1, this);
                if (obj != coroutine_suspended) {
                    if (this.f41811r) {
                    }
                }
                return coroutine_suspended;
            }
            sQLiteTransactionType2 = (Transactor.SQLiteTransactionType) this.f41809n;
            transactor2 = (Transactor) this.f41807O;
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            Transactor transactor4 = (Transactor) this.f41807O;
            if (this.J2) {
                boolean z2 = this.f41811r;
                if (z2) {
                    sQLiteTransactionType = Transactor.SQLiteTransactionType.f41454n;
                } else {
                    sQLiteTransactionType = Transactor.SQLiteTransactionType.f41456t;
                }
                if (!z2) {
                    this.f41807O = transactor4;
                    this.f41809n = sQLiteTransactionType;
                    this.f41812t = 1;
                    Object objRl2 = transactor4.rl(this);
                    if (objRl2 != coroutine_suspended) {
                        Transactor.SQLiteTransactionType sQLiteTransactionType3 = sQLiteTransactionType;
                        transactor2 = transactor4;
                        obj = objRl2;
                        sQLiteTransactionType2 = sQLiteTransactionType3;
                    }
                } else {
                    transactor = transactor4;
                    AnonymousClass1 anonymousClass12 = new AnonymousClass1(null, this.f41808Z);
                    this.f41807O = transactor;
                    this.f41809n = null;
                    this.f41812t = 3;
                    obj = transactor.n(sQLiteTransactionType, anonymousClass12, this);
                    if (obj != coroutine_suspended) {
                    }
                }
            } else {
                Function1 function1 = this.f41808Z;
                this.f41812t = 5;
                InlineMarker.mark(6);
                Object objInvoke = function1.invoke(this);
                InlineMarker.mark(7);
                if (objInvoke != coroutine_suspended) {
                    return objInvoke;
                }
            }
            return coroutine_suspended;
        }
        if (!((Boolean) obj).booleanValue()) {
            InvalidationTracker invalidationTrackerWPU = this.f41810o.WPU();
            this.f41807O = transactor2;
            this.f41809n = sQLiteTransactionType2;
            this.f41812t = 2;
        }
        Transactor transactor32 = transactor2;
        sQLiteTransactionType = sQLiteTransactionType2;
        transactor = transactor32;
        AnonymousClass1 anonymousClass122 = new AnonymousClass1(null, this.f41808Z);
        this.f41807O = transactor;
        this.f41809n = null;
        this.f41812t = 3;
        obj = transactor.n(sQLiteTransactionType, anonymousClass122, this);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
    }
}
