package androidx.compose.runtime.snapshots;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotApplyResult;
import androidx.compose.runtime.snapshots.tooling.SnapshotObserverKt;
import com.safedk.android.internal.d;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001BO\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0006\u0010\f\u001a\u00020\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\f\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001a¨\u0006\u001c"}, d2 = {"Landroidx/compose/runtime/snapshots/NestedMutableSnapshot;", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "Lkotlin/Function1;", "", "", "readObserver", "writeObserver", "parent", "<init>", "(JLandroidx/compose/runtime/snapshots/SnapshotIdSet;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/snapshots/MutableSnapshot;)V", "E", "()V", "nr", "Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "E2", "()Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "o", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "getParent", "()Landroidx/compose/runtime/snapshots/MutableSnapshot;", "", "Z", d.f63017y, "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/NestedMutableSnapshot\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2487:1\n1894#2,2:2488\n33#3,2:2490\n1#4:2492\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/NestedMutableSnapshot\n*L\n1587#1:2488,2\n1587#1:2490,2\n*E\n"})
public final class NestedMutableSnapshot extends MutableSnapshot {

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private boolean deactivated;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final MutableSnapshot parent;

    private final void E() {
        if (this.deactivated) {
            return;
        }
        this.deactivated = true;
        this.parent.ty(this);
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    public SnapshotApplyResult E2() throws Throwable {
        NestedMutableSnapshot nestedMutableSnapshot;
        if (this.parent.getApplied() || this.parent.getDisposed()) {
            return new SnapshotApplyResult.Failure(this);
        }
        MutableScatterSet modified = getModified();
        long snapshotId = getSnapshotId();
        Map mapU = modified != null ? SnapshotKt.U(this.parent.getSnapshotId(), this, this.parent.getInvalid()) : null;
        synchronized (SnapshotKt.nHg()) {
            try {
                SnapshotKt.Y(this);
            } catch (Throwable th) {
                th = th;
            }
            try {
                if (modified == null || modified.get_size() == 0) {
                    nestedMutableSnapshot = this;
                    rl();
                } else {
                    nestedMutableSnapshot = this;
                    SnapshotApplyResult snapshotApplyResultWTp = nestedMutableSnapshot.wTp(this.parent.getSnapshotId(), modified, mapU, this.parent.getInvalid());
                    if (!Intrinsics.areEqual(snapshotApplyResultWTp, SnapshotApplyResult.Success.f30945n)) {
                        return snapshotApplyResultWTp;
                    }
                    MutableScatterSet modified2 = nestedMutableSnapshot.parent.getModified();
                    if (modified2 != null) {
                        modified2.mUb(modified);
                    } else {
                        nestedMutableSnapshot.parent.P5(modified);
                        P5(null);
                    }
                }
                if (nestedMutableSnapshot.parent.getSnapshotId() < snapshotId) {
                    nestedMutableSnapshot.parent.fD();
                }
                MutableSnapshot mutableSnapshot = nestedMutableSnapshot.parent;
                mutableSnapshot.XQ(mutableSnapshot.getInvalid().mUb(snapshotId).xMQ(getPreviousIds()));
                nestedMutableSnapshot.parent.v(snapshotId);
                nestedMutableSnapshot.parent.bzg(ViF());
                nestedMutableSnapshot.parent.rV9(getPreviousIds());
                nestedMutableSnapshot.parent.Xw(getPreviousPinnedSnapshots());
                Unit unit = Unit.INSTANCE;
                U(true);
                E();
                SnapshotObserverKt.t(this, modified);
                return SnapshotApplyResult.Success.f30945n;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    public NestedMutableSnapshot(long j2, SnapshotIdSet snapshotIdSet, Function1 function1, Function1 function12, MutableSnapshot mutableSnapshot) {
        super(j2, snapshotIdSet, function1, function12);
        this.parent = mutableSnapshot;
        mutableSnapshot.az(this);
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public void nr() {
        if (!getDisposed()) {
            super.nr();
            E();
        }
    }
}
