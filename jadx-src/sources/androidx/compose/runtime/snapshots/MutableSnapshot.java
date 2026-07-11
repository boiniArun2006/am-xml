package androidx.compose.runtime.snapshots;

import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.PreconditionsKt;
import androidx.compose.runtime.collection.ScatterSetWrapperKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.SnapshotApplyResult;
import androidx.compose.runtime.snapshots.tooling.SnapshotInstanceObservers;
import androidx.compose.runtime.snapshots.tooling.SnapshotObserverKt;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u001b\n\u0002\u0010 \n\u0002\b\u0019\b\u0017\u0018\u0000 >2\u00020\u0001:\u0001jBI\b\u0000\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u000fJ\u000f\u0010\u0012\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u000fJ\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J?\u0010\u0016\u001a\u00020\u00002\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00072\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001b\u0010\u000fJ%\u0010\u001c\u001a\u00020\u00012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010!\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u0001H\u0010¢\u0006\u0004\b!\u0010 J\u000f\u0010\"\u001a\u00020\tH\u0010¢\u0006\u0004\b\"\u0010\u000fJ\u000f\u0010#\u001a\u00020\tH\u0010¢\u0006\u0004\b#\u0010\u000fJ\u000f\u0010$\u001a\u00020\tH\u0010¢\u0006\u0004\b$\u0010\u000fJG\u0010-\u001a\u00020\u00182\n\u0010%\u001a\u00060\u0002j\u0002`\u00032\f\u0010(\u001a\b\u0012\u0004\u0012\u00020'0&2\u0014\u0010+\u001a\u0010\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020*\u0018\u00010)2\u0006\u0010,\u001a\u00020\u0005H\u0000¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\tH\u0000¢\u0006\u0004\b/\u0010\u000fJ\u001b\u00101\u001a\u00020\t2\n\u00100\u001a\u00060\u0002j\u0002`\u0003H\u0000¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020\t2\u0006\u00100\u001a\u000203H\u0000¢\u0006\u0004\b4\u00105J\u0017\u00108\u001a\u00020\t2\u0006\u00107\u001a\u000206H\u0000¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020\t2\u0006\u0010:\u001a\u00020\u0005H\u0000¢\u0006\u0004\b;\u0010<J\u0017\u0010>\u001a\u00020\t2\u0006\u0010=\u001a\u00020'H\u0010¢\u0006\u0004\b>\u0010?R(\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0010X\u0090\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR(\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0010X\u0090\u0004¢\u0006\f\n\u0004\bD\u0010A\u001a\u0004\bE\u0010CR\"\u0010K\u001a\u0002038\u0010@\u0010X\u0090\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u00105R:\u0010(\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010&2\u000e\u0010L\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010&8\u0010@VX\u0090\u000e¢\u0006\u0012\n\u0004\bH\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR*\u0010X\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010R8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bE\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010^\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010<R\"\u0010c\u001a\u0002068\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u00109R\u0016\u0010:\u001a\u0002038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010GR\"\u0010h\u001a\u00020\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010d\u001a\u0004\be\u0010\u0015\"\u0004\bf\u0010gR\u0014\u0010i\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bD\u0010\u0015¨\u0006k"}, d2 = {"Landroidx/compose/runtime/snapshots/MutableSnapshot;", "Landroidx/compose/runtime/snapshots/Snapshot;", "", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "Lkotlin/Function1;", "", "", "readObserver", "writeObserver", "<init>", "(JLandroidx/compose/runtime/snapshots/SnapshotIdSet;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "p5", "()V", "eF", "iF", "jB", "", "s7N", "()Z", "M7", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/MutableSnapshot;", "Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "E2", "()Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "nr", "aYN", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/Snapshot;", "snapshot", "az", "(Landroidx/compose/runtime/snapshots/Snapshot;)V", "ty", "HI", "t", "r", "nextId", "Landroidx/collection/MutableScatterSet;", "Landroidx/compose/runtime/snapshots/StateObject;", "modified", "", "Landroidx/compose/runtime/snapshots/StateRecord;", "optimisticMerges", "invalidSnapshots", "wTp", "(JLandroidx/collection/MutableScatterSet;Ljava/util/Map;Landroidx/compose/runtime/snapshots/SnapshotIdSet;)Landroidx/compose/runtime/snapshots/SnapshotApplyResult;", "fD", "id", "v", "(J)V", "", "bzg", "(I)V", "", "handles", "Xw", "([I)V", "snapshots", "rV9", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;)V", "state", "ck", "(Landroidx/compose/runtime/snapshots/StateObject;)V", "Uo", "Lkotlin/jvm/functions/Function1;", "nHg", "()Lkotlin/jvm/functions/Function1;", "KN", "gh", "xMQ", "I", "mUb", "()I", "WPU", "writeCount", "<set-?>", "Landroidx/collection/MutableScatterSet;", "X", "()Landroidx/collection/MutableScatterSet;", "P5", "(Landroidx/collection/MutableScatterSet;)V", "", "Ljava/util/List;", "getMerged$runtime_release", "()Ljava/util/List;", "setMerged$runtime_release", "(Ljava/util/List;)V", "merged", "qie", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "()Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "setPreviousIds$runtime_release", "previousIds", "[I", "N", "()[I", "setPreviousPinnedSnapshots$runtime_release", "previousPinnedSnapshots", "Z", "e", "U", "(Z)V", "applied", "readOnly", "Companion", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/MutableSnapshot\n+ 2 SnapshotObserver.kt\nandroidx/compose/runtime/snapshots/tooling/SnapshotObserverKt\n+ 3 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 4 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 7 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 8 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 9 Preconditions.kt\nandroidx/compose/runtime/PreconditionsKt\n+ 10 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot\n*L\n1#1,2487:1\n1101#1,2:2500\n1107#1,3:2506\n1110#1:2513\n1111#1,5:2515\n1101#1,2:2610\n1107#1,3:2617\n1110#1:2624\n1111#1,5:2626\n1101#1,9:2718\n1110#1:2731\n1111#1,5:2733\n193#2,12:2488\n205#2,2:2520\n193#2,12:2598\n205#2,2:2631\n1894#3,2:2502\n1894#3,2:2509\n1894#3,2:2522\n1894#3,2:2538\n1894#3,2:2612\n1894#3,2:2620\n1894#3,2:2703\n1894#3,2:2714\n1894#3,2:2727\n1894#3,2:2738\n1894#3,2:2742\n33#4,2:2504\n33#4,2:2511\n33#4,2:2524\n33#4,2:2540\n33#4,2:2614\n33#4,2:2622\n33#4,2:2705\n33#4,2:2716\n33#4,2:2729\n33#4,2:2740\n33#4,2:2744\n1#5:2514\n1#5:2616\n1#5:2625\n1#5:2691\n1#5:2732\n1#5:2746\n33#6,6:2526\n33#6,6:2532\n33#6,6:2592\n33#6,4:2699\n38#6:2707\n33#6,6:2708\n231#7,3:2542\n200#7,7:2545\n211#7,3:2553\n214#7,9:2557\n234#7:2566\n231#7,3:2567\n200#7,7:2570\n211#7,3:2578\n214#7,9:2582\n234#7:2591\n231#7,3:2649\n200#7,7:2652\n211#7,3:2660\n214#7,9:2664\n234#7:2673\n231#7,3:2674\n200#7,7:2677\n211#7,3:2685\n214#7,2:2689\n217#7,6:2692\n234#7:2698\n1399#8:2552\n1270#8:2556\n1399#8:2577\n1270#8:2581\n1399#8:2659\n1270#8:2663\n1399#8:2684\n1270#8:2688\n33#9,5:2633\n48#9,5:2638\n48#9,5:2644\n205#10:2643\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/MutableSnapshot\n*L\n771#1:2500,2\n771#1:2506,3\n771#1:2513\n771#1:2515,5\n923#1:2610,2\n923#1:2617,3\n923#1:2624\n923#1:2626,5\n1118#1:2718,9\n1118#1:2731\n1118#1:2733,5\n768#1:2488,12\n768#1:2520,2\n917#1:2598,12\n917#1:2631,2\n772#1:2502,2\n771#1:2509,2\n830#1:2522,2\n886#1:2538,2\n924#1:2612,2\n923#1:2620,2\n1084#1:2703,2\n1109#1:2714,2\n1118#1:2727,2\n1121#1:2738,2\n1142#1:2742,2\n772#1:2504,2\n771#1:2511,2\n830#1:2524,2\n886#1:2540,2\n924#1:2614,2\n923#1:2622,2\n1084#1:2705,2\n1109#1:2716,2\n1118#1:2729,2\n1121#1:2740,2\n1142#1:2744,2\n771#1:2514\n923#1:2625\n1118#1:2732\n872#1:2526,6\n878#1:2532,6\n891#1:2592,6\n1081#1:2699,4\n1081#1:2707\n1092#1:2708,6\n889#1:2542,3\n889#1:2545,7\n889#1:2553,3\n889#1:2557,9\n889#1:2566\n890#1:2567,3\n890#1:2570,7\n890#1:2578,3\n890#1:2582,9\n890#1:2591\n989#1:2649,3\n989#1:2652,7\n989#1:2660,3\n989#1:2664,9\n989#1:2673\n1024#1:2674,3\n1024#1:2677,7\n1024#1:2685,3\n1024#1:2689,2\n1024#1:2692,6\n1024#1:2698\n889#1:2552\n889#1:2556\n890#1:2577\n890#1:2581\n989#1:2659\n989#1:2663\n1024#1:2684\n1024#1:2688\n943#1:2633,5\n967#1:2638,5\n971#1:2644,5\n971#1:2643\n*E\n"})
public class MutableSnapshot extends Snapshot {

    /* JADX INFO: renamed from: HI, reason: from kotlin metadata */
    private boolean applied;

    /* JADX INFO: renamed from: KN, reason: from kotlin metadata */
    private final Function1 writeObserver;

    /* JADX INFO: renamed from: Uo, reason: from kotlin metadata */
    private final Function1 readObserver;

    /* JADX INFO: renamed from: az, reason: from kotlin metadata */
    private int[] previousPinnedSnapshots;

    /* JADX INFO: renamed from: gh, reason: from kotlin metadata */
    private List merged;

    /* JADX INFO: renamed from: mUb, reason: from kotlin metadata */
    private MutableScatterSet modified;

    /* JADX INFO: renamed from: qie, reason: from kotlin metadata */
    private SnapshotIdSet previousIds;

    /* JADX INFO: renamed from: ty, reason: from kotlin metadata */
    private int snapshots;

    /* JADX INFO: renamed from: xMQ, reason: from kotlin metadata */
    private int writeCount;
    private static final Companion ck = new Companion(null);
    public static final int Ik = 8;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int[] f30937r = new int[0];

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/snapshots/MutableSnapshot$Companion;", "", "()V", "EmptyIntArray", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public MutableSnapshot(long j2, SnapshotIdSet snapshotIdSet, Function1 function1, Function1 function12) {
        super(j2, snapshotIdSet, null);
        this.readObserver = function1;
        this.writeObserver = function12;
        this.previousIds = SnapshotIdSet.INSTANCE.n();
        this.previousPinnedSnapshots = f30937r;
        this.snapshots = 1;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public boolean KN() {
        return false;
    }

    public final void Xw(int[] handles) {
        if (handles.length == 0) {
            return;
        }
        int[] iArr = this.previousPinnedSnapshots;
        if (iArr.length != 0) {
            handles = ArraysKt.plus(iArr, handles);
        }
        this.previousPinnedSnapshots = handles;
    }

    private final void eF() {
        if (!this.applied || ((Snapshot) this).pinningTrackingHandle >= 0) {
            return;
        }
        PreconditionsKt.rl("Unsupported operation on a disposed or applied snapshot");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void iF() {
        MutableScatterSet modified = getModified();
        if (modified != null) {
            p5();
            P5(null);
            long snapshotId = getSnapshotId();
            Object[] objArr = modified.elements;
            long[] jArr = modified.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j2 = jArr[i2];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i5 = 0; i5 < i3; i5++) {
                            if ((255 & j2) < 128) {
                                for (StateRecord firstStateRecord = ((StateObject) objArr[(i2 << 3) + i5]).getFirstStateRecord(); firstStateRecord != null; firstStateRecord = firstStateRecord.getNext()) {
                                    if (firstStateRecord.getSnapshotId() == snapshotId || CollectionsKt.contains(this.previousIds, Long.valueOf(firstStateRecord.getSnapshotId()))) {
                                        firstStateRecord.xMQ(SnapshotKt.rl);
                                    }
                                }
                            }
                            j2 >>= 8;
                        }
                        if (i3 != 8) {
                            break;
                        } else if (i2 == length) {
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
        }
        rl();
    }

    private final void jB() {
        int length = this.previousPinnedSnapshots.length;
        for (int i2 = 0; i2 < length; i2++) {
            SnapshotKt.FX(this.previousPinnedSnapshots[i2]);
        }
    }

    private final void p5() {
        if (this.applied) {
            PreconditionsKt.rl("Unsupported operation on a snapshot that has been applied");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0143 A[Catch: all -> 0x012d, TryCatch #1 {all -> 0x012d, blocks: (B:43:0x00e7, B:45:0x00f7, B:48:0x0105, B:50:0x0111, B:52:0x011b, B:54:0x0121, B:57:0x0130, B:64:0x0143, B:67:0x014d, B:69:0x0157, B:71:0x0161, B:73:0x0167, B:74:0x0171, B:77:0x0179, B:78:0x017c, B:80:0x0180, B:82:0x0187, B:83:0x0193, B:60:0x0138), top: B:93:0x00e7 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0180 A[Catch: all -> 0x012d, TryCatch #1 {all -> 0x012d, blocks: (B:43:0x00e7, B:45:0x00f7, B:48:0x0105, B:50:0x0111, B:52:0x011b, B:54:0x0121, B:57:0x0130, B:64:0x0143, B:67:0x014d, B:69:0x0157, B:71:0x0161, B:73:0x0167, B:74:0x0171, B:77:0x0179, B:78:0x017c, B:80:0x0180, B:82:0x0187, B:83:0x0193, B:60:0x0138), top: B:93:0x00e7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public SnapshotApplyResult E2() {
        Map mapU;
        List list;
        MutableScatterSet modified;
        long j2;
        long j3;
        List list2;
        MutableScatterSet modified2 = getModified();
        if (modified2 != null) {
            GlobalSnapshot globalSnapshot = SnapshotKt.gh;
            mapU = SnapshotKt.U(globalSnapshot.getSnapshotId(), this, SnapshotKt.f30962O.mUb(globalSnapshot.getSnapshotId()));
        } else {
            mapU = null;
        }
        List listEmptyList = CollectionsKt.emptyList();
        synchronized (SnapshotKt.nHg()) {
            try {
                SnapshotKt.Y(this);
                if (modified2 == null || modified2.get_size() == 0) {
                    t();
                    GlobalSnapshot globalSnapshot2 = SnapshotKt.gh;
                    MutableScatterSet modified3 = globalSnapshot2.getModified();
                    SnapshotKt.J(globalSnapshot2, SnapshotKt.f30963n);
                    if (modified3 == null || !modified3.J2()) {
                        list = listEmptyList;
                        modified = null;
                    } else {
                        list = SnapshotKt.xMQ;
                        modified = modified3;
                    }
                } else {
                    GlobalSnapshot globalSnapshot3 = SnapshotKt.gh;
                    SnapshotApplyResult snapshotApplyResultWTp = wTp(SnapshotKt.J2, modified2, mapU, SnapshotKt.f30962O.mUb(globalSnapshot3.getSnapshotId()));
                    if (!Intrinsics.areEqual(snapshotApplyResultWTp, SnapshotApplyResult.Success.f30945n)) {
                        return snapshotApplyResultWTp;
                    }
                    t();
                    modified = globalSnapshot3.getModified();
                    SnapshotKt.J(globalSnapshot3, SnapshotKt.f30963n);
                    P5(null);
                    globalSnapshot3.P5(null);
                    list = SnapshotKt.xMQ;
                }
                Unit unit = Unit.INSTANCE;
                this.applied = true;
                if (modified != null) {
                    Set setN = ScatterSetWrapperKt.n(modified);
                    if (!setN.isEmpty()) {
                        int size = list.size();
                        for (int i2 = 0; i2 < size; i2++) {
                            ((Function2) list.get(i2)).invoke(setN, this);
                        }
                    }
                }
                if (modified2 != null && modified2.J2()) {
                    Set setN2 = ScatterSetWrapperKt.n(modified2);
                    int size2 = list.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        ((Function2) list.get(i3)).invoke(setN2, this);
                    }
                }
                SnapshotObserverKt.t(this, modified2);
                synchronized (SnapshotKt.nHg()) {
                    try {
                        r();
                        SnapshotKt.fD();
                        if (modified != null) {
                            Object[] objArr = modified.elements;
                            long[] jArr = modified.metadata;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i5 = 0;
                                j2 = 128;
                                while (true) {
                                    long j4 = jArr[i5];
                                    j3 = 255;
                                    if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i7 = 8 - ((~(i5 - length)) >>> 31);
                                        for (int i8 = 0; i8 < i7; i8++) {
                                            if ((j4 & 255) < 128) {
                                                SnapshotKt.p5((StateObject) objArr[(i5 << 3) + i8]);
                                            }
                                            j4 >>= 8;
                                        }
                                        if (i7 != 8) {
                                            break;
                                        }
                                        if (i5 == length) {
                                            break;
                                        }
                                        i5++;
                                    }
                                }
                            }
                            if (modified2 != null) {
                                Object[] objArr2 = modified2.elements;
                                long[] jArr2 = modified2.metadata;
                                int length2 = jArr2.length - 2;
                                if (length2 >= 0) {
                                    int i9 = 0;
                                    while (true) {
                                        long j5 = jArr2[i9];
                                        if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i10 = 8 - ((~(i9 - length2)) >>> 31);
                                            for (int i11 = 0; i11 < i10; i11++) {
                                                if ((j5 & j3) < j2) {
                                                    SnapshotKt.p5((StateObject) objArr2[(i9 << 3) + i11]);
                                                }
                                                j5 >>= 8;
                                            }
                                            if (i10 != 8) {
                                                break;
                                            }
                                            if (i9 == length2) {
                                                break;
                                            }
                                            i9++;
                                        }
                                    }
                                }
                            }
                            list2 = this.merged;
                            if (list2 != null) {
                                int size3 = list2.size();
                                for (int i12 = 0; i12 < size3; i12++) {
                                    SnapshotKt.p5((StateObject) list2.get(i12));
                                }
                            }
                            this.merged = null;
                            Unit unit2 = Unit.INSTANCE;
                        }
                        j2 = 128;
                        j3 = 255;
                        if (modified2 != null) {
                        }
                        list2 = this.merged;
                        if (list2 != null) {
                        }
                        this.merged = null;
                        Unit unit22 = Unit.INSTANCE;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return SnapshotApplyResult.Success.f30945n;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void HI() {
        if (this.applied || getDisposed()) {
            return;
        }
        fD();
    }

    public MutableSnapshot M7(Function1 readObserver, Function1 writeObserver) {
        Map map;
        NestedMutableSnapshot nestedMutableSnapshot;
        te();
        eF();
        PersistentList persistentList = SnapshotObserverKt.f31027n;
        Function1 function1 = readObserver;
        Function1 writeObserver2 = writeObserver;
        if (persistentList != null) {
            Pair pairO = SnapshotObserverKt.O(persistentList, this, false, function1, writeObserver2);
            SnapshotInstanceObservers snapshotInstanceObservers = (SnapshotInstanceObservers) pairO.getFirst();
            Function1 readObserver2 = snapshotInstanceObservers.getReadObserver();
            writeObserver2 = snapshotInstanceObservers.getWriteObserver();
            map = (Map) pairO.getSecond();
            function1 = readObserver2;
        } else {
            map = null;
        }
        v(getSnapshotId());
        synchronized (SnapshotKt.nHg()) {
            long j2 = SnapshotKt.J2;
            SnapshotKt.J2++;
            SnapshotKt.f30962O = SnapshotKt.f30962O.ty(j2);
            SnapshotIdSet invalid = getInvalid();
            XQ(invalid.ty(j2));
            nestedMutableSnapshot = new NestedMutableSnapshot(j2, SnapshotKt.g(invalid, getSnapshotId() + 1, j2), SnapshotKt.wTp(function1, Uo(), false, 4, null), SnapshotKt.v(writeObserver2, getWriteObserver()), this);
        }
        if (!getApplied() && !getDisposed()) {
            long snapshotId = getSnapshotId();
            synchronized (SnapshotKt.nHg()) {
                long j3 = SnapshotKt.J2;
                SnapshotKt.J2++;
                S(j3);
                SnapshotKt.f30962O = SnapshotKt.f30962O.ty(getSnapshotId());
                Unit unit = Unit.INSTANCE;
            }
            XQ(SnapshotKt.g(getInvalid(), snapshotId + 1, getSnapshotId()));
        }
        if (persistentList != null) {
            SnapshotObserverKt.rl(persistentList, this, nestedMutableSnapshot, map);
        }
        return nestedMutableSnapshot;
    }

    /* JADX INFO: renamed from: N, reason: from getter */
    public final int[] getPreviousPinnedSnapshots() {
        return this.previousPinnedSnapshots;
    }

    public void P5(MutableScatterSet mutableScatterSet) {
        this.modified = mutableScatterSet;
    }

    /* JADX INFO: renamed from: T, reason: from getter */
    public final SnapshotIdSet getPreviousIds() {
        return this.previousIds;
    }

    public final void U(boolean z2) {
        this.applied = z2;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void WPU(int i2) {
        this.writeCount = i2;
    }

    /* JADX INFO: renamed from: X, reason: from getter */
    public MutableScatterSet getModified() {
        return this.modified;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public Snapshot aYN(Function1 readObserver) {
        Function1 function1;
        Map map;
        NestedReadonlySnapshot nestedReadonlySnapshot;
        te();
        eF();
        long snapshotId = getSnapshotId();
        MutableSnapshot mutableSnapshot = this instanceof GlobalSnapshot ? null : this;
        PersistentList persistentList = SnapshotObserverKt.f31027n;
        if (persistentList != null) {
            Pair pairO = SnapshotObserverKt.O(persistentList, mutableSnapshot, true, readObserver, null);
            SnapshotInstanceObservers snapshotInstanceObservers = (SnapshotInstanceObservers) pairO.getFirst();
            Function1 readObserver2 = snapshotInstanceObservers.getReadObserver();
            snapshotInstanceObservers.getWriteObserver();
            function1 = readObserver2;
            map = (Map) pairO.getSecond();
        } else {
            function1 = readObserver;
            map = null;
        }
        v(getSnapshotId());
        synchronized (SnapshotKt.nHg()) {
            long j2 = SnapshotKt.J2;
            SnapshotKt.J2++;
            SnapshotKt.f30962O = SnapshotKt.f30962O.ty(j2);
            nestedReadonlySnapshot = new NestedReadonlySnapshot(j2, SnapshotKt.g(getInvalid(), snapshotId + 1, j2), SnapshotKt.wTp(function1, Uo(), false, 4, null), this);
        }
        if (!getApplied() && !getDisposed()) {
            long snapshotId2 = getSnapshotId();
            synchronized (SnapshotKt.nHg()) {
                long j3 = SnapshotKt.J2;
                SnapshotKt.J2++;
                S(j3);
                SnapshotKt.f30962O = SnapshotKt.f30962O.ty(getSnapshotId());
                Unit unit = Unit.INSTANCE;
            }
            XQ(SnapshotKt.g(getInvalid(), snapshotId2 + 1, getSnapshotId()));
        }
        if (persistentList != null) {
            SnapshotObserverKt.rl(persistentList, mutableSnapshot, nestedReadonlySnapshot, map);
        }
        return nestedReadonlySnapshot;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void az(Snapshot snapshot) {
        this.snapshots++;
    }

    public final void bzg(int id) {
        if (id >= 0) {
            this.previousPinnedSnapshots = ArraysKt.plus(this.previousPinnedSnapshots, id);
        }
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getApplied() {
        return this.applied;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* JADX INFO: renamed from: gh, reason: from getter */
    public Function1 getWriteObserver() {
        return this.writeObserver;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* JADX INFO: renamed from: mUb, reason: from getter */
    public int getWriteCount() {
        return this.writeCount;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    /* JADX INFO: renamed from: nHg, reason: from getter and merged with bridge method [inline-methods] */
    public Function1 getReadObserver() {
        return this.readObserver;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void ty(Snapshot snapshot) {
        if (!(this.snapshots > 0)) {
            PreconditionsKt.n("no pending nested snapshots");
        }
        int i2 = this.snapshots - 1;
        this.snapshots = i2;
        if (i2 != 0 || this.applied) {
            return;
        }
        iF();
    }

    public final SnapshotApplyResult wTp(long nextId, MutableScatterSet modified, Map optimisticMerges, SnapshotIdSet invalidSnapshots) {
        List listPlus;
        SnapshotIdSet snapshotIdSet;
        Object[] objArr;
        long[] jArr;
        int i2;
        Object[] objArr2;
        long[] jArr2;
        int i3;
        long j2;
        SnapshotIdSet snapshotIdSet2;
        ArrayList arrayList;
        StateRecord stateRecordXQ;
        SnapshotIdSet snapshotIdSetAz = getInvalid().ty(getSnapshotId()).az(this.previousIds);
        Object[] objArr3 = modified.elements;
        long[] jArr3 = modified.metadata;
        int length = jArr3.length - 2;
        ArrayList arrayList2 = null;
        if (length >= 0) {
            listPlus = null;
            int i5 = 0;
            while (true) {
                long j3 = jArr3[i5];
                List arrayList3 = listPlus;
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i7 = 8;
                    int i8 = 8 - ((~(i5 - length)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((j3 & 255) < 128) {
                            i3 = i7;
                            StateObject stateObject = (StateObject) objArr3[(i5 << 3) + i9];
                            i2 = i9;
                            StateRecord firstStateRecord = stateObject.getFirstStateRecord();
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            StateRecord stateRecordE = SnapshotKt.E(firstStateRecord, nextId, invalidSnapshots);
                            if (stateRecordE == null) {
                                j2 = j3;
                            } else {
                                j2 = j3;
                                StateRecord stateRecordE2 = SnapshotKt.E(firstStateRecord, getSnapshotId(), snapshotIdSetAz);
                                if (stateRecordE2 != null && stateRecordE2.getSnapshotId() != SnapshotId_jvmKt.t(1)) {
                                    if (Intrinsics.areEqual(stateRecordE, stateRecordE2)) {
                                        snapshotIdSet2 = snapshotIdSetAz;
                                        arrayList = arrayList2;
                                    } else {
                                        snapshotIdSet2 = snapshotIdSetAz;
                                        arrayList = arrayList2;
                                        StateRecord stateRecordE3 = SnapshotKt.E(firstStateRecord, getSnapshotId(), getInvalid());
                                        if (stateRecordE3 == null) {
                                            SnapshotKt.eF();
                                            throw new KotlinNothingValueException();
                                        }
                                        if (optimisticMerges == null || (stateRecordXQ = (StateRecord) optimisticMerges.get(stateRecordE)) == null) {
                                            stateRecordXQ = stateObject.XQ(stateRecordE2, stateRecordE, stateRecordE3);
                                        }
                                        if (stateRecordXQ == null) {
                                            return new SnapshotApplyResult.Failure(this);
                                        }
                                        if (!Intrinsics.areEqual(stateRecordXQ, stateRecordE3)) {
                                            if (Intrinsics.areEqual(stateRecordXQ, stateRecordE)) {
                                                arrayList2 = arrayList == null ? new ArrayList() : arrayList;
                                                arrayList2.add(TuplesKt.to(stateObject, stateRecordE.O(getSnapshotId())));
                                                if (arrayList3 == null) {
                                                    arrayList3 = new ArrayList();
                                                }
                                                List list = arrayList3;
                                                list.add(stateObject);
                                                arrayList3 = list;
                                            } else {
                                                arrayList2 = arrayList == null ? new ArrayList() : arrayList;
                                                arrayList2.add(!Intrinsics.areEqual(stateRecordXQ, stateRecordE2) ? TuplesKt.to(stateObject, stateRecordXQ) : TuplesKt.to(stateObject, stateRecordE2.O(getSnapshotId())));
                                            }
                                        }
                                    }
                                    arrayList2 = arrayList;
                                }
                                snapshotIdSetAz = snapshotIdSet2;
                                j3 = j2 >> i3;
                                i9 = i2 + 1;
                                i7 = i3;
                                objArr3 = objArr2;
                                jArr3 = jArr2;
                            }
                        } else {
                            i2 = i9;
                            objArr2 = objArr3;
                            jArr2 = jArr3;
                            i3 = i7;
                            j2 = j3;
                        }
                        snapshotIdSet2 = snapshotIdSetAz;
                        snapshotIdSetAz = snapshotIdSet2;
                        j3 = j2 >> i3;
                        i9 = i2 + 1;
                        i7 = i3;
                        objArr3 = objArr2;
                        jArr3 = jArr2;
                    }
                    snapshotIdSet = snapshotIdSetAz;
                    objArr = objArr3;
                    jArr = jArr3;
                    ArrayList arrayList4 = arrayList2;
                    if (i8 != i7) {
                        listPlus = arrayList3;
                        arrayList2 = arrayList4;
                        break;
                    }
                    arrayList2 = arrayList4;
                } else {
                    snapshotIdSet = snapshotIdSetAz;
                    objArr = objArr3;
                    jArr = jArr3;
                }
                listPlus = arrayList3;
                if (i5 == length) {
                    break;
                }
                i5++;
                snapshotIdSetAz = snapshotIdSet;
                objArr3 = objArr;
                jArr3 = jArr;
            }
        } else {
            listPlus = null;
        }
        if (arrayList2 != null) {
            fD();
            int size = arrayList2.size();
            for (int i10 = 0; i10 < size; i10++) {
                Pair pair = (Pair) arrayList2.get(i10);
                StateObject stateObject2 = (StateObject) pair.component1();
                StateRecord stateRecord = (StateRecord) pair.component2();
                stateRecord.xMQ(nextId);
                synchronized (SnapshotKt.nHg()) {
                    stateRecord.KN(stateObject2.getFirstStateRecord());
                    stateObject2.HI(stateRecord);
                    Unit unit = Unit.INSTANCE;
                }
            }
        }
        if (listPlus != null) {
            int size2 = listPlus.size();
            for (int i11 = 0; i11 < size2; i11++) {
                modified.nY((StateObject) listPlus.get(i11));
            }
            List list2 = this.merged;
            if (list2 != null) {
                listPlus = CollectionsKt.plus((Collection) list2, (Iterable) listPlus);
            }
            this.merged = listPlus;
        }
        return SnapshotApplyResult.Success.f30945n;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void ck(StateObject state) {
        MutableScatterSet modified = getModified();
        if (modified == null) {
            modified = ScatterSetKt.n();
            P5(modified);
        }
        modified.xMQ(state);
    }

    public final void fD() {
        v(getSnapshotId());
        Unit unit = Unit.INSTANCE;
        if (!getApplied() && !getDisposed()) {
            long snapshotId = getSnapshotId();
            synchronized (SnapshotKt.nHg()) {
                long j2 = SnapshotKt.J2;
                SnapshotKt.J2++;
                S(j2);
                SnapshotKt.f30962O = SnapshotKt.f30962O.ty(getSnapshotId());
            }
            XQ(SnapshotKt.g(getInvalid(), snapshotId + 1, getSnapshotId()));
        }
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void nr() {
        if (!getDisposed()) {
            super.nr();
            ty(this);
            SnapshotObserverKt.nr(this);
        }
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void r() {
        jB();
        super.r();
    }

    public final void rV9(SnapshotIdSet snapshots) {
        synchronized (SnapshotKt.nHg()) {
            this.previousIds = this.previousIds.az(snapshots);
            Unit unit = Unit.INSTANCE;
        }
    }

    public boolean s7N() {
        MutableScatterSet modified = getModified();
        if (modified == null || !modified.J2()) {
            return false;
        }
        return true;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void t() {
        SnapshotKt.f30962O = SnapshotKt.f30962O.mUb(getSnapshotId()).xMQ(this.previousIds);
    }

    public final void v(long id) {
        synchronized (SnapshotKt.nHg()) {
            this.previousIds = this.previousIds.ty(id);
            Unit unit = Unit.INSTANCE;
        }
    }
}
