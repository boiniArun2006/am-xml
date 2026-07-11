package androidx.compose.ui.layout;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNodeCoordinator;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LookaheadDelegate;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJO\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\r2\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010¢\u0006\u0002\b\u0013H\u0096\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\n*\u00020\u0018H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\n*\u00020\u001bH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u0018*\u00020\u001bH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\u0018*\u00020 H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\"J\u001a\u0010#\u001a\u00020\u0018*\u00020\nH\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020&*\u00020%H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020 *\u00020\u0018H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010\"J\u0017\u0010*\u001a\u00020 *\u00020\u001bH\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b*\u0010\u001fJ\u0017\u0010+\u001a\u00020%*\u00020&H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b+\u0010(J\u0017\u0010,\u001a\u00020\u001b*\u00020\u0018H\u0097\u0001ø\u0001\u0000¢\u0006\u0004\b,\u0010-J\u001a\u0010.\u001a\u00020\u001b*\u00020 H\u0097\u0001ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b.\u0010-J\u0013\u00100\u001a\u00020/*\u00020/H\u0016¢\u0006\u0004\b0\u00101Jg\u00104\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\n0\r2\u0019\u00103\u001a\u0015\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010¢\u0006\u0002\b\u00132\u0017\u0010\u0014\u001a\u0013\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010¢\u0006\u0002\b\u0013H\u0016¢\u0006\u0004\b4\u00105R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\"\u0010F\u001a\u00020@8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bA\u0010\u001e\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u0014\u0010I\u001a\u00020 8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0014\u0010K\u001a\u00020 8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bJ\u0010HR\u0014\u0010O\u001a\u00020L8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bM\u0010NR\u001a\u0010S\u001a\u00020P8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0018\u0010V\u001a\u00020/*\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0014\u0010X\u001a\u00020@8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u0010C\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Y"}, d2 = {"Landroidx/compose/ui/layout/ApproachMeasureScopeImpl;", "Landroidx/compose/ui/layout/ApproachMeasureScope;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/LookaheadScope;", "Landroidx/compose/ui/node/LayoutModifierNodeCoordinator;", "coordinator", "Landroidx/compose/ui/layout/ApproachLayoutModifierNode;", "approachNode", "<init>", "(Landroidx/compose/ui/node/LayoutModifierNodeCoordinator;Landroidx/compose/ui/layout/ApproachLayoutModifierNode;)V", "", "width", "height", "", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLines", "Lkotlin/Function1;", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "", "Lkotlin/ExtensionFunctionType;", "placementBlock", "Landroidx/compose/ui/layout/MeasureResult;", "Zn", "(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/unit/Dp;", "How", "(F)I", "Landroidx/compose/ui/unit/TextUnit;", "I4p", "(J)I", "Z", "(J)F", "", "bzg", "(F)F", "rV9", "(I)F", "Landroidx/compose/ui/geometry/Size;", "Landroidx/compose/ui/unit/DpSize;", "Ik", "(J)J", CmcdData.STREAM_TYPE_LIVE, "tFV", "M", "ck", "(F)J", "ViF", "Landroidx/compose/ui/layout/LayoutCoordinates;", "r", "(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/layout/RulerScope;", "rulers", "bZm", "(IILjava/util/Map;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/layout/MeasureResult;", c.f62177j, "Landroidx/compose/ui/node/LayoutModifierNodeCoordinator;", "te", "()Landroidx/compose/ui/node/LayoutModifierNodeCoordinator;", "t", "Landroidx/compose/ui/layout/ApproachLayoutModifierNode;", "g", "()Landroidx/compose/ui/layout/ApproachLayoutModifierNode;", "e", "(Landroidx/compose/ui/layout/ApproachLayoutModifierNode;)V", "", "O", "aYN", "()Z", "fD", "(Z)V", "approachMeasureRequired", "getDensity", "()F", "density", "yAc", "fontScale", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/unit/IntSize;", "Uf", "()J", "lookaheadSize", "o", "(Landroidx/compose/ui/layout/Placeable$PlacementScope;)Landroidx/compose/ui/layout/LayoutCoordinates;", "lookaheadScopeCoordinates", "Org", "isLookingAhead", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nApproachMeasureScope.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ApproachMeasureScope.kt\nandroidx/compose/ui/layout/ApproachMeasureScopeImpl\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegateKt\n*L\n1#1,117:1\n113#2,7:118\n113#2,7:128\n56#2,3:136\n60#2:141\n1#3:125\n30#4:126\n80#5:127\n361#6:135\n362#6,2:139\n365#6:142\n*S KotlinDebug\n*F\n+ 1 ApproachMeasureScope.kt\nandroidx/compose/ui/layout/ApproachMeasureScopeImpl\n*L\n59#1:118,7\n79#1:128,7\n99#1:136,3\n99#1:141\n64#1:126\n64#1:127\n99#1:135\n99#1:139,2\n99#1:142\n*E\n"})
public final class ApproachMeasureScopeImpl implements ApproachMeasureScope, MeasureScope, LookaheadScope {

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private boolean approachMeasureRequired;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final LayoutModifierNodeCoordinator coordinator;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private ApproachLayoutModifierNode approachNode;

    @Override // androidx.compose.ui.unit.Density
    public int How(float f3) {
        return this.coordinator.How(f3);
    }

    @Override // androidx.compose.ui.unit.Density
    public int I4p(long j2) {
        return this.coordinator.I4p(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    public long Ik(long j2) {
        return this.coordinator.Ik(j2);
    }

    @Override // androidx.compose.ui.unit.Density
    public long M(long j2) {
        return this.coordinator.M(j2);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public boolean Org() {
        return false;
    }

    @Override // androidx.compose.ui.unit.Density
    public long ViF(float f3) {
        return this.coordinator.ViF(f3);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public float Z(long j2) {
        return this.coordinator.Z(j2);
    }

    @Override // androidx.compose.ui.layout.MeasureScope
    public MeasureResult Zn(int width, int height, Map alignmentLines, Function1 placementBlock) {
        return this.coordinator.Zn(width, height, alignmentLines, placementBlock);
    }

    @Override // androidx.compose.ui.unit.Density
    public float bzg(float f3) {
        return this.coordinator.bzg(f3);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    public long ck(float f3) {
        return this.coordinator.ck(f3);
    }

    @Override // androidx.compose.ui.unit.Density
    public float getDensity() {
        return this.coordinator.getDensity();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasureScope
    public LayoutDirection getLayoutDirection() {
        return this.coordinator.getLayoutDirection();
    }

    @Override // androidx.compose.ui.unit.Density
    public float l(float f3) {
        return this.coordinator.l(f3);
    }

    @Override // androidx.compose.ui.unit.Density
    public float rV9(int i2) {
        return this.coordinator.rV9(i2);
    }

    @Override // androidx.compose.ui.unit.Density
    public float tFV(long j2) {
        return this.coordinator.tFV(j2);
    }

    @Override // androidx.compose.ui.unit.FontScaling
    /* JADX INFO: renamed from: yAc */
    public float getFontScale() {
        return this.coordinator.getFontScale();
    }

    @Override // androidx.compose.ui.layout.ApproachIntrinsicMeasureScope
    public long Uf() {
        LookaheadDelegate lookaheadDelegate = this.coordinator.getLookaheadDelegate();
        Intrinsics.checkNotNull(lookaheadDelegate);
        MeasureResult measureResultUG = lookaheadDelegate.uG();
        return IntSize.t((((long) measureResultUG.getWidth()) << 32) | (((long) measureResultUG.getHeight()) & 4294967295L));
    }

    /* JADX INFO: renamed from: aYN, reason: from getter */
    public final boolean getApproachMeasureRequired() {
        return this.approachMeasureRequired;
    }

    @Override // androidx.compose.ui.layout.MeasureScope
    public MeasureResult bZm(final int width, final int height, final Map alignmentLines, final Function1 rulers, final Function1 placementBlock) {
        if (!((width & (-16777216)) == 0 && ((-16777216) & height) == 0)) {
            InlineClassHelperKt.t("Size(" + width + " x " + height + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new MeasureResult(width, height, alignmentLines, rulers, placementBlock, this) { // from class: androidx.compose.ui.layout.ApproachMeasureScopeImpl$layout$1
            final /* synthetic */ ApproachMeasureScopeImpl J2;

            /* JADX INFO: renamed from: O, reason: collision with root package name */
            final /* synthetic */ Function1 f32208O;

            /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
            private final int width;

            /* JADX INFO: renamed from: nr, reason: from kotlin metadata */
            private final Function1 rulers;

            /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
            private final int height;

            /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
            private final Map alignmentLines;

            {
                this.f32208O = placementBlock;
                this.J2 = this;
                this.width = width;
                this.height = height;
                this.alignmentLines = alignmentLines;
                this.rulers = rulers;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            /* JADX INFO: renamed from: XQ, reason: from getter */
            public Function1 getRulers() {
                return this.rulers;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public void Z() {
                this.f32208O.invoke(this.J2.getCoordinator().getPlacementScope());
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getHeight() {
                return this.height;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            public int getWidth() {
                return this.width;
            }

            @Override // androidx.compose.ui.layout.MeasureResult
            /* JADX INFO: renamed from: o, reason: from getter */
            public Map getAlignmentLines() {
                return this.alignmentLines;
            }
        };
    }

    public final void e(ApproachLayoutModifierNode approachLayoutModifierNode) {
        this.approachNode = approachLayoutModifierNode;
    }

    public final void fD(boolean z2) {
        this.approachMeasureRequired = z2;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final ApproachLayoutModifierNode getApproachNode() {
        return this.approachNode;
    }

    @Override // androidx.compose.ui.layout.LookaheadScope
    public LayoutCoordinates o(Placeable.PlacementScope placementScope) {
        NodeCoordinator nodeCoordinatorE;
        LayoutNode lookaheadRoot = this.coordinator.getLayoutNode().getLookaheadRoot();
        if (lookaheadRoot == null) {
            InlineClassHelperKt.rl("Error: Requesting LookaheadScopeCoordinates is not permitted from outside of a LookaheadScope.");
            throw new KotlinNothingValueException();
        }
        if (!lookaheadRoot.getIsVirtualLookaheadRoot()) {
            return lookaheadRoot.n1();
        }
        LayoutNode layoutNodeMYa = lookaheadRoot.mYa();
        return (layoutNodeMYa == null || (nodeCoordinatorE = layoutNodeMYa.E()) == null) ? ((LayoutNode) lookaheadRoot.bzg().get(0)).n1() : nodeCoordinatorE;
    }

    @Override // androidx.compose.ui.layout.LookaheadScope
    public LayoutCoordinates r(LayoutCoordinates layoutCoordinates) {
        LookaheadLayoutCoordinates lookaheadLayoutCoordinates;
        if (layoutCoordinates instanceof LookaheadLayoutCoordinates) {
            return layoutCoordinates;
        }
        if (layoutCoordinates instanceof NodeCoordinator) {
            LookaheadDelegate lookaheadDelegate = ((NodeCoordinator) layoutCoordinates).getLookaheadDelegate();
            return (lookaheadDelegate == null || (lookaheadLayoutCoordinates = lookaheadDelegate.getLookaheadLayoutCoordinates()) == null) ? layoutCoordinates : lookaheadLayoutCoordinates;
        }
        InlineClassHelperKt.rl("Unsupported LayoutCoordinates");
        throw new KotlinNothingValueException();
    }

    /* JADX INFO: renamed from: te, reason: from getter */
    public final LayoutModifierNodeCoordinator getCoordinator() {
        return this.coordinator;
    }

    public ApproachMeasureScopeImpl(LayoutModifierNodeCoordinator layoutModifierNodeCoordinator, ApproachLayoutModifierNode approachLayoutModifierNode) {
        this.coordinator = layoutModifierNodeCoordinator;
        this.approachNode = approachLayoutModifierNode;
    }
}
