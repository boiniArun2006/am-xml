package androidx.compose.runtime.snapshots;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.internal.Thread_jvmKt;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0001\n\u0002\b\u0011\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0012H\u0010¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0018\u001a\u00020\u00172\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J;\u0010\u001b\u001a\u00020\u00012\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0014\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0005H\u0010¢\u0006\u0004\b\u001d\u0010\u000eJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u0017H\u0010¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u0017H\u0010¢\u0006\u0004\b\"\u0010!R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010%R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010%RF\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0014\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0010@VX\u0090\u000e¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-RF\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0014\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00038\u0010@VX\u0090\u000e¢\u0006\u0012\n\u0004\b.\u0010)\u001a\u0004\b/\u0010+\"\u0004\b0\u0010-R\u001a\u00104\u001a\u0002018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010,\u001a\u0004\b2\u00103R\u0014\u00107\u001a\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R,\u0010<\u001a\u000601j\u0002`82\n\u00109\u001a\u000601j\u0002`88V@PX\u0096\u000e¢\u0006\f\u001a\u0004\b:\u00103\"\u0004\b(\u0010;R$\u0010A\u001a\u00020=2\u0006\u00109\u001a\u00020=8P@PX\u0090\u000e¢\u0006\f\u001a\u0004\b>\u0010?\"\u0004\b&\u0010@R4\u0010G\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010B2\u000e\u00109\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010B8P@VX\u0090\u000e¢\u0006\f\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR$\u0010L\u001a\u00020H2\u0006\u00109\u001a\u00020H8P@PX\u0090\u000e¢\u0006\f\u001a\u0004\bI\u0010J\"\u0004\b.\u0010KR\u0014\u0010O\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010N¨\u0006P"}, d2 = {"Landroidx/compose/runtime/snapshots/TransparentObserverMutableSnapshot;", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "parentSnapshot", "Lkotlin/Function1;", "", "", "specifiedReadObserver", "specifiedWriteObserver", "", "mergeParentObservers", "ownsParentSnapshot", "<init>", "(Landroidx/compose/runtime/snapshots/MutableSnapshot;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZ)V", "nr", "()V", "Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "E2", "()Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "Landroidx/compose/runtime/snapshots/StateObject;", "state", "ck", "(Landroidx/compose/runtime/snapshots/StateObject;)V", "readObserver", "Landroidx/compose/runtime/snapshots/Snapshot;", "aYN", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/Snapshot;", "writeObserver", "M7", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/MutableSnapshot;", "HI", "snapshot", "", "FX", "(Landroidx/compose/runtime/snapshots/Snapshot;)Ljava/lang/Void;", "B", "o", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "Z", "XQ", "<set-?>", "S", "Lkotlin/jvm/functions/Function1;", "nHg", "()Lkotlin/jvm/functions/Function1;", "J", "(Lkotlin/jvm/functions/Function1;)V", "WPU", "gh", "D", "", "M", "()J", "threadId", "E", "()Landroidx/compose/runtime/snapshots/MutableSnapshot;", "currentSnapshot", "Landroidx/compose/runtime/snapshots/SnapshotId;", "value", "xMQ", "(J)V", "snapshotId", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "J2", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "invalid", "Landroidx/collection/MutableScatterSet;", "X", "()Landroidx/collection/MutableScatterSet;", "P5", "(Landroidx/collection/MutableScatterSet;)V", "modified", "", "mUb", "()I", "(I)V", "writeCount", "KN", "()Z", "readOnly", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class TransparentObserverMutableSnapshot extends MutableSnapshot {

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private Function1 readObserver;

    /* JADX INFO: renamed from: WPU, reason: from kotlin metadata */
    private Function1 writeObserver;

    /* JADX INFO: renamed from: XQ, reason: from kotlin metadata */
    private final boolean ownsParentSnapshot;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private final boolean mergeParentObservers;

    /* JADX INFO: renamed from: aYN, reason: from kotlin metadata */
    private final long threadId;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final MutableSnapshot parentSnapshot;

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public void nr() {
        MutableSnapshot mutableSnapshot;
        Z(true);
        if (!this.ownsParentSnapshot || (mutableSnapshot = this.parentSnapshot) == null) {
            return;
        }
        mutableSnapshot.nr();
    }

    private final MutableSnapshot E() {
        MutableSnapshot mutableSnapshot = this.parentSnapshot;
        return mutableSnapshot == null ? SnapshotKt.gh : mutableSnapshot;
    }

    public void D(Function1 function1) {
        this.writeObserver = function1;
    }

    public void J(Function1 function1) {
        this.readObserver = function1;
    }

    /* JADX INFO: renamed from: M, reason: from getter */
    public final long getThreadId() {
        return this.threadId;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    /* JADX INFO: renamed from: gh, reason: from getter */
    public Function1 getWriteObserver() {
        return this.writeObserver;
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    /* JADX INFO: renamed from: nHg, reason: from getter and merged with bridge method [inline-methods] */
    public Function1 getReadObserver() {
        return this.readObserver;
    }

    public TransparentObserverMutableSnapshot(MutableSnapshot mutableSnapshot, Function1 function1, Function1 function12, boolean z2, boolean z3) {
        Function1 writeObserver;
        Function1 function1Uo;
        super(SnapshotKt.rl, SnapshotIdSet.INSTANCE.n(), SnapshotKt.s7N(function1, (mutableSnapshot == null || (function1Uo = mutableSnapshot.Uo()) == null) ? SnapshotKt.gh.Uo() : function1Uo, z2), SnapshotKt.v(function12, (mutableSnapshot == null || (writeObserver = mutableSnapshot.getWriteObserver()) == null) ? SnapshotKt.gh.getWriteObserver() : writeObserver));
        this.parentSnapshot = mutableSnapshot;
        this.mergeParentObservers = z2;
        this.ownsParentSnapshot = z3;
        this.readObserver = super.Uo();
        this.writeObserver = super.getWriteObserver();
        this.threadId = Thread_jvmKt.n();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public Void ty(Snapshot snapshot) {
        SnapshotStateMapKt.rl();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    public SnapshotApplyResult E2() {
        return E().E2();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    /* JADX INFO: renamed from: FX, reason: merged with bridge method [inline-methods] */
    public Void az(Snapshot snapshot) {
        SnapshotStateMapKt.rl();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public void HI() {
        E().HI();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* JADX INFO: renamed from: J2 */
    public SnapshotIdSet getInvalid() {
        return E().getInvalid();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public boolean KN() {
        return E().KN();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    public MutableSnapshot M7(Function1 readObserver, Function1 writeObserver) {
        Function1 function1WTp = SnapshotKt.wTp(readObserver, Uo(), false, 4, null);
        Function1 function1V = SnapshotKt.v(writeObserver, getWriteObserver());
        if (!this.mergeParentObservers) {
            return new TransparentObserverMutableSnapshot(E().M7(null, function1V), function1WTp, function1V, false, true);
        }
        return E().M7(function1WTp, function1V);
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    public void P5(MutableScatterSet mutableScatterSet) {
        SnapshotStateMapKt.rl();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void S(long j2) {
        SnapshotStateMapKt.rl();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public void WPU(int i2) {
        E().WPU(i2);
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot
    /* JADX INFO: renamed from: X */
    public MutableScatterSet getModified() {
        return E().getModified();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void XQ(SnapshotIdSet snapshotIdSet) {
        SnapshotStateMapKt.rl();
        throw new KotlinNothingValueException();
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public Snapshot aYN(Function1 readObserver) {
        Function1 function1WTp = SnapshotKt.wTp(readObserver, Uo(), false, 4, null);
        if (!this.mergeParentObservers) {
            return SnapshotKt.E2(E().aYN(null), function1WTp, true);
        }
        return E().aYN(function1WTp);
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    public void ck(StateObject state) {
        E().ck(state);
    }

    @Override // androidx.compose.runtime.snapshots.MutableSnapshot, androidx.compose.runtime.snapshots.Snapshot
    /* JADX INFO: renamed from: mUb */
    public int getWriteCount() {
        return E().getWriteCount();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* JADX INFO: renamed from: xMQ */
    public long getSnapshotId() {
        return E().getSnapshotId();
    }
}
