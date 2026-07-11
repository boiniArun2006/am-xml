package androidx.room.coroutines;

import GJW.Dsr;
import android.database.SQLException;
import androidx.room.concurrent.ThreadLocal_jvmAndroidKt;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteDriver;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B)\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015JB\u0010\u001c\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00162\u0006\u0010\u0012\u001a\u00020\u00112\"\u0010\u001b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0017H\u0096@¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010$R$\u0010,\u001a\u0012\u0012\u0004\u0012\u00020\f0(j\b\u0012\u0004\u0012\u00020\f`)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u00101\u001a\u00060-j\u0002`.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\"\u00109\u001a\u0002028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010>\u001a\u00020\u00118\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b:\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010\u0015R\u0014\u0010?\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b?\u0010<¨\u0006@"}, d2 = {"Landroidx/room/coroutines/ConnectionPoolImpl;", "Landroidx/room/coroutines/ConnectionPool;", "Landroidx/sqlite/SQLiteDriver;", "driver", "", "fileName", "<init>", "(Landroidx/sqlite/SQLiteDriver;Ljava/lang/String;)V", "", "maxNumOfReaders", "maxNumOfWriters", "(Landroidx/sqlite/SQLiteDriver;Ljava/lang/String;II)V", "Landroidx/room/coroutines/PooledConnectionImpl;", "connection", "Lkotlin/coroutines/CoroutineContext;", "M7", "(Landroidx/room/coroutines/PooledConnectionImpl;)Lkotlin/coroutines/CoroutineContext;", "", "isReadOnly", "", "p5", "(Z)V", "R", "Lkotlin/Function2;", "Landroidx/room/Transactor;", "Lkotlin/coroutines/Continuation;", "", "block", "ViF", "(ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", MRAIDPresenter.CLOSE, "()V", c.f62177j, "Landroidx/sqlite/SQLiteDriver;", "Landroidx/room/coroutines/Pool;", "t", "Landroidx/room/coroutines/Pool;", "readers", "O", "writers", "Ljava/lang/ThreadLocal;", "Landroidx/room/concurrent/ThreadLocal;", "J2", "Ljava/lang/ThreadLocal;", "threadLocal", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Landroidx/room/concurrent/AtomicBoolean;", "r", "Ljava/util/concurrent/atomic/AtomicBoolean;", "_isClosed", "Lkotlin/time/Duration;", "o", "J", "getTimeout-UwyO8pc$room_runtime_release", "()J", "setTimeout-LRDsOJo$room_runtime_release", "(J)V", "timeout", "Z", "getThrowOnTimeout$room_runtime_release", "()Z", "setThrowOnTimeout$room_runtime_release", "throwOnTimeout", "isClosed", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nConnectionPoolImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConnectionPoolImpl.kt\nandroidx/room/coroutines/ConnectionPoolImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,556:1\n1#2:557\n*E\n"})
public final class ConnectionPoolImpl implements ConnectionPool {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final ThreadLocal threadLocal;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final Pool writers;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private boolean throwOnTimeout;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final SQLiteDriver driver;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private long timeout;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean _isClosed;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Pool readers;

