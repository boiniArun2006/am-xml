package androidx.compose.runtime.snapshots;

import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.collection.ScatterSetWrapperKt;
import androidx.compose.runtime.internal.AtomicInt;
import androidx.compose.runtime.internal.SnapshotThreadLocal;
import androidx.compose.runtime.internal.WeakReference;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotIdSet;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0006\u001a\u00020\u00052\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a;\u0010\u0015\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t\u0018\u00010\u00102\b\b\u0002\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001aS\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t\u0018\u00010\u00102\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t\u0018\u00010\u00102\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t\u0018\u00010\u00102\b\b\u0002\u0010\u0018\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001aI\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t\u0018\u00010\u00102\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t\u0018\u00010\u00102\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a@\u0010$\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001e2\u0006\u0010 \u001a\u00020\u001f2!\u0010#\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00028\u00000\u0010H\u0002¢\u0006\u0004\b$\u0010%\u001a8\u0010&\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u001e2!\u0010#\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00028\u00000\u0010H\u0002¢\u0006\u0004\b&\u0010'\u001a\u000f\u0010(\u001a\u00020\tH\u0002¢\u0006\u0004\b(\u0010)\u001a<\u0010*\u001a\u00028\u0000\"\b\b\u0000\u0010\u001e*\u00020\f2!\u0010#\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00028\u00000\u0010H\u0002¢\u0006\u0004\b*\u0010+\u001a\u0017\u0010-\u001a\u00020\t2\u0006\u0010,\u001a\u00020\fH\u0002¢\u0006\u0004\b-\u0010.\u001a/\u00101\u001a\u00020\u00132\n\u0010/\u001a\u00060\u0000j\u0002`\u00012\n\u00100\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b1\u00102\u001a+\u00105\u001a\u00020\u00132\u0006\u00104\u001a\u0002032\n\u0010,\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b5\u00106\u001a7\u00109\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u001e*\u0002032\u0006\u00107\u001a\u00028\u00002\n\u00108\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b9\u0010:\u001a#\u0010=\u001a\u00028\u0000\"\b\b\u0000\u0010\u001e*\u000203*\u00028\u00002\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b=\u0010>\u001a\u000f\u0010@\u001a\u00020?H\u0002¢\u0006\u0004\b@\u0010A\u001a\u0019\u0010B\u001a\u0004\u0018\u0001032\u0006\u0010<\u001a\u00020;H\u0002¢\u0006\u0004\bB\u0010C\u001a\u0017\u0010D\u001a\u00020\u00132\u0006\u0010<\u001a\u00020;H\u0002¢\u0006\u0004\bD\u0010E\u001a\u000f\u0010F\u001a\u00020\tH\u0002¢\u0006\u0004\bF\u0010)\u001a\u0017\u0010G\u001a\u00020\t2\u0006\u0010<\u001a\u00020;H\u0002¢\u0006\u0004\bG\u0010H\u001a-\u0010I\u001a\u00028\u0000\"\b\b\u0000\u0010\u001e*\u000203*\u00028\u00002\u0006\u0010<\u001a\u00020;2\u0006\u0010,\u001a\u00020\fH\u0001¢\u0006\u0004\bI\u0010J\u001a5\u0010L\u001a\u00028\u0000\"\b\b\u0000\u0010\u001e*\u000203*\u00028\u00002\u0006\u0010<\u001a\u00020;2\u0006\u0010,\u001a\u00020\f2\u0006\u0010K\u001a\u00028\u0000H\u0000¢\u0006\u0004\bL\u0010M\u001a-\u0010N\u001a\u00028\u0000\"\b\b\u0000\u0010\u001e*\u000203*\u00028\u00002\u0006\u0010<\u001a\u00020;2\u0006\u0010,\u001a\u00020\fH\u0000¢\u0006\u0004\bN\u0010J\u001a-\u0010O\u001a\u00028\u0000\"\b\b\u0000\u0010\u001e*\u000203*\u00028\u00002\u0006\u0010<\u001a\u00020;2\u0006\u0010,\u001a\u00020\fH\u0002¢\u0006\u0004\bO\u0010J\u001a%\u0010P\u001a\u00028\u0000\"\b\b\u0000\u0010\u001e*\u000203*\u00028\u00002\u0006\u0010<\u001a\u00020;H\u0000¢\u0006\u0004\bP\u0010>\u001a\u001f\u0010Q\u001a\u00020\t2\u0006\u0010,\u001a\u00020\f2\u0006\u0010<\u001a\u00020;H\u0001¢\u0006\u0004\bQ\u0010R\u001a9\u0010X\u001a\u0010\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u000203\u0018\u00010W2\n\u0010S\u001a\u00060\u0000j\u0002`\u00012\u0006\u0010U\u001a\u00020T2\u0006\u0010V\u001a\u00020\u0003H\u0002¢\u0006\u0004\bX\u0010Y\u001a\u000f\u0010Z\u001a\u00020?H\u0002¢\u0006\u0004\bZ\u0010A\u001a)\u0010\u001e\u001a\u00028\u0000\"\b\b\u0000\u0010\u001e*\u0002032\u0006\u00107\u001a\u00028\u00002\u0006\u0010,\u001a\u00020\fH\u0001¢\u0006\u0004\b\u001e\u0010[\u001a!\u0010\\\u001a\u00028\u0000\"\b\b\u0000\u0010\u001e*\u0002032\u0006\u00107\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\\\u0010]\u001a+\u0010`\u001a\u00020\u0003*\u00020\u00032\n\u0010^\u001a\u00060\u0000j\u0002`\u00012\n\u0010_\u001a\u00060\u0000j\u0002`\u0001H\u0000¢\u0006\u0004\b`\u0010a\"/\u0010d\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(\u0004\u0012\u0004\u0012\u00020\t0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010c\"\u0018\u0010f\u001a\u00060\u0000j\u0002`\u00018\u0002X\u0082D¢\u0006\u0006\n\u0004\be\u0010$\"\u001a\u0010j\u001a\b\u0012\u0004\u0012\u00020\f0g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bh\u0010i\" \u0010p\u001a\u00020\u00118\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\bk\u0010l\u0012\u0004\bo\u0010)\u001a\u0004\bm\u0010n\"\u0016\u0010s\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010r\"\u0016\u0010u\u001a\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010$\"\u0014\u0010y\u001a\u00020v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010x\"\u001a\u0010}\u001a\b\u0012\u0004\u0012\u00020;0z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|\"8\u0010\u0083\u0001\u001a!\u0012\u001d\u0012\u001b\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020\u00110\u0080\u0001\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u007f0~8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001\"+\u0010\u0085\u0001\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\t0\u00100~8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0082\u0001\"\u0016\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001\"%\u0010\u008c\u0001\u001a\u00020\f8\u0000X\u0081\u0004¢\u0006\u0016\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u0012\u0005\b\u008b\u0001\u0010)\u001a\u0005\b\u008a\u0001\u0010\u000e\"\u001a\u0010\u0090\u0001\u001a\u00030\u008d\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001¨\u0006\u0091\u0001"}, d2 = {"", "Landroidx/compose/runtime/snapshots/SnapshotId;", "snapshotId", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "invalid", "", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "(JLandroidx/compose/runtime/snapshots/SnapshotIdSet;)I", "handle", "", "FX", "(I)V", "Landroidx/compose/runtime/snapshots/Snapshot;", "N", "()Landroidx/compose/runtime/snapshots/Snapshot;", "previousSnapshot", "Lkotlin/Function1;", "", "readObserver", "", "ownsPreviousSnapshot", "E2", "(Landroidx/compose/runtime/snapshots/Snapshot;Lkotlin/jvm/functions/Function1;Z)Landroidx/compose/runtime/snapshots/Snapshot;", "parentObserver", "mergeReadObserver", "s7N", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Z)Lkotlin/jvm/functions/Function1;", "writeObserver", "v", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lkotlin/jvm/functions/Function1;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/runtime/snapshots/GlobalSnapshot;", "globalSnapshot", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "block", "J", "(Landroidx/compose/runtime/snapshots/GlobalSnapshot;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "te", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "iF", "()V", "D", "(Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/snapshots/Snapshot;", "snapshot", "Y", "(Landroidx/compose/runtime/snapshots/Snapshot;)V", "currentSnapshot", "candidateSnapshot", "GR", "(JJLandroidx/compose/runtime/snapshots/SnapshotIdSet;)Z", "Landroidx/compose/runtime/snapshots/StateRecord;", "data", "Nxk", "(Landroidx/compose/runtime/snapshots/StateRecord;JLandroidx/compose/runtime/snapshots/SnapshotIdSet;)Z", "r", "id", "E", "(Landroidx/compose/runtime/snapshots/StateRecord;JLandroidx/compose/runtime/snapshots/SnapshotIdSet;)Landroidx/compose/runtime/snapshots/StateRecord;", "Landroidx/compose/runtime/snapshots/StateObject;", "state", "M", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;)Landroidx/compose/runtime/snapshots/StateRecord;", "", "eF", "()Ljava/lang/Void;", "I", "(Landroidx/compose/runtime/snapshots/StateObject;)Landroidx/compose/runtime/snapshots/StateRecord;", "M7", "(Landroidx/compose/runtime/snapshots/StateObject;)Z", "fD", "p5", "(Landroidx/compose/runtime/snapshots/StateObject;)V", "k", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/StateRecord;", "candidate", "P5", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/StateObject;Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;", "bzg", "Xw", "rV9", "jB", "(Landroidx/compose/runtime/snapshots/Snapshot;Landroidx/compose/runtime/snapshots/StateObject;)V", "currentSnapshotId", "Landroidx/compose/runtime/snapshots/MutableSnapshot;", "applyingSnapshot", "invalidSnapshots", "", "U", "(JLandroidx/compose/runtime/snapshots/MutableSnapshot;Landroidx/compose/runtime/snapshots/SnapshotIdSet;)Ljava/util/Map;", "B", "(Landroidx/compose/runtime/snapshots/StateRecord;Landroidx/compose/runtime/snapshots/Snapshot;)Landroidx/compose/runtime/snapshots/StateRecord;", "X", "(Landroidx/compose/runtime/snapshots/StateRecord;)Landroidx/compose/runtime/snapshots/StateRecord;", "from", "until", "g", "(Landroidx/compose/runtime/snapshots/SnapshotIdSet;JJ)Landroidx/compose/runtime/snapshots/SnapshotIdSet;", c.f62177j, "Lkotlin/jvm/functions/Function1;", "emptyLambda", "rl", "INVALID_SNAPSHOT", "Landroidx/compose/runtime/internal/SnapshotThreadLocal;", "t", "Landroidx/compose/runtime/internal/SnapshotThreadLocal;", "threadSnapshot", "nr", "Ljava/lang/Object;", "nHg", "()Ljava/lang/Object;", "getLock$annotations", "lock", "O", "Landroidx/compose/runtime/snapshots/SnapshotIdSet;", "openSnapshots", "J2", "nextSnapshotId", "Landroidx/compose/runtime/snapshots/SnapshotDoubleIndexHeap;", "Uo", "Landroidx/compose/runtime/snapshots/SnapshotDoubleIndexHeap;", "pinningTable", "Landroidx/compose/runtime/snapshots/SnapshotWeakSet;", "KN", "Landroidx/compose/runtime/snapshots/SnapshotWeakSet;", "extraStateObjects", "", "Lkotlin/Function2;", "", "xMQ", "Ljava/util/List;", "applyObservers", "mUb", "globalWriteObservers", "gh", "Landroidx/compose/runtime/snapshots/GlobalSnapshot;", "qie", "Landroidx/compose/runtime/snapshots/Snapshot;", "getSnapshotInitializer", "getSnapshotInitializer$annotations", "snapshotInitializer", "Landroidx/compose/runtime/internal/AtomicInt;", "az", "Landroidx/compose/runtime/internal/AtomicInt;", "pendingApplyObserverCount", "runtime_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSnapshot.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n+ 2 Synchronization.android.kt\nandroidx/compose/runtime/platform/Synchronization_androidKt\n+ 3 ListUtils.kt\nandroidx/compose/runtime/snapshots/ListUtilsKt\n+ 4 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 6 SnapshotWeakSet.kt\nandroidx/compose/runtime/snapshots/SnapshotWeakSet\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2487:1\n1894#1,2:2488\n1894#1,2:2494\n1894#1,2:2504\n1894#1,2:2533\n1894#1,2:2537\n1894#1,2:2541\n2213#1,8:2545\n1894#1,2:2581\n1894#1,2:2585\n1894#1,2:2589\n1894#1,2:2594\n1894#1,2:2598\n1894#1,2:2602\n1894#1,2:2631\n1894#1,2:2635\n33#2,2:2490\n33#2,2:2492\n33#2,2:2496\n33#2,2:2506\n33#2,2:2535\n33#2,2:2539\n33#2,2:2543\n33#2,2:2583\n33#2,2:2587\n33#2,2:2591\n33#2,2:2596\n33#2,2:2600\n33#2,2:2604\n33#2,2:2633\n33#2,2:2637\n27#2:2639\n33#3,6:2498\n231#4,3:2508\n200#4,7:2511\n211#4,3:2519\n214#4,9:2523\n234#4:2532\n231#4,3:2606\n200#4,7:2609\n211#4,3:2617\n214#4,9:2621\n234#4:2630\n1399#5:2518\n1270#5:2522\n1399#5:2616\n1270#5:2620\n125#6,28:2553\n1#7:2593\n*S KotlinDebug\n*F\n+ 1 Snapshot.kt\nandroidx/compose/runtime/snapshots/SnapshotKt\n*L\n706#1:2488,2\n1969#1:2494,2\n1988#1:2504,2\n2016#1:2533,2\n2075#1:2537,2\n2097#1:2541,2\n2197#1:2545,8\n2249#1:2581,2\n2277#1:2585,2\n2287#1:2589,2\n2355#1:2594,2\n2366#1:2598,2\n2393#1:2602,2\n2449#1:2631,2\n2460#1:2635,2\n706#1:2490,2\n1895#1:2492,2\n1969#1:2496,2\n1988#1:2506,2\n2016#1:2535,2\n2075#1:2539,2\n2097#1:2543,2\n2249#1:2583,2\n2277#1:2587,2\n2287#1:2591,2\n2355#1:2596,2\n2366#1:2600,2\n2393#1:2604,2\n2449#1:2633,2\n2460#1:2637,2\n1888#1:2639\n1982#1:2498,6\n1990#1:2508,3\n1990#1:2511,7\n1990#1:2519,3\n1990#1:2523,9\n1990#1:2532\n2415#1:2606,3\n2415#1:2609,7\n2415#1:2617,3\n2415#1:2621,9\n2415#1:2630\n1990#1:2518\n1990#1:2522\n2415#1:2616\n2415#1:2620\n2224#1:2553,28\n*E\n"})
public final class SnapshotKt {
    private static long J2;
    private static final SnapshotWeakSet KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private static SnapshotIdSet f30962O;
    private static final SnapshotDoubleIndexHeap Uo;
    private static AtomicInt az;
    private static final GlobalSnapshot gh;
    private static List mUb;
    private static final Snapshot qie;
    private static final long rl = 0;
    private static List xMQ;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Function1 f30963n = new Function1<SnapshotIdSet, Unit>() { // from class: androidx.compose.runtime.snapshots.SnapshotKt$emptyLambda$1
        public final void n(SnapshotIdSet snapshotIdSet) {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(SnapshotIdSet snapshotIdSet) {
            n(snapshotIdSet);
            return Unit.INSTANCE;
        }
    };

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final SnapshotThreadLocal f30964t = new SnapshotThreadLocal();
    private static final Object nr = new Object();

    /* JADX INFO: Access modifiers changed from: private */
    public static final StateRecord E(StateRecord stateRecord, long j2, SnapshotIdSet snapshotIdSet) {
        StateRecord stateRecord2 = null;
        while (stateRecord != null) {
            if (Nxk(stateRecord, j2, snapshotIdSet) && (stateRecord2 == null || stateRecord2.getSnapshotId() < stateRecord.getSnapshotId())) {
                stateRecord2 = stateRecord;
            }
            stateRecord = stateRecord.getNext();
        }
        if (stateRecord2 != null) {
            return stateRecord2;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object te(Function1 function1) {
        MutableScatterSet mutableScatterSetX;
        Object objJ;
        GlobalSnapshot globalSnapshot = gh;
        synchronized (nHg()) {
            try {
                mutableScatterSetX = globalSnapshot.getModified();
                if (mutableScatterSetX != null) {
                    az.n(1);
                }
                objJ = J(globalSnapshot, function1);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (mutableScatterSetX != null) {
            try {
                List list = xMQ;
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ((Function2) list.get(i2)).invoke(ScatterSetWrapperKt.n(mutableScatterSetX), globalSnapshot);
                }
            } finally {
                az.n(-1);
            }
        }
        synchronized (nHg()) {
            try {
                fD();
                if (mutableScatterSetX != null) {
                    Object[] objArr = mutableScatterSetX.elements;
                    long[] jArr = mutableScatterSetX.metadata;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i3 = 0;
                        while (true) {
                            long j2 = jArr[i3];
                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i5 = 8 - ((~(i3 - length)) >>> 31);
                                for (int i7 = 0; i7 < i5; i7++) {
                                    if ((255 & j2) < 128) {
                                        p5((StateObject) objArr[(i3 << 3) + i7]);
                                    }
                                    j2 >>= 8;
                                }
                                if (i5 != 8) {
                                    break;
                                }
                                if (i3 == length) {
                                    break;
                                }
                                i3++;
                            }
                        }
                    }
                    Unit unit = Unit.INSTANCE;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return objJ;
    }

    static {
        SnapshotIdSet.Companion companion = SnapshotIdSet.INSTANCE;
        f30962O = companion.n();
        J2 = SnapshotId_jvmKt.t(1) + 1;
        Uo = new SnapshotDoubleIndexHeap();
        KN = new SnapshotWeakSet();
        xMQ = CollectionsKt.emptyList();
        mUb = CollectionsKt.emptyList();
        long j2 = J2;
        J2 = 1 + j2;
        GlobalSnapshot globalSnapshot = new GlobalSnapshot(j2, companion.n());
        f30962O = f30962O.ty(globalSnapshot.getSnapshotId());
        gh = globalSnapshot;
        qie = globalSnapshot;
        az = new AtomicInt(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void B() {
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Snapshot D(final Function1 function1) {
        return (Snapshot) te(new Function1<SnapshotIdSet, Snapshot>() { // from class: androidx.compose.runtime.snapshots.SnapshotKt$takeNewSnapshot$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Snapshot invoke(SnapshotIdSet snapshotIdSet) {
                Snapshot snapshot = (Snapshot) function1.invoke(snapshotIdSet);
                synchronized (SnapshotKt.nHg()) {
                    SnapshotKt.f30962O = SnapshotKt.f30962O.ty(snapshot.getSnapshotId());
                    Unit unit = Unit.INSTANCE;
                }
                return snapshot;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Snapshot E2(Snapshot snapshot, Function1 function1, boolean z2) {
        boolean z3 = snapshot instanceof MutableSnapshot;
        if (z3 || snapshot == null) {
            return new TransparentObserverMutableSnapshot(z3 ? (MutableSnapshot) snapshot : null, function1, null, false, z2);
        }
        return new TransparentObserverSnapshot(snapshot, function1, false, z2);
    }

    public static final void FX(int i2) {
        Uo.J2(i2);
    }

    private static final boolean GR(long j2, long j3, SnapshotIdSet snapshotIdSet) {
        return (j3 == rl || j3 > j2 || snapshotIdSet.gh(j3)) ? false : true;
    }

    public static final StateRecord M(StateRecord stateRecord, StateObject stateObject) {
        StateRecord stateRecordE;
        Snapshot.Companion companion = Snapshot.INSTANCE;
        Snapshot snapshotT = companion.t();
        Function1 function1Uo = snapshotT.Uo();
        if (function1Uo != null) {
            function1Uo.invoke(stateObject);
        }
        StateRecord stateRecordE2 = E(stateRecord, snapshotT.getSnapshotId(), snapshotT.getInvalid());
        if (stateRecordE2 != null) {
            return stateRecordE2;
        }
        synchronized (nHg()) {
            Snapshot snapshotT2 = companion.t();
            StateRecord stateRecordCk = stateObject.getFirstStateRecord();
            Intrinsics.checkNotNull(stateRecordCk, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable");
            stateRecordE = E(stateRecordCk, snapshotT2.getSnapshotId(), snapshotT2.getInvalid());
            if (stateRecordE == null) {
                eF();
                throw new KotlinNothingValueException();
            }
        }
        return stateRecordE;
    }

    public static final Snapshot N() {
        Snapshot snapshot = (Snapshot) f30964t.n();
        return snapshot == null ? gh : snapshot;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map U(long j2, MutableSnapshot mutableSnapshot, SnapshotIdSet snapshotIdSet) {
        long[] jArr;
        Map map;
        SnapshotIdSet snapshotIdSet2;
        long[] jArr2;
        Map map2;
        SnapshotIdSet snapshotIdSet3;
        int i2;
        long j3 = j2;
        MutableScatterSet mutableScatterSetX = mutableSnapshot.getModified();
        Map map3 = null;
        if (mutableScatterSetX == null) {
            return null;
        }
        SnapshotIdSet snapshotIdSetAz = mutableSnapshot.getInvalid().ty(mutableSnapshot.getSnapshotId()).az(mutableSnapshot.getPreviousIds());
        Object[] objArr = mutableScatterSetX.elements;
        long[] jArr3 = mutableScatterSetX.metadata;
        int length = jArr3.length - 2;
        if (length < 0) {
            return null;
        }
        HashMap map4 = null;
        int i3 = 0;
        while (true) {
            long j4 = jArr3[i3];
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i5 = 8;
                int i7 = 8 - ((~(i3 - length)) >>> 31);
                int i8 = 0;
                while (i8 < i7) {
                    if ((255 & j4) < 128) {
                        StateObject stateObject = (StateObject) objArr[(i3 << 3) + i8];
                        map2 = map3;
                        StateRecord stateRecordCk = stateObject.getFirstStateRecord();
                        i2 = i5;
                        StateRecord stateRecordE = E(stateRecordCk, j3, snapshotIdSet);
                        if (stateRecordE == null) {
                            jArr2 = jArr3;
                        } else {
                            jArr2 = jArr3;
                            StateRecord stateRecordE2 = E(stateRecordCk, j3, snapshotIdSetAz);
                            if (stateRecordE2 != null && !Intrinsics.areEqual(stateRecordE, stateRecordE2)) {
                                snapshotIdSet3 = snapshotIdSetAz;
                                StateRecord stateRecordE3 = E(stateRecordCk, mutableSnapshot.getSnapshotId(), mutableSnapshot.getInvalid());
                                if (stateRecordE3 == null) {
                                    eF();
                                    throw new KotlinNothingValueException();
                                }
                                StateRecord stateRecordXQ = stateObject.XQ(stateRecordE2, stateRecordE, stateRecordE3);
                                if (stateRecordXQ == null) {
                                    return map2;
                                }
                                if (map4 == null) {
                                    map4 = new HashMap();
                                }
                                map4.put(stateRecordE, stateRecordXQ);
                                map4 = map4;
                            }
                        }
                        snapshotIdSet3 = snapshotIdSetAz;
                    } else {
                        jArr2 = jArr3;
                        map2 = map3;
                        snapshotIdSet3 = snapshotIdSetAz;
                        i2 = i5;
                    }
                    j4 >>= i2;
                    i8++;
                    j3 = j2;
                    map3 = map2;
                    i5 = i2;
                    jArr3 = jArr2;
                    snapshotIdSetAz = snapshotIdSet3;
                }
                jArr = jArr3;
                map = map3;
                snapshotIdSet2 = snapshotIdSetAz;
                if (i7 != i5) {
                    return map4;
                }
            } else {
                jArr = jArr3;
                map = map3;
                snapshotIdSet2 = snapshotIdSetAz;
            }
            if (i3 == length) {
                return map4;
            }
            i3++;
            j3 = j2;
            map3 = map;
            jArr3 = jArr;
            snapshotIdSetAz = snapshotIdSet2;
        }
    }

    public static final StateRecord X(StateRecord stateRecord) {
        StateRecord stateRecordE;
        Snapshot.Companion companion = Snapshot.INSTANCE;
        Snapshot snapshotT = companion.t();
        StateRecord stateRecordE2 = E(stateRecord, snapshotT.getSnapshotId(), snapshotT.getInvalid());
        if (stateRecordE2 != null) {
            return stateRecordE2;
        }
        synchronized (nHg()) {
            Snapshot snapshotT2 = companion.t();
            stateRecordE = E(stateRecord, snapshotT2.getSnapshotId(), snapshotT2.getInvalid());
        }
        if (stateRecordE != null) {
            return stateRecordE;
        }
        eF();
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y(Snapshot snapshot) {
        long jO;
        if (f30962O.gh(snapshot.getSnapshotId())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Snapshot is not open: snapshotId=");
        sb.append(snapshot.getSnapshotId());
        sb.append(", disposed=");
        sb.append(snapshot.getDisposed());
        sb.append(", applied=");
        MutableSnapshot mutableSnapshot = snapshot instanceof MutableSnapshot ? (MutableSnapshot) snapshot : null;
        sb.append(mutableSnapshot != null ? Boolean.valueOf(mutableSnapshot.getApplied()) : "read-only");
        sb.append(", lowestPin=");
        synchronized (nHg()) {
            jO = Uo.O(-1L);
        }
        sb.append(jO);
        throw new IllegalStateException(sb.toString().toString());
    }

    static /* synthetic */ Snapshot e(Snapshot snapshot, Function1 function1, boolean z2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function1 = null;
        }
        if ((i2 & 4) != 0) {
            z2 = false;
        }
        return E2(snapshot, function1, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void eF() {
        throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fD() {
        SnapshotWeakSet snapshotWeakSet = KN;
        int iO = snapshotWeakSet.getSize();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i2 >= iO) {
                break;
            }
            WeakReference weakReference = snapshotWeakSet.getCom.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String()[i2];
            Object obj = weakReference != null ? weakReference.get() : null;
            if (obj != null && M7((StateObject) obj)) {
                if (i3 != i2) {
                    snapshotWeakSet.getCom.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String()[i3] = weakReference;
                    snapshotWeakSet.getHashes()[i3] = snapshotWeakSet.getHashes()[i2];
                }
                i3++;
            }
            i2++;
        }
        for (int i5 = i3; i5 < iO; i5++) {
            snapshotWeakSet.getCom.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String()[i5] = null;
            snapshotWeakSet.getHashes()[i5] = 0;
        }
        if (i3 != iO) {
            snapshotWeakSet.Uo(i3);
        }
    }

    public static final SnapshotIdSet g(SnapshotIdSet snapshotIdSet, long j2, long j3) {
        while (j2 < j3) {
            snapshotIdSet = snapshotIdSet.ty(j2);
            j2++;
        }
        return snapshotIdSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void iF() {
        te(f30963n);
    }

    public static final Object nHg() {
        return nr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1 s7N(final Function1 function1, final Function1 function12, boolean z2) {
        if (!z2) {
            function12 = null;
        }
        return (function1 == null || function12 == null || function1 == function12) ? function1 == null ? function12 : function1 : new Function1<Object, Unit>() { // from class: androidx.compose.runtime.snapshots.SnapshotKt$mergedReadObserver$1
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1 v(final Function1 function1, final Function1 function12) {
        return (function1 == null || function12 == null || function1 == function12) ? function1 == null ? function12 : function1 : new Function1<Object, Unit>() { // from class: androidx.compose.runtime.snapshots.SnapshotKt$mergedWriteObserver$1
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

    static /* synthetic */ Function1 wTp(Function1 function1, Function1 function12, boolean z2, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z2 = true;
        }
        return s7N(function1, function12, z2);
    }

    private static final StateRecord I(StateObject stateObject) {
        long jO = Uo.O(J2) - 1;
        SnapshotIdSet snapshotIdSetN = SnapshotIdSet.INSTANCE.n();
        StateRecord stateRecord = null;
        for (StateRecord stateRecordCk = stateObject.getFirstStateRecord(); stateRecordCk != null; stateRecordCk = stateRecordCk.getNext()) {
            if (stateRecordCk.getSnapshotId() != rl) {
                if (Nxk(stateRecordCk, jO, snapshotIdSetN)) {
                    if (stateRecord == null) {
                        stateRecord = stateRecordCk;
                    } else if (stateRecordCk.getSnapshotId() >= stateRecord.getSnapshotId()) {
                        return stateRecord;
                    }
                }
            }
            return stateRecordCk;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object J(GlobalSnapshot globalSnapshot, Function1 function1) {
        long snapshotId = globalSnapshot.getSnapshotId();
        Object objInvoke = function1.invoke(f30962O.mUb(snapshotId));
        long j2 = J2;
        J2 = 1 + j2;
        f30962O = f30962O.mUb(snapshotId);
        globalSnapshot.S(j2);
        globalSnapshot.XQ(f30962O);
        globalSnapshot.WPU(0);
        globalSnapshot.P5(null);
        globalSnapshot.Ik();
        f30962O = f30962O.ty(j2);
        return objInvoke;
    }

    private static final boolean M7(StateObject stateObject) {
        StateRecord stateRecord;
        long jO = Uo.O(J2);
        StateRecord stateRecord2 = null;
        StateRecord stateRecordCk = null;
        int i2 = 0;
        for (StateRecord stateRecordCk2 = stateObject.getFirstStateRecord(); stateRecordCk2 != null; stateRecordCk2 = stateRecordCk2.getNext()) {
            long jUo = stateRecordCk2.getSnapshotId();
            if (jUo != rl) {
                if (jUo < jO) {
                    if (stateRecord2 == null) {
                        i2++;
                        stateRecord2 = stateRecordCk2;
                    } else {
                        if (stateRecordCk2.getSnapshotId() < stateRecord2.getSnapshotId()) {
                            stateRecord = stateRecord2;
                            stateRecord2 = stateRecordCk2;
                        } else {
                            stateRecord = stateRecordCk2;
                        }
                        if (stateRecordCk == null) {
                            stateRecordCk = stateObject.getFirstStateRecord();
                            StateRecord stateRecord3 = stateRecordCk;
                            while (true) {
                                if (stateRecordCk != null) {
                                    if (stateRecordCk.getSnapshotId() >= jO) {
                                        break;
                                    }
                                    if (stateRecord3.getSnapshotId() < stateRecordCk.getSnapshotId()) {
                                        stateRecord3 = stateRecordCk;
                                    }
                                    stateRecordCk = stateRecordCk.getNext();
                                } else {
                                    stateRecordCk = stateRecord3;
                                    break;
                                }
                            }
                        }
                        stateRecord2.xMQ(rl);
                        stateRecord2.t(stateRecordCk);
                        stateRecord2 = stateRecord;
                    }
                } else {
                    i2++;
                }
            }
        }
        if (i2 <= 1) {
            return false;
        }
        return true;
    }

    private static final boolean Nxk(StateRecord stateRecord, long j2, SnapshotIdSet snapshotIdSet) {
        return GR(j2, stateRecord.getSnapshotId(), snapshotIdSet);
    }

    public static final StateRecord P5(StateRecord stateRecord, StateObject stateObject, Snapshot snapshot, StateRecord stateRecord2) {
        StateRecord stateRecordRV9;
        if (snapshot.KN()) {
            snapshot.ck(stateObject);
        }
        long snapshotId = snapshot.getSnapshotId();
        if (stateRecord2.getSnapshotId() == snapshotId) {
            return stateRecord2;
        }
        synchronized (nHg()) {
            stateRecordRV9 = rV9(stateRecord, stateObject);
        }
        stateRecordRV9.xMQ(snapshotId);
        if (stateRecord2.getSnapshotId() != SnapshotId_jvmKt.t(1)) {
            snapshot.ck(stateObject);
        }
        return stateRecordRV9;
    }

    public static final StateRecord T(StateRecord stateRecord, Snapshot snapshot) {
        StateRecord stateRecordE;
        StateRecord stateRecordE2 = E(stateRecord, snapshot.getSnapshotId(), snapshot.getInvalid());
        if (stateRecordE2 == null) {
            synchronized (nHg()) {
                stateRecordE = E(stateRecord, snapshot.getSnapshotId(), snapshot.getInvalid());
            }
            if (stateRecordE != null) {
                return stateRecordE;
            }
            eF();
            throw new KotlinNothingValueException();
        }
        return stateRecordE2;
    }

    private static final StateRecord Xw(StateRecord stateRecord, StateObject stateObject, Snapshot snapshot) {
        StateRecord stateRecordRV9 = rV9(stateRecord, stateObject);
        stateRecordRV9.t(stateRecord);
        stateRecordRV9.xMQ(snapshot.getSnapshotId());
        return stateRecordRV9;
    }

    public static final int a(long j2, SnapshotIdSet snapshotIdSet) {
        int iN;
        long jQie = snapshotIdSet.qie(j2);
        synchronized (nHg()) {
            iN = Uo.n(jQie);
        }
        return iN;
    }

    public static final StateRecord bzg(StateRecord stateRecord, StateObject stateObject, Snapshot snapshot) {
        StateRecord stateRecordXw;
        synchronized (nHg()) {
            stateRecordXw = Xw(stateRecord, stateObject, snapshot);
        }
        return stateRecordXw;
    }

    public static final void jB(Snapshot snapshot, StateObject stateObject) {
        snapshot.WPU(snapshot.getWriteCount() + 1);
        Function1 function1Gh = snapshot.getWriteObserver();
        if (function1Gh != null) {
            function1Gh.invoke(stateObject);
        }
    }

    public static final StateRecord k(StateRecord stateRecord, StateObject stateObject, Snapshot snapshot) {
        StateRecord stateRecordE;
        if (snapshot.KN()) {
            snapshot.ck(stateObject);
        }
        long snapshotId = snapshot.getSnapshotId();
        StateRecord stateRecordE2 = E(stateRecord, snapshotId, snapshot.getInvalid());
        if (stateRecordE2 != null) {
            if (stateRecordE2.getSnapshotId() == snapshot.getSnapshotId()) {
                return stateRecordE2;
            }
            synchronized (nHg()) {
                stateRecordE = E(stateObject.getFirstStateRecord(), snapshotId, snapshot.getInvalid());
                if (stateRecordE != null) {
                    if (stateRecordE.getSnapshotId() != snapshotId) {
                        stateRecordE = Xw(stateRecordE, stateObject, snapshot);
                    }
                } else {
                    eF();
                    throw new KotlinNothingValueException();
                }
            }
            Intrinsics.checkNotNull(stateRecordE, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.writableRecord");
            if (stateRecordE2.getSnapshotId() != SnapshotId_jvmKt.t(1)) {
                snapshot.ck(stateObject);
            }
            return stateRecordE;
        }
        eF();
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p5(StateObject stateObject) {
        if (M7(stateObject)) {
            KN.n(stateObject);
        }
    }

    public static final StateRecord rV9(StateRecord stateRecord, StateObject stateObject) {
        StateRecord stateRecordI = I(stateObject);
        if (stateRecordI != null) {
            stateRecordI.xMQ(Long.MAX_VALUE);
            return stateRecordI;
        }
        StateRecord stateRecordO = stateRecord.O(Long.MAX_VALUE);
        stateRecordO.KN(stateObject.getFirstStateRecord());
        Intrinsics.checkNotNull(stateRecordO, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked");
        stateObject.HI(stateRecordO);
        Intrinsics.checkNotNull(stateRecordO, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.newOverwritableRecordLocked");
        return stateRecordO;
    }
}
