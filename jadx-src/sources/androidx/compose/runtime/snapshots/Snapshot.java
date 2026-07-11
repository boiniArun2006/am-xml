package androidx.compose.runtime.snapshots;

import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.internal.Thread_jvmKt;
import androidx.compose.runtime.snapshots.Snapshot;
import com.google.android.gms.ads.RequestConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 52\u00020\u0001:\u0001HB\u001d\b\u0004\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000e\u001a\u00020\u00002\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t\u0018\u00010\fH&¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u0000H\u0011¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\t2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0000H\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0015\u0010\u0011J\u0017\u0010\u0017\u001a\u00020\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0017\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0000H ¢\u0006\u0004\b\u0018\u0010\u0014J\u0017\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0000H ¢\u0006\u0004\b\u0019\u0010\u0014J\u0017\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001aH ¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\tH ¢\u0006\u0004\b\u001e\u0010\u000bJ\u000f\u0010\u001f\u001a\u00020\tH\u0000¢\u0006\u0004\b\u001f\u0010\u000bJ\u000f\u0010 \u001a\u00020\tH\u0010¢\u0006\u0004\b \u0010\u000bJ\u000f\u0010!\u001a\u00020\tH\u0010¢\u0006\u0004\b!\u0010\u000bJ\u000f\u0010\"\u001a\u00020\tH\u0000¢\u0006\u0004\b\"\u0010\u000bJ\u000f\u0010#\u001a\u00020\tH\u0000¢\u0006\u0004\b#\u0010\u000bJ\u000f\u0010%\u001a\u00020$H\u0000¢\u0006\u0004\b%\u0010&R\"\u0010\u0006\u001a\u00020\u00058\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R2\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\n\u0010-\u001a\u00060\u0002j\u0002`\u00038\u0016@PX\u0096\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00108\u001a\u0002038\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b \u00104\u001a\u0004\b5\u00106\"\u0004\b4\u00107R\u001c\u0010;\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\n\u00109\u0012\u0004\b:\u0010\u000bR$\u0010@\u001a\u00020$2\u0006\u0010<\u001a\u00020$8P@PX\u0090\u000e¢\u0006\f\u001a\u0004\b=\u0010&\"\u0004\b>\u0010?R\u0014\u0010B\u001a\u0002038&X¦\u0004¢\u0006\u0006\u001a\u0004\bA\u00106R(\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t\u0018\u00010\f8 X¡\u0004¢\u0006\f\u0012\u0004\bE\u0010\u000b\u001a\u0004\bC\u0010DR\"\u0010G\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\t\u0018\u00010\f8 X \u0004¢\u0006\u0006\u001a\u0004\bF\u0010D\u0082\u0001\u0004IJKL¨\u0006M"}, d2 = {"Landroidx/compose/runtime/snapshots/Snapshot;", "", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "<init>", "(JLandroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "", "nr", "()V", "Lkotlin/Function1;", "readObserver", "aYN", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/Snapshot;", "qie", "()Landroidx/compose/runtime/snapshots/Snapshot;", "snapshot", "o", "(Landroidx/compose/runtime/snapshots/Snapshot;)V", "nY", "oldSnapshot", "g", "az", "ty", "Landroidx/compose/runtime/snapshots/StateObject;", "state", "ck", "(Landroidx/compose/runtime/snapshots/StateObject;)V", "HI", "rl", "t", "r", "te", "Ik", "", "ViF", "()I", c.f62177j, "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "J2", "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "XQ", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "<set-?>", "J", "xMQ", "()J", "S", "(J)V", "", "Z", "O", "()Z", "(Z)V", "disposed", "I", "getPinningTrackingHandle$annotations", "pinningTrackingHandle", "value", "mUb", "WPU", "(I)V", "writeCount", "KN", "readOnly", "Uo", "()Lkotlin/jvm/functions/Function1;", "getReadObserver$annotations", "gh", "writeObserver", "Companion", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "Landroidx/compose/runtime/snapshots/NestedReadonlySnapshot;", "Landroidx/compose/runtime/snapshots/ReadonlySnapshot;", "Landroidx/compose/runtime/snapshots/TransparentObserverSnapshot;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 3 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 4 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2487:1\n1894#2,2:2488\n1894#2,2:2497\n33#3,2:2490\n33#3,2:2499\n48#4,5:2492\n33#4,5:2501\n1#5:2506\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n112#1:2488,2\n244#1:2497,2\n112#1:2490,2\n244#1:2499,2\n189#1:2492,5\n273#1:2501,5\n*E\n"})
public abstract class Snapshot {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private SnapshotIdSet invalid;

