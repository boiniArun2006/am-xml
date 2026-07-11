package androidx.compose.foundation;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.SemanticsModifierNode;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.ui.unit.Constraints;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.ranges.RangesKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ&\u0010\u0011\u001a\u00020\u0010*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0017\u001a\u00020\u0015*\u00020\u00132\u0006\u0010\r\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001a\u001a\u00020\u0015*\u00020\u00132\u0006\u0010\r\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001a\u0010\u0018J#\u0010\u001b\u001a\u00020\u0015*\u00020\u00132\u0006\u0010\r\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001b\u0010\u0018J#\u0010\u001c\u001a\u00020\u0015*\u00020\u00132\u0006\u0010\r\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u0018J\u0013\u0010\u001f\u001a\u00020\u001e*\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010\b\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010'\u001a\u0004\b-\u0010)\"\u0004\b.\u0010+\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006/"}, d2 = {"Landroidx/compose/foundation/ScrollNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/node/SemanticsModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/foundation/ScrollState;", "state", "", "reverseScrolling", "isVertical", "<init>", "(Landroidx/compose/foundation/ScrollState;ZZ)V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "nr", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "height", "v", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I", "width", "nHg", "U", "r", "Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;", "", "FX", "(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)V", "Landroidx/compose/foundation/ScrollState;", "W5k", "()Landroidx/compose/foundation/ScrollState;", "poH", "(Landroidx/compose/foundation/ScrollState;)V", "Xw", "Z", "UR", "()Z", "ex", "(Z)V", "jB", "NC9", "W1c", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ScrollNode extends Modifier.Node implements LayoutModifierNode, SemanticsModifierNode {

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private boolean reverseScrolling;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private boolean isVertical;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private ScrollState state;

    @Override // androidx.compose.ui.node.SemanticsModifierNode
    public void FX(SemanticsPropertyReceiver semanticsPropertyReceiver) {
        SemanticsPropertiesKt.EWS(semanticsPropertyReceiver, true);
        ScrollAxisRange scrollAxisRange = new ScrollAxisRange(new Function0<Float>() { // from class: androidx.compose.foundation.ScrollNode$applySemantics$accessibilityScrollState$1
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Float invoke() {
                return Float.valueOf(this.f16269n.getState().ty());
            }
        }, new Function0<Float>() { // from class: androidx.compose.foundation.ScrollNode$applySemantics$accessibilityScrollState$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
            public final Float invoke() {
                return Float.valueOf(this.f16270n.getState().az());
            }
        }, this.reverseScrolling);
        if (this.isVertical) {
            SemanticsPropertiesKt.UhV(semanticsPropertyReceiver, scrollAxisRange);
        } else {
            SemanticsPropertiesKt.z(semanticsPropertyReceiver, scrollAxisRange);
        }
    }

    /* JADX INFO: renamed from: NC9, reason: from getter */
    public final boolean getIsVertical() {
        return this.isVertical;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int U(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        if (this.isVertical) {
            i2 = Integer.MAX_VALUE;
        }
        return intrinsicMeasurable.Nxk(i2);
    }

    /* JADX INFO: renamed from: UR, reason: from getter */
    public final boolean getReverseScrolling() {
        return this.reverseScrolling;
    }

    public final void W1c(boolean z2) {
        this.isVertical = z2;
    }

    /* JADX INFO: renamed from: W5k, reason: from getter */
    public final ScrollState getState() {
        return this.state;
    }

    public final void ex(boolean z2) {
        this.reverseScrolling = z2;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int nHg(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        if (!this.isVertical) {
            i2 = Integer.MAX_VALUE;
        }
        return intrinsicMeasurable.FX(i2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public MeasureResult nr(MeasureScope measureScope, Measurable measurable, long j2) {
        CheckScrollableContainerConstraintsKt.n(j2, this.isVertical ? Orientation.f16969n : Orientation.f16970t);
        final Placeable placeableDR0 = measurable.dR0(Constraints.nr(j2, 0, this.isVertical ? Constraints.qie(j2) : Integer.MAX_VALUE, 0, this.isVertical ? Integer.MAX_VALUE : Constraints.gh(j2), 5, null));
        int iCoerceAtMost = RangesKt.coerceAtMost(placeableDR0.getWidth(), Constraints.qie(j2));
        int iCoerceAtMost2 = RangesKt.coerceAtMost(placeableDR0.getHeight(), Constraints.gh(j2));
        final int height = placeableDR0.getHeight() - iCoerceAtMost2;
        int width = placeableDR0.getWidth() - iCoerceAtMost;
        if (!this.isVertical) {
            height = width;
        }
        this.state.ck(height);
        this.state.r(this.isVertical ? iCoerceAtMost2 : iCoerceAtMost);
        return MeasureScope.ER(measureScope, iCoerceAtMost, iCoerceAtMost2, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.ScrollNode$measure$1
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
                int iTy = this.f16272n.getState().ty();
                int i2 = height;
                if (iTy < 0) {
                    iTy = 0;
                }
                if (iTy <= i2) {
                    i2 = iTy;
                }
                int i3 = this.f16272n.getReverseScrolling() ? i2 - height : -i2;
                final int i5 = this.f16272n.getIsVertical() ? 0 : i3;
                final int i7 = this.f16272n.getIsVertical() ? i3 : 0;
                final Placeable placeable = placeableDR0;
                placementScope.te(new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.ScrollNode$measure$1.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope2) {
                        n(placementScope2);
                        return Unit.INSTANCE;
                    }

                    public final void n(Placeable.PlacementScope placementScope2) {
                        Placeable.PlacementScope.Ik(placementScope2, placeable, i5, i7, 0.0f, null, 12, null);
                    }
                });
            }
        }, 4, null);
    }

    public final void poH(ScrollState scrollState) {
        this.state = scrollState;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int r(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        if (!this.isVertical) {
            i2 = Integer.MAX_VALUE;
        }
        return intrinsicMeasurable.g(i2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int v(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        if (this.isVertical) {
            i2 = Integer.MAX_VALUE;
        }
        return intrinsicMeasurable.GR(i2);
    }

    public ScrollNode(ScrollState scrollState, boolean z2, boolean z3) {
        this.state = scrollState;
        this.reverseScrolling = z2;
        this.isVertical = z3;
    }
}
