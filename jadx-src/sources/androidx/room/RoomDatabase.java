package androidx.room;

import GJW.Lu;
import GJW.N;
import GJW.R6;
import GJW.lej;
import GJW.vd;
import GJW.xuv;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.room.concurrent.CloseBarrier;
import androidx.room.driver.SupportSQLiteConnection;
import androidx.room.migration.Migration;
import androidx.room.support.AutoCloser;
import androidx.room.support.AutoClosingRoomOpenHelper;
import androidx.room.support.AutoClosingRoomOpenHelperFactory;
import androidx.room.support.PrePackagedCopyOpenHelper;
import androidx.room.support.PrePackagedCopyOpenHelperFactory;
import androidx.room.support.QueryInterceptorOpenHelperFactory;
import androidx.room.util.KClassUtil;
import androidx.room.util.MigrationUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteDriver;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelperFactory;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NotImplementedError;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KClass;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000ò\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u001a\b&\u0018\u0000 %2\u00020\u0001:\u000e\u0095\u0001\u0096\u0001\u0097\u0001\u0098\u0001\u0099\u0001\u009a\u0001\u009b\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J#\u0010\u000b\u001a\u00020\u00042\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\b2\u0006\u0010\n\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0017¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u0012\u0010\u0013J1\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u001a\u0010\u0017\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u0015\u0012\u0004\u0012\u00020\u00160\u0014H\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ1\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u001a\u0010\u0017\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00160\b\u0012\u0004\u0012\u00020\u00160\u0014H\u0017¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\rH\u0015¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0015¢\u0006\u0004\b\"\u0010#J\u000f\u0010%\u001a\u00020$H$¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0007¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H\u0007¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020*H\u0000¢\u0006\u0004\b-\u0010,J)\u0010.\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0015\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00150\u00180\u0014H\u0015¢\u0006\u0004\b.\u0010/J)\u00100\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u00180\u0014H\u0015¢\u0006\u0004\b0\u0010/J\u001d\u00102\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00160\u001501H\u0017¢\u0006\u0004\b2\u00103J\u001d\u00104\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00160\b01H\u0017¢\u0006\u0004\b4\u00103J\u000f\u00105\u001a\u00020\u0004H\u0017¢\u0006\u0004\b5\u0010\u0003J\u000f\u00106\u001a\u00020\u0004H\u0017¢\u0006\u0004\b6\u0010\u0003JB\u0010>\u001a\u00028\u0000\"\u0004\b\u0000\u001072\u0006\u00109\u001a\u0002082\"\u0010=\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020;\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000<\u0012\u0006\u0012\u0004\u0018\u00010\u00010:H\u0080@¢\u0006\u0004\b>\u0010?J\u000f\u0010@\u001a\u000208H\u0000¢\u0006\u0004\b@\u0010AJ#\u0010G\u001a\u00020F2\u0006\u0010C\u001a\u00020B2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010DH\u0017¢\u0006\u0004\bG\u0010HJ\u0017\u0010L\u001a\u00020K2\u0006\u0010J\u001a\u00020IH\u0016¢\u0006\u0004\bL\u0010MJ\u000f\u0010N\u001a\u00020\u0004H\u0017¢\u0006\u0004\bN\u0010\u0003J\u000f\u0010O\u001a\u00020\u0004H\u0017¢\u0006\u0004\bO\u0010\u0003J\u000f\u0010P\u001a\u00020\u0004H\u0017¢\u0006\u0004\bP\u0010\u0003J\u0017\u0010S\u001a\u00020\u00042\u0006\u0010R\u001a\u00020QH\u0015¢\u0006\u0004\bS\u0010TJ\u0017\u0010W\u001a\u00020\u00042\u0006\u0010V\u001a\u00020UH\u0005¢\u0006\u0004\bW\u0010XJ\u000f\u0010Y\u001a\u000208H\u0016¢\u0006\u0004\bY\u0010AR\u001e\u0010]\u001a\u0004\u0018\u00010Q8\u0004@\u0004X\u0085\u000e¢\u0006\f\n\u0004\bZ\u0010[\u0012\u0004\b\\\u0010\u0003R\u0016\u0010`\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b^\u0010_R\u0016\u0010c\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\ba\u0010bR\u0016\u0010g\u001a\u00020d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\be\u0010fR\u0016\u0010i\u001a\u00020d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bh\u0010fR\u0016\u0010k\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000b\u0010jR\u0016\u0010m\u001a\u00020$8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b5\u0010lR\u001a\u0010r\u001a\u00020n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b6\u0010o\u001a\u0004\bp\u0010qR\u0016\u0010s\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010\u001aR$\u0010x\u001a\n\u0012\u0004\u0012\u00020t\u0018\u00010\u00188\u0004@\u0004X\u0085\u000e¢\u0006\f\n\u0004\bu\u0010v\u0012\u0004\bw\u0010\u0003R\u0018\u0010{\u001a\u0004\u0018\u00010y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010zR\u001f\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020}0|8G¢\u0006\r\n\u0004\b\u001c\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001R(\u0010\u0085\u0001\u001a\u0013\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0004\u0012\u00020\u00010\u0082\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R&\u0010\u0089\u0001\u001a\u0002088\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0004\b\u0012\u0010\u001a\u001a\u0005\b\u0086\u0001\u0010A\"\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0017\u0010\u008c\u0001\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001R\u0016\u0010\u008e\u0001\u001a\u00020$8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u008d\u0001\u0010&R0\u0010\u0090\u0001\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u00180\u00148@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u008f\u0001\u0010/R\u0013\u0010\u0092\u0001\u001a\u0002088G¢\u0006\u0007\u001a\u0005\b\u0091\u0001\u0010AR\u0016\u0010\u0094\u0001\u001a\u0002088@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0093\u0001\u0010A¨\u0006\u009c\u0001"}, d2 = {"Landroidx/room/RoomDatabase;", "", "<init>", "()V", "", "jB", "s7N", "wTp", "Lkotlin/reflect/KClass;", "kclass", "converter", "J2", "(Lkotlin/reflect/KClass;Ljava/lang/Object;)V", "Landroidx/room/DatabaseConfiguration;", com.safedk.android.utils.j.f63190c, "nHg", "(Landroidx/room/DatabaseConfiguration;)V", "Landroidx/room/RoomConnectionManager;", "ty", "(Landroidx/room/DatabaseConfiguration;)Landroidx/room/RoomConnectionManager;", "", "Ljava/lang/Class;", "Landroidx/room/migration/AutoMigrationSpec;", "autoMigrationSpecs", "", "Landroidx/room/migration/Migration;", "Z", "(Ljava/util/Map;)Ljava/util/List;", "qie", "config", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "Ik", "(Landroidx/room/DatabaseConfiguration;)Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "Landroidx/room/RoomOpenDelegateMarker;", "ck", "()Landroidx/room/RoomOpenDelegateMarker;", "Landroidx/room/InvalidationTracker;", "HI", "()Landroidx/room/InvalidationTracker;", "LGJW/vd;", "S", "()LGJW/vd;", "Lkotlin/coroutines/CoroutineContext;", "ViF", "()Lkotlin/coroutines/CoroutineContext;", "e", "fD", "()Ljava/util/Map;", "te", "", "g", "()Ljava/util/Set;", "nY", "Uo", "KN", "R", "", "isReadOnly", "Lkotlin/Function2;", "Landroidx/room/Transactor;", "Lkotlin/coroutines/Continuation;", "block", "M7", "(ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "()Z", "Landroidx/sqlite/db/SupportSQLiteQuery;", "query", "Landroid/os/CancellationSignal;", "signal", "Landroid/database/Cursor;", "U", "(Landroidx/sqlite/db/SupportSQLiteQuery;Landroid/os/CancellationSignal;)Landroid/database/Cursor;", "", "sql", "Landroidx/sqlite/db/SupportSQLiteStatement;", "gh", "(Ljava/lang/String;)Landroidx/sqlite/db/SupportSQLiteStatement;", "xMQ", "r", "P5", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "db", "rV9", "(Landroidx/sqlite/db/SupportSQLiteDatabase;)V", "Landroidx/sqlite/SQLiteConnection;", "connection", "v", "(Landroidx/sqlite/SQLiteConnection;)V", "N", c.f62177j, "Landroidx/sqlite/db/SupportSQLiteDatabase;", "getMDatabase$annotations", "mDatabase", "rl", "LGJW/vd;", "coroutineScope", "t", "Lkotlin/coroutines/CoroutineContext;", "transactionContext", "Ljava/util/concurrent/Executor;", "nr", "Ljava/util/concurrent/Executor;", "internalQueryExecutor", "O", "internalTransactionExecutor", "Landroidx/room/RoomConnectionManager;", "connectionManager", "Landroidx/room/InvalidationTracker;", "internalTracker", "Landroidx/room/concurrent/CloseBarrier;", "Landroidx/room/concurrent/CloseBarrier;", "XQ", "()Landroidx/room/concurrent/CloseBarrier;", "closeBarrier", "allowMainThreadQueries", "Landroidx/room/RoomDatabase$Callback;", "mUb", "Ljava/util/List;", "getMCallbacks$annotations", "mCallbacks", "Landroidx/room/support/AutoCloser;", "Landroidx/room/support/AutoCloser;", "autoCloser", "Ljava/lang/ThreadLocal;", "", "Ljava/lang/ThreadLocal;", "E2", "()Ljava/lang/ThreadLocal;", "suspendingTransactionId", "", "az", "Ljava/util/Map;", "typeConverters", "X", "setUseTempTrackingTable$room_runtime_release", "(Z)V", "useTempTrackingTable", "aYN", "()Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "openHelper", "WPU", "invalidationTracker", "iF", "requiredTypeConverterClassesMap", "Xw", "isOpenInternal", "bzg", "isMainThread", "JournalMode", "Builder", "MigrationContainer", "Callback", "PrepackagedDatabaseCallback", "QueryCallback", "Companion", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRoomDatabase.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomDatabase.android.kt\nandroidx/room/RoomDatabase\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2151:1\n357#1,15:2152\n357#1,15:2167\n477#2:2182\n423#2:2183\n1246#3,4:2184\n1187#3,2:2188\n1261#3,2:2190\n1557#3:2192\n1628#3,3:2193\n1264#3:2196\n1557#3:2197\n1628#3,3:2198\n*S KotlinDebug\n*F\n+ 1 RoomDatabase.android.kt\nandroidx/room/RoomDatabase\n*L\n271#1:2152,15\n275#1:2167,15\n343#1:2182\n343#1:2183\n343#1:2184,4\n452#1:2188,2\n452#1:2190,2\n453#1:2192\n453#1:2193,3\n452#1:2196\n478#1:2197\n478#1:2198,3\n*E\n"})
public abstract class RoomDatabase {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private RoomConnectionManager connectionManager;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private Executor internalTransactionExecutor;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private InvalidationTracker internalTracker;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private AutoCloser autoCloser;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    protected List mCallbacks;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    protected volatile SupportSQLiteDatabase mDatabase;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private Executor internalQueryExecutor;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private vd coroutineScope;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private CoroutineContext transactionContext;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private boolean allowMainThreadQueries;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final CloseBarrier closeBarrier = new CloseBarrier(new RoomDatabase$closeBarrier$1(this));

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private final ThreadLocal suspendingTransactionId = new ThreadLocal();

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private final Map typeConverters = new LinkedHashMap();

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private boolean useTempTrackingTable = true;

