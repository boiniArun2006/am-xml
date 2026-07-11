package androidx.compose.ui.layout;

import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ReusableComposition;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.compose.ui.layout.SubcomposeSlotReusePolicy;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeKt;
import androidx.compose.ui.node.LookaheadDelegate;
import androidx.compose.ui.node.LookaheadPassDelegate;
import androidx.compose.ui.node.MeasurePassDelegate;
import androidx.compose.ui.node.NodeChain;
import androidx.compose.ui.node.TraversableNodeKt;
import androidx.compose.ui.platform.SubcompositionKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.applovin.sdk.AppLovinEventTypes;
import com.caoccao.javet.exceptions.JavetError;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0003|}~B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J4\u0010\u000f\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014JD\u0010\u001d\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0011\u0010\u001c\u001a\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\rH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ'\u0010#\u001a\u0004\u0018\u00010\t2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u0018H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\fH\u0002¢\u0006\u0004\b(\u0010)J\u0013\u0010*\u001a\u00020\f*\u00020\u0002H\u0002¢\u0006\u0004\b*\u0010+J\u001b\u0010,\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\fH\u0002¢\u0006\u0004\b.\u0010)J\u0017\u0010/\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b/\u00100J)\u00104\u001a\u00020\f2\u0006\u00101\u001a\u00020!2\u0006\u00102\u001a\u00020!2\b\b\u0002\u00103\u001a\u00020!H\u0002¢\u0006\u0004\b4\u00105J2\u00107\u001a\b\u0012\u0004\u0012\u0002060\u001f2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\rH\u0002¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\fH\u0016¢\u0006\u0004\b9\u0010)J\u000f\u0010:\u001a\u00020\fH\u0016¢\u0006\u0004\b:\u0010)J\u000f\u0010;\u001a\u00020\fH\u0016¢\u0006\u0004\b;\u0010)J0\u0010<\u001a\b\u0012\u0004\u0012\u0002060\u001f2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\r¢\u0006\u0004\b<\u00108J\u0015\u0010>\u001a\u00020\f2\u0006\u0010=\u001a\u00020!¢\u0006\u0004\b>\u0010?J\r\u0010@\u001a\u00020\f¢\u0006\u0004\b@\u0010)J,\u0010H\u001a\u00020G2\u001d\u0010F\u001a\u0019\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020D0A¢\u0006\u0002\bE¢\u0006\u0004\bH\u0010IJ*\u0010K\u001a\u00020J2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0002\b\r¢\u0006\u0004\bK\u0010LJ\r\u0010M\u001a\u00020\f¢\u0006\u0004\bM\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR$\u0010U\u001a\u0004\u0018\u00010\u001a8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010P\u001a\u0004\bQ\u0010R\"\u0004\bS\u0010TR*\u0010\u0005\u001a\u00020\u00042\u0006\u0010V\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u0016\u0010_\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0016\u0010a\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010^R \u0010e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00110b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010dR\"\u0010f\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00020b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010dR\u0018\u0010i\u001a\u00060gR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010hR\u0018\u0010l\u001a\u00060jR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010kR\"\u0010n\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00020b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010dR\u0014\u0010q\u001a\u00020o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010pR\"\u0010r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020J0b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010dR\u001c\u0010u\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0s8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010tR\u0016\u0010v\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010^R\u0016\u0010w\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010^R\u0014\u0010{\u001a\u00020x8\u0002X\u0082D¢\u0006\u0006\n\u0004\by\u0010z¨\u0006\u007f"}, d2 = {"Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;", "Landroidx/compose/runtime/ComposeNodeLifecycleCallback;", "Landroidx/compose/ui/node/LayoutNode;", "root", "Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;", "slotReusePolicy", "<init>", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;)V", "node", "", "slotId", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", AppLovinEventTypes.USER_VIEWED_CONTENT, "wTp", "(Landroidx/compose/ui/node/LayoutNode;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;", "nodeState", "s7N", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;)V", "Landroidx/compose/runtime/ReusableComposition;", "existing", TtmlNode.RUBY_CONTAINER, "", "reuseContent", "Landroidx/compose/runtime/CompositionContext;", "parent", "composable", "v", "(Landroidx/compose/runtime/ReusableComposition;Landroidx/compose/ui/node/LayoutNode;ZLandroidx/compose/runtime/CompositionContext;Lkotlin/jvm/functions/Function2;)Landroidx/compose/runtime/ReusableComposition;", "", "foldedChildren", "", "index", "g", "(Ljava/util/List;I)Ljava/lang/Object;", "deactivate", "iF", "(Z)V", "WPU", "()V", "X", "(Landroidx/compose/ui/node/LayoutNode;)V", "rV9", "(Ljava/lang/Object;)Landroidx/compose/ui/node/LayoutNode;", "ViF", "S", "(I)Landroidx/compose/ui/node/LayoutNode;", "from", "to", JavetError.PARAMETER_COUNT, "fD", "(III)V", "Landroidx/compose/ui/layout/Measurable;", "Z", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;", "qie", "Uo", "t", "nHg", "startIndex", "aYN", "(I)V", "te", "Lkotlin/Function2;", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "Landroidx/compose/ui/unit/Constraints;", "Landroidx/compose/ui/layout/MeasureResult;", "Lkotlin/ExtensionFunctionType;", "block", "Landroidx/compose/ui/layout/MeasurePolicy;", "XQ", "(Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/layout/MeasurePolicy;", "Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;", "e", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Landroidx/compose/ui/layout/SubcomposeLayoutState$PrecomposedSlotHandle;", "nY", c.f62177j, "Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/runtime/CompositionContext;", "getCompositionContext", "()Landroidx/compose/runtime/CompositionContext;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "(Landroidx/compose/runtime/CompositionContext;)V", "compositionContext", "value", "O", "Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;", "getSlotReusePolicy", "()Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;", "N", "(Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy;)V", "J2", "I", "currentIndex", "r", "currentApproachIndex", "Landroidx/collection/MutableScatterMap;", "o", "Landroidx/collection/MutableScatterMap;", "nodeToNodeState", "slotIdToNode", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$Scope;", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$Scope;", "scope", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$ApproachMeasureScopeImpl;", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$ApproachMeasureScopeImpl;", "approachMeasureScope", "E2", "precomposeMap", "Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;", "Landroidx/compose/ui/layout/SubcomposeSlotReusePolicy$SlotIdsSet;", "reusableSlotIdsSet", "approachPrecomposeSlotHandleMap", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/runtime/collection/MutableVector;", "approachComposedSlotIds", "reusableCount", "precomposedCount", "", "Xw", "Ljava/lang/String;", "NoIntrinsicsMessage", "ApproachMeasureScopeImpl", "NodeState", "Scope", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSubcomposeLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 4 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 Snapshot.kt\nandroidx/compose/runtime/snapshots/Snapshot$Companion\n+ 7 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 8 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 9 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 10 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1037:1\n898#1:1066\n898#1:1078\n898#1:1188\n898#1:1193\n1101#2:1038\n1083#2,2:1039\n56#3,5:1041\n65#3,5:1047\n102#3,5:1053\n102#3,5:1120\n102#3,5:1125\n102#3,5:1130\n102#3,5:1202\n683#4:1046\n683#4:1058\n842#4:1136\n844#4,4:1150\n848#4:1160\n683#4:1161\n1#5:1052\n1#5:1059\n1#5:1135\n1#5:1162\n1#5:1187\n602#6,6:1060\n609#6:1071\n602#6,6:1072\n609#6:1083\n602#6,8:1084\n1149#7,4:1067\n1149#7,4:1079\n1149#7,2:1092\n1151#7,2:1118\n1149#7,4:1189\n1149#7,4:1194\n1149#7,4:1198\n372#8,3:1094\n329#8,6:1097\n339#8,3:1104\n342#8,9:1108\n375#8:1117\n329#8,6:1137\n339#8,3:1144\n342#8,2:1148\n345#8,6:1154\n372#8,3:1163\n329#8,6:1166\n339#8,3:1173\n342#8,9:1177\n375#8:1186\n1399#9:1103\n1270#9:1107\n1399#9:1143\n1270#9:1147\n1399#9:1172\n1270#9:1176\n34#10,6:1207\n*S KotlinDebug\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState\n*L\n511#1:1066\n585#1:1078\n891#1:1188\n894#1:1193\n427#1:1038\n427#1:1039,2\n456#1:1041,5\n469#1:1047,5\n480#1:1053,5\n653#1:1120,5\n659#1:1125,5\n663#1:1130,5\n985#1:1202,5\n466#1:1046\n500#1:1058\n767#1:1136\n767#1:1150,4\n767#1:1160\n811#1:1161\n466#1:1052\n500#1:1059\n811#1:1162\n510#1:1060,6\n510#1:1071\n572#1:1072,6\n572#1:1083\n613#1:1084,8\n511#1:1067,4\n585#1:1079,4\n637#1:1092,2\n637#1:1118,2\n891#1:1189,4\n894#1:1194,4\n898#1:1198,4\n638#1:1094,3\n638#1:1097,6\n638#1:1104,3\n638#1:1108,9\n638#1:1117\n767#1:1137,6\n767#1:1144,3\n767#1:1148,2\n767#1:1154,6\n879#1:1163,3\n879#1:1166,6\n879#1:1173,3\n879#1:1177,9\n879#1:1186\n638#1:1103\n638#1:1107\n767#1:1143\n767#1:1147\n879#1:1172\n879#1:1176\n1007#1:1207,6\n*E\n"})
public final class LayoutNodeSubcompositionsState implements ComposeNodeLifecycleCallback {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private int currentIndex;

