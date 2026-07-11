package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.modifier.ModifierLocalMap;
import androidx.compose.ui.modifier.ModifierLocalModifierNode;
import androidx.compose.ui.modifier.ModifierLocalModifierNodeKt;
import androidx.compose.ui.node.GlobalPositionAwareModifierNode;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.node.LayoutModifierNodeKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntOffsetKt;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J&\u0010\r\u001a\u00020\f*\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0013\u001a\u00020\u0011*\u00020\u000f2\u0006\u0010\t\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0016\u001a\u00020\u0011*\u00020\u000f2\u0006\u0010\t\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J#\u0010\u0017\u001a\u00020\u0011*\u00020\u000f2\u0006\u0010\t\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0014J#\u0010\u0018\u001a\u00020\u0011*\u00020\u000f2\u0006\u0010\t\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0014J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\"\u001a\u00020\u001e8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001f\u001a\u0004\b \u0010!R(\u0010*\u001a\u00020#8\u0006@\u0006X\u0086\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u00100\u001a\u00020+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00065"}, d2 = {"Landroidx/compose/foundation/layout/RecalculateWindowInsetsModifierNode;", "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/modifier/ModifierLocalModifierNode;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/ui/node/GlobalPositionAwareModifierNode;", "<init>", "()V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Landroidx/compose/ui/layout/MeasureResult;", "nr", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/IntrinsicMeasureScope;", "Landroidx/compose/ui/layout/IntrinsicMeasurable;", "", "width", "nHg", "(Landroidx/compose/ui/layout/IntrinsicMeasureScope;Landroidx/compose/ui/layout/IntrinsicMeasurable;I)I", "height", "v", "r", "U", "Landroidx/compose/ui/layout/LayoutCoordinates;", "coordinates", "", "P5", "(Landroidx/compose/ui/layout/LayoutCoordinates;)V", "Landroidx/compose/foundation/layout/ValueInsets;", "Landroidx/compose/foundation/layout/ValueInsets;", "UR", "()Landroidx/compose/foundation/layout/ValueInsets;", "insets", "Landroidx/compose/ui/unit/IntOffset;", "Xw", "J", "getOldPosition-nOcc-ac", "()J", "W5k", "(J)V", "oldPosition", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "jB", "Landroidx/compose/ui/modifier/ModifierLocalMap;", "Rl", "()Landroidx/compose/ui/modifier/ModifierLocalMap;", "providedValues", "", "lRt", "()Z", "shouldAutoInvalidate", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class RecalculateWindowInsetsModifierNode extends Modifier.Node implements ModifierLocalModifierNode, LayoutModifierNode, GlobalPositionAwareModifierNode {

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private long oldPosition;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private final ModifierLocalMap providedValues;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final ValueInsets insets;

    @Override // androidx.compose.ui.Modifier.Node
    /* JADX INFO: renamed from: lRt */
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // androidx.compose.ui.modifier.ModifierLocalModifierNode
    /* JADX INFO: renamed from: Rl, reason: from getter */
    public ModifierLocalMap getProvidedValues() {
        return this.providedValues;
    }

    /* JADX INFO: renamed from: UR, reason: from getter */
    public final ValueInsets getInsets() {
        return this.insets;
    }

    public final void W5k(long j2) {
        this.oldPosition = j2;
    }

    public RecalculateWindowInsetsModifierNode() {
        ValueInsets valueInsets = new ValueInsets(new InsetsValues(0, 0, 0, 0), "reset");
        this.insets = valueInsets;
        this.oldPosition = IntOffset.INSTANCE.rl();
        this.providedValues = ModifierLocalModifierNodeKt.rl(TuplesKt.to(WindowInsetsPaddingKt.rl(), valueInsets));
    }

    @Override // androidx.compose.ui.node.GlobalPositionAwareModifierNode
    public void P5(LayoutCoordinates coordinates) {
        long jNr = IntOffsetKt.nr(LayoutCoordinatesKt.J2(coordinates));
        boolean zMUb = IntOffset.mUb(this.oldPosition, jNr);
        this.oldPosition = jNr;
        if (!zMUb) {
            LayoutModifierNodeKt.t(this);
        }
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int U(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return intrinsicMeasurable.Nxk(i2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int nHg(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return intrinsicMeasurable.FX(i2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public MeasureResult nr(MeasureScope measureScope, final Measurable measurable, long j2) {
        if (Constraints.mUb(j2) && Constraints.xMQ(j2)) {
            final int iQie = Constraints.qie(j2);
            final int iGh = Constraints.gh(j2);
            return MeasureScope.ER(measureScope, iQie, iGh, null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.RecalculateWindowInsetsModifierNode$measure$2
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
                    Object insets;
                    LayoutCoordinates layoutCoordinatesNr = placementScope.nr();
                    if (layoutCoordinatesNr != null) {
                        this.f17770n.W5k(IntOffsetKt.nr(LayoutCoordinatesKt.J2(layoutCoordinatesNr)));
                    }
                    if (layoutCoordinatesNr == null) {
                        insets = (WindowInsets) this.f17770n.aYN(WindowInsetsPaddingKt.rl());
                    } else {
                        long jJ2 = LayoutCoordinatesKt.J2(layoutCoordinatesNr);
                        long jN = layoutCoordinatesNr.n();
                        long jXg = layoutCoordinatesNr.xg(Offset.O((((long) Float.floatToRawIntBits((int) (jN & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (jN >> 32)) << 32)));
                        long jN2 = LayoutCoordinatesKt.nr(layoutCoordinatesNr).n();
                        int iRound = Math.round(Float.intBitsToFloat((int) (jJ2 >> 32)));
                        int iRound2 = Math.round(Float.intBitsToFloat((int) (jJ2 & 4294967295L)));
                        int iRound3 = ((int) (jN2 >> 32)) - Math.round(Float.intBitsToFloat((int) (jXg >> 32)));
                        int iRound4 = ((int) (jN2 & 4294967295L)) - Math.round(Float.intBitsToFloat((int) (jXg & 4294967295L)));
                        InsetsValues insetsValuesO = this.f17770n.getInsets().O();
                        if (insetsValuesO.getLeft() != iRound || insetsValuesO.getTop() != iRound2 || insetsValuesO.getRight() != iRound3 || insetsValuesO.getBottom() != iRound4) {
                            this.f17770n.getInsets().J2(new InsetsValues(iRound, iRound2, iRound3, iRound4));
                        }
                        insets = this.f17770n.getInsets();
                    }
                    this.f17770n.Th(WindowInsetsPaddingKt.rl(), insets);
                    Placeable.PlacementScope.xMQ(placementScope, measurable.dR0(Constraints.INSTANCE.t(iQie, iGh)), 0, 0, 0.0f, 4, null);
                }
            }, 4, null);
        }
        Th(WindowInsetsPaddingKt.rl(), aYN(WindowInsetsPaddingKt.rl()));
        final Placeable placeableDR0 = measurable.dR0(j2);
        return MeasureScope.ER(measureScope, placeableDR0.getWidth(), placeableDR0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.foundation.layout.RecalculateWindowInsetsModifierNode$measure$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Placeable.PlacementScope placementScope) {
                n(placementScope);
                return Unit.INSTANCE;
            }

            public final void n(Placeable.PlacementScope placementScope) {
                Placeable.PlacementScope.xMQ(placementScope, placeableDR0, 0, 0, 0.0f, 4, null);
            }
        }, 4, null);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int r(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return intrinsicMeasurable.g(i2);
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public int v(IntrinsicMeasureScope intrinsicMeasureScope, IntrinsicMeasurable intrinsicMeasurable, int i2) {
        return intrinsicMeasurable.GR(i2);
    }
}
