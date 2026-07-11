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

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0003B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001c\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0016\u001a\u00020\u00132\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0018\u001a\u00020\u00132\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0017J\u0018\u0010\u0019\u001a\u00020\u00132\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u0015J\u001d\u0010\u001a\u001a\u00020\u00132\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u001a\u0010\u0017¨\u0006\u001b"}, d2 = {"Landroidx/compose/runtime/snapshots/SnapshotMapKeySet;", "K", "V", "Landroidx/compose/runtime/snapshots/SnapshotMapSet;", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "map", "<init>", "(Landroidx/compose/runtime/snapshots/SnapshotStateMap;)V", "element", "", "J2", "(Ljava/lang/Object;)Ljava/lang/Void;", "", "elements", "Uo", "(Ljava/util/Collection;)Ljava/lang/Void;", "Landroidx/compose/runtime/snapshots/StateMapMutableKeysIterator;", "KN", "()Landroidx/compose/runtime/snapshots/StateMapMutableKeysIterator;", "", "remove", "(Ljava/lang/Object;)Z", "removeAll", "(Ljava/util/Collection;)Z", "retainAll", "contains", "containsAll", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSnapshotStateMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotMapKeySet\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotStateMap\n+ 4 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 5 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,416:1\n1855#2,2:417\n1726#2,3:457\n114#3,2:419\n157#3,5:421\n162#3:428\n150#3:429\n163#3,5:431\n116#3,7:436\n168#3,2:443\n154#3:445\n171#3:455\n123#3:456\n33#4,2:426\n2475#5:430\n2365#5,2:446\n1894#5,2:448\n2367#5,4:450\n1#6:454\n*S KotlinDebug\n*F\n+ 1 SnapshotStateMap.kt\nandroidx/compose/runtime/snapshots/SnapshotMapKeySet\n*L\n272#1:417,2\n283#1:457,3\n278#1:419,2\n278#1:421,5\n278#1:428\n278#1:429\n278#1:431,5\n278#1:436,7\n278#1:443,2\n278#1:445\n278#1:455\n278#1:456\n278#1:426,2\n278#1:430\n278#1:446,2\n278#1:448,2\n278#1:450,4\n278#1:454\n*E\n"})
final class SnapshotMapKeySet<K, V> extends SnapshotMapSet<K, V, K> {
    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    /* JADX INFO: renamed from: KN, reason: merged with bridge method [inline-methods] */
    public StateMapMutableKeysIterator iterator() {
        return new StateMapMutableKeysIterator(getMap(), ((ImmutableSet) getMap().mUb().getMap().entrySet()).iterator());
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection elements) {
        Collection collection = elements;
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!getMap().containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection elements) {
        Iterator it = elements.iterator();
        while (true) {
            boolean z2 = false;
            while (it.hasNext()) {
                if (getMap().remove(it.next()) != null || z2) {
                    z2 = true;
                }
            }
            return z2;
        }
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
                if (!set.contains(entry.getKey())) {
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

    public SnapshotMapKeySet(SnapshotStateMap snapshotStateMap) {
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
        return getMap().containsKey(element);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object element) {
        if (getMap().remove(element) != null) {
            return true;
        }
        return false;
    }
}
