package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.GlobalSnapshot;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotId_jvmKt;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import androidx.compose.runtime.snapshots.StateObjectImpl;
import androidx.compose.runtime.snapshots.StateRecord;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: androidx.compose.runtime.SnapshotMutableLongStateImpl, reason: from toString */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001#B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R$\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u0007R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006$"}, d2 = {"Landroidx/compose/runtime/SnapshotMutableLongStateImpl;", "Landroidx/compose/runtime/snapshots/StateObjectImpl;", "Landroidx/compose/runtime/MutableLongState;", "Landroidx/compose/runtime/snapshots/SnapshotMutableState;", "", "value", "<init>", "(J)V", "Landroidx/compose/runtime/snapshots/StateRecord;", "", "HI", "(Landroidx/compose/runtime/snapshots/StateRecord;)V", "previous", "current", "applied", "XQ", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/runtime/SnapshotMutableLongStateImpl$LongStateStateRecord;", "t", "Landroidx/compose/runtime/SnapshotMutableLongStateImpl$LongStateStateRecord;", "next", "ck", "()Landroidx/compose/runtime/snapshots/StateRecord;", "firstStateRecord", "rl", "()J", "nY", "longValue", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "O", "()Landroidx/compose/runtime/SnapshotMutationPolicy;", "policy", "LongStateStateRecord", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSnapshotLongState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotLongState.kt\nandroidx/compose/runtime/SnapshotMutableLongStateImpl\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,187:1\n2475#2:188\n2392#2,2:189\n1894#2,2:191\n2394#2,4:195\n2475#2:200\n33#3,2:193\n1#4:199\n*S KotlinDebug\n*F\n+ 1 SnapshotLongState.kt\nandroidx/compose/runtime/SnapshotMutableLongStateImpl\n*L\n139#1:188\n141#1:189,2\n141#1:191,2\n141#1:195,4\n173#1:200\n141#1:193,2\n141#1:199\n*E\n"})
public class MutableLongState extends StateObjectImpl implements androidx.compose.runtime.MutableLongState, SnapshotMutableState<Long> {

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private LongStateStateRecord next;

    /* JADX INFO: renamed from: androidx.compose.runtime.SnapshotMutableLongStateImpl$LongStateStateRecord */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\r\u001a\u00020\u00012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/compose/runtime/SnapshotMutableLongStateImpl$LongStateStateRecord;", "Landroidx/compose/runtime/snapshots/StateRecord;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "value", "<init>", "(JJ)V", "", "t", "(Landroidx/compose/runtime/snapshots/StateRecord;)V", "nr", "()Landroidx/compose/runtime/snapshots/StateRecord;", "O", "(J)Landroidx/compose/runtime/snapshots/StateRecord;", "J", "mUb", "()J", "gh", "(J)V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class LongStateStateRecord extends StateRecord {

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private long value;

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord O(long snapshotId) {
            return new LongStateStateRecord(snapshotId, this.value);
        }

        public final void gh(long j2) {
            this.value = j2;
        }

        /* JADX INFO: renamed from: mUb, reason: from getter */
        public final long getValue() {
            return this.value;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void t(StateRecord value) {
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
            this.value = ((LongStateStateRecord) value).value;
        }

        public LongStateStateRecord(long j2, long j3) {
            super(j2);
            this.value = j3;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord nr() {
            return O(SnapshotKt.N().getSnapshotId());
        }
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void HI(StateRecord value) {
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        this.next = (LongStateStateRecord) value;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public StateRecord XQ(StateRecord previous, StateRecord current, StateRecord applied) {
        Intrinsics.checkNotNull(current, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        Intrinsics.checkNotNull(applied, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableLongStateImpl.LongStateStateRecord");
        if (((LongStateStateRecord) current).getValue() == ((LongStateStateRecord) applied).getValue()) {
            return current;
        }
        return null;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    /* JADX INFO: renamed from: ck */
    public StateRecord getFirstStateRecord() {
        return this.next;
    }

    @Override // androidx.compose.runtime.MutableLongState
    public void nY(long j2) {
        Snapshot snapshotT;
        LongStateStateRecord longStateStateRecord = (LongStateStateRecord) SnapshotKt.X(this.next);
        if (longStateStateRecord.getValue() != j2) {
            LongStateStateRecord longStateStateRecord2 = this.next;
            synchronized (SnapshotKt.nHg()) {
                snapshotT = Snapshot.INSTANCE.t();
                ((LongStateStateRecord) SnapshotKt.P5(longStateStateRecord2, this, snapshotT, longStateStateRecord)).gh(j2);
                Unit unit = Unit.INSTANCE;
            }
            SnapshotKt.jB(snapshotT, this);
        }
    }

    @Override // androidx.compose.runtime.MutableLongState, androidx.compose.runtime.LongState
    public long rl() {
        return ((LongStateStateRecord) SnapshotKt.M(this.next, this)).getValue();
    }

    public String toString() {
        return "MutableLongState(value=" + ((LongStateStateRecord) SnapshotKt.X(this.next)).getValue() + ")@" + hashCode();
    }

    public MutableLongState(long j2) {
        Snapshot snapshotN = SnapshotKt.N();
        LongStateStateRecord longStateStateRecord = new LongStateStateRecord(snapshotN.getSnapshotId(), j2);
        if (!(snapshotN instanceof GlobalSnapshot)) {
            longStateStateRecord.KN(new LongStateStateRecord(SnapshotId_jvmKt.t(1), j2));
        }
        this.next = longStateStateRecord;
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotMutableState
    /* JADX INFO: renamed from: O */
    public SnapshotMutationPolicy getPolicy() {
        return SnapshotStateKt.r();
    }
}
