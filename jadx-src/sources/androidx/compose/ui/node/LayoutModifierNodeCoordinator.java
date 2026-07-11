package androidx.compose.ui.node;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.ApproachLayoutModifierNode;
import androidx.compose.ui.layout.ApproachMeasureScopeImpl;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 S2\u00020\u0001:\u0002TUB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u001a\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0014J*\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0014ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J=\u0010%\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0019\u0010$\u001a\u0015\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\b\u0018\u00010!¢\u0006\u0002\b#H\u0014ø\u0001\u0000¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020\u00112\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b)\u0010*J!\u0010.\u001a\u00020\b2\u0006\u0010,\u001a\u00020+2\b\u0010-\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b.\u0010/R*\u00107\u001a\u00020\u00042\u0006\u00100\u001a\u00020\u00048\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R*\u0010>\u001a\u0004\u0018\u00010\f8\u0000@\u0000X\u0080\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R.\u0010G\u001a\u0004\u0018\u00010?2\b\u0010@\u001a\u0004\u0018\u00010?8\u0016@TX\u0096\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR\u0018\u0010K\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010O\u001a\u00020L8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0011\u0010R\u001a\u00020\u00018F¢\u0006\u0006\u001a\u0004\bP\u0010Q\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006V"}, d2 = {"Landroidx/compose/ui/node/LayoutModifierNodeCoordinator;", "Landroidx/compose/ui/node/NodeCoordinator;", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "Landroidx/compose/ui/node/LayoutModifierNode;", "measureNode", "<init>", "(Landroidx/compose/ui/node/LayoutNode;Landroidx/compose/ui/node/LayoutModifierNode;)V", "", "taU", "()V", "TVk", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/Placeable;", "dR0", "(J)Landroidx/compose/ui/layout/Placeable;", "", "height", "GR", "(I)I", "Nxk", "width", "FX", "g", "Landroidx/compose/ui/unit/IntOffset;", "position", "", "zIndex", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "W", "(JFLandroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "layerBlock", "F", "(JFLkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "p0N", "(Landroidx/compose/ui/layout/AlignmentLine;)I", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "graphicsLayer", "Yq", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "value", "eWT", "Landroidx/compose/ui/node/LayoutModifierNode;", "Pzf", "()Landroidx/compose/ui/node/LayoutModifierNode;", "pt", "(Landroidx/compose/ui/node/LayoutModifierNode;)V", "layoutModifierNode", "ul", "Landroidx/compose/ui/unit/Constraints;", "NQ2", "()Landroidx/compose/ui/unit/Constraints;", "Rf", "(Landroidx/compose/ui/unit/Constraints;)V", "lookaheadConstraints", "Landroidx/compose/ui/node/LookaheadDelegate;", "<set-?>", "n1", "Landroidx/compose/ui/node/LookaheadDelegate;", "rR", "()Landroidx/compose/ui/node/LookaheadDelegate;", "vMk", "(Landroidx/compose/ui/node/LookaheadDelegate;)V", "lookaheadDelegate", "Landroidx/compose/ui/layout/ApproachMeasureScopeImpl;", "Jk", "Landroidx/compose/ui/layout/ApproachMeasureScopeImpl;", "approachMeasureScope", "Landroidx/compose/ui/Modifier$Node;", "JI", "()Landroidx/compose/ui/Modifier$Node;", "tail", "aJ", "()Landroidx/compose/ui/node/NodeCoordinator;", "wrappedNonNull", "Rl", "Companion", "LookaheadDelegateForLayoutModifierNode", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLayoutModifierNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutModifierNodeCoordinator.kt\nandroidx/compose/ui/node/LayoutModifierNodeCoordinator\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n+ 3 Modifier.kt\nandroidx/compose/ui/Modifier$Node\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n*L\n1#1,313:1\n115#2:314\n115#2:316\n246#3:315\n246#3:317\n1#4:318\n311#5,2:319\n*S KotlinDebug\n*F\n+ 1 LayoutModifierNodeCoordinator.kt\nandroidx/compose/ui/node/LayoutModifierNodeCoordinator\n*L\n77#1:314\n47#1:316\n77#1:315\n47#1:317\n157#1:319,2\n*E\n"})
public final class LayoutModifierNodeCoordinator extends NodeCoordinator {
    private static final Paint qm;

