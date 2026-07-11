package androidx.compose.ui.graphics;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.NodeKind;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\bA\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0093\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ&\u0010&\u001a\u00020%*\u00020 2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0016ø\u0001\u0000¢\u0006\u0004\b&\u0010'J\u000f\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010,\u001a\u0004\b2\u0010.\"\u0004\b3\u00100R\"\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010,\u001a\u0004\b5\u0010.\"\u0004\b6\u00100R\"\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010,\u001a\u0004\b8\u0010.\"\u0004\b9\u00100R\"\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u0010,\u001a\u0004\b;\u0010.\"\u0004\b<\u00100R\"\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010,\u001a\u0004\b=\u0010.\"\u0004\b>\u00100R\"\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u0010,\u001a\u0004\b?\u0010.\"\u0004\b@\u00100R\"\u0010\u000b\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010,\u001a\u0004\bA\u0010.\"\u0004\bB\u00100R\"\u0010\f\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010,\u001a\u0004\bD\u0010.\"\u0004\bE\u00100R\"\u0010\r\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010,\u001a\u0004\bG\u0010.\"\u0004\bH\u00100R(\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bI\u00102\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\"\u0010\u0013\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b2\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR$\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R(\u0010\u0017\u001a\u00020\u00168\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b_\u00102\u001a\u0004\b`\u0010K\"\u0004\ba\u0010MR(\u0010\u0018\u001a\u00020\u00168\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\bb\u00102\u001a\u0004\bc\u0010K\"\u0004\bd\u0010MR(\u0010\u001a\u001a\u00020\u00198\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\be\u0010b\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR'\u0010o\u001a\u0013\u0012\u0004\u0012\u00020k\u0012\u0004\u0012\u00020\u001d0j¢\u0006\u0002\bl8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR\u0014\u0010q\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bp\u0010V\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006r"}, d2 = {"Landroidx/compose/ui/graphics/SimpleGraphicsLayerModifier;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "", "scaleX", "scaleY", "alpha", "translationX", "translationY", "shadowElevation", "rotationX", "rotationY", "rotationZ", "cameraDistance", "Landroidx/compose/ui/graphics/TransformOrigin;", "transformOrigin", "Landroidx/compose/ui/graphics/Shape;", "shape", "", "clip", "Landroidx/compose/ui/graphics/RenderEffect;", "renderEffect", "Landroidx/compose/ui/graphics/Color;", "ambientShadowColor", "spotShadowColor", "Landroidx/compose/ui/graphics/CompositingStrategy;", "compositingStrategy", "<init>", "(FFFFFFFFFFJLandroidx/compose/ui/graphics/Shape;ZLandroidx/compose/ui/graphics/RenderEffect;JJILkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "Vd", "()V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "nr", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "", "toString", "()Ljava/lang/String;", "v", "F", "s7N", "()F", "Uo", "(F)V", "Xw", "J", "az", "jB", "W5k", "rl", "U", "p5", "ty", "P5", "M7", "O", CmcdConfiguration.KEY_PLAYBACK_RATE, "wTp", "eF", "mUb", "WPU", "gh", "E", "nY", "qie", "M", "E2", "xMQ", "FX", "K", "()J", "tUK", "(J)V", "B", "Landroidx/compose/ui/graphics/Shape;", "ni", "()Landroidx/compose/ui/graphics/Shape;", "pS", "(Landroidx/compose/ui/graphics/Shape;)V", "Z", "ex", "()Z", "X", "(Z)V", "D", "Landroidx/compose/ui/graphics/RenderEffect;", "W1c", "()Landroidx/compose/ui/graphics/RenderEffect;", "KN", "(Landroidx/compose/ui/graphics/RenderEffect;)V", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "NC9", "iF", "I", "GT", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "GR", "poH", "()I", "S", "(I)V", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/GraphicsLayerScope;", "Lkotlin/ExtensionFunctionType;", "Nxk", "Lkotlin/jvm/functions/Function1;", "layerBlock", "lRt", "shouldAutoInvalidate", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGraphicsLayerModifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GraphicsLayerModifier.kt\nandroidx/compose/ui/graphics/SimpleGraphicsLayerModifier\n+ 2 NodeKind.kt\nandroidx/compose/ui/node/Nodes\n*L\n1#1,668:1\n83#2:669\n*S KotlinDebug\n*F\n+ 1 GraphicsLayerModifier.kt\nandroidx/compose/ui/graphics/SimpleGraphicsLayerModifier\n*L\n633#1:669\n*E\n"})
final class SimpleGraphicsLayerModifier extends Modifier.Node implements LayoutModifierNode {

    /* JADX INFO: renamed from: B, reason: collision with root package name and from kotlin metadata and from toString */
    private Shape shape;

