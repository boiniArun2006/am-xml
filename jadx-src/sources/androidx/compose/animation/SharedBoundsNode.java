package androidx.compose.animation;

import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.RectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.graphics.layer.GraphicsLayerKt;
import androidx.compose.ui.layout.ApproachLayoutModifierNode;
import androidx.compose.ui.layout.ApproachMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.modifier.ModifierLocalMap;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.modifier.ModifierLocalModifierNodeKt;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.DrawModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u0010\u001a\u00020\u000f*\u00020\f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\tH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0016J&\u0010\u001d\u001a\u00020\u000f*\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001fH\u0016ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J&\u0010%\u001a\u00020\u000f*\u00020$2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016ø\u0001\u0000¢\u0006\u0004\b%\u0010&J\u0013\u0010(\u001a\u00020\u0012*\u00020'H\u0016¢\u0006\u0004\b(\u0010)R*\u0010\u0006\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u00058\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u0010\bR(\u00105\u001a\u0004\u0018\u0001002\b\u0010*\u001a\u0004\u0018\u0001008\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b1\u00102\"\u0004\b3\u00104R\u001a\u0010;\u001a\u0002068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0014\u0010=\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b<\u0010\u000bR\u0014\u0010?\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010\u000bR\u0014\u0010C\u001a\u00020@8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0014\u0010G\u001a\u00020D8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bE\u0010F\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006H"}, d2 = {"Landroidx/compose/animation/SharedBoundsNode;", "Landroidx/compose/ui/layout/ApproachLayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/DrawModifierNode;", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "Landroidx/compose/animation/SharedElementInternalState;", "state", "<init>", "(Landroidx/compose/animation/SharedElementInternalState;)V", "Landroidx/compose/ui/layout/LayoutCoordinates;", "ZwA", "()Landroidx/compose/ui/layout/LayoutCoordinates;", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Placeable;", "placeable", "Landroidx/compose/ui/layout/MeasureResult;", CmcdConfiguration.KEY_PLAYBACK_RATE, "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Placeable;)Landroidx/compose/ui/layout/MeasureResult;", "", "eOa", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "c", "()V", "Sax", "kQ", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "nr", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/unit/IntSize;", "lookaheadSize", "", "Qu", "(J)Z", "Landroidx/compose/ui/layout/ApproachMeasureScope;", "Bu", "(Landroidx/compose/ui/layout/ApproachMeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;", "N", "(Landroidx/compose/ui/graphics/drawscope/ContentDrawScope;)V", "value", "v", "Landroidx/compose/animation/SharedElementInternalState;", "WKb", "()Landroidx/compose/animation/SharedElementInternalState;", "kC", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "Xw", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "jE", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "layer", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "jB", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "Rl", "()Landroidx/compose/ui/modifier/ModifierLocalMap;", "providedValues", "GT", "rootCoords", "Vd", "rootLookaheadCoords", "Landroidx/compose/animation/BoundsAnimation;", "ni", "()Landroidx/compose/animation/BoundsAnimation;", "boundsAnimation", "Landroidx/compose/animation/SharedElement;", "b", "()Landroidx/compose/animation/SharedElement;", "sharedElement", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSharedContentNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedContentNode.kt\nandroidx/compose/animation/SharedBoundsNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 6 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n1#1,276:1\n1#2:277\n33#3:278\n33#3:300\n53#4,3:279\n80#4:283\n85#4:286\n90#4:289\n85#4:292\n90#4:295\n85#4:297\n90#4:299\n53#4,3:301\n30#5:282\n61#6:284\n54#6:285\n63#6:287\n59#6:288\n61#6:290\n54#6:291\n63#6:293\n59#6:294\n54#6:296\n59#6:298\n*S KotlinDebug\n*F\n+ 1 SharedContentNode.kt\nandroidx/compose/animation/SharedBoundsNode\n*L\n146#1:278\n241#1:300\n146#1:279,3\n175#1:283\n173#1:286\n172#1:289\n224#1:292\n224#1:295\n241#1:297\n241#1:299\n241#1:301,3\n175#1:282\n173#1:284\n173#1:285\n172#1:287\n172#1:288\n224#1:290\n224#1:291\n224#1:293\n224#1:294\n241#1:296\n241#1:298\n*E\n"})
public final class SharedBoundsNode extends Modifier.Node implements ApproachLayoutModifierNode, DrawModifierNode, ModifierLocalModifierNode {

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private GraphicsLayer layer;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private final ModifierLocalMap providedValues;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private SharedElementInternalState state;

    /* JADX INFO: Access modifiers changed from: private */
    public final LayoutCoordinates ZwA() {
        return this.state.ck().getScope().r(DelegatableNodeKt.az(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedElement b() {
        return this.state.ck();
    }

    private final void jE(GraphicsLayer graphicsLayer) {
        if (graphicsLayer == null) {
            GraphicsLayer graphicsLayer2 = this.layer;
            if (graphicsLayer2 != null) {
                DelegatableNodeKt.qie(this).rl(graphicsLayer2);
            }
        } else {
            this.state.aYN(graphicsLayer);
        }
        this.layer = graphicsLayer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BoundsAnimation ni() {
        return this.state.Uo();
    }

    @Override // androidx.compose.ui.node.DrawModifierNode
    public void N(final ContentDrawScope contentDrawScope) {
        this.state.WPU(true);
        SharedElementInternalState sharedElementInternalState = this.state;
        SharedTransitionScope.OverlayClip overlayClipGh = sharedElementInternalState.gh();
        SharedTransitionScope.SharedContentState sharedContentStateZ = this.state.Z();
        Rect rectT = b().t();
        Intrinsics.checkNotNull(rectT);
        sharedElementInternalState.S(overlayClipGh.n(sharedContentStateZ, rectT, contentDrawScope.getLayoutDirection(), DelegatableNodeKt.gh(this)));
        GraphicsLayer graphicsLayerXMQ = this.state.xMQ();
        if (graphicsLayerXMQ != null) {
            DrawScope.qva(contentDrawScope, graphicsLayerXMQ, 0L, new Function1<DrawScope, Unit>() { // from class: androidx.compose.animation.SharedBoundsNode$draw$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
            if (this.state.o()) {
                GraphicsLayerKt.n(contentDrawScope, graphicsLayerXMQ);
                return;
            }
            return;
        }
        throw new IllegalArgumentException(("Error: Layer is null when accessed for shared bounds/element : " + b().getKey() + ",target: " + this.state.Uo().J2() + ", is attached: " + getIsAttached()).toString());
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    /* JADX INFO: renamed from: Rl, reason: from getter */
    public ModifierLocalMap getProvidedValues() {
        return this.providedValues;
    }

    /* JADX INFO: renamed from: WKb, reason: from getter */
    public final SharedElementInternalState getState() {
        return this.state;
    }

    public final void kC(SharedElementInternalState sharedElementInternalState) {
        if (Intrinsics.areEqual(sharedElementInternalState, this.state)) {
            return;
        }
        this.state = sharedElementInternalState;
        if (getIsAttached()) {
            Th(SharedContentNodeKt.n(), sharedElementInternalState);
            this.state.g((SharedElementInternalState) aYN(SharedContentNodeKt.n()));
            this.state.aYN(this.layer);
            this.state.ViF(new Function0<LayoutCoordinates>() { // from class: androidx.compose.animation.SharedBoundsNode$state$1
                {
                    super(0);
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
                public final LayoutCoordinates invoke() {
                    return this.f15281n.ZwA();
                }
            });
        }
    }

    public SharedBoundsNode(SharedElementInternalState sharedElementInternalState) {
        this.state = sharedElementInternalState;
        this.layer = sharedElementInternalState.xMQ();
        this.providedValues = ModifierLocalModifierNodeKt.rl(TuplesKt.to(SharedContentNodeKt.n(), sharedElementInternalState));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LayoutCoordinates GT() {
        return b().getScope().gh();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LayoutCoordinates Vd() {
        return b().getScope().mUb();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void eOa(LayoutCoordinates layoutCoordinates) {
        b().ck(RectKt.t(GT().nHg(layoutCoordinates, Offset.INSTANCE.t()), Size.nr((((long) Float.floatToRawIntBits((int) (layoutCoordinates.n() >> 32))) << 32) | (((long) Float.floatToRawIntBits((int) (layoutCoordinates.n() & 4294967295L))) & 4294967295L))));
    }

    private final MeasureResult pr(MeasureScope measureScope, final Placeable placeable) {
        if (!b().nr()) {
            return MeasureScope.ER(measureScope, placeable.getWidth(), placeable.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.animation.SharedBoundsNode$approachPlace$1
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
                    LayoutCoordinates layoutCoordinatesNr = placementScope.nr();
                    if (layoutCoordinatesNr != null) {
                        this.f15270n.eOa(layoutCoordinatesNr);
                    }
                    Placeable.PlacementScope.xMQ(placementScope, placeable, 0, 0, 0.0f, 4, null);
                }
            }, 4, null);
        }
        long jN = this.state.az().n(ZwA().n(), IntSize.t((((long) placeable.getWidth()) << 32) | (((long) placeable.getHeight()) & 4294967295L)));
        return MeasureScope.ER(measureScope, (int) (jN >> 32), (int) (jN & 4294967295L), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.animation.SharedBoundsNode$approachPlace$2
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
                long jZ;
                LayoutCoordinates layoutCoordinatesNr;
                if (this.f15272n.b().KN() != null) {
                    BoundsAnimation boundsAnimationNi = this.f15272n.ni();
                    Rect rectT = this.f15272n.b().t();
                    Intrinsics.checkNotNull(rectT);
                    Rect rectKN = this.f15272n.b().KN();
                    Intrinsics.checkNotNull(rectKN);
                    boundsAnimationNi.n(rectT, rectKN);
                }
                Rect rectKN2 = this.f15272n.ni().KN();
                LayoutCoordinates layoutCoordinatesNr2 = placementScope.nr();
                Offset offsetNr = layoutCoordinatesNr2 != null ? Offset.nr(this.f15272n.GT().nHg(layoutCoordinatesNr2, Offset.INSTANCE.t())) : null;
                if (rectKN2 != null) {
                    if (this.f15272n.ni().J2()) {
                        this.f15272n.b().ck(rectKN2);
                    }
                    jZ = rectKN2.Z();
                } else {
                    if (this.f15272n.ni().J2() && (layoutCoordinatesNr = placementScope.nr()) != null) {
                        this.f15272n.eOa(layoutCoordinatesNr);
                    }
                    Rect rectT2 = this.f15272n.b().t();
                    Intrinsics.checkNotNull(rectT2);
                    jZ = rectT2.Z();
                }
                long jCk = offsetNr != null ? Offset.ck(jZ, offsetNr.getPackedValue()) : Offset.INSTANCE.t();
                Placeable.PlacementScope.xMQ(placementScope, placeable, Math.round(Float.intBitsToFloat((int) (jCk >> 32))), Math.round(Float.intBitsToFloat((int) (jCk & 4294967295L))), 0.0f, 4, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.layout.ApproachLayoutModifierNode
    public MeasureResult Bu(ApproachMeasureScope approachMeasureScope, Measurable measurable, long j2) {
        if (b().nr()) {
            Rect rectKN = ni().KN();
            if (rectKN == null) {
                rectKN = b().t();
            }
            if (rectKN != null) {
                long jT2 = IntSizeKt.t(rectKN.Ik());
                int i2 = (int) (jT2 >> 32);
                int i3 = (int) (jT2 & 4294967295L);
                if (i2 != Integer.MAX_VALUE && i3 != Integer.MAX_VALUE) {
                    j2 = Constraints.INSTANCE.t(RangesKt.coerceAtLeast(i2, 0), RangesKt.coerceAtLeast(i3, 0));
                } else {
                    throw new IllegalArgumentException(("Error: Infinite width/height is invalid. animated bounds: " + ni().KN() + ", current bounds: " + b().t()).toString());
                }
            }
        }
        return pr(approachMeasureScope, measurable.dR0(j2));
    }

    @Override // androidx.compose.ui.layout.ApproachLayoutModifierNode
    public boolean Qu(long lookaheadSize) {
        if (b().nr() && this.state.ck().getScope().J2()) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void Sax() {
        super.Sax();
        jE(null);
        this.state.g(null);
        this.state.ViF(new Function0() { // from class: androidx.compose.animation.SharedBoundsNode$onDetach$1
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Void invoke() {
                return null;
            }
        });
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void c() {
        super.c();
        Th(SharedContentNodeKt.n(), this.state);
        this.state.g((SharedElementInternalState) aYN(SharedContentNodeKt.n()));
        jE(DelegatableNodeKt.qie(this).n());
        this.state.ViF(new Function0<LayoutCoordinates>() { // from class: androidx.compose.animation.SharedBoundsNode$onAttach$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final LayoutCoordinates invoke() {
                return this.f15279n.ZwA();
            }
        });
    }

    @Override // androidx.compose.ui.Modifier.Node
    public void kQ() {
        super.kQ();
        GraphicsLayer graphicsLayer = this.layer;
        if (graphicsLayer != null) {
            DelegatableNodeKt.qie(this).rl(graphicsLayer);
        }
        jE(DelegatableNodeKt.qie(this).n());
    }

    @Override // androidx.compose.ui.layout.ApproachLayoutModifierNode, androidx.compose.ui.node.LayoutModifierNode
    public MeasureResult nr(MeasureScope measureScope, Measurable measurable, long j2) {
        final Placeable placeableDR0 = measurable.dR0(j2);
        float width = placeableDR0.getWidth();
        final long jNr = Size.nr((((long) Float.floatToRawIntBits(placeableDR0.getHeight())) & 4294967295L) | (Float.floatToRawIntBits(width) << 32));
        return MeasureScope.ER(measureScope, placeableDR0.getWidth(), placeableDR0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.animation.SharedBoundsNode$measure$1
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
                Offset offsetNr;
                LayoutCoordinates layoutCoordinatesNr = placementScope.nr();
                if (layoutCoordinatesNr != null) {
                    SharedBoundsNode sharedBoundsNode = this;
                    long j3 = jNr;
                    long jNHg = sharedBoundsNode.Vd().nHg(layoutCoordinatesNr, Offset.INSTANCE.t());
                    if (sharedBoundsNode.b().t() == null) {
                        sharedBoundsNode.b().ck(RectKt.t(jNHg, j3));
                    }
                    offsetNr = Offset.nr(jNHg);
                } else {
                    offsetNr = null;
                }
                Placeable.PlacementScope.xMQ(placementScope, placeableDR0, 0, 0, 0.0f, 4, null);
                if (offsetNr != null) {
                    SharedBoundsNode sharedBoundsNode2 = this;
                    sharedBoundsNode2.b().az(sharedBoundsNode2.getState(), jNr, offsetNr.getPackedValue());
                }
            }
        }, 4, null);
    }
}
