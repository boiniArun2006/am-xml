package androidx.compose.ui.node;

import androidx.collection.MutableObjectFloatMap;
import androidx.collection.MutableScatterMap;
import androidx.collection.MutableScatterSet;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.PlaceableKt;
import androidx.compose.ui.layout.Ruler;
import androidx.compose.ui.layout.RulerScope;
import androidx.compose.ui.layout.VerticalAlignmentLine;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.IntOffset;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000e\b \u0018\u0000 n2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001oB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0015\u001a\u00020\n2\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0086\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH&¢\u0006\u0004\b \u0010\u001fJ\u000f\u0010!\u001a\u00020\nH ¢\u0006\u0004\b!\u0010\u0005J\u0013\u0010#\u001a\u00020\n*\u00020\"H\u0004¢\u0006\u0004\b#\u0010$Jg\u00100\u001a\u00020/2\u0006\u0010%\u001a\u00020\u001d2\u0006\u0010&\u001a\u00020\u001d2\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001d0'2\u0019\u0010,\u001a\u0015\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\n\u0018\u00010)¢\u0006\u0002\b+2\u0017\u0010.\u001a\u0013\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\n0)¢\u0006\u0002\b+H\u0016¢\u0006\u0004\b0\u00101J\u0019\u00103\u001a\u00020\n2\b\u00102\u001a\u0004\u0018\u00010/H\u0000¢\u0006\u0004\b3\u00104R\u0018\u00107\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\"\u0010<\u001a\u00020\u00178\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b8\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010\u001aR\"\u0010@\u001a\u00020\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b=\u00108\u001a\u0004\b>\u0010:\"\u0004\b?\u0010\u001aR\"\u0010D\u001a\u00020\u00178\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bA\u00108\u001a\u0004\bB\u0010:\"\u0004\bC\u0010\u001aR\u0017\u0010I\u001a\u00020-8\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR\u001e\u0010M\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u001e\u0010O\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010LR0\u0010S\u001a\u001c\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u001a\u0010W\u001a\u00020T8&X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bU\u0010VR\u0016\u0010Z\u001a\u0004\u0018\u00010\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0016\u0010\\\u001a\u0004\u0018\u00010\u00008&X¦\u0004¢\u0006\u0006\u001a\u0004\b[\u0010YR\u0014\u0010^\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b]\u0010:R\u0014\u0010a\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b_\u0010`R\u0014\u0010e\u001a\u00020b8&X¦\u0004¢\u0006\u0006\u001a\u0004\bc\u0010dR\u0011\u0010h\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\bf\u0010gR\u0014\u0010k\u001a\u00020/8 X \u0004¢\u0006\u0006\u001a\u0004\bi\u0010jR\u0014\u0010m\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bl\u0010:\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006p"}, d2 = {"Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/node/MeasureScopeWithLayoutNode;", "Landroidx/compose/ui/node/MotionReferencePlacementDelegate;", "<init>", "()V", "Landroidx/compose/ui/layout/Ruler;", "ruler", "Qu", "(Landroidx/compose/ui/layout/Ruler;)Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "", "jO", "(Landroidx/compose/ui/layout/Ruler;)V", "Landroidx/compose/ui/node/PlaceableResult;", "placeableResult", InneractiveMediationDefs.GENDER_FEMALE, "(Landroidx/compose/ui/node/PlaceableResult;)V", "Landroidx/collection/MutableScatterSet;", "Landroidx/compose/ui/node/WeakReference;", "Landroidx/compose/ui/node/LayoutNode;", "layoutNodes", "XNZ", "(Landroidx/collection/MutableScatterSet;)V", "", "newMFR", "P5", "(Z)V", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "", "z", "(Landroidx/compose/ui/layout/AlignmentLine;)I", "p0N", "lNy", "Landroidx/compose/ui/node/NodeCoordinator;", "Mh", "(Landroidx/compose/ui/node/NodeCoordinator;)V", "width", "height", "", "alignmentLines", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/RulerScope;", "Lkotlin/ExtensionFunctionType;", "rulers", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "placementBlock", "Landroidx/compose/ui/layout/MeasureResult;", "bZm", "(IILjava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/layout/MeasureResult;", "result", "ub", "(Landroidx/compose/ui/layout/MeasureResult;)V", "o", "Landroidx/compose/ui/layout/RulerScope;", "_rulerScope", "Z", "wKp", "()Z", "D76", "isPlacedUnderMotionFrameOfReference", "S", "xzo", "j", "isShallowPlacing", "g", "Th", "NP", "isPlacingForAlignment", "E2", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "n7b", "()Landroidx/compose/ui/layout/Placeable$PlacementScope;", "placementScope", "Landroidx/collection/MutableObjectFloatMap;", "e", "Landroidx/collection/MutableObjectFloatMap;", "rulerValues", "X", "rulerValuesCache", "Landroidx/collection/MutableScatterMap;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/collection/MutableScatterMap;", "rulerReaders", "Landroidx/compose/ui/unit/IntOffset;", "Aum", "()J", "position", "X4T", "()Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "child", "v0j", "parent", "xVH", "hasMeasureResult", "A", "()Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/layout/LayoutCoordinates;", "Zmq", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "Lp6", "()Landroidx/compose/ui/layout/RulerScope;", "rulerScope", "uG", "()Landroidx/compose/ui/layout/MeasureResult;", "measureResult", "Org", "isLookingAhead", "N", "Companion", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLookaheadDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadCapablePlaceable\n+ 2 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 ScatterSet.kt\nandroidx/collection/MutableScatterSet\n+ 5 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 6 ScatterMap.kt\nandroidx/collection/MutableScatterMap\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 ObjectFloatMap.kt\nandroidx/collection/ObjectFloatMap\n+ 9 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegateKt\n+ 10 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n*L\n1#1,521:1\n372#2,3:522\n329#2,6:525\n339#2,3:532\n342#2,2:536\n345#2,6:567\n375#2:573\n329#2,6:575\n339#2,3:582\n342#2,2:586\n345#2,6:592\n372#2,3:610\n329#2,6:613\n339#2,3:620\n342#2,9:624\n375#2:633\n372#2,3:634\n329#2,6:637\n339#2,3:644\n342#2,9:648\n375#2:657\n1399#3:531\n1270#3:535\n1399#3:581\n1270#3:585\n1399#3:619\n1270#3:623\n1399#3:643\n1270#3:647\n1399#3:669\n1270#3:673\n1399#3:693\n1270#3:697\n1399#3:718\n1270#3:722\n809#4,2:538\n812#4,4:556\n816#4:566\n200#5,16:540\n217#5,6:560\n231#5,3:708\n200#5,7:711\n211#5,3:719\n214#5,9:723\n234#5:732\n842#6:574\n844#6,4:588\n848#6:598\n683#6:599\n1#7:600\n1#7:658\n438#8:601\n395#8,4:659\n367#8,6:663\n377#8,3:670\n380#8,9:674\n399#8:683\n403#8,3:684\n367#8,6:687\n377#8,3:694\n380#8,2:698\n438#8:700\n383#8,6:701\n406#8:707\n361#9:602\n362#9,2:606\n365#9:609\n56#10,3:603\n60#10:608\n*S KotlinDebug\n*F\n+ 1 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadCapablePlaceable\n*L\n185#1:522,3\n185#1:525,6\n185#1:532,3\n185#1:536,2\n185#1:567,6\n185#1:573\n186#1:575,6\n186#1:582,3\n186#1:586,2\n186#1:592,6\n254#1:610,3\n254#1:613,6\n254#1:620,3\n254#1:624,9\n254#1:633\n269#1:634,3\n269#1:637,6\n269#1:644,3\n269#1:648,9\n269#1:657\n185#1:531\n185#1:535\n186#1:581\n186#1:585\n254#1:619\n254#1:623\n269#1:643\n269#1:647\n288#1:669\n288#1:673\n301#1:693\n301#1:697\n311#1:718\n311#1:722\n185#1:538,2\n185#1:556,4\n185#1:566\n185#1:540,16\n185#1:560,6\n311#1:708,3\n311#1:711,7\n311#1:719,3\n311#1:723,9\n311#1:732\n186#1:574\n186#1:588,4\n186#1:598\n192#1:599\n192#1:600\n199#1:601\n288#1:659,4\n288#1:663,6\n288#1:670,3\n288#1:674,9\n288#1:683\n301#1:684,3\n301#1:687,6\n301#1:694,3\n301#1:698,2\n302#1:700\n301#1:701,6\n301#1:707\n230#1:602\n230#1:606,2\n230#1:609\n230#1:603,3\n230#1:608\n*E\n"})
public abstract class LookaheadCapablePlaceable extends Placeable implements MeasureScopeWithLayoutNode, MotionReferencePlacementDelegate {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final Function1 f32484v = new Function1<PlaceableResult, Unit>() { // from class: androidx.compose.ui.node.LookaheadCapablePlaceable$Companion$onCommitAffectingRuler$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PlaceableResult placeableResult) {
            n(placeableResult);
            return Unit.INSTANCE;
        }

