package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.internal.Thread_jvmKt;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0001\n\u0002\b\u0011\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000eH\u0010¢\u0006\u0004\b\u0010\u0010\u0011J%\u0010\u0013\u001a\u00020\u00012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0005H\u0010¢\u0006\u0004\b\u0015\u0010\rJ\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u001a\u0010\u0019R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eRF\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0014\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0010@VX\u0090\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R(\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0010X\u0090\u0004¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b'\u0010$R\u001a\u0010.\u001a\u00020)8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001a\u00102\u001a\u00020\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u0010\u001c\u001a\u0004\b0\u00101R\u0014\u00104\u001a\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b3\u00101R,\u00109\u001a\u00060)j\u0002`52\n\u00106\u001a\u00060)j\u0002`58V@PX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010-\"\u0004\b7\u00108R$\u0010?\u001a\u00020:2\u0006\u00106\u001a\u00020:8P@PX\u0090\u000e¢\u0006\f\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u0014\u0010A\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010@¨\u0006B"}, d2 = {"Landroidx/compose/runtime/snapshots/TransparentObserverSnapshot;", "Landroidx/compose/runtime/snapshots/Snapshot;", "previousSnapshot", "Lkotlin/Function1;", "", "", "specifiedReadObserver", "", "mergeParentObservers", "ownsPreviousSnapshot", "<init>", "(Landroidx/compose/runtime/snapshots/Snapshot;Lkotlin/jvm/functions/Function1;ZZ)V", "nr", "()V", "Landroidx/compose/runtime/snapshots/StateObject;", "state", "ck", "(Landroidx/compose/runtime/snapshots/StateObject;)V", "readObserver", "aYN", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/Snapshot;", "HI", "snapshot", "", "e", "(Landroidx/compose/runtime/snapshots/Snapshot;)Ljava/lang/Void;", "X", "Uo", "Landroidx/compose/runtime/snapshots/Snapshot;", "KN", "Z", "xMQ", "<set-?>", "mUb", "Lkotlin/jvm/functions/Function1;", "fD", "()Lkotlin/jvm/functions/Function1;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "(Lkotlin/jvm/functions/Function1;)V", "gh", "writeObserver", "", "qie", "J", "E2", "()J", "threadId", "az", "getRoot", "()Landroidx/compose/runtime/snapshots/Snapshot;", "root", "iF", "currentSnapshot", "Landroidx/compose/runtime/snapshots/SnapshotId;", "value", "setSnapshotId$runtime_release", "(J)V", "snapshotId", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "J2", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "setInvalid$runtime_release", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "invalid", "()Z", "readOnly", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TransparentObserverSnapshot extends Snapshot {

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final boolean mergeParentObservers;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final Snapshot previousSnapshot;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private final Snapshot root;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private final Function1 writeObserver;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private Function1 readObserver;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private final long threadId;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private final boolean ownsPreviousSnapshot;

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void nr() {
        Snapshot snapshot;
        Z(true);
        if (!this.ownsPreviousSnapshot || (snapshot = this.previousSnapshot) == null) {
            return;
        }
        snapshot.nr();
    }

    private final Snapshot iF() {
        Snapshot snapshot = this.previousSnapshot;
        return snapshot == null ? SnapshotKt.gh : snapshot;
    }

    /* JADX INFO: renamed from: E2, reason: from getter */
    public final long getThreadId() {
        return this.threadId;
    }

    public void T(Function1 function1) {
        this.readObserver = function1;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* JADX INFO: renamed from: fD, reason: from getter */
    public Function1 getReadObserver() {
        return this.readObserver;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* JADX INFO: renamed from: gh, reason: from getter */
    public Function1 getWriteObserver() {
        return this.writeObserver;
    }

    public TransparentObserverSnapshot(Snapshot snapshot, Function1 function1, boolean z2, boolean z3) {
        Function1 readObserver;
        super(SnapshotKt.rl, SnapshotIdSet.INSTANCE.n(), null);
        this.previousSnapshot = snapshot;
        this.mergeParentObservers = z2;
        this.ownsPreviousSnapshot = z3;
        this.readObserver = SnapshotKt.s7N(function1, (snapshot == null || (readObserver = snapshot.getReadObserver()) == null) ? SnapshotKt.gh.Uo() : readObserver, z2);
        this.threadId = Thread_jvmKt.n();
        this.root = this;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void HI() {
        iF().HI();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* JADX INFO: renamed from: J2 */
    public SnapshotIdSet getInvalid() {
        return iF().getInvalid();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean KN() {
        return iF().KN();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public Void ty(Snapshot snapshot) {
        SnapshotStateMapKt.rl();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public Snapshot aYN(Function1 readObserver) {
        Function1 function1WTp = SnapshotKt.wTp(readObserver, getReadObserver(), false, 4, null);
        if (!this.mergeParentObservers) {
            return SnapshotKt.E2(iF().aYN(null), function1WTp, true);
        }
        return iF().aYN(function1WTp);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void ck(StateObject state) {
        iF().ck(state);
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Void az(Snapshot snapshot) {
        SnapshotStateMapKt.rl();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* JADX INFO: renamed from: xMQ */
    public long getSnapshotId() {
        return iF().getSnapshotId();
    }
}