    public ConnectionPoolImpl(final SQLiteDriver driver, final String fileName) {
        Intrinsics.checkNotNullParameter(driver, "driver");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        this.threadLocal = new ThreadLocal();
        this._isClosed = new AtomicBoolean(false);
        Duration.Companion companion = Duration.INSTANCE;
        this.timeout = DurationKt.toDuration(30, DurationUnit.SECONDS);
        this.driver = driver;
        Pool pool = new Pool(1, new Function0() { // from class: androidx.room.coroutines.I28
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ConnectionPoolImpl.T(driver, fileName);
            }
        });
        this.readers = pool;
        this.writers = pool;
    }

    private final CoroutineContext M7(PooledConnectionImpl connection) {
        return new ConnectionElement(connection).plus(ThreadLocal_jvmAndroidKt.n(this.threadLocal, connection));
    }

    private final boolean isClosed() {
        return this._isClosed.get();
    }

    private final void p5(boolean isReadOnly) {
        String str = isReadOnly ? "reader" : "writer";
        StringBuilder sb = new StringBuilder();
        sb.append("Timed out attempting to acquire a " + str + " connection.");
        sb.append('\n');
        sb.append('\n');
        sb.append("Writer pool:");
        sb.append('\n');
        this.writers.nr(sb);
        sb.append("Reader pool:");
        sb.append('\n');
        this.readers.nr(sb);
        try {
            SQLite.rl(5, sb.toString());
            throw new KotlinNothingValueException();
        } catch (SQLException e2) {
            if (this.throwOnTimeout) {
                throw e2;
            }
            e2.printStackTrace();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013d A[Catch: all -> 0x0177, TRY_LEAVE, TryCatch #3 {all -> 0x0177, blocks: (B:64:0x0123, B:68:0x0132, B:70:0x013d, B:80:0x017b, B:81:0x0182), top: B:103:0x0123 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0165 A[Catch: all -> 0x0176, TRY_LEAVE, TryCatch #2 {all -> 0x0176, blocks: (B:74:0x015f, B:76:0x0165), top: B:101:0x015f }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x017b A[Catch: all -> 0x0177, TRY_ENTER, TryCatch #3 {all -> 0x0177, blocks: (B:64:0x0123, B:68:0x0132, B:70:0x013d, B:80:0x017b, B:81:0x0182), top: B:103:0x0123 }] */
    /* JADX WARN: Type inference failed for: r0v14, types: [T, androidx.room.coroutines.PooledConnectionImpl] */
    @Override // androidx.room.coroutines.ConnectionPool
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object ViF(boolean z2, Function2 function2, Continuation continuation) {
        ConnectionPoolImpl$useConnection$1 connectionPoolImpl$useConnection$1;
        Ref.ObjectRef objectRef;
        Throwable th;
        Pool pool;
        Pool pool2;
        CoroutineContext coroutineContext;
        ConnectionPoolImpl connectionPoolImpl;
        Function2 function22;
        Ref.ObjectRef objectRef2;
        T t3;
        Ref.ObjectRef objectRef3;
        PooledConnectionImpl pooledConnectionImpl;
        final boolean z3 = z2;
        if (continuation instanceof ConnectionPoolImpl$useConnection$1) {
            connectionPoolImpl$useConnection$1 = (ConnectionPoolImpl$useConnection$1) continuation;
            int i2 = connectionPoolImpl$useConnection$1.E2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                connectionPoolImpl$useConnection$1.E2 = i2 - Integer.MIN_VALUE;
            } else {
                connectionPoolImpl$useConnection$1 = new ConnectionPoolImpl$useConnection$1(this, continuation);
            }
        }
        Object objUo = connectionPoolImpl$useConnection$1.f41551S;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = connectionPoolImpl$useConnection$1.E2;
        boolean z4 = false;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objUo);
            if (isClosed()) {
                SQLite.rl(21, "Connection pool is closed");
                throw new KotlinNothingValueException();
            }
            PooledConnectionImpl connectionWrapper = (PooledConnectionImpl) this.threadLocal.get();
            if (connectionWrapper == null) {
                ConnectionElement connectionElement = (ConnectionElement) connectionPoolImpl$useConnection$1.getContext().get(ConnectionElement.INSTANCE);
                connectionWrapper = connectionElement != null ? connectionElement.getConnectionWrapper() : null;
            }
            if (connectionWrapper == null) {
                Pool pool3 = z3 ? this.readers : this.writers;
                objectRef = new Ref.ObjectRef();
                try {
                    CoroutineContext context = connectionPoolImpl$useConnection$1.getContext();
                    long j2 = this.timeout;
                    Function0 function0 = new Function0() { // from class: androidx.room.coroutines.n
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ConnectionPoolImpl.eF(this.f41637n, z3);
                        }
                    };
                    connectionPoolImpl$useConnection$1.f41554n = this;
                    connectionPoolImpl$useConnection$1.f41557t = function2;
                    connectionPoolImpl$useConnection$1.f41550O = pool3;
                    connectionPoolImpl$useConnection$1.J2 = objectRef;
                    connectionPoolImpl$useConnection$1.f41556r = context;
                    connectionPoolImpl$useConnection$1.f41555o = objectRef;
                    connectionPoolImpl$useConnection$1.f41552Z = z3;
                    connectionPoolImpl$useConnection$1.E2 = 3;
                    Object objRl = pool3.rl(j2, function0, connectionPoolImpl$useConnection$1);
                    if (objRl != coroutine_suspended) {
                        pool2 = pool3;
                        objUo = objRl;
                        coroutineContext = context;
                        connectionPoolImpl = this;
                        function22 = function2;
                        objectRef2 = objectRef;
                        ConnectionWithLock connectionWithLockJB = ((ConnectionWithLock) objUo).jB(coroutineContext);
                        if (connectionPoolImpl.readers != connectionPoolImpl.writers) {
                            z4 = true;
                        }
                        objectRef2.element = new PooledConnectionImpl(connectionWithLockJB, z4);
                        t3 = objectRef.element;
                        if (t3 != 0) {
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    pool = pool3;
                }
            } else {
                if (!z3 && connectionWrapper.getIsReadOnly()) {
                    SQLite.rl(1, "Cannot upgrade connection from reader to writer");
                    throw new KotlinNothingValueException();
                }
                if (connectionPoolImpl$useConnection$1.getContext().get(ConnectionElement.INSTANCE) == null) {
                    CoroutineContext coroutineContextM7 = M7(connectionWrapper);
                    ConnectionPoolImpl$useConnection$2 connectionPoolImpl$useConnection$2 = new ConnectionPoolImpl$useConnection$2(function2, connectionWrapper, null);
                    connectionPoolImpl$useConnection$1.E2 = 1;
                    Object objUo2 = Dsr.Uo(coroutineContextM7, connectionPoolImpl$useConnection$2, connectionPoolImpl$useConnection$1);
                    if (objUo2 != coroutine_suspended) {
                        return objUo2;
                    }
                } else {
                    connectionPoolImpl$useConnection$1.E2 = 2;
                    Object objInvoke = function2.invoke(connectionWrapper, connectionPoolImpl$useConnection$1);
                    if (objInvoke != coroutine_suspended) {
                        return objInvoke;
                    }
                }
            }
            return coroutine_suspended;
        }
        if (i3 == 1) {
            ResultKt.throwOnFailure(objUo);
            return objUo;
        }
        if (i3 == 2) {
            ResultKt.throwOnFailure(objUo);
            return objUo;
        }
        if (i3 == 3) {
            z3 = connectionPoolImpl$useConnection$1.f41552Z;
            objectRef2 = (Ref.ObjectRef) connectionPoolImpl$useConnection$1.f41555o;
            CoroutineContext coroutineContext2 = (CoroutineContext) connectionPoolImpl$useConnection$1.f41556r;
            Ref.ObjectRef objectRef4 = (Ref.ObjectRef) connectionPoolImpl$useConnection$1.J2;
            pool2 = (Pool) connectionPoolImpl$useConnection$1.f41550O;
            function22 = (Function2) connectionPoolImpl$useConnection$1.f41557t;
            connectionPoolImpl = (ConnectionPoolImpl) connectionPoolImpl$useConnection$1.f41554n;
            try {
                ResultKt.throwOnFailure(objUo);
                coroutineContext = coroutineContext2;
                objectRef = objectRef4;
                try {
                    ConnectionWithLock connectionWithLockJB2 = ((ConnectionWithLock) objUo).jB(coroutineContext);
                    if (connectionPoolImpl.readers != connectionPoolImpl.writers && z3) {
                        z4 = true;
                    }
                    objectRef2.element = new PooledConnectionImpl(connectionWithLockJB2, z4);
                    t3 = objectRef.element;
                    if (t3 != 0) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    CoroutineContext coroutineContextM72 = connectionPoolImpl.M7((PooledConnectionImpl) t3);
                    ConnectionPoolImpl$useConnection$4 connectionPoolImpl$useConnection$4 = new ConnectionPoolImpl$useConnection$4(function22, objectRef, null);
                    connectionPoolImpl$useConnection$1.f41554n = pool2;
                    connectionPoolImpl$useConnection$1.f41557t = objectRef;
                    connectionPoolImpl$useConnection$1.f41550O = null;
                    connectionPoolImpl$useConnection$1.J2 = null;
                    connectionPoolImpl$useConnection$1.f41556r = null;
                    connectionPoolImpl$useConnection$1.f41555o = null;
                    connectionPoolImpl$useConnection$1.E2 = 4;
                    objUo = Dsr.Uo(coroutineContextM72, connectionPoolImpl$useConnection$4, connectionPoolImpl$useConnection$1);
                    if (objUo != coroutine_suspended) {
                        objectRef3 = objectRef;
                        pool = pool2;
                        pooledConnectionImpl = (PooledConnectionImpl) objectRef3.element;
                        if (pooledConnectionImpl != null) {
                        }
                        return objUo;
                    }
                    return coroutine_suspended;
                } catch (Throwable th3) {
                    th = th3;
                    pool = pool2;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                objectRef = objectRef4;
                pool = pool2;
                throw th;
            }
        }
        if (i3 != 4) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        objectRef3 = (Ref.ObjectRef) connectionPoolImpl$useConnection$1.f41557t;
        pool = (Pool) connectionPoolImpl$useConnection$1.f41554n;
        try {
            ResultKt.throwOnFailure(objUo);
            try {
                pooledConnectionImpl = (PooledConnectionImpl) objectRef3.element;
                if (pooledConnectionImpl != null) {
                    pooledConnectionImpl.HI();
                    pooledConnectionImpl.getDelegate().U();
                    pool.O(pooledConnectionImpl.getDelegate());
                }
            } catch (Throwable unused) {
            }
            return objUo;
        } catch (Throwable th5) {
            objectRef = objectRef3;
            th = th5;
        }
        try {
            throw th;
        } finally {
        }
    }

    @Override // androidx.room.coroutines.ConnectionPool, java.lang.AutoCloseable
    public void close() {
        if (this._isClosed.compareAndSet(false, true)) {
            this.readers.t();
            this.writers.t();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SQLiteConnection T(SQLiteDriver sQLiteDriver, String str) {
        return sQLiteDriver.n(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SQLiteConnection U(SQLiteDriver sQLiteDriver, String str) {
        return sQLiteDriver.n(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit eF(ConnectionPoolImpl connectionPoolImpl, boolean z2) {
        connectionPoolImpl.p5(z2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SQLiteConnection jB(SQLiteDriver sQLiteDriver, String str) {
        SQLiteConnection sQLiteConnectionN = sQLiteDriver.n(str);
        SQLite.n(sQLiteConnectionN, "PRAGMA query_only = 1");
        return sQLiteConnectionN;
    }

    public ConnectionPoolImpl(final SQLiteDriver driver, final String fileName, int i2, int i3) {
        Intrinsics.checkNotNullParameter(driver, "driver");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        this.threadLocal = new ThreadLocal();
        this._isClosed = new AtomicBoolean(false);
        Duration.Companion companion = Duration.INSTANCE;
        this.timeout = DurationKt.toDuration(30, DurationUnit.SECONDS);
        if (i2 <= 0) {
            throw new IllegalArgumentException("Maximum number of readers must be greater than 0");
        }
        if (i3 > 0) {
            this.driver = driver;
            this.readers = new Pool(i2, new Function0() { // from class: androidx.room.coroutines.w6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ConnectionPoolImpl.jB(driver, fileName);
                }
            });
            this.writers = new Pool(i3, new Function0() { // from class: androidx.room.coroutines.Ml
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ConnectionPoolImpl.U(driver, fileName);
                }
            });
            return;
        }
        throw new IllegalArgumentException("Maximum number of writers must be greater than 0");
    }
}