    /* JADX INFO: renamed from: N, reason: collision with root package name and from kotlin metadata */
    private int reusableCount;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private SubcomposeSlotReusePolicy slotReusePolicy;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final LayoutNode root;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private int currentApproachIndex;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private CompositionContext compositionContext;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private int precomposedCount;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final MutableScatterMap nodeToNodeState = ScatterMapKt.t();

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private final MutableScatterMap slotIdToNode = ScatterMapKt.t();

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private final Scope scope = new Scope();

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ApproachMeasureScopeImpl approachMeasureScope = new ApproachMeasureScopeImpl();

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private final MutableScatterMap precomposeMap = ScatterMapKt.t();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final SubcomposeSlotReusePolicy.SlotIdsSet reusableSlotIdsSet = new SubcomposeSlotReusePolicy.SlotIdsSet(null, 1, null);

    /* JADX INFO: renamed from: X, reason: collision with root package name and from kotlin metadata */
    private final MutableScatterMap approachPrecomposeSlotHandleMap = ScatterMapKt.t();

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    private final MutableVector approachComposedSlotIds = new MutableVector(new Object[16], 0);

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private final String NoIntrinsicsMessage = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004Jl\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b2\u001b\b\u0002\u0010\u000f\u001a\u0015\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0002\b\u000e2\u0017\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0096\u0001¢\u0006\u0004\b\u0013\u0010\u0014JO\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b2\u0017\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0002\b\u000eH\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u0005*\u00020\u0017H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u0005*\u00020\u001aH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u0017*\u00020\u001aH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\u0017*\u00020\u001fH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u001a\u0010\"\u001a\u00020\u0017*\u00020\u0005H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020%*\u00020$H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u001f*\u00020\u0017H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b(\u0010!J\u0017\u0010)\u001a\u00020\u001f*\u00020\u001aH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010\u001eJ\u0017\u0010*\u001a\u00020$*\u00020%H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b*\u0010'J\u0017\u0010+\u001a\u00020\u001a*\u00020\u0017H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010,J\u001a\u0010-\u001a\u00020\u001a*\u00020\u001fH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b-\u0010,J2\u00105\u001a\b\u0012\u0004\u0012\u000204032\b\u0010/\u001a\u0004\u0018\u00010.2\u0011\u00102\u001a\r\u0012\u0004\u0012\u00020\r00¢\u0006\u0002\b1H\u0016¢\u0006\u0004\b5\u00106R\u0014\u00109\u001a\u00020\u001f8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b7\u00108R\u0014\u0010;\u001a\u00020\u001f8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b:\u00108R\u0014\u0010?\u001a\u00020<8VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0014\u0010C\u001a\u00020@8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bA\u0010B\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006D"}, d2 = {"Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$ApproachMeasureScopeImpl;", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "Landroidx/compose/ui/layout/MeasureScope;", "<init>", "(Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;)V", "", "width", "height", "", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLines", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/RulerScope;", "", "Lkotlin/ExtensionFunctionType;", "rulers", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "placementBlock", "Landroidx/compose/ui/layout/MeasureResult;", "bZm", "(IILjava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/layout/MeasureResult;", "Zn", "(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/unit/Dp;", "How", "(F)I", "Landroidx/compose/ui/unit/TextUnit;", "I4p", "(J)I", "Z", "(J)F", "", "bzg", "(F)F", "rV9", "(I)F", "Landroidx/compose/ui/geometry/Size;", "Landroidx/compose/ui/unit/DpSize;", "Ik", "(J)J", CmcdData.STREAM_TYPE_LIVE, "tFV", "M", "ck", "(F)J", "ViF", "", "slotId", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", AppLovinEventTypes.USER_VIEWED_CONTENT, "", "Landroidx/compose/ui/layout/Measurable;", "Y", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;", "getDensity", "()F", "density", "yAc", "fontScale", "", "Org", "()Z", "isLookingAhead", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    final class ApproachMeasureScopeImpl implements SubcomposeMeasureScope, MeasureScope {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final /* synthetic */ Scope f32261n;

        @Override // androidx.compose.ui.unit.Density
        public int How(float f3) {
            return this.f32261n.How(f3);
        }

        @Override // androidx.compose.ui.unit.Density
        public int I4p(long j2) {
            return this.f32261n.I4p(j2);
        }

        @Override // androidx.compose.ui.unit.Density
        public long Ik(long j2) {
            return this.f32261n.Ik(j2);
        }

        @Override // androidx.compose.ui.unit.Density
        public long M(long j2) {
            return this.f32261n.M(j2);
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
        public boolean Org() {
            return this.f32261n.Org();
        }

        @Override // androidx.compose.ui.unit.Density
        public long ViF(float f3) {
            return this.f32261n.ViF(f3);
        }

        @Override // androidx.compose.ui.unit.FontScaling
        public float Z(long j2) {
            return this.f32261n.Z(j2);
        }

        @Override // androidx.compose.ui.layout.MeasureScope
        public MeasureResult Zn(int width, int height, Map alignmentLines, Function1 placementBlock) {
            return this.f32261n.Zn(width, height, alignmentLines, placementBlock);
        }

        @Override // androidx.compose.ui.layout.MeasureScope
        public MeasureResult bZm(int width, int height, Map alignmentLines, Function1 rulers, Function1 placementBlock) {
            return this.f32261n.bZm(width, height, alignmentLines, rulers, placementBlock);
        }

        @Override // androidx.compose.ui.unit.Density
        public float bzg(float f3) {
            return this.f32261n.bzg(f3);
        }

        @Override // androidx.compose.ui.unit.FontScaling
        public long ck(float f3) {
            return this.f32261n.ck(f3);
        }

        @Override // androidx.compose.ui.unit.Density
        public float getDensity() {
            return this.f32261n.getDensity();
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
        public LayoutDirection getLayoutDirection() {
            return this.f32261n.getLayoutDirection();
        }

        @Override // androidx.compose.ui.unit.Density
        public float l(float f3) {
            return this.f32261n.l(f3);
        }

        @Override // androidx.compose.ui.unit.Density
        public float rV9(int i2) {
            return this.f32261n.rV9(i2);
        }

        @Override // androidx.compose.ui.unit.Density
        public float tFV(long j2) {
            return this.f32261n.tFV(j2);
        }

        @Override // androidx.compose.ui.unit.FontScaling
        /* JADX INFO: renamed from: yAc */
        public float getFontScale() {
            return this.f32261n.getFontScale();
        }

        public ApproachMeasureScopeImpl() {
            this.f32261n = LayoutNodeSubcompositionsState.this.scope;
        }

        @Override // androidx.compose.ui.layout.SubcomposeMeasureScope
        public List Y(Object slotId, Function2 content) {
            LayoutNode layoutNode = (LayoutNode) LayoutNodeSubcompositionsState.this.slotIdToNode.O(slotId);
            return (layoutNode == null || LayoutNodeSubcompositionsState.this.root.M7().indexOf(layoutNode) >= LayoutNodeSubcompositionsState.this.currentIndex) ? LayoutNodeSubcompositionsState.this.Z(slotId, content) : layoutNode.rV9();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B0\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\u0011\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR$\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R-\u0010\u0006\u001a\r\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\b\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0017\u001a\u0004\b\u0011\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010!\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010$\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010\u001d\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R(\u0010+\u001a\b\u0012\u0004\u0012\u00020\u001b0%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R$\u0010.\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\u001e\"\u0004\b-\u0010 ¨\u0006/"}, d2 = {"Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$NodeState;", "", "slotId", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", AppLovinEventTypes.USER_VIEWED_CONTENT, "Landroidx/compose/runtime/ReusableComposition;", "composition", "<init>", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/ReusableComposition;)V", c.f62177j, "Ljava/lang/Object;", "J2", "()Ljava/lang/Object;", "az", "(Ljava/lang/Object;)V", "rl", "Lkotlin/jvm/functions/Function2;", "t", "()Lkotlin/jvm/functions/Function2;", "mUb", "(Lkotlin/jvm/functions/Function2;)V", "Landroidx/compose/runtime/ReusableComposition;", "()Landroidx/compose/runtime/ReusableComposition;", "xMQ", "(Landroidx/compose/runtime/ReusableComposition;)V", "", "nr", "Z", "()Z", "gh", "(Z)V", "forceRecompose", "O", "qie", "forceReuse", "Landroidx/compose/runtime/MutableState;", "Landroidx/compose/runtime/MutableState;", "getActiveState", "()Landroidx/compose/runtime/MutableState;", "KN", "(Landroidx/compose/runtime/MutableState;)V", "activeState", "value", "Uo", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    static final class NodeState {

        /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
        private MutableState activeState;

        /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
        private boolean forceReuse;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private Object slotId;

        /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
        private boolean forceRecompose;

        /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
        private Function2 content;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private ReusableComposition composition;

        public NodeState(Object obj, Function2 function2, ReusableComposition reusableComposition) {
            this.slotId = obj;
            this.content = function2;
            this.composition = reusableComposition;
            this.activeState = SnapshotStateKt__SnapshotStateKt.O(Boolean.TRUE, null, 2, null);
        }

        /* JADX INFO: renamed from: J2, reason: from getter */
        public final Object getSlotId() {
            return this.slotId;
        }

        public final void KN(MutableState mutableState) {
            this.activeState = mutableState;
        }

        /* JADX INFO: renamed from: O, reason: from getter */
        public final boolean getForceReuse() {
            return this.forceReuse;
        }

        public final void Uo(boolean z2) {
            this.activeState.setValue(Boolean.valueOf(z2));
        }

        public final void az(Object obj) {
            this.slotId = obj;
        }

        public final void gh(boolean z2) {
            this.forceRecompose = z2;
        }

        public final void mUb(Function2 function2) {
            this.content = function2;
        }

        public final boolean n() {
            return ((Boolean) this.activeState.getValue()).booleanValue();
        }

        /* JADX INFO: renamed from: nr, reason: from getter */
        public final boolean getForceRecompose() {
            return this.forceRecompose;
        }

        public final void qie(boolean z2) {
            this.forceReuse = z2;
        }

        /* JADX INFO: renamed from: rl, reason: from getter */
        public final ReusableComposition getComposition() {
            return this.composition;
        }

        /* JADX INFO: renamed from: t, reason: from getter */
        public final Function2 getContent() {
            return this.content;
        }

        public final void xMQ(ReusableComposition reusableComposition) {
            this.composition = reusableComposition;
        }

        public /* synthetic */ NodeState(Object obj, Function2 function2, ReusableComposition reusableComposition, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(obj, function2, (i2 & 4) != 0 ? null : reusableComposition);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J2\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0011\u0010\t\u001a\r\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\b\bH\u0016¢\u0006\u0004\b\f\u0010\rJg\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e0\u00112\u0019\u0010\u0017\u001a\u0015\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0014¢\u0006\u0002\b\u00162\u0017\u0010\u0019\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00070\u0014¢\u0006\u0002\b\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010$\u001a\u00020\u001d8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010,\u001a\u00020%8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00100\u001a\u00020%8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b-\u0010'\u001a\u0004\b.\u0010)\"\u0004\b/\u0010+R\u0014\u00104\u001a\u0002018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState$Scope;", "Landroidx/compose/ui/layout/SubcomposeMeasureScope;", "<init>", "(Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;)V", "", "slotId", "Lkotlin/Function0;", "", "Landroidx/compose/runtime/Composable;", AppLovinEventTypes.USER_VIEWED_CONTENT, "", "Landroidx/compose/ui/layout/Measurable;", "Y", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/util/List;", "", "width", "height", "", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLines", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/RulerScope;", "Lkotlin/ExtensionFunctionType;", "rulers", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "placementBlock", "Landroidx/compose/ui/layout/MeasureResult;", "bZm", "(IILjava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/unit/LayoutDirection;", c.f62177j, "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "HI", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "layoutDirection", "", "t", "F", "getDensity", "()F", "nr", "(F)V", "density", "O", "yAc", "J2", "fontScale", "", "Org", "()Z", "isLookingAhead", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nSubcomposeLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState$Scope\n+ 2 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegateKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,1037:1\n361#2:1038\n362#2,2:1042\n365#2:1045\n56#3,3:1039\n60#3:1044\n*S KotlinDebug\n*F\n+ 1 SubcomposeLayout.kt\nandroidx/compose/ui/layout/LayoutNodeSubcompositionsState$Scope\n*L\n935#1:1038\n935#1:1042,2\n935#1:1045\n935#1:1039,3\n935#1:1044\n*E\n"})
    final class Scope implements SubcomposeMeasureScope {

        /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
        private float fontScale;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private LayoutDirection layoutDirection = LayoutDirection.f34161t;

        /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
        private float density;

        public Scope() {
        }

        public void HI(LayoutDirection layoutDirection) {
            this.layoutDirection = layoutDirection;
        }

        public void J2(float f3) {
            this.fontScale = f3;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
        public boolean Org() {
            return LayoutNodeSubcompositionsState.this.root.k() == LayoutNode.LayoutState.J2 || LayoutNodeSubcompositionsState.this.root.k() == LayoutNode.LayoutState.f32463t;
        }

        @Override // androidx.compose.ui.layout.SubcomposeMeasureScope
        public List Y(Object slotId, Function2 content) {
            return LayoutNodeSubcompositionsState.this.nHg(slotId, content);
        }

        @Override // androidx.compose.ui.layout.MeasureScope
        public MeasureResult bZm(final int width, final int height, final Map alignmentLines, final Function1 rulers, final Function1 placementBlock) {
            if (!((width & (-16777216)) == 0 && ((-16777216) & height) == 0)) {
                InlineClassHelperKt.t("Size(" + width + " x " + height + ") is out of range. Each dimension must be between 0 and 16777215.");
            }
            final LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = LayoutNodeSubcompositionsState.this;
            return new MeasureResult() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$Scope$layout$1
                @Override // androidx.compose.ui.layout.MeasureResult
                /* JADX INFO: renamed from: XQ, reason: from getter */
                public Function1 getNr() {
                    return rulers;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                public void Z() {
                    LookaheadDelegate lookaheadDelegateRR;
                    if (!this.Org() || (lookaheadDelegateRR = layoutNodeSubcompositionsState.root.E().rR()) == null) {
                        placementBlock.invoke(layoutNodeSubcompositionsState.root.E().getPlacementScope());
                    } else {
                        placementBlock.invoke(lookaheadDelegateRR.getPlacementScope());
                    }
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                /* JADX INFO: renamed from: getHeight, reason: from getter */
                public int getRl() {
                    return height;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                /* JADX INFO: renamed from: getWidth, reason: from getter */
                public int getF32270n() {
                    return width;
                }

                @Override // androidx.compose.ui.layout.MeasureResult
                /* JADX INFO: renamed from: o, reason: from getter */
                public Map getF32271t() {
                    return alignmentLines;
                }
            };
        }

        @Override // androidx.compose.ui.unit.Density
        public float getDensity() {
            return this.density;
        }

        @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
        public LayoutDirection getLayoutDirection() {
            return this.layoutDirection;
        }

        public void nr(float f3) {
            this.density = f3;
        }

        @Override // androidx.compose.ui.unit.FontScaling
        /* JADX INFO: renamed from: yAc, reason: from getter */
        public float getFontScale() {
            return this.fontScale;
        }
    }

    private final void iF(boolean deactivate) {
        this.precomposedCount = 0;
        this.precomposeMap.gh();
        List listM7 = this.root.M7();
        int size = listM7.size();
        if (this.reusableCount != size) {
            this.reusableCount = size;
            Snapshot.Companion companion = Snapshot.INSTANCE;
            Snapshot snapshotNr = companion.nr();
            Function1 function1Uo = snapshotNr != null ? snapshotNr.Uo() : null;
            Snapshot snapshotO = companion.O(snapshotNr);
            for (int i2 = 0; i2 < size; i2++) {
                try {
                    LayoutNode layoutNode = (LayoutNode) listM7.get(i2);
                    NodeState nodeState = (NodeState) this.nodeToNodeState.O(layoutNode);
                    if (nodeState != null && nodeState.n()) {
                        X(layoutNode);
                        if (deactivate) {
                            ReusableComposition composition = nodeState.getComposition();
                            if (composition != null) {
                                composition.deactivate();
                            }
                            nodeState.KN(SnapshotStateKt__SnapshotStateKt.O(Boolean.FALSE, null, 2, null));
                        } else {
                            nodeState.Uo(false);
                        }
                        nodeState.az(SubcomposeLayoutKt.f32334n);
                    }
                } catch (Throwable th) {
                    companion.az(snapshotNr, snapshotO, function1Uo);
                    throw th;
                }
            }
            Unit unit = Unit.INSTANCE;
            companion.az(snapshotNr, snapshotO, function1Uo);
            this.slotIdToNode.gh();
        }
        te();
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void Uo() {
        iF(true);
    }

    public final void aYN(int startIndex) {
        boolean z2 = false;
        this.reusableCount = 0;
        List listM7 = this.root.M7();
        int size = (listM7.size() - this.precomposedCount) - 1;
        if (startIndex <= size) {
            this.reusableSlotIdsSet.clear();
            if (startIndex <= size) {
                int i2 = startIndex;
                while (true) {
                    this.reusableSlotIdsSet.add(g(listM7, i2));
                    if (i2 == size) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.slotReusePolicy.n(this.reusableSlotIdsSet);
            Snapshot.Companion companion = Snapshot.INSTANCE;
            Snapshot snapshotNr = companion.nr();
            Function1 function1Uo = snapshotNr != null ? snapshotNr.Uo() : null;
            Snapshot snapshotO = companion.O(snapshotNr);
            boolean z3 = false;
            while (size >= startIndex) {
                try {
                    LayoutNode layoutNode = (LayoutNode) listM7.get(size);
                    Object objO = this.nodeToNodeState.O(layoutNode);
                    Intrinsics.checkNotNull(objO);
                    NodeState nodeState = (NodeState) objO;
                    Object slotId = nodeState.getSlotId();
                    if (this.reusableSlotIdsSet.contains(slotId)) {
                        this.reusableCount++;
                        if (nodeState.n()) {
                            X(layoutNode);
                            nodeState.Uo(false);
                            z3 = true;
                        }
                    } else {
                        LayoutNode layoutNode2 = this.root;
                        layoutNode2.ignoreRemeasureRequests = true;
                        this.nodeToNodeState.XQ(layoutNode);
                        ReusableComposition composition = nodeState.getComposition();
                        if (composition != null) {
                            composition.n();
                        }
                        this.root.s(size, 1);
                        layoutNode2.ignoreRemeasureRequests = false;
                    }
                    this.slotIdToNode.XQ(slotId);
                    size--;
                } catch (Throwable th) {
                    companion.az(snapshotNr, snapshotO, function1Uo);
                    throw th;
                }
            }
            Unit unit = Unit.INSTANCE;
            companion.az(snapshotNr, snapshotO, function1Uo);
            z2 = z3;
        }
        if (z2) {
            Snapshot.INSTANCE.ty();
        }
        te();
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void qie() {
        iF(false);
    }

    static /* synthetic */ void E2(LayoutNodeSubcompositionsState layoutNodeSubcompositionsState, int i2, int i3, int i5, int i7, Object obj) {
        if ((i7 & 4) != 0) {
            i5 = 1;
        }
        layoutNodeSubcompositionsState.fD(i2, i3, i5);
    }

    private final LayoutNode S(int index) {
        LayoutNode layoutNode = new LayoutNode(true, 0, 2, null);
        LayoutNode layoutNode2 = this.root;
        layoutNode2.ignoreRemeasureRequests = true;
        this.root.tUK(index, layoutNode);
        layoutNode2.ignoreRemeasureRequests = false;
        return layoutNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ViF() {
        MutableScatterMap mutableScatterMap = this.approachPrecomposeSlotHandleMap;
        long[] jArr = mutableScatterMap.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr[i2];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i5 = 0; i5 < i3; i5++) {
                    if ((255 & j2) < 128) {
                        int i7 = (i2 << 3) + i5;
                        Object obj = mutableScatterMap.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_KEYS java.lang.String[i7];
                        SubcomposeLayoutState.PrecomposedSlotHandle precomposedSlotHandle = (SubcomposeLayoutState.PrecomposedSlotHandle) mutableScatterMap.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String[i7];
                        int iAz = this.approachComposedSlotIds.az(obj);
                        if (iAz < 0 || iAz >= this.currentApproachIndex) {
                            precomposedSlotHandle.n();
                            mutableScatterMap.S(i7);
                        }
                    }
                    j2 >>= 8;
                }
                if (i3 != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void WPU() {
        ReusableComposition composition;
        LayoutNode layoutNode = this.root;
        layoutNode.ignoreRemeasureRequests = true;
        MutableScatterMap mutableScatterMap = this.nodeToNodeState;
        Object[] objArr = mutableScatterMap.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String;
        long[] jArr = mutableScatterMap.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i5 = 0; i5 < i3; i5++) {
                        if ((255 & j2) < 128 && (composition = ((NodeState) objArr[(i2 << 3) + i5]).getComposition()) != null) {
                            composition.n();
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
        this.root.Aum();
        layoutNode.ignoreRemeasureRequests = false;
        this.nodeToNodeState.gh();
        this.slotIdToNode.gh();
        this.precomposedCount = 0;
        this.reusableCount = 0;
        this.precomposeMap.gh();
        te();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List Z(Object slotId, Function2 content) {
        if (!(this.approachComposedSlotIds.getSize() >= this.currentApproachIndex)) {
            InlineClassHelperKt.n("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        int size = this.approachComposedSlotIds.getSize();
        int i2 = this.currentApproachIndex;
        if (size == i2) {
            this.approachComposedSlotIds.rl(slotId);
        } else {
            this.approachComposedSlotIds.S(i2, slotId);
        }
        this.currentApproachIndex++;
        if (!this.precomposeMap.rl(slotId)) {
            this.approachPrecomposeSlotHandleMap.aYN(slotId, e(slotId, content));
            if (this.root.k() == LayoutNode.LayoutState.f32458O) {
                this.root.Mh(true);
            } else {
                LayoutNode.wKp(this.root, true, false, false, 6, null);
            }
        }
        LayoutNode layoutNode = (LayoutNode) this.precomposeMap.O(slotId);
        if (layoutNode != null) {
            List listV0j = layoutNode.eTf().v0j();
            int size2 = listV0j.size();
            for (int i3 = 0; i3 < size2; i3++) {
                ((MeasurePassDelegate) listV0j.get(i3)).waP();
            }
            if (listV0j != null) {
                return listV0j;
            }
        }
        return CollectionsKt.emptyList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void fD(int from, int to, int count) {
        LayoutNode layoutNode = this.root;
        layoutNode.ignoreRemeasureRequests = true;
        this.root.uG(from, to, count);
        layoutNode.ignoreRemeasureRequests = false;
    }

    private final LayoutNode rV9(Object slotId) {
        int i2;
        if (this.reusableCount == 0) {
            return null;
        }
        List listM7 = this.root.M7();
        int size = listM7.size() - this.precomposedCount;
        int i3 = size - this.reusableCount;
        int i5 = size - 1;
        int i7 = i5;
        while (true) {
            if (i7 < i3) {
                i2 = -1;
                break;
            }
            if (Intrinsics.areEqual(g(listM7, i7), slotId)) {
                i2 = i7;
                break;
            }
            i7--;
        }
        if (i2 == -1) {
            while (i5 >= i3) {
                Object objO = this.nodeToNodeState.O((LayoutNode) listM7.get(i5));
                Intrinsics.checkNotNull(objO);
                NodeState nodeState = (NodeState) objO;
                if (nodeState.getSlotId() == SubcomposeLayoutKt.f32334n || this.slotReusePolicy.rl(slotId, nodeState.getSlotId())) {
                    nodeState.az(slotId);
                    i7 = i5;
                    i2 = i7;
                    break;
                }
                i5--;
            }
            i7 = i5;
        }
        if (i2 == -1) {
            return null;
        }
        if (i7 != i3) {
            fD(i7, i3, 1);
        }
        this.reusableCount--;
        LayoutNode layoutNode = (LayoutNode) listM7.get(i3);
        Object objO2 = this.nodeToNodeState.O(layoutNode);
        Intrinsics.checkNotNull(objO2);
        NodeState nodeState2 = (NodeState) objO2;
        nodeState2.KN(SnapshotStateKt__SnapshotStateKt.O(Boolean.TRUE, null, 2, null));
        nodeState2.qie(true);
        nodeState2.gh(true);
        return layoutNode;
    }

    private final void s7N(LayoutNode node, final NodeState nodeState) {
        Snapshot.Companion companion = Snapshot.INSTANCE;
        Snapshot snapshotNr = companion.nr();
        Function1 function1Uo = snapshotNr != null ? snapshotNr.Uo() : null;
        Snapshot snapshotO = companion.O(snapshotNr);
        try {
            LayoutNode layoutNode = this.root;
            layoutNode.ignoreRemeasureRequests = true;
            final Function2 content = nodeState.getContent();
            ReusableComposition composition = nodeState.getComposition();
            CompositionContext compositionContext = this.compositionContext;
            if (compositionContext == null) {
                InlineClassHelperKt.nr("parent composition reference not set");
                throw new KotlinNothingValueException();
            }
            nodeState.xMQ(v(composition, node, nodeState.getForceReuse(), compositionContext, ComposableLambdaKt.rl(-1750409193, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$subcompose$3$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                    n(composer, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void n(Composer composer, int i2) {
                    if (!composer.HI((i2 & 3) != 2, i2 & 1)) {
                        composer.wTp();
                        return;
                    }
                    if (ComposerKt.v()) {
                        ComposerKt.p5(-1750409193, i2, -1, "androidx.compose.ui.layout.LayoutNodeSubcompositionsState.subcompose.<anonymous>.<anonymous>.<anonymous> (SubcomposeLayout.kt:522)");
                    }
                    boolean zN = nodeState.n();
                    Function2 function2 = content;
                    composer.nHg(Sdk.SDKError.Reason.PLACEMENT_AD_TYPE_MISMATCH_VALUE, Boolean.valueOf(zN));
                    boolean zN2 = composer.n(zN);
                    if (zN) {
                        function2.invoke(composer, 0);
                    } else {
                        composer.Uo(zN2);
                    }
                    composer.g();
                    if (ComposerKt.v()) {
                        ComposerKt.M7();
                    }
                }
            })));
            nodeState.qie(false);
            layoutNode.ignoreRemeasureRequests = false;
            Unit unit = Unit.INSTANCE;
            companion.az(snapshotNr, snapshotO, function1Uo);
        } catch (Throwable th) {
            companion.az(snapshotNr, snapshotO, function1Uo);
            throw th;
        }
    }

    private final ReusableComposition v(ReusableComposition existing, LayoutNode container, boolean reuseContent, CompositionContext parent, Function2 composable) {
        if (existing == null || existing.getDisposed()) {
            existing = SubcompositionKt.n(container, parent);
        }
        if (reuseContent) {
            existing.r(composable);
            return existing;
        }
        existing.KN(composable);
        return existing;
    }

    private final void wTp(LayoutNode node, Object slotId, Function2 content) {
        MutableScatterMap mutableScatterMap = this.nodeToNodeState;
        Object objO = mutableScatterMap.O(node);
        if (objO == null) {
            NodeState nodeState = new NodeState(slotId, ComposableSingletons$SubcomposeLayoutKt.f32216n.n(), null, 4, null);
            mutableScatterMap.aYN(node, nodeState);
            objO = nodeState;
        }
        NodeState nodeState2 = (NodeState) objO;
        ReusableComposition composition = nodeState2.getComposition();
        boolean zXQ = composition != null ? composition.XQ() : true;
        if (nodeState2.getContent() != content || zXQ || nodeState2.getForceRecompose()) {
            nodeState2.mUb(content);
            s7N(node, nodeState2);
            nodeState2.gh(false);
        }
    }

    public final void N(SubcomposeSlotReusePolicy subcomposeSlotReusePolicy) {
        if (this.slotReusePolicy != subcomposeSlotReusePolicy) {
            this.slotReusePolicy = subcomposeSlotReusePolicy;
            iF(false);
            LayoutNode.lNy(this.root, false, false, false, 7, null);
        }
    }

    public final void T(CompositionContext compositionContext) {
        this.compositionContext = compositionContext;
    }

    public final MeasurePolicy XQ(final Function2 block) {
        final String str = this.NoIntrinsicsMessage;
        return new LayoutNode.NoIntrinsicsMeasurePolicy(str) { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$createMeasurePolicy$1
            @Override // androidx.compose.ui.layout.MeasurePolicy
            public MeasureResult rl(MeasureScope measureScope, List list, long j2) {
                this.rl.scope.HI(measureScope.getLayoutDirection());
                this.rl.scope.nr(measureScope.getDensity());
                this.rl.scope.J2(measureScope.getFontScale());
                if (measureScope.Org() || this.rl.root.getLookaheadRoot() == null) {
                    this.rl.currentIndex = 0;
                    final MeasureResult measureResult = (MeasureResult) block.invoke(this.rl.scope, Constraints.n(j2));
                    final int i2 = this.rl.currentIndex;
                    final LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.rl;
                    return new MeasureResult() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$createMeasurePolicy$1$measure-3p2s80s$$inlined$createMeasureResult$2
                        @Override // androidx.compose.ui.layout.MeasureResult
                        /* JADX INFO: renamed from: XQ */
                        public Function1 getNr() {
                            return measureResult.getNr();
                        }

                        @Override // androidx.compose.ui.layout.MeasureResult
                        /* JADX INFO: renamed from: getHeight */
                        public int getRl() {
                            return measureResult.getRl();
                        }

                        @Override // androidx.compose.ui.layout.MeasureResult
                        /* JADX INFO: renamed from: getWidth */
                        public int getF32270n() {
                            return measureResult.getF32270n();
                        }

                        @Override // androidx.compose.ui.layout.MeasureResult
                        /* JADX INFO: renamed from: o */
                        public Map getF32271t() {
                            return measureResult.getF32271t();
                        }

                        @Override // androidx.compose.ui.layout.MeasureResult
                        public void Z() {
                            layoutNodeSubcompositionsState.currentIndex = i2;
                            measureResult.Z();
                            LayoutNodeSubcompositionsState layoutNodeSubcompositionsState2 = layoutNodeSubcompositionsState;
                            layoutNodeSubcompositionsState2.aYN(layoutNodeSubcompositionsState2.currentIndex);
                        }
                    };
                }
                this.rl.currentApproachIndex = 0;
                final MeasureResult measureResult2 = (MeasureResult) block.invoke(this.rl.approachMeasureScope, Constraints.n(j2));
                final int i3 = this.rl.currentApproachIndex;
                final LayoutNodeSubcompositionsState layoutNodeSubcompositionsState2 = this.rl;
                return new MeasureResult() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$createMeasurePolicy$1$measure-3p2s80s$$inlined$createMeasureResult$1
                    @Override // androidx.compose.ui.layout.MeasureResult
                    /* JADX INFO: renamed from: XQ */
                    public Function1 getNr() {
                        return measureResult2.getNr();
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    /* JADX INFO: renamed from: getHeight */
                    public int getRl() {
                        return measureResult2.getRl();
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    /* JADX INFO: renamed from: getWidth */
                    public int getF32270n() {
                        return measureResult2.getF32270n();
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    /* JADX INFO: renamed from: o */
                    public Map getF32271t() {
                        return measureResult2.getF32271t();
                    }

                    @Override // androidx.compose.ui.layout.MeasureResult
                    public void Z() {
                        layoutNodeSubcompositionsState2.currentApproachIndex = i3;
                        measureResult2.Z();
                        layoutNodeSubcompositionsState2.ViF();
                    }
                };
            }
        };
    }

    public final SubcomposeLayoutState.PrecomposedSlotHandle e(final Object slotId, Function2 content) {
        if (!this.root.nr()) {
            return new SubcomposeLayoutState.PrecomposedSlotHandle() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$precompose$1
                @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
                public void n() {
                }
            };
        }
        te();
        if (!this.slotIdToNode.t(slotId)) {
            this.approachPrecomposeSlotHandleMap.XQ(slotId);
            MutableScatterMap mutableScatterMap = this.precomposeMap;
            Object objO = mutableScatterMap.O(slotId);
            if (objO == null) {
                objO = rV9(slotId);
                if (objO != null) {
                    fD(this.root.M7().indexOf(objO), this.root.M7().size(), 1);
                    this.precomposedCount++;
                } else {
                    objO = S(this.root.M7().size());
                    this.precomposedCount++;
                }
                mutableScatterMap.aYN(slotId, objO);
            }
            wTp((LayoutNode) objO, slotId, content);
        }
        return new SubcomposeLayoutState.PrecomposedSlotHandle() { // from class: androidx.compose.ui.layout.LayoutNodeSubcompositionsState$precompose$2
            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            public void n() {
                this.f32278n.te();
                LayoutNode layoutNode = (LayoutNode) this.f32278n.precomposeMap.XQ(slotId);
                if (layoutNode != null) {
                    if (!(this.f32278n.precomposedCount > 0)) {
                        InlineClassHelperKt.t("No pre-composed items to dispose");
                    }
                    int iIndexOf = this.f32278n.root.M7().indexOf(layoutNode);
                    if (!(iIndexOf >= this.f32278n.root.M7().size() - this.f32278n.precomposedCount)) {
                        InlineClassHelperKt.t("Item is not in pre-composed item range");
                    }
                    this.f32278n.reusableCount++;
                    LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.f32278n;
                    layoutNodeSubcompositionsState.precomposedCount--;
                    int size = (this.f32278n.root.M7().size() - this.f32278n.precomposedCount) - this.f32278n.reusableCount;
                    this.f32278n.fD(iIndexOf, size, 1);
                    this.f32278n.aYN(size);
                }
            }

            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            public void nr(int index, long constraints) {
                LayoutNode layoutNode = (LayoutNode) this.f32278n.precomposeMap.O(slotId);
                if (layoutNode == null || !layoutNode.nr()) {
                    return;
                }
                int size = layoutNode.bzg().size();
                if (index < 0 || index >= size) {
                    InlineClassHelperKt.O("Index (" + index + ") is out of bound of [0, " + size + ')');
                }
                if (layoutNode.HI()) {
                    InlineClassHelperKt.n("Pre-measure called on node that is not placed");
                }
                LayoutNode layoutNode2 = this.f32278n.root;
                layoutNode2.ignoreRemeasureRequests = true;
                LayoutNodeKt.rl(layoutNode).nY((LayoutNode) layoutNode.bzg().get(index), constraints);
                layoutNode2.ignoreRemeasureRequests = false;
            }

            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            public void rl(Object key, Function1 block) {
                NodeChain nodes;
                Modifier.Node head;
                LayoutNode layoutNode = (LayoutNode) this.f32278n.precomposeMap.O(slotId);
                if (layoutNode == null || (nodes = layoutNode.getNodes()) == null || (head = nodes.getHead()) == null) {
                    return;
                }
                TraversableNodeKt.O(head, key, block);
            }

            @Override // androidx.compose.ui.layout.SubcomposeLayoutState.PrecomposedSlotHandle
            public int t() {
                List listBzg;
                LayoutNode layoutNode = (LayoutNode) this.f32278n.precomposeMap.O(slotId);
                if (layoutNode == null || (listBzg = layoutNode.bzg()) == null) {
                    return 0;
                }
                return listBzg.size();
            }
        };
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void nY() {
        if (this.reusableCount != this.root.M7().size()) {
            MutableScatterMap mutableScatterMap = this.nodeToNodeState;
            Object[] objArr = mutableScatterMap.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String;
            long[] jArr = mutableScatterMap.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j2 = jArr[i2];
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i3 = 8 - ((~(i2 - length)) >>> 31);
                        for (int i5 = 0; i5 < i3; i5++) {
                            if ((255 & j2) < 128) {
                                ((NodeState) objArr[(i2 << 3) + i5]).gh(true);
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
            if (this.root.xg()) {
                return;
            }
            LayoutNode.lNy(this.root, false, false, false, 7, null);
        }
    }

    public final void te() {
        int size = this.root.M7().size();
        if (!(this.nodeToNodeState.get_size() == size)) {
            InlineClassHelperKt.n("Inconsistency between the count of nodes tracked by the state (" + this.nodeToNodeState.get_size() + ") and the children count on the SubcomposeLayout (" + size + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if (!((size - this.reusableCount) - this.precomposedCount >= 0)) {
            InlineClassHelperKt.n("Incorrect state. Total children " + size + ". Reusable children " + this.reusableCount + ". Precomposed children " + this.precomposedCount);
        }
        if (this.precomposeMap.get_size() == this.precomposedCount) {
            return;
        }
        InlineClassHelperKt.n("Incorrect state. Precomposed children " + this.precomposedCount + ". Map size " + this.precomposeMap.get_size());
    }

    public LayoutNodeSubcompositionsState(LayoutNode layoutNode, SubcomposeSlotReusePolicy subcomposeSlotReusePolicy) {
        this.root = layoutNode;
        this.slotReusePolicy = subcomposeSlotReusePolicy;
    }

    private final void X(LayoutNode layoutNode) {
        MeasurePassDelegate measurePassDelegateETf = layoutNode.eTf();
        LayoutNode.UsageByParent usageByParent = LayoutNode.UsageByParent.f32465O;
        measurePassDelegateETf.fq(usageByParent);
        LookaheadPassDelegate lookaheadPassDelegatePiY = layoutNode.piY();
        if (lookaheadPassDelegatePiY != null) {
            lookaheadPassDelegatePiY.eb(usageByParent);
        }
    }

    private final Object g(List foldedChildren, int index) {
        Object objO = this.nodeToNodeState.O((LayoutNode) foldedChildren.get(index));
        Intrinsics.checkNotNull(objO);
        return ((NodeState) objO).getSlotId();
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List nHg(Object slotId, Function2 content) {
        boolean z2;
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState;
        boolean z3;
        te();
        LayoutNode.LayoutState layoutStateK = this.root.k();
        LayoutNode.LayoutState layoutState = LayoutNode.LayoutState.f32460n;
        boolean z4 = false;
        if (layoutStateK != layoutState && layoutStateK != LayoutNode.LayoutState.f32458O && layoutStateK != LayoutNode.LayoutState.f32463t && layoutStateK != LayoutNode.LayoutState.J2) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            InlineClassHelperKt.t("subcompose can only be used inside the measure or layout blocks");
        }
        MutableScatterMap mutableScatterMap = this.slotIdToNode;
        Object objO = mutableScatterMap.O(slotId);
        if (objO == null) {
            objO = (LayoutNode) this.precomposeMap.XQ(slotId);
            if (objO != null) {
                if (this.precomposedCount > 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (!z3) {
                    InlineClassHelperKt.t("Check failed.");
                }
                this.precomposedCount--;
            } else {
                objO = rV9(slotId);
                if (objO == null) {
                    objO = S(this.currentIndex);
                }
            }
            mutableScatterMap.aYN(slotId, objO);
        }
        LayoutNode layoutNode = (LayoutNode) objO;
        if (CollectionsKt.getOrNull(this.root.M7(), this.currentIndex) != layoutNode) {
            int iIndexOf = this.root.M7().indexOf(layoutNode);
            if (iIndexOf >= this.currentIndex) {
                z4 = true;
            }
            if (!z4) {
                InlineClassHelperKt.n("Key \"" + slotId + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
            }
            int i2 = this.currentIndex;
            if (i2 != iIndexOf) {
                layoutNodeSubcompositionsState = this;
                E2(layoutNodeSubcompositionsState, iIndexOf, i2, 0, 4, null);
            }
        } else {
            layoutNodeSubcompositionsState = this;
        }
        layoutNodeSubcompositionsState.currentIndex++;
        wTp(layoutNode, slotId, content);
        if (layoutStateK != layoutState && layoutStateK != LayoutNode.LayoutState.f32458O) {
            return layoutNode.v();
        }
        return layoutNode.rV9();
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void t() {
        WPU();
    }
}
