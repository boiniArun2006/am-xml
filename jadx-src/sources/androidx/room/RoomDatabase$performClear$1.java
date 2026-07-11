package androidx.room;

import GJW.vd;
import androidx.room.Transactor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LGJW/vd;", "", "<anonymous>", "(LGJW/vd;)V"}, k = 3, mv = {2, 0, 0})
@DebugMetadata(c = "androidx.room.RoomDatabase$performClear$1", f = "RoomDatabase.android.kt", i = {}, l = {507}, m = "invokeSuspend", n = {}, s = {})
final class RoomDatabase$performClear$1 extends SuspendLambda implements Function2<vd, Continuation<? super Unit>, Object> {
    final /* synthetic */ String[] J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    final /* synthetic */ boolean f41381O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f41382n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final /* synthetic */ RoomDatabase f41383t;

    /* JADX INFO: renamed from: androidx.room.RoomDatabase$performClear$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "connection", "Landroidx/room/Transactor;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @DebugMetadata(c = "androidx.room.RoomDatabase$performClear$1$1", f = "RoomDatabase.android.kt", i = {0, 1, 2, 3, 4}, l = {508, 509, 511, 517, 518, 519}, m = "invokeSuspend", n = {"connection", "connection", "connection", "connection", "connection"}, s = {"L$0", "L$0", "L$0", "L$0", "L$0"})
    static final class AnonymousClass1 extends SuspendLambda implements Function2<Transactor, Continuation<? super Unit>, Object> {
        final /* synthetic */ boolean J2;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ RoomDatabase f41384O;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f41385n;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ String[] f41386r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f41387t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(RoomDatabase roomDatabase, boolean z2, String[] strArr, Continuation continuation) {
            super(2, continuation);
            this.f41384O = roomDatabase;
            this.J2 = z2;
            this.f41386r = strArr;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f41384O, this.J2, this.f41386r, continuation);
            anonymousClass1.f41387t = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Transactor transactor, Continuation continuation) {
            return ((AnonymousClass1) create(transactor, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX INFO: renamed from: androidx.room.RoomDatabase$performClear$1$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/room/TransactionScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        @DebugMetadata(c = "androidx.room.RoomDatabase$performClear$1$1$1", f = "RoomDatabase.android.kt", i = {0, 1, 1}, l = {513, 515}, m = "invokeSuspend", n = {"$this$withTransaction", "$this$withTransaction", "$this$forEach$iv"}, s = {"L$0", "L$0", "L$1"})
        @SourceDebugExtension({"SMAP\nRoomDatabase.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomDatabase.android.kt\nandroidx/room/RoomDatabase$performClear$1$1$1\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,2151:1\n13402#2,2:2152\n*S KotlinDebug\n*F\n+ 1 RoomDatabase.android.kt\nandroidx/room/RoomDatabase$performClear$1$1$1\n*L\n515#1:2152,2\n*E\n"})
        static final class C05671 extends SuspendLambda implements Function2<TransactionScope<Unit>, Continuation<? super Unit>, Object> {
            int J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            int f41388O;

            /* JADX INFO: renamed from: Z, reason: collision with root package name */
            final /* synthetic */ String[] f41389Z;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            Object f41390n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            final /* synthetic */ boolean f41391o;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private /* synthetic */ Object f41392r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            int f41393t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C05671(boolean z2, String[] strArr, Continuation continuation) {
                super(2, continuation);
                this.f41391o = z2;
                this.f41389Z = strArr;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                C05671 c05671 = new C05671(this.f41391o, this.f41389Z, continuation);
                c05671.f41392r = obj;
                return c05671;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Object invoke(TransactionScope transactionScope, Continuation continuation) {
                return ((C05671) create(transactionScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
            
                if (androidx.room.TransactorKt.rl(r1, "PRAGMA defer_foreign_keys = TRUE", r9) == r0) goto L19;
             */
            /* JADX WARN: Code restructure failed: missing block: B:18:0x0077, code lost:
            
                if (androidx.room.TransactorKt.rl(r6, r10, r9) == r0) goto L19;
             */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x0079, code lost:
            
                return r0;
             */
            /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0077 -> B:20:0x007a). Please report as a decompilation issue!!! */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                TransactionScope transactionScope;
                TransactionScope transactionScope2;
                int length;
                int i2;
                String[] strArr;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i3 = this.J2;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            length = this.f41388O;
                            i2 = this.f41393t;
                            strArr = (String[]) this.f41390n;
                            transactionScope2 = (TransactionScope) this.f41392r;
                            ResultKt.throwOnFailure(obj);
                            i2++;
                            if (i2 >= length) {
                                String str = "DELETE FROM `" + strArr[i2] + '`';
                                this.f41392r = transactionScope2;
                                this.f41390n = strArr;
                                this.f41393t = i2;
                                this.f41388O = length;
                                this.J2 = 2;
                            } else {
                                return Unit.INSTANCE;
                            }
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        transactionScope = (TransactionScope) this.f41392r;
                        ResultKt.throwOnFailure(obj);
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    transactionScope = (TransactionScope) this.f41392r;
                    if (this.f41391o) {
                        this.f41392r = transactionScope;
                        this.J2 = 1;
                    }
                }
                String[] strArr2 = this.f41389Z;
                transactionScope2 = transactionScope;
                length = strArr2.length;
                i2 = 0;
                strArr = strArr2;
                if (i2 >= length) {
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:33:0x00b5, code lost:
        
            if (androidx.room.TransactorKt.rl(r1, "VACUUM", r7) != r0) goto L35;
         */
        /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0071 A[PHI: r1
          0x0071: PHI (r1v7 androidx.room.Transactor) = (r1v4 androidx.room.Transactor), (r1v4 androidx.room.Transactor), (r1v9 androidx.room.Transactor) binds: [B:17:0x005d, B:19:0x006e, B:10:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0088 A[PHI: r1
          0x0088: PHI (r1v10 androidx.room.Transactor) = (r1v7 androidx.room.Transactor), (r1v12 androidx.room.Transactor) binds: [B:22:0x0085, B:9:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0094 A[PHI: r1 r8
          0x0094: PHI (r1v13 androidx.room.Transactor) = (r1v10 androidx.room.Transactor), (r1v15 androidx.room.Transactor) binds: [B:25:0x0091, B:8:0x0020] A[DONT_GENERATE, DONT_INLINE]
          0x0094: PHI (r8v14 java.lang.Object) = (r8v13 java.lang.Object), (r8v0 java.lang.Object) binds: [B:25:0x0091, B:8:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Transactor transactor;
            Transactor.SQLiteTransactionType sQLiteTransactionType;
            C05671 c05671;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            switch (this.f41385n) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    Transactor transactor2 = (Transactor) this.f41387t;
                    this.f41387t = transactor2;
                    this.f41385n = 1;
                    Object objRl = transactor2.rl(this);
                    if (objRl != coroutine_suspended) {
                        transactor = transactor2;
                        obj = objRl;
                        if (((Boolean) obj).booleanValue()) {
                            InvalidationTracker invalidationTrackerWPU = this.f41384O.WPU();
                            this.f41387t = transactor;
                            this.f41385n = 2;
                            if (invalidationTrackerWPU.fD(this) != coroutine_suspended) {
                                sQLiteTransactionType = Transactor.SQLiteTransactionType.f41456t;
                                c05671 = new C05671(this.J2, this.f41386r, null);
                                this.f41387t = transactor;
                                this.f41385n = 3;
                                if (transactor.n(sQLiteTransactionType, c05671, this) != coroutine_suspended) {
                                    this.f41387t = transactor;
                                    this.f41385n = 4;
                                    obj = transactor.rl(this);
                                    if (obj != coroutine_suspended) {
                                        if (!((Boolean) obj).booleanValue()) {
                                            this.f41387t = transactor;
                                            this.f41385n = 5;
                                            if (TransactorKt.rl(transactor, "PRAGMA wal_checkpoint(FULL)", this) != coroutine_suspended) {
                                                this.f41387t = null;
                                                this.f41385n = 6;
                                            }
                                        }
                                    }
                                }
                            }
                            break;
                        }
                        return Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                case 1:
                    transactor = (Transactor) this.f41387t;
                    ResultKt.throwOnFailure(obj);
                    if (((Boolean) obj).booleanValue()) {
                    }
                    return Unit.INSTANCE;
                case 2:
                    transactor = (Transactor) this.f41387t;
                    ResultKt.throwOnFailure(obj);
                    sQLiteTransactionType = Transactor.SQLiteTransactionType.f41456t;
                    c05671 = new C05671(this.J2, this.f41386r, null);
                    this.f41387t = transactor;
                    this.f41385n = 3;
                    if (transactor.n(sQLiteTransactionType, c05671, this) != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 3:
                    transactor = (Transactor) this.f41387t;
                    ResultKt.throwOnFailure(obj);
                    this.f41387t = transactor;
                    this.f41385n = 4;
                    obj = transactor.rl(this);
                    if (obj != coroutine_suspended) {
                    }
                    return coroutine_suspended;
                case 4:
                    transactor = (Transactor) this.f41387t;
                    ResultKt.throwOnFailure(obj);
                    if (!((Boolean) obj).booleanValue()) {
                    }
                    return Unit.INSTANCE;
                case 5:
                    transactor = (Transactor) this.f41387t;
                    ResultKt.throwOnFailure(obj);
                    this.f41387t = null;
                    this.f41385n = 6;
                    break;
                case 6:
                    ResultKt.throwOnFailure(obj);
                    this.f41384O.WPU().aYN();
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RoomDatabase$performClear$1(RoomDatabase roomDatabase, boolean z2, String[] strArr, Continuation continuation) {
        super(2, continuation);
        this.f41383t = roomDatabase;
        this.f41381O = z2;
        this.J2 = strArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RoomDatabase$performClear$1(this.f41383t, this.f41381O, this.J2, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(vd vdVar, Continuation continuation) {
        return ((RoomDatabase$performClear$1) create(vdVar, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(vd vdVar, Continuation<? super Unit> continuation) {
        return invoke2(vdVar, (Continuation) continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.f41382n;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            RoomConnectionManager roomConnectionManager = this.f41383t.connectionManager;
            if (roomConnectionManager == null) {
                Intrinsics.throwUninitializedPropertyAccessException("connectionManager");
                roomConnectionManager = null;
            }
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f41383t, this.f41381O, this.J2, null);
            this.f41382n = 1;
            if (roomConnectionManager.s7N(false, anonymousClass1, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return Unit.INSTANCE;
    }
}