    /* JADX INFO: renamed from: D, reason: collision with root package name and from kotlin metadata and from toString */
    private RenderEffect renderEffect;

    /* JADX INFO: renamed from: E, reason: collision with root package name and from kotlin metadata and from toString */
    private float rotationZ;

    /* JADX INFO: renamed from: FX, reason: collision with root package name and from kotlin metadata and from toString */
    private long transformOrigin;

    /* JADX INFO: renamed from: GR, reason: collision with root package name and from kotlin metadata and from toString */
    private int compositingStrategy;

    /* JADX INFO: renamed from: I, reason: collision with root package name and from kotlin metadata and from toString */
    private long spotShadowColor;

    /* JADX INFO: renamed from: J, reason: collision with root package name and from kotlin metadata and from toString */
    private boolean clip;

    /* JADX INFO: renamed from: M, reason: collision with root package name and from kotlin metadata and from toString */
    private float cameraDistance;

    /* JADX INFO: renamed from: M7, reason: from kotlin metadata and from toString */
    private float shadowElevation;

    /* JADX INFO: renamed from: Nxk, reason: from kotlin metadata */
    private Function1 layerBlock;

    /* JADX INFO: renamed from: P5, reason: from kotlin metadata and from toString */
    private float translationY;

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata and from toString */
    private float translationX;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata and from toString */
    private float scaleY;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private long ambientShadowColor;

    /* JADX INFO: renamed from: eF, reason: from kotlin metadata and from toString */
    private float rotationY;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private float alpha;

    /* JADX INFO: renamed from: p5, reason: from kotlin metadata and from toString */
    private float rotationX;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
    private float scaleX;

    public /* synthetic */ SimpleGraphicsLayerModifier(float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, long j2, Shape shape, boolean z2, RenderEffect renderEffect, long j3, long j4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(f3, f4, f5, f6, f7, f8, f9, f10, f11, f12, j2, shape, z2, renderEffect, j3, j4, i2);
    }

    public final void Vd() {
        NodeCoordinator wrapped = DelegatableNodeKt.mUb(this, NodeKind.n(2)).getWrapped();
        if (wrapped != null) {
            wrapped.fwz(this.layerBlock, true);
        }
    }

    @Override // androidx.compose.ui.Modifier.Node
    /* JADX INFO: renamed from: lRt */
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    private SimpleGraphicsLayerModifier(float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, float f12, long j2, Shape shape, boolean z2, RenderEffect renderEffect, long j3, long j4, int i2) {
        this.scaleX = f3;
        this.scaleY = f4;
        this.alpha = f5;
        this.translationX = f6;
        this.translationY = f7;
        this.shadowElevation = f8;
        this.rotationX = f9;
        this.rotationY = f10;
        this.rotationZ = f11;
        this.cameraDistance = f12;
        this.transformOrigin = j2;
        this.shape = shape;
        this.clip = z2;
        this.renderEffect = renderEffect;
        this.ambientShadowColor = j3;
        this.spotShadowColor = j4;
        this.compositingStrategy = i2;
        this.layerBlock = new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.ui.graphics.SimpleGraphicsLayerModifier$layerBlock$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                n(graphicsLayerScope);
                return Unit.INSTANCE;
            }

