package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.tooling.SnapshotInstanceObservers;
import androidx.compose.runtime.snapshots.tooling.SnapshotObserverKt;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B9\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0001¢\u0006\u0004\b\f\u0010\rJ%\u0010\u000e\u001a\u00020\u00002\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0010¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u001b\u0010\u001aR(\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010%R\"\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u001f¨\u0006)"}, d2 = {"Landroidx/compose/runtime/snapshots/NestedReadonlySnapshot;", "Landroidx/compose/runtime/snapshots/Snapshot;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "Lkotlin/Function1;", "", "", "readObserver", "parent", "<init>", "(JLandroidx/compose/runtime/snapshots/SnapshotIdSet;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/snapshots/Snapshot;)V", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/NestedReadonlySnapshot;", "HI", "()V", "nr", "Landroidx/compose/runtime/snapshots/StateObject;", "state", "", "X", "(Landroidx/compose/runtime/snapshots/StateObject;)Ljava/lang/Void;", "snapshot", "e", "(Landroidx/compose/runtime/snapshots/Snapshot;)Ljava/lang/Void;", "E2", "Uo", "Lkotlin/jvm/functions/Function1;", "fD", "()Lkotlin/jvm/functions/Function1;", "KN", "Landroidx/compose/runtime/snapshots/Snapshot;", "iF", "()Landroidx/compose/runtime/snapshots/Snapshot;", "", "()Z", "readOnly", "gh", "writeObserver", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/NestedReadonlySnapshot\n+ 2 SnapshotObserver.kt\nandroidx/compose/runtime/snapshots/tooling/SnapshotObserverKt\n*L\n1#1,2487:1\n193#2,14:2488\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/NestedReadonlySnapshot\n*L\n1431#1:2488,14\n*E\n"})
public final class NestedReadonlySnapshot extends Snapshot {

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final Snapshot parent;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final Function1 readObserver;

    public NestedReadonlySnapshot(long j2, SnapshotIdSet snapshotIdSet, Function1 function1, Snapshot snapshot) {
        super(j2, snapshotIdSet, null);
        this.readObserver = function1;
        this.parent = snapshot;
        snapshot.az(this);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void HI() {
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean KN() {
        return true;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* JADX INFO: renamed from: gh */
    public Function1 getWriteObserver() {
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* JADX INFO: renamed from: fD, reason: from getter and merged with bridge method [inline-methods] */
    public Function1 Uo() {
        return this.readObserver;
    }

    /* JADX INFO: renamed from: iF, reason: from getter */
    public final Snapshot getParent() {
        return this.parent;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* JADX INFO: renamed from: E2, reason: merged with bridge method [inline-methods] */
    public Void az(Snapshot snapshot) {
        SnapshotStateMapKt.rl();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public NestedReadonlySnapshot aYN(Function1 readObserver) {
        Map map;
        PersistentList persistentList = SnapshotObserverKt.f31027n;
        if (persistentList != null) {
            Pair pairO = SnapshotObserverKt.O(persistentList, this, true, readObserver, null);
            SnapshotInstanceObservers snapshotInstanceObservers = (SnapshotInstanceObservers) pairO.getFirst();
            Function1 readObserver2 = snapshotInstanceObservers.getReadObserver();
            snapshotInstanceObservers.getWriteObserver();
            map = (Map) pairO.getSecond();
            readObserver = readObserver2;
        } else {
            map = null;
        }
        NestedReadonlySnapshot nestedReadonlySnapshot = new NestedReadonlySnapshot(getSnapshotId(), getInvalid(), SnapshotKt.wTp(readObserver, Uo(), false, 4, null), getParent());
        if (persistentList != null) {
            SnapshotObserverKt.rl(persistentList, this, nestedReadonlySnapshot, map);
        }
        return nestedReadonlySnapshot;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public Void ck(StateObject state) {
        SnapshotKt.B();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Void ty(Snapshot snapshot) {
        SnapshotStateMapKt.rl();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void nr() {
        if (!getDisposed()) {
            if (getSnapshotId() != this.parent.getSnapshotId()) {
                rl();
            }
            this.parent.ty(this);
            super.nr();
            SnapshotObserverKt.nr(this);
        }
    }
}
