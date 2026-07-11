package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.external.kotlinx.collections.immutable.ImmutableSet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00010\u0003B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\u00020\u00132\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0018\u001a\u00020\u00132\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\u00132\u0006\u0010\b\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u0015J\u001d\u0010\u001a\u001a\u00020\u00132\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00010\fH\u0016¢\u0006\u0004\b\u001a\u0010\u0017¨\u0006\u001b"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotMapValueSet;", "K", "V", "Landroidx/compose/runtime/snapshots/SnapshotMapSet;", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "map", "<init>", "(Landroidx/compose/runtime/snapshots/SnapshotStateMap;)V", "element", "", "J2", "(Ljava/lang/Object;)Ljava/lang/Void;", "", "elements", "Uo", "(Ljava/util/Collection;)Ljava/lang/Void;", "Landroidx/compose/runtime/snapshots/StateMapMutableValuesIterator;", "KN", "()Landroidx/compose/runtime/snapshots/StateMapMutableValuesIterator;", "", "remove", "(Ljava/lang/Object;)Z", "removeAll", "(Ljava/util/Collection;)Z", "retainAll", "contains", "containsAll", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotMapValueSet\n+ 2 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap\n+ 3 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 4 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,416:1\n114#2,2:417\n157#2,5:419\n162#2:426\n150#2:427\n163#2,5:429\n116#2,7:434\n168#2,2:441\n154#2:443\n171#2:453\n123#2:454\n114#2,2:455\n157#2,5:457\n162#2:464\n150#2:465\n163#2,5:467\n116#2,7:472\n168#2,2:479\n154#2:481\n171#2:491\n123#2:492\n33#3,2:424\n33#3,2:462\n2475#4:428\n2365#4,2:444\n1894#4,2:446\n2367#4,4:448\n2475#4:466\n2365#4,2:482\n1894#4,2:484\n2367#4,4:486\n1#5:452\n1#5:490\n1726#6,3:493\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotMapValueSet\n*L\n299#1:417,2\n299#1:419,5\n299#1:426\n299#1:427\n299#1:429,5\n299#1:434,7\n299#1:441,2\n299#1:443\n299#1:453\n299#1:454\n304#1:455,2\n304#1:457,5\n304#1:464\n304#1:465\n304#1:467,5\n304#1:472,7\n304#1:479,2\n304#1:481\n304#1:491\n304#1:492\n299#1:424,2\n304#1:462,2\n299#1:428\n299#1:444,2\n299#1:446,2\n299#1:448,4\n304#1:466\n304#1:482,2\n304#1:484,2\n304#1:486,4\n299#1:452\n304#1:490\n310#1:493,3\n*E\n"})
final class SnapshotMapValueSet<K, V> extends SnapshotMapSet<K, V, V> {
    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: KN, reason: merged with bridge method [inline-methods] */
    public StateMapMutableValuesIterator iterator() {
        return new StateMapMutableValuesIterator(getMap(), ((ImmutableSet) getMap().mUb().getMap().entrySet()).iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection elements) {
        Collection collection = elements;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!getMap().containsValue(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection elements) {
        PersistentMap map;
        int modification;
        Snapshot snapshotT;
        boolean zO;
        Set set = CollectionsKt.toSet(elements);
        SnapshotStateMap map2 = getMap();
        boolean z2 = false;
        do {
            synchronized (SnapshotStateMapKt.f30983n) {
                StateRecord firstStateRecord = map2.getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                SnapshotStateMap.StateMapStateRecord stateMapStateRecord = (SnapshotStateMap.StateMapStateRecord) SnapshotKt.X((SnapshotStateMap.StateMapStateRecord) firstStateRecord);
                map = stateMapStateRecord.getMap();
                modification = stateMapStateRecord.getModification();
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(map);
            PersistentMap.Builder builderN = map.n();
            for (Map.Entry entry : map2.entrySet()) {
                if (set.contains(entry.getValue())) {
                    builderN.remove(entry.getKey());
                    z2 = true;
                }
            }
            Unit unit2 = Unit.INSTANCE;
            PersistentMap persistentMapBuild = builderN.build();
            if (Intrinsics.areEqual(persistentMapBuild, map)) {
                break;
            }
            StateRecord firstStateRecord2 = map2.getFirstStateRecord();
            Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            SnapshotStateMap.StateMapStateRecord stateMapStateRecord2 = (SnapshotStateMap.StateMapStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.nHg()) {
                snapshotT = Snapshot.INSTANCE.t();
                zO = map2.O((SnapshotStateMap.StateMapStateRecord) SnapshotKt.k(stateMapStateRecord2, map2, snapshotT), modification, persistentMapBuild);
            }
            SnapshotKt.jB(snapshotT, map2);
        } while (!zO);
        return z2;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection elements) {
        PersistentMap map;
        int modification;
        Snapshot snapshotT;
        boolean zO;
        Set set = CollectionsKt.toSet(elements);
        SnapshotStateMap map2 = getMap();
        boolean z2 = false;
        do {
            synchronized (SnapshotStateMapKt.f30983n) {
                StateRecord firstStateRecord = map2.getFirstStateRecord();
                Intrinsics.checkNotNull(firstStateRecord, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
                SnapshotStateMap.StateMapStateRecord stateMapStateRecord = (SnapshotStateMap.StateMapStateRecord) SnapshotKt.X((SnapshotStateMap.StateMapStateRecord) firstStateRecord);
                map = stateMapStateRecord.getMap();
                modification = stateMapStateRecord.getModification();
                Unit unit = Unit.INSTANCE;
            }
            Intrinsics.checkNotNull(map);
            PersistentMap.Builder builderN = map.n();
            for (Map.Entry entry : map2.entrySet()) {
                if (!set.contains(entry.getValue())) {
                    builderN.remove(entry.getKey());
                    z2 = true;
                }
            }
            Unit unit2 = Unit.INSTANCE;
            PersistentMap persistentMapBuild = builderN.build();
            if (Intrinsics.areEqual(persistentMapBuild, map)) {
                break;
            }
            StateRecord firstStateRecord2 = map2.getFirstStateRecord();
            Intrinsics.checkNotNull(firstStateRecord2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>");
            SnapshotStateMap.StateMapStateRecord stateMapStateRecord2 = (SnapshotStateMap.StateMapStateRecord) firstStateRecord2;
            synchronized (SnapshotKt.nHg()) {
                snapshotT = Snapshot.INSTANCE.t();
                zO = map2.O((SnapshotStateMap.StateMapStateRecord) SnapshotKt.k(stateMapStateRecord2, map2, snapshotT), modification, persistentMapBuild);
            }
            SnapshotKt.jB(snapshotT, map2);
        } while (!zO);
        return z2;
    }

    public SnapshotMapValueSet(SnapshotStateMap snapshotStateMap) {
        super(snapshotStateMap);
    }

    public Void J2(Object element) {
        SnapshotStateMapKt.rl();
        throw new KotlinNothingValueException();
    }

    public Void Uo(Collection elements) {
        SnapshotStateMapKt.rl();
        throw new KotlinNothingValueException();
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        return ((Boolean) J2(obj)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public /* bridge */ /* synthetic */ boolean addAll(Collection collection) {
        return ((Boolean) Uo(collection)).booleanValue();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object element) {
        return getMap().containsValue(element);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object element) {
        return getMap().az(element);
    }
}