            public final void n(GraphicsLayerScope graphicsLayerScope) {
                graphicsLayerScope.Uo(this.f31566n.getScaleX());
                graphicsLayerScope.az(this.f31566n.getScaleY());
                graphicsLayerScope.rl(this.f31566n.getAlpha());
                graphicsLayerScope.ty(this.f31566n.getTranslationX());
                graphicsLayerScope.O(this.f31566n.getTranslationY());
                graphicsLayerScope.wTp(this.f31566n.getShadowElevation());
                graphicsLayerScope.mUb(this.f31566n.getRotationX());
                graphicsLayerScope.gh(this.f31566n.getRotationY());
                graphicsLayerScope.qie(this.f31566n.getRotationZ());
                graphicsLayerScope.xMQ(this.f31566n.getCameraDistance());
                graphicsLayerScope.tUK(this.f31566n.getTransformOrigin());
                graphicsLayerScope.pS(this.f31566n.getShape());
                graphicsLayerScope.X(this.f31566n.getClip());
                graphicsLayerScope.KN(this.f31566n.getRenderEffect());
                graphicsLayerScope.iF(this.f31566n.getAmbientShadowColor());
                graphicsLayerScope.T(this.f31566n.getSpotShadowColor());
                graphicsLayerScope.S(this.f31566n.getCompositingStrategy());
            }
        };
    }

    /* JADX INFO: renamed from: E2, reason: from getter */
    public final float getCameraDistance() {
        return this.cameraDistance;
    }

    /* JADX INFO: renamed from: GT, reason: from getter */
    public final long getSpotShadowColor() {
        return this.spotShadowColor;
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public final float getScaleY() {
        return this.scaleY;
    }

    /* JADX INFO: renamed from: K, reason: from getter */
    public final long getTransformOrigin() {
        return this.transformOrigin;
    }

    public final void KN(RenderEffect renderEffect) {
        this.renderEffect = renderEffect;
    }

    /* JADX INFO: renamed from: M7, reason: from getter */
    public final float getTranslationY() {
        return this.translationY;
    }

    /* JADX INFO: renamed from: NC9, reason: from getter */
    public final long getAmbientShadowColor() {
        return this.ambientShadowColor;
    }

    public final void O(float f3) {
        this.translationY = f3;
    }

    public final void S(int i2) {
        this.compositingStrategy = i2;
    }

    public final void T(long j2) {
        this.spotShadowColor = j2;
    }

    public final void Uo(float f3) {
        this.scaleX = f3;
    }

    /* JADX INFO: renamed from: W1c, reason: from getter */
    public final RenderEffect getRenderEffect() {
        return this.renderEffect;
    }

    /* JADX INFO: renamed from: W5k, reason: from getter */
    public final float getAlpha() {
        return this.alpha;
    }

    /* JADX INFO: renamed from: WPU, reason: from getter */
    public final float getRotationY() {
        return this.rotationY;
    }

    public final void X(boolean z2) {
        this.clip = z2;
    }

    public final void az(float f3) {
        this.scaleY = f3;
    }

    /* JADX INFO: renamed from: eF, reason: from getter */
    public final float getRotationX() {
        return this.rotationX;
    }

    /* JADX INFO: renamed from: ex, reason: from getter */
    public final boolean getClip() {
        return this.clip;
    }

    public final void gh(float f3) {
        this.rotationY = f3;
    }

    public final void iF(long j2) {
        this.ambientShadowColor = j2;
    }

    public final void mUb(float f3) {
        this.rotationX = f3;
    }

    /* JADX INFO: renamed from: nY, reason: from getter */
    public final float getRotationZ() {
        return this.rotationZ;
    }

    /* JADX INFO: renamed from: ni, reason: from getter */
    public final Shape getShape() {
        return this.shape;
    }

    /* JADX INFO: renamed from: p5, reason: from getter */
    public final float getTranslationX() {
        return this.translationX;
    }

    public final void pS(Shape shape) {
        this.shape = shape;
    }

    /* JADX INFO: renamed from: poH, reason: from getter */
    public final int getCompositingStrategy() {
        return this.compositingStrategy;
    }

    /* JADX INFO: renamed from: pr, reason: from getter */
    public final float getShadowElevation() {
        return this.shadowElevation;
    }

    public final void qie(float f3) {
        this.rotationZ = f3;
    }

    public final void rl(float f3) {
        this.alpha = f3;
    }

    /* JADX INFO: renamed from: s7N, reason: from getter */
    public final float getScaleX() {
        return this.scaleX;
    }

    public final void tUK(long j2) {
        this.transformOrigin = j2;
    }

    public String toString() {
        return "SimpleGraphicsLayerModifier(scaleX=" + this.scaleX + ", scaleY=" + this.scaleY + ", alpha = " + this.alpha + ", translationX=" + this.translationX + ", translationY=" + this.translationY + ", shadowElevation=" + this.shadowElevation + ", rotationX=" + this.rotationX + ", rotationY=" + this.rotationY + ", rotationZ=" + this.rotationZ + ", cameraDistance=" + this.cameraDistance + ", transformOrigin=" + ((Object) TransformOrigin.xMQ(this.transformOrigin)) + ", shape=" + this.shape + ", clip=" + this.clip + ", renderEffect=" + this.renderEffect + ", ambientShadowColor=" + ((Object) Color.S(this.ambientShadowColor)) + ", spotShadowColor=" + ((Object) Color.S(this.spotShadowColor)) + ", compositingStrategy=" + ((Object) CompositingStrategy.KN(this.compositingStrategy)) + ')';
    }

    public final void ty(float f3) {
        this.translationX = f3;
    }

    public final void wTp(float f3) {
        this.shadowElevation = f3;
    }

    public final void xMQ(float f3) {
        this.cameraDistance = f3;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public MeasureResult nr(MeasureScope measureScope, Measurable measurable, long j2) {
        final Placeable placeableDR0 = measurable.dR0(j2);
        return MeasureScope.ER(measureScope, placeableDR0.getWidth(), placeableDR0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.ui.graphics.SimpleGraphicsLayerModifier$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                n(placementScope);
                return Unit.INSTANCE;
            }

            public final void n(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.WPU(placementScope, placeableDR0, 0, 0, 0.0f, this.layerBlock, 4, null);
            }
        }, 4, null);
    }
}
