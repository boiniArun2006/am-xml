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

/* JADX INFO: renamed from: androidx.compose.runtime.SnapshotMutableDoubleStateImpl, reason: from toString */
/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001#B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R$\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u0007R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00040\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006$"}, d2 = {"Landroidx/compose/runtime/SnapshotMutableDoubleStateImpl;", "Landroidx/compose/runtime/snapshots/StateObjectImpl;", "Landroidx/compose/runtime/MutableDoubleState;", "Landroidx/compose/runtime/snapshots/SnapshotMutableState;", "", "value", "<init>", "(D)V", "Landroidx/compose/runtime/snapshots/StateRecord;", "", "HI", "(Landroidx/compose/runtime/snapshots/StateRecord;)V", "previous", "current", "applied", "XQ", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/runtime/SnapshotMutableDoubleStateImpl$DoubleStateStateRecord;", "t", "Landroidx/compose/runtime/SnapshotMutableDoubleStateImpl$DoubleStateStateRecord;", "next", "ck", "()Landroidx/compose/runtime/snapshots/StateRecord;", "firstStateRecord", "nr", "()D", "az", "doubleValue", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "O", "()Landroidx/compose/runtime/SnapshotMutationPolicy;", "policy", "DoubleStateStateRecord", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSnapshotDoubleState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnapshotDoubleState.kt\nandroidx/compose/runtime/SnapshotMutableDoubleStateImpl\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 FloatingPointEquality.android.kt\nandroidx/compose/runtime/internal/FloatingPointEquality_androidKt\n+ 4 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,194:1\n2475#2:195\n2392#2,2:201\n1894#2,2:203\n2394#2,4:207\n2475#2:217\n49#3,5:196\n49#3,5:212\n33#4,2:205\n1#5:211\n*S KotlinDebug\n*F\n+ 1 SnapshotDoubleState.kt\nandroidx/compose/runtime/SnapshotMutableDoubleStateImpl\n*L\n146#1:195\n148#1:201,2\n148#1:203,2\n148#1:207,4\n180#1:217\n147#1:196,5\n172#1:212,5\n148#1:205,2\n148#1:211\n*E\n"})
public class MutableDoubleState extends StateObjectImpl implements androidx.compose.runtime.MutableDoubleState, SnapshotMutableState<Double> {

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private DoubleStateStateRecord next;

    /* JADX INFO: renamed from: androidx.compose.runtime.SnapshotMutableDoubleStateImpl$DoubleStateStateRecord */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u00012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/compose/runtime/SnapshotMutableDoubleStateImpl$DoubleStateStateRecord;", "Landroidx/compose/runtime/snapshots/StateRecord;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "", "value", "<init>", "(JD)V", "", "t", "(Landroidx/compose/runtime/snapshots/StateRecord;)V", "nr", "()Landroidx/compose/runtime/snapshots/StateRecord;", "O", "(J)Landroidx/compose/runtime/snapshots/StateRecord;", "D", "mUb", "()D", "gh", "(D)V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class DoubleStateStateRecord extends StateRecord {

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private double value;

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord O(long snapshotId) {
            return new DoubleStateStateRecord(snapshotId, this.value);
        }

        public final void gh(double d2) {
            this.value = d2;
        }

        /* JADX INFO: renamed from: mUb, reason: from getter */
        public final double getValue() {
            return this.value;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public void t(StateRecord value) {
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord");
            this.value = ((DoubleStateStateRecord) value).value;
        }

        public DoubleStateStateRecord(long j2, double d2) {
            super(j2);
            this.value = d2;
        }

        @Override // androidx.compose.runtime.snapshots.StateRecord
        public StateRecord nr() {
            return O(getSnapshotId());
        }
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public void HI(StateRecord value) {
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord");
        this.next = (DoubleStateStateRecord) value;
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    public StateRecord XQ(StateRecord previous, StateRecord current, StateRecord applied) {
        Intrinsics.checkNotNull(current, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord");
        Intrinsics.checkNotNull(applied, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableDoubleStateImpl.DoubleStateStateRecord");
        if (((DoubleStateStateRecord) current).getValue() == ((DoubleStateStateRecord) applied).getValue()) {
            return current;
        }
        return null;
    }

    @Override // androidx.compose.runtime.MutableDoubleState
    public void az(double d2) {
        Snapshot snapshotT;
        DoubleStateStateRecord doubleStateStateRecord = (DoubleStateStateRecord) SnapshotKt.X(this.next);
        if (doubleStateStateRecord.getValue() == d2) {
            return;
        }
        DoubleStateStateRecord doubleStateStateRecord2 = this.next;
        synchronized (SnapshotKt.nHg()) {
            snapshotT = Snapshot.INSTANCE.t();
            ((DoubleStateStateRecord) SnapshotKt.P5(doubleStateStateRecord2, this, snapshotT, doubleStateStateRecord)).gh(d2);
            Unit unit = Unit.INSTANCE;
        }
        SnapshotKt.jB(snapshotT, this);
    }

    @Override // androidx.compose.runtime.snapshots.StateObject
    /* JADX INFO: renamed from: ck */
    public StateRecord getFirstStateRecord() {
        return this.next;
    }

    @Override // androidx.compose.runtime.MutableDoubleState, androidx.compose.runtime.DoubleState
    public double nr() {
        return ((DoubleStateStateRecord) SnapshotKt.M(this.next, this)).getValue();
    }

    public String toString() {
        return "MutableDoubleState(value=" + ((DoubleStateStateRecord) SnapshotKt.X(this.next)).getValue() + ")@" + hashCode();
    }

    public MutableDoubleState(double d2) {
        Snapshot snapshotN = SnapshotKt.N();
        DoubleStateStateRecord doubleStateStateRecord = new DoubleStateStateRecord(snapshotN.getSnapshotId(), d2);
        if (!(snapshotN instanceof GlobalSnapshot)) {
            doubleStateStateRecord.KN(new DoubleStateStateRecord(SnapshotId_jvmKt.t(1), d2));
        }
        this.next = doubleStateStateRecord;
    }

    @Override // androidx.compose.runtime.snapshots.SnapshotMutableState
    /* JADX INFO: renamed from: O */
    public SnapshotMutationPolicy getPolicy() {
        return SnapshotStateKt.r();
    }
}
