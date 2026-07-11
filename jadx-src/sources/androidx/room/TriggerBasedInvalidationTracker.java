package androidx.room;

import GJW.rv6;
import androidx.room.concurrent.CloseBarrier;
import androidx.sqlite.SQLite;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jdk7.AutoCloseableKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 !2\u00020\u0001:\u0001VBo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\u0004\u0012\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0018\u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0007\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\t2\u000e\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u001b\u0010\u001aJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0007H\u0082@¢\u0006\u0004\b\u001c\u0010\u001dJ\u001e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00072\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020 ¢\u0006\u0004\b!\u0010\"J1\u0010%\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\t\u0012\u0004\u0012\u00020$0#2\u000e\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\tH\u0000¢\u0006\u0004\b%\u0010&J\u0017\u0010(\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020$H\u0000¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u000b2\u0006\u0010'\u001a\u00020$H\u0000¢\u0006\u0004\b*\u0010)J\u0010\u0010+\u001a\u00020\u000fH\u0080@¢\u0006\u0004\b+\u0010\u001dJ@\u00100\u001a\u00020\u000b2\u000e\u0010,\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\t2\u000e\b\u0002\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000f0-2\u000e\b\u0002\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000f0-H\u0080@¢\u0006\u0004\b0\u00101J/\u00102\u001a\u00020\u000f2\u000e\b\u0002\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000f0-2\u000e\b\u0002\u0010/\u001a\b\u0012\u0004\u0012\u00020\u000f0-H\u0000¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u000fH\u0000¢\u0006\u0004\b4\u00105R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R&\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00109R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010\u0014R&\u0010\u0010\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u0007\u0012\u0004\u0012\u00020\u000f0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R \u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00109R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010F\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010J\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0018\u0010N\u001a\u00060Kj\u0002`L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010MR(\u0010U\u001a\b\u0012\u0004\u0012\u00020\u000b0-8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010T¨\u0006W"}, d2 = {"Landroidx/room/TriggerBasedInvalidationTracker;", "", "Landroidx/room/RoomDatabase;", "database", "", "", "shadowTablesMap", "", "viewTables", "", "tableNames", "", "useTempTable", "Lkotlin/Function1;", "", "", "onInvalidatedTablesIds", "<init>", "(Landroidx/room/RoomDatabase;Ljava/util/Map;Ljava/util/Map;[Ljava/lang/String;ZLkotlin/jvm/functions/Function1;)V", "names", "Z", "([Ljava/lang/String;)[Ljava/lang/String;", "Landroidx/room/PooledConnection;", "connection", "tableId", "S", "(Landroidx/room/PooledConnection;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "WPU", "az", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "mUb", "(Landroidx/room/PooledConnection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/sqlite/SQLiteConnection;", "qie", "(Landroidx/sqlite/SQLiteConnection;)V", "Lkotlin/Pair;", "", "ViF", "([Ljava/lang/String;)Lkotlin/Pair;", "tableIds", "HI", "([I)Z", "ck", "aYN", "tables", "Lkotlin/Function0;", "onRefreshScheduled", "onRefreshCompleted", "Ik", "([Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "r", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "o", "()V", c.f62177j, "Landroidx/room/RoomDatabase;", "rl", "Ljava/util/Map;", "t", "nr", "O", "Lkotlin/jvm/functions/Function1;", "J2", "tableIdLookup", "Uo", "[Ljava/lang/String;", "tablesNames", "Landroidx/room/ObservedTableStates;", "KN", "Landroidx/room/ObservedTableStates;", "observedTableStates", "Landroidx/room/ObservedTableVersions;", "xMQ", "Landroidx/room/ObservedTableVersions;", "observedTableVersions", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Landroidx/room/concurrent/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "pendingRefresh", "gh", "Lkotlin/jvm/functions/Function0;", "getOnAllowRefresh$room_runtime_release", "()Lkotlin/jvm/functions/Function0;", "XQ", "(Lkotlin/jvm/functions/Function0;)V", "onAllowRefresh", "Companion", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nInvalidationTracker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/TriggerBasedInvalidationTracker\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 CloseBarrier.kt\nandroidx/room/concurrent/CloseBarrierKt\n*L\n1#1,604:1\n216#2,2:605\n13402#3:607\n13403#3:609\n12597#3,2:621\n1#4:608\n37#5:610\n36#5,3:611\n99#6,7:614\n99#6,5:623\n*S KotlinDebug\n*F\n+ 1 InvalidationTracker.kt\nandroidx/room/TriggerBasedInvalidationTracker\n*L\n185#1:605,2\n283#1:607\n283#1:609\n369#1:621,2\n287#1:610\n287#1:611,3\n299#1:614,7\n402#1:623,5\n*E\n"})
public final class TriggerBasedInvalidationTracker {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final Map tableIdLookup;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final ObservedTableStates observedTableStates;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final Function1 onInvalidatedTablesIds;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final String[] tablesNames;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private Function0 onAllowRefresh;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private final AtomicBoolean pendingRefresh;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final RoomDatabase database;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final boolean useTempTable;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final Map shadowTablesMap;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Map viewTables;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final ObservedTableVersions observedTableVersions;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String[] az = {"INSERT", "UPDATE", "DELETE"};

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0014\u0010\u0011\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\rR\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\r¨\u0006\u0014"}, d2 = {"Landroidx/room/TriggerBasedInvalidationTracker$Companion;", "", "<init>", "()V", "", "tableName", "triggerType", "rl", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "TRIGGERS", "[Ljava/lang/String;", "UPDATE_TABLE_NAME", "Ljava/lang/String;", "TABLE_ID_COLUMN_NAME", "INVALIDATED_COLUMN_NAME", "CREATE_TRACKING_TABLE_SQL", "DROP_TRACKING_TABLE_SQL", "SELECT_UPDATED_TABLES_SQL", "RESET_UPDATED_TABLES_SQL", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String rl(String tableName, String triggerType) {
            return "room_table_modification_trigger_" + tableName + '_' + triggerType;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ty() {
        return true;
    }

    public TriggerBasedInvalidationTracker(RoomDatabase database, Map shadowTablesMap, Map viewTables, String[] tableNames, boolean z2, Function1 onInvalidatedTablesIds) {
        String lowerCase;
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(shadowTablesMap, "shadowTablesMap");
        Intrinsics.checkNotNullParameter(viewTables, "viewTables");
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        Intrinsics.checkNotNullParameter(onInvalidatedTablesIds, "onInvalidatedTablesIds");
        this.database = database;
        this.shadowTablesMap = shadowTablesMap;
        this.viewTables = viewTables;
        this.useTempTable = z2;
        this.onInvalidatedTablesIds = onInvalidatedTablesIds;
        this.pendingRefresh = new AtomicBoolean(false);
        this.onAllowRefresh = new Function0() { // from class: androidx.room.Pl
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(TriggerBasedInvalidationTracker.ty());
            }
        };
        this.tableIdLookup = new LinkedHashMap();
        int length = tableNames.length;
        String[] strArr = new String[length];
        for (int i2 = 0; i2 < length; i2++) {
            String str = tableNames[i2];
            Locale locale = Locale.ROOT;
            String lowerCase2 = str.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            this.tableIdLookup.put(lowerCase2, Integer.valueOf(i2));
            String str2 = (String) this.shadowTablesMap.get(tableNames[i2]);
            if (str2 != null) {
                lowerCase = str2.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            } else {
                lowerCase = null;
            }
            if (lowerCase != null) {
                lowerCase2 = lowerCase;
            }
            strArr[i2] = lowerCase2;
        }
        this.tablesNames = strArr;
        for (Map.Entry entry : this.shadowTablesMap.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.ROOT;
            String lowerCase3 = str3.toLowerCase(locale2);
            Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
            if (this.tableIdLookup.containsKey(lowerCase3)) {
                String lowerCase4 = ((String) entry.getKey()).toLowerCase(locale2);
                Intrinsics.checkNotNullExpressionValue(lowerCase4, "toLowerCase(...)");
                Map map = this.tableIdLookup;
                map.put(lowerCase4, MapsKt.getValue(map, lowerCase3));
            }
        }
        this.observedTableStates = new ObservedTableStates(this.tablesNames.length);
        this.observedTableVersions = new ObservedTableVersions(this.tablesNames.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ff, code lost:
    
        if (androidx.room.TransactorKt.rl(r11, r3, r4) == r5) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00ff -> B:29:0x0102). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object S(PooledConnection pooledConnection, int i2, Continuation continuation) {
        TriggerBasedInvalidationTracker$startTrackingTable$1 triggerBasedInvalidationTracker$startTrackingTable$1;
        TriggerBasedInvalidationTracker triggerBasedInvalidationTracker;
        String[] strArr;
        TriggerBasedInvalidationTracker triggerBasedInvalidationTracker2;
        int i3;
        int i5;
        PooledConnection pooledConnection2;
        int length;
        String str;
        PooledConnection pooledConnection3 = pooledConnection;
        int i7 = i2;
        if (continuation instanceof TriggerBasedInvalidationTracker$startTrackingTable$1) {
            triggerBasedInvalidationTracker$startTrackingTable$1 = (TriggerBasedInvalidationTracker$startTrackingTable$1) continuation;
            int i8 = triggerBasedInvalidationTracker$startTrackingTable$1.E2;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                triggerBasedInvalidationTracker$startTrackingTable$1.E2 = i8 - Integer.MIN_VALUE;
            } else {
                triggerBasedInvalidationTracker$startTrackingTable$1 = new TriggerBasedInvalidationTracker$startTrackingTable$1(this, continuation);
            }
        }
        Object obj = triggerBasedInvalidationTracker$startTrackingTable$1.f41496S;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i9 = triggerBasedInvalidationTracker$startTrackingTable$1.E2;
        boolean z2 = true;
        if (i9 == 0) {
            ResultKt.throwOnFailure(obj);
            String str2 = "INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i7 + ", 0)";
            triggerBasedInvalidationTracker$startTrackingTable$1.f41499n = this;
            triggerBasedInvalidationTracker$startTrackingTable$1.f41502t = pooledConnection3;
            triggerBasedInvalidationTracker$startTrackingTable$1.f41501r = i7;
            triggerBasedInvalidationTracker$startTrackingTable$1.E2 = 1;
            if (TransactorKt.rl(pooledConnection3, str2, triggerBasedInvalidationTracker$startTrackingTable$1) != coroutine_suspended) {
                triggerBasedInvalidationTracker = this;
            }
            return coroutine_suspended;
        }
        if (i9 == 1) {
            int i10 = triggerBasedInvalidationTracker$startTrackingTable$1.f41501r;
            PooledConnection pooledConnection4 = (PooledConnection) triggerBasedInvalidationTracker$startTrackingTable$1.f41502t;
            triggerBasedInvalidationTracker = (TriggerBasedInvalidationTracker) triggerBasedInvalidationTracker$startTrackingTable$1.f41499n;
            ResultKt.throwOnFailure(obj);
            i7 = i10;
            pooledConnection3 = pooledConnection4;
        } else {
            if (i9 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            length = triggerBasedInvalidationTracker$startTrackingTable$1.f41497Z;
            i5 = triggerBasedInvalidationTracker$startTrackingTable$1.f41500o;
            i3 = triggerBasedInvalidationTracker$startTrackingTable$1.f41501r;
            strArr = (String[]) triggerBasedInvalidationTracker$startTrackingTable$1.J2;
            str = (String) triggerBasedInvalidationTracker$startTrackingTable$1.f41495O;
            pooledConnection2 = (PooledConnection) triggerBasedInvalidationTracker$startTrackingTable$1.f41502t;
            triggerBasedInvalidationTracker2 = (TriggerBasedInvalidationTracker) triggerBasedInvalidationTracker$startTrackingTable$1.f41499n;
            ResultKt.throwOnFailure(obj);
            boolean z3 = true;
            i5++;
            z2 = z3;
            if (i5 < length) {
                return Unit.INSTANCE;
            }
            String str3 = strArr[i5];
            String str4 = triggerBasedInvalidationTracker2.useTempTable ? "TEMP" : "";
            String strRl = INSTANCE.rl(str, str3);
            StringBuilder sb = new StringBuilder();
            z3 = z2;
            sb.append("CREATE ");
            sb.append(str4);
            sb.append(" TRIGGER IF NOT EXISTS `");
            sb.append(strRl);
            sb.append("` AFTER ");
            sb.append(str3);
            sb.append(" ON `");
            sb.append(str);
            sb.append("` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = ");
            sb.append(i3);
            sb.append(" AND invalidated = 0; END");
            String string = sb.toString();
            triggerBasedInvalidationTracker$startTrackingTable$1.f41499n = triggerBasedInvalidationTracker2;
            triggerBasedInvalidationTracker$startTrackingTable$1.f41502t = pooledConnection2;
            triggerBasedInvalidationTracker$startTrackingTable$1.f41495O = str;
            triggerBasedInvalidationTracker$startTrackingTable$1.J2 = strArr;
            triggerBasedInvalidationTracker$startTrackingTable$1.f41501r = i3;
            triggerBasedInvalidationTracker$startTrackingTable$1.f41500o = i5;
            triggerBasedInvalidationTracker$startTrackingTable$1.f41497Z = length;
            triggerBasedInvalidationTracker$startTrackingTable$1.E2 = 2;
        }
        String str5 = triggerBasedInvalidationTracker.tablesNames[i7];
        strArr = az;
        triggerBasedInvalidationTracker2 = triggerBasedInvalidationTracker;
        i3 = i7;
        i5 = 0;
        pooledConnection2 = pooledConnection3;
        length = strArr.length;
        str = str5;
        if (i5 < length) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0085 -> B:20:0x0087). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object WPU(PooledConnection pooledConnection, int i2, Continuation continuation) {
        TriggerBasedInvalidationTracker$stopTrackingTable$1 triggerBasedInvalidationTracker$stopTrackingTable$1;
        int i3;
        PooledConnection pooledConnection2;
        int length;
        String[] strArr;
        String str;
        if (continuation instanceof TriggerBasedInvalidationTracker$stopTrackingTable$1) {
            triggerBasedInvalidationTracker$stopTrackingTable$1 = (TriggerBasedInvalidationTracker$stopTrackingTable$1) continuation;
            int i5 = triggerBasedInvalidationTracker$stopTrackingTable$1.f41504S;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                triggerBasedInvalidationTracker$stopTrackingTable$1.f41504S = i5 - Integer.MIN_VALUE;
            } else {
                triggerBasedInvalidationTracker$stopTrackingTable$1 = new TriggerBasedInvalidationTracker$stopTrackingTable$1(this, continuation);
            }
        }
        Object obj = triggerBasedInvalidationTracker$stopTrackingTable$1.f41507o;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i7 = triggerBasedInvalidationTracker$stopTrackingTable$1.f41504S;
        if (i7 == 0) {
            ResultKt.throwOnFailure(obj);
            String str2 = this.tablesNames[i2];
            String[] strArr2 = az;
            i3 = 0;
            pooledConnection2 = pooledConnection;
            length = strArr2.length;
            strArr = strArr2;
            str = str2;
            if (i3 < length) {
            }
        } else {
            if (i7 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            length = triggerBasedInvalidationTracker$stopTrackingTable$1.f41508r;
            int i8 = triggerBasedInvalidationTracker$stopTrackingTable$1.J2;
            strArr = (String[]) triggerBasedInvalidationTracker$stopTrackingTable$1.f41503O;
            String str3 = (String) triggerBasedInvalidationTracker$stopTrackingTable$1.f41509t;
            PooledConnection pooledConnection3 = (PooledConnection) triggerBasedInvalidationTracker$stopTrackingTable$1.f41506n;
            ResultKt.throwOnFailure(obj);
            str = str3;
            i3 = i8 + 1;
            pooledConnection2 = pooledConnection3;
            if (i3 < length) {
                String str4 = "DROP TRIGGER IF EXISTS `" + INSTANCE.rl(str, strArr[i3]) + '`';
                triggerBasedInvalidationTracker$stopTrackingTable$1.f41506n = pooledConnection2;
                triggerBasedInvalidationTracker$stopTrackingTable$1.f41509t = str;
                triggerBasedInvalidationTracker$stopTrackingTable$1.f41503O = strArr;
                triggerBasedInvalidationTracker$stopTrackingTable$1.J2 = i3;
                triggerBasedInvalidationTracker$stopTrackingTable$1.f41508r = length;
                triggerBasedInvalidationTracker$stopTrackingTable$1.f41504S = 1;
                if (TransactorKt.rl(pooledConnection2, str4, triggerBasedInvalidationTracker$stopTrackingTable$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                pooledConnection3 = pooledConnection2;
                i8 = i3;
                i3 = i8 + 1;
                pooledConnection2 = pooledConnection3;
                if (i3 < length) {
                    return Unit.INSTANCE;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object az(Continuation continuation) throws Throwable {
        TriggerBasedInvalidationTracker$notifyInvalidation$1 triggerBasedInvalidationTracker$notifyInvalidation$1;
        CloseBarrier closeBarrier;
        Throwable th;
        TriggerBasedInvalidationTracker triggerBasedInvalidationTracker;
        if (continuation instanceof TriggerBasedInvalidationTracker$notifyInvalidation$1) {
            triggerBasedInvalidationTracker$notifyInvalidation$1 = (TriggerBasedInvalidationTracker$notifyInvalidation$1) continuation;
            int i2 = triggerBasedInvalidationTracker$notifyInvalidation$1.f41480r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                triggerBasedInvalidationTracker$notifyInvalidation$1.f41480r = i2 - Integer.MIN_VALUE;
            } else {
                triggerBasedInvalidationTracker$notifyInvalidation$1 = new TriggerBasedInvalidationTracker$notifyInvalidation$1(this, continuation);
            }
        }
        Object obj = triggerBasedInvalidationTracker$notifyInvalidation$1.f41478O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = triggerBasedInvalidationTracker$notifyInvalidation$1.f41480r;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            CloseBarrier closeBarrier2 = this.database.getCloseBarrier();
            if (!closeBarrier2.n()) {
                return SetsKt.emptySet();
            }
            try {
                if (!this.pendingRefresh.compareAndSet(true, false)) {
                    Set setEmptySet = SetsKt.emptySet();
                    closeBarrier2.t();
                    return setEmptySet;
                }
                if (!((Boolean) this.onAllowRefresh.invoke()).booleanValue()) {
                    Set setEmptySet2 = SetsKt.emptySet();
                    closeBarrier2.t();
                    return setEmptySet2;
                }
                RoomDatabase roomDatabase = this.database;
                TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1 triggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1 = new TriggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1(this, null);
                triggerBasedInvalidationTracker$notifyInvalidation$1.f41479n = this;
                triggerBasedInvalidationTracker$notifyInvalidation$1.f41481t = closeBarrier2;
                triggerBasedInvalidationTracker$notifyInvalidation$1.f41480r = 1;
                Object objM7 = roomDatabase.M7(false, triggerBasedInvalidationTracker$notifyInvalidation$2$invalidatedTableIds$1, triggerBasedInvalidationTracker$notifyInvalidation$1);
                if (objM7 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                closeBarrier = closeBarrier2;
                obj = objM7;
                triggerBasedInvalidationTracker = this;
            } catch (Throwable th2) {
                closeBarrier = closeBarrier2;
                th = th2;
                closeBarrier.t();
                throw th;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            closeBarrier = (CloseBarrier) triggerBasedInvalidationTracker$notifyInvalidation$1.f41481t;
            triggerBasedInvalidationTracker = (TriggerBasedInvalidationTracker) triggerBasedInvalidationTracker$notifyInvalidation$1.f41479n;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th3) {
                th = th3;
                closeBarrier.t();
                throw th;
            }
        }
        Set set = (Set) obj;
        if (!set.isEmpty()) {
            triggerBasedInvalidationTracker.observedTableVersions.rl(set);
            triggerBasedInvalidationTracker.onInvalidatedTablesIds.invoke(set);
        }
        closeBarrier.t();
        return set;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set gh(SQLiteStatement statement) {
        Intrinsics.checkNotNullParameter(statement, "statement");
        Set setCreateSetBuilder = SetsKt.createSetBuilder();
        while (statement.RQ()) {
            setCreateSetBuilder.add(Integer.valueOf((int) statement.getLong(0)));
        }
        return SetsKt.build(setCreateSetBuilder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mUb(PooledConnection pooledConnection, Continuation continuation) {
        TriggerBasedInvalidationTracker$checkInvalidatedTables$1 triggerBasedInvalidationTracker$checkInvalidatedTables$1;
        if (continuation instanceof TriggerBasedInvalidationTracker$checkInvalidatedTables$1) {
            triggerBasedInvalidationTracker$checkInvalidatedTables$1 = (TriggerBasedInvalidationTracker$checkInvalidatedTables$1) continuation;
            int i2 = triggerBasedInvalidationTracker$checkInvalidatedTables$1.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                triggerBasedInvalidationTracker$checkInvalidatedTables$1.J2 = i2 - Integer.MIN_VALUE;
            } else {
                triggerBasedInvalidationTracker$checkInvalidatedTables$1 = new TriggerBasedInvalidationTracker$checkInvalidatedTables$1(this, continuation);
            }
        }
        Object objNr = triggerBasedInvalidationTracker$checkInvalidatedTables$1.f41462t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = triggerBasedInvalidationTracker$checkInvalidatedTables$1.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(objNr);
            Function1 function1 = new Function1() { // from class: androidx.room.qz
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return TriggerBasedInvalidationTracker.gh((SQLiteStatement) obj);
                }
            };
            triggerBasedInvalidationTracker$checkInvalidatedTables$1.f41461n = pooledConnection;
            triggerBasedInvalidationTracker$checkInvalidatedTables$1.J2 = 1;
            objNr = pooledConnection.nr("SELECT * FROM room_table_modification_log WHERE invalidated = 1", function1, triggerBasedInvalidationTracker$checkInvalidatedTables$1);
            if (objNr != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i3 != 1) {
            if (i3 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Set set = (Set) triggerBasedInvalidationTracker$checkInvalidatedTables$1.f41461n;
            ResultKt.throwOnFailure(objNr);
            return set;
        }
        pooledConnection = (PooledConnection) triggerBasedInvalidationTracker$checkInvalidatedTables$1.f41461n;
        ResultKt.throwOnFailure(objNr);
        Set set2 = (Set) objNr;
        if (!set2.isEmpty()) {
            triggerBasedInvalidationTracker$checkInvalidatedTables$1.f41461n = set2;
            triggerBasedInvalidationTracker$checkInvalidatedTables$1.J2 = 2;
            if (TransactorKt.rl(pooledConnection, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1", triggerBasedInvalidationTracker$checkInvalidatedTables$1) == coroutine_suspended) {
                return coroutine_suspended;
            }
        }
        return set2;
    }

    public final boolean HI(int[] tableIds) {
        Intrinsics.checkNotNullParameter(tableIds, "tableIds");
        return this.observedTableStates.t(tableIds);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Ik(String[] strArr, Function0 function0, Function0 function02, Continuation continuation) {
        TriggerBasedInvalidationTracker$refreshInvalidation$1 triggerBasedInvalidationTracker$refreshInvalidation$1;
        int[] iArr;
        if (continuation instanceof TriggerBasedInvalidationTracker$refreshInvalidation$1) {
            triggerBasedInvalidationTracker$refreshInvalidation$1 = (TriggerBasedInvalidationTracker$refreshInvalidation$1) continuation;
            int i2 = triggerBasedInvalidationTracker$refreshInvalidation$1.f41490r;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                triggerBasedInvalidationTracker$refreshInvalidation$1.f41490r = i2 - Integer.MIN_VALUE;
            } else {
                triggerBasedInvalidationTracker$refreshInvalidation$1 = new TriggerBasedInvalidationTracker$refreshInvalidation$1(this, continuation);
            }
        }
        Object objAz = triggerBasedInvalidationTracker$refreshInvalidation$1.f41488O;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = triggerBasedInvalidationTracker$refreshInvalidation$1.f41490r;
        boolean z2 = true;
        try {
            if (i3 == 0) {
                ResultKt.throwOnFailure(objAz);
                iArr = (int[]) ViF(strArr).component2();
                function0.invoke();
                triggerBasedInvalidationTracker$refreshInvalidation$1.f41489n = function02;
                triggerBasedInvalidationTracker$refreshInvalidation$1.f41491t = iArr;
                triggerBasedInvalidationTracker$refreshInvalidation$1.f41490r = 1;
                objAz = az(triggerBasedInvalidationTracker$refreshInvalidation$1);
                if (objAz == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i3 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                iArr = (int[]) triggerBasedInvalidationTracker$refreshInvalidation$1.f41491t;
                function02 = (Function0) triggerBasedInvalidationTracker$refreshInvalidation$1.f41489n;
                ResultKt.throwOnFailure(objAz);
            }
            Set set = (Set) objAz;
            if (!(iArr.length == 0)) {
                for (int i5 : iArr) {
                    if (set.contains(Boxing.boxInt(i5))) {
                        break;
                    }
                }
                z2 = false;
            } else if (set.isEmpty()) {
                z2 = false;
            }
            return Boxing.boxBoolean(z2);
        } finally {
            function02.invoke();
        }
    }

    public final Pair ViF(String[] names) {
        Intrinsics.checkNotNullParameter(names, "names");
        String[] strArrZ = Z(names);
        int length = strArrZ.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            String str = strArrZ[i2];
            Map map = this.tableIdLookup;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            Integer num = (Integer) map.get(lowerCase);
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name " + str);
            }
            iArr[i2] = num.intValue();
        }
        return TuplesKt.to(strArrZ, iArr);
    }

    public final void XQ(Function0 function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onAllowRefresh = function0;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object aYN(Continuation continuation) {
        TriggerBasedInvalidationTracker$syncTriggers$1 triggerBasedInvalidationTracker$syncTriggers$1;
        CloseBarrier closeBarrier;
        Throwable th;
        if (continuation instanceof TriggerBasedInvalidationTracker$syncTriggers$1) {
            triggerBasedInvalidationTracker$syncTriggers$1 = (TriggerBasedInvalidationTracker$syncTriggers$1) continuation;
            int i2 = triggerBasedInvalidationTracker$syncTriggers$1.J2;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                triggerBasedInvalidationTracker$syncTriggers$1.J2 = i2 - Integer.MIN_VALUE;
            } else {
                triggerBasedInvalidationTracker$syncTriggers$1 = new TriggerBasedInvalidationTracker$syncTriggers$1(this, continuation);
            }
        }
        Object obj = triggerBasedInvalidationTracker$syncTriggers$1.f41512t;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = triggerBasedInvalidationTracker$syncTriggers$1.J2;
        if (i3 == 0) {
            ResultKt.throwOnFailure(obj);
            CloseBarrier closeBarrier2 = this.database.getCloseBarrier();
            if (closeBarrier2.n()) {
                try {
                    RoomDatabase roomDatabase = this.database;
                    TriggerBasedInvalidationTracker$syncTriggers$2$1 triggerBasedInvalidationTracker$syncTriggers$2$1 = new TriggerBasedInvalidationTracker$syncTriggers$2$1(this, null);
                    triggerBasedInvalidationTracker$syncTriggers$1.f41511n = closeBarrier2;
                    triggerBasedInvalidationTracker$syncTriggers$1.J2 = 1;
                    if (roomDatabase.M7(false, triggerBasedInvalidationTracker$syncTriggers$2$1, triggerBasedInvalidationTracker$syncTriggers$1) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    closeBarrier = closeBarrier2;
                    closeBarrier.t();
                } catch (Throwable th2) {
                    closeBarrier = closeBarrier2;
                    th = th2;
                    closeBarrier.t();
                    throw th;
                }
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            closeBarrier = (CloseBarrier) triggerBasedInvalidationTracker$syncTriggers$1.f41511n;
            try {
                ResultKt.throwOnFailure(obj);
                closeBarrier.t();
            } catch (Throwable th3) {
                th = th3;
                closeBarrier.t();
                throw th;
            }
        }
        return Unit.INSTANCE;
    }

    public final boolean ck(int[] tableIds) {
        Intrinsics.checkNotNullParameter(tableIds, "tableIds");
        return this.observedTableStates.nr(tableIds);
    }

    public final void o() {
        this.observedTableStates.O();
    }

    public final void qie(SQLiteConnection connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        SQLiteStatement sQLiteStatementMI = connection.mI("PRAGMA query_only");
        try {
            sQLiteStatementMI.RQ();
            boolean z2 = sQLiteStatementMI.getBoolean(0);
            AutoCloseableKt.closeFinally(sQLiteStatementMI, null);
            if (z2) {
                return;
            }
            SQLite.n(connection, "PRAGMA temp_store = MEMORY");
            SQLite.n(connection, "PRAGMA recursive_triggers = 1");
            SQLite.n(connection, "DROP TABLE IF EXISTS room_table_modification_log");
            if (this.useTempTable) {
                SQLite.n(connection, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            } else {
                SQLite.n(connection, StringsKt.replace$default("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", "", false, 4, (Object) null));
            }
            this.observedTableStates.n();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AutoCloseableKt.closeFinally(sQLiteStatementMI, th);
                throw th2;
            }
        }
    }

    public final void r(Function0 onRefreshScheduled, Function0 onRefreshCompleted) {
        Intrinsics.checkNotNullParameter(onRefreshScheduled, "onRefreshScheduled");
        Intrinsics.checkNotNullParameter(onRefreshCompleted, "onRefreshCompleted");
        if (this.pendingRefresh.compareAndSet(false, true)) {
            onRefreshScheduled.invoke();
            GJW.C.nr(this.database.S(), new rv6("Room Invalidation Tracker Refresh"), null, new TriggerBasedInvalidationTracker$refreshInvalidationAsync$3(this, onRefreshCompleted, null), 2, null);
        }
    }

    private final String[] Z(String[] names) {
        Set setCreateSetBuilder = SetsKt.createSetBuilder();
        for (String str : names) {
            Map map = this.viewTables;
            String lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            Set set = (Set) map.get(lowerCase);
            if (set != null) {
                setCreateSetBuilder.addAll(set);
            } else {
                setCreateSetBuilder.add(str);
            }
        }
        return (String[]) SetsKt.build(setCreateSetBuilder).toArray(new String[0]);
    }
}
