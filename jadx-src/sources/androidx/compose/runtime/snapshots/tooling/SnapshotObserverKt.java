package androidx.compose.runtime.snapshots.tooling;

import androidx.collection.ScatterSet;
import androidx.compose.runtime.collection.ScatterSetWrapperKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001aq\u0010\u000e\u001a\u001c\u0012\u0004\u0012\u00020\f\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\f\u0018\u00010\r0\u000b*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0001¢\u0006\u0004\b\u000e\u0010\u000f\u001aI\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00062\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001aA\u0010\u0016\u001a\u00020\b*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0014\u001a\u00020\u00022\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\f\u0018\u00010\rH\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a'\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\u00022\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bH\u0000¢\u0006\u0004\b\u001e\u0010\u001f\"$\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00008\u0002@\u0002X\u0083\u000e¢\u0006\f\n\u0004\b \u0010!\u0012\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "Landroidx/compose/runtime/snapshots/tooling/SnapshotObserver;", "Landroidx/compose/runtime/snapshots/Snapshot;", "parent", "", "readonly", "Lkotlin/Function1;", "", "", "readObserver", "writeObserver", "Lkotlin/Pair;", "Landroidx/compose/runtime/snapshots/tooling/SnapshotInstanceObservers;", "", "O", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;Landroidx/compose/runtime/snapshots/Snapshot;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lkotlin/Pair;", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "b", "J2", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;", "result", "observerMap", "rl", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/Snapshot;Ljava/util/Map;)V", "snapshot", "nr", "(Landroidx/compose/runtime/snapshots/Snapshot;)V", "Landroidx/collection/ScatterSet;", "Landroidx/compose/runtime/snapshots/StateObject;", "changes", "t", "(Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/collection/ScatterSet;)V", c.f62177j, "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "getObservers$annotations", "()V", "observers", "runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSnapshotObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotObserver.kt\nandroidx/compose/runtime/snapshots/tooling/SnapshotObserverKt\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 4 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,269:1\n1894#2,2:270\n1894#2,2:298\n33#3,2:272\n33#3,2:300\n33#4,6:274\n33#4,6:280\n33#4,6:286\n33#4,6:292\n1#5:302\n*S KotlinDebug\n*F\n+ 1 SnapshotObserver.kt\nandroidx/compose/runtime/snapshots/tooling/SnapshotObserverKt\n*L\n174#1:270,2\n176#1:298,2\n174#1:272,2\n176#1:300,2\n219#1:274,6\n250#1:280,6\n258#1:286,6\n266#1:292,6\n*E\n"})
public final class SnapshotObserverKt {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static PersistentList f31027n;

    private static final Function1 J2(final Function1 function1, final Function1 function12) {
        return (function1 == null || function12 == null) ? function1 == null ? function12 : function1 : new Function1<Object, Unit>() { // from class: androidx.compose.runtime.snapshots.tooling.SnapshotObserverKt$mergeObservers$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void n(Object obj) {
                function1.invoke(obj);
                function12.invoke(obj);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                n(obj);
                return Unit.INSTANCE;
            }
        };
    }

    public static final void nr(Snapshot snapshot) {
        PersistentList persistentList = f31027n;
        if (persistentList != null) {
            int size = persistentList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((SnapshotObserver) persistentList.get(i2)).J2(snapshot);
            }
        }
    }

    public static final void t(Snapshot snapshot, ScatterSet scatterSet) {
        Set setEmptySet;
        PersistentList persistentList = f31027n;
        if (persistentList == null || persistentList.isEmpty()) {
            return;
        }
        if (scatterSet == null || (setEmptySet = ScatterSetWrapperKt.n(scatterSet)) == null) {
            setEmptySet = SetsKt.emptySet();
        }
        int size = persistentList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((SnapshotObserver) persistentList.get(i2)).nr(snapshot, setEmptySet);
        }
    }

    public static final Pair O(PersistentList persistentList, Snapshot snapshot, boolean z2, Function1 function1, Function1 function12) {
        int size = persistentList.size();
        LinkedHashMap linkedHashMap = null;
        for (int i2 = 0; i2 < size; i2++) {
            SnapshotObserver snapshotObserver = (SnapshotObserver) persistentList.get(i2);
            SnapshotInstanceObservers snapshotInstanceObserversN = snapshotObserver.n(snapshot, z2);
            if (snapshotInstanceObserversN != null) {
                function1 = J2(snapshotInstanceObserversN.getReadObserver(), function1);
                function12 = J2(snapshotInstanceObserversN.getWriteObserver(), function12);
                if (linkedHashMap == null) {
                    linkedHashMap = new LinkedHashMap();
                }
                linkedHashMap.put(snapshotObserver, snapshotInstanceObserversN);
            }
        }
        return TuplesKt.to(new SnapshotInstanceObservers(function1, function12), linkedHashMap);
    }

    public static final void rl(PersistentList persistentList, Snapshot snapshot, Snapshot snapshot2, Map map) {
        SnapshotInstanceObservers snapshotInstanceObservers;
        int size = persistentList.size();
        for (int i2 = 0; i2 < size; i2++) {
            SnapshotObserver snapshotObserver = (SnapshotObserver) persistentList.get(i2);
            if (map != null) {
                snapshotInstanceObservers = (SnapshotInstanceObservers) map.get(snapshotObserver);
            } else {
                snapshotInstanceObservers = null;
            }
            snapshotObserver.rl(snapshot2, snapshot, snapshotInstanceObservers);
        }
    }
}
