package androidx.compose.animation;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.GraphicsLayerScope;
import androidx.compose.ui.graphics.TransformOriginKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.ScaleFactor;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ&\u0010\u0010\u001a\u00020\u000f*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0016\u001a\u00020\u0014*\u00020\u00122\u0006\u0010\f\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0018\u001a\u00020\u0014*\u00020\u00122\u0006\u0010\f\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0017J#\u0010\u001a\u001a\u00020\u0014*\u00020\u00122\u0006\u0010\f\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001a\u0010\u0017J#\u0010\u001b\u001a\u00020\u0014*\u00020\u00122\u0006\u0010\f\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001b\u0010\u0017R/\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u00038F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R7\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\"\u0010\u001d\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001e\u0010)\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b'\u0010(R\u001c\u0010,\u001a\u00020*8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0016\u0010+\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006-"}, d2 = {"Landroidx/compose/animation/SkipToLookaheadNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/animation/ScaleToBoundsImpl;", "scaleToBounds", "Lkotlin/Function0;", "", "isEnabled", "<init>", "(Landroidx/compose/animation/ScaleToBoundsImpl;Lkotlin/jvm/functions/Function0;)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "nr", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "height", "U", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I", "v", "width", "r", "nHg", "<set-?>", "Landroidx/compose/runtime/MutableState;", "W5k", "()Landroidx/compose/animation/ScaleToBoundsImpl;", "poH", "(Landroidx/compose/animation/ScaleToBoundsImpl;)V", "Xw", "NC9", "()Lkotlin/jvm/functions/Function0;", "ex", "(Lkotlin/jvm/functions/Function0;)V", "jB", "Landroidx/compose/ui/unit/Constraints;", "lookaheadConstraints", "Landroidx/compose/ui/unit/IntSize;", "J", "lookaheadSize", "animation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSkipToLookaheadNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SkipToLookaheadNode.kt\nandroidx/compose/animation/SkipToLookaheadNode\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n1#1,179:1\n85#2:180\n113#2,2:181\n85#2:183\n113#2,2:184\n30#3:186\n80#4:187\n85#4:189\n90#4:191\n85#4:193\n85#4:195\n90#4:197\n90#4:199\n54#5:188\n59#5:190\n54#5:192\n54#5:194\n59#5:196\n59#5:198\n*S KotlinDebug\n*F\n+ 1 SkipToLookaheadNode.kt\nandroidx/compose/animation/SkipToLookaheadNode\n*L\n44#1:180\n44#1:181,2\n45#1:183\n45#1:184,2\n58#1:186\n58#1:187\n60#1:189\n60#1:191\n100#1:193\n113#1:195\n126#1:197\n139#1:199\n60#1:188\n60#1:190\n100#1:192\n113#1:194\n126#1:196\n139#1:198\n*E\n"})
public final class SkipToLookaheadNode extends Modifier.Node implements LayoutModifierNode {

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private long lookaheadSize = AnimationModifierKt.n();

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private final MutableState isEnabled;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private Constraints lookaheadConstraints;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final MutableState scaleToBounds;

    public final Function0 NC9() {
        return (Function0) this.isEnabled.getValue();
    }

    public final ScaleToBoundsImpl W5k() {
        return (ScaleToBoundsImpl) this.scaleToBounds.getValue();
    }