        public final void n(PlaceableResult placeableResult) {
            if (placeableResult.Vvq()) {
                placeableResult.getPlaceable().f(placeableResult);
            }
        }
    };

    /* JADX INFO: renamed from: E2, reason: from kotlin metadata */
    private final Placeable.PlacementScope placementScope = PlaceableKt.n(this);

    /* JADX INFO: renamed from: S, reason: collision with root package name and from kotlin metadata */
    private boolean isShallowPlacing;

    /* JADX INFO: renamed from: T, reason: collision with root package name and from kotlin metadata */
    private MutableScatterMap rulerReaders;

    /* JADX INFO: renamed from: X, reason: collision with root package name and from kotlin metadata */
    private MutableObjectFloatMap rulerValuesCache;

    /* JADX INFO: renamed from: Z, reason: collision with root package name and from kotlin metadata */
    private boolean isPlacedUnderMotionFrameOfReference;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private MutableObjectFloatMap rulerValues;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean isPlacingForAlignment;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private RulerScope _rulerScope;

    private final LookaheadCapablePlaceable Qu(Ruler ruler) {
        LookaheadCapablePlaceable lookaheadCapablePlaceable = this;
        while (true) {
            MutableObjectFloatMap mutableObjectFloatMap = lookaheadCapablePlaceable.rulerValues;
            if (mutableObjectFloatMap != null && mutableObjectFloatMap.n(ruler)) {
                return lookaheadCapablePlaceable;
            }
            LookaheadCapablePlaceable lookaheadCapablePlaceableV0j = lookaheadCapablePlaceable.v0j();
            if (lookaheadCapablePlaceableV0j == null) {
                return lookaheadCapablePlaceable;
            }
            lookaheadCapablePlaceable = lookaheadCapablePlaceableV0j;
        }
    }

    @Override // androidx.compose.ui.node.MeasureScopeWithLayoutNode
    /* JADX INFO: renamed from: A */
    public abstract LayoutNode getLayoutNode();

    /* JADX INFO: renamed from: Aum */
    public abstract long getPosition();

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public boolean Org() {
        return false;
    }

    public abstract LookaheadCapablePlaceable X4T();

    public abstract LayoutCoordinates Zmq();

    public abstract void lNy();

    public abstract int p0N(AlignmentLine alignmentLine);

    public abstract MeasureResult uG();

    public abstract LookaheadCapablePlaceable v0j();

    public abstract boolean xVH();

    /* JADX WARN: Multi-variable type inference failed */
    private final void XNZ(MutableScatterSet layoutNodes) {
        LayoutNode layoutNode;
        Object[] objArr = layoutNodes.elements;
        long[] jArr = layoutNodes.metadata;
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
                    if ((255 & j2) < 128 && (layoutNode = (LayoutNode) ((WeakReference) objArr[(i2 << 3) + i5]).get()) != null) {
                        if (Org()) {
                            layoutNode.Mh(false);
                        } else {
                            layoutNode.Th(false);
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0162  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(final PlaceableResult placeableResult) {
        long j2;
        long j3;
        LookaheadCapablePlaceable lookaheadCapablePlaceableV0j;
        long j4;
        MutableScatterSet mutableScatterSet;
        OwnerSnapshotObserver snapshotObserver;
        char c2;
        char c4;
        if (this.isPlacingForAlignment) {
            return;
        }
        Function1 rulers = placeableResult.getResult().getNr();
        MutableScatterMap mutableScatterMap = this.rulerReaders;
        char c5 = 7;
        long j5 = -9187201950435737472L;
        int i2 = 0;
        if (rulers == null) {
            if (mutableScatterMap != null) {
                Object[] objArr = mutableScatterMap.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String;
                long[] jArr = mutableScatterMap.metadata;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        long j6 = jArr[i3];
                        if ((((~j6) << c5) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i5 = 8 - ((~(i3 - length)) >>> 31);
                            int i7 = 0;
                            while (i7 < i5) {
                                if ((j6 & 255) < 128) {
                                    c4 = c5;
                                    XNZ((MutableScatterSet) objArr[(i3 << 3) + i7]);
                                } else {
                                    c4 = c5;
                                }
                                j6 >>= 8;
                                i7++;
                                c5 = c4;
                            }
                            c2 = c5;
                            if (i5 != 8) {
                                break;
                            }
                        } else {
                            c2 = c5;
                        }
                        if (i3 == length) {
                            break;
                        }
                        i3++;
                        c5 = c2;
                    }
                }
                mutableScatterMap.gh();
                return;
            }
            return;
        }
        long j7 = 128;
        MutableObjectFloatMap mutableObjectFloatMap = this.rulerValuesCache;
        if (mutableObjectFloatMap == null) {
            mutableObjectFloatMap = new MutableObjectFloatMap(0, 1, null);
            this.rulerValuesCache = mutableObjectFloatMap;
        }
        MutableObjectFloatMap mutableObjectFloatMap2 = this.rulerValues;
        if (mutableObjectFloatMap2 == null) {
            mutableObjectFloatMap2 = new MutableObjectFloatMap(0, 1, null);
            this.rulerValues = mutableObjectFloatMap2;
        }
        mutableObjectFloatMap.HI(mutableObjectFloatMap2);
        mutableObjectFloatMap2.KN();
        Owner owner = getLayoutNode().getOwner();
        if (owner != null && (snapshotObserver = owner.getSnapshotObserver()) != null) {
            snapshotObserver.xMQ(placeableResult, f32484v, new Function0<Unit>() { // from class: androidx.compose.ui.node.LookaheadCapablePlaceable$captureRulers$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    Function1 rulers2 = placeableResult.getResult().getNr();
                    if (rulers2 != null) {
                        rulers2.invoke(this.Lp6());
                    }
                }
            });
        }
        if (mutableScatterMap != null) {
            Object[] objArr2 = mutableObjectFloatMap.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_KEYS java.lang.String;
            float[] fArr = mutableObjectFloatMap.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_VALUES java.lang.String;
            long[] jArr2 = mutableObjectFloatMap.metadata;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i8 = 0;
                while (true) {
                    long j9 = jArr2[i8];
                    j2 = j5;
                    if ((((~j9) << 7) & j9 & j2) != j2) {
                        int i9 = 8 - ((~(i8 - length2)) >>> 31);
                        int i10 = i2;
                        while (i10 < i9) {
                            if ((j9 & 255) < j7) {
                                int i11 = (i8 << 3) + i10;
                                Ruler ruler = (Ruler) objArr2[i11];
                                j4 = j7;
                                if (mutableObjectFloatMap2.nr(ruler, Float.NaN) != fArr[i11] && (mutableScatterSet = (MutableScatterSet) mutableScatterMap.XQ(ruler)) != null) {
                                    XNZ(mutableScatterSet);
                                }
                            } else {
                                j4 = j7;
                            }
                            j9 >>= 8;
                            i10++;
                            j7 = j4;
                        }
                        j3 = j7;
                        if (i9 != 8) {
                            break;
                        }
                    } else {
                        j3 = j7;
                    }
                    if (i8 == length2) {
                        break;
                    }
                    i8++;
                    j5 = j2;
                    j7 = j3;
                    i2 = 0;
                }
            } else {
                j2 = -9187201950435737472L;
                j3 = 128;
            }
        }
        Object[] objArr3 = mutableObjectFloatMap2.com.caoccao.javet.values.reference.IV8ValueMap.FUNCTION_KEYS java.lang.String;
        long[] jArr3 = mutableObjectFloatMap2.metadata;
        int length3 = jArr3.length - 2;
        if (length3 >= 0) {
            int i12 = 0;
            while (true) {
                long j10 = jArr3[i12];
                if ((((~j10) << 7) & j10 & j2) != j2) {
                    int i13 = 8 - ((~(i12 - length3)) >>> 31);
                    for (int i14 = 0; i14 < i13; i14++) {
                        if ((j10 & 255) < j3) {
                            Ruler ruler2 = (Ruler) objArr3[(i12 << 3) + i14];
                            if (!mutableObjectFloatMap.n(ruler2) && (lookaheadCapablePlaceableV0j = v0j()) != null) {
                                lookaheadCapablePlaceableV0j.jO(ruler2);
                            }
                        }
                        j10 >>= 8;
                    }
                    if (i13 != 8) {
                        break;
                    } else if (i12 == length3) {
                        break;
                    } else {
                        i12++;
                    }
                }
            }
        }
        mutableObjectFloatMap.KN();
    }

    public void D76(boolean z2) {
        this.isPlacedUnderMotionFrameOfReference = z2;
    }

    public final RulerScope Lp6() {
        RulerScope rulerScope = this._rulerScope;
        return rulerScope == null ? new RulerScope() { // from class: androidx.compose.ui.node.LookaheadCapablePlaceable$rulerScope$1
            @Override // androidx.compose.ui.unit.Density
            public float getDensity() {
                return this.f32498n.getDensity();
            }

            @Override // androidx.compose.ui.unit.FontScaling
            /* JADX INFO: renamed from: yAc */
            public float getFontScale() {
                return this.f32498n.getFontScale();
            }
        } : rulerScope;
    }

    public final void NP(boolean z2) {
        this.isPlacingForAlignment = z2;
    }

    /* JADX INFO: renamed from: Th, reason: from getter */
    public final boolean getIsPlacingForAlignment() {
        return this.isPlacingForAlignment;
    }

    @Override // androidx.compose.ui.layout.MeasureScope
    public MeasureResult bZm(final int width, final int height, final Map alignmentLines, final Function1 rulers, final Function1 placementBlock) {
        if (!((width & (-16777216)) == 0 && ((-16777216) & height) == 0)) {
            InlineClassHelperKt.t("Size(" + width + " x " + height + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new MeasureResult() { // from class: androidx.compose.ui.node.LookaheadCapablePlaceable$layout$1
            @Override // androidx.compose.ui.layout.MeasureResult
            /* JADX INFO: renamed from: XQ, reason: from getter */
            public Function1 getNr() {
                return rulers;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public void Z() {
                placementBlock.invoke(this.getPlacementScope());
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            /* JADX INFO: renamed from: getHeight, reason: from getter */
            public int getRl() {
                return height;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            /* JADX INFO: renamed from: getWidth, reason: from getter */
            public int getF32496n() {
                return width;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            /* JADX INFO: renamed from: o, reason: from getter */
            public Map getF32497t() {
                return alignmentLines;
            }
        };
    }

    public final void j(boolean z2) {
        this.isShallowPlacing = z2;
    }

    /* JADX INFO: renamed from: n7b, reason: from getter */
    public final Placeable.PlacementScope getPlacementScope() {
        return this.placementScope;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void ub(MeasureResult result) {
        if (result != null) {
            f(new PlaceableResult(result, this));
            return;
        }
        MutableScatterMap mutableScatterMap = this.rulerReaders;
        if (mutableScatterMap != null) {
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
                                XNZ((MutableScatterSet) objArr[(i2 << 3) + i5]);
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
        MutableScatterMap mutableScatterMap2 = this.rulerReaders;
        if (mutableScatterMap2 != null) {
            mutableScatterMap2.gh();
        }
        MutableObjectFloatMap mutableObjectFloatMap = this.rulerValues;
        if (mutableObjectFloatMap != null) {
            mutableObjectFloatMap.KN();
        }
    }

    /* JADX INFO: renamed from: wKp, reason: from getter */
    public boolean getIsPlacedUnderMotionFrameOfReference() {
        return this.isPlacedUnderMotionFrameOfReference;
    }

    /* JADX INFO: renamed from: xzo, reason: from getter */
    public final boolean getIsShallowPlacing() {
        return this.isShallowPlacing;
    }

    private final void jO(Ruler ruler) {
        MutableScatterSet mutableScatterSet;
        MutableScatterMap mutableScatterMap = Qu(ruler).rulerReaders;
        if (mutableScatterMap != null) {
            mutableScatterSet = (MutableScatterSet) mutableScatterMap.XQ(ruler);
        } else {
            mutableScatterSet = null;
        }
        if (mutableScatterSet != null) {
            XNZ(mutableScatterSet);
        }
    }

    protected final void Mh(NodeCoordinator nodeCoordinator) {
        LayoutNode layoutNode;
        AlignmentLines alignmentLinesO;
        NodeCoordinator wrapped = nodeCoordinator.getWrapped();
        if (wrapped != null) {
            layoutNode = wrapped.getLayoutNode();
        } else {
            layoutNode = null;
        }
        if (!Intrinsics.areEqual(layoutNode, nodeCoordinator.getLayoutNode())) {
            nodeCoordinator.YiW().o().az();
            return;
        }
        AlignmentLinesOwner alignmentLinesOwnerXw = nodeCoordinator.YiW().Xw();
        if (alignmentLinesOwnerXw != null && (alignmentLinesO = alignmentLinesOwnerXw.o()) != null) {
            alignmentLinesO.az();
        }
    }

    @Override // androidx.compose.ui.node.MotionReferencePlacementDelegate
    public void P5(boolean newMFR) {
        LayoutNode layoutNode;
        LayoutNode.LayoutState layoutStateK;
        LookaheadCapablePlaceable lookaheadCapablePlaceableV0j = v0j();
        LayoutNode.LayoutState layoutStateK2 = null;
        if (lookaheadCapablePlaceableV0j != null) {
            layoutNode = lookaheadCapablePlaceableV0j.getLayoutNode();
        } else {
            layoutNode = null;
        }
        if (Intrinsics.areEqual(layoutNode, getLayoutNode())) {
            D76(newMFR);
            return;
        }
        if (layoutNode != null) {
            layoutStateK = layoutNode.k();
        } else {
            layoutStateK = null;
        }
        if (layoutStateK != LayoutNode.LayoutState.f32458O) {
            if (layoutNode != null) {
                layoutStateK2 = layoutNode.k();
            }
            if (layoutStateK2 != LayoutNode.LayoutState.J2) {
                return;
            }
        }
        D76(newMFR);
    }

    @Override // androidx.compose.ui.layout.Measured
    public final int z(AlignmentLine alignmentLine) {
        int iP0N;
        int iQie;
        if (!xVH() || (iP0N = p0N(alignmentLine)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        if (alignmentLine instanceof VerticalAlignmentLine) {
            iQie = IntOffset.gh(getApparentToRealOffset());
        } else {
            iQie = IntOffset.qie(getApparentToRealOffset());
        }
        return iP0N + iQie;
    }
}
