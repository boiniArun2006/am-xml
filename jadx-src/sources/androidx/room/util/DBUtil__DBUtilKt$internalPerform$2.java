package androidx.room.util;

import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.Transactor;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\b\u0003\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "R", "transactor", "Landroidx/room/Transactor;"}, k = 3, mv = {2, 0, 0}, xi = 176)
@DebugMetadata(c = "androidx.room.util.DBUtil__DBUtilKt$internalPerform$2", f = "DBUtil.kt", i = {0, 0, 1, 1, 2, 3}, l = {56, 57, 59, 60, 65}, m = "invokeSuspend", n = {"transactor", "type", "transactor", "type", "transactor", "result"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$0"})
public final class DBUtil__DBUtilKt$internalPerform$2 extends SuspendLambda implements Function2<Transactor, Continuation<Object>, Object> {
    final /* synthetic */ boolean J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    /* synthetic */ Object f41780O;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    final /* synthetic */ Function2 f41781Z;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Object f41782n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    final /* synthetic */ RoomDatabase f41783o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final /* synthetic */ boolean f41784r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f41785t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DBUtil__DBUtilKt$internalPerform$2(boolean z2, boolean z3, RoomDatabase roomDatabase, Function2 function2, Continuation continuation) {
        super(2, continuation);
        this.J2 = z2;
        this.f41784r = z3;
        this.f41783o = roomDatabase;
        this.f41781Z = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DBUtil__DBUtilKt$internalPerform$2 dBUtil__DBUtilKt$internalPerform$2 = new DBUtil__DBUtilKt$internalPerform$2(this.J2, this.f41784r, this.f41783o, this.f41781Z, continuation);
        dBUtil__DBUtilKt$internalPerform$2.f41780O = obj;
        return dBUtil__DBUtilKt$internalPerform$2;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final Object invoke(Transactor transactor, Continuation continuation) {
        return ((DBUtil__DBUtilKt$internalPerform$2) create(transactor, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x008b, code lost:
    
        if (r9.fD(r8) == r0) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a8 A[PHI: r1 r9
      0x00a8: PHI (r1v11 androidx.room.Transactor) = (r1v8 androidx.room.Transactor), (r1v18 androidx.room.Transactor) binds: [B:36:0x00a5, B:14:0x002a] A[DONT_GENERATE, DONT_INLINE]
      0x00a8: PHI (r9v13 java.lang.Object) = (r9v12 java.lang.Object), (r9v0 java.lang.Object) binds: [B:36:0x00a5, B:14:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
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
        int i2 = this.f41785t;
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
                        obj2 = this.f41780O;
                        ResultKt.throwOnFailure(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            this.f41783o.WPU().aYN();
                        }
                        return obj2;
                    }
                    transactor = (Transactor) this.f41780O;
                    ResultKt.throwOnFailure(obj);
                    if (this.f41784r) {
                        this.f41780O = obj;
                        this.f41785t = 4;
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
                sQLiteTransactionType2 = (Transactor.SQLiteTransactionType) this.f41782n;
                transactor2 = (Transactor) this.f41780O;
                ResultKt.throwOnFailure(obj);
                Transactor transactor3 = transactor2;
                sQLiteTransactionType = sQLiteTransactionType2;
                transactor = transactor3;
                DBUtil__DBUtilKt$internalPerform$2$result$1 dBUtil__DBUtilKt$internalPerform$2$result$1 = new DBUtil__DBUtilKt$internalPerform$2$result$1(this.f41781Z, null);
                this.f41780O = transactor;
                this.f41782n = null;
                this.f41785t = 3;
                obj = transactor.n(sQLiteTransactionType, dBUtil__DBUtilKt$internalPerform$2$result$1, this);
                if (obj != coroutine_suspended) {
                    if (this.f41784r) {
                    }
                }
                return coroutine_suspended;
            }
            sQLiteTransactionType2 = (Transactor.SQLiteTransactionType) this.f41782n;
            transactor2 = (Transactor) this.f41780O;
            ResultKt.throwOnFailure(obj);
        } else {
            ResultKt.throwOnFailure(obj);
            Transactor transactor4 = (Transactor) this.f41780O;
            if (this.J2) {
                boolean z2 = this.f41784r;
                if (z2) {
                    sQLiteTransactionType = Transactor.SQLiteTransactionType.f41454n;
                } else {
                    sQLiteTransactionType = Transactor.SQLiteTransactionType.f41456t;
                }
                if (!z2) {
                    this.f41780O = transactor4;
                    this.f41782n = sQLiteTransactionType;
                    this.f41785t = 1;
                    Object objRl2 = transactor4.rl(this);
                    if (objRl2 != coroutine_suspended) {
                        Transactor.SQLiteTransactionType sQLiteTransactionType3 = sQLiteTransactionType;
                        transactor2 = transactor4;
                        obj = objRl2;
                        sQLiteTransactionType2 = sQLiteTransactionType3;
                    }
                } else {
                    transactor = transactor4;
                    DBUtil__DBUtilKt$internalPerform$2$result$1 dBUtil__DBUtilKt$internalPerform$2$result$12 = new DBUtil__DBUtilKt$internalPerform$2$result$1(this.f41781Z, null);
                    this.f41780O = transactor;
                    this.f41782n = null;
                    this.f41785t = 3;
                    obj = transactor.n(sQLiteTransactionType, dBUtil__DBUtilKt$internalPerform$2$result$12, this);
                    if (obj != coroutine_suspended) {
                    }
                }
            } else {
                Function2 function2 = this.f41781Z;
                this.f41785t = 5;
                Object objInvoke = function2.invoke(transactor4, this);
                if (objInvoke != coroutine_suspended) {
                    return objInvoke;
                }
            }
            return coroutine_suspended;
        }
        if (!((Boolean) obj).booleanValue()) {
            InvalidationTracker invalidationTrackerWPU = this.f41783o.WPU();
            this.f41780O = transactor2;
            this.f41782n = sQLiteTransactionType2;
            this.f41785t = 2;
        }
        Transactor transactor32 = transactor2;
        sQLiteTransactionType = sQLiteTransactionType2;
        transactor = transactor32;
        DBUtil__DBUtilKt$internalPerform$2$result$1 dBUtil__DBUtilKt$internalPerform$2$result$122 = new DBUtil__DBUtilKt$internalPerform$2$result$1(this.f41781Z, null);
        this.f41780O = transactor;
        this.f41782n = null;
        this.f41785t = 3;
        obj = transactor.n(sQLiteTransactionType, dBUtil__DBUtilKt$internalPerform$2$result$122, this);
        if (obj != coroutine_suspended) {
        }
        return coroutine_suspended;
    }
}