    @Metadata(d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B)\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u0010\"\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0017¢\u0006\u0004\b\u001b\u0010\u0016J\u001d\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00028\u0000H\u0016¢\u0006\u0004\b \u0010!R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010$R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010%R\u001c\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010'R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u001c0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010)R\u0018\u0010-\u001a\u0004\u0018\u00010+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010,R\u0018\u00100\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010/R\u0018\u00103\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00107\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u00030(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010)R\u0018\u0010;\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u00102R\u0018\u0010=\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u00102R\u0018\u0010@\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010D\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0016\u0010H\u001a\u00020E8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010L\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u0016\u0010P\u001a\u00020M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0018\u0010T\u001a\u0004\u0018\u00010Q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010X\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u001c\u0010\\\u001a\b\u0012\u0004\u0012\u00020Z0Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010[R\u001a\u0010^\u001a\b\u0012\u0004\u0012\u00020Z0Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010[R\u001a\u0010a\u001a\b\u0012\u0004\u0012\u00020_0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010)R\u0016\u0010c\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010CR\u0016\u0010e\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010CR\u0016\u0010g\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010CR\u0018\u0010i\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010%R\u0018\u0010m\u001a\u0004\u0018\u00010j8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u001e\u0010r\u001a\n\u0012\u0004\u0012\u00020o\u0018\u00010n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010qR\u0018\u0010v\u001a\u0004\u0018\u00010s8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\u0018\u0010x\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u00106R\u0016\u0010z\u001a\u00020A8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010C¨\u0006{"}, d2 = {"Landroidx/room/RoomDatabase$Builder;", "Landroidx/room/RoomDatabase;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "", "Landroid/content/Context;", "context", "Ljava/lang/Class;", "klass", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "<init>", "(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)V", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;", "factory", "J2", "(Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;)Landroidx/room/RoomDatabase$Builder;", "", "Landroidx/room/migration/Migration;", "migrations", "rl", "([Landroidx/room/migration/Migration;)Landroidx/room/RoomDatabase$Builder;", "t", "()Landroidx/room/RoomDatabase$Builder;", "Ljava/util/concurrent/Executor;", "executor", "Uo", "(Ljava/util/concurrent/Executor;)Landroidx/room/RoomDatabase$Builder;", "O", "Landroidx/room/RoomDatabase$Callback;", "callback", c.f62177j, "(Landroidx/room/RoomDatabase$Callback;)Landroidx/room/RoomDatabase$Builder;", "nr", "()Landroidx/room/RoomDatabase;", "Lkotlin/reflect/KClass;", "Lkotlin/reflect/KClass;", "Landroid/content/Context;", "Ljava/lang/String;", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "", "Ljava/util/List;", "callbacks", "Landroidx/room/RoomDatabase$PrepackagedDatabaseCallback;", "Landroidx/room/RoomDatabase$PrepackagedDatabaseCallback;", "prepackagedDatabaseCallback", "Landroidx/room/RoomDatabase$QueryCallback;", "Landroidx/room/RoomDatabase$QueryCallback;", "queryCallback", "KN", "Ljava/util/concurrent/Executor;", "queryCallbackExecutor", "Lkotlin/coroutines/CoroutineContext;", "xMQ", "Lkotlin/coroutines/CoroutineContext;", "queryCallbackCoroutineContext", "mUb", "typeConverters", "gh", "queryExecutor", "qie", "transactionExecutor", "az", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;", "supportOpenHelperFactory", "", "ty", "Z", "allowMainThreadQueries", "Landroidx/room/RoomDatabase$JournalMode;", "HI", "Landroidx/room/RoomDatabase$JournalMode;", "journalMode", "Landroid/content/Intent;", "ck", "Landroid/content/Intent;", "multiInstanceInvalidationIntent", "", "Ik", "J", "autoCloseTimeout", "Ljava/util/concurrent/TimeUnit;", "r", "Ljava/util/concurrent/TimeUnit;", "autoCloseTimeUnit", "Landroidx/room/RoomDatabase$MigrationContainer;", "o", "Landroidx/room/RoomDatabase$MigrationContainer;", "migrationContainer", "", "", "Ljava/util/Set;", "migrationsNotRequiredFrom", "XQ", "migrationStartAndEndVersions", "Landroidx/room/migration/AutoMigrationSpec;", "S", "autoMigrationSpecs", "WPU", "requireMigration", "aYN", "allowDestructiveMigrationOnDowngrade", "ViF", "allowDestructiveMigrationForAllTables", "nY", "copyFromAssetPath", "Ljava/io/File;", "g", "Ljava/io/File;", "copyFromFile", "Ljava/util/concurrent/Callable;", "Ljava/io/InputStream;", "te", "Ljava/util/concurrent/Callable;", "copyFromInputStream", "Landroidx/sqlite/SQLiteDriver;", "iF", "Landroidx/sqlite/SQLiteDriver;", "driver", "fD", "queryCoroutineContext", "E2", "inMemoryTrackingTableMode", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nRoomDatabase.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomDatabase.android.kt\nandroidx/room/RoomDatabase$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2151:1\n1#2:2152\n*E\n"})
    public static class Builder<T extends RoomDatabase> {

        /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
        private boolean inMemoryTrackingTableMode;

        /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
        private JournalMode journalMode;

        /* JADX INFO: renamed from: Ik, reason: from kotlin metadata */
        private long autoCloseTimeout;

        /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
        private PrepackagedDatabaseCallback prepackagedDatabaseCallback;

        /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
        private Executor queryCallbackExecutor;

        /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
        private final List callbacks;

        /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
        private final List autoMigrationSpecs;

        /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
        private QueryCallback queryCallback;

        /* JADX INFO: renamed from: ViF, reason: from kotlin metadata */
        private boolean allowDestructiveMigrationForAllTables;

        /* JADX INFO: renamed from: WPU, reason: from kotlin metadata */
        private boolean requireMigration;

        /* JADX INFO: renamed from: XQ, reason: from kotlin metadata */
        private final Set migrationStartAndEndVersions;

        /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
        private Set migrationsNotRequiredFrom;

        /* JADX INFO: renamed from: aYN, reason: from kotlin metadata */
        private boolean allowDestructiveMigrationOnDowngrade;

        /* JADX INFO: renamed from: az, reason: from kotlin metadata */
        private SupportSQLiteOpenHelper.Factory supportOpenHelperFactory;

        /* JADX INFO: renamed from: ck, reason: from kotlin metadata */
        private Intent multiInstanceInvalidationIntent;

        /* JADX INFO: renamed from: fD, reason: from kotlin metadata */
        private CoroutineContext queryCoroutineContext;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private File copyFromFile;

        /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
        private Executor queryExecutor;

        /* JADX INFO: renamed from: iF, reason: from kotlin metadata */
        private SQLiteDriver driver;

        /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
        private final List typeConverters;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final KClass klass;

        /* JADX INFO: renamed from: nY, reason: from kotlin metadata */
        private String copyFromAssetPath;

        /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
        private final Function0 factory;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        private final MigrationContainer migrationContainer;

        /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
        private Executor transactionExecutor;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        private TimeUnit autoCloseTimeUnit;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        private final Context context;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private final String name;

        /* JADX INFO: renamed from: te, reason: from kotlin metadata */
        private Callable copyFromInputStream;

        /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
        private boolean allowMainThreadQueries;

        /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
        private CoroutineContext queryCallbackCoroutineContext;

        public Builder O() {
            this.requireMigration = false;
            this.allowDestructiveMigrationOnDowngrade = true;
            return this;
        }

        public Builder t() {
            this.allowMainThreadQueries = true;
            return this;
        }

        public Builder(Context context, Class klass, String str) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(klass, "klass");
            this.callbacks = new ArrayList();
            this.typeConverters = new ArrayList();
            this.journalMode = JournalMode.f41377n;
            this.autoCloseTimeout = -1L;
            this.migrationContainer = new MigrationContainer();
            this.migrationsNotRequiredFrom = new LinkedHashSet();
            this.migrationStartAndEndVersions = new LinkedHashSet();
            this.autoMigrationSpecs = new ArrayList();
            this.requireMigration = true;
            this.inMemoryTrackingTableMode = true;
            this.klass = JvmClassMappingKt.getKotlinClass(klass);
            this.context = context;
            this.name = str;
            this.factory = null;
        }

        public Builder J2(SupportSQLiteOpenHelper.Factory factory) {
            this.supportOpenHelperFactory = factory;
            return this;
        }

        public Builder Uo(Executor executor) {
            Intrinsics.checkNotNullParameter(executor, "executor");
            if (this.queryCoroutineContext != null) {
                throw new IllegalArgumentException("This builder has already been configured with a CoroutineContext. A RoomDatabasecan only be configured with either an Executor or a CoroutineContext.");
            }
            this.queryExecutor = executor;
            return this;
        }

        public Builder n(Callback callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.callbacks.add(callback);
            return this;
        }

        public RoomDatabase nr() {
            SupportSQLiteOpenHelper.Factory queryInterceptorOpenHelperFactory;
            SupportSQLiteOpenHelper.Factory factory;
            RoomDatabase roomDatabase;
            CoroutineContext coroutineContextRl;
            Executor executor = this.queryExecutor;
            if (executor == null && this.transactionExecutor == null) {
                Executor executorUo = ArchTaskExecutor.Uo();
                this.transactionExecutor = executorUo;
                this.queryExecutor = executorUo;
            } else if (executor != null && this.transactionExecutor == null) {
                this.transactionExecutor = executor;
            } else if (executor == null) {
                this.queryExecutor = this.transactionExecutor;
            }
            RoomDatabaseKt.t(this.migrationStartAndEndVersions, this.migrationsNotRequiredFrom);
            SQLiteDriver sQLiteDriver = this.driver;
            if (sQLiteDriver == null && this.supportOpenHelperFactory == null) {
                queryInterceptorOpenHelperFactory = new FrameworkSQLiteOpenHelperFactory();
            } else if (sQLiteDriver == null) {
                queryInterceptorOpenHelperFactory = this.supportOpenHelperFactory;
            } else {
                if (this.supportOpenHelperFactory != null) {
                    throw new IllegalArgumentException("A RoomDatabase cannot be configured with both a SQLiteDriver and a SupportOpenHelper.Factory.");
                }
                queryInterceptorOpenHelperFactory = null;
            }
            boolean z2 = this.autoCloseTimeout > 0;
            boolean z3 = (this.copyFromAssetPath == null && this.copyFromFile == null && this.copyFromInputStream == null) ? false : true;
            boolean z4 = this.queryCallback != null;
            if (queryInterceptorOpenHelperFactory != null) {
                if (z2) {
                    if (this.name == null) {
                        throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
                    }
                    long j2 = this.autoCloseTimeout;
                    TimeUnit timeUnit = this.autoCloseTimeUnit;
                    if (timeUnit == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    queryInterceptorOpenHelperFactory = new AutoClosingRoomOpenHelperFactory(queryInterceptorOpenHelperFactory, new AutoCloser(j2, timeUnit, null, 4, null));
                }
                if (z3) {
                    if (this.name == null) {
                        throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
                    }
                    String str = this.copyFromAssetPath;
                    int i2 = str == null ? 0 : 1;
                    File file = this.copyFromFile;
                    int i3 = file == null ? 0 : 1;
                    Callable callable = this.copyFromInputStream;
                    if (i2 + i3 + (callable != null ? 1 : 0) != 1) {
                        throw new IllegalArgumentException("More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations.");
                    }
                    queryInterceptorOpenHelperFactory = new PrePackagedCopyOpenHelperFactory(str, file, callable, queryInterceptorOpenHelperFactory);
                }
                if (z4) {
                    Executor executor2 = this.queryCallbackExecutor;
                    if ((executor2 == null || (coroutineContextRl = R6.rl(executor2)) == null) && (coroutineContextRl = this.queryCallbackCoroutineContext) == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    vd vdVarN = Lu.n(coroutineContextRl);
                    QueryCallback queryCallback = this.queryCallback;
                    if (queryCallback == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    queryInterceptorOpenHelperFactory = new QueryInterceptorOpenHelperFactory(queryInterceptorOpenHelperFactory, vdVarN, queryCallback);
                }
                factory = queryInterceptorOpenHelperFactory;
            } else {
                factory = null;
            }
            if (factory == null) {
                if (z2) {
                    throw new IllegalArgumentException("Auto Closing Database is not supported when an SQLiteDriver is configured.");
                }
                if (z3) {
                    throw new IllegalArgumentException("Pre-Package Database is not supported when an SQLiteDriver is configured.");
                }
                if (z4) {
                    throw new IllegalArgumentException("Query Callback is not supported when an SQLiteDriver is configured.");
                }
            }
            Context context = this.context;
            String str2 = this.name;
            MigrationContainer migrationContainer = this.migrationContainer;
            List list = this.callbacks;
            boolean z5 = this.allowMainThreadQueries;
            JournalMode journalModeRl = this.journalMode.rl(context);
            Executor executor3 = this.queryExecutor;
            if (executor3 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Executor executor4 = this.transactionExecutor;
            if (executor4 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            DatabaseConfiguration databaseConfiguration = new DatabaseConfiguration(context, str2, factory, migrationContainer, list, z5, journalModeRl, executor3, executor4, this.multiInstanceInvalidationIntent, this.requireMigration, this.allowDestructiveMigrationOnDowngrade, this.migrationsNotRequiredFrom, this.copyFromAssetPath, this.copyFromFile, this.copyFromInputStream, this.prepackagedDatabaseCallback, this.typeConverters, this.autoMigrationSpecs, this.allowDestructiveMigrationForAllTables, this.driver, this.queryCoroutineContext);
            databaseConfiguration.J2(this.inMemoryTrackingTableMode);
            Function0 function0 = this.factory;
            if (function0 == null || (roomDatabase = (RoomDatabase) function0.invoke()) == null) {
                roomDatabase = (RoomDatabase) KClassUtil.rl(JvmClassMappingKt.getJavaClass(this.klass), null, 2, null);
            }
            roomDatabase.nHg(databaseConfiguration);
            return roomDatabase;
        }

        public Builder rl(Migration... migrations) {
            Intrinsics.checkNotNullParameter(migrations, "migrations");
            for (Migration migration : migrations) {
                this.migrationStartAndEndVersions.add(Integer.valueOf(migration.startVersion));
                this.migrationStartAndEndVersions.add(Integer.valueOf(migration.endVersion));
            }
            this.migrationContainer.rl((Migration[]) Arrays.copyOf(migrations, migrations.length));
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000e\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\bJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Landroidx/room/RoomDatabase$Callback;", "", "<init>", "()V", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "db", "", "rl", "(Landroidx/sqlite/db/SupportSQLiteDatabase;)V", "Landroidx/sqlite/SQLiteConnection;", "connection", c.f62177j, "(Landroidx/sqlite/SQLiteConnection;)V", "nr", "t", "J2", "O", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Callback {
        public void J2(SupportSQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
        }

        public void nr(SupportSQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
        }

        public void rl(SupportSQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
        }

        public void O(SQLiteConnection connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            if (connection instanceof SupportSQLiteConnection) {
                J2(((SupportSQLiteConnection) connection).getDb());
            }
        }

        public void n(SQLiteConnection connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            if (connection instanceof SupportSQLiteConnection) {
                rl(((SupportSQLiteConnection) connection).getDb());
            }
        }

        public void t(SQLiteConnection connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            if (connection instanceof SupportSQLiteConnection) {
                nr(((SupportSQLiteConnection) connection).getDb());
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Landroidx/room/RoomDatabase$JournalMode;", "", "<init>", "(Ljava/lang/String;I)V", "Landroid/content/Context;", "context", "rl", "(Landroid/content/Context;)Landroidx/room/RoomDatabase$JournalMode;", c.f62177j, "t", "O", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class JournalMode {
        private static final /* synthetic */ JournalMode[] J2;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f41378r;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final JournalMode f41377n = new JournalMode("AUTOMATIC", 0);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final JournalMode f41379t = new JournalMode("TRUNCATE", 1);

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public static final JournalMode f41376O = new JournalMode("WRITE_AHEAD_LOGGING", 2);

        private static final /* synthetic */ JournalMode[] n() {
            return new JournalMode[]{f41377n, f41379t, f41376O};
        }

        static {
            JournalMode[] journalModeArrN = n();
            J2 = journalModeArrN;
            f41378r = EnumEntriesKt.enumEntries(journalModeArrN);
        }

        public static JournalMode valueOf(String str) {
            return (JournalMode) Enum.valueOf(JournalMode.class, str);
        }

        public static JournalMode[] values() {
            return (JournalMode[]) J2.clone();
        }

        public final JournalMode rl(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (this != f41377n) {
                return this;
            }
            Object systemService = context.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            return (activityManager == null || activityManager.isLowRamDevice()) ? f41379t : f41376O;
        }

        private JournalMode(String str, int i2) {
        }
    }

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u00020\u00072\u0012\u0010\u0006\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u0004\"\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u000f\u001a\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\r0\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00132\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u001aJ7\u0010\u001e\u001a\"\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u001d\u0018\u00010\u001c2\u0006\u0010\u001b\u001a\u00020\u000eH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ7\u0010 \u001a\"\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\r\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u001d\u0018\u00010\u001c2\u0006\u0010\u001b\u001a\u00020\u000eH\u0000¢\u0006\u0004\b \u0010\u001fR,\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\"0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010#¨\u0006$"}, d2 = {"Landroidx/room/RoomDatabase$MigrationContainer;", "", "<init>", "()V", "", "Landroidx/room/migration/Migration;", "migrations", "", "rl", "([Landroidx/room/migration/Migration;)V", "migration", c.f62177j, "(Landroidx/room/migration/Migration;)V", "", "", "O", "()Ljava/util/Map;", TtmlNode.START, TtmlNode.END, "", "nr", "(II)Ljava/util/List;", "startVersion", "endVersion", "", "t", "(II)Z", "migrationStart", "Lkotlin/Pair;", "", "Uo", "(I)Lkotlin/Pair;", "J2", "", "Ljava/util/TreeMap;", "Ljava/util/Map;", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nRoomDatabase.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomDatabase.android.kt\nandroidx/room/RoomDatabase$MigrationContainer\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,2151:1\n13402#2,2:2152\n1863#3,2:2154\n381#4,7:2156\n*S KotlinDebug\n*F\n+ 1 RoomDatabase.android.kt\nandroidx/room/RoomDatabase$MigrationContainer\n*L\n1788#1:2152,2\n1798#1:2154,2\n1811#1:2156,7\n*E\n"})
    public static class MigrationContainer {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final Map migrations = new LinkedHashMap();

        public final Pair J2(int migrationStart) {
            TreeMap treeMap = (TreeMap) this.migrations.get(Integer.valueOf(migrationStart));
            if (treeMap == null) {
                return null;
            }
            return TuplesKt.to(treeMap, treeMap.descendingKeySet());
        }

        /* JADX INFO: renamed from: O, reason: from getter */
        public Map getMigrations() {
            return this.migrations;
        }

        public final Pair Uo(int migrationStart) {
            TreeMap treeMap = (TreeMap) this.migrations.get(Integer.valueOf(migrationStart));
            if (treeMap == null) {
                return null;
            }
            return TuplesKt.to(treeMap, treeMap.keySet());
        }

        public final void n(Migration migration) {
            Intrinsics.checkNotNullParameter(migration, "migration");
            int i2 = migration.startVersion;
            int i3 = migration.endVersion;
            Map map = this.migrations;
            Integer numValueOf = Integer.valueOf(i2);
            Object treeMap = map.get(numValueOf);
            if (treeMap == null) {
                treeMap = new TreeMap();
                map.put(numValueOf, treeMap);
            }
            TreeMap treeMap2 = (TreeMap) treeMap;
            if (treeMap2.containsKey(Integer.valueOf(i3))) {
                Log.w("ROOM", "Overriding migration " + treeMap2.get(Integer.valueOf(i3)) + " with " + migration);
            }
            treeMap2.put(Integer.valueOf(i3), migration);
        }

        public void rl(Migration... migrations) {
            Intrinsics.checkNotNullParameter(migrations, "migrations");
            for (Migration migration : migrations) {
                n(migration);
            }
        }

        public List nr(int start, int end) {
            return MigrationUtil.rl(this, start, end);
        }

        public final boolean t(int startVersion, int endVersion) {
            return MigrationUtil.n(this, startVersion, endVersion);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/room/RoomDatabase$PrepackagedDatabaseCallback;", "", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "db", "", c.f62177j, "(Landroidx/sqlite/db/SupportSQLiteDatabase;)V", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class PrepackagedDatabaseCallback {
        public void n(SupportSQLiteDatabase db) {
            Intrinsics.checkNotNullParameter(db, "db");
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Landroidx/room/RoomDatabase$QueryCallback;", "", "", "sqlQuery", "", "bindArgs", "", c.f62177j, "(Ljava/lang/String;Ljava/util/List;)V", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface QueryCallback {
        void n(String sqlQuery, List bindArgs);
    }

    protected abstract InvalidationTracker HI();

    /* JADX INFO: Access modifiers changed from: private */
    public static final SupportSQLiteOpenHelper az(RoomDatabase roomDatabase, DatabaseConfiguration config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return roomDatabase.Ik(config);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void jB() {
        vd vdVar = this.coroutineScope;
        RoomConnectionManager roomConnectionManager = null;
        if (vdVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coroutineScope");
            vdVar = null;
        }
        Lu.O(vdVar, null, 1, null);
        WPU().iF();
        RoomConnectionManager roomConnectionManager2 = this.connectionManager;
        if (roomConnectionManager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("connectionManager");
        } else {
            roomConnectionManager = roomConnectionManager2;
        }
        roomConnectionManager.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit mUb(RoomDatabase roomDatabase, SupportSQLiteDatabase it) {
        Intrinsics.checkNotNullParameter(it, "it");
        roomDatabase.s7N();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(RoomDatabase roomDatabase, SupportSQLiteDatabase it) {
        Intrinsics.checkNotNullParameter(it, "it");
        roomDatabase.wTp();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: E2, reason: from getter */
    public final ThreadLocal getSuspendingTransactionId() {
        return this.suspendingTransactionId;
    }

    protected SupportSQLiteOpenHelper Ik(DatabaseConfiguration config) {
        Intrinsics.checkNotNullParameter(config, "config");
        throw new NotImplementedError(null, 1, null);
    }

    public final void J2(KClass kclass, Object converter) {
        Intrinsics.checkNotNullParameter(kclass, "kclass");
        Intrinsics.checkNotNullParameter(converter, "converter");
        this.typeConverters.put(kclass, converter);
    }

    public final Object M7(boolean z2, Function2 function2, Continuation continuation) {
        RoomConnectionManager roomConnectionManager = this.connectionManager;
        if (roomConnectionManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("connectionManager");
            roomConnectionManager = null;
        }
        return roomConnectionManager.s7N(z2, function2, continuation);
    }

    public final vd S() {
        vd vdVar = this.coroutineScope;
        if (vdVar != null) {
            return vdVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("coroutineScope");
        return null;
    }

    public final boolean T() {
        RoomConnectionManager roomConnectionManager = this.connectionManager;
        if (roomConnectionManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("connectionManager");
            roomConnectionManager = null;
        }
        return roomConnectionManager.X() != null;
    }

    public Cursor U(SupportSQLiteQuery query, CancellationSignal signal) {
        Intrinsics.checkNotNullParameter(query, "query");
        Uo();
        KN();
        return signal != null ? aYN().getWritableDatabase().aYN(query, signal) : aYN().getWritableDatabase().P5(query);
    }

    public void Uo() {
        if (!this.allowMainThreadQueries && bzg()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final CoroutineContext ViF() {
        vd vdVar = this.coroutineScope;
        if (vdVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coroutineScope");
            vdVar = null;
        }
        return vdVar.getCoroutineContext();
    }

    public InvalidationTracker WPU() {
        InvalidationTracker invalidationTracker = this.internalTracker;
        if (invalidationTracker != null) {
            return invalidationTracker;
        }
        Intrinsics.throwUninitializedPropertyAccessException("internalTracker");
        return null;
    }

    /* JADX INFO: renamed from: X, reason: from getter */
    public final boolean getUseTempTrackingTable() {
        return this.useTempTrackingTable;
    }

    /* JADX INFO: renamed from: XQ, reason: from getter */
    public final CloseBarrier getCloseBarrier() {
        return this.closeBarrier;
    }

    public final boolean Xw() {
        RoomConnectionManager roomConnectionManager = this.connectionManager;
        if (roomConnectionManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("connectionManager");
            roomConnectionManager = null;
        }
        return roomConnectionManager.nHg();
    }

    public List Z(Map autoMigrationSpecs) {
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        return CollectionsKt.emptyList();
    }

    public SupportSQLiteOpenHelper aYN() {
        RoomConnectionManager roomConnectionManager = this.connectionManager;
        if (roomConnectionManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("connectionManager");
            roomConnectionManager = null;
        }
        SupportSQLiteOpenHelper supportSQLiteOpenHelperX = roomConnectionManager.X();
        if (supportSQLiteOpenHelperX != null) {
            return supportSQLiteOpenHelperX;
        }
        throw new IllegalStateException("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
    }

    protected RoomOpenDelegateMarker ck() {
        throw new NotImplementedError(null, 1, null);
    }

    public final CoroutineContext e() {
        CoroutineContext coroutineContext = this.transactionContext;
        if (coroutineContext != null) {
            return coroutineContext;
        }
        Intrinsics.throwUninitializedPropertyAccessException("transactionContext");
        return null;
    }

    public SupportSQLiteStatement gh(String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        Uo();
        KN();
        return aYN().getWritableDatabase().piY(sql);
    }

    public void nHg(DatabaseConfiguration configuration) {
        CoroutineContext coroutineContext;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.useTempTrackingTable = configuration.getUseTempTrackingTable();
        this.connectionManager = ty(configuration);
        this.internalTracker = HI();
        RoomDatabaseKt.rl(this, configuration);
        RoomDatabaseKt.nr(this, configuration);
        CoroutineContext coroutineContext2 = configuration.queryCoroutineContext;
        vd vdVar = null;
        if (coroutineContext2 != null) {
            CoroutineContext.Element element = coroutineContext2.get(ContinuationInterceptor.INSTANCE);
            Intrinsics.checkNotNull(element, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
            lej lejVar = (lej) element;
            Executor executorN = R6.n(lejVar);
            this.internalQueryExecutor = executorN;
            if (executorN == null) {
                Intrinsics.throwUninitializedPropertyAccessException("internalQueryExecutor");
                executorN = null;
            }
            this.internalTransactionExecutor = new TransactionExecutor(executorN);
            this.coroutineScope = Lu.n(configuration.queryCoroutineContext.plus(N.n((xuv) configuration.queryCoroutineContext.get(xuv.nr))));
            if (T()) {
                vd vdVar2 = this.coroutineScope;
                if (vdVar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("coroutineScope");
                    vdVar2 = null;
                }
                coroutineContext = vdVar2.getCoroutineContext().plus(lejVar.GD(1));
            } else {
                vd vdVar3 = this.coroutineScope;
                if (vdVar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("coroutineScope");
                    vdVar3 = null;
                }
                coroutineContext = vdVar3.getCoroutineContext();
            }
            this.transactionContext = coroutineContext;
        } else {
            this.internalQueryExecutor = configuration.queryExecutor;
            this.internalTransactionExecutor = new TransactionExecutor(configuration.transactionExecutor);
            Executor executor = this.internalQueryExecutor;
            if (executor == null) {
                Intrinsics.throwUninitializedPropertyAccessException("internalQueryExecutor");
                executor = null;
            }
            vd vdVarN = Lu.n(R6.rl(executor).plus(N.rl(null, 1, null)));
            this.coroutineScope = vdVarN;
            if (vdVarN == null) {
                Intrinsics.throwUninitializedPropertyAccessException("coroutineScope");
                vdVarN = null;
            }
            CoroutineContext coroutineContext3 = vdVarN.getCoroutineContext();
            Executor executor2 = this.internalTransactionExecutor;
            if (executor2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("internalTransactionExecutor");
                executor2 = null;
            }
            this.transactionContext = coroutineContext3.plus(R6.rl(executor2));
        }
        this.allowMainThreadQueries = configuration.allowMainThreadQueries;
        RoomConnectionManager roomConnectionManager = this.connectionManager;
        if (roomConnectionManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("connectionManager");
            roomConnectionManager = null;
        }
        SupportSQLiteOpenHelper supportSQLiteOpenHelperX = roomConnectionManager.X();
        if (supportSQLiteOpenHelperX != null) {
            while (!(supportSQLiteOpenHelperX instanceof PrePackagedCopyOpenHelper)) {
                if (!(supportSQLiteOpenHelperX instanceof DelegatingOpenHelper)) {
                    supportSQLiteOpenHelperX = null;
                    break;
                }
                supportSQLiteOpenHelperX = ((DelegatingOpenHelper) supportSQLiteOpenHelperX).getDelegate();
            }
        } else {
            supportSQLiteOpenHelperX = null;
            break;
        }
        PrePackagedCopyOpenHelper prePackagedCopyOpenHelper = (PrePackagedCopyOpenHelper) supportSQLiteOpenHelperX;
        if (prePackagedCopyOpenHelper != null) {
            prePackagedCopyOpenHelper.Z(configuration);
        }
        RoomConnectionManager roomConnectionManager2 = this.connectionManager;
        if (roomConnectionManager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("connectionManager");
            roomConnectionManager2 = null;
        }
        SupportSQLiteOpenHelper supportSQLiteOpenHelperX2 = roomConnectionManager2.X();
        if (supportSQLiteOpenHelperX2 != null) {
            while (!(supportSQLiteOpenHelperX2 instanceof AutoClosingRoomOpenHelper)) {
                if (!(supportSQLiteOpenHelperX2 instanceof DelegatingOpenHelper)) {
                    supportSQLiteOpenHelperX2 = null;
                    break;
                }
                supportSQLiteOpenHelperX2 = ((DelegatingOpenHelper) supportSQLiteOpenHelperX2).getDelegate();
            }
        } else {
            supportSQLiteOpenHelperX2 = null;
            break;
        }
        AutoClosingRoomOpenHelper autoClosingRoomOpenHelper = (AutoClosingRoomOpenHelper) supportSQLiteOpenHelperX2;
        if (autoClosingRoomOpenHelper != null) {
            this.autoCloser = autoClosingRoomOpenHelper.getAutoCloser();
            AutoCloser autoCloserN = autoClosingRoomOpenHelper.getAutoCloser();
            vd vdVar4 = this.coroutineScope;
            if (vdVar4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("coroutineScope");
            } else {
                vdVar = vdVar4;
            }
            autoCloserN.gh(vdVar);
            WPU().te(autoClosingRoomOpenHelper.getAutoCloser());
        }
        if (configuration.multiInstanceInvalidationServiceIntent != null) {
            if (configuration.name == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            WPU().Ik(configuration.context, configuration.name, configuration.multiInstanceInvalidationServiceIntent);
        }
    }

    public List qie(Map autoMigrationSpecs) {
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(autoMigrationSpecs.size()));
        for (Map.Entry entry : autoMigrationSpecs.entrySet()) {
            linkedHashMap.put(JvmClassMappingKt.getJavaClass((KClass) entry.getKey()), entry.getValue());
        }
        return Z(linkedHashMap);
    }

    public void r() {
        AutoCloser autoCloser = this.autoCloser;
        if (autoCloser == null) {
            wTp();
        } else {
            autoCloser.KN(new Function1() { // from class: androidx.room.Wre
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RoomDatabase.o(this.f41525n, (SupportSQLiteDatabase) obj);
                }
            });
        }
    }

    protected void rV9(SupportSQLiteDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        v(new SupportSQLiteConnection(db));
    }

    public final RoomConnectionManager ty(DatabaseConfiguration configuration) {
        RoomOpenDelegate roomOpenDelegate;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        try {
            RoomOpenDelegateMarker roomOpenDelegateMarkerCk = ck();
            Intrinsics.checkNotNull(roomOpenDelegateMarkerCk, "null cannot be cast to non-null type androidx.room.RoomOpenDelegate");
            roomOpenDelegate = (RoomOpenDelegate) roomOpenDelegateMarkerCk;
        } catch (NotImplementedError unused) {
            roomOpenDelegate = null;
        }
        return roomOpenDelegate == null ? new RoomConnectionManager(configuration, new Function1() { // from class: androidx.room.CN3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RoomDatabase.az(this.f41267n, (DatabaseConfiguration) obj);
            }
        }) : new RoomConnectionManager(configuration, roomOpenDelegate);
    }

    protected final void v(SQLiteConnection connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        WPU().r(connection);
    }

    private final void s7N() {
        Uo();
        SupportSQLiteDatabase writableDatabase = aYN().getWritableDatabase();
        if (!writableDatabase.i()) {
            WPU().E2();
        }
        if (writableDatabase.lLA()) {
            writableDatabase.X();
        } else {
            writableDatabase.az();
        }
    }

    private final void wTp() {
        aYN().getWritableDatabase().v();
        if (!N()) {
            WPU().ViF();
        }
    }

    public void KN() {
        if (T() && !N() && this.suspendingTransactionId.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public boolean N() {
        if (Xw() && aYN().getWritableDatabase().i()) {
            return true;
        }
        return false;
    }

    public void P5() {
        aYN().getWritableDatabase().E2();
    }

    public final boolean bzg() {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return true;
        }
        return false;
    }

    protected Map fD() {
        return MapsKt.emptyMap();
    }

    public Set g() {
        return SetsKt.emptySet();
    }

    public final Map iF() {
        return te();
    }

    public Set nY() {
        Set setG = g();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(setG, 10));
        Iterator it = setG.iterator();
        while (it.hasNext()) {
            arrayList.add(JvmClassMappingKt.getKotlinClass((Class) it.next()));
        }
        return CollectionsKt.toSet(arrayList);
    }

    protected Map te() {
        Set<Map.Entry> setEntrySet = fD().entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
        for (Map.Entry entry : setEntrySet) {
            Class cls = (Class) entry.getKey();
            List list = (List) entry.getValue();
            KClass kotlinClass = JvmClassMappingKt.getKotlinClass(cls);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(JvmClassMappingKt.getKotlinClass((Class) it.next()));
            }
            Pair pair = TuplesKt.to(kotlinClass, arrayList);
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }

    public void xMQ() {
        Uo();
        AutoCloser autoCloser = this.autoCloser;
        if (autoCloser == null) {
            s7N();
        } else {
            autoCloser.KN(new Function1() { // from class: androidx.room.fuX
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RoomDatabase.mUb(this.f41662n, (SupportSQLiteDatabase) obj);
                }
            });
        }
    }
}
