package androidx.room;

import androidx.room.BaseRoomConnectionManager;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenDelegate;
import androidx.room.coroutines.AndroidSQLiteDriverConnectionPool;
import androidx.room.coroutines.ConnectionPool;
import androidx.room.coroutines.ConnectionPoolKt;
import androidx.room.driver.SupportSQLiteConnection;
import androidx.room.driver.SupportSQLiteConnectionPool;
import androidx.room.driver.SupportSQLiteDriver;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteDriver;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.driver.AndroidSQLiteDriver;
import com.caoccao.javet.node.modules.NodeModuleProcess;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001:\u0002>?B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B%\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u0006\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0011\u001a\u00020\u0002*\u00020\u00022\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f0\bH\u0002¢\u0006\u0004\b\u0011\u0010\u0012JB\u0010\u001b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00132\u0006\u0010\u0015\u001a\u00020\u00142\"\u0010\u001a\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0016H\u0096@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0010¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\f¢\u0006\u0004\b!\u0010\u000eJ\r\u0010\"\u001a\u00020\u0014¢\u0006\u0004\b\"\u0010#R\u001a\u0010(\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\u0005\u001a\u00020\u00048\u0014X\u0094\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R \u00103\u001a\b\u0012\u0004\u0012\u00020.0-8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0018\u0010:\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010=\u001a\u0004\u0018\u00010\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<¨\u0006@"}, d2 = {"Landroidx/room/RoomConnectionManager;", "Landroidx/room/BaseRoomConnectionManager;", "Landroidx/room/DatabaseConfiguration;", "config", "Landroidx/room/RoomOpenDelegate;", "openDelegate", "<init>", "(Landroidx/room/DatabaseConfiguration;Landroidx/room/RoomOpenDelegate;)V", "Lkotlin/Function1;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "supportOpenHelperFactory", "(Landroidx/room/DatabaseConfiguration;Lkotlin/jvm/functions/Function1;)V", "", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "()V", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "onOpen", "N", "(Landroidx/room/DatabaseConfiguration;Lkotlin/jvm/functions/Function1;)Landroidx/room/DatabaseConfiguration;", "R", "", "isReadOnly", "Lkotlin/Function2;", "Landroidx/room/Transactor;", "Lkotlin/coroutines/Continuation;", "", "block", "s7N", "(ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "fileName", "g", "(Ljava/lang/String;)Ljava/lang/String;", "e", "nHg", "()Z", "nr", "Landroidx/room/DatabaseConfiguration;", "HI", "()Landroidx/room/DatabaseConfiguration;", com.safedk.android.utils.j.f63190c, "O", "Landroidx/room/RoomOpenDelegate;", "r", "()Landroidx/room/RoomOpenDelegate;", "", "Landroidx/room/RoomDatabase$Callback;", "J2", "Ljava/util/List;", "ty", "()Ljava/util/List;", "callbacks", "Landroidx/room/coroutines/ConnectionPool;", "Uo", "Landroidx/room/coroutines/ConnectionPool;", "connectionPool", "KN", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "supportDatabase", "X", "()Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "supportOpenHelper", "SupportOpenHelperCallback", "NoOpOpenDelegate", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RoomConnectionManager extends BaseRoomConnectionManager {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final List callbacks;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private SupportSQLiteDatabase supportDatabase;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final RoomOpenDelegate openDelegate;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final ConnectionPool connectionPool;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final DatabaseConfiguration configuration;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\bJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\bJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\b¨\u0006\u0011"}, d2 = {"Landroidx/room/RoomConnectionManager$NoOpOpenDelegate;", "Landroidx/room/RoomOpenDelegate;", "<init>", "()V", "Landroidx/sqlite/SQLiteConnection;", "connection", "", "J2", "(Landroidx/sqlite/SQLiteConnection;)V", "xMQ", "Landroidx/room/RoomOpenDelegate$ValidationResult;", "mUb", "(Landroidx/sqlite/SQLiteConnection;)Landroidx/room/RoomOpenDelegate$ValidationResult;", "KN", "Uo", c.f62177j, "rl", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class NoOpOpenDelegate extends RoomOpenDelegate {
        public NoOpOpenDelegate() {
            super(-1, "", "");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void J2(SQLiteConnection connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void KN(SQLiteConnection connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void Uo(SQLiteConnection connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // androidx.room.RoomOpenDelegate
        public RoomOpenDelegate.ValidationResult mUb(SQLiteConnection connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void n(SQLiteConnection connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void rl(SQLiteConnection connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // androidx.room.RoomOpenDelegate
        public void xMQ(SQLiteConnection connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            throw new IllegalStateException("NOP delegate should never be called");
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\n¨\u0006\u0011"}, d2 = {"Landroidx/room/RoomConnectionManager$SupportOpenHelperCallback;", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Callback;", "", NodeModuleProcess.PROPERTY_VERSION, "<init>", "(Landroidx/room/RoomConnectionManager;I)V", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "db", "", "nr", "(Landroidx/sqlite/db/SupportSQLiteDatabase;)V", "oldVersion", "newVersion", "Uo", "(Landroidx/sqlite/db/SupportSQLiteDatabase;II)V", "O", "J2", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class SupportOpenHelperCallback extends SupportSQLiteOpenHelper.Callback {
        public SupportOpenHelperCallback(int i2) {
            super(i2);
        }

        @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
        public void J2(SupportSQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            RoomConnectionManager.this.nY(new SupportSQLiteConnection(db));
            RoomConnectionManager.this.supportDatabase = db;
        }

        @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
        public void O(SupportSQLiteDatabase db, int oldVersion, int newVersion) {
            Intrinsics.checkNotNullParameter(db, "db");
            Uo(db, oldVersion, newVersion);
        }

        @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
        public void Uo(SupportSQLiteDatabase db, int oldVersion, int newVersion) {
            Intrinsics.checkNotNullParameter(db, "db");
            RoomConnectionManager.this.ViF(new SupportSQLiteConnection(db), oldVersion, newVersion);
        }

        @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
        public void nr(SupportSQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
            RoomConnectionManager.this.aYN(new SupportSQLiteConnection(db));
        }
    }

    public RoomConnectionManager(DatabaseConfiguration config, RoomOpenDelegate openDelegate) {
        ConnectionPool connectionPoolRl;
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(openDelegate, "openDelegate");
        this.configuration = config;
        this.openDelegate = openDelegate;
        List list = config.callbacks;
        this.callbacks = list == null ? CollectionsKt.emptyList() : list;
        SQLiteDriver sQLiteDriver = config.sqliteDriver;
        if (sQLiteDriver != null) {
            if (sQLiteDriver instanceof AndroidSQLiteDriver) {
                BaseRoomConnectionManager.DriverWrapper driverWrapper = new BaseRoomConnectionManager.DriverWrapper(this, sQLiteDriver);
                String str = config.com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME java.lang.String;
                connectionPoolRl = new AndroidSQLiteDriverConnectionPool(driverWrapper, str != null ? str : ":memory:");
            } else {
                connectionPoolRl = config.com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME java.lang.String == null ? ConnectionPoolKt.rl(new BaseRoomConnectionManager.DriverWrapper(this, sQLiteDriver), ":memory:") : ConnectionPoolKt.n(new BaseRoomConnectionManager.DriverWrapper(this, sQLiteDriver), config.com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME java.lang.String, ck(config.journalMode), Ik(config.journalMode));
            }
            this.connectionPool = connectionPoolRl;
        } else {
            if (config.sqliteOpenHelperFactory == null) {
                throw new IllegalArgumentException("SQLiteManager was constructed with both null driver and open helper factory!");
            }
            this.connectionPool = new SupportSQLiteConnectionPool(new SupportSQLiteDriver(config.sqliteOpenHelperFactory.n(SupportSQLiteOpenHelper.Configuration.INSTANCE.n(config.context).t(config.com.google.android.gms.measurement.api.AppMeasurementSdk.ConditionalUserProperty.NAME java.lang.String).rl(new SupportOpenHelperCallback(openDelegate.getVersion())).n())));
        }
        T();
    }

    private final DatabaseConfiguration N(DatabaseConfiguration databaseConfiguration, final Function1 function1) {
        List listEmptyList = databaseConfiguration.callbacks;
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        return DatabaseConfiguration.rl(databaseConfiguration, null, null, null, null, CollectionsKt.plus((Collection<? extends RoomDatabase.Callback>) listEmptyList, new RoomDatabase.Callback() { // from class: androidx.room.RoomConnectionManager$installOnOpenCallback$newCallbacks$1
            @Override // androidx.room.RoomDatabase.Callback
            public void J2(SupportSQLiteDatabase db) {
                Intrinsics.checkNotNullParameter(db, "db");
                function1.invoke(db);
            }
        }), false, null, null, null, null, false, false, null, null, null, null, null, null, null, false, null, null, 4194287, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fD(RoomConnectionManager roomConnectionManager, SupportSQLiteDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        roomConnectionManager.supportDatabase = db;
        return Unit.INSTANCE;
    }

    @Override // androidx.room.BaseRoomConnectionManager
    /* JADX INFO: renamed from: HI, reason: from getter */
    protected DatabaseConfiguration getConfiguration() {
        return this.configuration;
    }

    public final SupportSQLiteOpenHelper X() {
        SupportSQLiteDriver supportDriver;
        ConnectionPool connectionPool = this.connectionPool;
        SupportSQLiteConnectionPool supportSQLiteConnectionPool = connectionPool instanceof SupportSQLiteConnectionPool ? (SupportSQLiteConnectionPool) connectionPool : null;
        if (supportSQLiteConnectionPool == null || (supportDriver = supportSQLiteConnectionPool.getSupportDriver()) == null) {
            return null;
        }
        return supportDriver.getOpenHelper();
    }

    public final void e() {
        this.connectionPool.close();
    }

    @Override // androidx.room.BaseRoomConnectionManager
    public String g(String fileName) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        if (Intrinsics.areEqual(fileName, ":memory:")) {
            return fileName;
        }
        String absolutePath = getConfiguration().context.getDatabasePath(fileName).getAbsolutePath();
        Intrinsics.checkNotNull(absolutePath);
        return absolutePath;
    }

    public final boolean nHg() {
        SupportSQLiteDatabase supportSQLiteDatabase = this.supportDatabase;
        if (supportSQLiteDatabase != null) {
            return supportSQLiteDatabase.isOpen();
        }
        return false;
    }

    @Override // androidx.room.BaseRoomConnectionManager
    /* JADX INFO: renamed from: r, reason: from getter */
    protected RoomOpenDelegate getOpenDelegate() {
        return this.openDelegate;
    }

    public Object s7N(boolean z2, Function2 function2, Continuation continuation) {
        return this.connectionPool.ViF(z2, function2, continuation);
    }

    @Override // androidx.room.BaseRoomConnectionManager
    /* JADX INFO: renamed from: ty, reason: from getter */
    protected List getCallbacks() {
        return this.callbacks;
    }

    private final void T() {
        boolean z2;
        if (getConfiguration().journalMode == RoomDatabase.JournalMode.f41376O) {
            z2 = true;
        } else {
            z2 = false;
        }
        SupportSQLiteOpenHelper supportSQLiteOpenHelperX = X();
        if (supportSQLiteOpenHelperX != null) {
            supportSQLiteOpenHelperX.setWriteAheadLoggingEnabled(z2);
        }
    }

    public RoomConnectionManager(DatabaseConfiguration config, Function1 supportOpenHelperFactory) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(supportOpenHelperFactory, "supportOpenHelperFactory");
        this.configuration = config;
        this.openDelegate = new NoOpOpenDelegate();
        List list = config.callbacks;
        this.callbacks = list == null ? CollectionsKt.emptyList() : list;
        this.connectionPool = new SupportSQLiteConnectionPool(new SupportSQLiteDriver((SupportSQLiteOpenHelper) supportOpenHelperFactory.invoke(N(config, new Function1() { // from class: androidx.room.I28
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RoomConnectionManager.fD(this.f41303n, (SupportSQLiteDatabase) obj);
            }
        }))));
        T();
    }
}
