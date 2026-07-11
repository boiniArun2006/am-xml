package androidx.room;

import androidx.annotation.RestrictTo;
import androidx.room.BaseRoomConnectionManager;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenDelegate;
import androidx.room.concurrent.ExclusiveLock;
import androidx.room.migration.Migration;
import androidx.room.util.MigrationUtil;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteDriver;
import androidx.sqlite.SQLiteStatement;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b'\u0018\u0000 82\u00020\u0001:\u00029:B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\bJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\bJ\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\bJ\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\bJ\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u000fJ\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\bJ\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\bJ\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\bJ\u0017\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0018H\u0010¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\u001c\u0010\bJ'\u0010 \u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001dH\u0004¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0004¢\u0006\u0004\b\"\u0010\bJ\u0013\u0010$\u001a\u00020\u001d*\u00020#H\u0004¢\u0006\u0004\b$\u0010%J\u0013\u0010&\u001a\u00020\u001d*\u00020#H\u0004¢\u0006\u0004\b&\u0010%R\u0016\u0010(\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010\u0014R\u0016\u0010*\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010\u0014R\u0014\u0010.\u001a\u00020+8$X¤\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8$X¤\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u001a\u00107\u001a\b\u0012\u0004\u0012\u000204038$X¤\u0004¢\u0006\u0006\u001a\u0004\b5\u00106¨\u0006;"}, d2 = {"Landroidx/room/BaseRoomConnectionManager;", "", "<init>", "()V", "Landroidx/sqlite/SQLiteConnection;", "connection", "", "xMQ", "(Landroidx/sqlite/SQLiteConnection;)V", "Uo", "mUb", "gh", "KN", "", "o", "(Landroidx/sqlite/SQLiteConnection;)Z", "te", "qie", "az", "J2", "Z", "XQ", "S", "WPU", "", "fileName", "g", "(Ljava/lang/String;)Ljava/lang/String;", "aYN", "", "oldVersion", "newVersion", "ViF", "(Landroidx/sqlite/SQLiteConnection;II)V", "nY", "Landroidx/room/RoomDatabase$JournalMode;", "ck", "(Landroidx/room/RoomDatabase$JournalMode;)I", "Ik", c.f62177j, "isConfigured", "rl", "isInitializing", "Landroidx/room/DatabaseConfiguration;", "HI", "()Landroidx/room/DatabaseConfiguration;", com.safedk.android.utils.j.f63190c, "Landroidx/room/RoomOpenDelegate;", "r", "()Landroidx/room/RoomOpenDelegate;", "openDelegate", "", "Landroidx/room/RoomDatabase$Callback;", "ty", "()Ljava/util/List;", "callbacks", "t", "DriverWrapper", "Companion", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@RestrictTo
@SourceDebugExtension({"SMAP\nRoomConnectionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomConnectionManager.kt\nandroidx/room/BaseRoomConnectionManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,362:1\n1#2:363\n1863#3,2:364\n1863#3,2:366\n1863#3,2:368\n1863#3,2:370\n1863#3,2:372\n*S KotlinDebug\n*F\n+ 1 RoomConnectionManager.kt\nandroidx/room/BaseRoomConnectionManager\n*L\n209#1:364,2\n253#1:366,2\n342#1:368,2\n346#1:370,2\n350#1:372,2\n*E\n"})
public abstract class BaseRoomConnectionManager {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private boolean isConfigured;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private boolean isInitializing;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0084\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u000b\u0010\tR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/room/BaseRoomConnectionManager$DriverWrapper;", "Landroidx/sqlite/SQLiteDriver;", "actual", "<init>", "(Landroidx/room/BaseRoomConnectionManager;Landroidx/sqlite/SQLiteDriver;)V", "", "filename", "Landroidx/sqlite/SQLiteConnection;", "t", "(Ljava/lang/String;)Landroidx/sqlite/SQLiteConnection;", "fileName", c.f62177j, "Landroidx/sqlite/SQLiteDriver;", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    protected final class DriverWrapper implements SQLiteDriver {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final SQLiteDriver actual;
        final /* synthetic */ BaseRoomConnectionManager rl;

        public DriverWrapper(BaseRoomConnectionManager baseRoomConnectionManager, SQLiteDriver actual) {
            Intrinsics.checkNotNullParameter(actual, "actual");
            this.rl = baseRoomConnectionManager;
            this.actual = actual;
        }

        private final SQLiteConnection t(final String filename) {
            ExclusiveLock exclusiveLock = new ExclusiveLock(filename, (this.rl.isConfigured || this.rl.isInitializing || Intrinsics.areEqual(filename, ":memory:")) ? false : true);
            final BaseRoomConnectionManager baseRoomConnectionManager = this.rl;
            return (SQLiteConnection) exclusiveLock.rl(new Function0() { // from class: androidx.room.j
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BaseRoomConnectionManager.DriverWrapper.nr(baseRoomConnectionManager, this, filename);
                }
            }, new Function1() { // from class: androidx.room.BaseRoomConnectionManager$DriverWrapper$openLocked$2
                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final Void invoke(Throwable error) {
                    Intrinsics.checkNotNullParameter(error, "error");
                    throw new IllegalStateException("Unable to open database '" + filename + "'. Was a proper path / name used in Room's database builder?", error);
                }
            });
        }

        @Override // androidx.sqlite.SQLiteDriver
        public SQLiteConnection n(String fileName) {
            Intrinsics.checkNotNullParameter(fileName, "fileName");
            return t(this.rl.g(fileName));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SQLiteConnection nr(BaseRoomConnectionManager baseRoomConnectionManager, DriverWrapper driverWrapper, String str) {
            if (!baseRoomConnectionManager.isInitializing) {
                SQLiteConnection sQLiteConnectionN = driverWrapper.actual.n(str);
                if (baseRoomConnectionManager.isConfigured) {
                    baseRoomConnectionManager.Uo(sQLiteConnectionN);
                    return sQLiteConnectionN;
                }
                try {
                    baseRoomConnectionManager.isInitializing = true;
                    baseRoomConnectionManager.xMQ(sQLiteConnectionN);
                    return sQLiteConnectionN;
                } finally {
                    baseRoomConnectionManager.isInitializing = false;
                }
            }
            throw new IllegalStateException("Recursive database initialization detected. Did you try to use the database instance during initialization? Maybe in one of the callbacks?");
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RoomDatabase.JournalMode.values().length];
            try {
                iArr[RoomDatabase.JournalMode.f41379t.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RoomDatabase.JournalMode.f41376O.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: HI */
    protected abstract DatabaseConfiguration getCom.safedk.android.utils.j.c java.lang.String();

    public String g(String fileName) {
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        return fileName;
    }

    /* JADX INFO: renamed from: r */
    protected abstract RoomOpenDelegate getOpenDelegate();

    /* JADX INFO: renamed from: ty */
    protected abstract List getCallbacks();

    private final void KN(SQLiteConnection connection) {
        SQLiteStatement sQLiteStatementMI = connection.mI("PRAGMA busy_timeout");
        try {
            sQLiteStatementMI.RQ();
            long j2 = sQLiteStatementMI.getLong(0);
            AutoCloseableKt.closeFinally(sQLiteStatementMI, null);
            if (j2 < 3000) {
                SQLite.n(connection, "PRAGMA busy_timeout = 3000");
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AutoCloseableKt.closeFinally(sQLiteStatementMI, th);
                throw th2;
            }
        }
    }

    private final boolean Z(SQLiteConnection connection) {
        SQLiteStatement sQLiteStatementMI = connection.mI("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name = 'room_master_table'");
        try {
            boolean z2 = false;
            if (sQLiteStatementMI.RQ()) {
                if (sQLiteStatementMI.getLong(0) != 0) {
                    z2 = true;
                }
            }
            AutoCloseableKt.closeFinally(sQLiteStatementMI, null);
            return z2;
        } finally {
        }
    }

    private final boolean o(SQLiteConnection connection) {
        SQLiteStatement sQLiteStatementMI = connection.mI("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z2 = false;
            if (sQLiteStatementMI.RQ()) {
                if (sQLiteStatementMI.getLong(0) == 0) {
                    z2 = true;
                }
            }
            AutoCloseableKt.closeFinally(sQLiteStatementMI, null);
            return z2;
        } finally {
        }
    }

    private final void qie(SQLiteConnection connection) {
        SQLite.n(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    protected final int Ik(RoomDatabase.JournalMode journalMode) {
        Intrinsics.checkNotNullParameter(journalMode, "<this>");
        int i2 = WhenMappings.$EnumSwitchMapping$0[journalMode.ordinal()];
        if (i2 == 1 || i2 == 2) {
            return 1;
        }
        throw new IllegalStateException(("Can't get max number of writers for journal mode '" + journalMode + '\'').toString());
    }

    protected final void ViF(SQLiteConnection connection, int oldVersion, int newVersion) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        List listRl = MigrationUtil.rl(getCom.safedk.android.utils.j.c java.lang.String().migrationContainer, oldVersion, newVersion);
        if (listRl == null) {
            if (!MigrationUtil.nr(getCom.safedk.android.utils.j.c java.lang.String(), oldVersion, newVersion)) {
                az(connection);
                S(connection);
                getOpenDelegate().n(connection);
                return;
            } else {
                throw new IllegalStateException(("A migration from " + oldVersion + " to " + newVersion + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.").toString());
            }
        }
        getOpenDelegate().xMQ(connection);
        Iterator it = listRl.iterator();
        while (it.hasNext()) {
            ((Migration) it.next()).n(connection);
        }
        RoomOpenDelegate.ValidationResult validationResultMUb = getOpenDelegate().mUb(connection);
        if (validationResultMUb.isValid) {
            getOpenDelegate().KN(connection);
            te(connection);
        } else {
            throw new IllegalStateException(("Migration didn't properly handle: " + validationResultMUb.expectedFoundMsg).toString());
        }
    }

    protected final void aYN(SQLiteConnection connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        boolean zO = o(connection);
        getOpenDelegate().n(connection);
        if (!zO) {
            RoomOpenDelegate.ValidationResult validationResultMUb = getOpenDelegate().mUb(connection);
            if (!validationResultMUb.isValid) {
                throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + validationResultMUb.expectedFoundMsg).toString());
            }
        }
        te(connection);
        getOpenDelegate().J2(connection);
        XQ(connection);
    }

    protected final int ck(RoomDatabase.JournalMode journalMode) {
        Intrinsics.checkNotNullParameter(journalMode, "<this>");
        int i2 = WhenMappings.$EnumSwitchMapping$0[journalMode.ordinal()];
        if (i2 == 1) {
            return 1;
        }
        if (i2 == 2) {
            return 4;
        }
        throw new IllegalStateException(("Can't get max number of reader for journal mode '" + journalMode + '\'').toString());
    }

    protected final void nY(SQLiteConnection connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        J2(connection);
        getOpenDelegate().Uo(connection);
        WPU(connection);
        this.isConfigured = true;
    }

    private final void J2(SQLiteConnection connection) throws Throwable {
        Object objM313constructorimpl;
        RoomOpenDelegate.ValidationResult validationResultMUb;
        String strHV;
        if (Z(connection)) {
            SQLiteStatement sQLiteStatementMI = connection.mI("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1");
            try {
                if (sQLiteStatementMI.RQ()) {
                    strHV = sQLiteStatementMI.HV(0);
                } else {
                    strHV = null;
                }
                AutoCloseableKt.closeFinally(sQLiteStatementMI, null);
                if (!Intrinsics.areEqual(getOpenDelegate().getIdentityHash(), strHV) && !Intrinsics.areEqual(getOpenDelegate().getLegacyIdentityHash(), strHV)) {
                    throw new IllegalStateException(("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + getOpenDelegate().getIdentityHash() + ", found: " + strHV).toString());
                }
                return;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AutoCloseableKt.closeFinally(sQLiteStatementMI, th);
                    throw th2;
                }
            }
        }
        SQLite.n(connection, "BEGIN EXCLUSIVE TRANSACTION");
        try {
            Result.Companion companion = Result.INSTANCE;
            validationResultMUb = getOpenDelegate().mUb(connection);
        } catch (Throwable th3) {
            Result.Companion companion2 = Result.INSTANCE;
            objM313constructorimpl = Result.m313constructorimpl(ResultKt.createFailure(th3));
        }
        if (validationResultMUb.isValid) {
            getOpenDelegate().KN(connection);
            te(connection);
            objM313constructorimpl = Result.m313constructorimpl(Unit.INSTANCE);
            if (Result.m320isSuccessimpl(objM313constructorimpl)) {
                SQLite.n(connection, "END TRANSACTION");
            }
            Throwable thM316exceptionOrNullimpl = Result.m316exceptionOrNullimpl(objM313constructorimpl);
            if (thM316exceptionOrNullimpl == null) {
                Result.m312boximpl(objM313constructorimpl);
                return;
            } else {
                SQLite.n(connection, "ROLLBACK TRANSACTION");
                throw thM316exceptionOrNullimpl;
            }
        }
        throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + validationResultMUb.expectedFoundMsg).toString());
    }

    private final void S(SQLiteConnection connection) {
        Iterator it = getCallbacks().iterator();
        while (it.hasNext()) {
            ((RoomDatabase.Callback) it.next()).t(connection);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Uo(SQLiteConnection connection) {
        gh(connection);
        KN(connection);
        getOpenDelegate().Uo(connection);
    }

    private final void WPU(SQLiteConnection connection) {
        Iterator it = getCallbacks().iterator();
        while (it.hasNext()) {
            ((RoomDatabase.Callback) it.next()).O(connection);
        }
    }

    private final void XQ(SQLiteConnection connection) {
        Iterator it = getCallbacks().iterator();
        while (it.hasNext()) {
            ((RoomDatabase.Callback) it.next()).n(connection);
        }
    }

    private final void az(SQLiteConnection connection) {
        if (getCom.safedk.android.utils.j.c java.lang.String().allowDestructiveMigrationForAllTables) {
            SQLiteStatement sQLiteStatementMI = connection.mI("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
            try {
                List listCreateListBuilder = CollectionsKt.createListBuilder();
                while (sQLiteStatementMI.RQ()) {
                    String strHV = sQLiteStatementMI.HV(0);
                    if (!StringsKt.startsWith$default(strHV, "sqlite_", false, 2, (Object) null) && !Intrinsics.areEqual(strHV, "android_metadata")) {
                        listCreateListBuilder.add(TuplesKt.to(strHV, Boolean.valueOf(Intrinsics.areEqual(sQLiteStatementMI.HV(1), "view"))));
                    }
                }
                List<Pair> listBuild = CollectionsKt.build(listCreateListBuilder);
                AutoCloseableKt.closeFinally(sQLiteStatementMI, null);
                for (Pair pair : listBuild) {
                    String str = (String) pair.component1();
                    if (((Boolean) pair.component2()).booleanValue()) {
                        SQLite.n(connection, "DROP VIEW IF EXISTS " + str);
                    } else {
                        SQLite.n(connection, "DROP TABLE IF EXISTS " + str);
                    }
                }
            } finally {
            }
        } else {
            getOpenDelegate().rl(connection);
        }
    }

    private final void gh(SQLiteConnection connection) {
        if (getCom.safedk.android.utils.j.c java.lang.String().journalMode == RoomDatabase.JournalMode.f41376O) {
            SQLite.n(connection, "PRAGMA synchronous = NORMAL");
        } else {
            SQLite.n(connection, "PRAGMA synchronous = FULL");
        }
    }

    private final void mUb(SQLiteConnection connection) {
        if (getCom.safedk.android.utils.j.c java.lang.String().journalMode == RoomDatabase.JournalMode.f41376O) {
            SQLite.n(connection, "PRAGMA journal_mode = WAL");
        } else {
            SQLite.n(connection, "PRAGMA journal_mode = TRUNCATE");
        }
    }

    private final void te(SQLiteConnection connection) {
        qie(connection);
        SQLite.n(connection, RoomMasterTable.n(getOpenDelegate().getIdentityHash()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void xMQ(SQLiteConnection connection) throws Throwable {
        Object objM313constructorimpl;
        mUb(connection);
        gh(connection);
        KN(connection);
        SQLiteStatement sQLiteStatementMI = connection.mI("PRAGMA user_version");
        try {
            sQLiteStatementMI.RQ();
            int i2 = (int) sQLiteStatementMI.getLong(0);
            AutoCloseableKt.closeFinally(sQLiteStatementMI, null);
            if (i2 != getOpenDelegate().getVersion()) {
                SQLite.n(connection, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    Result.Companion companion = Result.INSTANCE;
                    if (i2 == 0) {
                        aYN(connection);
                    } else {
                        ViF(connection, i2, getOpenDelegate().getVersion());
                    }
                    SQLite.n(connection, "PRAGMA user_version = " + getOpenDelegate().getVersion());
                    objM313constructorimpl = Result.m313constructorimpl(Unit.INSTANCE);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM313constructorimpl = Result.m313constructorimpl(ResultKt.createFailure(th));
                }
                if (Result.m320isSuccessimpl(objM313constructorimpl)) {
                    SQLite.n(connection, "END TRANSACTION");
                }
                Throwable thM316exceptionOrNullimpl = Result.m316exceptionOrNullimpl(objM313constructorimpl);
                if (thM316exceptionOrNullimpl != null) {
                    SQLite.n(connection, "ROLLBACK TRANSACTION");
                    throw thM316exceptionOrNullimpl;
                }
            }
            nY(connection);
        } finally {
        }
    }
}
