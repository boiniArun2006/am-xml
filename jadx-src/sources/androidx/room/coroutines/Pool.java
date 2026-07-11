package androidx.room.coroutines;

import GJW.Qik;
import androidx.collection.CircularArray;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.TimeoutCancellationException;
import yB.fuX;
import yB.o;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ&\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\u0004H\u0086@¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000fH\u0086@¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u000bJ\u0019\u0010\u001b\u001a\u00020\t2\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010 \u001a\u0004\b!\u0010\"R\u0018\u0010&\u001a\u00060#j\u0002`$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010%R\u0016\u0010'\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001dR\u0016\u0010*\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010)R\u001c\u0010-\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010,R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u000f028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00066"}, d2 = {"Landroidx/room/coroutines/Pool;", "", "", "capacity", "Lkotlin/Function0;", "Landroidx/sqlite/SQLiteConnection;", "connectionFactory", "<init>", "(ILkotlin/jvm/functions/Function0;)V", "", "J2", "()V", "Lkotlin/time/Duration;", "timeout", "onTimeout", "Landroidx/room/coroutines/ConnectionWithLock;", "rl", "(JLkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", c.f62177j, "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "connection", "O", "(Landroidx/room/coroutines/ConnectionWithLock;)V", "t", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "builder", "nr", "(Ljava/lang/StringBuilder;)V", "I", "getCapacity", "()I", "Lkotlin/jvm/functions/Function0;", "getConnectionFactory", "()Lkotlin/jvm/functions/Function0;", "Ljava/util/concurrent/locks/ReentrantLock;", "Landroidx/room/concurrent/ReentrantLock;", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "size", "", "Z", "isClosed", "", "[Landroidx/room/coroutines/ConnectionWithLock;", "connections", "LyB/fuX;", "Uo", "LyB/fuX;", "connectionPermits", "Landroidx/collection/CircularArray;", "KN", "Landroidx/collection/CircularArray;", "availableConnections", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nConnectionPoolImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConnectionPoolImpl.kt\nandroidx/room/coroutines/Pool\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ReentrantLock.kt\nandroidx/room/concurrent/ReentrantLockKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,556:1\n1#2:557\n28#3,5:558\n28#3,5:563\n28#3,3:568\n32#3:573\n28#3,3:574\n32#3:580\n13402#4,2:571\n13467#4,3:577\n*S KotlinDebug\n*F\n+ 1 ConnectionPoolImpl.kt\nandroidx/room/coroutines/Pool\n*L\n233#1:558,5\n259#1:563,5\n264#1:568,3\n264#1:573\n272#1:574,3\n272#1:580\n266#1:571,2\n285#1:577,3\n*E\n"})
final class Pool {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final ConnectionWithLock[] connections;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final CircularArray availableConnections;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private boolean isClosed;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final fuX connectionPermits;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int capacity;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private int size;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final Function0 connectionFactory;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final ReentrantLock lock;

