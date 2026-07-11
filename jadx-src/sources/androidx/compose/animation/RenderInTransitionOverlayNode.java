package androidx.compose.animation;

import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.PrimitiveSnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.ClipOp;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawContext;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001:BA\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u001a\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0018\u0010\u0017R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR(\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R6\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R+\u0010\n\u001a\u00020\t2\u0006\u0010+\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001c\u00105\u001a\b\u0018\u000102R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0013\u00109\u001a\u0004\u0018\u0001068F¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006;"}, d2 = {"Landroidx/compose/animation/RenderInTransitionOverlayNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "Landroidx/compose/animation/SharedTransitionScopeImpl;", "sharedScope", "Lkotlin/Function0;", "", "renderInOverlay", "", "zIndexInOverlay", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/graphics/Path;", "clipInOverlay", "<init>", "(Landroidx/compose/animation/SharedTransitionScopeImpl;Lkotlin/jvm/functions/Function0;FLkotlin/jvm/functions/Function2;)V", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "", "N", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "c", "()V", "Sax", "v", "Landroidx/compose/animation/SharedTransitionScopeImpl;", "ex", "()Landroidx/compose/animation/SharedTransitionScopeImpl;", "ni", "(Landroidx/compose/animation/SharedTransitionScopeImpl;)V", "Xw", "Lkotlin/jvm/functions/Function0;", "NC9", "()Lkotlin/jvm/functions/Function0;", CmcdConfiguration.KEY_PLAYBACK_RATE, "(Lkotlin/jvm/functions/Function0;)V", "jB", "Lkotlin/jvm/functions/Function2;", "UR", "()Lkotlin/jvm/functions/Function2;", "W1c", "(Lkotlin/jvm/functions/Function2;)V", "<set-?>", "U", "Landroidx/compose/runtime/MutableFloatState;", "poH", "()F", "GT", "(F)V", "Landroidx/compose/animation/RenderInTransitionOverlayNode$LayerWithRenderer;", "P5", "Landroidx/compose/animation/RenderInTransitionOverlayNode$LayerWithRenderer;", "layerWithRenderer", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "W5k", "()Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "LayerWithRenderer", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRenderInTransitionOverlayNodeElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderInTransitionOverlayNodeElement.kt\nandroidx/compose/animation/RenderInTransitionOverlayNode\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,154:1\n79#2:155\n112#2,2:156\n1#3:158\n*S KotlinDebug\n*F\n+ 1 RenderInTransitionOverlayNodeElement.kt\nandroidx/compose/animation/RenderInTransitionOverlayNode\n*L\n94#1:155\n94#1:156,2\n*E\n"})
public final class RenderInTransitionOverlayNode extends Modifier.Node implements DrawModifierNode, ModifierLocalModifierNode {

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata */
    private LayerWithRenderer layerWithRenderer;

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private final MutableFloatState zIndexInOverlay;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private Function0 renderInOverlay;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private Function2 clipInOverlay;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private SharedTransitionScopeImpl sharedScope;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/compose/animation/RenderInTransitionOverlayNode$LayerWithRenderer;", "Landroidx/compose/animation/LayerRenderer;", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "layer", "<init>", "(Landroidx/compose/animation/RenderInTransitionOverlayNode;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "drawScope", "", "rl", "(Landroidx/compose/ui/graphics/drawscope/DrawScope;)V", c.f62177j, "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "t", "()Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "", "()F", "zIndex", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nRenderInTransitionOverlayNodeElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RenderInTransitionOverlayNodeElement.kt\nandroidx/compose/animation/RenderInTransitionOverlayNode$LayerWithRenderer\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n*L\n1#1,154:1\n71#2:155\n65#2:156\n73#2:159\n69#2:160\n60#3:157\n70#3:161\n22#4:158\n22#4:162\n221#5,5:163\n249#5,9:168\n120#5,7:177\n259#5,4:184\n120#5,7:188\n*S KotlinDebug\n*F\n+ 1 RenderInTransitionOverlayNodeElement.kt\nandroidx/compose/animation/RenderInTransitionOverlayNode$LayerWithRenderer\n*L\n110#1:155\n110#1:156\n109#1:159\n109#1:160\n110#1:157\n109#1:161\n110#1:158\n109#1:162\n116#1:163,5\n116#1:168,9\n116#1:177,7\n116#1:184,4\n118#1:188,7\n*E\n"})
    private final class LayerWithRenderer implements LayerRenderer {

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
        private final GraphicsLayer layer;

        public LayerWithRenderer(GraphicsLayer graphicsLayer) {
            this.layer = graphicsLayer;
        }

        @Override // androidx.compose.animation.LayerRenderer
        public float n() {
            return RenderInTransitionOverlayNode.this.poH();
        }

        @Override // androidx.compose.animation.LayerRenderer
        public void rl(DrawScope drawScope) {
            if (((Boolean) RenderInTransitionOverlayNode.this.getRenderInOverlay().invoke()).booleanValue()) {
                RenderInTransitionOverlayNode renderInTransitionOverlayNode = RenderInTransitionOverlayNode.this;
                long jNHg = renderInTransitionOverlayNode.getSharedScope().gh().nHg(DelegatableNodeKt.az(renderInTransitionOverlayNode), Offset.INSTANCE.t());
                float fIntBitsToFloat = Float.intBitsToFloat((int) (jNHg >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jNHg & 4294967295L));
                Path path = (Path) renderInTransitionOverlayNode.getClipInOverlay().invoke(drawScope.getLayoutDirection(), DelegatableNodeKt.gh(renderInTransitionOverlayNode));
                if (path == null) {
                    drawScope.getDrawContext().getTransform().nr(fIntBitsToFloat, fIntBitsToFloat2);
                    try {
                        GraphicsLayerKt.n(drawScope, this.layer);
                        return;
                    } finally {
                    }
                }
                int iRl = ClipOp.INSTANCE.rl();
                DrawContext drawContext = drawScope.getDrawContext();
                long jT2 = drawContext.t();
                drawContext.KN().O();
                try {
                    drawContext.getTransform().t(path, iRl);
                    drawScope.getDrawContext().getTransform().nr(fIntBitsToFloat, fIntBitsToFloat2);
                    try {
                        GraphicsLayerKt.n(drawScope, this.layer);
                    } finally {
                    }
                } finally {
                    drawContext.KN().n();
                    drawContext.xMQ(jT2);
                }
            }
        }

        /* JADX INFO: renamed from: t, reason: from getter */
        public final GraphicsLayer getLayer() {
            return this.layer;
        }
    }

    public final void GT(float f3) {
        this.zIndexInOverlay.Z(f3);
    }

    /* JADX INFO: renamed from: NC9, reason: from getter */
    public final Function0 getRenderInOverlay() {
        return this.renderInOverlay;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void Sax() {
        LayerWithRenderer layerWithRenderer = this.layerWithRenderer;
        if (layerWithRenderer != null) {
            this.sharedScope.Ik(layerWithRenderer);
            DelegatableNodeKt.qie(this).rl(layerWithRenderer.getLayer());
        }
    }

    /* JADX INFO: renamed from: UR, reason: from getter */
    public final Function2 getClipInOverlay() {
        return this.clipInOverlay;
    }

    public final void W1c(Function2 function2) {
        this.clipInOverlay = function2;
    }

    public final GraphicsLayer W5k() {
        LayerWithRenderer layerWithRenderer = this.layerWithRenderer;
        if (layerWithRenderer != null) {
            return layerWithRenderer.getLayer();
        }
        return null;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void c() {
        LayerWithRenderer layerWithRenderer = new LayerWithRenderer(DelegatableNodeKt.qie(this).n());
        this.sharedScope.ck(layerWithRenderer);
        this.layerWithRenderer = layerWithRenderer;
    }

    /* JADX INFO: renamed from: ex, reason: from getter */
    public final SharedTransitionScopeImpl getSharedScope() {
        return this.sharedScope;
    }

    public final void ni(SharedTransitionScopeImpl sharedTransitionScopeImpl) {
        this.sharedScope = sharedTransitionScopeImpl;
    }

    public final float poH() {
        return this.zIndexInOverlay.n();
    }

    public final void pr(Function0 function0) {
        this.renderInOverlay = function0;
    }

    public RenderInTransitionOverlayNode(SharedTransitionScopeImpl sharedTransitionScopeImpl, Function0 function0, float f3, Function2 function2) {
        this.sharedScope = sharedTransitionScopeImpl;
        this.renderInOverlay = function0;
        this.clipInOverlay = function2;
        this.zIndexInOverlay = PrimitiveSnapshotStateKt.n(f3);
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void N(final ContentDrawScope contentDrawScope) {
        GraphicsLayer graphicsLayerW5k = W5k();
        if (graphicsLayerW5k != null) {
            DrawScope.qva(contentDrawScope, graphicsLayerW5k, 0L, new Function1<DrawScope, Unit>() { // from class: androidx.compose.animation.RenderInTransitionOverlayNode$draw$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(DrawScope drawScope) {
                    n(drawScope);
                    return Unit.INSTANCE;
                }

                public final void n(DrawScope drawScope) {
                    contentDrawScope.l2();
                }
            }, 1, null);
            if (!((Boolean) this.renderInOverlay.invoke()).booleanValue()) {
                GraphicsLayerKt.n(contentDrawScope, graphicsLayerW5k);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Error: layer never initialized");
    }
}
