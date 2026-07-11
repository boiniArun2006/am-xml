package androidx.compose.ui.node;

import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.AndroidPaint_androidKt;
import androidx.compose.ui.graphics.Canvas;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Paint;
import androidx.compose.ui.graphics.PaintingStyle;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.input.pointer.PointerType;
import androidx.compose.ui.layout.AlignmentLine;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 I2\u00020\u0001:\u0002JKB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u001a\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0012J*\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0014ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ=\u0010#\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0019\u0010\"\u001a\u0015\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001f¢\u0006\u0002\b!H\u0014ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u000f2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J!\u0010,\u001a\u00020\u00062\u0006\u0010*\u001a\u00020)2\b\u0010+\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b,\u0010-J:\u00108\u001a\u00020\u00062\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u0002042\u0006\u00107\u001a\u000206H\u0016ø\u0001\u0000¢\u0006\u0004\b8\u00109R\u001a\u0010?\u001a\u00020:8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R.\u0010H\u001a\u0004\u0018\u00010@2\b\u0010A\u001a\u0004\u0018\u00010@8\u0016@TX\u0096\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010G\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006L"}, d2 = {"Landroidx/compose/ui/node/InnerNodeCoordinator;", "Landroidx/compose/ui/node/NodeCoordinator;", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "<init>", "(Landroidx/compose/ui/node/LayoutNode;)V", "", "Pzf", "()V", "TVk", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/Placeable;", "dR0", "(J)Landroidx/compose/ui/layout/Placeable;", "", "height", "GR", "(I)I", "width", "FX", "Nxk", "g", "Landroidx/compose/ui/unit/IntOffset;", "position", "", "zIndex", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "W", "(JFLandroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "layerBlock", "F", "(JFLkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "p0N", "(Landroidx/compose/ui/layout/AlignmentLine;)I", "Landroidx/compose/ui/graphics/Canvas;", "canvas", "graphicsLayer", "Yq", "(Landroidx/compose/ui/graphics/Canvas;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;", "hitTestSource", "Landroidx/compose/ui/geometry/Offset;", "pointerPosition", "Landroidx/compose/ui/node/HitTestResult;", "hitTestResult", "Landroidx/compose/ui/input/pointer/PointerType;", "pointerType", "", "isInLayer", "NC9", "(Landroidx/compose/ui/node/NodeCoordinator$HitTestSource;JLandroidx/compose/ui/node/HitTestResult;IZ)V", "Landroidx/compose/ui/node/TailModifierNode;", "eWT", "Landroidx/compose/ui/node/TailModifierNode;", "DtL", "()Landroidx/compose/ui/node/TailModifierNode;", "tail", "Landroidx/compose/ui/node/LookaheadDelegate;", "<set-?>", "ul", "Landroidx/compose/ui/node/LookaheadDelegate;", "rR", "()Landroidx/compose/ui/node/LookaheadDelegate;", "NQ2", "(Landroidx/compose/ui/node/LookaheadDelegate;)V", "lookaheadDelegate", "n1", "Companion", "LookaheadDelegateImpl", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nInnerNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InnerNodeCoordinator.kt\nandroidx/compose/ui/node/InnerNodeCoordinator\n+ 2 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinator\n+ 3 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 7 HitTestResult.kt\nandroidx/compose/ui/node/HitTestResult\n*L\n1#1,250:1\n311#2,2:251\n207#3:253\n423#4,9:254\n423#4,9:264\n208#4,8:276\n1#5:263\n139#6:273\n241#7,2:274\n243#7,2:284\n*S KotlinDebug\n*F\n+ 1 InnerNodeCoordinator.kt\nandroidx/compose/ui/node/InnerNodeCoordinator\n*L\n120#1:251,2\n123#1:253\n123#1:254,9\n175#1:264,9\n213#1:276,8\n201#1:273\n209#1:274,2\n209#1:284,2\n*E\n"})
public final class InnerNodeCoordinator extends NodeCoordinator {
    private static final Paint Jk;

    /* JADX INFO: renamed from: eWT, reason: from kotlin metadata */
    private final TailModifierNode tail;