    public final void t() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.isClosed = true;
            for (ConnectionWithLock connectionWithLock : this.connections) {
                if (connectionWithLock != null) {
                    connectionWithLock.close();
                }
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public Pool(int i2, Function0 connectionFactory) {
        Intrinsics.checkNotNullParameter(connectionFactory, "connectionFactory");
        this.capacity = i2;
        this.connectionFactory = connectionFactory;
        this.lock = new ReentrantLock();
        this.connections = new ConnectionWithLock[i2];
        this.connectionPermits = o.rl(i2, 0, 2, null);
        this.availableConnections = new CircularArray(i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void J2() {
        if (this.size >= this.capacity) {
            return;
        }
        ConnectionWithLock connectionWithLock = new ConnectionWithLock((SQLiteConnection) this.connectionFactory.invoke(), null, 2, 0 == true ? 1 : 0);
        ConnectionWithLock[] connectionWithLockArr = this.connections;
        int i2 = this.size;
        this.size = i2 + 1;
        connectionWithLockArr[i2] = connectionWithLock;
        this.availableConnections.n(connectionWithLock);
    }

    public final void O(ConnectionWithLock connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            this.availableConnections.n(connection);
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            this.connectionPermits.release();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(Continuation continuation) {
        Pool$acquire$1 pool$acquire$1;
        Pool pool;
        if (continuation instanceof Pool$acquire$1) {
            pool$acquire$1 = (Pool$acquire$1) continuation;
            int i2 = pool$acquire$1.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pool$acquire$1.J2 = i2 - Integer.MIN_VALUE;
            } else {
                pool$acquire$1 = new Pool$acquire$1(this, continuation);
            }
        }
        Object obj = pool$acquire$1.f41585t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = pool$acquire$1.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            fuX fux = this.connectionPermits;
            pool$acquire$1.f41584n = this;
            pool$acquire$1.J2 = 1;
            if (fux.t(pool$acquire$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
            pool = this;
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            pool = (Pool) pool$acquire$1.f41584n;
            ResultKt.throwOnFailure(obj);
        }
        try {
            ReentrantLock reentrantLock = pool.lock;
            reentrantLock.lock();
            try {
                if (pool.isClosed) {
                    SQLite.rl(21, "Connection pool is closed");
                    throw new KotlinNothingValueException();
                }
                if (pool.availableConnections.nr()) {
                    pool.J2();
                }
                ConnectionWithLock connectionWithLock = (ConnectionWithLock) pool.availableConnections.O();
                reentrantLock.unlock();
                return connectionWithLock;
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        } catch (Throwable th2) {
            pool.connectionPermits.release();
            throw th2;
        }
    }

    public final void nr(StringBuilder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            List listCreateListBuilder = CollectionsKt.createListBuilder();
            int iJ2 = this.availableConnections.J2();
            for (int i2 = 0; i2 < iJ2; i2++) {
                listCreateListBuilder.add(this.availableConnections.t(i2));
            }
            List listBuild = CollectionsKt.build(listCreateListBuilder);
            builder.append('\t' + super.toString() + " (");
            builder.append("capacity=" + this.capacity + ", ");
            builder.append("permits=" + this.connectionPermits.n() + ", ");
            builder.append("queue=(size=" + listBuild.size() + ")[" + CollectionsKt.joinToString$default(listBuild, null, null, null, 0, null, null, 63, null) + "], ");
            builder.append(")");
            builder.append('\n');
            ConnectionWithLock[] connectionWithLockArr = this.connections;
            int length = connectionWithLockArr.length;
            int i3 = 0;
            for (int i5 = 0; i5 < length; i5++) {
                ConnectionWithLock connectionWithLock = connectionWithLockArr[i5];
                i3++;
                StringBuilder sb = new StringBuilder();
                sb.append("\t\t[");
                sb.append(i3);
                sb.append("] - ");
                sb.append(connectionWithLock != null ? connectionWithLock.toString() : null);
                builder.append(sb.toString());
                builder.append('\n');
                if (connectionWithLock != null) {
                    connectionWithLock.n(builder);
                }
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:14|49|47|28|(0)(0)|37|19|43|20|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0068, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        r12 = r12;
        r11 = r11;
        r2 = r0;
        r0 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076 A[Catch: all -> 0x007a, TryCatch #2 {all -> 0x007a, blocks: (B:28:0x0072, B:30:0x0076, B:34:0x007e, B:38:0x0085), top: B:47:0x0072 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0061 -> B:24:0x0063). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object rl(long j2, Function0 function0, Continuation continuation) {
        Pool$acquireWithTimeout$1 pool$acquireWithTimeout$1;
        Pool pool;
        Ref.ObjectRef objectRef;
        Pool$acquireWithTimeout$1 pool$acquireWithTimeout$12;
        Throwable th;
        Pool$acquireWithTimeout$2 pool$acquireWithTimeout$2;
        if (continuation instanceof Pool$acquireWithTimeout$1) {
            pool$acquireWithTimeout$1 = (Pool$acquireWithTimeout$1) continuation;
            int i2 = pool$acquireWithTimeout$1.f41587Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pool$acquireWithTimeout$1.f41587Z = i2 - Integer.MIN_VALUE;
            } else {
                pool$acquireWithTimeout$1 = new Pool$acquireWithTimeout$1(this, continuation);
            }
        }
        Object obj = pool$acquireWithTimeout$1.f41590r;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = pool$acquireWithTimeout$1.f41587Z;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            pool = this;
            Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
            pool$acquireWithTimeout$2 = new Pool$acquireWithTimeout$2(objectRef2, pool, null);
            pool$acquireWithTimeout$1.f41588n = pool;
            pool$acquireWithTimeout$1.f41591t = function0;
            pool$acquireWithTimeout$1.f41586O = objectRef2;
            pool$acquireWithTimeout$1.J2 = j2;
            pool$acquireWithTimeout$1.f41587Z = 1;
            if (Qik.nr(j2, pool$acquireWithTimeout$2, pool$acquireWithTimeout$1) != coroutine_suspended) {
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j2 = pool$acquireWithTimeout$1.J2;
            Ref.ObjectRef objectRef3 = (Ref.ObjectRef) pool$acquireWithTimeout$1.f41586O;
            Function0 function02 = (Function0) pool$acquireWithTimeout$1.f41591t;
            pool = (Pool) pool$acquireWithTimeout$1.f41588n;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th2) {
                objectRef = objectRef3;
                function0 = function02;
                pool$acquireWithTimeout$12 = pool$acquireWithTimeout$1;
                th = th2;
                if (th instanceof TimeoutCancellationException) {
                }
                pool$acquireWithTimeout$1 = pool$acquireWithTimeout$12;
                Ref.ObjectRef objectRef22 = new Ref.ObjectRef();
                pool$acquireWithTimeout$2 = new Pool$acquireWithTimeout$2(objectRef22, pool, null);
                pool$acquireWithTimeout$1.f41588n = pool;
                pool$acquireWithTimeout$1.f41591t = function0;
                pool$acquireWithTimeout$1.f41586O = objectRef22;
                pool$acquireWithTimeout$1.J2 = j2;
                pool$acquireWithTimeout$1.f41587Z = 1;
                if (Qik.nr(j2, pool$acquireWithTimeout$2, pool$acquireWithTimeout$1) != coroutine_suspended) {
                }
            }
            objectRef = objectRef3;
            function0 = function02;
            pool$acquireWithTimeout$12 = pool$acquireWithTimeout$1;
            th = null;
            try {
                if (th instanceof TimeoutCancellationException) {
                    function0.invoke();
                } else {
                    if (th != null) {
                        throw th;
                    }
                    T t3 = objectRef.element;
                    if (t3 != 0) {
                        return t3;
                    }
                }
                pool$acquireWithTimeout$1 = pool$acquireWithTimeout$12;
                Ref.ObjectRef objectRef222 = new Ref.ObjectRef();
                pool$acquireWithTimeout$2 = new Pool$acquireWithTimeout$2(objectRef222, pool, null);
                pool$acquireWithTimeout$1.f41588n = pool;
                pool$acquireWithTimeout$1.f41591t = function0;
                pool$acquireWithTimeout$1.f41586O = objectRef222;
                pool$acquireWithTimeout$1.J2 = j2;
                pool$acquireWithTimeout$1.f41587Z = 1;
                if (Qik.nr(j2, pool$acquireWithTimeout$2, pool$acquireWithTimeout$1) != coroutine_suspended) {
                    return coroutine_suspended;
                }
                function02 = function0;
                objectRef3 = objectRef222;
                objectRef = objectRef3;
                function0 = function02;
                pool$acquireWithTimeout$12 = pool$acquireWithTimeout$1;
                th = null;
                if (th instanceof TimeoutCancellationException) {
                }
                pool$acquireWithTimeout$1 = pool$acquireWithTimeout$12;
                Ref.ObjectRef objectRef2222 = new Ref.ObjectRef();
                pool$acquireWithTimeout$2 = new Pool$acquireWithTimeout$2(objectRef2222, pool, null);
                pool$acquireWithTimeout$1.f41588n = pool;
                pool$acquireWithTimeout$1.f41591t = function0;
                pool$acquireWithTimeout$1.f41586O = objectRef2222;
                pool$acquireWithTimeout$1.J2 = j2;
                pool$acquireWithTimeout$1.f41587Z = 1;
                if (Qik.nr(j2, pool$acquireWithTimeout$2, pool$acquireWithTimeout$1) != coroutine_suspended) {
                }
            } catch (Throwable th3) {
                ConnectionWithLock connectionWithLock = (ConnectionWithLock) objectRef.element;
                if (connectionWithLock != null) {
                    pool.O(connectionWithLock);
                }
                throw th3;
            }
        }
    }
}
