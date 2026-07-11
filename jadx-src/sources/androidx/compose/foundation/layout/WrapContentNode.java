package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.ConstraintsKt;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\u0004\b\f\u0010\rJ&\u0010\u0014\u001a\u00020\u0013*\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R4\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006("}, d2 = {"Landroidx/compose/foundation/layout/WrapContentNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/foundation/layout/Direction;", "direction", "", "unbounded", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/IntSize;", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/unit/IntOffset;", "alignmentCallback", "<init>", "(Landroidx/compose/foundation/layout/Direction;ZLkotlin/jvm/functions/Function2;)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "nr", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "v", "Landroidx/compose/foundation/layout/Direction;", "getDirection", "()Landroidx/compose/foundation/layout/Direction;", "NC9", "(Landroidx/compose/foundation/layout/Direction;)V", "Xw", "Z", "getUnbounded", "()Z", "ex", "(Z)V", "jB", "Lkotlin/jvm/functions/Function2;", "UR", "()Lkotlin/jvm/functions/Function2;", "W5k", "(Lkotlin/jvm/functions/Function2;)V", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class WrapContentNode extends Modifier.Node implements LayoutModifierNode {

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private boolean unbounded;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private Function2 alignmentCallback;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private Direction direction;

    public final void NC9(Direction direction) {
        this.direction = direction;
    }

    /* JADX INFO: renamed from: UR, reason: from getter */
    public final Function2 getAlignmentCallback() {
        return this.alignmentCallback;
    }

    public final void W5k(Function2 function2) {
        this.alignmentCallback = function2;
    }

    public final void ex(boolean z2) {
        this.unbounded = z2;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public MeasureResult nr(final MeasureScope measureScope, Measurable measurable, long j2) {
        Direction direction = this.direction;
        Direction direction2 = Direction.f17538n;
        int iTy = direction != direction2 ? 0 : Constraints.ty(j2);
        Direction direction3 = this.direction;
        Direction direction4 = Direction.f17540t;
        final Placeable placeableDR0 = measurable.dR0(ConstraintsKt.n(iTy, (this.direction == direction2 || !this.unbounded) ? Constraints.qie(j2) : Integer.MAX_VALUE, direction3 == direction4 ? Constraints.az(j2) : 0, (this.direction == direction4 || !this.unbounded) ? Constraints.gh(j2) : Integer.MAX_VALUE));
        final int iCoerceIn = RangesKt.coerceIn(placeableDR0.getWidth(), Constraints.ty(j2), Constraints.qie(j2));
        final int iCoerceIn2 = RangesKt.coerceIn(placeableDR0.getHeight(), Constraints.az(j2), Constraints.gh(j2));
        return MeasureScope.ER(measureScope, iCoerceIn, iCoerceIn2, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.WrapContentNode$measure$1
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
                Function2 alignmentCallback = this.f17939n.getAlignmentCallback();
                int width = iCoerceIn - placeableDR0.getWidth();
                long j3 = ((long) width) << 32;
                Placeable.PlacementScope.gh(placementScope, placeableDR0, ((IntOffset) alignmentCallback.invoke(IntSize.rl(IntSize.t((((long) (iCoerceIn2 - placeableDR0.getHeight())) & 4294967295L) | j3)), measureScope.getLayoutDirection())).getPackedValue(), 0.0f, 2, null);
            }
        }, 4, null);
    }

    public WrapContentNode(Direction direction, boolean z2, Function2 function2) {
        this.direction = direction;
        this.unbounded = z2;
        this.alignmentCallback = function2;
    }
}
