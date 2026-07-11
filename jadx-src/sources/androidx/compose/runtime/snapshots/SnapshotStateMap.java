package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.internal.StabilityInferred;
import com.caoccao.javet.values.reference.IV8ValueMap;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMutableMap;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u000b\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\u0007\n\u0002\u0010\u001f\n\u0002\b\u000f\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001GB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J;\u0010\r\u001a\u00020\f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00072\u0006\u0010\t\u001a\u00020\b2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ3\u0010\u000f\u001a\u00020\b*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u001a\u0010\u001a\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0016\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0013H\u0016¢\u0006\u0004\b!\u0010\u0006J!\u0010\"\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0016\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\"\u0010#J%\u0010&\u001a\u00020\u00132\u0014\u0010%\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010$H\u0016¢\u0006\u0004\b&\u0010'J\u0019\u0010(\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0016\u001a\u00028\u0000H\u0016¢\u0006\u0004\b(\u0010\u001bJ\u0017\u0010)\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00028\u0001H\u0000¢\u0006\u0004\b)\u0010\u0018R$\u0010/\u001a\u00020\u00112\u0006\u0010*\u001a\u00020\u00118\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R,\u00106\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000101008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R \u00108\u001a\b\u0012\u0004\u0012\u00028\u0000008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u00103\u001a\u0004\b7\u00105R \u0010=\u001a\b\u0012\u0004\u0012\u00028\u0001098\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010:\u001a\u0004\b;\u0010<R\u0014\u0010@\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0014\u0010B\u001a\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bA\u0010?R&\u0010F\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078@X\u0080\u0004¢\u0006\f\u0012\u0004\bE\u0010\u0006\u001a\u0004\bC\u0010D¨\u0006H"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "K", "V", "Landroidx/compose/runtime/snapshots/StateObject;", "", "<init>", "()V", "Landroidx/compose/runtime/snapshots/SnapshotStateMap$StateMapStateRecord;", "", "currentModification", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "newMap", "", "O", "(Landroidx/compose/runtime/snapshots/SnapshotStateMap$StateMapStateRecord;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;)Z", "J2", "(Landroidx/compose/runtime/snapshots/SnapshotStateMap$StateMapStateRecord;Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;)I", "Landroidx/compose/runtime/snapshots/StateRecord;", "value", "", "HI", "(Landroidx/compose/runtime/snapshots/StateRecord;)V", "key", "containsKey", "(Ljava/lang/Object;)Z", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "isEmpty", "()Z", "", "toString", "()Ljava/lang/String;", "clear", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "from", "putAll", "(Ljava/util/Map;)V", "remove", "az", "<set-?>", c.f62177j, "Landroidx/compose/runtime/snapshots/StateRecord;", "ck", "()Landroidx/compose/runtime/snapshots/StateRecord;", "firstStateRecord", "", "", "t", "Ljava/util/Set;", "Uo", "()Ljava/util/Set;", IV8ValueMap.FUNCTION_ENTRIES, "KN", IV8ValueMap.FUNCTION_KEYS, "", "Ljava/util/Collection;", "qie", "()Ljava/util/Collection;", IV8ValueMap.FUNCTION_VALUES, "gh", "()I", "size", "xMQ", "modification", "mUb", "()Landroidx/compose/runtime/snapshots/SnapshotStateMap$StateMapStateRecord;", "getReadable$runtime_release$annotations", "readable", "StateMapStateRecord", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Stable
@SourceDebugExtension({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,416:1\n186#1:418\n150#1:419\n187#1,2:421\n154#1:423\n189#1:435\n157#1,5:436\n162#1:443\n150#1:444\n163#1,7:446\n154#1:453\n171#1:463\n157#1,5:464\n162#1:471\n150#1:472\n163#1,7:474\n154#1:481\n171#1:491\n157#1,5:492\n162#1:499\n150#1:500\n163#1,7:502\n154#1:509\n171#1:519\n157#1,5:522\n162#1:529\n150#1:530\n163#1,7:532\n154#1:539\n171#1:549\n150#1:550\n150#1:566\n154#1:568\n150#1:582\n154#1:584\n2475#2:417\n2475#2:420\n2365#2,2:424\n1894#2,2:426\n2367#2,4:430\n2475#2:445\n2365#2,2:454\n1894#2,2:456\n2367#2,4:458\n2475#2:473\n2365#2,2:482\n1894#2,2:484\n2367#2,4:486\n2475#2:501\n2365#2,2:510\n1894#2,2:512\n2367#2,4:514\n2475#2:531\n2365#2,2:540\n1894#2,2:542\n2367#2,4:544\n2475#2:551\n2475#2:552\n2365#2,2:553\n1894#2,2:555\n2367#2,4:559\n2475#2:567\n2365#2,2:569\n1894#2,2:571\n2367#2,4:575\n2475#2:583\n2365#2,2:585\n1894#2,2:587\n2367#2,4:591\n33#3,2:428\n33#3,2:441\n33#3,2:469\n33#3,2:497\n33#3,2:527\n33#3,2:557\n33#3,2:564\n33#3,2:573\n33#3,2:580\n33#3,2:589\n33#3,2:596\n1#4:434\n1#4:462\n1#4:490\n1#4:518\n1#4:548\n1#4:563\n1#4:579\n1#4:595\n288#5,2:520\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap\n*L\n90#1:418\n90#1:419\n90#1:421,2\n90#1:423\n90#1:435\n92#1:436,5\n92#1:443\n92#1:444\n92#1:446,7\n92#1:453\n92#1:463\n94#1:464,5\n94#1:471\n94#1:472\n94#1:474,7\n94#1:481\n94#1:491\n96#1:492,5\n96#1:499\n96#1:500\n96#1:502,7\n96#1:509\n96#1:519\n115#1:522,5\n115#1:529\n115#1:530\n115#1:532,7\n115#1:539\n115#1:549\n146#1:550\n162#1:566\n169#1:568\n186#1:582\n188#1:584\n86#1:417\n90#1:420\n90#1:424,2\n90#1:426,2\n90#1:430,4\n92#1:445\n92#1:454,2\n92#1:456,2\n92#1:458,4\n94#1:473\n94#1:482,2\n94#1:484,2\n94#1:486,4\n96#1:501\n96#1:510,2\n96#1:512,2\n96#1:514,4\n115#1:531\n115#1:540,2\n115#1:542,2\n115#1:544,4\n146#1:551\n150#1:552\n154#1:553,2\n154#1:555,2\n154#1:559,4\n162#1:567\n169#1:569,2\n169#1:571,2\n169#1:575,4\n186#1:583\n188#1:585,2\n188#1:587,2\n188#1:591,4\n90#1:428,2\n92#1:441,2\n94#1:469,2\n96#1:497,2\n115#1:527,2\n154#1:557,2\n161#1:564,2\n169#1:573,2\n178#1:580,2\n188#1:589,2\n193#1:596,2\n90#1:434\n92#1:462\n94#1:490\n96#1:518\n115#1:548\n154#1:563\n169#1:579\n188#1:595\n103#1:520,2\n*E\n"})
public final class SnapshotStateMap<K, V> implements StateObject, Map<K, V>, KMutableMap {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final Collection values;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final Set keys;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private StateRecord firstStateRecord;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Set entries;

    @StabilityInferred
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0007\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B)\b\u0000\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u00020\u00032\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R.\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u001e\u001a\u00020\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotStateMap$StateMapStateRecord;", "K", "V", "Landroidx/compose/runtime/snapshots/StateRecord;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "map", "<init>", "(JLandroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;)V", "value", "", "t", "(Landroidx/compose/runtime/snapshots/StateRecord;)V", "nr", "()Landroidx/compose/runtime/snapshots/StateRecord;", "O", "(J)Landroidx/compose/runtime/snapshots/StateRecord;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "mUb", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "qie", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;)V", "", "I", "gh", "()I", "az", "(I)V", "modification", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap$StateMapStateRecord\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n*L\n1#1,416:1\n33#2,2:417\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap$StateMapStateRecord\n*L\n206#1:417,2\n*E\n"})
    public static final class StateMapStateRecord<K, V> extends StateRecord {

        /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
        private int modification;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private PersistentMap map;

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord O(long snapshotId) {
            return new StateMapStateRecord(snapshotId, this.map);
        }

        public final void az(int i2) {
            this.modification = i2;
        }

        /* JADX INFO: renamed from: gh, reason: from getter */
        public final int getModification() {
            return this.modification;
        }

        /* JADX INFO: renamed from: mUb, reason: from getter */
        public final PersistentMap getMap() {
            return this.map;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord nr() {
            return new StateMapStateRecord(SnapshotKt.N().getSnapshotId(), this.map);
        }

        public final void qie(PersistentMap persistentMap) {
            this.map = persistentMap;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void t(StateRecord value) {
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord, V of androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord>");
            StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) value;
            synchronized (SnapshotStateMapKt.f30983n) {
                this.map = stateMapStateRecord.map;
                this.modification = stateMapStateRecord.modification;
                Unit unit = Unit.INSTANCE;
            }
        }

        public StateMapStateRecord(long j2, PersistentMap persistentMap) {
            super(j2);
            this.map = persistentMap;
        }
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void HI(StateRecord value) {
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        this.firstStateRecord = (StateMapStateRecord) value;
    }

    /* JADX INFO: renamed from: KN, reason: from getter */
    public Set getKeys() {
        return this.keys;
    }

    /* JADX INFO: renamed from: Uo, reason: from getter */
    public Set getEntries() {
        return this.entries;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    /* JADX INFO: renamed from: ck, reason: from getter */
    public StateRecord getFirstStateRecord() {
        return this.firstStateRecord;
    }

    /* JADX INFO: renamed from: qie, reason: from getter */
    public Collection getValues() {
        return this.values;
    }

    public SnapshotStateMap() {
        PersistentMap persistentMapN = ExtensionsKt.n();
        Snapshot snapshotN = SnapshotKt.N();
        StateMapStateRecord stateMapStateRecord = new StateMapStateRecord(snapshotN.getSnapshotId(), persistentMapN);
        if (!(snapshotN instanceof GlobalSnapshot)) {
            stateMapStateRecord.KN(new StateMapStateRecord(SnapshotId_jvmKt.t(1), persistentMapN));
        }
        this.firstStateRecord = stateMapStateRecord;
        this.entries = new SnapshotMapEntrySet(this);
        this.keys = new SnapshotMapKeySet(this);
        this.values = new SnapshotMapValueSet(this);
    }

    private final int J2(StateMapStateRecord stateMapStateRecord, PersistentMap persistentMap) {
        int modification;
        synchronized (SnapshotStateMapKt.f30983n) {
            stateMapStateRecord.qie(persistentMap);
            modification = stateMapStateRecord.getModification();
            stateMapStateRecord.az(modification + 1);
        }
        return modification;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean O(StateMapStateRecord stateMapStateRecord, int i2, PersistentMap persistentMap) {
        boolean z2;
        synchronized (SnapshotStateMapKt.f30983n) {
            if (stateMapStateRecord.getModification() == i2) {
                stateMapStateRecord.qie(persistentMap);
                z2 = true;
                stateMapStateRecord.az(stateMapStateRecord.getModification() + 1);
            } else {
                z2 = false;
            }
        }
        return z2;
    }

    public final boolean az(Object value) {
        Object next;
        Iterator it = entrySet().iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                if (Intrinsics.areEqual(((Map.Entry) next).getValue(), value)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            remove(entry.getKey());
            return true;
        }
        return false;
    }

    @Override // java.util.Map
    public void clear() {
        Snapshot snapshotT;
        StateRecord firstStateRecord = getFirstStateRecord();
        Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.X((StateMapStateRecord) firstStateRecord);
        stateMapStateRecord.getMap();
        PersistentMap persistentMapN = ExtensionsKt.n();
        if (persistentMapN != stateMapStateRecord.getMap()) {
            StateRecord firstStateRecord2 = getFirstStateRecord();
            Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.nHg()) {
                snapshotT = Snapshot.INSTANCE.t();
                J2((StateMapStateRecord) SnapshotKt.k(stateMapStateRecord2, this, snapshotT), persistentMapN);
            }
            SnapshotKt.jB(snapshotT, this);
        }
    }

    @Override // java.util.Map
    public boolean containsKey(Object key) {
        return mUb().getMap().containsKey(key);
    }

    @Override // java.util.Map
    public boolean containsValue(Object value) {
        return mUb().getMap().containsValue(value);
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return getEntries();
    }

    @Override // java.util.Map
    public Object get(Object key) {
        return mUb().getMap().get(key);
    }

    public int gh() {
        return mUb().getMap().size();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return mUb().getMap().isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return getKeys();
    }

    public final StateMapStateRecord mUb() {
        StateRecord firstStateRecord = getFirstStateRecord();
        Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return (StateMapStateRecord) SnapshotKt.M((StateMapStateRecord) firstStateRecord, this);
    }

    @Override // java.util.Map
    public Object put(Object key, Object value) {
        PersistentMap map;
        int modification;
        V vPut;
        Snapshot snapshotT;
        boolean zO;
        do {
            synchronized (SnapshotStateMapKt.f30983n) {
                StateRecord firstStateRecord = getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.X((StateMapStateRecord) firstStateRecord);
                map = stateMapStateRecord.getMap();
                modification = stateMapStateRecord.getModification();
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(map);
            PersistentMap.Builder builderN = map.n();
            vPut = builderN.put(key, value);
            PersistentMap persistentMapBuild = builderN.build();
            if (Intrinsics.areEqual(persistentMapBuild, map)) {
                break;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.nHg()) {
                snapshotT = Snapshot.INSTANCE.t();
                zO = O((StateMapStateRecord) SnapshotKt.k(stateMapStateRecord2, this, snapshotT), modification, persistentMapBuild);
            }
            SnapshotKt.jB(snapshotT, this);
        } while (!zO);
        return vPut;
    }

    @Override // java.util.Map
    public void putAll(Map from) {
        PersistentMap map;
        int modification;
        Snapshot snapshotT;
        boolean zO;
        do {
            synchronized (SnapshotStateMapKt.f30983n) {
                StateRecord firstStateRecord = getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.X((StateMapStateRecord) firstStateRecord);
                map = stateMapStateRecord.getMap();
                modification = stateMapStateRecord.getModification();
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(map);
            PersistentMap.Builder builderN = map.n();
            builderN.putAll(from);
            PersistentMap persistentMapBuild = builderN.build();
            if (!Intrinsics.areEqual(persistentMapBuild, map)) {
                StateRecord firstStateRecord2 = getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) firstStateRecord2;
                synchronized (SnapshotKt.nHg()) {
                    snapshotT = Snapshot.INSTANCE.t();
                    zO = O((StateMapStateRecord) SnapshotKt.k(stateMapStateRecord2, this, snapshotT), modification, persistentMapBuild);
                }
                SnapshotKt.jB(snapshotT, this);
            } else {
                return;
            }
        } while (!zO);
    }

    @Override // java.util.Map
    public Object remove(Object key) {
        PersistentMap map;
        int modification;
        V vRemove;
        Snapshot snapshotT;
        boolean zO;
        do {
            synchronized (SnapshotStateMapKt.f30983n) {
                StateRecord firstStateRecord = getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                StateMapStateRecord stateMapStateRecord = (StateMapStateRecord) SnapshotKt.X((StateMapStateRecord) firstStateRecord);
                map = stateMapStateRecord.getMap();
                modification = stateMapStateRecord.getModification();
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(map);
            PersistentMap.Builder builderN = map.n();
            vRemove = builderN.remove(key);
            PersistentMap persistentMapBuild = builderN.build();
            if (Intrinsics.areEqual(persistentMapBuild, map)) {
                break;
            }
            StateRecord firstStateRecord2 = getFirstStateRecord();
            Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            StateMapStateRecord stateMapStateRecord2 = (StateMapStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.nHg()) {
                snapshotT = Snapshot.INSTANCE.t();
                zO = O((StateMapStateRecord) SnapshotKt.k(stateMapStateRecord2, this, snapshotT), modification, persistentMapBuild);
            }
            SnapshotKt.jB(snapshotT, this);
        } while (!zO);
        return vRemove;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return gh();
    }

    public String toString() {
        StateRecord firstStateRecord = getFirstStateRecord();
        Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
        return "SnapshotStateMap(value=" + ((StateMapStateRecord) SnapshotKt.X((StateMapStateRecord) firstStateRecord)).getMap() + ")@" + hashCode();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return getValues();
    }

    public final int xMQ() {
        return mUb().getModification();
    }
}
