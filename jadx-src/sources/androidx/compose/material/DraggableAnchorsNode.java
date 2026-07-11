package androidx.compose.material;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.node.LayoutModifierNode;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.math.MathKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u0003Bg\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012H\u0010\u000f\u001aD\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0004\u0012\u00028\u00000\r0\u0006\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J&\u0010\u001b\u001a\u00020\u001a*\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cR(\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"Rd\u0010\u000f\u001aD\u0012\u0013\u0012\u00110\u0007¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0013\u0012\u00110\u000b¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\f\u0012\u0016\u0012\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0004\u0012\u00028\u00000\r0\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010\u0011\u001a\u00020\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0016\u00102\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00063"}, d2 = {"Landroidx/compose/material/DraggableAnchorsNode;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "Landroidx/compose/ui/Modifier$Node;", "Landroidx/compose/ui/node/LayoutModifierNode;", "Landroidx/compose/material/AnchoredDraggableState;", "state", "Lkotlin/Function2;", "Landroidx/compose/ui/unit/IntSize;", "Lkotlin/ParameterName;", AppMeasurementSdk.ConditionalUserProperty.NAME, "size", "Landroidx/compose/ui/unit/Constraints;", "constraints", "Lkotlin/Pair;", "Landroidx/compose/material/DraggableAnchors;", "anchors", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "<init>", "(Landroidx/compose/material/AnchoredDraggableState;Lkotlin/jvm/functions/Function2;Landroidx/compose/foundation/gestures/Orientation;)V", "", "Sax", "()V", "Landroidx/compose/ui/layout/MeasureScope;", "Landroidx/compose/ui/layout/Measurable;", "measurable", "Landroidx/compose/ui/layout/MeasureResult;", "nr", "(Landroidx/compose/ui/layout/MeasureScope;Landroidx/compose/ui/layout/Measurable;J)Landroidx/compose/ui/layout/MeasureResult;", "v", "Landroidx/compose/material/AnchoredDraggableState;", "W5k", "()Landroidx/compose/material/AnchoredDraggableState;", "poH", "(Landroidx/compose/material/AnchoredDraggableState;)V", "Xw", "Lkotlin/jvm/functions/Function2;", "getAnchors", "()Lkotlin/jvm/functions/Function2;", "NC9", "(Lkotlin/jvm/functions/Function2;)V", "jB", "Landroidx/compose/foundation/gestures/Orientation;", "UR", "()Landroidx/compose/foundation/gestures/Orientation;", "ex", "(Landroidx/compose/foundation/gestures/Orientation;)V", "", "U", "Z", "didLookahead", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class DraggableAnchorsNode<T> extends Modifier.Node implements LayoutModifierNode {

    /* JADX INFO: renamed from: U, reason: collision with root package name and from kotlin metadata */
    private boolean didLookahead;

    /* JADX INFO: renamed from: Xw, reason: from kotlin metadata */
    private Function2 anchors;

    /* JADX INFO: renamed from: jB, reason: from kotlin metadata */
    private Orientation orientation;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private AnchoredDraggableState state;

    @Override // androidx.compose.ui.Modifier.Node
    public void Sax() {
        this.didLookahead = false;
    }

    public final void NC9(Function2 function2) {
        this.anchors = function2;
    }

    /* JADX INFO: renamed from: UR, reason: from getter */
    public final Orientation getOrientation() {
        return this.orientation;
    }

    /* JADX INFO: renamed from: W5k, reason: from getter */
    public final AnchoredDraggableState getState() {
        return this.state;
    }

    public final void ex(Orientation orientation) {
        this.orientation = orientation;
    }

    public final void poH(AnchoredDraggableState anchoredDraggableState) {
        this.state = anchoredDraggableState;
    }

    public DraggableAnchorsNode(AnchoredDraggableState anchoredDraggableState, Function2 function2, Orientation orientation) {
        this.state = anchoredDraggableState;
        this.anchors = function2;
        this.orientation = orientation;
    }

    @Override // androidx.compose.ui.node.LayoutModifierNode
    public MeasureResult nr(final MeasureScope measureScope, Measurable measurable, long j2) {
        boolean z2;
        final Placeable placeableDR0 = measurable.dR0(j2);
        if (!measureScope.Org() || !this.didLookahead) {
            Pair pair = (Pair) this.anchors.invoke(IntSize.rl(IntSizeKt.n(placeableDR0.getWidth(), placeableDR0.getHeight())), Constraints.n(j2));
            this.state.N((DraggableAnchors) pair.getFirst(), pair.getSecond());
        }
        if (!measureScope.Org() && !this.didLookahead) {
            z2 = false;
        } else {
            z2 = true;
        }
        this.didLookahead = z2;
        return MeasureScope.ER(measureScope, placeableDR0.getWidth(), placeableDR0.getHeight(), null, new Function1<Placeable.PlacementScope, Unit>() { // from class: androidx.compose.material.DraggableAnchorsNode$measure$1
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
                float fT = measureScope.Org() ? this.getState().HI().t(this.getState().aYN()) : this.getState().g();
                float f3 = this.getOrientation() == Orientation.f16970t ? fT : 0.0f;
                if (this.getOrientation() != Orientation.f16969n) {
                    fT = 0.0f;
                }
                Placeable.PlacementScope.xMQ(placementScope, placeableDR0, MathKt.roundToInt(f3), MathKt.roundToInt(fT), 0.0f, 4, null);
            }
        }, 4, null);
    }
}
