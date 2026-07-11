package androidx.room.coroutines;

import android.database.sqlite.SQLiteDatabase;
import androidx.room.TransactionScope;
import androidx.room.Transactor;
import androidx.room.coroutines.ConnectionPool;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import androidx.sqlite.driver.AndroidSQLiteConnection;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u0001%B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006JM\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\t\u001a\u00020\b2-\u0010\u000f\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\n¢\u0006\u0002\b\u000eH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J2\u0010\u0016\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00028\u00000\u0014H\u0096@¢\u0006\u0004\b\u0016\u0010\u0017JM\u0010\u0018\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00072\u0006\u0010\t\u001a\u00020\b2-\u0010\u000f\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\n¢\u0006\u0002\b\u000eH\u0096@¢\u0006\u0004\b\u0018\u0010\u0011J\u0010\u0010\u001a\u001a\u00020\u0019H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010 \u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001fR\u0014\u0010$\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Landroidx/room/coroutines/AndroidSQLiteDriverPooledConnection;", "Landroidx/room/Transactor;", "Landroidx/room/coroutines/RawConnectionAccessor;", "Landroidx/sqlite/driver/AndroidSQLiteConnection;", "delegate", "<init>", "(Landroidx/sqlite/driver/AndroidSQLiteConnection;)V", "R", "Landroidx/room/Transactor$SQLiteTransactionType;", "type", "Lkotlin/Function2;", "Landroidx/room/TransactionScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "Uo", "(Landroidx/room/Transactor$SQLiteTransactionType;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "sql", "Lkotlin/Function1;", "Landroidx/sqlite/SQLiteStatement;", "nr", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", c.f62177j, "", "rl", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/sqlite/driver/AndroidSQLiteConnection;", "J2", "()Landroidx/sqlite/driver/AndroidSQLiteConnection;", "Landroidx/room/Transactor$SQLiteTransactionType;", "currentTransactionType", "Landroidx/sqlite/SQLiteConnection;", "t", "()Landroidx/sqlite/SQLiteConnection;", "rawConnection", "AndroidSQLiteDriverTransactor", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAndroidSQLiteDriverConnectionPool.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidSQLiteDriverConnectionPool.android.kt\nandroidx/room/coroutines/AndroidSQLiteDriverPooledConnection\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,125:1\n1#2:126\n*E\n"})
final class AndroidSQLiteDriverPooledConnection implements Transactor, RawConnectionAccessor {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final AndroidSQLiteConnection delegate;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private Transactor.SQLiteTransactionType currentTransactionType;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J2\u0010\f\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00062\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00010\tH\u0096@¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/room/coroutines/AndroidSQLiteDriverPooledConnection$AndroidSQLiteDriverTransactor;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/room/TransactionScope;", "Landroidx/room/coroutines/RawConnectionAccessor;", "<init>", "(Landroidx/room/coroutines/AndroidSQLiteDriverPooledConnection;)V", "R", "", "sql", "Lkotlin/Function1;", "Landroidx/sqlite/SQLiteStatement;", "block", "nr", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/sqlite/SQLiteConnection;", "t", "()Landroidx/sqlite/SQLiteConnection;", "rawConnection", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private final class AndroidSQLiteDriverTransactor<T> implements TransactionScope<T>, RawConnectionAccessor {
        public AndroidSQLiteDriverTransactor() {
        }

        @Override // androidx.room.PooledConnection
        public Object nr(String str, Function1 function1, Continuation continuation) {
            return AndroidSQLiteDriverPooledConnection.this.nr(str, function1, continuation);
        }

