package androidx.room.coroutines;

import android.database.SQLException;
import androidx.room.TransactionScope;
import androidx.room.Transactor;
import androidx.room.concurrent.ThreadLocal_jvmAndroidKt;
import androidx.room.coroutines.ConnectionPool;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ExceptionsKt;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002:\u00039:;B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJO\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2-\u0010\u0011\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\f¢\u0006\u0002\b\u0010H\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0005H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019J2\u0010\u001e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\u0006\u0010\u001b\u001a\u00020\u001a2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00028\u00000\u001cH\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJM\u0010 \u001a\u00028\u0000\"\u0004\b\u0000\u0010\t2\u0006\u0010\u000b\u001a\u00020\n2-\u0010\u0011\u001a)\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\f¢\u0006\u0002\b\u0010H\u0096@¢\u0006\u0004\b \u0010\u0013J\u0010\u0010!\u001a\u00020\u0005H\u0096@¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0014¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b \u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b!\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010/\u001a\b\u0012\u0004\u0012\u00020,0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00103\u001a\u000600j\u0002`18\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u00102R\u0014\u00105\u001a\u00020\u00058BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u0010*R\u0014\u00108\u001a\u0002068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b-\u00107¨\u0006<"}, d2 = {"Landroidx/room/coroutines/PooledConnectionImpl;", "Landroidx/room/Transactor;", "Landroidx/room/coroutines/RawConnectionAccessor;", "Landroidx/room/coroutines/ConnectionWithLock;", "delegate", "", "isReadOnly", "<init>", "(Landroidx/room/coroutines/ConnectionWithLock;Z)V", "R", "Landroidx/room/Transactor$SQLiteTransactionType;", "type", "Lkotlin/Function2;", "Landroidx/room/TransactionScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "block", "ck", "(Landroidx/room/Transactor$SQLiteTransactionType;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "mUb", "(Landroidx/room/Transactor$SQLiteTransactionType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "success", "gh", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "sql", "Lkotlin/Function1;", "Landroidx/sqlite/SQLiteStatement;", "nr", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", c.f62177j, "rl", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "HI", "()V", "Landroidx/room/coroutines/ConnectionWithLock;", "qie", "()Landroidx/room/coroutines/ConnectionWithLock;", "Z", "az", "()Z", "Lkotlin/collections/ArrayDeque;", "Landroidx/room/coroutines/PooledConnectionImpl$TransactionItem;", "t", "Lkotlin/collections/ArrayDeque;", "transactionStack", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Landroidx/room/concurrent/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "_isRecycled", "ty", "isRecycled", "Landroidx/sqlite/SQLiteConnection;", "()Landroidx/sqlite/SQLiteConnection;", "rawConnection", "TransactionItem", "TransactionImpl", "StatementWrapper", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nConnectionPoolImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConnectionPoolImpl.kt\nandroidx/room/coroutines/PooledConnectionImpl\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,556:1\n481#1,11:557\n481#1,11:578\n481#1,11:589\n120#2,8:568\n129#2:577\n120#2,10:600\n120#2,10:610\n1#3:576\n*S KotlinDebug\n*F\n+ 1 ConnectionPoolImpl.kt\nandroidx/room/coroutines/PooledConnectionImpl\n*L\n360#1:557,11\n369#1:578,11\n371#1:589,11\n361#1:568,8\n361#1:577\n420#1:600,10\n437#1:610,10\n*E\n"})
final class PooledConnectionImpl implements Transactor, RawConnectionAccessor {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final ConnectionWithLock delegate;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final AtomicBoolean _isRecycled;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final boolean isReadOnly;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final ArrayDeque transactionStack;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001a\u0010\u0014J\u000f\u0010\u001b\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001f\u0010\u001eR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Landroidx/room/coroutines/PooledConnectionImpl$StatementWrapper;", "Landroidx/sqlite/SQLiteStatement;", "delegate", "<init>", "(Landroidx/room/coroutines/PooledConnectionImpl;Landroidx/sqlite/SQLiteStatement;)V", "", "index", "", "value", "", "mUb", "(IJ)V", "", "iF", "(ILjava/lang/String;)V", "gh", "(I)V", "getLong", "(I)J", "HV", "(I)Ljava/lang/String;", "", "isNull", "(I)Z", "getColumnCount", "()I", "getColumnName", "RQ", "()Z", "reset", "()V", MRAIDPresenter.CLOSE, c.f62177j, "Landroidx/sqlite/SQLiteStatement;", "t", "J", "threadId", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nConnectionPoolImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConnectionPoolImpl.kt\nandroidx/room/coroutines/PooledConnectionImpl$StatementWrapper\n*L\n1#1,556:1\n543#1,10:557\n543#1,10:567\n543#1,10:577\n543#1,10:587\n543#1,10:597\n543#1,10:607\n543#1,10:617\n543#1,10:627\n543#1,10:637\n543#1,10:647\n543#1,10:657\n543#1,10:667\n543#1,10:677\n543#1,10:687\n543#1,10:697\n543#1,10:707\n543#1,10:717\n*S KotlinDebug\n*F\n+ 1 ConnectionPoolImpl.kt\nandroidx/room/coroutines/PooledConnectionImpl$StatementWrapper\n*L\n500#1:557,10\n504#1:567,10\n508#1:577,10\n512#1:587,10\n516#1:597,10\n518#1:607,10\n520#1:617,10\n522#1:627,10\n524#1:637,10\n526#1:647,10\n528#1:657,10\n530#1:667,10\n532#1:677,10\n534#1:687,10\n536#1:697,10\n538#1:707,10\n540#1:717,10\n*E\n"})
    private final class StatementWrapper implements SQLiteStatement {

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        final /* synthetic */ PooledConnectionImpl f41597O;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final SQLiteStatement delegate;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private final long threadId;

        public StatementWrapper(PooledConnectionImpl pooledConnectionImpl, SQLiteStatement delegate) {
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.f41597O = pooledConnectionImpl;
            this.delegate = delegate;
            this.threadId = ThreadLocal_jvmAndroidKt.rl();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public String HV(int index) {
            if (this.f41597O.ty()) {
                SQLite.rl(21, "Statement is recycled");
                throw new KotlinNothingValueException();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.rl()) {
                return this.delegate.HV(index);
            }
            SQLite.rl(21, "Attempted to use statement on a different thread");
            throw new KotlinNothingValueException();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public boolean RQ() {
            if (this.f41597O.ty()) {
                SQLite.rl(21, "Statement is recycled");
                throw new KotlinNothingValueException();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.rl()) {
                return this.delegate.RQ();
            }
            SQLite.rl(21, "Attempted to use statement on a different thread");
            throw new KotlinNothingValueException();
        }

        @Override // androidx.sqlite.SQLiteStatement, java.lang.AutoCloseable
        public void close() {
            if (this.f41597O.ty()) {
                SQLite.rl(21, "Statement is recycled");
                throw new KotlinNothingValueException();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.rl()) {
                this.delegate.close();
            } else {
                SQLite.rl(21, "Attempted to use statement on a different thread");
                throw new KotlinNothingValueException();
            }
        }

        @Override // androidx.sqlite.SQLiteStatement
        public int getColumnCount() {
            if (this.f41597O.ty()) {
                SQLite.rl(21, "Statement is recycled");
                throw new KotlinNothingValueException();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.rl()) {
                return this.delegate.getColumnCount();
            }
            SQLite.rl(21, "Attempted to use statement on a different thread");
            throw new KotlinNothingValueException();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public String getColumnName(int index) {
            if (this.f41597O.ty()) {
                SQLite.rl(21, "Statement is recycled");
                throw new KotlinNothingValueException();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.rl()) {
                return this.delegate.getColumnName(index);
            }
            SQLite.rl(21, "Attempted to use statement on a different thread");
            throw new KotlinNothingValueException();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public long getLong(int index) {
            if (this.f41597O.ty()) {
                SQLite.rl(21, "Statement is recycled");
                throw new KotlinNothingValueException();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.rl()) {
                return this.delegate.getLong(index);
            }
            SQLite.rl(21, "Attempted to use statement on a different thread");
            throw new KotlinNothingValueException();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public void gh(int index) {
            if (this.f41597O.ty()) {
                SQLite.rl(21, "Statement is recycled");
                throw new KotlinNothingValueException();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.rl()) {
                this.delegate.gh(index);
            } else {
                SQLite.rl(21, "Attempted to use statement on a different thread");
                throw new KotlinNothingValueException();
            }
        }

        @Override // androidx.sqlite.SQLiteStatement
        public void iF(int index, String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            if (this.f41597O.ty()) {
                SQLite.rl(21, "Statement is recycled");
                throw new KotlinNothingValueException();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.rl()) {
                this.delegate.iF(index, value);
            } else {
                SQLite.rl(21, "Attempted to use statement on a different thread");
                throw new KotlinNothingValueException();
            }
        }

        @Override // androidx.sqlite.SQLiteStatement
        public boolean isNull(int index) {
            if (this.f41597O.ty()) {
                SQLite.rl(21, "Statement is recycled");
                throw new KotlinNothingValueException();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.rl()) {
                return this.delegate.isNull(index);
            }
            SQLite.rl(21, "Attempted to use statement on a different thread");
            throw new KotlinNothingValueException();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public void mUb(int index, long value) {
            if (this.f41597O.ty()) {
                SQLite.rl(21, "Statement is recycled");
                throw new KotlinNothingValueException();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.rl()) {
                this.delegate.mUb(index, value);
            } else {
                SQLite.rl(21, "Attempted to use statement on a different thread");
                throw new KotlinNothingValueException();
            }
        }

        @Override // androidx.sqlite.SQLiteStatement
        public void reset() {
            if (this.f41597O.ty()) {
                SQLite.rl(21, "Statement is recycled");
                throw new KotlinNothingValueException();
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.rl()) {
                this.delegate.reset();
            } else {
                SQLite.rl(21, "Attempted to use statement on a different thread");
                throw new KotlinNothingValueException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J2\u0010\f\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00062\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00028\u00010\tH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00028\u0000H\u0096@¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/room/coroutines/PooledConnectionImpl$TransactionImpl;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/room/TransactionScope;", "Landroidx/room/coroutines/RawConnectionAccessor;", "<init>", "(Landroidx/room/coroutines/PooledConnectionImpl;)V", "R", "", "sql", "Lkotlin/Function1;", "Landroidx/sqlite/SQLiteStatement;", "block", "nr", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "result", "", "O", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/sqlite/SQLiteConnection;", "t", "()Landroidx/sqlite/SQLiteConnection;", "rawConnection", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nConnectionPoolImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConnectionPoolImpl.kt\nandroidx/room/coroutines/PooledConnectionImpl$TransactionImpl\n+ 2 ConnectionPoolImpl.kt\nandroidx/room/coroutines/PooledConnectionImpl\n+ 3 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,556:1\n481#2,11:557\n481#2,11:568\n120#3,10:579\n*S KotlinDebug\n*F\n+ 1 ConnectionPoolImpl.kt\nandroidx/room/coroutines/PooledConnectionImpl$TransactionImpl\n*L\n469#1:557,11\n471#1:568,11\n475#1:579,10\n*E\n"})
    final class TransactionImpl<T> implements TransactionScope<T>, RawConnectionAccessor {
        public TransactionImpl() {
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object O(Object obj, Continuation continuation) throws ConnectionPool.RollbackException {
            PooledConnectionImpl$TransactionImpl$rollback$1 pooledConnectionImpl$TransactionImpl$rollback$1;
            Object obj2;
            PooledConnectionImpl pooledConnectionImpl;
            yB.j jVar;
            if (continuation instanceof PooledConnectionImpl$TransactionImpl$rollback$1) {
                pooledConnectionImpl$TransactionImpl$rollback$1 = (PooledConnectionImpl$TransactionImpl$rollback$1) continuation;
                int i2 = pooledConnectionImpl$TransactionImpl$rollback$1.f41603o;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    pooledConnectionImpl$TransactionImpl$rollback$1.f41603o = i2 - Integer.MIN_VALUE;
                } else {
                    pooledConnectionImpl$TransactionImpl$rollback$1 = new PooledConnectionImpl$TransactionImpl$rollback$1(this, continuation);
                }
            }
            Object obj3 = pooledConnectionImpl$TransactionImpl$rollback$1.J2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i3 = pooledConnectionImpl$TransactionImpl$rollback$1.f41603o;
            if (i3 == 0) {
                ResultKt.throwOnFailure(obj3);
                PooledConnectionImpl pooledConnectionImpl2 = PooledConnectionImpl.this;
                if (pooledConnectionImpl2.ty()) {
                    SQLite.rl(21, "Connection is recycled");
                    throw new KotlinNothingValueException();
                }
                ConnectionElement connectionElement = (ConnectionElement) pooledConnectionImpl$TransactionImpl$rollback$1.get$context().get(ConnectionElement.INSTANCE);
                if (connectionElement == null || connectionElement.getConnectionWrapper() != pooledConnectionImpl2) {
                    SQLite.rl(21, "Attempted to use connection on a different coroutine");
                    throw new KotlinNothingValueException();
                }
                if (pooledConnectionImpl2.transactionStack.isEmpty()) {
                    throw new IllegalStateException("Not in a transaction");
                }
                ConnectionWithLock delegate = pooledConnectionImpl2.getDelegate();
                pooledConnectionImpl$TransactionImpl$rollback$1.f41602n = obj;
                pooledConnectionImpl$TransactionImpl$rollback$1.f41605t = pooledConnectionImpl2;
                pooledConnectionImpl$TransactionImpl$rollback$1.f41601O = delegate;
                pooledConnectionImpl$TransactionImpl$rollback$1.f41603o = 1;
                if (delegate.Z(null, pooledConnectionImpl$TransactionImpl$rollback$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                obj2 = obj;
                pooledConnectionImpl = pooledConnectionImpl2;
                jVar = delegate;
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                jVar = (yB.j) pooledConnectionImpl$TransactionImpl$rollback$1.f41601O;
                pooledConnectionImpl = (PooledConnectionImpl) pooledConnectionImpl$TransactionImpl$rollback$1.f41605t;
                obj2 = pooledConnectionImpl$TransactionImpl$rollback$1.f41602n;
                ResultKt.throwOnFailure(obj3);
            }
            try {
                ((TransactionItem) pooledConnectionImpl.transactionStack.last()).t(true);
                Unit unit = Unit.INSTANCE;
                jVar.T(null);
                throw new ConnectionPool.RollbackException(obj2);
            } catch (Throwable th) {
                jVar.T(null);
                throw th;
            }
        }

        @Override // androidx.room.PooledConnection
        public Object nr(String str, Function1 function1, Continuation continuation) {
            return PooledConnectionImpl.this.nr(str, function1, continuation);
        }

        @Override // androidx.room.coroutines.RawConnectionAccessor
        public SQLiteConnection t() {
            return PooledConnectionImpl.this.t();
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/room/coroutines/PooledConnectionImpl$TransactionItem;", "", "", "id", "", "shouldRollback", "<init>", "(IZ)V", c.f62177j, "I", "()I", "rl", "Z", "()Z", "t", "(Z)V", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class TransactionItem {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final int id;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        private boolean shouldRollback;

        /* JADX INFO: renamed from: n, reason: from getter */
        public final int getId() {
            return this.id;
        }

        /* JADX INFO: renamed from: rl, reason: from getter */
        public final boolean getShouldRollback() {
            return this.shouldRollback;
        }

        public final void t(boolean z2) {
            this.shouldRollback = z2;
        }

        public TransactionItem(int i2, boolean z2) {
            this.id = i2;
            this.shouldRollback = z2;
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

    public PooledConnectionImpl(ConnectionWithLock delegate, boolean z2) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
        this.isReadOnly = z2;
        this.transactionStack = new ArrayDeque();
        this._isRecycled = new AtomicBoolean(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(10:0|2|(2:4|(1:6)(1:7))(0)|8|(1:(1:(1:(1:(1:(2:15|16)(4:17|74|18|70))(2:22|23))(2:24|25))(6:26|72|27|(1:44)|45|(1:65)(1:48)))(1:31))(5:32|(1:34)|35|(1:38)|65)|82|39|(4:42|(0)|45|(0))|65|(2:(0)|(1:77))) */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00aa, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ab, code lost:
    
        r13 = r12;
        r12 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00d6, code lost:
    
        if (r13.gh(false, r0) != r1) goto L70;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b2 A[Catch: all -> 0x00c6, TRY_LEAVE, TryCatch #3 {all -> 0x00c6, blocks: (B:51:0x00ae, B:53:0x00b2), top: B:78:0x00ae }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object ck(Transactor.SQLiteTransactionType sQLiteTransactionType, Function2 function2, Continuation continuation) throws Throwable {
        PooledConnectionImpl$transaction$1 pooledConnectionImpl$transaction$1;
        PooledConnectionImpl pooledConnectionImpl;
        PooledConnectionImpl pooledConnectionImpl2;
        int i2;
        Throwable th;
        boolean z2;
        if (continuation instanceof PooledConnectionImpl$transaction$1) {
            pooledConnectionImpl$transaction$1 = (PooledConnectionImpl$transaction$1) continuation;
            int i3 = pooledConnectionImpl$transaction$1.f41619o;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                pooledConnectionImpl$transaction$1.f41619o = i3 - Integer.MIN_VALUE;
            } else {
                pooledConnectionImpl$transaction$1 = new PooledConnectionImpl$transaction$1(this, continuation);
            }
        }
        Object objInvoke = pooledConnectionImpl$transaction$1.J2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i5 = pooledConnectionImpl$transaction$1.f41619o;
        ConnectionPool.RollbackException rollbackException = null;
        if (i5 == 0) {
            ResultKt.throwOnFailure(objInvoke);
            if (sQLiteTransactionType == null) {
                sQLiteTransactionType = Transactor.SQLiteTransactionType.f41454n;
            }
            pooledConnectionImpl$transaction$1.f41618n = this;
            pooledConnectionImpl$transaction$1.f41621t = function2;
            pooledConnectionImpl$transaction$1.f41619o = 1;
            if (mUb(sQLiteTransactionType, pooledConnectionImpl$transaction$1) != coroutine_suspended) {
                pooledConnectionImpl = this;
            }
        }
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 == 3) {
                    Object obj = pooledConnectionImpl$transaction$1.f41618n;
                    ResultKt.throwOnFailure(objInvoke);
                    return obj;
                }
                if (i5 == 4) {
                    Object obj2 = pooledConnectionImpl$transaction$1.f41618n;
                    ResultKt.throwOnFailure(objInvoke);
                    return obj2;
                }
                if (i5 != 5) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                th = (Throwable) pooledConnectionImpl$transaction$1.f41621t;
                th = (Throwable) pooledConnectionImpl$transaction$1.f41618n;
                try {
                    ResultKt.throwOnFailure(objInvoke);
                } catch (SQLException e2) {
                    e = e2;
                    if (th != null) {
                        throw e;
                    }
                    ExceptionsKt.addSuppressed(th, e);
                }
                throw th;
            }
            i2 = pooledConnectionImpl$transaction$1.f41617O;
            pooledConnectionImpl2 = (PooledConnectionImpl) pooledConnectionImpl$transaction$1.f41618n;
            try {
                ResultKt.throwOnFailure(objInvoke);
                z2 = i2 != 0;
                pooledConnectionImpl$transaction$1.f41618n = objInvoke;
                pooledConnectionImpl$transaction$1.f41619o = 3;
            } catch (Throwable th2) {
                ConnectionPool.RollbackException th3 = th2;
                try {
                    if (th3 instanceof ConnectionPool.RollbackException) {
                        try {
                            throw th3;
                        } catch (Throwable th4) {
                            rollbackException = th3;
                            th = th4;
                            pooledConnectionImpl$transaction$1.f41618n = rollbackException;
                            pooledConnectionImpl$transaction$1.f41621t = th;
                            pooledConnectionImpl$transaction$1.f41619o = 5;
                        }
                    } else {
                        Object result = th3.getResult();
                        pooledConnectionImpl$transaction$1.f41618n = result;
                        pooledConnectionImpl$transaction$1.f41621t = null;
                        pooledConnectionImpl$transaction$1.f41619o = 4;
                        if (pooledConnectionImpl2.gh(false, pooledConnectionImpl$transaction$1) != coroutine_suspended) {
                            return result;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
                try {
                    pooledConnectionImpl$transaction$1.f41618n = rollbackException;
                    pooledConnectionImpl$transaction$1.f41621t = th;
                    pooledConnectionImpl$transaction$1.f41619o = 5;
                } catch (SQLException e3) {
                    e = e3;
                    th = rollbackException;
                    if (th != null) {
                    }
                }
            }
            return pooledConnectionImpl2.gh(z2, pooledConnectionImpl$transaction$1) != coroutine_suspended ? coroutine_suspended : objInvoke;
        }
        function2 = (Function2) pooledConnectionImpl$transaction$1.f41621t;
        pooledConnectionImpl = (PooledConnectionImpl) pooledConnectionImpl$transaction$1.f41618n;
        ResultKt.throwOnFailure(objInvoke);
        TransactionImpl transactionImpl = pooledConnectionImpl.new TransactionImpl();
        pooledConnectionImpl$transaction$1.f41618n = pooledConnectionImpl;
        pooledConnectionImpl$transaction$1.f41621t = null;
        pooledConnectionImpl$transaction$1.f41617O = 1;
        pooledConnectionImpl$transaction$1.f41619o = 2;
        objInvoke = function2.invoke(transactionImpl, pooledConnectionImpl$transaction$1);
        if (objInvoke != coroutine_suspended) {
            pooledConnectionImpl2 = pooledConnectionImpl;
            i2 = 1;
            if (i2 != 0) {
            }
            pooledConnectionImpl$transaction$1.f41618n = objInvoke;
            pooledConnectionImpl$transaction$1.f41619o = 3;
            if (pooledConnectionImpl2.gh(z2, pooledConnectionImpl$transaction$1) != coroutine_suspended) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object gh(boolean z2, Continuation continuation) {
        PooledConnectionImpl$endTransaction$1 pooledConnectionImpl$endTransaction$1;
        PooledConnectionImpl pooledConnectionImpl;
        yB.j jVar;
        if (continuation instanceof PooledConnectionImpl$endTransaction$1) {
            pooledConnectionImpl$endTransaction$1 = (PooledConnectionImpl$endTransaction$1) continuation;
            int i2 = pooledConnectionImpl$endTransaction$1.f41614o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pooledConnectionImpl$endTransaction$1.f41614o = i2 - Integer.MIN_VALUE;
            } else {
                pooledConnectionImpl$endTransaction$1 = new PooledConnectionImpl$endTransaction$1(this, continuation);
            }
        }
        Object obj = pooledConnectionImpl$endTransaction$1.J2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = pooledConnectionImpl$endTransaction$1.f41614o;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            ConnectionWithLock connectionWithLock = this.delegate;
            pooledConnectionImpl$endTransaction$1.f41613n = this;
            pooledConnectionImpl$endTransaction$1.f41616t = connectionWithLock;
            pooledConnectionImpl$endTransaction$1.f41612O = z2;
            pooledConnectionImpl$endTransaction$1.f41614o = 1;
            if (connectionWithLock.Z(null, pooledConnectionImpl$endTransaction$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            pooledConnectionImpl = this;
            jVar = connectionWithLock;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z2 = pooledConnectionImpl$endTransaction$1.f41612O;
            jVar = (yB.j) pooledConnectionImpl$endTransaction$1.f41616t;
            pooledConnectionImpl = (PooledConnectionImpl) pooledConnectionImpl$endTransaction$1.f41613n;
            ResultKt.throwOnFailure(obj);
        }
        try {
            if (pooledConnectionImpl.transactionStack.isEmpty()) {
                throw new IllegalStateException("Not in a transaction");
            }
            TransactionItem transactionItem = (TransactionItem) CollectionsKt.removeLast(pooledConnectionImpl.transactionStack);
            if (!z2 || transactionItem.getShouldRollback()) {
                if (pooledConnectionImpl.transactionStack.isEmpty()) {
                    SQLite.n(pooledConnectionImpl.delegate, "ROLLBACK TRANSACTION");
                } else {
                    SQLite.n(pooledConnectionImpl.delegate, "ROLLBACK TRANSACTION TO SAVEPOINT '" + transactionItem.getId() + '\'');
                }
            } else if (pooledConnectionImpl.transactionStack.isEmpty()) {
                SQLite.n(pooledConnectionImpl.delegate, "END TRANSACTION");
            } else {
                SQLite.n(pooledConnectionImpl.delegate, "RELEASE SAVEPOINT '" + transactionItem.getId() + '\'');
            }
            Unit unit = Unit.INSTANCE;
            jVar.T(null);
            return unit;
        } catch (Throwable th) {
            jVar.T(null);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mUb(Transactor.SQLiteTransactionType sQLiteTransactionType, Continuation continuation) {
        PooledConnectionImpl$beginTransaction$1 pooledConnectionImpl$beginTransaction$1;
        yB.j jVar;
        PooledConnectionImpl pooledConnectionImpl;
        if (continuation instanceof PooledConnectionImpl$beginTransaction$1) {
            pooledConnectionImpl$beginTransaction$1 = (PooledConnectionImpl$beginTransaction$1) continuation;
            int i2 = pooledConnectionImpl$beginTransaction$1.f41609o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pooledConnectionImpl$beginTransaction$1.f41609o = i2 - Integer.MIN_VALUE;
            } else {
                pooledConnectionImpl$beginTransaction$1 = new PooledConnectionImpl$beginTransaction$1(this, continuation);
            }
        }
        Object obj = pooledConnectionImpl$beginTransaction$1.J2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = pooledConnectionImpl$beginTransaction$1.f41609o;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            jVar = this.delegate;
            pooledConnectionImpl$beginTransaction$1.f41608n = this;
            pooledConnectionImpl$beginTransaction$1.f41611t = sQLiteTransactionType;
            pooledConnectionImpl$beginTransaction$1.f41607O = jVar;
            pooledConnectionImpl$beginTransaction$1.f41609o = 1;
            if (jVar.Z(null, pooledConnectionImpl$beginTransaction$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            pooledConnectionImpl = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yB.j jVar2 = (yB.j) pooledConnectionImpl$beginTransaction$1.f41607O;
            Transactor.SQLiteTransactionType sQLiteTransactionType2 = (Transactor.SQLiteTransactionType) pooledConnectionImpl$beginTransaction$1.f41611t;
            pooledConnectionImpl = (PooledConnectionImpl) pooledConnectionImpl$beginTransaction$1.f41608n;
            ResultKt.throwOnFailure(obj);
            jVar = jVar2;
            sQLiteTransactionType = sQLiteTransactionType2;
        }
        try {
            int size = pooledConnectionImpl.transactionStack.size();
            if (pooledConnectionImpl.transactionStack.isEmpty()) {
                int i5 = WhenMappings.$EnumSwitchMapping$0[sQLiteTransactionType.ordinal()];
                if (i5 == 1) {
                    SQLite.n(pooledConnectionImpl.delegate, "BEGIN DEFERRED TRANSACTION");
                } else if (i5 == 2) {
                    SQLite.n(pooledConnectionImpl.delegate, "BEGIN IMMEDIATE TRANSACTION");
                } else {
                    if (i5 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    SQLite.n(pooledConnectionImpl.delegate, "BEGIN EXCLUSIVE TRANSACTION");
                }
            } else {
                SQLite.n(pooledConnectionImpl.delegate, "SAVEPOINT '" + size + '\'');
            }
            pooledConnectionImpl.transactionStack.addLast(new TransactionItem(size, false));
            Unit unit = Unit.INSTANCE;
            jVar.T(null);
            return unit;
        } catch (Throwable th) {
            jVar.T(null);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean ty() {
        return this._isRecycled.get();
    }

    public final void HI() {
        if (this._isRecycled.compareAndSet(false, true)) {
            try {
                SQLite.n(this.delegate, "ROLLBACK TRANSACTION");
            } catch (SQLException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: az, reason: from getter */
    public final boolean getIsReadOnly() {
        return this.isReadOnly;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.room.PooledConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object nr(String str, Function1 function1, Continuation continuation) {
        PooledConnectionImpl$usePrepared$1 pooledConnectionImpl$usePrepared$1;
        yB.j jVar;
        PooledConnectionImpl pooledConnectionImpl;
        if (continuation instanceof PooledConnectionImpl$usePrepared$1) {
            pooledConnectionImpl$usePrepared$1 = (PooledConnectionImpl$usePrepared$1) continuation;
            int i2 = pooledConnectionImpl$usePrepared$1.f41623Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pooledConnectionImpl$usePrepared$1.f41623Z = i2 - Integer.MIN_VALUE;
            } else {
                pooledConnectionImpl$usePrepared$1 = new PooledConnectionImpl$usePrepared$1(this, continuation);
            }
        }
        Object obj = pooledConnectionImpl$usePrepared$1.f41626r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = pooledConnectionImpl$usePrepared$1.f41623Z;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            if (ty()) {
                SQLite.rl(21, "Connection is recycled");
                throw new KotlinNothingValueException();
            }
            ConnectionElement connectionElement = (ConnectionElement) pooledConnectionImpl$usePrepared$1.get$context().get(ConnectionElement.INSTANCE);
            if (connectionElement == null || connectionElement.getConnectionWrapper() != this) {
                SQLite.rl(21, "Attempted to use connection on a different coroutine");
                throw new KotlinNothingValueException();
            }
            jVar = this.delegate;
            pooledConnectionImpl$usePrepared$1.f41624n = this;
            pooledConnectionImpl$usePrepared$1.f41627t = str;
            pooledConnectionImpl$usePrepared$1.f41622O = function1;
            pooledConnectionImpl$usePrepared$1.J2 = jVar;
            pooledConnectionImpl$usePrepared$1.f41623Z = 1;
            if (jVar.Z(null, pooledConnectionImpl$usePrepared$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            pooledConnectionImpl = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yB.j jVar2 = (yB.j) pooledConnectionImpl$usePrepared$1.J2;
            function1 = (Function1) pooledConnectionImpl$usePrepared$1.f41622O;
            String str2 = (String) pooledConnectionImpl$usePrepared$1.f41627t;
            pooledConnectionImpl = (PooledConnectionImpl) pooledConnectionImpl$usePrepared$1.f41624n;
            ResultKt.throwOnFailure(obj);
            jVar = jVar2;
            str = str2;
        }
        try {
            StatementWrapper statementWrapper = new StatementWrapper(pooledConnectionImpl, pooledConnectionImpl.delegate.mI(str));
            try {
                Object objInvoke = function1.invoke(statementWrapper);
                AutoCloseableKt.closeFinally(statementWrapper, null);
                return objInvoke;
            } finally {
            }
        } finally {
            jVar.T(null);
        }
    }

    /* JADX INFO: renamed from: qie, reason: from getter */
    public final ConnectionWithLock getDelegate() {
        return this.delegate;
    }

    @Override // androidx.room.coroutines.RawConnectionAccessor
    public SQLiteConnection t() {
        return this.delegate;
    }

    @Override // androidx.room.Transactor
    public Object n(Transactor.SQLiteTransactionType sQLiteTransactionType, Function2 function2, Continuation continuation) {
        if (!ty()) {
            ConnectionElement connectionElement = (ConnectionElement) continuation.get$context().get(ConnectionElement.INSTANCE);
            if (connectionElement != null && connectionElement.getConnectionWrapper() == this) {
                return ck(sQLiteTransactionType, function2, continuation);
            }
            SQLite.rl(21, "Attempted to use connection on a different coroutine");
            throw new KotlinNothingValueException();
        }
        SQLite.rl(21, "Connection is recycled");
        throw new KotlinNothingValueException();
    }

    @Override // androidx.room.Transactor
    public Object rl(Continuation continuation) {
        if (!ty()) {
            ConnectionElement connectionElement = (ConnectionElement) continuation.get$context().get(ConnectionElement.INSTANCE);
            if (connectionElement != null && connectionElement.getConnectionWrapper() == this) {
                return Boxing.boxBoolean(!this.transactionStack.isEmpty());
            }
            SQLite.rl(21, "Attempted to use connection on a different coroutine");
            throw new KotlinNothingValueException();
        }
        SQLite.rl(21, "Connection is recycled");
        throw new KotlinNothingValueException();
    }
}