    /* JADX INFO: renamed from: Jk, reason: from kotlin metadata */
    private ApproachMeasureScopeImpl approachMeasureScope;

    /* JADX INFO: renamed from: eWT, reason: from kotlin metadata */
    private LayoutModifierNode layoutModifierNode;

    /* JADX INFO: renamed from: n1, reason: from kotlin metadata */
    private LookaheadDelegate lookaheadDelegate;

    /* JADX INFO: renamed from: ul, reason: from kotlin metadata */
    private Constraints lookaheadConstraints;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0010\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"Landroidx/compose/ui/node/LayoutModifierNodeCoordinator$LookaheadDelegateForLayoutModifierNode;", "Landroidx/compose/ui/node/LookaheadDelegate;", "<init>", "(Landroidx/compose/ui/node/LayoutModifierNodeCoordinator;)V", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/Placeable;", "dR0", "(J)Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "", "p0N", "(Landroidx/compose/ui/layout/AlignmentLine;)I", "height", "GR", "(I)I", "Nxk", "width", "FX", "g", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nLayoutModifierNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LayoutModifierNodeCoordinator.kt\nandroidx/compose/ui/node/LayoutModifierNodeCoordinator$LookaheadDelegateForLayoutModifierNode\n+ 2 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegate\n*L\n1#1,313:1\n480#2,3:314\n*S KotlinDebug\n*F\n+ 1 LayoutModifierNodeCoordinator.kt\nandroidx/compose/ui/node/LayoutModifierNodeCoordinator$LookaheadDelegateForLayoutModifierNode\n*L\n90#1:314,3\n*E\n"})
    private final class LookaheadDelegateForLayoutModifierNode extends LookaheadDelegate {
        public LookaheadDelegateForLayoutModifierNode() {
            super(LayoutModifierNodeCoordinator.this);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int FX(int width) {
            LayoutModifierNode layoutModifierNode = LayoutModifierNodeCoordinator.this.getLayoutModifierNode();
            LookaheadDelegate lookaheadDelegate = LayoutModifierNodeCoordinator.this.aJ().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            return layoutModifierNode.nHg(this, lookaheadDelegate, width);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int GR(int height) {
            LayoutModifierNode layoutModifierNode = LayoutModifierNodeCoordinator.this.getLayoutModifierNode();
            LookaheadDelegate lookaheadDelegate = LayoutModifierNodeCoordinator.this.aJ().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            return layoutModifierNode.v(this, lookaheadDelegate, height);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int Nxk(int height) {
            LayoutModifierNode layoutModifierNode = LayoutModifierNodeCoordinator.this.getLayoutModifierNode();
            LookaheadDelegate lookaheadDelegate = LayoutModifierNodeCoordinator.this.aJ().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            return layoutModifierNode.U(this, lookaheadDelegate, height);
        }

        @Override // androidx.compose.ui.layout.Measurable
        public Placeable dR0(long constraints) {
            LayoutModifierNodeCoordinator layoutModifierNodeCoordinator = LayoutModifierNodeCoordinator.this;
            VwL(constraints);
            layoutModifierNodeCoordinator.Rf(Constraints.n(constraints));
            LayoutModifierNode layoutModifierNode = layoutModifierNodeCoordinator.getLayoutModifierNode();
            LookaheadDelegate lookaheadDelegate = layoutModifierNodeCoordinator.aJ().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            w(layoutModifierNode.nr(this, lookaheadDelegate, constraints));
            return this;
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int g(int width) {
            LayoutModifierNode layoutModifierNode = LayoutModifierNodeCoordinator.this.getLayoutModifierNode();
            LookaheadDelegate lookaheadDelegate = LayoutModifierNodeCoordinator.this.aJ().getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            return layoutModifierNode.r(this, lookaheadDelegate, width);
        }

        @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
        public int p0N(AlignmentLine alignmentLine) {
            int iRl = LayoutModifierNodeCoordinatorKt.rl(this, alignmentLine);
            getCachedAlignmentLinesMap().XQ(alignmentLine, iRl);
            return iRl;
        }
    }

    static {
        Paint paintN = AndroidPaint_androidKt.n();
        paintN.WPU(Color.INSTANCE.rl());
        paintN.T(1.0f);
        paintN.X(PaintingStyle.INSTANCE.rl());
        qm = paintN;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int FX(int width) {
        ApproachMeasureScopeImpl approachMeasureScopeImpl = this.approachMeasureScope;
        return approachMeasureScopeImpl != null ? approachMeasureScopeImpl.getApproachNode().waP(approachMeasureScopeImpl, aJ(), width) : this.layoutModifierNode.nHg(this, aJ(), width);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int GR(int height) {
        ApproachMeasureScopeImpl approachMeasureScopeImpl = this.approachMeasureScope;
        return approachMeasureScopeImpl != null ? approachMeasureScopeImpl.getApproachNode().QZ6(approachMeasureScopeImpl, aJ(), height) : this.layoutModifierNode.v(this, aJ(), height);
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public Modifier.Node JI() {
        return this.layoutModifierNode.getNode();
    }

    /* JADX INFO: renamed from: NQ2, reason: from getter */
    public final Constraints getLookaheadConstraints() {
        return this.lookaheadConstraints;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int Nxk(int height) {
        ApproachMeasureScopeImpl approachMeasureScopeImpl = this.approachMeasureScope;
        return approachMeasureScopeImpl != null ? approachMeasureScopeImpl.getApproachNode().Aum(approachMeasureScopeImpl, aJ(), height) : this.layoutModifierNode.U(this, aJ(), height);
    }

    /* JADX INFO: renamed from: Pzf, reason: from getter */
    public final LayoutModifierNode getLayoutModifierNode() {
        return this.layoutModifierNode;
    }

    public final void Rf(Constraints constraints) {
        this.lookaheadConstraints = constraints;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int g(int width) {
        ApproachMeasureScopeImpl approachMeasureScopeImpl = this.approachMeasureScope;
        return approachMeasureScopeImpl != null ? approachMeasureScopeImpl.getApproachNode().Mh(approachMeasureScopeImpl, aJ(), width) : this.layoutModifierNode.r(this, aJ(), width);
    }

    public final void pt(LayoutModifierNode layoutModifierNode) {
        if (!Intrinsics.areEqual(layoutModifierNode, this.layoutModifierNode)) {
            Modifier.Node node = layoutModifierNode.getNode();
            if ((node.getKindSet() & NodeKind.n(512)) != 0) {
                Intrinsics.checkNotNull(layoutModifierNode, "null cannot be cast to non-null type androidx.compose.ui.layout.ApproachLayoutModifierNode");
                ApproachLayoutModifierNode approachLayoutModifierNode = (ApproachLayoutModifierNode) layoutModifierNode;
                ApproachMeasureScopeImpl approachMeasureScopeImpl = this.approachMeasureScope;
                if (approachMeasureScopeImpl != null) {
                    approachMeasureScopeImpl.e(approachLayoutModifierNode);
                } else {
                    approachMeasureScopeImpl = new ApproachMeasureScopeImpl(this, approachLayoutModifierNode);
                }
                this.approachMeasureScope = approachMeasureScopeImpl;
            } else {
                this.approachMeasureScope = null;
            }
        }
        this.layoutModifierNode = layoutModifierNode;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    /* JADX INFO: renamed from: rR, reason: from getter */
    public LookaheadDelegate getLookaheadDelegate() {
        return this.lookaheadDelegate;
    }

    protected void vMk(LookaheadDelegate lookaheadDelegate) {
        this.lookaheadDelegate = lookaheadDelegate;
    }

    public LayoutModifierNodeCoordinator(LayoutNode layoutNode, LayoutModifierNode layoutModifierNode) {
        LookaheadDelegateForLayoutModifierNode lookaheadDelegateForLayoutModifierNode;
        super(layoutNode);
        this.layoutModifierNode = layoutModifierNode;
        ApproachMeasureScopeImpl approachMeasureScopeImpl = null;
        if (layoutNode.getLookaheadRoot() != null) {
            lookaheadDelegateForLayoutModifierNode = new LookaheadDelegateForLayoutModifierNode();
        } else {
            lookaheadDelegateForLayoutModifierNode = null;
        }
        this.lookaheadDelegate = lookaheadDelegateForLayoutModifierNode;
        if ((layoutModifierNode.getNode().getKindSet() & NodeKind.n(512)) != 0) {
            Intrinsics.checkNotNull(layoutModifierNode, "null cannot be cast to non-null type androidx.compose.ui.layout.ApproachLayoutModifierNode");
            approachMeasureScopeImpl = new ApproachMeasureScopeImpl(this, (ApproachLayoutModifierNode) layoutModifierNode);
        }
        this.approachMeasureScope = approachMeasureScopeImpl;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void taU() {
        boolean z2;
        IntSize intSizeRl;
        if (getIsShallowPlacing()) {
            return;
        }
        eOa();
        ApproachMeasureScopeImpl approachMeasureScopeImpl = this.approachMeasureScope;
        if (approachMeasureScopeImpl != null) {
            ApproachLayoutModifierNode approachLayoutModifierNodeG = approachMeasureScopeImpl.getApproachNode();
            Placeable.PlacementScope placementScope = getPlacementScope();
            LookaheadDelegate lookaheadDelegate = getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            if (!approachLayoutModifierNodeG.t1J(placementScope, lookaheadDelegate.getLookaheadLayoutCoordinates()) && !approachMeasureScopeImpl.getApproachMeasureRequired()) {
                long jN = n();
                LookaheadDelegate lookaheadDelegate2 = getLookaheadDelegate();
                IntSize intSizeRl2 = null;
                if (lookaheadDelegate2 != null) {
                    intSizeRl = IntSize.rl(lookaheadDelegate2.d());
                } else {
                    intSizeRl = null;
                }
                if (IntSize.nr(jN, intSizeRl)) {
                    long jN2 = aJ().n();
                    LookaheadDelegate lookaheadDelegate3 = aJ().getLookaheadDelegate();
                    if (lookaheadDelegate3 != null) {
                        intSizeRl2 = IntSize.rl(lookaheadDelegate3.d());
                    }
                    if (IntSize.nr(jN2, intSizeRl2)) {
                        z2 = true;
                    }
                    aJ().H6M(z2);
                }
            } else {
                z2 = false;
                aJ().H6M(z2);
            }
        }
        uG().Z();
        aJ().H6M(false);
    }

    @Override // androidx.compose.ui.node.NodeCoordinator, androidx.compose.ui.layout.Placeable
    protected void F(long position, float zIndex, Function1 layerBlock) {
        super.F(position, zIndex, layerBlock);
        taU();
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public void TVk() {
        if (getLookaheadDelegate() == null) {
            vMk(new LookaheadDelegateForLayoutModifierNode());
        }
    }

    @Override // androidx.compose.ui.node.NodeCoordinator, androidx.compose.ui.layout.Placeable
    protected void W(long position, float zIndex, GraphicsLayer layer) {
        super.W(position, zIndex, layer);
        taU();
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public void Yq(Canvas canvas, GraphicsLayer graphicsLayer) {
        aJ().fq(canvas, graphicsLayer);
        if (LayoutNodeKt.rl(getLayoutNode()).getShowLayoutBounds()) {
            C7B(canvas, qm);
        }
    }

    public final NodeCoordinator aJ() {
        NodeCoordinator wrapped = getWrapped();
        Intrinsics.checkNotNull(wrapped);
        return wrapped;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    @Override // androidx.compose.ui.layout.Measurable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Placeable dR0(long constraints) {
        final MeasureResult measureResultNr;
        boolean z2;
        IntSize intSizeRl;
        if (getForceMeasureWithLookaheadConstraints()) {
            Constraints constraints2 = this.lookaheadConstraints;
            if (constraints2 != null) {
                constraints = constraints2.getValue();
            } else {
                throw new IllegalArgumentException("Lookahead constraints cannot be null in approach pass.");
            }
        }
        VwL(constraints);
        ApproachMeasureScopeImpl approachMeasureScopeImpl = this.approachMeasureScope;
        if (approachMeasureScopeImpl != null) {
            ApproachLayoutModifierNode approachLayoutModifierNodeG = approachMeasureScopeImpl.getApproachNode();
            boolean z3 = true;
            if (!approachLayoutModifierNodeG.Qu(approachMeasureScopeImpl.Uf()) && Constraints.O(constraints, getLookaheadConstraints())) {
                z2 = false;
            } else {
                z2 = true;
            }
            approachMeasureScopeImpl.fD(z2);
            if (!approachMeasureScopeImpl.getApproachMeasureRequired()) {
                aJ().Bha(true);
            }
            measureResultNr = approachLayoutModifierNodeG.Bu(approachMeasureScopeImpl, aJ(), constraints);
            aJ().Bha(false);
            int f32270n = measureResultNr.getWidth();
            LookaheadDelegate lookaheadDelegate = getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            if (f32270n == lookaheadDelegate.getWidth()) {
                int rl = measureResultNr.getHeight();
                LookaheadDelegate lookaheadDelegate2 = getLookaheadDelegate();
                Intrinsics.checkNotNull(lookaheadDelegate2);
                if (rl != lookaheadDelegate2.getHeight()) {
                    z3 = false;
                }
                if (!approachMeasureScopeImpl.getApproachMeasureRequired()) {
                    long jN = aJ().n();
                    LookaheadDelegate lookaheadDelegate3 = aJ().getLookaheadDelegate();
                    if (lookaheadDelegate3 != null) {
                        intSizeRl = IntSize.rl(lookaheadDelegate3.d());
                    } else {
                        intSizeRl = null;
                    }
                    if (IntSize.nr(jN, intSizeRl) && !z3) {
                        measureResultNr = new MeasureResult(this) { // from class: androidx.compose.ui.node.LayoutModifierNodeCoordinator$measure$1$1$1$1

                            /* JADX INFO: renamed from: rl, reason: from kotlin metadata */
                            private final int width;

                            /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
                            private final int height;

                            @Override // androidx.compose.ui.layout.MeasureResult
                            /* JADX INFO: renamed from: XQ */
                            public Function1 getNr() {
                                return this.f32426n.getNr();
                            }

                            @Override // androidx.compose.ui.layout.MeasureResult
                            public void Z() {
                                this.f32426n.Z();
                            }

                            @Override // androidx.compose.ui.layout.MeasureResult
                            /* JADX INFO: renamed from: o */
                            public Map getAlignmentLines() {
                                return this.f32426n.getAlignmentLines();
                            }

                            @Override // androidx.compose.ui.layout.MeasureResult
                            public int getHeight() {
                                return this.height;
                            }

                            @Override // androidx.compose.ui.layout.MeasureResult
                            public int getWidth() {
                                return this.width;
                            }

                            {
                                LookaheadDelegate lookaheadDelegate4 = this.getLookaheadDelegate();
                                Intrinsics.checkNotNull(lookaheadDelegate4);
                                this.width = lookaheadDelegate4.getWidth();
                                LookaheadDelegate lookaheadDelegate5 = this.getLookaheadDelegate();
                                Intrinsics.checkNotNull(lookaheadDelegate5);
                                this.height = lookaheadDelegate5.getHeight();
                            }
                        };
                    }
                }
            }
        } else {
            measureResultNr = getLayoutModifierNode().nr(this, aJ(), constraints);
        }
        YE(measureResultNr);
        kC();
        return this;
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public int p0N(AlignmentLine alignmentLine) {
        LookaheadDelegate lookaheadDelegate = getLookaheadDelegate();
        if (lookaheadDelegate == null) {
            return LayoutModifierNodeCoordinatorKt.rl(this, alignmentLine);
        }
        return lookaheadDelegate.tEO(alignmentLine);
    }
}