        @Override // androidx.room.coroutines.RawConnectionAccessor
        public SQLiteConnection t() {
            return AndroidSQLiteDriverPooledConnection.this.t();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Transactor.SQLiteTransactionType.values().length];
            try {
                iArr[Transactor.SQLiteTransactionType.f41454n.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Transactor.SQLiteTransactionType.f41456t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Transactor.SQLiteTransactionType.f41453O.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AndroidSQLiteDriverPooledConnection(AndroidSQLiteConnection delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Uo(Transactor.SQLiteTransactionType sQLiteTransactionType, Function2 function2, Continuation continuation) throws Throwable {
        AndroidSQLiteDriverPooledConnection$transaction$1 androidSQLiteDriverPooledConnection$transaction$1;
        ConnectionPool.RollbackException e2;
        SQLiteDatabase sQLiteDatabase;
        AndroidSQLiteDriverPooledConnection androidSQLiteDriverPooledConnection;
        if (continuation instanceof AndroidSQLiteDriverPooledConnection$transaction$1) {
            androidSQLiteDriverPooledConnection$transaction$1 = (AndroidSQLiteDriverPooledConnection$transaction$1) continuation;
            int i2 = androidSQLiteDriverPooledConnection$transaction$1.f41539r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidSQLiteDriverPooledConnection$transaction$1.f41539r = i2 - Integer.MIN_VALUE;
            } else {
                androidSQLiteDriverPooledConnection$transaction$1 = new AndroidSQLiteDriverPooledConnection$transaction$1(this, continuation);
            }
        }
        Object obj = androidSQLiteDriverPooledConnection$transaction$1.f41537O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = androidSQLiteDriverPooledConnection$transaction$1.f41539r;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj);
                SQLiteDatabase db = this.delegate.getDb();
                if (!db.inTransaction()) {
                    this.currentTransactionType = sQLiteTransactionType;
                }
                int i5 = WhenMappings.$EnumSwitchMapping$0[sQLiteTransactionType.ordinal()];
                if (i5 == 1 || i5 == 2) {
                    db.beginTransactionNonExclusive();
                } else {
                    if (i5 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    db.beginTransaction();
                }
                try {
                    AndroidSQLiteDriverTransactor androidSQLiteDriverTransactor = new AndroidSQLiteDriverTransactor();
                    androidSQLiteDriverPooledConnection$transaction$1.f41538n = this;
                    androidSQLiteDriverPooledConnection$transaction$1.f41540t = db;
                    androidSQLiteDriverPooledConnection$transaction$1.f41539r = 1;
                    Object objInvoke = function2.invoke(androidSQLiteDriverTransactor, androidSQLiteDriverPooledConnection$transaction$1);
                    if (objInvoke == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    obj = objInvoke;
                    sQLiteDatabase = db;
                    androidSQLiteDriverPooledConnection = this;
                } catch (ConnectionPool.RollbackException e3) {
                    e2 = e3;
                    sQLiteDatabase = db;
                    androidSQLiteDriverPooledConnection = this;
                    Object result = e2.getResult();
                    sQLiteDatabase.endTransaction();
                    if (!sQLiteDatabase.inTransaction()) {
                    }
                    return result;
                } catch (Throwable th) {
                    th = th;
                    sQLiteTransactionType = db;
                    function2 = this;
                    sQLiteTransactionType.endTransaction();
                    if (!sQLiteTransactionType.inTransaction()) {
                        function2.currentTransactionType = null;
                    }
                    throw th;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sQLiteDatabase = (SQLiteDatabase) androidSQLiteDriverPooledConnection$transaction$1.f41540t;
                androidSQLiteDriverPooledConnection = (AndroidSQLiteDriverPooledConnection) androidSQLiteDriverPooledConnection$transaction$1.f41538n;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (ConnectionPool.RollbackException e4) {
                    e2 = e4;
                    Object result2 = e2.getResult();
                    sQLiteDatabase.endTransaction();
                    if (!sQLiteDatabase.inTransaction()) {
                        androidSQLiteDriverPooledConnection.currentTransactionType = null;
                    }
                    return result2;
                }
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            if (!sQLiteDatabase.inTransaction()) {
                androidSQLiteDriverPooledConnection.currentTransactionType = null;
            }
            return obj;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: J2, reason: from getter */
    public final AndroidSQLiteConnection getDelegate() {
        return this.delegate;
    }

    @Override // androidx.room.PooledConnection
    public Object nr(String str, Function1 function1, Continuation continuation) {
        SQLiteStatement sQLiteStatementMI = this.delegate.mI(str);
        try {
            Object objInvoke = function1.invoke(sQLiteStatementMI);
            AutoCloseableKt.closeFinally(sQLiteStatementMI, null);
            return objInvoke;
        } finally {
        }
    }

    @Override // androidx.room.Transactor
    public Object rl(Continuation continuation) {
        return Boxing.boxBoolean(this.delegate.getDb().inTransaction());
    }

    @Override // androidx.room.coroutines.RawConnectionAccessor
    public SQLiteConnection t() {
        return this.delegate;
    }

    @Override // androidx.room.Transactor
    public Object n(Transactor.SQLiteTransactionType sQLiteTransactionType, Function2 function2, Continuation continuation) {
        return Uo(sQLiteTransactionType, function2, continuation);
    }
}
