package androidx.room;

import android.content.Context;
import android.content.Intent;
import androidx.room.RoomDatabase;
import androidx.room.util.MigrationUtil;
import androidx.sqlite.SQLiteDriver;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b3\b\u0016\u0018\u00002\u00020\u0001Bí\u0001\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0013\u001a\u00020\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0016\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\r\u0012\u000e\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\n\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\n\u0012\u0006\u0010&\u001a\u00020\r\u0012\b\u0010(\u001a\u0004\u0018\u00010'\u0012\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b+\u0010,J\u001f\u0010/\u001a\u00020\r2\u0006\u0010-\u001a\u00020\u00192\u0006\u0010.\u001a\u00020\u0019H\u0016¢\u0006\u0004\b/\u00100J\u009f\u0002\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0016\u001a\u00020\r2\b\b\u0002\u0010\u0017\u001a\u00020\r2\u0010\b\u0002\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\n2\b\b\u0002\u0010&\u001a\u00020\r2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)H\u0007¢\u0006\u0004\b1\u00102R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b1\u00103R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001c\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b/\u0010:R\u0014\u0010\u000e\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0010\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u0012\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u0013\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bA\u0010@R\u0016\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u0016\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bD\u0010<R\u0014\u0010\u0017\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bE\u0010<R\"\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\b6\u0010HR\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bI\u00105R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u001c\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010\"\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bP\u0010:R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020$0\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bQ\u0010:R\u0014\u0010&\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b<\u0010<R\u0016\u0010(\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010*\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010W\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bV\u0010<R\"\u0010[\u001a\u00020\r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bX\u0010<\u001a\u0004\b8\u0010Y\"\u0004\b;\u0010Z¨\u0006\\"}, d2 = {"Landroidx/room/DatabaseConfiguration;", "", "Landroid/content/Context;", "context", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;", "sqliteOpenHelperFactory", "Landroidx/room/RoomDatabase$MigrationContainer;", "migrationContainer", "", "Landroidx/room/RoomDatabase$Callback;", "callbacks", "", "allowMainThreadQueries", "Landroidx/room/RoomDatabase$JournalMode;", "journalMode", "Ljava/util/concurrent/Executor;", "queryExecutor", "transactionExecutor", "Landroid/content/Intent;", "multiInstanceInvalidationServiceIntent", "requireMigration", "allowDestructiveMigrationOnDowngrade", "", "", "migrationNotRequiredFrom", "copyFromAssetPath", "Ljava/io/File;", "copyFromFile", "Ljava/util/concurrent/Callable;", "Ljava/io/InputStream;", "copyFromInputStream", "Landroidx/room/RoomDatabase$PrepackagedDatabaseCallback;", "prepackagedDatabaseCallback", "typeConverters", "Landroidx/room/migration/AutoMigrationSpec;", "autoMigrationSpecs", "allowDestructiveMigrationForAllTables", "Landroidx/sqlite/SQLiteDriver;", "sqliteDriver", "Lkotlin/coroutines/CoroutineContext;", "queryCoroutineContext", "<init>", "(Landroid/content/Context;Ljava/lang/String;Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;Landroidx/room/RoomDatabase$MigrationContainer;Ljava/util/List;ZLandroidx/room/RoomDatabase$JournalMode;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Landroid/content/Intent;ZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Landroidx/room/RoomDatabase$PrepackagedDatabaseCallback;Ljava/util/List;Ljava/util/List;ZLandroidx/sqlite/SQLiteDriver;Lkotlin/coroutines/CoroutineContext;)V", "fromVersion", "toVersion", "O", "(II)Z", c.f62177j, "(Landroid/content/Context;Ljava/lang/String;Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;Landroidx/room/RoomDatabase$MigrationContainer;Ljava/util/List;ZLandroidx/room/RoomDatabase$JournalMode;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Landroid/content/Intent;ZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Landroidx/room/RoomDatabase$PrepackagedDatabaseCallback;Ljava/util/List;Ljava/util/List;ZLandroidx/sqlite/SQLiteDriver;Lkotlin/coroutines/CoroutineContext;)Landroidx/room/DatabaseConfiguration;", "Landroid/content/Context;", "rl", "Ljava/lang/String;", "t", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;", "nr", "Landroidx/room/RoomDatabase$MigrationContainer;", "Ljava/util/List;", "J2", "Z", "Uo", "Landroidx/room/RoomDatabase$JournalMode;", "KN", "Ljava/util/concurrent/Executor;", "xMQ", "mUb", "Landroid/content/Intent;", "gh", "qie", "az", "Ljava/util/Set;", "()Ljava/util/Set;", "ty", "HI", "Ljava/io/File;", "ck", "Ljava/util/concurrent/Callable;", "Ik", "Landroidx/room/RoomDatabase$PrepackagedDatabaseCallback;", "r", "o", "XQ", "Landroidx/sqlite/SQLiteDriver;", "S", "Lkotlin/coroutines/CoroutineContext;", "WPU", "multiInstanceInvalidation", "aYN", "()Z", "(Z)V", "useTempTrackingTable", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class DatabaseConfiguration {

    /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
    public final File copyFromFile;

    /* JADX INFO: renamed from: Ik, reason: from kotlin metadata */
    public final RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback;

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    public final boolean allowMainThreadQueries;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    public final Executor queryExecutor;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    public final List callbacks;

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    public final CoroutineContext queryCoroutineContext;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    public final RoomDatabase.JournalMode journalMode;

    /* JADX INFO: renamed from: WPU, reason: from kotlin metadata */
    public final boolean multiInstanceInvalidation;

    /* JADX INFO: renamed from: XQ, reason: from kotlin metadata */
    public final SQLiteDriver sqliteDriver;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    public final boolean allowDestructiveMigrationForAllTables;

    /* JADX INFO: renamed from: aYN, reason: from kotlin metadata */
    private boolean useTempTrackingTable;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private final Set migrationNotRequiredFrom;

    /* JADX INFO: renamed from: ck, reason: from kotlin metadata */
    public final Callable copyFromInputStream;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    public final boolean requireMigration;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    public final Intent multiInstanceInvalidationServiceIntent;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public final Context context;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    public final RoomDatabase.MigrationContainer migrationContainer;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    public final List autoMigrationSpecs;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    public final boolean allowDestructiveMigrationOnDowngrade;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    public final List typeConverters;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    public final String name;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public final SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory;

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    public final String copyFromAssetPath;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    public final Executor transactionExecutor;

    public DatabaseConfiguration(Context context, String str, SupportSQLiteOpenHelper.Factory factory, RoomDatabase.MigrationContainer migrationContainer, List list, boolean z2, RoomDatabase.JournalMode journalMode, Executor queryExecutor, Executor transactionExecutor, Intent intent, boolean z3, boolean z4, Set set, String str2, File file, Callable callable, RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback, List typeConverters, List autoMigrationSpecs, boolean z5, SQLiteDriver sQLiteDriver, CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(migrationContainer, "migrationContainer");
        Intrinsics.checkNotNullParameter(journalMode, "journalMode");
        Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
        Intrinsics.checkNotNullParameter(transactionExecutor, "transactionExecutor");
        Intrinsics.checkNotNullParameter(typeConverters, "typeConverters");
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        this.context = context;
        this.name = str;
        this.sqliteOpenHelperFactory = factory;
        this.migrationContainer = migrationContainer;
        this.callbacks = list;
        this.allowMainThreadQueries = z2;
        this.journalMode = journalMode;
        this.queryExecutor = queryExecutor;
        this.transactionExecutor = transactionExecutor;
        this.multiInstanceInvalidationServiceIntent = intent;
        this.requireMigration = z3;
        this.allowDestructiveMigrationOnDowngrade = z4;
        this.migrationNotRequiredFrom = set;
        this.copyFromAssetPath = str2;
        this.copyFromFile = file;
        this.copyFromInputStream = callable;
        this.prepackagedDatabaseCallback = prepackagedDatabaseCallback;
        this.typeConverters = typeConverters;
        this.autoMigrationSpecs = autoMigrationSpecs;
        this.allowDestructiveMigrationForAllTables = z5;
        this.sqliteDriver = sQLiteDriver;
        this.queryCoroutineContext = coroutineContext;
        this.multiInstanceInvalidation = intent != null;
        this.useTempTrackingTable = true;
    }

    public static /* synthetic */ DatabaseConfiguration rl(DatabaseConfiguration databaseConfiguration, Context context, String str, SupportSQLiteOpenHelper.Factory factory, RoomDatabase.MigrationContainer migrationContainer, List list, boolean z2, RoomDatabase.JournalMode journalMode, Executor executor, Executor executor2, Intent intent, boolean z3, boolean z4, Set set, String str2, File file, Callable callable, RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback, List list2, List list3, boolean z5, SQLiteDriver sQLiteDriver, CoroutineContext coroutineContext, int i2, Object obj) {
        CoroutineContext coroutineContext2;
        SQLiteDriver sQLiteDriver2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        }
        Context context2 = (i2 & 1) != 0 ? databaseConfiguration.context : context;
        String str3 = (i2 & 2) != 0 ? databaseConfiguration.name : str;
        SupportSQLiteOpenHelper.Factory factory2 = (i2 & 4) != 0 ? databaseConfiguration.sqliteOpenHelperFactory : factory;
        RoomDatabase.MigrationContainer migrationContainer2 = (i2 & 8) != 0 ? databaseConfiguration.migrationContainer : migrationContainer;
        List list4 = (i2 & 16) != 0 ? databaseConfiguration.callbacks : list;
        boolean z6 = (i2 & 32) != 0 ? databaseConfiguration.allowMainThreadQueries : z2;
        RoomDatabase.JournalMode journalMode2 = (i2 & 64) != 0 ? databaseConfiguration.journalMode : journalMode;
        Executor executor3 = (i2 & 128) != 0 ? databaseConfiguration.queryExecutor : executor;
        Executor executor4 = (i2 & 256) != 0 ? databaseConfiguration.transactionExecutor : executor2;
        Intent intent2 = (i2 & 512) != 0 ? databaseConfiguration.multiInstanceInvalidationServiceIntent : intent;
        boolean z7 = (i2 & 1024) != 0 ? databaseConfiguration.requireMigration : z3;
        boolean z9 = (i2 & 2048) != 0 ? databaseConfiguration.allowDestructiveMigrationOnDowngrade : z4;
        Set set2 = (i2 & 4096) != 0 ? databaseConfiguration.migrationNotRequiredFrom : set;
        String str4 = (i2 & 8192) != 0 ? databaseConfiguration.copyFromAssetPath : str2;
        Context context3 = context2;
        File file2 = (i2 & 16384) != 0 ? databaseConfiguration.copyFromFile : file;
        Callable callable2 = (i2 & 32768) != 0 ? databaseConfiguration.copyFromInputStream : callable;
        RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback2 = (i2 & 65536) != 0 ? databaseConfiguration.prepackagedDatabaseCallback : prepackagedDatabaseCallback;
        List list5 = (i2 & 131072) != 0 ? databaseConfiguration.typeConverters : list2;
        List list6 = (i2 & 262144) != 0 ? databaseConfiguration.autoMigrationSpecs : list3;
        boolean z10 = (i2 & 524288) != 0 ? databaseConfiguration.allowDestructiveMigrationForAllTables : z5;
        SQLiteDriver sQLiteDriver3 = (i2 & 1048576) != 0 ? databaseConfiguration.sqliteDriver : sQLiteDriver;
        if ((i2 & 2097152) != 0) {
            sQLiteDriver2 = sQLiteDriver3;
            coroutineContext2 = databaseConfiguration.queryCoroutineContext;
        } else {
            coroutineContext2 = coroutineContext;
            sQLiteDriver2 = sQLiteDriver3;
        }
        return databaseConfiguration.n(context3, str3, factory2, migrationContainer2, list4, z6, journalMode2, executor3, executor4, intent2, z7, z9, set2, str4, file2, callable2, prepackagedDatabaseCallback2, list5, list6, z10, sQLiteDriver2, coroutineContext2);
    }

    public final DatabaseConfiguration n(Context context, String name, SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory, RoomDatabase.MigrationContainer migrationContainer, List callbacks, boolean allowMainThreadQueries, RoomDatabase.JournalMode journalMode, Executor queryExecutor, Executor transactionExecutor, Intent multiInstanceInvalidationServiceIntent, boolean requireMigration, boolean allowDestructiveMigrationOnDowngrade, Set migrationNotRequiredFrom, String copyFromAssetPath, File copyFromFile, Callable copyFromInputStream, RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback, List typeConverters, List autoMigrationSpecs, boolean allowDestructiveMigrationForAllTables, SQLiteDriver sqliteDriver, CoroutineContext queryCoroutineContext) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(migrationContainer, "migrationContainer");
        Intrinsics.checkNotNullParameter(journalMode, "journalMode");
        Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
        Intrinsics.checkNotNullParameter(transactionExecutor, "transactionExecutor");
        Intrinsics.checkNotNullParameter(typeConverters, "typeConverters");
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        return new DatabaseConfiguration(context, name, sqliteOpenHelperFactory, migrationContainer, callbacks, allowMainThreadQueries, journalMode, queryExecutor, transactionExecutor, multiInstanceInvalidationServiceIntent, requireMigration, allowDestructiveMigrationOnDowngrade, migrationNotRequiredFrom, copyFromAssetPath, copyFromFile, copyFromInputStream, prepackagedDatabaseCallback, typeConverters, autoMigrationSpecs, allowDestructiveMigrationForAllTables, sqliteDriver, queryCoroutineContext);
    }

    public final void J2(boolean z2) {
        this.useTempTrackingTable = z2;
    }

    /* JADX INFO: renamed from: nr, reason: from getter */
    public final boolean getUseTempTrackingTable() {
        return this.useTempTrackingTable;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final Set getMigrationNotRequiredFrom() {
        return this.migrationNotRequiredFrom;
    }

    public boolean O(int fromVersion, int toVersion) {
        return MigrationUtil.nr(this, fromVersion, toVersion);
    }
}