    /* JADX INFO: renamed from: ul, reason: from kotlin metadata */
    private LookaheadDelegate lookaheadDelegate;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0015\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0016\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0017\u0010\u0013\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/node/InnerNodeCoordinator$LookaheadDelegateImpl;", "Landroidx/compose/ui/node/LookaheadDelegate;", "<init>", "(Landroidx/compose/ui/node/InnerNodeCoordinator;)V", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/Placeable;", "dR0", "(J)Landroidx/compose/ui/layout/Placeable;", "Landroidx/compose/ui/layout/AlignmentLine;", "alignmentLine", "", "p0N", "(Landroidx/compose/ui/layout/AlignmentLine;)I", "", "rT", "()V", "height", "GR", "(I)I", "width", "FX", "Nxk", "g", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nInnerNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InnerNodeCoordinator.kt\nandroidx/compose/ui/node/InnerNodeCoordinator$LookaheadDelegateImpl\n+ 2 LookaheadDelegate.kt\nandroidx/compose/ui/node/LookaheadDelegate\n+ 3 LayoutNode.kt\nandroidx/compose/ui/node/LayoutNode\n+ 4 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,250:1\n480#2,2:251\n482#2:263\n207#3:253\n423#4,9:254\n1#5:264\n*S KotlinDebug\n*F\n+ 1 InnerNodeCoordinator.kt\nandroidx/compose/ui/node/InnerNodeCoordinator$LookaheadDelegateImpl\n*L\n74#1:251,2\n74#1:263\n77#1:253\n77#1:254,9\n*E\n"})
    private final class LookaheadDelegateImpl extends LookaheadDelegate {
        public LookaheadDelegateImpl() {
            super(InnerNodeCoordinator.this);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int FX(int width) {
            return getLayoutNode().xVH(width);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int GR(int height) {
            return getLayoutNode().EF(height);
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int Nxk(int height) {
            return getLayoutNode().X4T(height);
        }

        @Override // androidx.compose.ui.layout.Measurable
        public Placeable dR0(long constraints) {
            VwL(constraints);
            MutableVector mutableVectorHRu = getLayoutNode().hRu();
            Object[] objArr = mutableVectorHRu.content;
            int size = mutableVectorHRu.getSize();
            for (int i2 = 0; i2 < size; i2++) {
                LookaheadPassDelegate lookaheadPassDelegatePiY = ((LayoutNode) objArr[i2]).piY();
                Intrinsics.checkNotNull(lookaheadPassDelegatePiY);
                lookaheadPassDelegatePiY.eb(LayoutNode.UsageByParent.f32465O);
            }
            w(getLayoutNode().getMeasurePolicy().rl(this, getLayoutNode().v(), constraints));
            return this;
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate, androidx.compose.ui.layout.IntrinsicMeasurable
        public int g(int width) {
            return getLayoutNode().UF(width);
        }

        @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
        public int p0N(AlignmentLine alignmentLine) {
            int iIntValue;
            Integer num = (Integer) LPV().te().get(alignmentLine);
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = Integer.MIN_VALUE;
            }
            getCachedAlignmentLinesMap().XQ(alignmentLine, iIntValue);
            return iIntValue;
        }

        @Override // androidx.compose.ui.node.LookaheadDelegate
        protected void rT() {
            LookaheadPassDelegate lookaheadPassDelegatePiY = getLayoutNode().piY();
            Intrinsics.checkNotNull(lookaheadPassDelegatePiY);
            lookaheadPassDelegatePiY.lS();
        }
    }

    static {
        Paint paintN = AndroidPaint_androidKt.n();
        paintN.WPU(Color.INSTANCE.O());
        paintN.T(1.0f);
        paintN.X(PaintingStyle.INSTANCE.rl());
        Jk = paintN;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    /* JADX INFO: renamed from: DtL, reason: from getter and merged with bridge method [inline-methods] */
    public TailModifierNode JI() {
        return this.tail;
    }

    protected void NQ2(LookaheadDelegate lookaheadDelegate) {
        this.lookaheadDelegate = lookaheadDelegate;
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    /* JADX INFO: renamed from: rR, reason: from getter */
    public LookaheadDelegate getLookaheadDelegate() {
        return this.lookaheadDelegate;
    }

    public InnerNodeCoordinator(LayoutNode layoutNode) {
        LookaheadDelegateImpl lookaheadDelegateImpl;
        super(layoutNode);
        this.tail = new TailModifierNode();
        JI().Rc(this);
        if (layoutNode.getLookaheadRoot() != null) {
            lookaheadDelegateImpl = new LookaheadDelegateImpl();
        } else {
            lookaheadDelegateImpl = null;
        }
        this.lookaheadDelegate = lookaheadDelegateImpl;
    }

    private final void Pzf() {
        if (getIsShallowPlacing()) {
            return;
        }
        getLayoutNode().eTf().L();
    }

    @Override // androidx.compose.ui.node.NodeCoordinator, androidx.compose.ui.layout.Placeable
    protected void F(long position, float zIndex, Function1 layerBlock) {
        super.F(position, zIndex, layerBlock);
        Pzf();
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int FX(int width) {
        return getLayoutNode().Zmq(width);
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int GR(int height) {
        return getLayoutNode().JVN(height);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    @Override // androidx.compose.ui.node.NodeCoordinator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void NC9(NodeCoordinator.HitTestSource hitTestSource, long pointerPosition, HitTestResult hitTestResult, int pointerType, boolean isInLayer) {
        int i2;
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (hitTestSource.nr(getLayoutNode())) {
            if (eF0(pointerPosition)) {
                i2 = pointerType;
                z4 = isInLayer;
            } else {
                i2 = pointerType;
                if (!PointerType.KN(pointerType, PointerType.INSTANCE.nr()) || (Float.floatToRawIntBits(Xli(pointerPosition, MPw())) & Integer.MAX_VALUE) >= 2139095040) {
                }
                if (z2) {
                    int i3 = hitTestResult.hitDepth;
                    MutableVector mutableVectorEWS = getLayoutNode().EWS();
                    Object[] objArr = mutableVectorEWS.content;
                    int size = mutableVectorEWS.getSize() - 1;
                    while (size >= 0) {
                        LayoutNode layoutNode = (LayoutNode) objArr[size];
                        if (layoutNode.HI()) {
                            int i5 = i2;
                            z3 = z4;
                            hitTestSource.rl(layoutNode, pointerPosition, hitTestResult, i5, z3);
                            if (!hitTestResult.ty()) {
                                continue;
                            } else if (!layoutNode.n1().lvn()) {
                                break;
                            } else {
                                hitTestResult.t();
                            }
                        } else {
                            z3 = z4;
                        }
                        size--;
                        z4 = z3;
                        i2 = pointerType;
                    }
                    hitTestResult.hitDepth = i3;
                    return;
                }
                return;
            }
            z2 = true;
            if (z2) {
            }
        } else {
            i2 = pointerType;
        }
        z2 = false;
        z4 = isInLayer;
        if (z2) {
        }
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int Nxk(int height) {
        return getLayoutNode().HBN(height);
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public void TVk() {
        if (getLookaheadDelegate() == null) {
            NQ2(new LookaheadDelegateImpl());
        }
    }

    @Override // androidx.compose.ui.node.NodeCoordinator, androidx.compose.ui.layout.Placeable
    protected void W(long position, float zIndex, GraphicsLayer layer) {
        super.W(position, zIndex, layer);
        Pzf();
    }

    @Override // androidx.compose.ui.node.NodeCoordinator
    public void Yq(Canvas canvas, GraphicsLayer graphicsLayer) {
        Owner ownerRl = LayoutNodeKt.rl(getLayoutNode());
        MutableVector mutableVectorEWS = getLayoutNode().EWS();
        Object[] objArr = mutableVectorEWS.content;
        int size = mutableVectorEWS.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            LayoutNode layoutNode = (LayoutNode) objArr[i2];
            if (layoutNode.HI()) {
                layoutNode.T(canvas, graphicsLayer);
            }
        }
        if (ownerRl.getShowLayoutBounds()) {
            C7B(canvas, Jk);
        }
    }

    @Override // androidx.compose.ui.layout.Measurable
    public Placeable dR0(long constraints) {
        if (getForceMeasureWithLookaheadConstraints()) {
            LookaheadDelegate lookaheadDelegate = getLookaheadDelegate();
            Intrinsics.checkNotNull(lookaheadDelegate);
            constraints = lookaheadDelegate.wKY();
        }
        VwL(constraints);
        MutableVector mutableVectorHRu = getLayoutNode().hRu();
        Object[] objArr = mutableVectorHRu.content;
        int size = mutableVectorHRu.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            ((LayoutNode) objArr[i2]).eTf().fq(LayoutNode.UsageByParent.f32465O);
        }
        YE(getLayoutNode().getMeasurePolicy().rl(this, getLayoutNode().rV9(), constraints));
        kC();
        return this;
    }

    @Override // androidx.compose.ui.layout.IntrinsicMeasurable
    public int g(int width) {
        return getLayoutNode().Qu(width);
    }

    @Override // androidx.compose.ui.node.LookaheadCapablePlaceable
    public int p0N(AlignmentLine alignmentLine) {
        LookaheadDelegate lookaheadDelegate = getLookaheadDelegate();
        if (lookaheadDelegate != null) {
            return lookaheadDelegate.p0N(alignmentLine);
        }
        Integer num = (Integer) YiW().te().get(alignmentLine);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }
}