    /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
    private int pinningTrackingHandle;

    /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
    private long snapshotId;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private boolean disposed;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int J2 = 8;

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u00020\u00072\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ=\u0010\f\u001a\u00020\u000b2\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rJQ\u0010\u0011\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000e2\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0007H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J7\u0010\u0018\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0016\u001a\u00020\u00072\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010\u001d\u001a\u00020\u001c2\u001e\u0010\u0017\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\u001b\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00050\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\u001f\u001a\u00020\u001c2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u0005¢\u0006\u0004\b!\u0010\u0003J\r\u0010\"\u001a\u00020\u0005¢\u0006\u0004\b\"\u0010\u0003R\u0011\u0010%\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u001c\u0010(\u001a\u0004\u0018\u00010\u00078@X\u0081\u0004¢\u0006\f\u0012\u0004\b'\u0010\u0003\u001a\u0004\b&\u0010$¨\u0006)"}, d2 = {"Landroidx/compose/runtime/snapshots/Snapshot$Companion;", "", "<init>", "()V", "Lkotlin/Function1;", "", "readObserver", "Landroidx/compose/runtime/snapshots/Snapshot;", "ck", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/Snapshot;", "writeObserver", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "HI", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/MutableSnapshot;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Lkotlin/Function0;", "block", "Uo", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "previous", "O", "(Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/Snapshot;", "nonObservable", "observer", "az", "(Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/Snapshot;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function2;", "", "Landroidx/compose/runtime/snapshots/ObserverHandle;", "xMQ", "(Lkotlin/jvm/functions/Function2;)Landroidx/compose/runtime/snapshots/ObserverHandle;", "gh", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/ObserverHandle;", "J2", "ty", "t", "()Landroidx/compose/runtime/snapshots/Snapshot;", "current", "nr", "getCurrentThreadSnapshot$annotations", "currentThreadSnapshot", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 2 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 4 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n*L\n1#1,2487:1\n546#1:2493\n546#1:2499\n549#1:2500\n148#2,5:2488\n148#2,5:2494\n1894#3,2:2501\n1894#3,2:2505\n1894#3,2:2509\n1894#3,2:2513\n1894#3,2:2517\n33#4,2:2503\n33#4,2:2507\n33#4,2:2511\n33#4,2:2515\n33#4,2:2519\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n*L\n492#1:2493\n554#1:2499\n558#1:2500\n455#1:2488,5\n527#1:2494,5\n623#1:2501,2\n644#1:2505,2\n678#1:2509,2\n624#1:2513,2\n647#1:2517,2\n623#1:2503,2\n644#1:2507,2\n678#1:2511,2\n624#1:2515,2\n647#1:2519,2\n*E\n"})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ Object KN(Companion companion, Function1 function1, Function1 function12, Function0 function0, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                function1 = null;
            }
            if ((i2 & 2) != 0) {
                function12 = null;
            }
            return companion.Uo(function1, function12, function0);
        }

        public final Snapshot O(Snapshot previous) {
            if (previous instanceof TransparentObserverMutableSnapshot) {
                TransparentObserverMutableSnapshot transparentObserverMutableSnapshot = (TransparentObserverMutableSnapshot) previous;
                if (transparentObserverMutableSnapshot.getThreadId() == Thread_jvmKt.n()) {
                    transparentObserverMutableSnapshot.J(null);
                    return previous;
                }
            }
            if (previous instanceof TransparentObserverSnapshot) {
                TransparentObserverSnapshot transparentObserverSnapshot = (TransparentObserverSnapshot) previous;
                if (transparentObserverSnapshot.E2() == Thread_jvmKt.n()) {
                    transparentObserverSnapshot.T(null);
                    return previous;
                }
            }
            Snapshot snapshotE = SnapshotKt.e(previous, null, false, 6, null);
            snapshotE.qie();
            return snapshotE;
        }

        public final Object Uo(Function1 readObserver, Function1 writeObserver, Function0 block) {
            Snapshot transparentObserverMutableSnapshot;
            if (readObserver == null && writeObserver == null) {
                return block.invoke();
            }
            Snapshot snapshot = (Snapshot) SnapshotKt.f30964t.n();
            if (snapshot instanceof TransparentObserverMutableSnapshot) {
                TransparentObserverMutableSnapshot transparentObserverMutableSnapshot2 = (TransparentObserverMutableSnapshot) snapshot;
                if (transparentObserverMutableSnapshot2.getThreadId() == Thread_jvmKt.n()) {
                    Function1 function1NHg = transparentObserverMutableSnapshot2.Uo();
                    Function1 function1Gh = transparentObserverMutableSnapshot2.getWriteObserver();
                    try {
                        ((TransparentObserverMutableSnapshot) snapshot).J(SnapshotKt.wTp(readObserver, function1NHg, false, 4, null));
                        ((TransparentObserverMutableSnapshot) snapshot).D(SnapshotKt.v(writeObserver, function1Gh));
                        return block.invoke();
                    } finally {
                        transparentObserverMutableSnapshot2.J(function1NHg);
                        transparentObserverMutableSnapshot2.D(function1Gh);
                    }
                }
            }
            if (snapshot == null || (snapshot instanceof MutableSnapshot)) {
                transparentObserverMutableSnapshot = new TransparentObserverMutableSnapshot(snapshot instanceof MutableSnapshot ? (MutableSnapshot) snapshot : null, readObserver, writeObserver, true, false);
            } else {
                if (readObserver == null) {
                    return block.invoke();
                }
                transparentObserverMutableSnapshot = snapshot.aYN(readObserver);
            }
            try {
                Snapshot snapshotQie = transparentObserverMutableSnapshot.qie();
                try {
                    Object objInvoke = block.invoke();
                    transparentObserverMutableSnapshot.o(snapshotQie);
                    transparentObserverMutableSnapshot.nr();
                    return objInvoke;
                } catch (Throwable th) {
                    transparentObserverMutableSnapshot.o(snapshotQie);
                    throw th;
                }
            } catch (Throwable th2) {
                transparentObserverMutableSnapshot.nr();
                throw th2;
            }
        }

        public final void az(Snapshot previous, Snapshot nonObservable, Function1 observer) {
            if (previous != nonObservable) {
                nonObservable.o(previous);
                nonObservable.nr();
            } else if (previous instanceof TransparentObserverMutableSnapshot) {
                ((TransparentObserverMutableSnapshot) previous).J(observer);
            } else {
                if (previous instanceof TransparentObserverSnapshot) {
                    ((TransparentObserverSnapshot) previous).T(observer);
                    return;
                }
                throw new IllegalStateException(("Non-transparent snapshot was reused: " + previous).toString());
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void mUb(Function2 function2) {
            synchronized (SnapshotKt.nHg()) {
                SnapshotKt.xMQ = CollectionsKt.minus(SnapshotKt.xMQ, function2);
                Unit unit = Unit.INSTANCE;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void qie(Function1 function1) {
            synchronized (SnapshotKt.nHg()) {
                SnapshotKt.mUb = CollectionsKt.minus(SnapshotKt.mUb, function1);
                Unit unit = Unit.INSTANCE;
            }
            SnapshotKt.iF();
        }

        public final MutableSnapshot HI(Function1 readObserver, Function1 writeObserver) {
            MutableSnapshot mutableSnapshot;
            MutableSnapshot mutableSnapshotM7;
            Snapshot snapshotN = SnapshotKt.N();
            if (snapshotN instanceof MutableSnapshot) {
                mutableSnapshot = (MutableSnapshot) snapshotN;
            } else {
                mutableSnapshot = null;
            }
            if (mutableSnapshot != null && (mutableSnapshotM7 = mutableSnapshot.M7(readObserver, writeObserver)) != null) {
                return mutableSnapshotM7;
            }
            throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
        }

        public final void J2() {
            SnapshotKt.N().HI();
        }

        public final Snapshot ck(Function1 readObserver) {
            return SnapshotKt.N().aYN(readObserver);
        }

        public final ObserverHandle gh(final Function1 observer) {
            synchronized (SnapshotKt.nHg()) {
                SnapshotKt.mUb = CollectionsKt.plus((Collection<? extends Function1>) SnapshotKt.mUb, observer);
                Unit unit = Unit.INSTANCE;
            }
            SnapshotKt.iF();
            return new ObserverHandle() { // from class: androidx.compose.runtime.snapshots.n
                @Override // androidx.compose.runtime.snapshots.ObserverHandle
                public final void n() {
                    Snapshot.Companion.qie(observer);
                }
            };
        }

        public final Snapshot nr() {
            return (Snapshot) SnapshotKt.f30964t.n();
        }

        public final Snapshot t() {
            return SnapshotKt.N();
        }

        public final void ty() {
            boolean zS7N;
            synchronized (SnapshotKt.nHg()) {
                zS7N = SnapshotKt.gh.s7N();
            }
            if (zS7N) {
                SnapshotKt.iF();
            }
        }

        public final ObserverHandle xMQ(final Function2 observer) {
            SnapshotKt.te(SnapshotKt.f30963n);
            synchronized (SnapshotKt.nHg()) {
                SnapshotKt.xMQ = CollectionsKt.plus((Collection<? extends Function2>) SnapshotKt.xMQ, observer);
                Unit unit = Unit.INSTANCE;
            }
            return new ObserverHandle() { // from class: androidx.compose.runtime.snapshots.j
                @Override // androidx.compose.runtime.snapshots.ObserverHandle
                public final void n() {
                    Snapshot.Companion.mUb(observer);
                }
            };
        }
    }

    public /* synthetic */ Snapshot(long j2, SnapshotIdSet snapshotIdSet, DefaultConstructorMarker defaultConstructorMarker) {
        this(j2, snapshotIdSet);
    }

    public abstract void HI();

    public abstract boolean KN();

    public abstract Function1 Uo();

    public abstract Snapshot aYN(Function1 readObserver);

    public abstract void az(Snapshot snapshot);

    public abstract void ck(StateObject state);

    /* JADX INFO: renamed from: gh */
    public abstract Function1 getWriteObserver();

    public int mUb() {
        return 0;
    }

    public void nr() {
        this.disposed = true;
        synchronized (SnapshotKt.nHg()) {
            Ik();
            Unit unit = Unit.INSTANCE;
        }
    }

    public abstract void ty(Snapshot snapshot);

    private Snapshot(long j2, SnapshotIdSet snapshotIdSet) {
        this.invalid = snapshotIdSet;
        this.snapshotId = j2;
        this.pinningTrackingHandle = j2 != SnapshotKt.rl ? SnapshotKt.a(j2, getInvalid()) : -1;
    }

    public final void Ik() {
        int i2 = this.pinningTrackingHandle;
        if (i2 >= 0) {
            SnapshotKt.FX(i2);
            this.pinningTrackingHandle = -1;
        }
    }

    /* JADX INFO: renamed from: J2, reason: from getter */
    public SnapshotIdSet getInvalid() {
        return this.invalid;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final boolean getDisposed() {
        return this.disposed;
    }

    public void S(long j2) {
        this.snapshotId = j2;
    }

    public final int ViF() {
        int i2 = this.pinningTrackingHandle;
        this.pinningTrackingHandle = -1;
        return i2;
    }

    public void WPU(int i2) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public void XQ(SnapshotIdSet snapshotIdSet) {
        this.invalid = snapshotIdSet;
    }

    public final void Z(boolean z2) {
        this.disposed = z2;
    }

    public final void te() {
        if (this.disposed) {
            PreconditionsKt.n("Cannot use a disposed snapshot");
        }
    }

    /* JADX INFO: renamed from: xMQ, reason: from getter */
    public long getSnapshotId() {
        return this.snapshotId;
    }

    public final void g(Snapshot oldSnapshot) {
        boolean z2;
        if (SnapshotKt.f30964t.n() == this) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            PreconditionsKt.rl("Cannot leave snapshot; " + this + " is not the current snapshot");
        }
        o(oldSnapshot);
    }

    public final Snapshot nY() {
        return qie();
    }

    public void o(Snapshot snapshot) {
        SnapshotKt.f30964t.rl(snapshot);
    }

    public Snapshot qie() {
        Snapshot snapshot = (Snapshot) SnapshotKt.f30964t.n();
        SnapshotKt.f30964t.rl(this);
        return snapshot;
    }

    public void r() {
        Ik();
    }

    public final void rl() {
        synchronized (SnapshotKt.nHg()) {
            t();
            r();
            Unit unit = Unit.INSTANCE;
        }
    }

    public void t() {
        SnapshotKt.f30962O = SnapshotKt.f30962O.mUb(getSnapshotId());
    }
}
