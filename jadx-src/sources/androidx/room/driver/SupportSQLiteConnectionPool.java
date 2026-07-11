package androidx.room.driver;

import androidx.room.coroutines.ConnectionPool;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JB\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u0006\u0010\b\u001a\u00020\u00072\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\tH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u001a"}, d2 = {"Landroidx/room/driver/SupportSQLiteConnectionPool;", "Landroidx/room/coroutines/ConnectionPool;", "Landroidx/room/driver/SupportSQLiteDriver;", "supportDriver", "<init>", "(Landroidx/room/driver/SupportSQLiteDriver;)V", "R", "", "isReadOnly", "Lkotlin/Function2;", "Landroidx/room/Transactor;", "Lkotlin/coroutines/Continuation;", "", "block", "ViF", "(ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", MRAIDPresenter.CLOSE, "()V", c.f62177j, "Landroidx/room/driver/SupportSQLiteDriver;", "rl", "()Landroidx/room/driver/SupportSQLiteDriver;", "Landroidx/room/driver/SupportSQLitePooledConnection;", "()Landroidx/room/driver/SupportSQLitePooledConnection;", "supportConnection", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SupportSQLiteConnectionPool implements ConnectionPool {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final SupportSQLiteDriver supportDriver;

    public SupportSQLiteConnectionPool(SupportSQLiteDriver supportDriver) {
        Intrinsics.checkNotNullParameter(supportDriver, "supportDriver");
        this.supportDriver = supportDriver;
    }

    private final SupportSQLitePooledConnection n() {
        String str = this.supportDriver.getOpenHelper().getCom.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME java.lang.String();
        if (str == null) {
            str = ":memory:";
        }
        return new SupportSQLitePooledConnection(this.supportDriver.n(str));
    }

    @Override // androidx.room.coroutines.ConnectionPool, java.lang.AutoCloseable
    public void close() {
        this.supportDriver.getOpenHelper().close();
    }

    /* JADX INFO: renamed from: rl, reason: from getter */
    public final SupportSQLiteDriver getSupportDriver() {
        return this.supportDriver;
    }

    @Override // androidx.room.coroutines.ConnectionPool
    public Object ViF(boolean z2, Function2 function2, Continuation continuation) {
        return function2.invoke(n(), continuation);
    }
}
