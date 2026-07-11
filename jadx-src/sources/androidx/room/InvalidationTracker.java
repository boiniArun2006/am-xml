package androidx.room;

import android.content.Context;
import android.content.Intent;
import androidx.room.coroutines.RunBlockingUninterruptible_androidKt;
import androidx.room.support.AutoCloser;
import androidx.sqlite.SQLiteConnection;
import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0016\u0018\u0000 <2\u00020\u0001:\u0003cdeBX\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u001d\u0010\t\u001a\u0019\u0012\u0004\u0012\u00020\u0005\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0002\b\b0\u0004\u0012\u0012\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\n\"\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001c\u001a\u00020\u000e2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0007H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0000¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\"H\u0000¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u000eH\u0080@¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u000eH\u0001¢\u0006\u0004\b(\u0010\u0010J\r\u0010)\u001a\u00020\u000e¢\u0006\u0004\b)\u0010\u0010J\u0017\u0010*\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0017¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b,\u0010+J\u0017\u0010-\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0017¢\u0006\u0004\b-\u0010+J\u0017\u0010.\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0017¢\u0006\u0004\b.\u0010+J\u000f\u0010/\u001a\u00020\u000eH\u0016¢\u0006\u0004\b/\u0010\u0010J\u001d\u00101\u001a\u00020\u000e2\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0000¢\u0006\u0004\b1\u0010\u001dJ'\u00107\u001a\u00020\u000e2\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u00020\u00052\u0006\u00106\u001a\u000205H\u0000¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u000eH\u0000¢\u0006\u0004\b9\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R+\u0010\t\u001a\u0019\u0012\u0004\u0012\u00020\u0005\u0012\u000f\u0012\r\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0002\b\b0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010?R\"\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0014\u0010H\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR \u0010L\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020J0I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010?R\u0018\u0010Q\u001a\u00060Mj\u0002`N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u001a\u0010W\u001a\b\u0012\u0004\u0012\u00020\u000e0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u001a\u0010X\u001a\b\u0012\u0004\u0012\u00020\u000e0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010VR\u0014\u0010[\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010ZR\u0018\u0010]\u001a\u0004\u0018\u0001058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010\\R\u0018\u0010`\u001a\u0004\u0018\u00010^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010_R\u0014\u0010b\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010a¨\u0006f"}, d2 = {"Landroidx/room/InvalidationTracker;", "", "Landroidx/room/RoomDatabase;", "database", "", "", "shadowTablesMap", "", "Lkotlin/jvm/JvmSuppressWildcards;", "viewTables", "", "tableNames", "<init>", "(Landroidx/room/RoomDatabase;Ljava/util/Map;Ljava/util/Map;[Ljava/lang/String;)V", "", "XQ", "()V", "Landroidx/room/InvalidationTracker$Observer;", "observer", "", "gh", "(Landroidx/room/InvalidationTracker$Observer;)Z", "g", "", "ty", "()Ljava/util/List;", "", "tableIds", "o", "(Ljava/util/Set;)V", "Landroidx/room/support/AutoCloser;", "autoCloser", "te", "(Landroidx/room/support/AutoCloser;)V", "Landroidx/sqlite/SQLiteConnection;", "connection", "r", "(Landroidx/sqlite/SQLiteConnection;)V", "fD", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "E2", "aYN", "mUb", "(Landroidx/room/InvalidationTracker$Observer;)V", "qie", "az", "nY", "ViF", "tables", "Z", "Landroid/content/Context;", "context", AppMeasurementSdk.ConditionalUserProperty.NAME, "Landroid/content/Intent;", "serviceIntent", "Ik", "(Landroid/content/Context;Ljava/lang/String;Landroid/content/Intent;)V", "iF", c.f62177j, "Landroidx/room/RoomDatabase;", "HI", "()Landroidx/room/RoomDatabase;", "rl", "Ljava/util/Map;", "t", "nr", "[Ljava/lang/String;", "ck", "()[Ljava/lang/String;", "Landroidx/room/TriggerBasedInvalidationTracker;", "O", "Landroidx/room/TriggerBasedInvalidationTracker;", "implementation", "", "Landroidx/room/ObserverWrapper;", "J2", "observerMap", "Ljava/util/concurrent/locks/ReentrantLock;", "Landroidx/room/concurrent/ReentrantLock;", "Uo", "Ljava/util/concurrent/locks/ReentrantLock;", "observerMapLock", "KN", "Landroidx/room/support/AutoCloser;", "Lkotlin/Function0;", "xMQ", "Lkotlin/jvm/functions/Function0;", "onRefreshScheduled", "onRefreshCompleted", "Landroidx/room/InvalidationLiveDataContainer;", "Landroidx/room/InvalidationLiveDataContainer;", "invalidationLiveDataContainer", "Landroid/content/Intent;", "multiInstanceInvalidationIntent", "Landroidx/room/MultiInstanceInvalidationClient;", "Landroidx/room/MultiInstanceInvalidationClient;", "multiInstanceInvalidationClient", "Ljava/lang/Object;", "trackerLock", "Observer", "MultiInstanceClientInitState", "Companion", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nInvalidationTracker.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InvalidationTracker.android.kt\nandroidx/room/InvalidationTracker\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ReentrantLock.kt\nandroidx/room/concurrent/ReentrantLockKt\n*L\n1#1,592:1\n827#2:593\n855#2,2:594\n1863#2,2:617\n1863#2,2:624\n1#3:596\n28#4,5:597\n28#4,5:602\n28#4,5:607\n28#4,5:612\n28#4,5:619\n*S KotlinDebug\n*F\n+ 1 InvalidationTracker.android.kt\nandroidx/room/InvalidationTracker\n*L\n186#1:593\n186#1:594,2\n351#1:617,2\n365#1:624,2\n274#1:597,5\n318#1:602,5\n322#1:607,5\n350#1:612,5\n364#1:619,5\n*E\n"})
public class InvalidationTracker {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final Map observerMap;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private AutoCloser autoCloser;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final TriggerBasedInvalidationTracker implementation;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final ReentrantLock observerMapLock;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private MultiInstanceInvalidationClient multiInstanceInvalidationClient;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private final InvalidationLiveDataContainer invalidationLiveDataContainer;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private final Function0 onRefreshCompleted;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final RoomDatabase database;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private final String[] tableNames;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private Intent multiInstanceInvalidationIntent;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private final Map shadowTablesMap;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Map viewTables;

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private final Object trackerLock;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final Function0 onRefreshScheduled;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0011\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0004R\u0017\u0010\u001b\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Landroidx/room/InvalidationTracker$MultiInstanceClientInitState;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", InneractiveMediationNameConsts.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "Landroid/content/Context;", c.f62177j, "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "rl", "Ljava/lang/String;", "getName", AppMeasurementSdk.ConditionalUserProperty.NAME, "Landroid/content/Intent;", "t", "Landroid/content/Intent;", "getServiceIntent", "()Landroid/content/Intent;", "serviceIntent", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final /* data */ class MultiInstanceClientInitState {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final Context context;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata and from toString */
        private final String name;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
        private final Intent serviceIntent;

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MultiInstanceClientInitState)) {
                return false;
            }
            MultiInstanceClientInitState multiInstanceClientInitState = (MultiInstanceClientInitState) other;
            return Intrinsics.areEqual(this.context, multiInstanceClientInitState.context) && Intrinsics.areEqual(this.name, multiInstanceClientInitState.name) && Intrinsics.areEqual(this.serviceIntent, multiInstanceClientInitState.serviceIntent);
        }

        public int hashCode() {
            return (((this.context.hashCode() * 31) + this.name.hashCode()) * 31) + this.serviceIntent.hashCode();
        }

        public String toString() {
            return "MultiInstanceClientInitState(context=" + this.context + ", name=" + this.name + ", serviceIntent=" + this.serviceIntent + ')';
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\t\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H&¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000e8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/room/InvalidationTracker$Observer;", "", "", "", "tables", "<init>", "([Ljava/lang/String;)V", "", "", "t", "(Ljava/util/Set;)V", c.f62177j, "[Ljava/lang/String;", "()[Ljava/lang/String;", "", "rl", "()Z", "isRemote", "room-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class Observer {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final String[] tables;

        public boolean rl() {
            return false;
        }

        public abstract void t(Set tables);

        public Observer(String[] tables) {
            Intrinsics.checkNotNullParameter(tables, "tables");
            this.tables = tables;
        }

        /* JADX INFO: renamed from: n, reason: from getter */
        public final String[] getTables() {
            return this.tables;
        }
    }

    public InvalidationTracker(RoomDatabase database, Map shadowTablesMap, Map viewTables, String... tableNames) {
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(shadowTablesMap, "shadowTablesMap");
        Intrinsics.checkNotNullParameter(viewTables, "viewTables");
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        this.database = database;
        this.shadowTablesMap = shadowTablesMap;
        this.viewTables = viewTables;
        this.tableNames = tableNames;
        TriggerBasedInvalidationTracker triggerBasedInvalidationTracker = new TriggerBasedInvalidationTracker(database, shadowTablesMap, viewTables, tableNames, database.getUseTempTrackingTable(), new InvalidationTracker$implementation$1(this));
        this.implementation = triggerBasedInvalidationTracker;
        this.observerMap = new LinkedHashMap();
        this.observerMapLock = new ReentrantLock();
        this.onRefreshScheduled = new Function0() { // from class: androidx.room.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InvalidationTracker.WPU(this.f41668n);
            }
        };
        this.onRefreshCompleted = new Function0() { // from class: androidx.room.w6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return InvalidationTracker.S(this.f41870n);
            }
        };
        this.invalidationLiveDataContainer = new InvalidationLiveDataContainer(database);
        this.trackerLock = new Object();
        triggerBasedInvalidationTracker.XQ(new Function0() { // from class: androidx.room.Ml
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(InvalidationTracker.nr(this.f41324n));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit S(InvalidationTracker invalidationTracker) {
        AutoCloser autoCloser = invalidationTracker.autoCloser;
        if (autoCloser != null) {
            autoCloser.Uo();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit WPU(InvalidationTracker invalidationTracker) {
        AutoCloser autoCloser = invalidationTracker.autoCloser;
        if (autoCloser != null) {
            autoCloser.mUb();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void XQ() {
        synchronized (this.trackerLock) {
            try {
                MultiInstanceInvalidationClient multiInstanceInvalidationClient = this.multiInstanceInvalidationClient;
                if (multiInstanceInvalidationClient != null) {
                    List listTy = ty();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : listTy) {
                        if (!((Observer) obj).rl()) {
                            arrayList.add(obj);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        multiInstanceInvalidationClient.gh();
                    }
                }
                this.implementation.o();
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final boolean g(Observer observer) {
        ReentrantLock reentrantLock = this.observerMapLock;
        reentrantLock.lock();
        try {
            ObserverWrapper observerWrapper = (ObserverWrapper) this.observerMap.remove(observer);
            return observerWrapper != null && this.implementation.ck(observerWrapper.getTableIds());
        } finally {
            reentrantLock.unlock();
        }
    }

    private final boolean gh(Observer observer) {
        Pair pairViF = this.implementation.ViF(observer.getTables());
        String[] strArr = (String[]) pairViF.component1();
        int[] iArr = (int[]) pairViF.component2();
        ObserverWrapper observerWrapper = new ObserverWrapper(observer, iArr, strArr);
        ReentrantLock reentrantLock = this.observerMapLock;
        reentrantLock.lock();
        try {
            ObserverWrapper observerWrapper2 = this.observerMap.containsKey(observer) ? (ObserverWrapper) MapsKt.getValue(this.observerMap, observer) : (ObserverWrapper) this.observerMap.put(observer, observerWrapper);
            reentrantLock.unlock();
            return observerWrapper2 == null && this.implementation.HI(iArr);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean nr(InvalidationTracker invalidationTracker) {
        return !invalidationTracker.database.T() || invalidationTracker.database.Xw();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o(Set tableIds) {
        ReentrantLock reentrantLock = this.observerMapLock;
        reentrantLock.lock();
        try {
            List list = CollectionsKt.toList(this.observerMap.values());
            reentrantLock.unlock();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((ObserverWrapper) it.next()).t(tableIds);
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    private final List ty() {
        ReentrantLock reentrantLock = this.observerMapLock;
        reentrantLock.lock();
        try {
            return CollectionsKt.toList(this.observerMap.keySet());
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void E2() {
        RunBlockingUninterruptible_androidKt.n(new InvalidationTracker$syncBlocking$1(this, null));
    }

    /* JADX INFO: renamed from: HI, reason: from getter */
    public final RoomDatabase getDatabase() {
        return this.database;
    }

    public final void Ik(Context context, String name, Intent serviceIntent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(serviceIntent, "serviceIntent");
        this.multiInstanceInvalidationIntent = serviceIntent;
        this.multiInstanceInvalidationClient = new MultiInstanceInvalidationClient(context, name, this);
    }

    public void ViF() {
        this.implementation.r(this.onRefreshScheduled, this.onRefreshCompleted);
    }

    public final void Z(Set tables) {
        Intrinsics.checkNotNullParameter(tables, "tables");
        ReentrantLock reentrantLock = this.observerMapLock;
        reentrantLock.lock();
        try {
            List<ObserverWrapper> list = CollectionsKt.toList(this.observerMap.values());
            reentrantLock.unlock();
            for (ObserverWrapper observerWrapper : list) {
                if (!observerWrapper.getObserver().rl()) {
                    observerWrapper.nr(tables);
                }
            }
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void aYN() {
        this.implementation.r(this.onRefreshScheduled, this.onRefreshCompleted);
    }

    public void az(Observer observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        mUb(new WeakObserver(this, observer));
    }

    /* JADX INFO: renamed from: ck, reason: from getter */
    public final String[] getTableNames() {
        return this.tableNames;
    }

    public final Object fD(Continuation continuation) {
        if (this.database.T() && !this.database.Xw()) {
            return Unit.INSTANCE;
        }
        Object objAYN = this.implementation.aYN(continuation);
        return objAYN == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objAYN : Unit.INSTANCE;
    }

    public final void iF() {
        MultiInstanceInvalidationClient multiInstanceInvalidationClient = this.multiInstanceInvalidationClient;
        if (multiInstanceInvalidationClient != null) {
            multiInstanceInvalidationClient.gh();
        }
    }

    public void mUb(Observer observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        if (gh(observer)) {
            RunBlockingUninterruptible_androidKt.n(new InvalidationTracker$addObserver$1(this, null));
        }
    }

    public void nY(Observer observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        if (g(observer)) {
            RunBlockingUninterruptible_androidKt.n(new InvalidationTracker$removeObserver$1(this, null));
        }
    }

    public final void qie(Observer observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        if (!observer.rl()) {
            throw new IllegalStateException("isRemote was false of observer argument");
        }
        gh(observer);
    }

    public final void r(SQLiteConnection connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        this.implementation.qie(connection);
        synchronized (this.trackerLock) {
            try {
                MultiInstanceInvalidationClient multiInstanceInvalidationClient = this.multiInstanceInvalidationClient;
                if (multiInstanceInvalidationClient != null) {
                    Intent intent = this.multiInstanceInvalidationIntent;
                    if (intent == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    multiInstanceInvalidationClient.mUb(intent);
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void te(AutoCloser autoCloser) {
        Intrinsics.checkNotNullParameter(autoCloser, "autoCloser");
        this.autoCloser = autoCloser;
        autoCloser.az(new InvalidationTracker$setAutoCloser$1(this));
    }
}
