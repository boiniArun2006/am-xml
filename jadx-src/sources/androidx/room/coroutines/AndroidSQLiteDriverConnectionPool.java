package androidx.room.coroutines;

import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteDriver;
import androidx.sqlite.driver.AndroidSQLiteConnection;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JB\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\u0006\u0010\n\u001a\u00020\t2\"\u0010\u000f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u000bH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Landroidx/room/coroutines/AndroidSQLiteDriverConnectionPool;", "Landroidx/room/coroutines/ConnectionPool;", "Landroidx/sqlite/SQLiteDriver;", "driver", "", "fileName", "<init>", "(Landroidx/sqlite/SQLiteDriver;Ljava/lang/String;)V", "R", "", "isReadOnly", "Lkotlin/Function2;", "Landroidx/room/Transactor;", "Lkotlin/coroutines/Continuation;", "", "block", "ViF", "(ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", MRAIDPresenter.CLOSE, "()V", c.f62177j, "Landroidx/sqlite/SQLiteDriver;", "t", "Ljava/lang/String;", "Landroidx/room/coroutines/AndroidSQLiteDriverPooledConnection;", "O", "Lkotlin/Lazy;", "Uo", "()Landroidx/room/coroutines/AndroidSQLiteDriverPooledConnection;", "androidConnection", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class AndroidSQLiteDriverConnectionPool implements ConnectionPool {

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final Lazy androidConnection;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final SQLiteDriver driver;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final String fileName;

    public AndroidSQLiteDriverConnectionPool(SQLiteDriver driver, String fileName) {
        Intrinsics.checkNotNullParameter(driver, "driver");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        this.driver = driver;
        this.fileName = fileName;
        this.androidConnection = LazyKt.lazy(new Function0() { // from class: androidx.room.coroutines.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AndroidSQLiteDriverConnectionPool.rl(this.f41636n);
            }
        });
    }

    private final AndroidSQLiteDriverPooledConnection Uo() {
        return (AndroidSQLiteDriverPooledConnection) this.androidConnection.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AndroidSQLiteDriverPooledConnection rl(AndroidSQLiteDriverConnectionPool androidSQLiteDriverConnectionPool) {
        SQLiteConnection sQLiteConnectionN = androidSQLiteDriverConnectionPool.driver.n(androidSQLiteDriverConnectionPool.fileName);
        Intrinsics.checkNotNull(sQLiteConnectionN, "null cannot be cast to non-null type androidx.sqlite.driver.AndroidSQLiteConnection");
        return new AndroidSQLiteDriverPooledConnection((AndroidSQLiteConnection) sQLiteConnectionN);
    }

    @Override // androidx.room.coroutines.ConnectionPool
    public Object ViF(boolean z2, Function2 function2, Continuation continuation) {
        return function2.invoke(Uo(), continuation);
    }

    @Override // androidx.room.coroutines.ConnectionPool, java.lang.AutoCloseable
    public void close() {
        Uo().getDelegate().close();
    }
}