    public final void ex(Function0 function0) {
        this.isEnabled.setValue(function0);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public MeasureResult nr(final MeasureScope measureScope, Measurable measurable, long j2) {
        if (measureScope.Org()) {
            this.lookaheadConstraints = Constraints.n(j2);
        }
        Constraints constraints = this.lookaheadConstraints;
        Intrinsics.checkNotNull(constraints);
        final Placeable placeableDR0 = measurable.dR0(constraints.getValue());
        long jT2 = IntSize.t((((long) placeableDR0.getWidth()) << 32) | (((long) placeableDR0.getHeight()) & 4294967295L));
        this.lookaheadSize = jT2;
        final long jNr = ConstraintsKt.nr(j2, jT2);
        return MeasureScope.ER(measureScope, (int) (jNr >> 32), (int) (jNr & 4294967295L), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.animation.SkipToLookaheadNode$measure$1
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
                final long jN;
                ScaleToBoundsImpl scaleToBoundsImplW5k = this.f15384n.W5k();
                if (!((Boolean) this.f15384n.NC9().invoke()).booleanValue() || scaleToBoundsImplW5k == null) {
                    Placeable.PlacementScope.xMQ(placementScope, placeableDR0, 0, 0, 0.0f, 4, null);
                    return;
                }
                ContentScale contentScale = scaleToBoundsImplW5k.getContentScale();
                if (((int) (this.f15384n.lookaheadSize >> 32)) == 0 || ((int) (this.f15384n.lookaheadSize & 4294967295L)) == 0) {
                    jN = ScaleFactor.n((((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L));
                } else {
                    jN = contentScale.n(IntSizeKt.O(this.f15384n.lookaheadSize), IntSizeKt.O(jNr));
                }
                long jN2 = scaleToBoundsImplW5k.getAlignment().n(IntSize.t((((long) MathKt.roundToInt(((int) (this.f15384n.lookaheadSize & 4294967295L)) * Float.intBitsToFloat((int) (jN & 4294967295L)))) & 4294967295L) | (((long) MathKt.roundToInt(((int) (this.f15384n.lookaheadSize >> 32)) * Float.intBitsToFloat((int) (jN >> 32)))) << 32)), jNr, measureScope.getLayoutDirection());
                Placeable.PlacementScope.WPU(placementScope, placeableDR0, IntOffset.gh(jN2), IntOffset.qie(jN2), 0.0f, new Function1<GraphicsLayerScope, Unit>() { // from class: androidx.compose.animation.SkipToLookaheadNode$measure$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(GraphicsLayerScope graphicsLayerScope) {
                        n(graphicsLayerScope);
                        return Unit.INSTANCE;
                    }

                    public final void n(GraphicsLayerScope graphicsLayerScope) {
                        graphicsLayerScope.Uo(Float.intBitsToFloat((int) (jN >> 32)));
                        graphicsLayerScope.az(Float.intBitsToFloat((int) (jN & 4294967295L)));
                        graphicsLayerScope.tUK(TransformOriginKt.n(0.0f, 0.0f));
                    }
                }, 4, null);
            }
        }, 4, null);
    }

    public final void poH(ScaleToBoundsImpl scaleToBoundsImpl) {
        this.scaleToBounds.setValue(scaleToBoundsImpl);
    }

    public SkipToLookaheadNode(ScaleToBoundsImpl scaleToBoundsImpl, Function0 function0) {
        this.scaleToBounds = SnapshotStateKt__SnapshotStateKt.O(scaleToBoundsImpl, null, 2, null);
        this.isEnabled = SnapshotStateKt__SnapshotStateKt.O(function0, null, 2, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int U(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        if (!intrinsicMeasureScope.Org() && AnimationModifierKt.rl(this.lookaheadSize)) {
            return (int) (this.lookaheadSize >> 32);
        }
        return intrinsicMeasurable.Nxk(i2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int nHg(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        if (!intrinsicMeasureScope.Org() && AnimationModifierKt.rl(this.lookaheadSize)) {
            return (int) (this.lookaheadSize & 4294967295L);
        }
        return intrinsicMeasurable.FX(i2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int r(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        if (!intrinsicMeasureScope.Org() && AnimationModifierKt.rl(this.lookaheadSize)) {
            return (int) (this.lookaheadSize & 4294967295L);
        }
        return intrinsicMeasurable.g(i2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int v(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        if (!intrinsicMeasureScope.Org() && AnimationModifierKt.rl(this.lookaheadSize)) {
            return (int) (this.lookaheadSize >> 32);
        }
        return intrinsicMeasurable.GR(i2);
    }
}
